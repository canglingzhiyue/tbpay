package com.taobao.themis.uniapp.solution;

import android.net.Uri;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.e;
import com.taobao.themis.kernel.extension.page.f;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.launcher.step.a;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifestManager;
import com.taobao.themis.kernel.metaInfo.manifest.storage.AppManifestDao;
import com.taobao.themis.kernel.utils.i;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.o;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.iwm;
import tb.kge;
import tb.nfc;
import tb.qpp;
import tb.qpr;
import tb.sgt;
import tb.thk;
import tb.tme;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/taobao/themis/uniapp/solution/TMSResourceStepGroup;", "Lcom/taobao/themis/kernel/launcher/step/ConcurrentStepGroup;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "launcher", "Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;", "(Lcom/taobao/themis/kernel/TMSInstance;Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;)V", "baseInfo", "Lcom/taobao/themis/kernel/utils/TMSUniAppUtils$UniAppBaseInfo;", "mainDocumentStep", "Lcom/taobao/themis/uniapp/solution/TMSResourceStepGroup$MainDocumentConcurrentStep;", "manifestStep", "Lcom/taobao/themis/kernel/launcher/step/ConcurrentStepGroup$ConcurrentStep;", "getName", "", "onAfterExecute", "", "onBeforeExecute", "onStepFinish", "step", "MainDocumentConcurrentStep", "ManifestASyncConcurrentStep", "ManifestSyncConcurrentStep", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a extends com.taobao.themis.kernel.launcher.step.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a.AbstractC0945a d;
    private C0975a e;
    private i.a j;

    static {
        kge.a(1359317337);
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "TMSResourceStepGroup";
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f instance, qpr launcher, qpp listener) {
        super(instance, launcher, listener);
        q.d(instance, "instance");
        q.d(launcher, "launcher");
        q.d(listener, "listener");
    }

    @Override // com.taobao.themis.kernel.launcher.step.a
    public void b(a.AbstractC0945a step) {
        String renderer;
        C0975a c0975a;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6aba36a", new Object[]{this, step});
            return;
        }
        q.d(step, "step");
        if (!(step instanceof c)) {
            return;
        }
        f mInstance = this.f22538a;
        q.b(mInstance, "mInstance");
        TMSMetaInfoWrapper metaInfo = mInstance.v();
        if (metaInfo == null) {
            return;
        }
        i iVar = i.INSTANCE;
        i.a aVar = this.j;
        q.b(metaInfo, "metaInfo");
        AppManifest.Page a2 = iVar.a(aVar, metaInfo);
        if (a2 != null && (renderer = a2.getRenderer()) != null && (c0975a = this.e) != null) {
            c0975a.a(renderer);
        }
        i.a aVar2 = this.j;
        q.a(aVar2);
        if (!aVar2.g()) {
            return;
        }
        if (a2 != null) {
            i iVar2 = i.INSTANCE;
            i.a aVar3 = this.j;
            q.a(aVar3);
            Uri parse = Uri.parse(aVar3.d());
            q.b(parse, "Uri.parse(baseInfo!!.originUrl)");
            Uri parse2 = Uri.parse(a2.getUrl());
            q.b(parse2, "Uri.parse(pageInfo.url)");
            if (iVar2.a(parse, parse2)) {
                return;
            }
        }
        if (n.bK()) {
            C0975a c0975a2 = this.e;
            if (c0975a2 == null) {
                return;
            }
            C0975a.a(c0975a2, null, null, 3, null);
        } else if (n.INSTANCE.bJ()) {
            a(e.a.URL_NOT_MATCH);
        } else {
            i iVar3 = i.INSTANCE;
            f mInstance2 = this.f22538a;
            q.b(mInstance2, "mInstance");
            TMSMetaInfoWrapper v = mInstance2.v();
            q.a(v);
            q.b(v, "mInstance.metaInfo!!");
            AppManifest.Page a3 = iVar3.a(v);
            q.a(a3);
            i.a aVar4 = this.j;
            q.a(aVar4);
            aVar4.c(a3.getId());
            C0975a c0975a3 = this.e;
            if (c0975a3 == null) {
                return;
            }
            c0975a3.a(a3.getUrl(), a3.getVersion());
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void j() {
        AppManifest appManifest;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        f().k().a("manifestStepStart");
        i iVar = i.INSTANCE;
        f mInstance = this.f22538a;
        q.b(mInstance, "mInstance");
        String g = mInstance.g();
        q.b(g, "mInstance.url");
        this.j = iVar.a(g);
        String str = this.g;
        String str2 = this.f;
        String str3 = this.c;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        i.a aVar = this.j;
        String str4 = null;
        jSONObject2.put((JSONObject) "originUrl", aVar != null ? aVar.d() : null);
        i.a aVar2 = this.j;
        jSONObject2.put((JSONObject) "baseUrl", aVar2 != null ? aVar2.a() : null);
        i.a aVar3 = this.j;
        jSONObject2.put((JSONObject) "uniAppId", aVar3 != null ? aVar3.b() : null);
        i.a aVar4 = this.j;
        jSONObject2.put((JSONObject) "pageId", aVar4 != null ? aVar4.c() : null);
        i.a aVar5 = this.j;
        jSONObject2.put((JSONObject) nfc.PHA_MONITOR_DIMENSION_MANIFEST_URL, aVar5 != null ? aVar5.e() : null);
        i.a aVar6 = this.j;
        jSONObject2.put((JSONObject) "query", aVar6 != null ? aVar6.f() : null);
        t tVar = t.INSTANCE;
        com.taobao.themis.kernel.logger.a.a(str, com.taobao.themis.kernel.logger.a.EVENT_ON_INIT, str2, str3, jSONObject);
        i.a aVar7 = this.j;
        if (aVar7 != null) {
            q.a(aVar7);
            if (aVar7.b() != null) {
                f().D().a("manifestLoadStart");
                f().D().a("manifestCacheReadStart");
                i.a aVar8 = this.j;
                AppManifestDao a2 = (aVar8 == null || !aVar8.h()) ? AppManifestManager.INSTANCE.a(this.j) : null;
                f().D().a("manifestCacheReadEnd");
                f().k().a("manifestCacheReadEnd");
                if (a2 != null && (appManifest = a2.getAppManifest()) != null) {
                    TMSMetaInfoWrapper tMSMetaInfoWrapper = new TMSMetaInfoWrapper(appManifest, this.j);
                    AppManifest.Page a3 = i.INSTANCE.a(this.j, tMSMetaInfoWrapper);
                    if (a3 != null) {
                        TMSLogger.a(a(), "get valid local manifest cache");
                        f mInstance2 = this.f22538a;
                        q.b(mInstance2, "mInstance");
                        mInstance2.a(tMSMetaInfoWrapper);
                        f mInstance3 = this.f22538a;
                        q.b(mInstance3, "mInstance");
                        com.taobao.themis.uniapp.solution.b.a(this, true, mInstance3, tMSMetaInfoWrapper);
                        AppManifest v = tMSMetaInfoWrapper.v();
                        if (!(v != null ? v.getPreset() : false)) {
                            TMSLogger.a(a(), "check manifest update async");
                            boolean ap = n.INSTANCE.ap();
                            f mInstance4 = this.f22538a;
                            q.b(mInstance4, "mInstance");
                            i.a aVar9 = this.j;
                            q.a(aVar9);
                            String e = aVar9.e();
                            q.a((Object) e);
                            qpr launcher = i();
                            q.b(launcher, "launcher");
                            qpp mListener = this.b;
                            q.b(mListener, "mListener");
                            this.d = new b(mInstance4, e, launcher, mListener, this, ap);
                            if (ap) {
                                a.AbstractC0945a abstractC0945a = this.d;
                                q.a(abstractC0945a);
                                abstractC0945a.b();
                            } else {
                                a.AbstractC0945a abstractC0945a2 = this.d;
                                q.a(abstractC0945a2);
                                c(abstractC0945a2);
                            }
                        } else {
                            TMSLogger.a(a(), "skip update manifest async");
                        }
                        tme tmeVar = tme.INSTANCE;
                        i.a aVar10 = this.j;
                        com.taobao.themis.kernel.preload.c b2 = tmeVar.b(aVar10 != null ? aVar10.d() : null);
                        if (b2 != null) {
                            TMSLogger.b(a(), "get valid prefetchInfo");
                            qpr i = i();
                            iwm iwmVar = new iwm();
                            iwmVar.a(b2);
                            t tVar2 = t.INSTANCE;
                            i.a((Class<Class>) iwm.class, (Class) iwmVar);
                            String str5 = this.g;
                            String str6 = this.f;
                            String str7 = this.c;
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put((JSONObject) "prefetchId", (String) b2.a());
                            t tVar3 = t.INSTANCE;
                            com.taobao.themis.kernel.logger.a.a(str5, "ON_GET_PREFETCH", str6, str7, jSONObject3);
                        } else {
                            i.a aVar11 = this.j;
                            q.a(aVar11);
                            if (aVar11.g()) {
                                i iVar2 = i.INSTANCE;
                                i.a aVar12 = this.j;
                                q.a(aVar12);
                                Uri parse = Uri.parse(aVar12.d());
                                q.b(parse, "Uri.parse(baseInfo!!.originUrl)");
                                Uri parse2 = Uri.parse(a3.getUrl());
                                q.b(parse2, "Uri.parse(it.url)");
                                if (!iVar2.a(parse, parse2) && !n.bK()) {
                                    i iVar3 = i.INSTANCE;
                                    f mInstance5 = this.f22538a;
                                    q.b(mInstance5, "mInstance");
                                    TMSMetaInfoWrapper v2 = mInstance5.v();
                                    q.a(v2);
                                    q.b(v2, "mInstance.metaInfo!!");
                                    a3 = iVar3.a(v2);
                                    q.a(a3);
                                    i.a aVar13 = this.j;
                                    q.a(aVar13);
                                    aVar13.c(a3.getId());
                                    if (n.INSTANCE.bJ()) {
                                        a(e.a.URL_NOT_MATCH);
                                        return;
                                    }
                                }
                            }
                            i iVar4 = i.INSTANCE;
                            String url = a3.getUrl();
                            i.a aVar14 = this.j;
                            if (aVar14 != null) {
                                str4 = aVar14.f();
                            }
                            String a4 = i.a(iVar4, url, str4, null, null, 12, null);
                            if (a4 == null) {
                                a4 = "";
                            }
                            String str8 = a4;
                            String version = a3.getVersion();
                            String renderer = a3.getRenderer();
                            i.a aVar15 = this.j;
                            q.a(aVar15);
                            f mInstance6 = this.f22538a;
                            q.b(mInstance6, "mInstance");
                            AppManifest v3 = tMSMetaInfoWrapper.v();
                            boolean preset = v3 != null ? v3.getPreset() : false;
                            qpr launcher2 = i();
                            q.b(launcher2, "launcher");
                            qpp mListener2 = this.b;
                            q.b(mListener2, "mListener");
                            C0975a c0975a = new C0975a(mInstance6, aVar15, str8, version, renderer, true, preset, launcher2, mListener2, this);
                            if (q.a((Object) renderer, (Object) "web")) {
                                c0975a.b();
                            } else {
                                c(c0975a);
                            }
                        }
                        t tVar4 = t.INSTANCE;
                        z = true;
                    } else {
                        TMSLogger.d(a(), "cannot get first page info for main document request");
                        f mInstance7 = this.f22538a;
                        q.b(mInstance7, "mInstance");
                        i.a aVar16 = this.j;
                        q.a(aVar16);
                        qpr launcher3 = i();
                        q.b(launcher3, "launcher");
                        qpp mListener3 = this.b;
                        q.b(mListener3, "mListener");
                        a aVar17 = this;
                        this.d = new c(mInstance7, aVar16, launcher3, mListener3, aVar17);
                        i.a aVar18 = this.j;
                        q.a(aVar18);
                        f mInstance8 = this.f22538a;
                        q.b(mInstance8, "mInstance");
                        f mInstance9 = this.f22538a;
                        q.b(mInstance9, "mInstance");
                        String g2 = mInstance9.g();
                        q.b(g2, "mInstance.url");
                        qpr launcher4 = i();
                        q.b(launcher4, "launcher");
                        qpp mListener4 = this.b;
                        q.b(mListener4, "mListener");
                        this.e = new C0975a(mInstance8, aVar18, g2, null, null, false, false, launcher4, mListener4, aVar17, 64, null);
                        a.AbstractC0945a abstractC0945a3 = this.d;
                        q.a(abstractC0945a3);
                        c(abstractC0945a3);
                        C0975a c0975a2 = this.e;
                        q.a(c0975a2);
                        c(c0975a2);
                        t tVar5 = t.INSTANCE;
                    }
                    t tVar6 = t.INSTANCE;
                } else {
                    TMSLogger.b(a(), "has no valid local manifest cache");
                    f mInstance10 = this.f22538a;
                    q.b(mInstance10, "mInstance");
                    i.a aVar19 = this.j;
                    q.a(aVar19);
                    qpr launcher5 = i();
                    q.b(launcher5, "launcher");
                    qpp mListener5 = this.b;
                    q.b(mListener5, "mListener");
                    a aVar20 = this;
                    this.d = new c(mInstance10, aVar19, launcher5, mListener5, aVar20);
                    i.a aVar21 = this.j;
                    q.a(aVar21);
                    f mInstance11 = this.f22538a;
                    q.b(mInstance11, "mInstance");
                    f mInstance12 = this.f22538a;
                    q.b(mInstance12, "mInstance");
                    String g3 = mInstance12.g();
                    q.b(g3, "mInstance.url");
                    qpr launcher6 = i();
                    q.b(launcher6, "launcher");
                    qpp mListener6 = this.b;
                    q.b(mListener6, "mListener");
                    this.e = new C0975a(mInstance11, aVar21, g3, null, null, false, false, launcher6, mListener6, aVar20, 64, null);
                    a.AbstractC0945a abstractC0945a4 = this.d;
                    q.a(abstractC0945a4);
                    c(abstractC0945a4);
                    i.a aVar22 = this.j;
                    if (aVar22 == null || !aVar22.h()) {
                        C0975a c0975a3 = this.e;
                        q.a(c0975a3);
                        c(c0975a3);
                    }
                    t tVar7 = t.INSTANCE;
                }
                f().D().a("isManifestExpired", Boolean.valueOf(z));
                return;
            }
        }
        a(e.a.URL_EMPTY);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0014J\b\u0010\u0015\u001a\u00020\u0013H\u0014R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/taobao/themis/uniapp/solution/TMSResourceStepGroup$ManifestASyncConcurrentStep;", "Lcom/taobao/themis/kernel/launcher/step/ConcurrentStepGroup$ConcurrentStep;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", nfc.PHA_MONITOR_DIMENSION_MANIFEST_URL, "", "launcher", "Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;", "group", "Lcom/taobao/themis/kernel/launcher/step/ConcurrentStepGroup;", "asyncOpt", "", "(Lcom/taobao/themis/kernel/TMSInstance;Ljava/lang/String;Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;Lcom/taobao/themis/kernel/launcher/step/ConcurrentStepGroup;Z)V", "getAsyncOpt", "()Z", "getName", "onAfterExecute", "", "onBeforeExecute", "onExecuting", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b extends a.AbstractC0945a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String d;
        private final boolean e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/uniapp/solution/TMSResourceStepGroup$ManifestASyncConcurrentStep$onExecuting$1", "Lcom/taobao/themis/kernel/metaInfo/manifest/AppManifestManager$RequestCallback;", "onCallback", "", "result", "Lcom/taobao/themis/kernel/metaInfo/manifest/request/ManifestRequestClient$Result;", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
        /* renamed from: com.taobao.themis.uniapp.solution.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public static final class C0977a implements AppManifestManager.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0977a() {
            }

            @Override // com.taobao.themis.kernel.metaInfo.manifest.AppManifestManager.a
            public void a(sgt.b result) {
                String appId;
                String str;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1e662cba", new Object[]{this, result});
                    return;
                }
                q.d(result, "result");
                f mInstance = b.this.f22538a;
                q.b(mInstance, "mInstance");
                TMSMetaInfoWrapper v = mInstance.v();
                q.a(v);
                String b = v.b();
                if (!result.a() || result.b() == null) {
                    return;
                }
                AppManifest b2 = result.b();
                q.a(b2);
                AppManifest.AppInfo appInfo = b2.getAppInfo();
                String str2 = null;
                String version = appInfo != null ? appInfo.getVersion() : null;
                String str3 = b.this.c;
                String mLogTraceId = b.this.c;
                q.b(mLogTraceId, "mLogTraceId");
                String a2 = com.taobao.themis.kernel.logger.a.a(mLogTraceId);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "manifest", (String) JSONObject.parseObject(JSON.toJSONString(result.b())));
                t tVar = t.INSTANCE;
                com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_APPINFO, "ON_GET_ASYNC_MANIFEST", str3, a2, jSONObject);
                Map<String, String> c = result.c();
                List b3 = (c == null || (str = c.get("x-deprecated-versions")) == null) ? null : kotlin.text.n.b((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null);
                if (!n.INSTANCE.aG() || b3 == null) {
                    return;
                }
                List list = b3;
                if (!p.a((Iterable<? extends String>) list, b)) {
                    return;
                }
                if (p.a((Iterable<? extends String>) list, version)) {
                    String str4 = b.this.g;
                    String str5 = b.this.f;
                    String str6 = b.this.c;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put((JSONObject) "errorMsg", "latest version is in x-deprecated-versions");
                    t tVar2 = t.INSTANCE;
                    com.taobao.themis.kernel.logger.a.c(str4, com.taobao.themis.kernel.logger.a.EVENT_ON_ERROR, str5, str6, jSONObject2);
                    AppManifest b4 = result.b();
                    q.a(b4);
                    AppManifest.AppInfo appInfo2 = b4.getAppInfo();
                    if (appInfo2 != null && (appId = appInfo2.getAppId()) != null) {
                        AppManifestManager.INSTANCE.a(appId);
                    }
                    com.taobao.themis.kernel.utils.a.a(new TMSResourceStepGroup$ManifestASyncConcurrentStep$onExecuting$1$onCallback$4(this));
                    return;
                }
                String str7 = b.this.g;
                String str8 = b.this.f;
                String str9 = b.this.c;
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = jSONObject3;
                JSONObject jSONObject5 = new JSONObject();
                JSONObject jSONObject6 = jSONObject5;
                Map<String, String> c2 = result.c();
                if (c2 != null) {
                    str2 = c2.get("x-deprecated-versions");
                }
                jSONObject6.put((JSONObject) "x-deprecated-versions", str2);
                jSONObject6.put((JSONObject) "currentVersion", b);
                t tVar3 = t.INSTANCE;
                jSONObject4.put((JSONObject) "reloadParams", (String) jSONObject5);
                t tVar4 = t.INSTANCE;
                com.taobao.themis.kernel.logger.a.c(str7, com.taobao.android.detail.datasdk.protocol.adapter.optional.a.PAGE_LIFECYCLE_RELOAD, str8, str9, jSONObject3);
                f mInstance2 = b.this.f22538a;
                q.b(mInstance2, "mInstance");
                o.n(mInstance2);
            }
        }

        static {
            kge.a(1477496645);
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "ManifestASyncConcurrentStep";
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            }
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public void k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f95772", new Object[]{this});
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f instance, String manifestUrl, qpr launcher, qpp listener, com.taobao.themis.kernel.launcher.step.a group, boolean z) {
            super(instance, launcher, listener, group);
            q.d(instance, "instance");
            q.d(manifestUrl, "manifestUrl");
            q.d(launcher, "launcher");
            q.d(listener, "listener");
            q.d(group, "group");
            this.d = manifestUrl;
            this.e = z;
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            AppManifestManager.INSTANCE.a(this.d, (JSONObject) null, AppManifestManager.RequestMode.UPDATE, new C0977a());
            if (this.e) {
                return;
            }
            c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0010H\u0014J\b\u0010\u0012\u001a\u00020\u0010H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/taobao/themis/uniapp/solution/TMSResourceStepGroup$ManifestSyncConcurrentStep;", "Lcom/taobao/themis/kernel/launcher/step/ConcurrentStepGroup$ConcurrentStep;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "baseInfo", "Lcom/taobao/themis/kernel/utils/TMSUniAppUtils$UniAppBaseInfo;", "launcher", "Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;", "group", "Lcom/taobao/themis/kernel/launcher/step/ConcurrentStepGroup;", "(Lcom/taobao/themis/kernel/TMSInstance;Lcom/taobao/themis/kernel/utils/TMSUniAppUtils$UniAppBaseInfo;Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;Lcom/taobao/themis/kernel/launcher/step/ConcurrentStepGroup;)V", "getName", "", "onAfterExecute", "", "onBeforeExecute", "onExecuting", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c extends a.AbstractC0945a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final i.a d;

        static {
            kge.a(-2026232968);
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "ManifestSyncConcurrentStep";
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            }
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public void k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f95772", new Object[]{this});
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f instance, i.a baseInfo, qpr launcher, qpp listener, com.taobao.themis.kernel.launcher.step.a group) {
            super(instance, launcher, listener, group);
            q.d(instance, "instance");
            q.d(baseInfo, "baseInfo");
            q.d(launcher, "launcher");
            q.d(listener, "listener");
            q.d(group, "group");
            this.d = baseInfo;
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public void d() {
            String valueOf;
            String valueOf2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            f mInstance = this.f22538a;
            q.b(mInstance, "mInstance");
            mInstance.D().a("manifestFetchStart");
            AppManifestManager appManifestManager = AppManifestManager.INSTANCE;
            String e = this.d.e();
            q.a((Object) e);
            String str = null;
            sgt.b a2 = appManifestManager.a(e, null, AppManifestManager.RequestMode.LAUNCH);
            f mInstance2 = this.f22538a;
            q.b(mInstance2, "mInstance");
            thk a3 = com.taobao.themis.kernel.utils.a.a(mInstance2);
            if (a3 != null) {
                Map<String, String> f = a2.f();
                if (f == null || (valueOf2 = f.get(nfc.PHA_MONITOR_MEASURE_MANIFEST_PARSE_START)) == null) {
                    valueOf2 = String.valueOf(System.currentTimeMillis());
                }
                a3.a(nfc.PHA_MONITOR_MEASURE_MANIFEST_PARSE_START, valueOf2);
            }
            f mInstance3 = this.f22538a;
            q.b(mInstance3, "mInstance");
            thk a4 = com.taobao.themis.kernel.utils.a.a(mInstance3);
            if (a4 != null) {
                Map<String, String> f2 = a2.f();
                if (f2 == null || (valueOf = f2.get(nfc.PHA_MONITOR_MEASURE_MANIFEST_PARSE_END)) == null) {
                    valueOf = String.valueOf(System.currentTimeMillis());
                }
                a4.a(nfc.PHA_MONITOR_MEASURE_MANIFEST_PARSE_END, valueOf);
            }
            f mInstance4 = this.f22538a;
            q.b(mInstance4, "mInstance");
            mInstance4.D().a("manifestFetchEnd");
            if (!a2.a() || a2.b() == null) {
                a(new e(e.a.TMS_ERR_MANIFEST_PREFIX + a2.e(), a2.d(), ""));
                return;
            }
            AppManifest b = a2.b();
            q.a(b);
            AppManifest.AppInfo appInfo = b.getAppInfo();
            if (appInfo != null) {
                str = appInfo.getAppId();
            }
            if (true ^ q.a((Object) str, (Object) this.d.b())) {
                a(e.a.APP_ID_DIS_MATCH);
                return;
            }
            AppManifest b2 = a2.b();
            q.a(b2);
            TMSMetaInfoWrapper tMSMetaInfoWrapper = new TMSMetaInfoWrapper(b2, this.d);
            f mInstance5 = this.f22538a;
            q.b(mInstance5, "mInstance");
            mInstance5.a(tMSMetaInfoWrapper);
            com.taobao.themis.uniapp.solution.b.a(this, this.d);
            f mInstance6 = this.f22538a;
            q.b(mInstance6, "mInstance");
            com.taobao.themis.uniapp.solution.b.a(this, false, mInstance6, tMSMetaInfoWrapper);
            c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\b\u0010\u001a\u001a\u00020\u0007H\u0016J\u001e\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0007J\b\u0010\u001f\u001a\u00020\u001cH\u0014J\b\u0010 \u001a\u00020\u001cH\u0014J\b\u0010!\u001a\u00020\u001cH\u0014J\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006#"}, d2 = {"Lcom/taobao/themis/uniapp/solution/TMSResourceStepGroup$MainDocumentConcurrentStep;", "Lcom/taobao/themis/kernel/launcher/step/ConcurrentStepGroup$ConcurrentStep;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "baseInfo", "Lcom/taobao/themis/kernel/utils/TMSUniAppUtils$UniAppBaseInfo;", "mainDocumentUrl", "", "mainDocumentVersion", "renderer", "hasLocalManifest", "", "isPreset", "launcher", "Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;", "group", "Lcom/taobao/themis/kernel/launcher/step/ConcurrentStepGroup;", "(Lcom/taobao/themis/kernel/TMSInstance;Lcom/taobao/themis/kernel/utils/TMSUniAppUtils$UniAppBaseInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/taobao/themis/kernel/launcher/TMSBaseLauncher;Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;Lcom/taobao/themis/kernel/launcher/step/ConcurrentStepGroup;)V", "requestClient", "Lcom/taobao/themis/uniapp/solution/extension/page/MainDocumentExtension;", "getRequestClient", "()Lcom/taobao/themis/uniapp/solution/extension/page/MainDocumentExtension;", "setRequestClient", "(Lcom/taobao/themis/uniapp/solution/extension/page/MainDocumentExtension;)V", "getName", FactoryType.TYPE_INVALID, "", "documentUrl", "documentVersion", "onAfterExecute", "onBeforeExecute", "onExecuting", "setRenderer", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.uniapp.solution.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0975a extends a.AbstractC0945a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private iwm d;
        private final String e;
        private final String j;
        private final String k;
        private final boolean l;
        private final boolean m;
        private final i.a n;

        static {
            kge.a(-1559507326);
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "MainDocumentConcurrentStep";
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            }
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public void k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f95772", new Object[]{this});
            }
        }

        public static final /* synthetic */ boolean a(C0975a c0975a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e103030d", new Object[]{c0975a})).booleanValue() : c0975a.l;
        }

        public static final /* synthetic */ i.a b(C0975a c0975a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (i.a) ipChange.ipc$dispatch("31133451", new Object[]{c0975a}) : c0975a.n;
        }

        public /* synthetic */ C0975a(f fVar, i.a aVar, String str, String str2, String str3, boolean z, boolean z2, qpr qprVar, qpp qppVar, com.taobao.themis.kernel.launcher.step.a aVar2, int i, kotlin.jvm.internal.o oVar) {
            this(fVar, aVar, str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, z, (i & 64) != 0 ? false : z2, qprVar, qppVar, aVar2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0975a(f instance, i.a baseInfo, String mainDocumentUrl, String str, String str2, boolean z, boolean z2, qpr launcher, qpp listener, com.taobao.themis.kernel.launcher.step.a group) {
            super(instance, launcher, listener, group);
            q.d(instance, "instance");
            q.d(baseInfo, "baseInfo");
            q.d(mainDocumentUrl, "mainDocumentUrl");
            q.d(launcher, "launcher");
            q.d(listener, "listener");
            q.d(group, "group");
            this.n = baseInfo;
            this.e = mainDocumentUrl;
            this.j = str;
            this.k = str2;
            this.l = z;
            this.m = z2;
        }

        public final void a(String renderer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, renderer});
                return;
            }
            q.d(renderer, "renderer");
            iwm iwmVar = this.d;
            if (iwmVar == null) {
                return;
            }
            iwmVar.a(renderer);
        }

        public static /* synthetic */ void a(C0975a c0975a, String str, String str2, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe6eb962", new Object[]{c0975a, str, str2, new Integer(i), obj});
                return;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            c0975a.a(str, str2);
        }

        public final void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            String str3 = this.g;
            String str4 = this.f;
            String str5 = this.c;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = jSONObject2;
            jSONObject3.put((JSONObject) "documentUrl", str);
            jSONObject3.put((JSONObject) "documentVersion", str2);
            t tVar = t.INSTANCE;
            jSONObject.put((JSONObject) "reloadParams", (String) jSONObject2);
            t tVar2 = t.INSTANCE;
            com.taobao.themis.kernel.logger.a.a(str3, "INVALID_PREFETCH", str4, str5, jSONObject);
            iwm iwmVar = this.d;
            if (iwmVar != null) {
                iwmVar.a();
            }
            i().a(iwm.class, (Class) null);
            c();
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            String str = this.g;
            String str2 = this.f;
            String str3 = this.c;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "mainDocumentUrl", this.e);
            jSONObject2.put((JSONObject) "mainDocumentVersion", this.j);
            t tVar = t.INSTANCE;
            com.taobao.themis.kernel.logger.a.a(str, com.taobao.themis.kernel.logger.a.EVENT_REQUEST, str2, str3, jSONObject);
            f mInstance = this.f22538a;
            q.b(mInstance, "mInstance");
            mInstance.k().a("mainDocumentRequestStart");
            f mInstance2 = this.f22538a;
            q.b(mInstance2, "mInstance");
            thk a2 = com.taobao.themis.kernel.utils.a.a(mInstance2);
            if (a2 != null) {
                a2.a("mainDocumentRequestStart");
            }
            String a3 = a();
            TMSLogger.b(a3, "request with documentUrl[" + this.e + "] and documentVersion[" + this.j + ']');
            this.d = new iwm();
            iwm iwmVar = this.d;
            q.a(iwmVar);
            iwmVar.a(this.e, this.j, this.k, Boolean.valueOf(this.m), new C0976a());
            i().a((Class<Class>) iwm.class, (Class) this.d);
            c();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010!\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J,\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e\u0018\u00010\rH\u0016¨\u0006\u000f"}, d2 = {"com/taobao/themis/uniapp/solution/TMSResourceStepGroup$MainDocumentConcurrentStep$onExecuting$2", "Lcom/taobao/themis/kernel/extension/page/IMainDocumentExtension$RequestCallback;", "onError", "", "code", "", "msg", "", "onFinish", "loadInfo", "Lcom/taobao/themis/kernel/preload/UniAppDocumentLoadInfo;", "onNetWorkResponse", "header", "", "", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
        /* renamed from: com.taobao.themis.uniapp.solution.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public static final class C0976a implements f.c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0976a() {
            }

            @Override // com.taobao.themis.kernel.extension.page.f.c
            public void b(int i, Map<String, List<String>> map) {
                List<String> list;
                String str;
                List<String> list2;
                String str2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8c62340b", new Object[]{this, new Integer(i), map});
                    return;
                }
                com.taobao.themis.kernel.f mInstance = C0975a.this.f22538a;
                q.b(mInstance, "mInstance");
                mInstance.k().a("mainDocumentHeaderGet");
                if (!C0975a.a(C0975a.this)) {
                    if (map != null && (list2 = map.get("x-manifest-version")) != null && (str2 = (String) p.a((List<? extends Object>) list2, 0)) != null) {
                        C0975a.this.i().a("mainDocumentManifestVersion", str2);
                    }
                    if (map != null && (list = map.get("x-page-version")) != null && (str = (String) p.a((List<? extends Object>) list, 0)) != null) {
                        C0975a.this.i().a("mainDocumentPageVersion", str);
                    }
                    if (i >= 400) {
                        C0975a.this.i().a("mainDocumentErrorCode", String.valueOf(i));
                    }
                    C0975a c0975a = C0975a.this;
                    com.taobao.themis.uniapp.solution.b.a(c0975a, C0975a.b(c0975a));
                }
                String str3 = C0975a.this.g;
                String str4 = C0975a.this.f;
                String str5 = C0975a.this.c;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONObject;
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = jSONObject3;
                List<String> list3 = null;
                jSONObject4.put((JSONObject) "x-manifest-version", (String) (map != null ? map.get("x-manifest-version") : null));
                jSONObject4.put((JSONObject) "x-uniapp-pageurl", (String) (map != null ? map.get("x-uniapp-pageurl") : null));
                if (map != null) {
                    list3 = map.get("x-page-version");
                }
                jSONObject4.put((JSONObject) "x-page-version", (String) list3);
                t tVar = t.INSTANCE;
                jSONObject2.put((JSONObject) "responseHeaders", (String) jSONObject3);
                t tVar2 = t.INSTANCE;
                com.taobao.themis.kernel.logger.a.a(str3, "ON_HEADER_RESPONSE", str4, str5, jSONObject);
            }

            @Override // com.taobao.themis.kernel.extension.page.f.c
            public void a(int i, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                    return;
                }
                String str2 = C0975a.this.g;
                String str3 = C0975a.this.f;
                String str4 = C0975a.this.c;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((JSONObject) "errorCode", (String) Integer.valueOf(i));
                jSONObject2.put((JSONObject) "errorMsg", str);
                t tVar = t.INSTANCE;
                com.taobao.themis.kernel.logger.a.a(str2, com.taobao.themis.kernel.logger.a.EVENT_ON_ERROR, str3, str4, jSONObject);
                C0975a.this.i().a(iwm.class, (Class) null);
            }

            @Override // com.taobao.themis.kernel.extension.page.f.c
            public void a(com.taobao.themis.kernel.preload.c loadInfo) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f61bb256", new Object[]{this, loadInfo});
                    return;
                }
                q.d(loadInfo, "loadInfo");
                com.taobao.themis.kernel.f mInstance = C0975a.this.f22538a;
                q.b(mInstance, "mInstance");
                mInstance.k().a("mainDocumentRequestFinish");
                com.taobao.themis.kernel.f mInstance2 = C0975a.this.f22538a;
                q.b(mInstance2, "mInstance");
                thk a2 = com.taobao.themis.kernel.utils.a.a(mInstance2);
                if (a2 != null) {
                    a2.a("mainDocumentRequestFinish");
                }
                com.taobao.themis.kernel.logger.a.a(C0975a.this.g, com.taobao.themis.kernel.logger.a.EVENT_ON_FINISH, C0975a.this.f, C0975a.this.c, new JSONObject());
            }
        }
    }
}
