package com.taobao.android.ultron.datamodel.imp;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamOtherResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.android.nextrpc.stream.request.StreamNextRpcRequest;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bgd;
import tb.bxi;
import tb.fgf;
import tb.jnv;
import tb.jnw;
import tb.jnx;
import tb.jny;
import tb.jod;
import tb.joj;
import tb.jor;
import tb.jpo;
import tb.jpq;
import tb.jpr;
import tb.jpz;
import tb.jqg;
import tb.jqk;
import tb.kge;
import tb.tfa;
import tb.tfb;

/* loaded from: classes6.dex */
public class j implements jod {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String STREAM_RESPONSE_NUM = "mainNum";
    public static final String STREAM_RESPONSE_ULTRON_PROTOCOL = "streamNextRPCResponseUltronProtocol";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f15782a;
    private static String t;
    private boolean b;
    private MtopRequest c;
    private jny d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private String i;
    private int j;
    private boolean k;
    private Map<String, String> l;
    private IDMComponent m;
    private Map<String, String> n;
    private String o;
    private Context p;
    private boolean q;
    private boolean r;
    private boolean s;
    private StreamNextRpcRequest u;
    private String v;
    private boolean w;

    public static /* synthetic */ Context a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("94e3c4a2", new Object[]{jVar}) : jVar.p;
    }

    public static /* synthetic */ String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        t = str;
        return str;
    }

    public static /* synthetic */ List a(j jVar, List list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9046c4c", new Object[]{jVar, list}) : jVar.a(list);
    }

    public static /* synthetic */ void a(j jVar, MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8cd3988", new Object[]{jVar, mtopBusiness});
        } else {
            jVar.b(mtopBusiness);
        }
    }

    public static /* synthetic */ void a(j jVar, MtopBusiness mtopBusiness, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bc960fd", new Object[]{jVar, mtopBusiness, map});
        } else {
            jVar.a(mtopBusiness, map);
        }
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : t;
    }

    public static /* synthetic */ String b(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cc0ab237", new Object[]{jVar}) : jVar.o;
    }

    public static /* synthetic */ boolean c(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8332876c", new Object[]{jVar})).booleanValue() : jVar.g;
    }

    public static /* synthetic */ boolean d(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bcfd294b", new Object[]{jVar})).booleanValue() : jVar.q;
    }

    public static /* synthetic */ MtopRequest e(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopRequest) ipChange.ipc$dispatch("3c55b751", new Object[]{jVar}) : jVar.c;
    }

    public static /* synthetic */ Map f(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6c4ad27a", new Object[]{jVar}) : jVar.c();
    }

    public static /* synthetic */ jny g(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jny) ipChange.ipc$dispatch("b8d5a0d", new Object[]{jVar}) : jVar.d;
    }

    static {
        kge.a(-1506607643);
        kge.a(-914186981);
        f15782a = false;
    }

    public j(jnw jnwVar) {
        this.b = true;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = true;
        this.j = -1;
        this.k = false;
        this.o = "default";
        this.v = "";
        if (jnwVar == null) {
            return;
        }
        this.h = jnwVar.t();
        if (jnwVar.s() != null) {
            this.d = jnwVar.s();
        } else {
            this.d = new b(this.h);
        }
        this.l = jnwVar.p();
        this.i = jnwVar.j();
        this.f = jnwVar.c();
        this.g = jnwVar.d();
        this.k = jnwVar.n();
        this.e = jnwVar.l();
        this.j = jnwVar.k();
        this.m = jnwVar.b();
        this.n = jnwVar.o();
        this.o = jnwVar.q();
        this.v = jnwVar.R();
        this.r = jnwVar.m();
        this.s = jnwVar.z();
        String r = jnwVar.r();
        double v = jnwVar.v();
        this.q = jnwVar.B();
        this.c = new MtopRequest();
        this.c.setApiName(jnwVar.e());
        this.c.setVersion(jnwVar.f());
        this.c.setNeedSession(jnwVar.g());
        this.c.setNeedEcode(jnwVar.h());
        jny jnyVar = this.d;
        if (jnyVar instanceof b) {
            ((b) jnyVar).b(this.h);
            c t2 = ((b) this.d).t();
            if (t2 != null) {
                t2.a(jnwVar.x());
                t2.c(jnwVar.A());
                t2.b(jnwVar.y());
            }
            if (t2 != null && jnwVar.P() != null) {
                for (jnx.a aVar : jnwVar.P()) {
                    t2.b().a(aVar);
                }
            }
        }
        this.p = jnwVar.C();
        this.b = jnwVar.F();
        this.d.c(this.o);
        this.d.d(r);
        ((b) this.d).a(jnwVar.C());
        MtopBusiness build = MtopBusiness.build(this.c);
        build.allowParseJson(this.s);
        if (jnwVar.K() != null) {
            build.mo1296handler(jnwVar.K());
        }
        this.w = jnwVar.M();
        build.mo1333upstreamCompress(this.w);
        a(build, jnwVar);
        this.u = new StreamNextRpcRequest(build, v);
    }

    private String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context}) : context.getApplicationContext().getSharedPreferences("ultornSdkSpName", 0).getString("userName", "");
    }

    private String b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("31400281", new Object[]{this, context}) : context.getApplicationContext().getSharedPreferences("ultornSdkSpName", 0).getString("userId", "");
    }

    /* loaded from: classes6.dex */
    public class a implements com.alibaba.android.nextrpc.stream.request.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public b f15784a;
        public jnv b;
        public MtopBusiness c;
        private final long e = System.currentTimeMillis();
        private long f;

        static {
            kge.a(364701760);
            kge.a(-1714534073);
        }

        @Override // com.alibaba.android.nextrpc.stream.request.d
        public void c(StreamOtherResponse streamOtherResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e3d8095", new Object[]{this, streamOtherResponse});
            }
        }

        public a(MtopBusiness mtopBusiness, jnv jnvVar, b bVar) {
            this.c = mtopBusiness;
            this.f15784a = bVar;
            this.b = jnvVar;
        }

        @Override // com.alibaba.android.nextrpc.stream.request.d
        public void a(StreamRemoteMainResponse streamRemoteMainResponse, List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("578d65d", new Object[]{this, streamRemoteMainResponse, list});
                return;
            }
            jqg.a(this.f15784a.h(), "#流式返回:", String.valueOf(streamRemoteMainResponse.getMainNum()));
            this.f = System.currentTimeMillis();
            a(streamRemoteMainResponse);
            jpq.a(j.a(j.this), streamRemoteMainResponse.getMtopResponse());
            MtopResponse mtopResponse = streamRemoteMainResponse.getMtopResponse();
            int mtopRequestType = streamRemoteMainResponse.getMtopRequestType();
            Object mtopRequestContext = streamRemoteMainResponse.getMtopRequestContext();
            if (this.f15784a.e()) {
                if (j.d(j.this)) {
                    this.f15784a.C();
                }
                this.f15784a.a(false);
            }
            try {
                if (this.b.a(mtopRequestType, mtopResponse, mtopRequestContext)) {
                    this.b.b(mtopRequestType, mtopResponse, mtopRequestContext);
                    HashMap hashMap = new HashMap();
                    hashMap.put(j.STREAM_RESPONSE_NUM, Integer.valueOf(streamRemoteMainResponse.getMainNum()));
                    this.b.a(mtopRequestType, mtopResponse, mtopRequestContext, hashMap);
                    jpq.a(j.a(j.this), true, mtopResponse);
                    jor.a(j.a(j.this), j.b(j.this), streamRemoteMainResponse.getData());
                    return;
                }
            } catch (Throwable unused) {
            }
            this.b.a(this.f15784a, streamRemoteMainResponse, list);
            if (j.c(j.this)) {
                try {
                    this.b.a(mtopRequestType, mtopResponse, mtopRequestContext, this.f15784a, (Map<String, ? extends Object>) null);
                    jpq.a(j.a(j.this), true, mtopResponse);
                } catch (Throwable th) {
                    UnifyLog.a(j.b(j.this), "StreamNextRpcRequester", "submit onSuccess callback error", th.getMessage());
                }
                jor.a(j.a(j.this), j.b(j.this), streamRemoteMainResponse.getData());
                return;
            }
            ParseResponseHelper parseResponseHelper = new ParseResponseHelper(this.f15784a);
            if (!a(streamRemoteMainResponse, list, mtopResponse, parseResponseHelper)) {
                return;
            }
            a(streamRemoteMainResponse, mtopRequestType, mtopRequestContext, parseResponseHelper);
            jpq.a(j.a(j.this), false, mtopResponse);
            jor.a(j.a(j.this), j.b(j.this), streamRemoteMainResponse.getData());
        }

        private void a(StreamRemoteMainResponse streamRemoteMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4242a16c", new Object[]{this, streamRemoteMainResponse});
                return;
            }
            m g = this.f15784a.g();
            g.b(this.f);
            g.a(this.e);
            g.a(streamRemoteMainResponse.getStatistics());
        }

        private boolean a(StreamRemoteMainResponse streamRemoteMainResponse, List<AttachedResponse> list, MtopResponse mtopResponse, ParseResponseHelper parseResponseHelper) {
            Exception exc;
            byte[] bArr;
            byte[] bytedata;
            byte[] bArr2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3d46491c", new Object[]{this, streamRemoteMainResponse, list, mtopResponse, parseResponseHelper})).booleanValue();
            }
            jpq.b(j.a(j.this), mtopResponse);
            JSONObject data = streamRemoteMainResponse.getData();
            if (data == null) {
                try {
                    bytedata = mtopResponse.getBytedata();
                } catch (Exception e) {
                    exc = e;
                    bArr = null;
                }
                try {
                    bArr2 = bytedata;
                    data = (JSONObject) JSON.parseObject(bytedata, JSONObject.class, new Feature[0]);
                } catch (Exception e2) {
                    exc = e2;
                    bArr = bytedata;
                    a(streamRemoteMainResponse, mtopResponse, parseResponseHelper, bArr, exc);
                    return false;
                }
            } else {
                bArr2 = null;
            }
            JSONObject jSONObject = data.getJSONObject("data");
            if (jSONObject == null) {
                a(streamRemoteMainResponse, mtopResponse, parseResponseHelper, bArr2, null);
                return false;
            }
            parseResponseHelper.a(j.STREAM_RESPONSE_ULTRON_PROTOCOL, (Object) jSONObject);
            if (parseResponseHelper.c(jSONObject)) {
                return true;
            }
            jnv jnvVar = this.b;
            if (jnvVar != null) {
                jnvVar.a(data);
            }
            parseResponseHelper.d(jSONObject);
            if (parseResponseHelper.a(i.FEATURE_CONTAINER_CACHE)) {
                parseResponseHelper.a(j.a(j.this), j.b(j.this), jSONObject, true, true);
            }
            parseResponseHelper.a(data);
            if (list != null) {
                parseResponseHelper.a(j.a(j.this, list));
            }
            jpq.a(j.a(j.this), mtopResponse, jSONObject, this.e, this.f, streamRemoteMainResponse.getStatistics());
            return true;
        }

        private void a(final StreamRemoteMainResponse streamRemoteMainResponse, final MtopResponse mtopResponse, final ParseResponseHelper parseResponseHelper, byte[] bArr, Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d1899d6", new Object[]{this, streamRemoteMainResponse, mtopResponse, parseResponseHelper, bArr, exc});
            } else if (this.b == null) {
                UnifyLog.d("StreamNextRpcRequester", "mOuterCallback is null");
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.ultron.datamodel.imp.j.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            a.this.b.a(streamRemoteMainResponse.getMtopRequestType(), mtopResponse, streamRemoteMainResponse.getMtopRequestContext(), true, (Map<String, ? extends Object>) parseResponseHelper.b());
                        } catch (Exception e) {
                            UnifyLog.d("StreamNextRpcRequester", e.getMessage());
                        }
                    }
                });
                jpz.a("Ultron", "AURAMonitor", "AURAMonitor", j.b(j.this), null, "parseResponseException", exc == null ? "" : exc.getMessage());
                StringBuilder sb = new StringBuilder();
                sb.append("parseResponseException#bizName=");
                sb.append(j.b(j.this));
                sb.append("#responseByteData=");
                sb.append(bArr == null ? "none" : new String(bArr));
                jqg.a("AURAMonitor", "parseResponseException", sb.toString());
            }
        }

        private void a(StreamRemoteMainResponse streamRemoteMainResponse, int i, Object obj, ParseResponseHelper parseResponseHelper) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bed39e67", new Object[]{this, streamRemoteMainResponse, new Integer(i), obj, parseResponseHelper});
                return;
            }
            MtopResponse mtopResponse = streamRemoteMainResponse.getMtopResponse();
            Map<String, ? extends Object> b = parseResponseHelper.b();
            if (b == null) {
                b = new HashMap<>();
            }
            b.put(j.STREAM_RESPONSE_NUM, Integer.valueOf(streamRemoteMainResponse.getMainNum()));
            try {
                if (parseResponseHelper.a()) {
                    this.b.a(i, mtopResponse, obj, this.f15784a, b);
                    jpz.a(this.f15784a, mtopResponse, j.e(j.this), true, j.f(j.this));
                    return;
                }
                this.b.a(i, mtopResponse, obj, true, b);
                Object obj2 = b.get("protocolVersion");
                if (!(obj2 instanceof String)) {
                    return;
                }
                try {
                    if (Float.parseFloat((String) obj2) <= 2.1d) {
                        return;
                    }
                    jpz.a(this.f15784a, mtopResponse, j.e(j.this), false, j.f(j.this));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                String b2 = j.b(j.this);
                jqg.a(b2, "StreamNextRpcRequester", "submit onSuccess callback error#" + th.getMessage());
            }
        }

        @Override // com.alibaba.android.nextrpc.stream.request.d
        public void a(StreamOtherResponse streamOtherResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4febbc13", new Object[]{this, streamOtherResponse});
                return;
            }
            MtopResponse mtopResponse = streamOtherResponse.getMtopResponse();
            int mtopRequestType = streamOtherResponse.getMtopRequestType();
            Object mtopRequestContext = streamOtherResponse.getMtopRequestContext();
            jpq.c(j.a(j.this), mtopResponse);
            j.a(j.this, this.c);
            String h = this.f15784a.h();
            jqg.a(h, "StreamNextRpcRequester", "response error, errorCode:" + mtopResponse.getRetCode() + ",errorMsg:" + mtopResponse.getRetMsg() + ",request: " + j.e(j.this).toString());
            this.f15784a.a(false);
            HashMap hashMap = new HashMap();
            hashMap.put(j.STREAM_RESPONSE_NUM, Integer.valueOf(streamOtherResponse.getMainNum()));
            try {
                if (this.b != null && !this.b.a(mtopRequestType, mtopResponse, mtopRequestContext)) {
                    this.b.a(mtopRequestType, mtopResponse, mtopRequestContext, false, (Map<String, ? extends Object>) hashMap);
                }
            } catch (Exception e) {
                jqg.a("StreamNextRpcRequester", "onErrorException 节点onError回调处理错误出错", e.getMessage());
            }
            jpz.a(this.f15784a, mtopResponse, j.e(j.this), false, j.f(j.this));
        }

        @Override // com.alibaba.android.nextrpc.stream.request.d
        public void a(List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
                return;
            }
            jqg.b("StreamNextRpcRequester", "remoteMainResponseReqId = " + j.b() + " identityHashCode=" + System.identityHashCode(this));
            if (list == null || list.isEmpty()) {
                return;
            }
            HashMap hashMap = new HashMap();
            if (this.b.a(j.b(), list)) {
                hashMap.put("isValid", "1");
                this.b.a(j.a(j.this, list));
            } else {
                hashMap.put("isValid", "0");
            }
            j.a(j.this, this.c, hashMap);
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : t;
    }

    private void a(MtopBusiness mtopBusiness, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c732297f", new Object[]{this, mtopBusiness, map});
        } else {
            jqk.a("ultron-nextrpc-attached-response", (mtopBusiness == null || mtopBusiness.request == null) ? "" : mtopBusiness.request.getApiName(), "", map);
        }
    }

    private List<JSONObject> a(List<AttachedResponse> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            try {
                for (AttachedResponse attachedResponse : list) {
                    if (attachedResponse != null) {
                        arrayList.add(JSON.parseObject(attachedResponse.getBody()));
                    }
                }
            } catch (Throwable th) {
                UnifyLog.b("StreamNextRpcRequester", th.getMessage());
            }
        }
        return arrayList;
    }

    private Map<String, String> c() {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        if (!(this.p instanceof Activity)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            for (String str : new String[]{"preBizName"}) {
                String queryParameter = ((Activity) this.p).getIntent().getData().getQueryParameter(str);
                if (queryParameter != null) {
                    hashMap.put(str, queryParameter);
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    @Override // tb.jod
    public String a(com.alibaba.android.nextrpc.stream.request.a aVar, jnv jnvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("329eb61b", new Object[]{this, aVar, jnvVar}) : b(aVar, null, jnvVar);
    }

    @Override // tb.jod
    public String a(com.alibaba.android.nextrpc.stream.request.a aVar, Object obj, jnv jnvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9efb197f", new Object[]{this, aVar, obj, jnvVar}) : b(aVar, obj, jnvVar);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            a(this.n);
        }
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        JSONObject parseObject = JSON.parseObject(map.get("exParams"));
        if (parseObject == null) {
            parseObject = new JSONObject();
        }
        parseObject.put("ultron_data_record", (Object) "true");
        if (parseObject.containsKey("tradeProtocolFeatures")) {
            BigInteger bigInteger = null;
            try {
                bigInteger = new BigInteger(parseObject.getString("tradeProtocolFeatures"));
            } catch (Exception unused) {
            }
            if (i.a(bigInteger, i.FEATURE_CONTAINER_CACHE)) {
                bigInteger = i.b(bigInteger, i.FEATURE_CONTAINER_CACHE);
            }
            parseObject.put("tradeProtocolFeatures", (Object) bigInteger.toString());
        }
        map.put("exParams", parseObject.toJSONString());
    }

    private void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (!this.b) {
        } else {
            try {
                if (!bgd.a()) {
                    return;
                }
                JSONObject parseObject = JSON.parseObject(map.get("exParams"));
                if (parseObject == null) {
                    parseObject = new JSONObject();
                }
                parseObject.put("inner", (Object) "1");
                map.put("exParams", parseObject.toJSONString());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r12v10, types: [com.taobao.android.ultron.datamodel.imp.j$1] */
    private String b(final com.alibaba.android.nextrpc.stream.request.a aVar, Object obj, jnv jnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ebb4d1e", new Object[]{this, aVar, obj, jnvVar});
        }
        String str = this.o;
        if (str != null && joj.a(str) == null) {
            new AsyncTask<Void, Void, Void>() { // from class: com.taobao.android.ultron.datamodel.imp.j.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Void doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                public Void a(Void... voidArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                    }
                    try {
                        joj.a(j.a(j.this), j.b(j.this));
                        return null;
                    } catch (Throwable th) {
                        UnifyLog.a(j.g(j.this).h(), "StreamNextRpcRequester", "getInstance", th.getMessage());
                        return null;
                    }
                }
            }.execute(new Void[0]);
        }
        jny jnyVar = this.d;
        if (!(jnyVar instanceof b)) {
            return "";
        }
        b bVar = (b) jnyVar;
        bVar.b(this.h);
        if (this.n == null) {
            this.n = new HashMap();
        }
        if (f15782a) {
            try {
                d();
            } catch (Throwable th) {
                UnifyLog.a(this.d.h(), "StreamNextRpcRequester", "doExecute ultron params error", th.getMessage());
            }
        }
        b(this.n);
        if (this.f) {
            if (this.h) {
                this.n.put("feature", "{\"gzip\":\"true\"}");
            }
            jpo b = jpo.b(this.p);
            b.b("gzip", String.valueOf(this.h));
            b.b("upstreamCompress", String.valueOf(this.w));
            b.a("processData", "apmClientBeforeNetworkLogicProcess");
            long currentTimeMillis = System.currentTimeMillis();
            this.n.put("params", bVar.t().a(bVar, this.m));
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(this.n);
            this.c.setData(jSONObject.toJSONString());
            a(this.c, this.n);
            String str2 = this.o;
            if (str2 != null) {
                fgf fgfVar = new fgf(str2);
                fgfVar.a("上行数据处理");
                fgfVar.b(bxi.b() ? 1.0f : 0.001f);
                fgfVar.a(this.o + "#asyncProcessData", System.currentTimeMillis() - currentTimeMillis);
                fgfVar.a("d1", "upstreamCompress:" + this.w);
                fgfVar.a("d2", "gzip:" + this.h);
                jpr.a(fgfVar);
            }
            b.a("processData", false, (Map<String, String>) null);
        } else if (this.g) {
            if (this.h) {
                this.n.put("feature", "{\"gzip\":\"true\"}");
            }
            this.n.put("params", bVar.t().a(bVar));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putAll(this.n);
            this.c.setData(jSONObject2.toJSONString());
            a(this.c, this.n);
        } else {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.putAll(this.n);
            this.c.setData(jSONObject3.toJSONString());
            a(this.c, this.n);
        }
        jpq.a(this.p);
        final a aVar2 = new a(this.u.getMtopBusiness(), jnvVar, bVar);
        tfb a2 = tfa.a(this.u, aVar2, new Runnable() { // from class: com.taobao.android.ultron.datamodel.imp.StreamNextRpcRequester$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                jqg.b("StreamNextRpcRequester", "预请求失败，恢复正常请求");
                com.alibaba.android.nextrpc.stream.request.a aVar3 = aVar;
                j jVar = j.this;
                j.a(aVar3.a(j.$ipChange, aVar2));
                jpz.a(j.g(j.this), j.e(j.this));
            }
        });
        if (a2.a()) {
            t = a2.b();
            jqg.b("StreamNextRpcRequester", "命中预请求");
            jpo.b(this.p).b("hitPreRequest", "true");
            return t;
        }
        t = aVar.a(this.u, aVar2);
        jpz.a(this.d, this.c);
        return t;
    }

    private void a(MtopBusiness mtopBusiness, jnw jnwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2286523", new Object[]{this, mtopBusiness, jnwVar});
            return;
        }
        mtopBusiness.mo1330supportStreamJson(jnwVar.L());
        mtopBusiness.mo1305reqMethod(this.e ? MethodEnum.POST : MethodEnum.GET);
        if (!this.e && this.r) {
            mtopBusiness.mo1293allowSwitchToPOST(true);
        }
        if (this.k) {
            mtopBusiness.mo1335useWua();
        }
        int i = this.j;
        if (i != -1) {
            try {
                mtopBusiness.mo1340setBizId(i);
            } catch (Exception unused) {
            }
        }
        String str = this.o;
        if (str != null) {
            mtopBusiness.mo1309setBizId(str);
        }
        if (!TextUtils.isEmpty(this.v)) {
            mtopBusiness.mo1310setBizTopic(this.v);
        }
        if (!TextUtils.isEmpty(this.i)) {
            mtopBusiness.mo1328setUnitStrategy(this.i);
        }
        Map<String, String> map = this.l;
        if (map == null) {
            return;
        }
        mtopBusiness.mo1297headers(map);
    }

    private void a(MtopRequest mtopRequest, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e87fdd52", new Object[]{this, mtopRequest, map});
        } else if (mtopRequest == null) {
        } else {
            mtopRequest.dataParams = map;
        }
    }

    private void b(MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("755a5747", new Object[]{this, mtopBusiness});
        } else if (!f15782a) {
        } else {
            try {
                c(mtopBusiness);
            } catch (Throwable th) {
                String str = this.o;
                UnifyLog.a(str, "StreamNextRpcRequester", "uploadDataForTest exception: " + th.getMessage(), new String[0]);
            }
        }
    }

    private void c(MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74e3f148", new Object[]{this, mtopBusiness});
        } else if (mtopBusiness == null || mtopBusiness.getMtopContext() == null) {
        } else {
            MtopRequest mtopRequest = mtopBusiness.getMtopContext().b;
            MtopResponse mtopResponse = mtopBusiness.getMtopContext().c;
            String str = mtopBusiness.getMtopContext().d != null ? mtopBusiness.getMtopContext().d.ttid : "default_ttid";
            if (mtopRequest == null || mtopResponse == null) {
                return;
            }
            Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userId", (Object) b(this.p));
            jSONObject.put("userNick", (Object) a(this.p));
            jSONObject.put("api", (Object) mtopRequest.getApiName());
            jSONObject.put("request", (Object) mtopRequest.getData());
            jSONObject.put(InputFrame3.TYPE_RESPONSE, (Object) new String(mtopResponse.getBytedata()));
            jSONObject.put("ttid", (Object) str);
            if (headerFields != null) {
                jSONObject.put("responseHeaders", (Object) JSON.toJSON(headerFields).toString());
            }
            Map<String, String> map = this.l;
            if (map != null) {
                jSONObject.put("requestHeaders", (Object) JSON.toJSON(map).toString());
            }
            MtopRequest mtopRequest2 = new MtopRequest();
            mtopRequest2.setApiName("mtop.taobao.ultron.upload");
            mtopRequest2.setVersion("1.0");
            mtopRequest2.setData(jSONObject.toJSONString());
            MtopBusiness build = MtopBusiness.build(mtopRequest2);
            build.mo1335useWua().mo1305reqMethod(MethodEnum.POST).mo1337addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.android.ultron.datamodel.imp.StreamNextRpcRequester$3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse2, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse2, obj});
                    } else if (mtopResponse2 == null) {
                    } else {
                        UnifyLog.a(j.b(j.this), "StreamNextRpcRequester", "uploadDataForTest onSystemError", mtopResponse2.getRetCode(), mtopResponse2.getRetMsg(), UnifyLog.EventType.ERROR, new String[0]);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse2, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse2, baseOutDo, obj});
                    } else if (mtopResponse2 == null) {
                    } else {
                        UnifyLog.a(j.b(j.this), "StreamNextRpcRequester", "uploadDataForTest onSuccess", mtopResponse2.getRetCode(), mtopResponse2.getRetMsg(), UnifyLog.EventType.NET_RESPONSE, new String[0]);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse2, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse2, obj});
                    } else if (mtopResponse2 == null) {
                    } else {
                        UnifyLog.a(j.b(j.this), "StreamNextRpcRequester", "uploadDataForTest onError", mtopResponse2.getRetCode(), mtopResponse2.getRetMsg(), UnifyLog.EventType.ERROR, new String[0]);
                    }
                }
            });
            build.startRequest();
        }
    }
}
