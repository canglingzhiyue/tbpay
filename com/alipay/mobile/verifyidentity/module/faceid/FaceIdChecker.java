package com.alipay.mobile.verifyidentity.module.faceid;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ali.user.mobile.login.model.LoginConstant;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.faceid.proxy.AuthenticatorManagerProxy;
import com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintCheckActivity;
import com.alipay.mobile.verifyidentity.module.nopwd.NoPwdBaseChecker;
import com.alipay.mobile.verifyidentity.module.utils.DataHelper;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.alipay.mobile.verifyidentity.ui.helper.DialogHelper;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.cpe;
import tb.riy;

/* loaded from: classes3.dex */
public class FaceIdChecker extends NoPwdBaseChecker {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5897a = "FaceIdChecker";
    private AuthenticatorManager b;
    private AuthenticatorMessage c;
    private AtomicBoolean d;
    private AuthenticatorManagerProxy e;

    public static /* synthetic */ Object ipc$super(FaceIdChecker faceIdChecker, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ AtomicBoolean access$000(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("4132927f", new Object[]{faceIdChecker}) : faceIdChecker.d;
    }

    public static /* synthetic */ FingerprintCheckActivity access$100(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FingerprintCheckActivity) ipChange.ipc$dispatch("ab15f006", new Object[]{faceIdChecker}) : faceIdChecker.hostActivity;
    }

