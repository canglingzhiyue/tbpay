package com.taobao.android.ultron.datamodel.imp;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteCacheListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import mtopsdk.mtop.common.MtopCacheEvent;
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
import tb.jnz;
import tb.joj;
import tb.jpq;
import tb.jpz;
import tb.jqg;
import tb.jqh;
import tb.jqm;
import tb.kge;
import tb.spk;

/* loaded from: classes6.dex */
public class DMRequester implements jnz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HEADER_FEATURE_KEY = "feature";
    public static final String HEADER_FEATURE_VAL = "{\"gzip\":\"true\"}";
    public static final String KEY_IS_CACHE_DATA = "isCachaData";
    public static final String KEY_SP_FILE_NAME = "ultornSdkSpName";
    public static final String KEY_USER_ID = "userId";
    public static final String KEY_USER_NAME = "userName";
    public static boolean u;
    private static final ExecutorService w;
    private boolean A;
    public String B;

    /* renamed from: a  reason: collision with root package name */
    public MtopRequest f15747a;
    public MtopBusiness b;
    public jny c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public String i;
    public String j;
    public int k;
    public boolean l;
    public Map<String, String> m;
    public IDMComponent n;
    public Map<String, String> o;
    public Class<?> p;
    public String q;
    public String r;
    public Context s;
    public boolean t;
    public String v;
    private boolean x;
    private boolean y;
    private boolean z;

    public static /* synthetic */ void a(DMRequester dMRequester, MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79aca2df", new Object[]{dMRequester, mtopBusiness});
        } else {
            dMRequester.a(mtopBusiness);
        }
    }

    public static /* synthetic */ boolean a(DMRequester dMRequester) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ffd3d385", new Object[]{dMRequester})).booleanValue() : dMRequester.z;
    }

    public static /* synthetic */ ExecutorService b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("1a7854d2", new Object[0]) : w;
    }

    public static /* synthetic */ boolean b(DMRequester dMRequester) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8cc0eaa4", new Object[]{dMRequester})).booleanValue() : dMRequester.A;
    }

    public static /* synthetic */ Map c(DMRequester dMRequester) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ecfe99b4", new Object[]{dMRequester}) : dMRequester.c();
    }

    static {
        kge.a(-2011835560);
        kge.a(1167170018);
        w = jqh.a(1, 1, 1000L, TimeUnit.MILLISECONDS, "DMRequester-asyncResponse-thread");
        u = false;
    }

    public DMRequester(jnw jnwVar) {
        this.x = true;
        this.d = true;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = true;
        this.k = -1;
        this.l = false;
        this.q = "default";
        this.B = "";
        this.t = true;
        this.y = false;
        this.z = false;
        this.A = false;
        if (jnwVar == null) {
            return;
        }
        this.h = jnwVar.t();
        if (jnwVar.s() != null) {
            this.c = jnwVar.s();
        } else {
            this.c = new b(this.h);
        }
        this.m = jnwVar.p();
        this.i = jnwVar.i();
        this.j = jnwVar.j();
        this.f = jnwVar.c();
        this.g = jnwVar.d();
        this.l = jnwVar.n();
        this.d = jnwVar.l();
        this.e = jnwVar.m();
        this.k = jnwVar.k();
        this.n = jnwVar.b();
        this.o = jnwVar.o();
        this.p = jnwVar.a();
        this.q = jnwVar.q();
        this.r = jnwVar.r();
        this.B = jnwVar.R();
        this.z = jnwVar.H();
        this.A = jnwVar.G();
        this.y = jnwVar.I();
        this.v = jnwVar.u();
        this.t = jnwVar.x();
        this.f15747a = new MtopRequest();
        this.f15747a.setApiName(jnwVar.e());
        this.f15747a.setVersion(jnwVar.f());
        this.f15747a.setNeedSession(jnwVar.g());
        this.f15747a.setNeedEcode(jnwVar.h());
        this.s = jnwVar.C();
        this.x = jnwVar.F();
        this.c.c(this.q);
        this.c.d(this.r);
        ((b) this.c).a(jnwVar.C());
        jny jnyVar = this.c;
        if (!(jnyVar instanceof b)) {
            return;
        }
        c t = ((b) jnyVar).t();
        if (t != null && jnwVar.P() != null) {
            for (jnx.a aVar : jnwVar.P()) {
                t.b().a(aVar);
            }
        }
        t.a(this.t);
    }

    private void a(MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75d0bd46", new Object[]{this, mtopBusiness});
        } else if (!u) {
        } else {
            try {
                b(mtopBusiness);
            } catch (Throwable th) {
                String str = this.q;
                UnifyLog.a(str, "DMRequester", "uploadDataForTest exception: " + th.getMessage(), new String[0]);
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
            jSONObject.put("userId", (Object) b(this.s));
            jSONObject.put("userNick", (Object) a(this.s));
            jSONObject.put("api", (Object) mtopRequest.getApiName());
            jSONObject.put("request", (Object) mtopRequest.getData());
            jSONObject.put(InputFrame3.TYPE_RESPONSE, (Object) new String(mtopResponse.getBytedata()));
            jSONObject.put("ttid", (Object) str);
            if (headerFields != null) {
                jSONObject.put("responseHeaders", (Object) JSON.toJSON(headerFields).toString());
            }
            Map<String, String> map = this.m;
            if (map != null) {
                jSONObject.put("requestHeaders", (Object) JSON.toJSON(map).toString());
            }
            MtopRequest mtopRequest2 = new MtopRequest();
            mtopRequest2.setApiName("mtop.taobao.ultron.upload");
            mtopRequest2.setVersion("1.0");
            mtopRequest2.setData(jSONObject.toJSONString());
            MtopBusiness build = MtopBusiness.build(mtopRequest2);
            build.mo1335useWua().mo1305reqMethod(MethodEnum.POST).mo1337addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.android.ultron.datamodel.imp.DMRequester.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse2, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse2, obj});
                    } else if (mtopResponse2 == null) {
                    } else {
                        UnifyLog.a(DMRequester.this.q, "DMRequester", "uploadDataForTest onSystemError", mtopResponse2.getRetCode(), mtopResponse2.getRetMsg(), UnifyLog.EventType.ERROR, new String[0]);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse2, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse2, baseOutDo, obj});
                    } else if (mtopResponse2 == null) {
                    } else {
                        UnifyLog.a(DMRequester.this.q, "DMRequester", "uploadDataForTest onSuccess", mtopResponse2.getRetCode(), mtopResponse2.getRetMsg(), UnifyLog.EventType.NET_RESPONSE, new String[0]);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse2, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse2, obj});
                    } else if (mtopResponse2 == null) {
                    } else {
                        UnifyLog.a(DMRequester.this.q, "DMRequester", "uploadDataForTest onError", mtopResponse2.getRetCode(), mtopResponse2.getRetMsg(), UnifyLog.EventType.ERROR, new String[0]);
                    }
                }
            });
            build.startRequest();
        }
    }

    @Override // tb.jnz
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        MtopBusiness mtopBusiness = this.b;
        if (mtopBusiness == null) {
            return;
        }
        mtopBusiness.cancelRequest();
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
    public class WorkerThreadResponse extends Response {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Handler mainHandler;
        private final Handler requestHandler;

        static {
            kge.a(-1041828491);
        }

        public static /* synthetic */ Object ipc$super(WorkerThreadResponse workerThreadResponse, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -743105213:
                    super.onSystemError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                    return null;
                case -662674828:
                    super.onError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                    return null;
                case 1945372761:
                    super.onCached((MtopCacheEvent) objArr[0], (BaseOutDo) objArr[1], objArr[2]);
                    return null;
                case 2057952281:
                    super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                    return null;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
        }

        public static /* synthetic */ void access$001(WorkerThreadResponse workerThreadResponse, int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10731440", new Object[]{workerThreadResponse, new Integer(i), mtopResponse, baseOutDo, obj});
            } else {
                super.onSuccess(i, mtopResponse, baseOutDo, obj);
            }
        }

        public static /* synthetic */ void access$101(WorkerThreadResponse workerThreadResponse, int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("afb4a671", new Object[]{workerThreadResponse, new Integer(i), mtopResponse, obj});
            } else {
                super.onSystemError(i, mtopResponse, obj);
            }
        }

        public static /* synthetic */ void access$201(WorkerThreadResponse workerThreadResponse, int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff808f10", new Object[]{workerThreadResponse, new Integer(i), mtopResponse, obj});
            } else {
                super.onError(i, mtopResponse, obj);
            }
        }

        public static /* synthetic */ void access$301(WorkerThreadResponse workerThreadResponse, MtopCacheEvent mtopCacheEvent, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e21f2b0c", new Object[]{workerThreadResponse, mtopCacheEvent, baseOutDo, obj});
            } else {
                super.onCached(mtopCacheEvent, baseOutDo, obj);
            }
        }

        public WorkerThreadResponse(jnv jnvVar, b bVar, MtopBusiness mtopBusiness) {
            super(jnvVar, bVar, mtopBusiness);
            this.mainHandler = new Handler(Looper.getMainLooper());
            this.requestHandler = jqh.a("backgroundThread");
            mtopBusiness.mo1296handler(this.requestHandler);
            jqg.b("DMRequester", "使用外部传递线程的方式调用mtop接口");
        }

        private void safeQuitRequestThread() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6938564", new Object[]{this});
                return;
            }
            try {
                this.requestHandler.getLooper().quitSafely();
            } catch (Throwable unused) {
            }
        }

        @Override // com.taobao.android.ultron.datamodel.imp.DMRequester.Response, com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(final int i, final MtopResponse mtopResponse, final BaseOutDo baseOutDo, final Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            this.mainHandler.post(new Runnable() { // from class: com.taobao.android.ultron.datamodel.imp.DMRequester.WorkerThreadResponse.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        WorkerThreadResponse.access$001(WorkerThreadResponse.this, i, mtopResponse, baseOutDo, obj);
                    }
                }
            });
            safeQuitRequestThread();
        }

        @Override // com.taobao.android.ultron.datamodel.imp.DMRequester.Response, com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(final int i, final MtopResponse mtopResponse, final Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            this.mainHandler.post(new Runnable() { // from class: com.taobao.android.ultron.datamodel.imp.DMRequester.WorkerThreadResponse.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        WorkerThreadResponse.access$101(WorkerThreadResponse.this, i, mtopResponse, obj);
                    }
                }
            });
            safeQuitRequestThread();
        }

        @Override // com.taobao.android.ultron.datamodel.imp.DMRequester.Response, com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(final int i, final MtopResponse mtopResponse, final Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            this.mainHandler.post(new Runnable() { // from class: com.taobao.android.ultron.datamodel.imp.DMRequester.WorkerThreadResponse.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        WorkerThreadResponse.access$201(WorkerThreadResponse.this, i, mtopResponse, obj);
                    }
                }
            });
            safeQuitRequestThread();
        }

        @Override // com.taobao.android.ultron.datamodel.imp.DMRequester.Response, com.taobao.tao.remotebusiness.IRemoteCacheListener
        public void onCached(final MtopCacheEvent mtopCacheEvent, final BaseOutDo baseOutDo, final Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73f40859", new Object[]{this, mtopCacheEvent, baseOutDo, obj});
                return;
            }
            this.mainHandler.post(new Runnable() { // from class: com.taobao.android.ultron.datamodel.imp.DMRequester.WorkerThreadResponse.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        WorkerThreadResponse.access$301(WorkerThreadResponse.this, mtopCacheEvent, baseOutDo, obj);
                    }
                }
            });
            safeQuitRequestThread();
        }
    }

    /* loaded from: classes6.dex */
    public class Response implements IRemoteBaseListener, IRemoteCacheListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public b mDMContext;
        public MtopBusiness mMBusiness;
        public jnv mOuterCallback;
        private final long mStartRequestTimeMills = System.currentTimeMillis();

        static {
            kge.a(171410477);
            kge.a(-525336021);
            kge.a(1454207888);
        }

        public Response(jnv jnvVar, b bVar, MtopBusiness mtopBusiness) {
            this.mDMContext = bVar;
            this.mOuterCallback = jnvVar;
            this.mMBusiness = mtopBusiness;
        }

        /* JADX WARN: Type inference failed for: r2v38, types: [com.taobao.android.ultron.datamodel.imp.DMRequester$Response$2] */
        /* JADX WARN: Type inference failed for: r2v46, types: [com.taobao.android.ultron.datamodel.imp.DMRequester$Response$1] */
        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            jpq.a(DMRequester.this.s, mtopResponse);
            DMRequester.a(DMRequester.this, this.mMBusiness);
            if (DMRequester.a(DMRequester.this)) {
                new AsyncTask() { // from class: com.taobao.android.ultron.datamodel.imp.DMRequester.Response.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.os.AsyncTask
                    public Object doInBackground(Object[] objArr) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr});
                        }
                        String h = Response.this.mDMContext.h();
                        UnifyLog.EventType eventType = UnifyLog.EventType.NET;
                        UnifyLog.a(h, "DMRequester", "onSuccess", "", "", eventType, "request: " + DMRequester.this.f15747a.toString());
                        if (mtopResponse == null) {
                            return null;
                        }
                        String h2 = Response.this.mDMContext.h();
                        UnifyLog.EventType eventType2 = UnifyLog.EventType.NET;
                        UnifyLog.a(h2, "DMRequester", "onSuccess", "", "", eventType2, "response: " + mtopResponse.getDataJsonObject());
                        return null;
                    }
                }.execute(new Object[0]);
            } else {
                String h = this.mDMContext.h();
                UnifyLog.EventType eventType = UnifyLog.EventType.NET;
                UnifyLog.a(h, "DMRequester", "onSuccess", "", "", eventType, "request: " + DMRequester.this.f15747a.toString());
                if (mtopResponse != null) {
                    String h2 = this.mDMContext.h();
                    UnifyLog.EventType eventType2 = UnifyLog.EventType.NET;
                    UnifyLog.a(h2, "DMRequester", "onSuccess", "", "", eventType2, "response: " + mtopResponse.getDataJsonObject());
                }
            }
            if (this.mDMContext.e()) {
                this.mDMContext.C();
                this.mDMContext.a(false);
            }
            try {
                if (this.mOuterCallback.a(i, mtopResponse, obj)) {
                    this.mOuterCallback.b(i, mtopResponse, obj);
                    jpq.a(DMRequester.this.s, true, mtopResponse);
                    return;
                }
            } catch (Throwable unused) {
            }
            if (DMRequester.this.g) {
                try {
                    this.mOuterCallback.a(i, mtopResponse, obj, this.mDMContext, (Map<String, ? extends Object>) null);
                    jpq.a(DMRequester.this.s, true, mtopResponse);
                    return;
                } catch (Throwable th) {
                    UnifyLog.a(DMRequester.this.q, "DMRequester", "submit onSuccess callback error", th.getMessage());
                    return;
                }
            }
            jpq.b(DMRequester.this.s, mtopResponse);
            ParseResponseHelper parseResponseHelper = new ParseResponseHelper(this.mDMContext);
            JSONObject jSONObject = (JSONObject) JSON.parseObject(mtopResponse.getBytedata(), JSONObject.class, new Feature[0]);
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            parseResponseHelper.d(jSONObject2);
            if (parseResponseHelper.a(i.FEATURE_CONTAINER_CACHE)) {
                parseResponseHelper.a(DMRequester.this.s, DMRequester.this.q, jSONObject2, true, true);
            }
            parseResponseHelper.a(jSONObject);
            jpq.a(DMRequester.this.s, mtopResponse, jSONObject2, this.mStartRequestTimeMills, currentTimeMillis);
            try {
                if (parseResponseHelper.a()) {
                    this.mOuterCallback.a(i, mtopResponse, obj, this.mDMContext, parseResponseHelper.b());
                    if (DMRequester.b(DMRequester.this)) {
                        final Map c = DMRequester.c(DMRequester.this);
                        new AsyncTask() { // from class: com.taobao.android.ultron.datamodel.imp.DMRequester.Response.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.os.AsyncTask
                            public Object doInBackground(Object[] objArr) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    return ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr});
                                }
                                jpz.a(Response.this.mDMContext, mtopResponse, DMRequester.this.f15747a, true, c);
                                return null;
                            }
                        }.execute(new Object[0]);
                    } else {
                        jpz.a(this.mDMContext, mtopResponse, DMRequester.this.f15747a, true, DMRequester.c(DMRequester.this));
                    }
                } else {
                    this.mOuterCallback.a(i, mtopResponse, obj, true, parseResponseHelper.b());
                    Map<String, Object> b = parseResponseHelper.b();
                    if (b == null) {
                        return;
                    }
                    Object obj2 = b.get("protocolVersion");
                    if (!(obj2 instanceof String)) {
                        return;
                    }
                    try {
                        if (Float.parseFloat((String) obj2) > 2.1d) {
                            jpz.a(this.mDMContext, mtopResponse, DMRequester.this.f15747a, false, DMRequester.c(DMRequester.this));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                jpq.a(DMRequester.this.s, false, mtopResponse);
            } catch (Throwable th2) {
                UnifyLog.a(DMRequester.this.q, "DMRequester", "submit onSuccess callback error", th2.getMessage());
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            DMRequester.a(DMRequester.this, this.mMBusiness);
            String h = this.mDMContext.h();
            UnifyLog.EventType eventType = UnifyLog.EventType.ERROR;
            UnifyLog.a(h, "DMRequester", "onSystemError", "", "", eventType, "request: " + DMRequester.this.f15747a.toString());
            String h2 = this.mDMContext.h();
            UnifyLog.EventType eventType2 = UnifyLog.EventType.ERROR;
            UnifyLog.a(h2, "DMRequester", "onSystemError", "", "", eventType2, "errorCode:" + mtopResponse.getRetCode() + ",errorMsg:" + mtopResponse.getRetMsg() + ",request: " + DMRequester.this.f15747a.toString());
            this.mDMContext.a(false);
            try {
                if (this.mOuterCallback != null && !this.mOuterCallback.a(i, mtopResponse, obj)) {
                    this.mOuterCallback.a(i, mtopResponse, obj, false, (Map<String, ? extends Object>) null);
                }
            } catch (Exception e) {
                UnifyLog.a(this.mDMContext.h(), "DMRequester", "onSystemError 节点onError回调处理错误出错", "", "", UnifyLog.EventType.ERROR, e.getMessage());
            }
            jpz.a(this.mDMContext, mtopResponse, DMRequester.this.f15747a, false, DMRequester.c(DMRequester.this));
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            jpq.c(DMRequester.this.s, mtopResponse);
            DMRequester.a(DMRequester.this, this.mMBusiness);
            String h = this.mDMContext.h();
            UnifyLog.EventType eventType = UnifyLog.EventType.ERROR;
            UnifyLog.a(h, "DMRequester", "onError", "", "", eventType, "request: " + DMRequester.this.f15747a.toString());
            String h2 = this.mDMContext.h();
            UnifyLog.EventType eventType2 = UnifyLog.EventType.ERROR;
            UnifyLog.a(h2, "DMRequester", "onError", "", "", eventType2, "errorCode:" + mtopResponse.getRetCode() + ",errorMsg:" + mtopResponse.getRetMsg() + ",request: " + DMRequester.this.f15747a.toString());
            this.mDMContext.a(false);
            try {
                if (this.mOuterCallback != null && !this.mOuterCallback.a(i, mtopResponse, obj)) {
                    this.mOuterCallback.a(i, mtopResponse, obj, false, (Map<String, ? extends Object>) null);
                }
            } catch (Exception e) {
                UnifyLog.a(this.mDMContext.h(), "DMRequester", "onError 节点onError回调处理错误出错", e.getMessage());
            }
            jpz.a(this.mDMContext, mtopResponse, DMRequester.this.f15747a, false, DMRequester.c(DMRequester.this));
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteCacheListener
        public void onCached(MtopCacheEvent mtopCacheEvent, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73f40859", new Object[]{this, mtopCacheEvent, baseOutDo, obj});
                return;
            }
            String h = this.mDMContext.h();
            UnifyLog.EventType eventType = UnifyLog.EventType.ERROR;
            UnifyLog.a(h, "DMRequester", "onCached", "", "", eventType, "request: " + DMRequester.this.f15747a.toString());
            if (mtopCacheEvent.getMtopResponse() != null) {
                String h2 = this.mDMContext.h();
                UnifyLog.a(h2, "DMRequester", "onCached", "response: " + mtopCacheEvent.getMtopResponse().getDataJsonObject());
            }
            this.mDMContext.a(true);
            MtopResponse mtopResponse = mtopCacheEvent.getMtopResponse();
            try {
                if (this.mOuterCallback.a(10000, mtopResponse, obj)) {
                    this.mOuterCallback.b(10000, mtopResponse, obj);
                    return;
                }
            } catch (Throwable unused) {
            }
            if (DMRequester.this.g) {
                try {
                    this.mOuterCallback.a(10000, mtopResponse, obj, this.mDMContext, (Map<String, ? extends Object>) null);
                    jpz.a(this.mDMContext, mtopResponse, null, true, DMRequester.c(DMRequester.this));
                    return;
                } catch (Throwable th) {
                    UnifyLog.a(this.mDMContext.h(), "DMRequester", "submit onSuccess callback error", th.getMessage());
                    return;
                }
            }
            ParseResponseHelper parseResponseHelper = new ParseResponseHelper(this.mDMContext);
            parseResponseHelper.a(mtopResponse);
            try {
                if (parseResponseHelper.a()) {
                    this.mOuterCallback.a(10000, mtopResponse, obj, this.mDMContext, parseResponseHelper.b());
                    jpz.a(this.mDMContext, mtopResponse, null, true, DMRequester.c(DMRequester.this));
                    return;
                }
                parseResponseHelper.a("isCachaData", "true");
                this.mOuterCallback.a(10000, mtopResponse, obj, true, parseResponseHelper.b());
                jpz.a(this.mDMContext, mtopResponse, null, false, DMRequester.c(DMRequester.this));
            } catch (Throwable th2) {
                UnifyLog.a(this.mDMContext.h(), "DMRequester", "submit onSuccess callback error", th2.getMessage());
            }
        }
    }

    /* loaded from: classes6.dex */
    public class AsyncResponse extends Response {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1615258225);
        }

        public static /* synthetic */ Object ipc$super(AsyncResponse asyncResponse, String str, Object... objArr) {
            if (str.hashCode() == 2057952281) {
                super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ void access$801(AsyncResponse asyncResponse, int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f423e85e", new Object[]{asyncResponse, new Integer(i), mtopResponse, baseOutDo, obj});
            } else {
                super.onSuccess(i, mtopResponse, baseOutDo, obj);
            }
        }

        public AsyncResponse(jnv jnvVar, b bVar, MtopBusiness mtopBusiness) {
            super(jnvVar, bVar, mtopBusiness);
        }

        @Override // com.taobao.android.ultron.datamodel.imp.DMRequester.Response, com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(final int i, final MtopResponse mtopResponse, final BaseOutDo baseOutDo, final Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else {
                DMRequester.b().execute(new Runnable() { // from class: com.taobao.android.ultron.datamodel.imp.DMRequester.AsyncResponse.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            AsyncResponse.access$801(AsyncResponse.this, i, mtopResponse, baseOutDo, obj);
                        }
                    }
                });
            }
        }
    }

    private Map<String, String> c() {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        if (!(this.s instanceof Activity)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            for (String str : new String[]{"preBizName"}) {
                String queryParameter = ((Activity) this.s).getIntent().getData().getQueryParameter(str);
                if (queryParameter != null) {
                    hashMap.put(str, queryParameter);
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    @Override // tb.jnz
    public boolean a(Object obj, jnv jnvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dece67c6", new Object[]{this, obj, jnvVar})).booleanValue() : b(obj, jnvVar);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            a(this.o);
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
        } else if (!this.x) {
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

    /* JADX WARN: Type inference failed for: r0v5, types: [com.taobao.android.ultron.datamodel.imp.DMRequester$2] */
    private boolean b(Object obj, jnv jnvVar) {
        MtopListener workerThreadResponse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3b73007", new Object[]{this, obj, jnvVar})).booleanValue();
        }
        String str = this.q;
        if (str != null && joj.a(str) == null) {
            new AsyncTask<Void, Void, Void>() { // from class: com.taobao.android.ultron.datamodel.imp.DMRequester.2
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
                        joj.a(DMRequester.this.s, DMRequester.this.q);
                        return null;
                    } catch (Throwable th) {
                        UnifyLog.a(DMRequester.this.c.h(), "DMRequester", "getInstance", th.getMessage());
                        return null;
                    }
                }
            }.execute(new Void[0]);
        }
        jny jnyVar = this.c;
        if (!(jnyVar instanceof b)) {
            return false;
        }
        b bVar = (b) jnyVar;
        if (this.o == null) {
            this.o = new HashMap();
        }
        if (u) {
            try {
                d();
            } catch (Throwable th) {
                UnifyLog.a(this.c.h(), "DMRequester", "doExecute ultron params error", th.getMessage());
            }
        }
        b(this.o);
        if (this.f) {
            if (this.h) {
                this.o.put("feature", "{\"gzip\":\"true\"}");
            }
            this.o.put("params", bVar.t().a(bVar, this.n));
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(this.o);
            this.f15747a.setData(jSONObject.toJSONString());
            a(this.f15747a, this.o);
        } else if (this.g) {
            if (this.h) {
                this.o.put("feature", "{\"gzip\":\"true\"}");
            }
            this.o.put("params", bVar.t().a(bVar));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putAll(this.o);
            this.f15747a.setData(jSONObject2.toJSONString());
            a(this.f15747a, this.o);
        } else {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.putAll(this.o);
            this.f15747a.setData(jSONObject3.toJSONString());
            a(this.f15747a, this.o);
        }
        MtopBusiness build = MtopBusiness.build(this.f15747a);
        if (this.l) {
            build.mo1335useWua();
        }
        if (this.d) {
            build.mo1305reqMethod(MethodEnum.POST);
        } else {
            boolean z = this.e;
            if (z) {
                build.mo1293allowSwitchToPOST(z);
            }
        }
        String str2 = this.i;
        if (str2 != null) {
            build.mo1313setCustomDomain(str2);
        }
        int i = this.k;
        if (-1 != i) {
            build.mo1340setBizId(i);
        }
        if (!StringUtils.isEmpty(this.B)) {
            build.mo1310setBizTopic(this.B);
        }
        String str3 = this.j;
        if (str3 != null) {
            build.mo1328setUnitStrategy(str3);
        }
        if (this.m != null) {
            build.mtopProp.setRequestHeaders(this.m);
        }
        if (obj != null) {
            build.mo1338reqContext(obj);
        }
        build.mo1341setErrorNotifyAfterCache(true);
        String str4 = this.v;
        if (str4 != null) {
            build.mo1327setTraceId(str4);
        }
        this.b = build;
        jpq.a(this.s);
        if (jnvVar.a()) {
            workerThreadResponse = new AsyncResponse(jnvVar, bVar, build);
        } else if (spk.a("newUltron_container", "mtopCallbackInWorkerThread", false) || jqm.a()) {
            workerThreadResponse = new WorkerThreadResponse(jnvVar, bVar, build);
        } else {
            workerThreadResponse = new Response(jnvVar, bVar, build);
        }
        if (this.p == null) {
            build.mo1337addListener(workerThreadResponse).startRequest();
        } else {
            build.mo1337addListener(workerThreadResponse).startRequest(this.p);
        }
        jpz.a(this.c, this.f15747a);
        return true;
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
