package ro.uvt.info.splabotimanrafael2026.observer;

import ro.uvt.info.splabotimanrafael2026.Book;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(Book book);
}