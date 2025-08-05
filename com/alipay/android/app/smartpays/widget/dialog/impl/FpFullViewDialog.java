package com.alipay.android.app.smartpays.widget.dialog.impl;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.app.smartpays.res.IResourceLoader;
import com.alipay.android.app.smartpays.widget.dialog.IDialogActionListener;
import com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog;
import com.alipay.android.app.utils.SpOuterUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.security.mobile.api.AuthenticatorApi;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.HashMap;
import org.json.JSONObject;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class FpFullViewDialog implements IHardwarePayDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IResourceLoader f4429a;
    private VerifyEnum b;
    private Dialog c;
    private TextView d;
    private ImageView e;
    private TextView f;
    private IDialogActionListener g;
    private Rect h;
    private boolean i;
    private boolean j;

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public void setAllButtonsGone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede53c68", new Object[]{this});
        }
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public void showAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6b160e", new Object[]{this});
        }
    }

    public static /* synthetic */ void a(FpFullViewDialog fpFullViewDialog, Activity activity, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb79b6ea", new Object[]{fpFullViewDialog, activity, str, iDialogActionListener});
        } else {
            fpFullViewDialog.a(activity, str, iDialogActionListener);
        }
    }

    public static /* synthetic */ boolean a(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c182fd42", new Object[]{fpFullViewDialog})).booleanValue() : fpFullViewDialog.j;
    }

    public static /* synthetic */ boolean a(FpFullViewDialog fpFullViewDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6edd5d5a", new Object[]{fpFullViewDialog, new Boolean(z)})).booleanValue();
        }
        fpFullViewDialog.j = z;
        return z;
    }

    public static /* synthetic */ IDialogActionListener b(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDialogActionListener) ipChange.ipc$dispatch("4aa1dac7", new Object[]{fpFullViewDialog}) : fpFullViewDialog.g;
    }

    public static /* synthetic */ void b(FpFullViewDialog fpFullViewDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0f48ab5", new Object[]{fpFullViewDialog, new Boolean(z)});
        } else {
            fpFullViewDialog.a(z);
        }
    }

    public static /* synthetic */ Dialog c(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("a1dd83cf", new Object[]{fpFullViewDialog}) : fpFullViewDialog.c;
    }

    public static /* synthetic */ TextView d(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("3085f2f5", new Object[]{fpFullViewDialog}) : fpFullViewDialog.d;
    }

    public static /* synthetic */ boolean e(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("903ba846", new Object[]{fpFullViewDialog})).booleanValue() : fpFullViewDialog.i;
    }

    public FpFullViewDialog(VerifyEnum verifyEnum) {
        this.b = verifyEnum;
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public void setResourceLoader(IResourceLoader iResourceLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a13b031e", new Object[]{this, iResourceLoader});
        } else {
            this.f4429a = iResourceLoader;
        }
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public void showDialog(final Activity activity, final String str, final IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d61f5d8", new Object[]{this, activity, str, iDialogActionListener});
            return;
        }
        try {
            a((Context) activity);
            activity.runOnUiThread(new Runnable() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpFullViewDialog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        FpFullViewDialog.a(FpFullViewDialog.this, activity, str, iDialogActionListener);
                    }
                }
            });
            HashMap hashMap = new HashMap();
            hashMap.put("action", "FpFullViewDialog");
            SpOuterUtil.walletEventLog("1010897", "pay", hashMap);
        } catch (Exception e) {
            LogUtils.printExceptionStackTrace(e);
        }
    }

    private void a(Activity activity, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6740dc94", new Object[]{this, activity, str, iDialogActionListener});
        } else if (activity == null) {
        } else {
            this.g = iDialogActionListener;
            this.c = new Dialog(activity);
            this.c.requestWindowFeature(1);
            this.c.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            try {
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(activity).inflate(this.f4429a.getLayoutId("safepay_fpfullview_dialog_layout"), (ViewGroup) null);
                linearLayout.requestFocus();
                linearLayout.requestFocusFromTouch();
                this.d = (TextView) linearLayout.findViewById(this.f4429a.getId("safepay_fpfullview_dialog_tips"));
                if (TextUtils.isEmpty(str)) {
                    this.d.setText(this.f4429a.getId("safepay_fp_open"));
                } else {
                    this.d.setText(str);
                }
                this.j = false;
                this.e = (ImageView) linearLayout.findViewById(this.f4429a.getId("safepay_fpfullview_dialog_cancel"));
                this.e.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpFullViewDialog.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (FpFullViewDialog.a(FpFullViewDialog.this)) {
                        } else {
                            if (FpFullViewDialog.b(FpFullViewDialog.this) != null) {
                                FpFullViewDialog.b(FpFullViewDialog.this).onAction(0);
                            }
                            FpFullViewDialog.a(FpFullViewDialog.this, true);
                            FpFullViewDialog.c(FpFullViewDialog.this).dismiss();
                        }
                    }
                });
                this.f = (TextView) linearLayout.findViewById(this.f4429a.getId("safepay_fpfullview_dialog_pwd"));
                this.f.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpFullViewDialog.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (FpFullViewDialog.a(FpFullViewDialog.this)) {
                        } else {
                            if (FpFullViewDialog.b(FpFullViewDialog.this) != null) {
                                FpFullViewDialog.b(FpFullViewDialog.this).onAction(2);
                            }
                            FpFullViewDialog.c(FpFullViewDialog.this).dismiss();
                        }
                    }
                });
                if (this.b == VerifyEnum.OPEN) {
                    this.f.setVisibility(8);
                } else {
                    this.f.setVisibility(0);
                }
                DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                int i = displayMetrics.widthPixels;
                int i2 = displayMetrics.heightPixels;
                float f = displayMetrics.density;
                int i3 = (int) (130.0f * f);
                int a2 = a(activity);
                WindowManager.LayoutParams attributes = this.c.getWindow().getAttributes();
                attributes.width = i;
                attributes.height = ((this.h.bottom + i3) - this.h.top) + ((int) (f * 30.0f));
                attributes.x = 0;
                if (a()) {
                    attributes.y = (this.h.top - i3) - a2 > 0 ? (this.h.top - i3) - a2 : 0;
                } else {
                    attributes.y = this.h.top - i3 > 0 ? this.h.top - i3 : 0;
                }
                attributes.gravity = 48;
                this.c.getWindow().setAttributes(attributes);
                if (this.i) {
                    a(false);
                }
                this.c.setContentView(linearLayout);
                this.c.setCancelable(false);
                this.c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpFullViewDialog.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnDismissListener
                    public void onDismiss(DialogInterface dialogInterface) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                        }
                    }
                });
                this.c.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpFullViewDialog.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        }
                    }
                });
                try {
                    if (Build.VERSION.SDK_INT >= 29) {
                        this.c.getWindow().getDecorView().setForceDarkAllowed(false);
                    }
                } catch (Throwable unused) {
                }
                this.c.show();
            } catch (Throwable th) {
                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "fpV1", "ShowFpFullViewDialogEx", th);
            }
            LogUtils.record(2, "FpFullViewDialog::showDialog", "FpFullViewDialog msg:" + str);
        }
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public void updateMsg(final String str, int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3228a9", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (this.d == null || TextUtils.isEmpty(str)) {
        } else {
            this.d.postDelayed(new Runnable() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpFullViewDialog.6
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

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public void dismiss(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c566ed7", new Object[]{this, context});
            return;
        }
        this.j = true;
        if (this.c == null) {
            return;
        }
        try {
            new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpFullViewDialog.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (((Activity) context).isFinishing()) {
                            return;
                        }
                        FpFullViewDialog.c(FpFullViewDialog.this).dismiss();
                    } catch (Exception e) {
                        LogUtils.printExceptionStackTrace(e);
                    }
                }
            });
        } catch (Exception e) {
            LogUtils.printExceptionStackTrace(e);
        }
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public void dismiss(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f3d312", new Object[]{this, new Integer(i)});
            return;
        }
        this.j = true;
        if (this.c == null) {
            return;
        }
        this.d.postDelayed(new Runnable() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpFullViewDialog.8
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
                        FpFullViewDialog.b(FpFullViewDialog.this, true);
                    }
                    FpFullViewDialog.c(FpFullViewDialog.this).dismiss();
                } catch (Exception e) {
                    LogUtils.printExceptionStackTrace(e);
                }
            }
        }, i);
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public boolean isShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d57d5b12", new Object[]{this})).booleanValue();
        }
        Dialog dialog = this.c;
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
        JSONObject optJSONObject;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        try {
            optJSONObject = new JSONObject(AuthenticatorApi.getFingerprintExtInfo(context)).optJSONObject("fullView");
            i = optJSONObject.optInt("startX", 0);
        } catch (Throwable th) {
            th = th;
            i = 0;
        }
        try {
            i2 = optJSONObject.optInt("startY", 0);
        } catch (Throwable th2) {
            th = th2;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            LogUtils.printExceptionStackTrace(th);
            this.h = new Rect(i, i2, i3 + i, i4 + i2);
            this.i = z;
        }
        try {
            i3 = optJSONObject.optInt("width", 0);
        } catch (Throwable th3) {
            th = th3;
            i3 = 0;
            i4 = 0;
            LogUtils.printExceptionStackTrace(th);
            this.h = new Rect(i, i2, i3 + i, i4 + i2);
            this.i = z;
        }
        try {
            i4 = optJSONObject.optInt("height", 0);
            try {
                z = optJSONObject.optBoolean("navConflict", false);
            } catch (Throwable th4) {
                th = th4;
                LogUtils.printExceptionStackTrace(th);
                this.h = new Rect(i, i2, i3 + i, i4 + i2);
                this.i = z;
            }
        } catch (Throwable th5) {
            th = th5;
            i4 = 0;
            LogUtils.printExceptionStackTrace(th);
            this.h = new Rect(i, i2, i3 + i, i4 + i2);
            this.i = z;
        }
        this.h = new Rect(i, i2, i3 + i, i4 + i2);
        this.i = z;
    }

    private int a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68a25ad", new Object[]{this, activity})).intValue();
        }
        Resources resources = activity.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
        LogUtils.record(2, "FpFullViewDialog", "Status height:" + dimensionPixelSize);
        return dimensionPixelSize;
    }

    private void a(boolean z) {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        Dialog dialog = this.c;
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

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        try {
            return TextUtils.equals(Build.MANUFACTURER.toLowerCase(), "oppo");
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
            return false;
        }
    }
}
