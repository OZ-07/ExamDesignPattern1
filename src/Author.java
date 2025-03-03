public class Author {
    class Author /*implements Subject*/ {
        private List<Observer> observers = new ArrayList<>();
        private String latestPost;

        @Override
        public void registerObserver(Observer o) {
            observers.add(o);
        }

        @Override
        public void removeObserver(Observer o) {
            observers.remove(o);
        }

        @Override
        public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update(latestPost);
            }
        }

        @Override
        public Object getState() {
            return latestPost;
        }

        @Override
        public void setState(Object state) {
            if (state instanceof String) {
                this.latestPost = (String) state;
            }
        }

        public void publish(String post) {
            System.out.println("Author published: " + post);
            this.latestPost = post;
            notifyObservers();
        }
}
