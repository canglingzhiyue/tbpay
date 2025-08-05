package com.taobao.android.fluid.framework.hostcontainer.pageinterface.page;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.core.h;
import com.taobao.android.fluid.framework.back.IBackEventService;
import com.taobao.android.fluid.framework.c;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.android.layoutmanager.container.MultiPageContainerActivity;
import com.taobao.android.layoutmanager.container.containerlifecycle.GestureLayout;
import com.taobao.android.nav.Nav;
import com.taobao.tao.flexbox.layoutmanager.container.e;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import com.taobao.tao.flexbox.layoutmanager.container.n;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.ut.mini.UTAnalytics;
import com.ut.mini.l;
import java.util.Map;
import tb.kge;
import tb.obw;
import tb.oeb;
import tb.oec;
import tb.oga;
import tb.ogb;
import tb.oha;
import tb.ohd;
import tb.sij;
import tb.soi;
import tb.son;
import tb.spz;

/* loaded from: classes5.dex */
public class FullPage extends f implements ogb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ALPHA = 255;
    private static final String BACK_TAB = "back2Tab2";
    private static final String BACK_URL = "backUrl";
    public static final String DEFAULT_URL = "https://h5.m.taobao.com/guangguang/index.htm?tabid=video&extParams=%7B%22sceneSource%22%3A%22taobao-growthcollection%22%7D";
    public static final String IS_DYNAMIC_MODE = "isDynamicMode";
    private static final String PAGE_VIDEO_INTERACT = "Page_videointeract";
    public static final String PARAM_BACK2Tab2URL = "backUrl";
    public static final String PRE_PLAYER_MAP_KEY = "prePlayerMapKey";
    public static final String SHORT_VIDEO_ENABLE_BACK_TO_URL = "ShortVideo.enableBackToUrl";
    public static final String SOURCE = "source";
    public static final int STATUS_BAR_COLOR = -16777216;
    private final boolean isFromSecPage;
    private IBackEventService mBackEventService;
    private IContainerService mContainerService;
    private View mContentView;
    private final Context mContext;
    private GestureLayout mDecorView;
    private FluidInstance mFluidInstance;
    private boolean mHasSelfTransitionExecuted;
    private final boolean mHasShareElement;
    private boolean mIsFinishing;
    private final boolean mIsNeedTransferAnimation;
    private final boolean mIsTransparent;
    private IMediaService mMediaService;
    private final e mPageContainer;
    private final Activity mUTActivity;
    private final Uri mUri;
    private int mLastOption = -1;
    private int mLastStatusBarColor = -1;
    private boolean mIsFromSlidingFinish = false;

    static {
        kge.a(-665849766);
        kge.a(-1007722434);
    }

    private void initAdapter(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("740ca162", new Object[]{this, context});
        }
    }

    public static /* synthetic */ Object ipc$super(FullPage fullPage, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public boolean isFullPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2c98193", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void postponedEnterTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef076e6", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void setNavigationBarColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56e885d6", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void setStatusBarColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e14207b8", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        }
    }

    @Override // tb.ogb
    public void slideSecondPage(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f686d561", new Object[]{this, obj, str});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void startPostponedEnterTransition(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8977076a", new Object[]{this, view});
        }
    }

    public static /* synthetic */ Context access$000(FullPage fullPage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("bb34b604", new Object[]{fullPage}) : fullPage.mContext;
    }

    public FullPage(Context context, e eVar, String str, boolean z, boolean z2) {
        boolean z3 = false;
        this.mContext = context;
        this.url = str;
        this.mUri = Uri.parse(str);
        this.mPageContainer = eVar;
        this.mIsTransparent = z;
        this.mHasShareElement = z2;
        this.isFromSecPage = oec.a((Object) this.mUri.getQueryParameter(IS_DYNAMIC_MODE), false);
        if (a.a() && z) {
            z3 = true;
        }
        this.mIsNeedTransferAnimation = z3;
        this.mUTActivity = new Activity();
        initAdapter(context);
        mixOnCreate();
    }

    @Override // tb.ogb
    public oga<?> findSecPageWrapper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oga) ipChange.ipc$dispatch("b2df2c2a", new Object[]{this}) : this.mDecorView.mSecPageWrapper;
    }

    @Override // tb.ogb
    public void onPageSelected(int i) {
        FluidInstance fluidInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        } else if (i != 1) {
            if (i != 0 || (fluidInstance = this.mFluidInstance) == null) {
                return;
            }
            fluidInstance.onCreate();
            this.mFluidInstance.onResume();
        } else {
            FluidInstance fluidInstance2 = this.mFluidInstance;
            if (fluidInstance2 == null) {
                return;
            }
            fluidInstance2.onPause();
            this.mFluidInstance.onStop();
            b.b(this.mFluidInstance);
        }
    }

    @Override // tb.ogb
    public Pair<Boolean, Pair<Boolean, aa>> supportSecondPage(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("e6be4178", new Object[]{this, motionEvent});
        }
        if (com.taobao.android.layoutmanager.container.secondpage.biz.a.a(this).a() == null) {
            z = false;
        }
        return new Pair<>(Boolean.valueOf(z), null);
    }

    public <T extends View> T findViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)});
        }
        View view = this.mContentView;
        if (view == null) {
            return (T) ((Activity) this.mContext).findViewById(i);
        }
        return (T) view.findViewById(i);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public e getPageContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("95b48c34", new Object[]{this}) : this.mPageContainer;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this}) : (Activity) this.mContext;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        mixOnStart();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        mixOnResume();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        mixOnPause();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        mixOnStop();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        mixOnDestroy();
        if (!this.isFromSecPage && !this.transition.a(getActivity()) && !this.mIsFromSlidingFinish && this.mIsTransparent) {
            oha.a(getActivity(), 200L, 1.0f, 0.0f).start();
        }
        resetStatusBar(getActivity());
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public View getDecorView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6d69b8fd", new Object[]{this}) : this.mDecorView;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public View getContentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ce219891", new Object[]{this}) : this.mContainerService.getContentView();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void setIsFinishing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b09d5aa", new Object[]{this});
        } else {
            this.mIsFinishing = true;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public boolean isFinishing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1fd16a70", new Object[]{this})).booleanValue() : this.mIsFinishing;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void finish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d82167a", new Object[]{this, new Boolean(z)});
        } else {
            getPageContainer().a(this, z);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public boolean onBackPressed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d542d5", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z && !oga.a(this)) {
            if (!tryToInterceptBack()) {
                return this.mDecorView.performCloseAnimation();
            }
            return true;
        }
        return oga.a((Context) null, this);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void onBackButtonClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767cf6b7", new Object[]{this});
        } else if (tryToInterceptBack() || this.mDecorView.performCloseAnimation()) {
        } else {
            finish(true);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.mMediaService.resumeCurrentVideo();
        } else {
            ((IMediaService) this.mFluidInstance.getService(IMediaService.class)).pauseCurrentVideo();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public Object getUTObject() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("dbe25f7", new Object[]{this}) : this.mUTActivity;
    }

    @Override // tb.oha.a
    public void onBack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9fc8977", new Object[]{this, str});
        } else if (!oha.a(str)) {
        } else {
            oha.a(getActivity(), 200L, 0.32f, 1.0f).start();
        }
    }

    @Override // tb.oha.a
    public void onFinish(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("968e7fbd", new Object[]{this, str, new Float(f)});
            return;
        }
        this.mIsFromSlidingFinish = true;
        if (this.isFromSecPage) {
            return;
        }
        if (oha.a(str)) {
            oha.a(getActivity(), (int) (f * 82.0f));
        } else {
            oha.a(getActivity(), 200L, 1.0f, 0.0f).start();
        }
    }

    @Override // tb.oha.a
    public void onMove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2feb54e1", new Object[]{this, str});
        } else if (!oha.a(str)) {
        } else {
            oha.a(getActivity(), 82);
        }
    }

    public void setSelfTransitionExecuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585e0efb", new Object[]{this, new Boolean(z)});
        } else {
            this.mHasSelfTransitionExecuted = z;
        }
    }

    private void back2OrangeUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc731fd", new Object[]{this});
            return;
        }
        Uri uri = this.mUri;
        if (uri == null || !oec.a((Object) uri.getQueryParameter(BACK_TAB), false) || !(this.mContext instanceof MultiPageContainerActivity)) {
            return;
        }
        final String a2 = oeb.a("ShortVideo.videoBackUrl", DEFAULT_URL);
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        ((MultiPageContainerActivity) this.mContext).a(new Runnable() { // from class: com.taobao.android.fluid.framework.hostcontainer.pageinterface.page.FullPage.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    Nav.from(FullPage.access$000(FullPage.this)).toUri(a2);
                }
            }
        });
    }

    private boolean back2SpecificUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2632b13d", new Object[]{this})).booleanValue();
        }
        Uri uri = this.mUri;
        if (uri != null) {
            final String queryParameter = uri.getQueryParameter("backUrl");
            if (enableBackToUrl() && !TextUtils.isEmpty(queryParameter)) {
                Context context = this.mContext;
                if (context instanceof MultiPageContainerActivity) {
                    ((MultiPageContainerActivity) context).a(new Runnable() { // from class: com.taobao.android.fluid.framework.hostcontainer.pageinterface.page.FullPage.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                Nav.from(FullPage.access$000(FullPage.this)).toUri(queryParameter);
                            }
                        }
                    });
                }
                return true;
            }
        }
        return false;
    }

    private void createFluidInstance(String str, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be99b2c0", new Object[]{this, str, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        this.mFluidInstance = FluidSDK.createFluidInstance(FluidInstanceConfig.a.a().a(this.mContext).a(this).a(new FrameLayout(this.mContext)).a(new h() { // from class: com.taobao.android.fluid.framework.hostcontainer.pageinterface.page.FullPage.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.core.h
            public void a(Map map, Map map2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a0efabc8", new Object[]{this, map, map2});
                } else if (map == null) {
                } else {
                    if (!son.i()) {
                        map2 = map;
                    }
                    if (map2 != null) {
                        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(FullPage.this.getUTObject(), map2);
                    }
                    FullPage.this.setFirstPageName("Page_videointeract");
                    FullPage.this.setFirstPageProperty(map);
                }
            }
        }).c("default").b(FluidInstanceConfig.appendBizName("default")).a(this.url, this.mUri).g(obw.f31903a).g((Boolean) true).f(str).f(Boolean.valueOf(this.mIsNeedTransferAnimation)).e(Integer.valueOf(i)).d(Integer.valueOf(i2)).c((Boolean) true).b(Boolean.valueOf(this.isFromSecPage)).d(Boolean.valueOf(z)).a(new c()).b());
        this.mFluidInstance.onCreate();
        this.mMediaService = (IMediaService) this.mFluidInstance.getService(IMediaService.class);
        this.mContainerService = (IContainerService) this.mFluidInstance.getService(IContainerService.class);
        this.mBackEventService = (IBackEventService) this.mFluidInstance.getService(IBackEventService.class);
        this.mContainerService.renderContainerOnCreate(this.mContext);
        ((IQuickOpenService) this.mFluidInstance.getService(IQuickOpenService.class)).setUsePreSize(soi.a(this.mUri));
    }

    private boolean enableBackToUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab805995", new Object[]{this})).booleanValue() : oeb.a(SHORT_VIDEO_ENABLE_BACK_TO_URL, true);
    }

    private String findSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee119c45", new Object[]{this});
        }
        Uri uri = this.mUri;
        if (uri != null) {
            return uri.getQueryParameter("source");
        }
        return null;
    }

    private void handleBackUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9eedc47", new Object[]{this});
        } else if (back2SpecificUrl()) {
        } else {
            back2OrangeUrl();
        }
    }

    private boolean isInSecondPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1c72dfd", new Object[]{this})).booleanValue();
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        return findSecPageWrapper != null && findSecPageWrapper.k();
    }

    private boolean isSecondPageEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("caf6065b", new Object[]{this})).booleanValue() : a.b() && a.a(findSource());
    }

    private void mixOnCreate() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d641f73e", new Object[]{this});
        } else if (this.mUri == null) {
            finish(false);
        } else {
            GestureLayout gestureLayout = new GestureLayout(this.mContext);
            this.mDecorView = gestureLayout;
            String queryParameter = this.mUri.getQueryParameter(PRE_PLAYER_MAP_KEY);
            Pair<Integer, Integer> b = soi.b(this.mUri);
            int intValue = ((Integer) b.first).intValue();
            int intValue2 = ((Integer) b.second).intValue();
            boolean transparentStatusBar = this.mIsTransparent ? setTransparentStatusBar(getActivity()) : false;
            Activity activity = getActivity();
            Uri uri = this.mUri;
            this.transition = n.a(activity, uri, uri, null, this.mHasShareElement);
            createFluidInstance(queryParameter, intValue, intValue2, transparentStatusBar);
            this.mContentView = findViewById(16908290);
            if (this.mIsTransparent) {
                this.mContainerService.getContentView().setPadding(0, ohd.h(this.mContext), 0, 0);
            } else {
                gestureLayout.setPadding(0, ohd.h(this.mContext), 0, 0);
            }
            boolean orangeBooleanConfig = FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("tnode.enableFixTransition", true);
            n nVar = this.transition;
            if (!this.mHasShareElement && (!orangeBooleanConfig || !this.mHasSelfTransitionExecuted)) {
                z = false;
            }
            processTransition(nVar, z);
            processContainer(gestureLayout, this.transition);
            gestureLayout.setContentView(this.mContainerService.getContentView());
            this.mBackEventService.setBackInterceptListener(gestureLayout);
            if (!transparentStatusBar && Build.VERSION.SDK_INT >= 21) {
                getActivity().getWindow().setStatusBarColor(-16777216);
            }
            if (!this.isFromSecPage && this.mIsNeedTransferAnimation) {
                return;
            }
            oha.a(getActivity(), 255);
        }
    }

    private void mixOnDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c02df26", new Object[]{this});
            return;
        }
        FluidInstance fluidInstance = this.mFluidInstance;
        if (fluidInstance != null) {
            fluidInstance.cI_();
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper != null) {
            findSecPageWrapper.o();
        }
        l.getInstance().pageDestroyed(this.mUTActivity);
        handleBackUrl();
    }

    private void mixOnPause() {
        FluidInstance fluidInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d63ac62", new Object[]{this});
            return;
        }
        boolean isInSecondPage = isInSecondPage();
        if ((!sij.c() || !isInSecondPage) && (fluidInstance = this.mFluidInstance) != null) {
            fluidInstance.onPause();
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(getUTObject());
        if (!isInSecondPage) {
            return;
        }
        findSecPageWrapper().n();
    }

    private void mixOnResume() {
        FluidInstance fluidInstance;
        Map<String, String> pageUTProperties;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63711def", new Object[]{this});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageAppear(getUTObject());
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(getUTObject(), "Page_videointeract");
        FluidInstance fluidInstance2 = this.mFluidInstance;
        if (fluidInstance2 != null && (pageUTProperties = ((ITrackService) fluidInstance2.getService(ITrackService.class)).getPageUTProperties()) != null) {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getUTObject(), pageUTProperties);
        }
        boolean isInSecondPage = isInSecondPage();
        if ((!sij.c() || !isInSecondPage) && (fluidInstance = this.mFluidInstance) != null) {
            fluidInstance.onResume();
        }
        if (isInSecondPage) {
            findSecPageWrapper().m();
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageUrl(getUTObject(), this.mUri);
        requestPopLayer();
    }

    private void mixOnStart() {
        FluidInstance fluidInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d0934ce", new Object[]{this});
        } else if ((sij.c() && isInSecondPage()) || (fluidInstance = this.mFluidInstance) == null) {
        } else {
            fluidInstance.onStart();
        }
    }

    private void mixOnStop() {
        FluidInstance fluidInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea1e04", new Object[]{this});
            return;
        }
        boolean isInSecondPage = isInSecondPage();
        if ((sij.c() && isInSecondPage) || (fluidInstance = this.mFluidInstance) == null) {
            return;
        }
        fluidInstance.onStop();
    }

    private void processContainer(GestureLayout gestureLayout, n nVar) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fdd2cc6", new Object[]{this, gestureLayout, nVar});
            return;
        }
        boolean a2 = nVar.a();
        if (!a2 && this.mIsTransparent) {
            a2 = true;
        }
        boolean b = nVar.b();
        if (nVar.a(getActivity())) {
            int i2 = 4;
            if (isSecondPageEnable()) {
                i2 = 12;
            }
            gestureLayout.setGestureSupportType(this, i2);
        } else if (a2) {
            if (isSecondPageEnable()) {
                i = 9;
            }
            gestureLayout.setGestureSupportType(this, i);
        } else if (!b) {
        } else {
            gestureLayout.setGestureSupportType(this, 2);
        }
    }

    private void processTransition(n nVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11fc6a31", new Object[]{this, nVar, new Boolean(z)});
        } else if (z) {
        } else {
            startNormalTransition(nVar);
        }
    }

    private void requestPopLayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be9daa36", new Object[]{this});
            return;
        }
        Intent intent = new Intent(PopLayer.ACTION_FRAGMENT_SWITCH);
        intent.putExtra(PopLayer.EXTRA_KEY_FRAGMENT_NAME, "FullPage");
        intent.putExtra(PopLayer.EXTRA_KEY_FRAGMENT_PARAM, this.url);
        LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(intent);
    }

    private void resetStatusBar(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44a2f44b", new Object[]{this, activity});
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 21 || this.mLastOption < 0 || this.mLastStatusBarColor < 0) {
                return;
            }
            activity.getWindow().getDecorView().setSystemUiVisibility(this.mLastOption);
            activity.getWindow().setStatusBarColor(this.mLastStatusBarColor);
        } catch (Exception e) {
            spz.a("FullPage", "setTransparentStatusBar", e);
        }
    }

    private boolean setTransparentStatusBar(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf3c0a6e", new Object[]{this, activity})).booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                View decorView = activity.getWindow().getDecorView();
                this.mLastOption = decorView.getSystemUiVisibility();
                decorView.setSystemUiVisibility(1024);
                this.mLastStatusBarColor = activity.getWindow().getStatusBarColor();
                activity.getWindow().setStatusBarColor(0);
                return true;
            }
        } catch (Exception e) {
            spz.a("FullPage", "setTransparentStatusBar", e);
        }
        return false;
    }

    private boolean tryToInterceptBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("404f5de", new Object[]{this})).booleanValue();
        }
        FluidInstance fluidInstance = this.mFluidInstance;
        if (fluidInstance == null) {
            return false;
        }
        return ((IBackEventService) fluidInstance.getService(IBackEventService.class)).tryToInterceptBack();
    }

    @Override // tb.ogc
    public void setFirstPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76692fd9", new Object[]{this, str});
            return;
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper == null) {
            return;
        }
        findSecPageWrapper.setFirstPageName(str);
    }

    @Override // tb.ogc
    public void setFirstPageProperty(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48f12cc", new Object[]{this, map});
            return;
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper == null) {
            return;
        }
        findSecPageWrapper.setFirstPageProperty(map);
    }

    @Override // tb.ogc
    public String getFirstPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("232786a5", new Object[]{this});
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper == null) {
            return null;
        }
        return findSecPageWrapper.getFirstPageName();
    }

    @Override // tb.ogc
    public Map getFirstPageProperty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8efdfe9a", new Object[]{this});
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper == null) {
            return null;
        }
        return findSecPageWrapper.getFirstPageProperty();
    }

    @Override // tb.ogc
    public void setSecondPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e7e79e1", new Object[]{this, str});
            return;
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper == null) {
            return;
        }
        findSecPageWrapper.setSecondPageName(str);
    }

    @Override // tb.ogc
    public void setSecondPageProperty(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2309c4", new Object[]{this, map});
            return;
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper == null) {
            return;
        }
        findSecPageWrapper.setSecondPageProperty(map);
    }

    @Override // tb.ogc
    public String getSecondPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19bb6e35", new Object[]{this});
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper == null) {
            return null;
        }
        return findSecPageWrapper.getSecondPageName();
    }

    @Override // tb.ogc
    public Map getSecondPageProperty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6ae7090a", new Object[]{this});
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper == null) {
            return null;
        }
        return findSecPageWrapper.getSecondPageProperty();
    }

    @Override // tb.ogc
    public void setSecondPageUTObject(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9039d46", new Object[]{this, obj});
            return;
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper == null) {
            return;
        }
        findSecPageWrapper.setSecondPageUTObject(obj);
    }

    @Override // tb.ogc
    public Object getSecondPageUTObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e1f89714", new Object[]{this});
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper == null) {
            return null;
        }
        return findSecPageWrapper.getSecondPageUTObject();
    }
}
