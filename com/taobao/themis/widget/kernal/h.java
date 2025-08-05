package com.taobao.themis.widget.kernal;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.uc.webview.export.media.MessageID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.suc;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/taobao/themis/widget/kernal/WidgetLifeCycle;", "Lcom/taobao/themis/kernel/extension/instance/IAppLifeCycleExtension;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Lcom/taobao/themis/kernel/TMSInstance;)V", "getInstance", "()Lcom/taobao/themis/kernel/TMSInstance;", "mCrashInfoData", "Lcom/alibaba/fastjson/JSONObject;", "mIndex", "", "mStartTime", "", "buildCrashInfo", "onPause", "", "onRegister", "onResume", "onStart", MessageID.onStop, "reportCrashInfo", "Companion", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class h implements suc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final ConcurrentHashMap<String, Object> e;
    private static int f;

    /* renamed from: a  reason: collision with root package name */
    private long f22945a;
    private JSONObject b;
    private int c;
    private final com.taobao.themis.kernel.f d;

    @Override // tb.suc
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    @Override // tb.suc
    public void dJ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8600c0", new Object[]{this});
        }
    }

    public h(com.taobao.themis.kernel.f instance) {
        q.d(instance, "instance");
        this.d = instance;
        this.f22945a = -1L;
        this.b = new JSONObject();
    }

    @Override // tb.sud
    public void bQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfab7697", new Object[]{this});
        } else {
            suc.a.b(this);
        }
    }

    @Override // tb.sud
    public void a(com.taobao.themis.kernel.f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb8a2d", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        suc.a.a(this, instance);
        this.f22945a = System.currentTimeMillis();
        int i = f;
        f = i + 1;
        this.c = i;
        this.b = e();
        e.put(String.valueOf(this.c), this.b);
        f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/taobao/themis/widget/kernal/WidgetLifeCycle$Companion;", "", "()V", "KEY", "", "globalIndex", "", "widgetCrashInfos", "Ljava/util/concurrent/ConcurrentHashMap;", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-297373995);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(-177332275);
        kge.a(-1125199877);
        Companion = new a(null);
        e = new ConcurrentHashMap<>();
    }

    @Override // tb.suc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f22945a = System.currentTimeMillis();
        e.put(String.valueOf(this.c), this.b);
        f();
    }

    @Override // tb.suc
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.themis.widget.d.INSTANCE.a(this.d, this.f22945a);
        e.remove(String.valueOf(this.c));
        f();
    }

    private final JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "appId", this.d.h());
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((JSONObject) "sceneId", com.taobao.themis.kernel.utils.o.c(this.d));
        jSONObject4.put((JSONObject) "sellerId", com.taobao.themis.kernel.utils.o.h(this.d));
        t tVar = t.INSTANCE;
        jSONObject2.put((JSONObject) "widgetSceneParams", (String) jSONObject3);
        return jSONObject;
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            TCrashSDK instance = TCrashSDK.instance();
            q.b(instance, "TCrashSDK.instance()");
            instance.getCrashCaughtHeader().addHeaderInfo("widgetCommonDatas", new JSONObject(e).toJSONString());
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(i.a(th));
        }
    }
}
