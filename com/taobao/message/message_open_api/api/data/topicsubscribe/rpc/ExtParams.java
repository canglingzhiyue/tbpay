package com.taobao.message.message_open_api.api.data.topicsubscribe.rpc;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class ExtParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String ori_id;

    static {
        kge.a(-1470645246);
    }

    public void setOri_id(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("366e4e27", new Object[]{this, str});
        } else {
            this.ori_id = str;
        }
    }

    public String getOri_id() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a1c4452f", new Object[]{this}) : this.ori_id;
    }
}
