package com.alipay.mobile.intelligentdecision.db.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class DecisionModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<FeatureModel> commonFeatureMap;
    public ArrayList<RuleModel> ruleMap;
    public StrategyModel strategyModel;
    public ArrayList<RuleModel> tryRuleMap;

    public StrategyModel getStrategyModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StrategyModel) ipChange.ipc$dispatch("ac1354d", new Object[]{this});
        }
        if (this.strategyModel == null) {
            this.strategyModel = new StrategyModel();
        }
        return this.strategyModel;
    }
}
