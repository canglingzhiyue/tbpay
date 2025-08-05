package com.alipay.mobile.verifyidentity.module.fingerprint;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ali.user.mobile.login.model.LoginConstant;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.fingerprint.proxy.AuthenticatorManagerProxy;
import com.alipay.mobile.verifyidentity.module.utils.DataHelper;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.riy;

/* loaded from: classes3.dex */
public class FpBaseHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DataHelper f5900a;
    private FingerprintCheckActivity b;
    private AuthenticatorManager c;
    private AuthenticatorManagerProxy e;
    public SafepayChecker mSafepayChecker = new SafepayChecker();
    private final String d = FpBaseHelper.class.getSimpleName();

    public static /* synthetic */ FingerprintCheckActivity access$000(FpBaseHelper fpBaseHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FingerprintCheckActivity) ipChange.ipc$dispatch("4d8f2395", new Object[]{fpBaseHelper}) : fpBaseHelper.b;
    }

    public static /* synthetic */ String access$100(FpBaseHelper fpBaseHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a86f04e", new Object[]{fpBaseHelper}) : fpBaseHelper.d;
    }

    public static /* synthetic */ DataHelper access$200(FpBaseHelper fpBaseHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("74baff3b", new Object[]{fpBaseHelper}) : fpBaseHelper.f5900a;
    }

    public static /* synthetic */ boolean access$300(FpBaseHelper fpBaseHelper, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f76cb562", new Object[]{fpBaseHelper, str})).booleanValue() : fpBaseHelper.a(str);
    }

    public void init(FingerprintCheckActivity fingerprintCheckActivity, DataHelper dataHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd3afe5f", new Object[]{this, fingerprintCheckActivity, dataHelper});
            return;
        }
        this.b = fingerprintCheckActivity;
        this.f5900a = dataHelper;
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        AuthenticatorResponse authenticatorResponse = new AuthenticatorResponse();
        authenticatorResponse.setResult(i);
        this.f5900a.goToPayPwd(authenticatorResponse);
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (!this.f5900a.multiBio || !this.f5900a.hasNextBio()) {
            return false;
        }
        DataHelper dataHelper = this.f5900a;
        dataHelper.mulitiSourceTo = "fp2" + this.f5900a.getNextBioType();
        if (!TextUtils.isEmpty(str)) {
            DataHelper dataHelper2 = this.f5900a;
            dataHelper2.logMultiBioBehavior(str, "fp", dataHelper2.getNextBioType());
        }
        AuthenticatorManager authenticatorManager = this.c;
        if (authenticatorManager != null) {
            authenticatorManager.stopAuth(this.b, 1);
        }
        cancelVerify();
        this.f5900a.parseNextBio();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.FpBaseHelper.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    FpBaseHelper.access$000(FpBaseHelper.this).handleBio();
                }
            }
        });
        this.b.updateVerifyStatus("end");
        return true;
    }

    public void startSpFingerprintChecker() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc7c377", new Object[]{this});
            return;
        }
        this.f5900a.logBehavior("fpbasestart", "UC-MobileIC-20190426-6", null);
        this.mSafepayChecker.init(this.b, 1);
        if (!TextUtils.isEmpty(this.f5900a.userId)) {
            int checkUserStatus = this.mSafepayChecker.checkUserStatus(this.f5900a.userId);
            if (checkUserStatus == 2) {
                VerifyLogCat.i(this.d, "用户本地指纹状态正常");
            } else {
                if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeFpStatusAction))) {
                    String str = this.d;
                    VerifyLogCat.i(str, "用户本地指纹状态不正确[" + checkUserStatus + riy.ARRAY_END_STR);
                    a(checkUserStatus);
                } else if (!a("USER_STATUS_ERROR")) {
                    a(checkUserStatus);
                }
                z = false;
            }
        }
        if (!z) {
            return;
        }
        if (this.f5900a.newUiParamsObj != null) {
            z2 = this.f5900a.newUiParamsObj.getBooleanValue(DataHelper.FP_TYPE_VALUE);
        }
        HashMap hashMap = new HashMap();
        if (z2 && this.f5900a.supporNewVerison) {
            hashMap.put("isNewMUI", "true");
        }
        this.f5900a.startBioCheck(new DataHelper.BioCheckCallBack() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.FpBaseHelper.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Code restructure failed: missing block: B:28:0x00fc, code lost:
                if (r6.equalsIgnoreCase(r5) != false) goto L26;
             */
            @Override // com.alipay.mobile.verifyidentity.module.utils.DataHelper.BioCheckCallBack
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void bioCheckResult(boolean r5, boolean r6, boolean r7) {
                /*
                    Method dump skipped, instructions count: 265
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.module.fingerprint.FpBaseHelper.AnonymousClass3.bioCheckResult(boolean, boolean, boolean):void");
            }
        }, DataHelper.FP_TYPE_VALUE);
    }

    public void cancelVerify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a442e29a", new Object[]{this});
            return;
        }
        this.mSafepayChecker.getFingerprintManager(this.b).cancelVerify();
        AuthenticatorManager authenticatorManager = this.c;
        if (authenticatorManager != null) {
            authenticatorManager.stopAuth(this.b, 1);
        }
        AuthenticatorManagerProxy authenticatorManagerProxy = this.e;
        if (authenticatorManagerProxy == null) {
            return;
        }
        authenticatorManagerProxy.cancel();
    }

    public static /* synthetic */ void access$400(FpBaseHelper fpBaseHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c664ef95", new Object[]{fpBaseHelper});
            return;
        }
        final String string = fpBaseHelper.b.getResources().getString(R.string.go_pwd_pay);
        if (fpBaseHelper.f5900a.multiBio && fpBaseHelper.f5900a.hasNextBio()) {
            String nextBioType = fpBaseHelper.f5900a.getNextBioType();
            if (nextBioType.equalsIgnoreCase(DataHelper.FACEID_TYPE_VALUE)) {
                string = fpBaseHelper.b.getResources().getString(R.string.go_faceid_pay);
            } else if (nextBioType.equalsIgnoreCase(DataHelper.ZFACE_TYPE_VALUE)) {
                string = fpBaseHelper.b.getResources().getString(R.string.go_face_pay);
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.STRING_AUTH_SWITCH, (Object) string);
        if (!TextUtils.isEmpty(fpBaseHelper.f5900a.mDecisionTip)) {
            jSONObject.put(Constants.STRING_AUTH_TITLE, (Object) fpBaseHelper.f5900a.mDecisionTip);
        } else if (!TextUtils.isEmpty(fpBaseHelper.f5900a.errorForFp)) {
            jSONObject.put(Constants.STRING_AUTH_TITLE, (Object) fpBaseHelper.f5900a.errorForFp);
        } else {
            jSONObject.put(Constants.STRING_AUTH_TITLE, (Object) fpBaseHelper.b.getResources().getString(R.string.vi_verify_fp_please));
        }
        String jSONString = jSONObject.toJSONString();
        AuthenticatorMessage authenticatorMessage = new AuthenticatorMessage(3, 2, fpBaseHelper.f5900a.challenge);
        authenticatorMessage.setUiType(1);
        authenticatorMessage.setAuthenticatorType(1);
        authenticatorMessage.setSwitchBtnType(1);
        fpBaseHelper.c = AuthenticatorManager.getInstance(fpBaseHelper.b);
        fpBaseHelper.e = new AuthenticatorManagerProxy(fpBaseHelper.c);
        fpBaseHelper.e.startAuth(fpBaseHelper.b, authenticatorMessage, new AuthenticatorManager.Callback() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.FpBaseHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.Callback
            public void onResult(final AuthenticatorResponse authenticatorResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("688a9824", new Object[]{this, authenticatorResponse});
                } else if (FpBaseHelper.access$000(FpBaseHelper.this) == null) {
                } else {
                    if (FpBaseHelper.access$000(FpBaseHelper.this).hasCancelled.get()) {
                        VerifyLogCat.i(FpBaseHelper.access$100(FpBaseHelper.this), "指纹校验已取消，不处理回调结果");
                        return;
                    }
                    if (authenticatorResponse == null) {
                        FpBaseHelper.access$200(FpBaseHelper.this).exceptionLogBehavior("get_authenticatorResponse_null");
                    }
                    int result = authenticatorResponse.getResult();
                    if (100 == result) {
                        VerifyLogCat.i(FpBaseHelper.access$100(FpBaseHelper.this), "getOnFingerResult success");
                        FpBaseHelper.access$200(FpBaseHelper.this).logFpResBehavior(String.valueOf(result), "fpbase_newinterface_client");
                        FpBaseHelper.access$200(FpBaseHelper.this).buildRequestData(FpBaseHelper.access$200(FpBaseHelper.this).predata_type, true, authenticatorResponse);
                        FpBaseHelper.access$000(FpBaseHelper.this).updateVerifyStatusNew("end");
                        FpBaseHelper.access$000(FpBaseHelper.this).checkByServer();
                    } else if (102 == result) {
                        VerifyLogCat.i(FpBaseHelper.access$100(FpBaseHelper.this), "getOnFingerResult 指纹校验【取消】");
                        if (!"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.openOldAlert)) && FpBaseHelper.access$200(FpBaseHelper.this).isPluginMode) {
                            if (TextUtils.equals(FpBaseHelper.access$200(FpBaseHelper.this).mPlugin.getActConf("supportEmbedVi"), "Y")) {
                                VerifyLogCat.i(FpBaseHelper.access$100(FpBaseHelper.this), "supportEmbedVi CANCLE_TO_PWD");
                                FpBaseHelper.access$200(FpBaseHelper.this).logFpResBehavior("CANCLE_TO_PWD", "fpbase_newinterface_client");
                                FpBaseHelper.access$000(FpBaseHelper.this).updateVerifyStatusNew("end");
                                FpBaseHelper.access$200(FpBaseHelper.this).goToPayPwd(authenticatorResponse);
                                return;
                            }
                            String actConf = FpBaseHelper.access$200(FpBaseHelper.this).mPlugin.getActConf(BaseFBPlugin.ACT_CONF.supportRetain);
                            if (!TextUtils.isEmpty(actConf) && "Y".equalsIgnoreCase(actConf)) {
                                FpBaseHelper.access$200(FpBaseHelper.this).logFpResBehavior("RESULT_USER_CANCEL", "REMOVE_ALERT");
                                FpBaseHelper.access$000(FpBaseHelper.this).updateStatuesWithSecne(BaseFBPlugin.VERIFY_STATUS.abort, LoginConstant.FETCH_IV_FAIL_CANCEL);
                                FpBaseHelper.access$200(FpBaseHelper.this).notifyResult(new DefaultModuleResult("1003"));
                                return;
                            }
                        }
                        FpBaseHelper.access$000(FpBaseHelper.this).alert((String) null, FpBaseHelper.access$000(FpBaseHelper.this).getResources().getString(R.string.face_really_wanna_leave), string, new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.FpBaseHelper.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                    return;
                                }
                                VerifyLogCat.i(FpBaseHelper.access$100(FpBaseHelper.this), "【用户选择切密码】");
                                if (FpBaseHelper.access$300(FpBaseHelper.this, "CANCLE_TO_BIO")) {
                                    return;
                                }
                                FpBaseHelper.access$200(FpBaseHelper.this).logFpResBehavior("CANCLE_TO_PWD", "fpbase_newinterface_client");
                                FpBaseHelper.access$000(FpBaseHelper.this).updateVerifyStatusNew("end");
                                FpBaseHelper.access$200(FpBaseHelper.this).goToPayPwd(authenticatorResponse);
                            }
                        }, FpBaseHelper.access$000(FpBaseHelper.this).getResources().getString(R.string.verifyidentity_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.FpBaseHelper.1.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                    return;
                                }
                                VerifyLogCat.i(FpBaseHelper.access$100(FpBaseHelper.this), "【用户选择放弃】");
                                FpBaseHelper.access$200(FpBaseHelper.this).logFpResBehavior("RESULT_USER_CANCEL", "fpbase_newinterface_client");
                                FpBaseHelper.access$000(FpBaseHelper.this).updateVerifyStatusNew(BaseFBPlugin.VERIFY_STATUS.abort);
                                FpBaseHelper.access$200(FpBaseHelper.this).notifyResult(new DefaultModuleResult("1003"));
                            }
                        }, (Boolean) false);
                    } else {
                        String access$100 = FpBaseHelper.access$100(FpBaseHelper.this);
                        VerifyLogCat.i(access$100, "getOnFingerResult 指纹校验【失败】：" + result);
                        if (FpBaseHelper.access$300(FpBaseHelper.this, "")) {
                            if (result == 135) {
                                FpBaseHelper.access$200(FpBaseHelper.this).logMultiBioBehavior("CLICK_TO_BIO", "fp", FpBaseHelper.access$200(FpBaseHelper.this).predata_type);
                                return;
                            } else if (result != 138) {
                                FpBaseHelper.access$200(FpBaseHelper.this).logMultiBioBehavior("FAIL_TO_BIO", "fp", FpBaseHelper.access$200(FpBaseHelper.this).predata_type);
                                return;
                            } else {
                                String string2 = FpBaseHelper.access$000(FpBaseHelper.this).getResources().getString(R.string.vi_fp_tip_sys_fingerprint_error_retry);
                                if (!TextUtils.isEmpty(string2)) {
                                    FpBaseHelper.access$000(FpBaseHelper.this).toast(string2, 0);
                                }
                                FpBaseHelper.access$200(FpBaseHelper.this).logMultiBioBehavior("FAIL_TO_BIO", "fp", FpBaseHelper.access$200(FpBaseHelper.this).predata_type);
                                return;
                            }
                        }
                        if (result == 121 || result == 135) {
                            FpBaseHelper.access$200(FpBaseHelper.this).logFpResBehavior("RESULT_FALLBACK", "fpbase_newinterface_client");
                        } else if (result == 138) {
                            String string3 = FpBaseHelper.access$000(FpBaseHelper.this).getResources().getString(R.string.vi_fp_tip_sys_fingerprint_error_retry);
                            if (!TextUtils.isEmpty(string3)) {
                                FpBaseHelper.access$200(FpBaseHelper.this).updateTipToPwd(string3);
                            }
                            DataHelper access$200 = FpBaseHelper.access$200(FpBaseHelper.this);
                            access$200.logFpResBehavior("RESULT_FP_FALL-" + result, "fpbase_newinterface_client");
                        } else {
                            DataHelper access$2002 = FpBaseHelper.access$200(FpBaseHelper.this);
                            access$2002.logFpResBehavior("RESULT_FP_FALL-" + result, "fpbase_newinterface_client");
                            FpBaseHelper.access$200(FpBaseHelper.this).exceptionLogBehavior(String.valueOf(result));
                        }
                        FpBaseHelper.access$000(FpBaseHelper.this).updateVerifyStatusNew("end");
                        FpBaseHelper.access$200(FpBaseHelper.this).goToPayPwd(authenticatorResponse);
                    }
                }
            }
        }, jSONString);
    }
}
