package com.alipay.android.msp.drivers.stores.store.events;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialog;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogImpl;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public class AlertStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean g;

    public AlertStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(final EventAction eventAction, final EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.f4584a == null || this.c == null || eventAction == null) {
            return null;
        }
        this.g = FlybirdDialogImpl.antDialogEnable(this.d);
        final FlybirdDialogEventDesc.DialogCallback dialogCallback = new FlybirdDialogEventDesc.DialogCallback() { // from class: com.alipay.android.msp.drivers.stores.store.events.AlertStore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc.DialogCallback
            public void onCallback(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bd79f2d5", new Object[]{this, str});
                    return;
                }
                if (!TextUtils.equals(eventAction.getEventFrom(), "invoke")) {
                    if (eventAction.getTemplateClickCallback() != null) {
                        eventAction.getTemplateClickCallback().onClickCallback(str);
                    } else {
                        PluginManager.getRender().callRender(str);
                    }
                }
                Utils.sendToDocument(eventAction, str);
            }
        };
        MspBasePresenter currentPresenter = this.c.getCurrentPresenter();
        if (currentPresenter == null) {
            return InvokeActionPlugin.AYSNC_CALLBACK;
        }
        final Activity activity = currentPresenter.getActivity();
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.AlertStore.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    AlertStore.a(AlertStore.this, activity, mspEvent, dialogCallback);
                }
            }
        });
        return InvokeActionPlugin.AYSNC_CALLBACK;
    }

    public static void showAntDialog(Activity activity, JSONObject jSONObject, FlybirdDialogEventDesc.DialogCallback dialogCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b33561fd", new Object[]{activity, jSONObject, dialogCallback});
        } else {
            LogUtil.record(8, "AlertStore:showAntDialog", "activity=".concat(String.valueOf(activity)));
        }
    }

    public static /* synthetic */ void a(AlertStore alertStore, Activity activity, EventAction.MspEvent mspEvent, FlybirdDialogEventDesc.DialogCallback dialogCallback) {
        boolean z;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bce95952", new Object[]{alertStore, activity, mspEvent, dialogCallback});
        } else if (activity == null || activity.isFinishing()) {
        } else {
            LogUtil.record(1, "AlertStore:showFlybirdDialog", "activity=".concat(String.valueOf(activity)));
            JSONObject actionParamsJson = mspEvent.getActionParamsJson();
            String string = actionParamsJson.getString("title");
            String string2 = actionParamsJson.getString("message");
            String string3 = actionParamsJson.getString(MspFlybirdDefine.FLYBIRD_DIALOG_CANCEL);
            String string4 = actionParamsJson.getString(MspFlybirdDefine.FLYBIRD_DIALOG_OK);
            String string5 = actionParamsJson.getString(MspFlybirdDefine.FLYBIRD_DIALOG_OTHER);
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject2 = null;
            String str = "0";
            if (!TextUtils.isEmpty(string3)) {
                if (alertStore.g) {
                    jSONObject = new JSONObject();
                    jSONObject.put("index", (Object) str);
                    jSONObject.put("clickIndex", (Object) str);
                } else {
                    jSONObject = null;
                }
                arrayList.add(FlybirdDialogEventDesc.build(string3, jSONObject, dialogCallback));
                z = true;
            } else {
                z = false;
            }
            if (!TextUtils.isEmpty(string5)) {
                if (alertStore.g) {
                    jSONObject2 = new JSONObject();
                    jSONObject2.put("index", z ? "2" : "1");
                    jSONObject2.put("clickIndex", (Object) "2");
                }
                arrayList.add(FlybirdDialogEventDesc.build(string5, jSONObject2, dialogCallback));
            }
            if (!TextUtils.isEmpty(string4)) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("ok", (Object) "1");
                if (alertStore.g) {
                    if (z) {
                        str = "1";
                    }
                    jSONObject3.put("index", (Object) str);
                    jSONObject3.put("clickIndex", (Object) "1");
                }
                arrayList.add(FlybirdDialogEventDesc.build(string4, jSONObject3, dialogCallback));
            }
            if (arrayList.size() > 2) {
                Collections.reverse(arrayList);
            }
            FlybirdDialog.showDialogV2(activity, string, string2, arrayList);
        }
    }
}
