package com.taobao.trtc.rtcroom;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import anet.channel.util.ErrorConstant;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.zoloz.hardware.camera.preview.utils.SPManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.FailedBinderCallBack;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.login4android.api.Login;
import com.taobao.trtc.api.TrtcAudioDevice;
import com.taobao.trtc.api.TrtcConstants;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.call.ITrtcCallEngine;
import com.taobao.trtc.call.TrtcCallImpl;
import com.taobao.trtc.impl.PermissionActivity;
import com.taobao.trtc.rtcroom.TrtcWvPlugin;
import com.taobao.trtc.utils.TrtcForegroundService;
import com.taobao.trtc.utils.TrtcLog;
import com.uc.webview.base.cyclone.BSError;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.ohf;
import tb.qvc;

/* loaded from: classes9.dex */
public class h implements ITrtcCallEngine.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static final String f23172a;
    private static h b;
    private b c;
    private Application.ActivityLifecycleCallbacks d;
    private int e;
    private ITrtcCallEngine f;
    private e g;
    private f h;
    private Intent i;
    private TrtcWvPlugin m;
    private a o;
    private g p;
    private String s;
    private String t;
    private String u;
    private boolean j = false;
    private boolean k = false;
    private int l = -1;
    private final AtomicBoolean n = new AtomicBoolean(false);
    private final Object q = new Object();
    private int r = 0;
    private boolean v = false;
    private boolean w = false;

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a */
        public long f23179a;
        public TrtcCallImpl.CallStatus b;
        public String c;
        public String d;
        public boolean e;
        public boolean f;
        public int g;
        public boolean h;

        static {
            kge.a(-125889200);
        }
    }

    /* loaded from: classes9.dex */
    public static class b {

        /* renamed from: a */
        public ITrtcCallEngine.d f23180a;
        public JSONObject d;
        public int g;
        public int h;
        public boolean b = false;
        public boolean c = false;
        public int e = 1;
        public int f = 10;

        static {
            kge.a(-21426121);
        }
    }

    public static /* synthetic */ void lambda$vRbRZrfWYtBdpyXwZPVGlmivZ9I(h hVar, boolean z, Intent intent) {
        hVar.a(z, intent);
    }

    public static /* synthetic */ int a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("353cb2a6", new Object[]{hVar})).intValue() : hVar.e;
    }

    public static /* synthetic */ g a(h hVar, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("2f49c095", new Object[]{hVar, gVar});
        }
        hVar.p = gVar;
        return gVar;
    }

    public static /* synthetic */ a a(h hVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("97a14cd9", new Object[]{hVar, aVar});
        }
        hVar.o = aVar;
        return aVar;
    }

    public static /* synthetic */ void a(h hVar, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f13daae", new Object[]{hVar, str, new Integer(i), new Boolean(z)});
        } else {
            hVar.b(str, i, z);
        }
    }

    public static /* synthetic */ void b(h hVar, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cec750d", new Object[]{hVar, str, new Integer(i), new Boolean(z)});
        } else {
            hVar.a(str, i, z);
        }
    }

    public static /* synthetic */ boolean b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bd6cf296", new Object[]{hVar})).booleanValue() : hVar.v;
    }

    public static /* synthetic */ int c(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("459d3264", new Object[]{hVar})).intValue();
        }
        int i = hVar.e;
        hVar.e = i + 1;
        return i;
    }

    public static /* synthetic */ int d(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cdcd7243", new Object[]{hVar})).intValue();
        }
        int i = hVar.e;
        hVar.e = i - 1;
        return i;
    }

    public static /* synthetic */ e e(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("26cd35dd", new Object[]{hVar}) : hVar.g;
    }

    public static /* synthetic */ a f(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("ae5c10bc", new Object[]{hVar}) : hVar.o;
    }

    public static /* synthetic */ f g(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("40a7643a", new Object[]{hVar}) : hVar.h;
    }

    public static /* synthetic */ Object h(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("9eb8f6e6", new Object[]{hVar}) : hVar.q;
    }

    public static /* synthetic */ ITrtcCallEngine i(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITrtcCallEngine) ipChange.ipc$dispatch("32a5fea6", new Object[]{hVar}) : hVar.f;
    }

    public static /* synthetic */ g j(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("e76ea9b6", new Object[]{hVar}) : hVar.p;
    }

    public static /* synthetic */ String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[0]) : f23172a;
    }

    static {
        kge.a(-152693840);
        kge.a(1746251810);
        f23172a = h.class.getName();
        b = null;
    }

    public static synchronized h b() {
        synchronized (h.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("6dcf374", new Object[0]);
            }
            if (b == null) {
                d();
            }
            return b;
        }
    }

    public static synchronized boolean c() {
        synchronized (h.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
            }
            return b == null;
        }
    }

    public static synchronized h d() {
        synchronized (h.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("30ae83f6", new Object[0]);
            }
            if (b != null) {
                e();
            }
            TrtcLog.d(f23172a, "new instance");
            h hVar = new h();
            b = hVar;
            return hVar;
        }
    }

    public static synchronized void e() {
        synchronized (h.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
                return;
            }
            if (b != null) {
                b.i();
            }
            TrtcLog.d(f23172a, ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX);
            b = null;
        }
    }

    public Object f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5dd0ace5", new Object[]{this}) : this.q;
    }

    public Activity g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("2c7ab1fa", new Object[]{this});
        }
        TrtcWvPlugin trtcWvPlugin = this.m;
        if (trtcWvPlugin == null) {
            return null;
        }
        return trtcWvPlugin.getActivity();
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : (this.m.getActivity().getApplicationInfo().flags & 2) != 0;
    }

    public synchronized TrtcWvPlugin.a a(TrtcWvPlugin trtcWvPlugin, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcWvPlugin.a) ipChange.ipc$dispatch("c1c8cacd", new Object[]{this, trtcWvPlugin, jSONObject});
        }
        TrtcWvPlugin.a aVar = new TrtcWvPlugin.a();
        this.m = trtcWvPlugin;
        if (this.n.get()) {
            TrtcLog.d(f23172a, "already initialized");
            return aVar.a(200);
        }
        r();
        if (!h(jSONObject)) {
            TrtcLog.a(f23172a, "initialize error, invalid params");
            return aVar.a(-103);
        } else if (this.c.c && !Login.checkSessionValid()) {
            TrtcLog.a(f23172a, "check login invalid");
            return aVar.a(-102, "login invalid");
        } else if (!com.taobao.trtc.api.e.a()) {
            TrtcLog.a(f23172a, "trtc engine is not available!!!");
            return aVar.a(-126, "artc not available");
        } else {
            this.f = ITrtcCallEngine.CC.a(trtcWvPlugin.getContext(), this.c.f23180a);
            this.g = new e(trtcWvPlugin.getActivity(), this, this.c.d);
            ohf.a b2 = ohf.b();
            if (b2 == null) {
                TrtcLog.a(f23172a, "create ScreenInteractionAdapter, cursorHelper is null");
            } else {
                this.h = new f(this, this.c.e, this.c.g, this.c.h, b2);
            }
            TrtcLog.d(f23172a, "initialize success!");
            this.n.set(true);
            return aVar.a(200);
        }
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        this.e = 1;
        this.d = new Application.ActivityLifecycleCallbacks() { // from class: com.taobao.trtc.rtcroom.h.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                h.this = this;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                    return;
                }
                String q = h.q();
                TrtcLog.d(q, "onActivityCreated: " + activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5e01616c", new Object[]{this, activity});
                    return;
                }
                String q = h.q();
                TrtcLog.d(q, "onActivityStarted: " + activity);
                if (h.a(h.this) == 0) {
                    TrtcLog.d(h.q(), "+++++++ foreground");
                    if (!h.b(h.this)) {
                        h.this.d(TrtcForegroundService.ACTION_STOP);
                    }
                    h.a(h.this, "foreground", 14, false);
                }
                h.c(h.this);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                    return;
                }
                String q = h.q();
                TrtcLog.d(q, "onActivityResumed: " + activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a4658a75", new Object[]{this, activity});
                    return;
                }
                String q = h.q();
                TrtcLog.d(q, "onActivityPaused: " + activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                    return;
                }
                String q = h.q();
                TrtcLog.d(q, "onActivityStopped : " + activity);
                h.d(h.this);
                if (h.a(h.this) != 0) {
                    return;
                }
                TrtcLog.d(h.q(), "+++++++ background");
                if (!h.b(h.this)) {
                    h.this.d(TrtcForegroundService.ACTION_START);
                }
                h.a(h.this, "background", 13, true);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                    return;
                }
                String q = h.q();
                TrtcLog.d(q, "onActivitySaveInstanceState: " + activity + " ,outState: " + bundle);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4148cc84", new Object[]{this, activity});
                    return;
                }
                String q = h.q();
                TrtcLog.d(q, "onActivityDestroyed: " + activity + " ,getActivity: " + h.this.g());
                if (h.this.g() != activity || h.b(h.this)) {
                    return;
                }
                h.this.d(TrtcForegroundService.ACTION_STOP);
            }
        };
        this.m.getActivity().getApplication().registerActivityLifecycleCallbacks(this.d);
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        try {
            if (!qvc.a("foreground_service_enable", true)) {
                return;
            }
            if (TrtcForegroundService.ACTION_START != str) {
                if (TrtcForegroundService.ACTION_STOP != str) {
                    return;
                }
                if (!this.w) {
                    TrtcLog.d(f23172a, "ForegroundService is not runing");
                    return;
                }
                TrtcLog.d(f23172a, "stopForegroundService");
                this.m.getContext().stopService(new Intent(this.m.getContext(), TrtcForegroundService.class));
                this.w = false;
                return;
            }
            this.w = true;
            if (this.v) {
                return;
            }
            String str2 = f23172a;
            TrtcLog.d(str2, "processForegroundService, status: " + str);
            Intent intent = new Intent(this.m.getContext(), TrtcForegroundService.class);
            intent.putExtra(TrtcForegroundService.NOTIFICATION_CONTENT_TITLE, this.t);
            intent.putExtra(TrtcForegroundService.NOTIFICATION_CONTENT_TEXT, this.u);
            intent.setAction(str);
            if (Build.VERSION.SDK_INT >= 26) {
                this.m.getContext().startForegroundService(intent);
            } else {
                this.m.getContext().startService(intent);
            }
        } catch (Exception e) {
            String str3 = f23172a;
            TrtcLog.a(str3, "processForegroundService, ForegroundService Exception: " + e);
        }
    }

    public synchronized void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (!this.n.get()) {
            TrtcLog.d(f23172a, "already deInitialize");
        } else {
            this.n.set(false);
            this.v = false;
            d(TrtcForegroundService.ACTION_STOP);
            if (this.d != null) {
                this.m.getActivity().getApplication().unregisterActivityLifecycleCallbacks(this.d);
                this.d = null;
            }
            if (this.g != null) {
                this.g.c();
                this.g = null;
            }
            if (this.h != null) {
                this.h.a();
                this.h = null;
                this.i = null;
            }
            if (this.f != null) {
                this.f.a();
                this.f = null;
            }
            PermissionActivity.a();
            a("deInitialize", BSError.BSDIFF_NEW_FILE_SIZE_MISMATC);
            TrtcLog.d(f23172a, "deInitialize success!");
        }
    }

    public synchronized boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        return this.n.get();
    }

    public synchronized void a(TrtcWvPlugin trtcWvPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584c4796", new Object[]{this, trtcWvPlugin});
            return;
        }
        String str = f23172a;
        TrtcLog.d(str, "UpdatePlugin " + this.m + " -> " + trtcWvPlugin);
        this.m = trtcWvPlugin;
    }

    public b k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3003383f", new Object[]{this}) : this.c;
    }

    public TrtcWvPlugin.a a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcWvPlugin.a) ipChange.ipc$dispatch("43286d9f", new Object[]{this, jSONObject});
        }
        TrtcWvPlugin.a aVar = new TrtcWvPlugin.a();
        synchronized (this.q) {
            if (this.o != null) {
                aVar.a(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA, "call busy");
                return aVar;
            }
            ITrtcCallEngine.c i = i(jSONObject);
            if (this.f != null && this.f.a(i)) {
                aVar.a(200);
                this.o = new a();
                this.o.b = TrtcCallImpl.CallStatus.E_CALL_STATUS_CALLING;
                this.o.d = i.b;
                this.o.c = i.f23067a;
                this.o.e = i.d;
                this.o.f = i.e;
                this.o.g = i.f;
                this.p = new g(this.m.getContext());
                this.p.a();
                if (this.g != null) {
                    this.g.a(this.o.b);
                }
            } else {
                aVar.a(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA);
            }
            return aVar;
        }
    }

    public TrtcWvPlugin.a b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcWvPlugin.a) ipChange.ipc$dispatch("43f6ec20", new Object[]{this, jSONObject});
        }
        TrtcWvPlugin.a aVar = new TrtcWvPlugin.a();
        a("hangup", 0);
        return aVar;
    }

    public TrtcWvPlugin.a a(JSONObject jSONObject, int i) {
        ITrtcCallEngine iTrtcCallEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcWvPlugin.a) ipChange.ipc$dispatch("4570a54c", new Object[]{this, jSONObject, new Integer(i)});
        }
        TrtcWvPlugin.a aVar = new TrtcWvPlugin.a();
        if (this.o == null) {
            aVar.a(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA, "no active call");
            return aVar;
        }
        String string = jSONObject.getString("remoteId");
        String string2 = jSONObject.getString("data");
        String str = f23172a;
        TrtcLog.d(str, "SEND DATA: " + string2);
        if (!StringUtils.isEmpty(string) && !StringUtils.isEmpty(string2) && (iTrtcCallEngine = this.f) != null) {
            iTrtcCallEngine.c(string2, i);
        } else {
            aVar.a(-103);
        }
        return aVar;
    }

    public TrtcWvPlugin.a c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcWvPlugin.a) ipChange.ipc$dispatch("44c56aa1", new Object[]{this, jSONObject});
        }
        TrtcWvPlugin.a aVar = new TrtcWvPlugin.a(200, "");
        if (this.o == null) {
            aVar.a(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA, "no active call");
            return aVar;
        }
        Boolean bool = jSONObject.getBoolean("muteMic");
        Boolean bool2 = jSONObject.getBoolean("mutePlayout");
        synchronized (this.q) {
            if (this.f != null && this.o != null) {
                if (bool != null && this.f.a(bool.booleanValue())) {
                    this.o.e = bool.booleanValue();
                }
                if (bool2 != null && this.f.a(bool2.booleanValue(), this.o.c)) {
                    this.o.f = bool2.booleanValue();
                }
            }
        }
        return aVar;
    }

    public TrtcWvPlugin.a d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (TrtcWvPlugin.a) ipChange.ipc$dispatch("4593e922", new Object[]{this, jSONObject});
        }
        TrtcWvPlugin.a aVar = new TrtcWvPlugin.a();
        if (this.o == null) {
            aVar.a(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA, "no active call");
            return aVar;
        }
        int intValue = jSONObject.getIntValue("playoutMode");
        if (intValue != 1 && intValue != 2) {
            aVar.a(-103);
        } else {
            synchronized (this.q) {
                if (this.f != null) {
                    ITrtcCallEngine iTrtcCallEngine = this.f;
                    if (intValue == 2) {
                        z = true;
                    }
                    if (iTrtcCallEngine.c(z) && this.o != null) {
                        this.o.g = intValue;
                    }
                }
            }
        }
        return aVar;
    }

    public TrtcWvPlugin.a e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcWvPlugin.a) ipChange.ipc$dispatch("466267a3", new Object[]{this, jSONObject});
        }
        TrtcWvPlugin.a aVar = new TrtcWvPlugin.a();
        int a2 = com.taobao.trtc.utils.a.a(jSONObject, "cmd", -1);
        if (a2 == 0) {
            b("API");
        } else if (a2 == 1) {
            a("API");
        } else {
            aVar.a(-103);
        }
        return aVar;
    }

    public a l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("addaf421", new Object[]{this}) : this.o;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue() : this.r;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        e eVar = this.g;
        return eVar != null && eVar.d();
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        f fVar = this.h;
        return fVar != null && fVar.c();
    }

    private boolean h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aba943e5", new Object[]{this, jSONObject})).booleanValue();
        }
        this.c = new b();
        ITrtcCallEngine.d dVar = new ITrtcCallEngine.d();
        dVar.b = com.taobao.trtc.utils.a.a(jSONObject, FluidException.SERVICE_NAME);
        dVar.f23068a = com.taobao.trtc.utils.a.a(jSONObject, "appKey", "21646297");
        dVar.c = this;
        if (StringUtils.isEmpty(dVar.b) || StringUtils.isEmpty(dVar.f23068a)) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("extraParams");
        if (jSONObject2 != null) {
            dVar.d = com.taobao.trtc.utils.a.a(jSONObject2, "userId");
            this.u = com.taobao.trtc.utils.a.a(jSONObject2, "foregroundServiceNotificationText", "语音通话中");
            this.t = com.taobao.trtc.utils.a.a(jSONObject2, "foregroundServiceNotificationTitle", "淘宝客服");
            this.c.c = com.taobao.trtc.utils.a.a(jSONObject2, "checkLogin", false);
            this.c.b = com.taobao.trtc.utils.a.a(jSONObject2, com.taobao.desktop.channel.calendar.a.CALENDAR_EVENT_PERMISSION_CHECK, true);
            if (com.taobao.trtc.utils.a.a(jSONObject2, "audioLevelEvent", true)) {
                dVar.e = qvc.a("local_audio_interval_ms", 300);
            }
            this.c.d = jSONObject2.getJSONObject("floatWindowConfig");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("screenInteractionConfig");
            this.c.e = com.taobao.trtc.utils.a.a(jSONObject3, "definition", 1);
            this.c.f = com.taobao.trtc.utils.a.a(jSONObject3, SPManager.FPS_KEY, 10);
            String a2 = com.taobao.trtc.utils.a.a(jSONObject3, "mainColor", "#0058FF");
            String a3 = com.taobao.trtc.utils.a.a(jSONObject3, "secColor", "#85C2FF");
            try {
                this.c.g = Color.parseColor(a2);
                this.c.h = Color.parseColor(a3);
            } catch (Throwable unused) {
            }
        }
        if (StringUtils.isEmpty(dVar.d)) {
            dVar.d = Login.getUserId();
        }
        this.c.f23180a = dVar;
        return true;
    }

    private ITrtcCallEngine.c i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcCallEngine.c) ipChange.ipc$dispatch("d751e92", new Object[]{this, jSONObject});
        }
        ITrtcCallEngine.c cVar = new ITrtcCallEngine.c();
        JSONObject jSONObject2 = jSONObject.getJSONObject("callParams");
        if (jSONObject2 != null) {
            cVar.f23067a = com.taobao.trtc.utils.a.a(jSONObject2, "remoteId");
            cVar.b = com.taobao.trtc.utils.a.a(jSONObject2, FailedBinderCallBack.CALLER_ID);
            this.s = cVar.b;
            cVar.c = com.taobao.trtc.utils.a.a(jSONObject2, "callMode", 0);
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("extraParams");
        if (jSONObject3 != null) {
            cVar.d = com.taobao.trtc.utils.a.a(jSONObject3, "muteMic", false);
            cVar.e = com.taobao.trtc.utils.a.a(jSONObject3, "mutePlayout", false);
            cVar.f = com.taobao.trtc.utils.a.a(jSONObject3, "playoutMode", 1);
            cVar.g = com.taobao.trtc.utils.a.a(jSONObject3, "timeout", 20000);
            cVar.h = com.taobao.trtc.utils.a.a(jSONObject3, "custom");
        }
        return cVar;
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine.b
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        switch (i) {
            case -104:
                a("makecall error", BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA);
                a(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA, "unkown");
                return;
            case -103:
                a("timeout", -119);
                a(-119, "timeout");
                return;
            case -102:
                a("join error", BSError.BSDIFF_OLD_FILE_DEC_FAILED);
                a(BSError.BSDIFF_OLD_FILE_DEC_FAILED, "join room error, code: " + i);
                return;
            case -101:
                a(false);
                return;
            default:
                return;
        }
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        TrtcLog.d(f23172a, "onReady");
        a(true);
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine.b
    public void a(ITrtcCallEngine.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c9f7a6", new Object[]{this, aVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        this.s = aVar.b;
        jSONObject.put("remoteId", (Object) aVar.f23066a);
        jSONObject.put(FailedBinderCallBack.CALLER_ID, (Object) aVar.b);
        jSONObject.put("callMode", (Object) Integer.valueOf(aVar.c));
        jSONObject.put("answer", (Object) Boolean.valueOf(aVar.d));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("custom", (Object) aVar.e);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("callParams", (Object) jSONObject);
        jSONObject3.put("extraParams", (Object) jSONObject2);
        synchronized (this.q) {
            if (aVar.d) {
                if (this.o != null) {
                    this.o.f23179a = SystemClock.elapsedRealtime();
                    this.o.b = TrtcCallImpl.CallStatus.E_CALL_STATUS_TALKING;
                    this.f.a(this.o.e);
                    this.f.a(this.o.f, this.o.c);
                    this.m.getActivity().runOnUiThread(new Runnable() { // from class: com.taobao.trtc.rtcroom.h.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            h.this = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (h.e(h.this) == null) {
                            } else {
                                h.e(h.this).a(h.f(h.this).b);
                            }
                        }
                    });
                }
            } else {
                a("remote reject", BSError.BSDIFF_NEW_FILE_MD5_MISMATCH);
            }
        }
        a("onAnswer", jSONObject3);
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine.b
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("remoteId", (Object) str);
        a("onParticipantEnter", jSONObject);
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine.b
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        a("remote leave", BSError.BSDIFF_NEW_FILE_INVALID_SIZE);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("remoteId", (Object) str);
        a("onParticipantLeave", jSONObject);
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine.b
    public void a(TrtcDefines.TrtcAudioRouteDevice trtcAudioRouteDevice) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81febde4", new Object[]{this, trtcAudioRouteDevice});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("playoutMode", (Object) Integer.valueOf(trtcAudioRouteDevice.ordinal()));
        a("onPlayoutMode", jSONObject);
        com.taobao.trtc.utils.h.d(this.c.f23180a.b + "^^^OnArtcBridgeEvent^^^onPlayoutMode^^^" + trtcAudioRouteDevice.ordinal(), this.s);
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine.b
    public void a(TrtcDefines.TrtcAudioFocusState trtcAudioFocusState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5cf9cb4", new Object[]{this, trtcAudioFocusState});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TrtcConstants.TRTC_PARAMS_AUDIO_FOCUS, (Object) Integer.valueOf(trtcAudioFocusState.ordinal()));
        a("onAudioFocus", jSONObject);
        com.taobao.trtc.utils.h.d(this.c.f23180a.b + "^^^OnAudioFocusChanged^^^state^^^" + trtcAudioFocusState.ordinal(), this.s);
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine.b
    public void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("remoteId", (Object) str);
        synchronized (this.q) {
            if (this.o != null) {
                this.o.h = true;
                jSONObject.put(FailedBinderCallBack.CALLER_ID, (Object) this.o.d);
            }
        }
        if (z) {
            a("onFirstAudioFrame", jSONObject);
        } else {
            a("onFirstVideoFrame", jSONObject);
        }
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine.b
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("networkType", (Object) Integer.valueOf(i));
        a("onNetworkType", jSONObject);
        this.r = i;
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine.b
    public void a(TrtcDefines.TrtcNetWorkQuality trtcNetWorkQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17a39c", new Object[]{this, trtcNetWorkQuality});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("quality", (Object) Integer.valueOf(trtcNetWorkQuality.ordinal()));
        a("onNetworkQuality", jSONObject);
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine.b
    public void a(TrtcDefines.TrtcMediaConnectionState trtcMediaConnectionState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8803561e", new Object[]{this, trtcMediaConnectionState});
        } else if (trtcMediaConnectionState != TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_DISCONNECTED) {
        } else {
            a(ErrorConstant.ERROR_GET_PROCESS_NULL, "network discconect");
            a("network discconect", ErrorConstant.ERROR_GET_PROCESS_NULL);
        }
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine.b
    public void a(TrtcAudioDevice.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98a0560", new Object[]{this, bVar});
        } else if (this.o == null || bVar.h < 0 || this.o.b != TrtcCallImpl.CallStatus.E_CALL_STATUS_TALKING) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isLocal", (Object) true);
            jSONObject.put("remoteId", (Object) this.o.c);
            jSONObject.put("db", (Object) Integer.valueOf(this.o.e ? 0 : bVar.h));
            a("onAudioDb", jSONObject, false);
        }
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine.b
    public void a(String str, TrtcDefines.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5f07306", new Object[]{this, str, fVar});
            return;
        }
        final String str2 = new String(fVar.f23038a);
        if (h()) {
            String str3 = f23172a;
            TrtcLog.d(str3, "OnRecvData | type: " + fVar.b + ", " + str2);
        }
        if (this.o == null) {
            return;
        }
        if (fVar.b == 1 || fVar.b == -1) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("remoteId", (Object) str);
            jSONObject.put(FailedBinderCallBack.CALLER_ID, (Object) this.o.d);
            jSONObject.put("data", (Object) str2);
            a("onRecvData", jSONObject);
        } else if (fVar.b == 500) {
            if (this.g == null || fVar.f23038a.length <= 0) {
                return;
            }
            try {
                if (StringUtils.isEmpty(str2)) {
                    return;
                }
                this.m.getActivity().runOnUiThread(new Runnable() { // from class: com.taobao.trtc.rtcroom.h.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        h.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            h.e(h.this).a(JSON.parseObject(str2));
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        } else if (fVar.b == 501) {
            try {
                if (StringUtils.isEmpty(str2) || this.h == null) {
                    return;
                }
                this.m.getActivity().runOnUiThread(new Runnable() { // from class: com.taobao.trtc.rtcroom.h.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        h.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            h.g(h.this).a(JSON.parseObject(str2));
                        }
                    }
                });
            } catch (Throwable unused2) {
            }
        } else if (fVar.b == 502) {
            this.m.getActivity().runOnUiThread(new Runnable() { // from class: com.taobao.trtc.rtcroom.h.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    h.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        h.b(h.this, "ServerCommand", !StringUtils.isEmpty(str2) ? com.taobao.trtc.utils.a.a(JSON.parseObject(str2), "cause", -1) : 0, false);
                    }
                }
            });
        } else {
            String str4 = f23172a;
            TrtcLog.a(str4, "onRecvData | unkown type: " + fVar.b);
        }
    }

    @Override // com.taobao.trtc.call.ITrtcCallEngine.b
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (this.o == null || i != 113) {
        } else {
            a(-1101, "system phone active");
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        synchronized (this.q) {
            String str2 = f23172a;
            com.taobao.trtc.utils.h.a(str2, "startFloatWindow, action: " + str);
            if (this.g != null && PermissionActivity.a(this.m.getContext())) {
                try {
                    this.g.a();
                    if (this.h != null && this.h.c()) {
                        this.h.b();
                    }
                } catch (Throwable unused) {
                }
            } else {
                TrtcLog.a(f23172a, "start failed for permission");
            }
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        synchronized (this.q) {
            if (this.g != null && this.g.d()) {
                String str2 = f23172a;
                com.taobao.trtc.utils.h.a(str2, "stopFloatWindow, action: " + str);
                try {
                    this.g.b();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public TrtcWvPlugin.a f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcWvPlugin.a) ipChange.ipc$dispatch("4730e624", new Object[]{this, jSONObject});
        }
        TrtcWvPlugin.a aVar = new TrtcWvPlugin.a();
        synchronized (this.q) {
            if (this.c != null && jSONObject.containsKey("floatWindowConfig")) {
                this.c.d = jSONObject.getJSONObject("floatWindowConfig");
                if (this.g != null) {
                    this.g.b(this.c.d);
                }
                TrtcLog.d(f23172a, "updateFloatConfig success");
            } else {
                aVar.a(-103);
            }
        }
        return aVar;
    }

    public TrtcWvPlugin.a g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcWvPlugin.a) ipChange.ipc$dispatch("47ff64a5", new Object[]{this, jSONObject});
        }
        TrtcWvPlugin.a aVar = new TrtcWvPlugin.a();
        int a2 = com.taobao.trtc.utils.a.a(jSONObject, "cmd", -1);
        synchronized (this.q) {
            try {
                if (a2 == 0) {
                    a("API", 12, true);
                } else if (a2 == 1) {
                    s();
                } else {
                    aVar.a(-103);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    private synchronized void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        d(TrtcForegroundService.ACTION_START);
        this.v = true;
        TrtcLog.d(f23172a, "startScreenInteraction | action: API");
        if (this.o != null && this.f != null && this.h != null) {
            if (this.i != null) {
                b(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA, "already started");
                return;
            }
            PermissionActivity.b(new PermissionActivity.a() { // from class: com.taobao.trtc.rtcroom.-$$Lambda$h$vRbRZrfWYtBdpyXwZPVGlmivZ9I
                @Override // com.taobao.trtc.impl.PermissionActivity.a
                public final void onPermissionResult(boolean z, Intent intent) {
                    h.lambda$vRbRZrfWYtBdpyXwZPVGlmivZ9I(h.this, z, intent);
                }
            });
            TrtcLog.d(f23172a, "start permission activity");
            Intent intent = new Intent(this.m.getActivity(), PermissionActivity.class);
            intent.addFlags(268435456);
            intent.putExtra(PermissionActivity.PERMISSION_TYPE_MEDIA_PEOJECTION, true);
            this.m.getActivity().startActivity(intent);
            this.j = true;
            return;
        }
        b(-127, "interaction not avaiable");
    }

    public /* synthetic */ void a(boolean z, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b74d729", new Object[]{this, new Boolean(z), intent});
            return;
        }
        this.j = false;
        String str = f23172a;
        TrtcLog.d(str, "screen permission: " + z);
        if (this.k) {
            this.k = false;
            b(this.l, "server canceled");
        } else if (!z || intent == null) {
            b(BSError.BSDIFF_NEW_FILE_CLOSE_FAILED, "permission invalid");
        } else {
            this.i = intent;
            ITrtcCallEngine.e eVar = new ITrtcCallEngine.e();
            if (this.c.e == 2) {
                eVar.f23069a = 1080;
                eVar.b = 1920;
            } else {
                eVar.f23069a = 720;
                eVar.b = 1280;
            }
            eVar.c = this.c.f;
            eVar.d = this.i;
            if (this.f.a(eVar)) {
                b(200, "success");
                this.h.a(1, 10, "success");
                return;
            }
            b(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA, "start screen capture error");
        }
    }

    private synchronized void a(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a352a7e3", new Object[]{this, str, new Integer(i), new Boolean(z)});
            return;
        }
        this.v = false;
        d(TrtcForegroundService.ACTION_STOP);
        String str2 = f23172a;
        TrtcLog.d(str2, "stopScreenInteraction | action: " + str + ", code: " + i);
        if (this.j && str.equalsIgnoreCase("ServerCommand")) {
            TrtcLog.d(f23172a, "stop a starting screen interaction");
            this.k = true;
            this.l = i;
        } else if (this.i == null) {
            TrtcLog.d(f23172a, "ScreenInteraction not started");
            if (z) {
                b(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA, "not started");
            }
        } else {
            this.i = null;
            if (this.o != null && this.f != null) {
                this.f.b();
            }
            if (z) {
                b(200, "success");
            }
            if (this.h != null) {
                this.h.a(0, i, str);
            }
        }
    }

    private synchronized void b(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        int i2 = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2782f4e4", new Object[]{this, str, new Integer(i), new Boolean(z)});
            return;
        }
        if (z) {
            String str2 = f23172a;
            com.taobao.trtc.utils.h.a(str2, "pauseScreenInteraction | action: " + str + ", code: " + i);
        } else {
            String str3 = f23172a;
            com.taobao.trtc.utils.h.a(str3, "resumeScreenInteraction | action: " + str + ", code: " + i);
        }
        if (this.i != null && this.h != null && this.o != null) {
            this.f.d(z);
            f fVar = this.h;
            if (!z) {
                i2 = 1;
            }
            fVar.a(i2, i, str);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", (Object) str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", (Object) "WIN_CLIENT_STATUS");
        jSONObject2.put("params", (Object) jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("remoteId", (Object) this.o.c);
        jSONObject3.put("data", (Object) jSONObject2.toJSONString());
        a(jSONObject3, 500);
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue();
        }
        synchronized (this.q) {
            if (this.o == null || this.o.b != TrtcCallImpl.CallStatus.E_CALL_STATUS_TALKING || this.o.f23179a > SystemClock.elapsedRealtime()) {
                return 0;
            }
            return (int) (SystemClock.elapsedRealtime() - this.o.f23179a);
        }
    }

    private synchronized void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        if (this.m != null) {
            this.m.notifyError2Js(i, str);
            c(i, str);
        }
    }

    private void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else {
            a(str, jSONObject, true);
        }
    }

    private synchronized void a(String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60829596", new Object[]{this, str, jSONObject, new Boolean(z)});
            return;
        }
        if (this.m != null) {
            this.m.notify2Js(str, jSONObject, z);
        }
    }

    private void b(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf2bb84", new Object[]{this, new Integer(i), str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", (Object) Integer.valueOf(i));
        jSONObject.put("msg", (Object) str);
        this.m.notify2Js("onScreenInteractionResult", jSONObject);
    }

    public void a(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d025a92", new Object[]{this, new Integer(i), new Integer(i2), str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", (Object) Integer.valueOf(i));
        jSONObject.put("code", (Object) Integer.valueOf(i2));
        jSONObject.put("msg", (Object) str);
        this.m.notify2Js("onScreenInteractionStatus", jSONObject);
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (z) {
            jSONObject.put("code", (Object) 200);
            jSONObject.put("msg", "initialize success");
        } else {
            jSONObject.put("code", (Object) Integer.valueOf((int) BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA));
            jSONObject.put("msg", "initialize fail");
        }
        a("onInitializeResult", jSONObject);
    }

    private void a(final String str, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else {
            this.m.getActivity().runOnUiThread(new Runnable() { // from class: com.taobao.trtc.rtcroom.h.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    h.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    synchronized (h.h(h.this)) {
                        if (h.e(h.this) != null) {
                            h.e(h.this).a(TrtcCallImpl.CallStatus.E_CALL_STATUS_IDLE);
                            h.this.b("releaseSession");
                        }
                        if (h.g(h.this) != null) {
                            h.b(h.this, "releaseSession", 11, false);
                        }
                        if (h.i(h.this) != null) {
                            h.i(h.this).b(str, i);
                        }
                        h.a(h.this, (a) null);
                        if (h.j(h.this) != null) {
                            h.j(h.this).b();
                            h.a(h.this, (g) null);
                        }
                        String q = h.q();
                        TrtcLog.d(q, "release session for: " + str + ", code: " + i);
                    }
                }
            });
        }
    }

    public void c(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18f44a63", new Object[]{this, new Integer(i), str});
            return;
        }
        String str2 = f23172a;
        TrtcLog.a(str2, "errorCode: " + i + " ,errorMsg: " + str);
        b bVar = this.c;
        if (bVar == null || bVar.f23180a == null) {
            return;
        }
        com.taobao.trtc.utils.h.d(this.c.f23180a.b + "^^^OnArtcBridgeError^^^" + i + "^^^" + str, this.s);
    }
}
