package TennisGame;

public class TenisGame {

    public static String getScore(String playerName1, String playerName2, int scorePlayGame1, int scorePlayGame2) {
        String score = "";
        int luotDanh =4;
        int tempScore = 0;
        if (scorePlayGame1 == scorePlayGame2) {
            switch (scorePlayGame1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (scorePlayGame1 >= luotDanh || scorePlayGame2 >= luotDanh) {
            int minusResult = scorePlayGame1 - scorePlayGame2;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scorePlayGame1;
                else {
                    score += "-";
                    tempScore = scorePlayGame2;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}

