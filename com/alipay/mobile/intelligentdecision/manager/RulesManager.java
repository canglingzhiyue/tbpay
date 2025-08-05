package com.alipay.mobile.intelligentdecision.manager;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alipay.mobile.intelligentdecision.db.model.DecisionModel;
import com.alipay.mobile.intelligentdecision.db.model.FeatureModel;
import com.alipay.mobile.intelligentdecision.db.model.RuleModel;
import com.alipay.mobile.intelligentdecision.db.model.StrategyModel;
import com.alipay.mobile.intelligentdecision.log.DecisionLogcat;
import com.alipay.mobile.intelligentdecision.log.DecisonLogBehavior;
import com.alipay.mobile.intelligentdecision.parser.ParserUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import tb.riy;

/* loaded from: classes3.dex */
public class RulesManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final HashMap<String, String> d;

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<String, ConcurrentHashMap<String, String>> f5748a = new ConcurrentHashMap<>();
    public ConcurrentHashMap<String, ConcurrentHashMap<String, FeatureModel>> b = new ConcurrentHashMap<>();
    public String c;

    /* loaded from: classes3.dex */
    public interface RuleListener {
        void a(Object obj, String str);
    }

    public static /* synthetic */ Object a(RulesManager rulesManager, DecisionModel decisionModel, boolean z, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("45e5cda8", new Object[]{rulesManager, decisionModel, new Boolean(z), str, bundle}) : rulesManager.a(decisionModel, z, str, bundle);
    }

    public static /* synthetic */ ConcurrentHashMap a(RulesManager rulesManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("14d29d79", new Object[]{rulesManager}) : rulesManager.f5748a;
    }

    public static /* synthetic */ ConcurrentHashMap b(RulesManager rulesManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("3e3a1658", new Object[]{rulesManager}) : rulesManager.b;
    }

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        d = hashMap;
        hashMap.put("bizDataPerceiveStrategy", "content://com.alipay.mobile.alertsentry.provider/journal");
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    private Object a(DecisionModel decisionModel, boolean z, String str, Bundle bundle) {
        ArrayList<RuleModel> arrayList;
        int i;
        String str2;
        ArrayList<FeatureModel> arrayList2;
        ArrayList<RuleModel> arrayList3;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c58bb9ed", new Object[]{this, decisionModel, new Boolean(z), str, bundle});
        }
        DecisionLogcat.b("RulesManager", "getDecisonResult");
        StrategyModel strategyModel = decisionModel.getStrategyModel();
        if (z) {
            arrayList = decisionModel.tryRuleMap;
        } else {
            arrayList = decisionModel.ruleMap;
        }
        ArrayList<RuleModel> arrayList4 = arrayList;
        FBDocument.Duktape duktape = null;
        try {
            duktape = FBDocument.createDuk();
        } catch (Throwable unused) {
        }
        FBDocument.Duktape duktape2 = duktape;
        if (duktape2 == null) {
            DecisonLogBehavior.a().a("200221-5", strategyModel.id, str, "createDuk null", "", new HashMap());
            return "EXCEPTION";
        }
        ArrayList<FeatureModel> arrayList5 = decisionModel.commonFeatureMap;
        int i2 = 0;
        while (i2 < arrayList4.size()) {
            RuleModel ruleModel = arrayList4.get(i2);
            if (TextUtils.isEmpty(ruleModel.expression)) {
                ruleModel.expression = "";
            }
            String str3 = ruleModel.expression;
            DecisionLogcat.b("RulesManager", "rule expression:" + str3);
            ArrayList<FeatureModel> a2 = ParserUtils.a(ruleModel.features, ruleModel.id);
            if (a2 == null) {
                a2 = new ArrayList<>();
            }
            ArrayList<FeatureModel> arrayList6 = a2;
            HashMap hashMap = new HashMap();
            Iterator<FeatureModel> it = arrayList6.iterator();
            while (it.hasNext()) {
                FeatureModel next = it.next();
                if (FeatureModel.TYPE_DERIVE.equalsIgnoreCase(next.type)) {
                    a(next);
                    if (next.relay != null && next.relay.size() > 0) {
                        for (int i3 = 0; i3 < next.relay.size(); i3++) {
                            hashMap.put((String) next.relay.get(i3), "");
                        }
                    }
                }
            }
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList7 = new ArrayList();
            if (arrayList5 != null && arrayList5.size() > 0) {
                Iterator<FeatureModel> it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    int i4 = i2;
                    FeatureModel next2 = it2.next();
                    ArrayList<FeatureModel> arrayList8 = arrayList5;
                    next2.isCommon = true;
                    if (!FeatureModel.TYPE_DERIVE.equalsIgnoreCase(next2.type)) {
                        hashMap2.put(next2.id, next2);
                    }
                    StringBuilder sb = new StringBuilder("#{");
                    ArrayList<RuleModel> arrayList9 = arrayList4;
                    sb.append(next2.id);
                    sb.append(riy.BLOCK_END_STR);
                    String sb2 = sb.toString();
                    if (hashMap.containsKey(next2.id)) {
                        arrayList6.add(next2);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (str3.contains(sb2)) {
                        if (!z2) {
                            arrayList6.add(next2);
                        }
                        if (FeatureModel.TYPE_DERIVE.equalsIgnoreCase(next2.type)) {
                            a(next2);
                            if (next2.relay != null) {
                                for (int i5 = 0; i5 < next2.relay.size(); i5++) {
                                    arrayList7.add((String) next2.relay.get(i5));
                                }
                            }
                        }
                    }
                    i2 = i4;
                    arrayList5 = arrayList8;
                    arrayList4 = arrayList9;
                }
            }
            int i6 = i2;
            ArrayList<FeatureModel> arrayList10 = arrayList5;
            ArrayList<RuleModel> arrayList11 = arrayList4;
            Iterator it3 = arrayList7.iterator();
            while (it3.hasNext()) {
                String str4 = (String) it3.next();
                if (hashMap2.containsKey(str4)) {
                    arrayList6.add(hashMap2.get(str4));
                }
            }
            if (arrayList6 != null && arrayList6.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                arrayList2 = arrayList10;
                arrayList3 = arrayList11;
                Object a3 = a(arrayList6, str3, str, ruleModel.id, strategyModel.id, bundle, duktape2);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (a3 != null) {
                    String valueOf = String.valueOf(a3);
                    if ("true".equalsIgnoreCase(valueOf)) {
                        a(ruleModel, strategyModel, str, "true", currentTimeMillis2, bundle);
                        if (!z) {
                            JsV8Manager.a();
                            JsV8Manager.a(duktape2);
                            String str5 = ruleModel.action;
                            if (!TextUtils.isEmpty(str5) && str5.startsWith("#{") && str5.endsWith(riy.BLOCK_END_STR)) {
                                DecisionLogcat.b("RulesManager", "matchAction:" + ruleModel.action);
                                ConcurrentHashMap<String, String> concurrentHashMap = this.f5748a.get(str);
                                if (concurrentHashMap == null) {
                                    return "EXCEPTION";
                                }
                                String substring = ruleModel.action.substring(2, ruleModel.action.length() - 1);
                                DecisionLogcat.b("RulesManager", "matchAction feature_id:" + substring + ", result:" + concurrentHashMap.get(substring));
                                return concurrentHashMap.get(substring);
                            }
                            return ruleModel.action;
                        }
                        str2 = str;
                        i = i6;
                    } else {
                        str2 = str;
                        if ("false".equalsIgnoreCase(valueOf)) {
                            i = i6;
                            if (i == arrayList3.size() - 1) {
                                a(ruleModel, strategyModel, str, valueOf, currentTimeMillis2, bundle);
                                if (!z) {
                                    JsV8Manager.a();
                                    JsV8Manager.a(duktape2);
                                    return "NOT_MATCH";
                                }
                            } else {
                                a(ruleModel, strategyModel, str, valueOf, currentTimeMillis2, bundle);
                            }
                        } else {
                            i = i6;
                            a(ruleModel, strategyModel, str, valueOf, currentTimeMillis2, bundle);
                            if (!z) {
                                JsV8Manager.a();
                                JsV8Manager.a(duktape2);
                                return "EXCEPTION";
                            }
                        }
                    }
                } else {
                    str2 = str;
                    i = i6;
                    a(ruleModel, strategyModel, str, "rule result null", currentTimeMillis2, bundle);
                    if (!z) {
                        JsV8Manager.a();
                        JsV8Manager.a(duktape2);
                        return "EXCEPTION";
                    }
                }
            } else {
                i = i6;
                str2 = str;
                arrayList2 = arrayList10;
                arrayList3 = arrayList11;
                a(ruleModel, strategyModel, str, "feature is null", 0L, bundle);
                if (!z) {
                    JsV8Manager.a();
                    JsV8Manager.a(duktape2);
                    return "EXCEPTION";
                }
            }
            i2 = i + 1;
            arrayList5 = arrayList2;
            arrayList4 = arrayList3;
        }
        JsV8Manager.a();
        JsV8Manager.a(duktape2);
        return strategyModel.failover_action;
    }

    private static void a(RuleModel ruleModel, StrategyModel strategyModel, String str, String str2, long j, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee21b411", new Object[]{ruleModel, strategyModel, str, str2, new Long(j), bundle});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("rule_name", ruleModel.name);
        hashMap.put("rule_action", ruleModel.action);
        hashMap.put("rule_result", str2);
        if (bundle != null && bundle.containsKey("final_expression")) {
            hashMap.put("rule_expression", bundle.getString("final_expression"));
        }
        DecisonLogBehavior.a().a("191121-5", strategyModel.id, str, ruleModel.id, String.valueOf(j), hashMap);
    }

    private static void a(String str, String str2, String str3, FeatureModel featureModel, String str4, long j, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("333d84a1", new Object[]{str, str2, str3, featureModel, str4, new Long(j), str5});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("feature_id", featureModel.id);
        hashMap.put("feature_error", str5);
        hashMap.put("feature_result", str4);
        DecisonLogBehavior a2 = DecisonLogBehavior.a();
        a2.a("191121-6", str, str3, str2 + "_" + featureModel.id, String.valueOf(j), hashMap);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:(2:114|115)|(3:165|166|(17:168|118|119|120|121|(5:150|151|152|153|154)(1:123)|124|125|126|127|128|129|130|131|132|133|113))|117|118|119|120|121|(0)(0)|124|125|126|127|128|129|130|131|132|133|113) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:114|115|(3:165|166|(17:168|118|119|120|121|(5:150|151|152|153|154)(1:123)|124|125|126|127|128|129|130|131|132|133|113))|117|118|119|120|121|(0)(0)|124|125|126|127|128|129|130|131|132|133|113) */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x047f, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0480, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0482, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0484, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0485, code lost:
        r22 = r15;
        r15 = r30;
        r28 = r14;
        r14 = r31;
        r31 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0490, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0495, code lost:
        r22 = r15;
        r13 = r24;
        r15 = r30;
        r28 = r14;
        r14 = r31;
        r31 = r28;
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x04a3, code lost:
        r1 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0411 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object a(java.util.ArrayList<com.alipay.mobile.intelligentdecision.db.model.FeatureModel> r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, android.os.Bundle r35, com.flybird.FBDocument.Duktape r36) {
        /*
            Method dump skipped, instructions count: 1413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.intelligentdecision.manager.RulesManager.a(java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.os.Bundle, com.flybird.FBDocument$Duktape):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a(com.alipay.mobile.intelligentdecision.db.model.FeatureModel r21, android.os.Bundle r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, long r26) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.intelligentdecision.manager.RulesManager.a(com.alipay.mobile.intelligentdecision.db.model.FeatureModel, android.os.Bundle, java.lang.String, java.lang.String, java.lang.String, long):java.lang.String");
    }

    private static void a(FeatureModel featureModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("798b95e1", new Object[]{featureModel});
            return;
        }
        String str = featureModel.content;
        if (TextUtils.isEmpty(str) || !str.contains("#{") || !str.contains(riy.BLOCK_END_STR)) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            int indexOf = str.indexOf("#{");
            int indexOf2 = str.indexOf(riy.BLOCK_END_STR);
            while (indexOf != -1 && indexOf2 != -1) {
                int i = indexOf + 2;
                if (i <= indexOf2) {
                    String substring = str.substring(i, indexOf2);
                    if (!TextUtils.isEmpty(substring) && !substring.contains("#{") && !substring.contains(riy.BLOCK_END_STR) && !jSONArray.contains(substring)) {
                        jSONArray.add(substring);
                    }
                }
                int i2 = indexOf2 + 1;
                indexOf = str.indexOf("#{", i2);
                indexOf2 = str.indexOf(riy.BLOCK_END_STR, i2);
            }
        } catch (Throwable unused) {
        }
        featureModel.relay = jSONArray;
    }

    private static String a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj});
        }
        if (obj == null) {
            return "''";
        }
        if ((obj instanceof Number) || (obj instanceof Boolean)) {
            return String.valueOf(obj);
        }
        if ((obj instanceof String) || (obj instanceof Character)) {
            return "'" + String.valueOf(obj) + "'";
        }
        try {
            return "'" + JSON.toJSONString(obj) + "'";
        } catch (Throwable th) {
            DecisionLogcat.b("RulesManager", "json parse error:" + th.getMessage());
            return String.valueOf(obj);
        }
    }
}
