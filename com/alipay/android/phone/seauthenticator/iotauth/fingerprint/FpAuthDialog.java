package com.alipay.android.phone.seauthenticator.iotauth.fingerprint;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.PreDataHelper;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.util.CommonUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class FpAuthDialog extends IBiometricValidateNewDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ImageView mCancel;
    private Context mContext;
    private IBiometricValidateNewDialog.IDialogActionListener mListener;
    private TextView mSwitchBtn;
    private TextView mTitle;

    public static /* synthetic */ Object ipc$super(FpAuthDialog fpAuthDialog, String str, Object... objArr) {
        if (str.hashCode() == -340027132) {
            super.show();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ IBiometricValidateNewDialog.IDialogActionListener access$000(FpAuthDialog fpAuthDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBiometricValidateNewDialog.IDialogActionListener) ipChange.ipc$dispatch("f579656f", new Object[]{fpAuthDialog}) : fpAuthDialog.mListener;
    }

    public static /* synthetic */ TextView access$100(FpAuthDialog fpAuthDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("f38bdb39", new Object[]{fpAuthDialog}) : fpAuthDialog.mTitle;
    }

    public static /* synthetic */ ImageView access$200(FpAuthDialog fpAuthDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("f4b88c2c", new Object[]{fpAuthDialog}) : fpAuthDialog.mCancel;
    }

    public static /* synthetic */ TextView access$300(FpAuthDialog fpAuthDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("ce655577", new Object[]{fpAuthDialog}) : fpAuthDialog.mSwitchBtn;
    }

    public FpAuthDialog(Context context) {
        super(context, R.style.bio_TransparentTheme);
        this.mContext = context;
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.mContext).inflate(R.layout.fp_auth_dialog_layout, (ViewGroup) null);
        linearLayout.requestFocus();
        linearLayout.requestFocusFromTouch();
        if (Build.VERSION.SDK_INT >= 29) {
            linearLayout.setForceDarkAllowed(false);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        setCancelable(false);
        setContentView(linearLayout, layoutParams);
        this.mTitle = (TextView) linearLayout.findViewById(R.id.fp_auth_title);
        this.mCancel = (ImageView) linearLayout.findViewById(R.id.fp_auth_cancel);
        this.mSwitchBtn = (TextView) linearLayout.findViewById(R.id.fp_auth_btn_switch);
        this.mCancel.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpAuthDialog.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (FpAuthDialog.access$000(FpAuthDialog.this) != null) {
                    FpAuthDialog.access$000(FpAuthDialog.this).onAction(1);
                }
                FpAuthDialog.this.dismiss(0);
            }
        });
        this.mSwitchBtn.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpAuthDialog.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (FpAuthDialog.access$000(FpAuthDialog.this) != null) {
                    FpAuthDialog.access$000(FpAuthDialog.this).onAction(4);
                }
                FpAuthDialog.this.dismiss(0);
            }
        });
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog
    public Dialog showDialog(int i, String str, int i2, IBiometricValidateNewDialog.IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("fe889eae", new Object[]{this, new Integer(i), str, new Integer(i2), iDialogActionListener});
        }
        if (isShowing()) {
            dismiss(0);
        }
        super.show();
        initView();
        this.mListener = iDialogActionListener;
        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_TITLE);
        if (!CommonUtils.isBlank(clientText)) {
            this.mTitle.setText(clientText);
        }
        String clientText2 = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_SWITCH);
        if (TextUtils.isEmpty(clientText2)) {
            this.mSwitchBtn.setVisibility(4);
        } else {
            this.mSwitchBtn.setVisibility(0);
            this.mSwitchBtn.setText(clientText2);
        }
        return this;
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog, com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.AuthNotify
    public void onCompleteAuth(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff2d321", new Object[]{this, context});
        } else {
            dismiss(200);
        }
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog
    public void updateMsg(final String str, int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3228a9", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (this.mTitle == null || TextUtils.isEmpty(str)) {
        } else {
            this.mTitle.postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpAuthDialog.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FpAuthDialog.access$100(FpAuthDialog.this).setText(str);
                    FpAuthDialog.access$100(FpAuthDialog.this).setTextColor(i2);
                }
            }, i);
        }
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog
    public void setBtnClickable(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67bbf2c5", new Object[]{this, new Boolean(z)});
        } else {
            this.mTitle.post(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpAuthDialog.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (FpAuthDialog.access$200(FpAuthDialog.this) != null) {
                        FpAuthDialog.access$200(FpAuthDialog.this).setEnabled(z);
                    }
                    if (FpAuthDialog.access$300(FpAuthDialog.this) == null) {
                        return;
                    }
                    FpAuthDialog.access$300(FpAuthDialog.this).setEnabled(z);
                }
            });
        }
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog
    public void dismiss(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f3d312", new Object[]{this, new Integer(i)});
        } else if (!isShowing()) {
        } else {
            this.mTitle.postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpAuthDialog.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        FpAuthDialog.this.dismiss();
                    } catch (Exception e) {
                        AuthenticatorLOG.fpInfo(e.toString());
                    }
                }
            }, i);
        }
    }
}
