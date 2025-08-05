package com.taobao.tao.tbmaincontroller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.widget.TabHost;
import com.taobao.tao.h;
import com.taobao.tao.k;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.uikit.immersive.ITBImmersive;

/* loaded from: classes.dex */
public interface TBMainController extends TabHost.OnTabChangeListener, k, ITBImmersive {
    Fragment getCurrentFragment();

    TBFragmentTabHost getFragmentTabHost();

    void onActivityResult(int i, int i2, Intent intent);

    void onCreate(Bundle bundle);

    void onDestroy();

    boolean onKeyDown(int i, KeyEvent keyEvent);

    void onNewIntent(Intent intent);

    void onPause();

    void onResume();

    void registerOnKeyDownListener(h hVar);
}