    public static /* synthetic */ void access$1000(FaceIdChecker faceIdChecker, String str, AuthenticatorResponse authenticatorResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0e07baf", new Object[]{faceIdChecker, str, authenticatorResponse});
        } else {
            faceIdChecker.goToPwd(str, authenticatorResponse);
        }
    }

    public static /* synthetic */ DataHelper access$1100(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("d3bd2fdf", new Object[]{faceIdChecker}) : faceIdChecker.mDataHelper;
    }

    public static /* synthetic */ DataHelper access$1200(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("c6ef277e", new Object[]{faceIdChecker}) : faceIdChecker.mDataHelper;
    }

    public static /* synthetic */ DataHelper access$1300(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("ba211f1d", new Object[]{faceIdChecker}) : faceIdChecker.mDataHelper;
    }

    public static /* synthetic */ Resources access$1400(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Resources) ipChange.ipc$dispatch("9b985c83", new Object[]{faceIdChecker}) : faceIdChecker.getResources();
    }

    public static /* synthetic */ DataHelper access$1600(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("93b705fa", new Object[]{faceIdChecker}) : faceIdChecker.mDataHelper;
    }

    public static /* synthetic */ void access$1700(FaceIdChecker faceIdChecker, String str, AuthenticatorResponse authenticatorResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b04a0608", new Object[]{faceIdChecker, str, authenticatorResponse});
        } else {
            faceIdChecker.goToPwd(str, authenticatorResponse);
        }
    }

    public static /* synthetic */ Resources access$1800(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Resources) ipChange.ipc$dispatch("16813b87", new Object[]{faceIdChecker}) : faceIdChecker.getResources();
    }

    public static /* synthetic */ DataHelper access$1900(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("6d4cecd7", new Object[]{faceIdChecker}) : faceIdChecker.mDataHelper;
    }

    public static /* synthetic */ String access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("682607c7", new Object[0]) : f5897a;
    }

    public static /* synthetic */ DataHelper access$2000(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("53983481", new Object[]{faceIdChecker}) : faceIdChecker.mDataHelper;
    }

    public static /* synthetic */ FingerprintCheckActivity access$2100(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FingerprintCheckActivity) ipChange.ipc$dispatch("da1d8138", new Object[]{faceIdChecker}) : faceIdChecker.hostActivity;
    }

    public static /* synthetic */ String access$2200(FaceIdChecker faceIdChecker, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b5ca2cc", new Object[]{faceIdChecker, new Integer(i)}) : faceIdChecker.getString(i);
    }

    public static /* synthetic */ String access$2300(FaceIdChecker faceIdChecker, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d9e3b40d", new Object[]{faceIdChecker, new Integer(i)}) : faceIdChecker.getString(i);
    }

    public static /* synthetic */ String access$2400(FaceIdChecker faceIdChecker, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("486ac54e", new Object[]{faceIdChecker, new Integer(i)}) : faceIdChecker.getString(i);
    }

    public static /* synthetic */ String access$2500(FaceIdChecker faceIdChecker, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b6f1d68f", new Object[]{faceIdChecker, new Integer(i)}) : faceIdChecker.getString(i);
    }

    public static /* synthetic */ String access$2600(FaceIdChecker faceIdChecker, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2578e7d0", new Object[]{faceIdChecker, new Integer(i)}) : faceIdChecker.getString(i);
    }

    public static /* synthetic */ FingerprintCheckActivity access$2700(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FingerprintCheckActivity) ipChange.ipc$dispatch("ed832df2", new Object[]{faceIdChecker}) : faceIdChecker.hostActivity;
    }

    public static /* synthetic */ void access$2800(FaceIdChecker faceIdChecker, String str, AuthenticatorResponse authenticatorResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe359e8", new Object[]{faceIdChecker, str, authenticatorResponse});
        } else {
            faceIdChecker.goToPwd(str, authenticatorResponse);
        }
    }

    public static /* synthetic */ FingerprintCheckActivity access$2900(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FingerprintCheckActivity) ipChange.ipc$dispatch("9ea51230", new Object[]{faceIdChecker}) : faceIdChecker.hostActivity;
    }

    public static /* synthetic */ DataHelper access$300(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("368b7d2c", new Object[]{faceIdChecker}) : faceIdChecker.mDataHelper;
    }

    public static /* synthetic */ DataHelper access$3000(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("c6a530c2", new Object[]{faceIdChecker}) : faceIdChecker.mDataHelper;
    }

    public static /* synthetic */ DataHelper access$3100(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("b9d72861", new Object[]{faceIdChecker}) : faceIdChecker.mDataHelper;
    }

    public static /* synthetic */ FingerprintCheckActivity access$3200(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FingerprintCheckActivity) ipChange.ipc$dispatch("ec3bc518", new Object[]{faceIdChecker}) : faceIdChecker.hostActivity;
    }

    public static /* synthetic */ FingerprintCheckActivity access$3300(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FingerprintCheckActivity) ipChange.ipc$dispatch("c4ccb737", new Object[]{faceIdChecker}) : faceIdChecker.hostActivity;
    }

    public static /* synthetic */ String access$400(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("40cb10fd", new Object[]{faceIdChecker}) : faceIdChecker.type;
    }

    public static /* synthetic */ DataHelper access$500(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("1cef6c6a", new Object[]{faceIdChecker}) : faceIdChecker.mDataHelper;
    }

    public static /* synthetic */ FingerprintCheckActivity access$600(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FingerprintCheckActivity) ipChange.ipc$dispatch("e5eaaaa1", new Object[]{faceIdChecker}) : faceIdChecker.hostActivity;
    }

    public static /* synthetic */ DataHelper access$700(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("3535ba8", new Object[]{faceIdChecker}) : faceIdChecker.mDataHelper;
    }

    public static /* synthetic */ DataHelper access$800(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("f6855347", new Object[]{faceIdChecker}) : faceIdChecker.mDataHelper;
    }

    public static /* synthetic */ DataHelper access$900(FaceIdChecker faceIdChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("e9b74ae6", new Object[]{faceIdChecker}) : faceIdChecker.mDataHelper;
    }

    public FaceIdChecker(FingerprintCheckActivity fingerprintCheckActivity, DataHelper dataHelper) {
        super(fingerprintCheckActivity, dataHelper);
        this.d = new AtomicBoolean(false);
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        try {
            this.b = AuthenticatorManager.getInstance(this.hostActivity);
            this.c = new AuthenticatorMessage(3, 2, this.mDataHelper.challenge);
            this.c.setAuthenticatorType(4);
            if (!this.b.hasEnroll(4)) {
                VerifyLogCat.i(f5897a, "本地人脸未录入，直接切密码");
                if (a("FACEID_NOT_LOAD")) {
                    return;
                }
                goToPwd("", null);
                return;
            }
            this.mDataHelper.logBehavior("cpzwjyks", "UC-MobileIC-191212-01", null);
            final String string = this.hostActivity.getResources().getString(R.string.go_pwd_pay);
            if (this.mDataHelper.multiBio && this.mDataHelper.hasNextBio()) {
                String nextBioType = this.mDataHelper.getNextBioType();
                if (nextBioType.equalsIgnoreCase(DataHelper.FP_TYPE_VALUE)) {
                    string = this.hostActivity.getResources().getString(R.string.go_fp_pay);
                } else if (nextBioType.equalsIgnoreCase(DataHelper.ZFACE_TYPE_VALUE)) {
                    string = this.hostActivity.getResources().getString(R.string.go_face_pay);
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.STRING_AUTH_SWITCH, (Object) string);
            String jSONString = jSONObject.toJSONString();
            this.e = new AuthenticatorManagerProxy(this.b);
            this.e.startAuth(this.hostActivity, this.c, new AuthenticatorManager.Callback() { // from class: com.alipay.mobile.verifyidentity.module.faceid.FaceIdChecker.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.Callback
                public void onResult(final AuthenticatorResponse authenticatorResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("688a9824", new Object[]{this, authenticatorResponse});
                        return;
                    }
                    int result = authenticatorResponse.getResult();
                    if (FaceIdChecker.access$000(FaceIdChecker.this).getAndSet(true) || FaceIdChecker.access$100(FaceIdChecker.this).hasCancelled.get()) {
                        String access$200 = FaceIdChecker.access$200();
                        VerifyLogCat.i(access$200, "3D人脸【出现多次回调！！或取消】  忽略：" + result);
                        return;
                    }
                    FaceIdChecker.access$300(FaceIdChecker.this).logFpResBehavior(String.valueOf(result), cpe.PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID);
                    if (100 == result) {
                        VerifyLogCat.i(FaceIdChecker.access$200(), "3D人脸【成功】");
                        FaceIdChecker.access$500(FaceIdChecker.this).buildRequestData(FaceIdChecker.access$400(FaceIdChecker.this), true, authenticatorResponse);
                        FaceIdChecker.this.updateVerifyStatus("end");
                        FaceIdChecker.access$600(FaceIdChecker.this).hasCancelled.set(false);
                        FaceIdChecker.this.checkByServer();
                        return;
                    }
                    String str = "";
                    if (102 == result) {
                        VerifyLogCat.i(FaceIdChecker.access$200(), "3D人脸【取消】");
                        if (!"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.openOldAlert)) && FaceIdChecker.access$700(FaceIdChecker.this).isPluginMode) {
                            if (TextUtils.equals(FaceIdChecker.access$800(FaceIdChecker.this).mPlugin.getActConf("supportEmbedVi"), "Y")) {
                                VerifyLogCat.i(FaceIdChecker.access$200(), "faceId supportEmbedVi CANCLE_TO_PWD");
                                FaceIdChecker.access$900(FaceIdChecker.this).logFpResBehavior("CANCLE_FACEID_TO_PWD", BaseFBPlugin.VERIFY_TYPE.faceid);
                                FaceIdChecker.access$1000(FaceIdChecker.this, str, authenticatorResponse);
                                return;
                            }
                            String actConf = FaceIdChecker.access$1100(FaceIdChecker.this).mPlugin.getActConf(BaseFBPlugin.ACT_CONF.supportRetain);
                            if (!TextUtils.isEmpty(actConf) && "Y".equalsIgnoreCase(actConf)) {
                                FaceIdChecker.access$1200(FaceIdChecker.this).logFpResBehavior("CANCLE_FACEID", "REMOVE_ALERT");
                                FaceIdChecker.this.updateVerifyStatusWithScene(BaseFBPlugin.VERIFY_STATUS.abort, LoginConstant.FETCH_IV_FAIL_CANCEL);
                                FaceIdChecker.access$1300(FaceIdChecker.this).notifyResult(new DefaultModuleResult("1003"));
                                return;
                            }
                        }
                        FaceIdChecker.access$2100(FaceIdChecker.this).alert((String) null, FaceIdChecker.access$1400(FaceIdChecker.this).getString(R.string.face_really_wanna_leave), string, new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.faceid.FaceIdChecker.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                    return;
                                }
                                VerifyLogCat.i(FaceIdChecker.access$200(), "【用户选择切密码】");
                                if (FaceIdChecker.access$1500(FaceIdChecker.this, "CANCLE_TO_BIO", -1)) {
                                    return;
                                }
                                FaceIdChecker.access$1600(FaceIdChecker.this).logFpResBehavior("CANCLE_FACEID_TO_PWD", BaseFBPlugin.VERIFY_TYPE.faceid);
                                FaceIdChecker.access$1700(FaceIdChecker.this, "", authenticatorResponse);
                            }
                        }, FaceIdChecker.access$1800(FaceIdChecker.this).getString(R.string.verifyidentity_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.faceid.FaceIdChecker.1.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                    return;
                                }
                                VerifyLogCat.i(FaceIdChecker.access$200(), "【用户选择放弃】");
                                FaceIdChecker.access$1900(FaceIdChecker.this).logFpResBehavior("CANCLE_FACEID", BaseFBPlugin.VERIFY_TYPE.faceid);
                                FaceIdChecker.this.updateVerifyStatus(BaseFBPlugin.VERIFY_STATUS.abort);
                                FaceIdChecker.access$2000(FaceIdChecker.this).notifyResult(new DefaultModuleResult("1003"));
                            }
                        }, (Boolean) false);
                        return;
                    }
                    String access$2002 = FaceIdChecker.access$200();
                    VerifyLogCat.i(access$2002, "3D人脸本地校验失败, 转密码[" + result + riy.ARRAY_END_STR);
                    String access$2200 = FaceIdChecker.access$2200(FaceIdChecker.this, R.string.face_failed_pwd_tip);
                    if (403 == result) {
                        str = FaceIdChecker.access$2300(FaceIdChecker.this, R.string.face_no_permission_pwd_tip);
                    } else if (129 == result) {
                        str = FaceIdChecker.access$2400(FaceIdChecker.this, R.string.face_system_block);
                    } else if (121 != result && 134 != result) {
                        str = 138 == result ? FaceIdChecker.access$2500(FaceIdChecker.this, R.string.vi_fp_tip_sys_faceid_error_retry) : access$2200;
                    }
                    if (!FaceIdChecker.access$1500(FaceIdChecker.this, "FAIL_TO_BIO", result)) {
                        FaceIdChecker.access$2800(FaceIdChecker.this, str, authenticatorResponse);
                    } else if (result != 138) {
                    } else {
                        String access$2600 = FaceIdChecker.access$2600(FaceIdChecker.this, R.string.vi_fp_tip_sys_faceid_error_retry);
                        if (TextUtils.isEmpty(access$2600)) {
                            return;
                        }
                        DialogHelper.makeToast(FaceIdChecker.access$2700(FaceIdChecker.this), 0, access$2600, 0).show();
                    }
                }
            }, jSONString);
        } catch (Throwable th) {
            VerifyLogCat.e(f5897a, "3D人脸本地校验出现异常", th);
            if (a("FACEID_EXCEPTION")) {
                return;
            }
            goToPwd("", null);
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (!this.mDataHelper.multiBio || !this.mDataHelper.hasNextBio()) {
            return false;
        }
        String nextBioType = this.mDataHelper.getNextBioType();
        DataHelper dataHelper = this.mDataHelper;
        dataHelper.mulitiSourceTo = "faceid2" + nextBioType;
        this.mDataHelper.logMultiBioBehavior(str, BaseFBPlugin.VERIFY_TYPE.faceid, nextBioType);
        this.mDataHelper.parseNextBio();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.faceid.FaceIdChecker.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    FaceIdChecker.access$2900(FaceIdChecker.this).handleBio();
                }
            }
        });
        return true;
    }

    public void cancelVerify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a442e29a", new Object[]{this});
            return;
        }
        AuthenticatorManagerProxy authenticatorManagerProxy = this.e;
        if (authenticatorManagerProxy == null) {
            return;
        }
        authenticatorManagerProxy.cancel();
    }

    public static /* synthetic */ boolean access$1500(FaceIdChecker faceIdChecker, String str, int i) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4334412a", new Object[]{faceIdChecker, str, new Integer(i)})).booleanValue();
        }
        if (!faceIdChecker.mDataHelper.multiBio || !faceIdChecker.mDataHelper.hasNextBio()) {
            return false;
        }
        final String str2 = "";
        if (DataHelper.FP_TYPE_VALUE.equalsIgnoreCase(faceIdChecker.mDataHelper.getNextBioType())) {
            string = faceIdChecker.getString(R.string.vi_to_fp_product);
        } else {
            string = DataHelper.ZFACE_TYPE_VALUE.equalsIgnoreCase(faceIdChecker.mDataHelper.getNextBioType()) ? faceIdChecker.getString(R.string.vi_to_zface_product) : str2;
        }
        if (403 == i) {
            str2 = faceIdChecker.getString(R.string.vi_no_camera_premission) + faceIdChecker.getString(R.string.vi_camera_for_faceid) + string;
        } else if (129 == i) {
            str2 = String.format(faceIdChecker.getString(R.string.vi_a_fail), faceIdChecker.getString(R.string.vi_product_faceid)) + string;
        } else if (121 != i) {
        }
        faceIdChecker.mDataHelper.mulitiSourceTo = "faceid2" + faceIdChecker.mDataHelper.getNextBioType();
        faceIdChecker.mDataHelper.logMultiBioBehavior(str, "fp", faceIdChecker.mDataHelper.getNextBioType());
        faceIdChecker.mDataHelper.parseNextBio();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.faceid.FaceIdChecker.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    if (FaceIdChecker.access$3000(FaceIdChecker.this).isFP()) {
                        FaceIdChecker.access$3100(FaceIdChecker.this).errorForFp = str2;
                    } else {
                        FaceIdChecker.access$3200(FaceIdChecker.this).showNewToast(str2, 0);
                    }
                }
                FaceIdChecker.access$3300(FaceIdChecker.this).handleBio();
            }
        });
        faceIdChecker.updateVerifyStatus("end");
        return true;
    }
}
