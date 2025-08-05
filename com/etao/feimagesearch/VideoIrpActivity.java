package com.etao.feimagesearch;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alipay.zoloz.hardware.camera.preview.utils.SPManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ab;
import com.etao.feimagesearch.util.u;
import com.etao.feimagesearch.videosearch.k;
import com.etao.feimagesearch.videosearch.m;
import com.etao.feimagesearch.videosearch.q;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.av;
import com.taobao.avplayer.bk;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Ref;
import tb.cot;
import tb.cox;
import tb.coy;
import tb.csz;
import tb.cuc;
import tb.cud;
import tb.kge;

/* loaded from: classes3.dex */
public final class VideoIrpActivity extends FEISBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private FrameLayout c;
    private FrameLayout d;
    private com.etao.feimagesearch.videosearch.n e;
    private bk f;
    private RecyclerView g;
    private View h;
    private View i;
    private int k;
    private View m;
    private FrameLayout n;
    private com.etao.feimagesearch.videosearch.j o;
    private View p;
    private int q;
    private boolean s;
    private boolean t;
    private long x;
    private int y;
    private int z;
    private final boolean b = com.etao.feimagesearch.config.b.at();
    private final com.etao.feimagesearch.videosearch.c j = new com.etao.feimagesearch.videosearch.c(this);
    private m l = new m(this);
    private int r = com.etao.feimagesearch.config.b.j();
    private String u = "";
    private final com.etao.feimagesearch.videosearch.o v = new com.etao.feimagesearch.videosearch.o();
    private String w = "";
    private final u A = new u(false, VideoIrpActivity$mediaUpdateObserver$1.INSTANCE, 1, null);

    /* loaded from: classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            FrameLayout g = VideoIrpActivity.g(VideoIrpActivity.this);
            if (g != null) {
                g.setVisibility(0);
            }
            cot.c("VideoSearch_VideoIrpActivity", "show all view clicked");
            com.etao.feimagesearch.videosearch.j h = VideoIrpActivity.h(VideoIrpActivity.this);
            if (h != null) {
                h.a();
            }
            com.etao.feimagesearch.videosearch.n a2 = VideoIrpActivity.a(VideoIrpActivity.this);
            if (a2 != null) {
                a2.d();
            }
            cox.a("allObjectClickon", com.etao.feimagesearch.util.h.KEY_VIDEO_ID, String.valueOf(VideoIrpActivity.this.g()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                VideoIrpActivity.this.finish();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class f implements q.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.etao.feimagesearch.videosearch.q.b
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            bk e = VideoIrpActivity.e(VideoIrpActivity.this);
            if (e != null) {
                e.mute(!z);
            }
            cox.a("switchvolume", "open", String.valueOf(z));
        }
    }

    /* loaded from: classes3.dex */
    public static final class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (VideoIrpActivity.this.isFinishing()) {
            } else {
                com.etao.feimagesearch.videosearch.j h = VideoIrpActivity.h(VideoIrpActivity.this);
                if ((h != null && h.d() == 0) || VideoIrpActivity.b(VideoIrpActivity.this).getItemCount() <= 0) {
                    return;
                }
                com.etao.feimagesearch.videosearch.j h2 = VideoIrpActivity.h(VideoIrpActivity.this);
                if (h2 == null) {
                    kotlin.jvm.internal.q.a();
                }
                if (h2.e()) {
                    return;
                }
                FrameLayout g = VideoIrpActivity.g(VideoIrpActivity.this);
                if (g != null) {
                    g.setVisibility(0);
                }
                com.etao.feimagesearch.videosearch.j h3 = VideoIrpActivity.h(VideoIrpActivity.this);
                if (h3 != null) {
                    h3.a();
                }
                cox.a("BackTopailitaosrp", com.etao.feimagesearch.util.h.KEY_VIDEO_ID, String.valueOf(VideoIrpActivity.this.g()));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class h implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final h INSTANCE = new h();

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class i implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                VideoIrpActivity.f(VideoIrpActivity.this).e();
            }
        }
    }

    static {
        kge.a(441218282);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(VideoIrpActivity videoIrpActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    public static final /* synthetic */ com.etao.feimagesearch.videosearch.n a(VideoIrpActivity videoIrpActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.videosearch.n) ipChange.ipc$dispatch("3f52da3", new Object[]{videoIrpActivity}) : videoIrpActivity.e;
    }

    public static final /* synthetic */ com.etao.feimagesearch.videosearch.c b(VideoIrpActivity videoIrpActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.videosearch.c) ipChange.ipc$dispatch("ab71060f", new Object[]{videoIrpActivity}) : videoIrpActivity.j;
    }

    public static final /* synthetic */ View c(VideoIrpActivity videoIrpActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("3e3546f", new Object[]{videoIrpActivity}) : videoIrpActivity.h;
    }

    public static final /* synthetic */ View d(VideoIrpActivity videoIrpActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8244584e", new Object[]{videoIrpActivity}) : videoIrpActivity.i;
    }

    public static final /* synthetic */ bk e(VideoIrpActivity videoIrpActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bk) ipChange.ipc$dispatch("79aacb", new Object[]{videoIrpActivity}) : videoIrpActivity.f;
    }

    public static final /* synthetic */ m f(VideoIrpActivity videoIrpActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("49606e49", new Object[]{videoIrpActivity}) : videoIrpActivity.l;
    }

    public static final /* synthetic */ FrameLayout g(VideoIrpActivity videoIrpActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("7cbf4b50", new Object[]{videoIrpActivity}) : videoIrpActivity.n;
    }

    public static final /* synthetic */ com.etao.feimagesearch.videosearch.j h(VideoIrpActivity videoIrpActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.videosearch.j) ipChange.ipc$dispatch("9858216e", new Object[]{videoIrpActivity}) : videoIrpActivity.o;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.w;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.y;
    }

    public final void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
        } else {
            this.z = i2;
        }
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.z;
    }

    public final bk a(Context context, String url, int i2, int i3, av avVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bk) ipChange.ipc$dispatch("301b1b8", new Object[]{this, context, url, new Integer(i2), new Integer(i3), avVar});
        }
        kotlin.jvm.internal.q.c(context, "context");
        kotlin.jvm.internal.q.c(url, "url");
        if (!(context instanceof Activity)) {
            return null;
        }
        bk.a aVar = new bk.a(getActivity());
        aVar.d(i3);
        aVar.c(i2);
        aVar.a(url);
        aVar.e("video_search");
        aVar.c(false);
        aVar.c("local");
        aVar.a(true);
        aVar.f(true);
        aVar.O(true);
        aVar.g(false);
        aVar.a(DWAspectRatio.DW_FIT_CENTER);
        aVar.r(true);
        bk c2 = aVar.c();
        c2.hideCloseView();
        c2.hideMiniProgressBar();
        c2.setRootViewClickListener(null);
        c2.hideController();
        c2.setVideoLifecycleListener(avVar);
        return c2;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.u;
    }

    @Override // com.etao.feimagesearch.FEISBaseActivity, com.etao.feimagesearch.ISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.feis_activity_video_search);
        j.INSTANCE.c();
        Intent intent = getIntent();
        kotlin.jvm.internal.q.a((Object) intent, "intent");
        Uri data = intent.getData();
        if (data != null) {
            this.u = data.getQueryParameter("pssource");
        }
        v();
        try {
            com.etao.feimagesearch.f.a().a(this);
        } catch (Exception unused) {
        }
        VideoIrpActivity videoIrpActivity = this;
        cox.a(videoIrpActivity, "Page_VideoSearchDetect");
        cox.a(videoIrpActivity, "spm-cnt", "a2141.27150782");
    }

    @Override // com.etao.feimagesearch.FEISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        VideoIrpActivity videoIrpActivity = this;
        cox.a(videoIrpActivity, "Page_VideoSearchDetect");
        cox.a(videoIrpActivity, "spm-cnt", "a2141.27150782");
        com.etao.feimagesearch.videosearch.j jVar = this.o;
        if (jVar == null || jVar.d() != 0) {
            if (this.f == null) {
                s();
            } else {
                com.etao.feimagesearch.videosearch.n nVar = this.e;
                if (nVar != null) {
                    nVar.c();
                }
            }
        }
        this.l.c();
        this.A.a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x010b, code lost:
        r17.y = r13.getInteger("frame-rate");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011a, code lost:
        if (r10 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011c, code lost:
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012c, code lost:
        if (r10 == null) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ea A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void s() {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.VideoIrpActivity.s():void");
    }

    public final long g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue() : this.v.b();
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        int i2 = this.z;
        if (i2 <= 0) {
            return;
        }
        cox.a("UserMaxBrowseFrames", "time", String.valueOf(i2), SPManager.FPS_KEY, String.valueOf(this.y));
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue();
        }
        bk bkVar = this.f;
        if (bkVar == null) {
            return 0;
        }
        return bkVar.getCurrentPosition();
    }

    /* loaded from: classes3.dex */
    public static final class c implements av {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref.IntRef b;

        @Override // com.taobao.avplayer.av
        public void onVideoClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24db3403", new Object[]{this});
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoError(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoFullScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoInfo(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoNormalScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoPrepared(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            }
        }

        public c(Ref.IntRef intRef) {
            this.b = intRef;
        }

        @Override // com.taobao.avplayer.av
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
                return;
            }
            Ref.IntRef intRef = this.b;
            com.etao.feimagesearch.videosearch.n a2 = VideoIrpActivity.a(VideoIrpActivity.this);
            if (a2 != null) {
                i = a2.f();
            }
            intRef.element = i;
        }

        @Override // com.taobao.avplayer.av
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
                return;
            }
            com.etao.feimagesearch.videosearch.n a2 = VideoIrpActivity.a(VideoIrpActivity.this);
            if (a2 == null) {
                return;
            }
            a2.g();
        }

        @Override // com.taobao.avplayer.av
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
                return;
            }
            com.etao.feimagesearch.videosearch.n a2 = VideoIrpActivity.a(VideoIrpActivity.this);
            if (a2 == null) {
                return;
            }
            a2.f();
        }

        @Override // com.taobao.avplayer.av
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
                return;
            }
            coy.a("Page_VideoSearchDetect", "videoend", 19999, com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.d.VIDEO_TIME, String.valueOf(this.b.element));
            com.etao.feimagesearch.videosearch.n a2 = VideoIrpActivity.a(VideoIrpActivity.this);
            if (a2 == null) {
                return;
            }
            a2.g();
        }

        @Override // com.taobao.avplayer.av
        public void onVideoProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            VideoIrpActivity videoIrpActivity = VideoIrpActivity.this;
            videoIrpActivity.a(Math.max(i2, videoIrpActivity.e()));
            com.etao.feimagesearch.videosearch.n a2 = VideoIrpActivity.a(VideoIrpActivity.this);
            if (a2 != null) {
                a2.a(i, i2, i3);
                if (a2.b()) {
                    a2.e();
                    return;
                }
                a2.h();
            }
            VideoIrpActivity.b(VideoIrpActivity.this).a(i, i2, i3);
        }
    }

    private final av t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (av) ipChange.ipc$dispatch("685b5c0f", new Object[]{this});
        }
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 0;
        return new c(intRef);
    }

    public final int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.k;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.l.b(true);
        com.etao.feimagesearch.videosearch.n nVar = this.e;
        if (nVar != null) {
            nVar.d();
        }
        this.A.b(this);
    }

    public final TextureView j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextureView) ipChange.ipc$dispatch("d4760b7e", new Object[]{this}) : a(this.d);
    }

    public final TextureView a(ViewGroup viewGroup) {
        TextureView a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextureView) ipChange.ipc$dispatch("d7ce0388", new Object[]{this, viewGroup});
        }
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof TextureView) {
                return (TextureView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (a2 = a((ViewGroup) childAt)) != null) {
                return a2;
            }
        }
        return null;
    }

    @Override // com.etao.feimagesearch.FEISBaseActivity, com.etao.feimagesearch.ISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        com.etao.feimagesearch.videosearch.n nVar = this.e;
        if (nVar != null) {
            nVar.d();
        }
        bk bkVar = this.f;
        if (bkVar != null) {
            bkVar.destroy();
        }
        this.l.f();
        com.etao.feimagesearch.videosearch.j jVar = this.o;
        if (jVar != null) {
            jVar.c();
        }
        try {
            com.etao.feimagesearch.f.a().c(this);
        } catch (Exception unused) {
        }
        try {
            this.j.b();
        } catch (Exception unused2) {
        }
    }

    public final void a(Bitmap thumbNailBitmap, String image, String frame, RectF rect, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de0d3f8b", new Object[]{this, thumbNailBitmap, image, frame, rect, new Integer(i2), new Integer(i3)});
            return;
        }
        kotlin.jvm.internal.q.c(thumbNailBitmap, "thumbNailBitmap");
        kotlin.jvm.internal.q.c(image, "image");
        kotlin.jvm.internal.q.c(frame, "frame");
        kotlin.jvm.internal.q.c(rect, "rect");
        if (isFinishing()) {
            return;
        }
        int i4 = this.q;
        if (i4 >= this.r) {
            n();
            return;
        }
        this.q = i4 + 1;
        cud cudVar = new cud(i2, thumbNailBitmap, image, frame, rect, i3);
        RecyclerView recyclerView = this.g;
        if (recyclerView != null) {
            if (recyclerView.getVisibility() == 8) {
                recyclerView.setVisibility(0);
            }
            this.j.a(cudVar);
        }
        View noResult = findViewById(R.id.tv_no_result);
        kotlin.jvm.internal.q.a((Object) noResult, "noResult");
        if (noResult.getVisibility() == 0) {
            noResult.setTag("2");
            noResult.setVisibility(8);
            this.s = false;
            n();
        }
        com.etao.feimagesearch.videosearch.j jVar = this.o;
        if (jVar == null) {
            return;
        }
        jVar.a(cudVar);
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        cot.c("VideoSearch_VideoIrpActivity", "videoFinish");
        this.t = true;
        u();
    }

    private final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        cot.c("VideoSearch_VideoIrpActivity", "autoShowResult: detectFinish = " + this.s + ", videoFinish = " + this.t);
        if (!this.s || !this.t) {
            return;
        }
        com.etao.feimagesearch.videosearch.j jVar = this.o;
        if ((jVar != null && jVar.d() == 0) || this.j.getItemCount() <= 0) {
            return;
        }
        com.etao.feimagesearch.videosearch.j jVar2 = this.o;
        if (jVar2 == null) {
            kotlin.jvm.internal.q.a();
        }
        if (jVar2.e()) {
            return;
        }
        FrameLayout frameLayout = this.n;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        com.etao.feimagesearch.videosearch.j jVar3 = this.o;
        if (jVar3 != null) {
            jVar3.a();
        }
        cox.a("BackTopailitaosrp", com.etao.feimagesearch.util.h.KEY_VIDEO_ID, String.valueOf(g()));
    }

    public final void l() {
        com.etao.feimagesearch.videosearch.j jVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (isFinishing() || (jVar = this.o) == null) {
        } else {
            jVar.b();
        }
    }

    private final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        View findViewById = findViewById(R.id.fl_root);
        if (findViewById == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.c = (FrameLayout) findViewById;
        View findViewById2 = findViewById(R.id.fl_video);
        if (findViewById2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.d = (FrameLayout) findViewById2;
        View findViewById3 = findViewById(R.id.rv_detect);
        if (findViewById3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView");
        }
        this.g = (RecyclerView) findViewById3;
        RecyclerView recyclerView = this.g;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this, 0, false));
        }
        RecyclerView recyclerView2 = this.g;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(new com.etao.feimagesearch.videosearch.d());
        }
        RecyclerView recyclerView3 = this.g;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.j);
        }
        RecyclerView recyclerView4 = this.g;
        if (recyclerView4 != null) {
            recyclerView4.setItemAnimator(null);
        }
        this.m = findViewById(R.id.view_loading);
        this.h = findViewById(R.id.btn_back_tv);
        View view = this.h;
        if (view != null) {
            view.setOnClickListener(new d());
        }
        this.i = findViewById(R.id.btn_volume);
        View findViewById4 = findViewById(R.id.video_search_result_common_container);
        if (findViewById4 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.n = (FrameLayout) findViewById4;
        FrameLayout frameLayout = this.n;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        FrameLayout frameLayout2 = this.n;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(4);
        }
        this.o = new com.etao.feimagesearch.videosearch.k(this, this.b);
        FrameLayout frameLayout3 = this.n;
        if (frameLayout3 != null) {
            com.etao.feimagesearch.videosearch.j jVar = this.o;
            if (jVar == null) {
                kotlin.jvm.internal.q.a();
            }
            frameLayout3.addView(jVar.f(), new FrameLayout.LayoutParams(-1, -1));
        }
        com.etao.feimagesearch.videosearch.j jVar2 = this.o;
        if (jVar2 != null) {
            jVar2.a(this);
        }
        com.etao.feimagesearch.videosearch.j jVar3 = this.o;
        if (jVar3 != null) {
            jVar3.a(new e());
        }
        View findViewById5 = findViewById(R.id.btn_show_all);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(com.taobao.android.searchbaseframe.util.j.b(18.0f));
        gradientDrawable.setColor(Color.parseColor("#FF831D"));
        findViewById5.setBackground(gradientDrawable);
        new q(this).a(new f());
        this.e = new com.etao.feimagesearch.videosearch.n(this, this.u);
    }

    /* loaded from: classes3.dex */
    public static final class e implements k.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.etao.feimagesearch.videosearch.k.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            View c = VideoIrpActivity.c(VideoIrpActivity.this);
            if (c != null) {
                c.setVisibility(0);
            }
            View d = VideoIrpActivity.d(VideoIrpActivity.this);
            if (d != null) {
                d.setVisibility(0);
            }
            VideoIrpActivity.this.q();
        }

        @Override // com.etao.feimagesearch.videosearch.k.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            View c = VideoIrpActivity.c(VideoIrpActivity.this);
            if (c != null) {
                c.setVisibility(4);
            }
            View d = VideoIrpActivity.d(VideoIrpActivity.this);
            if (d == null) {
                return;
            }
            d.setVisibility(4);
        }
    }

    public final void onEventMainThread(cuc event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8f66a4", new Object[]{this, event});
            return;
        }
        kotlin.jvm.internal.q.c(event, "event");
        cot.c("VideoSearch_VideoIrpActivity", "onEventMainThread: " + event);
        FrameLayout frameLayout = this.n;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        com.etao.feimagesearch.videosearch.j jVar = this.o;
        if (jVar != null) {
            jVar.a(event);
        }
        com.etao.feimagesearch.videosearch.n nVar = this.e;
        if (nVar != null) {
            nVar.d();
        }
        RecyclerView recyclerView = this.g;
        if (recyclerView == null) {
            return;
        }
        recyclerView.setVisibility(8);
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            ab.a(this, "", com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19059), com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_cancel), h.INSTANCE, com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19053), new i()).show();
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        cot.c("VideoSearch_VideoIrpActivity", "detectFinish " + this.j.a());
        if (this.s) {
            return;
        }
        csz.a(this.x, this.l.a(), true, this.w);
        this.s = true;
        w();
        u();
        View view = this.m;
        if (view != null) {
            view.setTag("2");
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
            }
        }
        if (this.j.a() == 0) {
            cox.a("NoVideoRes", com.etao.feimagesearch.util.h.KEY_VIDEO_ID, String.valueOf(g()));
            return;
        }
        cox.a("HaveVideoRes", new String[0]);
        View findViewById = findViewById(R.id.btn_show_all);
        findViewById.setOnClickListener(new b());
        findViewById.setAlpha(1.0f);
        findViewById.setVisibility(0);
        findViewById.setTag(null);
    }

    private final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
        } else if (this.j.a() > 0) {
        } else {
            View noResultHint = findViewById(R.id.tv_no_result);
            kotlin.jvm.internal.q.a((Object) noResultHint, "noResultHint");
            noResultHint.setVisibility(0);
            noResultHint.setTag(null);
            noResultHint.setAlpha(1.0f);
            VideoIrpActivity videoIrpActivity = this;
            if (k.c(videoIrpActivity, "has_show_pause_2_search")) {
                return;
            }
            k.a((Context) videoIrpActivity, "has_show_pause_2_search", true);
            cot.c("VideoSearch_VideoIrpActivity", "showNewUserPause2SearchGuide");
            if (this.p == null) {
                View findViewById = findViewById(R.id.video_new_use_guide);
                if (findViewById != null) {
                    if (findViewById instanceof ViewStub) {
                        this.p = ((ViewStub) findViewById).inflate();
                    }
                } else {
                    VideoIrpActivity videoIrpActivity2 = this;
                    View findViewById2 = videoIrpActivity2.findViewById(R.id.video_new_use_guide_inflate_id);
                    if (findViewById2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
                    }
                    videoIrpActivity2.p = (LinearLayout) findViewById2;
                }
            }
            View view = this.p;
            if (view == null) {
                return;
            }
            Drawable background = view.getBackground();
            if (background instanceof GradientDrawable) {
                int parseColor = Color.parseColor("#88000000");
                GradientDrawable gradientDrawable = (GradientDrawable) background;
                gradientDrawable.setStroke(com.etao.feimagesearch.util.g.a(1.0f), parseColor);
                gradientDrawable.setCornerRadius(com.etao.feimagesearch.util.g.a(24.0f));
                gradientDrawable.setColor(parseColor);
            }
            view.setVisibility(0);
            View findViewById3 = findViewById(R.id.iv_user_guide_iv);
            if (findViewById3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
            }
            ((TUrlImageView) findViewById3).setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01FeYcuf1RgckATwktS_!!6000000002141-2-tps-109-147.png");
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        View view = this.p;
        if (view != null) {
            view.setVisibility(8);
        }
        View findViewById = findViewById(R.id.tv_no_result);
        kotlin.jvm.internal.q.a((Object) findViewById, "findViewById(R.id.tv_no_result)");
        findViewById.setVisibility(8);
    }

    public final void p() {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (this.j.getItemCount() <= 0 || (recyclerView = this.g) == null) {
        } else {
            recyclerView.smoothScrollToPosition(this.j.getItemCount() - 1);
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.g;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        com.etao.feimagesearch.videosearch.n nVar = this.e;
        if (nVar != null) {
            nVar.c();
        }
        this.j.notifyDataSetChanged();
    }

    public final com.etao.feimagesearch.videosearch.o r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.videosearch.o) ipChange.ipc$dispatch("4f5faa38", new Object[]{this}) : this.v;
    }

    public final void b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i2)});
            return;
        }
        cot.c("VideoSearch_VideoIrpActivity", "setVipCardIndex " + i2);
        if (i2 < 0) {
            return;
        }
        if (this.j.getItemCount() >= i2 + 1) {
            FrameLayout frameLayout = this.n;
            if (frameLayout == null) {
                return;
            }
            frameLayout.postDelayed(new g(), com.etao.feimagesearch.config.b.w());
            return;
        }
        this.j.b(i2);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(-488193102);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
