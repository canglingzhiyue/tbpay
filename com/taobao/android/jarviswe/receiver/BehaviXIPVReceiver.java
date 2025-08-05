package com.taobao.android.jarviswe.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.feature.a;
import com.taobao.android.jarviswe.tracker.c;
import tb.kge;

/* loaded from: classes5.dex */
public class BehaviXIPVReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f12973a;

    static {
        kge.a(-1265272660);
        f12973a = "BehaviXIPVReceiver";
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle bundleExtra;
        Bundle bundleExtra2;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            if (!"com.taobao.taobao".equals(intent.getPackage()) || (bundleExtra = intent.getBundleExtra(a.TRIGGER_CONTENT)) == null || (bundleExtra2 = intent.getBundleExtra(a.FEATURE_CONTENT)) == null || (string = bundleExtra2.getString(a.FEATURE_JSON)) == null) {
                return;
            }
            String string2 = bundleExtra.getString("scene");
            if (!TextUtils.isEmpty(string2) && string2.equals("Page_NewDetail")) {
                c.a().a(string, bundleExtra);
            } else if (!TextUtils.isEmpty(string2) && string2.equals("Page_Detail")) {
                JSONObject jSONObject = new JSONObject();
                for (String str : bundleExtra.keySet()) {
                    jSONObject.put(str, bundleExtra.get(str));
                }
                com.taobao.android.jarviswe.a.a().a("Page_Detail_Reserve", "TriggerUseBX", jSONObject, null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
