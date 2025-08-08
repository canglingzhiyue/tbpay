package com.alibaba.security.realidentity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.common.http.MTopManager;
import com.alibaba.security.realidentity.RPConfig;
import com.alibaba.security.realidentity.biz.RPBusinessHeadParams;
import com.alibaba.security.realidentity.biz.base.chain.BusinessHeadParams;
import com.alibaba.security.realidentity.biz.config.CtidConfig;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.biz.entity.ClientInfo;
import com.alibaba.security.realidentity.service.track.RPTrack;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.alibaba.security.realidentity.ui.ALBiometricsConfig;
import com.alibaba.security.realidentity.ui.activity.RPWebViewActivity;
import com.alibaba.security.realidentity.ui.activity.RpLoadingActivity;
import com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor;
import com.alibaba.security.realidentity.ui.webview.jsbridge.CancelUploadApi;
import com.alibaba.security.realidentity.ui.webview.jsbridge.CheckEnvironmentApi;
import com.alibaba.security.realidentity.ui.webview.jsbridge.FinishApi;
import com.alibaba.security.realidentity.ui.webview.jsbridge.GetDeviceInfoApi;
import com.alibaba.security.realidentity.ui.webview.jsbridge.JsApiManager;
import com.alibaba.security.realidentity.ui.webview.jsbridge.LivenessApi;
import com.alibaba.security.realidentity.ui.webview.jsbridge.NativeCtidVerifyApi;
import com.alibaba.security.realidentity.ui.webview.jsbridge.NativeVerifyApi;
import com.alibaba.security.realidentity.ui.webview.jsbridge.TraceLinkApi;
import com.alibaba.security.realidentity.ui.webview.jsbridge.UploadApi;
import com.alibaba.security.realidentity.ui.webview.jsbridge.exec.GetSensorInfoApi;
import com.alibaba.security.realidentity.ui.webview.jsbridge.exec.OldEasyTrackApi;
import com.alibaba.security.realidentity.ui.webview.jsbridge.exec.OptionApi;
import com.alibaba.security.realidentity.ui.webview.jsbridge.exec.SetTitleApi;
import com.alibaba.security.realidentity.ui.webview.jsbridge.exec.TakePhotoApi;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class g1 implements f4, u4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String k = "RPVerifyManager";

    /* renamed from: a  reason: collision with root package name */
    public final Handler f3405a;
    public Context b;
    public String c;
    public b4 d;
    public final i2 e;
    public d4 f;
    public final JsApiManager g;
    public l2 h;
    public t1 i;
    public r1 j;

    /* loaded from: classes3.dex */
    public class a implements k2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f3406a;

        public a(Context context) {
            this.f3406a = context;
        }

        @Override // com.alibaba.security.realidentity.k2
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else if (!z) {
            } else {
                new u2().a(this.f3406a);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements q1 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f3407a;
        public final /* synthetic */ RPBizConfig b;
        public final /* synthetic */ String c;

        public b(Context context, RPBizConfig rPBizConfig, String str) {
            this.f3407a = context;
            this.b = rPBizConfig;
            this.c = str;
        }

        @Override // com.alibaba.security.realidentity.q1
        public void onRequestEnd(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a93d2f02", new Object[]{this, new Boolean(z)});
            } else if (!z) {
                g1.this.a();
            } else {
                g1.a(g1.this, this.f3407a, this.b);
                g1.a(g1.this, this.f3407a, this.c, this.b);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements q1 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f3408a;
        public final /* synthetic */ RPBizConfig b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public c(Context context, RPBizConfig rPBizConfig, String str, String str2) {
            this.f3408a = context;
            this.b = rPBizConfig;
            this.c = str;
            this.d = str2;
        }

        @Override // com.alibaba.security.realidentity.q1
        public void onRequestEnd(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a93d2f02", new Object[]{this, new Boolean(z)});
            } else if (!z) {
                g1.this.a();
            } else {
                g1.a(g1.this, this.f3408a, this.b);
                g1.a(g1.this, this.f3408a, this.c, this.d, this.b);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d implements q1 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RPBizConfig f3409a;
        public final /* synthetic */ Context b;

        public d(RPBizConfig rPBizConfig, Context context) {
            this.f3409a = rPBizConfig;
            this.b = context;
        }

        @Override // com.alibaba.security.realidentity.q1
        public void onRequestEnd(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a93d2f02", new Object[]{this, new Boolean(z)});
            } else if (!z) {
                g1.this.a();
            } else if (m2.a().c() && g1.e(g1.this).a(this.f3409a)) {
                g1 g1Var = g1.this;
                g1.a(g1Var, g1.f(g1Var), this.f3409a, 0);
            } else {
                g1.a(g1.this, this.b, this.f3409a);
                g1 g1Var2 = g1.this;
                g1.a(g1Var2, this.b, this.f3409a, g1.g(g1Var2));
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e implements q1 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RPBizConfig f3410a;
        public final /* synthetic */ Activity b;
        public final /* synthetic */ String c;

        public e(RPBizConfig rPBizConfig, Activity activity, String str) {
            this.f3410a = rPBizConfig;
            this.b = activity;
            this.c = str;
        }

        @Override // com.alibaba.security.realidentity.q1
        public void onRequestEnd(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a93d2f02", new Object[]{this, new Boolean(z)});
            } else if (!z) {
                g1.this.a();
            } else if (!m2.a().c() || !g1.e(g1.this).a(this.f3410a)) {
                g1.a(g1.this, this.f3410a, this.b, this.c);
            } else {
                g1 g1Var = g1.this;
                g1.a(g1Var, g1.f(g1Var), this.f3410a, 3);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f implements j2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f3411a;
        public final /* synthetic */ RPBizConfig b;

        public f(Activity activity, RPBizConfig rPBizConfig) {
            this.f3411a = activity;
            this.b = rPBizConfig;
        }

        @Override // com.alibaba.security.realidentity.j2
        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            } else if (i == -1) {
                g1.e(g1.this).a(false);
                g1.g(g1.this).onFinish(RPResult.AUDIT_NOT, new RPDetail(g1.a(g1.this, RPResult.AUDIT_FAIL, String.valueOf((int) e2.y)), String.valueOf((int) e2.y), "CTID auth failed by user exit", null));
            } else {
                g1.a(g1.this, this.f3411a, this.b);
                Activity activity = this.f3411a;
                RPBizConfig rPBizConfig = this.b;
                g1 g1Var = g1.this;
                f1 f1Var = new f1(activity, rPBizConfig, g1Var, g1.g(g1Var), false);
                BusinessHeadParams businessHeadParams = new BusinessHeadParams();
                CtidConfig ctidConfig = new CtidConfig();
                ctidConfig.ctidParams = str;
                ctidConfig.ctidCode = i;
                ctidConfig.isCtidCalled = true;
                this.b.setCtidConfig(ctidConfig);
                f1Var.a(businessHeadParams);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class g implements q1 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f3412a;
        public final /* synthetic */ RPBizConfig b;
        public final /* synthetic */ RPBusinessHeadParams c;
        public final /* synthetic */ RPEventListener d;

        public g(Context context, RPBizConfig rPBizConfig, RPBusinessHeadParams rPBusinessHeadParams, RPEventListener rPEventListener) {
            this.f3412a = context;
            this.b = rPBizConfig;
            this.c = rPBusinessHeadParams;
            this.d = rPEventListener;
        }

        @Override // com.alibaba.security.realidentity.q1
        public void onRequestEnd(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a93d2f02", new Object[]{this, new Boolean(z)});
            } else if (z) {
                g1.a(g1.this, this.f3412a, this.b, this.c, this.d);
            } else {
                RPEventListener rPEventListener = this.d;
                RPResult rPResult = RPResult.AUDIT_NOT;
                rPEventListener.onFinish(rPResult, new RPDetail(String.valueOf(rPResult.code), String.valueOf((int) e2.A), "dynamic request error", null));
            }
        }
    }

    /* loaded from: classes3.dex */
    public class h implements o2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f3413a;
        public final /* synthetic */ RPBizConfig b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ RPBusinessHeadParams d;
        public final /* synthetic */ RPEventListener e;

        public h(long j, RPBizConfig rPBizConfig, Context context, RPBusinessHeadParams rPBusinessHeadParams, RPEventListener rPEventListener) {
            this.f3413a = j;
            this.b = rPBizConfig;
            this.c = context;
            this.d = rPBusinessHeadParams;
            this.e = rPEventListener;
        }

        @Override // com.alibaba.security.realidentity.o2
        public void remoteAssetsResult(boolean z, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d43f0ca6", new Object[]{this, new Boolean(z), new Integer(i), str});
                return;
            }
            g1.a(g1.this, this.b.getBasicsConfig().verifyToken, z, i, str, System.currentTimeMillis() - this.f3413a);
            if (!z) {
                this.e.onFinish(RPResult.AUDIT_FAIL, new RPDetail(e2.c, String.valueOf(i), "请检查手机网络连接并重试", null));
                return;
            }
            g1.a(g1.this, this.c, this.b);
            g1.b(g1.this, this.c, this.b, this.d, this.e);
        }
    }

    /* loaded from: classes3.dex */
    public static final class j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final g1 f3420a = new g1(null);

        public static /* synthetic */ g1 a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (g1) ipChange.ipc$dispatch("3c85d7ee", new Object[0]) : f3420a;
        }
    }

    public /* synthetic */ g1(a aVar) {
        this();
    }

    public static /* synthetic */ void a(g1 g1Var, RPBizConfig rPBizConfig, Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb29cf68", new Object[]{g1Var, rPBizConfig, activity, str});
        } else {
            g1Var.a(rPBizConfig, activity, str);
        }
    }

    public static /* synthetic */ void b(g1 g1Var, Context context, RPBizConfig rPBizConfig, RPBusinessHeadParams rPBusinessHeadParams, RPEventListener rPEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd53d169", new Object[]{g1Var, context, rPBizConfig, rPBusinessHeadParams, rPEventListener});
        } else {
            g1Var.a(context, rPBizConfig, rPBusinessHeadParams, rPEventListener);
        }
    }

    public static /* synthetic */ b4 c(g1 g1Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b4) ipChange.ipc$dispatch("1011fcc4", new Object[]{g1Var}) : g1Var.d;
    }

    public static /* synthetic */ l2 d(g1 g1Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l2) ipChange.ipc$dispatch("ee0587ef", new Object[]{g1Var}) : g1Var.h;
    }

    public static /* synthetic */ t1 e(g1 g1Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (t1) ipChange.ipc$dispatch("cbf90bb7", new Object[]{g1Var}) : g1Var.i;
    }

    public static /* synthetic */ Context f(g1 g1Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("decd62a5", new Object[]{g1Var}) : g1Var.b;
    }

    public static /* synthetic */ r1 g(g1 g1Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r1) ipChange.ipc$dispatch("87dfcff3", new Object[]{g1Var}) : g1Var.j;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            RPTrack.c();
        }
    }

    @Override // com.alibaba.security.realidentity.u4
    public RPEventListener h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RPEventListener) ipChange.ipc$dispatch("6c891b35", new Object[]{this}) : this.j;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : g2.f3421a;
    }

    public g1() {
        this.b = null;
        this.c = RPVerify.onlineUrl;
        this.d = new b4(this);
        this.f3405a = new Handler(Looper.getMainLooper());
        this.e = new i2();
        this.g = JsApiManager.getInstance();
    }

    public static /* synthetic */ String a(g1 g1Var, RPResult rPResult, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e78e4fbf", new Object[]{g1Var, rPResult, str}) : g1Var.a(rPResult, str);
    }

    public static /* synthetic */ void b(g1 g1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e53fa9", new Object[]{g1Var});
        } else {
            g1Var.i();
        }
    }

    private String e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("666b162a", new Object[]{this, str}) : this.d.d(str);
    }

    public static g1 f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g1) ipChange.ipc$dispatch("617fe189", new Object[0]) : j.a();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.g.registerJSApi(new Class[]{CancelUploadApi.class, CheckEnvironmentApi.class, FinishApi.class, GetDeviceInfoApi.class, LivenessApi.class, NativeVerifyApi.class, UploadApi.class, NativeCtidVerifyApi.class, OptionApi.class, SetTitleApi.class, TakePhotoApi.class, GetSensorInfoApi.class, TraceLinkApi.class, OldEasyTrackApi.class});
        }
    }

    public void c(Context context, RPBizConfig rPBizConfig, RPBusinessHeadParams rPBusinessHeadParams, RPEventListener rPEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77d9a8ea", new Object[]{this, context, rPBizConfig, rPBusinessHeadParams, rPEventListener});
            return;
        }
        ALBiometricsConfig biometricsConfig = rPBizConfig.getRpConfig().getBiometricsConfig();
        if (biometricsConfig != null && biometricsConfig.isNeedFailResultPage()) {
            RPConfig.Builder builder = new RPConfig.Builder();
            builder.setNeedFailResultPage(false);
            builder.setTransitionMode(biometricsConfig.getTransitionMode());
            builder.setNeedSound(biometricsConfig.isNeedSound());
            rPBizConfig.setRpConfig(builder.build());
        }
        if (StringUtils.isEmpty(rPBusinessHeadParams.fromSource)) {
            rPBizConfig.getBasicsConfig().verifyStartType = StatisticRecord.ET_THIRD;
            a(rPBizConfig, rPBizConfig.getBasicsConfig().verifyToken);
            a(context, rPBizConfig, new g(context, rPBizConfig, rPBusinessHeadParams, rPEventListener));
            return;
        }
        b(context, rPBizConfig, rPBusinessHeadParams, rPEventListener);
    }

    @Override // com.alibaba.security.realidentity.u4
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.c;
    }

    /* loaded from: classes3.dex */
    public class i extends r1 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RPEventListener f3414a;
        public final /* synthetic */ RPBizConfig b;

        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    i.this.f3414a.onStart();
                }
            }
        }

        /* loaded from: classes3.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    i.this.f3414a.onBiometricsStart();
                }
            }
        }

        /* loaded from: classes3.dex */
        public class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f3417a;

            public c(int i) {
                this.f3417a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                g1.e(g1.this).a(false);
                i.this.f3414a.onBiometricsFinish(this.f3417a);
                g1.b(g1.this);
            }
        }

        /* loaded from: classes3.dex */
        public class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RPResult f3418a;
            public final /* synthetic */ String b;
            public final /* synthetic */ String c;
            public final /* synthetic */ String d;

            public d(RPResult rPResult, String str, String str2, String str3) {
                this.f3418a = rPResult;
                this.b = str;
                this.c = str2;
                this.d = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    i.this.f3414a.onFinish(this.f3418a, new RPDetail(this.b, this.c, this.d, null));
                }
            }
        }

        /* loaded from: classes3.dex */
        public class e implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RPResult f3419a;
            public final /* synthetic */ RPDetail b;

            public e(RPResult rPResult, RPDetail rPDetail) {
                this.f3419a = rPResult;
                this.b = rPDetail;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                g1.e(g1.this).a(false);
                i.this.f3414a.onFinish(this.f3419a, this.b);
                g1.a(g1.this, (r1) null);
                o4.b().a(null);
            }
        }

        public i(RPEventListener rPEventListener, RPBizConfig rPBizConfig) {
            this.f3414a = rPEventListener;
            this.b = rPBizConfig;
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            if (str.hashCode() == 2133689546) {
                super.onStart();
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // com.alibaba.security.realidentity.r1
        public void a(RPResult rPResult, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b01ab15", new Object[]{this, rPResult, str, str2, str3});
                return;
            }
            String a2 = g1.a(g1.this, rPResult, str);
            g1.a(g1.this, rPResult, a2, str2, this.b, str);
            g1.a(g1.this).post(new d(rPResult, a2, str, str2));
        }

        @Override // com.alibaba.security.realidentity.r1
        public void b(RPResult rPResult, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae681a56", new Object[]{this, rPResult, str, str2, str3});
            } else {
                a(rPResult, new RPDetail(g1.a(g1.this, rPResult, str), str, str2, null), str3);
            }
        }

        @Override // com.alibaba.security.realidentity.RPEventListener
        public void onBiometricsFinish(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2bf3f44f", new Object[]{this, new Integer(i)});
            } else {
                g1.a(g1.this).post(new c(i));
            }
        }

        @Override // com.alibaba.security.realidentity.RPEventListener
        public void onBiometricsStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c8c970f", new Object[]{this});
            } else {
                g1.a(g1.this).post(new b());
            }
        }

        @Override // com.alibaba.security.realidentity.RPEventListener
        public void onFinish(RPResult rPResult, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84fe467c", new Object[]{this, rPResult, str, str2});
                return;
            }
            RPDetail rPDetail = new RPDetail(g1.a(g1.this, rPResult, str), str, str2, null);
            g1.a(g1.this, rPDetail);
            a(rPResult, rPDetail, this.b.getBasicsConfig().verifyToken);
        }

        @Override // com.alibaba.security.realidentity.RPEventListener
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
                return;
            }
            super.onStart();
            g1.a(g1.this).post(new a());
        }

        private void a(RPResult rPResult, RPDetail rPDetail, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebf8169c", new Object[]{this, rPResult, rPDetail, str});
                return;
            }
            g1.a(g1.this, rPResult, rPDetail.getCode(), rPDetail.getMsg(), this.b, rPDetail.getSubCode());
            g1.c(g1.this).f(str);
            g1.d(g1.this).c();
            RPTrack.b();
            com.alibaba.security.realidentity.h.a();
            g1.a(g1.this).post(new e(rPResult, rPDetail));
        }

        @Override // com.alibaba.security.realidentity.RPEventListener
        public void onFinish(RPResult rPResult, RPDetail rPDetail) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2f654c3", new Object[]{this, rPResult, rPDetail});
                return;
            }
            rPDetail.setCode(g1.a(g1.this, rPResult, rPDetail.getSubCode()));
            g1.a(g1.this, rPDetail);
            a(rPResult, rPDetail, this.b.getBasicsConfig().verifyToken);
        }
    }

    public static /* synthetic */ void a(g1 g1Var, Context context, RPBizConfig rPBizConfig, RPBusinessHeadParams rPBusinessHeadParams, RPEventListener rPEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6b0a6e8", new Object[]{g1Var, context, rPBizConfig, rPBusinessHeadParams, rPEventListener});
        } else {
            g1Var.b(context, rPBizConfig, rPBusinessHeadParams, rPEventListener);
        }
    }

    private String d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str}) : this.d.e(str);
    }

    private String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd890709", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        try {
            HashMap hashMap = new HashMap();
            String[] split = str.substring(str.indexOf("?") + 1).split("&");
            if (split != null && split.length > 0) {
                for (String str2 : split) {
                    String[] split2 = str2.split("=");
                    if (split2.length == 2) {
                        hashMap.put(split2[0], split2[1]);
                    }
                }
            }
            return (String) hashMap.get("token");
        } catch (Exception e2) {
            com.alibaba.security.realidentity.a.a(k, e2);
            return "";
        }
    }

    public boolean b(Context context, RPEnv rPEnv, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b5f4bab0", new Object[]{this, context, rPEnv, str, str2})).booleanValue() : a(context, rPEnv, str, str2);
    }

    public static /* synthetic */ void a(g1 g1Var, String str, boolean z, int i2, String str2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b709e9b9", new Object[]{g1Var, str, new Boolean(z), new Integer(i2), str2, new Long(j2)});
        } else {
            g1Var.a(str, z, i2, str2, j2);
        }
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        l2 l2Var = new l2();
        this.h = l2Var;
        l2Var.a(new a(context));
    }

    public static /* synthetic */ Handler a(g1 g1Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a2824de", new Object[]{g1Var}) : g1Var.f3405a;
    }

    public static /* synthetic */ void a(g1 g1Var, RPResult rPResult, String str, String str2, RPBizConfig rPBizConfig, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32fa56b9", new Object[]{g1Var, rPResult, str, str2, rPBizConfig, str3});
        } else {
            g1Var.a(rPResult, str, str2, rPBizConfig, str3);
        }
    }

    public static /* synthetic */ void a(g1 g1Var, RPDetail rPDetail) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac0b4043", new Object[]{g1Var, rPDetail});
        } else {
            g1Var.a(rPDetail);
        }
    }

    public void b(Context context, String str, RPConfig rPConfig, RPEventListener rPEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e1e763", new Object[]{this, context, str, rPConfig, rPEventListener});
            return;
        }
        String f2 = f(str);
        RPBizConfig a2 = a("url", f2, rPConfig);
        r1 a3 = a(a2, rPEventListener);
        this.j = a3;
        if (!this.i.a(a2, false, a3)) {
            return;
        }
        com.alibaba.security.realidentity.a.a(k, "startVerifyWithUrl token is: " + f2);
        a(context, a2, new c(context, a2, a(str, "fromSource", "rpsdk"), f2));
    }

    public static /* synthetic */ void a(g1 g1Var, Context context, RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("964973c4", new Object[]{g1Var, context, rPBizConfig});
        } else {
            g1Var.a(context, rPBizConfig);
        }
    }

    public static /* synthetic */ void a(g1 g1Var, Context context, String str, RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d412b50e", new Object[]{g1Var, context, str, rPBizConfig});
        } else {
            g1Var.a(context, str, rPBizConfig);
        }
    }

    public static /* synthetic */ void a(g1 g1Var, Context context, String str, String str2, RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47adf7d8", new Object[]{g1Var, context, str, str2, rPBizConfig});
        } else {
            g1Var.a(context, str, str2, rPBizConfig);
        }
    }

    public static /* synthetic */ void a(g1 g1Var, Context context, RPBizConfig rPBizConfig, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32e577bf", new Object[]{g1Var, context, rPBizConfig, new Integer(i2)});
        } else {
            g1Var.a(context, rPBizConfig, i2);
        }
    }

    public static /* synthetic */ r1 a(g1 g1Var, r1 r1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r1) ipChange.ipc$dispatch("c13d808e", new Object[]{g1Var, r1Var});
        }
        g1Var.j = r1Var;
        return r1Var;
    }

    public static /* synthetic */ void a(g1 g1Var, Context context, RPBizConfig rPBizConfig, RPEventListener rPEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("604f9552", new Object[]{g1Var, context, rPBizConfig, rPEventListener});
        } else {
            g1Var.a(context, rPBizConfig, rPEventListener);
        }
    }

    public void a(b4 b4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a25eb880", new Object[]{this, b4Var});
        } else {
            this.d = b4Var;
        }
    }

    private boolean a(Context context, RPEnv rPEnv, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75c9d3ef", new Object[]{this, context, rPEnv, str, str2})).booleanValue();
        }
        this.b = context.getApplicationContext();
        g();
        MTopManager.setMtopInstanceId(str2);
        this.d.b(this.b);
        this.d.a(rPEnv);
        this.f = new d4(this.b);
        RPTrack.a(this.b, this);
        MTopManager.setTrackLog(this);
        this.g.setTrackLog(this);
        this.e.a(this);
        this.g.setVerifyBizCapacity(this);
        this.c = str;
        b(context);
        this.i = new t1(this.b, this.d);
        return true;
    }

    public void b(Context context, RPBizConfig rPBizConfig, q1 q1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e97aaa6d", new Object[]{this, context, rPBizConfig, q1Var});
        } else {
            a(context, rPBizConfig, q1Var);
        }
    }

    private void b(Context context, RPBizConfig rPBizConfig, RPBusinessHeadParams rPBusinessHeadParams, RPEventListener rPEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef6305a9", new Object[]{this, context, rPBizConfig, rPBusinessHeadParams, rPEventListener});
        } else if (this.i.a(rPBizConfig) && m2.a().c()) {
            long currentTimeMillis = System.currentTimeMillis();
            a(rPBizConfig);
            this.i.a(rPBizConfig, new h(currentTimeMillis, rPBizConfig, context, rPBusinessHeadParams, rPEventListener));
        } else {
            a(context, rPBizConfig);
            a(context, rPBizConfig, rPBusinessHeadParams, rPEventListener);
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        ClientInfo clientInfo = new ClientInfo(this.b);
        clientInfo.setVersionTag("");
        jSONObject.put("deviceInfo", (Object) com.alibaba.security.realidentity.b.a(clientInfo));
        jSONObject.put("wua", (Object) e(""));
        jSONObject.put("miniWua", (Object) c(""));
        return JSON.toJSONString(jSONObject);
    }

    public void b(String str, TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97f752a0", new Object[]{this, str, trackLog});
            return;
        }
        trackLog.setVerifyToken(str);
        trackLog.addTag9(g2.f3421a + "/" + g2.b);
        trackLog.addTag10("Android");
        RPTrack.a(trackLog);
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : this.d.c(str);
    }

    private boolean b(RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a871a91", new Object[]{this, rPBizConfig})).booleanValue() : rPBizConfig.getRpConfig().isUseWindvane() && com.alibaba.security.realidentity.d.b();
    }

    public Context b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[]{this}) : this.b;
    }

    private void a(Context context, RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c542844", new Object[]{this, context, rPBizConfig});
        } else {
            new u2(rPBizConfig.getDegradeConfig().isWukongEnabled).a(context);
        }
    }

    private String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str}) : this.d.b(str);
    }

    public void a(Context context, String str, String str2, RPConfig rPConfig, RPEventListener rPEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb94098", new Object[]{this, context, str, str2, rPConfig, rPEventListener});
            return;
        }
        RPBizConfig a2 = a(str2, str, rPConfig);
        r1 a3 = a(a2, rPEventListener);
        this.j = a3;
        if (!this.i.a(a2, false, a3)) {
            return;
        }
        com.alibaba.security.realidentity.a.a(k, "startVerify token is: " + str);
        a(context, a2, new b(context, a2, str));
    }

    public void a(Context context, String str, RPConfig rPConfig, RPEventListener rPEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2b8d22", new Object[]{this, context, str, rPConfig, rPEventListener});
            return;
        }
        RPBizConfig a2 = a("native", str, rPConfig);
        r1 a3 = a(a2, rPEventListener);
        this.j = a3;
        if (!this.i.a(a2, false, a3)) {
            return;
        }
        com.alibaba.security.realidentity.a.a(k, "startVerifyByNative token is: " + str);
        this.j.onStart();
        a(context, a2, 0, new d(a2, context));
    }

    public void a(Activity activity, String str, RPConfig rPConfig, RPEventListener rPEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d7f2308", new Object[]{this, activity, str, rPConfig, rPEventListener});
            return;
        }
        RPBizConfig a2 = a("ctid", str, rPConfig);
        r1 a3 = a(a2, rPEventListener);
        this.j = a3;
        if (!this.i.a(a2, true, a3)) {
            return;
        }
        com.alibaba.security.realidentity.a.a(k, "startVerifyByCtid token is: " + str);
        this.j.onStart();
        a(activity, a2, 3, new e(a2, activity, str));
    }

    private void a(RPBizConfig rPBizConfig, Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58cf8ae8", new Object[]{this, rPBizConfig, activity, str});
        } else if (rPBizConfig.getCtidConfigResponse() != null && activity != null) {
            this.e.a(activity, rPBizConfig.getCtidConfigResponse(), str, new f(activity, rPBizConfig));
        } else {
            this.i.a(false);
            this.j.onFinish(RPResult.AUDIT_FAIL, new RPDetail(a(RPResult.AUDIT_FAIL, String.valueOf((int) e2.y)), String.valueOf((int) e2.y), "CTID auth failed", null));
        }
    }

    private void a(RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56f7964c", new Object[]{this, rPBizConfig});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("modelInfo", com.alibaba.security.realidentity.b.a(rPBizConfig.getBasicsConfig().modelInfo));
        b(rPBizConfig.getBasicsConfig().verifyToken, TrackLog.createRemoteModelBeginLog("h5", com.alibaba.security.realidentity.b.b(hashMap)));
    }

    private void a(String str, boolean z, int i2, String str2, long j2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3115e39", new Object[]{this, str, new Boolean(z), new Integer(i2), str2, new Long(j2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i2));
        hashMap.put("errorMessage", str2);
        hashMap.put("costTime", Long.valueOf(j2));
        if (!z) {
            i3 = -1;
        }
        b(str, TrackLog.createRemoteModelEndLog("h5", i3, com.alibaba.security.realidentity.b.b(hashMap)));
    }

    private RPBizConfig a(String str, String str2, RPConfig rPConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RPBizConfig) ipChange.ipc$dispatch("f156e6b4", new Object[]{this, str, str2, rPConfig});
        }
        RPBizConfig create = RPBizConfig.create();
        create.getBasicsConfig().verifyStartType = str;
        create.getBasicsConfig().verifyToken = str2;
        create.getBasicsConfig().startBeginTime = System.currentTimeMillis();
        create.setRpConfig(rPConfig);
        a(create, str2);
        return create;
    }

    private void a(RPBizConfig rPBizConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd84516", new Object[]{this, rPBizConfig, str});
            return;
        }
        rPBizConfig.setDynamicWebUrl(this.c);
        rPBizConfig.getBasicsConfig().umidToken = d(str);
        rPBizConfig.getBasicsConfig().sgAppKey = b(str);
        rPBizConfig.setCtidConfig(null);
        this.f.a(rPBizConfig);
        this.g.setRPBizConfig(rPBizConfig);
    }

    private void a(Context context, RPBizConfig rPBizConfig, RPBusinessHeadParams rPBusinessHeadParams, RPEventListener rPEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ec6268", new Object[]{this, context, rPBizConfig, rPBusinessHeadParams, rPEventListener});
        } else {
            new f1(context, rPBizConfig, this, rPEventListener, true).a(rPBusinessHeadParams);
        }
    }

    private void a(Context context, String str, RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89498e", new Object[]{this, context, str, rPBizConfig});
            return;
        }
        String dynamicWebUrl = rPBizConfig.getDynamicWebUrl();
        this.c = dynamicWebUrl;
        a(context, a(a(dynamicWebUrl, "token", str), "fromSource", "rpsdk"), str, rPBizConfig);
    }

    private String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str4 = "?";
        if (str.lastIndexOf(str4) >= 0) {
            str4 = "&";
        }
        sb.append(str4);
        sb.append(str2);
        sb.append("=");
        sb.append(str3);
        return sb.toString();
    }

    private void a(Context context, RPBizConfig rPBizConfig, RPEventListener rPEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2add90d2", new Object[]{this, context, rPBizConfig, rPEventListener});
        } else {
            new f1(context, rPBizConfig, this, rPEventListener, false).a(new BusinessHeadParams());
        }
    }

    private void a(Context context, String str, String str2, RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15586c58", new Object[]{this, context, str, str2, rPBizConfig});
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("url", str);
        intent.putExtra("token", str2);
        intent.putExtra(f2.d, b(rPBizConfig));
        intent.setFlags(268435456);
        intent.setClass(context, RPWebViewActivity.class);
        context.startActivity(intent);
    }

    public r1 a(RPBizConfig rPBizConfig, RPEventListener rPEventListener) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r1) ipChange.ipc$dispatch("5c77cd17", new Object[]{this, rPBizConfig, rPEventListener}) : new i(rPEventListener, rPBizConfig);
    }

    private void a(RPDetail rPDetail) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f89bc3", new Object[]{this, rPDetail});
        } else if (rPDetail == null || !"1".equals(rPDetail.getCode())) {
        } else {
            rPDetail.setSubCode("1");
        }
    }

    private String a(RPResult rPResult, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3427443f", new Object[]{this, rPResult, str});
        }
        try {
            return rPResult == RPResult.AUDIT_PASS ? "1" : e2.a(Integer.decode(str).intValue());
        } catch (Exception unused) {
            return String.valueOf(-10000);
        }
    }

    private void a(RPResult rPResult, String str, String str2, RPBizConfig rPBizConfig, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fd6b239", new Object[]{this, rPResult, str, str2, rPBizConfig, str3});
            return;
        }
        b(rPBizConfig.getBasicsConfig().verifyToken, TrackLog.createStartEndLog(rPBizConfig.getBasicsConfig().verifyStartType, str2, rPBizConfig.getBasicsConfig().startBeginTime, String.valueOf(rPResult.code), str, str3));
        i();
    }

    public Pair<Boolean, String> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("c2e055fc", new Object[]{this, str}) : this.i.a(str);
    }

    @Override // com.alibaba.security.realidentity.c4
    public void a(String str, TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2970415f", new Object[]{this, str, trackLog});
        } else {
            b(str, trackLog);
        }
    }

    private void a(Context context, RPBizConfig rPBizConfig, q1 q1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f648b2ce", new Object[]{this, context, rPBizConfig, q1Var});
        } else {
            new p1(context, this).a(rPBizConfig, q1Var);
        }
    }

    @Override // com.alibaba.security.realidentity.f4
    public void a(List<TrackLog> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.f.a(list);
        }
    }

    public String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("cpuArch", m.b());
            jSONObject.put("supportNeon", m.k() ? "Yes" : "No");
            jSONObject.put("mobileModel", Build.MODEL);
            jSONObject.put("manufacturer", Build.MANUFACTURER);
            jSONObject.put("osName", "Android");
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("rpSdkName", f2.f3401a);
            jSONObject.put("rpSdkVersion", g2.f3421a);
            jSONObject.put(BaseJsExecutor.NAME_LIVENESSSDK_NAME, f2.e);
            jSONObject.put(BaseJsExecutor.NAME_LIVENESSSDK_VERSION, g2.b);
            jSONObject.put("faceSdkName", f2.e);
            jSONObject.put("faceSdkVersion", g2.b);
            jSONObject.put(u2.q, "Android");
            if (context != null) {
                jSONObject.put("appName", com.alibaba.security.realidentity.j.b(context));
                jSONObject.put("appVersion", com.alibaba.security.realidentity.j.a(context));
                jSONObject.put("appPackName", com.alibaba.security.realidentity.j.c(context));
                jSONObject.put("availableMemory", m.a(context));
                jSONObject.put("totalMemory", m.b(context));
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    private void a(Context context, RPBizConfig rPBizConfig, int i2, q1 q1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6e8c989", new Object[]{this, context, rPBizConfig, new Integer(i2), q1Var});
        } else if (this.i.c()) {
            a(context, rPBizConfig, i2);
        } else {
            b(context, rPBizConfig, q1Var);
        }
    }

    private void a(Context context, RPBizConfig rPBizConfig, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e31533f", new Object[]{this, context, rPBizConfig, new Integer(i2)});
            return;
        }
        Intent intent = new Intent(context, RpLoadingActivity.class);
        intent.putExtra(RpLoadingActivity.j, rPBizConfig);
        intent.putExtra(RpLoadingActivity.i, i2);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public void a(Activity activity, int i2, RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c7932d", new Object[]{this, activity, new Integer(i2), rPBizConfig});
        } else if (i2 == 0) {
            a(this.b, rPBizConfig);
            a(this.b, rPBizConfig, this.j);
        } else if (i2 != 3) {
        } else {
            a(rPBizConfig, activity, rPBizConfig.getBasicsConfig().verifyToken);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        r1 r1Var = this.j;
        if (r1Var == null) {
            return;
        }
        RPResult rPResult = RPResult.AUDIT_NOT;
        r1Var.onFinish(rPResult, new RPDetail(String.valueOf(rPResult.code), String.valueOf((int) e2.A), "dynamic request error", null));
    }
}
