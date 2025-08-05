package com.taobao.android.weex;

import java.io.Serializable;

/* loaded from: classes6.dex */
public interface WeexModule extends Serializable {
    void onInit(String str, i iVar);

    void onJSThreadDestroy();

    void onMainThreadDestroy();
}
