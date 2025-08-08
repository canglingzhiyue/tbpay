package tb;

import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.q;
import com.taobao.infoflow.protocol.engine.invoke.biz.b;
import com.taobao.infoflow.protocol.engine.invoke.biz.c;
import com.taobao.infoflow.protocol.engine.invoke.biz.d;
import com.taobao.infoflow.protocol.engine.invoke.biz.e;
import com.taobao.infoflow.protocol.engine.invoke.biz.f;
import com.taobao.infoflow.protocol.engine.invoke.biz.g;
import com.taobao.infoflow.protocol.engine.invoke.biz.h;
import com.taobao.infoflow.protocol.engine.invoke.biz.j;
import com.taobao.infoflow.protocol.engine.invoke.biz.k;
import com.taobao.infoflow.protocol.engine.invoke.biz.l;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;
import com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService;
import com.taobao.tao.Globals;
import com.taobao.tao.navigation.model.NavigationTabConstraints;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.protocol.a;
import com.uc.webview.export.media.MessageID;
import java.util.Map;
import tb.lcu;
import tb.lcv;

/* loaded from: classes.dex */
public class ojr extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ojn f32123a;
    private lcu b;
    private ljt c;
    private lkl d;
    private lkm e;
    private lki f;
    private lkj g;
    private h h;
    private j i;
    private l j;
    private e k;
    private b l;
    private c m;
    private d n;
    private f o;
    private tmu p;
    private final com.taobao.tao.topmultitab.protocol.c q;
    private final String r;
    private View s;
    private boolean t;
    private g u;
    private boolean v;
    private Context w;

    static {
        kge.a(-1766151020);
    }

    public static /* synthetic */ Object ipc$super(ojr ojrVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1257714799) {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        } else if (hashCode != 2136867569) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.isAllowProcessPageBack());
        }
    }

    public ojr(com.taobao.tao.topmultitab.protocol.c cVar, String str) {
        super(cVar);
        this.f32123a = new ojn();
        this.t = false;
        this.v = true;
        ldf.d("HomeInfoFlowController", "new HomeInfoFlowController");
        this.q = cVar;
        this.r = str;
        a(str, cVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.b != null) {
        } else {
            ldf.d("HomeInfoFlowController", "reInitInfoFlowEngine initInfoFlowEngine");
            a(this.r, this.q);
            if (!this.t) {
                return;
            }
            this.e.onPageSelected();
        }
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public View preCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7349eddf", new Object[]{this, context});
        }
        this.s = a(context);
        return this.s;
    }

    @Override // com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        this.w = context;
        View view = this.s;
        if (view != null) {
            this.s = null;
            return view;
        }
        return a(context);
    }

    private View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        ldf.d("HomeInfoFlowController", "createInfoFlowContainer");
        a();
        return this.c.a(context);
    }

    private void a(String str, com.taobao.tao.topmultitab.protocol.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("212c1765", new Object[]{this, str, cVar});
            return;
        }
        ldf.d("HomeInfoFlowController", "initInfoFlowEngine");
        llp.a(new lcv.a(new lls()).a(new sec()).a(new sdx()).a(new ojm()).a(new sdz()).a(new nvn()).a(new tdz()));
        this.b = new lcu.a(this.f32123a).a(new ojo(str, this.f32123a, new lud(this, cVar))).a();
        this.c = this.b.b();
        this.d = this.c.a();
        this.e = this.c.b();
        this.f = this.c.d();
        this.g = this.c.c();
        this.h = this.g.getPullDownRefreshInvoker();
        this.i = this.g.getRocketInvoker();
        this.j = this.g.getUtInvoker();
        this.i = this.g.getRocketInvoker();
        this.l = this.g.getContainerInvoker();
        this.k = this.g.getNaviBarInvoker();
        this.m = this.g.getGlobalThemeInvoker();
        this.n = this.g.getMulticlassTabInvoker();
        this.o = this.g.getOutLinkInvoker();
        this.u = this.g.getPopInvoker();
        this.p = this.g.getPassParamsInvoker();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        q.a(true);
        this.d.onResume();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onColdStartResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e9b853", new Object[]{this});
        } else {
            this.d.onColdStartResume();
        }
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        q.a(false);
        this.d.onPause();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ldf.d("HomeInfoFlowController", MessageID.onDestroy);
        this.d.onDestroy();
        lcu lcuVar = this.b;
        if (lcuVar != null) {
            lcuVar.c();
            this.b = null;
        }
        this.s = null;
        this.w = null;
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        lkl lklVar = this.d;
        if (lklVar == null) {
            return;
        }
        lklVar.onActivityResult(i, i2, intent);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onAppToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
        } else {
            this.f.onAppToBackground();
        }
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onAppToFront() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c238d3", new Object[]{this});
        } else {
            this.f.onAppToFront();
        }
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onEnterPullSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11729e81", new Object[]{this});
            return;
        }
        h hVar = this.h;
        if (hVar == null) {
            return;
        }
        hVar.d();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onExitPullSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e74a49d", new Object[]{this});
            return;
        }
        h hVar = this.h;
        if (hVar == null) {
            return;
        }
        hVar.e();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        q.a(true);
        this.t = true;
        this.e.onPageSelected();
        d();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
            return;
        }
        q.a(false);
        this.t = false;
        this.e.onPageUnSelected();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24224e7e", new Object[]{this});
            return;
        }
        h hVar = this.h;
        if (hVar == null) {
            return;
        }
        hVar.c();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPullDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
            return;
        }
        h hVar = this.h;
        if (hVar == null) {
            return;
        }
        hVar.a(i);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onRefreshStateChanged(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("645061a", new Object[]{this, str, str2});
            return;
        }
        h hVar = this.h;
        if (hVar == null) {
            return;
        }
        hVar.a(str, str2);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnablePullReFresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b20c9b34", new Object[]{this})).booleanValue();
        }
        h hVar = this.h;
        if (hVar == null) {
            return true;
        }
        return hVar.a();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnableToSecondFloor() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c45f0bb", new Object[]{this})).booleanValue();
        }
        Context context = this.w;
        if (context == null) {
            context = Globals.getApplication();
        }
        if (!com.taobao.homepage.utils.b.c() || com.taobao.homepage.utils.b.b(context)) {
            z = false;
        }
        if (z || com.taobao.homepage.utils.b.b()) {
            com.taobao.android.home.component.utils.e.e("TopTabBar", "折叠屏 设置 二楼不可出");
            return false;
        }
        h hVar = this.h;
        if (hVar == null) {
            return false;
        }
        return hVar.b();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onClickRocket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ace924", new Object[]{this});
            return;
        }
        j jVar = this.i;
        if (jVar == null) {
            return;
        }
        jVar.b();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isOnRocketState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6f1c3f", new Object[]{this})).booleanValue();
        }
        j jVar = this.i;
        if (jVar == null) {
            return false;
        }
        return jVar.a();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("111ff600", new Object[]{this});
        }
        l lVar = this.j;
        if (lVar == null) {
            return null;
        }
        return lVar.a();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public Map<String, String> getUpdatePageProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("30e122fd", new Object[]{this});
        }
        l lVar = this.j;
        if (lVar == null) {
            return null;
        }
        return lVar.c();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public Map<String, String> getUpdateNextPageProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("37691e90", new Object[]{this});
        }
        l lVar = this.j;
        if (lVar == null) {
            return null;
        }
        return lVar.b();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageUtParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4393099", new Object[]{this});
        }
        l lVar = this.j;
        if (lVar == null) {
            return null;
        }
        return lVar.d();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isReachTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36ef4cb7", new Object[]{this})).booleanValue();
        }
        b bVar = this.l;
        if (bVar == null) {
            return true;
        }
        return bVar.a();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public JSONObject getSubTabSearchBarData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bab9b3d1", new Object[]{this});
        }
        e eVar = this.k;
        if (eVar == null) {
            return null;
        }
        return eVar.a();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getSubPageName() {
        llm a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93a20a95", new Object[]{this});
        }
        d dVar = this.n;
        if (dVar != null && (a2 = dVar.a()) != null) {
            return a2.a();
        }
        return null;
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean smoothScrollToPositionFromInfoFlow(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89c0a6db", new Object[]{this, new Integer(i)})).booleanValue();
        }
        b bVar = this.l;
        if (bVar != null) {
            return bVar.a(i);
        }
        return false;
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public llg getSubTabParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (llg) ipChange.ipc$dispatch("dde63e7", new Object[]{this});
        }
        b bVar = this.l;
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean scrollToPositionWithOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f5c5ef5", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        b bVar = this.l;
        if (bVar != null) {
            return bVar.a(i, i2);
        }
        return false;
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void setSubPageChangeListener(final IHomeSubTabController.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81efd6ac", new Object[]{this, aVar});
            return;
        }
        d dVar = this.n;
        if (dVar == null) {
            return;
        }
        if (aVar == null) {
            dVar.a(null);
        } else {
            dVar.a(new IMulticlassTabService.a() { // from class: tb.ojr.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService.a
                public void a(llm llmVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f304c8cb", new Object[]{this, llmVar});
                    } else {
                        aVar.a(llmVar.a());
                    }
                }
            });
        }
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isHandleUpAndDownScrollingEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f36d8fc", new Object[]{this})).booleanValue();
        }
        b bVar = this.l;
        if (bVar == null) {
            return false;
        }
        return bVar.b();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public int getSubContainerScrollY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("745ec8f", new Object[]{this})).intValue();
        }
        b bVar = this.l;
        if (bVar == null) {
            return 0;
        }
        return bVar.c();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onWillExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
            return;
        }
        lkl lklVar = this.d;
        if (lklVar == null) {
            return;
        }
        lklVar.onWillExit();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void notifyOutLinkParams(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac20293", new Object[]{this, intent, str});
            return;
        }
        f fVar = this.o;
        if (fVar == null) {
            return;
        }
        fVar.a(intent, str);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onFestivalRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0e05ceb", new Object[]{this});
            return;
        }
        c cVar = this.m;
        if (cVar == null) {
            return;
        }
        cVar.a();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isAllowProcessPageBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f5e02f1", new Object[]{this})).booleanValue();
        }
        k topViewInvoker = this.g.getTopViewInvoker();
        if (topViewInvoker == null) {
            return super.isAllowProcessPageBack();
        }
        return !topViewInvoker.a();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getTabBarButtonShowState() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0ebe10b", new Object[]{this});
        }
        j jVar = this.i;
        if (jVar != null) {
            z = jVar.a();
        }
        return z ? NavigationTabConstraints.TAB_ALIEN_EFFECTIVE_ROCKET : com.taobao.share.taopassword.busniess.model.g.TAO;
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void triggerPopShowByMain(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b38f4fa", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        g gVar = this.u;
        if (gVar == null) {
            return;
        }
        gVar.a(i, jSONObject);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void triggerPopRemoveByMain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dacbf3e", new Object[]{this, str});
            return;
        }
        g gVar = this.u;
        if (gVar == null) {
            return;
        }
        gVar.a(str);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void addPopMessageListenerByMain(IPopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd393b79", new Object[]{this, aVar});
            return;
        }
        g gVar = this.u;
        if (gVar == null) {
            return;
        }
        gVar.a(aVar);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void removePopMessageListenerByMain(IPopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47a17db6", new Object[]{this, aVar});
            return;
        }
        g gVar = this.u;
        if (gVar == null) {
            return;
        }
        gVar.b(aVar);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (oiy.a().b() == null) {
        } else {
            if (!this.v) {
                seb.a("Page_Home", (String) null, this, new String[0]);
            } else {
                this.v = false;
            }
        }
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public View getViewBySectionBizCodeAndItemBizCode(String str, String str2) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7201fa60", new Object[]{this, str, str2});
        }
        if (StringUtils.equals(str, com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b.TAB_SECTION_CODE) || (bVar = this.l) == null) {
            return null;
        }
        return bVar.a(str, str2);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void passThroughData(tmv tmvVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d691b50c", new Object[]{this, tmvVar, str, str2});
            return;
        }
        tmu tmuVar = this.p;
        if (tmuVar == null) {
            return;
        }
        tmuVar.a(tmvVar, str, str2);
    }
}
