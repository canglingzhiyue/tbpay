package com.taobao.tao.infoflow.multitab;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.util.Map;
import tb.kge;
import tb.llg;
import tb.ojr;
import tb.tmv;

/* loaded from: classes8.dex */
public class d extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final f f20636a;

    static {
        kge.a(2145533560);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1326718709:
                return super.getTabBarButtonShowState();
            case 1845730697:
                return super.getSubTabSearchBoxData();
            case 1912732256:
                return super.getViewBySectionBizCodeAndItemBizCode((String) objArr[0], (String) objArr[1]);
            case 2136867569:
                return new Boolean(super.isAllowProcessPageBack());
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ IHomeSubTabController a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IHomeSubTabController) ipChange.ipc$dispatch("a511db04", new Object[]{dVar}) : dVar.a();
    }

    public static /* synthetic */ f b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("900b24ab", new Object[]{dVar}) : dVar.f20636a;
    }

    public d(com.taobao.tao.topmultitab.protocol.c cVar, JSONObject jSONObject, IHomeSubTabController iHomeSubTabController) {
        super(cVar);
        this.f20636a = new f(cVar, jSONObject, iHomeSubTabController);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public View preCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("7349eddf", new Object[]{this, context}) : this.f20636a.a(context);
    }

    @Override // com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        g.a("MultiTabController", "getCurrentSubContainerType: " + this.f20636a.d());
        return this.f20636a.b(context);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onCreate();
    }

    @Override // com.taobao.tao.infoflow.multitab.j
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f20636a.a(z);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.j
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.f20636a.b(z);
        }
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.f20636a.b();
        }
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onAppToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
            return;
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onAppToBackground();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onAppToFront() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c238d3", new Object[]{this});
            return;
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onAppToFront();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onPageSelected();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
            return;
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onPageUnSelected();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onFirstFrameVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252d5e7d", new Object[]{this});
            return;
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onFirstFrameVisible();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        this.f20636a.y();
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onStart();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onResume();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onColdStartResume() {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e9b853", new Object[]{this});
            return;
        }
        IHomeSubTabController a2 = a();
        if (a2 == null && (fVar = this.f20636a) != null) {
            a2 = fVar.f();
        }
        if (a2 == null) {
            return;
        }
        try {
            a2.onColdStartResume();
        } catch (AbstractMethodError e) {
            g.a("PageLifeCycleRegister", "onColdStartResume方法找不到，请使用摩天轮打包", e);
        }
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onActivityResult(i, i2, intent);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onPause();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        this.f20636a.z();
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onStop();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onEnterPullSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11729e81", new Object[]{this});
            return;
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onEnterPullSecondFloor();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onExitPullSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e74a49d", new Object[]{this});
            return;
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onExitPullSecondFloor();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24224e7e", new Object[]{this});
            return;
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onPullRefresh();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPullDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
            return;
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onPullDistance(i);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onRefreshStateChanged(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("645061a", new Object[]{this, str, str2});
            return;
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onRefreshStateChanged(str, str2);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnablePullReFresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b20c9b34", new Object[]{this})).booleanValue();
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return false;
        }
        return a2.isEnablePullReFresh();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnableToSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c45f0bb", new Object[]{this})).booleanValue();
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return false;
        }
        return a2.isEnableToSecondFloor();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onClickRocket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ace924", new Object[]{this});
            return;
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onClickRocket();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isOnRocketState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6f1c3f", new Object[]{this})).booleanValue();
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return false;
        }
        return a2.isOnRocketState();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("111ff600", new Object[]{this});
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return null;
        }
        return a2.getUpdatePageName();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public Map<String, String> getUpdatePageProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("30e122fd", new Object[]{this});
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return null;
        }
        return a2.getUpdatePageProperties();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public Map<String, String> getUpdateNextPageProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("37691e90", new Object[]{this});
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return null;
        }
        return a2.getUpdateNextPageProperties();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageUtParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4393099", new Object[]{this});
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return null;
        }
        return a2.getUpdatePageUtParam();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isReachTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36ef4cb7", new Object[]{this})).booleanValue();
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return false;
        }
        return a2.isReachTop();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public JSONObject getSubTabSearchBarData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bab9b3d1", new Object[]{this});
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return null;
        }
        return a2.getSubTabSearchBarData();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getSubPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93a20a95", new Object[]{this});
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return null;
        }
        return a2.getSubPageName();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean smoothScrollToPositionFromInfoFlow(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89c0a6db", new Object[]{this, new Integer(i)})).booleanValue();
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return false;
        }
        return a2.smoothScrollToPositionFromInfoFlow(i);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public llg getSubTabParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (llg) ipChange.ipc$dispatch("dde63e7", new Object[]{this});
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return null;
        }
        return a2.getSubTabParams();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean scrollToPositionWithOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f5c5ef5", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return false;
        }
        return a2.scrollToPositionWithOffset(i, i2);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void setSubPageChangeListener(IHomeSubTabController.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81efd6ac", new Object[]{this, aVar});
            return;
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return;
        }
        a2.setSubPageChangeListener(aVar);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isHandleUpAndDownScrollingEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f36d8fc", new Object[]{this})).booleanValue();
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return false;
        }
        return a2.isHandleUpAndDownScrollingEvent();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public int getSubContainerScrollY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("745ec8f", new Object[]{this})).intValue();
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return 0;
        }
        return a2.getSubContainerScrollY();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onWillExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
            return;
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onWillExit();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onFestivalRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0e05ceb", new Object[]{this});
            return;
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onFestivalRefresh();
    }

    @Override // com.taobao.tao.infoflow.multitab.j
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f20636a.n();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isAllowProcessPageBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f5e02f1", new Object[]{this})).booleanValue();
        }
        ojr c = this.f20636a.c();
        if (c != null) {
            return c.isAllowProcessPageBack();
        }
        return super.isAllowProcessPageBack();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getTabBarButtonShowState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0ebe10b", new Object[]{this});
        }
        IHomeSubTabController a2 = a();
        if (a2 != null) {
            return a2.getTabBarButtonShowState();
        }
        return super.getTabBarButtonShowState();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void notifyOutLinkParams(final Intent intent, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac20293", new Object[]{this, intent, str});
        } else if (intent == null) {
            g.a("MultiTabController", "notifyOutLinkParams intent == null");
        } else {
            Uri data = intent.getData();
            if (data == null) {
                g.a("MultiTabController", "notifyOutLinkParams uri == null");
                return;
            }
            final boolean a2 = com.taobao.android.home.component.utils.j.a("enableOutLinkNotifyParamInAdvance", true);
            if (a2) {
                String queryParameter = data.getQueryParameter("categoryTabId");
                g.a("MultiTabController", "通知外链参数，categoryTabId： " + queryParameter);
                IHomeSubTabController c = this.f20636a.c(queryParameter);
                if (c != null) {
                    c.notifyOutLinkParams(intent, str);
                    g.a("MultiTabController", "onOutLinkJumped: " + c.getClass().getSimpleName());
                }
            }
            this.f20636a.a(data, str, new a.d() { // from class: com.taobao.tao.infoflow.multitab.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.d
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (a2) {
                        g.a("MultiTabController", "提前通知外链参数");
                    } else {
                        IHomeSubTabController a3 = d.a(d.this);
                        if (a3 == null) {
                            a3 = d.b(d.this).f();
                        }
                        if (a3 == null) {
                            return;
                        }
                        a3.notifyOutLinkParams(intent, str);
                        g.a("MultiTabController", "onOutLinkJumped: " + a3.getClass().getSimpleName());
                    }
                }
            });
        }
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getCurrentSubContainerType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("53729d5b", new Object[]{this}) : this.f20636a.d();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public JSONObject getSubTabData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("f7e6579c", new Object[]{this}) : this.f20636a.m();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public Map<String, String> getRequestUpstreamBizParam(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("312f52b4", new Object[]{this, str}) : this.f20636a.f(str);
    }

    @Override // com.taobao.tao.infoflow.multitab.j
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f20636a.o();
    }

    @Override // com.taobao.tao.infoflow.multitab.j
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.f20636a.g();
    }

    @Override // com.taobao.tao.infoflow.multitab.j
    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.f20636a.s();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void triggerPopShowByMain(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b38f4fa", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        ojr c = this.f20636a.c();
        if (c == null) {
            return;
        }
        c.triggerPopShowByMain(i, jSONObject);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void triggerPopRemoveByMain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dacbf3e", new Object[]{this, str});
            return;
        }
        ojr c = this.f20636a.c();
        if (c == null) {
            return;
        }
        c.triggerPopRemoveByMain(str);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void addPopMessageListenerByMain(IPopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd393b79", new Object[]{this, aVar});
            return;
        }
        ojr c = this.f20636a.c();
        if (c == null) {
            return;
        }
        c.addPopMessageListenerByMain(aVar);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void removePopMessageListenerByMain(IPopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47a17db6", new Object[]{this, aVar});
            return;
        }
        ojr c = this.f20636a.c();
        if (c == null) {
            return;
        }
        c.removePopMessageListenerByMain(aVar);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public JSONObject getSubTabSearchBoxData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6e039d89", new Object[]{this});
        }
        IHomeSubTabController a2 = a();
        if (a2 != null) {
            return a2.getSubTabSearchBoxData();
        }
        return super.getSubTabSearchBoxData();
    }

    private IHomeSubTabController a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IHomeSubTabController) ipChange.ipc$dispatch("3fee6479", new Object[]{this}) : this.f20636a.a();
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public View getViewBySectionBizCodeAndItemBizCode(String str, String str2) {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7201fa60", new Object[]{this, str, str2});
        }
        if (TextUtils.equals(str, com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b.TAB_SECTION_CODE)) {
            if (!TextUtils.isEmpty(str2) && (fVar = this.f20636a) != null) {
                return fVar.a(str2);
            }
            return null;
        }
        IHomeSubTabController a2 = a();
        if (a2 != null) {
            return a2.getViewBySectionBizCodeAndItemBizCode(str, str2);
        }
        return super.getViewBySectionBizCodeAndItemBizCode(str, str2);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void selectTabByTabId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33080d1", new Object[]{this, str});
            return;
        }
        f fVar = this.f20636a;
        if (fVar == null) {
            return;
        }
        fVar.b(str);
    }

    @Override // com.taobao.tao.topmultitab.protocol.a, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void passThroughData(tmv tmvVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d691b50c", new Object[]{this, tmvVar, str, str2});
            return;
        }
        f fVar = this.f20636a;
        if (fVar == null) {
            return;
        }
        fVar.a(tmvVar, str, str2);
    }
}
