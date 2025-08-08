package com.taobao.android.ultron.datamodel.imp;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.request.CachedMainResponse;
import com.alibaba.android.nextrpc.request.NextRpcRequest;
import com.alibaba.android.nextrpc.request.RemoteMainResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
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
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bgd;
import tb.jnv;
import tb.jnw;
import tb.jnx;
import tb.jny;
import tb.job;
import tb.joj;
import tb.jor;
import tb.jpq;
import tb.jpz;
import tb.jqg;
import tb.jqh;
import tb.jqk;
import tb.jqm;
import tb.kge;
import tb.spk;

/* loaded from: classes6.dex */
public class NextRpcRequester implements job {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String D = null;
    public static final String HEADER_FEATURE_KEY = "feature";
    public static final String HEADER_FEATURE_VAL = "{\"gzip\":\"true\"}";
    public static final String KEY_IS_CACHE_DATA = "isCachaData";
    public static final String KEY_SP_FILE_NAME = "ultornSdkSpName";
    public static final String KEY_USER_ID = "userId";
    public static final String KEY_USER_NAME = "userName";
    public static boolean v;
    private boolean A;
    private boolean B;
    private boolean C;
    private ThreadPoolExecutor E;
    public String F;

    /* renamed from: a  reason: collision with root package name */
    public MtopRequest f15756a;
    public jny b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public String g;
    public String h;
    public int i;
    public boolean j;
    public Map<String, String> k;
    public IDMComponent l;
    public Map<String, String> m;
    public Class<?> n;
    public String o;
    public String p;
    public Context q;
    public boolean r;
    public double s;
    public NextRpcAttachedResponseStrategy t;
    public boolean u;
    public String w;
    public NextRpcRequest x;
    private boolean y;
    private boolean z;

    /* renamed from: com.taobao.android.ultron.datamodel.imp.NextRpcRequester$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15758a = new int[NextRpcAttachedResponseStrategy.values().length];

        static {
            try {
                f15758a[NextRpcAttachedResponseStrategy.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15758a[NextRpcAttachedResponseStrategy.IMMEDIATELY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public enum NextRpcAttachedResponseStrategy {
        IMMEDIATELY,
        FULL
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : D;
    }

    public static /* synthetic */ List a(NextRpcRequester nextRpcRequester, List list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("55c27144", new Object[]{nextRpcRequester, list}) : nextRpcRequester.a(list);
    }

