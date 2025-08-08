package com.alipay.mobile.verifyidentity.module.internal.password.pay;

import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.model.AMInitDataModel;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.model.InitDataModel;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.AbsPayPwdActivity;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdFullActivity;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdHalfActivity;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.utils.AMModelHandler;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.BottomSheetComponentInterface;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class PayPwdModule extends MicroModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TIP = "pwd_action";
    public static final String ADD_PPW_TEXT = "addPPWText";
    public static final String ADD_PPW_URL = "addPpwUrl";
    public static final String COMPLETE_PPW = "complete_ppw";
    public static final String CONTENT = "footRemark";
    public static final String FORM_BTN = "from_btn";
    public static final String FORM_TIP_LOW = "form_tip_low";
    public static final String FORM_TIP_PLACEHOLDER = "form_tip_placeholder";
    public static final String FORM_TIP_URL = "form_tip_url";
    public static final String HAVE_PPW = "havePpw";
    public static final String IS_FIND_PPW = "isFindPPW";
    public static final String IS_IPAY = "isIPay";
    public static final String IS_SIMPLE_PWD = "isSimplePwd";
    public static final String KEY = "pubKey";
    public static final String LOADING_TIP = "loadingTip";
    public static final String OTHERS = "hasOthers";
    public static final String OTHER_TIP = "pwd_other";
    public static final String PASS_TIP = "pwd_PASS";
    public static final String PREDATA = "predata";
    public static final String PROTOCOL = "pwd_protocol";
    public static final String PROTOCOL_URL = "pwd_protocolUrl";
    public static final String PWD_TOP_TIP = "pwdTopTip";
    public static final String REF = "refer";
    public static final String RESET_PWD = "resetPwd";
    public static final String SCENE_ID = "sceneId";
    public static final String SUBTITLE = "subtitle";
    public static final String TIMESTAMP = "timestamp";
    public static final String TITLE = "title";
    public static final String UNINTERRUPT = "uninterrupt";
    public static final String USERNAME = "username";
    public static final String VI_FORBID_JUMP = "forbidJump";
    public static final String VI_LANGUAGE = "viLanguage";
    private static final HashMap<String, Class<? extends AbsPayPwdActivity>> e;

    /* renamed from: a  reason: collision with root package name */
    private Class<? extends AbsPayPwdActivity> f5903a;
    private Bundle b;
    private boolean c;
    private boolean d;

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    static {
        HashMap<String, Class<? extends AbsPayPwdActivity>> hashMap = new HashMap<>();
        e = hashMap;
        hashMap.put(BottomSheetComponentInterface.State.HALF, PayPwdHalfActivity.class);
        e.put("full", PayPwdFullActivity.class);
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onCreate(String str, String str2, String str3, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3304cdb4", new Object[]{this, str, str2, str3, bundle});
            return;
        }
        if (bundle != null) {
            this.d = bundle.getBoolean(IS_IPAY, false);
            VerifyLogCat.i("PayPwdModule", "isPay:" + str3);
        }
        VerifyLogCat.i("PayPwdModule", "密码渲染数据:" + str3);
        InitDataModel initDataModel = null;
        try {
            initDataModel = new AMModelHandler().transferInitModel((AMInitDataModel) JSON.parseObject(str3, AMInitDataModel.class));
        } catch (JSONException e2) {
            VerifyLogCat.e("PayPwdModule", "json fail " + str3, e2);
        }
        initLogicModuleName(initDataModel.sourceToPwd);
        this.f5903a = e.get(initDataModel.pageStyle);
        if (this.f5903a == null) {
            VerifyLogCat.d("PayPwdModule", "page style not recognized");
            this.f5903a = PayPwdHalfActivity.class;
        }
        if (StringUtils.isEmpty(initDataModel.pubKey)) {
            VerifyLogCat.d("PayPwdModule", "支付密码初始化，服务端没有下发公钥");
        } else {
            VerifyLogCat.d("PayPwdModule", "支付密码初始化，服务端下发了公钥");
        }
        this.b = new Bundle();
        this.b.putAll(bundle);
        this.b.putBoolean("isSimplePwd", initDataModel.isSimplePPW);
        this.b.putString("pubKey", initDataModel.pubKey);
        this.b.putString("timestamp", initDataModel.timestamp);
        this.b.putString("title", initDataModel.keyHeadline);
        this.b.putString("subtitle", initDataModel.bodyContent);
        this.b.putString("footRemark", initDataModel.keyFootRemark);
        this.b.putString("loadingTip", initDataModel.loadingTip);
        this.b.putBoolean("hasOthers", VIUtils.hasOtherVerifyProduct(str3));
        this.b.putString("username", initDataModel.logonId);
        this.b.putString("refer", initDataModel.refer);
        this.b.putString("predata", initDataModel.predata);
        this.b.putBoolean("isFindPPW", initDataModel.isFindPPW);
        this.b.putString("sourceToPwd", initDataModel.sourceToPwd);
        this.b.putBoolean("havePpw", initDataModel.isExistPPW);
        this.b.putString("addPpwUrl", initDataModel.completePPWUrl);
        this.b.putString("addPPWText", initDataModel.completePPWGuideText);
        this.b.putString("pwd_action", initDataModel.action);
        this.b.putString("pwd_PASS", initDataModel.PASS);
        this.b.putString("pwd_other", initDataModel.other);
        this.b.putString("pwdTopTip", initDataModel.pwdTopTip);
        this.b.putString("sceneId", initDataModel.sceneId);
        this.b.putBoolean("uninterrupt", initDataModel.uninterrupt);
        this.b.putString("pwd_protocol", initDataModel.protocol);
        this.b.putString("pwd_protocolUrl", initDataModel.protocolUrl);
        this.b.putBoolean("resetPwd", initDataModel.resetPwd);
        this.b.putBoolean(IS_IPAY, this.d);
        this.b.putString(FORM_TIP_PLACEHOLDER, initDataModel.form_input_placeholder);
        this.b.putString(FORM_TIP_URL, initDataModel.form_input_tip_url);
        this.b.putString(FORM_TIP_LOW, initDataModel.form_input_tip_low);
        this.b.putString(FORM_BTN, initDataModel.form_button);
        this.b.putString(VI_LANGUAGE, initDataModel.viLanguage);
        this.b.putString(VI_FORBID_JUMP, initDataModel.forbidJump);
        this.b.putBoolean(COMPLETE_PPW, initDataModel.completePPWFlag);
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else if (this.c) {
        } else {
            if (this.b == null || this.f5903a == null) {
                VerifyLogCat.d("PayPwdModule", "wrong input params");
                getMicroModuleContext().notifyAndFinishModule(getVerifyId(), getToken(), getModuleName(), new DefaultModuleResult("2002"));
                return;
            }
            Intent intent = new Intent(MicroModuleContext.getInstance().getContext(), this.f5903a);
            intent.putExtras(this.b);
            getMicroModuleContext().startActivity(this, intent);
        }
    }

    public void initLogicModuleName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73784eb6", new Object[]{this, str});
        } else if (!ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS.equalsIgnoreCase(str)) {
        } else {
            setLogicModuleName(ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS);
            VerifyLogCat.i("PayPwdModule", "initLogicModuleName: " + getLogicModuleName());
        }
    }
}
