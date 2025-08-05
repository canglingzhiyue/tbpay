package com.alipay.mobile.verifyidentity.utils;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alipay.mobile.intelligentdecision.callback.IDResultListener;
import com.alipay.mobile.intelligentdecision.engine.DecisionEngine;
import com.alipay.mobile.intelligentdecision.model.ConfigEntity;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class IDecisionHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String PWD_ENTER_ACTION = "pwd_enter";
    public static String PWD_EXIT_ACTION = "pwd_exit";
    public static String VI_ENTER_ACTION = "vi_enter";
    public static String VI_EXIT_ACTION = "vi_exit";

    /* renamed from: a  reason: collision with root package name */
    private static final String f6099a = "IDecisionHelper";

    /* loaded from: classes3.dex */
    public interface IDResultCallBack {
        void onDesicionResult(boolean z, String str, Bundle bundle);
    }

    public void recordBehavior(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("852842f2", new Object[]{this, str, str2, str3, str4});
        }
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : f6099a;
    }

    public void handleIDecision(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee053fc2", new Object[]{this, str, jSONObject});
            return;
        }
        try {
            String string = jSONObject.getString("userId");
            if (TextUtils.isEmpty(string)) {
                string = "";
            }
            DecisionEngine.a(MicroModuleContext.getInstance().getContext());
            DecisionEngine.a(string);
            JSONObject jSONObject2 = jSONObject.getJSONObject("clientDecisionConfig");
            if (jSONObject2 == null) {
                return;
            }
            DecisionEngine.a(MicroModuleContext.getInstance().getContext());
            DecisionEngine.a((HashMap) JSON.parseObject(jSONObject2.toJSONString(), new TypeReference<HashMap<String, ConfigEntity>>() { // from class: com.alipay.mobile.verifyidentity.utils.IDecisionHelper.1
            }, new Feature[0]));
        } catch (Throwable th) {
            String str2 = f6099a;
            VerifyLogCat.w(str2, "handleIDecision error:" + th.getMessage());
        }
    }

    public void saveFeature(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6aa90a", new Object[]{this, new Long(j), str, str2, str3, str4, str5, str6, str7});
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putLong("spendTime", j);
            bundle.putString("result", str);
            bundle.putString("uid", VIUtils.getUserId());
            bundle.putString("action", str2);
            bundle.putString("extend1", str3);
            bundle.putString("extend2", str4);
            bundle.putString("extend3", str5);
            bundle.putString("cancel_type", str6);
            bundle.putString("sceneId", str7);
            String str8 = f6099a;
            VerifyLogCat.i(str8, "saveFeature cancel_type:" + str6 + ", sceneid:" + str7);
            DecisionEngine.a(MicroModuleContext.getInstance().getContext());
            DecisionEngine.a(bundle);
        } catch (Throwable th) {
            String str9 = f6099a;
            VerifyLogCat.w(str9, "saveFeature error:" + th.getMessage());
        }
    }

    public static void sendLocalBroadcast(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8ed30e3", new Object[]{str, str2, str3});
            return;
        }
        try {
            DecisionEngine.a(MicroModuleContext.getInstance().getContext());
            DecisionEngine.a(str, str2, str3, "", (Bundle) null);
        } catch (Throwable th) {
            String str4 = f6099a;
            VerifyLogCat.i(str4, "sendLocalBroadcast error:" + th.getMessage());
        }
    }

    public static void sendLocalBroadcast(String str, String str2, String str3, String str4, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("571873c7", new Object[]{str, str2, str3, str4, bundle});
            return;
        }
        try {
            DecisionEngine.a(MicroModuleContext.getInstance().getContext());
            DecisionEngine.a(str, str2, str3, str4, bundle);
        } catch (Throwable th) {
            String str5 = f6099a;
            VerifyLogCat.i(str5, "sendLocalBroadcast1 error:" + th.getMessage());
        }
    }

    public void startIDecision(String str, String str2, String str3, Bundle bundle, final IDResultCallBack iDResultCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("108b3c87", new Object[]{this, str, str2, str3, bundle, iDResultCallBack});
            return;
        }
        try {
            DecisionEngine.a(MicroModuleContext.getInstance().getContext()).a(str, str2, str3, bundle, new IDResultListener() { // from class: com.alipay.mobile.verifyidentity.utils.IDecisionHelper.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.intelligentdecision.callback.IDResultListener
                public void onDesicionResult(IDecisionResult iDecisionResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2ee2c78", new Object[]{this, iDecisionResult});
                        return;
                    }
                    VerifyLogCat.i(IDecisionHelper.access$000(), "vi onDecisionREsult");
                    if (iDecisionResult == null) {
                        IDResultCallBack iDResultCallBack2 = iDResultCallBack;
                        if (iDResultCallBack2 == null) {
                            return;
                        }
                        iDResultCallBack2.onDesicionResult(false, null, null);
                        return;
                    }
                    String str4 = iDecisionResult.state;
                    String str5 = iDecisionResult.result;
                    Bundle bundle2 = iDecisionResult.extra;
                    if ("success".equalsIgnoreCase(str4)) {
                        IDResultCallBack iDResultCallBack3 = iDResultCallBack;
                        if (iDResultCallBack3 == null) {
                            return;
                        }
                        iDResultCallBack3.onDesicionResult(true, String.valueOf(str5), bundle2);
                        return;
                    }
                    IDResultCallBack iDResultCallBack4 = iDResultCallBack;
                    if (iDResultCallBack4 == null) {
                        return;
                    }
                    iDResultCallBack4.onDesicionResult(false, null, bundle2);
                }
            });
        } catch (Throwable th) {
            String str4 = f6099a;
            VerifyLogCat.i(str4, "startIDecision error:" + th.getMessage());
            if (iDResultCallBack == null) {
                return;
            }
            iDResultCallBack.onDesicionResult(false, null, null);
        }
    }

    public static String getDecisionVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73083b93", new Object[0]);
        }
        try {
            return DecisionEngine.a();
        } catch (Throwable th) {
            String str = f6099a;
            VerifyLogCat.i(str, "getDecisionVersion error:" + th.getMessage());
            return null;
        }
    }
}
