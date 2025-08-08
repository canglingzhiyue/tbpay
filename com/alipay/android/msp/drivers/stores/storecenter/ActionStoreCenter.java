package com.alipay.android.msp.drivers.stores.storecenter;

import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.drivers.stores.store.events.AuthStore;
import com.alipay.android.msp.framework.hardwarepay.old.dialog.ValidateDialogProxy;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ActionStoreCenter extends StoreCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ValidateDialogProxy e;

    public static /* synthetic */ Object ipc$super(ActionStoreCenter actionStoreCenter, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ActionStoreCenter(MspContext mspContext) {
        super(mspContext);
        this.e = null;
    }

    @Override // com.alipay.android.msp.drivers.stores.storecenter.StoreCenter
    public String handleAction(EventAction eventAction) {
        LocalEventStore a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f20afaca", new Object[]{this, eventAction});
        }
        if (eventAction == null || this.b == null) {
            return "";
        }
        String str = null;
        if (a(eventAction, this.b.getContext())) {
            if (this.b.getWorkerServiceDoc() != null) {
                if (a(eventAction, (EventAction.MspEvent) null)) {
                    return "";
                }
            } else if (((MspWindowClient) this.b.getMspUIClient()).getContainerPresenter() != null) {
                LogUtil.record(2, "getWorkerServiceDoc", "getActionData=" + eventAction.getActionData());
                this.b.getStatisticInfo().addError("np", "event_no_main_service", Utils.truncateString(eventAction.getActionData(), 30));
            }
        }
        a(eventAction);
        EventAction.MspEvent[] mspEvents = eventAction.getMspEvents();
        if (mspEvents != null && mspEvents.length > 0) {
            for (EventAction.MspEvent mspEvent : mspEvents) {
                if (a(eventAction, mspEvent, this.b.getContext())) {
                    if (this.b.getWorkerServiceDoc() != null) {
                        if (a(eventAction, mspEvent)) {
                            continue;
                        }
                    } else if (((MspWindowClient) this.b.getMspUIClient()).getContainerPresenter() != null) {
                        LogUtil.record(2, "getWorkerServiceDoc", "getActionData=" + eventAction.getActionData());
                        this.b.getStatisticInfo().addError("np", "event_no_main_service", mspEvent.getActionName());
                    }
                }
                if (!InvokeActionPlugin.isJsPluginRegisterAsync()) {
                    a2 = this.c.get(mspEvent.getActionName());
                } else {
                    a2 = a(mspEvent.getActionName());
                }
                if (a2 == null) {
                    continue;
                } else if (StringUtils.equals(mspEvent.getActionName(), "submit") && this.b != null && ((MspTradeContext) this.b).isSubmitState()) {
                    return "";
                } else {
                    str = a2.onstMspAction(eventAction, mspEvent);
                }
            }
        }
        return str;
    }

    private LocalEventStore a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalEventStore) ipChange.ipc$dispatch("beae091c", new Object[]{this, str});
        }
        LocalEventStore localEventStore = this.c.get(str);
        if (localEventStore != null) {
            return localEventStore;
        }
        b(str);
        return this.c.get(str);
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        LogUtil.i("ActionStoreCenter", "registerJsPluginWhenHandleAction", "actionName=".concat(String.valueOf(str)));
        if (StringUtils.equals(str, "continue")) {
            return;
        }
        this.b.getStatisticInfo().addError(ErrorType.DEFAULT, "lazy_register_plugin", "pluginName=".concat(String.valueOf(str)));
        InvokeActionPlugin.registerMspLocalJsPluginWithPluginName(this.b, str);
    }

    @Override // com.alipay.android.msp.drivers.stores.storecenter.StoreCenter
    public void doCleanBeforeWindowChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a08f7f", new Object[]{this, new Integer(i)});
            return;
        }
        LocalEventStore localEventStore = null;
        if (!InvokeActionPlugin.isJsPluginRegisterAsync()) {
            localEventStore = this.c.get("auth");
        } else if (this.b instanceof MspTradeContext) {
            localEventStore = a("auth");
        }
        if (!(localEventStore instanceof AuthStore)) {
            return;
        }
        ((AuthStore) localEventStore).beforeFrameChangedClean(i);
    }

    public void setDialog(ValidateDialogProxy validateDialogProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a9335e3", new Object[]{this, validateDialogProxy});
        } else {
            this.e = validateDialogProxy;
        }
    }

    public ValidateDialogProxy getDialog() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ValidateDialogProxy) ipChange.ipc$dispatch("2d2c0609", new Object[]{this}) : this.e;
    }
}
