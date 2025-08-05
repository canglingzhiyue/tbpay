package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.text.d;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\t2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000eH\u0016J\"\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u000bJ\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/taobao/mytaobao/pagev2/basement/dataservice/FeedMtopFetcher;", "Lcom/taobao/mytaobao/base/Prefetcher;", "apiMethod", "", "apiVersion", "unitStrategy", "requestData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "prefetchCache", "Lcom/alibaba/fastjson/JSONObject;", "corePrefetch", "", "fetch", "callback", "Lcom/taobao/mytaobao/basement/listener/BasementCommonCallback;", "async", "", "prefetch", DMComponent.RESET, "syncFetchMtopData", "Lmtopsdk/mtop/domain/MtopResponse;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xoi extends com.taobao.mytaobao.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private volatile JSONObject g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/mytaobao/pagev2/basement/dataservice/FeedMtopFetcher$fetch$1", "Ljava/lang/Runnable;", "run", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
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
                xoi.a(xoi.this).await(10L, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
            this.b.onResult(true, null, xoi.b(xoi.this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/mytaobao/pagev2/basement/dataservice/FeedMtopFetcher$fetch$2", "Ljava/lang/Runnable;", "run", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
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
            xoi.this.a(false);
            xoi.a(xoi.this, false, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                xoi.c(xoi.this);
            }
        }
    }

    static {
        kge.a(-473863937);
    }

    public static /* synthetic */ Object ipc$super(xoi xoiVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public xoi(String apiMethod, String apiVersion, String str, String requestData) {
        q.c(apiMethod, "apiMethod");
        q.c(apiVersion, "apiVersion");
        q.c(requestData, "requestData");
        this.h = apiMethod;
        this.i = apiVersion;
        this.j = str;
        this.k = requestData;
    }

    public static final /* synthetic */ JSONObject a(xoi xoiVar, boolean z, mtr mtrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ddc60653", new Object[]{xoiVar, new Boolean(z), mtrVar}) : xoiVar.a(z, mtrVar);
    }

    public static final /* synthetic */ CountDownLatch a(xoi xoiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CountDownLatch) ipChange.ipc$dispatch("fa318d2c", new Object[]{xoiVar}) : xoiVar.f;
    }

    public static final /* synthetic */ JSONObject b(xoi xoiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("c4b03ae7", new Object[]{xoiVar}) : xoiVar.g;
    }

    public static final /* synthetic */ void c(xoi xoiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ad7248", new Object[]{xoiVar});
        } else {
            xoiVar.b();
        }
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

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            a(true);
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.e != com.taobao.mytaobao.base.a.f18298a) {
        } else {
            this.e = com.taobao.mytaobao.base.a.b;
            if (z) {
                com.taobao.mytaobao.base.b.c(new c());
            } else {
                b();
            }
        }
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        MtopResponse c2 = c();
        if ((c2 != null ? c2.getBytedata() : null) != null) {
            byte[] bytedata = c2.getBytedata();
            q.a((Object) bytedata, "mtopResponse.bytedata");
            this.g = com.taobao.mytaobao.basement.weex.a.INSTANCE.b(new String(bytedata, d.UTF_8));
        } else {
            this.g = null;
        }
        this.e = com.taobao.mytaobao.base.a.c;
        this.f.countDown();
    }

    private final MtopResponse c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("85395d31", new Object[]{this});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(this.h);
        mtopRequest.setVersion(this.i);
        mtopRequest.setData(this.k);
        MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, Globals.getApplication()), mtopRequest, TaoHelper.getTTID());
        String str = this.j;
        if (str != null) {
            build.mo1328setUnitStrategy(str);
        }
        build.mo1305reqMethod(MethodEnum.POST);
        try {
            return build.syncRequest();
        } catch (Throwable unused) {
            return null;
        }
    }
}
