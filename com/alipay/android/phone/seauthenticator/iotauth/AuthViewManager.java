package com.alipay.android.phone.seauthenticator.iotauth;

import android.content.Context;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpAuthDialog;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewCompatDialog;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.NewFpFullViewDialog;
import com.alipay.security.mobile.api.IFAAManagerAdaptor;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.util.BioBehaviorUtils;
import com.alipay.security.mobile.util.ConfigServiceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class AuthViewManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AuthViewManager f5123a;
    private IBiometricValidateNewDialog b = null;

    private AuthViewManager() {
    }

    public static synchronized AuthViewManager getInstance() {
        synchronized (AuthViewManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AuthViewManager) ipChange.ipc$dispatch("2b222e72", new Object[0]);
            }
            if (f5123a == null) {
                f5123a = new AuthViewManager();
            }
            return f5123a;
        }
    }

    public static IBiometricValidateNewDialog getAuthDialog(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBiometricValidateNewDialog) ipChange.ipc$dispatch("77cc5cf1", new Object[]{context});
        }
        if (!IFAAManagerAdaptor.isUnderScreen(context)) {
            AuthenticatorLOG.fpInfo("new normal auth");
            return new FpAuthDialog(context);
        } else if ("off".equalsIgnoreCase(ConfigServiceUtil.syncConfigMode(ConfigServiceUtil.KEY_BIO_NEW_UI_COMPAT, ""))) {
            return new NewFpFullViewDialog(context);
        } else {
            return new FpFullViewCompatDialog(context);
        }
    }

    public void startFpVerifyUI(final Context context, final AuthenticatorMessage authenticatorMessage, final IBiometricValidateNewDialog.IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90043168", new Object[]{this, context, authenticatorMessage, iDialogActionListener});
            return;
        }
        if (this.b != null) {
            a();
        }
        this.b = getAuthDialog(context);
        this.b.showDialog(1, context.getString(R.string.fp_auth_default_text), authenticatorMessage.getSwitchBtnType(), new IBiometricValidateNewDialog.IDialogActionListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.AuthViewManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog.IDialogActionListener
            public void onAction(int i) {
                String str;
                AuthViewManager authViewManager;
                Context context2;
                int i2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("781efb87", new Object[]{this, new Integer(i)});
                    return;
                }
                AuthenticatorLOG.fpInfo("action: " + i);
                if (i == 1) {
                    str = "user cancel";
                } else if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            AuthenticatorLOG.fpInfo(Constants.STRING_AUTH_SWITCH);
                            BioBehaviorUtils.getInstance().add(authenticatorMessage, "change to other");
                            authViewManager = AuthViewManager.this;
                            context2 = context;
                            i2 = 135;
                        }
                        iDialogActionListener.onAction(i);
                    }
                    AuthenticatorLOG.fpInfo("fallback");
                    BioBehaviorUtils.getInstance().add(authenticatorMessage, "change to pwd");
                    authViewManager = AuthViewManager.this;
                    context2 = context;
                    i2 = 121;
                    authViewManager.updateVerifyUI(context2, i2, true);
                    iDialogActionListener.onAction(i);
                } else {
                    str = "system cancel";
                }
                AuthenticatorLOG.fpInfo(str);
                BioBehaviorUtils.getInstance().add(authenticatorMessage, str);
                AuthViewManager.this.updateVerifyUI(context, 102, true);
                iDialogActionListener.onAction(i);
            }
        });
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        IBiometricValidateNewDialog iBiometricValidateNewDialog = this.b;
        if (iBiometricValidateNewDialog != null && iBiometricValidateNewDialog.isShowing()) {
            this.b.dismiss();
        }
        this.b = null;
    }

    public void updateVerifyUI(Context context, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea8059c", new Object[]{this, context, new Integer(i), new Boolean(z)});
            return;
        }
        IBiometricValidateNewDialog iBiometricValidateNewDialog = this.b;
        if (iBiometricValidateNewDialog == null) {
            return;
        }
        if (i == 100) {
            iBiometricValidateNewDialog.onAuthSuccess(context);
        } else if (i == 101) {
            iBiometricValidateNewDialog.onAuthFail(context);
        } else if (i != 103) {
            if (i == 129) {
                iBiometricValidateNewDialog.onAuthNoMatchTooMuch(context);
            }
        } else if (!z) {
            iBiometricValidateNewDialog.onAuthNoMatch(context);
        } else {
            iBiometricValidateNewDialog.onAuthNoMatchTooMuch(context);
        }
        if (!z) {
            return;
        }
        this.b.onCompleteAuth(context);
    }

    public void dismissDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa707f9", new Object[]{this});
            return;
        }
        IBiometricValidateNewDialog iBiometricValidateNewDialog = this.b;
        if (iBiometricValidateNewDialog == null) {
            return;
        }
        iBiometricValidateNewDialog.dismiss(0);
    }
}
