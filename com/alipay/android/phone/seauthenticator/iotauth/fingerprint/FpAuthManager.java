package com.alipay.android.phone.seauthenticator.iotauth.fingerprint;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.IAuthenticatorManager;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.PreDataHelper;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateDialog;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerAdapter;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.FingerprintBroadcastUtil;
import com.alipay.security.mobile.api.AuthenticatorApi;
import com.alipay.security.mobile.api.BICDataModel;
import com.alipay.security.mobile.api.IFAAManagerAdaptor;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.AuthenticatorFactory;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.IAuthenticator;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.alipay.security.mobile.cache.AuthenticatorModel;
import com.alipay.security.mobile.fingerprint.adapter.FingerprintAuthenticatorAdapter;
import com.alipay.security.mobile.ifaa.device.IFAADevice;
import com.alipay.security.mobile.util.BioBehaviorUtils;
import com.alipay.security.mobile.util.CommonUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class FpAuthManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static FpAuthManager d;

    /* renamed from: a  reason: collision with root package name */
    private int f5184a = 3;
    private IAuthenticator b;
    private IBiometricValidateDialog c;
    private BroadcastReceiver e;

    public static /* synthetic */ IBiometricValidateDialog a(FpAuthManager fpAuthManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBiometricValidateDialog) ipChange.ipc$dispatch("f37a32e0", new Object[]{fpAuthManager}) : fpAuthManager.c;
    }

    public static /* synthetic */ int b(FpAuthManager fpAuthManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d838c6fa", new Object[]{fpAuthManager})).intValue();
        }
        int i = fpAuthManager.f5184a;
        fpAuthManager.f5184a = i - 1;
        return i;
    }

    public static /* synthetic */ int c(FpAuthManager fpAuthManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b8b21cfb", new Object[]{fpAuthManager})).intValue() : fpAuthManager.f5184a;
    }

    public static /* synthetic */ IAuthenticator d(FpAuthManager fpAuthManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IAuthenticator) ipChange.ipc$dispatch("de2e40a0", new Object[]{fpAuthManager}) : fpAuthManager.b;
    }

    public static /* synthetic */ BroadcastReceiver e(FpAuthManager fpAuthManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BroadcastReceiver) ipChange.ipc$dispatch("ff3ffa81", new Object[]{fpAuthManager}) : fpAuthManager.e;
    }

    public static FpAuthManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FpAuthManager) ipChange.ipc$dispatch("63a0d662", new Object[0]);
        }
        if (d == null) {
            d = new FpAuthManager();
        }
        return d;
    }

    public int startVerify(final Context context, String str, final AuthenticatorMessage authenticatorMessage, final IAuthenticatorManager.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13189fd4", new Object[]{this, context, str, authenticatorMessage, callback})).intValue();
        }
        final Context applicationContext = context.getApplicationContext();
        this.f5184a = 3;
        AuthenticatorModel.saveUserIdTemp(applicationContext, str);
        if (this.b == null) {
            try {
                this.b = AuthenticatorFactory.create(applicationContext, 1);
                this.b.setContext(applicationContext);
            } catch (Exception e) {
                AuthenticatorLOG.fpInfo(e);
                AuthenticatorResponse authenticatorResponse = new AuthenticatorResponse(authenticatorMessage.getType(), authenticatorMessage.getVersion(), null);
                authenticatorResponse.setResult(101);
                BioBehaviorUtils.getInstance().add(authenticatorMessage, "authenticator create failed");
                BioBehaviorUtils bioBehaviorUtils = BioBehaviorUtils.getInstance();
                bioBehaviorUtils.add(authenticatorMessage, "leave bioSDK with result:" + authenticatorResponse.getResult());
                BioBehaviorUtils.getInstance().commit(authenticatorMessage);
                callback.onResult(authenticatorResponse);
                return 101;
            }
        }
        try {
            if (authenticatorMessage.getType() == 3 && this.b.checkUserStatus(str) != 2) {
                AuthenticatorLOG.faceInfo("face not registed");
                AuthenticatorResponse authenticatorResponse2 = new AuthenticatorResponse(authenticatorMessage.getType(), authenticatorMessage.getVersion(), null);
                authenticatorResponse2.setResult(115);
                BioBehaviorUtils.getInstance().add(authenticatorMessage, "check available failed");
                BioBehaviorUtils bioBehaviorUtils2 = BioBehaviorUtils.getInstance();
                bioBehaviorUtils2.add(authenticatorMessage, "leave bioSDK with result:" + authenticatorResponse2.getResult());
                BioBehaviorUtils.getInstance().commit(authenticatorMessage);
                callback.onResult(authenticatorResponse2);
                return 115;
            } else if (authenticatorMessage.getType() != 2 && authenticatorMessage.getType() != 3) {
                return 111;
            } else {
                BioBehaviorUtils.getInstance().add(authenticatorMessage, "check available pass");
                this.f5184a = 3;
                AuthenticatorCallback authenticatorCallback = new AuthenticatorCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpAuthManager.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
                    public void callback(AuthenticatorResponse authenticatorResponse3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse3});
                            return;
                        }
                        int result = authenticatorResponse3.getResult();
                        if (result == 100) {
                            FpAuthManager.a(FpAuthManager.this).onAuthDone(context);
                        } else if (result == 101) {
                            FpAuthManager.a(FpAuthManager.this).onAuthFail(context);
                        } else if (result == 103) {
                            FpAuthManager.b(FpAuthManager.this);
                            if (FpAuthManager.c(FpAuthManager.this) > 0) {
                                FpAuthManager.a(FpAuthManager.this).onAuthNoMatch(context);
                                FpAuthManager.d(FpAuthManager.this).cancel();
                                FpAuthManager.d(FpAuthManager.this).process(authenticatorMessage, this);
                            } else {
                                FpAuthManager.a(FpAuthManager.this).onAuthNoMatch(context);
                            }
                        } else if (result == 113) {
                            FpAuthManager.a(FpAuthManager.this).onAuthTimeout(context);
                        } else if (result == 129) {
                            FpAuthManager.a(FpAuthManager.this).onAuthNoMatchTooMuch(context);
                        }
                        if ((authenticatorResponse3.getResult() == 103 && FpAuthManager.c(FpAuthManager.this) > 0) || authenticatorResponse3.getResult() == 102) {
                            return;
                        }
                        callback.onResult(authenticatorResponse3);
                        FpAuthManager.a(FpAuthManager.this).onCompleteAuth(context);
                        FpAuthManager.d(FpAuthManager.this).cancel();
                        applicationContext.unregisterReceiver(FpAuthManager.e(FpAuthManager.this));
                    }
                };
                this.e = new BroadcastReceiver() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpAuthManager.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context2, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                            return;
                        }
                        int intExtra = intent.getIntExtra("com.alipay.security.mobile.alipayauthenticatorservice.broadcast.FINGERPRINTSENSOR_STATUS_VALUE", 0);
                        if (intExtra == 1) {
                            return;
                        }
                        if (intExtra == 2) {
                            FpAuthManager.a(FpAuthManager.this).onProcessAuth(context);
                        } else if (intExtra != 100) {
                        } else {
                            FpAuthManager.a(FpAuthManager.this).onAuthSuccess(context);
                        }
                    }
                };
                applicationContext.registerReceiver(this.e, FingerprintBroadcastUtil.getIdentifyChangeBroadcastFilter());
                if (this.b == null) {
                    return 111;
                }
                this.c = a(context, 1, authenticatorMessage, this.b, callback);
                if (this.c == null) {
                    return 111;
                }
                this.b.process(authenticatorMessage, authenticatorCallback);
                return 0;
            }
        } catch (Throwable th) {
            AuthenticatorLOG.fpInfo(th.toString());
            IBiometricValidateDialog iBiometricValidateDialog = this.c;
            if (iBiometricValidateDialog == null) {
                return 111;
            }
            iBiometricValidateDialog.onCompleteAuth(context);
            return 111;
        }
    }

    private IBiometricValidateDialog a(Context context, int i, final AuthenticatorMessage authenticatorMessage, final IAuthenticator iAuthenticator, final IAuthenticatorManager.Callback callback) {
        IBiometricValidateDialog fpFullViewDialog;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBiometricValidateDialog) ipChange.ipc$dispatch("17b9dd35", new Object[]{this, context, new Integer(i), authenticatorMessage, iAuthenticator, callback});
        }
        if (i != 1) {
            return null;
        }
        if (authenticatorMessage.getType() != 2 && authenticatorMessage.getType() != 3) {
            return null;
        }
        if (CommonUtils.isBlank(AuthenticatorApi.getFingerprintExtInfo(context))) {
            AuthenticatorLOG.fpInfo("normal auth");
            fpFullViewDialog = new FpNormalAuthDialog();
        } else {
            AuthenticatorLOG.fpInfo("fullscreen auth");
            fpFullViewDialog = new FpFullViewDialog();
        }
        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_TITLE);
        if (StringUtils.isEmpty(clientText)) {
            int type = authenticatorMessage.getType();
            if (type == 2) {
                clientText = context.getString(R.string.fp_auth_start_title);
            } else if (type == 3) {
                clientText = context.getString(R.string.fp_auth_default_text);
            } else {
                clientText = context.getString(R.string.fp_auth_default_text);
            }
        }
        fpFullViewDialog.showDialog(context, 1, clientText, new IBiometricValidateDialog.IDialogActionListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpAuthManager.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateDialog.IDialogActionListener
            public void onAction(int i2) {
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("781efb87", new Object[]{this, new Integer(i2)});
                    return;
                }
                AuthenticatorLOG.fpInfo("action: " + i2);
                AuthenticatorResponse authenticatorResponse = new AuthenticatorResponse(1, 1);
                if (i2 == 1) {
                    str = "user cancel";
                } else if (i2 != 2) {
                    if (i2 == 3) {
                        AuthenticatorLOG.fpInfo("fallback");
                        BioBehaviorUtils.getInstance().add(authenticatorMessage, "change to pwd");
                        authenticatorResponse.setResult(121);
                    }
                    iAuthenticator.cancel();
                    callback.onResult(authenticatorResponse);
                } else {
                    str = "system cancel";
                }
                AuthenticatorLOG.fpInfo(str);
                BioBehaviorUtils.getInstance().add(authenticatorMessage, str);
                authenticatorResponse.setResult(102);
                iAuthenticator.cancel();
                callback.onResult(authenticatorResponse);
            }
        });
        return fpFullViewDialog;
    }

    public int dereg(Context context, String str, final IAuthenticatorManager.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("252e378d", new Object[]{this, context, str, callback})).intValue();
        }
        if (this.b == null) {
            try {
                this.b = AuthenticatorFactory.create(context, 1);
                this.b.setContext(context);
            } catch (Exception e) {
                AuthenticatorLOG.fpInfo(e);
                return -1;
            }
        }
        try {
            AuthenticatorMessage authenticatorMessage = new AuthenticatorMessage();
            authenticatorMessage.setAuthenticatorType(Constants.TYPE_FINGERPRINT);
            authenticatorMessage.setData(str);
            authenticatorMessage.setType(4);
            this.b.cancel();
            this.b.process(authenticatorMessage, new AuthenticatorCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpAuthManager.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
                public void callback(AuthenticatorResponse authenticatorResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse});
                    } else {
                        callback.onResult(authenticatorResponse);
                    }
                }
            });
            return 0;
        } catch (Exception e2) {
            AuthenticatorLOG.fpInfo(e2);
            return -1;
        }
    }

    public void stopAuth(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("250f4097", new Object[]{this, context});
            return;
        }
        try {
            AuthenticatorLOG.fpInfo("cancel on background");
            IAuthenticator create = AuthenticatorFactory.create(context, 1);
            if (create != null) {
                create.cancel();
            }
            if (this.c == null) {
                return;
            }
            this.c.onCompleteAuth(context);
        } catch (Throwable th) {
            AuthenticatorLOG.fpInfo(th.toString());
        }
    }

    public BICDataModel getFpBicDataModel(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BICDataModel) ipChange.ipc$dispatch("b06ae262", new Object[]{this, context});
        }
        IAuthenticator iAuthenticator = this.b;
        if (iAuthenticator == null) {
            try {
                this.b = AuthenticatorFactory.create(context, 1);
                this.b.setContext(context);
                if (!(this.b instanceof FingerprintAuthenticatorAdapter)) {
                    return null;
                }
            } catch (Exception e) {
                AuthenticatorLOG.fpInfo(e);
                return null;
            }
        } else if (!(iAuthenticator instanceof FingerprintAuthenticatorAdapter)) {
            return null;
        }
        try {
            String deviceId = IFAADevice.getInstance(context).getDeviceId();
            if (StringUtils.isEmpty(deviceId)) {
                deviceId = "null";
            }
            String str = deviceId;
            String deviceModel = IFAAFingerprintManagerAdapter.getInstance(context).getDeviceModel();
            int i = IFAAFingerprintManagerAdapter.getInstance(context).hasEnrolledFingerprints() ? 1 : 0;
            String fingerprintExtInfo = IFAAManagerAdaptor.getFingerprintExtInfo(context);
            int supportBioTypes = IFAAManagerAdaptor.getSupportBioTypes(context);
            return new BICDataModel(str, Build.MODEL, deviceModel, 0, Constants.TYPE_FINGERPRINT, 102, i, 1, ((Constants.TYPE_FINGERPRINT & supportBioTypes) == 0 || (supportBioTypes & 16) == 0 || CommonUtils.isBlank(fingerprintExtInfo)) ? 0 : 1);
        } catch (Exception unused) {
            return null;
        }
    }
}
