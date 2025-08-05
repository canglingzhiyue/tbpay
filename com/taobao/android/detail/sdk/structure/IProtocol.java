package com.taobao.android.detail.sdk.structure;

import com.taobao.android.detail.sdk.model.template.ActionModel;
import com.taobao.android.detail.sdk.model.template.RuleModel;

/* loaded from: classes4.dex */
public interface IProtocol {
    ActionModel findActionByKey(String str);

    RuleModel findRuleById(String str, String str2);

    String getRuleIdKey();
}
