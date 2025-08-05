package com.taobao.infoflow.taobao.subservice.biz.clienttoservermonitorservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IClientToServerMonitorService;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.infoflow.taobao.subservice.biz.clienttoservermonitorservice.impl.a;
import tb.kge;
import tb.ldf;
import tb.ldj;
import tb.ljs;
import tb.llb;
import tb.lld;
import tb.lle;
import tb.lng;
import tb.lnh;
import tb.lni;
import tb.lnj;
import tb.lnk;
import tb.qnn;

/* loaded from: classes.dex */
public class ClientToServerMonitorServiceImpl implements IClientToServerMonitorService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ENABLE_OPEN_STABILITY_MONITOR = "enableOpenStabilityMonitor";
    private static final String TAG = "ClientToServerMonitorServiceImpl";
    private IContainerDataService<?> mContainerDataService;
    private IContainerService<?> mContainerService;
    private lng mDataProcessListener;
    private lnh mDxItemClickListener;
    private IDxItemClickService mDxItemClickService;
    private ljs mInfoFlowContext;
    private IMainLifecycleService mMainLifecycleService;
    private llb mPageLifecycleListener;
    private lnj mRequestListener;
    private lld mTabLifeCycle;
    private lnk mUiRefreshListener;

    static {
        kge.a(1760828794);
        kge.a(763754190);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
        } else if (!ldj.a(ENABLE_OPEN_STABILITY_MONITOR, true)) {
            ldf.d(TAG, "orange开关关闭");
        } else {
            this.mInfoFlowContext = ljsVar;
            this.mContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
            this.mContainerService = (IContainerService) this.mInfoFlowContext.a(IContainerService.class);
            this.mDxItemClickService = (IDxItemClickService) this.mInfoFlowContext.a(IDxItemClickService.class);
            this.mMainLifecycleService = (IMainLifecycleService) this.mInfoFlowContext.a(IMainLifecycleService.class);
            a aVar = new a(ljsVar);
            registerRequestListener(this.mContainerDataService, aVar);
            registerDataProcessListener(this.mContainerDataService, aVar);
            registerUiRefreshListener(this.mContainerService, aVar);
            registerDxItemClickListener(this.mDxItemClickService, aVar);
            registerPageLifecycleListener(this.mMainLifecycleService);
            initRegisterTabSelectListener(this.mInfoFlowContext);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unRegisterRequestListener(this.mContainerDataService);
        unRegisterDataProcessListener(this.mContainerDataService);
        unRegisterUiRefreshListener(this.mContainerService);
        unRegisterDxItemClickListener(this.mDxItemClickService);
        unRegisterPageLifecycleListener(this.mMainLifecycleService);
        unRegisterTabSelectListener();
        this.mContainerDataService = null;
        this.mContainerService = null;
        this.mDxItemClickService = null;
        this.mMainLifecycleService = null;
    }

    private void registerRequestListener(IContainerDataService<?> iContainerDataService, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eacc087e", new Object[]{this, iContainerDataService, aVar});
        } else if (iContainerDataService == null) {
            ldf.d(TAG, "registerRequestListener containerDataService == null");
        } else if (this.mRequestListener != null) {
        } else {
            this.mRequestListener = new lnj(aVar, this.mInfoFlowContext);
            iContainerDataService.addRequestListener(this.mRequestListener);
            ldf.d(TAG, "registerRequestListener");
        }
    }

    private void unRegisterRequestListener(IContainerDataService<?> iContainerDataService) {
        lnj lnjVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b5d974", new Object[]{this, iContainerDataService});
        } else if (iContainerDataService == null || (lnjVar = this.mRequestListener) == null) {
        } else {
            iContainerDataService.removeRequestListener(lnjVar);
            this.mRequestListener = null;
            ldf.d(TAG, "unRegisterRequestListener");
        }
    }

    private void registerDataProcessListener(IContainerDataService<?> iContainerDataService, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17ee3fd4", new Object[]{this, iContainerDataService, aVar});
        } else if (iContainerDataService == null) {
            ldf.d(TAG, "registerUiRefreshListener containerDataService == null");
        } else if (this.mDataProcessListener != null) {
        } else {
            this.mDataProcessListener = new lng(aVar, this.mInfoFlowContext);
            iContainerDataService.addDataProcessListener(this.mDataProcessListener);
            ldf.d(TAG, "registerDataProcessListener");
        }
    }

    private void unRegisterDataProcessListener(IContainerDataService<?> iContainerDataService) {
        lng lngVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a52c5e", new Object[]{this, iContainerDataService});
        } else if (iContainerDataService == null || (lngVar = this.mDataProcessListener) == null) {
        } else {
            iContainerDataService.removeDataProcessListener(lngVar);
            this.mDataProcessListener = null;
            ldf.d(TAG, "unRegisterDataProcessListener");
        }
    }

    private void registerUiRefreshListener(IContainerService<?> iContainerService, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50919de0", new Object[]{this, iContainerService, aVar});
        } else if (iContainerService == null) {
            ldf.d(TAG, "registerUiRefreshListener containerService == null");
        } else if (this.mUiRefreshListener != null) {
        } else {
            this.mUiRefreshListener = new lnk(aVar, this.mInfoFlowContext);
            iContainerService.addUiRefreshListener(this.mUiRefreshListener);
            ldf.d(TAG, "registerUiRefreshListener");
        }
    }

    private void unRegisterUiRefreshListener(IContainerService<?> iContainerService) {
        lnk lnkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e39692", new Object[]{this, iContainerService});
        } else if (iContainerService == null || (lnkVar = this.mUiRefreshListener) == null) {
        } else {
            iContainerService.removeUiRefreshListener(lnkVar);
            this.mUiRefreshListener = null;
            ldf.d(TAG, "unRegisterUiRefreshListener");
        }
    }

    private void registerDxItemClickListener(IDxItemClickService iDxItemClickService, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee668d4f", new Object[]{this, iDxItemClickService, aVar});
        } else if (iDxItemClickService == null) {
            ldf.d(TAG, "registerDxItemClickListener dxItemClickService == null");
        } else if (this.mDxItemClickListener != null) {
        } else {
            this.mDxItemClickListener = new lnh(aVar, this.mInfoFlowContext);
            iDxItemClickService.addDxItemClickListener(this.mDxItemClickListener);
            ldf.d(TAG, "registerDxItemClickListener");
        }
    }

    private void unRegisterDxItemClickListener(IDxItemClickService iDxItemClickService) {
        lnh lnhVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("441c6943", new Object[]{this, iDxItemClickService});
        } else if (iDxItemClickService == null || (lnhVar = this.mDxItemClickListener) == null) {
        } else {
            iDxItemClickService.removeDxItemClickListener(lnhVar);
            this.mDxItemClickListener = null;
            ldf.d(TAG, "unRegisterDxItemClickListener");
        }
    }

    private void registerPageLifecycleListener(IMainLifecycleService iMainLifecycleService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("758747d5", new Object[]{this, iMainLifecycleService});
        } else if (iMainLifecycleService == null) {
            ldf.d(TAG, "registerPageLifecycleListener mainLifecycleService == null");
        } else if (this.mPageLifecycleListener != null) {
        } else {
            this.mPageLifecycleListener = new lni(this.mInfoFlowContext.a().c());
            iMainLifecycleService.getPageLifeCycleRegister().a(this.mPageLifecycleListener);
            ldf.d(TAG, "registerPageLifecycleListener");
        }
    }

    private void unRegisterPageLifecycleListener(IMainLifecycleService iMainLifecycleService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a321b4e", new Object[]{this, iMainLifecycleService});
        } else if (iMainLifecycleService == null || this.mPageLifecycleListener == null) {
        } else {
            iMainLifecycleService.getPageLifeCycleRegister().b(this.mPageLifecycleListener);
            this.mPageLifecycleListener = null;
            ldf.d(TAG, "unRegisterPageLifecycleListener");
        }
    }

    private void initRegisterTabSelectListener(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586eff54", new Object[]{this, ljsVar});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) ljsVar.a(IMainLifecycleService.class);
        if (iMainLifecycleService == null) {
            return;
        }
        lle tabLifeCycleRegister = iMainLifecycleService.getTabLifeCycleRegister();
        this.mTabLifeCycle = new qnn(this.mInfoFlowContext.a().c());
        tabLifeCycleRegister.a(this.mTabLifeCycle);
    }

    private void unRegisterTabSelectListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("913ac7d0", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) this.mInfoFlowContext.a(IMainLifecycleService.class);
        if (iMainLifecycleService == null) {
            return;
        }
        iMainLifecycleService.getTabLifeCycleRegister().b(this.mTabLifeCycle);
    }
}
