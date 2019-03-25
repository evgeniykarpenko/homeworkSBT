import org.junit.*;

import static org.junit.Assert.*;

public class NewsTest {
    News news = new News(1,100,"First news","Good news");


     @Test
    public void getId() {
        assertEquals(news.getId(),1);
    }

    @Test
    public void getUserId() {
        assertEquals(news.getUserId(),100);
    }


    @Test
    public void getTitle() {
        assertEquals(news.getTitle(),"First news");
    }

    @Test
    public void getContent() {
        assertEquals(news.getContent(),"Good news");
    }
}