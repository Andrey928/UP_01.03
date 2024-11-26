package com.example.quiz

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        //1
        val que1 = Question(
            1, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_argentina,
            "Аргентина", "Австралия",
            "Армения", "Австрия", 1
        )
        questionsList.add(que1)

        //2
        val que2 = Question(
            2, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_australia,
            "Ангола", "Австрия",
            "Австралия", "Азербайджан", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_brazil,
            "Беларусь", "Белиз",
            "Бруней", "Бразилия", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_belgium,
            "Багамы", "Бельгия",
            "Барбадос", "Германия", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_fiji,
            "Габон", "Франция",
            "Фиджи", "Финлядия", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_germany,
            "Германия", "Австрия",
            "Эстония", "Ни один из них", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_denmark,
            "Исландия", "Норвегия",
            "Дания", "Швеция", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_india,
            "Иран", "Италия",
            "Мексика", "Индия", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_new_zealand,
            "Самоа", "Новая Зеландия",
            "Тувалу", "Ни один из них", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_kuwait,
            "Кувейт", "Иордания",
            "Судан", "Палестина", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}