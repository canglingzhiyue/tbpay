package com.taobao.taolive.sdk.ui.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.view.View;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public interface IMediaPlayer {
    public static final int MEDIA_INFO_BUFFERING_END = 702;
    public static final int MEDIA_INFO_BUFFERING_START = 701;
    public static final int MEDIA_INFO_NETWORK_TRAFFIC = 714;
    public static final int MEDIA_INFO_SEI_USERDEFINED_STRUCT = 715;
    public static final int MEDIA_INFO_VIDEO_RENDERING_START = 3;
    public static final int MEDIA_OUT_OF_BUFFERING = 300;
    public static final int MEDIA_RESUME_BUFFERING = 301;
    public static final int PLAYER_TYPE_FF = 1;
    public static final int PLAYER_TYPE_MEDIA = 2;
    public static final int PLAYER_TYPE_TAOBAO = 3;
    public static final int RENDER_TYPE_SURFACE_VIEW = 1;
    public static final int RENDER_TYPE_TEXTURE_VIEW = 2;
    public static final int SCALE_TYPE_CENTER_CROP = 1;
    public static final int SCALE_TYPE_FIT_CENTER = 0;
    public static final int SCALE_TYPE_FIT_XY = 3;
    public static final int SCENARIO_TYPE_LINKLIVE = 1;
    public static final int SCENARIO_TYPE_LIVE = 0;
    public static final int SCENARIO_TYPE_PLAYBACK = 2;

    /* loaded from: classes8.dex */
    public enum AspectRatio {
        FIT_CENTER,
        CENTER_CROP,
        FIT_X_Y
    }

    /* loaded from: classes8.dex */
    public enum UpdataUrlListMode {
        INIT(0),
        REPLACE_BY_URL_ID_OF_NEW_DEFINITION(1),
        REPLACE_FORCE_OF_NEW_DEFINITION(2);
        
        private int value;

        UpdataUrlListMode(int i) {
            this.value = 0;
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes8.dex */
    public enum WarmState {
        NORMAL,
        WARMING,
        WARMED
    }

    /* loaded from: classes8.dex */
    public interface a {
    }

    /* loaded from: classes8.dex */
    public interface b {
        void a(HashMap<String, String> hashMap);
    }

    /* loaded from: classes8.dex */
    public interface c {
    }

    /* loaded from: classes8.dex */
    public interface d {
        void onCompletion(IMediaPlayer iMediaPlayer);
    }

    /* loaded from: classes8.dex */
    public interface e {
        boolean onError(IMediaPlayer iMediaPlayer, int i, int i2);
    }

    /* loaded from: classes8.dex */
    public interface f {
        void onHighLightLoopCompletion(IMediaPlayer iMediaPlayer);
    }

    /* loaded from: classes8.dex */
    public interface g {
        boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj);
    }

    /* loaded from: classes8.dex */
    public interface h {
        void onPause(IMediaPlayer iMediaPlayer);
    }

    /* loaded from: classes8.dex */
    public interface i {
        void onPrepared(IMediaPlayer iMediaPlayer);
    }

    /* loaded from: classes8.dex */
    public interface j {
        void onStart(IMediaPlayer iMediaPlayer);
    }

    boolean A();

    void B();

    s C();

    boolean D();

    void a(float f2);

    void a(int i2);

    void a(int i2, long j2);

    void a(int i2, String str);

    void a(long j2);

    void a(Context context);

    void a(Drawable drawable, boolean z);

    void a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener);

    void a(TLiveMsg tLiveMsg);

    void a(AspectRatio aspectRatio);

    void a(b bVar);

    void a(d dVar);

    void a(e eVar);

    void a(f fVar);

    void a(g gVar);

    void a(h hVar);

    void a(i iVar);

    void a(j jVar);

    void a(MediaData mediaData, String str);

    void a(String str);

    void a(HashMap<String, String> hashMap);

    void a(List<MediaData.QualityLiveItem> list);

    void a(List<MediaData.QualityLiveItem> list, UpdataUrlListMode updataUrlListMode);

    void a(Map<String, String> map);

    void a(boolean z);

    View b();

    HashMap<String, String> b(Map<String, String> map);

    void b(int i2);

    void b(long j2);

    void b(Context context);

    void b(String str);

    void b(HashMap<String, String> hashMap);

    void b(boolean z);

    Bitmap bG_();

    void c();

    void c(int i2);

    void c(String str);

    void c(boolean z);

    boolean cA_();

    boolean cy_();

    MediaData d();

    void d(int i2);

    void d(String str);

    void d(boolean z);

    float dX_();

    String e();

    void e(int i2);

    void e(String str);

    void e(boolean z);

    void f();

    void f(String str);

    void f(boolean z);

    void g();

    void g(String str);

    void g(boolean z);

    WarmState h();

    void h(String str);

    void h(boolean z);

    void i();

    void i(String str);

    void i(boolean z);

    int j();

    void j(String str);

    void j(boolean z);

    int k();

    void k(boolean z);

    void l(boolean z);

    boolean l();

    long m();

    void m(boolean z);

    long n();

    List<s> n(boolean z);

    void o();

    void o(boolean z);

    void p(boolean z);

    boolean p();

    void q();

    void q(boolean z);

    View r();

    void t();

    c u();

    String v();

    void w();

    boolean x();

    String y();

    boolean z();
}
