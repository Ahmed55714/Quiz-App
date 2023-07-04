package com.example.quizappandroid

object Constants {

    const val User_NAME : String ="user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions() : ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
        1, "what country does this flag belong to ?",
        R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia", "Armenia", "Austria",
            1
        )
        questionsList.add(que1)


        val que2 = Question(
            2, "what country does this flag belong to ?",
            R.drawable.ic_flag_of_brazil,
            "Egypt", "Australia", "Barazil", "Austria",
            3
        )
        questionsList.add(que2)


        val que3 = Question(
            3, "what country does this flag belong to ?",
            R.drawable.ic_flag_of_new_zealand,
            "Germany", "New Zeland", "India", "Austria",
            2
        )
        questionsList.add(que3)


        val que4 = Question(
            4, "what country does this flag belong to ?",
            R.drawable.ic_flag_of_kuwait,
            "Argentina", "Australia", "Armenia", "Kuwait",
            4
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "what country does this flag belong to ?",
            R.drawable.ic_flag_of_germany,
            "Argentina", "Germany", "Armenia", "Kuwait",
            2
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "what is your favorite Developer?",
            R.drawable.badawy,
            "Badawy", "Badawy", "Badawy", "Badawy",
            1
        )
        questionsList.add(que6)


//        val que6 = Question(
//            6, "what country does this flag belong to ?",
//            R.drawable.ic_flag_of_argentina,
//            "Argentina", "Australia", "Armenia", "Austria",
//            1
//        )
//        questionsList.add(que6)


//        val que1 = Question(
//            1, "what country does this flag belong to ?",
//            R.drawable.ic_flag_of_argentina,
//            "Argentina", "Australia", "Armenia", "Austria",
//            1
//        )

        return  questionsList
    }
}