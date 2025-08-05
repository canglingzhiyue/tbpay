package com.taobao.wireless.link.pop.recevier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.wireless.link.pop.a;
import tb.kge;
import tb.rkg;

/* loaded from: classes.dex */
public class AccsConnectReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-270480126);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        TaoBaseService.ConnectInfo connectInfo = (TaoBaseService.ConnectInfo) intent.getExtras().get(Constants.KEY_CONNECT_INFO);
        rkg.a("link_tag", "AccsConnectReceiver === onReceive == accs建连消息返回：" + connectInfo);
        if (connectInfo != null && connectInfo.connected) {
            rkg.a("link_tag", "AccsConnectReceiver === onReceive == accs建连成功，开始检测是否有可展示的pop消息");
            a.a().a(context, 1);
            return;
        }
        rkg.a("link_tag", "AccsConnectReceiver === onReceive == accs断开连接了，connectInfo=" + connectInfo);
    }
}
