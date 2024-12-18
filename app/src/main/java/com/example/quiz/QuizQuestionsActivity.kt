package com.example.quiz

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz_questions)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val tv_option_one = findViewById<TextView>(R.id.tv_option_one)
        val tv_option_two = findViewById<TextView>(R.id.tv_option_two)
        val tv_option_three = findViewById<TextView>(R.id.tv_option_three)
        val tv_option_four = findViewById<TextView>(R.id.tv_option_four)
        val btn_submit = findViewById<Button>(R.id.btn_submit)

        mUserName = intent.getStringExtra(Constants.USER_NAME)

        mQuestionsList = Constants.getQuestions()

        setQuestion()

        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)


    }

    private fun setQuestion() {
        val btn_submit = findViewById<Button>(R.id.btn_submit)
        val tv_option_one = findViewById<TextView>(R.id.tv_option_one)
        val tv_option_two = findViewById<TextView>(R.id.tv_option_two)
        val tv_option_three = findViewById<TextView>(R.id.tv_option_three)
        val tv_option_four = findViewById<TextView>(R.id.tv_option_four)
        val iv_image = findViewById<ImageView>(R.id.iv_image)
        val tv_question = findViewById<TextView>(R.id.tv_question)
        val tv_progress = findViewById<TextView>(R.id.tv_progress)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)

        val question = mQuestionsList!![mCurrentPosition - 1]

        defaultOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size) {
            btn_submit.text = "Завершить"
        } else {
            btn_submit.text = "Подтвердить"
        }

        progressBar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition" + "/" + progressBar.max

        tv_question.text = question!!.question
        iv_image.setImageResource(question.image)
        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour
    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        val tv_option_one = findViewById<TextView>(R.id.tv_option_one)
        val tv_option_two = findViewById<TextView>(R.id.tv_option_two)
        val tv_option_three = findViewById<TextView>(R.id.tv_option_three)
        val tv_option_four = findViewById<TextView>(R.id.tv_option_four)
        options.add(0, tv_option_one)
        options.add(1, tv_option_two)
        options.add(2, tv_option_three)
        options.add(3, tv_option_four)
        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        }
    }

    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    private var mUserName: String? = null
    private var isAnswerConfirmed = false
    private var errorCount = 0
    private val maxErrors = 3


    override fun onClick(v: View?) {
        val btn_submit = findViewById<Button>(R.id.btn_submit)
        val tv_option_one = findViewById<TextView>(R.id.tv_option_one)
        val tv_option_two = findViewById<TextView>(R.id.tv_option_two)
        val tv_option_three = findViewById<TextView>(R.id.tv_option_three)
        val tv_option_four = findViewById<TextView>(R.id.tv_option_four)
        val heart1 = findViewById<ImageView>(R.id.heart1)
        val heart2 = findViewById<ImageView>(R.id.heart2)
        val heart3 = findViewById<ImageView>(R.id.heart3)
        when (v?.id) {
            R.id.tv_option_one -> {
                if (!isAnswerConfirmed) {
                    selectedOptionView(tv_option_one, 1)

                }
            }

            R.id.tv_option_two -> {
                if (!isAnswerConfirmed) {
                    selectedOptionView(tv_option_two, 2)

                }
            }

            R.id.tv_option_three -> {
                if (!isAnswerConfirmed) {
                    selectedOptionView(tv_option_three, 3)

                }
            }

            R.id.tv_option_four -> {
                if (!isAnswerConfirmed) {
                    selectedOptionView(tv_option_four, 4)

                }
            }

            R.id.btn_submit -> {
                if (mSelectedOptionPosition == 0) {

                    return
                }

                if (!isAnswerConfirmed) {
                    val question = mQuestionsList?.get(mCurrentPosition - 1)

                    if (question!!.correctAnswer != mSelectedOptionPosition) {
                        errorCount++
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)


                        when (errorCount) {
                            1 -> heart3.visibility = View.INVISIBLE
                            2 -> heart2.visibility = View.INVISIBLE
                            3 -> heart1.visibility = View.INVISIBLE
                        }


                        if (errorCount >= maxErrors) {
                            val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra(Constants.USER_NAME, mUserName)
                            intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                            intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionsList!!.size)
                            startActivity(intent)
                            finish()
                            return
                        }


                    } else {
                        mCorrectAnswers++
                    }

                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    isAnswerConfirmed = true

                    if (mCurrentPosition == mQuestionsList!!.size) {
                        btn_submit.text = "Завершить"
                    } else {
                        btn_submit.text = "Следующий вопрос"
                    }
                } else {
                    mCurrentPosition++

                    if (mCurrentPosition <= mQuestionsList!!.size) {
                        setQuestion()

                        isAnswerConfirmed = false
                        mSelectedOptionPosition = 0
                    } else {
                        val intent = Intent(this, ResultActivity::class.java)
                        intent.putExtra(Constants.USER_NAME, mUserName)
                        intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                        intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionsList!!.size)
                        startActivity(intent)
                        finish()
                    }
                }
            }
        }
    }
    private fun answerView(answer:Int, drawableView: Int) {
        val tv_option_one = findViewById<TextView>(R.id.tv_option_one)
        val tv_option_two = findViewById<TextView>(R.id.tv_option_two)
        val tv_option_three = findViewById<TextView>(R.id.tv_option_three)
        val tv_option_four = findViewById<TextView>(R.id.tv_option_four)
        when(answer){

            1->{
                tv_option_one.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            2->{
                tv_option_two.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            3->{
                tv_option_three.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            4->{
                tv_option_four.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }

        }
    }
    private fun selectedOptionView(textView: TextView, selectedOptionNum: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum
        textView.setTextColor(Color.parseColor("#363A43"))
        textView.setTypeface(textView.typeface, Typeface.BOLD)
        textView.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)

    }

    fun btn_back(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

}

