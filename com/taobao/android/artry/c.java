package com.taobao.android.artry;

import android.app.Activity;
import com.taobao.android.xrappos.scene.Scene;
import com.taobao.android.xrappos.v2.view.XRAppOSView;

/* loaded from: classes4.dex */
public interface c {
    void destroy();

    Scene getScene();

    XRAppOSView getXRAppOSView();

    void init(Activity activity);

    void loadModel(String str, String str2);
}
