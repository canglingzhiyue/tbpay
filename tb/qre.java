package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.weex_framework.adapter.e;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.pub_kit.utils.h;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0011J\b\u0010\u001a\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/taobao/themis/pub_kit/task/PubHomeDataTask;", "", "appId", "", "context", "Landroid/content/Context;", "traceId", "(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V", "iconChangeDataHasCallBack", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mDelta", "Lcom/alibaba/fastjson/JSONObject;", "mEventTraceId", "mHomePagePopDataList", "Lcom/alibaba/fastjson/JSONArray;", "mListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/taobao/themis/pub_kit/task/PubHomeDataTask$PubHomeDataTaskListener;", "mSyncLock", "Ljava/util/concurrent/CountDownLatch;", "timeOutRunnable", "Ljava/lang/Runnable;", e.RECORD_EXECUTE, "", "getAsync", DataReceiveMonitor.CB_LISTENER, "getDeltaSync", "getIconChangeSync", "Companion", "PubHomeDataTaskListener", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class qre {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f33043a;
    private JSONArray b;
    private final CountDownLatch c;
    private final CopyOnWriteArrayList<Object> d;
    private final AtomicBoolean e;
    private final String f;
    private final Runnable g;
    private final String h;
    private final Context i;
    private final String j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "data", "Lcom/alibaba/fastjson/JSONObject;", "onResult"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements h.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.themis.pub_kit.utils.h.b
        public final void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                return;
            }
            com.taobao.themis.kernel.logger.a.b("PubHomeDataTask", com.taobao.themis.kernel.logger.a.EVENT_ON_SUCCESS, qre.a(qre.this), qre.b(qre.this), jSONObject);
            com.taobao.themis.kernel.utils.a.b(qre.c(qre.this));
            if (qre.d(qre.this).get()) {
                TMSLogger.d("PubHomeDataTask", "首页请求mtop请求超时");
                return;
            }
            qre.d(qre.this).set(true);
            qre.a(qre.this, jSONObject);
            qre.a(qre.this, jSONObject != null ? jSONObject.getJSONArray("homePagePopDatas") : null);
            qre.g(qre.this).countDown();
            Iterator it = qre.h(qre.this).iterator();
            while (it.hasNext()) {
                it.next();
                qre.f(qre.this);
            }
            qre.h(qre.this).clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (qre.d(qre.this).get()) {
            } else {
                String a2 = qre.a(qre.this);
                String b = qre.b(qre.this);
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((JSONObject) "error", (String) 1000);
                jSONObject2.put((JSONObject) "errorMessage", "IconChangeDataTask is timeout");
                jSONObject2.put((JSONObject) "data", (String) null);
                t tVar = t.INSTANCE;
                com.taobao.themis.kernel.logger.a.c("PubHomeDataTask", com.taobao.themis.kernel.logger.a.EVENT_ON_ERROR, a2, b, jSONObject);
                qre.d(qre.this).set(true);
                qre.g(qre.this).countDown();
                Iterator it = qre.h(qre.this).iterator();
                while (it.hasNext()) {
                    it.next();
                    qre.e(qre.this);
                }
                qre.h(qre.this).clear();
                TMSLogger.d("PubHomeDataTask", "首页请求mtop超时无回调");
            }
        }
    }

    static {
        kge.a(1814361074);
        Companion = new a(null);
    }

    public qre(String appId, Context context, String traceId) {
        q.d(appId, "appId");
        q.d(context, "context");
        q.d(traceId, "traceId");
        this.h = appId;
        this.i = context;
        this.j = traceId;
        this.c = new CountDownLatch(1);
        this.d = new CopyOnWriteArrayList<>();
        this.e = new AtomicBoolean(false);
        this.f = com.taobao.themis.kernel.logger.a.a("PubHomeDataTask");
        this.g = new c();
    }

    public static final /* synthetic */ String a(qre qreVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4c5f2d2c", new Object[]{qreVar}) : qreVar.j;
    }

    public static final /* synthetic */ void a(qre qreVar, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27c6f71c", new Object[]{qreVar, jSONArray});
        } else {
            qreVar.b = jSONArray;
        }
    }

    public static final /* synthetic */ void a(qre qreVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd48db7c", new Object[]{qreVar, jSONObject});
        } else {
            qreVar.f33043a = jSONObject;
        }
    }

    public static final /* synthetic */ String b(qre qreVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4d0bd8cb", new Object[]{qreVar}) : qreVar.f;
    }

    public static final /* synthetic */ Runnable c(qre qreVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("c97c6ade", new Object[]{qreVar}) : qreVar.g;
    }

    public static final /* synthetic */ AtomicBoolean d(qre qreVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("77b7b1f7", new Object[]{qreVar}) : qreVar.e;
    }

    public static final /* synthetic */ JSONObject e(qre qreVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("554ad318", new Object[]{qreVar}) : qreVar.f33043a;
    }

    public static final /* synthetic */ JSONArray f(qre qreVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("f0be7ca5", new Object[]{qreVar}) : qreVar.b;
    }

    public static final /* synthetic */ CountDownLatch g(qre qreVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CountDownLatch) ipChange.ipc$dispatch("d0f72e0", new Object[]{qreVar}) : qreVar.c;
    }

    public static final /* synthetic */ CopyOnWriteArrayList h(qre qreVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArrayList) ipChange.ipc$dispatch("505f34e8", new Object[]{qreVar}) : qreVar.d;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.themis.kernel.logger.a.b("PubHomeDataTask", com.taobao.themis.kernel.logger.a.EVENT_ON_EXECUTE, this.j, this.f, new JSONObject());
        String str = this.j;
        String str2 = this.f;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "appId", this.h);
        t tVar = t.INSTANCE;
        com.taobao.themis.kernel.logger.a.a("PubHomeDataTask", com.taobao.themis.kernel.logger.a.EVENT_ON_START, str, str2, jSONObject);
        h.a(this.i, this.h, new b());
        com.taobao.themis.kernel.utils.a.a(this.g, 3000L);
    }

    public final JSONArray b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("505e5935", new Object[]{this});
        }
        if (this.e.get()) {
            return this.b;
        }
        try {
            this.c.await(3000L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            TMSLogger.b("PubHomeDataTask", th.getMessage(), th);
        }
        return this.b;
    }

    public final JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        if (this.e.get()) {
            return this.f33043a;
        }
        try {
            this.c.await(3000L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            TMSLogger.b("PubHomeDataTask", th.getMessage(), th);
        }
        return this.f33043a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/taobao/themis/pub_kit/task/PubHomeDataTask$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "TIME_OUT", "", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-493741894);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
