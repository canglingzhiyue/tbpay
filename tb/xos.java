package tb;

import android.app.Activity;
import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import com.alibaba.analytics.core.sync.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.mytaobao.pagev2.listener.PageDataChangeReceiver;
import com.taobao.mytaobao.pagev2.listener.ThemeChangeReceiver;
import com.taobao.mytaobao.ut.c;
import com.taobao.search.common.util.i;
import com.taobao.tao.log.TLog;
import com.uc.webview.export.media.MessageID;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\u001a\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u0006\u0010!\u001a\u00020\u0018J\u0006\u0010\"\u001a\u00020\u0018J\u0006\u0010#\u001a\u00020\u0018J\u0016\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eJ0\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020(0*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020(0'H\u0007J\u0016\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201J6\u00102\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u00103\u001a\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u00020+0'2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020(0*J\u0006\u00107\u001a\u00020\u0018R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u000e\u0010\r\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/taobao/mytaobao/pagev2/presenter/MtbPresenterV2;", "", "iView", "Lcom/taobao/mytaobao/pagev2/MtbBizProxyV2;", "(Lcom/taobao/mytaobao/pagev2/MtbBizProxyV2;)V", gvk.EXTRA_KEY_DEATH_RECOVERY, "", "getDeathRecovery", "()Z", "setDeathRecovery", "(Z)V", "isFirstResume", "setFirstResume", "isLogout", "mEditionSwitchListener", "Lcom/taobao/android/editionswitcher/api/IEditionSwitchListener;", "mIView", "mainHandler", "Landroid/os/Handler;", "pageDataChangeReceiver", "Lcom/taobao/mytaobao/pagev2/listener/PageDataChangeReceiver;", "themeChangeReceiver", "Lcom/taobao/mytaobao/pagev2/listener/ThemeChangeReceiver;", "changeToBasementUT", "", "changeToMainPageUT", "delayInit", "fetchLogin", "handleLoginAction", "aty", "Landroid/app/Activity;", "action", "Lcom/taobao/login4android/broadcast/LoginAction;", "onAttach", i.b.MEASURE_ONCREATE, MessageID.onDestroy, "preloadMtb", "mtbBizProxy", "processDataChange", "", "Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbComponentModel;", "changeMap", "", "", "oldDataList", "processGlobalChange", "sourceFrom", "", "global", "Lcom/alibaba/fastjson/JSONObject;", "processLayoutChange", "reason", "Lcom/taobao/mytaobao/dataservice/model/Reason;", "moduleNameList", "dataMap", "registerListeners", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xos {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.mytaobao.pagev2.a f34440a;
    private final Handler b;
    private boolean c;
    private boolean d;
    private boolean e;
    private final PageDataChangeReceiver f;
    private final ThemeChangeReceiver g;
    private ghl h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            xos.a(xos.this).a();
            xos.b(xos.this).a();
            TLog.loge("mtbEvo", "新框架 mtbNoTraceLog=" + com.taobao.mytaobao.base.c.i() + " hitDefaultV24TypeV2=" + com.taobao.mytaobao.base.c.k);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xon f34442a;
        public final /* synthetic */ com.taobao.mytaobao.pagev2.a b;

        public c(xon xonVar, com.taobao.mytaobao.pagev2.a aVar) {
            this.f34442a = xonVar;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            xoe.INSTANCE.a(this.f34442a, this.b.g().a().d());
            xok a2 = xoh.Companion.a();
            if (a2 == null) {
                return;
            }
            a2.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/taobao/mytaobao/pagev2/presenter/MtbPresenterV2$registerListeners$1", "Lcom/taobao/android/editionswitcher/api/IEditionSwitchListener;", "onFail", "", q.MSGTYPE_INTERVAL, "", "s", "", "onSuccess", "version", "Lcom/taobao/android/editionswitcher/api/Version;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class d implements ghl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.ghl
        public void a(ghp ghpVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea458cc9", new Object[]{this, ghpVar});
            } else {
                com.taobao.mytaobao.pagev2.dataservice.a.a();
            }
        }
    }

    static {
        kge.a(1273057874);
    }

    public xos(com.taobao.mytaobao.pagev2.a iView) {
        kotlin.jvm.internal.q.c(iView, "iView");
        this.f34440a = iView;
        this.b = new Handler(mtz.b);
        this.d = true;
        this.f = new PageDataChangeReceiver(iView);
        this.g = new ThemeChangeReceiver(iView);
    }

    public static final /* synthetic */ PageDataChangeReceiver a(xos xosVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageDataChangeReceiver) ipChange.ipc$dispatch("2f9c7ad8", new Object[]{xosVar}) : xosVar.f;
    }

    public static final /* synthetic */ ThemeChangeReceiver b(xos xosVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThemeChangeReceiver) ipChange.ipc$dispatch("9c08ec5f", new Object[]{xosVar}) : xosVar.g;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.d;
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public final void b() {
        ghm ghmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.h = new d();
        if (mxj.a("enableSwitchSink", true) && (ghmVar = (ghm) ghi.a(ghm.class)) != null) {
            ghmVar.addChangeVersionListener(this.h);
        }
        h();
    }

    private final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.b.postDelayed(new a(), 2000L);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f34440a = null;
        this.b.removeCallbacksAndMessages(null);
        this.f.b();
        this.g.b();
        if (this.h == null) {
            return;
        }
        ((ghm) ghi.a(ghm.class)).removeChangeVersionListener(this.h);
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        mtx.d(this.c).a(1);
        mtx.d(this.c).a("PageInit");
    }

    public final void a(Activity activity, LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d0233b6", new Object[]{this, activity, loginAction});
        } else if (loginAction == null) {
        } else {
            if (loginAction == LoginAction.NOTIFY_LOGOUT) {
                mtx.d(this.c).b(1);
                TLog.loge("mtbMainLink", "收到NOTIFY_LOGOUT, thread=" + Thread.currentThread().getName());
                this.e = true;
                com.taobao.mytaobao.pagev2.dataservice.a.l();
                xoh.Companion.b();
            } else if (loginAction != LoginAction.NOTIFY_LOGIN_SUCCESS || mxq.b(activity)) {
            } else {
                i();
                TLog.loge("mtbMainLink", "收到NOTIFY_LOGIN_SUCCESS, thread=" + Thread.currentThread().getName() + " isLogout=" + this.e);
                if (this.e) {
                    this.e = false;
                    mtx.d(this.c).a(2);
                }
                com.taobao.mytaobao.pagev2.a aVar = this.f34440a;
                if (aVar != null) {
                    aVar.p();
                }
                com.taobao.mytaobao.pagev2.dataservice.a.a(1);
            }
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        nwv.f("onAttach");
        i();
    }

    private final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        String uid = Login.getUserId();
        if (StringUtils.isEmpty(uid)) {
            if (Versions.isDebug()) {
                throw new RuntimeException("uid为空");
            }
            return;
        }
        kotlin.jvm.internal.q.a((Object) uid, "uid");
        com.taobao.mytaobao.pagev2.dataservice.a.a(uid);
        xoh.Companion.a(uid);
    }

    public final void a(com.taobao.mytaobao.pagev2.a mtbBizProxy, Activity aty) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eba686a", new Object[]{this, mtbBizProxy, aty});
            return;
        }
        kotlin.jvm.internal.q.c(mtbBizProxy, "mtbBizProxy");
        kotlin.jvm.internal.q.c(aty, "aty");
        nwv.a("preloadMtb-locaCache");
        i();
        xon i = com.taobao.mytaobao.pagev2.dataservice.a.i();
        if (i == null) {
            return;
        }
        nwv.e("preloadMtb-locaCache");
        if (i.d() == 2) {
            com.taobao.mytaobao.base.b.a(b.INSTANCE, 1500L);
        } else {
            com.taobao.mytaobao.pagev2.dataservice.a.a(1);
        }
        com.taobao.mytaobao.base.b.c(new c(i, mtbBizProxy));
        nwv.a("preloadMtb-asyncWeex");
        JSONObject c2 = i.c();
        String string = c2 != null ? c2.getString("fragmentWeexUrl") : null;
        if (string != null) {
            mtbBizProxy.a().a(true);
            mtbBizProxy.a().a(string, aty);
        }
        nwv.e("preloadMtb-asyncWeex");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                com.taobao.mytaobao.pagev2.dataservice.a.a(1);
            }
        }
    }

    public final List<xol> a(xnq reason, List<String> moduleNameList, Map<String, xol> dataMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("de681b50", new Object[]{this, reason, moduleNameList, dataMap});
        }
        kotlin.jvm.internal.q.c(reason, "reason");
        kotlin.jvm.internal.q.c(moduleNameList, "moduleNameList");
        kotlin.jvm.internal.q.c(dataMap, "dataMap");
        ArrayList arrayList = new ArrayList(moduleNameList.size());
        for (String str : moduleNameList) {
            xol xolVar = dataMap.get(str);
            if (xolVar != null) {
                arrayList.add(xolVar);
            } else {
                xol xolVar2 = new xol(xnr.a(reason));
                xolVar2.a(str);
                xolVar2.c(new xnw().a(str));
                arrayList.add(xolVar2);
            }
        }
        return arrayList;
    }

    public final List<xol> a(Map<String, xol> changeMap, List<xol> oldDataList) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6af28f79", new Object[]{this, changeMap, oldDataList});
        }
        kotlin.jvm.internal.q.c(changeMap, "changeMap");
        kotlin.jvm.internal.q.c(oldDataList, "oldDataList");
        ArrayList arrayList = new ArrayList(oldDataList.size());
        for (xol xolVar : oldDataList) {
            String b2 = xolVar.b();
            if (changeMap.containsKey(b2)) {
                xol xolVar2 = changeMap.get(b2);
                if (xolVar2 == null) {
                    kotlin.jvm.internal.q.a();
                }
                xol xolVar3 = xolVar2;
                if (kotlin.jvm.internal.q.a((Object) xolVar3.d(), (Object) xolVar.d())) {
                    JSONObject a3 = xolVar3.a();
                    JSONObject jSONObject = a3 != null ? a3.getJSONObject("events") : null;
                    if (jSONObject != null && (a2 = xolVar.a()) != null) {
                        a2.put("events", (Object) jSONObject);
                    }
                    xolVar.a(xolVar3.h());
                    arrayList.add(xolVar);
                } else {
                    arrayList.add(xolVar3);
                }
            } else {
                arrayList.add(xolVar);
            }
        }
        return arrayList;
    }

    public final void f() {
        Activity m;
        xon h;
        JSONObject c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        com.taobao.mytaobao.pagev2.a aVar = this.f34440a;
        if (aVar == null || (m = aVar.m()) == null || (h = com.taobao.mytaobao.pagev2.dataservice.a.h()) == null || (c2 = h.c()) == null) {
            return;
        }
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        kotlin.jvm.internal.q.a((Object) uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().pageDisAppear(m);
        c.a c3 = com.taobao.mytaobao.basement.weex.a.INSTANCE.c(c2);
        aVar.A().setUTPageName(c3.b);
        UTAnalytics uTAnalytics2 = UTAnalytics.getInstance();
        kotlin.jvm.internal.q.a((Object) uTAnalytics2, "UTAnalytics.getInstance()");
        uTAnalytics2.getDefaultTracker().pageAppearDonotSkip(m, c3.b);
        UTAnalytics uTAnalytics3 = UTAnalytics.getInstance();
        kotlin.jvm.internal.q.a((Object) uTAnalytics3, "UTAnalytics.getInstance()");
        uTAnalytics3.getDefaultTracker().updatePageName(m, c3.b);
        HashMap hashMap = new HashMap();
        hashMap.put("isWeex", "true");
        com.taobao.mytaobao.ut.c.a(com.taobao.mytaobao.basement.i.class.getName(), m, c3.b, c3.c, hashMap);
        HashMap hashMap2 = new HashMap(4);
        String str = c3.c;
        kotlin.jvm.internal.q.a((Object) str, "utParams.spm");
        hashMap2.put("spm-url", str);
        com.taobao.mytaobao.ut.c.a(hashMap2);
    }

    public final void g() {
        Activity m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        com.taobao.mytaobao.pagev2.a aVar = this.f34440a;
        if (aVar == null || (m = aVar.m()) == null) {
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(m);
        aVar.A().setUTPageName("Page_MyTaobao");
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        kotlin.jvm.internal.q.a((Object) uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().pageAppearDonotSkip(m, aVar.A().getUTPageName());
        UTAnalytics uTAnalytics2 = UTAnalytics.getInstance();
        kotlin.jvm.internal.q.a((Object) uTAnalytics2, "UTAnalytics.getInstance()");
        uTAnalytics2.getDefaultTracker().updatePageName(m, "Page_MyTaobao");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = hashMap;
        hashMap2.put("scm", "20140623.1.20.2");
        hashMap2.put("spm-cnt", "a2141.7631743");
        hashMap.put("isWeex", "true");
        com.taobao.mytaobao.ut.c.a(m, hashMap2);
        HashMap hashMap3 = new HashMap(4);
        hashMap3.put("spm-url", "a2141.7631743");
        com.taobao.mytaobao.ut.c.a(hashMap3);
    }

    public final void a(int i, JSONObject global) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e86c6b5", new Object[]{this, new Integer(i), global});
            return;
        }
        kotlin.jvm.internal.q.c(global, "global");
        xon i2 = com.taobao.mytaobao.pagev2.dataservice.a.i();
        if (i2 == null) {
            return;
        }
        String string = global.getString("mytaobaoVersion");
        com.taobao.mytaobao.base.c.a(string);
        if (StringUtils.equals(string, "stark_s_mytaobao_24")) {
            string = "v24";
        }
        com.taobao.mytaobao.pagev2.a aVar = this.f34440a;
        if (aVar == null) {
            return;
        }
        aVar.a("mtbVersion", string);
        aVar.a("mtb_v", string);
        String str = "0";
        aVar.a("mtb_preloadDataHit", i2.d() == 2 ? "1" : str);
        aVar.a("disableUIRefreshOnPagePause", String.valueOf(com.taobao.mytaobao.base.c.t()));
        aVar.a("mtbPageV2", "1");
        if (com.taobao.mytaobao.base.c.y()) {
            str = "1";
        }
        aVar.a("disableDxPreRenderV2", str);
    }
}
