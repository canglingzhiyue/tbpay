package com.taobao.tbpoplayer.nativerender.dsl;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class ActionsItemModel implements INativeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "content")
    public List<ActionModel> content;
    @JSONField(name = "countTire")
    public Boolean countTire;
    @JSONField(name = "id")
    public String id;
    @JSONField(name = "neverShow")
    public String neverShow;
    @JSONField(name = "startActions")
    public List<String> startActions;
    @JSONField(name = "type")
    public String type = "click";
    @JSONField(name = "userResult")
    public String userResult;

    static {
        kge.a(-830301217);
        kge.a(310138031);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        List<ActionModel> list;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.type) && (list = this.content) != null && !list.isEmpty();
    }
}
