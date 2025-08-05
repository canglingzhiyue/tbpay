package com.taobao.tbpoplayer.nativerender.dsl;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class StateVersionModel extends StateBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "verId")
    public String verId;

    static {
        kge.a(1320097948);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel, com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.verId) && !TextUtils.isEmpty(this.id) && this.children != null && !this.children.isEmpty();
    }
}
