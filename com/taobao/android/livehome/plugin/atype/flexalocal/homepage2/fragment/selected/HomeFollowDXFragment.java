package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.h;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.dinamicx.eventchain.g;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.i;
import com.taobao.live.home.c;
import com.taobao.login4android.api.Login;
import com.taobao.tao.log.TLog;
import tb.kge;
import tb.mfe;
import tb.mff;
import tb.mfg;
import tb.mfj;
import tb.psb;
import tb.sdt;
import tb.sqt;

/* loaded from: classes6.dex */
public class HomeFollowDXFragment extends HomeSelectedBaseFragment implements mff {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HomeFollowDXFragment";
    public JSONObject allDxFirstRenderData;
    private JSONObject loginChainObject;
    public DXRootView mDxRootView;
    private String mSubChannelType;
    public boolean createResult = false;
    public boolean mInit = false;
    private String mRecyclerUserId = "followMainRecycler_new";
    private String mTabPageAppearDxEventChain = "follow_tabPage_appear";
    private boolean mFirstEnter = true;
    private boolean loginSuccess = false;

    static {
        kge.a(-42011487);
        kge.a(1038752494);
    }

    public static /* synthetic */ Object ipc$super(HomeFollowDXFragment homeFollowDXFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2049624054:
                super.onTabResume();
                return null;
            case -1665651870:
                super.lazyInitView((View) objArr[0]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1418964012:
                super.refreshCurrentPage();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 303778162:
                super.onTabAppear();
                return null;
            case 999033108:
                super.onTabDisappear();
                return null;
            case 1345585887:
                super.onTabStop();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment, com.taobao.live.home.view.BaseLiveRecyclerFragment
    public int getLayoutId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public String getTabName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fbf611af", new Object[]{this}) : TAG;
    }

    public static HomeFollowDXFragment newInstance(Bundle bundle, sqt sqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeFollowDXFragment) ipChange.ipc$dispatch("252ba4f2", new Object[]{bundle, sqtVar});
        }
        HomeFollowDXFragment homeFollowDXFragment = new HomeFollowDXFragment();
        homeFollowDXFragment.setArguments(bundle);
        homeFollowDXFragment.setLiveHomeContext(sqtVar);
        return homeFollowDXFragment;
    }

    public String getRecyclerUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3ebaa97e", new Object[]{this}) : this.mRecyclerUserId;
    }

    public String getTabPageAppearDxEventChain() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("26e4135b", new Object[]{this}) : this.mTabPageAppearDxEventChain;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        mfg.a().a(this);
        TLog.loge("TaoLiveHomepage", TAG);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        mfg.a().b(this);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment, com.taobao.live.home.view.BaseLiveRecyclerFragment
    public void lazyInitView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb82b62", new Object[]{this, view});
            return;
        }
        super.lazyInitView(view);
        TLog.loge("TaoLiveHomepage", "HomeFollowDXFragment lazyInitView");
    }

    public void forceReload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7528eeb", new Object[]{this});
        } else if (this.mContainer == null) {
        } else {
            TLog.loge("TaoLiveHomepage", "HomeFollowDXFragment forceReload");
            this.allDxFirstRenderData = this.mLiveHomeContext.e();
            JSONObject jSONObject = this.allDxFirstRenderData;
            if (jSONObject != null) {
                jSONObject.put("enableOptimize", (Object) true);
            }
            if (this.allDxFirstRenderData != null && this.mLiveHomeContext != null && TabManager.a().g() != null && TabManager.a().g().sjsdParam != null) {
                this.allDxFirstRenderData.put("followSjsdParam", (Object) TabManager.a().g().sjsdParam);
            }
            renderFollowDXContainer();
            this.mSubChannelType = null;
        }
    }

    public void renderFollowDXContainer() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3983348d", new Object[]{this});
            return;
        }
        this.createResult = false;
        if (this.mTabUp == null || this.mTabUp.container == null) {
            mfj.c(TAG, "mTabUp == null || mTabUp.container == null");
        } else if (this.allDxFirstRenderData == null || this.mContainer == null || this.mLiveHomeContext == null || this.mLiveHomeContext.a() == null) {
        } else {
            this.mContainer.removeAllViews();
            if (this.mLiveHomeContext.z && i.s()) {
                TLog.loge("TaoLiveHomepage", "renderFollowDXContainer preCreateDX");
                this.mDxRootView = this.mLiveHomeContext.a().getDinamicSdkManager().preCreateDX(getContext(), this.mTabUp.container.getString("name"), new mfe() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.mfe
                    public void a(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                        } else {
                            HomeFollowDXFragment.this.createResult = true;
                        }
                    }

                    @Override // tb.mfe
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            HomeFollowDXFragment.this.createResult = false;
                        }
                    }
                });
            } else {
                TLog.loge("TaoLiveHomepage", "renderFollowDXContainer createDX");
                this.mDxRootView = this.mLiveHomeContext.a().getDinamicSdkManager().createDX(getContext(), this.mTabUp.container.getString("name"), new mfe() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.mfe
                    public void a(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                            return;
                        }
                        HomeFollowDXFragment.this.createResult = true;
                        TLog.loge("TaoLiveHomepage", "renderFollowDXContainer createDX success");
                    }

                    @Override // tb.mfe
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        HomeFollowDXFragment.this.createResult = false;
                        TLog.loge("TaoLiveHomepage", "renderFollowDXContainer createDX fail");
                    }
                });
            }
            TLog.loge("TaoLiveHomepage", "HomeFollowDXFragment renderFollowDXContainer 1");
            if (this.mDxRootView != null) {
                TLog.loge("TaoLiveHomepage", "HomeFollowDXFragment renderFollowDXContainer render start");
                com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.i iVar = new com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.i();
                if (this.allDxFirstRenderData.get("stautsNavHeight") instanceof Integer) {
                    iVar.b(this.allDxFirstRenderData.getInteger("stautsNavHeight").intValue());
                }
                if (this.allDxFirstRenderData.get("height") instanceof Float) {
                    iVar.b(this.allDxFirstRenderData.getFloat("height").floatValue());
                }
                if (this.allDxFirstRenderData.get("bottomBarHeight") instanceof Float) {
                    iVar.a(this.allDxFirstRenderData.getFloat("bottomBarHeight").floatValue());
                }
                z = this.mLiveHomeContext.a().getDinamicSdkManager().renderDX(getContext(), this.mDxRootView, this.allDxFirstRenderData, new DXRenderOptions.a().a((ba) iVar).a());
            } else {
                z = false;
            }
            TLog.loge("TaoLiveHomepage", "HomeFollowDXFragment renderFollowDXContainer 2");
            if (z) {
                TLog.loge("TaoLiveHomepage", "HomeFollowDXFragment renderFollowDXContainer render success");
                this.mContainer.addView(this.mDxRootView);
                this.mContainer.setVisibility(0);
            }
            TLog.loge("TaoLiveHomepage", "HomeFollowDXFragment renderFollowDXContainer 3");
        }
    }

    @Override // tb.mff
    public void onLiveEvent(String str, Object obj) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d9ef1c", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.login.success".equals(str)) {
            if (!Login.checkSessionValid() || this.loginSuccess) {
                return;
            }
            this.loginSuccess = true;
            if (!Login.checkSessionValid() || (jSONObject = this.loginChainObject) == null) {
                return;
            }
            String string = jSONObject.getString("chainName");
            JSONObject jSONObject2 = this.loginChainObject.getJSONObject("params");
            if (StringUtils.isEmpty(string) || jSONObject2 == null || this.mLiveHomeContext == null || this.mLiveHomeContext.a() == null) {
                return;
            }
            this.mLiveHomeContext.a().getDinamicSdkManager().getDinamicEngine().a(string, this.mDxRootView, jSONObject2, (String) null, (g) null);
        } else if ("com.taobao.taolive.follow.login".equals(str)) {
            if (!(obj instanceof JSONObject)) {
                return;
            }
            this.loginChainObject = (JSONObject) obj;
        } else {
            "com.taobao.taolive.login.out".equals(str);
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onTabAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121b4972", new Object[]{this});
            return;
        }
        super.onTabAppear();
        if (!this.mInit && this.mContainer != null) {
            forceReload();
            this.mInit = true;
        }
        if (!this.mInit || this.mContainer == null) {
            return;
        }
        notifyFollowScrollEnd();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void refreshCurrentPage() {
        RecyclerView l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6c53d4", new Object[]{this});
            return;
        }
        super.refreshCurrentPage();
        DXRootView dXRootView = this.mDxRootView;
        if (dXRootView == null || dXRootView.getExpandWidgetNode() == null) {
            return;
        }
        DXWidgetNode queryWidgetNodeByUserId = this.mDxRootView.getExpandWidgetNode().queryWidgetNodeByUserId(getRecyclerUserId());
        if (!(queryWidgetNodeByUserId instanceof DXRecyclerLayout)) {
            return;
        }
        DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) queryWidgetNodeByUserId;
        DXRecyclerLayout r = dXRecyclerLayout.r();
        if (dXRecyclerLayout.l() != null) {
            dXRecyclerLayout.l().scrollToPosition(0);
        }
        if (dXRecyclerLayout.m() != null && dXRecyclerLayout.m().o() != null) {
            dXRecyclerLayout.m().o().setAutoRefreshing(true);
        }
        if (r == null || (l = r.l()) == null) {
            return;
        }
        l.scrollToPosition(0);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onTabDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8c0914", new Object[]{this});
        } else {
            super.onTabDisappear();
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onTabResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d5380a", new Object[]{this});
            return;
        }
        super.onTabResume();
        if (!this.mInit || this.mContainer == null) {
            return;
        }
        notifyFollowScrollEnd();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onTabStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("503402df", new Object[]{this});
            return;
        }
        super.onTabStop();
        psb.a().a((Object) c.PLAY_PAGEID, false);
    }

    public void notifyFollowScrollEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e58d361b", new Object[]{this});
        } else if (this.mLiveHomeContext == null || this.mLiveHomeContext.a() == null || this.mLiveHomeContext.a().getDinamicSdkManager() == null || this.mLiveHomeContext.a().getDinamicSdkManager().getDinamicEngine() == null) {
        } else {
            this.mLiveHomeContext.a().getDinamicSdkManager().getDinamicEngine().a(getTabPageAppearDxEventChain(), this.mDxRootView, (JSONObject) null, (String) null, (g) null);
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment
    public void refreshSelectedFragment() {
        RecyclerView l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aafec08d", new Object[]{this});
            return;
        }
        DXRootView dXRootView = this.mDxRootView;
        if (dXRootView == null) {
            return;
        }
        JSONObject data = dXRootView.getData();
        DinamicXEngine dinamicEngine = this.mLiveHomeContext.a().getDinamicSdkManager().getDinamicEngine();
        if (dinamicEngine == null || this.mDxRootView.getExpandWidgetNode() == null || getContext() == null) {
            return;
        }
        int a2 = com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a((Activity) getContext());
        if (i.M()) {
            a2 = com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a((Activity) getContext()) - sdt.f;
        }
        if (data != null) {
            dinamicEngine.a(this.mDxRootView.getExpandWidgetNode(), 0, new DXWidgetRefreshOption.a().a(true).a(1).b(h.a().a(getContext())).c(a2).b(false).a());
        }
        if (!i.o()) {
            return;
        }
        DXWidgetNode queryWidgetNodeByUserId = this.mDxRootView.getExpandWidgetNode().queryWidgetNodeByUserId(getRecyclerUserId());
        if (!(queryWidgetNodeByUserId instanceof DXRecyclerLayout)) {
            return;
        }
        DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) queryWidgetNodeByUserId;
        DXRecyclerLayout r = dXRecyclerLayout.r();
        if (dXRecyclerLayout.l() != null) {
            dXRecyclerLayout.l().scrollToPosition(0);
        }
        if (r == null || (l = r.l()) == null) {
            return;
        }
        l.scrollToPosition(0);
    }
}
