package com.taobao.android.layoutmanager.module;

import mtopsdk.common.util.StringUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.session.constants.SessionConstants;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.w;
import com.taobao.tao.flexbox.layoutmanager.module.AnyThread;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.IRemoteParserListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ProtocolEnum;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.intf.MtopPrefetch;
import mtopsdk.mtop.util.MtopStatistics;
import mtopsdk.mtop.util.ReflectUtil;
import tb.gvw;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogh;
import tb.ohe;

@AnyThread
/* loaded from: classes5.dex */
public class MtopModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_PREFETCH_TIMEOUT = 10000;
    public static final String KEY_MTOP_BIZ_ID = "bizId";
    public static final String KEY_MTOP_BIZ_TOPIC = "bizTopic";
    public static final String KEY_MTOP_HEADER_XBIZINFO = "x-biz-info";
    public static final String KEY_MTOP_HEADER_XBIZTYPE = "x-biz-type";
    public static final String KEY_PAGE_INDEX = "pageIndex";
    public static final String KEY_TOPIC = "topic";
    public static final String TAG = "mtop";
    private static int mtopRequestId;
    private static List<c> prefetchList;

    /* loaded from: classes5.dex */
    public interface a {
        void a(MtopBuilder mtopBuilder);
    }

    /* loaded from: classes5.dex */
    public interface b {
        boolean a(String str, Object obj, Object obj2);

        boolean a(Map map, Map map2);
    }

    public static /* synthetic */ String access$100(String str, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d60cd24f", new Object[]{str, map, new Boolean(z)}) : buildMtopRequestInfo(str, map, z);
    }

    public static /* synthetic */ void access$200(Map map, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2450ed31", new Object[]{map, mtopResponse});
        } else {
            addMtopStatistics(map, mtopResponse);
        }
    }

    public static /* synthetic */ List access$400() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6ee5f86c", new Object[0]) : prefetchList;
    }

    static {
        kge.a(75546360);
        kge.a(-818961104);
        mtopRequestId = 0;
        prefetchList = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class TNodeMtopRequest extends MtopRequest {
        private b interceptor;

        static {
            kge.a(-109576835);
        }

        TNodeMtopRequest(b bVar) {
            this.interceptor = bVar;
        }
    }

    /* loaded from: classes5.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f13239a;
        public String b;
        public JSONObject c;
        public b d;

        static {
            kge.a(1328472081);
        }

        public c(String str, String str2, JSONObject jSONObject, b bVar) {
            this.f13239a = str;
            this.b = str2;
            this.c = jSONObject;
            this.d = bVar;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            int hashCode = 527 + this.f13239a.hashCode();
            String str = this.b;
            if (str != null) {
                hashCode = (hashCode * 31) + str.hashCode();
            }
            JSONObject jSONObject = this.c;
            return jSONObject != null ? (hashCode * 31) + jSONObject.hashCode() : hashCode;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            b bVar = this.d;
            if (bVar == null) {
                bVar = ((c) obj).d;
            }
            c cVar = (c) obj;
            return MtopModule.requestEqual(this.f13239a, this.b, this.c, cVar.f13239a, cVar.b, cVar.c, bVar);
        }
    }

    public static void request(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e4d9ca9", new Object[]{cVar});
        } else {
            requestWithParser(cVar, null, null);
        }
    }

    public static void requestWithParser(g.c cVar, IRemoteBaseListener iRemoteBaseListener, IRemoteParserListener iRemoteParserListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc189c56", new Object[]{cVar, iRemoteBaseListener, iRemoteParserListener});
        } else {
            requestWithParserInner(cVar, iRemoteBaseListener, iRemoteParserListener, null);
        }
    }

    public static void requestWithParserInner(g.c cVar, IRemoteBaseListener iRemoteBaseListener, IRemoteParserListener iRemoteParserListener, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fecef1e2", new Object[]{cVar, iRemoteBaseListener, iRemoteParserListener, aVar});
        } else {
            requestWithParserInner(cVar, iRemoteBaseListener, iRemoteParserListener, aVar, null);
        }
    }

    public static void requestWithParserInner(final g.c cVar, final IRemoteBaseListener iRemoteBaseListener, final IRemoteParserListener iRemoteParserListener, a aVar, final b bVar) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean hasPrefetchMtop;
        c cVar2;
        HashMap hashMap;
        final g.d dVar;
        String str;
        int i3;
        int i4;
        c cVar3;
        RemoteBusiness remoteBusiness;
        HashMap hashMap2;
        HashMap hashMap3;
        String str2;
        String str3;
        boolean z3;
        int i5;
        String str4;
        final String str5;
        g.d dVar2;
        Iterator<Map.Entry<String, Object>> it;
        Iterator<Map.Entry<String, Object>> it2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eebcbe5b", new Object[]{cVar, iRemoteBaseListener, iRemoteParserListener, aVar, bVar});
            return;
        }
        boolean z4 = (iRemoteBaseListener == null && iRemoteParserListener == null) ? false : true;
        final long nanoTime = System.nanoTime();
        if (!(cVar.b instanceof JSONObject)) {
            return;
        }
        JSONObject jSONObject = (JSONObject) cVar.b;
        final String string = jSONObject.getString("api");
        final String string2 = jSONObject.getString("v");
        JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
        JSONObject jSONObject3 = jSONObject.getJSONObject("data");
        int intValue = jSONObject.getIntValue(SessionConstants.ECODE);
        int intValue2 = jSONObject.getIntValue(MspGlobalDefine.SESSION);
        String string3 = jSONObject.getString("type");
        int intValue3 = jSONObject.getIntValue("timeout");
        boolean booleanValue = jSONObject.getBooleanValue("isEnableWUA");
        int intValue4 = jSONObject.getIntValue("wuaType");
        String string4 = jSONObject.getString("bizId");
        int intValue5 = jSONObject.getIntValue(KEY_PAGE_INDEX);
        String string5 = jSONObject.getString("topic");
        JSONObject jSONObject4 = jSONObject.getJSONObject("options");
        if (jSONObject4 != null) {
            boolean booleanValue2 = jSONObject4.getBooleanValue("prefetch");
            z = booleanValue;
            int a2 = oec.a(jSONObject4.get("prefetchTimeout"), 10000);
            if (StringUtils.isEmpty(string4)) {
                string4 = jSONObject4.getString("bizId");
            }
            if (StringUtils.isEmpty(string5)) {
                string5 = jSONObject4.getString(KEY_MTOP_BIZ_TOPIC);
            }
            i = a2;
            z2 = booleanValue2;
        } else {
            z = booleanValue;
            i = 10000;
            z2 = false;
        }
        boolean booleanValue3 = jSONObject4 != null ? jSONObject4.getBooleanValue("trace") : false;
        if (z2) {
            c cVar4 = new c(string, string2, jSONObject3, bVar);
            i2 = i;
            prefetchList.add(cVar4);
            cVar2 = cVar4;
            hasPrefetchMtop = false;
        } else {
            i2 = i;
            hasPrefetchMtop = hasPrefetchMtop(string, string2, jSONObject3, bVar);
            cVar2 = null;
        }
        g.d dVar3 = cVar.c;
        c cVar5 = cVar2;
        TNodeMtopRequest tNodeMtopRequest = new TNodeMtopRequest(bVar);
        if (string != null) {
            tNodeMtopRequest.setApiName(string);
        }
        if (string2 != null) {
            tNodeMtopRequest.setVersion(string2);
        }
        tNodeMtopRequest.setNeedEcode(intValue > 0);
        tNodeMtopRequest.setNeedSession(intValue2 > 0);
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            hashMap = null;
        } else {
            HashMap hashMap4 = new HashMap();
            Iterator<Map.Entry<String, Object>> it3 = jSONObject2.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry<String, Object> next = it3.next();
                if (next == null || next.getValue() == null) {
                    it2 = it3;
                } else {
                    it2 = it3;
                    hashMap4.put(next.getKey(), next.getValue().toString());
                }
                it3 = it2;
            }
            hashMap = hashMap4;
        }
        final HashMap hashMap5 = new HashMap();
        if (jSONObject3 != null) {
            Iterator<Map.Entry<String, Object>> it4 = jSONObject3.entrySet().iterator();
            while (it4.hasNext()) {
                Map.Entry<String, Object> next2 = it4.next();
                if (next2 == null || next2.getValue() == null) {
                    it = it4;
                } else {
                    it = it4;
                    hashMap5.put(next2.getKey(), next2.getValue().toString());
                }
                it4 = it;
            }
        }
        tNodeMtopRequest.dataParams = hashMap5;
        tNodeMtopRequest.setData(ReflectUtil.convertMapToDataStr(hashMap5));
        RemoteBusiness build = RemoteBusiness.build((MtopRequest) tNodeMtopRequest);
        if (cVar.i != null) {
            build.mo1296handler(cVar.i);
        } else if (!z4 && cVar.f19938a != null) {
            build.mo1296handler(cVar.f19938a.E());
        }
        final String buildRequestId = buildRequestId(string, hashMap5);
        ogh.a("mtop request start" + buildRequestId + " prefetch:" + z2);
        if (iRemoteParserListener == null && iRemoteBaseListener == null && dVar3 == null) {
            dVar = dVar3;
            remoteBusiness = build;
            hashMap2 = hashMap5;
            hashMap3 = hashMap;
            str = "trace";
            i3 = intValue3;
            i4 = i2;
            cVar3 = cVar5;
            str2 = string;
            str3 = string5;
            z3 = z2;
            i5 = intValue5;
            str4 = string3;
        } else {
            dVar = dVar3;
            str = "trace";
            i3 = intValue3;
            i4 = i2;
            cVar3 = cVar5;
            remoteBusiness = build;
            hashMap2 = hashMap5;
            hashMap3 = hashMap;
            str2 = string;
            str3 = string5;
            z3 = z2;
            i5 = intValue5;
            str4 = string3;
            remoteBusiness.registeListener((IRemoteListener) new TNodeMtopListener() { // from class: com.taobao.android.layoutmanager.module.MtopModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteParserListener
                public void parseResponse(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("12969fa0", new Object[]{this, mtopResponse});
                        return;
                    }
                    IRemoteParserListener iRemoteParserListener2 = IRemoteParserListener.this;
                    if (iRemoteParserListener2 == null) {
                        return;
                    }
                    iRemoteParserListener2.parseResponse(mtopResponse);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i6, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    boolean z5 = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i6), mtopResponse, obj});
                        return;
                    }
                    ogh.a("mtop request fail " + buildRequestId);
                    MtopStatistics mtopStat = mtopResponse.getMtopStat();
                    String str6 = string;
                    long nanoTime2 = System.nanoTime() - nanoTime;
                    String str7 = string2;
                    Map map = hashMap5;
                    String str8 = "";
                    String str9 = mtopStat != null ? mtopStat.fullTraceId : str8;
                    if (mtopStat != null) {
                        str8 = mtopStat.eagleEyeTraceId;
                    }
                    w.b bVar2 = new w.b(str6, nanoTime2, false, str7, map, str9, str8);
                    w.a(cVar.f19938a, bVar2, mtopStat != null && mtopStat.isPrefetch);
                    String str10 = mtopResponse.getRetCode() + "::" + mtopResponse.getRetMsg();
                    StringBuilder sb = new StringBuilder();
                    sb.append("mtop onSystemError ");
                    sb.append(str10);
                    String str11 = string;
                    Map map2 = bVar2.e;
                    if (mtopStat == null || !mtopStat.isPrefetch) {
                        z5 = false;
                    }
                    sb.append(MtopModule.access$100(str11, map2, z5));
                    ogg.c("mtop", sb.toString());
                    if (dVar != null) {
                        JSONObject jSONObject5 = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.add(str10);
                        jSONObject5.put("error", (Object) jSONArray);
                        MtopModule.access$200(jSONObject5, mtopResponse);
                        dVar.a(cVar, jSONObject5);
                    } else {
                        IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                        if (iRemoteBaseListener2 != null) {
                            iRemoteBaseListener2.onSystemError(i6, mtopResponse, obj);
                        }
                    }
                    ogh.b();
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i6, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    boolean z5 = false;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i6), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    MtopStatistics mtopStat = mtopResponse.getMtopStat();
                    w.b bVar2 = new w.b(string, System.nanoTime() - nanoTime, true, string2, hashMap5, mtopStat != null ? mtopStat.fullTraceId : "", mtopStat != null ? mtopStat.eagleEyeTraceId : "");
                    StringBuilder sb = new StringBuilder();
                    sb.append("mtop onSuccess, ");
                    sb.append(MtopModule.access$100(string, bVar2.e, mtopStat != null && mtopStat.isPrefetch));
                    ogg.c("mtop", sb.toString());
                    if (dVar == null && iRemoteBaseListener == null) {
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("mtop request success ");
                    sb2.append(buildRequestId);
                    sb2.append(" prefetch:");
                    sb2.append(mtopStat != null && mtopStat.isPrefetch);
                    ogh.a(sb2.toString());
                    ab abVar = cVar.f19938a;
                    if (mtopStat != null && mtopStat.isPrefetch) {
                        z5 = true;
                    }
                    w.a(abVar, bVar2, z5);
                    if (dVar != null) {
                        JSONObject originFastJsonObject = mtopResponse.getOriginFastJsonObject();
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("data", (Object) originFastJsonObject);
                        MtopModule.access$200(jSONObject5, mtopResponse);
                        dVar.a(cVar, jSONObject5);
                    } else {
                        IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                        if (iRemoteBaseListener2 != null) {
                            iRemoteBaseListener2.onSuccess(i6, mtopResponse, baseOutDo, obj);
                        }
                    }
                    ogh.b();
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i6, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    boolean z5 = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i6), mtopResponse, obj});
                        return;
                    }
                    ogh.a("mtop request fail " + buildRequestId);
                    MtopStatistics mtopStat = mtopResponse.getMtopStat();
                    String str6 = string;
                    long nanoTime2 = System.nanoTime() - nanoTime;
                    String str7 = string2;
                    Map map = hashMap5;
                    String str8 = "";
                    String str9 = mtopStat != null ? mtopStat.fullTraceId : str8;
                    if (mtopStat != null) {
                        str8 = mtopStat.eagleEyeTraceId;
                    }
                    w.b bVar2 = new w.b(str6, nanoTime2, false, str7, map, str9, str8);
                    w.a(cVar.f19938a, bVar2, mtopStat != null && mtopStat.isPrefetch);
                    String str10 = mtopResponse.getRetCode() + "::" + mtopResponse.getRetMsg();
                    StringBuilder sb = new StringBuilder();
                    sb.append("mtop onError: ");
                    sb.append(str10);
                    String str11 = string;
                    Map map2 = bVar2.e;
                    if (mtopStat == null || !mtopStat.isPrefetch) {
                        z5 = false;
                    }
                    sb.append(MtopModule.access$100(str11, map2, z5));
                    ogg.c("mtop", sb.toString());
                    if (dVar != null) {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("error", (Object) str10);
                        MtopModule.access$200(jSONObject5, mtopResponse);
                        dVar.a(cVar, jSONObject5);
                    } else {
                        IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                        if (iRemoteBaseListener2 != null) {
                            iRemoteBaseListener2.onError(i6, mtopResponse, obj);
                        }
                    }
                    ogh.b();
                }
            });
        }
        remoteBusiness.mo1303protocol(ProtocolEnum.HTTPSECURE);
        remoteBusiness.mo1312setConnectionTimeoutMilliSecond(i3);
        remoteBusiness.mo1326setSocketTimeoutMilliSecond(i3);
        remoteBusiness.mo1330supportStreamJson(true);
        remoteBusiness.mo1340setBizId(82);
        StringBuilder sb = new StringBuilder();
        sb.append("bizTopic= ");
        sb.append(str3);
        sb.append(", bizId=");
        String str6 = string4;
        sb.append(str6);
        sb.append(" pageIndex:");
        sb.append(i5);
        ogg.a("mtop", sb.toString());
        if (!StringUtils.isEmpty(str6)) {
            remoteBusiness.mo1309setBizId(str6);
        }
        if (!StringUtils.isEmpty(str3)) {
            remoteBusiness.mo1310setBizTopic(str3);
        }
        if (i5 > 0) {
            remoteBusiness.mo1319setPageIndex(i5);
        }
        if ("POST".equalsIgnoreCase(str4)) {
            remoteBusiness.mo1305reqMethod(MethodEnum.POST);
        }
        if (!z3 && !hasPrefetchMtop) {
            remoteBusiness.mo1334useCache();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("prefetchrequest ");
            str5 = str2;
            sb2.append(str5);
            sb2.append(" ;;; useCache()");
            ogg.a("mtop", sb2.toString());
        } else {
            str5 = str2;
            ogg.a("mtop", "prefetchrequest " + str5);
        }
        if (z) {
            remoteBusiness.mo1335useWua();
            remoteBusiness.mo1336useWua(intValue4);
        }
        remoteBusiness.mo1341setErrorNotifyAfterCache(true);
        HashMap hashMap6 = hashMap3;
        if (hashMap6 != null) {
            remoteBusiness.mo1297headers((Map<String, String>) hashMap6);
        }
        boolean z5 = z3;
        final HashMap hashMap7 = hashMap2;
        w.a(cVar.f19938a, str5, hashMap7, z5);
        ogg.c("mtop", "start mtop request: " + buildMtopRequestInfo(str5, hashMap7, z5));
        if (z5) {
            remoteBusiness.mo1301prefetchComparator(new MtopPrefetch.IPrefetchComparator() { // from class: com.taobao.android.layoutmanager.module.MtopModule.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchComparator
                public MtopPrefetch.CompareResult compare(MtopBuilder mtopBuilder, MtopBuilder mtopBuilder2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (MtopPrefetch.CompareResult) ipChange2.ipc$dispatch("cca63c2e", new Object[]{this, mtopBuilder, mtopBuilder2});
                    }
                    MtopPrefetch.CompareResult compareResult = new MtopPrefetch.CompareResult();
                    MtopRequest mtopRequest = mtopBuilder.getMtopContext().b;
                    MtopRequest mtopRequest2 = mtopBuilder2.getMtopContext().b;
                    b bVar2 = b.this;
                    if (bVar2 == null) {
                        if (mtopRequest instanceof TNodeMtopRequest) {
                            bVar2 = ((TNodeMtopRequest) mtopRequest).interceptor;
                        }
                        if (bVar2 == null && (mtopRequest2 instanceof TNodeMtopRequest)) {
                            bVar2 = ((TNodeMtopRequest) mtopRequest2).interceptor;
                        }
                    }
                    compareResult.setSame(MtopModule.requestEqual(mtopRequest.getApiName(), mtopRequest.getVersion(), mtopRequest.dataParams, mtopRequest2.getApiName(), mtopRequest2.getVersion(), mtopRequest2.dataParams, bVar2));
                    ogg.a("mtop", "prefetchrequest 默认IPrefetchComparator compare isSame: " + compareResult.isSame());
                    return compareResult;
                }
            });
            final c cVar6 = cVar3;
            remoteBusiness.mo1300prefetch(i4, new MtopPrefetch.IPrefetchCallback() { // from class: com.taobao.android.layoutmanager.module.MtopModule.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchCallback
                public void onPrefetch(String str7, HashMap<String, String> hashMap8) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("58e86b4c", new Object[]{this, str7, hashMap8});
                        return;
                    }
                    w.a(g.c.this.f19938a, str7, str5, hashMap7);
                    ogg.c("mtop", "TNode mtop prefetch type:" + str7 + " api:" + cVar6.f13239a);
                    if (oeb.s()) {
                        if ("TYPE_MISS".equals(str7) || cVar6 == null) {
                            return;
                        }
                        MtopModule.access$400().remove(cVar6);
                    } else if (!"TYPE_HIT".equals(str7) && !"TYPE_EXPIRE".equals(str7)) {
                    } else {
                        MtopModule.access$400().clear();
                    }
                }
            });
        }
        remoteBusiness.startRequest();
        if (booleanValue3 && (dVar2 = dVar) != null) {
            JSONObject jSONObject5 = new JSONObject();
            if (remoteBusiness.mtopProp != null) {
                jSONObject5.put("traceId", (Object) remoteBusiness.mtopProp.clientTraceId);
            }
            jSONObject5.put(str, (Object) true);
            dVar2.a(cVar, jSONObject5);
        }
        if (aVar != null) {
            aVar.a(remoteBusiness);
        }
        ogh.b();
    }

    private static boolean hasPrefetchMtop(String str, String str2, JSONObject jSONObject, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abf04139", new Object[]{str, str2, jSONObject, bVar})).booleanValue() : prefetchList.contains(new c(str, str2, jSONObject, bVar));
    }

    public static boolean requestEqual(String str, String str2, Map map, String str3, String str4, Map map2, b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6147ec49", new Object[]{str, str2, map, str3, str4, map2, bVar})).booleanValue();
        }
        if (!str.equals(str3) || !str2.equals(str4)) {
            z = false;
        }
        return z ? z & paramsEqual(map, map2, bVar) : z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
        if (r9.a(r1, r0, r4) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean defalutParamsEqual(java.util.Map r7, java.util.Map r8, com.taobao.android.layoutmanager.module.MtopModule.b r9) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.layoutmanager.module.MtopModule.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1f
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r7
            r1[r2] = r8
            r7 = 2
            r1[r7] = r9
            java.lang.String r7 = "fd4ad9a3"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L1f:
            int r0 = r7.size()     // Catch: java.lang.Throwable -> L8f
            int r1 = r8.size()     // Catch: java.lang.Throwable -> L8f
            if (r0 == r1) goto L2a
            return r3
        L2a:
            java.util.Set r7 = r7.entrySet()     // Catch: java.lang.Throwable -> L8f
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L8f
        L32:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L8f
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L57
            java.lang.Object r0 = r8.get(r1)     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L56
            boolean r0 = r8.containsKey(r1)     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L32
        L56:
            return r3
        L57:
            java.lang.Object r4 = r8.get(r1)     // Catch: java.lang.Throwable -> L8f
            boolean r5 = r0.equals(r4)     // Catch: java.lang.Throwable -> L8f
            if (r5 != 0) goto L32
            java.lang.String r5 = "params"
            boolean r5 = r1.equals(r5)     // Catch: java.lang.Throwable -> L8f
            if (r5 == 0) goto L85
            boolean r5 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L8f
            if (r5 == 0) goto L85
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L8f
            if (r5 == 0) goto L85
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L8f
            com.alibaba.fastjson.JSONObject r5 = com.alibaba.fastjson.JSON.parseObject(r5)     // Catch: java.lang.Throwable -> L8f
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L8f
            com.alibaba.fastjson.JSONObject r6 = com.alibaba.fastjson.JSON.parseObject(r6)     // Catch: java.lang.Throwable -> L8f
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L8f
            if (r5 != 0) goto L32
        L85:
            if (r9 == 0) goto L8d
            boolean r0 = r9.a(r1, r0, r4)     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L32
        L8d:
            return r3
        L8e:
            return r2
        L8f:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "defalutParamsEqual error:"
            r8.append(r9)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            tb.ogg.b(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.layoutmanager.module.MtopModule.defalutParamsEqual(java.util.Map, java.util.Map, com.taobao.android.layoutmanager.module.MtopModule$b):boolean");
    }

    private static boolean paramsEqual(Map map, Map map2, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cee231b2", new Object[]{map, map2, bVar})).booleanValue();
        }
        if (map == null && map2 == null) {
            return true;
        }
        if (map != null && map2 != null) {
            try {
                if (bVar != null) {
                    return bVar.a(map, map2);
                }
                return defalutParamsEqual(map, map2, bVar);
            } catch (Exception e) {
                ogg.b("paramsEqual error:" + e.getMessage());
            }
        }
        return false;
    }

    private static void addMtopStatistics(Map map, MtopResponse mtopResponse) {
        String str;
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc863d7", new Object[]{map, mtopResponse});
            return;
        }
        try {
            MtopStatistics mtopStat = mtopResponse.getMtopStat();
            if (mtopResponse.getHeaderFields() != null) {
                if (oeb.v()) {
                    map.put("headers", oec.c((Map) mtopResponse.getHeaderFields()));
                }
                List<String> list2 = mtopResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2);
                str = (list2 == null || list2.isEmpty()) ? null : list2.get(0);
                if (StringUtils.isEmpty(str) && (list = mtopResponse.getHeaderFields().get("eagleeye-traceid")) != null && !list.isEmpty()) {
                    str = list.get(0);
                }
            } else {
                str = null;
            }
            if (StringUtils.isEmpty(str)) {
                str = mtopStat.eagleEyeTraceId;
            }
            map.put("traceId", mtopStat.fullTraceId);
            map.put("eagleeyeTraceId", str);
            map.put("httpResponseCode", Integer.valueOf(mtopResponse.getResponseCode()));
            map.put("isPrefetch", Boolean.valueOf(mtopStat.isPrefetch));
            map.put(gvw.RENDER_RESULT_IS_FROM_CACHE, Integer.valueOf(mtopStat.getRbStatData().isCache));
            map.put("isLoginCancel", null);
            map.put("isCacheExpired", null);
        } catch (Throwable th) {
            ogg.b("addMtopStatistics: " + th.getMessage());
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class TNodeMtopListener implements IRemoteBaseListener, IRemoteParserListener {
        static {
            kge.a(-1657464954);
            kge.a(-525336021);
            kge.a(-62701575);
        }

        private TNodeMtopListener() {
        }
    }

    private static String buildMtopRequestInfo(String str, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb99f399", new Object[]{str, map, new Boolean(z)});
        }
        ohe.a a2 = ohe.a();
        a2.a(" api: ").a(str).a("params: ").a(map != null ? JSON.toJSONString(map) : "").a("isprefetch: ").a(Boolean.valueOf(z));
        return a2.toString();
    }

    private static String buildRequestId(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e9c2e88", new Object[]{str, map});
        }
        String str2 = null;
        if (map != null) {
            str2 = map.get("entityId");
        }
        if (StringUtils.isEmpty(str2)) {
            int i = mtopRequestId;
            mtopRequestId = i + 1;
            str2 = String.valueOf(i);
        }
        return str + "|" + str2;
    }

    public static Map<String, String> appendHeaderXBizInfo(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b197e06d", new Object[]{map, str});
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (map.containsKey(KEY_MTOP_HEADER_XBIZINFO)) {
            map.put(KEY_MTOP_HEADER_XBIZINFO, map.get(KEY_MTOP_HEADER_XBIZINFO) + ";" + str);
        } else {
            map.put(KEY_MTOP_HEADER_XBIZINFO, str);
        }
        return map;
    }
}
