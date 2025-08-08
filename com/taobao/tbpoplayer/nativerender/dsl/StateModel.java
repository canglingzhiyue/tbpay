package com.taobao.tbpoplayer.nativerender.dsl;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class StateModel extends StateBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "versions")
    public List<StateVersionModel> versions;

    static {
        kge.a(2071284254);
    }

    public boolean isMultiVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d782b7b4", new Object[]{this})).booleanValue();
        }
        List<StateVersionModel> list = this.versions;
        return list != null && !list.isEmpty();
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel, com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        List<StateVersionModel> list;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.layout) && !StringUtils.isEmpty(this.id) && ((this.children != null && !this.children.isEmpty()) || ((list = this.versions) != null && !list.isEmpty()));
    }
}
