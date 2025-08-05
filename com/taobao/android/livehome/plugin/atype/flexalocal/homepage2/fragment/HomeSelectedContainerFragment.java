package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoLiveHotWordResponse;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoLiveHotwordResponseData;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoliveSearchHotWords;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedFragment;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeTopLivePageFrame;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.LiveHomeViewPager;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.TextBannerView;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.g;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.i;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.k;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.l;
import com.taobao.android.nav.Nav;
import com.taobao.live.home.widget.tab.XTabLayout;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.mff;
import tb.mfg;
import tb.mfj;
import tb.mfk;
import tb.mfn;
import tb.mto;
import tb.nmf;
import tb.pqq;
import tb.sdt;
import tb.sqt;

/* loaded from: classes6.dex */
public class HomeSelectedContainerFragment extends HomeBaseFragment2 implements Handler.Callback, b, d, XTabLayout.a, XTabLayout.b, mff {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG;
    private static final int sSearchHotRequest = 1000;
    public static Map<String, String> sTrackPage;
    public static Map<String, String> sTrackSpm;
    private boolean enableNewSearchBar;
    private ViewGroup mBigSearch;
    public String mChannelType;
    public com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.b mColorSwitcher;
    private String mContentId;
    private Fragment mCurrentFragment;
    private String mEntryLiveSource;
    private boolean mFirstAppear;
    private Handler mHandler;
    private TaoLiveHotwordResponseData mHotwordResponseData;
    private boolean mInit;
    private TextBannerView mLiveSearchNewHints;
    private TUrlImageView mNavBackground;
    private e mNewSearchBarManager;
    private String mQueryParams;
    private View mRootView;
    private TextView mSearchText;
    private a mSelectedAdapter;
    private View mSmallSearch;
    private String mSubContentId;
    private TabManager.TabBottom mTabBottom;
    private XTabLayout mTabLayout;
    private List<TabManager.TabUp> mTabUps;
    private TextBannerView mTextBannerView;
    private LinearLayout mTopTabLayout;
    private LiveHomeViewPager mViewPager;
    private String mStartChannelType = "jingxuan";
    private boolean mSelectColor = true;
    private String mNavBackImg = "https://gw.alicdn.com/imgextra/i1/O1CN01BdNaMb1g5jEp4wlAl_!!6000000004091-0-tps-750-192.jpg";
    private com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.a iTextBannerItemListener = new com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.a() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeSelectedContainerFragment.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.a
        public void a(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
                return;
            }
            if (HomeSelectedContainerFragment.access$300(HomeSelectedContainerFragment.this) != null) {
                if (HomeSelectedContainerFragment.access$300(HomeSelectedContainerFragment.this).hotWordsDataList != null && HomeSelectedContainerFragment.access$300(HomeSelectedContainerFragment.this).hotWordsDataList.size() > i) {
                    TaoliveSearchHotWords taoliveSearchHotWords = HomeSelectedContainerFragment.access$300(HomeSelectedContainerFragment.this).hotWordsDataList.get(i);
                    if (taoliveSearchHotWords != null) {
                        HomeSelectedContainerFragment homeSelectedContainerFragment = HomeSelectedContainerFragment.this;
                        HomeSelectedContainerFragment.access$400(homeSelectedContainerFragment, homeSelectedContainerFragment.getContext(), HomeSelectedContainerFragment.access$300(HomeSelectedContainerFragment.this).url, taoliveSearchHotWords.word, taoliveSearchHotWords.type, taoliveSearchHotWords.url, taoliveSearchHotWords.rightInfo);
                    }
                } else if (HomeSelectedContainerFragment.access$300(HomeSelectedContainerFragment.this).hotWordsData != null) {
                    HomeSelectedContainerFragment homeSelectedContainerFragment2 = HomeSelectedContainerFragment.this;
                    HomeSelectedContainerFragment.access$400(homeSelectedContainerFragment2, homeSelectedContainerFragment2.getContext(), HomeSelectedContainerFragment.access$300(HomeSelectedContainerFragment.this).url, HomeSelectedContainerFragment.access$300(HomeSelectedContainerFragment.this).hotWordsData.word, HomeSelectedContainerFragment.access$300(HomeSelectedContainerFragment.this).hotWordsData.type, HomeSelectedContainerFragment.access$300(HomeSelectedContainerFragment.this).hotWordsData.url, HomeSelectedContainerFragment.access$300(HomeSelectedContainerFragment.this).hotWordsData.rightInfo);
                }
            } else {
                com.taobao.android.livehome.plugin.atype.flexalocal.utils.b.a(HomeSelectedContainerFragment.this.getContext());
            }
            HomeSelectedContainerFragment homeSelectedContainerFragment3 = HomeSelectedContainerFragment.this;
            HomeSelectedContainerFragment.access$200(homeSelectedContainerFragment3, HomeSelectedContainerFragment.access$100(homeSelectedContainerFragment3).getCurrentItem());
            HomeSelectedContainerFragment homeSelectedContainerFragment4 = HomeSelectedContainerFragment.this;
            HomeSelectedContainerFragment.access$500(homeSelectedContainerFragment4, HomeSelectedContainerFragment.access$100(homeSelectedContainerFragment4).getCurrentItem(), str);
        }

        @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else if (TextUtils.isEmpty(str)) {
            } else {
                HomeSelectedContainerFragment homeSelectedContainerFragment = HomeSelectedContainerFragment.this;
                HomeSelectedContainerFragment.access$600(homeSelectedContainerFragment, HomeSelectedContainerFragment.access$100(homeSelectedContainerFragment).getCurrentItem(), str);
            }
        }
    };

    public static /* synthetic */ Object ipc$super(HomeSelectedContainerFragment homeSelectedContainerFragment, String str, Object... objArr) {
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
            case -1010986463:
                super.setUserVisibleHint(((Boolean) objArr[0]).booleanValue());
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
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public void lazyLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9abbaa01", new Object[]{this});
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

    public static /* synthetic */ Activity access$000(HomeSelectedContainerFragment homeSelectedContainerFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("573b5c32", new Object[]{homeSelectedContainerFragment}) : homeSelectedContainerFragment.mActivity;
    }

    public static /* synthetic */ LiveHomeViewPager access$100(HomeSelectedContainerFragment homeSelectedContainerFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveHomeViewPager) ipChange.ipc$dispatch("8f6387cd", new Object[]{homeSelectedContainerFragment}) : homeSelectedContainerFragment.mViewPager;
    }

    public static /* synthetic */ void access$1000(HomeSelectedContainerFragment homeSelectedContainerFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a0cf625", new Object[]{homeSelectedContainerFragment});
        } else {
            homeSelectedContainerFragment.initNewSearchView();
        }
    }

    public static /* synthetic */ void access$1100(HomeSelectedContainerFragment homeSelectedContainerFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("480d96ee", new Object[]{homeSelectedContainerFragment, new Boolean(z)});
        } else {
            homeSelectedContainerFragment.searchViewBindData(z);
        }
    }

    public static /* synthetic */ void access$1200(HomeSelectedContainerFragment homeSelectedContainerFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc256b27", new Object[]{homeSelectedContainerFragment});
        } else {
            homeSelectedContainerFragment.initBigSearchView();
        }
    }

    public static /* synthetic */ TextView access$1300(HomeSelectedContainerFragment homeSelectedContainerFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("b48dd61c", new Object[]{homeSelectedContainerFragment}) : homeSelectedContainerFragment.mSearchText;
    }

    public static /* synthetic */ TextBannerView access$1400(HomeSelectedContainerFragment homeSelectedContainerFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextBannerView) ipChange.ipc$dispatch("ac3ad46a", new Object[]{homeSelectedContainerFragment}) : homeSelectedContainerFragment.mTextBannerView;
    }

    public static /* synthetic */ e access$1500(HomeSelectedContainerFragment homeSelectedContainerFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("ed9a505d", new Object[]{homeSelectedContainerFragment}) : homeSelectedContainerFragment.mNewSearchBarManager;
    }

    public static /* synthetic */ void access$200(HomeSelectedContainerFragment homeSelectedContainerFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b36c8cb", new Object[]{homeSelectedContainerFragment, new Integer(i)});
        } else {
            homeSelectedContainerFragment.searchClickUT(i);
        }
    }

    public static /* synthetic */ TaoLiveHotwordResponseData access$300(HomeSelectedContainerFragment homeSelectedContainerFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveHotwordResponseData) ipChange.ipc$dispatch("df503013", new Object[]{homeSelectedContainerFragment}) : homeSelectedContainerFragment.mHotwordResponseData;
    }

    public static /* synthetic */ TaoLiveHotwordResponseData access$302(HomeSelectedContainerFragment homeSelectedContainerFragment, TaoLiveHotwordResponseData taoLiveHotwordResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveHotwordResponseData) ipChange.ipc$dispatch("21651d3b", new Object[]{homeSelectedContainerFragment, taoLiveHotwordResponseData});
        }
        homeSelectedContainerFragment.mHotwordResponseData = taoLiveHotwordResponseData;
        return taoLiveHotwordResponseData;
    }

    public static /* synthetic */ void access$400(HomeSelectedContainerFragment homeSelectedContainerFragment, Context context, String str, String str2, String str3, String str4, TaoliveSearchHotWords.RightInfo rightInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6caa3458", new Object[]{homeSelectedContainerFragment, context, str, str2, str3, str4, rightInfo});
        } else {
            homeSelectedContainerFragment.gotoSearch(context, str, str2, str3, str4, rightInfo);
        }
    }

    public static /* synthetic */ void access$500(HomeSelectedContainerFragment homeSelectedContainerFragment, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baad1972", new Object[]{homeSelectedContainerFragment, new Integer(i), str});
        } else {
            homeSelectedContainerFragment.searchWordClickUT(i, str);
        }
    }

    public static /* synthetic */ void access$600(HomeSelectedContainerFragment homeSelectedContainerFragment, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a93fa551", new Object[]{homeSelectedContainerFragment, new Integer(i), str});
        } else {
            homeSelectedContainerFragment.searchWordShowUT(i, str);
        }
    }

    public static /* synthetic */ Activity access$700(HomeSelectedContainerFragment homeSelectedContainerFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("6414cd0b", new Object[]{homeSelectedContainerFragment}) : homeSelectedContainerFragment.mActivity;
    }

    public static /* synthetic */ String access$800(HomeSelectedContainerFragment homeSelectedContainerFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("97078822", new Object[]{homeSelectedContainerFragment}) : homeSelectedContainerFragment.mStartChannelType;
    }

    public static /* synthetic */ boolean access$900(HomeSelectedContainerFragment homeSelectedContainerFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("74996ac3", new Object[]{homeSelectedContainerFragment})).booleanValue() : homeSelectedContainerFragment.enableNewSearchBar;
    }

    static {
        kge.a(-1545407120);
        kge.a(1735445453);
        kge.a(1922521022);
        kge.a(1038752494);
        kge.a(899544150);
        kge.a(2053124536);
        kge.a(-1043440182);
        TAG = HomeSelectedContainerFragment.class.getSimpleName();
        sTrackPage = new HashMap<String, String>(3) { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeSelectedContainerFragment.6
            {
                put("jingxuan", k.PAGE_SELECTED);
                put(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.TAB_FOLLOW, k.PAGE_FOLLOW);
                put(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.TAB_SINGLELIVE, k.PAGE_SINGLELIVE);
            }
        };
        sTrackSpm = new HashMap<String, String>(3) { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeSelectedContainerFragment.7
            {
                put("jingxuan", k.SPM_SELECTED);
                put(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.TAB_FOLLOW, k.SPM_FOLLOW);
                put(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.TAB_SINGLELIVE, k.SPM_SINGLELIVE);
            }
        };
    }

    public static HomeSelectedContainerFragment newInstance(Bundle bundle, sqt sqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeSelectedContainerFragment) ipChange.ipc$dispatch("4b47be03", new Object[]{bundle, sqtVar});
        }
        HomeSelectedContainerFragment homeSelectedContainerFragment = new HomeSelectedContainerFragment();
        homeSelectedContainerFragment.setArguments(bundle);
        homeSelectedContainerFragment.setLiveHomeContext(sqtVar);
        return homeSelectedContainerFragment;
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
        if (arguments != null) {
            if ("true".equals(this.mLiveHomeContext.F)) {
                this.mStartChannelType = com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.TAB_SINGLELIVE;
            } else {
                this.mStartChannelType = arguments.getString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.START_CHANNEL_TYPE, "jingxuan");
            }
            this.mQueryParams = arguments.getString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_QUERY_PARAMS, "");
            this.mTabBottom = (TabManager.TabBottom) arguments.getSerializable(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_TAB_BOTTOM);
            TabManager.TabBottom tabBottom = this.mTabBottom;
            if (tabBottom != null) {
                this.mChannelType = tabBottom.channelType;
                this.mTabUps = getCurrentTabs();
            }
            this.mEntryLiveSource = arguments.getString("entryLiveSource", "");
        }
        this.mLiveHomeContext.a((d) this);
        this.mLiveHomeContext.a((b) this);
        this.mHandler = new Handler(this);
        this.enableNewSearchBar = i.aa();
    }

    private void gotoSearch(Context context, String str, String str2, String str3, String str4, TaoliveSearchHotWords.RightInfo rightInfo) {
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe89810", new Object[]{this, context, str, str2, str3, str4, rightInfo});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("word", str2);
            bundle.putString("type", str3);
            bundle.putString("url", str4);
            if (com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.TAB_FOLLOW.equals(this.mLiveHomeContext.C.channelType)) {
                if (str.contains("?")) {
                    str5 = str + "&search_entry=follow";
                } else {
                    str5 = str + "?search_entry=follow";
                }
            } else if (!"jingxuan".equals(this.mLiveHomeContext.C.channelType)) {
                str5 = str;
            } else if (str.contains("?")) {
                str5 = str + "&search_entry=jingxuan";
            } else {
                str5 = str + "?search_entry=jingxuan";
            }
            if (!TextUtils.isEmpty(str2)) {
                str5 = str5 + "&word=" + Uri.encode(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                str5 = str5 + "&type=" + Uri.encode(str3);
            }
            if (rightInfo != null) {
                str5 = str5 + "&rightInfo=" + Uri.encode(JSON.toJSONString(rightInfo));
            }
            if (!TextUtils.isEmpty(str)) {
                str5 = str5 + "&url=" + Uri.encode(str4);
            }
            Nav.from(context).withExtras(bundle).toUri(str5 + "&nativeKeyboard=true");
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        TLog.loge("TaoLiveHomepage", "HomeSelectedContainerFragment onCreateView");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        TLog.loge("TaoLiveHomepage", "HomeSelectedContainerFragment onCreateView super");
        if (this.mRootView == null) {
            this.mRootView = layoutInflater.inflate(R.layout.live_selected_fragment_flexalocal, viewGroup, false);
            this.mTopTabLayout = (LinearLayout) this.mRootView.findViewById(R.id.homepage2_toolbar);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mTopTabLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.topMargin += com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a(this.mActivity, this.mLiveHomeContext.n);
            }
            this.mTopTabLayout.setLayoutParams(layoutParams);
            this.mViewPager = (LiveHomeViewPager) this.mRootView.findViewById(R.id.live_selected_vp);
            View findViewById = this.mRootView.findViewById(R.id.homepage2_back);
            if (findViewById != null) {
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeSelectedContainerFragment.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            HomeSelectedContainerFragment.this.mLiveHomeContext.h().a();
                        }
                    }
                });
            }
            this.mSmallSearch = this.mRootView.findViewById(R.id.homepage_toptab_search);
            this.mSmallSearch.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeSelectedContainerFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Nav from;
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (i.a(HomeSelectedContainerFragment.access$000(HomeSelectedContainerFragment.this))) {
                        from = Nav.from(HomeSelectedContainerFragment.this.getContext());
                        str = i.g() + "&search_entry=singleLiveTab";
                    } else {
                        from = Nav.from(HomeSelectedContainerFragment.this.getContext());
                        str = "http://h5.m.taobao.com/taolive/search.html?search_entry=singleLiveTab";
                    }
                    from.toUri(str);
                    HomeSelectedContainerFragment homeSelectedContainerFragment = HomeSelectedContainerFragment.this;
                    HomeSelectedContainerFragment.access$200(homeSelectedContainerFragment, HomeSelectedContainerFragment.access$100(homeSelectedContainerFragment).getCurrentItem());
                }
            });
            this.mTabLayout = (XTabLayout) this.mRootView.findViewById(R.id.homepage2_tab_layout);
        }
        lazyLoadView();
        TLog.loge("TaoLiveHomepage", "HomeSelectedContainerFragment onCreateView end");
        return this.mRootView;
    }

    private void updateBigSearchLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e4e3f6", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.mBigSearch;
        if (viewGroup == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        int max = sdt.d(getContext()) ? (int) Math.max(com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a(getContext(), 119.0f), com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a() * 0.4d) : com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a(getContext(), 119.0f);
        int a2 = com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a(getContext(), 30.0f);
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(max, a2);
        }
        layoutParams.width = max;
        layoutParams.height = a2;
        this.mBigSearch.setLayoutParams(layoutParams);
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
        if (arguments != null) {
            this.mContentId = arguments.getString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.START_CONTENT_ID);
            this.mSubContentId = arguments.getString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.START_SUB_CONTENT_ID);
        }
        mfg.a().a(this);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public String getTabName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fbf611af", new Object[]{this}) : TAG;
    }

    private void lazyLoadView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32d22146", new Object[]{this});
        } else if (!this.mIsCreateView || !this.mAppear || this.mInit) {
        } else {
            onTabReady();
            if (com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.d()) {
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.sendEmptyMessageDelayed(1000, 2000L);
                }
            } else {
                requestHotKey();
            }
            this.mInit = true;
        }
    }

    public void setToolbarColor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e1d343", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.b bVar = this.mColorSwitcher;
        if (bVar == null) {
            return;
        }
        bVar.a(z);
    }

    private void initBigSearchView() {
        ViewStub viewStub;
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("232eac64", new Object[]{this});
            return;
        }
        View view = this.mRootView;
        if (view == null || (viewStub = (ViewStub) view.findViewById(R.id.live_search_stub)) == null) {
            return;
        }
        viewStub.setLayoutResource(R.layout.live_search_big_flexalocal);
        this.mBigSearch = (ViewGroup) viewStub.inflate();
        if (this.mBigSearch != null) {
            updateBigSearchLayoutParams();
            this.mBigSearch.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeSelectedContainerFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        return;
                    }
                    StringBuilder sb = new StringBuilder(i.a(HomeSelectedContainerFragment.access$700(HomeSelectedContainerFragment.this)) ? i.g() : "http://h5.m.taobao.com/taolive/search.html?enableH5=false");
                    if (!com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.TAB_FOLLOW.equals(HomeSelectedContainerFragment.this.mLiveHomeContext.C.channelType)) {
                        if ("jingxuan".equals(HomeSelectedContainerFragment.this.mLiveHomeContext.C.channelType)) {
                            str = "&search_entry=jinxuan";
                        }
                        Nav.from(HomeSelectedContainerFragment.this.getContext()).toUri(sb.toString());
                        HomeSelectedContainerFragment homeSelectedContainerFragment = HomeSelectedContainerFragment.this;
                        HomeSelectedContainerFragment.access$200(homeSelectedContainerFragment, HomeSelectedContainerFragment.access$100(homeSelectedContainerFragment).getCurrentItem());
                    }
                    str = "&search_entry=follow";
                    sb.append(str);
                    Nav.from(HomeSelectedContainerFragment.this.getContext()).toUri(sb.toString());
                    HomeSelectedContainerFragment homeSelectedContainerFragment2 = HomeSelectedContainerFragment.this;
                    HomeSelectedContainerFragment.access$200(homeSelectedContainerFragment2, HomeSelectedContainerFragment.access$100(homeSelectedContainerFragment2).getCurrentItem());
                }
            });
        }
        this.mSearchText = (TextView) this.mRootView.findViewById(R.id.live_search_tips);
        this.mTextBannerView = (TextBannerView) this.mRootView.findViewById(R.id.live_search_tips_new);
        this.mTextBannerView.setItemListener(this.iTextBannerItemListener);
        updateBigSearchBackground();
        ViewGroup viewGroup = this.mBigSearch;
        if (viewGroup == null || (eVar = this.mNewSearchBarManager) == null) {
            return;
        }
        eVar.a((LinearLayout) viewGroup);
    }

    private void initNewSearchView() {
        ViewStub viewStub;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2944104", new Object[]{this});
            return;
        }
        Fragment fragment = this.mCurrentFragment;
        if (!(fragment instanceof HomeSelectedFragment) || (viewStub = (ViewStub) ((HomeSelectedFragment) fragment).getSearchViewStub()) == null) {
            return;
        }
        this.mNewSearchBarManager = new e(getContext(), this.mLiveHomeContext, viewStub);
        this.mLiveSearchNewHints = this.mNewSearchBarManager.a();
        TextBannerView textBannerView = this.mLiveSearchNewHints;
        if (textBannerView != null) {
            textBannerView.setItemListener(this.iTextBannerItemListener);
        }
        ViewGroup viewGroup = this.mBigSearch;
        if (viewGroup != null) {
            this.mNewSearchBarManager.a((LinearLayout) viewGroup);
        }
        int currentItem = this.mViewPager.getCurrentItem();
        e eVar = this.mNewSearchBarManager;
        if (eVar == null) {
            return;
        }
        eVar.a(currentItem);
    }

    private void searchViewBindData(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32548299", new Object[]{this, new Boolean(z)});
            return;
        }
        TaoLiveHotwordResponseData taoLiveHotwordResponseData = this.mHotwordResponseData;
        if (taoLiveHotwordResponseData != null && taoLiveHotwordResponseData.hotWords != null) {
            try {
                this.mHotwordResponseData.hotWordsData = (TaoliveSearchHotWords) JSON.parseObject(this.mHotwordResponseData.hotWords, TaoliveSearchHotWords.class);
                if (this.mHotwordResponseData.hotWordsData != null && this.mHotwordResponseData.hotWordsData.word != null) {
                    if (z) {
                        if (this.mTextBannerView != null) {
                            this.mTextBannerView.setVisibility(0);
                        }
                        if (this.mSearchText != null) {
                            this.mSearchText.setVisibility(0);
                            this.mSearchText.setText(this.mHotwordResponseData.hotWordsData.word);
                        }
                    } else if (this.mNewSearchBarManager != null) {
                        this.mNewSearchBarManager.a(this.mHotwordResponseData.hotWordsData.word);
                    }
                }
            } catch (Exception e) {
                mfj.c(TAG, e.getMessage());
            }
        }
        TaoLiveHotwordResponseData taoLiveHotwordResponseData2 = this.mHotwordResponseData;
        if (taoLiveHotwordResponseData2 == null || taoLiveHotwordResponseData2.hotWordsList == null) {
            return;
        }
        try {
            if (z) {
                if (this.mTextBannerView != null) {
                    this.mTextBannerView.setVisibility(0);
                }
                if (this.mSearchText != null) {
                    this.mSearchText.setVisibility(8);
                }
            } else if (this.mNewSearchBarManager != null) {
                this.mNewSearchBarManager.b();
            }
            this.mHotwordResponseData.hotWordsDataList = parseData(this.mHotwordResponseData.hotWordsList);
            if (this.mHotwordResponseData.hotWordsDataList != null && this.mTextBannerView != null && z) {
                this.mTextBannerView.setWithLabelDatas(true, this.mHotwordResponseData.hotWordsDataList);
            }
            if (this.mHotwordResponseData.hotWordsDataList == null || this.mLiveSearchNewHints == null || z) {
                return;
            }
            this.mLiveSearchNewHints.setWithLabelDatas(false, this.mHotwordResponseData.hotWordsDataList);
        } catch (Exception e2) {
            mfj.c(TAG, e2.getMessage());
        }
    }

    private void requestHotKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17700648", new Object[]{this});
        } else {
            new com.taobao.android.livehome.plugin.atype.flexalocal.business.search.a(new IRemoteBaseListener() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeSelectedContainerFragment.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        onError(i, mtopResponse, obj);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else if (!(baseOutDo instanceof TaoLiveHotWordResponse) || !(baseOutDo.mo2429getData() instanceof TaoLiveHotwordResponseData)) {
                    } else {
                        HomeSelectedContainerFragment.access$302(HomeSelectedContainerFragment.this, ((TaoLiveHotWordResponse) baseOutDo).mo2429getData());
                        if (HomeSelectedContainerFragment.access$800(HomeSelectedContainerFragment.this).equals("jingxuan") && HomeSelectedContainerFragment.access$900(HomeSelectedContainerFragment.this)) {
                            HomeSelectedContainerFragment.access$1000(HomeSelectedContainerFragment.this);
                            HomeSelectedContainerFragment.access$1100(HomeSelectedContainerFragment.this, false);
                        } else {
                            HomeSelectedContainerFragment.access$1200(HomeSelectedContainerFragment.this);
                            HomeSelectedContainerFragment.access$1100(HomeSelectedContainerFragment.this, true);
                        }
                        k.a("RequestSuccess", "firstRequest", mtopResponse, HomeSelectedContainerFragment.this.mLiveHomeContext);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    if (HomeSelectedContainerFragment.access$1300(HomeSelectedContainerFragment.this) != null) {
                        HomeSelectedContainerFragment.access$1300(HomeSelectedContainerFragment.this).setVisibility(0);
                        HomeSelectedContainerFragment.access$1300(HomeSelectedContainerFragment.this).setText(i.f());
                    }
                    if (HomeSelectedContainerFragment.access$1400(HomeSelectedContainerFragment.this) != null) {
                        HomeSelectedContainerFragment.access$1400(HomeSelectedContainerFragment.this).setVisibility(8);
                    }
                    if (HomeSelectedContainerFragment.access$1500(HomeSelectedContainerFragment.this) != null) {
                        HomeSelectedContainerFragment.access$1500(HomeSelectedContainerFragment.this).a(i.f());
                    }
                    k.a("requestError", "firstRequest", mtopResponse, HomeSelectedContainerFragment.this.mLiveHomeContext);
                }
            }).a(this.mLiveHomeContext, this.mActivity);
        }
    }

    private List<String> getTextList(List<TaoliveSearchHotWords> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4012934e", new Object[]{this, list});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                arrayList.add(list.get(i).word);
            }
        }
        return arrayList;
    }

    private List<TaoliveSearchHotWords> parseData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9a060b9", new Object[]{this, str});
        }
        if (str != null) {
            return JSON.parseArray(str, TaoliveSearchHotWords.class);
        }
        return null;
    }

    private TabManager.TabUp getTab(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabManager.TabUp) ipChange.ipc$dispatch("2f07106f", new Object[]{this, new Integer(i)});
        }
        for (int i2 = 0; i2 < this.mTabUps.size(); i2++) {
            if (i2 == i) {
                return this.mTabUps.get(i2);
            }
        }
        return null;
    }

    private String getCurrentChannelType() {
        LiveHomeViewPager liveHomeViewPager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2610f59f", new Object[]{this});
        }
        a aVar = this.mSelectedAdapter;
        return (aVar == null || (liveHomeViewPager = this.mViewPager) == null) ? "" : aVar.b(liveHomeViewPager.getCurrentItem());
    }

    @Override // com.taobao.live.home.view.UTAnalyzeFragment
    public String getUTPageName() {
        LiveHomeViewPager liveHomeViewPager;
        TabManager.TabUp c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        a aVar = this.mSelectedAdapter;
        String str = (aVar == null || (liveHomeViewPager = this.mViewPager) == null || (c = aVar.c(liveHomeViewPager.getCurrentItem())) == null) ? "" : c.pageName;
        return l.a((CharSequence) str) ? sTrackPage.get(getCurrentChannelType()) : str;
    }

    @Override // com.taobao.live.home.view.UTAnalyzeFragment
    public Map<String, String> getUTProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("16970404", new Object[]{this});
        }
        HashMap hashMap = new HashMap(1);
        String currentChannelSpm = getCurrentChannelSpm();
        if (currentChannelSpm != null) {
            HashMap hashMap2 = new HashMap(1);
            hashMap2.put("spm-url", currentChannelSpm);
            updateNextPageProperties(hashMap2);
            hashMap.put("spm-cnt", currentChannelSpm);
        }
        return hashMap;
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
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (this.mLiveHomeContext == null || this.mLiveHomeContext.b() == null) {
            return;
        }
        this.mLiveHomeContext.a((b) null);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, com.taobao.live.home.view.UTAnalyzeFragment, android.support.v4.app.Fragment
    public void setUserVisibleHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bd9221", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setUserVisibleHint(z);
        if (!this.mIsCreateView) {
            return;
        }
        onSelectedUpdate(z);
        procTextBannerAnimator(z);
        this.mLiveHomeContext.b(z);
    }

    public void onSelectedUpdate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1b48a0a", new Object[]{this, new Boolean(z)});
            return;
        }
        mfj.c("HomeBaseFragment2", getTabName() + "--onSelectedUpdate mSelected:" + this.mSelected);
        LiveHomeViewPager liveHomeViewPager = this.mViewPager;
        if (liveHomeViewPager == null || this.mSelectedAdapter == null) {
            return;
        }
        Fragment fragment = (Fragment) this.mSelectedAdapter.instantiateItem((ViewGroup) this.mViewPager, liveHomeViewPager.getCurrentItem());
        if (!(fragment instanceof HomeSelectedBaseFragment)) {
            return;
        }
        ((HomeSelectedBaseFragment) fragment).updateSelectedStatus(z);
    }

    private void procTextBannerAnimator(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faa8ea37", new Object[]{this, new Boolean(z)});
        } else if (z) {
            TextBannerView textBannerView = this.mTextBannerView;
            if (textBannerView != null) {
                textBannerView.startViewAnimator();
            }
            TextBannerView textBannerView2 = this.mLiveSearchNewHints;
            if (textBannerView2 == null) {
                return;
            }
            textBannerView2.startViewAnimator();
        } else {
            TextBannerView textBannerView3 = this.mTextBannerView;
            if (textBannerView3 != null) {
                textBannerView3.stopViewAnimator();
            }
            TextBannerView textBannerView4 = this.mLiveSearchNewHints;
            if (textBannerView4 == null) {
                return;
            }
            textBannerView4.stopViewAnimator();
        }
    }

    private List<TabManager.TabUp> getCurrentTabs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2fbe61df", new Object[]{this});
        }
        List<TabManager.TabUp> list = this.mTabBottom.topTab;
        return list == null ? getDefaultTab() : list;
    }

    private String getCurrentChannelSpm() {
        LiveHomeViewPager liveHomeViewPager;
        TabManager.TabUp c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b54fda9", new Object[]{this});
        }
        a aVar = this.mSelectedAdapter;
        String str = (aVar == null || (liveHomeViewPager = this.mViewPager) == null || (c = aVar.c(liveHomeViewPager.getCurrentItem())) == null) ? "" : c.spm;
        return l.a((CharSequence) str) ? sTrackSpm.get(getCurrentChannelType()) : str;
    }

    @Override // com.taobao.live.home.widget.tab.XTabLayout.a
    public void onTabClick(XTabLayout.d dVar) {
        TabManager.TabUp tab;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c6a0e1c", new Object[]{this, dVar});
        } else if (dVar == null || (tab = getTab(dVar.k())) == null || (jSONObject = tab.tabUT) == null) {
        } else {
            String string = jSONObject.getString(com.taobao.android.weex_framework.util.a.ATOM_EXT_button);
            String string2 = jSONObject.getString("spm");
            if (l.a((CharSequence) string)) {
                return;
            }
            g.a(string, getUtBaseParams(string2));
        }
    }

    private Map<String, String> getUtBaseParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("43de2332", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", str);
        if (this.mLiveHomeContext != null) {
            hashMap.put("entryLiveSource", this.mLiveHomeContext.e);
            hashMap.put("entrySpm", this.mLiveHomeContext.f);
        }
        return hashMap;
    }

    @Override // com.taobao.live.home.widget.tab.XTabLayout.b
    public void onTabSelected(XTabLayout.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c87d7c5b", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            String str = TAG;
            mfj.c(str, "onTabSelected tab " + dVar.k());
            LiveHomeViewPager liveHomeViewPager = this.mViewPager;
            if (liveHomeViewPager != null) {
                liveHomeViewPager.setCanScroll(true);
            }
            dVar.e("");
            this.mLiveHomeContext.C = this.mTabUps.get(dVar.k());
            LiveHomeViewPager liveHomeViewPager2 = this.mViewPager;
            if (liveHomeViewPager2 != null) {
                liveHomeViewPager2.setCurrentItem(dVar.k());
            }
            onTabAppearUpdate();
            e eVar = this.mNewSearchBarManager;
            if (eVar != null) {
                eVar.a(dVar.k());
            }
            if (i.aa()) {
                if (dVar.k() == 1) {
                    TextBannerView textBannerView = this.mLiveSearchNewHints;
                    if (textBannerView != null) {
                        textBannerView.startViewAnimator();
                    }
                    TextBannerView textBannerView2 = this.mTextBannerView;
                    if (textBannerView2 != null) {
                        textBannerView2.stopViewAnimator();
                    }
                } else if (dVar.k() == 0) {
                    TextBannerView textBannerView3 = this.mLiveSearchNewHints;
                    if (textBannerView3 != null) {
                        textBannerView3.stopViewAnimator();
                    }
                    TextBannerView textBannerView4 = this.mTextBannerView;
                    if (textBannerView4 != null) {
                        textBannerView4.startViewAnimator();
                    }
                }
            }
            if (this.mColorSwitcher != null && getTabPosition(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.TAB_FOLLOW) >= 0 && dVar.k() == getTabPosition(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.TAB_FOLLOW)) {
                this.mColorSwitcher.a(dVar);
            }
            searchShowUT(dVar.k());
            k.a("CHANGE_TAB", this.mLiveHomeContext);
        }
    }

    private void searchWordShowUT(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc3498", new Object[]{this, new Integer(i), str});
            return;
        }
        List<TabManager.TabUp> list = this.mTabUps;
        if (list == null || i < 0 || i >= list.size() || this.mTabUps.get(i) == null) {
            return;
        }
        Map<String, String> utBaseParams = getUtBaseParams(this.mTabUps.get(i).spm);
        utBaseParams.put("query", str);
        g.b("Show-shaded_word", utBaseParams);
    }

    private void searchWordClickUT(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dd6dd91", new Object[]{this, new Integer(i), str});
            return;
        }
        List<TabManager.TabUp> list = this.mTabUps;
        if (list == null || i < 0 || i >= list.size() || this.mTabUps.get(i) == null) {
            return;
        }
        Map<String, String> utBaseParams = getUtBaseParams(this.mTabUps.get(i).spm);
        utBaseParams.put("query", str);
        g.a("shaded_word", utBaseParams);
    }

    private void searchShowUT(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725127b8", new Object[]{this, new Integer(i)});
            return;
        }
        List<TabManager.TabUp> list = this.mTabUps;
        if (list == null || i < 0 || i >= list.size() || this.mTabUps.get(i) == null) {
            return;
        }
        g.b("Show-searchbox", getUtBaseParams(this.mTabUps.get(i).spm));
    }

    private void searchClickUT(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4992f5d", new Object[]{this, new Integer(i)});
            return;
        }
        List<TabManager.TabUp> list = this.mTabUps;
        if (list == null || i < 0 || i >= list.size() || this.mTabUps.get(i) == null) {
            return;
        }
        g.a("searchbox", getUtBaseParams(this.mTabUps.get(i).spm));
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onTabAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121b4972", new Object[]{this});
            return;
        }
        super.onTabAppear();
        LiveHomeViewPager liveHomeViewPager = this.mViewPager;
        if (liveHomeViewPager != null) {
            liveHomeViewPager.setCanScroll(true);
        }
        lazyLoadView();
        if (!this.mSelected) {
            return;
        }
        onTabAppearUpdate();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onTabResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d5380a", new Object[]{this});
            return;
        }
        super.onTabResume();
        procTextBannerAnimator(true);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onTabPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("895662e7", new Object[]{this});
            return;
        }
        super.onTabPause();
        procTextBannerAnimator(false);
    }

    public void onTabAppearUpdate() {
        XTabLayout xTabLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f417359b", new Object[]{this});
            return;
        }
        mfj.c("HomeBaseFragment2", getTabName() + "--onTabAppearUpdate mSelected:" + this.mSelected);
        LiveHomeViewPager liveHomeViewPager = this.mViewPager;
        if (liveHomeViewPager != null && this.mSelectedAdapter != null) {
            int currentItem = liveHomeViewPager.getCurrentItem();
            Fragment fragment = this.mCurrentFragment;
            if (fragment instanceof HomeSelectedFragment) {
                ((HomeSelectedFragment) fragment).setCacheCurrentTabIsBlack(this.mColorSwitcher.j());
            }
            com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.b bVar = this.mColorSwitcher;
            if (bVar != null && (xTabLayout = this.mTabLayout) != null) {
                bVar.b(xTabLayout.getTabAt(currentItem));
            }
            Fragment fragment2 = (Fragment) this.mSelectedAdapter.instantiateItem((ViewGroup) this.mViewPager, currentItem);
            this.mCurrentFragment = fragment2;
            if (fragment2 instanceof HomeSelectedFragment) {
                HomeSelectedFragment homeSelectedFragment = (HomeSelectedFragment) fragment2;
                if (!homeSelectedFragment.mAppear) {
                    homeSelectedFragment.onTabAppear();
                }
                switchSearch(true);
            } else if (fragment2 instanceof HomeTopLivePageFrame) {
                HomeTopLivePageFrame homeTopLivePageFrame = (HomeTopLivePageFrame) fragment2;
                if (!homeTopLivePageFrame.mAppear) {
                    homeTopLivePageFrame.onTabAppear();
                }
                this.mColorSwitcher.a(false);
                switchSearch(false);
            } else if (fragment2 instanceof HomeSelectedBaseFragment) {
                HomeSelectedBaseFragment homeSelectedBaseFragment = (HomeSelectedBaseFragment) fragment2;
                if (!homeSelectedBaseFragment.mAppear) {
                    homeSelectedBaseFragment.onTabAppear();
                }
                this.mColorSwitcher.a(true);
                switchSearch(true);
            }
            switchTabLayoutWidth(currentItem);
        }
        procTextBannerAnimator(true);
    }

    private void updateBigSearchBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("801abc94", new Object[]{this});
        } else if (!i.ab() || this.mLiveHomeContext == null || this.mLiveHomeContext.C == null || this.mBigSearch == null) {
        } else {
            if (com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.TAB_FOLLOW.equals(this.mLiveHomeContext.C.channelType)) {
                this.mBigSearch.setBackgroundResource(R.drawable.live_search_follow_bg_flexalocal);
            } else {
                this.mBigSearch.setBackgroundResource(R.drawable.live_search_bg_flexalocal);
            }
        }
    }

    private void switchSearch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7e1cab1", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.enableNewSearchBar && this.mLiveHomeContext.C.channelType.equals("jingxuan") && this.mNewSearchBarManager == null) {
            initNewSearchView();
            searchViewBindData(false);
        }
        if ((!this.enableNewSearchBar || !this.mLiveHomeContext.C.channelType.equals("jingxuan")) && this.mTextBannerView == null) {
            initBigSearchView();
            searchViewBindData(true);
        }
        if (z) {
            View view = this.mSmallSearch;
            if (view != null) {
                view.setVisibility(8);
            }
            if (this.mBigSearch == null) {
                return;
            }
            updateBigSearchBackground();
            if (i.ab() && this.mLiveHomeContext != null && this.mLiveHomeContext.C != null && this.mBigSearch != null) {
                if (com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.TAB_FOLLOW.equals(this.mLiveHomeContext.C.channelType)) {
                    this.mBigSearch.setVisibility(0);
                } else if (i.aa()) {
                    this.mBigSearch.setVisibility(8);
                } else {
                    this.mBigSearch.setVisibility(0);
                }
            }
            procTextBannerAnimator(true);
            return;
        }
        View view2 = this.mSmallSearch;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        ViewGroup viewGroup = this.mBigSearch;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
        procTextBannerAnimator(false);
    }

    private void switchTabLayoutWidth(int i) {
        FrameLayout.LayoutParams layoutParams;
        XTabLayout.d tabAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc1de01", new Object[]{this, new Integer(i)});
        } else if (this.mTabLayout.getTabAt(i) == null) {
        } else {
            int tabPosition = getTabPosition(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.TAB_SINGLELIVE);
            LinearLayout linearLayout = null;
            if (tabPosition < 0 || (tabAt = this.mTabLayout.getTabAt(tabPosition)) == null || tabAt.h() == null) {
                layoutParams = null;
            } else {
                linearLayout = (LinearLayout) tabAt.h().getCustomView().findViewById(R.id.tab_item);
                layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.mTabLayout.getLayoutParams();
            if (getContext() == null) {
                return;
            }
            ViewGroup viewGroup = this.mBigSearch;
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                layoutParams2.width = (com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a() - com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a(getContext(), 165.0f)) - ((int) Math.max((double) mto.a.GEO_NOT_SUPPORT, sdt.d(getContext()) ? (com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a() * 0.4d) - com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a(getContext(), 119.0f) : 0.0d));
                this.mTabLayout.setLayoutParams(layoutParams2);
                if (linearLayout == null || layoutParams == null) {
                    return;
                }
                layoutParams.width = (layoutParams2.width - this.mColorSwitcher.b()) - com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a((Context) this.mActivity, 2.0f);
                linearLayout.setLayoutParams(layoutParams);
                return;
            }
            View view = this.mSmallSearch;
            if (view != null && view.getVisibility() == 0) {
                layoutParams2.width = com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a() - com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a(getContext(), 67.0f);
                this.mTabLayout.setLayoutParams(layoutParams2);
                if (linearLayout == null || layoutParams == null) {
                    return;
                }
                layoutParams.width = (layoutParams2.width - this.mColorSwitcher.b()) - com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a((Context) this.mActivity, 2.0f);
                linearLayout.setLayoutParams(layoutParams);
                return;
            }
            ViewGroup viewGroup2 = this.mBigSearch;
            if (viewGroup2 == null || viewGroup2.getVisibility() == 0 || !i.aa()) {
                return;
            }
            layoutParams2.width = -2;
            this.mTabLayout.setLayoutParams(layoutParams2);
            if (linearLayout == null || layoutParams == null) {
                return;
            }
            layoutParams.width = (layoutParams2.width - this.mColorSwitcher.b()) - com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a((Context) this.mActivity, 2.0f);
            linearLayout.setLayoutParams(layoutParams);
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onTabDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8c0914", new Object[]{this});
            return;
        }
        super.onTabDisappear();
        if (!this.mSelected) {
            return;
        }
        onTabDisappearUpdate();
    }

    public void onTabDisappearUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896e33bd", new Object[]{this});
            return;
        }
        mfj.c("HomeBaseFragment2", getTabName() + "--onTabDisappearUpdate mSelected:" + this.mSelected);
        LiveHomeViewPager liveHomeViewPager = this.mViewPager;
        if (liveHomeViewPager != null && this.mSelectedAdapter != null) {
            Fragment fragment = (Fragment) this.mSelectedAdapter.instantiateItem((ViewGroup) this.mViewPager, liveHomeViewPager.getCurrentItem());
            if (fragment instanceof HomeSelectedBaseFragment) {
                ((HomeSelectedBaseFragment) fragment).onTabDisappear();
            }
        }
        procTextBannerAnimator(false);
    }

    @Override // com.taobao.live.home.widget.tab.XTabLayout.b
    public void onTabUnselected(XTabLayout.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e54d4c34", new Object[]{this, dVar});
            return;
        }
        mfj.c("HomeBaseFragment2", getTabName() + "--onTabUnselected mSelected:" + this.mSelected);
        com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.b bVar = this.mColorSwitcher;
        if (bVar == null || dVar == null) {
            return;
        }
        bVar.c(dVar);
        if (getTabPosition("jingxuan") < 0 || dVar.k() != getTabPosition("jingxuan")) {
            return;
        }
        this.mSelectColor = this.mColorSwitcher.a();
    }

    @Override // com.taobao.live.home.widget.tab.XTabLayout.b
    public void onTabReselected(XTabLayout.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cddb74e", new Object[]{this, dVar});
            return;
        }
        mfj.c("HomeBaseFragment2", getTabName() + "--onTabReselected mSelected:" + this.mSelected);
        com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.b bVar = this.mColorSwitcher;
        if (bVar == null) {
            return;
        }
        bVar.d(dVar);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void refreshCurrentPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6c53d4", new Object[]{this});
            return;
        }
        LiveHomeViewPager liveHomeViewPager = this.mViewPager;
        if (liveHomeViewPager == null || this.mSelectedAdapter == null) {
            return;
        }
        Fragment fragment = (Fragment) this.mSelectedAdapter.instantiateItem((ViewGroup) this.mViewPager, liveHomeViewPager.getCurrentItem());
        if (!(fragment instanceof HomeSelectedBaseFragment)) {
            return;
        }
        ((HomeSelectedBaseFragment) fragment).refreshCurrentPage();
    }

    private List<TabManager.TabUp> getDefaultTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6bf74916", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        if (!l.a((CharSequence) this.mChannelType) && mfn.a("jingxuan", this.mChannelType)) {
            TabManager.TabUp tabUp = new TabManager.TabUp();
            tabUp.name = nmf.TEXT_UNFOLLOW_DEFAULT;
            tabUp.channelType = com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.TAB_FOLLOW;
            arrayList.add(tabUp);
            TabManager.TabUp tabUp2 = new TabManager.TabUp();
            tabUp2.name = "发现";
            tabUp2.channelId = 0;
            tabUp2.channelType = "jingxuan";
            arrayList.add(tabUp2);
        }
        return arrayList;
    }

    private void setViewpagerCurrent(int i) {
        try {
            Field declaredField = Class.forName("android.support.v4.view.ViewPager").getDeclaredField("mCurItem");
            declaredField.setAccessible(true);
            declaredField.setInt(this.mViewPager, i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void onTabReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16e87814", new Object[]{this});
        } else if (this.mViewPager == null) {
        } else {
            int enterIndex = getEnterIndex(this.mTabUps);
            HashMap hashMap = new HashMap();
            hashMap.put("enterIndex", String.valueOf(enterIndex));
            if (!l.a((CharSequence) this.mEntryLiveSource)) {
                hashMap.put(pqq.KEY_LIVE_SOURCE, String.valueOf(this.mEntryLiveSource));
            }
            if (enterIndex != 1) {
                g.b("tbLiveChannelEnterIndexOther", hashMap);
            } else {
                g.b("tbLiveChannelEnterIndexFaXian", hashMap);
            }
            mfk.a("tbLiveChannelEnterIndex", "enterIndex=" + enterIndex);
            this.mLiveHomeContext.C = this.mTabUps.get(enterIndex);
            this.mViewPager.setOffscreenPageLimit(5);
            if (this.mSelectedAdapter == null) {
                mfj.b(TAG, "container first init, topTabs");
                this.mSelectedAdapter = new a(getContext(), getChildFragmentManager(), this.mTabUps, this.mContentId, this.mSubContentId, this.mStartChannelType, this.mQueryParams, this.mLiveHomeContext);
                this.mSelectedAdapter.b(this.mEntryLiveSource);
                this.mSelectedAdapter.a(this.mChannelType);
                this.mSelectedAdapter.a(enterIndex);
                if (enterIndex != 0) {
                    setViewpagerCurrent(enterIndex);
                }
                this.mViewPager.setAdapter(this.mSelectedAdapter);
            } else {
                mfj.b(TAG, "container refresh, topTabs");
                this.mSelectedAdapter.a(this.mTabUps);
                this.mSelectedAdapter.notifyDataSetChanged();
            }
            a aVar = this.mSelectedAdapter;
            LiveHomeViewPager liveHomeViewPager = this.mViewPager;
            this.mCurrentFragment = (Fragment) aVar.instantiateItem((ViewGroup) liveHomeViewPager, liveHomeViewPager.getCurrentItem());
            if (this.mTabLayout != null) {
                this.mColorSwitcher = new com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.b(this.mRootView, getContext(), this.mTabLayout, this.mTabUps, this.mLiveHomeContext);
                this.mTabLayout.setXTabCustomListener(new com.taobao.live.home.widget.tab.g() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeSelectedContainerFragment.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.live.home.widget.tab.g
                    public View a(XTabLayout.d dVar) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (View) ipChange2.ipc$dispatch("e1bb624d", new Object[]{this, dVar}) : HomeSelectedContainerFragment.this.mColorSwitcher.a(dVar.o);
                    }
                });
                this.mTabLayout.setupWithViewPager(this.mViewPager);
                this.mTabLayout.setOnTabSelectedListener(this);
                this.mTabLayout.setOnTabClickListener(this);
                this.mColorSwitcher.a(true);
                if (this.mLiveHomeContext != null) {
                    this.mLiveHomeContext.a(this.mColorSwitcher);
                }
            }
            String str = TAG;
            mfj.b(str, "onTabReady selected top index is " + enterIndex);
            this.mViewPager.setCurrentItem(enterIndex);
            searchShowUT(enterIndex);
            if (com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.TAB_FOLLOW.equals(this.mStartChannelType)) {
                this.mColorSwitcher.a(this.mTabLayout.getTabAt(enterIndex));
            }
            topTabShowUT();
            k.a("CHANGE_TAB", this.mLiveHomeContext);
        }
    }

    private void topTabShowUT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d123f703", new Object[]{this});
            return;
        }
        List<TabManager.TabUp> list = this.mTabUps;
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            TabManager.TabUp tabUp = list.get(i);
            if (tabUp.tabUT != null) {
                g.b(tabUp.tabUT.getString("show"), getUtBaseParams(tabUp.tabUT.getString("spm")));
            }
        }
    }

    private int getEnterIndex(List<TabManager.TabUp> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45000c3b", new Object[]{this, list})).intValue();
        }
        for (int i = 0; i < list.size(); i++) {
            if (mfn.a(this.mStartChannelType, list.get(i).channelType)) {
                return i;
            }
        }
        return 1;
    }

    @Override // tb.mff
    public void onLiveEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d9ef1c", new Object[]{this, str, obj});
        } else if (!mfn.a("com.taobao.taolive.follow.number.changed", str) || !(obj instanceof TabManager.TabUp) || this.mColorSwitcher == null || com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.TAB_FOLLOW.equals(this.mStartChannelType)) {
        } else {
            TabManager.TabUp tabUp = (TabManager.TabUp) obj;
            TabManager.a().a(tabUp);
            this.mColorSwitcher.a(tabUp);
        }
    }

    public int getTabPosition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc67eb2c", new Object[]{this, str})).intValue();
        }
        for (int i = 0; i < this.mTabUps.size(); i++) {
            TabManager.TabUp tabUp = this.mTabUps.get(i);
            if (!l.a((CharSequence) tabUp.channelType) && tabUp.channelType.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.d
    public void switchTab(String str) {
        int tabPosition;
        XTabLayout.d tabAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca3d5792", new Object[]{this, str});
        } else if (this.mTabLayout == null || TextUtils.isEmpty(str) || (tabPosition = getTabPosition(str)) < 0 || tabPosition == this.mTabLayout.getSelectedTabPosition() || (tabAt = this.mTabLayout.getTabAt(tabPosition)) == null || tabAt.h() == null) {
        } else {
            tabAt.h().performClick();
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.b
    public void onHorizontalScrollEnable(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0ab1976", new Object[]{this, jSONObject});
        } else if (jSONObject == null || this.mViewPager == null) {
        } else {
            if ("true".equals(jSONObject.getString(com.taobao.tbpoplayer.nativerender.l.TRIGGER_NAME_SCROLL_STATUS))) {
                this.mViewPager.setCanScroll(true);
            } else {
                this.mViewPager.setCanScroll(false);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 1000) {
            TextBannerView textBannerView = this.mTextBannerView;
            if (textBannerView != null) {
                textBannerView.setCanAnimation(false);
            }
            TextBannerView textBannerView2 = this.mLiveSearchNewHints;
            if (textBannerView2 != null) {
                textBannerView2.setCanAnimation(false);
            }
            requestHotKey();
        }
        return false;
    }

    /* loaded from: classes6.dex */
    public static class a extends FragmentStatePagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private List<TabManager.TabUp> f14201a;
        private String b;
        private String c;
        private String d;
        private String e;
        private Context f;
        private int g;
        private String h;
        private String i;
        private sqt j;

        static {
            kge.a(-1587676448);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getItemPosition(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
            }
            return -2;
        }

        public a(Context context, FragmentManager fragmentManager, List<TabManager.TabUp> list, String str, String str2, String str3, String str4, sqt sqtVar) {
            super(fragmentManager);
            this.f14201a = new ArrayList();
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = context;
            this.j = sqtVar;
            a(list);
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.i = str;
            }
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else {
                this.h = str;
            }
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.g = i;
            }
        }

        public void a(List<TabManager.TabUp> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
                return;
            }
            this.f14201a.clear();
            if (list == null) {
                return;
            }
            this.f14201a.addAll(list);
        }

        public String b(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("da9643a6", new Object[]{this, new Integer(i)}) : (i < 0 || i >= this.f14201a.size()) ? "" : this.f14201a.get(i).channelType;
        }

        public TabManager.TabUp c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TabManager.TabUp) ipChange.ipc$dispatch("10249feb", new Object[]{this, new Integer(i)});
            }
            if (i >= 0 && i < this.f14201a.size()) {
                return this.f14201a.get(i);
            }
            return null;
        }

        private int b(List<TabManager.TabUp> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d39e1ecd", new Object[]{this, list})).intValue();
            }
            for (int i = 0; i < list.size(); i++) {
                if (mfn.a("jingxuan", list.get(i).channelType)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.support.v4.app.FragmentStatePagerAdapter
        public Fragment getItem(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("3c4466d5", new Object[]{this, new Integer(i)});
            }
            if (i < 0 || i >= this.f14201a.size()) {
                return new Fragment();
            }
            if (this.f14201a.get(i) != null) {
                Bundle bundle = new Bundle();
                if (i == this.g) {
                    bundle.putBoolean(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_ENTRY_CHANNELTYPE, true);
                }
                bundle.putString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_ENTRY_BOTTOM_CHANNELTYPE, this.i);
                bundle.putString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_TYPE, this.f14201a.get(i).channelType);
                bundle.putInt(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_ID, this.f14201a.get(i).channelId);
                bundle.putSerializable(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_TAB_TOP, this.f14201a.get(i));
                bundle.putString("entryLiveSource", this.h);
                if (mfn.a(this.f14201a.get(i).channelType, this.d)) {
                    bundle.putString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.START_CONTENT_ID, this.b);
                    bundle.putString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.START_SUB_CONTENT_ID, this.c);
                    bundle.putString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_QUERY_PARAMS, this.e);
                }
                TabManager.TabUp tabUp = this.f14201a.get(i);
                if (tabUp != null) {
                    if (!l.a((CharSequence) tabUp.pageType) && tabUp.pageType.equals(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.TAB_TYPE_SINGLESTREAM)) {
                        bundle.putInt(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_JINGXUAN_POSITION, b(this.f14201a));
                        return HomeTopLivePageFrame.newInstance(bundle, this.j);
                    } else if (mfn.a(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.TAB_FOLLOW, this.f14201a.get(i).channelType)) {
                        return HomeFollowDXFragment.newInstance(bundle, this.j);
                    } else {
                        if (mfn.a("jingxuan", this.f14201a.get(i).channelType)) {
                            return HomeSelectedFragment.newInstance(bundle, this.j);
                        }
                    }
                }
            }
            return new Fragment();
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.f14201a.size();
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void refreshFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5283552", new Object[]{this});
            return;
        }
        LiveHomeViewPager liveHomeViewPager = this.mViewPager;
        if (liveHomeViewPager != null && this.mSelectedAdapter != null) {
            int childCount = liveHomeViewPager.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Fragment fragment = (Fragment) this.mSelectedAdapter.instantiateItem((ViewGroup) this.mViewPager, i);
                if (fragment instanceof HomeSelectedBaseFragment) {
                    ((HomeSelectedBaseFragment) fragment).refreshSelectedFragment();
                }
            }
            switchTabLayoutWidth(this.mViewPager.getCurrentItem());
        }
        updateBigSearchLayoutParams();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        LiveHomeViewPager liveHomeViewPager = this.mViewPager;
        if (liveHomeViewPager == null || this.mSelectedAdapter == null) {
            return;
        }
        Fragment fragment = (Fragment) this.mSelectedAdapter.instantiateItem((ViewGroup) this.mViewPager, liveHomeViewPager.getCurrentItem());
        if (!(fragment instanceof HomeSelectedFragment)) {
            return;
        }
        ((HomeSelectedFragment) fragment).onActivityResult(i, i2, intent);
    }
}
