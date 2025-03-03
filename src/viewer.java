public class Viewer /*implements Observer*/ {
    private String name;

    public Viewer(String name) {
        this.name = name;
    }

    @Override
    public void update(String post) {
        System.out.println(name + " received a new post: " + post);
    }

    public void subscribe(Author author) {
        author.registerObserver(this);
    }

    public void unsubscribe(Author author) {
        author.removeObserver(this);
    }
}
