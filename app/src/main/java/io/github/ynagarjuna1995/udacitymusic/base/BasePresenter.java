package io.github.ynagarjuna1995.udacitymusic.base;

public interface BasePresenter {
    /*1.Avodiing lifecycle callbacks since this app deos not require a complex implementation
    * 2. And Sinc ethe presenter is interating with activity or fragements life cycle depends on those 2 things*/
    void start();
}
