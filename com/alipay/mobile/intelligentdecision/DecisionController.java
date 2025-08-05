package com.alipay.mobile.intelligentdecision;

import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.mobile.intelligentdecision.FutureHelper;
import com.alipay.mobile.intelligentdecision.db.model.DecisionModel;
import com.alipay.mobile.intelligentdecision.db.model.FeatureModel;
import com.alipay.mobile.intelligentdecision.db.model.RuleModel;
import com.alipay.mobile.intelligentdecision.db.model.StrategyModel;
import com.alipay.mobile.intelligentdecision.log.DecisionLogcat;
import com.alipay.mobile.intelligentdecision.log.DecisonLogBehavior;
import com.alipay.mobile.intelligentdecision.manager.DecisionTaskManager;
import com.alipay.mobile.intelligentdecision.manager.RulesManager;
import com.alipay.mobile.intelligentdecision.model.DecisionTask;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.alipay.mobile.intelligentdecision.parser.ParserUtils;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class DecisionController {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AtomicBoolean f5716a = new AtomicBoolean(true);
    public String b;

    public static /* synthetic */ AtomicBoolean a(DecisionController decisionController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("8588f74d", new Object[]{decisionController}) : decisionController.f5716a;
    }

    public static /* synthetic */ void a(DecisionController decisionController, JSONObject jSONObject, DecisionTask decisionTask, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff38b83", new Object[]{decisionController, jSONObject, decisionTask, str});
        } else {
            decisionController.a(jSONObject, decisionTask, str);
        }
    }

    public static /* synthetic */ String b(DecisionController decisionController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4786ebd2", new Object[]{decisionController}) : decisionController.b;
    }

    public final void a(JSONObject jSONObject, final DecisionTask decisionTask, final String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5a5948", new Object[]{this, jSONObject, decisionTask, str});
        } else if (jSONObject == null) {
            IDecisionResult iDecisionResult = new IDecisionResult();
            iDecisionResult.success = false;
            iDecisionResult.state = "error";
            iDecisionResult.errorCode = IDecisionResult.ENGINE_ERROR;
            iDecisionResult.needReport = "N";
            DecisionTaskManager.a().a(str, iDecisionResult, decisionTask);
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            if (jSONObject2 == null) {
                IDecisionResult iDecisionResult2 = new IDecisionResult();
                iDecisionResult2.success = false;
                iDecisionResult2.state = IDecisionResult.STATE_CLOSED;
                iDecisionResult2.needReport = "N";
                DecisionTaskManager.a().a(str, iDecisionResult2, decisionTask);
                return;
            }
            StrategyModel a2 = ParserUtils.a(jSONObject2, str);
            if (a2 == null || !a2.enable) {
                IDecisionResult iDecisionResult3 = new IDecisionResult();
                iDecisionResult3.success = false;
                iDecisionResult3.state = IDecisionResult.STATE_CLOSED;
                iDecisionResult3.needReport = "N";
                DecisionTaskManager.a().a(str, iDecisionResult3, decisionTask);
                return;
            }
            ArrayList<RuleModel> a3 = ParserUtils.a(jSONObject2, str, MspGlobalDefine.RULES);
            if (a3 == null || a3.size() <= 0) {
                IDecisionResult iDecisionResult4 = new IDecisionResult();
                iDecisionResult4.success = false;
                iDecisionResult4.state = IDecisionResult.STATE_CLOSED;
                iDecisionResult4.needReport = "N";
                DecisionTaskManager.a().a(str, iDecisionResult4, decisionTask);
                return;
            }
            ArrayList<RuleModel> a4 = ParserUtils.a(jSONObject2, str, "tryRules");
            ArrayList<FeatureModel> b = ParserUtils.b(jSONObject2, "common_feature");
            final DecisionModel decisionModel = new DecisionModel();
            decisionModel.strategyModel = a2;
            decisionModel.ruleMap = a3;
            decisionModel.tryRuleMap = a4;
            decisionModel.commonFeatureMap = b;
            boolean z2 = a2.duktape;
            String valueOf = String.valueOf(a2.version);
            final long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("strategy_version", valueOf);
            DecisonLogBehavior.a().a("191121-4", str, decisionTask.f5753a, "startRule", String.valueOf(z2), hashMap);
            DecisionLogcat.b("DecisionController", "startRule");
            final RulesManager rulesManager = new RulesManager();
            final String str2 = decisionTask.f5753a;
            String str3 = this.b;
            final Bundle bundle = decisionTask.b;
            RulesManager.RuleListener ruleListener = new RulesManager.RuleListener() { // from class: com.alipay.mobile.intelligentdecision.DecisionController.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
                @Override // com.alipay.mobile.intelligentdecision.manager.RulesManager.RuleListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void a(java.lang.Object r14, java.lang.String r15) {
                    /*
                        Method dump skipped, instructions count: 275
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.intelligentdecision.DecisionController.AnonymousClass2.a(java.lang.Object, java.lang.String):void");
                }
            };
            DecisionLogcat.b("RulesManager", "startRuleDecision");
            StrategyModel strategyModel = decisionModel.getStrategyModel();
            rulesManager.c = str3;
            long j = strategyModel.failover_timeout <= 0 ? 100L : strategyModel.failover_timeout;
            try {
                Object a5 = new FutureHelper().a(new Callable<Object>() { // from class: com.alipay.mobile.intelligentdecision.manager.RulesManager.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ipChange2.ipc$dispatch("6d249ded", new Object[]{this});
                        }
                        try {
                            return RulesManager.a(RulesManager.this, decisionModel, false, str2, bundle);
                        } catch (Throwable th) {
                            return "call exception:" + th.getMessage();
                        }
                    }
                }, j);
                rulesManager.f5748a.remove(str2);
                rulesManager.b.remove(str2);
                String valueOf2 = String.valueOf(a5);
                try {
                    if ("TIME_OUT".equalsIgnoreCase(valueOf2)) {
                        DecisionLogcat.b("RulesManager", "startRuleDecision 3: TIME_OUT");
                        ruleListener.a(strategyModel.failover_action, "TIME_OUT");
                    } else {
                        if (!valueOf2.startsWith("EXCEPTION") && !valueOf2.startsWith("call exception")) {
                            if (valueOf2.startsWith("NOT_MATCH")) {
                                DecisionLogcat.b("RulesManager", "startRuleDecision 4: NOT_MATCH");
                                ruleListener.a(strategyModel.failover_action, "NOT_MATCH");
                            } else {
                                DecisionLogcat.b("RulesManager", "startRuleDecision 5");
                                ruleListener.a(a5, "");
                            }
                        }
                        DecisionLogcat.b("RulesManager", "startRuleDecision 4: EXCEPTION");
                        ruleListener.a(strategyModel.failover_action, "EXCEPTION");
                    }
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    DecisionLogcat.b("RulesManager", "startRuleDecision future error:" + th.getMessage());
                    if (!z) {
                        ruleListener.a("EXCEPTION", "EXCEPTION");
                    }
                    if (decisionModel.tryRuleMap == null) {
                        return;
                    }
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
            if (decisionModel.tryRuleMap == null || decisionModel.tryRuleMap.size() <= 0) {
                return;
            }
            DecisonLogBehavior.a().a("190916-1", decisionModel.getStrategyModel().id, str2, "tryMode", String.valueOf(decisionModel.getStrategyModel().version), new HashMap());
            try {
                final long j2 = j;
                AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.intelligentdecision.manager.RulesManager.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        StrategyModel strategyModel2;
                        IpChange ipChange2 = $ipChange;
                        boolean z3 = true;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        try {
                            Object a6 = new FutureHelper().a(new Callable<Object>() { // from class: com.alipay.mobile.intelligentdecision.manager.RulesManager.2.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        return ipChange3.ipc$dispatch("6d249ded", new Object[]{this});
                                    }
                                    try {
                                        return RulesManager.a(RulesManager.this, decisionModel, true, str2, bundle);
                                    } catch (Throwable th3) {
                                        return "try call exception:" + th3.getMessage();
                                    }
                                }
                            }, j2);
                            RulesManager.a(RulesManager.this).remove(str2);
                            RulesManager.b(RulesManager.this).remove(str2);
                            long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
                            String str4 = "";
                            String str5 = "fail";
                            String valueOf3 = String.valueOf(a6);
                            String str6 = "false";
                            if ("TIME_OUT".equalsIgnoreCase(valueOf3)) {
                                str4 = "4000";
                                strategyModel2 = decisionModel.getStrategyModel();
                            } else {
                                if (!valueOf3.startsWith("EXCEPTION") && !valueOf3.startsWith("call exception")) {
                                    if ("NOT_MATCH".equalsIgnoreCase(valueOf3)) {
                                        valueOf3 = decisionModel.getStrategyModel().failover_action;
                                        str6 = "true";
                                    } else {
                                        str5 = "success";
                                        str6 = "true";
                                        z3 = false;
                                    }
                                    HashMap hashMap2 = new HashMap();
                                    hashMap2.put("errorCode", str4);
                                    hashMap2.put("success", str6);
                                    hashMap2.put("result", valueOf3);
                                    hashMap2.put("state", str5);
                                    hashMap2.put("is_fail_over", String.valueOf(z3));
                                    DecisonLogBehavior.a().a("190916-2", decisionModel.getStrategyModel().id, str2, "", String.valueOf(currentTimeMillis3), hashMap2);
                                }
                                str4 = "4001";
                                strategyModel2 = decisionModel.getStrategyModel();
                            }
                            valueOf3 = strategyModel2.failover_action;
                            HashMap hashMap22 = new HashMap();
                            hashMap22.put("errorCode", str4);
                            hashMap22.put("success", str6);
                            hashMap22.put("result", valueOf3);
                            hashMap22.put("state", str5);
                            hashMap22.put("is_fail_over", String.valueOf(z3));
                            DecisonLogBehavior.a().a("190916-2", decisionModel.getStrategyModel().id, str2, "", String.valueOf(currentTimeMillis3), hashMap22);
                        } catch (Throwable th3) {
                            DecisionLogcat.b("RulesManager", "startTryMode error:" + th3.getMessage());
                        }
                    }
                }, "try task");
            } catch (Throwable th3) {
                DecisionLogcat.b("RulesManager", "startTryMode async task error:" + th3.getMessage());
            }
        }
    }
}
