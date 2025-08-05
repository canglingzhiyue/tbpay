package com.taobao.tao.adapter.biz.weex.module;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.config.a;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;
import tb.kge;

/* loaded from: classes8.dex */
public class ShareGiftWeexModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1462501845);
    }

    @WXModuleAnno
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(a.a()).sendBroadcast(new Intent("share_receiver_close_share_menu"));
        }
    }
}
