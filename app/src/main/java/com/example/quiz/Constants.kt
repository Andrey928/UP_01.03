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
            R.drawable.ic_flag_of_armenia,
            "Эстония", "Колумбия",
            "Армения", "Люксмембург", 3
        )
        questionsList.add(que1)

        //2
        val que2 = Question(
            2, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_australia,
            "Ангола", "Австрия",
            "Австралия", "Англия", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Какой стране принадлежит этот флаг?",
            R.drawable.flag_of_canada,
            "Словения", "Белиз",
            "Монако", "Канада", 4
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
            R.drawable.flag_of_uzbekistan,
            "Алжир", "Турция",
            "Узбекистан", "Казахстан", 3
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
            R.drawable.flag_of_the_of_china,
            "Тайвань", "Вьетнам",
            "Кыргызстан", "Китай", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Какой стране принадлежит этот флаг?",
            R.drawable.flag_of_syria,
            "Ирак", "Сирия",
            "ОАЭ", "Йемен", 2
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
        //11
        val que11 = Question(
            11, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_fiji,
            "Самоа", "Тувалу",
            "Фиджи", "Вануату", 3
        )

        questionsList.add(que11)

        val que12 = Question(
            12, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_argentina,
            "Аргентина", "Парагвай",
            "Уругвай", "Перу", 1
        )

        questionsList.add(que12)

        val que13 = Question(
            13, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_brazil,
            "Венесуэла", "Бразилия",
            "Италия", "Эфиопия", 2
        )

        questionsList.add(que13)


        val que14 = Question(
            14, "Какой стране принадлежит этот флаг?",
            R.drawable.ic_flag_of_new_zealand,
            "Великобритания", "Австралия",
            "Тонга", "Новая Зеландия", 4
        )

        questionsList.add(que14)

        val que15 = Question(
            15, "Какой стране принадлежит этот флаг?",
            R.drawable.flag_of_iraq,
            "Чехия", "Ирак",
            "Судан", "Египет", 2
        )

        questionsList.add(que15)

        return questionsList.shuffled() as ArrayList<Question>
    }
}