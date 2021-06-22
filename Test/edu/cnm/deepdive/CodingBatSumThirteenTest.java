package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatSumThirteenTest {

  private int[][] thirteenParams = {
      {1, 2, 2, 1},
      {1, 1},
      {1, 2, 2, 1, 13},
      {1, 2, 13, 2, 1, 13},
      {13, 1, 2, 13, 2, 1, 13},
      {},
      {13},
      {13, 13},
      {13, 0, 13},
      {13, 1, 13},
      {5, 7, 2},
      {5, 13, 2},
      {0},
      {13, 0}
  };


  private int[] thirteenExpected = {6, 2, 6, 4, 3, 0, 0, 0, 0, 0, 14, 5, 0, 0};


  @Test
  void thirteenTest() {
    for (int i = 0; i < thirteenExpected.length; i++) {
      int actual = CodingBatSumThirteen.sum13(thirteenParams[i]);
      Assertions.assertEquals(actual, thirteenExpected[i]);
    }
  }

}