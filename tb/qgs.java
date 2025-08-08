package tb;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamOtherResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.android.nextrpc.stream.request.StreamNextRpcRequest;
import com.alibaba.android.nextrpc.stream.request.d;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import tb.jqg;
import tb.qgs;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J(\u0010\u0015\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J*\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0004H\u0007J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004J(\u0010\u0018\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/alibaba/android/icart/core/performance/preloader/task/impl/CartFirstPageRequestPreloader;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "sHasRequest", "Ljava/util/concurrent/atomic/AtomicBoolean;", "sPreRequestAPI", "assembleMtopBusiness", "Lcom/taobao/tao/remotebusiness/MtopBusiness;", "activity", "Landroid/app/Activity;", "isPreRequestWhenClick", "", "instanceId", "doPreload", "", "scene", "hasCache", "context", "Landroid/content/Context;", "observeLoginStatus", "preload", "resetStatus", "skipPreload", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class qgs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final qgs INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f32920a;
    private static String b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/alibaba/android/icart/core/performance/preloader/task/impl/CartFirstPageRequestPreloader$preload$1$1"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f32923a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ String d;

        public c(Activity activity, String str, boolean z, String str2) {
            this.f32923a = activity;
            this.b = str;
            this.c = z;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                qgs.a(qgs.INSTANCE, this.f32923a, this.b, this.c, this.d);
            } catch (Throwable th) {
                jpu c = jpu.a("Ultron").c("CartFirstPageRequestPreloader");
                String message = th.getMessage();
                if (message == null) {
                    message = "出错了";
                }
                jpr.a(c.b(message));
            }
        }
    }

    static {
        kge.a(-1338126272);
        INSTANCE = new qgs();
        f32920a = new AtomicBoolean(false);
    }

    private qgs() {
    }

    public static final /* synthetic */ AtomicBoolean a(qgs qgsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("1404cc1b", new Object[]{qgsVar}) : f32920a;
    }

    public static final /* synthetic */ void a(qgs qgsVar, Activity activity, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26839c07", new Object[]{qgsVar, activity, str, new Boolean(z), str2});
        } else {
            qgsVar.c(activity, str, z, str2);
        }
    }

    private final boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue() : bci.b(context);
    }

    public final void a(String scene) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, scene});
            return;
        }
        q.d(scene, "scene");
        String str = b;
        if (str == null) {
            return;
        }
        f32920a.set(false);
        tfa.b("iCart", str);
        jqg.a("CartFirstPageRequestPreloader", "重置状态:", scene);
    }

    @JvmStatic
    public static final void a(Activity activity, String str, boolean z, String scene) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58741a", new Object[]{activity, str, new Boolean(z), scene});
            return;
        }
        q.d(activity, "activity");
        q.d(scene, "scene");
        if (str == null) {
            return;
        }
        try {
            if (INSTANCE.b(activity, str, z, scene)) {
                return;
            }
            if (jqh.a() && jqi.a("iCart", "switchToWorkThreadWhenPreRequest", true)) {
                jqh.a(new c(activity, str, z, scene));
            } else {
                INSTANCE.c(activity, str, z, scene);
            }
        } catch (Throwable th) {
            jpu c2 = jpu.a("Ultron").c("CartFirstPageRequestPreloader");
            String message = th.getMessage();
            if (message == null) {
                message = "出错了";
            }
            jpr.a(c2.b(message));
        }
    }

    private final boolean b(Activity activity, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7eb977fd", new Object[]{this, activity, str, new Boolean(z), str2})).booleanValue();
        }
        if (!akg.b() && jqi.a("iCart", "skipPreRequestWhenNotColdStart", true)) {
            jqg.b("CartFirstPageRequestPreloader", "已经打开过购物车，跳过");
            return true;
        } else if (f32920a.getAndSet(true)) {
            jqg.b("CartFirstPageRequestPreloader", "已经发起过了预请求，跳过");
            return true;
        } else if (!jqi.a("iCart", "enablePrefetchFirstPageRequest", true)) {
            jqg.b("CartFirstPageRequestPreloader", "开关关闭，不做预请求");
            return true;
        } else if (a(activity)) {
            jqg.b("CartFirstPageRequestPreloader", "已有缓存，不做预请求");
            return true;
        } else if (Login.checkSessionValid()) {
            return false;
        } else {
            jqg.b("CartFirstPageRequestPreloader", "未登录，暂停预请求，注册登录监听");
            d(activity, str, z, str2);
            return true;
        }
    }

    private final void c(Activity activity, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1a7bd8", new Object[]{this, activity, str, new Boolean(z), str2});
            return;
        }
        tfa.a(activity, a(activity, z, str), bbx.sStreamNextRpcServiceName, new a(str2, activity), new b(str));
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "点击" : "闲时");
        sb.append("预请求");
        bed.a(tbt.PRE_REQUEST, sb.toString(), true, 0.001f);
        jqg.b("CartFirstPageRequestPreloader", "doPreLoad " + str2 + "#end");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u000e"}, d2 = {"com/alibaba/android/icart/core/performance/preloader/task/impl/CartFirstPageRequestPreloader$doPreload$1", "Lcom/alibaba/android/nextrpc/stream/request/StreamNextRpcResponseCallback;", "onAttachedResponse", "", "list", "", "Lcom/alibaba/android/nextrpc/request/AttachedResponse;", "onFinish", "streamOtherResponse", "Lcom/alibaba/android/nextrpc/stream/internal/response/StreamOtherResponse;", "onMainError", "onMainResponse", "streamRemoteMainResponse", "Lcom/alibaba/android/nextrpc/stream/internal/response/StreamRemoteMainResponse;", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f32921a;
        public final /* synthetic */ String b;

        @Override // com.alibaba.android.nextrpc.stream.request.d
        public void a(List<? extends AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            } else {
                q.d(list, "list");
            }
        }

        @Override // com.alibaba.android.nextrpc.stream.request.d
        public void c(StreamOtherResponse streamOtherResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e3d8095", new Object[]{this, streamOtherResponse});
            } else {
                q.d(streamOtherResponse, "streamOtherResponse");
            }
        }

        public a(String str, Activity activity) {
            this.b = str;
            this.f32921a = activity;
        }

        @Override // com.alibaba.android.nextrpc.stream.request.d
        public void a(StreamRemoteMainResponse streamRemoteMainResponse, List<? extends AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("578d65d", new Object[]{this, streamRemoteMainResponse, list});
                return;
            }
            q.d(streamRemoteMainResponse, "streamRemoteMainResponse");
            q.d(list, "list");
            try {
                bed.a("preRequestAPIStatus", "成功:" + this.b, true, 0.01f);
                byte[] bArr = streamRemoteMainResponse.getMtopStreamResponse().e;
                JSONObject jSONObject = (JSONObject) JSON.parseObject(bArr, JSONObject.class, new Feature[0]);
                aae.a(this.f32921a, jSONObject);
                if (jqi.a("iCart", ieu.sCacheFirstPageWhenPreRequest, false, true)) {
                    bci.a(this.f32921a, bArr);
                }
                if (!jqi.a("iCart", ieu.sLoadImageWhenPreRequest, false, true)) {
                    return;
                }
                com.alibaba.android.icart.core.performance.cache.b.a(jSONObject.getJSONObject("data"));
            } catch (Throwable th) {
                jpu c = jpu.a("Ultron").c("CartFirstPageRequestPreloader");
                String message = th.getMessage();
                if (message == null) {
                    message = "出错了";
                }
                jpr.a(c.b(message));
            }
        }

        @Override // com.alibaba.android.nextrpc.stream.request.d
        public void a(StreamOtherResponse streamOtherResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4febbc13", new Object[]{this, streamOtherResponse});
                return;
            }
            q.d(streamOtherResponse, "streamOtherResponse");
            if (jqi.a("iCart", "resetPreRequestStatusWhenError", true)) {
                qgs.a(qgs.INSTANCE).set(false);
            }
            bed.a("preRequestAPIStatus", "失败:" + this.b, false, 1.0f);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/alibaba/android/icart/core/performance/preloader/task/impl/CartFirstPageRequestPreloader$doPreload$2", "Lcom/taobao/android/ultron/callback/AbsWithReturnFunction;", "", "Lcom/alibaba/android/nextrpc/stream/request/StreamNextRpcRequest;", "run", "data", "(Lcom/alibaba/android/nextrpc/stream/request/StreamNextRpcRequest;)Ljava/lang/Boolean;", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class b extends jns<Boolean, StreamNextRpcRequest> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32922a;

        public b(String str) {
            this.f32922a = str;
        }

        @Override // tb.jns
        public Boolean a(StreamNextRpcRequest streamNextRpcRequest) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("3edf2688", new Object[]{this, streamNextRpcRequest});
            }
            if (streamNextRpcRequest != null) {
                try {
                } catch (Exception e) {
                    String message = e.getMessage();
                    q.a((Object) message);
                    jqg.a("CartFirstPageRequestPreloader", "预请求报错#", message);
                }
                if (streamNextRpcRequest.getMtopBusiness() != null) {
                    Map<String, String> map = streamNextRpcRequest.getMtopBusiness().request.dataParams;
                    if (map == null) {
                        jqg.b("CartFirstPageRequestPreloader", "预请求比较#dataParams为空");
                        return false;
                    }
                    String str = map.get("exParams");
                    if (str == null) {
                        jqg.b("CartFirstPageRequestPreloader", "预请求比较#exParams为空");
                        return false;
                    }
                    JSONObject parseObject = JSON.parseObject(str);
                    String string = parseObject.getString(RequestConfig.IS_ICART_IS_FIRST_REQUEST);
                    if (q.a((Object) parseObject.getString("instanceId"), (Object) this.f32922a) && Boolean.parseBoolean(string)) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            }
            return false;
        }
    }

    private final MtopBusiness a(Activity activity, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("43577cd0", new Object[]{this, activity, new Boolean(z), str});
        }
        QueryParamsManager queryParamsManager = new QueryParamsManager(activity, activity.getIntent());
        com.alibaba.android.ultron.trade.data.request.c request = com.alibaba.android.icart.core.data.config.a.a(queryParamsManager.a());
        HashMap hashMap = new HashMap();
        hashMap.put(z ? "preRequestOfClick" : tbt.PRE_REQUEST, "true");
        Map<String, String> a2 = qgr.a(activity, queryParamsManager, str, hashMap);
        q.b(a2, "CartFirstQueryParamsBuil… customExParams\n        )");
        a2.put(RequestConfig.NO_CACHE_OF_FIRST_PAGE, "true");
        request.d(a2);
        MtopRequest mtopRequest = new MtopRequest();
        q.b(request, "request");
        b = request.c();
        mtopRequest.setApiName(request.c());
        mtopRequest.setVersion(request.d());
        mtopRequest.setNeedSession(request.m());
        mtopRequest.setNeedEcode(request.l());
        Map<String, String> f = request.f();
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(f);
        mtopRequest.setData(jSONObject.toJSONString());
        mtopRequest.dataParams = f;
        MtopBusiness mtopBusiness = MtopBusiness.build(mtopRequest);
        mtopBusiness.mo1328setUnitStrategy("UNIT_TRADE");
        mtopBusiness.allowParseJson(true);
        mtopBusiness.mo1305reqMethod(request.h() ? MethodEnum.POST : MethodEnum.GET);
        mtopBusiness.mo1293allowSwitchToPOST(request.i());
        mtopBusiness.mo1312setConnectionTimeoutMilliSecond(30000);
        if (request.k()) {
            mtopBusiness.mo1335useWua();
        }
        int j = request.j();
        if (-1 != j) {
            mtopBusiness.mo1340setBizId(j);
        }
        mtopBusiness.mo1309setBizId("iCart");
        if (z && jqi.a("iCart", "setMtopTopicToFirstWhenClickToPreRequest", true)) {
            mtopBusiness.mo1310setBizTopic(ieu.MTOP_TOPIC_FIRST_SCREEN_COLD_START_QUERY);
        } else {
            mtopBusiness.mo1310setBizTopic(ieu.MTOP_TOPIC_QUERY_PRELOAD);
        }
        String e = request.e();
        if (!StringUtils.isEmpty(e)) {
            mtopBusiness.mo1328setUnitStrategy(e);
        }
        Map<String, String> g = request.g();
        if (g != null) {
            mtopBusiness.mo1297headers(g);
        }
        q.b(mtopBusiness, "mtopBusiness");
        return mtopBusiness;
    }

    private final void d(final Activity activity, final String str, final boolean z, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7b7fb7", new Object[]{this, activity, str, new Boolean(z), str2});
            return;
        }
        try {
            LoginBroadcastHelper.registerLoginReceiver(activity, new BroadcastReceiver() { // from class: com.alibaba.android.icart.core.performance.preloader.task.impl.CartFirstPageRequestPreloader$observeLoginStatus$$inlined$tryCatch$lambda$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    q.d(context, "context");
                    q.d(intent, "intent");
                    if (!Login.checkSessionValid()) {
                        return;
                    }
                    jqg.b("CartFirstPageRequestPreloader", "登录，恢复预请求");
                    qgs.a(qgs.INSTANCE).set(false);
                    qgs.a(activity, str, z, str2);
                    LoginBroadcastHelper.unregisterLoginReceiver(activity, this);
                }
            });
        } catch (Throwable th) {
            jpu c2 = jpu.a("Ultron").c("CartFirstPageRequestPreloader");
            String message = th.getMessage();
            if (message == null) {
                message = "出错了";
            }
            jpr.a(c2.b(message));
        }
    }
}
