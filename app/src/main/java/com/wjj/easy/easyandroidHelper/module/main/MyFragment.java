package com.wjj.easy.easyandroidHelper.module.main;

import android.net.Uri;

import com.facebook.drawee.view.SimpleDraweeView;
import com.wjj.easy.easyandroidHelper.R;
import com.wjj.easy.easyandroidHelper.common.base.BaseFragment;

import butterknife.BindView;

/**
 * 我的
 * Created by wujiajun on 17/4/12.
 */

public class MyFragment extends BaseFragment implements MyContract.View {

    @BindView(R.id.my_image_view)
    SimpleDraweeView myImageView;

    MyContract.Presenter presenter;

    @Override
    protected void init() {
        Uri uri = Uri.parse("https://raw.githubusercontent.com/facebook/fresco/gh-pages/static/logo.png");
        myImageView.setImageURI(uri);
    }

    @Override
    protected int getContentView() {
        return R.layout.fragment_my;
    }

    @Override
    public void setPresenter(MyContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onStart() {
        super.onStart();
        presenter.start();
    }
}