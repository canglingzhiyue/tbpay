package com.taobao.trtc.accs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.trtc.utils.TrtcLog;
import tb.kge;

/* loaded from: classes9.dex */
public class TrtcAccsConnectionBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CONNECTION_OFF = -1;
    public static final int CONNECTION_ON = 1;
    public static final int CONNECTION_UNKNOWN = 0;

    /* renamed from: a  reason: collision with root package name */
    public static int f23002a;

    static {
        kge.a(1202754405);
        f23002a = 0;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        intent.getAction();
        TaoBaseService.ConnectInfo connectInfo = (TaoBaseService.ConnectInfo) intent.getSerializableExtra(Constants.KEY_CONNECT_INFO);
        if (connectInfo == null || TextUtils.isEmpty(connectInfo.host)) {
            return;
        }
        TrtcLog.b("AccsConnectionBroadcastReceiver", "onReceive: " + connectInfo.host);
        if (!connectInfo.host.equals("https://msgacs.m.taobao.com") && !connectInfo.host.equals("https://msgacs.wapa.taobao.com")) {
            return;
        }
        TrtcLog.b("AccsConnectionBroadcastReceiver", "ACCS CONNECT INFO: " + connectInfo.connected);
        if (connectInfo.connected) {
            f23002a = 1;
            return;
        }
        TrtcLog.b("AccsConnectionBroadcastReceiver", "ACCS CONNECT ERROR DETAIL: " + connectInfo.errordetail);
        f23002a = -1;
    }
}
