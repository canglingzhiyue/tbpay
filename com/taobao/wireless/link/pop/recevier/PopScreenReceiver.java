package com.taobao.wireless.link.pop.recevier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.pop.a;
import tb.kge;
import tb.rkg;

/* loaded from: classes.dex */
public class PopScreenReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-766068633);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (StringUtils.isEmpty(intent.getAction())) {
        } else {
            rkg.a("link_tag", "PopScreenReceiver === onReceive == 手机解锁，开始检测是否有可展示的pop消息");
            a.a().a(context, 3);
        }
    }
}
