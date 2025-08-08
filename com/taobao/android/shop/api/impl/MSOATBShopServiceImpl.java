package com.taobao.android.shop.api.impl;

import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.c;
import java.io.Serializable;
import java.util.HashMap;
import tb.ixg;
import tb.ixh;
import tb.ixi;
import tb.kge;

/* loaded from: classes6.dex */
public class MSOATBShopServiceImpl implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SUCCESS_MSG = "";
    private static final String SUCCESS_MSG_KEY = "msg";

    static {
        kge.a(79102789);
        kge.a(-1253713245);
        kge.a(1028243835);
    }

    public void exitLoft(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4af3b20", new Object[]{this, str, str2, str3, new Boolean(z)});
            return;
        }
        ixi.a("MSOATBShopServiceImpl::exitLoft begin");
        HashMap hashMap = new HashMap();
        hashMap.put("msg", "shopId=" + str2 + ",homePageId=" + str3 + ", needRefresh=" + z);
        sendBroadcastCloseLoft();
        if (z && !StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str3)) {
            sendBroadcastRefreshHomePage(str2, str3);
        }
        ixi.a("MSOATBShopServiceImpl::exitLoft end");
        c.a().a(str, hashMap);
    }

    private void sendBroadcastRefreshHomePage(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca59f2cb", new Object[]{this, str, str2});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(ixg.f29393a);
        intent.putExtra(ixg.c, str);
        intent.putExtra(ixg.d, str2);
        ixh.a().a(intent);
    }

    private void sendBroadcastCloseLoft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a5d217", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(ixg.b);
        ixh.a().a(intent);
    }
}
