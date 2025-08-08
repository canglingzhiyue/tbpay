package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected;

import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.i;
import java.util.HashMap;
import java.util.Map;
import tb.itk;
import tb.kge;
import tb.mfj;
import tb.sdt;

/* loaded from: classes6.dex */
public abstract class HomeSelectedBaseFragment extends HomeBaseFragment2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HomeSelectedBaseFragment";
    private String mBottomChannelType;
    private boolean mEntryChannelType;
    public TabManager.TabUp mTabUp;

    static {
        kge.a(2136609704);
    }

    public static /* synthetic */ Object ipc$super(HomeSelectedBaseFragment homeSelectedBaseFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 303778162) {
            super.onTabAppear();
            return null;
        } else if (hashCode != 1002290867) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onActivityCreated((Bundle) objArr[0]);
            return null;
        }
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public int getLayoutId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public void lazyInitView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb82b62", new Object[]{this, view});
        }
    }

    public void refreshSelectedFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aafec08d", new Object[]{this});
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
        this.mTabUp = (TabManager.TabUp) arguments.getSerializable(d.BUNDLE_BUSINESS_TAB_TOP);
        this.mEntryChannelType = arguments.getBoolean(d.BUNDLE_ENTRY_CHANNELTYPE);
        this.mBottomChannelType = arguments.getString(d.BUNDLE_ENTRY_BOTTOM_CHANNELTYPE, "jingxuan");
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || this.mTabUp != null) {
            return;
        }
        this.mTabUp = (TabManager.TabUp) arguments.getSerializable(d.BUNDLE_BUSINESS_TAB_TOP);
    }

    public void updateSelectedStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57dd8d57", new Object[]{this, new Boolean(z)});
        } else {
            this.mSelected = z;
        }
    }

    @Override // com.taobao.live.home.view.UTAnalyzeFragment
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        TabManager.TabUp tabUp = this.mTabUp;
        if (tabUp == null) {
            return null;
        }
        return tabUp.pageName;
    }

    @Override // com.taobao.live.home.view.UTAnalyzeFragment
    public Map<String, String> getUTProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("16970404", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        String str = null;
        TabManager.TabUp tabUp = this.mTabUp;
        if (tabUp != null) {
            str = tabUp.spm;
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
        hashMap.put("pad", sdt.b(this.mActivity) + "");
        hashMap.put(itk.TYPE_FOLD, sdt.a(this.mActivity) + "");
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
        mfj.c(TAG, "onTabAppear " + this.mChannelType);
        this.mLiveHomeContext.o.a("channelType", this.mChannelType);
        if (i.a()) {
            return;
        }
        this.mLiveHomeContext.o.a(g4.b.i, (ISmartLandingProxy.a) null);
    }
}
