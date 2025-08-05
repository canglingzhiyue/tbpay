package com.taobao.login4android.monitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.TaoBaoLoginInitializer;
import com.taobao.login4android.log.LoginTLogAdapter;
import tb.kge;

@Deprecated
/* loaded from: classes7.dex */
public class DelayLoginReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "login.DelayLogin";

    static {
        kge.a(-654988120);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        LoginTLogAdapter.trace(TAG, "DelayLoginReceiver onReceive: ");
        try {
            TaoBaoLoginInitializer.init(context);
            UserTrackAdapter.sendUserTrack(UTConstant.PageName.UT_PAGE_EXTEND, "DelayLoginReceiver_onReceive", null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
