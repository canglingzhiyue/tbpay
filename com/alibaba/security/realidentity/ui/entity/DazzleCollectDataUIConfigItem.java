package com.alibaba.security.realidentity.ui.entity;

import com.alibaba.security.realidentity.algo.wrapper.entity.result.DazzleDataConfigItem;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DazzleCollectDataUIConfigItem extends DazzleDataConfigItem {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String title;

    public String getTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this}) : this.title;
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.title = str;
        }
    }
}
