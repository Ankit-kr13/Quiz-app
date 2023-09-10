package com.example.quizapp

object Constants {
    const val USER_NAME : String="user_name"
    const val TOTAL_QUESTIONS : String="total_questions"
    const val CORRECT_ANSWERS : String="correct_answers "





    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,"Which Country Does This Flag Belong To ?",
            R.drawable.argentina,
            "Argentina","Australia","Austria","Armenia",
            1

        )
        questionList.add(que1)

        val que2 = Question(
            2,"Which Country Does This Flag Belong To ?",
            R.drawable.australia,
            "Armenia","Argentina","Austria","Australia",
            4

        )
        questionList.add(que2)

        val que3 = Question(
            3,"Which Country Does This Flag Belong To ?",
            R.drawable.belgium,
            "New-Zealand","Germany","Belgium","None Of These",
            3

        )
        questionList.add(que3)

        val que4 = Question(
            4,"Which Country Does This Flag Belong To ?",
            R.drawable.denmark,
            "Australia","Denmark","India","Germany",
            2

        )
        questionList.add(que4)

        val que5 = Question(
            5,"Which Country Does This Flag Belong To ?",
            R.drawable.fiji,
            "Fiji","France","Denmark","Armenia",
            1

        )
        questionList.add(que5)

        val que6 = Question(
            6,"Which Country Does This Flag Belong To ?",
            R.drawable.germany,
            "Fiji","Belgium","Germany","None Of These",
            1

        )
        questionList.add(que6)

        val que7 = Question(
            7,"Which Country Does This Flag Belong To ?",
            R.drawable.india,
            "Denmark","Niger","Ireland","India",
            4

        )
        questionList.add(que7)

        val que8 = Question(
            8,"Which Country Does This Flag Belong To ?",
            R.drawable.kuwait,
            "Kuwait","Australia","Austria","Armenia",
            1

        )
        questionList.add(que8)

        val que9 = Question(
            9,"Which Country Does This Flag Belong To ?",
            R.drawable.newzealand,
            "New-Zealand","Australia","Germany","None Of These",
            1

        )
        questionList.add(que9)

        return questionList
    }
}