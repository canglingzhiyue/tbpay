package com.alipay.android.phone.seauthenticator.iotauth.fingerprint;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.PreDataHelper;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateDialog;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.util.CommonUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class FpNormalAuthDialog extends IBiometricValidateDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f5201a;
    private Dialog b;
    private TextView c;
    private TextView d;
    private TextView e;
    private IBiometricValidateDialog.IDialogActionListener f;
    private boolean g;

    public static /* synthetic */ Object ipc$super(FpNormalAuthDialog fpNormalAuthDialog, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ IBiometricValidateDialog.IDialogActionListener a(FpNormalAuthDialog fpNormalAuthDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBiometricValidateDialog.IDialogActionListener) ipChange.ipc$dispatch("f7cfd4f1", new Object[]{fpNormalAuthDialog}) : fpNormalAuthDialog.f;
    }

    public static /* synthetic */ boolean a(FpNormalAuthDialog fpNormalAuthDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("198fc5ea", new Object[]{fpNormalAuthDialog, new Boolean(z)})).booleanValue();
        }
        fpNormalAuthDialog.g = z;
        return z;
    }

    public static /* synthetic */ Dialog b(FpNormalAuthDialog fpNormalAuthDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("fa42422", new Object[]{fpNormalAuthDialog}) : fpNormalAuthDialog.b;
    }

    public static /* synthetic */ TextView c(FpNormalAuthDialog fpNormalAuthDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("25466c60", new Object[]{fpNormalAuthDialog}) : fpNormalAuthDialog.c;
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateDialog
    public Dialog showDialog(Context context, int i, String str, IBiometricValidateDialog.IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("ceb66dcd", new Object[]{this, context, new Integer(i), str, iDialogActionListener});
        }
        if (context == null) {
            return null;
        }
        this.f5201a = context;
        this.f = iDialogActionListener;
        try {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f5201a).inflate(R.layout.fp_normal_auth_layout, (ViewGroup) null);
            linearLayout.requestFocus();
            linearLayout.requestFocusFromTouch();
            if (Build.VERSION.SDK_INT >= 29) {
                linearLayout.setForceDarkAllowed(false);
            }
            this.b = new Dialog(this.f5201a, R.style.bio_TransparentTheme);
            this.b.requestWindowFeature(1);
            this.c = (TextView) linearLayout.findViewById(R.id.fp_normal_auth_title_reason);
            if (!CommonUtils.isBlank(str)) {
                this.c.setText(str);
            }
            this.d = (TextView) linearLayout.findViewById(R.id.fp_normal_auth_btn_cancel);
            this.e = (TextView) linearLayout.findViewById(R.id.fp_normal_auth_btn_switch);
            String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_SWITCH);
            if (!TextUtils.isEmpty(clientText)) {
                this.e.setText(clientText);
                this.e.setVisibility(0);
                ((RelativeLayout.LayoutParams) this.d.getLayoutParams()).addRule(9, -1);
                this.d.setTextColor(Color.parseColor("#999999"));
                this.e.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpNormalAuthDialog.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        if (FpNormalAuthDialog.a(FpNormalAuthDialog.this) != null) {
                            FpNormalAuthDialog.a(FpNormalAuthDialog.this).onAction(3);
                        }
                        FpNormalAuthDialog.b(FpNormalAuthDialog.this).dismiss();
                    }
                });
            }
            this.d.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpNormalAuthDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (FpNormalAuthDialog.a(FpNormalAuthDialog.this) != null) {
                        FpNormalAuthDialog.a(FpNormalAuthDialog.this).onAction(1);
                    }
                    FpNormalAuthDialog.a(FpNormalAuthDialog.this, true);
                    FpNormalAuthDialog.b(FpNormalAuthDialog.this).dismiss();
                }
            });
            this.b.setContentView(linearLayout);
            this.b.setCancelable(false);
            this.b.show();
        } catch (Exception e) {
            AuthenticatorLOG.fpInfo(e.toString());
        }
        return this.b;
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateDialog
    public void updateMsg(final String str, int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3228a9", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (this.c == null || TextUtils.isEmpty(str)) {
        } else {
            this.c.postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpNormalAuthDialog.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FpNormalAuthDialog.c(FpNormalAuthDialog.this).setText(str);
                    FpNormalAuthDialog.c(FpNormalAuthDialog.this).setTextColor(i2);
                }
            }, i);
        }
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateDialog
    public void dismiss(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f3d312", new Object[]{this, new Integer(i)});
        } else if (!a()) {
        } else {
            this.c.postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpNormalAuthDialog.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        FpNormalAuthDialog.b(FpNormalAuthDialog.this).dismiss();
                    } catch (Exception e) {
                        AuthenticatorLOG.fpInfo(e.toString());
                    }
                }
            }, i);
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        Dialog dialog = this.b;
        if (dialog == null) {
            return false;
        }
        return dialog.isShowing();
    }
}
