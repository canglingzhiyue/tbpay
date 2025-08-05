package com.taobao.android.detail.core.standard.video;

import android.app.Activity;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsPicGalleryVideoPlayer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Activity f9863a;
    public m b;
    public String c = "init";
    public boolean d = true;

    /* loaded from: classes4.dex */
    public @interface PlayStatus {
        public static final String PLAY_STATUS_DESTROYED = "destroyed";
        public static final String PLAY_STATUS_ERROR = "error";
        public static final String PLAY_STATUS_INIT = "init";
        public static final String PLAY_STATUS_PAUSING = "pausing";
        public static final String PLAY_STATUS_PLAYING = "playing";
    }

    /* loaded from: classes4.dex */
    public interface a {
        void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar);

        void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar, float f);

        void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar, String str, String str2);

        void b(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar);

        void c(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar);
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar);

        void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar, boolean z);

        void b(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar);
    }

    static {
        kge.a(-1533714429);
    }

    public abstract Object a(String str);

    public abstract void a();

    public abstract void a(float f);

    public abstract void a(int i);

    public abstract void a(int i, int i2);

    public abstract void a(a aVar);

    public abstract void a(b bVar);

    public abstract void a(String str, Object obj);

    public abstract void a(boolean z);

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract boolean g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract m n();

    public abstract View o();

    public abstract String p();

    public abstract float q();

    public abstract long r();

    public abstract long s();

    public abstract a t();

    public abstract int u();

    public abstract int v();

    public AbsPicGalleryVideoPlayer(Activity activity, m mVar) {
        this.f9863a = activity;
        this.b = mVar;
    }
}
