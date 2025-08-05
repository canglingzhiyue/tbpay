package com.alipay.android.phone.seauthenticator.iotauth.face;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.PreDataHelper;
import com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager;
import com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.util.CommonUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class FaceAuthDialog extends IBiometricValidateNewDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static FaceAnimationManager.ActionCallback mActionCallback;

    /* renamed from: a  reason: collision with root package name */
    private Activity f5153a;
    private TextView b;
    private FaceView c;
    private ImageView d;
    private TextView e;
    private IBiometricValidateNewDialog.IDialogActionListener f;
    public FaceAnimationManager mFaceAnimationManager;

    public static /* synthetic */ Object ipc$super(FaceAuthDialog faceAuthDialog, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != -340027132) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.show();
            return null;
        }
    }

    public static /* synthetic */ Activity a(FaceAuthDialog faceAuthDialog, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("5f7a26bf", new Object[]{faceAuthDialog, activity});
        }
        faceAuthDialog.f5153a = activity;
        return activity;
    }

    public static /* synthetic */ IBiometricValidateNewDialog.IDialogActionListener a(FaceAuthDialog faceAuthDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBiometricValidateNewDialog.IDialogActionListener) ipChange.ipc$dispatch("1e413d7e", new Object[]{faceAuthDialog}) : faceAuthDialog.f;
    }

    public static /* synthetic */ TextView b(FaceAuthDialog faceAuthDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("7610aaac", new Object[]{faceAuthDialog}) : faceAuthDialog.b;
    }

    public FaceAuthDialog(Activity activity, FaceAnimationManager faceAnimationManager) {
        super(activity, R.style.bio_TransparentTheme);
        this.f5153a = activity;
        this.mFaceAnimationManager = faceAnimationManager;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f5153a).inflate(R.layout.face_auth_dialog_layout, (ViewGroup) null);
        linearLayout.requestFocus();
        linearLayout.requestFocusFromTouch();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        setCancelable(false);
        setContentView(linearLayout, layoutParams);
        this.b = (TextView) linearLayout.findViewById(R.id.face_auth_title);
        this.d = (ImageView) linearLayout.findViewById(R.id.face_auth_cancel);
        this.e = (TextView) linearLayout.findViewById(R.id.face_auth_btn_switch);
        this.c = (FaceView) linearLayout.findViewById(R.id.faceview);
        linearLayout.setBackground(null);
        FaceAnimationManager faceAnimationManager = this.mFaceAnimationManager;
        if (faceAnimationManager != null) {
            faceAnimationManager.init(this.f5153a, linearLayout, this.c, this.d, this.e, this.b);
        }
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthDialog.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                    return;
                }
                FaceAuthDialog.this.mFaceAnimationManager.reset();
                FaceAuthDialog.a(FaceAuthDialog.this, null);
            }
        });
        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_SWITCH);
        if (!TextUtils.isEmpty(clientText)) {
            this.e.setText(clientText);
        }
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthDialog.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (FaceAuthDialog.a(FaceAuthDialog.this) != null) {
                    FaceAuthDialog.a(FaceAuthDialog.this).onAction(1);
                }
                FaceAuthDialog.this.dismiss();
            }
        });
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthDialog.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (FaceAuthDialog.a(FaceAuthDialog.this) != null) {
                    FaceAuthDialog.a(FaceAuthDialog.this).onAction(4);
                }
                FaceAuthDialog.this.dismiss();
            }
        });
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog
    public Dialog showDialog(int i, String str, int i2, IBiometricValidateNewDialog.IDialogActionListener iDialogActionListener) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("fe889eae", new Object[]{this, new Integer(i), str, new Integer(i2), iDialogActionListener});
        }
        if (isShowing()) {
            dismiss();
        }
        super.show();
        FaceAnimationManager.ActionCallback actionCallback = mActionCallback;
        if (actionCallback != null) {
            actionCallback.onAction(0);
        }
        this.f = iDialogActionListener;
        if (!CommonUtils.isBlank(str) && (textView = this.b) != null) {
            textView.setText(str);
        }
        return this;
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog, com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.AuthNotify
    public void onAuthNoMatch(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("369f93e4", new Object[]{this, context});
            return;
        }
        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_NOT_MATCH);
        if (TextUtils.isEmpty(clientText)) {
            clientText = context.getString(R.string.face_auth_not_match);
        }
        updateMsg(clientText, 0, -65536);
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog, com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.AuthNotify
    public void onAuthNoMatchTooMuch(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9979293d", new Object[]{this, context});
            return;
        }
        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_OVER_COUNT);
        if (TextUtils.isEmpty(clientText)) {
            clientText = context.getString(R.string.face_auth_over_count);
        }
        updateMsg(clientText, 0, -65536);
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog, com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.AuthNotify
    public void onAuthSuccess(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7ea4c5", new Object[]{this, context});
            return;
        }
        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_SUCCESS);
        if (TextUtils.isEmpty(clientText)) {
            clientText = context.getString(R.string.face_auth_success);
        }
        updateMsg(clientText, 0, -16777216);
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog, com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.AuthNotify
    public void onAuthFail(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d30b5c", new Object[]{this, context});
            return;
        }
        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_FAILURE);
        if (TextUtils.isEmpty(clientText)) {
            clientText = context.getString(R.string.face_auth_fail);
        }
        updateMsg(clientText, 0, -65536);
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog, com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.AuthNotify
    public void onProcessAuth(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdefd2c9", new Object[]{this, context});
            return;
        }
        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_PROCESSING);
        if (TextUtils.isEmpty(clientText)) {
            clientText = context.getString(R.string.face_auth_processing);
        }
        updateMsg(clientText, 200, -16777216);
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog
    public void updateMsg(final String str, int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3228a9", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (this.b == null || TextUtils.isEmpty(str)) {
        } else {
            this.b.postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthDialog.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FaceAuthDialog.b(FaceAuthDialog.this).setText(str);
                    FaceAuthDialog.b(FaceAuthDialog.this).setTextColor(i2);
                }
            }, i);
        }
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog
    public void dismiss(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f3d312", new Object[]{this, new Integer(i)});
        } else if (!isShowing()) {
        } else {
            this.b.postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthDialog.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        FaceAuthDialog.this.dismiss();
                    } catch (Exception e) {
                        AuthenticatorLOG.fpInfo(e.toString());
                    }
                }
            }, i);
        }
    }
}
