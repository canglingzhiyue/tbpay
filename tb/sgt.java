package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.ITransportAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.extension.page.af;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifestManager;
import com.taobao.themis.kernel.utils.i;
import com.taobao.themis.kernel.utils.n;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes9.dex */
public final class sgt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String ERR_CONNECT_FAILED = "TMS_ERR_MT_CONNECT_FAILED";
    public static final String TAG = "ManifestRequestClient";
    public static final String TMS_MT_ERR = "TMS_ERR_MT";

    static {
        kge.a(743787467);
        Companion = new a(null);
    }

    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(358430035);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public final b a(String uniAppId, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("dc575552", new Object[]{this, uniAppId, jSONObject, new Boolean(z)});
        }
        q.d(uniAppId, "uniAppId");
        return c(i.INSTANCE.a(uniAppId, z), jSONObject);
    }

    public final b b(String manifestUrl, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("4bd57aeb", new Object[]{this, manifestUrl, jSONObject});
        }
        q.d(manifestUrl, "manifestUrl");
        return c(manifestUrl, jSONObject);
    }

    private final b c(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("9994f2ec", new Object[]{this, str, jSONObject});
        }
        ITransportAdapter iTransportAdapter = (ITransportAdapter) qpt.b(ITransportAdapter.class);
        if (iTransportAdapter == null) {
            TMSLogger.d(TAG, "sendRequest, httpService is null");
            return new b(TMS_MT_ERR, "httpService is null");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("accept", "application/tms-manifest+json");
        String str2 = null;
        qpy a2 = qpy.a().a(str).a(linkedHashMap).b("GET").a((byte[]) null).a();
        q.b(a2, "RVHttpRequest.newBuilder…ull)\n            .build()");
        try {
            Result.a aVar = Result.Companion;
            qpz httpRequest = iTransportAdapter.httpRequest(a2);
            if (httpRequest == null) {
                return new b(TMS_MT_ERR, "response is null");
            }
            if (httpRequest.a() == -205) {
                af.Companion.a().add(Integer.valueOf(httpRequest.a()));
            }
            int a3 = httpRequest.a();
            if (a3 == -1) {
                return new b(TMS_MT_ERR + '_' + httpRequest.a(), ERR_CONNECT_FAILED);
            }
            if (200 <= a3 && 299 >= a3) {
                Map<String, String> a4 = sgu.INSTANCE.a(httpRequest);
                sgu sguVar = sgu.INSTANCE;
                InputStream c = httpRequest.c();
                q.b(c, "response.resStream");
                String a5 = sguVar.a(c, a4.get("Content-Type"));
                Result.a aVar2 = Result.Companion;
                long currentTimeMillis = System.currentTimeMillis();
                AppManifest appManifest = (AppManifest) JSON.parseObject(a5, AppManifest.class);
                if (appManifest == null) {
                    return new b("TMS_ERR_MT_FORMAT", "Manifest返回数据格式错误，无法正常解析");
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put(nfc.PHA_MONITOR_MEASURE_MANIFEST_PARSE_START, String.valueOf(currentTimeMillis));
                linkedHashMap2.put(nfc.PHA_MONITOR_MEASURE_MANIFEST_PARSE_END, String.valueOf(currentTimeMillis2));
                if (AppManifestManager.INSTANCE.a(appManifest)) {
                    String str3 = a4.get("x-deprecated-versions");
                    AppManifest.AppInfo appInfo = appManifest.getAppInfo();
                    if (appInfo != null) {
                        str2 = appInfo.getAppId();
                    }
                    if (str2 != null && n.INSTANCE.bD()) {
                        AppManifestManager appManifestManager = AppManifestManager.INSTANCE;
                        AppManifest.AppInfo appInfo2 = appManifest.getAppInfo();
                        q.a(appInfo2);
                        String appId = appInfo2.getAppId();
                        q.a((Object) appId);
                        appManifestManager.a(appId, str3);
                    }
                    return new b(appManifest, a4, linkedHashMap2);
                }
                return new b(TMS_MT_ERR + '_' + httpRequest.a(), "manifest result is invalid! originData is " + a5);
            }
            return new b(TMS_MT_ERR + '_' + httpRequest.a(), "errorCode is " + httpRequest.a());
        } catch (Throwable th) {
            Result.a aVar3 = Result.Companion;
            Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(Result.m2371constructorimpl(kotlin.i.a(th)));
            if (m2374exceptionOrNullimpl != null) {
                TMSLogger.b(TAG, "request with exception", m2374exceptionOrNullimpl);
                String message = m2374exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "";
                }
                return new b(TMS_MT_ERR, message);
            }
            return new b("", "");
        }
    }

    /* loaded from: classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f33563a;
        private AppManifest b;
        private Map<String, String> c;
        private String d;
        private String e;
        private Map<String, String> f;

        static {
            kge.a(-1814957258);
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f33563a;
        }

        public final AppManifest b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AppManifest) ipChange.ipc$dispatch("5e7a360c", new Object[]{this}) : this.b;
        }

        public final Map<String, String> f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this}) : this.f;
        }

        public b(AppManifest successData, Map<String, String> headers, Map<String, String> extraParam) {
            q.d(successData, "successData");
            q.d(headers, "headers");
            q.d(extraParam, "extraParam");
            this.f33563a = true;
            this.b = successData;
            this.c = headers;
            this.f = extraParam;
        }

        public b(String errorCode, String errorMsg) {
            q.d(errorCode, "errorCode");
            q.d(errorMsg, "errorMsg");
            this.f33563a = false;
            this.d = errorMsg;
            this.e = errorCode;
        }

        public final Map<String, String> c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.c;
        }

        public final String d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
        }

        public final String e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
        }
    }
}
