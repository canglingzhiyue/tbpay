package com.alipay.android.msp.drivers.stores.store.metaevents;

import android.app.Activity;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogImpl;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class MetaAlertStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean g;

    public MetaAlertStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(final EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.f4584a == null || this.d == null || this.c == null) {
            return null;
        }
        final JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson == null) {
            return "";
        }
        this.g = FlybirdDialogImpl.antDialogEnable(this.d);
        final FlybirdDialogEventDesc.DialogCallback dialogCallback = new FlybirdDialogEventDesc.DialogCallback() { // from class: com.alipay.android.msp.drivers.stores.store.metaevents.MetaAlertStore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc.DialogCallback
            public void onCallback(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bd79f2d5", new Object[]{this, str});
                } else {
                    Utils.sendToDocument(eventAction, str);
                }
            }
        };
        MspBasePresenter currentPresenter = this.c.getCurrentPresenter();
        if (currentPresenter == null) {
            return InvokeActionPlugin.AYSNC_CALLBACK;
        }
        final Activity activity = currentPresenter.getActivity();
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.metaevents.MetaAlertStore.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    MetaAlertStore.a(MetaAlertStore.this, activity, actionParamsJson, dialogCallback);
                }
            }
        });
        return InvokeActionPlugin.AYSNC_CALLBACK;
    }

    public static /* synthetic */ void a(MetaAlertStore metaAlertStore, Activity activity, JSONObject jSONObject, FlybirdDialogEventDesc.DialogCallback dialogCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a348aed", new Object[]{metaAlertStore, activity, jSONObject, dialogCallback});
        } else if (activity != null && !activity.isFinishing() && jSONObject != null) {
            LogUtil.record(1, "MetaAlertStore:showFlybirdDialog", "activity=".concat(String.valueOf(activity)));
            String string = jSONObject.getString("message");
            String string2 = jSONObject.getString("title");
            JSONArray jSONArray = jSONObject.getJSONArray("buttons");
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null && jSONArray.size() > 0) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject2 = new JSONObject();
                    if (metaAlertStore.g) {
                        if (i == 0) {
                            jSONObject2.put("ok", (Object) "1");
                        }
                        jSONObject2.put("index", (Object) String.valueOf(i));
                        jSONObject2.put("clickIndex", (Object) String.valueOf(i + 1));
                    } else {
                        jSONObject2.put("ok", (Object) String.valueOf(i));
                    }
                    arrayList.add(FlybirdDialogEventDesc.build(jSONArray.getString(i), jSONObject2, dialogCallback));
                }
            }
            FlybirdDialogImpl.showDialogV2(activity, string2, string, arrayList);
        }
    }
}
