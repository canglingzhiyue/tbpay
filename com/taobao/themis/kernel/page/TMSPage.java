package com.taobao.themis.kernel.page;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.monitor.procedure.s;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.ability.TMSJSAPIHandler;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.e;
import com.taobao.themis.kernel.extension.page.g;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.n;
import com.uc.webview.export.media.MessageID;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.qpm;
import tb.qpt;
import tb.qqa;
import tb.qqc;
import tb.qqo;
import tb.qqp;
import tb.qqq;
import tb.rnc;

/* loaded from: classes9.dex */
public final class TMSPage implements ITMSPage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final AtomicInteger p;

    /* renamed from: a  reason: collision with root package name */
    private qpm f22557a;
    private final String b;
    private final String c;
    private final com.taobao.themis.kernel.entity.a d;
    private final CopyOnWriteArrayList<qqa.a> e;
    private final CopyOnWriteArraySet<qqa.b> f;
    private final c g;
    private final b h;
    private TMSJSAPIHandler i;
    private qqq j;
    private final d k;
    private final CopyOnWriteArraySet<g> l;
    private final f m;
    private final com.taobao.themis.kernel.container.b n;
    private final JSONObject o;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public enum RenderStatusEnum {
        INIT,
        RENDER_READY,
        RENDER_SUCCESS,
        RENDER_ERROR
    }

    public TMSPage(f mInstance, com.taobao.themis.kernel.container.b pageModel, JSONObject jSONObject) {
        q.d(mInstance, "mInstance");
        q.d(pageModel, "pageModel");
        this.m = mInstance;
        this.n = pageModel;
        this.o = jSONObject;
        String a2 = this.n.a();
        if (a2 == null) {
            a2 = com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_PAGE_PREFIX + p.incrementAndGet();
        }
        this.b = a2;
        String b2 = this.n.b();
        this.c = b2 == null ? "" : b2;
        com.taobao.themis.kernel.container.b bVar = this.n;
        JSONObject jSONObject2 = this.o;
        this.d = new com.taobao.themis.kernel.entity.a(bVar, jSONObject2 == null ? new JSONObject() : jSONObject2);
        this.e = new CopyOnWriteArrayList<>();
        this.f = new CopyOnWriteArraySet<>();
        this.g = new c();
        this.h = new b();
        this.l = new CopyOnWriteArraySet<>();
        com.taobao.themis.kernel.utils.d dVar = com.taobao.themis.kernel.utils.d.INSTANCE;
        new Pair("pageId", this.b);
        new Pair("url", this.c);
        String a3 = com.taobao.themis.kernel.logger.b.a(this.m);
        String a4 = com.taobao.themis.kernel.logger.b.a(this);
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((JSONObject) "url", this.c);
        jSONObject4.put((JSONObject) "pageModel", (String) JSONObject.parse(JSON.toJSONString(this.n)));
        jSONObject4.put((JSONObject) "extraParams", (String) this.o);
        t tVar = t.INSTANCE;
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, com.taobao.themis.kernel.logger.a.EVENT_PAGE_INIT, a3, a4, jSONObject3);
        qpt.b(com.taobao.themis.kernel.adapter.b.class);
        this.k = new d();
    }

    public static final /* synthetic */ c a(TMSPage tMSPage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("6b18aae1", new Object[]{tMSPage}) : tMSPage.g;
    }

    public static final /* synthetic */ f b(TMSPage tMSPage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("402ef5c8", new Object[]{tMSPage}) : tMSPage.m;
    }

    public static final /* synthetic */ CopyOnWriteArrayList c(TMSPage tMSPage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArrayList) ipChange.ipc$dispatch("918c87ff", new Object[]{tMSPage}) : tMSPage.e;
    }

    public static final /* synthetic */ CopyOnWriteArraySet d(TMSPage tMSPage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArraySet) ipChange.ipc$dispatch("7a90fcb8", new Object[]{tMSPage}) : tMSPage.l;
    }

    /* loaded from: classes9.dex */
    public static final class d implements qqo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.qqo
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            TMSPage.a(TMSPage.this).a(RenderStatusEnum.RENDER_READY);
            Iterator it = TMSPage.c(TMSPage.this).iterator();
            while (it.hasNext()) {
                ((qqa.a) it.next()).b();
            }
            TMSPage.b(TMSPage.this).k().a("firstPageRenderFinish");
            s sVar = s.f18233a;
            q.b(sVar, "ProcedureManagerProxy.PROXY");
            sVar.d().a("TMS_finishLoad", SystemClock.uptimeMillis());
            String a2 = com.taobao.themis.kernel.logger.b.a(TMSPage.b(TMSPage.this));
            String a3 = com.taobao.themis.kernel.logger.b.a(TMSPage.this);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) MtopModule.KEY_PAGE_INDEX, (String) Integer.valueOf(TMSPage.b(TMSPage.this).b().d(TMSPage.this)));
            t tVar = t.INSTANCE;
            com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, com.taobao.themis.kernel.logger.a.EVENT_PAGE_RENDER_READY, a2, a3, jSONObject);
        }

        @Override // tb.qqo
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            s sVar = s.f18233a;
            q.b(sVar, "ProcedureManagerProxy.PROXY");
            sVar.d().a("TMS_firstFrame", SystemClock.uptimeMillis());
            String a2 = com.taobao.themis.kernel.logger.b.a(TMSPage.b(TMSPage.this));
            String a3 = com.taobao.themis.kernel.logger.b.a(TMSPage.this);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            CopyOnWriteArraySet<g> d = TMSPage.d(TMSPage.this);
            ArrayList arrayList = new ArrayList(p.a(d, 10));
            for (g gVar : d) {
                arrayList.add(gVar.getClass().getSimpleName());
            }
            jSONObject2.put((JSONObject) "extensions", (String) arrayList);
            t tVar = t.INSTANCE;
            com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, com.taobao.themis.kernel.logger.a.EVENT_PAGE_RENDER_SUCCESS, a2, a3, jSONObject);
            TMSPage.a(TMSPage.this).a(RenderStatusEnum.RENDER_SUCCESS);
            Iterator it = TMSPage.c(TMSPage.this).iterator();
            while (it.hasNext()) {
                ((qqa.a) it.next()).a();
            }
        }

        @Override // tb.qqo
        public void a(String str, String str2) {
            rnc pageContainer;
            rnc pageContainer2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            TMSPage.a(TMSPage.this).a(RenderStatusEnum.RENDER_ERROR);
            if (qqc.a(TMSPage.this)) {
                if (TextUtils.equals(str, "TMS_ERR_WEB_WIDGET") && n.cj()) {
                    qpm f = TMSPage.this.f();
                    if (f != null && (pageContainer2 = f.getPageContainer()) != null) {
                        pageContainer2.b(new e(str, str2, ""));
                    }
                } else if (n.ci()) {
                    if (TMSPage.this.b().i() == TMSContainerType.EMBEDDED && TMSPage.this.b().j() != TMSSolutionType.UNIAPP && !n.cg()) {
                        TMSPage.b(TMSPage.this).a(e.m);
                    } else {
                        qpm f2 = TMSPage.this.f();
                        if (f2 == null || (pageContainer = f2.getPageContainer()) == null) {
                            TMSPage.b(TMSPage.this).a(new e(str, str2, ""));
                        } else {
                            pageContainer.a(new e(str, str2, ""));
                        }
                    }
                } else {
                    TMSPage.b(TMSPage.this).a(new e(str, str2, ""));
                }
            }
            String a2 = com.taobao.themis.kernel.logger.b.a(TMSPage.b(TMSPage.this));
            String a3 = com.taobao.themis.kernel.logger.b.a(TMSPage.this);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            CopyOnWriteArraySet<g> d = TMSPage.d(TMSPage.this);
            ArrayList arrayList = new ArrayList(p.a(d, 10));
            for (g gVar : d) {
                arrayList.add(gVar.getClass().getSimpleName());
            }
            jSONObject2.put((JSONObject) "extensions", (String) arrayList);
            t tVar = t.INSTANCE;
            com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, com.taobao.themis.kernel.logger.a.EVENT_PAGE_RENDER_ERROR, a2, a3, jSONObject);
        }

        @Override // tb.qqo
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                return;
            }
            f.d B = TMSPage.b(TMSPage.this).B();
            if (B == null) {
                return;
            }
            B.a(str, str2);
        }
    }

    private final qqq s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qqq) ipChange.ipc$dispatch("9987599b", new Object[]{this}) : this.m.d().createRender(this);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public f b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("db03aa12", new Object[]{this}) : this.m;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public com.taobao.themis.kernel.entity.a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.kernel.entity.a) ipChange.ipc$dispatch("b9f0ccca", new Object[]{this}) : this.d;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.c;
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        com.taobao.themis.kernel.utils.d dVar = com.taobao.themis.kernel.utils.d.INSTANCE;
        new Pair("pageId", this.b);
        new Pair("url", this.c);
        this.j = s();
        this.i = new TMSJSAPIHandler(this);
    }

    @Override // com.taobao.themis.kernel.d
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
        } else {
            com.taobao.themis.kernel.ability.a.a().a(this);
        }
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void a(qpm pageContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc561ea", new Object[]{this, pageContext});
            return;
        }
        q.d(pageContext, "pageContext");
        TMSLogger.b("TMSBasePage", "bindContext");
        this.f22557a = pageContext;
        rnc pageContainer = pageContext.getPageContainer();
        if (pageContainer != null) {
            pageContainer.attachPage(this);
        }
        Iterator<g> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().i();
        }
        if (!n.az() || !qqc.t(this).c()) {
            return;
        }
        qqq qqqVar = this.j;
        if (qqqVar == null) {
            q.b("mRender");
        }
        boolean a2 = q.a((Object) qqqVar.d(), (Object) "Weex");
        qqq qqqVar2 = this.j;
        if (qqqVar2 == null) {
            q.b("mRender");
        }
        qqc.a(this, a2, qqqVar2);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public TMSJSAPIHandler d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSJSAPIHandler) ipChange.ipc$dispatch("b29b6fe8", new Object[]{this});
        }
        TMSJSAPIHandler tMSJSAPIHandler = this.i;
        if (tMSJSAPIHandler == null) {
            q.b("mJSAPIHandler");
        }
        return tMSJSAPIHandler;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public qpm f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qpm) ipChange.ipc$dispatch("3581ef8b", new Object[]{this}) : this.f22557a;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public View g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d6895230", new Object[]{this});
        }
        qqq qqqVar = this.j;
        if (qqqVar == null) {
            q.b("mRender");
        }
        return qqqVar.b();
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.g.a().compareTo(RenderStatusEnum.INIT) > 0) {
        } else {
            com.taobao.themis.kernel.utils.d dVar = com.taobao.themis.kernel.utils.d.INSTANCE;
            new Pair("pageId", this.b);
            new Pair("url", this.c);
            qqq qqqVar = this.j;
            if (qqqVar == null) {
                q.b("mRender");
            }
            qqqVar.a(this.k);
        }
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void a(qqp qqpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd4d688", new Object[]{this, qqpVar});
            return;
        }
        qqq qqqVar = this.j;
        if (qqqVar == null) {
            q.b("mRender");
        }
        qqqVar.b(qqpVar, this.k);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this});
        }
        qqq qqqVar = this.j;
        if (qqqVar == null) {
            q.b("mRender");
        }
        return qqqVar.d();
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public ITMSPage.PageStatusEnum n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage.PageStatusEnum) ipChange.ipc$dispatch("d5c102e4", new Object[]{this}) : this.h.a();
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void a(qqa.a listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f359b5a", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        if (this.g.a() == RenderStatusEnum.RENDER_SUCCESS) {
            listener.a();
        } else {
            this.e.add(listener);
        }
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void a(qqa.b listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f360fb9", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        this.f.add(listener);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void b(qqa.b listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("991179fa", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        this.f.remove(listener);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    @Deprecated(message = "use sendEventToRender")
    public void a(String event, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8072587d", new Object[]{this, event, json});
            return;
        }
        q.d(event, "event");
        qqq qqqVar = this.j;
        if (qqqVar == null) {
            q.b("mRender");
        }
        qqqVar.a(event, json);
        com.taobao.themis.kernel.ability.c.a(event, json);
        TMSPage tMSPage = this;
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_NATIVE_EVENT, com.taobao.themis.kernel.logger.a.EVEN_ON_NEVENT_FIRE, com.taobao.themis.kernel.logger.b.a(tMSPage), com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.b.a(tMSPage)), com.taobao.themis.kernel.utils.f.a(new Pair("name", event), new Pair("params", json)));
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void b(String event, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("721bfe9c", new Object[]{this, event, json});
            return;
        }
        q.d(event, "event");
        qqq qqqVar = this.j;
        if (qqqVar == null) {
            q.b("mRender");
        }
        qqqVar.b(event, json);
        com.taobao.themis.kernel.ability.c.a(event, json);
        TMSPage tMSPage = this;
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_NATIVE_EVENT, com.taobao.themis.kernel.logger.a.EVEN_ON_NEVENT_FIRE, com.taobao.themis.kernel.logger.b.a(tMSPage), com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.b.a(tMSPage)), com.taobao.themis.kernel.utils.f.a(new Pair("name", event), new Pair("params", json)));
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void a(String target, String event, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578c98f3", new Object[]{this, target, event, json});
            return;
        }
        q.d(target, "target");
        q.d(event, "event");
        qqq qqqVar = this.j;
        if (qqqVar == null) {
            q.b("mRender");
        }
        qqqVar.a(target, event, json);
        com.taobao.themis.kernel.ability.c.a(event, json);
        TMSPage tMSPage = this;
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_NATIVE_EVENT, com.taobao.themis.kernel.logger.a.EVEN_ON_NEVENT_FIRE, com.taobao.themis.kernel.logger.b.a(tMSPage), com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.b.a(tMSPage)), com.taobao.themis.kernel.utils.f.a(new Pair("name", event), new Pair("params", json), new Pair("target", target)));
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void a(byte[] script, String name) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba3ac339", new Object[]{this, script, name});
            return;
        }
        q.d(script, "script");
        q.d(name, "name");
        qqq qqqVar = this.j;
        if (qqqVar == null) {
            q.b("mRender");
        }
        qqqVar.a(script, name);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void a(String script, String name) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, script, name});
            return;
        }
        q.d(script, "script");
        q.d(name, "name");
        qqq qqqVar = this.j;
        if (qqqVar == null) {
            q.b("mRender");
        }
        qqqVar.a(script, name);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        qqq qqqVar = this.j;
        if (qqqVar == null) {
            q.b("mRender");
        }
        qqqVar.p();
        this.h.a(ITMSPage.PageStatusEnum.ON_START);
        qpt.b(com.taobao.themis.kernel.adapter.b.class);
        Iterator<qqa.b> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().e(this);
        }
        TMSPage tMSPage = this;
        String a2 = com.taobao.themis.kernel.logger.b.a(tMSPage);
        String a3 = com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.b.a(tMSPage));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "onStart");
        CopyOnWriteArraySet<qqa.b> copyOnWriteArraySet = this.f;
        ArrayList arrayList = new ArrayList(p.a(copyOnWriteArraySet, 10));
        for (qqa.b bVar : copyOnWriteArraySet) {
            arrayList.add(bVar.getClass().getName());
        }
        jSONObject.put("listeners", (Object) arrayList);
        t tVar = t.INSTANCE;
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, com.taobao.themis.kernel.logger.a.EVENT_LIFECYCLE, a2, a3, jSONObject);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.h.a(ITMSPage.PageStatusEnum.ON_RESUME);
        qqq qqqVar = this.j;
        if (qqqVar == null) {
            q.b("mRender");
        }
        qqqVar.e();
        qpt.b(com.taobao.themis.kernel.adapter.b.class);
        Iterator<qqa.b> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
        TMSPage tMSPage = this;
        String a2 = com.taobao.themis.kernel.logger.b.a(tMSPage);
        String a3 = com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.b.a(tMSPage));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "onResume");
        CopyOnWriteArraySet<qqa.b> copyOnWriteArraySet = this.f;
        ArrayList arrayList = new ArrayList(p.a(copyOnWriteArraySet, 10));
        for (qqa.b bVar : copyOnWriteArraySet) {
            arrayList.add(bVar.getClass().getName());
        }
        jSONObject.put("listeners", (Object) arrayList);
        t tVar = t.INSTANCE;
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, com.taobao.themis.kernel.logger.a.EVENT_LIFECYCLE, a2, a3, jSONObject);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.h.a(ITMSPage.PageStatusEnum.ON_PAUSE);
        qqq qqqVar = this.j;
        if (qqqVar == null) {
            q.b("mRender");
        }
        qqqVar.a();
        qpt.b(com.taobao.themis.kernel.adapter.b.class);
        Iterator<qqa.b> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
        TMSPage tMSPage = this;
        String a2 = com.taobao.themis.kernel.logger.b.a(tMSPage);
        String a3 = com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.b.a(tMSPage));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "onPause");
        CopyOnWriteArraySet<qqa.b> copyOnWriteArraySet = this.f;
        ArrayList arrayList = new ArrayList(p.a(copyOnWriteArraySet, 10));
        for (qqa.b bVar : copyOnWriteArraySet) {
            arrayList.add(bVar.getClass().getName());
        }
        jSONObject.put("listeners", (Object) arrayList);
        t tVar = t.INSTANCE;
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, com.taobao.themis.kernel.logger.a.EVENT_LIFECYCLE, a2, a3, jSONObject);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        qqq qqqVar = this.j;
        if (qqqVar == null) {
            q.b("mRender");
        }
        qqqVar.q();
        this.h.a(ITMSPage.PageStatusEnum.ON_STOP);
        qpt.b(com.taobao.themis.kernel.adapter.b.class);
        Iterator<qqa.b> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().f(this);
        }
        TMSPage tMSPage = this;
        String a2 = com.taobao.themis.kernel.logger.b.a(tMSPage);
        String a3 = com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.b.a(tMSPage));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) MessageID.onStop);
        CopyOnWriteArraySet<qqa.b> copyOnWriteArraySet = this.f;
        ArrayList arrayList = new ArrayList(p.a(copyOnWriteArraySet, 10));
        for (qqa.b bVar : copyOnWriteArraySet) {
            arrayList.add(bVar.getClass().getName());
        }
        jSONObject.put("listeners", (Object) arrayList);
        t tVar = t.INSTANCE;
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, com.taobao.themis.kernel.logger.a.EVENT_LIFECYCLE, a2, a3, jSONObject);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        qqq qqqVar = this.j;
        if (qqqVar == null) {
            q.b("mRender");
        }
        qqqVar.a(i, i2, intent);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void k() {
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        TMSLogger.a("TMSBasePage", "pageId: " + this.b + " destroy");
        TMSJSAPIHandler tMSJSAPIHandler = this.i;
        if (tMSJSAPIHandler == null) {
            q.b("mJSAPIHandler");
        }
        tMSJSAPIHandler.terminal();
        r();
        this.h.a(ITMSPage.PageStatusEnum.DESTROYED);
        qpt.b(com.taobao.themis.kernel.adapter.b.class);
        this.f.clear();
        Iterator<g> it = this.l.iterator();
        while (it.hasNext()) {
            g item = it.next();
            q.b(item, "item");
            b(item);
        }
        qpm qpmVar = this.f22557a;
        if (qpmVar != null && (titleBar = qpmVar.getTitleBar()) != null) {
            titleBar.onDestroy();
        }
        qqq qqqVar = this.j;
        if (qqqVar == null) {
            q.b("mRender");
        }
        qqqVar.f();
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, com.taobao.themis.kernel.logger.a.EVENT_PAGE_ON_DESTROY, com.taobao.themis.kernel.logger.b.a(this.m), com.taobao.themis.kernel.logger.b.a(this), new JSONObject());
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.h.a() == ITMSPage.PageStatusEnum.DESTROYED;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public Bitmap m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ac32b952", new Object[]{this});
        }
        qqq qqqVar = this.j;
        if (qqqVar == null) {
            q.b("mRender");
        }
        return qqqVar.di_();
    }

    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(1924291053);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(-476542747);
        kge.a(-2130925692);
        Companion = new a(null);
        p = new AtomicInteger(0);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void a(g extension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cedd1c6", new Object[]{this, extension});
            return;
        }
        q.d(extension, "extension");
        String str = "same class extension can not register twice: " + extension.getClass().getName();
        extension.c_(this);
        this.l.add(extension);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void b(g extension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6b873a5", new Object[]{this, extension});
            return;
        }
        q.d(extension, "extension");
        extension.c();
        this.l.remove(extension);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public <T> T a(Class<T> clz) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bd4d3fd", new Object[]{this, clz});
        }
        q.d(clz, "clz");
        T t = null;
        for (T t2 : this.l) {
            if (clz.isInstance((g) t2)) {
                t = t2;
            }
        }
        if (t instanceof Object) {
            return t;
        }
        return null;
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        this.h.a(ITMSPage.PageStatusEnum.ON_VIEW_APPEAR);
        qqq qqqVar = this.j;
        if (qqqVar == null) {
            q.b("mRender");
        }
        qqqVar.t();
        Iterator<qqa.b> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().c(this);
        }
        TMSPage tMSPage = this;
        String a2 = com.taobao.themis.kernel.logger.b.a(tMSPage);
        String a3 = com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.b.a(tMSPage));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "onViewAppear");
        CopyOnWriteArraySet<qqa.b> copyOnWriteArraySet = this.f;
        ArrayList arrayList = new ArrayList(p.a(copyOnWriteArraySet, 10));
        for (qqa.b bVar : copyOnWriteArraySet) {
            arrayList.add(bVar.getClass().getName());
        }
        jSONObject.put("listeners", (Object) arrayList);
        t tVar = t.INSTANCE;
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, com.taobao.themis.kernel.logger.a.EVENT_LIFECYCLE, a2, a3, jSONObject);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        this.h.a(ITMSPage.PageStatusEnum.ON_VIEW_DISAPPEAR);
        qqq qqqVar = this.j;
        if (qqqVar == null) {
            q.b("mRender");
        }
        qqqVar.u();
        Iterator<qqa.b> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().d(this);
        }
        TMSPage tMSPage = this;
        String a2 = com.taobao.themis.kernel.logger.b.a(tMSPage);
        String a3 = com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.b.a(tMSPage));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "onViewDisappear");
        CopyOnWriteArraySet<qqa.b> copyOnWriteArraySet = this.f;
        ArrayList arrayList = new ArrayList(p.a(copyOnWriteArraySet, 10));
        for (qqa.b bVar : copyOnWriteArraySet) {
            arrayList.add(bVar.getClass().getName());
        }
        jSONObject.put("listeners", (Object) arrayList);
        t tVar = t.INSTANCE;
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, com.taobao.themis.kernel.logger.a.EVENT_LIFECYCLE, a2, a3, jSONObject);
    }

    /* loaded from: classes9.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private RenderStatusEnum f22559a = RenderStatusEnum.INIT;
        private final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
        private final ReentrantReadWriteLock.ReadLock c = this.b.readLock();
        private final ReentrantReadWriteLock.WriteLock d = this.b.writeLock();

        static {
            kge.a(1381107367);
        }

        public final RenderStatusEnum a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RenderStatusEnum) ipChange.ipc$dispatch("5cf7a6d5", new Object[]{this});
            }
            this.c.lock();
            try {
                return this.f22559a;
            } finally {
                this.c.unlock();
            }
        }

        public final void a(RenderStatusEnum status) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad0f0cf", new Object[]{this, status});
                return;
            }
            q.d(status, "status");
            this.d.lock();
            try {
                this.f22559a = status;
            } finally {
                this.d.unlock();
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private ITMSPage.PageStatusEnum f22558a = ITMSPage.PageStatusEnum.INIT;
        private final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
        private final ReentrantReadWriteLock.ReadLock c = this.b.readLock();
        private final ReentrantReadWriteLock.WriteLock d = this.b.writeLock();

        static {
            kge.a(1658264736);
        }

        public final ITMSPage.PageStatusEnum a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITMSPage.PageStatusEnum) ipChange.ipc$dispatch("fc859d17", new Object[]{this});
            }
            this.c.lock();
            try {
                return this.f22558a;
            } finally {
                this.c.unlock();
            }
        }

        public final void a(ITMSPage.PageStatusEnum status) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55182117", new Object[]{this, status});
                return;
            }
            q.d(status, "status");
            this.d.lock();
            try {
                this.f22558a = status;
            } finally {
                this.d.unlock();
            }
        }
    }
}
