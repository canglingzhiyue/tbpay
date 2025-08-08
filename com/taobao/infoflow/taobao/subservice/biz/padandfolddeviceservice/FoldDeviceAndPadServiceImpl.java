package com.taobao.infoflow.taobao.subservice.biz.padandfolddeviceservice;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import mtopsdk.common.util.StringUtils;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.WindowType;
import com.taobao.android.autosize.h;
import com.taobao.android.megaadaptivekit.gesture.a;
import com.taobao.android.megaadaptivekit.gesture.c;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.tao.Globals;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.ldf;
import tb.ljs;
import tb.lkc;
import tb.lkq;
import tb.sdl;
import tb.sdm;
import tb.swc;
import tb.tbs;

/* loaded from: classes7.dex */
public class FoldDeviceAndPadServiceImpl implements OnScreenChangedListener, IFoldDeviceAndPadService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_COLUMN_CONFIG = "{\"min\":\"2\",\"small\":\"2\",\"medium\":\"4\",\"large\":\"5\",\"max\":\"5\"}";
    private static final int DEFAULT_INFO_FLOW_COLUMN = 2;
    private static final String KEY_COLUMN_CONFIG = "columnCountConfig";
    private static final String TAG = "FoldDeviceAndPadServiceImpl";
    private Context mActivityContext;
    private JSONObject mColumnConfig;
    private IContainerDataService<?> mContainerDataService;
    private lkq.a mContainerListener;
    private IContainerService<?> mContainerService;
    private IDxItemRenderService mDxRenderService;
    private boolean mEnableInfoFlowScale;
    private IMainFeedsViewService<?> mFeedsViewService;
    private IHostService mHostService;
    private ljs mInfoFlowContext;
    private boolean mIsAdaptHudScreen;
    private boolean mIsHudDevice;
    private boolean mIsScreenPortrait;
    private a mParamsCreator;
    private com.taobao.android.megaadaptivekit.gesture.a mScaleGestureDetector;
    private List<IFoldDeviceAndPadService.a> mScreenChangeLifeCycle = new CopyOnWriteArrayList();
    private IContainerService.a mUiRefreshListener;

    /* renamed from: com.taobao.infoflow.taobao.subservice.biz.padandfolddeviceservice.FoldDeviceAndPadServiceImpl$6  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass6 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17486a = new int[WindowType.values().length];

        static {
            try {
                f17486a[WindowType.MIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17486a[WindowType.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17486a[WindowType.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17486a[WindowType.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17486a[WindowType.MAX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        kge.a(-1460472008);
        kge.a(2044589368);
        kge.a(825059505);
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
        OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
    }

    public static /* synthetic */ boolean access$000(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a5d7f976", new Object[]{foldDeviceAndPadServiceImpl})).booleanValue() : foldDeviceAndPadServiceImpl.mIsScreenPortrait;
    }

    public static /* synthetic */ boolean access$002(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c73e7ea8", new Object[]{foldDeviceAndPadServiceImpl, new Boolean(z)})).booleanValue();
        }
        foldDeviceAndPadServiceImpl.mIsScreenPortrait = z;
        return z;
    }

    public static /* synthetic */ void access$1000(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8211e63", new Object[]{foldDeviceAndPadServiceImpl});
        } else {
            foldDeviceAndPadServiceImpl.setMainFeedsHudScreenStyle();
        }
    }

    public static /* synthetic */ Context access$102(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("998b87d1", new Object[]{foldDeviceAndPadServiceImpl, context});
        }
        foldDeviceAndPadServiceImpl.mActivityContext = context;
        return context;
    }

    public static /* synthetic */ void access$1100(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c07f4302", new Object[]{foldDeviceAndPadServiceImpl});
        } else {
            foldDeviceAndPadServiceImpl.resetMainFeedsStyle();
        }
    }

    public static /* synthetic */ IMainFeedsViewService access$1200(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMainFeedsViewService) ipChange.ipc$dispatch("71d1e8c9", new Object[]{foldDeviceAndPadServiceImpl}) : foldDeviceAndPadServiceImpl.mFeedsViewService;
    }

    public static /* synthetic */ int access$1300(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("513b8c33", new Object[]{foldDeviceAndPadServiceImpl})).intValue() : foldDeviceAndPadServiceImpl.getScaleColumnByScreenType();
    }

    public static /* synthetic */ void access$1400(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1999b0df", new Object[]{foldDeviceAndPadServiceImpl});
        } else {
            foldDeviceAndPadServiceImpl.triggerUiRefresh();
        }
    }

    public static /* synthetic */ com.taobao.android.megaadaptivekit.gesture.a access$1500(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.megaadaptivekit.gesture.a) ipChange.ipc$dispatch("92a30e60", new Object[]{foldDeviceAndPadServiceImpl}) : foldDeviceAndPadServiceImpl.mScaleGestureDetector;
    }

    public static /* synthetic */ IDxItemRenderService access$200(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDxItemRenderService) ipChange.ipc$dispatch("9411777", new Object[]{foldDeviceAndPadServiceImpl}) : foldDeviceAndPadServiceImpl.mDxRenderService;
    }

    public static /* synthetic */ boolean access$300(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fef26753", new Object[]{foldDeviceAndPadServiceImpl})).booleanValue() : foldDeviceAndPadServiceImpl.mIsHudDevice;
    }

    public static /* synthetic */ boolean access$400(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c7508bf2", new Object[]{foldDeviceAndPadServiceImpl})).booleanValue() : foldDeviceAndPadServiceImpl.isLargeScreen();
    }

    public static /* synthetic */ Activity access$500(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("eb46f43b", new Object[]{foldDeviceAndPadServiceImpl}) : foldDeviceAndPadServiceImpl.getActivityContext();
    }

    public static /* synthetic */ void access$600(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33a5a01c", new Object[]{foldDeviceAndPadServiceImpl, context});
        } else {
            foldDeviceAndPadServiceImpl.registerGestureDetectorCallback(context);
        }
    }

    public static /* synthetic */ boolean access$700(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("206af9cf", new Object[]{foldDeviceAndPadServiceImpl})).booleanValue() : foldDeviceAndPadServiceImpl.enableInfoFlowScale();
    }

    public static /* synthetic */ boolean access$800(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e8c91e6e", new Object[]{foldDeviceAndPadServiceImpl})).booleanValue() : foldDeviceAndPadServiceImpl.mIsAdaptHudScreen;
    }

    public static /* synthetic */ boolean access$802(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e271f8b0", new Object[]{foldDeviceAndPadServiceImpl, new Boolean(z)})).booleanValue();
        }
        foldDeviceAndPadServiceImpl.mIsAdaptHudScreen = z;
        return z;
    }

    public static /* synthetic */ boolean access$900(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b127430d", new Object[]{foldDeviceAndPadServiceImpl})).booleanValue() : foldDeviceAndPadServiceImpl.mEnableInfoFlowScale;
    }

    public static /* synthetic */ boolean access$902(FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25d867f1", new Object[]{foldDeviceAndPadServiceImpl, new Boolean(z)})).booleanValue();
        }
        foldDeviceAndPadServiceImpl.mEnableInfoFlowScale = z;
        return z;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mInfoFlowContext = ljsVar;
        this.mContainerDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (!b.b() && !b.a()) {
            z = false;
        }
        this.mIsHudDevice = z;
        this.mContainerService = (IContainerService) ljsVar.a(IContainerService.class);
        this.mHostService = (IHostService) ljsVar.a(IHostService.class);
        this.mFeedsViewService = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        this.mDxRenderService = (IDxItemRenderService) ljsVar.a(IDxItemRenderService.class);
        registerDeviceInfoParamsCreator(ljsVar);
        registerScreenChangedListener();
        registerUiRefreshListener();
        registerContainerListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService
    public int getInfoFlowAdaptiveColumn(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b72c8356", new Object[]{this, context})).intValue();
        }
        if (!isAdaptHudScreen()) {
            return 2;
        }
        if (b.b() && b.b(getActivityContext())) {
            return 2;
        }
        if (this.mEnableInfoFlowScale) {
            return getScaleColumnByScreenType();
        }
        return getColumnByScreenType();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService
    public boolean isAdaptHudScreen() {
        sdm l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11522a16", new Object[]{this})).booleanValue();
        }
        IHostService iHostService = this.mHostService;
        if (iHostService != null && (l = iHostService.getInvokeCallback().l()) != null) {
            return l.a();
        }
        return false;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService
    public void addOnScreenChangeListener(IFoldDeviceAndPadService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb8d7b1", new Object[]{this, aVar});
        } else {
            this.mScreenChangeLifeCycle.add(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService
    public void removeOnScreenChangeListener(IFoldDeviceAndPadService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a8a06d4", new Object[]{this, aVar});
        } else {
            this.mScreenChangeLifeCycle.remove(aVar);
        }
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public void onScreenChanged(int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
        } else if (this.mIsHudDevice) {
            boolean b = b.b(getActivityContext());
            if (!this.mScreenChangeLifeCycle.isEmpty()) {
                for (IFoldDeviceAndPadService.a aVar : this.mScreenChangeLifeCycle) {
                    aVar.onScreenChanged(b, isAdaptHudScreen(), configuration);
                }
            }
            if (this.mIsScreenPortrait != b) {
                this.mIsScreenPortrait = b;
                if (b.a()) {
                    triggerUiRefresh();
                    ldf.d(TAG, "trigger pad ui refresh");
                }
                if (b.b()) {
                    triggerUiRefresh();
                    triggerPullRefreshRequest();
                    ldf.d(TAG, "trigger fold phone data refresh");
                }
            } else {
                triggerUiRefresh();
            }
            ldf.d(TAG, "onScreenChange:  isPortrait: " + b);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unregisterDeviceInfoParamsCreator();
        unRegisterScreenChangedListener();
        unRegisterUiRefreshListener();
        unRegisterContainerListener();
        unRegisterGestureDetectorCallback();
    }

    private void registerScreenChangedListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cad36ea0", new Object[]{this});
        } else {
            h.a().c(this);
        }
    }

    private void unRegisterScreenChangedListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5491d707", new Object[]{this});
        } else {
            h.a().d(this);
        }
    }

    private void registerDeviceInfoParamsCreator(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18f49281", new Object[]{this, ljsVar});
        } else if (this.mContainerDataService == null) {
        } else {
            this.mParamsCreator = new a(ljsVar);
            this.mContainerDataService.addRequestCommonBizParamsCreator(this.mParamsCreator);
        }
    }

    private void unregisterDeviceInfoParamsCreator() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8300ebad", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mContainerDataService;
        if (iContainerDataService == null || (aVar = this.mParamsCreator) == null) {
            return;
        }
        iContainerDataService.removeRequestCommonBizParamsCreator(aVar);
    }

    private void registerContainerListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da2d6b79", new Object[]{this});
        } else if (this.mContainerService == null) {
        } else {
            this.mContainerListener = new lkq.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.padandfolddeviceservice.FoldDeviceAndPadServiceImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.lkq.a
                public void a(Context context) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9e1d6460", new Object[]{this, context});
                        return;
                    }
                    FoldDeviceAndPadServiceImpl.access$002(FoldDeviceAndPadServiceImpl.this, b.b(context));
                    FoldDeviceAndPadServiceImpl.access$102(FoldDeviceAndPadServiceImpl.this, swc.a(context));
                }

                @Override // tb.lkq.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else if (FoldDeviceAndPadServiceImpl.access$200(FoldDeviceAndPadServiceImpl.this) == null || !FoldDeviceAndPadServiceImpl.access$300(FoldDeviceAndPadServiceImpl.this)) {
                    } else {
                        boolean isAdaptHudScreen = FoldDeviceAndPadServiceImpl.this.isAdaptHudScreen();
                        FoldDeviceAndPadServiceImpl.access$200(FoldDeviceAndPadServiceImpl.this).setDxEngineDesignScaleEnable(isAdaptHudScreen, isAdaptHudScreen && FoldDeviceAndPadServiceImpl.access$400(FoldDeviceAndPadServiceImpl.this));
                        ldf.d(FoldDeviceAndPadServiceImpl.TAG, "createContainerEnd setDxEngineDesignScaleEnable: " + isAdaptHudScreen);
                        FoldDeviceAndPadServiceImpl foldDeviceAndPadServiceImpl = FoldDeviceAndPadServiceImpl.this;
                        FoldDeviceAndPadServiceImpl.access$600(foldDeviceAndPadServiceImpl, FoldDeviceAndPadServiceImpl.access$500(foldDeviceAndPadServiceImpl));
                    }
                }
            };
            this.mContainerService.addOnContainerListener(this.mContainerListener);
        }
    }

    private void unRegisterContainerListener() {
        lkq.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c61f60", new Object[]{this});
            return;
        }
        IContainerService<?> iContainerService = this.mContainerService;
        if (iContainerService == null || (aVar = this.mContainerListener) == null) {
            return;
        }
        iContainerService.removeOnContainerListener(aVar);
    }

    private void triggerPullRefreshRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf490b8", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("strategy", (Object) "cancelOther");
        iContainerDataService.triggerEvent("PullToRefresh", jSONObject);
        ldf.d(TAG, "trigger pull refresh request");
    }

    private void triggerUiRefresh() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36c8bd6", new Object[]{this});
            return;
        }
        sdl.a();
        if (this.mDxRenderService != null) {
            boolean isAdaptHudScreen = isAdaptHudScreen();
            IDxItemRenderService iDxItemRenderService = this.mDxRenderService;
            if (!isAdaptHudScreen || !isLargeScreen()) {
                z = false;
            }
            iDxItemRenderService.setDxEngineDesignScaleEnable(isAdaptHudScreen, z);
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mFeedsViewService;
        if (iMainFeedsViewService != null) {
            int[] visiblePositionRange = iMainFeedsViewService.getVisiblePositionRange();
            int i = (visiblePositionRange == null || visiblePositionRange.length <= 0) ? -1 : visiblePositionRange[0];
            this.mFeedsViewService.setInfoFlowColumn(getInfoFlowAdaptiveColumn(Globals.getApplication()));
            this.mFeedsViewService.reloadUi();
            if (i > 0) {
                this.mFeedsViewService.scrollToPosition(i);
            }
        }
        ldf.d(TAG, "trigger ui refresh");
    }

    private void registerUiRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb2e39f", new Object[]{this});
            return;
        }
        this.mUiRefreshListener = createUiRefreshListener();
        this.mContainerService.addUiRefreshListener(this.mUiRefreshListener);
    }

    private IContainerService.a createUiRefreshListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerService.a) ipChange.ipc$dispatch("56effc11", new Object[]{this}) : new IContainerService.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.padandfolddeviceservice.FoldDeviceAndPadServiceImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
            public void b(IUiRefreshActionModel iUiRefreshActionModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2729410f", new Object[]{this, iUiRefreshActionModel});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
            public void a(IUiRefreshActionModel iUiRefreshActionModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4935db30", new Object[]{this, iUiRefreshActionModel});
                } else if (!FoldDeviceAndPadServiceImpl.access$300(FoldDeviceAndPadServiceImpl.this)) {
                } else {
                    boolean access$700 = FoldDeviceAndPadServiceImpl.access$700(FoldDeviceAndPadServiceImpl.this);
                    boolean isAdaptHudScreen = FoldDeviceAndPadServiceImpl.this.isAdaptHudScreen();
                    if (isAdaptHudScreen != FoldDeviceAndPadServiceImpl.access$800(FoldDeviceAndPadServiceImpl.this) || access$700 != FoldDeviceAndPadServiceImpl.access$900(FoldDeviceAndPadServiceImpl.this)) {
                        FoldDeviceAndPadServiceImpl.access$902(FoldDeviceAndPadServiceImpl.this, access$700);
                        if (isAdaptHudScreen) {
                            FoldDeviceAndPadServiceImpl.access$1000(FoldDeviceAndPadServiceImpl.this);
                        } else {
                            FoldDeviceAndPadServiceImpl.access$1100(FoldDeviceAndPadServiceImpl.this);
                        }
                    }
                    FoldDeviceAndPadServiceImpl.access$802(FoldDeviceAndPadServiceImpl.this, isAdaptHudScreen);
                    if (!StringUtils.equals("pullRefresh", iUiRefreshActionModel.getRequestType())) {
                        return;
                    }
                    sdl.a();
                    ldf.d(FoldDeviceAndPadServiceImpl.TAG, "base refresh reset card width cache");
                }
            }
        };
    }

    private Activity getActivityContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("b26b5e57", new Object[]{this});
        }
        Activity activity = null;
        Context context = this.mActivityContext;
        if (context instanceof Activity) {
            activity = (Activity) context;
        }
        if (activity == null || !activity.isDestroyed()) {
            return activity;
        }
        ldf.d(TAG, "activity is destroyed");
        Activity hostActivity = getHostActivity();
        if (hostActivity == null) {
            return activity;
        }
        ldf.d(TAG, "获取到host activity");
        return hostActivity;
    }

    private Activity getHostActivity() {
        lkc i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("be0669d4", new Object[]{this});
        }
        IHostService iHostService = this.mHostService;
        if (iHostService == null || (i = iHostService.getInvokeCallback().i()) == null) {
            return null;
        }
        Context b = i.b();
        if (!(b instanceof Activity)) {
            return null;
        }
        return (Activity) b;
    }

    private void unRegisterUiRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4b9786", new Object[]{this});
            return;
        }
        IContainerService.a aVar = this.mUiRefreshListener;
        if (aVar == null) {
            return;
        }
        this.mContainerService.removeUiRefreshListener(aVar);
    }

    private int getColumnByScreenType() {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d2bf5e3", new Object[]{this})).intValue();
        }
        Activity activityContext = getActivityContext();
        if (activityContext == null) {
            return 2;
        }
        WindowType b = h.a().b(activityContext);
        JSONObject columnConfig = getColumnConfig();
        if (columnConfig == null) {
            return 2;
        }
        int i = AnonymousClass6.f17486a[b.ordinal()];
        if (i == 1) {
            intValue = columnConfig.getIntValue("min");
        } else if (i == 2) {
            intValue = columnConfig.getIntValue("small");
        } else if (i == 3) {
            intValue = columnConfig.getIntValue("medium");
        } else if (i == 4) {
            intValue = columnConfig.getIntValue("large");
        } else {
            intValue = i != 5 ? 2 : columnConfig.getIntValue("max");
        }
        if (intValue < 2) {
            intValue = 2;
        }
        ldf.d(TAG, "getColumnByScreenType: " + intValue);
        return intValue;
    }

    private JSONObject getColumnConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("98f9155", new Object[]{this});
        }
        JSONObject jSONObject = this.mColumnConfig;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            this.mColumnConfig = JSONObject.parseObject(getServerColumnConfig());
            return this.mColumnConfig;
        } catch (Exception unused) {
            ldf.d(TAG, "parse config error");
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    private String getServerColumnConfig() {
        ?? containerData;
        IContainerInnerDataModel base;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17857088", new Object[]{this});
        }
        IContainerDataService<?> iContainerDataService = this.mContainerDataService;
        if (iContainerDataService == null || (containerData = iContainerDataService.getContainerData()) == 0 || (base = containerData.getBase()) == null || (ext = base.getExt()) == null) {
            return DEFAULT_COLUMN_CONFIG;
        }
        String string = ext.getString(KEY_COLUMN_CONFIG);
        return StringUtils.isEmpty(string) ? DEFAULT_COLUMN_CONFIG : string;
    }

    private int getScaleColumnByScreenType() {
        int e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c3633a1", new Object[]{this})).intValue();
        }
        Activity activityContext = getActivityContext();
        if (activityContext == null) {
            return 2;
        }
        WindowType b = h.a().b(activityContext);
        a.C0547a a2 = a.C0547a.a(activityContext);
        if (b.b() && !b.b(activityContext)) {
            return a2.a();
        }
        int i = AnonymousClass6.f17486a[b.ordinal()];
        if (i == 1) {
            e = a2.e();
        } else if (i == 2) {
            e = a2.f();
        } else if (i == 3) {
            e = a2.d();
        } else if (i == 4) {
            e = a2.c();
        } else {
            e = i != 5 ? 2 : a2.b();
        }
        if (e < 2) {
            e = 2;
        }
        ldf.d(TAG, "getScaleColumnByScreenType: " + e);
        return e;
    }

    private void setMainFeedsHudScreenStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f430106f", new Object[]{this});
            return;
        }
        sdl.a();
        IDxItemRenderService iDxItemRenderService = this.mDxRenderService;
        if (iDxItemRenderService != null) {
            iDxItemRenderService.setDxEngineDesignScaleEnable(true, isLargeScreen());
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mFeedsViewService;
        if (iMainFeedsViewService != null) {
            iMainFeedsViewService.setInfoFlowColumn(getInfoFlowAdaptiveColumn(Globals.getApplication()));
        }
        ldf.d(TAG, "setMainFeedsHudScreenStyle");
    }

    private boolean isLargeScreen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("174baa08", new Object[]{this})).booleanValue() : b.a() || (b.b() && !b.b(getActivityContext()));
    }

    private void resetMainFeedsStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b1e86b", new Object[]{this});
            return;
        }
        sdl.a();
        IDxItemRenderService iDxItemRenderService = this.mDxRenderService;
        if (iDxItemRenderService != null) {
            iDxItemRenderService.setDxEngineDesignScaleEnable(false, false);
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mFeedsViewService;
        if (iMainFeedsViewService != null) {
            iMainFeedsViewService.setInfoFlowColumn(2);
        }
        ldf.d(TAG, "resetMainFeedsStyle");
    }

    private void registerGestureDetectorCallback(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("758d3750", new Object[]{this, context});
        } else if (this.mFeedsViewService == null || !this.mIsHudDevice || !(context instanceof Activity)) {
        } else {
            this.mScaleGestureDetector = new com.taobao.android.megaadaptivekit.gesture.a((Activity) context);
            this.mScaleGestureDetector.a(new com.taobao.android.megaadaptivekit.gesture.b() { // from class: com.taobao.infoflow.taobao.subservice.biz.padandfolddeviceservice.FoldDeviceAndPadServiceImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.megaadaptivekit.gesture.b
                public void a(ScaleGestureDetector scaleGestureDetector) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("adc0528a", new Object[]{this, scaleGestureDetector});
                    } else {
                        ldf.d(FoldDeviceAndPadServiceImpl.TAG, "onScale");
                    }
                }

                @Override // com.taobao.android.megaadaptivekit.gesture.b
                public void a(a.C0547a c0547a) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2fe0a1d3", new Object[]{this, c0547a});
                    } else if (!FoldDeviceAndPadServiceImpl.access$700(FoldDeviceAndPadServiceImpl.this)) {
                        ldf.d(FoldDeviceAndPadServiceImpl.TAG, "info flow scale disable");
                    } else {
                        if (FoldDeviceAndPadServiceImpl.access$1300(FoldDeviceAndPadServiceImpl.this) != FoldDeviceAndPadServiceImpl.access$1200(FoldDeviceAndPadServiceImpl.this).getInfoFlowColumn()) {
                            FoldDeviceAndPadServiceImpl.access$1400(FoldDeviceAndPadServiceImpl.this);
                        }
                        ldf.d(FoldDeviceAndPadServiceImpl.TAG, "column config changed: " + c0547a);
                    }
                }
            });
            this.mScaleGestureDetector.a(new c() { // from class: com.taobao.infoflow.taobao.subservice.biz.padandfolddeviceservice.FoldDeviceAndPadServiceImpl.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.megaadaptivekit.gesture.c
                public WindowType a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (WindowType) ipChange2.ipc$dispatch("7f2471e7", new Object[]{this});
                    }
                    Activity access$500 = FoldDeviceAndPadServiceImpl.access$500(FoldDeviceAndPadServiceImpl.this);
                    if (access$500 == null) {
                        return WindowType.MEDIUM;
                    }
                    return h.a().b(access$500);
                }

                @Override // com.taobao.android.megaadaptivekit.gesture.c
                public boolean b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
                    }
                    Activity access$500 = FoldDeviceAndPadServiceImpl.access$500(FoldDeviceAndPadServiceImpl.this);
                    return b.b() && access$500 != null && !h.a().b((Context) access$500);
                }
            });
            this.mFeedsViewService.setGestureDetectorCallback(new tbs() { // from class: com.taobao.infoflow.taobao.subservice.biz.padandfolddeviceservice.FoldDeviceAndPadServiceImpl.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.tbs
                public void a(MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
                    } else if (!FoldDeviceAndPadServiceImpl.access$800(FoldDeviceAndPadServiceImpl.this)) {
                    } else {
                        if ((b.b() && FoldDeviceAndPadServiceImpl.access$000(FoldDeviceAndPadServiceImpl.this)) || !FoldDeviceAndPadServiceImpl.access$900(FoldDeviceAndPadServiceImpl.this)) {
                            return;
                        }
                        FoldDeviceAndPadServiceImpl.access$1500(FoldDeviceAndPadServiceImpl.this).a(motionEvent);
                    }
                }
            });
            ldf.d(TAG, "register scale gesture detector");
        }
    }

    private void unRegisterGestureDetectorCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e40c961f", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mFeedsViewService;
        if (iMainFeedsViewService != null) {
            iMainFeedsViewService.setGestureDetectorCallback(null);
        }
        com.taobao.android.megaadaptivekit.gesture.a aVar = this.mScaleGestureDetector;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    private boolean enableInfoFlowScale() {
        sdm l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b9831f6", new Object[]{this})).booleanValue();
        }
        IHostService iHostService = this.mHostService;
        if (iHostService != null && (l = iHostService.getInvokeCallback().l()) != null) {
            return l.b();
        }
        return false;
    }
}
