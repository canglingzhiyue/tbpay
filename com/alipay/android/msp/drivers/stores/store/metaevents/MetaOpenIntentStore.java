package com.alipay.android.msp.drivers.stores.store.metaevents;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MetaOpenIntentStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MetaOpenIntentStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        Activity activity;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        try {
            activity = null;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        if (this.f4584a == null) {
            return null;
        }
        if (this.c != null) {
            activity = this.c.getCurrentPresenter().getActivity();
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson != null) {
            z = a(actionParamsJson.getString("package"), actionParamsJson.getString("scheme"), actionParamsJson.getString("extras"), activity);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.valueOf(z));
        return jSONObject.toJSONString();
    }

    private static boolean a(String str, String str2, String str3, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e27f2f1c", new Object[]{str, str2, str3, activity})).booleanValue();
        }
        try {
            Intent intent = new Intent();
            intent.setPackage(str);
            intent.setAction("android.intent.action.VIEW");
            if (!TextUtils.isEmpty(str2)) {
                intent.setData(Uri.parse(str2));
            }
            JSONObject parseObject = JSONObject.parseObject(str3);
            if (parseObject != null) {
                for (String str4 : parseObject.keySet()) {
                    String obj = str4.toString();
                    intent.putExtra(obj, parseObject.getString(obj));
                }
            }
            if (activity == null) {
                return false;
            }
            activity.startActivity(intent);
            return true;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }
}
