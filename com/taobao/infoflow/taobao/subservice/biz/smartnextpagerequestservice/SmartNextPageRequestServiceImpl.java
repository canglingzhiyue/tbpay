package com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.ISmartNextPageRequestService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.impl.ScoreLevel;
import com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.impl.a;
import com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.impl.b;
import com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.impl.c;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.d;
import com.taobao.tao.util.DensityUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import tb.bxn;
import tb.kge;
import tb.ldf;
import tb.ldj;
import tb.lja;
import tb.ljs;
import tb.lks;
import tb.lkz;
import tb.lli;
import tb.mto;
import tb.the;

/* loaded from: classes7.dex */
public class SmartNextPageRequestServiceImpl implements ISmartNextPageRequestService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String REQUEST_TYPE_NEXT_PAGE = "scrollNextPage";
    private static final String TAG = "SmartNextPageRequestServiceImpl";
    private IContainerDataService<?> mContainerDataService;
    private long mLayoutFinishTime;
    private IMainFeedsViewService<?> mMainFeedsViewService;
    private String mNextPageBxIntention;
    private IContainerDataService.a mOnDataProcessListener;
    private lks.b mOnFeedsLayoutListener;
    private lks.c<ViewGroup> mOnFeedsScrollListener;
    private lkz.a mOnItemRenderListener;
    private IContainerDataService.b mOnRequestListener;
    private IContainerDataService.d mRequestCommonBizParamsCreator;
    private String mScoreLevel = "default";
    private int mScrollPreRequestY = DensityUtil.dip2px(Globals.getApplication(), 30.0f);
    private int totalScrollDistance = 0;
    private final a mDynamicRtUserTracer = new a();
    private final List<Integer> mNextPageLastCardIndexList = new ArrayList();
    private boolean isZeroScroll = false;
    private c mEscapeDurationCounter = new c();

    static {
        kge.a(511399006);
        kge.a(61570535);
    }

    public static /* synthetic */ boolean access$000(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a699c090", new Object[]{smartNextPageRequestServiceImpl})).booleanValue() : smartNextPageRequestServiceImpl.isZeroScroll;
    }

    public static /* synthetic */ boolean access$002(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eeb778ce", new Object[]{smartNextPageRequestServiceImpl, new Boolean(z)})).booleanValue();
        }
        smartNextPageRequestServiceImpl.isZeroScroll = z;
        return z;
    }

    public static /* synthetic */ String access$100(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e42cd9d5", new Object[]{smartNextPageRequestServiceImpl}) : smartNextPageRequestServiceImpl.mScoreLevel;
    }

    public static /* synthetic */ String access$1000(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e14113c2", new Object[]{smartNextPageRequestServiceImpl, iContainerDataModel}) : smartNextPageRequestServiceImpl.calculateScoreLevel(iContainerDataModel);
    }

    public static /* synthetic */ String access$102(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1afeee8d", new Object[]{smartNextPageRequestServiceImpl, str});
        }
        smartNextPageRequestServiceImpl.mScoreLevel = str;
        return str;
    }

    public static /* synthetic */ void access$1100(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14667a1c", new Object[]{smartNextPageRequestServiceImpl});
        } else {
            smartNextPageRequestServiceImpl.resetScoreLevel();
        }
    }

    public static /* synthetic */ int access$1200(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ca766293", new Object[]{smartNextPageRequestServiceImpl, iContainerDataModel})).intValue() : smartNextPageRequestServiceImpl.getBaseSize(iContainerDataModel);
    }

    public static /* synthetic */ int access$1300(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("955ca54d", new Object[]{smartNextPageRequestServiceImpl})).intValue() : smartNextPageRequestServiceImpl.totalScrollDistance;
    }

    public static /* synthetic */ int access$1302(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d850edde", new Object[]{smartNextPageRequestServiceImpl, new Integer(i)})).intValue();
        }
        smartNextPageRequestServiceImpl.totalScrollDistance = i;
        return i;
    }

    public static /* synthetic */ long access$1400(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d5d7baed", new Object[]{smartNextPageRequestServiceImpl})).longValue() : smartNextPageRequestServiceImpl.mLayoutFinishTime;
    }

    public static /* synthetic */ long access$1402(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7388fe1", new Object[]{smartNextPageRequestServiceImpl, new Long(j)})).longValue();
        }
        smartNextPageRequestServiceImpl.mLayoutFinishTime = j;
        return j;
    }

    public static /* synthetic */ int access$1500(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1652d08b", new Object[]{smartNextPageRequestServiceImpl})).intValue() : smartNextPageRequestServiceImpl.mScrollPreRequestY;
    }

    public static /* synthetic */ void access$200(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278febca", new Object[]{smartNextPageRequestServiceImpl});
        } else {
            smartNextPageRequestServiceImpl.triggerRequestNextPage();
        }
    }

    public static /* synthetic */ String access$300(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca46d257", new Object[]{smartNextPageRequestServiceImpl}) : smartNextPageRequestServiceImpl.mNextPageBxIntention;
    }

    public static /* synthetic */ String access$302(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c108a8f", new Object[]{smartNextPageRequestServiceImpl, str});
        }
        smartNextPageRequestServiceImpl.mNextPageBxIntention = str;
        return str;
    }

    public static /* synthetic */ IContainerDataService access$400(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService) ipChange.ipc$dispatch("b3d921da", new Object[]{smartNextPageRequestServiceImpl}) : smartNextPageRequestServiceImpl.mContainerDataService;
    }

    public static /* synthetic */ a access$500(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f560cb79", new Object[]{smartNextPageRequestServiceImpl}) : smartNextPageRequestServiceImpl.mDynamicRtUserTracer;
    }

    public static /* synthetic */ c access$600(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("90498878", new Object[]{smartNextPageRequestServiceImpl}) : smartNextPageRequestServiceImpl.mEscapeDurationCounter;
    }

    public static /* synthetic */ String access$700(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("967ac35b", new Object[]{smartNextPageRequestServiceImpl}) : smartNextPageRequestServiceImpl.getExtendedTime();
    }

    public static /* synthetic */ int access$800(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c144052a", new Object[]{smartNextPageRequestServiceImpl, iContainerDataModel})).intValue() : smartNextPageRequestServiceImpl.getNextPageLastCardIndex(iContainerDataModel);
    }

    public static /* synthetic */ List access$900(SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f97344c4", new Object[]{smartNextPageRequestServiceImpl}) : smartNextPageRequestServiceImpl.mNextPageLastCardIndexList;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mScrollPreRequestY = DensityUtil.dip2px(Globals.getApplication(), ldj.a("willingnessScoreDefaultScrollOffset", 30));
        this.mEscapeDurationCounter.a(ljsVar);
        this.mContainerDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (this.mContainerDataService != null) {
            this.mOnDataProcessListener = createDataProcessListener();
            this.mOnRequestListener = createOnRequestListener();
            this.mRequestCommonBizParamsCreator = createRequestCommonBizParamsCreator();
            this.mContainerDataService.addDataProcessListener(this.mOnDataProcessListener);
            this.mContainerDataService.addRequestListener(this.mOnRequestListener);
            this.mContainerDataService.addRequestCommonBizParamsCreator(this.mRequestCommonBizParamsCreator);
        }
        this.mMainFeedsViewService = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        if (this.mMainFeedsViewService == null) {
            return;
        }
        this.mOnFeedsScrollListener = createOnFeedsScrollListener();
        this.mOnItemRenderListener = createOnItemRenderListener();
        this.mOnFeedsLayoutListener = createOnFeedsLayoutListener();
        lks mo1084getLifeCycleRegister = this.mMainFeedsViewService.mo1084getLifeCycleRegister();
        mo1084getLifeCycleRegister.a(this.mOnFeedsScrollListener);
        mo1084getLifeCycleRegister.a(this.mOnItemRenderListener);
        mo1084getLifeCycleRegister.a(this.mOnFeedsLayoutListener);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mContainerDataService;
        if (iContainerDataService != null) {
            iContainerDataService.removeDataProcessListener(this.mOnDataProcessListener);
            this.mContainerDataService.removeRequestListener(this.mOnRequestListener);
            this.mContainerDataService.removeRequestCommonBizParamsCreator(this.mRequestCommonBizParamsCreator);
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mMainFeedsViewService;
        if (iMainFeedsViewService != null && this.mOnFeedsScrollListener != null) {
            lks mo1084getLifeCycleRegister = iMainFeedsViewService.mo1084getLifeCycleRegister();
            mo1084getLifeCycleRegister.b(this.mOnFeedsScrollListener);
            mo1084getLifeCycleRegister.b(this.mOnItemRenderListener);
            mo1084getLifeCycleRegister.b(this.mOnFeedsLayoutListener);
        }
        this.mEscapeDurationCounter.a();
    }

    private IContainerDataService.a createDataProcessListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.a) ipChange.ipc$dispatch("a962c199", new Object[]{this}) : new IContainerDataService.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.SmartNextPageRequestServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void b(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
                    return;
                }
                if (!bxn.c(iContainerDataModel) && bxn.a(iContainerDataModel)) {
                    SmartNextPageRequestServiceImpl.access$002(SmartNextPageRequestServiceImpl.this, true);
                }
                if (!TextUtils.equals(ScoreLevel.N0, SmartNextPageRequestServiceImpl.access$100(SmartNextPageRequestServiceImpl.this))) {
                    return;
                }
                ldf.d(SmartNextPageRequestServiceImpl.TAG, "触发：ScoreLevel.N0");
                SmartNextPageRequestServiceImpl.access$200(SmartNextPageRequestServiceImpl.this);
            }
        };
    }

    private IContainerDataService.b createOnRequestListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.b) ipChange.ipc$dispatch("f39e58c3", new Object[]{this}) : new IContainerDataService.b() { // from class: com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.SmartNextPageRequestServiceImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("74bec7ed", new Object[]{this, lliVar, str, str2, str3});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("552c8b59", new Object[]{this, lliVar, str});
                } else if (!TextUtils.equals(str, SmartNextPageRequestServiceImpl.REQUEST_TYPE_NEXT_PAGE)) {
                } else {
                    SmartNextPageRequestServiceImpl.access$500(SmartNextPageRequestServiceImpl.this).a(SmartNextPageRequestServiceImpl.access$300(SmartNextPageRequestServiceImpl.this), SmartNextPageRequestServiceImpl.access$400(SmartNextPageRequestServiceImpl.this));
                    SmartNextPageRequestServiceImpl.access$600(SmartNextPageRequestServiceImpl.this).b();
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d905f556", new Object[]{this, lliVar, iContainerDataModel, str});
                    return;
                }
                if (TextUtils.equals(str, SmartNextPageRequestServiceImpl.REQUEST_TYPE_NEXT_PAGE)) {
                    SmartNextPageRequestServiceImpl.access$500(SmartNextPageRequestServiceImpl.this).a(SmartNextPageRequestServiceImpl.access$700(SmartNextPageRequestServiceImpl.this));
                    int access$800 = SmartNextPageRequestServiceImpl.access$800(SmartNextPageRequestServiceImpl.this, iContainerDataModel);
                    if (access$800 > 0) {
                        SmartNextPageRequestServiceImpl.access$900(SmartNextPageRequestServiceImpl.this).add(Integer.valueOf(access$800));
                    }
                }
                SmartNextPageRequestServiceImpl.access$002(SmartNextPageRequestServiceImpl.this, bxn.a(iContainerDataModel));
                if (SmartNextPageRequestServiceImpl.access$000(SmartNextPageRequestServiceImpl.this)) {
                    SmartNextPageRequestServiceImpl.access$600(SmartNextPageRequestServiceImpl.this).c();
                    SmartNextPageRequestServiceImpl.access$500(SmartNextPageRequestServiceImpl.this).a();
                }
                try {
                    SmartNextPageRequestServiceImpl.access$102(SmartNextPageRequestServiceImpl.this, SmartNextPageRequestServiceImpl.access$1000(SmartNextPageRequestServiceImpl.this, iContainerDataModel));
                } catch (JSONException e) {
                    ldf.a(SmartNextPageRequestServiceImpl.TAG, "calculateScoreLevel error", e);
                    SmartNextPageRequestServiceImpl.access$1100(SmartNextPageRequestServiceImpl.this);
                }
                ldf.d(SmartNextPageRequestServiceImpl.TAG, "calculateScoreLevel mScoreLevel: " + SmartNextPageRequestServiceImpl.access$100(SmartNextPageRequestServiceImpl.this));
                if (!bxn.a(iContainerDataModel)) {
                    SmartNextPageRequestServiceImpl.access$1100(SmartNextPageRequestServiceImpl.this);
                    return;
                }
                SmartNextPageRequestServiceImpl.access$900(SmartNextPageRequestServiceImpl.this).clear();
                int access$1200 = SmartNextPageRequestServiceImpl.access$1200(SmartNextPageRequestServiceImpl.this, iContainerDataModel);
                if (access$1200 <= 0) {
                    return;
                }
                SmartNextPageRequestServiceImpl.access$900(SmartNextPageRequestServiceImpl.this).add(Integer.valueOf(access$1200));
            }
        };
    }

    private IContainerDataService.d createRequestCommonBizParamsCreator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.d) ipChange.ipc$dispatch("6ae979aa", new Object[]{this}) : new IContainerDataService.d() { // from class: com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.SmartNextPageRequestServiceImpl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.d
            public Map<String, String> a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("add74dce", new Object[]{this, lliVar, str});
                }
                HashMap hashMap = new HashMap();
                hashMap.put("networkStatus", the.a());
                if (TextUtils.equals(str, SmartNextPageRequestServiceImpl.REQUEST_TYPE_NEXT_PAGE)) {
                    SmartNextPageRequestServiceImpl.access$302(SmartNextPageRequestServiceImpl.this, b.a());
                    ldf.d(SmartNextPageRequestServiceImpl.TAG, "mNextPageBxIntention: " + SmartNextPageRequestServiceImpl.access$300(SmartNextPageRequestServiceImpl.this));
                    JSONObject a2 = b.a(SmartNextPageRequestServiceImpl.access$300(SmartNextPageRequestServiceImpl.this));
                    if (a2 != null && !a2.isEmpty()) {
                        hashMap.put("smartRTFeatures", a2.toJSONString());
                    }
                }
                return hashMap;
            }
        };
    }

    private lks.c<ViewGroup> createOnFeedsScrollListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lks.c) ipChange.ipc$dispatch("9b071631", new Object[]{this}) : new lks.c<ViewGroup>() { // from class: com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.SmartNextPageRequestServiceImpl.4
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
                } else if (1 != i) {
                } else {
                    SmartNextPageRequestServiceImpl.access$600(SmartNextPageRequestServiceImpl.this).d();
                }
            }

            @Override // tb.lks.c
            public void a(ViewGroup viewGroup, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("75913347", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
                    return;
                }
                SmartNextPageRequestServiceImpl smartNextPageRequestServiceImpl = SmartNextPageRequestServiceImpl.this;
                SmartNextPageRequestServiceImpl.access$1302(smartNextPageRequestServiceImpl, SmartNextPageRequestServiceImpl.access$1300(smartNextPageRequestServiceImpl) + i2);
                if (SmartNextPageRequestServiceImpl.access$000(SmartNextPageRequestServiceImpl.this) && i2 > 0) {
                    SmartNextPageRequestServiceImpl.access$002(SmartNextPageRequestServiceImpl.this, false);
                    SmartNextPageRequestServiceImpl.access$500(SmartNextPageRequestServiceImpl.this).a(SmartNextPageRequestServiceImpl.access$400(SmartNextPageRequestServiceImpl.this), SystemClock.uptimeMillis(), SmartNextPageRequestServiceImpl.access$1400(SmartNextPageRequestServiceImpl.this));
                }
                if (TextUtils.equals(ScoreLevel.N1, SmartNextPageRequestServiceImpl.access$100(SmartNextPageRequestServiceImpl.this)) && i2 > 0) {
                    ldf.d(SmartNextPageRequestServiceImpl.TAG, "触发：ScoreLevel.N1");
                    SmartNextPageRequestServiceImpl.access$200(SmartNextPageRequestServiceImpl.this);
                }
                if (!TextUtils.equals(ScoreLevel.N2, SmartNextPageRequestServiceImpl.access$100(SmartNextPageRequestServiceImpl.this)) || SmartNextPageRequestServiceImpl.access$1300(SmartNextPageRequestServiceImpl.this) < SmartNextPageRequestServiceImpl.access$1500(SmartNextPageRequestServiceImpl.this)) {
                    return;
                }
                ldf.d(SmartNextPageRequestServiceImpl.TAG, "触发：ScoreLevel.N2");
                SmartNextPageRequestServiceImpl.access$200(SmartNextPageRequestServiceImpl.this);
            }
        };
    }

    private lkz.a createOnItemRenderListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lkz.a) ipChange.ipc$dispatch("5ec84e8f", new Object[]{this}) : new lkz.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.SmartNextPageRequestServiceImpl.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lkz.a
            public void a(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5ac4f93", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
                }
            }

            @Override // tb.lkz.a
            public void a_(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b34bf30d", new Object[]{this, view});
                }
            }

            @Override // tb.lkz.a
            public void b(int i, View view, BaseSectionModel baseSectionModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c5fda7a0", new Object[]{this, new Integer(i), view, baseSectionModel});
                }
            }

            @Override // tb.lkz.a
            public void a(int i, View view, BaseSectionModel baseSectionModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e0524b1f", new Object[]{this, new Integer(i), view, baseSectionModel});
                    return;
                }
                int i2 = -1;
                if (!SmartNextPageRequestServiceImpl.access$900(SmartNextPageRequestServiceImpl.this).isEmpty()) {
                    i2 = ((Integer) SmartNextPageRequestServiceImpl.access$900(SmartNextPageRequestServiceImpl.this).get(0)).intValue();
                }
                if (i != i2) {
                    return;
                }
                SmartNextPageRequestServiceImpl.access$900(SmartNextPageRequestServiceImpl.this).remove(0);
                ldf.d(SmartNextPageRequestServiceImpl.TAG, "mNextPageLastCardIndex: " + i2);
                SmartNextPageRequestServiceImpl.access$500(SmartNextPageRequestServiceImpl.this).a(SmartNextPageRequestServiceImpl.access$600(SmartNextPageRequestServiceImpl.this).e());
            }
        };
    }

    private lks.b createOnFeedsLayoutListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lks.b) ipChange.ipc$dispatch("735b4dd5", new Object[]{this}) : new lks.b() { // from class: com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.SmartNextPageRequestServiceImpl.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lks.b
            public void dM_() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("32a48a9d", new Object[]{this});
                }
            }

            @Override // tb.lks.b
            public void dT_() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3e9676f6", new Object[]{this});
                } else {
                    SmartNextPageRequestServiceImpl.access$1402(SmartNextPageRequestServiceImpl.this, SystemClock.uptimeMillis());
                }
            }
        };
    }

    private String calculateScoreLevel(IContainerDataModel<?> iContainerDataModel) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bb5c0e4", new Object[]{this, iContainerDataModel});
        }
        if (!isAllowCalculate(iContainerDataModel)) {
            return "default";
        }
        JSONObject c = d.a().c();
        if (c == null) {
            ldf.d(TAG, "calculateScoreLevel ext == null");
            return "default";
        }
        double doubleValue = c.getDoubleValue("willingness_score");
        if (doubleValue == mto.a.GEO_NOT_SUPPORT) {
            ldf.d(TAG, "calculateScoreLevel targetScore == 0");
            return "default";
        }
        JSONObject jSONObject = (JSONObject) lja.a("clientABTest.smartScrollNextPage", c);
        if (jSONObject == null) {
            ldf.d(TAG, "smartScrollNextPage == null");
            return "default";
        }
        TreeMap treeMap = new TreeMap();
        for (String str : new String[]{ScoreLevel.N0, ScoreLevel.N1, ScoreLevel.N2, ScoreLevel.N3}) {
            if (jSONObject.containsKey(str)) {
                treeMap.put(jSONObject.getDouble(str), str);
            }
        }
        return getScoreLevel(treeMap, doubleValue);
    }

    private String getExtendedTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d03a565d", new Object[]{this});
        }
        JSONObject c = d.a().c();
        if (c == null) {
            ldf.d(TAG, "getExtendedTime ext == null");
            return "";
        }
        return c.getString("extendedTime");
    }

    private boolean isAllowCalculate(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aeb23991", new Object[]{this, iContainerDataModel})).booleanValue() : bxn.a(iContainerDataModel) && bxn.c(iContainerDataModel);
    }

    private static String getScoreLevel(NavigableMap<Double, String> navigableMap, double d) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e01391f", new Object[]{navigableMap, new Double(d)}) : navigableMap.floorEntry(Double.valueOf(d)) == null ? "default" : navigableMap.floorEntry(Double.valueOf(d)).getValue();
    }

    private void triggerRequestNextPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45f1a300", new Object[]{this});
            return;
        }
        resetScoreLevel();
        if (this.mContainerDataService == null) {
            ldf.d(TAG, "triggerRequestNextPage mContainerDataService == null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("index", (Object) (-1));
        this.mContainerDataService.triggerEvent("ViewAppear", jSONObject);
    }

    private void resetScoreLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6c8d6c8", new Object[]{this});
        } else {
            this.mScoreLevel = "default";
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    private int getNextPageLastCardIndex(IContainerDataModel<?> iContainerDataModel) {
        ?? containerData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2ff18d3", new Object[]{this, iContainerDataModel})).intValue();
        }
        if (iContainerDataModel == null || (containerData = this.mContainerDataService.getContainerData()) == 0) {
            return -1;
        }
        int size = containerData.getTotalData().size();
        int baseSize = getBaseSize(iContainerDataModel);
        if (baseSize > 0) {
            return (size + baseSize) - 1;
        }
        return -1;
    }

    private int getBaseSize(IContainerDataModel<?> iContainerDataModel) {
        IContainerInnerDataModel<?> base;
        List<?> sections;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f501c15f", new Object[]{this, iContainerDataModel})).intValue();
        }
        if (iContainerDataModel != null && (base = iContainerDataModel.getBase()) != null && (sections = base.getSections()) != null && !sections.isEmpty()) {
            return sections.size();
        }
        return -1;
    }
}
