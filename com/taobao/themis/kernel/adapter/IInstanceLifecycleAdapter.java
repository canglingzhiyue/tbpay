package com.taobao.themis.kernel.adapter;

import com.taobao.themis.kernel.f;

/* loaded from: classes9.dex */
public interface IInstanceLifecycleAdapter extends com.taobao.themis.kernel.basic.a {
    void onCreate(f fVar);

    void onDestroy(f fVar);

    void onPause(f fVar);

    void onResume(f fVar);

    void onStart(f fVar);

    void onStop(f fVar);
}
