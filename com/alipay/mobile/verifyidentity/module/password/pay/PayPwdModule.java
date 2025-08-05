package com.alipay.mobile.verifyidentity.module.password.pay;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.data.ModuleDataModel;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.password.pay.model.InitDataModel;
import com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity;
import com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity;
import com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdFullActivity;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.VIFBPluginManager;
import com.alipay.mobile.verifyidentity.utils.IDecisionHelper;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class PayPwdModule extends MicroModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TIP = "pwd_action";
    public static final String ADD_PPW_TEXT = "addPPWText";
    public static final String ADD_PPW_URL = "addPpwUrl";
    public static final String CONTENT = "footRemark";
    public static final String FIND_PWD_TXT = "findPwdTxt";
    public static final String HAS_FORGOT_PWD = "has_forgot_pwd";
    public static final String HAVE_PPW = "havePpw";
    public static final String IS_FIND_PPW = "isFindPPW";
    public static final String IS_SIMPLE_PWD = "isSimplePwd";
    public static final String KEY = "pubKey";
    public static final String LOADING_TIP = "loadingTip";
    public static final String OTHERS = "hasOthers";
    public static final String OTHER_TIP = "pwd_other";
    public static final String PASS_TIP = "pwd_PASS";
    public static final String PREDATA = "predata";
    public static final String PROTOCOL = "pwd_protocol";
    public static final String PROTOCOL_URL = "pwd_protocolUrl";
    public static final String PWD_CONTAINS_GORGET_PWD = "pwd_has_forget";
    public static final String PWD_FROM_MSP = "pwd_from_msp";
    public static final String PWD_HIND_OTHER = "hind_other";
    public static final String PWD_INPUT_TIP = "pwd_input_blew_tip";
    public static final String PWD_MODULE_DATA = "pwd_module_data";
    public static final String PWD_MSP_FORGET_TIP = "pwd_msp_forgot_tip";
    public static final String PWD_MSP_FORGET_TO_VERIFY = "pwd_msp_forgot_to_verify";
    public static final String PWD_TOP_TIP = "pwdTopTip";
    public static final String PWD_USE_DIALOG_PWD = "useDialogPwd";
    public static final String REF = "refer";
    public static final String RESET_PWD = "resetPwd";
    public static final String SCENE_ID = "sceneId";
    public static final String SHOW_FIND_PWD = "showFindPwd";
    public static final String STATE_SECRET_FLAG = "mobileic_payment_password_state_secret";
    public static final String SUBTITLE = "subtitle";
    public static final String SWITCH_OTHER = "switchOther";
    public static final String TIMESTAMP = "timestamp";
    public static final String TITLE = "title";
    public static final String UNINTERRUPT = "uninterrupt";
    public static final String USERNAME = "username";

    /* renamed from: a  reason: collision with root package name */
    private static final String f5918a = "PayPwdModule";
    private Class<? extends AbsPayPwdActivity> b;
    private Bundle c;
    private boolean d;
    private String e;

    public static /* synthetic */ Object ipc$super(PayPwdModule payPwdModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onCreate(String str, String str2, String str3, Bundle bundle) {
        String str4;
        BaseFBPlugin plugin;
        BaseFBPlugin plugin2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3304cdb4", new Object[]{this, str, str2, str3, bundle});
            return;
        }
        InitDataModel initDataModel = null;
        try {
            initDataModel = (InitDataModel) JSON.parseObject(str3, InitDataModel.class);
        } catch (JSONException e) {
            VerifyLogCat.e(f5918a, "json fail " + str3, e);
        }
        if (initDataModel == null) {
            VerifyLogCat.d(f5918a, "module data can't be converted to jsonobject: " + str3);
            a();
            return;
        }
        this.e = str3;
        initLogicModuleName(initDataModel.sourceToPwd);
        boolean z2 = !"full".equalsIgnoreCase(initDataModel.pageStyle);
        this.d = bundle != null ? bundle.getBoolean(VIFBPluginManager.KEY_IS_PLUGIN_MODE) : false;
        if (!this.d && !initDataModel.isPluginMode) {
            z = false;
        }
        this.d = z;
        String str5 = "";
        String string = bundle != null ? bundle.getString("supportEmbedVi") : str5;
        if (bundle != null) {
            str5 = bundle.getString("supportNoPwdUI");
        }
        if (TextUtils.isEmpty(initDataModel.sourcePluginName) || (plugin2 = VIFBPluginManager.getPlugin(getVerifyId(), initDataModel.sourcePluginName)) == null) {
            str4 = str5;
        } else {
            String actConf = plugin2.getActConf(BaseFBPlugin.ACT_CONF.supportVersion);
            string = plugin2.getActConf("supportEmbedVi");
            str4 = plugin2.getActConf("supportNoPwdUI");
            if (TextUtils.isEmpty(actConf) || !"2.0".equalsIgnoreCase(actConf)) {
                z2 = false;
            }
            String actConf2 = plugin2.getActConf("usePwd");
            ModuleDataModel moduleDataModel = new ModuleDataModel();
            moduleDataModel.token = str2;
            moduleDataModel.data = str3;
            moduleDataModel.nextStep = getModuleName();
            JSONObject jSONObject = (JSONObject) JSON.toJSON(moduleDataModel);
            if (z2) {
                jSONObject.put("version", (Object) "2.0");
            }
            if (!TextUtils.isEmpty(actConf2)) {
                jSONObject.put("usePwd", (Object) actConf2);
            }
            plugin2.doCommonAction(BaseFBPlugin.PLUGIN_ACTION.viToPWD, jSONObject);
            if (this.d) {
                return;
            }
        }
        if (this.d) {
            if (TextUtils.equals(str4, "Y")) {
                plugin = VIFBPluginManager.getPlugin(getVerifyId(), "PasswordPluginWithoutUI");
            } else if (TextUtils.equals(string, "Y")) {
                plugin = VIFBPluginManager.getPlugin(getVerifyId(), "PasswordUnifiedPluginNew");
            } else {
                plugin = VIFBPluginManager.getPlugin(getVerifyId(), "PasswordInputUnifiedPlugin");
            }
            if (plugin == null) {
                return;
            }
            VerifyLogCat.i(f5918a, "PasswordInputUnifiedPlugin Mode!");
            plugin.bindModule(this, str3);
            return;
        }
        if (!z2 && "full".equalsIgnoreCase(initDataModel.pageStyle)) {
            this.b = PayPwdFullActivity.class;
        } else {
            this.b = PayPwdDialogActivity.class;
        }
        if (TextUtils.isEmpty(initDataModel.pubKey)) {
            VerifyLogCat.d(f5918a, "支付密码初始化，服务端没有下发公钥");
        } else {
            VerifyLogCat.d(f5918a, "支付密码初始化，服务端下发了公钥");
        }
        boolean contains = str3.contains(HAS_FORGOT_PWD);
        this.c = new Bundle();
        this.c.putAll(bundle);
        this.c.putBoolean("isSimplePwd", initDataModel.isSimplePPW);
        this.c.putString("pubKey", initDataModel.pubKey);
        this.c.putString("timestamp", initDataModel.timestamp);
        this.c.putString("title", initDataModel.keyHeadline);
        this.c.putString("subtitle", initDataModel.bodyContent);
        this.c.putString("footRemark", initDataModel.keyFootRemark);
        this.c.putString("loadingTip", initDataModel.loadingTip);
        this.c.putBoolean("hasOthers", VIUtils.hasOtherVerifyProduct(str3));
        this.c.putString("username", initDataModel.logonId);
        this.c.putString("refer", initDataModel.refer);
        this.c.putString("predata", initDataModel.predata);
        this.c.putBoolean("isFindPPW", initDataModel.isFindPPW);
        this.c.putString("sourceToPwd", initDataModel.sourceToPwd);
        this.c.putBoolean("havePpw", initDataModel.isExistPPW);
        this.c.putString("addPpwUrl", initDataModel.completePPWUrl);
        this.c.putString("addPPWText", initDataModel.completePPWGuideText);
        this.c.putString("pwd_action", initDataModel.action);
        this.c.putString("pwd_PASS", initDataModel.PASS);
        this.c.putString("pwd_other", initDataModel.other);
        this.c.putString("pwdTopTip", initDataModel.pwdTopTip);
        this.c.putString("sceneId", initDataModel.sceneId);
        this.c.putBoolean("uninterrupt", initDataModel.uninterrupt);
        this.c.putString("pwd_protocol", initDataModel.protocol);
        this.c.putString("pwd_protocolUrl", initDataModel.protocolUrl);
        this.c.putBoolean("resetPwd", initDataModel.resetPwd);
        this.c.putString("switchOther", initDataModel.switchOther);
        this.c.putBoolean(PWD_CONTAINS_GORGET_PWD, contains);
        this.c.putBoolean(HAS_FORGOT_PWD, initDataModel.has_forgot_pwd);
        this.c.putBoolean(PWD_USE_DIALOG_PWD, initDataModel.useDialogPwd);
        this.c.putString("decisionToPwd", initDataModel.decisionToPwd);
        this.c.putString("decisionToPwd_action", initDataModel.decisionToPwd_action);
        this.c.putString(SHOW_FIND_PWD, initDataModel.showFindPwd);
        this.c.putString(FIND_PWD_TXT, initDataModel.findPwdTxt);
        this.c.putString(PWD_MODULE_DATA, str3);
        this.c.putString("htip", initDataModel.hideDecisionTip);
        if (!initDataModel.decisionToPwdFromUsePwd) {
            return;
        }
        this.c.putString("htip", "Y");
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else if (this.d) {
        } else {
            if (this.c == null || this.b == null) {
                VerifyLogCat.d(f5918a, "wrong input params");
                a();
                return;
            }
            IDecisionHelper.sendLocalBroadcast(IDecisionHelper.PWD_ENTER_ACTION, this.c.getString("sceneId"), getVerifyId());
            Intent intent = new Intent(MicroModuleContext.getInstance().getContext(), this.b);
            intent.putExtras(this.c);
            MicroModuleContext.getInstance().setStartActivityMonitor();
            getMicroModuleContext().startActivity(this, intent);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            getMicroModuleContext().notifyAndFinishModule(getVerifyId(), getToken(), getModuleName(), new DefaultModuleResult("2002"));
        }
    }

    public void initLogicModuleName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73784eb6", new Object[]{this, str});
        } else if (!ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS.equalsIgnoreCase(str)) {
        } else {
            setLogicModuleName(ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS);
            String str2 = f5918a;
            VerifyLogCat.i(str2, "initLogicModuleName: " + getLogicModuleName());
        }
    }

    public String getPwdModuleData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c429eb7c", new Object[]{this}) : this.e;
    }
}
