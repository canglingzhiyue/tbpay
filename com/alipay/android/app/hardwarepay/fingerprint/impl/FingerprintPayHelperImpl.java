package com.alipay.android.app.hardwarepay.fingerprint.impl;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.hardwarepay.old.fingerprint.FingerprintPayHelper;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.alipay.security.mobile.auth.AuthInfo;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.AuthenticatorFactory;
import com.alipay.security.mobile.auth.IAuthenticator;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class FingerprintPayHelperImpl extends FingerprintPayHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IAuthenticator f;

    @Override // com.alipay.android.msp.framework.hardwarepay.old.fingerprint.FingerprintPayHelper
    public int initHardwarePay(Context context, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4680a9af", new Object[]{this, context, new Integer(i), str})).intValue();
        }
        if (this.f == null) {
            this.f = AuthenticatorFactory.create(context.getApplicationContext(), i);
        }
        return this.f.init(context.getApplicationContext(), new AuthenticatorCallback() { // from class: com.alipay.android.app.hardwarepay.fingerprint.impl.FingerprintPayHelperImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
            public void callback(AuthenticatorResponse authenticatorResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse});
                } else if (authenticatorResponse.getType() == 6) {
                    LogUtil.record(1, "phonecashiermsp#fingerprint", "AuthenticatorCallback.callback", "指纹支付init回调,状态OK.");
                } else {
                    LogUtil.record(1, "phonecashiermsp#fingerprint", "AuthenticatorCallback.callback", "指纹支付init回调,有问题，不应该到这里.type:" + authenticatorResponse.getType());
                }
            }
        }, MspContextUtil.getUserId());
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.old.fingerprint.FingerprintPayHelper
    public String[] getAuthInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ddd1cb82", new Object[]{this});
        }
        AuthInfo authInfo = this.f.getAuthInfo();
        if (authInfo == null) {
            return null;
        }
        return new String[]{String.valueOf(authInfo.getType()), String.valueOf(authInfo.getVendor()), authInfo.getPhoneModle(), String.valueOf(authInfo.getProtocolVersion()), String.valueOf(authInfo.getProtocolType()), authInfo.getDownloadUrl()};
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.old.fingerprint.FingerprintPayHelper
    public int checkUserStatus(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e76e2389", new Object[]{this, str})).intValue() : this.f.checkUserStatus(str);
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.old.fingerprint.FingerprintPayHelper
    public int registedFingerPrintNumber() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6f7fc392", new Object[]{this})).intValue() : this.f.registedFingerPrintNumber();
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.old.fingerprint.FingerprintPayHelper
    public String process(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56a83f14", new Object[]{this, new Integer(i), str, new Integer(i2)});
        }
        LogUtil.record(4, "phonecashiermsp#fingerprint", "FingerprintPayHelperImpl.process", "finger process no callback:".concat(String.valueOf(str)));
        return this.f.process(new AuthenticatorMessage(i2, i, str));
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.old.fingerprint.FingerprintPayHelper
    public void process(int i, int i2, String str, final int i3, final Object obj, final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34aa1329", new Object[]{this, new Integer(i), new Integer(i2), str, new Integer(i3), obj, context});
            return;
        }
        this.f.process(new AuthenticatorMessage(i, i2, str), new AuthenticatorCallback() { // from class: com.alipay.android.app.hardwarepay.fingerprint.impl.FingerprintPayHelperImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
            public void callback(AuthenticatorResponse authenticatorResponse) {
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", authenticatorResponse.getType());
                    jSONObject.put("result", authenticatorResponse.getResult());
                    jSONObject.put("message", authenticatorResponse.getResultMessage());
                    String str2 = "";
                    switch (authenticatorResponse.getType()) {
                        case 8:
                            jSONObject.put("data", authenticatorResponse.getData());
                            if (authenticatorResponse.getResgistedTokens() != null && authenticatorResponse.getResgistedTokens().size() > 0) {
                                str2 = authenticatorResponse.getResgistedTokens().get(0);
                            }
                            jSONObject.put("tokenId", str2);
                            Intent intent = new Intent(MspGlobalDefine.FP_REGISTER_ACTION);
                            intent.putExtra("result", authenticatorResponse.getResult());
                            intent.putExtra("responseMsg", authenticatorResponse.getData());
                            intent.putExtra("tokenId", str2);
                            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
                            break;
                        case 9:
                            Intent intent2 = new Intent(MspGlobalDefine.FP_AUTHENTICATE_ACTION);
                            intent2.putExtra("result", authenticatorResponse.getResult());
                            intent2.putExtra("data", authenticatorResponse.getData());
                            intent2.putExtra("message", authenticatorResponse.getResultMessage());
                            LocalBroadcastManager.getInstance(context).sendBroadcast(intent2);
                            break;
                        case 10:
                            jSONObject.put("data", authenticatorResponse.getData());
                            break;
                        default:
                            throw new Exception("Shouldn't execute to there.");
                    }
                    StringBuilder sb = new StringBuilder("指纹支付");
                    sb.append(authenticatorResponse.getType());
                    sb.append("回调： result:");
                    sb.append(authenticatorResponse.getResult());
                    sb.append(" tokenId:");
                    sb.append(str2);
                    sb.append(" message:");
                    sb.append(authenticatorResponse.getResultMessage());
                    sb.append(" data:");
                    sb.append(authenticatorResponse.getData());
                    sb.append(" callback ");
                    if (obj == null) {
                        z = true;
                    }
                    sb.append(z);
                    LogUtil.record(1, "phonecashiermsp#fingerprint", "AuthenticatorCallback.callback", sb.toString());
                    FingerprintPayHelperImpl.this.reflectCallBack(obj, i3, jSONObject.toString());
                } catch (Exception e) {
                    StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, e.getClass().getName(), e);
                    LogUtil.record(1, "phonecashiermsp#fingerprint", "AuthenticatorCallback.callback", "指纹支付走到了不应该走的地方: " + e.getMessage());
                }
            }
        });
        LogUtil.record(4, "phonecashiermsp#fingerprint", "FingerprintPayHelperImpl.process", "finger process no callback:".concat(String.valueOf(str)));
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.old.base.BaseCommonPayHelper
    public void reflectCallBack(Object obj, int i, String str) {
        if (obj == null) {
            return;
        }
        try {
            obj.getClass().getMethod("callBack", Integer.TYPE, String.class).invoke(obj, Integer.valueOf(i), str);
        } catch (IllegalAccessException unused) {
            LogUtil.record(1, "phonecashiermsp#fingerprint", "FingerprintPayHelperImpl.reflectCallBack", "快捷回调钱包，callBack方法不可访问");
        } catch (IllegalArgumentException unused2) {
            LogUtil.record(1, "phonecashiermsp#fingerprint", "FingerprintPayHelperImpl.reflectCallBack", "快捷回调钱包，callBack方法参数不匹配");
        } catch (NoSuchMethodException unused3) {
            LogUtil.record(1, "phonecashiermsp#fingerprint", "FingerprintPayHelperImpl.reflectCallBack", "快捷回调钱包，callBack方法找不到");
        } catch (InvocationTargetException unused4) {
            LogUtil.record(1, "phonecashiermsp#fingerprint", "FingerprintPayHelperImpl.reflectCallBack", "快捷回调钱包，callBack方法调用target不正确");
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.old.fingerprint.FingerprintPayHelper
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        try {
            this.f.cancel();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }
}
