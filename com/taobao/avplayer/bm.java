package com.taobao.avplayer;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.bl;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.cache.library.StorageUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONObject;
import tb.ddg;
import tb.kcl;
import tb.kge;

/* loaded from: classes6.dex */
public class bm implements View.OnLongClickListener, aw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String l;

    /* renamed from: a  reason: collision with root package name */
    public ImageView f16470a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public JSONObject i;
    public aw j;
    public bn k;
    private FrameLayout m;
    private bl n;
    private Activity o;
    private b p;
    private DWAspectRatio q;

    /* loaded from: classes6.dex */
    public static class b {
        public int A;
        public int B;
        public com.taobao.avplayer.common.v F;
        public as G;
        public ap H;
        public com.taobao.avplayer.common.d I;
        public com.taobao.avplayer.common.ad J;
        public com.taobao.avplayer.common.af K;
        public ar L;
        public ddg N;
        public aw P;
        public bn Q;
        public JSONObject R;
        public HashMap<String, String> T;

        /* renamed from: a  reason: collision with root package name */
        public String f16474a;
        public Activity c;
        public long d;
        public String g;
        public String h;
        public HashMap<String, String> i;
        public DWAspectRatio j;
        public String k;
        public String l;
        public String m;
        public String n;
        public String o;
        public String p;
        public String q;
        public HashMap<String, String> r;
        public int b = 2;
        public boolean e = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DEFAULT_MUTE_WHEN_CREATE, "true"));
        public float f = -1.0f;
        public boolean s = true;
        public boolean t = true;
        public boolean u = false;
        public boolean v = false;
        public boolean w = true;
        public boolean x = false;
        public boolean y = false;
        public boolean z = true;
        public boolean O = false;
        public DWVideoScreenType C = DWVideoScreenType.NORMAL;
        public DWInstanceType D = DWInstanceType.VIDEO;
        public int S = 0;

        static {
            kge.a(-1728105561);
        }
    }

    public static /* synthetic */ Activity a(bm bmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("ab2acf82", new Object[]{bmVar}) : bmVar.o;
    }

    public static /* synthetic */ String a(bm bmVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a9e3a134", new Object[]{bmVar, context, str}) : bmVar.a(context, str);
    }

    public static /* synthetic */ String a(bm bmVar, Bitmap bitmap, Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f7130d56", new Object[]{bmVar, bitmap, context, str}) : bmVar.a(bitmap, context, str);
    }

    static {
        kge.a(280530706);
        kge.a(-123403623);
        kge.a(1426707756);
        l = "DWLivePhoto";
    }

    public bm(b bVar) {
        this.p = bVar;
        this.o = bVar.c;
        this.m = new FrameLayout(bVar.c);
        this.j = bVar.P;
        this.k = bVar.Q;
        a(bVar.R);
        if (!StringUtils.isEmpty(this.b) && this.f16470a == null) {
            this.f16470a = new ImageView(bVar.c);
            PhenixCreator a2 = com.taobao.phenix.intf.b.h().a(bVar.c).a(this.b);
            com.taobao.phenix.intf.event.a<FailPhenixEvent> aVar = new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.avplayer.bm.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return ((Boolean) ipChange.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    bm.this.k.b();
                    return false;
                }
            };
            com.taobao.phenix.intf.event.a<SuccPhenixEvent> aVar2 = new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.avplayer.bm.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    bm.this.k.a();
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "livePhoto: cover showed suceessfully by phenix");
                    return false;
                }
            };
            a2.failListener(aVar);
            a2.succListener(aVar2);
            a2.into(this.f16470a);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            if (bVar.j != null) {
                if (bVar.j == DWAspectRatio.DW_FIT_CENTER) {
                    this.f16470a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                } else if (bVar.j == DWAspectRatio.DW_CENTER_CROP) {
                    this.f16470a.setScaleType(ImageView.ScaleType.CENTER_CROP);
                } else if (bVar.j == DWAspectRatio.DW_FIT_X_Y) {
                    this.f16470a.setScaleType(ImageView.ScaleType.FIT_XY);
                }
            }
            this.f16470a.setLayoutParams(layoutParams);
            if (bVar.z) {
                this.f16470a.setOnLongClickListener(this);
            }
            this.f16470a.bringToFront();
        }
        ImageView imageView = this.f16470a;
        if (imageView != null) {
            this.m.addView(imageView);
        }
    }

    private void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47d3c1e8", new Object[]{this, bVar});
            return;
        }
        bl.a aVar = new bl.a(bVar.c);
        aVar.l("dwLivePhoto");
        if (!StringUtils.isEmpty(this.d)) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "livePhoto:set videourl = " + this.d);
            aVar.a(this.d);
        }
        if (!StringUtils.isEmpty(this.f)) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "livePhoto:set mCacheKey = " + this.f);
            aVar.m(this.f);
        }
        if (!StringUtils.isEmpty(this.h)) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "livePhoto:set mVideoBytes = " + this.h);
            aVar.n(this.h);
        }
        aVar.a(bVar.D);
        aVar.c(false);
        aVar.d(bVar.l);
        aVar.a(bVar.d);
        aVar.c(bVar.A);
        aVar.d(bVar.B);
        aVar.e(bVar.n);
        aVar.a(bVar.F);
        aVar.a(bVar.L);
        aVar.a(bVar.G);
        if (bVar.h != null) {
            aVar.f("livephoto_" + bVar.h);
        } else {
            aVar.f("livephoto_default");
        }
        aVar.g(bVar.m);
        aVar.a(bVar.r);
        aVar.b(bVar.i);
        aVar.d(bVar.T);
        aVar.a(bVar.H);
        aVar.a(bVar.I);
        aVar.a(bVar.J);
        aVar.d(bVar.e);
        aVar.e(bVar.s);
        aVar.f(bVar.t);
        aVar.g(bVar.u);
        aVar.a(bVar.C);
        aVar.h(bVar.v);
        aVar.h(bVar.o);
        aVar.i(bVar.p);
        aVar.j(bVar.q);
        aVar.a(bVar.K);
        aVar.a(bVar.N);
        aVar.k(bVar.k);
        DWAspectRatio dWAspectRatio = this.q;
        if (dWAspectRatio != null) {
            aVar.a(dWAspectRatio);
        } else {
            aVar.a(bVar.j);
        }
        aVar.m(bVar.w);
        aVar.n(bVar.x);
        aVar.k(bVar.y);
        aVar.b(bVar.S);
        aVar.s(bVar.O);
        if (bVar.f > 0.0f && bVar.f <= 1.0f) {
            aVar.a(bVar.f);
        }
        this.n = aVar.c();
        this.n.a(this);
        this.m.addView(this.n.l());
        this.f16470a.bringToFront();
    }

    public ViewGroup a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("8c7138ad", new Object[]{this}) : this.m;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!StringUtils.isEmpty(this.c)) {
            bn bnVar = this.k;
            if (bnVar == null) {
                return;
            }
            bnVar.a(this.c);
        } else {
            ImageView imageView = this.f16470a;
            if (imageView == null) {
                return;
            }
            try {
                imageView.setDrawingCacheEnabled(true);
                this.f16470a.buildDrawingCache();
                Bitmap drawingCache = this.f16470a.getDrawingCache();
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "livePhoto:getImgLocalPath bitmap=" + drawingCache + ", mDWActivity=" + this.o + ", mCacheKey=" + this.f);
                if (drawingCache != null && this.o != null && !StringUtils.isEmpty(this.f)) {
                    com.taobao.taobaoavsdk.util.a.a().submit(new c(this.k, 0, drawingCache));
                } else if (this.k == null) {
                } else {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "livePhoto:getImgLocalPath failed!");
                    this.k.a("");
                }
            } catch (Exception unused) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "livePhoto:write drawble to local failed.");
                bn bnVar2 = this.k;
                if (bnVar2 == null) {
                    return;
                }
                bnVar2.a("");
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!StringUtils.isEmpty(this.e)) {
            bn bnVar = this.k;
            if (bnVar == null) {
                return;
            }
            bnVar.b(this.e);
        } else {
            try {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "livePhoto: getVideoLocalPath mDWActivity=" + this.o + ", mCacheKey=" + this.f);
                if (this.o != null && !StringUtils.isEmpty(this.f)) {
                    com.taobao.taobaoavsdk.util.a.a().submit(new c(this.k, 1, null));
                    return;
                }
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "livePhoto: getVideoLocalPath failed!");
                if (this.k == null) {
                    return;
                }
                this.k.b("");
            } catch (Exception unused) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "livePhoto:write drawble to local failed.");
                bn bnVar2 = this.k;
                if (bnVar2 == null) {
                    return;
                }
                bnVar2.b("");
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.n == null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "livephoto: mVideoInstance=null when call start, create one new instance.");
            a(this.p);
        }
        if (this.n == null) {
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "livephoto: mVideoInstance is not null when call start.");
        this.n.a(this);
        this.n.c();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        bl blVar = this.n;
        if (blVar != null) {
            blVar.m();
        }
        ImageView imageView = this.f16470a;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(null);
        this.f16470a = null;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        bl blVar = this.n;
        if (blVar == null) {
            return;
        }
        blVar.g();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        bl blVar = this.n;
        if (blVar == null) {
            return;
        }
        blVar.e(z);
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        bl blVar = this.n;
        if (blVar == null) {
            return;
        }
        blVar.b(f);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        aw awVar = this.j;
        if (awVar == null) {
            return;
        }
        awVar.onVideoStart();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        ImageView imageView = this.f16470a;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        aw awVar = this.j;
        if (awVar == null) {
            return;
        }
        awVar.onVideoPause(z);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        aw awVar = this.j;
        if (awVar == null) {
            return;
        }
        awVar.onVideoPlay();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            return;
        }
        aw awVar = this.j;
        if (awVar == null) {
            return;
        }
        awVar.onVideoSeekTo(i);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            return;
        }
        aw awVar = this.j;
        if (awVar == null) {
            return;
        }
        awVar.onVideoPrepared(obj);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        ImageView imageView = this.f16470a;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        aw awVar = this.j;
        if (awVar == null) {
            return;
        }
        awVar.onVideoError(obj, i, i2);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "livephoto:onvideoinfo=" + j);
        if ((j == 12100 || j == 3) && (imageView = this.f16470a) != null) {
            imageView.setVisibility(4);
        }
        aw awVar = this.j;
        if (awVar == null) {
            return;
        }
        awVar.onVideoInfo(obj, j, j2, j3, obj2);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        ImageView imageView = this.f16470a;
        if (imageView != null && imageView.getVisibility() != 0) {
            this.f16470a.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16470a, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(500L);
            ofFloat.start();
        }
        aw awVar = this.j;
        if (awVar == null) {
            return;
        }
        awVar.onVideoComplete();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
            return;
        }
        ImageView imageView = this.f16470a;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        aw awVar = this.j;
        if (awVar == null) {
            return;
        }
        awVar.onVideoClose();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
            return;
        }
        aw awVar = this.j;
        if (awVar == null) {
            return;
        }
        awVar.onVideoScreenChanged(dWVideoScreenType);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        aw awVar = this.j;
        if (awVar == null) {
            return;
        }
        awVar.onVideoProgressChanged(i, i2, i3);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        Vibrator vibrator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
        }
        Activity activity = this.o;
        if (activity != null && (vibrator = (Vibrator) activity.getSystemService("vibrator")) != null && vibrator.hasVibrator()) {
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(VibrationEffect.createOneShot(200L, -1));
            } else {
                vibrator.vibrate(200L);
            }
        }
        d();
        return true;
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public b f16473a = new b();

        static {
            kge.a(-1942998039);
        }

        public a(Activity activity) {
            this.f16473a.c = activity;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("caf824c5", new Object[]{this, str});
            }
            this.f16473a.g = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4c2c6a4", new Object[]{this, str});
            }
            this.f16473a.f16474a = str;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8cef52cb", new Object[]{this, new Boolean(z)});
            }
            this.f16473a.e = z;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3e8d6883", new Object[]{this, str});
            }
            this.f16473a.h = str;
            return this;
        }

        public a a(DWAspectRatio dWAspectRatio) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("278532b8", new Object[]{this, dWAspectRatio});
            }
            this.f16473a.j = dWAspectRatio;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("78580a62", new Object[]{this, str});
            }
            this.f16473a.l = str;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8f0dd57c", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = kcl.a();
            }
            this.f16473a.A = i;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a3f69dbd", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = kcl.a(600.0f);
            }
            this.f16473a.B = i;
            return this;
        }

        public a a(ap apVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7852ae75", new Object[]{this, apVar});
            }
            this.f16473a.H = apVar;
            return this;
        }

        public a a(com.taobao.avplayer.common.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a88b32c6", new Object[]{this, dVar});
            }
            this.f16473a.I = dVar;
            return this;
        }

        public a a(DWVideoScreenType dWVideoScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1f6d24c6", new Object[]{this, dWVideoScreenType});
            }
            this.f16473a.C = dWVideoScreenType;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a1d81b0c", new Object[]{this, new Boolean(z)});
            }
            this.f16473a.z = z;
            return this;
        }

        public a a(com.taobao.avplayer.common.af afVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("275bd681", new Object[]{this, afVar});
            }
            this.f16473a.K = afVar;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b222ac41", new Object[]{this, str});
            }
            this.f16473a.k = str;
            return this;
        }

        public a a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("731f4b21", new Object[]{this, jSONObject});
            }
            this.f16473a.R = jSONObject;
            return this;
        }

        public a a(aw awVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9981edfc", new Object[]{this, awVar});
            }
            this.f16473a.P = awVar;
            return this;
        }

        public a a(bn bnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("265f9112", new Object[]{this, bnVar});
            }
            this.f16473a.Q = bnVar;
            return this;
        }

        public bm a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bm) ipChange.ipc$dispatch("88d7d2ac", new Object[]{this}) : new bm(this.f16473a);
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32861656", new Object[]{this, jSONObject});
            return;
        }
        this.i = jSONObject;
        JSONObject jSONObject2 = this.i;
        if (jSONObject2 == null) {
            return;
        }
        Object opt = jSONObject2.opt("photoUrl");
        String str = null;
        this.b = opt == null ? null : String.valueOf(opt);
        Object opt2 = this.i.opt("videoUrl");
        this.d = opt2 == null ? null : String.valueOf(opt2);
        Object opt3 = this.i.opt("cacheKey");
        this.f = opt3 == null ? null : String.valueOf(opt3);
        Object opt4 = this.i.opt("passThroughData");
        this.g = opt4 == null ? null : String.valueOf(opt4);
        Object opt5 = this.i.opt("videoBytes");
        if (opt5 != null) {
            str = String.valueOf(opt5);
        }
        this.h = str;
    }

    private String a(Bitmap bitmap, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa6e0d14", new Object[]{this, bitmap, context, str});
        }
        File file = new File(StorageUtils.getIndividualCacheDirectory(context), "livePhotoCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str + ".jpg");
        if (file2.exists()) {
            return file2.getAbsolutePath();
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (file2.createNewFile()) {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                        fileOutputStream2.flush();
                        String absolutePath = file2.getAbsolutePath();
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return absolutePath;
                    } catch (IOException e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "livePhoto: coverCache file to FileOutputStream failed!");
                        e.printStackTrace();
                        if (fileOutputStream == null) {
                            return "";
                        }
                        try {
                            fileOutputStream.close();
                            return "";
                        } catch (IOException e3) {
                            e3.printStackTrace();
                            return "";
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "livePhoto: coverCache.createNewFile() failed.");
                return "";
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00e3 A[Catch: IOException -> 0x00df, TRY_LEAVE, TryCatch #5 {IOException -> 0x00df, blocks: (B:65:0x00db, B:69:0x00e3), top: B:77:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a(android.content.Context r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.bm.a(android.content.Context, java.lang.String):java.lang.String");
    }

    /* loaded from: classes6.dex */
    public final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f16475a;
        private WeakReference<bn> c;
        private WeakReference<Bitmap> d;

        static {
            kge.a(-2045947501);
            kge.a(-1390502639);
        }

        public c(bn bnVar, int i, Bitmap bitmap) {
            this.f16475a = -1;
            this.c = new WeakReference<>(bnVar);
            this.d = new WeakReference<>(bitmap);
            this.f16475a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f16475a == 0 && this.d.get() != null) {
                bm bmVar = bm.this;
                bmVar.c = bm.a(bmVar, this.d.get(), bm.a(bm.this), bm.this.f);
                if (this.c.get() == null) {
                    return;
                }
                this.c.get().a(bm.this.c);
            } else if (this.f16475a != 1) {
            } else {
                bm bmVar2 = bm.this;
                bmVar2.e = bm.a(bmVar2, bm.a(bmVar2), bm.this.f);
                if (this.c.get() == null) {
                    return;
                }
                this.c.get().b(bm.this.e);
            }
        }
    }
}
