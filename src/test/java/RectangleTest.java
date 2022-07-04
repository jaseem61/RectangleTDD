import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

public class RectangleTest{

    @Test
    void shouldReturnArea12WhenLengthIs3AndBreadthIs4()
    {
        Rectangle rectangle= new Rectangle(3.1,4.2);

        double actualArea = rectangle.area();

        assertThat(actualArea, is(closeTo(13.02, 0.001)));
    }

    @Test
    void shouldReturnPerimeterWhenLengthAndBreadthIsGiven()
    {
        Rectangle rectangle= new Rectangle(3.1,4.2);

        double actualPerimeter = rectangle.perimeter();

        assertThat(actualPerimeter, is(closeTo(14.6,0.01)));

    }

}
