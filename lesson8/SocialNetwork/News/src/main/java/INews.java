import java.util.List;

public interface INews {
    List<News> readNews(int userId);
    void writeNews(News news);
}
