package com.taobao.themis.canvas.extension.page;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import com.taobao.android.themis.graphics.JNIBridge;
import com.taobao.android.themis.graphics.audio.AudioContextFactory;
import com.taobao.android.themis.graphics.c;
import com.taobao.themis.canvas.canvas.CanvasJSAPIBridge;
import com.taobao.themis.inside.adapter.TLogAdapterImpl;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.adapter.IAudioContextFactory;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.adapter.a;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.extension.page.s;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.k;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.open.extension.b;
import com.taobao.weex.common.Constants;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.Regex;
import tb.kge;
import tb.qpt;
import tb.qpv;
import tb.qqc;
import tb.tky;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 ,2\u00020\u0001:\u0001,B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0016J \u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000eH\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0006H\u0014J\b\u0010&\u001a\u00020\u0019H$J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u0006H\u0016J\b\u0010(\u001a\u00020\u0019H$J\b\u0010)\u001a\u00020\u0019H\u0002J\b\u0010*\u001a\u00020\u000eH\u0002J\b\u0010+\u001a\u00020\u000eH\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006-"}, d2 = {"Lcom/taobao/themis/canvas/extension/page/BaseGameJSRuntimeExtension;", "Lcom/taobao/themis/open/extension/IGameJSRuntimeExtension;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "mCanvasId", "", "getMCanvasId", "()Ljava/lang/String;", "setMCanvasId", "(Ljava/lang/String;)V", "mCanvasJSAPIBridge", "Lcom/taobao/themis/canvas/canvas/CanvasJSAPIBridge;", "mIsAttach", "", "mRiverBackend", "Lcom/taobao/android/themis/graphics/DefaultWRiverBackend;", "getMRiverBackend", "()Lcom/taobao/android/themis/graphics/DefaultWRiverBackend;", "setMRiverBackend", "(Lcom/taobao/android/themis/graphics/DefaultWRiverBackend;)V", "getPage", "()Lcom/taobao/themis/kernel/page/ITMSPage;", Constants.Event.SLOT_LIFECYCLE.ATTACH, "destroy", "", "dispatchTouchEvent", "event", "Landroid/view/MotionEvent;", "executeJSFramework", "executeMainPackage", "fireGlobalEventInMainContext", "params", "Lcom/alibaba/fastjson/JSONObject;", "keepAlive", "generateBackendConfiguration", "Lcom/taobao/android/themis/graphics/DefaultWRiverBackend$ConfigurationBuilder;", "canvasId", "initApiFramework", "initBackend", "initJSFramework", "injectGMConfig", "injectHotPatchApiFrameWorkExt", "injectHotPatchJSFramework", "Companion", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public abstract class a implements com.taobao.themis.open.extension.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion;

    /* renamed from: a  reason: collision with root package name */
    private final CanvasJSAPIBridge f22330a;
    private com.taobao.android.themis.graphics.c b;
    private String c;
    private boolean d;
    private final ITMSPage e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "configs", "", "", "kotlin.jvm.PlatformType", "", "onConfigUpdate", "com/taobao/themis/canvas/extension/page/BaseGameJSRuntimeExtension$initBackend$1$1$1"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.canvas.extension.page.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0925a implements IConfigAdapter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.themis.graphics.c f22331a;
        public final /* synthetic */ WeakReference b;

        public C0925a(com.taobao.android.themis.graphics.c cVar, WeakReference weakReference) {
            this.f22331a = cVar;
            this.b = weakReference;
        }

        @Override // com.taobao.themis.kernel.adapter.IConfigAdapter.a
        public final void a(Map<String, String> map) {
            com.taobao.android.themis.graphics.c cVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            } else if (map == null || (cVar = (com.taobao.android.themis.graphics.c) this.b.get()) == null) {
            } else {
                cVar.a(map);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/taobao/android/themis/graphics/audio/IAudioContext;", "kotlin.jvm.PlatformType", "s", "", "create"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements AudioContextFactory.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.android.themis.graphics.audio.AudioContextFactory.a
        public final com.taobao.android.themis.graphics.audio.a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.themis.graphics.audio.a) ipChange.ipc$dispatch("6f1116f9", new Object[]{this, str});
            }
            if (qpt.b(IAudioContextFactory.class) == null) {
                return null;
            }
            Object b = qpt.b(IAudioContextFactory.class);
            q.a(b);
            com.taobao.themis.kernel.adapter.a createAudioContext = ((IAudioContextFactory) b).createAudioContext(str, a.this.j());
            if (createAudioContext == null) {
                return null;
            }
            final tky tkyVar = new tky(createAudioContext);
            createAudioContext.a(new a.InterfaceC0940a() { // from class: com.taobao.themis.canvas.extension.page.a.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.themis.kernel.adapter.a.InterfaceC0940a
                public void a(String event, JSONObject jsonObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6635bcfe", new Object[]{this, event, jsonObject});
                        return;
                    }
                    q.d(event, "event");
                    q.d(jsonObject, "jsonObject");
                    com.taobao.android.themis.graphics.audio.a.this.a(event, jsonObject);
                }
            });
            return tkyVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010$\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032*\u0010\u0006\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b\u0018\u00010\n0\u00072*\u0010\u000b\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b\u0018\u00010\n0\u00072F\u0010\f\u001aB\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00030\u0003 \t* \u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u000e0\rH\n¢\u0006\u0002\b\u000f"}, d2 = {"<anonymous>", "", "quantile", "", "min", "max", "latency", "", "", "kotlin.jvm.PlatformType", "", "frequency", "apiLatencyMapping", "", "", "notifyAPIStatsReceived"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class g implements JNIBridge.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22339a;
        public final /* synthetic */ String b;

        public g(String str, String str2) {
            this.f22339a = str;
            this.b = str2;
        }

        @Override // com.taobao.android.themis.graphics.JNIBridge.g
        public final void a(double d, double d2, double d3, List<String> latency, List<String> frequency, Map<String, Double> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4b1a18d", new Object[]{this, new Double(d), new Double(d2), new Double(d3), latency, frequency, map});
            } else if (!TextUtils.isEmpty(this.f22339a) && !TextUtils.isEmpty(this.b)) {
                String appId = this.f22339a;
                q.b(appId, "appId");
                String str = this.b;
                q.b(latency, "latency");
                q.b(frequency, "frequency");
                qpv.a(appId, TLogAdapterImpl.TLOG_MODULE, str, d, d2, d3, latency, frequency);
                for (Map.Entry<String, Double> entry : map.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey())) {
                        String appId2 = this.f22339a;
                        q.b(appId2, "appId");
                        String str2 = this.b;
                        String key = entry.getKey();
                        q.b(key, "entry.key");
                        Double value = entry.getValue();
                        q.b(value, "entry.value");
                        qpv.a(appId2, TLogAdapterImpl.TLOG_MODULE, str2, key, value.doubleValue());
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "contextId", "", "kotlin.jvm.PlatformType", "message", "onJSError"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class h implements JNIBridge.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // com.taobao.android.themis.graphics.JNIBridge.c
        public final void a(String str, String message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, message});
                return;
            }
            com.taobao.themis.kernel.f b = a.this.j().b();
            q.b(message, "message");
            qpv.a(b, message);
        }
    }

    static {
        kge.a(733498178);
        kge.a(647180300);
        Companion = new b(null);
    }

    public abstract void e();

    public abstract void f();

    public a(ITMSPage page) {
        q.d(page, "page");
        this.e = page;
        this.f22330a = new CanvasJSAPIBridge(this.e);
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            b.a.b(this);
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c_(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4ed18e", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        b.a.a(this, page);
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            b.a.a(this);
        }
    }

    public final ITMSPage j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("10988370", new Object[]{this}) : this.e;
    }

    public final com.taobao.android.themis.graphics.c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.themis.graphics.c) ipChange.ipc$dispatch("dcd89868", new Object[]{this}) : this.b;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
    }

    public c.b b(String canvasId) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (c.b) ipChange.ipc$dispatch("636b94bf", new Object[]{this, canvasId});
        }
        q.d(canvasId, "canvasId");
        String h2 = this.e.b().h();
        String d2 = k.d(this.e.b());
        WeakReference weakReference = new WeakReference(this.f22330a);
        Activity o = this.e.b().o();
        q.b(o, "page.getInstance().activity");
        c.b a2 = new c.b(o.getApplication(), canvasId).a(new c()).a(new d(weakReference)).a(new e(d2, h2)).a(new f(h2, d2)).a(new g(h2, d2)).a(new h());
        Activity o2 = this.e.b().o();
        q.b(o2, "page.getInstance().activity");
        Resources resources = o2.getResources();
        q.b(resources, "page.getInstance().activity.resources");
        c.b a3 = a2.a(resources.getDisplayMetrics().density);
        if (!com.taobao.themis.canvas.canvas.d.a() || !com.taobao.themis.canvas.canvas.d.a(this.e.b())) {
            z = false;
        }
        c.b b2 = a3.a(z).b(n.aP());
        q.b(b2, "DefaultWRiverBackend.Con…ls.enableOptGMAsyncAPI())");
        return b2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"com/taobao/themis/canvas/extension/page/BaseGameJSRuntimeExtension$generateBackendConfiguration$2", "Lcom/taobao/android/themis/graphics/JNIBridge$OnAPIDispatchListener;", "onDispatchAriverAPI", "", "params", "Lcom/alibaba/fastjson/JSONObject;", "handler", "Lcom/taobao/android/themis/graphics/JNIBridge$JSCallbackHandler;", "onDispatchAriverAPI2", "", "onDispatchAriverAPI3", "Ljava/nio/ByteBuffer;", "onDispatchAriverAPISync", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements JNIBridge.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeakReference f22334a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
        /* renamed from: com.taobao.themis.canvas.extension.page.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public static final class RunnableC0926a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ String b;
            public final /* synthetic */ JNIBridge.a c;

            public RunnableC0926a(String str, JNIBridge.a aVar) {
                this.b = str;
                this.c = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                CanvasJSAPIBridge canvasJSAPIBridge = (CanvasJSAPIBridge) d.this.f22334a.get();
                if (canvasJSAPIBridge == null) {
                    return;
                }
                canvasJSAPIBridge.callAriverAPI(JSON.parseObject(this.b), this.c);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
        /* loaded from: classes9.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ ByteBuffer b;
            public final /* synthetic */ JNIBridge.a c;

            public b(ByteBuffer byteBuffer, JNIBridge.a aVar) {
                this.b = byteBuffer;
                this.c = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                CanvasJSAPIBridge canvasJSAPIBridge = (CanvasJSAPIBridge) d.this.f22334a.get();
                if (canvasJSAPIBridge == null) {
                    return;
                }
                canvasJSAPIBridge.callAriverAPI(com.taobao.android.themis.graphics.e.a().a(this.b), this.c);
            }
        }

        public d(WeakReference weakReference) {
            this.f22334a = weakReference;
        }

        @Override // com.taobao.android.themis.graphics.JNIBridge.b
        public void a(JSONObject params, JNIBridge.a handler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a47ffc7a", new Object[]{this, params, handler});
                return;
            }
            q.d(params, "params");
            q.d(handler, "handler");
            if (n.bW()) {
                CanvasJSAPIBridge canvasJSAPIBridge = (CanvasJSAPIBridge) this.f22334a.get();
                if (canvasJSAPIBridge == null) {
                    return;
                }
                canvasJSAPIBridge.callAriverAPI(params, handler);
                return;
            }
            CanvasJSAPIBridge canvasJSAPIBridge2 = (CanvasJSAPIBridge) this.f22334a.get();
            if (canvasJSAPIBridge2 == null) {
                return;
            }
            canvasJSAPIBridge2.callAriverAPI(JSON.parseObject(params.toString()), handler);
        }

        @Override // com.taobao.android.themis.graphics.JNIBridge.b
        public void a(String params, JNIBridge.a handler) {
            Executor executor;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d3f9124", new Object[]{this, params, handler});
                return;
            }
            q.d(params, "params");
            q.d(handler, "handler");
            IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
            if (iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) == null) {
                return;
            }
            executor.execute(new RunnableC0926a(params, handler));
        }

        @Override // com.taobao.android.themis.graphics.JNIBridge.b
        public void a(ByteBuffer params, JNIBridge.a handler) {
            Executor executor;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e8d24db", new Object[]{this, params, handler});
                return;
            }
            q.d(params, "params");
            q.d(handler, "handler");
            IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
            if (iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) == null) {
                return;
            }
            executor.execute(new b(params, handler));
        }

        @Override // com.taobao.android.themis.graphics.JNIBridge.b
        public JSONObject a(JSONObject params) {
            JSONObject callAriverAPISync;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, params});
            }
            q.d(params, "params");
            try {
                CanvasJSAPIBridge canvasJSAPIBridge = (CanvasJSAPIBridge) this.f22334a.get();
                return (canvasJSAPIBridge == null || (callAriverAPISync = canvasJSAPIBridge.callAriverAPISync(params)) == null) ? new JSONObject() : callAriverAPISync;
            } catch (JSONException e) {
                TMSLogger.b("TMSBaseGameJSRuntimeExtension", "onDispatchAriverAPISync", e);
                return new JSONObject();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J(\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u0010"}, d2 = {"com/taobao/themis/canvas/extension/page/BaseGameJSRuntimeExtension$generateBackendConfiguration$3", "Lcom/taobao/android/themis/graphics/JNIBridge$OnJSMemoryListener;", "notifyJSMemoryUsageWhenExit", "", "heapSize", "", "maxHeapSize", "memoryOccupy", "maxMemoryOccupy", "notifyJSOutOfMemoryException", "currentSize", "targetSize", "limit", com.taobao.android.weex_framework.util.a.ATOM_stack, "", "notifyLargeJSMemoryAllocated", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class e implements JNIBridge.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public e(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // com.taobao.android.themis.graphics.JNIBridge.d
        public void a(String stack) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, stack});
                return;
            }
            q.d(stack, "stack");
            String h = a.this.j().b().h();
            if (h != null && h.length() != 0) {
                z = false;
            }
            if (z || TextUtils.isEmpty(this.b)) {
                return;
            }
            String appId = this.c;
            q.b(appId, "appId");
            qpv.a(appId, this.b, stack);
        }

        @Override // com.taobao.android.themis.graphics.JNIBridge.d
        public void a(int i, int i2, int i3, String stack) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a316ea45", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), stack});
                return;
            }
            q.d(stack, "stack");
            if (TextUtils.isEmpty(this.c) || TextUtils.isEmpty(this.b)) {
                return;
            }
            String appId = this.c;
            q.b(appId, "appId");
            qpv.a(appId, this.b, i, i2, i3, stack);
        }

        @Override // com.taobao.android.themis.graphics.JNIBridge.d
        public void a(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else if (TextUtils.isEmpty(this.c) || TextUtils.isEmpty(this.b)) {
            } else {
                String appId = this.c;
                q.b(appId, "appId");
                qpv.a(appId, this.b, i, i2, i3, i4);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/taobao/themis/canvas/extension/page/BaseGameJSRuntimeExtension$generateBackendConfiguration$4", "Lcom/taobao/android/themis/graphics/JNIBridge$OnJSNotResponseListener;", "notifyJSJankCountWhenExit", "", "count", "", RateNode.TAG, "", "notifyJSThreadNotResponse", "backtrace", "", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class f implements JNIBridge.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22338a;
        public final /* synthetic */ String b;

        public f(String str, String str2) {
            this.f22338a = str;
            this.b = str2;
        }

        @Override // com.taobao.android.themis.graphics.JNIBridge.f
        public void a(String backtrace) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, backtrace});
                return;
            }
            q.d(backtrace, "backtrace");
            if (TextUtils.isEmpty(this.f22338a) || TextUtils.isEmpty(this.b)) {
                return;
            }
            String appId = this.f22338a;
            q.b(appId, "appId");
            qpv.b(appId, this.b, backtrace);
        }

        @Override // com.taobao.android.themis.graphics.JNIBridge.f
        public void a(int i, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c114003", new Object[]{this, new Integer(i), new Double(d)});
            } else if (TextUtils.isEmpty(this.f22338a) || TextUtils.isEmpty(this.b)) {
            } else {
                String appId = this.f22338a;
                q.b(appId, "appId");
                qpv.a(appId, this.b, i, d);
            }
        }
    }

    @Override // com.taobao.themis.open.extension.b
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        k();
        if (!l()) {
            e();
        }
        if (m()) {
            return;
        }
        f();
    }

    @Override // com.taobao.themis.open.extension.b
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        com.taobao.android.themis.graphics.c cVar = this.b;
        if (cVar == null) {
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        HashMap<String, String> hashMap2 = hashMap;
        hashMap2.put("url", this.e.e());
        hashMap2.put("platform", "android");
        hashMap2.put("preview", "true");
        hashMap2.put("env", "online");
        hashMap2.put("instanceId", this.c);
        hashMap2.put("container", com.taobao.themis.utils.f.a(this.e.b().o()) ? "debug" : "release");
        cVar.a(hashMap);
    }

    @Override // com.taobao.themis.open.extension.b
    public void c(String canvasId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, canvasId});
            return;
        }
        q.d(canvasId, "canvasId");
        this.c = canvasId;
        com.taobao.android.themis.graphics.c cVar = new com.taobao.android.themis.graphics.c(b(canvasId).a());
        WeakReference weakReference = new WeakReference(cVar);
        IConfigAdapter iConfigAdapter = (IConfigAdapter) qpt.b(IConfigAdapter.class);
        if (iConfigAdapter != null) {
            iConfigAdapter.registerListener(com.taobao.themis.kernel.i.ORANGE_GROUP_THEMIS_GRAPHICS_COMMON, new C0925a(cVar, weakReference));
            Map<String, String> configs = iConfigAdapter.getConfigs(com.taobao.themis.kernel.i.ORANGE_GROUP_THEMIS_GRAPHICS_COMMON);
            if (configs != null) {
                cVar.a(configs);
            }
        }
        this.d = cVar.a();
        if (!this.d) {
            TMSLogger.d("TMSBaseGameJSRuntimeExtension", "初始化失败");
            return;
        }
        String h2 = this.e.b().h();
        s sVar = (s) this.e.a(s.class);
        if (sVar != null) {
            sVar.a(new i(h2, this));
        }
        t tVar = t.INSTANCE;
        this.b = cVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/taobao/themis/canvas/extension/page/BaseGameJSRuntimeExtension$initBackend$1$2", "Lcom/taobao/themis/kernel/extension/page/IPageClosePageExtension$PageCloseInterceptor;", "getPriority", "", "onClose", "", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "type", "Lcom/taobao/themis/kernel/TMSBackPressedType;", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class i implements s.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22341a;
        public final /* synthetic */ a b;

        @Override // com.taobao.themis.kernel.extension.page.s.c
        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
            }
            return 8;
        }

        public i(String str, a aVar) {
            this.f22341a = str;
            this.b = aVar;
        }

        @Override // com.taobao.themis.kernel.extension.page.s.c
        public boolean a(ITMSPage page, TMSBackPressedType tMSBackPressedType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("19000c3b", new Object[]{this, page, tMSBackPressedType})).booleanValue();
            }
            q.d(page, "page");
            if (!qqc.a(page)) {
                return false;
            }
            String appId = this.f22341a;
            q.b(appId, "appId");
            if (!n.f(appId)) {
                return false;
            }
            com.taobao.android.themis.graphics.c a2 = this.b.a();
            q.a(a2);
            if (!a2.a("onCloseWindow")) {
                return false;
            }
            page.a("closeWindow", new JSONObject());
            return true;
        }
    }

    @Override // com.taobao.themis.open.extension.b
    public boolean a(MotionEvent event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, event})).booleanValue();
        }
        q.d(event, "event");
        com.taobao.android.themis.graphics.c cVar = this.b;
        if (cVar == null) {
            return false;
        }
        return cVar.a(event);
    }

    @Override // com.taobao.themis.open.extension.b
    public void a(String event, JSONObject params, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60829596", new Object[]{this, event, params, new Boolean(z)});
            return;
        }
        q.d(event, "event");
        q.d(params, "params");
        com.taobao.android.themis.graphics.c cVar = this.b;
        if (cVar == null) {
            return;
        }
        cVar.a(event, params, z);
    }

    @Override // com.taobao.themis.open.extension.b
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        ((IConfigAdapter) qpt.a(IConfigAdapter.class)).unregisterListener(com.taobao.themis.kernel.i.ORANGE_GROUP_THEMIS_GRAPHICS_COMMON);
        com.taobao.android.themis.graphics.c cVar = this.b;
        if (cVar != null) {
            cVar.b();
        }
        this.b = null;
        this.f22330a.onDestroy();
    }

    private final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        com.taobao.android.themis.graphics.c cVar = this.b;
        if (cVar == null) {
            return;
        }
        String a2 = com.taobao.themis.utils.g.a("tms_gm_api.json", this.e.b().o());
        q.b(a2, "TMSFileUtils.readAssert(…ance().activity\n        )");
        String replace = new Regex("\n").replace(a2, "");
        String a3 = com.taobao.themis.utils.g.a("tms_gm_event.json", this.e.b().o());
        q.b(a3, "TMSFileUtils.readAssert(…ance().activity\n        )");
        String replace2 = new Regex("\n").replace(a3, "");
        cVar.a("var __GAME_API_CONFIG__ = JSON.parse('" + replace + "'); var __GAME_EVENT_CONFIG__ = JSON.parse('" + replace2 + "');", "tms_gm_config");
    }

    private final boolean l() {
        com.taobao.android.themis.graphics.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        com.taobao.themis.open.extension.e eVar = (com.taobao.themis.open.extension.e) this.e.b().b(com.taobao.themis.open.extension.e.class);
        String a2 = eVar != null ? eVar.a() : null;
        String str = a2;
        if ((str == null || str.length() == 0) || (cVar = this.b) == null) {
            return false;
        }
        cVar.a(a2, "https://hybrid.miniapp.taobao.com/gm.fm.dev.js");
        return true;
    }

    private final boolean m() {
        com.taobao.android.themis.graphics.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        com.taobao.themis.open.extension.e eVar = (com.taobao.themis.open.extension.e) this.e.b().b(com.taobao.themis.open.extension.e.class);
        String b2 = eVar != null ? eVar.b() : null;
        String str = b2;
        if ((str == null || str.length() == 0) || (cVar = this.b) == null) {
            return false;
        }
        cVar.a(b2, "https://hybrid.miniapp.taobao.com/apifmext.hotpatch.js");
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/canvas/extension/page/BaseGameJSRuntimeExtension$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b {
        static {
            kge.a(-962819062);
        }

        private b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }
    }
}
