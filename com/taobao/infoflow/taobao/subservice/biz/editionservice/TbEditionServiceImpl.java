package com.taobao.infoflow.taobao.subservice.biz.editionservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IEditionService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.tao.Globals;
import tb.kge;
import tb.ldf;
import tb.ljs;

/* loaded from: classes7.dex */
public class TbEditionServiceImpl implements IEditionService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TbEditionServiceImpl";
    private final BroadcastReceiver areaChangeReceiver = new BroadcastReceiver() { // from class: com.taobao.infoflow.taobao.subservice.biz.editionservice.TbEditionServiceImpl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            ldf.b(TbEditionServiceImpl.TAG, "areaChangeReceiver : " + action);
            if (!StringUtils.equals(action, "EDITON_SWITCHER_EDITTION_CODE_CHANGED")) {
                return;
            }
            TbEditionServiceImpl.access$000(TbEditionServiceImpl.this);
        }
    };
    private boolean isAreaChange;
    private ljs mInfoFlowContext;

    static {
        kge.a(-1831002936);
        kge.a(1815044225);
    }

    public static /* synthetic */ void access$000(TbEditionServiceImpl tbEditionServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92432de2", new Object[]{tbEditionServiceImpl});
        } else {
            tbEditionServiceImpl.processAreaChange();
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
        registerAreaChangeReceiver();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            unRegisterAreaChangeReceiver();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IEditionService
    public boolean editionStatusTrigger(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e84503e9", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            this.isAreaChange = false;
            return false;
        } else if (!this.isAreaChange) {
            ldf.b(TAG, "区域未变化");
            return false;
        } else {
            this.isAreaChange = false;
            return triggerEdition(this.mInfoFlowContext);
        }
    }

    private void registerAreaChangeReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67d790b6", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("EDITON_SWITCHER_EDITTION_CODE_CHANGED");
        Globals.getApplication().registerReceiver(this.areaChangeReceiver, intentFilter);
    }

    private void unRegisterAreaChangeReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c5559af", new Object[]{this});
        } else {
            Globals.getApplication().unregisterReceiver(this.areaChangeReceiver);
        }
    }

    private void processAreaChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a77dcf3", new Object[]{this});
            return;
        }
        this.isAreaChange = true;
        if (!isContainerVisible(this.mInfoFlowContext)) {
            return;
        }
        this.isAreaChange = false;
        triggerEdition(this.mInfoFlowContext);
    }

    private boolean isContainerVisible(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1361d2a1", new Object[]{this, ljsVar})).booleanValue();
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) ljsVar.a(IMainLifecycleService.class);
        if (iMainLifecycleService == null) {
            ldf.d(TAG, "isSelect sceneService == null");
            return true;
        }
        return iMainLifecycleService.isVisible();
    }

    private boolean triggerEdition(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86358d0c", new Object[]{this, ljsVar})).booleanValue();
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.b(TAG, "dataService == null");
            return false;
        }
        return iContainerDataService.triggerEvent("EditionSwitch", null);
    }
}
