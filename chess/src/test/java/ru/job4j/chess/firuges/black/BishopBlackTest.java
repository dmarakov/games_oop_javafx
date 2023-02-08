package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.*;

class BishopBlackTest {

    @Test
    public void whenGetPosition() {
        Figure bishopBlack = new BishopBlack(Cell.A1);
        Cell expected = Cell.A1;
        assertThat(bishopBlack.position()).isEqualTo(expected);
    }

    @Test
    public void whenCopyToC3() {
        Figure bishopBlack = new BishopBlack(Cell.A1);
        Cell expected = Cell.C3;
        assertThat(bishopBlack.copy(Cell.C3).position()).isEqualTo(expected);
    }

    @Test
    public void whenWayToG5() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bishopBlack.way(Cell.G5)).isEqualTo(expected);
    }
}
