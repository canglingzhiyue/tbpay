package com.taobao.tao.recommend3.gateway.request;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.c;
import com.taobao.android.home.component.utils.j;
import com.taobao.android.home.component.utils.m;
import com.taobao.android.task.Coordinator;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.homepage.utils.n;
import com.taobao.monitor.procedure.s;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetPageData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKUtils;
import tb.gjv;
import tb.kge;
import tb.ksr;
import tb.kss;
import tb.lap;
import tb.lar;
import tb.opg;
import tb.oqd;

/* loaded from: classes.dex */
public class RequestTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.tao.recommend3.tracelog.b f20907a;
    public RemoteBusiness b;
    public AwesomeGetRequestParams c;
    public a d;
    public d e;
    public String f;
    public Map<String, String> i;
    public String j;
    public long k;
    public AwesomeMtopListener h = new AwesomeMtopListener();
    public opg g = new opg();

    static {
        kge.a(1476827953);
    }

    public static /* synthetic */ void a(RequestTask requestTask, d dVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("424a3b87", new Object[]{requestTask, dVar, map, new Boolean(z)});
        } else {
            requestTask.a(dVar, map, z);
        }
    }

    public static /* synthetic */ void a(RequestTask requestTask, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231e1a8d", new Object[]{requestTask, mtopResponse});
        } else {
            requestTask.a(mtopResponse);
        }
    }

    public static /* synthetic */ void a(RequestTask requestTask, MtopResponse mtopResponse, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5eb3e8d", new Object[]{requestTask, mtopResponse, str, new Long(j)});
        } else {
            requestTask.a(mtopResponse, str, j);
        }
    }

    public static /* synthetic */ void b(RequestTask requestTask, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2de4e2c", new Object[]{requestTask, mtopResponse});
        } else {
            requestTask.c(mtopResponse);
        }
    }

    public RequestTask(AwesomeGetRequestParams awesomeGetRequestParams, a aVar) {
        this.c = awesomeGetRequestParams;
        this.d = aVar;
        this.f20907a = HomePageUtility.a(awesomeGetRequestParams.containerParams.keySet());
        this.j = awesomeGetRequestParams.API_NAME;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.d.b;
    }

    public Set<String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("6dc1d418", new Object[]{this}) : this.c.containerParams.keySet();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.b;
        if (remoteBusiness == null) {
            return;
        }
        remoteBusiness.cancelRequest();
    }

    public boolean a(String str, String str2) {
        AwesomeGetContainerParams awesomeGetContainerParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        AwesomeGetRequestParams awesomeGetRequestParams = this.c;
        if (awesomeGetRequestParams != null && awesomeGetRequestParams.containerParams != null && (awesomeGetContainerParams = this.c.containerParams.get(str2)) != null) {
            return str.equals(awesomeGetContainerParams.requestType);
        }
        return false;
    }

    public String a(String str) {
        AwesomeGetContainerParams awesomeGetContainerParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        AwesomeGetRequestParams awesomeGetRequestParams = this.c;
        return (awesomeGetRequestParams == null || awesomeGetRequestParams.containerParams == null || (awesomeGetContainerParams = this.c.containerParams.get(str)) == null) ? "" : awesomeGetContainerParams.requestType;
    }

    public void a(d dVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c817808d", new Object[]{this, dVar, map});
        } else {
            a(dVar, map, false);
        }
    }

    private void a(d dVar, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad943e7", new Object[]{this, dVar, map, new Boolean(z)});
            return;
        }
        this.e = dVar;
        this.i = map;
        if (b().size() == 0) {
            return;
        }
        this.f = a(b().iterator().next());
        if (!z && TextUtils.equals(this.f, "coldStart")) {
            String a2 = a(false);
            if (TextUtils.equals(a2, "code_sign_free")) {
                this.c.API_NAME = "mtop.taobao.wireless.home.newface.awesome.newget";
            } else {
                com.taobao.android.home.component.utils.e.e("gateway.RequestTask", "SignFree code value:" + a2);
                ksr.b("sign_free_error_code", a2);
            }
        } else {
            this.c.API_NAME = this.j;
        }
        AwesomeGetRequestParams awesomeGetRequestParams = this.c;
        awesomeGetRequestParams.tryRequest = z;
        this.b = RemoteBusiness.build((IMTOPDataObject) awesomeGetRequestParams, gjv.b);
        this.b.mo1310setBizTopic(this.f);
        this.b.mo1333upstreamCompress(true);
        a aVar = this.d;
        if (aVar != null && aVar.c != null) {
            this.b.mo1305reqMethod(this.d.c);
        }
        if (map != null) {
            this.b.mo1297headers(map);
        }
        Boolean bool = (Boolean) m.a().a("enableZSTDDCompress", Boolean.class);
        if (bool != null && bool.booleanValue()) {
            this.b.mo1331supportZstdDictionary(true);
        }
        this.b.mo1296handler(com.taobao.gateway.dispatch.a.b().d());
        this.b.registerListener((IRemoteListener) this.h);
        if (j.a("mtopStreamParse", true)) {
            this.b.mo1330supportStreamJson(true);
        }
        if (TextUtils.equals(this.f, "coldStart")) {
            this.f20907a.b("mtopRequestParams");
            this.f20907a.a("mtopRequest", 1);
        }
        a aVar2 = this.d;
        if (aVar2 != null && aVar2.d) {
            lap.a("MTopRequest", "doRequest", " 预加载请求, requestType:" + this.f);
            this.g.a(this.b, this.d, this.c);
            return;
        }
        if (dVar != null) {
            dVar.a();
        }
        if (com.taobao.homepage.utils.m.a(this.f, dVar)) {
            lap.a("MTopRequest", "doRequest", " mock本地数据直接返回, requestType =" + this.f);
            return;
        }
        lap.a("MTopRequest", "doRequest", " 调用网络库开始正常发起请求");
        this.k = SystemClock.uptimeMillis();
        lar.k("mtop_startRequest");
        this.b.startRequest(AwesomeGetResponse.class);
        lar.l("mtop_startRequest");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:20|(2:21|22)|(6:24|26|27|(2:29|30)|32|(1:34)(7:35|(2:57|58)|(1:38)|39|(3:41|(4:44|(3:46|47|48)(1:50)|49|42)|51)|52|(1:54)(2:55|56)))|62|26|27|(0)|32|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e A[Catch: NumberFormatException -> 0x0073, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x0073, blocks: (B:30:0x0068, B:32:0x006e), top: B:64:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(boolean r10) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.recommend3.gateway.request.RequestTask.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1b
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r10)
            r1[r2] = r3
            java.lang.String r10 = "f223e6b4"
            java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L1b:
            java.lang.String r0 = "homeSignFree"
            boolean r0 = com.taobao.android.home.component.utils.j.a(r0, r3)
            if (r0 != 0) goto L27
            java.lang.String r10 = "code_orange_switch_off"
            return r10
        L27:
            java.lang.String r0 = "homepage_switch"
            if (r10 != 0) goto L3b
            boolean r10 = com.taobao.homepage.utils.i.e()
            if (r10 != 0) goto L3b
            java.lang.String r10 = "homeSignFreeAb"
            boolean r10 = com.taobao.android.home.component.utils.c.a.a(r0, r10, r2)
            if (r10 == 0) goto L3c
        L3b:
            r2 = 1
        L3c:
            if (r2 != 0) goto L41
            java.lang.String r10 = "code_ABTest_switch_off"
            return r10
        L41:
            boolean r10 = com.taobao.homepage.utils.i.c()
            if (r10 != 0) goto L4a
            java.lang.String r10 = "code_not_logged_in"
            return r10
        L4a:
            java.lang.String r10 = ""
            java.lang.String r1 = "homeSignFreeTime"
            java.lang.String r1 = com.taobao.android.home.component.utils.j.a(r1, r10)
            java.lang.String r2 = "homeSignFreeTimeOffset"
            java.lang.String r2 = com.taobao.android.home.component.utils.j.a(r2, r10)
            r3 = 0
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.NumberFormatException -> L67
            if (r5 != 0) goto L67
            long r5 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L67
            goto L68
        L67:
            r5 = r3
        L68:
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.NumberFormatException -> L73
            if (r1 != 0) goto L73
            long r1 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L73
            r3 = r1
        L73:
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 + r3
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 < 0) goto L7f
            java.lang.String r10 = "code_less_zhan_sign_free_time"
            return r10
        L7f:
            r1 = 10
            java.lang.String r2 = "homeSignFreeMaxNum"
            int r1 = com.taobao.android.home.component.utils.j.a(r2, r1)
            java.lang.String r2 = "homeSignFreeDateList"
            java.lang.String r10 = com.taobao.android.home.component.utils.j.a(r2, r10)
            r3 = 0
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            if (r4 != 0) goto L9c
            java.lang.Class<java.lang.Long> r4 = java.lang.Long.class
            java.util.List r3 = com.alibaba.fastjson.JSON.parseArray(r10, r4)     // Catch: java.lang.Exception -> L9c
        L9c:
            if (r3 != 0) goto La4
            java.util.ArrayList r3 = new java.util.ArrayList
            r10 = 5
            r3.<init>(r10)
        La4:
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto Ld6
            java.util.Iterator r4 = r3.iterator()
        Lb6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Ld6
            java.lang.Object r5 = r4.next()
            java.lang.Long r5 = (java.lang.Long) r5
            long r6 = r10.longValue()
            long r8 = r5.longValue()
            long r6 = r6 - r8
            r8 = 3600000(0x36ee80, double:1.7786363E-317)
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 < 0) goto Lb6
            r4.remove()
            goto Lb6
        Ld6:
            int r4 = r3.size()
            if (r4 < r1) goto Ldf
            java.lang.String r10 = "code_exceed_sign_free_num"
            return r10
        Ldf:
            r3.add(r10)
            java.lang.String r10 = com.alibaba.fastjson.JSON.toJSONString(r3)
            com.taobao.android.home.component.utils.c.a.b(r0, r2, r10)
            java.lang.String r10 = "code_sign_free"
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.recommend3.gateway.request.RequestTask.a(boolean):java.lang.String");
    }

    public boolean a(String str, MtopResponse mtopResponse) {
        Map<String, List<String>> headerFields;
        List<String> list;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1453b7b", new Object[]{this, str, mtopResponse})).booleanValue();
        }
        if (mtopResponse != null && TextUtils.equals(str, "coldStart") && TextUtils.equals(mtopResponse.getApi(), "mtop.taobao.wireless.home.newface.awesome.newget")) {
            if (TextUtils.equals(mtopResponse.getRetCode(), "FAIL_SYS_USER_VALIDATE")) {
                s.f18233a.d().a("USER_VALIDATE", "true");
                return true;
            } else if (mtopResponse.getResponseCode() == 200 && (headerFields = mtopResponse.getHeaderFields()) != null && !headerFields.isEmpty() && headerFields.containsKey("bx-signwl-retry-ts") && (list = headerFields.get("bx-signwl-retry-ts")) != null && list.size() > 0) {
                String str2 = list.get(0);
                if (!TextUtils.isEmpty(str2)) {
                    long j2 = 0;
                    try {
                        j = Long.parseLong(str2) * 1000;
                        try {
                            j2 = SDKUtils.getCorrectionTimeMillis() - System.currentTimeMillis();
                        } catch (NumberFormatException unused) {
                        }
                    } catch (NumberFormatException unused2) {
                        j = 0;
                    }
                    c.a.b("homepage_switch", "homeSignFreeTime", String.valueOf(j));
                    c.a.b("homepage_switch", "homeSignFreeTimeOffset", String.valueOf(j2));
                    return true;
                }
            }
        }
        return false;
    }

    public void a(AwesomeGetData awesomeGetData) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6637", new Object[]{this, awesomeGetData});
        } else if (awesomeGetData == null || awesomeGetData.getExt() == null) {
        } else {
            if (awesomeGetData.getExt().containsKey("homeSignFreeAb")) {
                str = awesomeGetData.getExt().getString("homeSignFreeAb");
                com.taobao.android.home.component.utils.e.e("gateway.RequestTask", "cacheSignFreeAbValue: " + str);
            } else {
                str = "false";
            }
            c.a.b("homepage_switch", "homeSignFreeAb", TextUtils.equals("true", str));
            ksr.b("sign_free_error_code", str);
        }
    }

    /* loaded from: classes.dex */
    public class AwesomeMtopListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1836749684);
            kge.a(-525336021);
        }

        public AwesomeMtopListener() {
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                onError(i, mtopResponse, obj);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            AwesomeGetResponse b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            String str = (mtopResponse == null || mtopResponse.getMtopStat() == null) ? null : mtopResponse.getMtopStat().falcoId;
            long uptimeMillis = SystemClock.uptimeMillis();
            if (TextUtils.equals(RequestTask.this.f, "coldStart") && n.e() && (b = com.taobao.homepage.utils.m.b()) != null) {
                baseOutDo = b;
            }
            traceMtopEnd();
            if (isResponseEmpty(baseOutDo)) {
                commitScrollNextPageError(mtopResponse);
                process(false, null, mtopResponse, obj);
                com.taobao.tao.linklog.a.b("netRequest", "result_error", "网络请求结果数据为空", "gateway.RequestTask", "response is empty");
                return;
            }
            RequestTask.a(RequestTask.this, mtopResponse, str, uptimeMillis);
            AwesomeGetResponse awesomeGetResponse = (AwesomeGetResponse) baseOutDo;
            process(true, awesomeGetResponse.mo2429getData(), mtopResponse, obj);
            RequestTask.this.a(awesomeGetResponse.mo2429getData());
            if (awesomeGetResponse.mo2429getData() != null) {
                m.a().a(awesomeGetResponse.mo2429getData().getExt());
            }
            RequestTask.a(RequestTask.this, mtopResponse);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            RequestTask requestTask = RequestTask.this;
            if (requestTask.a(requestTask.f, mtopResponse)) {
                RequestTask.a(RequestTask.this, mtopResponse);
                RequestTask requestTask2 = RequestTask.this;
                RequestTask.a(requestTask2, requestTask2.e, (Map) RequestTask.this.i, true);
                return;
            }
            traceMtopEnd();
            commitScrollNextPageError(mtopResponse);
            process(false, null, mtopResponse, obj);
            RequestTask.a(RequestTask.this, mtopResponse);
        }

        private void traceMtopEnd() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e338a75", new Object[]{this});
            } else if (!TextUtils.equals(RequestTask.this.f, "coldStart")) {
            } else {
                RequestTask.this.f20907a.b("mtopRequest");
                RequestTask.this.f20907a.a("homeDataProcess", 1);
            }
        }

        private boolean isResponseEmpty(BaseOutDo baseOutDo) {
            AwesomeGetData mo2429getData;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e8fc1675", new Object[]{this, baseOutDo})).booleanValue();
            }
            if (baseOutDo == null || baseOutDo.mo2429getData() == null || !(baseOutDo instanceof AwesomeGetResponse) || (mo2429getData = ((AwesomeGetResponse) baseOutDo).mo2429getData()) == null || mo2429getData.containers == null || mo2429getData.containers.isEmpty()) {
                return true;
            }
            boolean z = true;
            for (AwesomeGetContainerData awesomeGetContainerData : mo2429getData.containers.values()) {
                if (awesomeGetContainerData.getBaseData() == null && awesomeGetContainerData.getDeltaData() == null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    break;
                }
            }
            return z;
        }

        private void commitScrollNextPageError(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec42af8e", new Object[]{this, mtopResponse});
            } else if (!TextUtils.equals(RequestTask.this.f, "scrollNextPage")) {
            } else {
                if (mtopResponse == null) {
                    lap.a("MTopRequest", "commitScrollNextPageError", "response == null");
                    return;
                }
                lap.a("MTopRequest", "commitScrollNextPageError", "出现异常，没有下发数据" + mtopResponse.toString());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", (Object) mtopResponse.getRetCode());
                jSONObject.put("errorMsg", (Object) mtopResponse.getRetMsg());
                jSONObject.put(BioDetector.EXT_KEY_PAGENUM, (Object) getCurrentPageNum());
                jSONObject.put("s-rt", (Object) "-1");
                jSONObject.put("eagleeye-traceid", (Object) "-1");
                Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
                if (headerFields == null || headerFields.isEmpty()) {
                    kss.a("Page_Home", 19999, "ScrollNextPageRequestError", jSONObject);
                    return;
                }
                List<String> list = headerFields.get("s-rt");
                if (list != null) {
                    jSONObject.put("s-rt", (Object) list.get(0));
                }
                List<String> list2 = headerFields.get("EagleEye-TraceId");
                if (list2 != null) {
                    jSONObject.put("eagleeye-traceid", (Object) list2.get(0));
                }
                kss.a("Page_Home", 19999, "ScrollNextPageRequestError", jSONObject);
            }
        }

        private String getCurrentPageNum() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f00af7c5", new Object[]{this});
            }
            Map<String, AwesomeGetContainerParams> map = RequestTask.this.c.containerParams;
            if (map == null) {
                lap.a("MTopRequest", "commitScrollNextPageError", "containerParams == null");
                return "-1";
            }
            AwesomeGetContainerParams awesomeGetContainerParams = map.get(HomePageUtility.b(RequestTask.this.b()));
            if (awesomeGetContainerParams == null) {
                lap.a("MTopRequest", "commitScrollNextPageError", "awesomeGetContainerParams == null");
                return "-1";
            }
            AwesomeGetPageData awesomeGetPageData = awesomeGetContainerParams.pageParams;
            if (awesomeGetPageData == null) {
                lap.a("MTopRequest", "commitScrollNextPageError", "pageData == null");
                return "-1";
            }
            return String.valueOf(awesomeGetPageData.pageNum);
        }

        private void process(boolean z, AwesomeGetData awesomeGetData, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b508e122", new Object[]{this, new Boolean(z), awesomeGetData, mtopResponse, obj});
                return;
            }
            if (z) {
                if (RequestTask.this.e != null) {
                    RequestTask.this.e.a(awesomeGetData);
                    if (mtopResponse != null) {
                        ksr.a(mtopResponse.getApi(), mtopResponse.getV(), (Map<String, String>) null);
                    }
                }
            } else {
                if (mtopResponse != null) {
                    if (!TextUtils.isEmpty(mtopResponse.getMtopStat().fullTraceId)) {
                        ksr.a(mtopResponse.getApi(), mtopResponse.getV(), mtopResponse.getRetCode(), mtopResponse.getRetMsg(), "fullTraceID", mtopResponse.getMtopStat().fullTraceId);
                    } else {
                        ksr.a(mtopResponse.getApi(), mtopResponse.getV(), mtopResponse.getRetCode(), mtopResponse.getRetMsg(), null, null);
                    }
                }
                if (RequestTask.this.e != null && mtopResponse != null) {
                    RequestTask.this.e.a(translateErrorCode(mtopResponse), mtopResponse.getRetMsg());
                }
            }
            TLog.logd("gateway2-RequestTask.process", mtopResponse.getRetCode() + "," + mtopResponse.getApi());
        }

        private String translateErrorCode(MtopResponse mtopResponse) {
            String str;
            int indexOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("79a4614d", new Object[]{this, mtopResponse});
            }
            String retCode = mtopResponse.getRetCode();
            if (!TextUtils.equals("SUCCESS", retCode)) {
                return retCode;
            }
            String[] ret = mtopResponse.getRet();
            return (ret.length > 0 && (indexOf = (str = ret[0]).indexOf("::")) > 0) ? str.substring(0, indexOf) : retCode;
        }
    }

    private void a(MtopResponse mtopResponse, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4b8a6ed", new Object[]{this, mtopResponse, str, new Long(j)});
        } else if (mtopResponse == null || mtopResponse.getHeaderFields() == null) {
        } else {
            List<String> list = mtopResponse.getHeaderFields().get("s-rt");
            String str2 = "0";
            String str3 = (list == null || list.size() <= 0) ? str2 : list.get(0);
            List<String> list2 = mtopResponse.getHeaderFields().get(HttpHeaderConstant.X_BIN_LENGTH);
            if (list2 != null && list2.size() > 0) {
                str2 = list2.get(0);
            }
            List<String> list3 = mtopResponse.getHeaderFields().get("EagleEye-TraceId");
            String str4 = null;
            if (list3 != null && list3.size() > 0) {
                str4 = list3.get(0);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("eyeTraceid", str4);
            hashMap.put("falcoId", str);
            hashMap.put("serverRT", str3);
            hashMap.put("responseLength", str2);
            hashMap.put("homeApi", this.c.API_NAME);
            if (TextUtils.equals(this.f, "coldStart")) {
                s.f18233a.d().a("homeApi", this.c.API_NAME);
            }
            oqd.a(this.f, oqd.MTOP_STAGE_NETWORKREQUEST, 0L, j - this.k, hashMap, false);
        }
    }

    private void a(final MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
            return;
        }
        final JSONObject a2 = e.a(this.c);
        if (this.c == null || mtopResponse == null || mtopResponse.getMtopStat() == null) {
            return;
        }
        Coordinator.execute(new Runnable() { // from class: com.taobao.tao.recommend3.gateway.request.RequestTask.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (!n.n().C()) {
                    RequestTask.b(RequestTask.this, mtopResponse);
                }
                e.a(mtopResponse, a2);
            }
        });
    }

    private void c(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3dbcaf", new Object[]{this, mtopResponse});
            return;
        }
        try {
            com.taobao.tao.linklog.a.a("netRequest", "gateway.RequestTask", "AwesomeGetRequestParams ：" + JSON.toJSONString(this.c) + " ---- result : " + new String(mtopResponse.getBytedata()));
        } catch (OutOfMemoryError unused) {
            com.taobao.tao.linklog.a.b("netRequest", "gateway.RequestTask", "oom, no log.", "", "");
        } catch (Throwable th) {
            com.taobao.tao.linklog.a.b("netRequest", "gateway.RequestTask", "log error, no log.", "", th.getMessage());
        }
    }
}
