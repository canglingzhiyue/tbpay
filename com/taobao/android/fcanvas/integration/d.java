package com.taobao.android.fcanvas.integration;

import android.view.View;

/* loaded from: classes5.dex */
public interface d {

    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void b();
    }

    void attachToRenderer(c cVar);

    void detachFromRenderer();

    View getCanvasView();

    void setLifecycleListener(a aVar);
}
