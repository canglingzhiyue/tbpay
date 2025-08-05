package tb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.a;

/* loaded from: classes6.dex */
public class esv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TAB_BAR_ITEM_STATE_CHANGED = "TBTabBarItemStateChanged";
    public static final String ACTION_UCP_TAB_CONFIG_CHANGE = "UCPTabBarChanged";
    public static final String ACTION_UCP_TAB_INTRODUCTORY_REMOVE = "UCPTabBarShouldRemove";

    public static void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{str, jSONObject});
            return;
        }
        try {
            LocalBroadcastManager.getInstance(a.b()).sendBroadcast(new Intent(str).putExtra("data", jSONObject.toJSONString()));
        } catch (Exception e) {
            TLog.loge(a.a(), "BroadcastUtils", "sendLocalBroadcast error", e);
        }
    }

    public static void a(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        int i2 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e86c6b5", new Object[]{new Integer(i), jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("trackInfo", (Object) jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        switch (i) {
            case 13:
                i2 = 2;
                break;
            case 14:
                break;
            case 15:
                i2 = 3;
                break;
            default:
                i2 = 0;
                break;
        }
        jSONObject3.put("state", (Object) Integer.valueOf(i2));
        jSONObject3.put("value", (Object) jSONObject2);
        a(ACTION_TAB_BAR_ITEM_STATE_CHANGED, jSONObject3);
    }

    public static void a(Context context, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3a954e7", new Object[]{context, broadcastReceiver});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_UCP_TAB_CONFIG_CHANGE);
        LocalBroadcastManager.getInstance(context).registerReceiver(broadcastReceiver, intentFilter);
    }

    public static void b(Context context, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3168cce8", new Object[]{context, broadcastReceiver});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("UCPTabBarShouldRemove");
        LocalBroadcastManager.getInstance(context).registerReceiver(broadcastReceiver, intentFilter);
    }
}
