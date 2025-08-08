package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.request.CachedMainResponse;
import com.alibaba.android.nextrpc.request.NextRpcRequest;
import com.alibaba.android.nextrpc.request.NextRpcResponseCallbackV2;
import com.alibaba.android.nextrpc.request.RemoteMainResponse;
import com.alibaba.android.nextrpc.request.d;
import com.alibaba.android.nextrpc.request.e;
import com.alibaba.android.nextrpc.request.internal.mtop.MtopRequestClient;
import com.alibaba.android.nextrpc.request.internal.mtop.c;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.common.MtopCacheEvent;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.mto;

/* loaded from: classes2.dex */
public class bfq implements com.alibaba.android.nextrpc.request.b, d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, List<bfq>> b = new HashMap();
    private static final Object d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public a f25854a;
    private final Context c;
    private final String e;
    private Map<String, com.alibaba.android.nextrpc.request.internal.mtop.b> f = new ConcurrentHashMap();

    /* renamed from: tb.bfq$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25856a = new int[NextRpcRequest.AttachedResponseStrategy.values().length];

        static {
            try {
                f25856a[NextRpcRequest.AttachedResponseStrategy.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25856a[NextRpcRequest.AttachedResponseStrategy.IMMEDIATELY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static /* synthetic */ void a(bfq bfqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4213415", new Object[]{bfqVar, str});
        } else {
            bfqVar.a(str);
        }
    }

    public bfq(Context context, String str) {
        this.c = context.getApplicationContext();
        this.e = str;
        synchronized (d) {
            List<bfq> list = b.get(str);
            list = list == null ? new ArrayList<>() : list;
            list.add(this);
            b.put(str, list);
        }
        if (!StringUtils.isEmpty(str)) {
            this.f25854a = new a(this.f);
            com.alibaba.android.nextrpc.internal.accs.a.a().a(context, str, this.f25854a);
        }
        com.alibaba.android.nextrpc.internal.utils.a.a(context);
    }

    @Override // com.alibaba.android.nextrpc.request.b
    public String a(NextRpcRequest nextRpcRequest, e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8335ff02", new Object[]{this, nextRpcRequest, eVar}) : a(nextRpcRequest, (com.alibaba.android.nextrpc.request.a) eVar);
    }

    @Override // com.alibaba.android.nextrpc.request.d
    public String a(NextRpcRequest nextRpcRequest, NextRpcResponseCallbackV2 nextRpcResponseCallbackV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("69d67451", new Object[]{this, nextRpcRequest, nextRpcResponseCallbackV2}) : a(nextRpcRequest, (com.alibaba.android.nextrpc.request.a) nextRpcResponseCallbackV2);
    }

    @Override // com.alibaba.android.nextrpc.request.b, com.alibaba.android.nextrpc.request.d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        synchronized (d) {
            List<bfq> list = b.get(this.e);
            if (list != null) {
                list.remove(this);
                if (list.size() == 0) {
                    b.remove(this.e);
                }
            }
        }
        if (!StringUtils.isEmpty(this.e) && this.f25854a != null) {
            com.alibaba.android.nextrpc.internal.accs.a.a().b(this.c, this.e, this.f25854a);
        }
        for (String str : this.f.keySet()) {
            if (str != null) {
                com.alibaba.android.nextrpc.request.internal.mtop.b bVar = this.f.get(str);
                if (bVar instanceof com.alibaba.android.nextrpc.request.internal.mtop.a) {
                    ((com.alibaba.android.nextrpc.request.internal.mtop.a) bVar).d();
                }
            }
        }
    }

    private void a(String str, com.alibaba.android.nextrpc.request.internal.mtop.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84aff4e0", new Object[]{this, str, bVar});
        } else {
            this.f.put(str, bVar);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Map<String, com.alibaba.android.nextrpc.request.internal.mtop.b> map = this.f;
        if (map == null) {
            return;
        }
        map.remove(str);
    }

    private String a(NextRpcRequest nextRpcRequest, com.alibaba.android.nextrpc.request.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50d228fe", new Object[]{this, nextRpcRequest, aVar});
        }
        b bVar = new b();
        String a2 = bVar.a(nextRpcRequest, aVar, new c() { // from class: tb.bfq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.nextrpc.request.internal.mtop.c
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else {
                    bfq.a(bfq.this, str);
                }
            }
        });
        UnifyLog.d("NextRpcRequestClientImpl", "Current reqId = " + a2 + " ," + nextRpcRequest.getMtopBusiness().request.toString(), new Object[0]);
        a(a2, bVar);
        return a2;
    }

    /* loaded from: classes2.dex */
    public static class a implements com.alibaba.android.nextrpc.internal.accs.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Map<String, com.alibaba.android.nextrpc.request.internal.mtop.b> f25857a;
        public Handler b = new Handler(Looper.getMainLooper());

        public static /* synthetic */ void a(a aVar, String str, String str2, String str3, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a30188a4", new Object[]{aVar, str, str2, str3, jSONObject});
            } else {
                aVar.b(str, str2, str3, jSONObject);
            }
        }

        public a(Map<String, com.alibaba.android.nextrpc.request.internal.mtop.b> map) {
            this.f25857a = map;
        }

        @Override // com.alibaba.android.nextrpc.internal.accs.b
        public void a(final String str, final String str2, final String str3, final JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d5d0b6a", new Object[]{this, str, str2, str3, jSONObject});
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                b(str, str2, str3, jSONObject);
            } else {
                this.b.post(new Runnable() { // from class: tb.bfq.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.a(a.this, str, str2, str3, jSONObject);
                        }
                    }
                });
            }
        }

        private void b(String str, String str2, String str3, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c839ac9", new Object[]{this, str, str2, str3, jSONObject});
            } else if (jSONObject != null && !jSONObject.isEmpty()) {
                String a2 = a(jSONObject);
                UnifyLog.b("NextRpcRequestClientImpl", "Received accs data,current reqId = " + a2, new Object[0]);
                for (Map.Entry<String, com.alibaba.android.nextrpc.request.internal.mtop.b> entry : this.f25857a.entrySet()) {
                    com.alibaba.android.nextrpc.request.internal.mtop.b value = entry.getValue();
                    if (entry.getKey().equals(a2)) {
                        value.a(str, str2, str3, jSONObject);
                    }
                }
            }
        }

        public static String a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject}) : jSONObject.getString("reqId");
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements com.alibaba.android.nextrpc.request.internal.mtop.a, com.alibaba.android.nextrpc.request.internal.mtop.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private RemoteMainResponse b;
        private NextRpcRequest c;
        private String e;
        private e h;
        private NextRpcResponseCallbackV2 i;
        private c j;
        private String k;
        private Handler f = new Handler(Looper.getMainLooper());
        private long g = 30000;
        private bfs d = new bfr();

        public static /* synthetic */ RemoteMainResponse a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RemoteMainResponse) ipChange.ipc$dispatch("16e0d21a", new Object[]{bVar}) : bVar.b;
        }

        public static /* synthetic */ void a(b bVar, String str, Object obj, String str2, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bf29968", new Object[]{bVar, str, obj, str2, map});
            } else {
                bVar.a(str, obj, str2, map);
            }
        }

        public static /* synthetic */ NextRpcResponseCallbackV2 b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (NextRpcResponseCallbackV2) ipChange.ipc$dispatch("aca653a9", new Object[]{bVar}) : bVar.i;
        }

        @Override // com.alibaba.android.nextrpc.request.internal.mtop.b
        public String a(NextRpcRequest nextRpcRequest, com.alibaba.android.nextrpc.request.a aVar, c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5c81ccf1", new Object[]{this, nextRpcRequest, aVar, cVar});
            }
            if (aVar instanceof e) {
                this.h = (e) aVar;
            } else if (aVar instanceof NextRpcResponseCallbackV2) {
                this.i = (NextRpcResponseCallbackV2) aVar;
            }
            this.c = nextRpcRequest;
            this.j = cVar;
            this.e = bfw.a();
            if (nextRpcRequest.getAllTimeOutSeconds() > mto.a.GEO_NOT_SUPPORT) {
                this.g = (long) (nextRpcRequest.getAllTimeOutSeconds() * 1000.0d);
            }
            if (this.g < nextRpcRequest.getMtopBusiness().mtopProp.connTimeout) {
                nextRpcRequest.getMtopBusiness().mo1312setConnectionTimeoutMilliSecond((int) this.g);
            }
            Map<String, String> requestHeaders = nextRpcRequest.getMtopBusiness().mtopProp.getRequestHeaders();
            if (requestHeaders == null) {
                requestHeaders = new HashMap<>();
            }
            requestHeaders.put("nextrpc-req-id", this.e);
            nextRpcRequest.getMtopBusiness().mtopProp.setRequestHeaders(requestHeaders);
            this.k = String.valueOf(System.currentTimeMillis());
            HashMap hashMap = new HashMap();
            hashMap.put(joq.STAGE_NETWORK, this.k);
            hashMap.put("useAttachedQueue", "true");
            try {
                a("nextrpc-main-request", nextRpcRequest.getMtopBusiness().request.getApiName(), "", hashMap);
            } catch (Throwable th) {
                th.printStackTrace();
                UnifyLog.d("NextRpcRequestClientV2Impl", "UserTracker exception !", new Object[0]);
            }
            JSONObject clientPerformance = nextRpcRequest.getClientPerformance();
            if (clientPerformance != null) {
                clientPerformance.put("mtopSend", (Object) Long.valueOf(System.currentTimeMillis()));
            }
            new MtopRequestClient(nextRpcRequest.getMtopBusiness()).a(this);
            b();
            UnifyLog.a("NextRpcRequestClientV2Impl", "requestHeaderId = " + this.e, new Object[0]);
            return this.e;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.e;
        }

        @Override // com.alibaba.android.nextrpc.request.internal.mtop.b
        public void a(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f4c707c", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            if (mtopResponse != null) {
                this.b = new RemoteMainResponse(this.e, i, mtopResponse, null, obj);
                e eVar = this.h;
                if (eVar != null) {
                    eVar.b(this.b);
                }
                NextRpcResponseCallbackV2 nextRpcResponseCallbackV2 = this.i;
                if (nextRpcResponseCallbackV2 != null) {
                    nextRpcResponseCallbackV2.a(-1, this.b, null, true);
                }
            }
            UnifyLog.b("NextRpcRequestClientV2Impl", "NextRpc onSystemError body=" + this.b.getBody(), new Object[0]);
            d();
            a("nextrpc-main-response-failed", this.b, (String) null, (Map<String, String>) null);
        }

        @Override // com.alibaba.android.nextrpc.request.internal.mtop.b
        public void b(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac39879b", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            if (mtopResponse != null) {
                this.b = new RemoteMainResponse(a(), i, mtopResponse, null, obj);
                e eVar = this.h;
                if (eVar != null) {
                    eVar.a(this.b);
                }
                NextRpcResponseCallbackV2 nextRpcResponseCallbackV2 = this.i;
                if (nextRpcResponseCallbackV2 != null) {
                    nextRpcResponseCallbackV2.a(-1, this.b, null, true);
                }
            }
            UnifyLog.b("NextRpcRequestClientV2Impl", "NextRpc onError body=" + this.b.getBody(), new Object[0]);
            d();
            a("nextrpc-main-response-failed", this.b, (String) null, f());
        }

        @Override // com.alibaba.android.nextrpc.request.internal.mtop.b
        public void a(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21238c56", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            JSONObject clientPerformance = this.c.getClientPerformance();
            if (clientPerformance != null) {
                clientPerformance.put("mtopSuccess", (Object) Long.valueOf(System.currentTimeMillis()));
            }
            this.b = new RemoteMainResponse(a(), i, mtopResponse, baseOutDo, obj);
            this.d.a(this.b);
            ArrayList arrayList = new ArrayList(this.d.c());
            if (this.c.getAttachedResponseStrategy() == NextRpcRequest.AttachedResponseStrategy.FULL && !this.d.b()) {
                arrayList.clear();
            } else {
                this.d.a();
            }
            boolean hasAttachedResponse = this.b.hasAttachedResponse();
            e eVar = this.h;
            if (eVar != null) {
                eVar.a(this.b, arrayList);
            }
            if (this.i != null) {
                this.i.a(1, this.b, arrayList, !hasAttachedResponse || this.d.b());
            }
            if (!hasAttachedResponse || this.d.b()) {
                UnifyLog.c("NextRpcRequestClientV2Impl", "No attachedResponse or attachedResponseReady!! ", new Object[0]);
                d();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("isAllAttachedResponse", this.d.b() ? "1" : "0");
            hashMap.put("traceId", this.b.getTraceId());
            hashMap.putAll(f());
            a("nextrpc-main-response-success", this.b, hasAttachedResponse ? "hasNextData" : "noNextData", hashMap);
        }

        @Override // com.alibaba.android.nextrpc.request.internal.mtop.b
        public void a(MtopCacheEvent mtopCacheEvent, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba00afd9", new Object[]{this, mtopCacheEvent, baseOutDo, obj});
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("NextRpc onCached ");
            String str = "";
            sb.append(mtopCacheEvent == null ? str : mtopCacheEvent.mtopResponse);
            UnifyLog.b("NextRpcRequestClientV2Impl", sb.toString(), new Object[0]);
            if (mtopCacheEvent == null) {
                UnifyLog.c("NextRpcRequestClientV2Impl", "mtopCacheEvent is null! ! ", new Object[0]);
                return;
            }
            MtopResponse mtopResponse = mtopCacheEvent.getMtopResponse();
            if (mtopResponse == null) {
                UnifyLog.c("NextRpcRequestClientV2Impl", "mtopResponse is null! ! ", new Object[0]);
                return;
            }
            if (mtopResponse.getBytedata() != null) {
                str = new String(mtopResponse.getBytedata());
            }
            CachedMainResponse cachedMainResponse = new CachedMainResponse(a(), str, mtopResponse.getHeaderFields(), mtopCacheEvent, baseOutDo, obj);
            e eVar = this.h;
            if (eVar != null) {
                eVar.a(cachedMainResponse);
            }
            NextRpcResponseCallbackV2 nextRpcResponseCallbackV2 = this.i;
            if (nextRpcResponseCallbackV2 == null) {
                return;
            }
            nextRpcResponseCallbackV2.a(0, this.b, null, false);
        }

        @Override // com.alibaba.android.nextrpc.request.internal.mtop.b
        public void a(String str, String str2, String str3, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d5d0b6a", new Object[]{this, str, str2, str3, jSONObject});
                return;
            }
            UnifyLog.b("NextRpcRequestClientV2Impl", "MainRequest receive attachedResponse data, current reqId = " + a(), new Object[0]);
            AttachedResponse attachedResponse = new AttachedResponse(jSONObject.getString("reqId"), str3, a(jSONObject), jSONObject.getIntValue("seqNum"), jSONObject.getIntValue("seqCount"), jSONObject.getBooleanValue("success"), jSONObject.getString("errorCode"), jSONObject.getString("errorMsg"));
            Map<String, String> a2 = com.alibaba.android.nextrpc.internal.utils.b.a(attachedResponse.getHeaders());
            a2.putAll(f());
            a("nextrpc-attached-response", a(this.c), "", a2);
            this.d.a(attachedResponse);
            if (this.b == null) {
                return;
            }
            int i = AnonymousClass2.f25856a[this.c.getAttachedResponseStrategy().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (attachedResponse.isSucceed().booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(attachedResponse);
                        e eVar = this.h;
                        if (eVar != null) {
                            eVar.a(arrayList);
                        }
                        NextRpcResponseCallbackV2 nextRpcResponseCallbackV2 = this.i;
                        if (nextRpcResponseCallbackV2 != null) {
                            nextRpcResponseCallbackV2.a(2, this.b, arrayList, this.d.b());
                        }
                    } else {
                        UnifyLog.b("NextRpcRequestClientV2Impl", "nextRpcResponseCallback is null or  [errorCode:" + attachedResponse.getErrorCode() + ",errorMsg:" + attachedResponse.getErrorMsg() + riy.ARRAY_END_STR, new Object[0]);
                    }
                    this.d.a();
                } else {
                    UnifyLog.b("NextRpcRequestClientV2Impl", "ResponseStrategy no found! ! ", new Object[0]);
                }
            } else if (this.d.b() && this.d.c().size() > 0) {
                e eVar2 = this.h;
                if (eVar2 != null) {
                    eVar2.a(this.d.c());
                }
                NextRpcResponseCallbackV2 nextRpcResponseCallbackV22 = this.i;
                if (nextRpcResponseCallbackV22 != null) {
                    nextRpcResponseCallbackV22.a(2, this.b, this.d.c(), true);
                }
            }
            if (!this.d.b() || this.b == null) {
                return;
            }
            d();
        }

        private String a(NextRpcRequest nextRpcRequest) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("61d3d8e4", new Object[]{this, nextRpcRequest}) : (nextRpcRequest == null || nextRpcRequest.getMtopBusiness() == null || nextRpcRequest.getMtopBusiness().request == null) ? "" : nextRpcRequest.getMtopBusiness().request.getApiName();
        }

        private Map<String, String> f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put(joq.STAGE_NETWORK, this.k);
            hashMap.put("currentTime", String.valueOf(System.currentTimeMillis()));
            return hashMap;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                this.f.postDelayed(new Runnable() { // from class: tb.bfq.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        if (b.a(b.this) != null) {
                            b.this.d();
                            b bVar = b.this;
                            b.a(bVar, "nextrpc-timeout", b.a(bVar), null, null);
                            UnifyLog.d("NextRpcRequestClientV2Impl", "nextrpc-timeout", new Object[0]);
                        }
                        if (b.b(b.this) == null) {
                            return;
                        }
                        b.b(b.this).a(-2, null, null, true);
                    }
                }, this.g);
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else {
                this.f.removeCallbacksAndMessages(null);
            }
        }

        @Override // com.alibaba.android.nextrpc.request.internal.mtop.a
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            this.j.a(this.e);
            UnifyLog.b("NextRpcRequestClientV2Impl", "Release request, current reqId = " + a(), new Object[0]);
            c();
        }

        private Map<String, List<String>> a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{this, jSONObject});
            }
            if (jSONObject == null || jSONObject.isEmpty()) {
                throw new IllegalArgumentException("accs header can not be null");
            }
            HashMap hashMap = new HashMap(jSONObject.size());
            try {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!StringUtils.isEmpty(key)) {
                        List arrayList = new ArrayList();
                        if (value instanceof JSONArray) {
                            arrayList = JSONObject.parseArray(((JSONArray) value).toJSONString(), String.class);
                        }
                        if (value instanceof String) {
                            arrayList.add((String) value);
                        }
                        hashMap.put(key, arrayList);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return hashMap;
        }

        private void a(String str, Object obj, String str2, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3cd7aad", new Object[]{this, str, obj, str2, map});
                return;
            }
            String str3 = null;
            if (obj instanceof RemoteMainResponse) {
                RemoteMainResponse remoteMainResponse = (RemoteMainResponse) obj;
                if (remoteMainResponse.getMtopResponse() != null) {
                    str3 = remoteMainResponse.getMtopResponse().getApi();
                    bfp.a(str, str3, str2, map);
                }
            }
            if (obj instanceof String) {
                str3 = (String) obj;
            }
            bfp.a(str, str3, str2, map);
        }
    }
}
