package com.taobao.alilive.aliliveframework.frame;

import android.view.View;
import com.taobao.taolive.sdk.controller.IRecyclerModel;
import java.io.Serializable;
import tb.deh;

/* loaded from: classes4.dex */
public interface IComponentLifeCycle extends Serializable, deh {
    void onCreate();

    void onDestroy();

    void onDidAppear();

    void onDidDisappear();

    void onPause();

    void onPreloadView(IRecyclerModel iRecyclerModel);

    void onResume();

    void onStatusChange(int i, Object obj);

    void onStop();

    void onUnloadView();

    void onViewCreated(View view);

    void onWillAppear();

    void onWillDisappear();
}
