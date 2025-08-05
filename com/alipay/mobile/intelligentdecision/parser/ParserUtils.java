package com.alipay.mobile.intelligentdecision.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.intelligentdecision.db.model.FeatureModel;
import com.alipay.mobile.intelligentdecision.db.model.RuleModel;
import com.alipay.mobile.intelligentdecision.db.model.StrategyModel;
import com.alipay.mobile.intelligentdecision.log.DecisionLogcat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class ParserUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static StrategyModel a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StrategyModel) ipChange.ipc$dispatch("c0488622", new Object[]{jSONObject, str});
        }
        try {
            StrategyModel strategyModel = new StrategyModel();
            int intValue = jSONObject.getIntValue("version");
            boolean booleanValue = jSONObject.getBooleanValue("enable");
            boolean booleanValue2 = jSONObject.getBooleanValue("monitor");
            boolean booleanValue3 = jSONObject.getBooleanValue("duktape");
            JSONObject jSONObject2 = jSONObject.getJSONObject("failover");
            if (jSONObject2 != null) {
                long longValue = jSONObject2.getLongValue("timeout");
                strategyModel.failover_action = jSONObject2.getString("action");
                strategyModel.failover_timeout = longValue;
            }
            strategyModel.id = str;
            strategyModel.version = intValue;
            strategyModel.enable = booleanValue;
            strategyModel.monitor = booleanValue2;
            strategyModel.duktape = booleanValue3;
            return strategyModel;
        } catch (Throwable unused) {
            DecisionLogcat.b("ParserUtils", "parseStrategy error");
            return null;
        }
    }

    public static ArrayList<RuleModel> a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("89738a76", new Object[]{jSONObject, str, str2});
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(str2);
            if (jSONArray == null) {
                return null;
            }
            ArrayList<RuleModel> arrayList = new ArrayList<>();
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    RuleModel ruleModel = new RuleModel();
                    String string = jSONObject2.getString("id");
                    String string2 = jSONObject2.getString("name");
                    String string3 = jSONObject2.getString("expression");
                    int intValue = jSONObject2.getIntValue("priority");
                    String string4 = jSONObject2.getString("action");
                    if ("tryRules".equalsIgnoreCase(str2)) {
                        ruleModel.istrymode = true;
                    } else {
                        ruleModel.istrymode = false;
                    }
                    ruleModel.id = string;
                    ruleModel.name = string2;
                    ruleModel.expression = string3;
                    ruleModel.priority = intValue;
                    ruleModel.strategy_id = str;
                    ruleModel.features = jSONObject2.getString("features");
                    ruleModel.action = string4;
                    arrayList.add(ruleModel);
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            DecisionLogcat.b("ParserUtils", "parseRules error");
            return null;
        }
    }

    public static ArrayList<FeatureModel> b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("cf20878b", new Object[]{jSONObject, str});
        }
        if (jSONObject != null && jSONObject.containsKey(str)) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray(str);
                if (jSONArray != null && jSONArray.size() > 0) {
                    return a(jSONArray.toJSONString(), "");
                }
            } catch (Throwable unused) {
                DecisionLogcat.b("ParserUtils", "parseCommonFeature error");
            }
        }
        return null;
    }

    public static ArrayList<FeatureModel> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("5ef0db56", new Object[]{str, str2});
        }
        try {
            JSONArray parseArray = JSON.parseArray(str);
            if (parseArray == null) {
                return null;
            }
            ArrayList<FeatureModel> arrayList = new ArrayList<>();
            for (int i = 0; i < parseArray.size(); i++) {
                FeatureModel featureModel = (FeatureModel) JSON.toJavaObject(parseArray.getJSONObject(i), FeatureModel.class);
                if (featureModel != null) {
                    featureModel.rule_id = str2;
                    arrayList.add(featureModel);
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            DecisionLogcat.b("ParserUtils", "parseFeature error");
            return null;
        }
    }
}
