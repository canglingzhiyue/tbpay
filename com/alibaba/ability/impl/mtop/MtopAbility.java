package com.alibaba.ability.impl.mtop;

import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.stream.IMtopStreamListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.x;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.MtopAccountSiteUtils;
import mtopsdk.mtop.intf.MtopPrefetch;
import mtopsdk.mtop.util.MtopStatistics;
import tb.alm;
import tb.aln;
import tb.alo;
import tb.als;
import tb.alu;
import tb.amh;
import tb.arz;
import tb.bfy;
import tb.kge;

/* loaded from: classes2.dex */
public final class MtopAbility extends alm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_ACCOUNT_SITE = "isSupportAccountSite";
    public static final String API_PREFETCH_DATA = "prefetchData";
    public static final String API_REQUEST_DATA = "requestData";
    public static final String API_REQUEST_STREAM = "requestStream";
    public static final String API_SEND = "send";
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static final bfy f1914a;
    private static final kotlin.d b;
    private static final bfy c;

    /* loaded from: classes2.dex */
    public static final class b implements MtopPrefetch.IPrefetchCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchCallback
        public final void onPrefetch(String str, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58e86b4c", new Object[]{this, str, hashMap});
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MtopListener f1921a;

        public c(MtopListener mtopListener) {
            this.f1921a = mtopListener;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f1921a.onTimeOut();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map b;
        public final /* synthetic */ aln c;
        public final /* synthetic */ als d;

        public d(Map map, aln alnVar, als alsVar) {
            this.b = map;
            this.c = alnVar;
            this.d = alsVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MtopAbility.a(MtopAbility.this, new com.alibaba.ability.impl.mtop.c(this.b), this.c, this.d);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map b;
        public final /* synthetic */ aln c;
        public final /* synthetic */ als d;

        public e(Map map, aln alnVar, als alsVar) {
            this.b = map;
            this.c = alnVar;
            this.d = alsVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MtopAbility.this.a(new com.alibaba.ability.impl.mtop.c(this.b), this.c, this.d);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map b;
        public final /* synthetic */ aln c;
        public final /* synthetic */ als d;

        public f(Map map, aln alnVar, als alsVar) {
            this.b = map;
            this.c = alnVar;
            this.d = alsVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MtopAbility.b(MtopAbility.this, new com.alibaba.ability.impl.mtop.c(this.b), this.c, this.d);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(MtopAbility mtopAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ ExecuteResult a(MtopAbility mtopAbility, com.alibaba.ability.impl.mtop.c cVar, aln alnVar, als alsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecuteResult) ipChange.ipc$dispatch("1c9194e3", new Object[]{mtopAbility, cVar, alnVar, alsVar}) : mtopAbility.c(cVar, alnVar, alsVar);
    }

    public static final /* synthetic */ bfy a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bfy) ipChange.ipc$dispatch("f02bf09", new Object[0]) : f1914a;
    }

    public static final /* synthetic */ ExecuteResult b(MtopAbility mtopAbility, com.alibaba.ability.impl.mtop.c cVar, aln alnVar, als alsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecuteResult) ipChange.ipc$dispatch("5cea1602", new Object[]{mtopAbility, cVar, alnVar, alsVar}) : mtopAbility.b(cVar, alnVar, alsVar);
    }

    public static final /* synthetic */ kotlin.d b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kotlin.d) ipChange.ipc$dispatch("9e77df26", new Object[0]) : b;
    }

    public static final /* synthetic */ bfy c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bfy) ipChange.ipc$dispatch("1e6609c7", new Object[0]) : c;
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(930704908);
        }

        public final bfy b() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("16b46468", new Object[]{this});
            } else {
                kotlin.d b = MtopAbility.b();
                a aVar = MtopAbility.Companion;
                value = b.getValue();
            }
            return (bfy) value;
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public static final /* synthetic */ void a(a aVar, Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("afa93e36", new Object[]{aVar, runnable});
            } else {
                aVar.a(runnable);
            }
        }

        public final bfy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bfy) ipChange.ipc$dispatch("f02bf09", new Object[]{this}) : MtopAbility.a();
        }

        private final void a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            } else if (!amh.e()) {
                runnable.run();
            } else {
                Thread currentThread = Thread.currentThread();
                Looper mainLooper = Looper.getMainLooper();
                q.b(mainLooper, "Looper.getMainLooper()");
                if (q.a(currentThread, mainLooper.getThread())) {
                    runnable.run();
                } else {
                    bfy.a(MtopAbility.c(), runnable, 0L, null, 6, null);
                }
            }
        }
    }

    static {
        kge.a(556099524);
        Companion = new a(null);
        f1914a = new bfy("mega-mtop-parse", 3);
        b = kotlin.e.a(MtopAbility$Companion$streamScheduler$2.INSTANCE);
        c = new bfy("mega-mtop-call", 3);
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        q.d(api, "api");
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        try {
            switch (api.hashCode()) {
                case -1027534271:
                    if (api.equals("prefetchData")) {
                        a.a(Companion, new e(params, callback, context));
                        return null;
                    }
                    break;
                case 3526536:
                    if (api.equals("send")) {
                        return c(new com.alibaba.ability.impl.mtop.c(params), callback, context);
                    }
                    break;
                case 917836431:
                    if (api.equals(API_ACCOUNT_SITE)) {
                        return a(new com.alibaba.ability.impl.mtop.a(params), callback, context);
                    }
                    break;
                case 1149597401:
                    if (api.equals("requestData")) {
                        a.a(Companion, new d(params, callback, context));
                        return null;
                    }
                    break;
                case 1403438831:
                    if (api.equals(API_REQUEST_STREAM)) {
                        a.a(Companion, new f(params, callback, context));
                        return null;
                    }
                    break;
            }
            a$a.a aVar = a$a.Companion;
            return aVar.a("api " + api + " not found");
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            return new ErrorResult("500", message, (Map) null, 4, (o) null);
        }
    }

    private final ExecuteResult c(com.alibaba.ability.impl.mtop.c cVar, aln alnVar, als alsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("8bdfff38", new Object[]{this, cVar, alnVar, alsVar});
        }
        if (q.a((Object) cVar.t, (Object) true)) {
            return a(cVar, alnVar, alsVar);
        }
        return a(cVar, alnVar, alsVar, false);
    }

    private final ExecuteResult a(com.alibaba.ability.impl.mtop.c cVar, aln alnVar, als alsVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("824409d4", new Object[]{this, cVar, alnVar, alsVar, new Boolean(z)});
        }
        MtopRequest a2 = a(cVar);
        MtopBusiness a3 = a(a2, cVar, alsVar);
        if (z) {
            a3.mo1301prefetchComparator((MtopPrefetch.IPrefetchComparator) new com.alibaba.ability.impl.mtop.b()).mo1300prefetch(cVar.p, (MtopPrefetch.IPrefetchCallback) b.INSTANCE);
            a3.startRequest();
            return null;
        }
        MtopListener mtopListener = new MtopListener(a3, a2, alnVar, cVar, alsVar);
        a3.registerListener((IRemoteListener) mtopListener);
        a3.startRequest();
        if (cVar.i < 0) {
            cVar.i = 30000;
        } else if (cVar.i > 60000) {
            cVar.i = 60000;
        }
        com.alibaba.ability.e.a(new c(mtopListener), cVar.i);
        return null;
    }

    private final ExecuteResult b(com.alibaba.ability.impl.mtop.c cVar, aln alnVar, als alsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("6399bef7", new Object[]{this, cVar, alnVar, alsVar});
        }
        MtopRequest a2 = a(cVar);
        MtopBusiness a3 = a(a2, cVar, alsVar);
        MtopStreamListener mtopStreamListener = new MtopStreamListener(a2, alnVar);
        a3.streamMode(true);
        a3.registerListener((IMtopStreamListener) mtopStreamListener);
        a3.startRequest();
        return null;
    }

    public final ExecuteResult a(com.alibaba.ability.impl.mtop.c param, aln callback, als abilityContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("3b537eb6", new Object[]{this, param, callback, abilityContext});
        }
        q.d(param, "param");
        q.d(callback, "callback");
        q.d(abilityContext, "abilityContext");
        return a(param, callback, abilityContext, true);
    }

    private final ExecuteResult a(com.alibaba.ability.impl.mtop.a aVar, aln alnVar, als alsVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("c6683db4", new Object[]{this, aVar, alnVar, alsVar});
        }
        if (StringUtils.isEmpty(aVar.f1925a)) {
            return new ErrorResult("400", "account参数为空", (Map) null, 4, (o) null);
        }
        Pair[] pairArr = new Pair[1];
        if (MtopAccountSiteUtils.getInstanceId(aVar.f1925a) == null) {
            z = false;
        }
        pairArr[0] = j.a("isSupport", Boolean.valueOf(z));
        return new FinishResult(new JSONObject(ai.b(pairArr)), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final MtopRequest a(com.alibaba.ability.impl.mtop.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("87908ddf", new Object[]{this, cVar});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(cVar.f1926a);
        mtopRequest.setVersion(cVar.b);
        mtopRequest.setNeedEcode(q.a((Object) cVar.c, (Object) true));
        Map map = cVar.e;
        if (map != null) {
            mtopRequest.setData(new JSONObject(map).toString());
            boolean h = x.h(map);
            Map map2 = map;
            if (!h) {
                map2 = null;
            }
            mtopRequest.dataParams = map2;
        }
        return mtopRequest;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r3 == null) goto L221;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.taobao.tao.remotebusiness.MtopBusiness a(mtopsdk.mtop.domain.MtopRequest r21, com.alibaba.ability.impl.mtop.c r22, tb.als r23) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.mtop.MtopAbility.a(mtopsdk.mtop.domain.MtopRequest, com.alibaba.ability.impl.mtop.c, tb.als):com.taobao.tao.remotebusiness.MtopBusiness");
    }

    /* loaded from: classes2.dex */
    public static final class MtopListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final als abilityContext;
        private MtopResponse cachedResponse;
        private final aln callback;
        private final AtomicBoolean isFinish;
        private final MtopBusiness mtopBusiness;
        private final MtopRequest mtopRequest;
        private final com.alibaba.ability.impl.mtop.c param;

        /* loaded from: classes2.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ MtopResponse b;

            /* renamed from: com.alibaba.ability.impl.mtop.MtopAbility$MtopListener$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class RunnableC0054a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ JSONObject f1916a;
                public final /* synthetic */ a b;

                public RunnableC0054a(JSONObject jSONObject, a aVar) {
                    this.f1916a = jSONObject;
                    this.b = aVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MtopListener.access$getCallback$p(MtopListener.this).a((ExecuteResult) new FinishResult(this.f1916a, "onReceiveData"));
                    }
                }
            }

            public a(MtopResponse mtopResponse) {
                this.b = mtopResponse;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                MtopResponse mtopResponse = this.b;
                if (mtopResponse == null) {
                    return;
                }
                byte[] bytedata = mtopResponse.getBytedata();
                q.b(bytedata, "response.bytedata");
                JSONObject parseObject = JSON.parseObject(new String(bytedata, kotlin.text.d.UTF_8));
                MtopListener.access$addHeaderForResult(MtopListener.this, this.b, parseObject);
                MtopListener.access$addStatInfo(MtopListener.this, this.b, parseObject);
                com.alibaba.ability.e.a(new RunnableC0054a(parseObject, this), 0L, 2, null);
            }
        }

        /* loaded from: classes2.dex */
        public static final class b implements alo {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.alo
            public void onCallback(ExecuteResult result) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f183ed74", new Object[]{this, result});
                } else {
                    q.d(result, "result");
                }
            }
        }

        /* loaded from: classes2.dex */
        public static final class c implements alo {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.alo
            public void onCallback(ExecuteResult result) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f183ed74", new Object[]{this, result});
                } else {
                    q.d(result, "result");
                }
            }
        }

        static {
            kge.a(1027916700);
            kge.a(-525336021);
        }

        public MtopListener(MtopBusiness mtopBusiness, MtopRequest mtopRequest, aln callback, com.alibaba.ability.impl.mtop.c param, als abilityContext) {
            q.d(mtopBusiness, "mtopBusiness");
            q.d(mtopRequest, "mtopRequest");
            q.d(callback, "callback");
            q.d(param, "param");
            q.d(abilityContext, "abilityContext");
            this.mtopBusiness = mtopBusiness;
            this.mtopRequest = mtopRequest;
            this.callback = callback;
            this.param = param;
            this.abilityContext = abilityContext;
            showLoading();
            this.isFinish = new AtomicBoolean(false);
        }

        public static final /* synthetic */ void access$addHeaderForResult(MtopListener mtopListener, MtopResponse mtopResponse, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5c4e7d9", new Object[]{mtopListener, mtopResponse, jSONObject});
            } else {
                mtopListener.addHeaderForResult(mtopResponse, jSONObject);
            }
        }

        public static final /* synthetic */ void access$addStatInfo(MtopListener mtopListener, MtopResponse mtopResponse, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a834cb6e", new Object[]{mtopListener, mtopResponse, jSONObject});
            } else {
                mtopListener.addStatInfo(mtopResponse, jSONObject);
            }
        }

        public static final /* synthetic */ aln access$getCallback$p(MtopListener mtopListener) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (aln) ipChange.ipc$dispatch("6ec07602", new Object[]{mtopListener}) : mtopListener.callback;
        }

        private final void showLoading() {
            alu c2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73936486", new Object[]{this});
                return;
            }
            Map<String, ? extends Object> map = this.param.u;
            if (map == null || (c2 = this.abilityContext.f().c()) == null) {
                return;
            }
            c2.a("loading", "show", this.abilityContext, map, new c());
        }

        private final void hideLoading() {
            alu c2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aee4b521", new Object[]{this});
                return;
            }
            Map<String, ? extends Object> map = this.param.u;
            if (map == null || (c2 = this.abilityContext.f().c()) == null) {
                return;
            }
            c2.a("loading", "hide", this.abilityContext, map, new b());
        }

        public final void onTimeOut() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47459e9", new Object[]{this});
            } else if (!this.isFinish.compareAndSet(false, true)) {
            } else {
                this.mtopBusiness.cancelRequest();
                try {
                    if (this.cachedResponse != null) {
                        handleSuccessResult(this.cachedResponse);
                    } else {
                        handleErrorResult(null);
                    }
                } catch (Exception unused) {
                }
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else if (!this.isFinish.compareAndSet(false, true)) {
            } else {
                handleSuccessResult(mtopResponse);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else if (!this.isFinish.compareAndSet(false, true)) {
            } else {
                handleErrorResult(mtopResponse);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else if (!this.isFinish.compareAndSet(false, true)) {
            } else {
                handleErrorResult(mtopResponse);
            }
        }

        private final void handleSuccessResult(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf637d44", new Object[]{this, mtopResponse});
                return;
            }
            hideLoading();
            if (q.a((Object) this.param.B, (Object) true)) {
                bfy.a(MtopAbility.Companion.a(), new a(mtopResponse), 0L, null, 6, null);
            } else if (mtopResponse == null) {
            } else {
                byte[] bytedata = mtopResponse.getBytedata();
                q.b(bytedata, "response.bytedata");
                JSONObject parseObject = JSON.parseObject(new String(bytedata, kotlin.text.d.UTF_8));
                addHeaderForResult(mtopResponse, parseObject);
                addStatInfo(mtopResponse, parseObject);
                this.callback.a((ExecuteResult) new FinishResult(parseObject, "onReceiveData"));
            }
        }

        private final void handleErrorResult(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("216aa9c9", new Object[]{this, mtopResponse});
                return;
            }
            hideLoading();
            JSONObject produceErrorResponseJson = produceErrorResponseJson(mtopResponse, this.mtopRequest);
            addHeaderForResult(mtopResponse, produceErrorResponseJson);
            addStatInfo(mtopResponse, produceErrorResponseJson);
            this.callback.a((ExecuteResult) new FinishResult(produceErrorResponseJson, "onFailure"));
        }

        private final void addHeaderForResult(MtopResponse mtopResponse, JSONObject jSONObject) {
            Map<String, List<String>> headerFields;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9e78f8c", new Object[]{this, mtopResponse, jSONObject});
            } else if (mtopResponse != null && jSONObject != null && (headerFields = mtopResponse.getHeaderFields()) != null) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                    String key = entry.getKey();
                    List<String> value = entry.getValue();
                    String join = value != null ? StringUtils.join(",", value) : "";
                    if (key != null) {
                        jSONObject2.put((JSONObject) key, join);
                    }
                }
                jSONObject.put((JSONObject) "responseHeader", (String) jSONObject2);
            }
        }

        private final void addStatInfo(MtopResponse mtopResponse, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("288e3fa1", new Object[]{this, mtopResponse, jSONObject});
            } else if (mtopResponse == null || jSONObject == null) {
            } else {
                JSONObject jSONObject2 = new JSONObject();
                MtopStatistics mtopStat = mtopResponse.getMtopStat();
                if (mtopStat != null) {
                    JSONObject jSONObject3 = jSONObject2;
                    jSONObject3.put((JSONObject) "falcoId", mtopStat.falcoId);
                    jSONObject3.put((JSONObject) "eagleEyeTraceId", mtopStat.eagleEyeTraceId);
                    jSONObject3.put((JSONObject) "isPrefetch", (String) Boolean.valueOf(mtopStat.isPrefetch));
                }
                jSONObject.put((JSONObject) "statInfo", (String) jSONObject2);
            }
        }

        private final JSONObject produceErrorResponseJson(MtopResponse mtopResponse, MtopRequest mtopRequest) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("7efc243e", new Object[]{this, mtopResponse, mtopRequest});
            }
            JSONObject jSONObject = null;
            if (mtopResponse != null && mtopResponse.getBytedata() != null) {
                try {
                    byte[] bytedata = mtopResponse.getBytedata();
                    q.b(bytedata, "mtopResponse.bytedata");
                    jSONObject = JSON.parseObject(new String(bytedata, kotlin.text.d.UTF_8));
                } catch (Throwable unused) {
                }
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONObject;
                String str3 = "";
                jSONObject2.put((JSONObject) "api", mtopRequest != null ? mtopRequest.getApiName() : str3);
                if (mtopRequest != null) {
                    str3 = mtopRequest.getVersion();
                }
                jSONObject2.put((JSONObject) "v", str3);
                jSONObject2.put((JSONObject) "data", (String) new JSONObject());
                JSONArray jSONArray = new JSONArray();
                jSONObject2.put((JSONObject) com.taobao.mtop.wvplugin.a.RESULT_KEY, (String) jSONArray);
                if (mtopResponse == null) {
                    str = "FAIL_TIME_OUT";
                    str2 = "请求超时";
                } else if (mtopResponse.getRetCode() != null) {
                    str = mtopResponse.getRetCode();
                    str2 = mtopResponse.getRetMsg();
                } else {
                    str = "FAIL_SYS_REQUEST_EXPIRED";
                    str2 = "请求失效";
                }
                w wVar = w.INSTANCE;
                Object[] objArr = {str, str2};
                String format = String.format("%s::%s", Arrays.copyOf(objArr, objArr.length));
                q.b(format, "java.lang.String.format(format, *args)");
                jSONArray.add(format);
            }
            if (mtopResponse != null) {
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = jSONObject3;
                jSONObject4.put((JSONObject) ZimMessageChannel.K_RPC_RES_CODE, (String) Integer.valueOf(mtopResponse.getResponseCode()));
                jSONObject4.put((JSONObject) arz.KEY_MAPPING_CODE, mtopResponse.getMappingCode());
                jSONObject4.put((JSONObject) "errorMsg", mtopResponse.getRetMsg());
                jSONObject4.put((JSONObject) "retCode", mtopResponse.getRetCode());
                jSONObject4.put((JSONObject) "apiName", mtopResponse.getApi());
                jSONObject.put((JSONObject) "errorInfo", (String) jSONObject3);
            }
            return jSONObject;
        }
    }

    /* loaded from: classes2.dex */
    public static final class MtopStreamListener implements IMtopStreamListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final aln callback;
        private final MtopRequest mtopRequest;

        /* loaded from: classes2.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ com.taobao.tao.stream.d b;

            /* renamed from: com.alibaba.ability.impl.mtop.MtopAbility$MtopStreamListener$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class RunnableC0055a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ JSONObject f1918a;
                public final /* synthetic */ a b;

                public RunnableC0055a(JSONObject jSONObject, a aVar) {
                    this.f1918a = jSONObject;
                    this.b = aVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MtopStreamListener.access$getCallback$p(MtopStreamListener.this).a((ExecuteResult) new FinishResult(this.f1918a, "onReceiveData"));
                    }
                }
            }

            public a(com.taobao.tao.stream.d dVar) {
                this.b = dVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                com.taobao.tao.stream.d dVar = this.b;
                if (dVar == null) {
                    return;
                }
                byte[] bArr = dVar.e;
                q.b(bArr, "response.bytedata");
                JSONObject result = JSON.parseObject(new String(bArr, kotlin.text.d.UTF_8));
                MtopStreamListener.access$addHeaderForResult(MtopStreamListener.this, this.b.g, result);
                q.b(result, "result");
                result.put((JSONObject) "currentId", this.b.f);
                com.alibaba.ability.e.a(new RunnableC0055a(result, this), 0L, 2, null);
            }
        }

        /* loaded from: classes2.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ com.taobao.tao.stream.c b;

            public b(com.taobao.tao.stream.c cVar) {
                this.b = cVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                MtopStreamListener mtopStreamListener = MtopStreamListener.this;
                final JSONObject access$produceErrorResponseJson = MtopStreamListener.access$produceErrorResponseJson(mtopStreamListener, MtopStreamListener.access$getMtopRequest$p(mtopStreamListener), this.b);
                MtopStreamListener mtopStreamListener2 = MtopStreamListener.this;
                com.taobao.tao.stream.c cVar = this.b;
                MtopStreamListener.access$addHeaderForResult(mtopStreamListener2, cVar != null ? cVar.f21112a : null, access$produceErrorResponseJson);
                com.alibaba.ability.e.a(new Runnable() { // from class: com.alibaba.ability.impl.mtop.MtopAbility.MtopStreamListener.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            MtopStreamListener.access$getCallback$p(MtopStreamListener.this).a((ExecuteResult) new FinishResult(access$produceErrorResponseJson, "onFinish"));
                        }
                    }
                }, 0L, 2, null);
            }
        }

        static {
            kge.a(-442750660);
            kge.a(179613910);
        }

        public MtopStreamListener(MtopRequest mtopRequest, aln callback) {
            q.d(mtopRequest, "mtopRequest");
            q.d(callback, "callback");
            this.mtopRequest = mtopRequest;
            this.callback = callback;
        }

        public static final /* synthetic */ void access$addHeaderForResult(MtopStreamListener mtopStreamListener, Map map, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b02309d", new Object[]{mtopStreamListener, map, jSONObject});
            } else {
                mtopStreamListener.addHeaderForResult(map, jSONObject);
            }
        }

        public static final /* synthetic */ aln access$getCallback$p(MtopStreamListener mtopStreamListener) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (aln) ipChange.ipc$dispatch("a647762", new Object[]{mtopStreamListener}) : mtopStreamListener.callback;
        }

        public static final /* synthetic */ MtopRequest access$getMtopRequest$p(MtopStreamListener mtopStreamListener) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MtopRequest) ipChange.ipc$dispatch("d51fb722", new Object[]{mtopStreamListener}) : mtopStreamListener.mtopRequest;
        }

        public static final /* synthetic */ JSONObject access$produceErrorResponseJson(MtopStreamListener mtopStreamListener, MtopRequest mtopRequest, com.taobao.tao.stream.a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("6f740bdf", new Object[]{mtopStreamListener, mtopRequest, aVar}) : mtopStreamListener.produceErrorResponseJson(mtopRequest, aVar);
        }

        @Override // com.taobao.tao.stream.IMtopStreamListener
        public void onReceiveData(com.taobao.tao.stream.d dVar, BaseOutDo baseOutDo, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ccf0e5c", new Object[]{this, dVar, baseOutDo, new Integer(i), obj});
            } else {
                bfy.a(MtopAbility.Companion.b(), new a(dVar), 0L, null, 6, null);
            }
        }

        private final void addHeaderForResult(Map<String, ? extends List<String>> map, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88f53dea", new Object[]{this, map, jSONObject});
            } else if (map != null && jSONObject != null) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String join = StringUtils.join(",", entry.getValue());
                    if (key != null) {
                        jSONObject2.put((JSONObject) key, join);
                    }
                }
                jSONObject.put((JSONObject) "responseHeader", (String) jSONObject2);
            }
        }

        @Override // com.taobao.tao.stream.IMtopStreamListener
        public void onError(com.taobao.tao.stream.b bVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5fad801", new Object[]{this, bVar, new Integer(i), obj});
                return;
            }
            JSONObject produceErrorResponseJson = produceErrorResponseJson(this.mtopRequest, bVar);
            addHeaderForResult(bVar != null ? bVar.f21112a : null, produceErrorResponseJson);
            this.callback.a((ExecuteResult) new FinishResult(produceErrorResponseJson, "onFailure"));
        }

        @Override // com.taobao.tao.stream.IMtopStreamListener
        public void onFinish(com.taobao.tao.stream.c cVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("295b572b", new Object[]{this, cVar, new Integer(i), obj});
            } else {
                bfy.a(MtopAbility.Companion.b(), new b(cVar), 0L, null, 6, null);
            }
        }

        private final JSONObject produceErrorResponseJson(MtopRequest mtopRequest, com.taobao.tao.stream.a aVar) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("59887eac", new Object[]{this, mtopRequest, aVar});
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            String str3 = "";
            jSONObject2.put((JSONObject) "api", mtopRequest != null ? mtopRequest.getApiName() : str3);
            if (mtopRequest != null) {
                str3 = mtopRequest.getVersion();
            }
            jSONObject2.put((JSONObject) "v", str3);
            jSONObject2.put((JSONObject) "data", (String) new JSONObject());
            JSONArray jSONArray = new JSONArray();
            jSONObject2.put((JSONObject) com.taobao.mtop.wvplugin.a.RESULT_KEY, (String) jSONArray);
            if (aVar != null) {
                str = aVar.b;
                str2 = aVar.c;
            } else {
                str = "FAIL_SYS_REQUEST_EXPIRED";
                str2 = "请求失效";
            }
            w wVar = w.INSTANCE;
            Object[] objArr = {str, str2};
            String format = String.format("%s::%s", Arrays.copyOf(objArr, objArr.length));
            q.b(format, "java.lang.String.format(format, *args)");
            jSONArray.add(format);
            return jSONObject;
        }
    }
}
