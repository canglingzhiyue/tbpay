package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment;

import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.i;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.mfj;
import tb.sqt;

/* loaded from: classes6.dex */
public class HomeNormalFragment extends HomeBaseFragment2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    public TabManager.TabBottom mTabBottom;

    public static /* synthetic */ Object ipc$super(HomeNormalFragment homeNormalFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 303778162) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onTabAppear();
            return null;
        }
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public int getLayoutId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public void lazyInitView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb82b62", new Object[]{this, view});
        }
    }

    @Override // com.taobao.live.home.view.UTAnalyzeFragment
    public boolean supportUTFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("615f50a9", new Object[]{this})).booleanValue();
        }
        return true;
    }

    static {
        kge.a(1101378493);
        TAG = HomeNormalFragment.class.getSimpleName();
    }

    public static HomeNormalFragment newInstance(Bundle bundle, sqt sqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeNormalFragment) ipChange.ipc$dispatch("893d1e6", new Object[]{bundle, sqtVar});
        }
        HomeNormalFragment homeNormalFragment = new HomeNormalFragment();
        homeNormalFragment.setArguments(bundle);
        homeNormalFragment.setLiveHomeContext(sqtVar);
        return homeNormalFragment;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.mTabBottom = (TabManager.TabBottom) arguments.getSerializable(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_TAB_BOTTOM);
        TabManager.TabBottom tabBottom = this.mTabBottom;
        if (tabBottom == null) {
            return;
        }
        this.mChannelType = tabBottom.channelType;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public String getTabName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fbf611af", new Object[]{this}) : TAG;
    }

    @Override // com.taobao.live.home.view.UTAnalyzeFragment
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        TabManager.TabBottom tabBottom = this.mTabBottom;
        if (tabBottom == null) {
            return null;
        }
        return tabBottom.pageName;
    }

    @Override // com.taobao.live.home.view.UTAnalyzeFragment
    public Map<String, String> getUTProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("16970404", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        String str = null;
        TabManager.TabBottom tabBottom = this.mTabBottom;
        if (tabBottom != null) {
            str = tabBottom.spm;
        }
        if (str != null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("spm-url", str);
            updateNextPageProperties(hashMap2);
            hashMap.put("spm-cnt", str);
        }
        if (this.mLiveHomeContext != null) {
            hashMap.put("entryLiveSource", this.mLiveHomeContext.e);
            hashMap.put("entrySpm", this.mLiveHomeContext.f);
        }
        return hashMap;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onTabAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121b4972", new Object[]{this});
            return;
        }
        super.onTabAppear();
        if (this.mLiveHomeContext.o == null || StringUtils.isEmpty(this.mChannelType)) {
            return;
        }
        String str = TAG;
        mfj.c(str, "onTabAppear " + this.mChannelType);
        this.mLiveHomeContext.o.a("channelType", this.mChannelType);
        if (i.a()) {
            return;
        }
        this.mLiveHomeContext.o.a(g4.b.i, (ISmartLandingProxy.a) null);
    }
}
