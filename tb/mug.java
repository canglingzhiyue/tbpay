package tb;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.MytaobaoApplication;
import com.taobao.weex.adapter.IWXUserTrackAdapter;

/* loaded from: classes7.dex */
public class mug {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CLEAR_CACHE = "TB_MYTAOBAO_CLEAR_CACHE";
    public static final String ACTION_EDITION_CODE_CHANGED = "EDITON_SWITCHER_EDITTION_CODE_CHANGED";
    public static final String ACTION_REFRESH_ORDER_NUM = "MyTaobao_Order_Refresh";
    public static final String ACTION_REFRESH_PAGE = "MyTaobao_Page_Refresh";
    public static final String ACTION_REFRESH_PAGE_WHEN_SHOW = "MyTaobao_Page_Refresh_When_Show";
    public static final String ACTION_REVISION_SWITCH = "taobao.action.ACTION_REVISION_SWITCH_CHANGE";
    public static final String ACTION_SCROLL_TO_CARD = "SCROLL_TO_CARD";
    public static final String TAG = "MyTaobaoBroadCastHelper";

    static {
        kge.a(1403822671);
    }

    public static void a(boolean z, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed02c329", new Object[]{new Boolean(z), str, strArr});
            return;
        }
        MytaobaoApplication application = MytaobaoApplication.getApplication();
        if (application == null || str == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction(str);
        if (strArr != null) {
            while (i < strArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append(IWXUserTrackAdapter.MONITOR_ARG);
                int i2 = i + 1;
                sb.append(i2);
                intent.putExtra(sb.toString(), strArr[i]);
                i = i2;
            }
        }
        if (z) {
            LocalBroadcastManager.getInstance(application).sendBroadcast(intent);
        } else {
            application.sendBroadcast(intent);
        }
    }

    public static void a(boolean z, BroadcastReceiver broadcastReceiver, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97750ee4", new Object[]{new Boolean(z), broadcastReceiver, strArr});
            return;
        }
        MytaobaoApplication application = MytaobaoApplication.getApplication();
        if (application == null || strArr == null || broadcastReceiver == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        for (String str : strArr) {
            intentFilter.addAction(str);
        }
        if (z) {
            LocalBroadcastManager.getInstance(application).registerReceiver(broadcastReceiver, intentFilter);
        } else {
            application.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public static void a(boolean z, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578d2a5b", new Object[]{new Boolean(z), broadcastReceiver});
            return;
        }
        try {
            MytaobaoApplication application = MytaobaoApplication.getApplication();
            if (application == null) {
                return;
            }
            if (z) {
                LocalBroadcastManager.getInstance(application).unregisterReceiver(broadcastReceiver);
            } else {
                application.unregisterReceiver(broadcastReceiver);
            }
        } catch (Exception unused) {
        }
    }
}
