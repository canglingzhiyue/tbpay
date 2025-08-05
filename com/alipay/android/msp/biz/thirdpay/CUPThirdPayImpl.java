package com.alipay.android.msp.biz.thirdpay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.biz.thirdpay.ThirdPayManager;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.ui.base.ActivityResultManager;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.unionpay.a;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import tb.riy;

/* loaded from: classes3.dex */
public class CUPThirdPayImpl implements ThirdPayManager.ThirdPayImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "CUPThirdPayImpl";

    @Override // com.alipay.android.msp.biz.thirdpay.ThirdPayManager.ThirdPayImpl
    public String targetType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34616b6e", new Object[]{this}) : ThirdPayManager.ThirdPayTypeVal.VAL_CUP;
    }

    @Override // com.alipay.android.msp.biz.thirdpay.ThirdPayManager.ThirdPayImpl
    public boolean isAvailable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14891cc6", new Object[]{this, context})).booleanValue();
        }
        if (context == null) {
            LogUtil.record(8, LOG_TAG, "check: error - missing ctx ".concat(String.valueOf(context)));
            return false;
        }
        boolean checkCupInstalled = checkCupInstalled(context);
        LogUtil.record(2, LOG_TAG, "checkCupInstalled:".concat(String.valueOf(checkCupInstalled)));
        return checkCupInstalled;
    }

    @Override // com.alipay.android.msp.biz.thirdpay.ThirdPayManager.ThirdPayImpl
    public void doThirdPay(JSONObject jSONObject, int i, final Activity activity, final ThirdPayManager.ThirdPayFinishCallback thirdPayFinishCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b8bfc0", new Object[]{this, jSONObject, new Integer(i), activity, thirdPayFinishCallback});
        } else if (activity == null || activity.isFinishing()) {
            LogUtil.record(8, LOG_TAG, "do: error - missing activity ".concat(String.valueOf(activity)));
            thirdPayFinishCallback.finish(ThirdPayManager.ThirdPayInvokeResult.makeErr("failed"));
        } else {
            final String string = jSONObject != null ? jSONObject.getString("order") : "";
            if (TextUtils.isEmpty(string)) {
                LogUtil.record(8, LOG_TAG, "do: error - missing args ".concat(String.valueOf(string)));
                thirdPayFinishCallback.finish(ThirdPayManager.ThirdPayInvokeResult.makeErr("failed"));
                return;
            }
            ActivityResultManager.registerActivityResultHandler(activity, new ActivityResultManager.ActivityResultHandler() { // from class: com.alipay.android.msp.biz.thirdpay.CUPThirdPayImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.msp.ui.base.ActivityResultManager.ActivityResultHandler
                public void handleResult(Activity activity2, int i2, int i3, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4207835b", new Object[]{this, activity2, new Integer(i2), new Integer(i3), intent});
                    } else if (intent == null) {
                        LogUtil.record(2, CUPThirdPayImpl.LOG_TAG, "ignoring empty result" + activity2 + ", " + i2 + ", " + i3);
                    } else if (TextUtils.isEmpty(intent.getStringExtra(MspGlobalDefine.SCHEME_PAY_RESULT))) {
                        LogUtil.record(2, CUPThirdPayImpl.LOG_TAG, "ignoring malformed result" + activity2 + ", " + i2 + ", " + i3 + ", " + JsonUtil.bundle2Json(intent.getExtras()));
                    } else {
                        LogUtil.record(2, CUPThirdPayImpl.LOG_TAG, "got result " + activity2 + ", " + i2 + ", " + i3 + ", " + JsonUtil.bundle2Json(intent.getExtras()));
                        ActivityResultManager.unregisterActivityResultHandler(this);
                        thirdPayFinishCallback.finish(ThirdPayManager.ThirdPayInvokeResult.makeOk(JsonUtil.bundle2Json(intent.getExtras()).toJSONString()));
                    }
                }
            });
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.biz.thirdpay.CUPThirdPayImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        LogUtil.record(2, CUPThirdPayImpl.LOG_TAG, "triggering uppay with " + activity + ", " + string);
                        a.a(activity, null, null, string, "00");
                    } catch (Exception e) {
                        LogUtil.record(8, CUPThirdPayImpl.LOG_TAG, "uppay exception " + activity + ", " + string);
                        LogUtil.printExceptionStackTrace(e);
                    }
                }
            });
        }
    }

    private static boolean checkCupInstalled(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a1ca3a1", new Object[]{context})).booleanValue() : "536C79B93ACFBEA950AE365D8CE1AEF91FEA9535".equalsIgnoreCase(cupStyleSignHex(context, "com.unionpay"));
    }

    private static String cupStyleSignHex(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9f99e0", new Object[]{context, str});
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            return packageInfo == null ? "" : cupStyleByteToHex(MessageDigest.getInstance("SHA1").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(packageInfo.signatures[0].toByteArray()))).getEncoded())).replaceAll(":", "");
        } catch (Exception unused) {
            return "";
        }
    }

    private static String cupStyleByteToHex(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d7b978d", new Object[]{bArr});
        }
        StringBuilder sb = new StringBuilder(bArr.length << 1);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                hexString = "0".concat(String.valueOf(hexString));
            } else if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString.toUpperCase());
            if (i < bArr.length - 1) {
                sb.append(riy.CONDITION_IF_MIDDLE);
            }
        }
        return sb.toString();
    }
}
