package tb;

import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.android.weex_framework.adapter.e;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.pub_kit.config.PubContainerConfigClient;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\fJ\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/taobao/themis/pub_kit/task/PubContainerConfigTask;", "", "appId", "", "sourceChannel", "traceId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "containerConfigHasCallBack", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mEventTraceId", "mListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/taobao/themis/pub_kit/task/PubContainerConfigTask$PubContainerConfigTaskListener;", "mPubUserGuideModule", "Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "mSyncLock", "Ljava/util/concurrent/CountDownLatch;", "timeOutRunnable", "Ljava/lang/Runnable;", e.RECORD_EXECUTE, "", "lightContainerConfigEnable", "", "enableAddIconButton", "getAsync", DataReceiveMonitor.CB_LISTENER, "getSync", "Companion", "PubContainerConfigTaskListener", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class qrd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private PubUserGuideModule f33040a;
    private final CountDownLatch b;
    private final CopyOnWriteArrayList<b> c;
    private final AtomicBoolean d;
    private final String e;
    private final Runnable f;
    private final String g;
    private final String h;
    private final String i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/taobao/themis/pub_kit/task/PubContainerConfigTask$PubContainerConfigTaskListener;", "", "onResult", "", "result", "Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public interface b {
        void onResult(PubUserGuideModule pubUserGuideModule);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (qrd.d(qrd.this).get()) {
            } else {
                String a2 = qrd.a(qrd.this);
                String b = qrd.b(qrd.this);
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((JSONObject) "error", (String) 1000);
                jSONObject2.put((JSONObject) "errorMessage", "PubContainerConfigTask is timeout");
                jSONObject2.put((JSONObject) "data", (String) null);
                t tVar = t.INSTANCE;
                com.taobao.themis.kernel.logger.a.c("PubContainerConfigTask", com.taobao.themis.kernel.logger.a.EVENT_ON_ERROR, a2, b, jSONObject);
                qrd.d(qrd.this).set(true);
                qrd.f(qrd.this).countDown();
                Iterator it = qrd.g(qrd.this).iterator();
                while (it.hasNext()) {
                    ((b) it.next()).onResult(null);
                }
                qrd.g(qrd.this).clear();
                TMSLogger.d("PubContainerConfigTask", "mtop超时无回调");
            }
        }
    }

    static {
        kge.a(565109028);
        Companion = new a(null);
    }

    public qrd(String appId, String str, String traceId) {
        q.d(appId, "appId");
        q.d(traceId, "traceId");
        this.g = appId;
        this.h = str;
        this.i = traceId;
        this.b = new CountDownLatch(1);
        this.c = new CopyOnWriteArrayList<>();
        this.d = new AtomicBoolean(false);
        this.e = com.taobao.themis.kernel.logger.a.a("PubContainerConfigTask");
        this.f = new d();
    }

    public static final /* synthetic */ String a(qrd qrdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3fc637ab", new Object[]{qrdVar}) : qrdVar.i;
    }

    public static final /* synthetic */ void a(qrd qrdVar, PubUserGuideModule pubUserGuideModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a911041a", new Object[]{qrdVar, pubUserGuideModule});
        } else {
            qrdVar.f33040a = pubUserGuideModule;
        }
    }

    public static final /* synthetic */ String b(qrd qrdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4072e34a", new Object[]{qrdVar}) : qrdVar.e;
    }

    public static final /* synthetic */ Runnable c(qrd qrdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("7f4ad19d", new Object[]{qrdVar}) : qrdVar.f;
    }

    public static final /* synthetic */ AtomicBoolean d(qrd qrdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("be402458", new Object[]{qrdVar}) : qrdVar.d;
    }

    public static final /* synthetic */ PubUserGuideModule e(qrd qrdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PubUserGuideModule) ipChange.ipc$dispatch("48e32be2", new Object[]{qrdVar}) : qrdVar.f33040a;
    }

    public static final /* synthetic */ CountDownLatch f(qrd qrdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CountDownLatch) ipChange.ipc$dispatch("b667e800", new Object[]{qrdVar}) : qrdVar.b;
    }

    public static final /* synthetic */ CopyOnWriteArrayList g(qrd qrdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArrayList) ipChange.ipc$dispatch("6d935208", new Object[]{qrdVar}) : qrdVar.c;
    }

    public final void a(boolean z, boolean z2) {
        PubContainerConfigClient.PubContainerConfigRequestParam pubContainerConfigRequestParam;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (!z) {
            this.d.set(true);
            this.b.countDown();
            Iterator<b> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().onResult(null);
            }
            this.c.clear();
        } else {
            com.taobao.themis.kernel.logger.a.b("PubContainerConfigTask", com.taobao.themis.kernel.logger.a.EVENT_ON_EXECUTE, this.i, this.e, new JSONObject());
            if (z2) {
                String str = this.g;
                String str2 = this.h;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("enableAddIconButton", (Object) true);
                t tVar = t.INSTANCE;
                pubContainerConfigRequestParam = new PubContainerConfigClient.PubContainerConfigRequestParam(str, str2, jSONObject);
            } else {
                pubContainerConfigRequestParam = new PubContainerConfigClient.PubContainerConfigRequestParam(this.g, this.h, null);
            }
            com.taobao.themis.kernel.logger.a.a("PubContainerConfigTask", com.taobao.themis.kernel.logger.a.EVENT_ON_START, this.i, this.e, new JSONObject(pubContainerConfigRequestParam.toMap()));
            new PubContainerConfigClient(pubContainerConfigRequestParam, new c()).a();
            com.taobao.themis.kernel.utils.a.a(this.f, 3000L);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/taobao/themis/pub_kit/task/PubContainerConfigTask$execute$pubContainerConfigListener$1", "Lcom/taobao/themis/kernel/network/CommonListener;", "Lcom/alibaba/fastjson/JSONObject;", "onFailure", "", "errorCode", "", "errorMsg", InputFrame3.TYPE_RESPONSE, "onSuccess", "userGuideModule", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements com.taobao.themis.kernel.network.b<JSONObject, JSONObject> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.themis.kernel.network.b
        public /* synthetic */ void onFailure(String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec067822", new Object[]{this, str, str2, jSONObject});
            } else {
                a(str, str2, jSONObject);
            }
        }

        @Override // com.taobao.themis.kernel.network.b
        public /* synthetic */ void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, jSONObject});
            } else {
                a(jSONObject);
            }
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                return;
            }
            com.taobao.themis.kernel.logger.a.b("PubContainerConfigTask", com.taobao.themis.kernel.logger.a.EVENT_ON_SUCCESS, qrd.a(qrd.this), qrd.b(qrd.this), jSONObject);
            com.taobao.themis.kernel.utils.a.b(qrd.c(qrd.this));
            if (qrd.d(qrd.this).get()) {
                TMSLogger.d("PubContainerConfigTask", "mtop请求超时");
                return;
            }
            qrd.d(qrd.this).set(true);
            qrd.a(qrd.this, jSONObject != null ? (PubUserGuideModule) jSONObject.toJavaObject(PubUserGuideModule.class) : null);
            qrd.f(qrd.this).countDown();
            Iterator it = qrd.g(qrd.this).iterator();
            while (it.hasNext()) {
                ((b) it.next()).onResult(qrd.e(qrd.this));
            }
            qrd.g(qrd.this).clear();
        }

        public void a(String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
                return;
            }
            String a2 = qrd.a(qrd.this);
            String b = qrd.b(qrd.this);
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = jSONObject2;
            jSONObject3.put((JSONObject) "error", str);
            jSONObject3.put((JSONObject) "errorMessage", str2);
            jSONObject3.put((JSONObject) "data", (String) jSONObject);
            t tVar = t.INSTANCE;
            com.taobao.themis.kernel.logger.a.c("PubContainerConfigTask", com.taobao.themis.kernel.logger.a.EVENT_ON_ERROR, a2, b, jSONObject2);
            if (qrd.d(qrd.this).get()) {
                TMSLogger.d("PubContainerConfigTask", "mtop请求超时");
                return;
            }
            qrd.d(qrd.this).set(true);
            qrd.f(qrd.this).countDown();
            Iterator it = qrd.g(qrd.this).iterator();
            while (it.hasNext()) {
                ((b) it.next()).onResult(null);
            }
            qrd.g(qrd.this).clear();
            TMSLogger.d("PubContainerConfigTask", "errorCode = " + str + ", errorMsg = " + str2 + ", response = " + jSONObject);
        }
    }

    public final PubUserGuideModule a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubUserGuideModule) ipChange.ipc$dispatch("96d905f3", new Object[]{this});
        }
        if (this.d.get()) {
            return this.f33040a;
        }
        try {
            this.b.await(3000L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            TMSLogger.b("PubContainerConfigTask", th.getMessage(), th);
        }
        return this.f33040a;
    }

    public final void a(b listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("793ad4d7", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        if (this.d.get()) {
            listener.onResult(this.f33040a);
        } else {
            this.c.add(listener);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/taobao/themis/pub_kit/task/PubContainerConfigTask$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "TIME_OUT", "", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-821907604);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
