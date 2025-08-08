package com.taobao.infoflow.core.subservice.biz.rocketservice;

import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IRocketSubService;
import com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.lda;
import tb.ldf;
import tb.ldl;
import tb.liw;
import tb.ljd;
import tb.ljs;
import tb.lkf;
import tb.lks;

/* loaded from: classes.dex */
public class RocketServiceImpl implements IRocketSubService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long REFRESH_DELAY_TIME = 150;
    private static final String TAG = "RocketServiceImpl";
    private ljs mInfoFlowContext;
    private IMainFeedsViewService<?> mMainFeedsViewService;
    private lks<RecyclerView> mRegister;
    private List<IRocketSubService.a> mRocketListeners;
    private a mRocketOnScrollListener;

    static {
        kge.a(-621543283);
        kge.a(-1142269645);
    }

    public static /* synthetic */ ljs access$000(RocketServiceImpl rocketServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljs) ipChange.ipc$dispatch("85130a54", new Object[]{rocketServiceImpl}) : rocketServiceImpl.mInfoFlowContext;
    }

    public static /* synthetic */ void access$100(RocketServiceImpl rocketServiceImpl, ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0b0e2f7", new Object[]{rocketServiceImpl, ljsVar});
        } else {
            rocketServiceImpl.callRefresh(ljsVar);
        }
    }

    public static /* synthetic */ void access$200(RocketServiceImpl rocketServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8e5c4f9", new Object[]{rocketServiceImpl, new Boolean(z)});
        } else {
            rocketServiceImpl.notifyHostRocketState(z);
        }
    }

    public static /* synthetic */ void access$300(RocketServiceImpl rocketServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d95f1afa", new Object[]{rocketServiceImpl, new Boolean(z)});
        } else {
            rocketServiceImpl.notifyRocketStateChange(z);
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
        this.mMainFeedsViewService = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        if (this.mMainFeedsViewService == null) {
            ldf.d(TAG, "onCreateService mainFeedsViewService == null");
            return;
        }
        this.mRocketOnScrollListener = new a(ljsVar, createOnRocketListener());
        this.mRegister = this.mMainFeedsViewService.mo1084getLifeCycleRegister();
        this.mRegister.a(this.mRocketOnScrollListener);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        lks<RecyclerView> lksVar = this.mRegister;
        if (lksVar != null && (aVar = this.mRocketOnScrollListener) != null) {
            lksVar.b(aVar);
        }
        List<IRocketSubService.a> list = this.mRocketListeners;
        if (list == null) {
            return;
        }
        list.clear();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IRocketSubService
    public void onClickRocket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ace924", new Object[]{this});
        } else if (isMulticlassContentKeepOut(this.mInfoFlowContext)) {
        } else {
            IMainFeedsViewService<?> iMainFeedsViewService = this.mMainFeedsViewService;
            if (iMainFeedsViewService != null) {
                iMainFeedsViewService.scrollToTop();
            }
            final String c = this.mInfoFlowContext.a().c();
            ldl.a(c, 2101, "Button-Top", "", "", null);
            lda.a(c, "Button-Top", null, null);
            if (!isOnRocketState()) {
                ldl.a(c, 2101, "Page_Home_Button-rocket_refresh", "", "", null);
                callRefresh(this.mInfoFlowContext);
            }
            if (checkEnableRocketRefreshDirectly() && isOnRocketState()) {
                ljd.a().a(new Runnable() { // from class: com.taobao.infoflow.core.subservice.biz.rocketservice.RocketServiceImpl.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ldl.a(c, 2101, "Page_Home_Button-rocket_refresh", "", "", null);
                        RocketServiceImpl rocketServiceImpl = RocketServiceImpl.this;
                        RocketServiceImpl.access$100(rocketServiceImpl, RocketServiceImpl.access$000(rocketServiceImpl));
                    }
                }, 150L);
            }
            liw.a(this.mInfoFlowContext);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IRocketSubService
    public boolean isOnRocketState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f6f1c3f", new Object[]{this})).booleanValue() : this.mRocketOnScrollListener.a();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IRocketSubService
    public int getRocketAnchorPosition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1cb17e2", new Object[]{this})).intValue() : this.mRocketOnScrollListener.b();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IRocketSubService
    public void addRocketListener(IRocketSubService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("677f43e1", new Object[]{this, aVar});
            return;
        }
        if (this.mRocketListeners == null) {
            this.mRocketListeners = new ArrayList();
        }
        this.mRocketListeners.add(aVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IRocketSubService
    public void removeRocketListener(IRocketSubService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd8131e", new Object[]{this, aVar});
            return;
        }
        List<IRocketSubService.a> list = this.mRocketListeners;
        if (list == null) {
            return;
        }
        list.remove(aVar);
    }

    private IRocketSubService.a createOnRocketListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IRocketSubService.a) ipChange.ipc$dispatch("fe38c48b", new Object[]{this}) : new IRocketSubService.a() { // from class: com.taobao.infoflow.core.subservice.biz.rocketservice.RocketServiceImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.IRocketSubService.a
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    return;
                }
                RocketServiceImpl.access$200(RocketServiceImpl.this, z);
                RocketServiceImpl.access$300(RocketServiceImpl.this, z);
            }
        };
    }

    private void notifyRocketStateChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96f9a1c9", new Object[]{this, new Boolean(z)});
            return;
        }
        List<IRocketSubService.a> list = this.mRocketListeners;
        if (list == null) {
            return;
        }
        for (IRocketSubService.a aVar : list) {
            aVar.a(z);
        }
    }

    private void notifyHostRocketState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d620de1", new Object[]{this, new Boolean(z)});
            return;
        }
        lkf rocketCallback = getRocketCallback(this.mInfoFlowContext);
        if (rocketCallback == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        rocketCallback.a(z);
        ldf.e(TAG, "setRocketState use time : " + (SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    private boolean isMulticlassContentKeepOut(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("688eb77f", new Object[]{this, ljsVar})).booleanValue();
        }
        IMulticlassTabService iMulticlassTabService = (IMulticlassTabService) ljsVar.a(IMulticlassTabService.class);
        if (iMulticlassTabService == null) {
            ldf.d(TAG, "isHomeTab multiclassTabService == null");
            return false;
        }
        return iMulticlassTabService.isShowTabContent();
    }

    private void callRefresh(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a1fc43f", new Object[]{this, ljsVar});
            return;
        }
        IHostService iHostService = (IHostService) ljsVar.a(IHostService.class);
        if (iHostService == null) {
            ldf.d(TAG, "callRefresh hostService == null");
        } else {
            iHostService.getInvokeCallback().a().a();
        }
    }

    private lkf getRocketCallback(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lkf) ipChange.ipc$dispatch("f122dcae", new Object[]{this, ljsVar});
        }
        IHostService iHostService = (IHostService) ljsVar.a(IHostService.class);
        if (iHostService != null) {
            return iHostService.getInvokeCallback().b();
        }
        return null;
    }

    private boolean checkEnableRocketRefreshDirectly() {
        IContainerDataService iContainerDataService;
        IContainerDataModel containerData;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af07e15d", new Object[]{this})).booleanValue();
        }
        try {
            if (this.mInfoFlowContext != null && (iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class)) != null && (containerData = iContainerDataService.getContainerData()) != null && containerData.getBase() != null && (ext = containerData.getBase().getExt()) != null) {
                return StringUtils.equals("true", ext.getString("rocketDirectRefresh"));
            }
            return false;
        } catch (Exception e) {
            ldf.d(TAG, "parser config failed" + Log.getStackTraceString(e));
            return false;
        }
    }
}
