package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\tH\u0016J\"\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\tH\u0002J\b\u0010\f\u001a\u00020\u0006H\u0016J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/taobao/mytaobao/data/FeedSnapshotPrefetcher;", "Lcom/taobao/mytaobao/base/Prefetcher;", "()V", "prefetchCache", "Lcom/alibaba/fastjson/JSONObject;", "corePrefetch", "", "fetch", "callback", "Lcom/taobao/mytaobao/basement/listener/BasementCommonCallback;", "async", "", "prefetch", "processFeedData", "feedData", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class esp extends com.taobao.mytaobao.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private volatile JSONObject g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/mytaobao/data/FeedSnapshotPrefetcher$fetch$1", "Ljava/lang/Runnable;", "run", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ mtr b;

        public a(mtr mtrVar) {
            this.b = mtrVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                esp.b(esp.this).await(10L, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
            this.b.onResult(true, null, esp.c(esp.this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/mytaobao/data/FeedSnapshotPrefetcher$fetch$2", "Ljava/lang/Runnable;", "run", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ mtr b;

        public b(mtr mtrVar) {
            this.b = mtrVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            esp.this.a(false);
            esp.a(esp.this, false, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/mytaobao/data/FeedSnapshotPrefetcher$prefetch$1", "Ljava/lang/Runnable;", "run", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                esp.a(esp.this);
            }
        }
    }

    static {
        kge.a(1739870761);
    }

    public static /* synthetic */ Object ipc$super(esp espVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ JSONObject a(esp espVar, boolean z, mtr mtrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("45f8b783", new Object[]{espVar, new Boolean(z), mtrVar}) : espVar.a(z, mtrVar);
    }

    public static final /* synthetic */ void a(esp espVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e776de16", new Object[]{espVar});
        } else {
            espVar.a();
        }
    }

    public static final /* synthetic */ CountDownLatch b(esp espVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CountDownLatch) ipChange.ipc$dispatch("18a77fd", new Object[]{espVar}) : espVar.f;
    }

    public static final /* synthetic */ JSONObject c(esp espVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("a2893638", new Object[]{espVar}) : espVar.g;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        TLog.loge(com.taobao.mytaobao.base.a.TAG, "feed快照预取");
        if (this.e != com.taobao.mytaobao.base.a.f18298a) {
            return;
        }
        this.e = com.taobao.mytaobao.base.a.b;
        if (z) {
            com.taobao.mytaobao.base.b.c(new c());
        } else {
            a();
        }
    }

    private final JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("time", (Object) Long.valueOf(System.currentTimeMillis()));
            jSONObject2.put("data", (Object) str);
            jSONObject2.put("source", (Object) "snapshot");
            JSONObject jSONObject3 = jSONObject;
            jSONObject3.put((JSONObject) "preloadData", jSONObject2.toJSONString());
            jSONObject3.put((JSONObject) com.taobao.mtop.wvplugin.a.RESULT_KEY, "HY_SUCCESS");
        }
        return jSONObject;
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        String a2 = muh.a("mtbBasementFeedDataV2");
        this.g = a2 != null ? a(a2) : null;
        this.e = com.taobao.mytaobao.base.a.c;
        this.f.countDown();
        TLog.loge(com.taobao.mytaobao.base.a.TAG, "feed快照获取成功");
    }

    public JSONObject a(mtr<JSONObject> callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7402da6d", new Object[]{this, callback});
        }
        q.c(callback, "callback");
        return a(true, callback);
    }

    private final JSONObject a(boolean z, mtr<JSONObject> mtrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2185ed71", new Object[]{this, new Boolean(z), mtrVar});
        }
        TLog.loge(com.taobao.mytaobao.base.a.TAG, "feed快照正式取, status=" + this.e);
        int i = this.e;
        if (i == com.taobao.mytaobao.base.a.c) {
            if (!z) {
                mtrVar.onResult(true, null, this.g);
            }
            return this.g;
        }
        if (i == com.taobao.mytaobao.base.a.b) {
            if (z) {
                com.taobao.mytaobao.base.b.c(new a(mtrVar));
            } else {
                try {
                    this.f.await(10L, TimeUnit.SECONDS);
                } catch (Throwable unused) {
                }
                mtrVar.onResult(true, null, this.g);
            }
        } else if (i == com.taobao.mytaobao.base.a.f18298a) {
            com.taobao.mytaobao.base.b.c(new b(mtrVar));
        }
        return null;
    }
}
