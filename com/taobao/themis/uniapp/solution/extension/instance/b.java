package com.taobao.themis.uniapp.solution.extension.instance;

import android.net.Uri;
import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.controller.FeatureStatistics;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.DataPrefetch;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import com.taobao.themis.uniapp.solution.extension.instance.a;
import com.taobao.themis.utils.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.Regex;
import tb.kge;
import tb.qox;
import tb.qoy;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0003$%&B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J*\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0014H\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\u0018\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/taobao/themis/uniapp/solution/extension/instance/MTOPPrefetchExtension;", "Lcom/taobao/themis/uniapp/solution/extension/instance/IMTOPPrefetchExtension;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Lcom/taobao/themis/kernel/TMSInstance;)V", "getInstance", "()Lcom/taobao/themis/kernel/TMSInstance;", "regex", "Lkotlin/text/Regex;", "requestCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "requestQueue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lkotlin/Pair;", "Lcom/alibaba/fastjson/JSONObject;", "generateRequestParams", "", "dataPrefetchList", "Lcom/taobao/themis/kernel/metaInfo/manifest/DataPrefetch;", "pageId", "", "url", "preCheckDataPrefetch", "", FeatureStatistics.FeatureNames.DATA_PREFETCH, "prefetch", "", "pageUrl", "traceId", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "processQueue", "translateTemplateParam", "param", "dataProvider", "Lcom/taobao/themis/uniapp/solution/extension/instance/MTOPPrefetchExtension$DataProvider;", "Companion", "DataProvider", "PrefetchCallback", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b implements com.taobao.themis.uniapp.solution.extension.instance.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final Regex f22872a;
    private final AtomicInteger b;
    private final ConcurrentLinkedQueue<Pair<JSONObject, JSONObject>> c;
    private final f d;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¨\u0006\t"}, d2 = {"Lcom/taobao/themis/uniapp/solution/extension/instance/MTOPPrefetchExtension$PrefetchCallback;", "", "onCallback", "", "isSuccess", "", "errorCode", "", "errorMsg", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public interface c {
        void a(boolean z, String str, String str2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\t"}, d2 = {"com/taobao/themis/uniapp/solution/extension/instance/MTOPPrefetchExtension$processQueue$2", "Lcom/taobao/themis/uniapp/solution/extension/instance/MTOPPrefetchExtension$PrefetchCallback;", "onCallback", "", "isSuccess", "", "errorCode", "", "errorMsg", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ Pair c;
        public final /* synthetic */ long d;

        public d(JSONObject jSONObject, Pair pair, long j) {
            this.b = jSONObject;
            this.c = pair;
            this.d = j;
        }

        @Override // com.taobao.themis.uniapp.solution.extension.instance.b.c
        public void a(boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da24c280", new Object[]{this, new Boolean(z), str, str2});
                return;
            }
            String string = this.b.getString("pageTraceId");
            String str3 = "";
            if (string == null) {
                string = str3;
            }
            String string2 = this.b.getString("requestTraceId");
            if (string2 != null) {
                str3 = string2;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "isSuccess", (String) Boolean.valueOf(z));
            jSONObject2.put((JSONObject) "request", (String) this.c.getSecond());
            jSONObject2.put((JSONObject) "cost", (String) Long.valueOf(SystemClock.uptimeMillis() - this.d));
            if (!z) {
                jSONObject2.put((JSONObject) "errorCode", str);
                jSONObject2.put((JSONObject) "errorMsg", str2);
            }
            t tVar = t.INSTANCE;
            com.taobao.themis.kernel.logger.a.a("Themis/Performance/Prefetch", "On_Prefetch_Result", string, str3, jSONObject);
            b.a(b.this).decrementAndGet();
            b.b(b.this);
        }
    }

    static {
        kge.a(462039684);
        kge.a(138641299);
        Companion = new a(null);
    }

    public b(f instance) {
        q.d(instance, "instance");
        this.d = instance;
        this.f22872a = new Regex("\\$\\{([^}]+)\\}");
        this.b = new AtomicInteger(0);
        this.c = new ConcurrentLinkedQueue<>();
    }

    public static final /* synthetic */ AtomicInteger a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("14d4383b", new Object[]{bVar}) : bVar.b;
    }

    public static final /* synthetic */ void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1729b12", new Object[]{bVar});
        } else {
            bVar.b();
        }
    }

    @Override // tb.sud
    public void a(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb8a2d", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        a.C0979a.a(this, instance);
    }

    @Override // tb.sud
    public void bQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfab7697", new Object[]{this});
        } else {
            a.C0979a.b(this);
        }
    }

    @Override // com.taobao.themis.uniapp.solution.extension.instance.a
    public void a(String pageId, String pageUrl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, pageId, pageUrl});
            return;
        }
        q.d(pageId, "pageId");
        q.d(pageUrl, "pageUrl");
        if (!n.bE()) {
            return;
        }
        a(this, this.d, pageId, pageUrl, null, 8, null);
    }

    @Override // com.taobao.themis.uniapp.solution.extension.instance.a
    public void a(ITMSPage page) {
        String a2;
        String b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb549213", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        if (!n.bE() || (a2 = page.c().e().a()) == null || (b = page.c().e().b()) == null) {
            return;
        }
        a(this.d, a2, b, com.taobao.themis.kernel.logger.b.a(page));
    }

    public static /* synthetic */ void a(b bVar, f fVar, String str, String str2, String str3, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43ddd6b", new Object[]{bVar, fVar, str, str2, str3, new Integer(i), obj});
            return;
        }
        if ((i & 8) != 0) {
            str3 = com.taobao.themis.kernel.logger.b.a(fVar);
        }
        bVar.a(fVar, str, str2, str3);
    }

    private final void a(f fVar, String str, String str2, String str3) {
        AppManifest.Performance c2;
        List<DataPrefetch> dataPrefetch;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c47c84b", new Object[]{this, fVar, str, str2, str3});
            return;
        }
        com.taobao.themis.kernel.container.a x = fVar.x();
        if (x == null || (c2 = x.c()) == null || (dataPrefetch = c2.getDataPrefetch()) == null) {
            return;
        }
        for (JSONObject jSONObject : a(dataPrefetch, str, str2)) {
            ConcurrentLinkedQueue<Pair<JSONObject, JSONObject>> concurrentLinkedQueue = this.c;
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = jSONObject2;
            jSONObject3.put((JSONObject) "pageTraceId", str3);
            jSONObject3.put((JSONObject) "requestTraceId", com.taobao.themis.kernel.logger.a.a(str3));
            t tVar = t.INSTANCE;
            concurrentLinkedQueue.add(new Pair<>(jSONObject2, jSONObject));
            b();
        }
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        while (this.b.get() < 3 && (!this.c.isEmpty())) {
            Pair<JSONObject, JSONObject> poll = this.c.poll();
            if (poll != null) {
                JSONObject first = poll.getFirst();
                JSONObject second = poll.getSecond();
                String string = first.getString("pageTraceId");
                String str = "";
                if (string == null) {
                    string = str;
                }
                String string2 = first.getString("requestTraceId");
                if (string2 != null) {
                    str = string2;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "requestParam", (String) poll.getSecond());
                t tVar = t.INSTANCE;
                com.taobao.themis.kernel.logger.a.a("Themis/Performance/Prefetch", "Send_Prefetch", string, str, jSONObject);
                a.a(Companion, this.d, second, new d(first, poll, SystemClock.uptimeMillis()));
            }
        }
    }

    private final List<JSONObject> a(List<DataPrefetch> list, String str, String str2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("df934ba", new Object[]{this, list, str, str2});
        }
        C0981b c0981b = new C0981b(str2);
        ArrayList<DataPrefetch> arrayList = new ArrayList();
        for (Object obj : list) {
            if (a(str, (DataPrefetch) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (DataPrefetch dataPrefetch : arrayList) {
            JSONObject jSONObject = null;
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((JSONObject) "api", dataPrefetch.getApi());
                jSONObject2.put((JSONObject) "v", dataPrefetch.getV());
                jSONObject2.put((JSONObject) "needLogin", (String) Boolean.valueOf(q.a((Object) dataPrefetch.getNeedLogin(), (Object) "true")));
                JSONObject jSONObject3 = jSONObject2;
                JSONObject data = dataPrefetch.getData();
                jSONObject3.put((JSONObject) "data", (String) (data != null ? r.a(data, new MTOPPrefetchExtension$generateRequestParams$$inlined$mapNotNull$lambda$1(dataPrefetch, this, c0981b)) : null));
                JSONObject jSONObject4 = jSONObject2;
                JSONObject extHeaders = dataPrefetch.getExtHeaders();
                if (extHeaders != null && extHeaders.containsKey("prefetchTimeout")) {
                    i = extHeaders.get("prefetchTimeout");
                } else {
                    i = 10000;
                }
                jSONObject4.put((JSONObject) "prefetchTimeout", (String) i);
                JSONObject jSONObject5 = jSONObject2;
                JSONObject extHeaders2 = dataPrefetch.getExtHeaders();
                jSONObject5.put((JSONObject) "extHeaders", (String) (extHeaders2 != null ? r.a(extHeaders2, new MTOPPrefetchExtension$generateRequestParams$$inlined$mapNotNull$lambda$2(dataPrefetch, this, c0981b)) : null));
                jSONObject = jSONObject2;
            } catch (Throwable th) {
                TMSLogger.b("MTOPPrefetchExtension", th.getMessage(), th);
            }
            if (jSONObject != null) {
                arrayList2.add(jSONObject);
            }
        }
        return arrayList2;
    }

    private final boolean a(String str, DataPrefetch dataPrefetch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89738f72", new Object[]{this, str, dataPrefetch})).booleanValue();
        }
        if (!q.a((Object) dataPrefetch.getType(), (Object) "mtop")) {
            TMSLogger.d("MTOPPrefetchExtension", "type is not mtop");
            return false;
        } else if (dataPrefetch.getV() == null) {
            TMSLogger.d("MTOPPrefetchExtension", "v is null");
            return false;
        } else if (dataPrefetch.getApi() == null) {
            TMSLogger.d("MTOPPrefetchExtension", "api is null");
            return false;
        } else if (dataPrefetch.getPageId() == null) {
            TMSLogger.d("MTOPPrefetchExtension", "pageId is null");
            return false;
        } else {
            String pageId = dataPrefetch.getPageId();
            if (pageId != null) {
                for (String str2 : kotlin.text.n.b((CharSequence) pageId, new String[]{"&"}, false, 0, 6, (Object) null)) {
                    if (q.a((Object) str, (Object) str2)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    private final String a(String str, C0981b c0981b) throws UnsupportedOperationException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bcfc9c23", new Object[]{this, str, c0981b});
        }
        String str2 = str;
        return !kotlin.text.n.b((CharSequence) str2, (CharSequence) "${", false, 2, (Object) null) ? str : this.f22872a.replace(str2, new MTOPPrefetchExtension$translateTemplateParam$1(c0981b, str));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/taobao/themis/uniapp/solution/extension/instance/MTOPPrefetchExtension$Companion;", "", "()V", "PREFETCH_CONCURRENT_MAX", "", "PREFETCH_TIMEOUT_KEY", "", RPCDataItems.SWITCH_TAG_LOG, "prefetch", "", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "request", "Lcom/alibaba/fastjson/JSONObject;", "callback", "Lcom/taobao/themis/uniapp/solution/extension/instance/MTOPPrefetchExtension$PrefetchCallback;", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCallback"}, k = 3, mv = {1, 4, 1})
        /* renamed from: com.taobao.themis.uniapp.solution.extension.instance.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public static final class C0980a implements qox {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c f22873a;

            public C0980a(c cVar) {
                this.f22873a = cVar;
            }

            @Override // tb.qox
            public final void a(qoy qoyVar, boolean z) {
                IpChange ipChange = $ipChange;
                boolean z2 = false;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, qoyVar, new Boolean(z)});
                    return;
                }
                c cVar = this.f22873a;
                if (qoyVar != null && qoyVar.d()) {
                    z2 = true;
                }
                String str = null;
                String b = qoyVar != null ? qoyVar.b() : null;
                if (qoyVar != null) {
                    str = qoyVar.c();
                }
                cVar.a(z2, b, str);
            }
        }

        static {
            kge.a(2144977100);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public static final /* synthetic */ void a(a aVar, f fVar, JSONObject jSONObject, c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6c755e1", new Object[]{aVar, fVar, jSONObject, cVar});
            } else {
                aVar.a(fVar, jSONObject, cVar);
            }
        }

        private final void a(f fVar, JSONObject jSONObject, c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff3cf96d", new Object[]{this, fVar, jSONObject, cVar});
            } else {
                com.taobao.themis.kernel.ability.a.a().a(fVar, TMSCalendarBridge.namespace, null, null, "mtop", "prefetchData", jSONObject, new C0980a(cVar));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003RN\u0010\u0005\u001aB\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u0003 \u0007* \u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/taobao/themis/uniapp/solution/extension/instance/MTOPPrefetchExtension$DataProvider;", "", "url", "", "(Ljava/lang/String;)V", "queryMap", "", "kotlin.jvm.PlatformType", "", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "getUrl", "()Ljava/lang/String;", "getData", "key", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.uniapp.solution.extension.instance.b$b  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0981b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, String> f22874a;
        private Uri b;
        private final String c;

        static {
            kge.a(-157394437);
        }

        public C0981b(String url) {
            q.d(url, "url");
            this.c = url;
            this.f22874a = com.taobao.themis.utils.o.a(this.c, true);
            Uri b = com.taobao.themis.utils.o.b(this.c);
            q.b(b, "TMSUrlUtils.parseUrl(url)");
            this.b = b;
        }

        public final String a(String key) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, key});
            }
            q.d(key, "key");
            int hashCode = key.hashCode();
            if (hashCode != -1364506514) {
                if (hashCode == 116079 && key.equals("url")) {
                    return this.c;
                }
            } else if (key.equals("queryParams")) {
                String query = this.b.getQuery();
                return query == null ? "" : query;
            }
            if (!kotlin.text.n.b(key, "queryParams.", false, 2, (Object) null)) {
                return "";
            }
            Map<String, String> map = this.f22874a;
            String substring = key.substring(12);
            q.b(substring, "(this as java.lang.String).substring(startIndex)");
            String str = map.get(substring);
            return str == null ? "" : str;
        }
    }
}
