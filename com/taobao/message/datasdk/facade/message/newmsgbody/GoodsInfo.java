package com.taobao.message.datasdk.facade.message.newmsgbody;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class GoodsInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String itemId;

    static {
        kge.a(-786712069);
    }

    public String getItemId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this}) : this.itemId;
    }

    public void setItemId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7375121", new Object[]{this, str});
        } else {
            this.itemId = str;
        }
    }
}
