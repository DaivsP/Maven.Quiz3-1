package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private final String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
        this(new String[3][3]);
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String firstElement = board[0][value];
        String secondElement = board[1][value];
        String thirdElement = board[2][value];
        String[] column = {firstElement, secondElement, thirdElement};
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return isHomogenous(getRow(rowIndex));
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return isHomogenous(getColumn(columnIndex));
    }

    private boolean isHomogenous(String[] array) {
        List<String> columnAsList = Arrays.asList(array);
        Set<String> columnAsSet = new HashSet<>(columnAsList);
        return columnAsSet.size() == 1;
    }

    public String getWinner() {

        String topLeft = board[0][0];
        String middle = board[1][1];
        String bottomRight = board[2][2];
        String[] backSlashDiagonal = {topLeft, middle, bottomRight};

        String topRight = board[0][2];
        String bottomLeft = board[2][0];
        String[] forwardSlashDiagonal = {topRight, middle, bottomLeft};

        for (int i = 0; i < 2; i++) {
            if (isColumnHomogeneous(i)) {
                return getColumn(i)[0];
            }
            if (isRowHomogenous(i)) {
                return getRow(i)[0];
            }

            if (isHomogenous(backSlashDiagonal)) {
                return backSlashDiagonal[0];
            }

            if (isHomogenous(forwardSlashDiagonal)) {
                return forwardSlashDiagonal[0];
            }
        }
        return null;
    }

    public String[][] getBoard() {
        return board;
    }
}
