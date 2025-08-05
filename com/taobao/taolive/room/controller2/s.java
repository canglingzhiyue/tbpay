package com.taobao.taolive.room.controller2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.as;
import tb.kge;

/* loaded from: classes8.dex */
public class s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1867098770);
    }

    public static com.alibaba.triver.triver_shop.container.shopLoft.b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.container.shopLoft.b) ipChange.ipc$dispatch("7c53e469", new Object[0]) : as.h() ? new ShopTwoFloorSingleRoomController() : new TaoLiveShopSingleRoomController();
    }
}
