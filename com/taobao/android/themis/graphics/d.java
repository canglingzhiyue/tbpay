package com.taobao.android.themis.graphics;

import android.graphics.Bitmap;
import android.view.View;
import com.taobao.android.fcanvas.integration.FCanvasInstance;

/* loaded from: classes6.dex */
public interface d {

    /* loaded from: classes6.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f15557a;
        public int b;
        public float c;
        public FCanvasInstance.RenderMode d;
        public a e;
        public String f;
        public boolean g = false;
    }

    View a();

    void a(int i, int i2, float f, FCanvasInstance.RenderMode renderMode, a aVar);

    void a(int i, int i2, int i3, int i4);

    void a(b bVar);

    void a(boolean z);

    Bitmap b();

    void c();

    void d();

    void e();
}
