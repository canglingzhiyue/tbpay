package com.alibaba.triver.triver_weex;

import android.content.Intent;

/* loaded from: classes3.dex */
public interface c {
    void destroyApp();

    void init();

    void onActivityResult(int i, int i2, Intent intent);

    boolean onBackPressed();

    void onDestroy();

    void onHidden();

    void onPause();

    void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    void onResume();

    void onStop();

    void onVisible();

    void startApp(String str);
}
