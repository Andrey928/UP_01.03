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

        val que16 = Question(
            16, "Какой стране принадлежит этот флаг?",
            R.drawable.flag_of_burkina_faso,
            "Сальвадор", "Саудовская Аравия",
            "Лихтенштейн", "Буркина-Фасо", 4
        )

        questionsList.add(que16)

        val que17 = Question(
            17, "Какой стране принадлежит этот флаг?",
            R.drawable.flag_of_burundi,
            "Науру", "Сингапур",
            "Бурунди", "Мадагаскар", 3
        )

        questionsList.add(que17)

        val que18 = Question(
            18, "Какой стране принадлежит этот флаг?",
            R.drawable.flag_of_south_korea,
            "Республика Корея", "КНДР",
            "Чехия", "Канада", 1
        )
        questionsList.add(que18)

        val que19 = Question(
            19, "Какой стране принадлежит этот флаг?",
            R.drawable.flag_of_the_british_virgin_islands,
            "Восточный Тимор", "Босния и Герцеговина",
            "Фарерские острова", "Британские Виргинские о-ва", 4
        )
        questionsList.add(que19)

        val que20 = Question(
            20, "Какой стране принадлежит этот флаг?",
            R.drawable.flag_of_tunisia,
            "Алжир", "Норвегия",
            "Египет", "Тунис", 4
        )
        questionsList.add(que20)

        val que21 = Question(
            21, "Какой стране принадлежит этот флаг?",
            R.drawable.flag_of_costa_rica,
            "Финляндия", "Коста-Рика",
            "Бангладеш", "Замбия", 2
        )
        questionsList.add(que21)

        val que22 = Question(
            22, "Какой стране принадлежит этот флаг?",
            R.drawable.flag_of_ruanda,
            "Испания", "Шотландия",
            "Руанда", "Нидерланды", 3
        )
        questionsList.add(que22)

        val que23 = Question(
            23, "Какой стране принадлежит этот флаг?",
            R.drawable.flag_of_tanzania,
            "Танзания", "Черногория",
            "Барбадос", "Япония", 1
        )
        questionsList.add(que23)

        val que24 = Question(
            24, "Какой стране принадлежит этот флаг?",
            R.drawable.flag_of_bolivia,
            "Либерия", "Хорватия",
            "Боливия", "Пакистан", 3
        )
        questionsList.add(que24)

        val que25 = Question(
            25, "Какой стране принадлежит этот флаг?",
            R.drawable.flag_of_scotland,
            "Франция", "Австрия",
            "Швеция", "Шотландия", 4
        )
        questionsList.add(que25)

        val que26 = Question(
            26, "Какой стране принадлежит этот флаг?",
            R.drawable.flag_of_haiti,
            "Сьерра-Леоне", "Гаити",
            "Бангладеш", "Ни один из них", 2
        )
        questionsList.add(que26)

        val que27 = Question(
            27, "Какой стране принадлежит этот флаг?",
            R.drawable.flag_of_latvia,
            "Латвия", "Албания",
            "Андорра", "Ватикан", 1
        )
        questionsList.add(que27)

        val que28 = Question(
            28, "Какой стране принадлежит этот флаг?",
            R.drawable.flag_of_monaco,
            "Польша", "Монако",
            "ОАЭ", "Азербайджан", 2
        )
        questionsList.add(que28)

        val que29 = Question(
            29, "Какой стране принадлежит этот флаг?",
            R.drawable.flag_of_switzerland,
            "Малайзия", "Швеция",
            "Боливия", "Швейцария", 4
        )
        questionsList.add(que29)

        val que30 = Question(
            30, "Какой стране принадлежит этот флаг?",
            R.drawable.gabon,
            "Ямайка", "ЮАР",
            "Уругвай", "Ни один из них", 4
        )
        questionsList.add(que30)

        return questionsList.shuffled() as ArrayList<Question>
    }
}