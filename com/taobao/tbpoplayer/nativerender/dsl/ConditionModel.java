package com.taobao.tbpoplayer.nativerender.dsl;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class ConditionModel implements INativeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "left")
    public String left;
    @JSONField(name = "operator")
    public String operator;
    @JSONField(name = "right")
    public String right;

    static {
        kge.a(1757443284);
        kge.a(310138031);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : (!StringUtils.isEmpty(this.left) || !StringUtils.isEmpty(this.right)) && !StringUtils.isEmpty(this.operator);
    }
}
