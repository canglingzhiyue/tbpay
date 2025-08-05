package com.taobao.tbpoplayer.nativerender.dsl;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class ActionModel implements INativeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "autoClose")
    public boolean autoClose;
    @JSONField(name = "behavior")
    public String behavior;
    @JSONField(name = "content")
    public String content;
    @JSONField(name = "countTire")
    public Boolean countTire;
    @JSONField(name = "extraRequests")
    public JSONArray extraRequests;
    @JSONField(name = "fallbackActions")
    public List<String> fallbackActions;
    @JSONField(name = "fallbackNextActions")
    public List<String> fallbackNextActions;
    @JSONField(name = "fallbackToast")
    public String fallbackToast;
    @JSONField(name = "id")
    public String id;
    @JSONField(name = "neverShow")
    public boolean neverShow;
    @JSONField(name = "nextActions")
    public List<String> nextActions;
    @JSONField(name = "preCondition")
    public ConditionModel preCondition;
    @JSONField(name = "target")
    public String target;
    @JSONField(name = "type")
    public String type = "click";
    @JSONField(name = "userResult")
    public String userResult;
    @JSONField(name = "withToast")
    public String withToast;

    static {
        kge.a(337268301);
        kge.a(310138031);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.behavior);
    }
}
