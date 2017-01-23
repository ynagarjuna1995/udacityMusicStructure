package io.github.ynagarjuna1995.udacitymusic.HomeScreen;


public class HomeScreenPresenter implements HomeScreenContract.IHomeScreenPresenter{

    public HomeScreenPresenter(HomeScreenContract.IHomeScreenView homeScreenView){
        homeScreenView.setPresenter(this);
    }

    @Override
    public void start() {

    }

}
