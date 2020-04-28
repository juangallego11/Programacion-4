/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trikidos;

import javax.swing.JOptionPane;



public class Traki {

    String[] game = {"n", "n", "n", "n", "n", "n", "n", "n", "n"};
    Boolean endGame = false;
    Boolean p1 = false, p2 = false;

    Traki() {
    }

    /**
     * Getter method game
     */
    public String[] getGame() {
        return this.game;
    }//end method getGame

    /**
     * Setter method game
     */
    public void setGame(String[] game) {
        this.game = game;
    }//end method setGame

    /**
     * Getter method endGame
     */
    public Boolean getEndGame() {
        return this.endGame;
    }//end method getEndGame

    /**
     * Setter method endGame
     */
    public void setEndGame(Boolean endGame) {
        this.endGame = endGame;
    }//end method setEndGame

    /**
     * Getter method p1
     */
    public Boolean getP1() {
        return this.p1;
    }//end method getP1

    /**
     * Setter method p1
     */
    public void setP1(Boolean p1) {
        this.p1 = p1;
    }//end method setP1

    /**
     * Getter method p2
     */
    public Boolean getP2() {
        return this.p2;
    }//end method getP2

    /**
     * Setter method p2
     */
    public void setP2(Boolean p2) {
        this.p2 = p2;
    }//end method setP2

    public void verificarJuego() {
        if (game[0] != "n" && game[0].equals(game[1]) && game[1].equals(game[2])) {
            JOptionPane.showMessageDialog(null, "Ganador: " + game[0]);
            if (game[0] == "X") {
                p1 = true;
            } else if (game[0] == "O") {
                p2 = true;
            }
            endGame = true;
        } else if (game[3] != "n" && game[3].equals(game[4]) && game[4].equals(game[5])) {
            JOptionPane.showMessageDialog(null, "Ganador: " + game[3]);
            if (game[3] == "X") {
                p1 = true;
            } else if (game[3] == "O") {
                p2 = true;
            }
            endGame = true;
        } else if (game[6] != "n" && game[6].equals(game[7]) && game[7].equals(game[8])) {
            JOptionPane.showMessageDialog(null, "Ganador: " + game[6]);
            if (game[6] == "X") {
                p1 = true;
            } else if (game[6] == "O") {
                p2 = true;
            }
            endGame = true;
        } else if (game[0] != "n" && game[0].equals(game[3]) && game[3].equals(game[6])) {
            JOptionPane.showMessageDialog(null, "Ganador: " + game[0]);
            if (game[0] == "X") {
                p1 = true;
            } else if (game[0] == "O") {
                p2 = true;
            }
            endGame = true;
        } else if (game[1] != "n" && game[1].equals(game[4]) && game[4].equals(game[7])) {
            JOptionPane.showMessageDialog(null, "Ganador: " + game[1]);
            if (game[1] == "X") {
                p1 = true;
            } else if (game[1] == "O") {
                p2 = true;
            }
            endGame = true;
        } else if (game[2] != "n" && game[2].equals(game[5]) && game[5].equals(game[8])) {
            JOptionPane.showMessageDialog(null, "Ganador: " + game[2]);
            if (game[2] == "X") {
                p1 = true;
            } else if (game[2] == "O") {
                p2 = true;
            }
            endGame = true;
        } else if (game[0] != "n" && game[0].equals(game[4]) && game[4].equals(game[8])) {
            JOptionPane.showMessageDialog(null, "Ganador: " + game[0]);
            if (game[0] == "X") {
                p1 = true;
            } else if (game[0] == "O") {
                p2 = true;
            }
            endGame = true;
        } else if (game[2] != "n" && game[2].equals(game[4]) && game[4].equals(game[6])) {
            JOptionPane.showMessageDialog(null, "Ganador: " + game[2]);
            if (game[2] == "X") {
                p1 = true;
            } else if (game[2] == "O") {
                p2 = true;
            }
            endGame = true;
        }
    }

}
