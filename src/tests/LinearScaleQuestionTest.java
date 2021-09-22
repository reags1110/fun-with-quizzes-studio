package tests;

import main.LinearScaleQuestion;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class LinearScaleQuestionTest {
    LinearScaleQuestion myLinearScaleQuestion;


    @Before
    public void setUpTests() {
        this.myLinearScaleQuestion = new LinearScaleQuestion("A test question", 5, 1, 10);
    }

    @Test
    public void constructorSetProperties() {
        assertEquals("A test question", this.myLinearScaleQuestion.getTheQuestion());
        assertEquals(1, this.myLinearScaleQuestion.getLowValue());
        assertEquals(10, this.myLinearScaleQuestion.getHighValue());
    }

    @Test
    public void checksLinearAnswerAndReturnsTrue() {
        boolean actualAnswer = this.myLinearScaleQuestion.checkAnswer("5");
        assertTrue(actualAnswer);

    }

}
