package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.c;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.i;
import com.taobao.taobao.R;
import com.taobao.tbpoplayer.nativerender.l;
import tb.ies;
import tb.kge;
import tb.mff;
import tb.mfg;
import tb.sqt;
import tb.squ;

/* loaded from: classes6.dex */
public class HomeTopLivePageFrame extends HomeSelectedBaseFragment implements mff, squ {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HomeTopLivePageFrame";
    private ies mLiveController;
    private boolean mLowDevice = c.d();
    private FrameLayout mRoot;

    static {
        kge.a(-692799383);
        kge.a(105236052);
        kge.a(1038752494);
    }

    public static /* synthetic */ Object ipc$super(HomeTopLivePageFrame homeTopLivePageFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2049624054:
                super.onTabResume();
                return null;
            case -1990827289:
                super.onTabPause();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1126882532:
                return super.onCreateView((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
            case -654578861:
                super.onTabStart();
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
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1345585887:
                super.onTabStop();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public String getTabName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fbf611af", new Object[]{this}) : TAG;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public boolean needShowBottomBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48d91480", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static HomeTopLivePageFrame newInstance(Bundle bundle, sqt sqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeTopLivePageFrame) ipChange.ipc$dispatch("72ae5a2a", new Object[]{bundle, sqtVar});
        }
        HomeTopLivePageFrame homeTopLivePageFrame = new HomeTopLivePageFrame();
        homeTopLivePageFrame.setArguments(bundle);
        homeTopLivePageFrame.setLiveHomeContext(sqtVar);
        return homeTopLivePageFrame;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment, com.taobao.live.home.view.BaseLiveRecyclerFragment
    public int getLayoutId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue();
        }
        if (!this.mLowDevice) {
            return -1;
        }
        return R.layout.live_page_layout_flexalocal;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment, com.taobao.live.home.view.BaseLiveRecyclerFragment
    public void lazyInitView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb82b62", new Object[]{this, view});
            return;
        }
        if (this.mLiveHomeContext.h != null) {
            Uri data = this.mLiveHomeContext.h.getData();
            if (data != null) {
                this.mLiveHomeContext.h.setData(data.buildUpon().appendQueryParameter(d.LIVE_HOME_PAGE_TYPE, d.LIVE_HOME_PAGE_TYPE_mixLiveAndTab).build());
            }
            if (this.mLiveHomeContext.h.getData() != null) {
                this.mQueryParams = this.mLiveHomeContext.h.getData().getQuery();
            }
        }
        parsQuery();
        this.mLiveController = new ies(getContext(), this.mLiveHomeContext.f33847a, this.mLiveHomeContext.c, this.mLiveHomeContext.h);
        this.mLiveController.a((squ) this);
        this.mLiveController.a(Float.valueOf(this.mLiveHomeContext.n + this.mLiveHomeContext.l + c.a((Context) this.mActivity, 18.0f)));
        this.mLiveController.a(this.mQueryParamsJson);
        this.mLiveController.a((ViewGroup) null);
        this.mLiveController.a((Context) this.mActivity);
        this.mContainer.addView(this.mLiveController.k());
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
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (!this.mLowDevice) {
            this.mRoot = (FrameLayout) layoutInflater.inflate(R.layout.live_page_layout_flexalocal, viewGroup, false);
            if (this.mLiveHomeContext.h != null) {
                Uri data = this.mLiveHomeContext.h.getData();
                if (data != null) {
                    this.mLiveHomeContext.h.setData(data.buildUpon().appendQueryParameter(d.LIVE_HOME_PAGE_TYPE, d.LIVE_HOME_PAGE_TYPE_mixLiveAndTab).build());
                }
                if (this.mLiveHomeContext.h.getData() != null) {
                    this.mQueryParams = this.mLiveHomeContext.h.getData().getQuery();
                }
            }
            parsQuery();
            this.mLiveController = new ies(getContext(), this.mLiveHomeContext.f33847a, this.mLiveHomeContext.c, this.mLiveHomeContext.h);
            this.mLiveController.a((squ) this);
            this.mLiveController.a(Float.valueOf(this.mLiveHomeContext.n + this.mLiveHomeContext.l + c.a((Context) this.mActivity, 18.0f)));
            this.mLiveController.a(this.mQueryParamsJson);
            this.mLiveController.a((ViewGroup) null);
            this.mLiveController.a((Context) this.mActivity);
            this.mRoot.addView(this.mLiveController.k());
            return this.mRoot;
        }
        return this.mContainer;
    }

    private void pageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("570809d1", new Object[]{this});
            return;
        }
        ies iesVar = this.mLiveController;
        if (iesVar == null) {
            return;
        }
        iesVar.p();
    }

    private void pageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e187ff4a", new Object[]{this});
            return;
        }
        ies iesVar = this.mLiveController;
        if (iesVar == null) {
            return;
        }
        iesVar.q();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onTabResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d5380a", new Object[]{this});
            return;
        }
        super.onTabResume();
        resume();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onTabStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8fbeb53", new Object[]{this});
            return;
        }
        super.onTabStart();
        ies iesVar = this.mLiveController;
        if (iesVar == null) {
            return;
        }
        iesVar.l();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onTabAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121b4972", new Object[]{this});
            return;
        }
        super.onTabAppear();
        if (this.mLiveHomeContext != null && this.mLiveHomeContext.d() != null) {
            this.mLiveHomeContext.d().d();
        }
        pageSelected();
    }

    private void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        ies iesVar = this.mLiveController;
        if (iesVar == null) {
            return;
        }
        iesVar.m();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onTabDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8c0914", new Object[]{this});
            return;
        }
        super.onTabDisappear();
        pageUnSelected();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onTabPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("895662e7", new Object[]{this});
            return;
        }
        super.onTabPause();
        pause();
    }

    private void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        ies iesVar = this.mLiveController;
        if (iesVar == null) {
            return;
        }
        iesVar.r();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onTabStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("503402df", new Object[]{this});
            return;
        }
        super.onTabStop();
        ies iesVar = this.mLiveController;
        if (iesVar == null) {
            return;
        }
        iesVar.s();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        ies iesVar = this.mLiveController;
        if (iesVar == null) {
            return;
        }
        iesVar.a(i, i2, intent);
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
        if (this.mLiveController == null) {
            return;
        }
        pageUnSelected();
        this.mLiveController.t();
    }

    @Override // tb.squ
    public void onSwitchToSingleTab(String str, DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eedef43f", new Object[]{this, str, dXRootView, jSONObject});
            return;
        }
        this.mLiveHomeContext.h().h();
        this.mLiveHomeContext.i().switchTab(this.mChannelType);
    }

    @Override // tb.squ
    public void onFollowChangedAction(String str, DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed773164", new Object[]{this, str, dXRootView, jSONObject});
        } else if (this.mLiveHomeContext == null || this.mLiveHomeContext.d() == null) {
        } else {
            this.mLiveHomeContext.d().a(jSONObject);
        }
    }

    @Override // tb.squ
    public void onHorizontalScrollEnable(String str, DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11408e0b", new Object[]{this, str, dXRootView, jSONObject});
        } else if (this.mLiveHomeContext == null || this.mLiveHomeContext.b() == null || !i.z()) {
        } else {
            this.mLiveHomeContext.b().onHorizontalScrollEnable(jSONObject);
        }
    }

    @Override // tb.squ
    public void onAccountInfoChanged(String str, DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9b26526", new Object[]{this, str, dXRootView, jSONObject});
            return;
        }
        if (this.mLiveHomeContext != null && this.mLiveHomeContext.d() != null) {
            this.mLiveHomeContext.d().a(jSONObject, true);
        }
        if (this.mLiveHomeContext == null || this.mLiveHomeContext.b() == null || !i.z()) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(l.TRIGGER_NAME_SCROLL_STATUS, (Object) "true");
        this.mLiveHomeContext.b().onHorizontalScrollEnable(jSONObject2);
    }

    @Override // tb.squ
    public JSONObject getTabRecommendData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cd8cb48e", new Object[]{this});
        }
        if (this.mLiveHomeContext != null && this.mLiveHomeContext.d() != null) {
            return this.mLiveHomeContext.d().c();
        }
        return null;
    }

    @Override // tb.squ
    public JSONArray getChannelTabExpInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b8bbfa34", new Object[]{this});
        }
        if (this.mLiveHomeContext == null) {
            return null;
        }
        return this.mLiveHomeContext.c();
    }

    @Override // tb.mff
    public void onLiveEvent(String str, Object obj) {
        ies iesVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d9ef1c", new Object[]{this, str, obj});
        } else if (!d.LIVE_EVENT_ON_NEW_INTENT.equals(str) || (iesVar = this.mLiveController) == null || !(obj instanceof Intent)) {
        } else {
            iesVar.a((Intent) obj);
        }
    }
}
