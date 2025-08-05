package tb;

import android.app.Application;
import android.support.v4.content.ContextCompat;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00042\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000bH\u0016J\"\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000bH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0016J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0003R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/taobao/mytaobao/data/FeedMtopPrefetcher;", "Lcom/taobao/mytaobao/base/Prefetcher;", "()V", "prefetchCache", "Lcom/alibaba/fastjson/JSONObject;", "buildRequest", "Lmtopsdk/mtop/domain/MtopRequest;", "corePrefetch", "", "fetch", "callback", "Lcom/taobao/mytaobao/basement/listener/BasementCommonCallback;", "async", "", "prefetch", "processFeedData", "feedData", "", "saveSnapshot", "syncFetchMtopData", "Lmtopsdk/mtop/domain/MtopResponse;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class esn extends com.taobao.mytaobao.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private volatile JSONObject g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/mytaobao/data/FeedMtopPrefetcher$fetch$1", "Ljava/lang/Runnable;", "run", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
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
                esn.b(esn.this).await(10L, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
            this.b.onResult(true, null, esn.c(esn.this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/mytaobao/data/FeedMtopPrefetcher$fetch$2", "Ljava/lang/Runnable;", "run", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
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
            esn.this.a(false);
            esn.a(esn.this, false, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/mytaobao/data/FeedMtopPrefetcher$prefetch$1", "Ljava/lang/Runnable;", "run", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
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
                esn.a(esn.this);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27544a;

        public d(String str) {
            this.f27544a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                muh.a("mtbBasementFeedDataV2", this.f27544a);
            }
        }
    }

    static {
        kge.a(983494061);
    }

    public static /* synthetic */ Object ipc$super(esn esnVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ JSONObject a(esn esnVar, boolean z, mtr mtrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("10b73281", new Object[]{esnVar, new Boolean(z), mtrVar}) : esnVar.a(z, mtrVar);
    }

    public static final /* synthetic */ void a(esn esnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e775f558", new Object[]{esnVar});
        } else {
            esnVar.a();
        }
    }

    public static final /* synthetic */ CountDownLatch b(esn esnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CountDownLatch) ipChange.ipc$dispatch("534e963f", new Object[]{esnVar}) : esnVar.f;
    }

    public static final /* synthetic */ JSONObject c(esn esnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ba0ac57a", new Object[]{esnVar}) : esnVar.g;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        TLog.loge(com.taobao.mytaobao.base.a.TAG, "feed mtop预取");
        if (!com.taobao.mytaobao.base.c.f()) {
            this.e = com.taobao.mytaobao.base.a.d;
        } else if (com.taobao.mytaobao.basement.a.e()) {
            this.e = com.taobao.mytaobao.base.a.d;
        } else if (!mxe.INSTANCE.d() && !com.taobao.mytaobao.basement.a.b()) {
            this.e = com.taobao.mytaobao.base.a.d;
        } else if (this.e != com.taobao.mytaobao.base.a.f18298a) {
        } else {
            this.e = com.taobao.mytaobao.base.a.b;
            if (z) {
                com.taobao.mytaobao.base.b.c(new c());
            } else {
                a();
            }
        }
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        MtopResponse b2 = b();
        if ((b2 != null ? b2.getBytedata() : null) != null) {
            byte[] bytedata = b2.getBytedata();
            q.a((Object) bytedata, "mtopResponse.bytedata");
            String str = new String(bytedata, kotlin.text.d.UTF_8);
            a(str);
            this.g = b(str);
        } else {
            this.g = null;
        }
        this.e = com.taobao.mytaobao.base.a.c;
        this.f.countDown();
        TLog.loge(com.taobao.mytaobao.base.a.TAG, "feed mtop获取成功");
    }

    private final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            com.taobao.mytaobao.base.b.a(new d(str), 1000L);
        }
    }

    private final JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d2c0493", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("time", (Object) Long.valueOf(System.currentTimeMillis()));
            jSONObject2.put("data", (Object) str);
            jSONObject2.put("source", (Object) "mtop");
            JSONObject jSONObject3 = jSONObject;
            jSONObject3.put((JSONObject) "preloadData", jSONObject2.toJSONString());
            jSONObject3.put((JSONObject) com.taobao.mtop.wvplugin.a.RESULT_KEY, "HY_SUCCESS");
        }
        return jSONObject;
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
        TLog.loge(com.taobao.mytaobao.base.a.TAG, "feed mtop正式取, status=" + this.e);
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
        } else if (i == com.taobao.mytaobao.base.a.d) {
            mtrVar.onResult(false, "forbid request", null);
        }
        return null;
    }

    private final MtopResponse b() {
        MtopResponse mtopResponse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("23e6c092", new Object[]{this});
        }
        MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, Globals.getApplication()), c(), TaoHelper.getTTID());
        build.mo1328setUnitStrategy("UNIT_TRADE");
        build.mo1305reqMethod(MethodEnum.POST);
        try {
            mtopResponse = build.syncRequest();
        } catch (Throwable unused) {
            mtopResponse = null;
        }
        if (mtopResponse != null) {
            mtopResponse.parseJsonByte();
        }
        return mtopResponse;
    }

    private final MtopRequest c() {
        JSONObject jSONObject;
        String string;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("1247795", new Object[]{this});
        }
        com.taobao.mytaobao.ultron.b a2 = com.taobao.mytaobao.ultron.b.a();
        q.a((Object) a2, "MTBDataProvider.getInstance()");
        JSONObject l = a2.l();
        MtopRequest mtopRequest = null;
        JSONObject a3 = com.taobao.mytaobao.basement.a.a(l != null ? l.getJSONObject("data") : null);
        if (a3 == null || (jSONObject = a3.getJSONObject("initApi")) == null) {
            return null;
        }
        String string2 = jSONObject.getString("apiMethod");
        if (string2 != null) {
            if (!(string2.length() > 0)) {
                string2 = null;
            }
            if (string2 != null && (string = jSONObject.getString("apiVersion")) != null) {
                if (!(string.length() > 0)) {
                    string = null;
                }
                if (string != null) {
                    mtopRequest = new MtopRequest();
                    mtopRequest.setApiName(string2);
                    mtopRequest.setVersion(string);
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = jSONObject3;
                    jSONObject4.put((JSONObject) "personalization", (String) Boolean.valueOf(com.alibaba.wireless.aliprivacyext.c.a().a("AliPrivacySDK")));
                    Application application = Globals.getApplication();
                    q.a((Object) application, "Globals.getApplication()");
                    if (ContextCompat.checkSelfPermission(application.getApplicationContext(), "android.permission.READ_CONTACTS") == 0) {
                        z = true;
                    }
                    jSONObject4.put((JSONObject) "allowContactAccess", (String) Boolean.valueOf(z));
                    jSONObject4.put((JSONObject) "deviceLevel", (String) Integer.valueOf(!com.taobao.mytaobao.base.c.g() ? 1 : 0));
                    jSONObject4.put((JSONObject) "isWeex", "true");
                    JSONObject jSONObject5 = jSONObject.getJSONObject("params");
                    if (jSONObject5 != null) {
                        jSONObject3.putAll(jSONObject5);
                    }
                    jSONObject2.put((JSONObject) "cursor", jSONObject3.toJSONString());
                    mtopRequest.setData(jSONObject2.toJSONString());
                }
            }
        }
        return mtopRequest;
    }
}
