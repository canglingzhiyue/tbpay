package com.alibaba.security.wukong.model.meta;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class Image extends BaseData {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Image(long j) {
        super(j);
    }

    @Override // com.alibaba.security.wukong.model.meta.Data
    public String type() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("426047ff", new Object[]{this}) : "image";
    }
}
