package com.taobao.android.goodprice.homepage.service.impl.bizservice;

import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.goodprice.homepage.service.impl.bizservice.request.BxUploadClient;
import com.taobao.android.goodprice.homepage.service.impl.bizservice.request.BxUploadParams;
import com.taobao.android.goodprice.homepage.service.protocol.IGoodPriceBizService;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.ljd;
import tb.ljs;
import tb.llb;
import tb.lli;
import tb.llu;

/* loaded from: classes5.dex */
public class GoodPriceBizServiceImpl implements IGoodPriceBizService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ljs mInfoFlowContext;
    private llb mPageLifeCycle;
    private IContainerDataService.c mRequestBizParamsCreator;
    private IContainerDataService.d mRequestCommonBizParamsCreator;
    private b mSearchBackSmartRefresher;
    private IMainFeedsLoopStartStopService.a mStartAndStopListener;

    static {
        kge.a(1006804235);
        kge.a(-1667217865);
    }

    public static /* synthetic */ b access$000(GoodPriceBizServiceImpl goodPriceBizServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("fb2b6891", new Object[]{goodPriceBizServiceImpl}) : goodPriceBizServiceImpl.mSearchBackSmartRefresher;
    }

    public static /* synthetic */ Map access$100(GoodPriceBizServiceImpl goodPriceBizServiceImpl, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b64115c", new Object[]{goodPriceBizServiceImpl, map}) : goodPriceBizServiceImpl.removeBizParams(map);
    }

    public static /* synthetic */ void access$200(GoodPriceBizServiceImpl goodPriceBizServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd7a87fd", new Object[]{goodPriceBizServiceImpl});
        } else {
            goodPriceBizServiceImpl.uploadBxFeatureOnPause();
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
        this.mSearchBackSmartRefresher = new b(ljsVar);
        registerRequestBizParamsCreator(this.mInfoFlowContext);
        registerInfoFlowVisibleListener(this.mInfoFlowContext);
        registerHomeLeaveListener(this.mInfoFlowContext);
        registerRequestCommonBizParamsCreator(this.mInfoFlowContext);
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
        unRegisterRequestCommonBizParamsCreator(this.mInfoFlowContext);
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
        this.mRequestBizParamsCreator = createRequestBizParamsCreator();
        iContainerDataService.addRequestBizParamsCreator(this.mRequestBizParamsCreator);
    }

    private void registerRequestCommonBizParamsCreator(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f17e1d2c", new Object[]{this, ljsVar});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return;
        }
        this.mRequestCommonBizParamsCreator = createRequestCommonBizParamsCreator();
        iContainerDataService.addRequestCommonBizParamsCreator(this.mRequestCommonBizParamsCreator);
    }

    private void unRegisterRequestBizParamsCreator(ljs ljsVar) {
        IContainerDataService.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eac68a48", new Object[]{this, ljsVar});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (iContainerDataService == null || (cVar = this.mRequestBizParamsCreator) == null) {
            return;
        }
        iContainerDataService.removeRequestBizParamsCreator(cVar);
        this.mRequestBizParamsCreator = null;
    }

    private IContainerDataService.c createRequestBizParamsCreator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.c) ipChange.ipc$dispatch("70453300", new Object[]{this}) : new IContainerDataService.c() { // from class: com.taobao.android.goodprice.homepage.service.impl.bizservice.GoodPriceBizServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
            public Map<String, String> a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Map) ipChange2.ipc$dispatch("add74dce", new Object[]{this, lliVar, str}) : GoodPriceBizServiceImpl.access$100(GoodPriceBizServiceImpl.this, GoodPriceBizServiceImpl.access$000(GoodPriceBizServiceImpl.this).a(str));
            }
        };
    }

    private IContainerDataService.d createRequestCommonBizParamsCreator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.d) ipChange.ipc$dispatch("6ae979aa", new Object[]{this}) : new IContainerDataService.d() { // from class: com.taobao.android.goodprice.homepage.service.impl.bizservice.GoodPriceBizServiceImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.d
            public Map<String, String> a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Map) ipChange2.ipc$dispatch("add74dce", new Object[]{this, lliVar, str}) : llu.c() ? new c().b(str) : new HashMap();
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
        return ipChange instanceof IpChange ? (IMainFeedsLoopStartStopService.a) ipChange.ipc$dispatch("1d46fd73", new Object[]{this}) : new IMainFeedsLoopStartStopService.a() { // from class: com.taobao.android.goodprice.homepage.service.impl.bizservice.GoodPriceBizServiceImpl.3
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
                    GoodPriceBizServiceImpl.access$000(GoodPriceBizServiceImpl.this).b(str);
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

    private void unRegisterRequestCommonBizParamsCreator(ljs ljsVar) {
        IContainerDataService.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c4d793", new Object[]{this, ljsVar});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (iContainerDataService == null || (dVar = this.mRequestCommonBizParamsCreator) == null) {
            return;
        }
        iContainerDataService.removeRequestCommonBizParamsCreator(dVar);
        this.mRequestCommonBizParamsCreator = null;
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

    private Map<String, String> removeBizParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6278781e", new Object[]{this, map});
        }
        if (llu.c()) {
            if (map == null) {
                map = new HashMap<>();
            }
            for (String str : OrangeConfig.getInstance().getConfig(llu.GOOD_PRICE_ORANGE_CONFIG, "removeBizParams", "latestHundredItem").split(",")) {
                map.put(str, "");
            }
        }
        return map;
    }

    private void uploadBxFeatureOnPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf8aa1f", new Object[]{this});
        } else if (!"true".equals(OrangeConfig.getInstance().getConfig(llu.GOOD_PRICE_ORANGE_CONFIG, "uploadPageLeaveBx", "true"))) {
        } else {
            ljd.a().a(new Runnable() { // from class: com.taobao.android.goodprice.homepage.service.impl.bizservice.GoodPriceBizServiceImpl.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        Map<String, String> b = new c().b("pageLeave");
                        if (b == null) {
                            return;
                        }
                        new BxUploadClient().execute(new BxUploadParams("39522", JSON.toJSONString(b)), null, null);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    private llb createPageLifeCycle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (llb) ipChange.ipc$dispatch("414e763e", new Object[]{this}) : new llb() { // from class: com.taobao.android.goodprice.homepage.service.impl.bizservice.GoodPriceBizServiceImpl.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.llb
            public /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
                llb.CC.$default$onActivityResult(this, i, i2, intent);
            }

            @Override // tb.llb
            public /* synthetic */ void onColdStartResume() {
                llb.CC.$default$onColdStartResume(this);
            }

            @Override // tb.llb
            public void onDestroy() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6532022", new Object[]{this});
                }
            }

            @Override // tb.llb
            public void onDestroyView() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1b8f9ee7", new Object[]{this});
                }
            }

            @Override // tb.llb
            public void onNewIntent(Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b57eb01", new Object[]{this, intent});
                }
            }

            @Override // tb.llb
            public void onRestart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4c630bb7", new Object[]{this});
                }
            }

            @Override // tb.llb
            public void onResume() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a5d6cd73", new Object[]{this});
                }
            }

            @Override // tb.llb
            public void onStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7f2d84ca", new Object[]{this});
                }
            }

            @Override // tb.llb
            public void onStop() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b3dde88", new Object[]{this});
                }
            }

            @Override // tb.llb
            public void onWillExit() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3bc02c16", new Object[]{this});
                }
            }

            @Override // tb.llb
            public void onPause() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2f87fc5e", new Object[]{this});
                    return;
                }
                GoodPriceBizServiceImpl.access$000(GoodPriceBizServiceImpl.this).b(IMainFeedsLoopStartStopService.a.PAGE_SWITCH);
                if (!llu.c()) {
                    return;
                }
                GoodPriceBizServiceImpl.access$200(GoodPriceBizServiceImpl.this);
            }
        };
    }
}
