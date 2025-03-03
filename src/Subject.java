public interface Subject {
        void registerObserver(Observer o);
        void removeObserver(Observer o);
        void notifyObservers();
        Object getState();
        void setState(Object state);
    }


