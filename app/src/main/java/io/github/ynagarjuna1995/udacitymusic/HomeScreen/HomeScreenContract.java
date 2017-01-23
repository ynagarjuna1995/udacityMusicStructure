package io.github.ynagarjuna1995.udacitymusic.HomeScreen;

import io.github.ynagarjuna1995.udacitymusic.base.BasePresenter;
import io.github.ynagarjuna1995.udacitymusic.base.BaseView;

/**
 * Created by Nagarjuna on 23-01-2017.
 */

public interface HomeScreenContract {
    interface IHomeScreenPresenter extends BasePresenter{

    }
    interface IHomeScreenView extends BaseView<HomeScreenPresenter>{
        void setPresenter(HomeScreenPresenter Presenter);
    }
}
