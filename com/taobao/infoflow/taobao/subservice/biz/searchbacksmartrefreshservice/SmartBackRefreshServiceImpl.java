package com.taobao.infoflow.taobao.subservice.biz.searchbacksmartrefreshservice;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.global.setting.util.e;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.request.a;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IFirstScreenDataService;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.tao.Globals;
import java.util.Map;
import tb.bxp;
import tb.kge;
import tb.ldf;
import tb.liy;
import tb.ljd;
import tb.lje;
import tb.ljs;
import tb.lko;
import tb.lks;
import tb.llb;
import tb.lli;
import tb.tin;
import tb.xnm;

/* loaded from: classes7.dex */
public class SmartBackRefreshServiceImpl implements ISmartBackRefreshService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_HOME_GLOBAL_AB_TEST = "homeGlobalABTest";
    private static final int MIN_SCROLL_THRESHOLD = 10;
    private static final String OUT_LINK_ENABLE_TAG = "mEnableOutLinkBackRefresh";
    private static final int STATUS_BX_REQUEST = 0;
    private static final int STATUS_INVALID_REQUEST = -1;
    private static final int STATUS_NOT_BX_REQUEST = 1;
    private static final String TAG = "SmartBackRefreshServiceImpl";
    private lks.c feedsScrollListener;
    private lko mAppLifeCycle;
    private String mBizCode;
    private IContainerDataService<?> mContainerDataService;
    private IMainFeedsViewService<?> mFeedsViewService;
    private ljs mInfoFlowContext;
    private IContainerDataService.b mOnRequestListener;
    private llb mPageLifeCycle;
    private IContainerDataService.c mRequestBizParamsCreator;
    private IContainerDataService.d mRequestCommonBizParamsCreator;
    private tin mSmartBackRefresher;
    private IMainFeedsLoopStartStopService.a mStartAndStopListener;
    private boolean mEnableSearchClickCheck = false;
    private boolean mEnableIpvBackRefresh = false;
    private boolean isDirectClickIntoPages = false;
    private boolean isDirectClickIntoPagesForCommon = false;
    private boolean needBaseRefresh = false;
    private boolean isComebackFront = false;
    public boolean mEnableSearchBaseRefreshNew = false;
    public boolean mEnableIpvBaseRefreshNew = false;
    public boolean mEnableSearchClickRefreshNew = false;
    public boolean mEnableNormalBaseRefresh = false;
    private boolean mEnableOutLinkBackRefresh = false;
    public boolean mIsOutLinkBackRefresh = false;
    private boolean mHasBeenRequestWithBxFeature = false;
    private int scrollBeforeStatus = -1;
    private boolean isStartScroll = false;
    private boolean hasBeenUpload = false;

    static {
        kge.a(1809213338);
        kge.a(-1385816160);
    }

    public static /* synthetic */ tin access$000(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tin) ipChange.ipc$dispatch("ffc2cabd", new Object[]{smartBackRefreshServiceImpl}) : smartBackRefreshServiceImpl.mSmartBackRefresher;
    }

    public static /* synthetic */ int access$100(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("efc355a2", new Object[]{smartBackRefreshServiceImpl})).intValue() : smartBackRefreshServiceImpl.scrollBeforeStatus;
    }

    public static /* synthetic */ boolean access$1000(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2d5085", new Object[]{smartBackRefreshServiceImpl})).booleanValue() : smartBackRefreshServiceImpl.mHasBeenRequestWithBxFeature;
    }

    public static /* synthetic */ int access$102(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88fda0a9", new Object[]{smartBackRefreshServiceImpl, new Integer(i)})).intValue();
        }
        smartBackRefreshServiceImpl.scrollBeforeStatus = i;
        return i;
    }

    public static /* synthetic */ boolean access$1100(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d45f41e4", new Object[]{smartBackRefreshServiceImpl})).booleanValue() : smartBackRefreshServiceImpl.isIpvFeatureExist();
    }

    public static /* synthetic */ void access$1200(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9991333f", new Object[]{smartBackRefreshServiceImpl});
        } else {
            smartBackRefreshServiceImpl.triggerPageBackEvent();
        }
    }

    public static /* synthetic */ boolean access$1300(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5ec324a2", new Object[]{smartBackRefreshServiceImpl})).booleanValue() : smartBackRefreshServiceImpl.mEnableOutLinkBackRefresh;
    }

    public static /* synthetic */ boolean access$200(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b4f54712", new Object[]{smartBackRefreshServiceImpl})).booleanValue() : smartBackRefreshServiceImpl.hasBeenUpload;
    }

    public static /* synthetic */ boolean access$202(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a0a1b0c", new Object[]{smartBackRefreshServiceImpl, new Boolean(z)})).booleanValue();
        }
        smartBackRefreshServiceImpl.hasBeenUpload = z;
        return z;
    }

    public static /* synthetic */ boolean access$300(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7a273871", new Object[]{smartBackRefreshServiceImpl})).booleanValue() : smartBackRefreshServiceImpl.isStartScroll;
    }

    public static /* synthetic */ boolean access$302(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b16558d", new Object[]{smartBackRefreshServiceImpl, new Boolean(z)})).booleanValue();
        }
        smartBackRefreshServiceImpl.isStartScroll = z;
        return z;
    }

    public static /* synthetic */ IMainFeedsViewService access$400(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMainFeedsViewService) ipChange.ipc$dispatch("995b77f4", new Object[]{smartBackRefreshServiceImpl}) : smartBackRefreshServiceImpl.mFeedsViewService;
    }

    public static /* synthetic */ ljs access$500(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljs) ipChange.ipc$dispatch("9f2e18e6", new Object[]{smartBackRefreshServiceImpl}) : smartBackRefreshServiceImpl.mInfoFlowContext;
    }

    public static /* synthetic */ String access$602(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4df81c4e", new Object[]{smartBackRefreshServiceImpl, str});
        }
        smartBackRefreshServiceImpl.mBizCode = str;
        return str;
    }

    public static /* synthetic */ boolean access$702(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf473f91", new Object[]{smartBackRefreshServiceImpl, new Boolean(z)})).booleanValue();
        }
        smartBackRefreshServiceImpl.isComebackFront = z;
        return z;
    }

    public static /* synthetic */ boolean access$800(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9671a0f7", new Object[]{smartBackRefreshServiceImpl, iContainerDataModel})).booleanValue() : smartBackRefreshServiceImpl.isZeroBaseRefresh(iContainerDataModel);
    }

    public static /* synthetic */ void access$900(SmartBackRefreshServiceImpl smartBackRefreshServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8f0e634", new Object[]{smartBackRefreshServiceImpl, iContainerDataModel});
        } else {
            smartBackRefreshServiceImpl.initExperimentTag(iContainerDataModel);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mInfoFlowContext = ljsVar;
        this.mSmartBackRefresher = new tin(ljsVar);
        ljs ljsVar2 = this.mInfoFlowContext;
        if (ljsVar2 != null) {
            this.mFeedsViewService = (IMainFeedsViewService) ljsVar2.a(IMainFeedsViewService.class);
        }
        registerRequestBizParamsCreator(this.mInfoFlowContext);
        registerInfoFlowVisibleListener(this.mInfoFlowContext);
        registerHomeLeaveListener(this.mInfoFlowContext);
        registerRequestListener();
        registerScrollListener();
        registerFrontBackgroundListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unRegisterRequestBizParamsCreator(this.mInfoFlowContext);
        unRegisterInfoFlowVisibleListener(this.mInfoFlowContext);
        unRegisterHomeLeaveListener(this.mInfoFlowContext);
        unRegisterRequestListener();
        unRegisterScrollListener();
        unRegisterFrontBackgroundListener();
    }

    private void registerRequestBizParamsCreator(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e636a1", new Object[]{this, ljsVar});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return;
        }
        this.mRequestCommonBizParamsCreator = createRequestCommonBizParamsCreator();
        iContainerDataService.addRequestCommonBizParamsCreator(this.mRequestCommonBizParamsCreator);
        this.mRequestBizParamsCreator = createRequestBizParamsCreator();
        iContainerDataService.addRequestBizParamsCreator(this.mRequestBizParamsCreator);
    }

    private void unRegisterRequestBizParamsCreator(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eac68a48", new Object[]{this, ljsVar});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return;
        }
        IContainerDataService.d dVar = this.mRequestCommonBizParamsCreator;
        if (dVar != null) {
            iContainerDataService.removeRequestCommonBizParamsCreator(dVar);
        }
        IContainerDataService.c cVar = this.mRequestBizParamsCreator;
        if (cVar != null) {
            iContainerDataService.removeRequestBizParamsCreator(cVar);
        }
        this.mRequestBizParamsCreator = null;
    }

    private void registerScrollListener() {
        IMainFeedsViewService iMainFeedsViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d9e6ab", new Object[]{this});
        } else if (this.feedsScrollListener != null || (iMainFeedsViewService = (IMainFeedsViewService) this.mInfoFlowContext.a(IMainFeedsViewService.class)) == null) {
        } else {
            lks mo1084getLifeCycleRegister = iMainFeedsViewService.mo1084getLifeCycleRegister();
            this.feedsScrollListener = createFeedsScrollListener();
            mo1084getLifeCycleRegister.a(this.feedsScrollListener);
        }
    }

    private void registerRequestListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2910fc7", new Object[]{this});
            return;
        }
        this.mOnRequestListener = createRequestListener();
        this.mContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        IContainerDataService<?> iContainerDataService = this.mContainerDataService;
        if (iContainerDataService == null) {
            ldf.d(TAG, "IContainerDataService is null");
        } else {
            iContainerDataService.addRequestListener(this.mOnRequestListener);
        }
    }

    private void registerFrontBackgroundListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23af646f", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) this.mInfoFlowContext.a(IMainLifecycleService.class);
        if (iMainLifecycleService == null) {
            return;
        }
        this.mAppLifeCycle = createAppLifeCycleListener();
        iMainLifecycleService.getAppLifeCycleRegister().a(this.mAppLifeCycle);
    }

    private void unRegisterScrollListener() {
        IMainFeedsViewService iMainFeedsViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d0d1424", new Object[]{this});
        } else if (this.feedsScrollListener == null || (iMainFeedsViewService = (IMainFeedsViewService) this.mInfoFlowContext.a(IMainFeedsViewService.class)) == null) {
        } else {
            iMainFeedsViewService.mo1084getLifeCycleRegister().b(this.feedsScrollListener);
            this.feedsScrollListener = null;
        }
    }

    private void unRegisterRequestListener() {
        IContainerDataService<?> iContainerDataService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c3916e", new Object[]{this});
            return;
        }
        IContainerDataService.b bVar = this.mOnRequestListener;
        if (bVar == null || (iContainerDataService = this.mContainerDataService) == null) {
            return;
        }
        iContainerDataService.removeRequestListener(bVar);
    }

    private void unRegisterFrontBackgroundListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37754f16", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) this.mInfoFlowContext.a(IMainLifecycleService.class);
        if (iMainLifecycleService == null || this.mAppLifeCycle == null) {
            return;
        }
        iMainLifecycleService.getAppLifeCycleRegister().b(this.mAppLifeCycle);
    }

    private IContainerDataService.d createRequestCommonBizParamsCreator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.d) ipChange.ipc$dispatch("6ae979aa", new Object[]{this}) : new IContainerDataService.d() { // from class: com.taobao.infoflow.taobao.subservice.biz.searchbacksmartrefreshservice.SmartBackRefreshServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.d
            public Map<String, String> a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Map) ipChange2.ipc$dispatch("add74dce", new Object[]{this, lliVar, str}) : SmartBackRefreshServiceImpl.access$000(SmartBackRefreshServiceImpl.this).e(str);
            }
        };
    }

    private IContainerDataService.c createRequestBizParamsCreator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.c) ipChange.ipc$dispatch("70453300", new Object[]{this}) : new IContainerDataService.c() { // from class: com.taobao.infoflow.taobao.subservice.biz.searchbacksmartrefreshservice.SmartBackRefreshServiceImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
            public Map<String, String> a(lli lliVar, String str) {
                boolean z;
                IpChange ipChange2 = $ipChange;
                boolean z2 = true;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("add74dce", new Object[]{this, lliVar, str});
                }
                if (a.c(str)) {
                    SmartBackRefreshServiceImpl.this.mIsOutLinkBackRefresh = true;
                }
                Map<String, String> a2 = SmartBackRefreshServiceImpl.access$000(SmartBackRefreshServiceImpl.this).a(str);
                if (a2 == null || a2.isEmpty()) {
                    if (a.a(str)) {
                        SmartBackRefreshServiceImpl.access$102(SmartBackRefreshServiceImpl.this, 1);
                    } else {
                        SmartBackRefreshServiceImpl.access$102(SmartBackRefreshServiceImpl.this, -1);
                    }
                    z = false;
                } else {
                    SmartBackRefreshServiceImpl.access$102(SmartBackRefreshServiceImpl.this, 0);
                    z = true;
                }
                SmartBackRefreshServiceImpl.access$202(SmartBackRefreshServiceImpl.this, false);
                if (a.a(str)) {
                    if (!SmartBackRefreshServiceImpl.this.enableSearchBackRefresh() && !SmartBackRefreshServiceImpl.this.enableIpvBackRefresh()) {
                        z2 = false;
                    }
                    xnm.a(z2, z);
                }
                return a2;
            }
        };
    }

    private lks.c<ViewGroup> createFeedsScrollListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lks.c) ipChange.ipc$dispatch("f16f1732", new Object[]{this}) : new lks.c<ViewGroup>() { // from class: com.taobao.infoflow.taobao.subservice.biz.searchbacksmartrefreshservice.SmartBackRefreshServiceImpl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lks.c
            public void a(boolean z, boolean z2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
                }
            }

            @Override // tb.lks.c
            public void a(ViewGroup viewGroup, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a8f4273c", new Object[]{this, viewGroup, new Integer(i)});
                } else if (i != 1 || SmartBackRefreshServiceImpl.access$200(SmartBackRefreshServiceImpl.this)) {
                } else {
                    SmartBackRefreshServiceImpl.access$202(SmartBackRefreshServiceImpl.this, true);
                    SmartBackRefreshServiceImpl.access$302(SmartBackRefreshServiceImpl.this, true);
                }
            }

            @Override // tb.lks.c
            public void a(ViewGroup viewGroup, int i, int i2) {
                int[] findFirstCompletelyVisibleItemPositions;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("75913347", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
                } else if (viewGroup instanceof RecyclerView) {
                    if (i2 > 10 && SmartBackRefreshServiceImpl.access$300(SmartBackRefreshServiceImpl.this)) {
                        SmartBackRefreshServiceImpl.access$302(SmartBackRefreshServiceImpl.this, false);
                        if (SmartBackRefreshServiceImpl.access$100(SmartBackRefreshServiceImpl.this) == 0) {
                            xnm.a(true);
                        } else if (SmartBackRefreshServiceImpl.access$100(SmartBackRefreshServiceImpl.this) == 1) {
                            xnm.a(false);
                        }
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) ((RecyclerView) viewGroup).getLayoutManager();
                    if (staggeredGridLayoutManager == null || SmartBackRefreshServiceImpl.access$400(SmartBackRefreshServiceImpl.this) == null) {
                        return;
                    }
                    int i3 = Integer.MAX_VALUE;
                    for (int i4 : staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(null)) {
                        if (i4 != -1) {
                            i3 = Math.min(i3, i4);
                        }
                    }
                    if (i3 == Integer.MAX_VALUE || liy.a(SmartBackRefreshServiceImpl.access$500(SmartBackRefreshServiceImpl.this)) == -1) {
                        return;
                    }
                    if (SmartBackRefreshServiceImpl.access$500(SmartBackRefreshServiceImpl.this) != null && i3 < liy.a(SmartBackRefreshServiceImpl.access$500(SmartBackRefreshServiceImpl.this))) {
                        SmartBackRefreshServiceImpl smartBackRefreshServiceImpl = SmartBackRefreshServiceImpl.this;
                        SmartBackRefreshServiceImpl.access$602(smartBackRefreshServiceImpl, liy.b(SmartBackRefreshServiceImpl.access$500(smartBackRefreshServiceImpl)));
                        return;
                    }
                    BaseSectionModel<?> findItemDataByPosition = SmartBackRefreshServiceImpl.access$400(SmartBackRefreshServiceImpl.this).findItemDataByPosition(i3);
                    if (findItemDataByPosition == null || findItemDataByPosition.getSectionBizCode() == null) {
                        return;
                    }
                    SmartBackRefreshServiceImpl.access$602(SmartBackRefreshServiceImpl.this, findItemDataByPosition.getSectionBizCode());
                }
            }
        };
    }

    private lko createAppLifeCycleListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lko) ipChange.ipc$dispatch("79195896", new Object[]{this}) : new lko() { // from class: com.taobao.infoflow.taobao.subservice.biz.searchbacksmartrefreshservice.SmartBackRefreshServiceImpl.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lko
            public void onAppToBackground() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("938dadf2", new Object[]{this});
                }
            }

            @Override // tb.lko
            public void onAppToFront() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c0c238d3", new Object[]{this});
                } else {
                    SmartBackRefreshServiceImpl.access$702(SmartBackRefreshServiceImpl.this, true);
                }
            }
        };
    }

    private IContainerDataService.b createRequestListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.b) ipChange.ipc$dispatch("88e46762", new Object[]{this}) : new IContainerDataService.b() { // from class: com.taobao.infoflow.taobao.subservice.biz.searchbacksmartrefreshservice.SmartBackRefreshServiceImpl.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("552c8b59", new Object[]{this, lliVar, str});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("74bec7ed", new Object[]{this, lliVar, str, str2, str3});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d905f556", new Object[]{this, lliVar, iContainerDataModel, str});
                    return;
                }
                if (SmartBackRefreshServiceImpl.access$800(SmartBackRefreshServiceImpl.this, iContainerDataModel) && !TextUtils.equals(str, Constant.KEY_PAGEBACK)) {
                    SmartBackRefreshServiceImpl.access$602(SmartBackRefreshServiceImpl.this, null);
                }
                SmartBackRefreshServiceImpl.access$900(SmartBackRefreshServiceImpl.this, iContainerDataModel);
            }
        };
    }

    private void registerInfoFlowVisibleListener(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b80c129", new Object[]{this, ljsVar});
            return;
        }
        IMainFeedsLoopStartStopService iMainFeedsLoopStartStopService = (IMainFeedsLoopStartStopService) ljsVar.a(IMainFeedsLoopStartStopService.class);
        if (iMainFeedsLoopStartStopService == null) {
            return;
        }
        this.mStartAndStopListener = createStartAndStopListener();
        iMainFeedsLoopStartStopService.registerStartStopListener(this.mStartAndStopListener);
    }

    private void unRegisterInfoFlowVisibleListener(ljs ljsVar) {
        IMainFeedsLoopStartStopService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6114d0", new Object[]{this, ljsVar});
            return;
        }
        IMainFeedsLoopStartStopService iMainFeedsLoopStartStopService = (IMainFeedsLoopStartStopService) ljsVar.a(IMainFeedsLoopStartStopService.class);
        if (iMainFeedsLoopStartStopService == null || (aVar = this.mStartAndStopListener) == null) {
            return;
        }
        iMainFeedsLoopStartStopService.unregisterStartStopListener(aVar);
        this.mStartAndStopListener = null;
    }

    private IMainFeedsLoopStartStopService.a createStartAndStopListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMainFeedsLoopStartStopService.a) ipChange.ipc$dispatch("1d46fd73", new Object[]{this}) : new IMainFeedsLoopStartStopService.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.searchbacksmartrefreshservice.SmartBackRefreshServiceImpl.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService.a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService.a
            public void b(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str});
                } else {
                    SmartBackRefreshServiceImpl.access$000(SmartBackRefreshServiceImpl.this).b(str);
                }
            }
        };
    }

    private void registerHomeLeaveListener(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42e6d12b", new Object[]{this, ljsVar});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) ljsVar.a(IMainLifecycleService.class);
        if (iMainLifecycleService == null) {
            return;
        }
        this.mPageLifeCycle = createPageLifeCycle();
        iMainLifecycleService.getPageLifeCycleRegister().a(this.mPageLifeCycle);
    }

    private void unRegisterHomeLeaveListener(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cdcae12", new Object[]{this, ljsVar});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) ljsVar.a(IMainLifecycleService.class);
        if (iMainLifecycleService == null || this.mPageLifeCycle == null) {
            return;
        }
        iMainLifecycleService.getPageLifeCycleRegister().b(this.mPageLifeCycle);
        this.mPageLifeCycle = null;
    }

    private llb createPageLifeCycle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (llb) ipChange.ipc$dispatch("414e763e", new Object[]{this}) : new bxp() { // from class: com.taobao.infoflow.taobao.subservice.biz.searchbacksmartrefreshservice.SmartBackRefreshServiceImpl.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bxp, tb.llb
            public void onColdStartResume() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("45e9b853", new Object[]{this});
                    return;
                }
                ldf.d(SmartBackRefreshServiceImpl.TAG, "触发onColdStartResumemHasBeenRequestWithBxFeature:" + SmartBackRefreshServiceImpl.access$1000(SmartBackRefreshServiceImpl.this));
                if (SmartBackRefreshServiceImpl.access$1000(SmartBackRefreshServiceImpl.this) || !SmartBackRefreshServiceImpl.access$1100(SmartBackRefreshServiceImpl.this)) {
                    return;
                }
                ldf.d(SmartBackRefreshServiceImpl.TAG, "onColdStartResume: triggerPageBackEvent");
                SmartBackRefreshServiceImpl.access$1200(SmartBackRefreshServiceImpl.this);
                SmartBackRefreshServiceImpl.this.mIsOutLinkBackRefresh = true;
            }

            @Override // tb.bxp, tb.llb
            public void onPause() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2f87fc5e", new Object[]{this});
                } else {
                    SmartBackRefreshServiceImpl.access$000(SmartBackRefreshServiceImpl.this).b(IMainFeedsLoopStartStopService.a.PAGE_SWITCH);
                }
            }
        };
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public String getFirstCompletelyVisibleBizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e88195ab", new Object[]{this}) : liy.b(this.mInfoFlowContext);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public boolean enableSearchBackRefresh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f09a5f4", new Object[]{this})).booleanValue() : this.mEnableSearchBaseRefreshNew || enableSearchBackRefreshOld();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public void setRequestWithBxFeature(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d2a680", new Object[]{this, new Boolean(z)});
        } else {
            this.mHasBeenRequestWithBxFeature = z;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public boolean enableSearchClickCheck() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a7735ed6", new Object[]{this})).booleanValue() : this.mEnableSearchClickCheck || this.mEnableSearchClickRefreshNew;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public boolean isDirectClickInInfoFlow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8ec18e41", new Object[]{this})).booleanValue() : this.isDirectClickIntoPages;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public boolean isDirectClickInInfoFlowForCommon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d103589", new Object[]{this})).booleanValue() : this.isDirectClickIntoPagesForCommon;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public void setDirectClickInInfoFlow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e61856f", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isDirectClickIntoPages = z;
        this.isDirectClickIntoPagesForCommon = z;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public boolean enableIpvBackRefresh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8afa1133", new Object[]{this})).booleanValue() : this.mEnableIpvBackRefresh || this.mEnableIpvBaseRefreshNew;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public boolean enableOutLinkBackRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a56bea5a", new Object[]{this})).booleanValue();
        }
        if (this.mEnableOutLinkBackRefresh) {
            return true;
        }
        SharedPreferences a2 = e.a(Globals.getApplication()).a();
        if (a2 != null) {
            return a2.getBoolean(OUT_LINK_ENABLE_TAG, false);
        }
        return false;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public boolean enableNormalBackRefresh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e2ca08d5", new Object[]{this})).booleanValue() : this.mEnableNormalBaseRefresh;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public boolean enableBaseRefresh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1b49252", new Object[]{this})).booleanValue() : this.needBaseRefresh;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public boolean isBackgroundToFront() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6d683ce1", new Object[]{this})).booleanValue() : this.isComebackFront;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public void resetStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b50ee28", new Object[]{this});
            return;
        }
        this.isDirectClickIntoPages = false;
        this.mIsOutLinkBackRefresh = false;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public void resetCommonStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63cb33", new Object[]{this});
            return;
        }
        this.isComebackFront = false;
        this.isDirectClickIntoPagesForCommon = false;
    }

    private JSONObject getSubBaseExt(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2496718e", new Object[]{this, iContainerDataModel});
        }
        if (iContainerDataModel == null) {
            ldf.d(TAG, "containerDataModel == null");
            return null;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            ldf.d(TAG, "baseData == null");
            return null;
        }
        return base.getExt();
    }

    private void initExperimentTag(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1a38b87", new Object[]{this, iContainerDataModel});
            return;
        }
        JSONObject subBaseExt = getSubBaseExt(iContainerDataModel);
        if (subBaseExt == null) {
            return;
        }
        this.mEnableSearchBaseRefreshNew = subBaseExt.getBooleanValue("searchBackRefresh");
        this.mEnableIpvBaseRefreshNew = subBaseExt.getBooleanValue("ipvBackRefresh");
        this.mEnableNormalBaseRefresh = subBaseExt.getBooleanValue("normalBackRefresh");
        this.mEnableSearchClickRefreshNew = subBaseExt.getBooleanValue("enableSearchBackRefresh");
        if (!this.mEnableSearchBaseRefreshNew && !this.mEnableIpvBaseRefreshNew && !this.mEnableNormalBaseRefresh) {
            z = false;
        }
        this.needBaseRefresh = z;
        JSONObject jSONObject = subBaseExt.getJSONObject(KEY_HOME_GLOBAL_AB_TEST);
        if (ObjectUtils.a(jSONObject)) {
            ldf.d(TAG, "enablePreLoadNewDetail homeGlobalAbTest is null");
            return;
        }
        this.mEnableSearchClickCheck = jSONObject.getBooleanValue("enableSearchBackRefresh");
        this.mEnableIpvBackRefresh = jSONObject.getBooleanValue("enableOtherBackRefresh");
        Boolean bool = jSONObject.getBoolean("enableOuterBackRefresh");
        if (bool == null) {
            return;
        }
        this.mEnableOutLinkBackRefresh = bool.booleanValue();
        ljd.a().a(new Runnable() { // from class: com.taobao.infoflow.taobao.subservice.biz.searchbacksmartrefreshservice.SmartBackRefreshServiceImpl.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                SharedPreferences a2 = e.a(Globals.getApplication()).a();
                if (a2 == null) {
                    return;
                }
                SharedPreferences.Editor edit = a2.edit();
                edit.putBoolean(SmartBackRefreshServiceImpl.OUT_LINK_ENABLE_TAG, SmartBackRefreshServiceImpl.access$1300(SmartBackRefreshServiceImpl.this));
                edit.apply();
            }
        });
    }

    private boolean enableSearchBackRefreshOld() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecaa5909", new Object[]{this})).booleanValue();
        }
        IFirstScreenDataService iFirstScreenDataService = (IFirstScreenDataService) this.mInfoFlowContext.a(IFirstScreenDataService.class);
        if (iFirstScreenDataService == null) {
            ldf.d(TAG, "enableFirstScreenSmartRefresh firstScreenDataService is null");
            return false;
        }
        JSONObject firstScreenExt = iFirstScreenDataService.getFirstScreenExt();
        return firstScreenExt != null && firstScreenExt.getBooleanValue("zeroRefreshEnable");
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService
    public boolean isCurrentRefreshByOutLink() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bba6a090", new Object[]{this})).booleanValue() : this.mIsOutLinkBackRefresh;
    }

    private boolean isZeroBaseRefresh(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7c24eee0", new Object[]{this, iContainerDataModel})).booleanValue() : (iContainerDataModel == null || iContainerDataModel.getBase() == null || iContainerDataModel.getBase().mo1280getPageParams() == null || iContainerDataModel.getBase().mo1280getPageParams().getPageNum() != 0) ? false : true;
    }

    private boolean isIpvFeatureExist() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e259a71", new Object[]{this})).booleanValue();
        }
        tin tinVar = this.mSmartBackRefresher;
        if (tinVar != null) {
            return tinVar.e();
        }
        return false;
    }

    private void triggerPageBackEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da1887d3", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d(TAG, "onPullRefresh dataService == null");
            return;
        }
        iContainerDataService.triggerEvent("PageBack", null, new lje("PageBack" + SystemClock.uptimeMillis()));
    }
}
