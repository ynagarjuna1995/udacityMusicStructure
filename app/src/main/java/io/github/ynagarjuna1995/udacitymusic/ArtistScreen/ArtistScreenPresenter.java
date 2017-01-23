package io.github.ynagarjuna1995.udacitymusic.ArtistScreen;

/**
 * Created by Nagarjuna on 23-01-2017.
 */

public class ArtistScreenPresenter implements ArtistScreenContract.IArtistScreenPresenter {
    public ArtistScreenPresenter(ArtistScreenContract.IArtistScreenView artistScreenView){
        artistScreenView.setPresenter(this);
    }
    @Override
    public void start() {

    }
}
