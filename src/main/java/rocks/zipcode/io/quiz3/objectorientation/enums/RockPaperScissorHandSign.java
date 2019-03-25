package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    PAPER,
    SCISSOR;

    public RockPaperScissorHandSign getWinner() {
        if (this.equals(ROCK)) return PAPER;
        if (this.equals(PAPER)) return SCISSOR;
        if (this.equals(SCISSOR)) return ROCK;
        return null;
    }

    public RockPaperScissorHandSign getLoser() {
        if (this.equals(ROCK)) return SCISSOR;
        if (this.equals(PAPER)) return ROCK;
        if (this.equals(SCISSOR)) return PAPER;
        return null;
    }
}