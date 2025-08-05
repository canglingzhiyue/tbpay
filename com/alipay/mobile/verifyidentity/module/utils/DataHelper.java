package com.alipay.mobile.verifyidentity.module.utils;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.smartpays.api.model.FingerprintResult;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannelCallback;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintCheckActivity;
import com.alipay.mobile.verifyidentity.module.zface.ZFaceChecker;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.VIFBPluginManager;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.IDecisionHelper;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class DataHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FACEID_TYPE_INTERNAL_VALUE = "4";
    public static final String FACEID_TYPE_VALUE = "FACEID";
    public static final String FP_ALERT_TEXT = "recoverAlertText";
    public static final String FP_APP_TEXT_KEY = "appText";
    public static final String FP_CHALLENGE_KEY = "challenge";
    public static final String FP_GUIDE_TEXT_KEY = "guideText";
    public static final String FP_MAX_FAIL_TIMES_KEY = "maxFailTimes";
    public static final String FP_NEXT_PRODUCT = "switchOther";
    public static final String FP_PPWFIRST_ORIGIN_DATA_KEY = "ppwFirstOriginData";
    public static final String FP_PRE_DATA_KEY = "predata";
    public static final String FP_RETRY_TEXT_KEY = "retryText";
    public static final String FP_TYPE_INTERNAL_VALUE = "1";
    public static final String FP_TYPE_KEY = "type";
    public static final String FP_TYPE_VALUE = "FP";
    public static final String FP_USER_ID = "USER_ID";
    public static final String MIC_FP_ADAPTER = "micFpAdapter";
    public static final String MIC_FP_INTERFACE = "newFpInterface";
    public static final String WL_TYPE_VALUE = "WL";
    public static final String ZFACE_TYPE_VALUE = "ZFACE";

    /* renamed from: a  reason: collision with root package name */
    private static final String f5937a = "DataHelper";
    public static Map<String, Integer> confResidMap;
    public String alertText;
    public String appText;
    private String b;
    public JSONObject bioProducts;
    public JSONArray bioTypes;
    private int c;
    public String challenge;
    private boolean d;
    public boolean disableSmartSort;
    public String errorForFp;
    public String fingerprintResultData;
    public String guideText;
    public boolean hasOthers;
    public boolean intelligent_enable;
    public boolean isEmbed;
    public boolean isFromUserBack;
    public boolean isFromUserBackNoCashier;
    public boolean isIntelligent;
    public boolean isNewPwd;
    public boolean isPluginMode;
    public boolean isStrategyEnable;
    public String mDecisionTip;
    public String mIdTip;
    public MicroModule mModule;
    public BaseFBPlugin mPlugin;
    public int maxFailTimes;
    public JSONObject moduleDataJson;
    public String mulitiSourceTo;
    public boolean multiBio;
    public boolean needChangeFp;
    public boolean needUseNewFpInterface;
    public JSONObject newPreDataJson;
    public JSONObject newUiParamsObj;
    public String nextproduct;
    public boolean ppwFirst;
    public JSONObject preDataJson;
    public JSONObject predataValue;
    public String predata_type;
    public String proVerifyResult;
    public String retryText;
    public String sourceToPwd;
    public boolean supporNewVerison;
    public String toPwdFormMsp;
    public String userId;
    public ZFaceChecker zFaceChecker;
    public ZimMessageChannelCallback zimMessageChannelCallback;

    /* loaded from: classes3.dex */
    public interface BioCheckCallBack {
        void bioCheckResult(boolean z, boolean z2, boolean z3);
    }

    /* loaded from: classes3.dex */
    public interface DecisionCallback {
        void decisionCallback(boolean z, String str, Bundle bundle);
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : f5937a;
    }

    public DataHelper(MicroModule microModule, String str, BaseFBPlugin baseFBPlugin) {
        this.predataValue = null;
        this.moduleDataJson = null;
        this.fingerprintResultData = "";
        this.challenge = "";
        this.maxFailTimes = 0;
        this.appText = "";
        this.guideText = "";
        this.retryText = "";
        this.predata_type = "";
        this.userId = "";
        this.isEmbed = false;
        this.ppwFirst = false;
        this.proVerifyResult = "";
        this.sourceToPwd = "pwd";
        this.mulitiSourceTo = "";
        this.toPwdFormMsp = "";
        this.hasOthers = false;
        this.needChangeFp = false;
        this.needUseNewFpInterface = false;
        this.supporNewVerison = true;
        this.d = false;
        this.isStrategyEnable = true;
        this.intelligent_enable = true;
        this.disableSmartSort = false;
        this.mModule = microModule;
        this.b = baseFBPlugin.getPluginName();
        this.mPlugin = baseFBPlugin;
        if (this.mPlugin.extParams != null) {
            this.isEmbed = this.mPlugin.extParams.getBoolean("isEmbed");
            VerifyLogCat.i(f5937a, "本次为内嵌指纹模式");
        }
        parseInitData(str);
    }

    public DataHelper(MicroModule microModule, String str) {
        this.predataValue = null;
        this.moduleDataJson = null;
        this.fingerprintResultData = "";
        this.challenge = "";
        this.maxFailTimes = 0;
        this.appText = "";
        this.guideText = "";
        this.retryText = "";
        this.predata_type = "";
        this.userId = "";
        this.isEmbed = false;
        this.ppwFirst = false;
        this.proVerifyResult = "";
        this.sourceToPwd = "pwd";
        this.mulitiSourceTo = "";
        this.toPwdFormMsp = "";
        this.hasOthers = false;
        this.needChangeFp = false;
        this.needUseNewFpInterface = false;
        this.supporNewVerison = true;
        this.d = false;
        this.isStrategyEnable = true;
        this.intelligent_enable = true;
        this.disableSmartSort = false;
        this.mModule = microModule;
        parseInitData(str);
    }

    public DataHelper(MicroModule microModule) {
        this.predataValue = null;
        this.moduleDataJson = null;
        this.fingerprintResultData = "";
        this.challenge = "";
        this.maxFailTimes = 0;
        this.appText = "";
        this.guideText = "";
        this.retryText = "";
        this.predata_type = "";
        this.userId = "";
        this.isEmbed = false;
        this.ppwFirst = false;
        this.proVerifyResult = "";
        this.sourceToPwd = "pwd";
        this.mulitiSourceTo = "";
        this.toPwdFormMsp = "";
        this.hasOthers = false;
        this.needChangeFp = false;
        this.needUseNewFpInterface = false;
        this.supporNewVerison = true;
        this.d = false;
        this.isStrategyEnable = true;
        this.intelligent_enable = true;
        this.disableSmartSort = false;
        this.mModule = microModule;
    }

    public void parseInitData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dda77e", new Object[]{this, str});
            return;
        }
        try {
            parseInitData(str, false);
        } catch (Exception e) {
            VerifyLogCat.e(f5937a, "解析moduledata异常", e);
        }
    }

    public void parseInitData(String str, boolean z) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d7fb16", new Object[]{this, str, new Boolean(z)});
            return;
        }
        this.moduleDataJson = JSON.parseObject(str);
        if (this.moduleDataJson == null) {
            notifyResult(null);
            return;
        }
        if (!TextUtils.isEmpty(this.b)) {
            this.isPluginMode = true;
            this.moduleDataJson.put(VIFBPluginManager.KEY_SOURCE_PLUGIN_NAME, (Object) this.b);
        }
        if (this.moduleDataJson.getJSONObject("predata") == null && !z) {
            VerifyLogCat.w(f5937a, "Predata is null. Go to check pay pwd!");
            goToPayPwd();
            return;
        }
        JSONObject jSONObject3 = this.moduleDataJson.getJSONObject("clientDecisionConfig");
        if (jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject("strategyConfig")) != null && jSONObject2.containsKey("enable")) {
            this.isStrategyEnable = jSONObject2.getBooleanValue("enable");
        }
        if (this.moduleDataJson.containsKey("intelligentEnable")) {
            this.intelligent_enable = this.moduleDataJson.getBooleanValue("intelligentEnable");
        }
        this.hasOthers = VIUtils.hasOtherVerifyProduct(str);
        this.mIdTip = this.moduleDataJson.getString("idTip");
        if (this.moduleDataJson.containsKey(CommonConstant.PPWFIRST)) {
            this.ppwFirst = this.moduleDataJson.getBooleanValue(CommonConstant.PPWFIRST);
        }
        if (this.moduleDataJson.containsKey("isFromUserBackNoCashier")) {
            this.isFromUserBackNoCashier = this.moduleDataJson.getBooleanValue("isFromUserBackNoCashier");
        }
        if (this.moduleDataJson.containsKey(FP_PPWFIRST_ORIGIN_DATA_KEY)) {
            JSONObject jSONObject4 = this.moduleDataJson.getJSONObject(FP_PPWFIRST_ORIGIN_DATA_KEY);
            if (jSONObject4 != null) {
                this.moduleDataJson.remove("predata");
                this.moduleDataJson.put("predata", (Object) jSONObject4.toJSONString());
            }
            this.moduleDataJson.remove(FP_PPWFIRST_ORIGIN_DATA_KEY);
        }
        if (this.moduleDataJson.getJSONObject("predata") != null) {
            this.multiBio = this.moduleDataJson.getJSONObject("predata").getBooleanValue("multiBio");
        }
        if (this.multiBio) {
            this.c = 0;
            this.newPreDataJson = this.moduleDataJson.getJSONObject("predata");
            JSONObject jSONObject5 = this.newPreDataJson;
            if (jSONObject5 != null) {
                this.bioTypes = jSONObject5.getJSONArray("bioTypes");
                this.bioProducts = this.newPreDataJson.getJSONObject("bioProducts");
            }
            JSONArray jSONArray = this.bioTypes;
            if (jSONArray != null && jSONArray.size() > 0 && (jSONObject = this.bioProducts) != null) {
                this.preDataJson = jSONObject.getJSONObject(this.bioTypes.getString(this.c));
            } else {
                this.preDataJson = this.moduleDataJson.getJSONObject("predata");
            }
        } else {
            this.preDataJson = this.moduleDataJson.getJSONObject("predata");
        }
        BaseFBPlugin baseFBPlugin = this.mPlugin;
        if (baseFBPlugin != null) {
            String actConf = baseFBPlugin.getActConf(BaseFBPlugin.ACT_CONF.supportVersion);
            if (TextUtils.isEmpty(actConf) || !"2.0".equalsIgnoreCase(actConf)) {
                this.supporNewVerison = false;
            }
            if ("Y".equalsIgnoreCase(this.mPlugin.getActConf(BaseFBPlugin.ACT_CONF.disableSmartSort))) {
                VerifyLogCat.i(f5937a, "disableSmartSort Y");
                this.disableSmartSort = true;
            }
        }
        this.isNewPwd = true;
        parsePredata();
        this.alertText = this.moduleDataJson.getString(FP_ALERT_TEXT);
        this.nextproduct = this.moduleDataJson.getString("switchOther");
        this.moduleDataJson.remove("predata");
        if (!TextUtils.isEmpty(this.predata_type)) {
            this.sourceToPwd = this.predata_type;
        }
        String str2 = f5937a;
        VerifyLogCat.i(str2, "[服务端下发的] type：" + this.predata_type + "challenge：" + this.challenge + " | appText：" + this.appText + " | guideText：" + this.guideText + " | retryText：" + this.retryText + " | maxFailTimes：" + this.maxFailTimes);
    }

    public void parsePredata() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b866de21", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.preDataJson;
        if (jSONObject != null) {
            this.maxFailTimes = jSONObject.getIntValue(FP_MAX_FAIL_TIMES_KEY);
            this.challenge = this.preDataJson.getString(FP_CHALLENGE_KEY);
            this.appText = this.mModule.getMicroModuleContext().getContext().getString(R.string.fp_tips_app_text);
            this.guideText = this.preDataJson.getString("guideText");
            this.retryText = this.mModule.getMicroModuleContext().getContext().getString(R.string.fp_retry_text);
            this.predata_type = this.preDataJson.getString("type");
            this.userId = this.preDataJson.getString("USER_ID");
            this.needChangeFp = this.preDataJson.getBooleanValue(MIC_FP_ADAPTER);
            this.needUseNewFpInterface = this.preDataJson.getBooleanValue(MIC_FP_INTERFACE);
        }
        if (TextUtils.isEmpty(this.predata_type)) {
            return;
        }
        this.sourceToPwd = this.predata_type;
    }

    public boolean hasNextBio() {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("440af426", new Object[]{this})).booleanValue() : this.multiBio && (jSONArray = this.bioTypes) != null && jSONArray.size() > 1 && this.c < this.bioTypes.size() - 1;
    }

    public String getPreBioType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("379fa5e4", new Object[]{this});
        }
        int i = this.c - 1;
        JSONArray jSONArray = this.bioTypes;
        return (jSONArray == null || i < 0) ? "" : jSONArray.getString(i);
    }

    public String getNextBioType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6de2a3e0", new Object[]{this});
        }
        int i = this.c + 1;
        return i >= 0 ? this.bioTypes.getString(i) : "";
    }

    public void parseOriginData() {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792ace0a", new Object[]{this});
            return;
        }
        this.c = 0;
        if (this.bioProducts == null || (jSONArray = this.bioTypes) == null || jSONArray.size() <= 0) {
            return;
        }
        this.preDataJson = this.bioProducts.getJSONObject(this.bioTypes.getString(this.c));
        parsePredata();
    }

    public void parseNextBio() {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c289269", new Object[]{this});
            return;
        }
        this.c++;
        JSONObject jSONObject = this.bioProducts;
        if (jSONObject == null || (jSONArray = this.bioTypes) == null) {
            return;
        }
        this.preDataJson = jSONObject.getJSONObject(jSONArray.getString(this.c));
        parsePredata();
    }

    public String getViType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("706aeb56", new Object[]{this}) : isFP() ? "fp" : isFACEID() ? BaseFBPlugin.VERIFY_TYPE.faceid : isZFACE() ? "zface" : "";
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e9 -> B:47:0x00f1). Please submit an issue!!! */
    public String getIdTip(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac3e9ef3", new Object[]{this, str, context});
        }
        String str2 = "";
        if (!TextUtils.isEmpty(str) && context != null) {
            try {
                if (!TextUtils.isEmpty(this.mIdTip)) {
                    if (FP_TYPE_VALUE.equalsIgnoreCase(str)) {
                        str2 = this.mIdTip.replace("#product#", context.getResources().getString(R.string.vi_product_fp));
                    } else if (ZFACE_TYPE_VALUE.equalsIgnoreCase(str)) {
                        str2 = this.mIdTip.replace("#product#", context.getResources().getString(R.string.vi_product_zface));
                    } else if (FACEID_TYPE_VALUE.equalsIgnoreCase(str)) {
                        str2 = this.mIdTip.replace("#product#", context.getResources().getString(R.string.vi_product_faceid));
                    } else if ("PWD".equalsIgnoreCase(str)) {
                        str2 = this.mIdTip.replace("#product#", context.getResources().getString(R.string.vi_product_pwd));
                    }
                }
            } catch (Throwable unused) {
                VerifyLogCat.i(f5937a, "替换文案异常");
            }
            try {
                if (TextUtils.isEmpty(str2)) {
                    if (FP_TYPE_VALUE.equalsIgnoreCase(str)) {
                        str2 = context.getResources().getString(R.string.vi_to_fp_intelligent);
                    } else if (ZFACE_TYPE_VALUE.equalsIgnoreCase(str)) {
                        str2 = context.getResources().getString(R.string.vi_to_zface_intelligent);
                    } else if (FACEID_TYPE_VALUE.equalsIgnoreCase(str)) {
                        str2 = context.getResources().getString(R.string.vi_to_faceid_intelligent);
                    } else if ("PWD".equalsIgnoreCase(str)) {
                        str2 = context.getResources().getString(R.string.fp_to_pwd_intelligent);
                    }
                }
            } catch (Throwable unused2) {
                VerifyLogCat.i(f5937a, "本地文案异常");
            }
        }
        return str2;
    }

    public boolean isFP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dab81dff", new Object[]{this})).booleanValue() : FP_TYPE_VALUE.equalsIgnoreCase(this.predata_type) || "1".equalsIgnoreCase(this.predata_type);
    }

    public boolean isWL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f782228a", new Object[]{this})).booleanValue() : WL_TYPE_VALUE.equalsIgnoreCase(this.predata_type);
    }

    public boolean isFACEID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6e707d6d", new Object[]{this})).booleanValue() : FACEID_TYPE_VALUE.equalsIgnoreCase(this.predata_type);
    }

    public boolean isZFACE() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b1804d8", new Object[]{this})).booleanValue() : ZFACE_TYPE_VALUE.equalsIgnoreCase(this.predata_type);
    }

    public boolean isPoPMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0152675", new Object[]{this})).booleanValue() : this.mModule.getTask().getPluginOrProxyMode();
    }

    public void updateTipToPwd(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c54d161", new Object[]{this, str});
        } else {
            this.moduleDataJson.put("pwdTopTip", (Object) str);
        }
    }

    public String buildFpRequestData(String str, boolean z, Object obj, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44fabd3b", new Object[]{this, str, new Boolean(z), obj, str2, new Integer(i), str3});
        }
        this.predataValue = new JSONObject();
        this.predataValue.put("type", (Object) str);
        if (obj != null) {
            this.predataValue.put("success", (Object) String.valueOf(z));
            if (z) {
                this.predataValue.put(InputFrame3.TYPE_RESPONSE, (Object) str2);
            } else {
                this.predataValue.put("code", (Object) String.valueOf(i));
                this.predataValue.put("msg", (Object) str3);
            }
        } else {
            this.predataValue.put("success", (Object) "false");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("predata", (Object) this.predataValue.toJSONString());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("data", (Object) jSONObject.toJSONString());
        this.fingerprintResultData = jSONObject2.toJSONString();
        return this.fingerprintResultData;
    }

    public String buildRequestDataBase(String str, boolean z, Object obj, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f3428c0", new Object[]{this, str, new Boolean(z), obj, str2, new Integer(i), str3});
        }
        this.predataValue = new JSONObject();
        this.predataValue.put("type", (Object) str);
        if (obj != null) {
            this.predataValue.put("success", (Object) Boolean.valueOf(z));
            if (z) {
                JSONObject jSONObject = null;
                try {
                    jSONObject = JSONObject.parseObject(str2);
                } catch (Exception e) {
                    VerifyLogCat.e(f5937a, e.getMessage());
                }
                if (jSONObject != null) {
                    VerifyLogCat.i(f5937a, "response json 反解成功");
                    this.predataValue.put(InputFrame3.TYPE_RESPONSE, (Object) jSONObject);
                } else {
                    this.predataValue.put(InputFrame3.TYPE_RESPONSE, (Object) str2);
                }
            } else {
                this.predataValue.put("code", (Object) Integer.valueOf(i));
                this.predataValue.put("msg", (Object) str3);
            }
        } else {
            this.predataValue.put("success", (Object) false);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("predata", (Object) this.predataValue);
        this.fingerprintResultData = jSONObject2.toJSONString();
        return this.fingerprintResultData;
    }

    public String buildRequestData(String str, boolean z, AuthenticatorResponse authenticatorResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73f3b811", new Object[]{this, str, new Boolean(z), authenticatorResponse});
        }
        if (authenticatorResponse == null) {
            return buildRequestDataBase(str, z, null, null, -1, null);
        }
        return buildRequestDataBase(str, z, authenticatorResponse, authenticatorResponse.getData(), authenticatorResponse.getResult(), authenticatorResponse.getResultMessage());
    }

    public String buildRequestData(boolean z, AuthenticatorResponse authenticatorResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e5b5541b", new Object[]{this, new Boolean(z), authenticatorResponse}) : buildRequestData(FP_TYPE_VALUE, z, authenticatorResponse);
    }

    public String buildRequestData(boolean z, FingerprintResult fingerprintResult) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c3a573b5", new Object[]{this, new Boolean(z), fingerprintResult}) : buildRequestDataBase(FP_TYPE_VALUE, z, fingerprintResult, fingerprintResult.mData, fingerprintResult.mResult, fingerprintResult.mMessage);
    }

    public String buildRequestFpInData(String str, boolean z, AuthenticatorResponse authenticatorResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de433182", new Object[]{this, str, new Boolean(z), authenticatorResponse}) : buildFpRequestData(str, z, authenticatorResponse, authenticatorResponse.getData(), authenticatorResponse.getResult(), authenticatorResponse.getResultMessage());
    }

    public void notifyResult(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("603678e9", new Object[]{this, obj});
        } else {
            notifyResult(obj, false);
        }
    }

    public void notifyResult(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a699570b", new Object[]{this, obj, new Boolean(z)});
        } else {
            notifyResult(obj, z, false);
        }
    }

    public void notifyPluginResult(Object obj, boolean z, boolean z2) {
        ModuleExecuteResult defaultModuleResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc33a7c", new Object[]{this, obj, new Boolean(z), new Boolean(z2)});
            return;
        }
        VerifyLogCat.i(f5937a, "notify fingerprint check result");
        if (obj == null) {
            VerifyLogCat.i(f5937a, "fingerprint check  result is null");
        } else {
            String str = f5937a;
            VerifyLogCat.i(str, "fingerprint check  result：" + obj.toString());
        }
        if (obj instanceof MICRpcResponse) {
            defaultModuleResult = new ModuleExecuteResult();
            defaultModuleResult.setMICRpcResponse((MICRpcResponse) obj);
        } else if (obj instanceof DefaultModuleResult) {
            defaultModuleResult = (DefaultModuleResult) obj;
        } else {
            defaultModuleResult = new DefaultModuleResult("1001");
        }
        VerifyIdentityTask task = this.mModule.getTask();
        if (task != null) {
            if (task.getExtParams() == null) {
                task.setExtParams(new Bundle());
            }
            task.getExtParams().putString(CommonConstant.PRO_VERIFY_TYPE, "pwd");
            task.getExtParams().putString(CommonConstant.PRO_VERIFY_RESULT, this.proVerifyResult);
            if (!TextUtils.isEmpty(this.mulitiSourceTo)) {
                task.getExtParams().putString(CommonConstant.BIO_CHANGE_TYPE, this.mulitiSourceTo.toLowerCase());
            }
        }
        if (z) {
            defaultModuleResult.setLocalTrans(true);
        }
        MicroModuleContext.getInstance().notifyModuleResult(this.mModule.getVerifyId(), this.mModule.getToken(), this.mModule.getModuleName(), defaultModuleResult);
        if (z2) {
            return;
        }
        MicroModuleContext.getInstance().finishModule(this.mModule.getVerifyId(), this.mModule.getToken(), this.mModule.getModuleName());
    }

    public void notifyResult(Object obj, boolean z, boolean z2) {
        ModuleExecuteResult defaultModuleResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c923d29", new Object[]{this, obj, new Boolean(z), new Boolean(z2)});
            return;
        }
        VerifyLogCat.i(f5937a, String.format("needKeepUI: %s, goPwd: %s", Boolean.valueOf(z2), Boolean.valueOf(z)));
        VerifyLogCat.i(f5937a, "notify fingerprint check result");
        if (obj == null) {
            VerifyLogCat.i(f5937a, "fingerprint check  result is null");
        } else {
            String str = f5937a;
            VerifyLogCat.i(str, "fingerprint check  result：" + obj.toString());
        }
        if (obj instanceof MICRpcResponse) {
            defaultModuleResult = new ModuleExecuteResult();
            defaultModuleResult.setMICRpcResponse((MICRpcResponse) obj);
        } else if (obj instanceof DefaultModuleResult) {
            defaultModuleResult = (DefaultModuleResult) obj;
        } else {
            defaultModuleResult = new DefaultModuleResult("1001");
        }
        try {
            VerifyIdentityTask task = this.mModule.getTask();
            if (task != null) {
                if (task.getExtParams() == null) {
                    task.setExtParams(new Bundle());
                }
                if (z) {
                    if (!TextUtils.isEmpty(this.sourceToPwd)) {
                        if ("pwd".equalsIgnoreCase(this.sourceToPwd)) {
                            task.getExtParams().putString(CommonConstant.PRO_VERIFY_TYPE, "pwd");
                        } else {
                            task.getExtParams().putString(CommonConstant.PRO_VERIFY_TYPE, this.sourceToPwd.toLowerCase() + "2pwd");
                        }
                    }
                    if (!TextUtils.isEmpty(this.mulitiSourceTo)) {
                        task.getExtParams().putString(CommonConstant.BIO_CHANGE_TYPE, this.mulitiSourceTo.toLowerCase());
                    }
                    if (!TextUtils.isEmpty(this.toPwdFormMsp)) {
                        task.getExtParams().putString("usePwd", this.toPwdFormMsp);
                    }
                } else {
                    if (!TextUtils.isEmpty(this.predata_type)) {
                        task.getExtParams().putString(CommonConstant.PRO_VERIFY_TYPE, this.predata_type.toLowerCase());
                    }
                    if (!TextUtils.isEmpty(this.mulitiSourceTo)) {
                        task.getExtParams().putString(CommonConstant.BIO_CHANGE_TYPE, this.mulitiSourceTo.toLowerCase());
                    }
                }
                task.getExtParams().putString(CommonConstant.PRO_VERIFY_RESULT, this.proVerifyResult);
            }
        } catch (Throwable unused) {
            VerifyLogCat.i(f5937a, "setExtParams error");
        }
        if (z) {
            defaultModuleResult.setLocalTrans(true);
        }
        VIFBPluginManager.mBackPlugin = null;
        MicroModuleContext.getInstance().notifyModuleResult(this.mModule.getVerifyId(), this.mModule.getToken(), this.mModule.getModuleName(), defaultModuleResult);
        if (z2) {
            return;
        }
        MicroModuleContext.getInstance().finishModule(this.mModule.getVerifyId(), this.mModule.getToken(), this.mModule.getModuleName());
    }

    public void goToPayPwd(String str, Object obj, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25635a1e", new Object[]{this, str, obj, str2, new Integer(i), str3});
            return;
        }
        buildRequestDataBase(str, false, obj, str2, i, str3);
        this.moduleDataJson.put("predata", (Object) this.predataValue);
        goToPayPwd();
    }

    public void goToPayPwd(String str, AuthenticatorResponse authenticatorResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ef975e", new Object[]{this, str, authenticatorResponse});
            return;
        }
        buildRequestData(str, false, authenticatorResponse);
        this.moduleDataJson.put("predata", (Object) this.predataValue);
        goToPayPwd();
    }

    public void goToPayPwd(AuthenticatorResponse authenticatorResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25b5a0a8", new Object[]{this, authenticatorResponse});
            return;
        }
        buildRequestData(false, authenticatorResponse);
        this.moduleDataJson.put("predata", (Object) this.predataValue);
        goToPayPwd();
    }

    public void goToPayPwd(FingerprintResult fingerprintResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908c9268", new Object[]{this, fingerprintResult});
            return;
        }
        buildRequestData(false, fingerprintResult);
        this.moduleDataJson.put("predata", (Object) this.predataValue);
        goToPayPwd();
    }

    public void goToIpayPwd(String str, AuthenticatorResponse authenticatorResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2be23fb", new Object[]{this, str, authenticatorResponse});
            return;
        }
        buildRequestFpInData(str, false, authenticatorResponse);
        this.moduleDataJson.put("predata", (Object) this.predataValue);
        goToPayPwd();
    }

    public void appendPredata() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("641b335a", new Object[]{this});
        } else {
            this.moduleDataJson.put("predata", (Object) this.predataValue);
        }
    }

    public void goToPayPwd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57693d5f", new Object[]{this});
            return;
        }
        this.mModule.needKeepInside.set(false);
        MICRpcResponse mICRpcResponse = new MICRpcResponse();
        mICRpcResponse.verifyId = this.mModule.getVerifyId();
        mICRpcResponse.token = this.mModule.getToken();
        mICRpcResponse.finish = false;
        mICRpcResponse.nextStep = ModuleConstants.VI_MODULE_NAME_PAY_PWD;
        if (!TextUtils.isEmpty(this.mModule.getVerifyId()) && this.mModule.getVerifyId().endsWith("_site")) {
            mICRpcResponse.nextStep = ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD;
        }
        JSONObject jSONObject = this.moduleDataJson;
        if (jSONObject != null) {
            jSONObject.put("sourceToPwd", (Object) this.mModule.getModuleName());
            this.moduleDataJson.put(VIFBPluginManager.KEY_IS_PLUGIN_MODE, (Object) Boolean.valueOf(this.isPluginMode));
            this.moduleDataJson.remove("decisionToPwd");
            this.moduleDataJson.remove("decisionToPwd_action");
        }
        mICRpcResponse.data = JSON.toJSONString(this.moduleDataJson);
        mICRpcResponse.envType = MicroModuleContext.getInstance().getEnvType();
        notifyResult(mICRpcResponse, true);
    }

    public void goToPayPwdWithStr(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f35e9aae", new Object[]{this, str, str2});
        } else {
            goToPayPwdWithStr(str, str2, false);
        }
    }

    public void goToPayPwdWithStr(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78756de6", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        this.mModule.needKeepInside.set(false);
        MICRpcResponse mICRpcResponse = new MICRpcResponse();
        mICRpcResponse.verifyId = this.mModule.getVerifyId();
        mICRpcResponse.token = this.mModule.getToken();
        mICRpcResponse.finish = false;
        mICRpcResponse.nextStep = ModuleConstants.VI_MODULE_NAME_PAY_PWD;
        if (!TextUtils.isEmpty(this.mModule.getVerifyId()) && this.mModule.getVerifyId().endsWith("_site")) {
            mICRpcResponse.nextStep = ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD;
        }
        JSONObject jSONObject = this.moduleDataJson;
        if (jSONObject != null) {
            jSONObject.put("sourceToPwd", (Object) this.mModule.getModuleName());
            this.moduleDataJson.put(VIFBPluginManager.KEY_IS_PLUGIN_MODE, (Object) Boolean.valueOf(this.isPluginMode));
            this.moduleDataJson.put("decisionToPwd", (Object) str2);
            this.moduleDataJson.put("decisionToPwd_action", (Object) str);
            this.moduleDataJson.put("decisionToPwd_backType", (Object) getViType());
            this.moduleDataJson.put("decisionToPwdFromUsePwd", (Object) Boolean.valueOf(z));
        }
        if (this.isPluginMode) {
            String str3 = f5937a;
            VerifyLogCat.i(str3, "current pluginName:" + this.mPlugin.getPluginName());
            DataHelperManager.getInstance().putDataHelper(this.mModule.getVerifyId(), this);
        } else {
            JSONObject jSONObject2 = this.preDataJson;
            if (jSONObject2 != null) {
                this.moduleDataJson.put("predata", (Object) jSONObject2.toJSONString());
            }
            JSONObject jSONObject3 = this.newPreDataJson;
            if (jSONObject3 != null) {
                this.moduleDataJson.put(FP_PPWFIRST_ORIGIN_DATA_KEY, (Object) jSONObject3.toJSONString());
            }
        }
        mICRpcResponse.data = JSON.toJSONString(this.moduleDataJson);
        mICRpcResponse.envType = MicroModuleContext.getInstance().getEnvType();
        notifyPluginResult(mICRpcResponse, true, false);
        FingerprintCheckActivity.removeHelper(this.mModule.getVerifyId());
    }

    public boolean handleZimMessage(MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c555d6a", new Object[]{this, mICRpcResponse})).booleanValue();
        }
        ZFaceChecker zFaceChecker = this.zFaceChecker;
        if (zFaceChecker == null) {
            return false;
        }
        return zFaceChecker.handleZimMessage(mICRpcResponse);
    }

    static {
        HashMap hashMap = new HashMap();
        confResidMap = hashMap;
        hashMap.put(BaseFBPlugin.ACT_CONF.hwPaySuccessText, null);
        confResidMap.put(BaseFBPlugin.ACT_CONF.hwAuthingText, Integer.valueOf(R.string.fp_inputting));
        confResidMap.put(BaseFBPlugin.ACT_CONF.hwPayingText, Integer.valueOf(R.string.fp_server_verifying));
        confResidMap.put(BaseFBPlugin.ACT_CONF.hwRetryText, Integer.valueOf(R.string.fp_retry_text));
        confResidMap.put(BaseFBPlugin.ACT_CONF.hwAuthTip, Integer.valueOf(R.string.plugin_fp_tips));
        confResidMap.put(BaseFBPlugin.ACT_CONF.hwInputPwdTip, Integer.valueOf(R.string.to_pay_pwd));
        confResidMap.put(BaseFBPlugin.ACT_CONF.pwdPlaceHolder, null);
        confResidMap.put(BaseFBPlugin.ACT_CONF.pwdInputBtn, null);
        confResidMap.put(BaseFBPlugin.ACT_CONF.pwdInputTip, null);
        confResidMap.put(BaseFBPlugin.ACT_CONF.loadingPayingText, Integer.valueOf(R.string.fp_server_verifying));
        confResidMap.put(BaseFBPlugin.ACT_CONF.loadingPaySuccessText, null);
    }

    public void logFpResBehavior(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d61fb11f", new Object[]{this, str, str2});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!"server".equalsIgnoreCase(str2)) {
            this.proVerifyResult = str;
        }
        hashMap.put("code", this.proVerifyResult);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("source", str2);
        }
        hashMap.put("module", this.mModule.getModuleName());
        logBehavior("cpzwjyjs", "UC-MobileIC-160321-02", hashMap);
    }

    public void logMultiBioBehavior(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61f912ca", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("code", str);
        hashMap.put("type", str2);
        hashMap.put("module", this.mModule.getModuleName());
        hashMap.put(CommonConstant.BIO_CHANGE_TYPE, (str2 + "2" + str3).toLowerCase());
        try {
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-20191230-2", Constants.VI_ENGINE_APPID, "cpzwjyjs", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
        } catch (Throwable th) {
            VerifyLogCat.w(f5937a, "logBehavior Exception", th);
        }
    }

    public void logFaceBehavior(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd1bea62", new Object[]{this, str, str2, str3, str4});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!"server".equalsIgnoreCase(str2)) {
            this.proVerifyResult = str;
        }
        hashMap.put("code", this.proVerifyResult);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("source", str2);
        }
        hashMap.put("subCode", str4);
        hashMap.put("module", this.mModule.getModuleName());
        hashMap.put("type", str3);
        logBehavior("cpzwjyjs", "UC-MobileIC-160321-02", hashMap);
    }

    public void exceptionLogBehavior(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e99dd938", new Object[]{this, str});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(CommonConstant.EXCEPTION_TYPE, "bio_fp");
        hashMap.put(CommonConstant.EXCEPTION_INFO, str);
        logBehavior(CommonConstant.EXCEPTION_BIZ, CommonConstant.EXCEPTION_CASE_ID, hashMap);
    }

    public void logBehavior(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c7fec42", new Object[]{this, str, str2, hashMap});
            return;
        }
        if (hashMap == null) {
            try {
                hashMap = new HashMap<>();
            } catch (Throwable th) {
                VerifyLogCat.w(f5937a, "logBehavior Exception", th);
                return;
            }
        }
        HashMap<String, String> hashMap2 = hashMap;
        hashMap2.put("type", this.predata_type);
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str2, Constants.VI_ENGINE_APPID, str, this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap2);
    }

    public void startMultiBioDecision(String str, final DecisionCallback decisionCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d83f2b5", new Object[]{this, str, decisionCallback});
            return;
        }
        Bundle bundle = null;
        if (!this.isStrategyEnable || !this.isPluginMode || this.isFromUserBack || !this.isNewPwd || !this.supporNewVerison || this.d || !this.intelligent_enable || this.disableSmartSort) {
            if (decisionCallback == null) {
                return;
            }
            decisionCallback.decisionCallback(true, "", null);
            return;
        }
        VerifyLogCat.i(f5937a, "start startMultiBioDecision");
        try {
            bundle = VIUtils.toBundle(this.moduleDataJson);
        } catch (Throwable unused) {
            VerifyLogCat.i(f5937a, "toBundle error");
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        bundle2.putString("bioType", str);
        System.currentTimeMillis();
        this.d = true;
        new IDecisionHelper().startIDecision(this.mModule.getVerifyId(), "bioPayUsableStrategy", "mobilecashier_mobile_cashier_mobile_cashier_payment_app", bundle2, new IDecisionHelper.IDResultCallBack() { // from class: com.alipay.mobile.verifyidentity.module.utils.DataHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.utils.IDecisionHelper.IDResultCallBack
            public void onDesicionResult(boolean z, String str2, Bundle bundle3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9a05895", new Object[]{this, new Boolean(z), str2, bundle3});
                } else if (!z || TextUtils.isEmpty(str2) || !"false".equalsIgnoreCase(str2)) {
                    DecisionCallback decisionCallback2 = decisionCallback;
                    if (decisionCallback2 == null) {
                        return;
                    }
                    decisionCallback2.decisionCallback(true, "", bundle3);
                } else {
                    DecisionCallback decisionCallback3 = decisionCallback;
                    if (decisionCallback3 == null) {
                        return;
                    }
                    decisionCallback3.decisionCallback(false, "", bundle3);
                }
            }
        });
    }

    public void startDecision(final String str, final DecisionCallback decisionCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c3b504", new Object[]{this, str, decisionCallback});
            return;
        }
        Bundle bundle = null;
        if (!this.isStrategyEnable || !this.isPluginMode || this.isFromUserBack || !this.isNewPwd || !this.supporNewVerison || !this.intelligent_enable || this.disableSmartSort) {
            if (decisionCallback == null) {
                return;
            }
            decisionCallback.decisionCallback(true, "", null);
            return;
        }
        VerifyLogCat.i(f5937a, "start startDecision");
        try {
            bundle = VIUtils.toBundle(this.moduleDataJson);
        } catch (Throwable unused) {
            VerifyLogCat.i(f5937a, "toBundle error");
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        bundle2.putString("bioType", str);
        final long currentTimeMillis = System.currentTimeMillis();
        new IDecisionHelper().startIDecision(this.mModule.getVerifyId(), "bioPayUsableStrategy", "mobilecashier_mobile_cashier_mobile_cashier_payment_app", bundle2, new IDecisionHelper.IDResultCallBack() { // from class: com.alipay.mobile.verifyidentity.module.utils.DataHelper.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.utils.IDecisionHelper.IDResultCallBack
            public void onDesicionResult(boolean z, String str2, Bundle bundle3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9a05895", new Object[]{this, new Boolean(z), str2, bundle3});
                } else if (!z || TextUtils.isEmpty(str2) || !"false".equalsIgnoreCase(str2)) {
                    DecisionCallback decisionCallback2 = decisionCallback;
                    if (decisionCallback2 == null) {
                        return;
                    }
                    decisionCallback2.decisionCallback(true, "", bundle3);
                } else {
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("strategy_name", "bioPayUsableStrategy");
                    hashMap.put("strategy_result", str2);
                    hashMap.put("strategy_cost", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    hashMap.put("bioType", str);
                    if (bundle3 != null) {
                        hashMap.put("strategy_version", bundle3.getString("strategy_version", ""));
                    }
                    DataHelper.this.logBehavior("acat", "UC-MobileIC-191127-01", hashMap);
                    DecisionCallback decisionCallback3 = decisionCallback;
                    if (decisionCallback3 == null) {
                        return;
                    }
                    decisionCallback3.decisionCallback(false, "", bundle3);
                }
            }
        });
    }

    public void startBioCheck(final BioCheckCallBack bioCheckCallBack, final String str) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eed90f0", new Object[]{this, bioCheckCallBack, str});
        } else if (this.multiBio && (jSONArray = this.bioTypes) != null && jSONArray.size() > 0) {
            final long currentTimeMillis = System.currentTimeMillis();
            startMultiBioDecision(this.bioTypes.getString(0), new DecisionCallback() { // from class: com.alipay.mobile.verifyidentity.module.utils.DataHelper.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.module.utils.DataHelper.DecisionCallback
                public void decisionCallback(boolean z, String str2, Bundle bundle) {
                    String str3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("feaa22be", new Object[]{this, new Boolean(z), str2, bundle});
                        return;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    if (z) {
                        bioCheckCallBack.bioCheckResult(true, false, false);
                        return;
                    }
                    try {
                        if (DataHelper.this.bioTypes.size() < 2) {
                            HashMap<String, String> hashMap = new HashMap<>();
                            hashMap.put("strategy_name", "bioPayUsableStrategy");
                            hashMap.put("strategy_result", "false");
                            hashMap.put("strategy_cost", String.valueOf(currentTimeMillis2));
                            hashMap.put("bioType", str);
                            if (bundle != null) {
                                hashMap.put("strategy_version", bundle.getString("strategy_version", ""));
                            }
                            DataHelper.this.logBehavior("acat", "UC-MobileIC-191127-01", hashMap);
                            bioCheckCallBack.bioCheckResult(false, true, false);
                            return;
                        }
                        JSONArray jSONArray2 = new JSONArray();
                        for (int i = 1; i < DataHelper.this.bioTypes.size(); i++) {
                            jSONArray2.add(DataHelper.this.bioTypes.getString(i));
                        }
                        jSONArray2.add(DataHelper.this.bioTypes.getString(0));
                        DataHelper.this.bioTypes = jSONArray2;
                        DataHelper.this.parseOriginData();
                        HashMap<String, String> hashMap2 = new HashMap<>();
                        hashMap2.put("strategy_name", "multiBioStrategy");
                        if (jSONArray2.size() > 1) {
                            hashMap2.put("strategy_result", jSONArray2.getString(0) + "|" + jSONArray2.getString(1));
                            str3 = jSONArray2.getString(1) + "2" + jSONArray2.getString(0);
                        } else {
                            str3 = "";
                        }
                        hashMap2.put("strategy_cost", String.valueOf(currentTimeMillis2));
                        hashMap2.put("bioType", DataHelper.this.bioTypes.toJSONString());
                        hashMap2.put(CommonConstant.BIO_CHANGE_TYPE, str3);
                        if (bundle != null) {
                            hashMap2.put("strategy_version", bundle.getString("strategy_version", ""));
                        }
                        DataHelper.this.logBehavior("acat", "UC-MobileIC-191127-01", hashMap2);
                        DataHelper.this.mulitiSourceTo = str3;
                        bioCheckCallBack.bioCheckResult(false, false, true);
                    } catch (Throwable unused) {
                        bioCheckCallBack.bioCheckResult(true, false, false);
                    }
                }
            });
        } else {
            startDecision(str, new DecisionCallback() { // from class: com.alipay.mobile.verifyidentity.module.utils.DataHelper.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.module.utils.DataHelper.DecisionCallback
                public void decisionCallback(boolean z, String str2, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("feaa22be", new Object[]{this, new Boolean(z), str2, bundle});
                    } else if (z) {
                        bioCheckCallBack.bioCheckResult(true, false, false);
                    } else {
                        bioCheckCallBack.bioCheckResult(false, true, false);
                    }
                }
            });
        }
    }

    public String genErrorMsg(String str, Context context) {
        String string;
        String string2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe8182f2", new Object[]{this, str, context});
        }
        try {
            if (FP_TYPE_VALUE.equalsIgnoreCase(str)) {
                string = context.getResources().getString(R.string.vi_product_fp);
            } else if (FACEID_TYPE_VALUE.equalsIgnoreCase(str)) {
                string = context.getResources().getString(R.string.vi_product_faceid);
            } else {
                string = ZFACE_TYPE_VALUE.equalsIgnoreCase(str) ? context.getResources().getString(R.string.vi_product_zface) : "";
            }
            String format = String.format(context.getResources().getString(R.string.vi_a_fail), string);
            if (isFP()) {
                string2 = context.getResources().getString(R.string.vi_to_fp_product);
            } else if (isZFACE()) {
                string2 = context.getResources().getString(R.string.vi_to_zface_product);
            } else {
                string2 = isFACEID() ? context.getResources().getString(R.string.vi_to_faceid_product) : "";
            }
            return format + string2;
        } catch (Throwable unused) {
            VerifyLogCat.i(f5937a, "生成异常提示信息异常");
            return "";
        }
    }
}
