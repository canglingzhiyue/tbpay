package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.android.nextrpc.request.AbsResponse;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.request.NextRpcRequest;
import com.alibaba.android.nextrpc.request.NextRpcResponseCallbackV2;
import com.alibaba.android.nextrpc.request.RemoteMainResponse;
import com.alibaba.android.nextrpc.request.c;
import com.alibaba.android.nextrpc.request.d;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.e;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.http.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKConfig;

/* loaded from: classes2.dex */
public class bfo implements bfm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String sParamsKeyDisableJSONParse = "disableJSONParse";
    public static final String sParamsKeyEnableCacheWeex1UA = "enableCacheWeex1UA";
    public static final String sParamsKeyEnableWeex2UA = "enableWeex2UA";

    /* renamed from: a  reason: collision with root package name */
    private d f25851a;
    private final String b;
    private final Context c;
    private Map<String, String> d;

    public static /* synthetic */ void a(bfo bfoVar, bfn bfnVar, int i, AbsResponse absResponse, List list, boolean z, JSONObject jSONObject, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a559eb", new Object[]{bfoVar, bfnVar, new Integer(i), absResponse, list, new Boolean(z), jSONObject, new Boolean(z2)});
        } else {
            bfoVar.a(bfnVar, i, absResponse, list, z, jSONObject, z2);
        }
    }

    public bfo(Context context, String str) {
        this.c = context;
        this.b = str;
    }

    @Override // tb.bfm
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        d dVar = this.f25851a;
        if (dVar == null) {
            return;
        }
        dVar.a();
    }

    @Override // tb.bfm
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.f25851a != null) {
        } else {
            this.f25851a = new c().a(this.c).a(str).b();
        }
    }

    @Override // tb.bfm
    public void a(String str, final bfn bfnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("218aafb8", new Object[]{this, str, bfnVar});
            return;
        }
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("wxExecute", (Object) Long.valueOf(System.currentTimeMillis()));
        try {
            try {
                if (this.f25851a == null) {
                    UnifyLog.c(this.b, "nextRpc don't bind!!!", new Object[0]);
                    if (bfnVar == null) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error", (Object) "nextRpc don't bind!!!");
                    bfnVar.invoke(jSONObject2);
                    return;
                }
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(str);
                a a2 = a(jSONObject3);
                if (a2 == null) {
                    UnifyLog.c(this.b, "parse Param error", new Object[0]);
                    if (bfnVar == null) {
                        return;
                    }
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("error", (Object) "parse Param error");
                    bfnVar.invoke(jSONObject4);
                    return;
                }
                MtopRequest a3 = a(a2);
                String optString = jSONObject3.optString("userAgent");
                if (StringUtils.isEmpty(optString)) {
                    if (jSONObject3.optBoolean(sParamsKeyEnableWeex2UA, false)) {
                        optString = e.a().e();
                    } else {
                        if (!jSONObject3.optBoolean(sParamsKeyEnableCacheWeex1UA, false)) {
                            this.d = WXEnvironment.getConfig();
                        } else if (this.d == null) {
                            this.d = WXEnvironment.getConfig();
                        }
                        optString = b.a(this.c, this.d);
                    }
                }
                NextRpcRequest nextRpcRequest = new NextRpcRequest(a(a3, a2, optString), 1000.0d, NextRpcRequest.AttachedResponseStrategy.getStrategyByOrdinal(jSONObject3.optInt("attachedStrategy")));
                nextRpcRequest.setClientPerformance(jSONObject);
                final boolean optBoolean = jSONObject3.optBoolean(sParamsKeyDisableJSONParse, false);
                this.f25851a.a(nextRpcRequest, new NextRpcResponseCallbackV2() { // from class: tb.bfo.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.android.nextrpc.request.NextRpcResponseCallbackV2
                    public void a(int i, AbsResponse absResponse, List<AttachedResponse> list, boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6117d412", new Object[]{this, new Integer(i), absResponse, list, new Boolean(z)});
                        } else {
                            bfo.a(bfo.this, bfnVar, i, absResponse, list, z, jSONObject, optBoolean);
                        }
                    }
                });
            } catch (Exception e) {
                String str2 = "send Request failed" + e.getMessage();
                UnifyLog.d(this.b, str2, new Object[0]);
                if (str2 == null || bfnVar == null) {
                    return;
                }
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("error", (Object) str2);
                bfnVar.invoke(jSONObject5);
            }
        } catch (Throwable th) {
            if (0 != 0 && bfnVar != null) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("error", (Object) null);
                bfnVar.invoke(jSONObject6);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    private void a(bfn bfnVar, int i, AbsResponse absResponse, List<AttachedResponse> list, boolean z, JSONObject jSONObject, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0c1a3b0", new Object[]{this, bfnVar, new Integer(i), absResponse, list, new Boolean(z), jSONObject, new Boolean(z2)});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            if (list != null) {
                for (AttachedResponse attachedResponse : list) {
                    Object body = attachedResponse.getBody();
                    if (!z2) {
                        body = JSONObject.parse(body);
                    }
                    jSONArray.add(body);
                }
            }
            jSONObject2.put("responseType", Integer.valueOf(i));
            if (!jSONArray.isEmpty()) {
                jSONObject2.put("attachedResponses", (Object) jSONArray);
            }
            if (i == 1 && absResponse != null && !StringUtils.isEmpty(absResponse.getBody())) {
                String body2 = absResponse.getBody();
                jSONObject2.put("mainResponse", z2 ? body2 : JSONObject.parse(body2));
            } else if (i == -1) {
                jSONObject2.put("mainResponse", a(absResponse));
            }
        } catch (Exception e) {
            String str = this.b;
            UnifyLog.c(str, "jsonResult parse error msg=" + e.getMessage(), new Object[0]);
        }
        if (jSONObject != null) {
            jSONObject.put("wxCallback", (Object) Long.valueOf(System.currentTimeMillis()));
            jSONObject2.put(nfc.PHA_MONITOR_MODULE_POINT_PERFORMANCE, (Object) jSONObject);
        }
        if (bfnVar == 0) {
            return;
        }
        if (z) {
            bfnVar.invoke(jSONObject2);
        } else {
            bfnVar.invokeAndKeepAlive(jSONObject2);
        }
    }

    private JSONObject a(AbsResponse absResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f686be04", new Object[]{this, absResponse});
        }
        JSONObject jSONObject = new JSONObject();
        if (absResponse instanceof RemoteMainResponse) {
            MtopResponse mtopResponse = ((RemoteMainResponse) absResponse).getMtopResponse();
            jSONObject.put("api", (Object) mtopResponse.getApi());
            jSONObject.put("v", (Object) mtopResponse.getV());
            jSONObject.put("result", (Object) mtopResponse.getRetCode());
        }
        return jSONObject;
    }

    private MtopRequest a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("fe0e8b5b", new Object[]{this, aVar});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(aVar.f25853a);
        mtopRequest.setVersion(aVar.b);
        mtopRequest.setNeedEcode(aVar.c);
        mtopRequest.setNeedSession(true);
        if (StringUtils.isNotBlank(aVar.j)) {
            mtopRequest.setData(aVar.j);
        }
        mtopRequest.dataParams = aVar.a();
        return mtopRequest;
    }

    private MtopBusiness a(MtopRequest mtopRequest, a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("bf26b1ef", new Object[]{this, mtopRequest, aVar, str});
        }
        MtopBusiness build = MtopBusiness.build(mtopRequest, StringUtils.isBlank(aVar.e) ? SDKConfig.getInstance().getGlobalTtid() : aVar.e);
        build.mo1342showLoginUI(!aVar.i.equals("AutoLoginOnly"));
        if (aVar.d > 0) {
            build.mo1335useWua();
        }
        build.mo1305reqMethod(aVar.h ? MethodEnum.POST : MethodEnum.GET);
        if (aVar.b() != null) {
            build.mo1297headers(aVar.b());
        }
        if (StringUtils.isNotBlank(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("x-ua", str);
            build.mo1297headers((Map<String, String>) hashMap);
        }
        if (!StringUtils.isBlank(aVar.g) && ("json".equals(aVar.g) || "originaljson".equals(aVar.g))) {
            build.mo1315setJsonType(JsonTypeEnum.valueOf(aVar.g.toUpperCase()));
        }
        try {
            if (!StringUtils.isEmpty(aVar.k)) {
                build.mo1321setPageUrl(aVar.k);
            }
        } catch (Throwable unused) {
        }
        if (!StringUtils.isBlank(aVar.m)) {
            build.mo1313setCustomDomain(aVar.m);
        }
        try {
            if (!StringUtils.isEmpty(aVar.l)) {
                build.mo1320setPageName(aVar.l);
            }
        } catch (Throwable unused2) {
        }
        build.mo1310setBizTopic(aVar.p);
        build.mo1333upstreamCompress(aVar.q);
        return build;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3 A[Catch: JSONException -> 0x0184, TryCatch #0 {JSONException -> 0x0184, blocks: (B:7:0x002f, B:10:0x0053, B:13:0x005a, B:15:0x0062, B:22:0x0081, B:24:0x00a3, B:32:0x00be, B:35:0x00c8, B:37:0x00dd, B:38:0x00e6, B:40:0x00ef, B:42:0x0101, B:45:0x010b, B:46:0x010f, B:48:0x0115, B:50:0x012a, B:52:0x012e, B:53:0x0136, B:54:0x013c, B:56:0x0144, B:57:0x0148, B:59:0x014e, B:61:0x015e, B:63:0x0164, B:64:0x0168, B:66:0x0170, B:67:0x0172, B:39:0x00e8, B:25:0x00a8, B:27:0x00ae, B:28:0x00b3, B:16:0x006b, B:20:0x0074, B:21:0x0077), top: B:71:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8 A[Catch: JSONException -> 0x0184, TryCatch #0 {JSONException -> 0x0184, blocks: (B:7:0x002f, B:10:0x0053, B:13:0x005a, B:15:0x0062, B:22:0x0081, B:24:0x00a3, B:32:0x00be, B:35:0x00c8, B:37:0x00dd, B:38:0x00e6, B:40:0x00ef, B:42:0x0101, B:45:0x010b, B:46:0x010f, B:48:0x0115, B:50:0x012a, B:52:0x012e, B:53:0x0136, B:54:0x013c, B:56:0x0144, B:57:0x0148, B:59:0x014e, B:61:0x015e, B:63:0x0164, B:64:0x0168, B:66:0x0170, B:67:0x0172, B:39:0x00e8, B:25:0x00a8, B:27:0x00ae, B:28:0x00b3, B:16:0x006b, B:20:0x0074, B:21:0x0077), top: B:71:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd A[Catch: JSONException -> 0x0184, TryCatch #0 {JSONException -> 0x0184, blocks: (B:7:0x002f, B:10:0x0053, B:13:0x005a, B:15:0x0062, B:22:0x0081, B:24:0x00a3, B:32:0x00be, B:35:0x00c8, B:37:0x00dd, B:38:0x00e6, B:40:0x00ef, B:42:0x0101, B:45:0x010b, B:46:0x010f, B:48:0x0115, B:50:0x012a, B:52:0x012e, B:53:0x0136, B:54:0x013c, B:56:0x0144, B:57:0x0148, B:59:0x014e, B:61:0x015e, B:63:0x0164, B:64:0x0168, B:66:0x0170, B:67:0x0172, B:39:0x00e8, B:25:0x00a8, B:27:0x00ae, B:28:0x00b3, B:16:0x006b, B:20:0x0074, B:21:0x0077), top: B:71:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8 A[Catch: JSONException -> 0x0184, TryCatch #0 {JSONException -> 0x0184, blocks: (B:7:0x002f, B:10:0x0053, B:13:0x005a, B:15:0x0062, B:22:0x0081, B:24:0x00a3, B:32:0x00be, B:35:0x00c8, B:37:0x00dd, B:38:0x00e6, B:40:0x00ef, B:42:0x0101, B:45:0x010b, B:46:0x010f, B:48:0x0115, B:50:0x012a, B:52:0x012e, B:53:0x0136, B:54:0x013c, B:56:0x0144, B:57:0x0148, B:59:0x014e, B:61:0x015e, B:63:0x0164, B:64:0x0168, B:66:0x0170, B:67:0x0172, B:39:0x00e8, B:25:0x00a8, B:27:0x00ae, B:28:0x00b3, B:16:0x006b, B:20:0x0074, B:21:0x0077), top: B:71:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b A[Catch: JSONException -> 0x0184, TryCatch #0 {JSONException -> 0x0184, blocks: (B:7:0x002f, B:10:0x0053, B:13:0x005a, B:15:0x0062, B:22:0x0081, B:24:0x00a3, B:32:0x00be, B:35:0x00c8, B:37:0x00dd, B:38:0x00e6, B:40:0x00ef, B:42:0x0101, B:45:0x010b, B:46:0x010f, B:48:0x0115, B:50:0x012a, B:52:0x012e, B:53:0x0136, B:54:0x013c, B:56:0x0144, B:57:0x0148, B:59:0x014e, B:61:0x015e, B:63:0x0164, B:64:0x0168, B:66:0x0170, B:67:0x0172, B:39:0x00e8, B:25:0x00a8, B:27:0x00ae, B:28:0x00b3, B:16:0x006b, B:20:0x0074, B:21:0x0077), top: B:71:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144 A[Catch: JSONException -> 0x0184, TryCatch #0 {JSONException -> 0x0184, blocks: (B:7:0x002f, B:10:0x0053, B:13:0x005a, B:15:0x0062, B:22:0x0081, B:24:0x00a3, B:32:0x00be, B:35:0x00c8, B:37:0x00dd, B:38:0x00e6, B:40:0x00ef, B:42:0x0101, B:45:0x010b, B:46:0x010f, B:48:0x0115, B:50:0x012a, B:52:0x012e, B:53:0x0136, B:54:0x013c, B:56:0x0144, B:57:0x0148, B:59:0x014e, B:61:0x015e, B:63:0x0164, B:64:0x0168, B:66:0x0170, B:67:0x0172, B:39:0x00e8, B:25:0x00a8, B:27:0x00ae, B:28:0x00b3, B:16:0x006b, B:20:0x0074, B:21:0x0077), top: B:71:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0170 A[Catch: JSONException -> 0x0184, TryCatch #0 {JSONException -> 0x0184, blocks: (B:7:0x002f, B:10:0x0053, B:13:0x005a, B:15:0x0062, B:22:0x0081, B:24:0x00a3, B:32:0x00be, B:35:0x00c8, B:37:0x00dd, B:38:0x00e6, B:40:0x00ef, B:42:0x0101, B:45:0x010b, B:46:0x010f, B:48:0x0115, B:50:0x012a, B:52:0x012e, B:53:0x0136, B:54:0x013c, B:56:0x0144, B:57:0x0148, B:59:0x014e, B:61:0x015e, B:63:0x0164, B:64:0x0168, B:66:0x0170, B:67:0x0172, B:39:0x00e8, B:25:0x00a8, B:27:0x00ae, B:28:0x00b3, B:16:0x006b, B:20:0x0074, B:21:0x0077), top: B:71:0x002f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private tb.bfo.a a(org.json.JSONObject r17) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bfo.a(org.json.JSONObject):tb.bfo$a");
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f25853a;
        public String b;
        public boolean c;
        public int d;
        public String e;
        public long f;
        public String g;
        public boolean h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;
        private Map<String, String> n;
        private Map<String, String> o;
        public String p;
        public boolean q;

        private a() {
            this.d = -1;
            this.n = new HashMap();
            this.o = null;
        }

        public Map<String, String> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.n;
        }

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            } else {
                this.n.put(str, str2);
            }
        }

        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                return;
            }
            if (this.o == null) {
                this.o = new HashMap();
            }
            this.o.put(str, str2);
        }

        public Map<String, String> b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.o;
        }
    }
}
