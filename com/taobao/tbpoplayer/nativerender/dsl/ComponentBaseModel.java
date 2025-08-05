package com.taobao.tbpoplayer.nativerender.dsl;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.common.MUSConstants;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class ComponentBaseModel implements INativeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = MUSConstants.ALT)
    public String alt;
    @JSONField(name = "animation")
    public List<AnimationModel> animation;
    @JSONField(name = "id")
    public String id;
    @JSONField(name = "type")
    public String type;
    @JSONField(name = "vCondition")
    public ConditionModel vCondition;

    static {
        kge.a(-1867359903);
        kge.a(310138031);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
