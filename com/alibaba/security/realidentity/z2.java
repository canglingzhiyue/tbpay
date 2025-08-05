package com.alibaba.security.realidentity;

import android.graphics.Point;
import android.graphics.SurfaceTexture;
import java.util.Map;

/* loaded from: classes3.dex */
public interface z2 {

    /* loaded from: classes3.dex */
    public interface a {
        void a(int i, String str);

        void a(byte[] bArr, int i, int i2, int i3);

        void onSuccess();
    }

    void a(SurfaceTexture surfaceTexture);

    void a(q2 q2Var, boolean z);

    void a(a aVar);

    byte[] a();

    void b();

    int c();

    boolean d();

    Point e();

    void f();

    String g();

    String h();

    Map<String, Object> i();

    boolean j();
}
