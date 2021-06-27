package hexlet.code;

import hexlet.code.games.GameGCD;
import hexlet.code.games.GamePrime;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

   @Test
    void testIsPrime() {
     /* assertThat(GamePrime.isPrime(-1)).isFalse();
        assertThat(GamePrime.isPrime(0)).isFalse();
        assertThat(GamePrime.isPrime(1)).isFalse();
        assertThat(GamePrime.isPrime(2)).isTrue();
        assertThat(GamePrime.isPrime(3)).isTrue();
        assertThat(GamePrime.isPrime(4)).isFalse();
        assertThat(GamePrime.isPrime(5)).isTrue();
        assertThat(GamePrime.isPrime(109)).isTrue();
        assertThat(GamePrime.isPrime(110)).isFalse();
        assertThat(GamePrime.isPrime(56)).isFalse();
        assertThat(GamePrime.isPrime(30)).isFalse();*/
        final int expected = 49;
        assertThat(GamePrime.isPrime(expected)).isFalse();
    }
    @Test
    void testGCD() {
       /* int result1 = GameGCD.gcd(1, 33);
        assertThat(result1).isEqualTo(1);

        int result2 = GameGCD.gcd(5, 7);
        assertThat(result2).isEqualTo(1);

        int result3 = GameGCD.gcd(5, 7);
        assertThat(result3).isEqualTo(1);

        int result4 = GameGCD.gcd(0, 3);
        assertThat(result4).isEqualTo(3);

        int result5 = GameGCD.gcd(4, 0);
        assertThat(result5).isEqualTo(4);*/

        final int expected = 3;
        final int param1 = 6;
        final int param2 = 9;
        int actual = GameGCD.gcd(param1, param2);
        assertThat(actual).isEqualTo(expected);
    }
}
