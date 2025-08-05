package com.taobao.android.address.map;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import tb.mto;

/* loaded from: classes4.dex */
public interface IAddressMap {
    public static final String MAP_TYPE_AMAP = "amap";
    public static final String MAP_TYPE_GOOGLE_MAP = "google_map";

    /* loaded from: classes4.dex */
    public @interface MapType {
    }

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f8977a;
        public double b = mto.a.GEO_NOT_SUPPORT;
        public double c = mto.a.GEO_NOT_SUPPORT;
        public double d = 17.0d;
        public double e = mto.a.GEO_NOT_SUPPORT;
        public double f = mto.a.GEO_NOT_SUPPORT;
        public int g = 1000;

        public a(String str) {
            this.f8977a = IAddressMap.MAP_TYPE_AMAP;
            this.f8977a = str;
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a();

        void b();

        void c();
    }

    /* loaded from: classes4.dex */
    public interface c {
        void a();

        void c();
    }

    /* loaded from: classes4.dex */
    public interface d {
        void a();
    }

    /* loaded from: classes4.dex */
    public interface e {
        void a();
    }

    /* loaded from: classes4.dex */
    public interface f {
        void a(MotionEvent motionEvent);
    }

    View a(Context context);

    View a(Context context, a aVar, e eVar);

    void a(a aVar, b bVar);

    void a(c cVar);

    void a(d dVar);

    void a(f fVar);

    boolean a();

    a b();

    a c();

    void d();

    void e();

    void f();

    boolean g();

    boolean h();

    boolean i();
}