    public static /* synthetic */ ThreadPoolExecutor a(NextRpcRequester nextRpcRequester, ThreadPoolExecutor threadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("8f7a8f1e", new Object[]{nextRpcRequester, threadPoolExecutor});
        }
        nextRpcRequester.E = threadPoolExecutor;
        return threadPoolExecutor;
    }

    public static /* synthetic */ void a(NextRpcRequester nextRpcRequester, MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6d10790", new Object[]{nextRpcRequester, mtopBusiness});
        } else {
            nextRpcRequester.a(mtopBusiness);
        }
    }

    public static /* synthetic */ void a(NextRpcRequester nextRpcRequester, MtopBusiness mtopBusiness, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("847ec1f5", new Object[]{nextRpcRequester, mtopBusiness, map});
        } else {
            nextRpcRequester.a(mtopBusiness, map);
        }
    }

    public static /* synthetic */ boolean a(NextRpcRequester nextRpcRequester) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5d49fdb6", new Object[]{nextRpcRequester})).booleanValue() : nextRpcRequester.C;
    }

    public static /* synthetic */ boolean b(NextRpcRequester nextRpcRequester) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("50d981f7", new Object[]{nextRpcRequester})).booleanValue() : nextRpcRequester.B;
    }

    public static /* synthetic */ ThreadPoolExecutor c(NextRpcRequester nextRpcRequester) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadPoolExecutor) ipChange.ipc$dispatch("829a5514", new Object[]{nextRpcRequester}) : nextRpcRequester.E;
    }

    public static /* synthetic */ Map d(NextRpcRequester nextRpcRequester) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b438abea", new Object[]{nextRpcRequester}) : nextRpcRequester.b();
    }

    static {
        kge.a(834386565);
        kge.a(1948809787);
        v = false;
    }

    public NextRpcRequester(jnw jnwVar) {
        this.y = true;
        this.c = true;
        this.d = false;
        this.e = false;
        this.f = true;
        this.i = -1;
        this.j = false;
        this.o = "default";
        this.r = true;
        this.z = false;
        this.A = false;
        this.B = false;
        if (jnwVar == null) {
            return;
        }
        this.f = jnwVar.t();
        if (jnwVar.s() != null) {
            this.b = jnwVar.s();
        } else {
            this.b = new com.taobao.android.ultron.datamodel.imp.b(this.f);
        }
        this.k = jnwVar.p();
        this.g = jnwVar.i();
        this.h = jnwVar.j();
        this.d = jnwVar.c();
        this.e = jnwVar.d();
        this.j = jnwVar.n();
        this.c = jnwVar.l();
        this.i = jnwVar.k();
        this.l = jnwVar.b();
        this.m = jnwVar.o();
        this.n = jnwVar.a();
        this.o = jnwVar.q();
        this.p = jnwVar.r();
        this.F = jnwVar.R();
        this.A = jnwVar.H();
        this.z = jnwVar.I();
        this.w = jnwVar.u();
        this.s = jnwVar.v();
        this.t = jnwVar.w();
        this.B = jnwVar.E();
        this.r = jnwVar.D();
        this.C = jnwVar.B();
        this.u = jnwVar.m();
        this.f15756a = new MtopRequest();
        this.f15756a.setApiName(jnwVar.e());
        this.f15756a.setVersion(jnwVar.f());
        this.f15756a.setNeedSession(jnwVar.g());
        this.f15756a.setNeedEcode(jnwVar.h());
        jny jnyVar = this.b;
        if (jnyVar instanceof com.taobao.android.ultron.datamodel.imp.b) {
            c t = ((com.taobao.android.ultron.datamodel.imp.b) jnyVar).t();
            if (t != null) {
                t.a(jnwVar.x());
                t.c(jnwVar.A());
            }
            if (t != null && jnwVar.P() != null) {
                for (jnx.a aVar : jnwVar.P()) {
                    t.b().a(aVar);
                }
            }
        }
        this.q = jnwVar.C();
        this.y = jnwVar.F();
        this.b.c(this.o);
        this.b.d(this.p);
        ((com.taobao.android.ultron.datamodel.imp.b) this.b).a(jnwVar.C());
        MtopBusiness build = MtopBusiness.build(this.f15756a);
        NextRpcRequest.AttachedResponseStrategy attachedResponseStrategy = NextRpcRequest.AttachedResponseStrategy.IMMEDIATELY;
        if (this.t != null) {
            int i = AnonymousClass3.f15758a[this.t.ordinal()];
            if (i == 1) {
                attachedResponseStrategy = NextRpcRequest.AttachedResponseStrategy.FULL;
            } else if (i == 2) {
                attachedResponseStrategy = NextRpcRequest.AttachedResponseStrategy.IMMEDIATELY;
            }
        }
        a(build, jnwVar);
        this.x = new NextRpcRequest(build, this.s, attachedResponseStrategy);
    }

    private void a(MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75d0bd46", new Object[]{this, mtopBusiness});
        } else if (!v) {
        } else {
            try {
                b(mtopBusiness);
            } catch (Throwable th) {
                String str = this.o;
                UnifyLog.a(str, "NextRpcRequester", "uploadDataForTest exception: " + th.getMessage(), new String[0]);
            }
        }
    }

    private void b(MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("755a5747", new Object[]{this, mtopBusiness});
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
            jSONObject.put("userId", (Object) b(this.q));
            jSONObject.put("userNick", (Object) a(this.q));
            jSONObject.put("api", (Object) mtopRequest.getApiName());
            jSONObject.put("request", (Object) mtopRequest.getData());
            jSONObject.put(InputFrame3.TYPE_RESPONSE, (Object) new String(mtopResponse.getBytedata()));
            jSONObject.put("ttid", (Object) str);
            if (headerFields != null) {
                jSONObject.put("responseHeaders", (Object) JSON.toJSON(headerFields).toString());
            }
            Map<String, String> map = this.k;
            if (map != null) {
                jSONObject.put("requestHeaders", (Object) JSON.toJSON(map).toString());
            }
            MtopRequest mtopRequest2 = new MtopRequest();
            mtopRequest2.setApiName("mtop.taobao.ultron.upload");
            mtopRequest2.setVersion("1.0");
            mtopRequest2.setData(jSONObject.toJSONString());
            MtopBusiness build = MtopBusiness.build(mtopRequest2);
            build.mo1335useWua().mo1305reqMethod(MethodEnum.POST).mo1337addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.android.ultron.datamodel.imp.NextRpcRequester.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse2, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse2, obj});
                    } else if (mtopResponse2 == null) {
                    } else {
                        UnifyLog.a(NextRpcRequester.this.o, "NextRpcRequester", "uploadDataForTest onSystemError", mtopResponse2.getRetCode(), mtopResponse2.getRetMsg(), UnifyLog.EventType.ERROR, new String[0]);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse2, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse2, baseOutDo, obj});
                    } else if (mtopResponse2 == null) {
                    } else {
                        UnifyLog.a(NextRpcRequester.this.o, "NextRpcRequester", "uploadDataForTest onSuccess", mtopResponse2.getRetCode(), mtopResponse2.getRetMsg(), UnifyLog.EventType.NET_RESPONSE, new String[0]);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse2, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse2, obj});
                    } else if (mtopResponse2 == null) {
                    } else {
                        UnifyLog.a(NextRpcRequester.this.o, "NextRpcRequester", "uploadDataForTest onError", mtopResponse2.getRetCode(), mtopResponse2.getRetMsg(), UnifyLog.EventType.ERROR, new String[0]);
                    }
                }
            });
            build.startRequest();
        }
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
    public class b extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Handler f;
        private final Handler g;

        static {
            kge.a(1380531304);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1211456707:
                    super.a((CachedMainResponse) objArr[0]);
                    return null;
                case -955963047:
                    super.a((List) objArr[0]);
                    return null;
                case -773267430:
                    super.b((RemoteMainResponse) objArr[0]);
                    return null;
                case 393428889:
                    super.a((RemoteMainResponse) objArr[0]);
                    return null;
                case 2139716234:
                    super.a((RemoteMainResponse) objArr[0], (List) objArr[1]);
                    return null;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
        }

        public static /* synthetic */ void a(b bVar, CachedMainResponse cachedMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd08a889", new Object[]{bVar, cachedMainResponse});
            } else {
                super.a(cachedMainResponse);
            }
        }

        public static /* synthetic */ void a(b bVar, RemoteMainResponse remoteMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cb144e5", new Object[]{bVar, remoteMainResponse});
            } else {
                super.a(remoteMainResponse);
            }
        }

        public static /* synthetic */ void a(b bVar, RemoteMainResponse remoteMainResponse, List list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc8b67d6", new Object[]{bVar, remoteMainResponse, list});
            } else {
                super.a(remoteMainResponse, list);
            }
        }

        public static /* synthetic */ void a(b bVar, List list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5fcb6aa5", new Object[]{bVar, list});
            } else {
                super.a(list);
            }
        }

        public static /* synthetic */ void b(b bVar, RemoteMainResponse remoteMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb3cc5e6", new Object[]{bVar, remoteMainResponse});
            } else {
                super.b(remoteMainResponse);
            }
        }

        public b(MtopBusiness mtopBusiness, jnv jnvVar, com.taobao.android.ultron.datamodel.imp.b bVar, boolean z) {
            super(mtopBusiness, jnvVar, bVar, z);
            this.f = new Handler(Looper.getMainLooper());
            this.g = jqh.a("backgroundThread");
            mtopBusiness.mo1296handler(this.g);
            jqg.b("NextRpcRequester", "使用外部传递线程的方式调用mtop接口");
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            try {
                this.g.getLooper().quitSafely();
            } catch (Throwable unused) {
            }
        }

        @Override // com.taobao.android.ultron.datamodel.imp.NextRpcRequester.a, com.alibaba.android.nextrpc.request.e
        public void a(final RemoteMainResponse remoteMainResponse, final List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f897a8a", new Object[]{this, remoteMainResponse, list});
                return;
            }
            this.f.post(new Runnable() { // from class: com.taobao.android.ultron.datamodel.imp.NextRpcRequester.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.a(b.this, remoteMainResponse, list);
                    }
                }
            });
            a();
        }

        @Override // com.taobao.android.ultron.datamodel.imp.NextRpcRequester.a, com.alibaba.android.nextrpc.request.e
        public void a(final RemoteMainResponse remoteMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17733f99", new Object[]{this, remoteMainResponse});
                return;
            }
            this.f.post(new Runnable() { // from class: com.taobao.android.ultron.datamodel.imp.NextRpcRequester.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.a(b.this, remoteMainResponse);
                    }
                }
            });
            a();
        }

        @Override // com.taobao.android.ultron.datamodel.imp.NextRpcRequester.a, com.alibaba.android.nextrpc.request.e
        public void b(final RemoteMainResponse remoteMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d1e8e01a", new Object[]{this, remoteMainResponse});
                return;
            }
            this.f.post(new Runnable() { // from class: com.taobao.android.ultron.datamodel.imp.NextRpcRequester.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.b(b.this, remoteMainResponse);
                    }
                }
            });
            a();
        }

        @Override // com.taobao.android.ultron.datamodel.imp.NextRpcRequester.a, com.alibaba.android.nextrpc.request.e
        public void a(final CachedMainResponse cachedMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7caa33d", new Object[]{this, cachedMainResponse});
                return;
            }
            this.f.post(new Runnable() { // from class: com.taobao.android.ultron.datamodel.imp.NextRpcRequester.b.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.a(b.this, cachedMainResponse);
                    }
                }
            });
            a();
        }

        @Override // com.taobao.android.ultron.datamodel.imp.NextRpcRequester.a, com.alibaba.android.nextrpc.request.e
        public void a(final List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            } else {
                this.f.post(new Runnable() { // from class: com.taobao.android.ultron.datamodel.imp.NextRpcRequester.b.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            b.a(b.this, list);
                        }
                    }
                });
            }
        }
    }

    /* loaded from: classes6.dex */
    public class a implements com.alibaba.android.nextrpc.request.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public com.taobao.android.ultron.datamodel.imp.b f15759a;
        public jnv b;
        public MtopBusiness c;
        private final long e = System.currentTimeMillis();
        private long f;
        private final boolean g;

        static {
            kge.a(-1607573600);
            kge.a(1070865210);
        }

        public static /* synthetic */ void a(a aVar, MtopResponse mtopResponse, int i, Object obj, ParseResponseHelper parseResponseHelper) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9ae28d5", new Object[]{aVar, mtopResponse, new Integer(i), obj, parseResponseHelper});
            } else {
                aVar.a(mtopResponse, i, obj, parseResponseHelper);
            }
        }

        public static /* synthetic */ boolean a(a aVar, RemoteMainResponse remoteMainResponse, List list, MtopResponse mtopResponse, ParseResponseHelper parseResponseHelper) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b02cb1c2", new Object[]{aVar, remoteMainResponse, list, mtopResponse, parseResponseHelper})).booleanValue() : aVar.a(remoteMainResponse, list, mtopResponse, parseResponseHelper);
        }

        public a(MtopBusiness mtopBusiness, jnv jnvVar, com.taobao.android.ultron.datamodel.imp.b bVar, boolean z) {
            this.c = mtopBusiness;
            this.f15759a = bVar;
            this.b = jnvVar;
            this.g = z;
        }

        @Override // com.alibaba.android.nextrpc.request.e
        public void a(RemoteMainResponse remoteMainResponse, List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f897a8a", new Object[]{this, remoteMainResponse, list});
                return;
            }
            jqg.b(this.f15759a.h(), "NextRpcRequester#remoteResponse");
            this.f = System.currentTimeMillis();
            jpq.a(NextRpcRequester.this.q, remoteMainResponse.getMtopResponse());
            MtopResponse mtopResponse = remoteMainResponse.getMtopResponse();
            int mtopRequestType = remoteMainResponse.getMtopRequestType();
            Object mtopRequestContext = remoteMainResponse.getMtopRequestContext();
            NextRpcRequester.a(NextRpcRequester.this, this.c);
            jor.a(NextRpcRequester.this.q, NextRpcRequester.this.o, mtopResponse.getDataJsonObject());
            if (this.f15759a.e()) {
                if (NextRpcRequester.a(NextRpcRequester.this)) {
                    this.f15759a.C();
                }
                this.f15759a.a(false);
            }
            try {
                if (this.b.a(mtopRequestType, mtopResponse, mtopRequestContext)) {
                    this.b.b(mtopRequestType, mtopResponse, mtopRequestContext);
                    jpq.a(NextRpcRequester.this.q, true, mtopResponse);
                    return;
                }
            } catch (Throwable unused) {
            }
            if (NextRpcRequester.this.e) {
                try {
                    this.b.a(mtopRequestType, mtopResponse, mtopRequestContext, this.f15759a, (Map<String, ? extends Object>) null);
                    jpq.a(NextRpcRequester.this.q, true, mtopResponse);
                    return;
                } catch (Throwable th) {
                    UnifyLog.a(NextRpcRequester.this.o, "NextRpcRequester", "submit onSuccess callback error", th.getMessage());
                    return;
                }
            }
            if (NextRpcRequester.b(NextRpcRequester.this)) {
                UnifyLog.a(NextRpcRequester.this.o, "NextRpcRequester", "mAsyncParseRpcResponse is true", new String[0]);
                a(remoteMainResponse, list, mtopResponse, mtopRequestType, mtopRequestContext);
            } else {
                ParseResponseHelper parseResponseHelper = new ParseResponseHelper(this.f15759a);
                if (!a(remoteMainResponse, list, mtopResponse, parseResponseHelper)) {
                    return;
                }
                a(mtopResponse, mtopRequestType, mtopRequestContext, parseResponseHelper);
            }
            jpq.a(NextRpcRequester.this.q, false, mtopResponse);
        }

        private void a(final RemoteMainResponse remoteMainResponse, final List<AttachedResponse> list, final MtopResponse mtopResponse, final int i, final Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9b6bf0", new Object[]{this, remoteMainResponse, list, mtopResponse, new Integer(i), obj});
                return;
            }
            if (NextRpcRequester.c(NextRpcRequester.this) == null) {
                NextRpcRequester.a(NextRpcRequester.this, new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.taobao.android.ultron.datamodel.imp.NextRpcRequester.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.util.concurrent.ThreadFactory
                    public Thread newThread(Runnable runnable) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "NextRpcRequester-asyncParse-thread");
                    }
                }));
                NextRpcRequester.c(NextRpcRequester.this).allowCoreThreadTimeOut(true);
            }
            NextRpcRequester.c(NextRpcRequester.this).execute(new Runnable() { // from class: com.taobao.android.ultron.datamodel.imp.NextRpcRequester.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    final ParseResponseHelper parseResponseHelper = new ParseResponseHelper(a.this.f15759a);
                    if (!a.a(a.this, remoteMainResponse, list, mtopResponse, parseResponseHelper)) {
                        return;
                    }
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.ultron.datamodel.imp.NextRpcRequester.a.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                a.a(a.this, mtopResponse, i, obj, parseResponseHelper);
                            }
                        }
                    });
                }
            });
        }

        private boolean a(RemoteMainResponse remoteMainResponse, List<AttachedResponse> list, MtopResponse mtopResponse, ParseResponseHelper parseResponseHelper) {
            Exception exc;
            byte[] bArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9c11474f", new Object[]{this, remoteMainResponse, list, mtopResponse, parseResponseHelper})).booleanValue();
            }
            jpq.b(NextRpcRequester.this.q, mtopResponse);
            try {
                bArr = mtopResponse.getBytedata();
            } catch (Exception e) {
                exc = e;
                bArr = null;
            }
            try {
                JSONObject jSONObject = (JSONObject) JSON.parseObject(bArr, JSONObject.class, new Feature[0]);
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (jSONObject2 == null) {
                    a(remoteMainResponse, mtopResponse, parseResponseHelper, bArr, (Exception) null);
                    return false;
                }
                parseResponseHelper.d(jSONObject2);
                if (parseResponseHelper.a(i.FEATURE_CONTAINER_CACHE)) {
                    parseResponseHelper.a(NextRpcRequester.this.q, NextRpcRequester.this.o, jSONObject2, true, true);
                }
                parseResponseHelper.a(jSONObject);
                if (list != null) {
                    parseResponseHelper.a(NextRpcRequester.a(NextRpcRequester.this, list));
                }
                jpq.a(NextRpcRequester.this.q, mtopResponse, jSONObject2, this.e, this.f);
                return true;
            } catch (Exception e2) {
                exc = e2;
                a(remoteMainResponse, mtopResponse, parseResponseHelper, bArr, exc);
                return false;
            }
        }

        private void a(final RemoteMainResponse remoteMainResponse, final MtopResponse mtopResponse, final ParseResponseHelper parseResponseHelper, byte[] bArr, Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36fcc43", new Object[]{this, remoteMainResponse, mtopResponse, parseResponseHelper, bArr, exc});
            } else if (this.b == null) {
                UnifyLog.d("NextRpcRequester", "mOuterCallback is null");
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.ultron.datamodel.imp.NextRpcRequester.a.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            a.this.b.a(remoteMainResponse.getMtopRequestType(), mtopResponse, remoteMainResponse.getMtopRequestContext(), true, (Map<String, ? extends Object>) parseResponseHelper.b());
                        } catch (Exception e) {
                            UnifyLog.d("NextRpcRequester", e.getMessage());
                        }
                    }
                });
                jpz.a("Ultron", "AURAMonitor", "AURAMonitor", NextRpcRequester.this.o, null, "parseResponseException", exc == null ? "" : exc.getMessage());
                String[] strArr = new String[1];
                StringBuilder sb = new StringBuilder();
                sb.append("parseResponseException#bizName=");
                sb.append(NextRpcRequester.this.o);
                sb.append("#responseByteData=");
                sb.append(bArr == null ? "none" : new String(bArr));
                strArr[0] = sb.toString();
                UnifyLog.d("NextRpcRequester", strArr);
            }
        }

        private void a(MtopResponse mtopResponse, int i, Object obj, ParseResponseHelper parseResponseHelper) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e40ea128", new Object[]{this, mtopResponse, new Integer(i), obj, parseResponseHelper});
                return;
            }
            try {
                if (parseResponseHelper.a()) {
                    this.b.a(i, mtopResponse, obj, this.f15759a, parseResponseHelper.b());
                    jpz.a(this.f15759a, mtopResponse, NextRpcRequester.this.f15756a, true, NextRpcRequester.d(NextRpcRequester.this));
                    return;
                }
                this.b.a(i, mtopResponse, obj, true, parseResponseHelper.b());
                Map<String, Object> b = parseResponseHelper.b();
                if (b == null) {
                    return;
                }
                Object obj2 = b.get("protocolVersion");
                if (!(obj2 instanceof String)) {
                    return;
                }
                try {
                    if (Float.parseFloat((String) obj2) <= 2.1d) {
                        return;
                    }
                    jpz.a(this.f15759a, mtopResponse, NextRpcRequester.this.f15756a, false, NextRpcRequester.d(NextRpcRequester.this));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                UnifyLog.a(NextRpcRequester.this.o, "NextRpcRequester", "submit onSuccess callback error", th.getMessage());
            }
        }

        @Override // com.alibaba.android.nextrpc.request.e
        public void a(RemoteMainResponse remoteMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17733f99", new Object[]{this, remoteMainResponse});
                return;
            }
            MtopResponse mtopResponse = remoteMainResponse.getMtopResponse();
            int mtopRequestType = remoteMainResponse.getMtopRequestType();
            Object mtopRequestContext = remoteMainResponse.getMtopRequestContext();
            jpq.c(NextRpcRequester.this.q, mtopResponse);
            NextRpcRequester.a(NextRpcRequester.this, this.c);
            String h = this.f15759a.h();
            UnifyLog.EventType eventType = UnifyLog.EventType.ERROR;
            UnifyLog.a(h, "NextRpcRequester", "onError", "", "", eventType, "request: " + NextRpcRequester.this.f15756a.toString());
            String h2 = this.f15759a.h();
            UnifyLog.EventType eventType2 = UnifyLog.EventType.ERROR;
            UnifyLog.a(h2, "NextRpcRequester", "onError", "", "", eventType2, "errorCode:" + mtopResponse.getRetCode() + ",errorMsg:" + mtopResponse.getRetMsg() + ",request: " + NextRpcRequester.this.f15756a.toString());
            this.f15759a.a(false);
            try {
                if (this.b != null && !this.b.a(mtopRequestType, mtopResponse, mtopRequestContext)) {
                    this.b.a(mtopRequestType, mtopResponse, mtopRequestContext, false, (Map<String, ? extends Object>) null);
                }
            } catch (Exception e) {
                UnifyLog.a(this.f15759a.h(), "NextRpcRequester", "onError 节点onError回调处理错误出错", e.getMessage());
            }
            jpz.a(this.f15759a, mtopResponse, NextRpcRequester.this.f15756a, false, NextRpcRequester.d(NextRpcRequester.this));
        }

        @Override // com.alibaba.android.nextrpc.request.e
        public void b(RemoteMainResponse remoteMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d1e8e01a", new Object[]{this, remoteMainResponse});
                return;
            }
            MtopResponse mtopResponse = remoteMainResponse.getMtopResponse();
            int mtopRequestType = remoteMainResponse.getMtopRequestType();
            Object mtopRequestContext = remoteMainResponse.getMtopRequestContext();
            NextRpcRequester.a(NextRpcRequester.this, this.c);
            String h = this.f15759a.h();
            UnifyLog.EventType eventType = UnifyLog.EventType.ERROR;
            UnifyLog.a(h, "NextRpcRequester", "onSystemError", "", "", eventType, "request: " + NextRpcRequester.this.f15756a.toString());
            String h2 = this.f15759a.h();
            UnifyLog.EventType eventType2 = UnifyLog.EventType.ERROR;
            UnifyLog.a(h2, "NextRpcRequester", "onSystemError", "", "", eventType2, "errorCode:" + mtopResponse.getRetCode() + ",errorMsg:" + mtopResponse.getRetMsg() + ",request: " + NextRpcRequester.this.f15756a.toString());
            this.f15759a.a(false);
            try {
                if (this.b != null && !this.b.a(mtopRequestType, mtopResponse, mtopRequestContext)) {
                    this.b.a(mtopRequestType, mtopResponse, mtopRequestContext, false, (Map<String, ? extends Object>) null);
                }
            } catch (Exception e) {
                UnifyLog.a(this.f15759a.h(), "NextRpcRequester", "onSystemError 节点onError回调处理错误出错", "", "", UnifyLog.EventType.ERROR, e.getMessage());
            }
            jpz.a(this.f15759a, mtopResponse, NextRpcRequester.this.f15756a, false, NextRpcRequester.d(NextRpcRequester.this));
        }

        @Override // com.alibaba.android.nextrpc.request.e
        public void a(CachedMainResponse cachedMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7caa33d", new Object[]{this, cachedMainResponse});
            } else if (!this.g) {
            } else {
                MtopResponse mtopResponse = cachedMainResponse.getMtopCacheEvent().getMtopResponse();
                Object mtopRequestContext = cachedMainResponse.getMtopRequestContext();
                NextRpcRequester.a(NextRpcRequester.this, this.c);
                String h = this.f15759a.h();
                UnifyLog.EventType eventType = UnifyLog.EventType.ERROR;
                UnifyLog.a(h, "NextRpcRequester", "onCached", "", "", eventType, "request: " + NextRpcRequester.this.f15756a.toString());
                if (mtopResponse != null) {
                    String h2 = this.f15759a.h();
                    UnifyLog.a(h2, "NextRpcRequester", "onCached", "response: " + mtopResponse.getDataJsonObject());
                }
                this.f15759a.a(true);
                try {
                    if (this.b.a(10000, mtopResponse, mtopRequestContext)) {
                        this.b.b(10000, mtopResponse, mtopRequestContext);
                        return;
                    }
                } catch (Throwable unused) {
                }
                if (NextRpcRequester.this.e) {
                    try {
                        this.b.a(10000, mtopResponse, mtopRequestContext, this.f15759a, (Map<String, ? extends Object>) null);
                        jpz.a(this.f15759a, mtopResponse, null, true, NextRpcRequester.d(NextRpcRequester.this));
                        return;
                    } catch (Throwable th) {
                        UnifyLog.a(this.f15759a.h(), "NextRpcRequester", "submit onSuccess callback error", th.getMessage());
                        return;
                    }
                }
                ParseResponseHelper parseResponseHelper = new ParseResponseHelper(this.f15759a);
                parseResponseHelper.a(mtopResponse);
                try {
                    if (parseResponseHelper.a()) {
                        this.b.a(10000, mtopResponse, mtopRequestContext, this.f15759a, parseResponseHelper.b());
                        jpz.a(this.f15759a, mtopResponse, null, true, NextRpcRequester.d(NextRpcRequester.this));
                        return;
                    }
                    parseResponseHelper.a("isCachaData", "true");
                    this.b.a(10000, mtopResponse, mtopRequestContext, true, parseResponseHelper.b());
                    jpz.a(this.f15759a, mtopResponse, null, false, NextRpcRequester.d(NextRpcRequester.this));
                } catch (Throwable th2) {
                    UnifyLog.a(this.f15759a.h(), "NextRpcRequester", "submit onSuccess callback error", th2.getMessage());
                }
            }
        }

        @Override // com.alibaba.android.nextrpc.request.e
        public void a(List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
                return;
            }
            UnifyLog.b("NextRpcRequester", "remoteMainResponseReqId = " + NextRpcRequester.a() + " identityHashCode=" + System.identityHashCode(this));
            if (list == null || list.isEmpty()) {
                return;
            }
            HashMap hashMap = new HashMap();
            if (this.b.a(NextRpcRequester.a(), list)) {
                hashMap.put("isValid", "1");
                this.b.a(NextRpcRequester.a(NextRpcRequester.this, list));
            } else {
                hashMap.put("isValid", "0");
            }
            NextRpcRequester.a(NextRpcRequester.this, this.c, hashMap);
        }
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
                UnifyLog.b("NextRpcRequester", th.getMessage());
            }
        }
        return arrayList;
    }

    private Map<String, String> b() {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        if (!(this.q instanceof Activity)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            for (String str : new String[]{"preBizName"}) {
                String queryParameter = ((Activity) this.q).getIntent().getData().getQueryParameter(str);
                if (queryParameter != null) {
                    hashMap.put(str, queryParameter);
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    @Override // tb.job
    public String a(com.alibaba.android.nextrpc.request.b bVar, Object obj, jnv jnvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("df9585d1", new Object[]{this, bVar, obj, jnvVar}) : b(bVar, obj, jnvVar);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a(this.m);
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
        } else if (!this.y) {
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

    /* JADX WARN: Type inference failed for: r12v38, types: [com.taobao.android.ultron.datamodel.imp.NextRpcRequester$2] */
    private String b(com.alibaba.android.nextrpc.request.b bVar, Object obj, jnv jnvVar) {
        com.alibaba.android.nextrpc.request.e bVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e1c9712", new Object[]{this, bVar, obj, jnvVar});
        }
        String str = this.o;
        if (str != null && joj.a(str) == null) {
            new AsyncTask<Void, Void, Void>() { // from class: com.taobao.android.ultron.datamodel.imp.NextRpcRequester.2
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
                        joj.a(NextRpcRequester.this.q, NextRpcRequester.this.o);
                        return null;
                    } catch (Throwable th) {
                        UnifyLog.a(NextRpcRequester.this.b.h(), "NextRpcRequester", "getInstance", th.getMessage());
                        return null;
                    }
                }
            }.execute(new Void[0]);
        }
        jny jnyVar = this.b;
        if (!(jnyVar instanceof com.taobao.android.ultron.datamodel.imp.b)) {
            return "";
        }
        com.taobao.android.ultron.datamodel.imp.b bVar3 = (com.taobao.android.ultron.datamodel.imp.b) jnyVar;
        if (this.m == null) {
            this.m = new HashMap();
        }
        if (v) {
            try {
                c();
            } catch (Throwable th) {
                UnifyLog.a(this.b.h(), "NextRpcRequester", "doExecute ultron params error", th.getMessage());
            }
        }
        b(this.m);
        if (this.d) {
            if (this.f) {
                this.m.put("feature", "{\"gzip\":\"true\"}");
            }
            this.m.put("params", bVar3.t().a(bVar3, this.l));
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(this.m);
            this.f15756a.setData(jSONObject.toJSONString());
            a(this.f15756a, this.m);
        } else if (this.e) {
            if (this.f) {
                this.m.put("feature", "{\"gzip\":\"true\"}");
            }
            this.m.put("params", bVar3.t().a(bVar3));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putAll(this.m);
            this.f15756a.setData(jSONObject2.toJSONString());
            a(this.f15756a, this.m);
        } else {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.putAll(this.m);
            this.f15756a.setData(jSONObject3.toJSONString());
            a(this.f15756a, this.m);
        }
        jpz.a(this.b, this.f15756a);
        jpq.a(this.q);
        if (spk.a("newUltron_container", "mtopCallbackInWorkerThread", false) || jqm.a()) {
            bVar2 = new b(this.x.getMtopBusiness(), jnvVar, bVar3, this.r);
        } else {
            bVar2 = new a(this.x.getMtopBusiness(), jnvVar, bVar3, this.r);
        }
        String a2 = bVar.a(this.x, bVar2);
        D = a2;
        return a2;
    }

    private void a(MtopBusiness mtopBusiness, jnw jnwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2286523", new Object[]{this, mtopBusiness, jnwVar});
            return;
        }
        mtopBusiness.mo1330supportStreamJson(jnwVar.L());
        mtopBusiness.mo1305reqMethod(this.c ? MethodEnum.POST : MethodEnum.GET);
        if (!this.c && this.u) {
            mtopBusiness.mo1293allowSwitchToPOST(true);
        }
        if (this.j) {
            mtopBusiness.mo1335useWua();
        }
        int i = this.i;
        if (i != -1) {
            try {
                mtopBusiness.mo1340setBizId(i);
            } catch (Exception unused) {
            }
        }
        if (!StringUtils.isEmpty(this.F)) {
            mtopBusiness.mo1310setBizTopic(this.F);
        }
        if (!StringUtils.isEmpty(this.h)) {
            mtopBusiness.mo1328setUnitStrategy(this.h);
        }
        Map<String, String> map = this.k;
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
}
