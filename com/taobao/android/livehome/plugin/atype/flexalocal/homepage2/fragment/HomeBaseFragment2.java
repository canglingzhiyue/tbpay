package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.l;
import com.taobao.live.home.business.BaseListRequest;
import com.taobao.live.home.view.BaseLiveRecyclerFragment;
import com.taobao.search.common.util.i;
import tb.kge;
import tb.mfj;
import tb.mfm;
import tb.psb;
import tb.sqt;

/* loaded from: classes6.dex */
public abstract class HomeBaseFragment2 extends BaseLiveRecyclerFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HomeBaseFragment2";
    public String mEntryLiveSource;
    public boolean mIsCreateView;
    public long mLastLoadTime;
    public sqt mLiveHomeContext;
    public JSONObject mQueryParamsJson;
    public String mChannelType = "";
    public String mJumpUrl = "";
    public String mAndroidNormalIcon = "";
    public String mAndroidPressedIcon = "";
    public String mTabTitleName = "";
    public String mQueryParams = "";
    public int mChannelId = 0;
    public int mPosition = 0;
    public boolean mIsBlack = true;
    public boolean mAppear = false;
    public boolean mSelected = false;

    static {
        kge.a(-1181052949);
    }

    public static /* synthetic */ Object ipc$super(HomeBaseFragment2 homeBaseFragment2, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1126882532:
                return super.onCreateView((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
            case -1010986463:
                super.setUserVisibleHint(((Boolean) objArr[0]).booleanValue());
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public abstract String getTabName();

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public void lazyLoadData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("562dcbcb", new Object[]{this});
        }
    }

    public boolean needShowBottomBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48d91480", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public com.taobao.live.home.business.a onBusinessCreate(Bundle bundle, BaseListRequest baseListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.live.home.business.a) ipChange.ipc$dispatch("43cb913d", new Object[]{this, bundle, baseListRequest});
        }
        return null;
    }

    public void onScreenOrientationChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647c2a98", new Object[]{this, new Boolean(z)});
        }
    }

    public void refreshFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5283552", new Object[]{this});
        }
    }

    private void log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        mfj.c(TAG, getTabName() + "--" + str);
    }

    public void setLiveHomeContext(sqt sqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03b75e3", new Object[]{this, sqtVar});
        } else {
            this.mLiveHomeContext = sqtVar;
        }
    }

    public String getChannelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44447fb2", new Object[]{this}) : this.mChannelType;
    }

    public int getPosition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("62e7f399", new Object[]{this})).intValue() : this.mPosition;
    }

    public String getJumpUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16f49ae", new Object[]{this}) : this.mJumpUrl;
    }

    public String getTabTitleName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4816a615", new Object[]{this}) : this.mTabTitleName;
    }

    public String getAndroidNormalIcon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a4834b80", new Object[]{this}) : this.mAndroidNormalIcon;
    }

    public String getAndroidPressedIcon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("19603877", new Object[]{this}) : this.mAndroidPressedIcon;
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        log(i.b.MEASURE_ONCREATE);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.mChannelType = arguments.getString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_TYPE, "jingxuan");
        this.mChannelId = arguments.getInt(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_ID, 0);
        this.mQueryParams = arguments.getString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_QUERY_PARAMS, "");
        this.mEntryLiveSource = arguments.getString("entryLiveSource", "");
        this.mPosition = arguments.getInt(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_POSITION, 0);
        this.mJumpUrl = arguments.getString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_JUMP_URL, "");
        this.mTabTitleName = arguments.getString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_TAB_TITLE_NAME, "");
        this.mAndroidNormalIcon = arguments.getString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_ANDROID_NORMAL_ICON, "");
        this.mAndroidPressedIcon = arguments.getString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_ANDROID_PRESSED_ICON, "");
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        log("onCreateView");
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        log("onViewCreated");
        this.mIsCreateView = true;
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment, android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        log("onActivityCreated");
        if (!getUserVisibleHint()) {
            return;
        }
        dispatchAppearStatus(true);
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public BaseListRequest onRequestCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseListRequest) ipChange.ipc$dispatch("d68225e1", new Object[]{this, bundle});
        }
        log("onRequestCreate");
        return null;
    }

    public void refreshCurrentPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6c53d4", new Object[]{this});
        } else {
            log("refreshCurrentPage");
        }
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment, android.support.v4.app.Fragment
    public final void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        log("onStart mSelected:" + this.mSelected + " mAppear:" + this.mAppear);
        if (!this.mAppear) {
            return;
        }
        onTabStart();
    }

    public void onTabStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8fbeb53", new Object[]{this});
            return;
        }
        log("onTabStart mSelected:" + this.mSelected + " appear:" + this.mAppear);
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment, com.taobao.live.home.view.UTAnalyzeFragment, android.support.v4.app.Fragment
    public final void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        log("onResume mSelected:" + this.mSelected + " appear:" + this.mAppear);
        if (!this.mSelected) {
            return;
        }
        onTabResume();
    }

    public void onTabResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d5380a", new Object[]{this});
            return;
        }
        log("onTabResume mSelected:" + this.mSelected + " appear:" + this.mAppear);
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment, com.taobao.live.home.view.UTAnalyzeFragment, android.support.v4.app.Fragment
    public final void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        log("onPause mSelected:" + this.mSelected + " appear:" + this.mAppear);
        if (!this.mSelected) {
            return;
        }
        onTabPause();
    }

    public void onTabPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("895662e7", new Object[]{this});
            return;
        }
        log("onTabPause mSelected:" + this.mSelected + " appear:" + this.mAppear);
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment, android.support.v4.app.Fragment
    public final void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        log("onStop mSelected:" + this.mSelected + " appear:" + this.mAppear);
        if (!this.mSelected) {
            return;
        }
        onTabStop();
    }

    public void onTabStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("503402df", new Object[]{this});
            return;
        }
        log("onTabStop mSelected:" + this.mSelected + " appear:" + this.mAppear);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        log("onActivityResult mSelected:" + this.mSelected + " appear:" + this.mAppear);
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        log("onDestroy ");
        this.mIsCreateView = false;
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment, com.taobao.live.home.view.UTAnalyzeFragment, android.support.v4.app.Fragment
    public void setUserVisibleHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bd9221", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setUserVisibleHint(z);
        log("setUserVisibleHint isVisibleToUser " + z);
        if (!this.mIsCreateView) {
            return;
        }
        dispatchAppearStatus(z);
    }

    private void dispatchAppearStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd65504c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.mSelected = true;
            onTabAppear();
        } else {
            onTabDisappear();
            this.mSelected = false;
        }
    }

    public void onTabAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121b4972", new Object[]{this});
            return;
        }
        log("onTabAppear  mSelected:" + this.mSelected);
        this.mAppear = true;
        if (this.mLiveHomeContext.g() == null) {
            return;
        }
        if (needShowBottomBar()) {
            this.mLiveHomeContext.g().k();
        } else {
            this.mLiveHomeContext.g().j();
        }
    }

    public void onTabDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8c0914", new Object[]{this});
            return;
        }
        log("onTabDisappear mSelected:" + this.mSelected);
        this.mAppear = false;
        psb.a().a((Object) com.taobao.live.home.c.PLAY_PAGEID, false);
    }

    public void parsQuery() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a25057d", new Object[]{this});
        } else if (!l.a((CharSequence) this.mQueryParams)) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str : this.mQueryParams.split("&")) {
                    String[] split = str.split("=");
                    if (split.length >= 2) {
                        jSONObject.put(split[0], (Object) split[1]);
                    }
                }
                this.mQueryParamsJson = jSONObject;
            } catch (Exception e) {
                mfj.a(TAG, "addQueryParamsOnce exp..", e);
            }
        }
    }

    public void setLastRefrashTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1324bc91", new Object[]{this, new Long(j)});
        } else {
            this.mLastLoadTime = j;
        }
    }

    public void refresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
        } else if (mfm.m() == -1) {
        } else {
            System.currentTimeMillis();
            mfm.m();
        }
    }
}
