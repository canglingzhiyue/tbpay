package com.alipay.android.phone.seauthenticator.iotauth.fingerprint;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.PreDataHelper;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateDialog;
import com.alipay.security.mobile.api.AuthenticatorApi;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.util.CommonUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class FpFullViewDialog extends IBiometricValidateDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Dialog f5196a;
    private TextView b;
    private ImageView c;
    private TextView d;
    private IBiometricValidateDialog.IDialogActionListener e;
    private Rect f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;

    public static /* synthetic */ Object ipc$super(FpFullViewDialog fpFullViewDialog, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ IBiometricValidateDialog.IDialogActionListener a(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBiometricValidateDialog.IDialogActionListener) ipChange.ipc$dispatch("ec4fceac", new Object[]{fpFullViewDialog}) : fpFullViewDialog.e;
    }

    public static /* synthetic */ boolean a(FpFullViewDialog fpFullViewDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f39c0f0f", new Object[]{fpFullViewDialog, new Boolean(z)})).booleanValue();
        }
        fpFullViewDialog.i = z;
        return z;
    }

    public static /* synthetic */ Dialog b(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("8e0f1a47", new Object[]{fpFullViewDialog}) : fpFullViewDialog.f5196a;
    }

    public static /* synthetic */ boolean b(FpFullViewDialog fpFullViewDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab887c90", new Object[]{fpFullViewDialog, new Boolean(z)})).booleanValue();
        }
        fpFullViewDialog.h = z;
        return z;
    }

    public static /* synthetic */ void c(FpFullViewDialog fpFullViewDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6374ea0d", new Object[]{fpFullViewDialog, new Boolean(z)});
        } else {
            fpFullViewDialog.a(z);
        }
    }

    public static /* synthetic */ boolean c(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1bfb7dab", new Object[]{fpFullViewDialog})).booleanValue() : fpFullViewDialog.j;
    }

    public static /* synthetic */ TextView d(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("6a51527a", new Object[]{fpFullViewDialog}) : fpFullViewDialog.b;
    }

    public static /* synthetic */ boolean e(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abfa3a69", new Object[]{fpFullViewDialog})).booleanValue() : fpFullViewDialog.g;
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
        a(context);
        this.e = iDialogActionListener;
        this.f5196a = new Dialog(context);
        this.f5196a.requestWindowFeature(1);
        this.f5196a.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        try {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.fp_fullview_dialog_layout, (ViewGroup) null);
            linearLayout.requestFocus();
            linearLayout.requestFocusFromTouch();
            if (Build.VERSION.SDK_INT >= 29) {
                linearLayout.setForceDarkAllowed(false);
            }
            this.b = (TextView) linearLayout.findViewById(R.id.fp_fullview_dialog_tips);
            if (CommonUtils.isBlank(str)) {
                this.b.setText(context.getString(R.string.fp_auth_start_title));
            } else {
                this.b.setText(str);
            }
            this.i = false;
            this.c = (ImageView) linearLayout.findViewById(R.id.fp_fullview_dialog_close);
            this.c.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewDialog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (FpFullViewDialog.a(FpFullViewDialog.this) != null) {
                        FpFullViewDialog.a(FpFullViewDialog.this).onAction(1);
                    }
                    FpFullViewDialog.a(FpFullViewDialog.this, true);
                    FpFullViewDialog.b(FpFullViewDialog.this).dismiss();
                }
            });
            this.d = (TextView) linearLayout.findViewById(R.id.fp_fullview_dialog_cancel);
            final String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_SWITCH);
            if (!StringUtils.isEmpty(clientText)) {
                this.d.setText(clientText);
            }
            this.d.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (FpFullViewDialog.a(FpFullViewDialog.this) != null && !FpFullViewDialog.c(FpFullViewDialog.this)) {
                        if (StringUtils.isEmpty(clientText)) {
                            FpFullViewDialog.a(FpFullViewDialog.this).onAction(1);
                        } else {
                            FpFullViewDialog.a(FpFullViewDialog.this).onAction(3);
                        }
                    }
                    FpFullViewDialog.b(FpFullViewDialog.this, true);
                    FpFullViewDialog.b(FpFullViewDialog.this).dismiss();
                }
            });
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i2 = displayMetrics.widthPixels;
            float f = displayMetrics.density;
            int i3 = (int) (130.0f * f);
            int b = b(context);
            WindowManager.LayoutParams attributes = this.f5196a.getWindow().getAttributes();
            attributes.width = i2;
            attributes.height = ((this.f.bottom + i3) - this.f.top) + ((int) (f * 30.0f));
            attributes.x = 0;
            attributes.y = (this.f.top - i3) - b > 0 ? (this.f.top - i3) - b : 0;
            attributes.gravity = 48;
            this.f5196a.getWindow().setAttributes(attributes);
            if (this.g) {
                a(false);
            }
            this.f5196a.setContentView(linearLayout);
            this.f5196a.setCancelable(false);
            this.f5196a.show();
        } catch (Exception e) {
            AuthenticatorLOG.fpInfo(e.toString());
        }
        return this.f5196a;
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateDialog
    public void updateMsg(final String str, int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3228a9", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (this.b == null || StringUtils.isEmpty(str)) {
        } else {
            this.b.postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewDialog.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FpFullViewDialog.d(FpFullViewDialog.this).setText(str);
                    FpFullViewDialog.d(FpFullViewDialog.this).setTextColor(i2);
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
            this.j = true;
            this.b.postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewDialog.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (FpFullViewDialog.e(FpFullViewDialog.this)) {
                            FpFullViewDialog.c(FpFullViewDialog.this, true);
                        }
                        FpFullViewDialog.b(FpFullViewDialog.this).dismiss();
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
        Dialog dialog = this.f5196a;
        if (dialog == null) {
            return false;
        }
        return dialog.isShowing();
    }

    private void a(Context context) {
        int i;
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        try {
            JSONObject optJSONObject = new JSONObject(AuthenticatorApi.getFingerprintExtInfo(context)).optJSONObject("fullView");
            i = optJSONObject.optInt("startX", 0);
            try {
                i2 = optJSONObject.optInt("startY", 0);
                try {
                    i3 = optJSONObject.optInt("width", 0);
                    try {
                        i4 = optJSONObject.optInt("height", 0);
                        try {
                            z = optJSONObject.optBoolean("navConflict", false);
                        } catch (Exception e) {
                            e = e;
                            AuthenticatorLOG.fpInfo(e.toString());
                            this.f = new Rect(i, i2, i3 + i, i4 + i2);
                            this.g = z;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        i4 = 0;
                        AuthenticatorLOG.fpInfo(e.toString());
                        this.f = new Rect(i, i2, i3 + i, i4 + i2);
                        this.g = z;
                    }
                } catch (Exception e3) {
                    e = e3;
                    i3 = 0;
                    i4 = 0;
                    AuthenticatorLOG.fpInfo(e.toString());
                    this.f = new Rect(i, i2, i3 + i, i4 + i2);
                    this.g = z;
                }
            } catch (Exception e4) {
                e = e4;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                AuthenticatorLOG.fpInfo(e.toString());
                this.f = new Rect(i, i2, i3 + i, i4 + i2);
                this.g = z;
            }
        } catch (Exception e5) {
            e = e5;
            i = 0;
        }
        this.f = new Rect(i, i2, i3 + i, i4 + i2);
        this.g = z;
    }

    private int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{this, context})).intValue();
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
    }

    private void a(boolean z) {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        Dialog dialog = this.f5196a;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        View decorView = window.getDecorView();
        if (!z) {
            decorView.setSystemUiVisibility(4098);
        } else {
            decorView.setSystemUiVisibility(0);
        }
    }
}
