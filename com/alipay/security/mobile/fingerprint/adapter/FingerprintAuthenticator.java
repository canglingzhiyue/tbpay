package com.alipay.security.mobile.fingerprint.adapter;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Base64;
import android.widget.Toast;
import com.alipay.security.mobile.alipayauthenticatorservice.adapter.AuthenticatorAgent;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerAdapter;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.ta.TACommands;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.ta.TAInterationV1;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.FingerprintDataUtil;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.AuthenticatorResponseUtil;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.alipay.security.mobile.ifaa.auth.FaceAuthenticator;
import com.alipay.security.mobile.util.BioBehaviorUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import org.ifaa.ifaf.OperationHeader;
import org.ifaa.ifaf.message.IFAFMessage;

/* loaded from: classes3.dex */
public class FingerprintAuthenticator extends FingerprintAuthenticatorAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(FingerprintAuthenticator fingerprintAuthenticator, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public boolean isIgnoreFpIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1354e977", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ Context access$000(FingerprintAuthenticator fingerprintAuthenticator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("35a41013", new Object[]{fingerprintAuthenticator}) : fingerprintAuthenticator.context;
    }

    public static /* synthetic */ AuthenticatorResponse access$100(FingerprintAuthenticator fingerprintAuthenticator, AuthenticatorMessage authenticatorMessage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AuthenticatorResponse) ipChange.ipc$dispatch("947926b2", new Object[]{fingerprintAuthenticator, authenticatorMessage}) : fingerprintAuthenticator.sendMessageToTee(authenticatorMessage);
    }

    public static /* synthetic */ Context access$200(FingerprintAuthenticator fingerprintAuthenticator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("887301d1", new Object[]{fingerprintAuthenticator}) : fingerprintAuthenticator.context;
    }

    public static /* synthetic */ Context access$300(FingerprintAuthenticator fingerprintAuthenticator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("b1da7ab0", new Object[]{fingerprintAuthenticator}) : fingerprintAuthenticator.context;
    }

    public FingerprintAuthenticator(Context context) {
        super(context);
    }

    @Override // com.alipay.security.mobile.fingerprint.adapter.FingerprintAuthenticatorAdapter, com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public void process(AuthenticatorMessage authenticatorMessage, final AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb5a824", new Object[]{this, authenticatorMessage, authenticatorCallback});
            return;
        }
        BioBehaviorUtils.getInstance().add(authenticatorMessage, "enter in bioSDK");
        BioBehaviorUtils.getInstance().add(authenticatorMessage, "ignore fp index");
        if (authenticatorMessage.getType() == 2 && authenticatorMessage.getFeatureType() == 1) {
            register(authenticatorMessage, authenticatorCallback);
            return;
        }
        authenticatorMessage.setAuthenticatorType(Constants.TYPE_FINGERPRINT);
        final Bundle bundle = new Bundle();
        bundle.putInt(AuthenticatorMessage.KEY_OPERATIONT_TYPE, authenticatorMessage.getType());
        bundle.putString(AuthenticatorMessage.KEY_MESSAGE, authenticatorMessage.getData());
        bundle.putInt(AuthenticatorMessage.KEY_AUTHENTICATOR_TYPE, authenticatorMessage.getAuthenticatorType());
        bundle.putString(AuthenticatorMessage.KEY_EXTRA_PARAMS, authenticatorMessage.getExtraParams());
        bundle.putInt("KEY_VERSION", authenticatorMessage.getVersion());
        bundle.putInt(AuthenticatorMessage.KEY_FEATURE, authenticatorMessage.getFeatureType());
        bundle.putString(AuthenticatorMessage.KEY_VERIFY_ID, authenticatorMessage.getId());
        new Thread(new Runnable() { // from class: com.alipay.security.mobile.fingerprint.adapter.FingerprintAuthenticator.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    AuthenticatorAgent.getInstance(FingerprintAuthenticator.access$000(FingerprintAuthenticator.this)).processCommmandAsync(bundle, authenticatorCallback);
                }
            }
        }).start();
    }

    public void register(final AuthenticatorMessage authenticatorMessage, final AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ea8ea70", new Object[]{this, authenticatorMessage, authenticatorCallback});
        } else {
            new Thread(new Runnable() { // from class: com.alipay.security.mobile.fingerprint.adapter.FingerprintAuthenticator.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    Object obj = "response is null";
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    AuthenticatorResponse authenticatorResponse = null;
                    try {
                        try {
                            authenticatorResponse = FingerprintAuthenticator.access$100(FingerprintAuthenticator.this, authenticatorMessage);
                            if (authenticatorResponse != null) {
                                str = "fp register response result: " + authenticatorResponse.getResult();
                            } else {
                                str = "fp register response is null";
                            }
                            AuthenticatorLOG.fpInfo(str);
                            try {
                                if (authenticatorResponse.getResult() != 100) {
                                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alipay.security.mobile.fingerprint.adapter.FingerprintAuthenticator.2.1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            } else {
                                                Toast.makeText(FingerprintAuthenticator.access$200(FingerprintAuthenticator.this), FingerprintAuthenticator.access$300(FingerprintAuthenticator.this).getText(R.string.fp_auth_failure), 1).show();
                                            }
                                        }
                                    });
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            AuthenticatorCallback authenticatorCallback2 = authenticatorCallback;
                            if (authenticatorCallback2 == null) {
                                return;
                            }
                            authenticatorCallback2.callback(authenticatorResponse);
                            BioBehaviorUtils bioBehaviorUtils = BioBehaviorUtils.getInstance();
                            AuthenticatorMessage authenticatorMessage2 = authenticatorMessage;
                            StringBuilder sb = new StringBuilder();
                            sb.append("leave bioSDK with result:");
                            if (authenticatorResponse != null) {
                                obj = Integer.valueOf(authenticatorResponse.getResult());
                            }
                            sb.append(obj);
                            bioBehaviorUtils.add(authenticatorMessage2, sb.toString());
                            BioBehaviorUtils.getInstance().commit(authenticatorMessage);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            AuthenticatorCallback authenticatorCallback3 = authenticatorCallback;
                            if (authenticatorCallback3 == null) {
                                return;
                            }
                            authenticatorCallback3.callback(authenticatorResponse);
                            BioBehaviorUtils bioBehaviorUtils2 = BioBehaviorUtils.getInstance();
                            AuthenticatorMessage authenticatorMessage3 = authenticatorMessage;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("leave bioSDK with result:");
                            if (authenticatorResponse != null) {
                                obj = Integer.valueOf(authenticatorResponse.getResult());
                            }
                            sb2.append(obj);
                            bioBehaviorUtils2.add(authenticatorMessage3, sb2.toString());
                            BioBehaviorUtils.getInstance().commit(authenticatorMessage);
                        }
                    } catch (Throwable th) {
                        AuthenticatorCallback authenticatorCallback4 = authenticatorCallback;
                        if (authenticatorCallback4 != null) {
                            authenticatorCallback4.callback(authenticatorResponse);
                            BioBehaviorUtils bioBehaviorUtils3 = BioBehaviorUtils.getInstance();
                            AuthenticatorMessage authenticatorMessage4 = authenticatorMessage;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("leave bioSDK with result:");
                            if (authenticatorResponse != null) {
                                obj = Integer.valueOf(authenticatorResponse.getResult());
                            }
                            sb3.append(obj);
                            bioBehaviorUtils3.add(authenticatorMessage4, sb3.toString());
                            BioBehaviorUtils.getInstance().commit(authenticatorMessage);
                        }
                        throw th;
                    }
                }
            }, FaceAuthenticator.THREADNAME).start();
        }
    }

    private AuthenticatorResponse sendMessageToTee(AuthenticatorMessage authenticatorMessage) {
        Bundle constructResultBundle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthenticatorResponse) ipChange.ipc$dispatch("5cdd0939", new Object[]{this, authenticatorMessage});
        }
        IFAFMessage parseIFAFMessage = IFAFMessage.parseIFAFMessage(authenticatorMessage.getData());
        Result sendCommandAndData = TAInterationV1.sendCommandAndData(this.context, TACommands.COMMAND_FINGERPRINT_REG, Base64.decode(parseIFAFMessage.getSignedData().getIdentifyData(), 8));
        BioBehaviorUtils.getInstance().add(authenticatorMessage, "send message to tee start");
        if (sendCommandAndData.getStatus() == 0) {
            BioBehaviorUtils.getInstance().add(authenticatorMessage, "send message to tee end,success");
            String deviceModel = IFAAFingerprintManagerAdapter.getInstance(this.context).getDeviceModel();
            new OperationHeader();
            constructResultBundle = FingerprintDataUtil.constructResultBundle(8, 100, FingerprintDataUtil.makeRegResponse(deviceModel, parseIFAFMessage.getHeader(), sendCommandAndData));
        } else {
            BioBehaviorUtils bioBehaviorUtils = BioBehaviorUtils.getInstance();
            bioBehaviorUtils.add(authenticatorMessage, "send message to tee end,failed:" + sendCommandAndData.getStatusStringIFAA2());
            constructResultBundle = FingerprintDataUtil.constructResultBundle(8, 101);
        }
        Message message = new Message();
        message.setData(constructResultBundle);
        return AuthenticatorResponseUtil.getAuthenticatorResponse(message);
    }
}
