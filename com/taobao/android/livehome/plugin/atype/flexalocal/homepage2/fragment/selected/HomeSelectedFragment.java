package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.h;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.dinamicx.eventchain.g;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.live.plugin.proxy.livehome.e;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.simple.SimpleQuerySafeResponse;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.i;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.n;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.b;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeSelectedContainerFragment;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.c;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.k;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.l;
import com.taobao.login4android.api.Login;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.a;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.DAICallback;
import com.tmall.android.dai.DAIError;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.esi;
import tb.kge;
import tb.mfe;
import tb.mfi;
import tb.mfj;
import tb.mfn;
import tb.psb;
import tb.sdt;
import tb.sqt;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes6.dex */
public class HomeSelectedFragment extends HomeFollowDXFragment implements Handler.Callback, i.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int HANDLE_DAI = 100;
    private static final String TAG;
    private static final String mInsertCardEventChainName = "faxian_insertCardBackFromLiveRoom";
    private boolean cacheCurrentTabIsBlack;
    private boolean enableNewSearchBar;
    private JSONObject mClickCardInfo;
    private b mColorSwitcher;
    private i mDxUserContext;
    private JSONArray mFeedList;
    private Handler mHandler;
    private boolean mHasNewChannelCommercialCard;
    private boolean mHaveLiveSmart;
    private TUrlImageView mNavBackground;
    private boolean mNewChannelCommercialCardExposure;
    private volatile boolean mTimeout;
    private TUrlImageView mTopAtmosphereFront;
    private FrameLayout mTopAtmosphereLayout;
    private TUrlImageView mTopAtmosphereNext;
    private TUrlImageView mTopBackground;
    private ViewStub mViewStub;
    private int mYOffset;
    private int mMaxYOffset = -1;
    private String mRecyclerUserId = "faxianMainRecycler2024";
    private String mTabPageAppearDxEventChain = "faxian_tabPage_appear";
    private boolean isShowAtmosphereFront = true;
    private String mDefaultBackground = "https://gw.alicdn.com/imgextra/i1/O1CN01D9oU4f1FasYACOdKo_!!6000000000504-2-tps-750-673.png";
    private String mBackGround = "";
    private String mLastImageUrl = "";
    private boolean mSelectColor = true;
    private boolean newChannelBgFailDownload = false;
    private int newChannelBgFailCount = 0;
    private String mNavBackImg = "https://gw.alicdn.com/imgextra/i1/O1CN01BdNaMb1g5jEp4wlAl_!!6000000004091-0-tps-750-192.jpg";
    private BroadcastReceiver mReceiver = new BroadcastReceiver() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedFragment.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || l.a((CharSequence) intent.getAction())) {
            } else {
                try {
                    if (!intent.getAction().equals(d.TAO_LIVE_ROOM_SERVICE_VISITEDLIST)) {
                        return;
                    }
                    HomeSelectedFragment.access$002(HomeSelectedFragment.this, JSONObject.parseArray(intent.getStringExtra("feedList")));
                } catch (Exception e) {
                    String access$100 = HomeSelectedFragment.access$100();
                    mfj.a(access$100, "login receive exp. Action: " + intent.getAction(), e);
                }
            }
        }
    };

    public static /* synthetic */ Object ipc$super(HomeSelectedFragment homeSelectedFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1990827289:
                super.onTabPause();
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
            case -682455317:
                super.forceReload();
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
            case 1474137431:
                super.updateSelectedStatus(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment, com.taobao.live.home.view.BaseLiveRecyclerFragment
    public int getLayoutId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue();
        }
        return -1;
    }

    public static /* synthetic */ JSONArray access$002(HomeSelectedFragment homeSelectedFragment, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("5503ed65", new Object[]{homeSelectedFragment, jSONArray});
        }
        homeSelectedFragment.mFeedList = jSONArray;
        return jSONArray;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]) : TAG;
    }

    public static /* synthetic */ sqt access$1000(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sqt) ipChange.ipc$dispatch("2cf02cb2", new Object[]{homeSelectedFragment}) : homeSelectedFragment.mLiveHomeContext;
    }

    public static /* synthetic */ sqt access$1100(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sqt) ipChange.ipc$dispatch("a3064f11", new Object[]{homeSelectedFragment}) : homeSelectedFragment.mLiveHomeContext;
    }

    public static /* synthetic */ sqt access$1200(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sqt) ipChange.ipc$dispatch("191c7170", new Object[]{homeSelectedFragment}) : homeSelectedFragment.mLiveHomeContext;
    }

    public static /* synthetic */ sqt access$1300(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sqt) ipChange.ipc$dispatch("8f3293cf", new Object[]{homeSelectedFragment}) : homeSelectedFragment.mLiveHomeContext;
    }

    public static /* synthetic */ int access$1400(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("871016f5", new Object[]{homeSelectedFragment})).intValue() : homeSelectedFragment.mMaxYOffset;
    }

    public static /* synthetic */ int access$1402(HomeSelectedFragment homeSelectedFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5571ef2", new Object[]{homeSelectedFragment, new Integer(i)})).intValue();
        }
        homeSelectedFragment.mMaxYOffset = i;
        return i;
    }

    public static /* synthetic */ int access$1500(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("681c5176", new Object[]{homeSelectedFragment})).intValue() : homeSelectedFragment.mYOffset;
    }

    public static /* synthetic */ int access$1502(HomeSelectedFragment homeSelectedFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25d23491", new Object[]{homeSelectedFragment, new Integer(i)})).intValue();
        }
        homeSelectedFragment.mYOffset = i;
        return i;
    }

    public static /* synthetic */ Handler access$1600(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("ba6efc42", new Object[]{homeSelectedFragment}) : homeSelectedFragment.mHandler;
    }

    public static /* synthetic */ boolean access$1700(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2a34c689", new Object[]{homeSelectedFragment})).booleanValue() : homeSelectedFragment.mTimeout;
    }

    public static /* synthetic */ void access$1800(HomeSelectedFragment homeSelectedFragment, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0ff2aa", new Object[]{homeSelectedFragment, jSONObject});
        } else {
            homeSelectedFragment.procNormal(jSONObject);
        }
    }

    public static /* synthetic */ sqt access$200(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sqt) ipChange.ipc$dispatch("8813463f", new Object[]{homeSelectedFragment}) : homeSelectedFragment.mLiveHomeContext;
    }

    public static /* synthetic */ TUrlImageView access$300(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("6c934c2a", new Object[]{homeSelectedFragment}) : homeSelectedFragment.mTopBackground;
    }

    public static /* synthetic */ int access$400(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d82e7d06", new Object[]{homeSelectedFragment})).intValue() : homeSelectedFragment.newChannelBgFailCount;
    }

    public static /* synthetic */ int access$408(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d985b30e", new Object[]{homeSelectedFragment})).intValue();
        }
        int i = homeSelectedFragment.newChannelBgFailCount;
        homeSelectedFragment.newChannelBgFailCount = i + 1;
        return i;
    }

    public static /* synthetic */ String access$500(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d83ad78c", new Object[]{homeSelectedFragment}) : homeSelectedFragment.mBackGround;
    }

    public static /* synthetic */ b access$600(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("afda8e9", new Object[]{homeSelectedFragment}) : homeSelectedFragment.mColorSwitcher;
    }

    public static /* synthetic */ boolean access$702(HomeSelectedFragment homeSelectedFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7976fbc0", new Object[]{homeSelectedFragment, new Boolean(z)})).booleanValue();
        }
        homeSelectedFragment.newChannelBgFailDownload = z;
        return z;
    }

    public static /* synthetic */ sqt access$800(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sqt) ipChange.ipc$dispatch("4c981479", new Object[]{homeSelectedFragment}) : homeSelectedFragment.mLiveHomeContext;
    }

    public static /* synthetic */ sqt access$900(HomeSelectedFragment homeSelectedFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sqt) ipChange.ipc$dispatch("c2ae36d8", new Object[]{homeSelectedFragment}) : homeSelectedFragment.mLiveHomeContext;
    }

    static {
        kge.a(-1083517641);
        kge.a(1674379175);
        kge.a(-1043440182);
        TAG = HomeSelectedFragment.class.getSimpleName();
    }

    public static HomeSelectedFragment newInstance(Bundle bundle, sqt sqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeSelectedFragment) ipChange.ipc$dispatch("a0bbd71c", new Object[]{bundle, sqtVar});
        }
        HomeSelectedFragment homeSelectedFragment = new HomeSelectedFragment();
        homeSelectedFragment.setArguments(bundle);
        homeSelectedFragment.setLiveHomeContext(sqtVar);
        return homeSelectedFragment;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewStub viewStub;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.home_select_follow_fragment_flexalocal, (ViewGroup) null);
        this.mHandler = new Handler(this);
        this.enableNewSearchBar = com.taobao.android.livehome.plugin.atype.flexalocal.utils.i.aa();
        if (inflate != null) {
            this.mContainer = (ViewGroup) inflate.findViewById(R.id.live_home_select_container_dx);
            this.mTopAtmosphereLayout = (FrameLayout) inflate.findViewById(R.id.live_top_atmosphere_layout);
            this.mTopAtmosphereFront = (TUrlImageView) inflate.findViewById(R.id.live_top_atmosphere_front);
            this.mTopAtmosphereNext = (TUrlImageView) inflate.findViewById(R.id.live_top_atmosphere_next);
            this.mTopBackground = (TUrlImageView) inflate.findViewById(R.id.live_top_background);
            this.mTopBackground.setWhenNullClearImg(false);
            if (this.enableNewSearchBar && (viewStub = (ViewStub) inflate.findViewById(R.id.homepage_new_search_bar_stub)) != null) {
                this.mViewStub = viewStub;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewStub.getLayoutParams();
                if (layoutParams != null && this.mLiveHomeContext != null) {
                    layoutParams.topMargin += c.a(this.mActivity, this.mLiveHomeContext.n);
                    if (getContext() != null) {
                        layoutParams.topMargin += getContext().getResources().getDimensionPixelOffset(R.dimen.homepage2024_top_bar_height);
                    }
                }
                viewStub.setLayoutParams(layoutParams);
            }
            this.mNavBackground = (TUrlImageView) inflate.findViewById(R.id.live_top_nav_back);
            this.mNavBackground.setWhenNullClearImg(false);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.mNavBackground.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = Math.max(this.mLiveHomeContext.k, this.mLiveHomeContext.j) + this.mLiveHomeContext.l;
                if (this.enableNewSearchBar && getContext() != null) {
                    layoutParams2.height += this.mLiveHomeContext.H;
                }
            }
            this.mNavBackground.setLayoutParams(layoutParams2);
            this.mNavBackground.setImageUrl(this.mNavBackImg);
        }
        this.mColorSwitcher = getMyParentFragment().mColorSwitcher;
        b bVar = this.mColorSwitcher;
        if (bVar != null) {
            bVar.a(inflate);
            this.mColorSwitcher.a(this.mNavBackground);
        }
        if (c.j()) {
            f.C().createDebugPanel(getContext(), (ViewGroup) inflate, new com.taobao.android.live.plugin.proxy.debugPanel.b() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.live.plugin.proxy.debugPanel.b
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    DinamicXEngine dinamicEngine = HomeSelectedFragment.access$200(HomeSelectedFragment.this).a().getDinamicSdkManager().getDinamicEngine();
                    if (dinamicEngine == null) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("mockUserId", (Object) str);
                    dinamicEngine.a("channel_faxian_update_userId_debug", HomeSelectedFragment.this.mDxRootView, jSONObject, (String) null, (g) null);
                }
            }, false);
        }
        if (this.mReceiver != null) {
            LocalBroadcastManager.getInstance(getContext()).registerReceiver(this.mReceiver, new IntentFilter(d.TAO_LIVE_ROOM_SERVICE_VISITEDLIST));
        }
        return inflate;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment, com.taobao.live.home.view.BaseLiveRecyclerFragment
    public void lazyInitView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb82b62", new Object[]{this, view});
        } else {
            super.lazyInitView(view);
        }
    }

    public View getSearchViewStub() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("afeca9fa", new Object[]{this}) : this.mViewStub;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void refreshCurrentPage() {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6c53d4", new Object[]{this});
            return;
        }
        super.refreshCurrentPage();
        if (com.taobao.android.livehome.plugin.atype.flexalocal.utils.i.J() || (bVar = this.mColorSwitcher) == null || !this.mHasNewChannelCommercialCard || this.newChannelBgFailDownload) {
            return;
        }
        bVar.a(false);
        if (this.mColorSwitcher.i() == null) {
            return;
        }
        this.mColorSwitcher.i().setAlpha(0.0f);
    }

    private void delayWriteImageCache(final JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2cbb452", new Object[]{this, jSONArray});
        } else if (this.mDxRootView == null || jSONArray == null || jSONArray.size() <= 0) {
        } else {
            TLog.loge("TaoLiveHomepage", "delayWriteImageCache start");
            this.mDxRootView.postDelayed(new Runnable() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    DXRecyclerLayout dXRecyclerLayout;
                    JSONArray jSONArray2;
                    DXWidgetNode dXWidgetNode;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        JSONArray jSONArray3 = new JSONArray();
                        DXWidgetNode queryWidgetNodeByUserId = HomeSelectedFragment.this.mDxRootView.getExpandWidgetNode().queryWidgetNodeByUserId(HomeSelectedFragment.this.getRecyclerUserId());
                        if (queryWidgetNodeByUserId instanceof DXRecyclerLayout) {
                            DXRecyclerLayout r = ((DXRecyclerLayout) queryWidgetNodeByUserId).r();
                            int min = Math.min(6, jSONArray.size());
                            if (r != null && r.z() != null && r.z().b() != null && r.z().b().size() > min) {
                                RecyclerView l = r.l();
                                int i = 0;
                                while (i < min) {
                                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                                    if (jSONObject == null || (jSONArray2 = jSONObject.getJSONArray("cardData")) == null || jSONArray2.size() == 0 || l.findViewHolderForAdapterPosition(i) == null || (dXWidgetNode = r.z().b().get(i)) == null) {
                                        dXRecyclerLayout = r;
                                    } else {
                                        String[] split = com.taobao.android.livehome.plugin.atype.flexalocal.utils.i.p().split(",");
                                        int length = split.length;
                                        DXWidgetNode dXWidgetNode2 = null;
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 >= length) {
                                                dXRecyclerLayout = r;
                                                break;
                                            }
                                            String str = split[i2];
                                            if (!l.a((CharSequence) str)) {
                                                dXRecyclerLayout = r;
                                                if (dXWidgetNode.getChildAt(0) != null) {
                                                    dXWidgetNode2 = dXWidgetNode.getChildAt(0).queryWidgetNodeByUserId(str);
                                                }
                                                if (dXWidgetNode2 != null && dXWidgetNode2.getVisibility() == 0) {
                                                    break;
                                                }
                                            } else {
                                                dXRecyclerLayout = r;
                                            }
                                            i2++;
                                            r = dXRecyclerLayout;
                                        }
                                        if (dXWidgetNode2 != null) {
                                            int width = dXWidgetNode2.getWidth();
                                            int height = dXWidgetNode2.getHeight();
                                            String str2 = "";
                                            if (dXWidgetNode2 instanceof DXImageWidgetNode) {
                                                str2 = ((DXImageWidgetNode) dXWidgetNode2).getImageUrl();
                                            } else if (dXWidgetNode2 instanceof com.taobao.taolive.dinamicext.dinamicx.i) {
                                                str2 = ((com.taobao.taolive.dinamicext.dinamicx.i) dXWidgetNode2).b();
                                            } else if (dXWidgetNode2 instanceof n) {
                                                str2 = ((n) dXWidgetNode2).b();
                                            }
                                            if (width > 0 && height > 0 && !l.a((CharSequence) str2)) {
                                                JSONObject jSONObject2 = new JSONObject();
                                                jSONObject2.put("imageUrl", (Object) str2);
                                                jSONObject2.put("width", (Object) Integer.valueOf(width));
                                                jSONObject2.put("height", (Object) Integer.valueOf(height));
                                                jSONArray3.add(jSONObject2);
                                            }
                                        }
                                    }
                                    i++;
                                    r = dXRecyclerLayout;
                                }
                            }
                        }
                        if (HomeSelectedFragment.access$300(HomeSelectedFragment.this) != null && !l.a((CharSequence) HomeSelectedFragment.access$300(HomeSelectedFragment.this).getImageUrl()) && HomeSelectedFragment.access$300(HomeSelectedFragment.this).getVisibility() == 0) {
                            int width2 = HomeSelectedFragment.access$300(HomeSelectedFragment.this).getWidth();
                            int height2 = HomeSelectedFragment.access$300(HomeSelectedFragment.this).getHeight();
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("imageUrl", (Object) HomeSelectedFragment.access$300(HomeSelectedFragment.this).getImageUrl());
                            jSONObject3.put("width", (Object) Integer.valueOf(width2));
                            jSONObject3.put("height", (Object) Integer.valueOf(height2));
                            jSONArray3.add(jSONObject3);
                        }
                        mfi.a(Globals.getApplication(), "jingxuanFirstPageImageSp", JSON.toJSONString(jSONArray3));
                        TLog.loge("TaoLiveHomepage", "delayWriteImageCache success");
                    } catch (Exception unused) {
                        TLog.loge("TaoLiveHomepage", "delayWriteImageCache error");
                    }
                }
            }, 2000L);
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment, tb.mff
    public void onLiveEvent(String str, Object obj) {
        JSONObject jSONObject;
        TUrlImageView tUrlImageView;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d9ef1c", new Object[]{this, str, obj});
        } else if (str.equals(d.LIVE_EVENT_TAOLIVE_FAXIAN_SCROLLOUTERTOTOP)) {
            DXWidgetNode queryWidgetNodeByUserId = this.mDxRootView.getExpandWidgetNode().queryWidgetNodeByUserId(getRecyclerUserId());
            if (!(queryWidgetNodeByUserId instanceof DXRecyclerLayout)) {
                return;
            }
            DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) queryWidgetNodeByUserId;
            if (dXRecyclerLayout.l() == null) {
                return;
            }
            if (this.mMaxYOffset == -1 && (findViewHolderForAdapterPosition = dXRecyclerLayout.l().findViewHolderForAdapterPosition(2)) != null) {
                Rect rect = new Rect();
                findViewHolderForAdapterPosition.itemView.getGlobalVisibleRect(rect);
                this.mMaxYOffset = rect.top - c.a(getContext(), this.allDxFirstRenderData.getInteger("stautsNavHeight").intValue());
            }
            this.mYOffset = this.mMaxYOffset;
            dXRecyclerLayout.a(false, 2);
        } else if (mfn.a("com.taobao.taolive.faxian.first_page", str)) {
            resetOffsetY();
            this.mLastImageUrl = "";
            this.mColorSwitcher.c(false);
            this.mColorSwitcher.d(false);
            if (this.mColorSwitcher == null || !(obj instanceof JSONObject)) {
                return;
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            String string = jSONObject2.getString("type");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
            JSONArray jSONArray = new JSONArray();
            if (jSONObject3 == null || jSONObject3.getJSONObject("data") == null) {
                return;
            }
            boolean X = com.taobao.android.livehome.plugin.atype.flexalocal.utils.i.X();
            JSONArray jSONArray2 = jSONObject3.getJSONObject("data").getJSONArray("cardList");
            if (jSONArray2 != null && jSONArray2.size() == 3) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(0);
                if (jSONObject4 != null) {
                    if (this.enableNewSearchBar) {
                        this.mBackGround = jSONObject4.getString("newBackgroundPicUrl");
                    } else {
                        this.mBackGround = jSONObject4.getString("background");
                    }
                    JSONArray jSONArray3 = jSONObject4.getJSONArray("cardTypes");
                    if (this.mTopAtmosphereLayout != null && (tUrlImageView = this.mTopBackground) != null) {
                        tUrlImageView.setImageUrl("");
                        this.mHasNewChannelCommercialCard = false;
                        if (getContext() != null) {
                            if (this.enableNewSearchBar) {
                                this.mTopBackground.getLayoutParams().height = sdt.a(getContext(), 381.0f);
                                this.mTopAtmosphereLayout.getLayoutParams().height = sdt.a(getContext(), 381.0f);
                            } else {
                                this.mTopBackground.getLayoutParams().height = sdt.a(getContext(), 336.0f);
                                this.mTopAtmosphereLayout.getLayoutParams().height = sdt.a(getContext(), 336.0f);
                            }
                            this.mTopBackground.setTranslationY(0.0f);
                        }
                        if (jSONArray3 != null && jSONArray3.contains("newChannelCommercialCard")) {
                            boolean d = c.d();
                            this.mColorSwitcher.c(true);
                            this.mColorSwitcher.d(true);
                            if (jSONObject4.getJSONArray("cardData") != null && jSONObject4.getJSONArray("cardData").size() > 0) {
                                JSONObject jSONObject5 = jSONObject4.getJSONArray("cardData").getJSONObject(0);
                                if (jSONObject5.getJSONArray("cardData") != null && jSONObject5.getJSONArray("cardData").size() > 0) {
                                    JSONObject jSONObject6 = jSONObject5.getJSONArray("cardData").getJSONObject(0);
                                    if (this.enableNewSearchBar) {
                                        this.mBackGround = jSONObject6.getString("newBackgroundPicUrl");
                                    } else {
                                        this.mBackGround = jSONObject6.getString("backgroundPicUrl");
                                    }
                                    if (!TextUtils.isEmpty(this.mBackGround)) {
                                        this.mTopAtmosphereLayout.setVisibility(8);
                                        this.mTopBackground.setVisibility(0);
                                        if (getContext() != null) {
                                            if (this.enableNewSearchBar) {
                                                this.mTopBackground.getLayoutParams().height = (c.a() * IMediaPlayer.MEDIA_INFO_LIVE_SELECT_SCHEME) / 750;
                                            } else {
                                                this.mTopBackground.getLayoutParams().height = (c.a() * 720) / 750;
                                            }
                                            this.mTopBackground.setTranslationY(Math.min((((-c.a()) * 12) / 750) + (sdt.h(getContext()) != 0 ? sdt.h(getContext()) - 104 : 0), 0));
                                        }
                                        if ((TextUtils.isEmpty(string) || !string.equals("cache")) && !this.mNewChannelCommercialCardExposure) {
                                            this.mNewChannelCommercialCardExposure = true;
                                            JSONObject jSONObject7 = jSONObject6.getJSONObject(d.SHOW_MAIDIAN);
                                            if (jSONObject7 != null) {
                                                com.taobao.android.livehome.plugin.atype.flexalocal.utils.g.b(jSONObject7.getString("name"), jSONObject7.getString("params"));
                                            }
                                        }
                                        this.mHasNewChannelCommercialCard = true;
                                    }
                                    if (!TextUtils.isEmpty(this.mBackGround)) {
                                        if ("true".equals(jSONObject6.getString("isGIF")) && !d) {
                                            this.mTopBackground.setSkipAutoSize(true);
                                        } else {
                                            this.mTopBackground.setSkipAutoSize(false);
                                        }
                                        this.newChannelBgFailDownload = false;
                                        if (com.taobao.android.livehome.plugin.atype.flexalocal.utils.i.S() && X && string.equals("cache") && c.d()) {
                                            this.mTopBackground.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01j32P8U26dmiZXwscZ_!!6000000007685-0-tps-750-720.jpg");
                                        } else {
                                            this.mTopBackground.setImageUrl(this.mBackGround);
                                        }
                                        this.mTopBackground.failListener(new a<FailPhenixEvent>() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedFragment.4
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            @Override // com.taobao.phenix.intf.event.a
                                            public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                                                IpChange ipChange2 = $ipChange;
                                                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                                            }

                                            public boolean a(FailPhenixEvent failPhenixEvent) {
                                                IpChange ipChange2 = $ipChange;
                                                if (ipChange2 instanceof IpChange) {
                                                    return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                                                }
                                                TLog.loge("TaoLiveHomepage", "NewChannelCommercialCard bg download failed");
                                                if (HomeSelectedFragment.access$400(HomeSelectedFragment.this) < 3) {
                                                    HomeSelectedFragment.access$300(HomeSelectedFragment.this).setImageUrl(HomeSelectedFragment.access$500(HomeSelectedFragment.this));
                                                } else {
                                                    HomeSelectedFragment.access$300(HomeSelectedFragment.this).setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01j32P8U26dmiZXwscZ_!!6000000007685-0-tps-750-720.jpg");
                                                    HomeSelectedFragment.access$600(HomeSelectedFragment.this).c(true);
                                                    HomeSelectedFragment.access$600(HomeSelectedFragment.this).d(false);
                                                    HomeSelectedFragment.this.setToolbarColor(true);
                                                    HomeSelectedFragment.access$702(HomeSelectedFragment.this, true);
                                                }
                                                HomeSelectedFragment.access$408(HomeSelectedFragment.this);
                                                return false;
                                            }
                                        });
                                    }
                                }
                            }
                        } else if (jSONArray3 != null && jSONArray3.contains("liveSmartIsLandCard")) {
                            this.mHaveLiveSmart = true;
                            this.mTopAtmosphereLayout.setVisibility(0);
                            this.mTopBackground.setImageUrl(this.mDefaultBackground);
                        } else {
                            this.mHaveLiveSmart = false;
                            this.mTopAtmosphereLayout.setVisibility(8);
                            if (!l.a((CharSequence) this.mBackGround)) {
                                this.mTopBackground.setImageUrl(this.mBackGround);
                                this.mColorSwitcher.c(true);
                            } else {
                                this.mTopBackground.setImageUrl(this.mDefaultBackground);
                            }
                        }
                    }
                    this.mSelectColor = l.a((CharSequence) this.mBackGround);
                    if (this.mSelected) {
                        setToolbarColor(this.mSelectColor);
                    }
                }
                if (!TextUtils.isEmpty(string) && !string.equals("cache") && (jSONObject = jSONArray2.getJSONObject(2)) != null && jSONObject.getJSONArray("cardData") != null && jSONObject.getJSONArray("cardData").size() > 0) {
                    int size = jSONObject.getJSONArray("cardData").size();
                    JSONArray jSONArray4 = jSONObject.getJSONArray("cardData");
                    if (com.taobao.android.livehome.plugin.atype.flexalocal.utils.i.q() && X) {
                        delayWriteImageCache(jSONArray4);
                    }
                    for (int i = 0; i < size && i < 6; i++) {
                        JSONObject jSONObject8 = jSONArray4.getJSONObject(i);
                        if (jSONObject8.getJSONArray("cardData") != null && jSONObject8.getJSONArray("cardData").size() > 0 && jSONObject8.getJSONArray("cardData").getJSONObject(0) != null && jSONObject8.getJSONArray("cardData").getJSONObject(0).getJSONObject("accountInfo") != null) {
                            JSONObject jSONObject9 = jSONObject8.getJSONArray("cardData").getJSONObject(0).getJSONObject("accountInfo");
                            JSONObject jSONObject10 = new JSONObject();
                            jSONObject10.put("accountId", (Object) jSONObject9.getString("accountId"));
                            jSONObject10.put("feedId", (Object) jSONObject9.getString("feedId"));
                            jSONArray.add(jSONObject10);
                        }
                    }
                }
            }
            if (this.mLiveHomeContext != null) {
                this.mLiveHomeContext.a(jSONArray);
            }
            if (string.equals("cache") || !(getParentFragment() instanceof HomeSelectedContainerFragment) || ((HomeSelectedContainerFragment) getParentFragment()).getTabPosition(d.TAB_SINGLELIVE) < 0) {
                return;
            }
            requestTopLiveRecommend(jSONArray);
        } else if (mfn.a(com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.a.EVENT_TAOLIVE_FAXIAN_TOP_MARQUEE_BACKGROUND, str)) {
            FrameLayout frameLayout = this.mTopAtmosphereLayout;
            if (frameLayout != null && frameLayout.getVisibility() == 8 && this.mHasNewChannelCommercialCard) {
                return;
            }
            String str2 = obj instanceof String ? (String) obj : "";
            if (l.a((CharSequence) str2)) {
                str2 = this.mBackGround;
            }
            if (!l.a((CharSequence) str2) && !l.a((CharSequence) this.mLastImageUrl) && this.mLastImageUrl.equals(str2)) {
                return;
            }
            this.mLastImageUrl = str2;
            if (this.mTopAtmosphereFront == null || this.mTopAtmosphereNext == null) {
                return;
            }
            if (!l.a((CharSequence) str2)) {
                this.mColorSwitcher.c(true);
                if (this.isShowAtmosphereFront) {
                    animateTopAtmosphere(this.mTopAtmosphereFront, true, str2);
                    animateTopAtmosphere(this.mTopAtmosphereNext, false, "");
                } else {
                    animateTopAtmosphere(this.mTopAtmosphereNext, true, str2);
                    animateTopAtmosphere(this.mTopAtmosphereFront, false, "");
                }
            } else {
                this.mColorSwitcher.c(false);
                animateTopAtmosphere(this.mTopAtmosphereFront, false, "");
                animateTopAtmosphere(this.mTopAtmosphereNext, false, "");
            }
            this.mSelectColor = l.a((CharSequence) str2);
            if ("jingxuan".equals(this.mChannelType)) {
                getMyParentFragment().setToolbarColor(this.mSelectColor);
            }
            this.isShowAtmosphereFront = !this.isShowAtmosphereFront;
        } else if (mfn.a(d.LIVE_EVENT_TAOLIVE_FAXIAN_INSERTCARD, str) && (obj instanceof JSONObject)) {
            this.mClickCardInfo = (JSONObject) obj;
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment
    public void updateSelectedStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57dd8d57", new Object[]{this, new Boolean(z)});
        } else {
            super.updateSelectedStatus(z);
        }
    }

    private void resetOffsetY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a25ca2de", new Object[]{this});
        } else if (!com.taobao.android.livehome.plugin.atype.flexalocal.utils.i.C() || this.mColorSwitcher == null) {
        } else {
            setYOffset(0);
            b bVar = this.mColorSwitcher;
            bVar.a(800, 0, bVar.h());
        }
    }

    public void setToolbarColor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e1d343", new Object[]{this, new Boolean(z)});
        } else {
            getMyParentFragment().setToolbarColor(z);
        }
    }

    private HomeSelectedContainerFragment getMyParentFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeSelectedContainerFragment) ipChange.ipc$dispatch("aeb4c492", new Object[]{this});
        }
        if (getParentFragment() instanceof HomeSelectedContainerFragment) {
            return (HomeSelectedContainerFragment) getParentFragment();
        }
        return new HomeSelectedContainerFragment();
    }

    private void animateTopAtmosphere(final TUrlImageView tUrlImageView, boolean z, String str) {
        IpChange ipChange = $ipChange;
        final boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eabffdb", new Object[]{this, tUrlImageView, new Boolean(z), str});
            return;
        }
        if (!z || TextUtils.isEmpty(str)) {
            z2 = false;
        }
        if (z2) {
            tUrlImageView.setImageUrl(str);
        }
        tUrlImageView.animate().alpha(z2 ? 1.0f : 0.0f).setDuration(250L).withEndAction(new Runnable() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedFragment.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (z2) {
                } else {
                    tUrlImageView.setImageUrl("");
                }
            }
        }).start();
    }

    private void requestTopLiveRecommend(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("734b8739", new Object[]{this, jSONArray});
        } else {
            new com.taobao.android.livehome.plugin.atype.flexalocal.business.simple.a(new IRemoteBaseListener() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedFragment.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        k.a("requestError", "firstRequest", mtopResponse, HomeSelectedFragment.access$800(HomeSelectedFragment.this));
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else if (HomeSelectedFragment.access$900(HomeSelectedFragment.this) == null || HomeSelectedFragment.access$1000(HomeSelectedFragment.this).d() == null || !(baseOutDo instanceof SimpleQuerySafeResponse)) {
                    } else {
                        HomeSelectedFragment.access$1100(HomeSelectedFragment.this).d().a(((SimpleQuerySafeResponse) baseOutDo).mo2429getData());
                        k.a("RequestSuccess", "firstRequest", mtopResponse, HomeSelectedFragment.access$1200(HomeSelectedFragment.this));
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        k.a("requestError", "firstRequest", mtopResponse, HomeSelectedFragment.access$1300(HomeSelectedFragment.this));
                    }
                }
            }).a(jSONArray, this.mLiveHomeContext);
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment
    public String getRecyclerUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3ebaa97e", new Object[]{this}) : this.mRecyclerUserId;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment
    public String getTabPageAppearDxEventChain() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("26e4135b", new Object[]{this}) : this.mTabPageAppearDxEventChain;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public String getTabName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fbf611af", new Object[]{this}) : TAG;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onTabPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("895662e7", new Object[]{this});
            return;
        }
        super.onTabPause();
        if (this.mDxRootView == null || this.mLiveHomeContext == null || this.mLiveHomeContext.a() == null || this.mLiveHomeContext.a().getDinamicSdkManager() == null) {
            return;
        }
        esi.a(this.mLiveHomeContext.a().getDinamicSdkManager().getDinamicEngine(), "faxian_disaAppear", this.mDxRootView, null);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onTabAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121b4972", new Object[]{this});
            return;
        }
        super.onTabAppear();
        if (TextUtils.equals(this.mChannelType, "jingxuan")) {
            sendJellyMarqueeTabUpdate(true);
        }
        setToolbarColor(this.cacheCurrentTabIsBlack);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment
    public void forceReload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7528eeb", new Object[]{this});
            return;
        }
        super.forceReload();
        setRecyclerViewScrollListener();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onTabDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8c0914", new Object[]{this});
            return;
        }
        super.onTabDisappear();
        if (!TextUtils.equals(this.mChannelType, "jingxuan")) {
            return;
        }
        sendJellyMarqueeTabUpdate(false);
    }

    public void setCacheCurrentTabIsBlack(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ac5534", new Object[]{this, new Boolean(z)});
        } else {
            this.cacheCurrentTabIsBlack = z;
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment
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
            if (this.mLiveHomeContext.z && com.taobao.android.livehome.plugin.atype.flexalocal.utils.i.s()) {
                TLog.loge("TaoLiveHomepage", "HomeSelectedFragment renderDXContainer preCreateDX");
                this.mDxRootView = this.mLiveHomeContext.a().getDinamicSdkManager().preCreateDX(getContext(), this.mTabUp.container.getString("name"), new mfe() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedFragment.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.mfe
                    public void a(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                        } else {
                            HomeSelectedFragment.this.createResult = true;
                        }
                    }

                    @Override // tb.mfe
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            HomeSelectedFragment.this.createResult = false;
                        }
                    }
                });
            } else {
                TLog.loge("TaoLiveHomepage", "HomeSelectedFragment renderDXContainer createDX");
                this.mDxRootView = this.mLiveHomeContext.a().getDinamicSdkManager().createDX(getContext(), this.mTabUp.container.getString("name"), new mfe() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedFragment.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.mfe
                    public void a(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                            return;
                        }
                        HomeSelectedFragment.this.createResult = true;
                        TLog.loge("TaoLiveHomepage", "HomeFollowDXFragment renderDXContainer success");
                    }

                    @Override // tb.mfe
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        HomeSelectedFragment.this.createResult = false;
                        TLog.loge("TaoLiveHomepage", "HomeFollowDXFragment renderDXContainer error");
                    }
                });
            }
            TLog.loge("TaoLiveHomepage", "HomeSelectedFragment renderDXContainer 1");
            if (this.mDxRootView != null) {
                TLog.loge("TaoLiveHomepage", "HomeSelectedFragment renderDXContainer render start");
                this.mDxUserContext = new i();
                this.mDxUserContext.a(this);
                if (this.allDxFirstRenderData.get("stautsNavHeight") instanceof Integer) {
                    this.mDxUserContext.b(this.allDxFirstRenderData.getInteger("stautsNavHeight").intValue());
                }
                if (this.allDxFirstRenderData.get("height") instanceof Float) {
                    this.mDxUserContext.b(this.allDxFirstRenderData.getFloat("height").floatValue());
                }
                if (this.allDxFirstRenderData.get("bottomBarHeight") instanceof Float) {
                    this.mDxUserContext.a(this.allDxFirstRenderData.getFloat("bottomBarHeight").floatValue());
                }
                z = this.mLiveHomeContext.a().getDinamicSdkManager().renderDX(getContext(), this.mDxRootView, this.allDxFirstRenderData, new DXRenderOptions.a().a((ba) this.mDxUserContext).a());
            } else {
                z = false;
            }
            TLog.loge("TaoLiveHomepage", "HomeSelectedFragment renderDXContainer 2");
            if (z) {
                TLog.loge("TaoLiveHomepage", "HomeFollowDXFragment renderFollowDXContainer render success");
                this.mContainer.addView(this.mDxRootView);
                this.mContainer.setVisibility(0);
            }
            TLog.loge("TaoLiveHomepage", "HomeFollowDXFragment renderDXContainer 3");
        }
    }

    private void sendJellyMarqueeTabUpdate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f68065b", new Object[]{this, new Boolean(z)});
        } else if (this.mDxRootView == null || this.mDxRootView.getExpandWidgetNode() == null) {
        } else {
            DXWidgetNode queryWidgetNodeByUserId = this.mDxRootView.getExpandWidgetNode().queryWidgetNodeByUserId(this.mRecyclerUserId);
            if (!(queryWidgetNodeByUserId instanceof DXRecyclerLayout)) {
                return;
            }
            DXWidgetNode queryWidgetNodeByUserId2 = ((DXRecyclerLayout) queryWidgetNodeByUserId).queryWidgetNodeByUserId("live_JellyMarquee");
            if (!(queryWidgetNodeByUserId2 instanceof com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.a)) {
                return;
            }
            DXEvent dXEvent = new DXEvent(20002L);
            HashMap hashMap = new HashMap();
            hashMap.put("isAppear", com.taobao.android.dinamicx.expression.expr_v2.f.a(z));
            dXEvent.setArgs(hashMap);
            queryWidgetNodeByUserId2.postEvent(dXEvent);
        }
    }

    public void setYOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d75df2", new Object[]{this, new Integer(i)});
        } else {
            this.mYOffset = i;
        }
    }

    private void setRecyclerViewScrollListener() {
        final DXRecyclerLayout dXRecyclerLayout;
        RecyclerView l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22eea4e", new Object[]{this});
        } else if (this.mDxRootView == null || this.mDxRootView.getExpandWidgetNode() == null) {
        } else {
            DXWidgetNode queryWidgetNodeByUserId = this.mDxRootView.getExpandWidgetNode().queryWidgetNodeByUserId(this.mRecyclerUserId);
            if (!(queryWidgetNodeByUserId instanceof DXRecyclerLayout) || (l = (dXRecyclerLayout = (DXRecyclerLayout) queryWidgetNodeByUserId).l()) == null) {
                return;
            }
            l.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedFragment.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass9 anonymousClass9, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == 806944192) {
                        super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                        return null;
                    } else if (hashCode != 2142696127) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    } else {
                        super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                        return null;
                    }
                }

                @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    DXWidgetNode queryWidgetNodeByUserId2 = dXRecyclerLayout.queryWidgetNodeByUserId("live_JellyMarquee");
                    if (!(queryWidgetNodeByUserId2 instanceof com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.a)) {
                        return;
                    }
                    DXEvent dXEvent = new DXEvent(20001L);
                    HashMap hashMap = new HashMap();
                    hashMap.put("newState", com.taobao.android.dinamicx.expression.expr_v2.f.a(i));
                    dXEvent.setArgs(hashMap);
                    queryWidgetNodeByUserId2.postEvent(dXEvent);
                }

                @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                        return;
                    }
                    super.onScrolled(recyclerView, i, i2);
                    if (dXRecyclerLayout.l() != null && HomeSelectedFragment.access$1400(HomeSelectedFragment.this) == -1 && (findViewHolderForAdapterPosition = dXRecyclerLayout.l().findViewHolderForAdapterPosition(2)) != null && HomeSelectedFragment.this.allDxFirstRenderData != null) {
                        Rect rect = new Rect();
                        findViewHolderForAdapterPosition.itemView.getGlobalVisibleRect(rect);
                        HomeSelectedFragment.access$1402(HomeSelectedFragment.this, rect.top - c.a(HomeSelectedFragment.this.getContext(), HomeSelectedFragment.this.allDxFirstRenderData.getInteger("stautsNavHeight").intValue()));
                    }
                    HomeSelectedFragment homeSelectedFragment = HomeSelectedFragment.this;
                    HomeSelectedFragment.access$1502(homeSelectedFragment, HomeSelectedFragment.access$1500(homeSelectedFragment) + i2);
                    if (HomeSelectedFragment.access$600(HomeSelectedFragment.this) == null) {
                        return;
                    }
                    HomeSelectedFragment.access$600(HomeSelectedFragment.this).a(800, HomeSelectedFragment.access$1500(HomeSelectedFragment.this), HomeSelectedFragment.access$600(HomeSelectedFragment.this).h());
                }
            });
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.i.a
    public void onPull(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620c3118", new Object[]{this, new Integer(i)});
            return;
        }
        b bVar = this.mColorSwitcher;
        if (bVar == null) {
            return;
        }
        bVar.a(800, i);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onTabStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("503402df", new Object[]{this});
            return;
        }
        super.onTabStop();
        psb.a().a((Object) com.taobao.live.home.c.PLAY_PAGEID, false);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.mReceiver != null) {
            LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(this.mReceiver);
            this.mReceiver = null;
        }
        if (!c.j()) {
            return;
        }
        f.C().destroyDebugPanel(getContext());
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeFollowDXFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment
    public void refreshSelectedFragment() {
        RecyclerView l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aafec08d", new Object[]{this});
        } else if (this.mDxRootView == null) {
        } else {
            JSONObject data = this.mDxRootView.getData();
            DinamicXEngine dinamicEngine = this.mLiveHomeContext.a().getDinamicSdkManager().getDinamicEngine();
            if (dinamicEngine == null || this.mDxRootView.getExpandWidgetNode() == null || getContext() == null) {
                return;
            }
            int a2 = c.a((Activity) getContext());
            if (com.taobao.android.livehome.plugin.atype.flexalocal.utils.i.M()) {
                a2 = c.a((Activity) getContext()) - sdt.f;
            }
            if (data != null) {
                dinamicEngine.a(this.mDxRootView.getExpandWidgetNode(), 0, new DXWidgetRefreshOption.a().a(true).a(1).b(h.a().a(getContext())).c(a2).b(false).a());
            }
            if (!com.taobao.android.livehome.plugin.atype.flexalocal.utils.i.O()) {
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

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (com.taobao.android.livehome.plugin.atype.flexalocal.utils.i.e()) {
            this.mTimeout = false;
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("feedList", (Object) this.mFeedList);
            hashMap.put("tppParam", JSON.toJSONString(jSONObject));
            hashMap.put("sessionId", e.d());
            hashMap.put("userId", Login.getUserId());
            JSONObject jSONObject2 = this.mClickCardInfo;
            if (jSONObject2 != null) {
                hashMap.putAll(jSONObject2);
            }
            DAI.runComputeByAlias("Page_TaoLiveHome#backCard", hashMap, new DAICallback() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedFragment.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.tmall.android.dai.DAICallback
                public void onSuccess(Object... objArr) {
                    Object obj;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f85dc9a6", new Object[]{this, objArr});
                        return;
                    }
                    if (HomeSelectedFragment.access$1600(HomeSelectedFragment.this) != null) {
                        HomeSelectedFragment.access$1600(HomeSelectedFragment.this).removeCallbacksAndMessages(null);
                    }
                    if (HomeSelectedFragment.access$1700(HomeSelectedFragment.this)) {
                        return;
                    }
                    if (objArr != null && objArr.length > 0 && (objArr[0] instanceof HashMap) && (obj = ((Map) objArr[0]).get("result")) != null) {
                        String obj2 = obj.toString();
                        if (!l.a((CharSequence) obj2)) {
                            try {
                                JSONObject parseObject = JSON.parseObject(obj2);
                                if (parseObject.get("content") != null) {
                                    HomeSelectedFragment.access$1800(HomeSelectedFragment.this, parseObject.getJSONObject("content"));
                                    return;
                                }
                            } catch (Exception unused) {
                                TLog.loge(HomeSelectedFragment.access$100(), "json parse.");
                            }
                        }
                    }
                    HomeSelectedFragment.access$1800(HomeSelectedFragment.this, null);
                }

                @Override // com.tmall.android.dai.DAICallback
                public void onError(DAIError dAIError) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("326e086b", new Object[]{this, dAIError});
                        return;
                    }
                    if (HomeSelectedFragment.access$1600(HomeSelectedFragment.this) != null) {
                        HomeSelectedFragment.access$1600(HomeSelectedFragment.this).removeCallbacksAndMessages(null);
                    }
                    HomeSelectedFragment.access$1800(HomeSelectedFragment.this, null);
                }
            });
            Handler handler = this.mHandler;
            if (handler == null) {
                return;
            }
            handler.sendEmptyMessageDelayed(100, com.taobao.android.livehome.plugin.atype.flexalocal.utils.i.L());
            return;
        }
        procNormal(null);
    }

    private void procNormal(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a04c58c", new Object[]{this, jSONObject});
        } else if (this.mDxUserContext == null || this.mClickCardInfo == null || this.mLiveHomeContext == null || this.mLiveHomeContext.a() == null || this.mDxRootView == null) {
        } else {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("feedList", (Object) this.mFeedList);
            jSONObject2.put("tppParam", (Object) JSON.toJSONString(jSONObject3));
            jSONObject2.put("sessionId", (Object) e.d());
            jSONObject2.put("userId", (Object) Login.getUserId());
            jSONObject2.putAll(this.mClickCardInfo);
            if (jSONObject != null) {
                jSONObject2.put("walleResponseInfo", (Object) jSONObject);
            }
            this.mLiveHomeContext.a().getDinamicSdkManager().getDinamicEngine().a(mInsertCardEventChainName, this.mDxRootView, jSONObject2, (String) null, (g) null);
            this.mClickCardInfo = null;
            this.mFeedList = null;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 100) {
            this.mTimeout = true;
            procNormal(null);
        }
        return false;
    }
}
