package com.alipay.android.msp.framework.hardwarepay.base;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
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
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog;
import com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.VerifyEnum;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.UIUtil;
import com.alipay.mobile.common.logging.api.DeviceProperty;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class FpFullViewDialog implements IHardwarePayDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Dialog f4714a;
    private TextView b;
    private IDialogActionListener c;
    private Rect d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private TextView j;
    private VerifyEnum k;

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void setAllButtonsGone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede53c68", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void showAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6b160e", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void showLoadingSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd03a60b", new Object[]{this});
        }
    }

    public static /* synthetic */ void a(FpFullViewDialog fpFullViewDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98854965", new Object[]{fpFullViewDialog, new Boolean(z)});
        } else {
            fpFullViewDialog.a(z);
        }
    }

    public static /* synthetic */ boolean a(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2e35d353", new Object[]{fpFullViewDialog})).booleanValue() : fpFullViewDialog.i;
    }

    public static /* synthetic */ IDialogActionListener b(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDialogActionListener) ipChange.ipc$dispatch("eb5e5788", new Object[]{fpFullViewDialog}) : fpFullViewDialog.c;
    }

    public static /* synthetic */ boolean b(FpFullViewDialog fpFullViewDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2f64288", new Object[]{fpFullViewDialog, new Boolean(z)})).booleanValue();
        }
        fpFullViewDialog.i = z;
        return z;
    }

    public static /* synthetic */ boolean c(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bc4da155", new Object[]{fpFullViewDialog})).booleanValue() : fpFullViewDialog.g;
    }

    public static /* synthetic */ boolean c(FpFullViewDialog fpFullViewDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd673ba7", new Object[]{fpFullViewDialog, new Boolean(z)})).booleanValue();
        }
        fpFullViewDialog.h = z;
        return z;
    }

    public static /* synthetic */ boolean d(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83598856", new Object[]{fpFullViewDialog})).booleanValue() : fpFullViewDialog.h;
    }

    public static /* synthetic */ TextView e(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("b17a0ec7", new Object[]{fpFullViewDialog}) : fpFullViewDialog.b;
    }

    public static /* synthetic */ boolean f(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("11715658", new Object[]{fpFullViewDialog})).booleanValue() : fpFullViewDialog.f;
    }

    public static /* synthetic */ Dialog g(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("ca451f1a", new Object[]{fpFullViewDialog}) : fpFullViewDialog.f4714a;
    }

    public static /* synthetic */ boolean h(FpFullViewDialog fpFullViewDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f89245a", new Object[]{fpFullViewDialog})).booleanValue() : fpFullViewDialog.e;
    }

    public FpFullViewDialog() {
        this.k = null;
    }

    public FpFullViewDialog(VerifyEnum verifyEnum) {
        this.k = verifyEnum;
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public Dialog showDialog(Activity activity, int i, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("f0603f56", new Object[]{this, activity, new Integer(i), str, iDialogActionListener});
        }
        if (activity == null || activity.isFinishing()) {
            return null;
        }
        a(activity);
        a(activity, str, iDialogActionListener);
        this.f4714a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.alipay.android.msp.framework.hardwarepay.base.FpFullViewDialog.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                } else if (FpFullViewDialog.a(FpFullViewDialog.this)) {
                } else {
                    if (FpFullViewDialog.b(FpFullViewDialog.this) != null && FpFullViewDialog.c(FpFullViewDialog.this)) {
                        FpFullViewDialog.b(FpFullViewDialog.this).onDialogAction(100);
                    } else if (FpFullViewDialog.b(FpFullViewDialog.this) == null || FpFullViewDialog.d(FpFullViewDialog.this)) {
                    } else {
                        FpFullViewDialog.b(FpFullViewDialog.this).onDialogAction(1);
                    }
                }
            }
        });
        this.f4714a.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.alipay.android.msp.framework.hardwarepay.base.FpFullViewDialog.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                } else if (FpFullViewDialog.a(FpFullViewDialog.this)) {
                } else {
                    if (FpFullViewDialog.b(FpFullViewDialog.this) != null && FpFullViewDialog.c(FpFullViewDialog.this)) {
                        FpFullViewDialog.b(FpFullViewDialog.this).onDialogAction(100);
                    } else if (FpFullViewDialog.b(FpFullViewDialog.this) == null || FpFullViewDialog.d(FpFullViewDialog.this)) {
                    } else {
                        FpFullViewDialog.b(FpFullViewDialog.this).onDialogAction(1);
                    }
                }
            }
        });
        this.f4714a.show();
        return this.f4714a;
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void showDialog(Activity activity, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e577c0", new Object[]{this, activity, str, iDialogActionListener});
        } else if (activity == null) {
        } else {
            try {
                if (activity.isFinishing()) {
                    return;
                }
                a(activity);
                a(activity, str, iDialogActionListener);
                if (this.k != null && this.k == VerifyEnum.OPEN) {
                    this.j.setVisibility(8);
                } else {
                    this.j.setVisibility(0);
                }
                this.f4714a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.alipay.android.msp.framework.hardwarepay.base.FpFullViewDialog.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnDismissListener
                    public void onDismiss(DialogInterface dialogInterface) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                        }
                    }
                });
                this.f4714a.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.alipay.android.msp.framework.hardwarepay.base.FpFullViewDialog.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        }
                    }
                });
                this.f4714a.show();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void updateMsg(final String str, int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3228a9", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (this.b == null || TextUtils.isEmpty(str)) {
        } else {
            this.b.postDelayed(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.base.FpFullViewDialog.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FpFullViewDialog.e(FpFullViewDialog.this).setText(str);
                    FpFullViewDialog.e(FpFullViewDialog.this).setTextColor(i2);
                }
            }, i);
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void dismiss(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f3d312", new Object[]{this, new Integer(i)});
            return;
        }
        Dialog dialog = this.f4714a;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.e = true;
        if (i > 0) {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.base.FpFullViewDialog.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (FpFullViewDialog.f(FpFullViewDialog.this)) {
                            FpFullViewDialog.a(FpFullViewDialog.this, true);
                        }
                        FpFullViewDialog.g(FpFullViewDialog.this).dismiss();
                    } catch (Exception e) {
                        LogUtil.printExceptionStackTrace(e);
                    }
                }
            }, i);
            return;
        }
        try {
            this.f4714a.dismiss();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public boolean isShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d57d5b12", new Object[]{this})).booleanValue();
        }
        Dialog dialog = this.f4714a;
        return dialog != null && dialog.isShowing();
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void setValidateResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86874278", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public boolean isValidateOk() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8b8f28e7", new Object[]{this})).booleanValue() : this.g;
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
            optJSONObject = new JSONObject(PhoneCashierMspEngine.getMspViSec().getFpInfo(context)).optJSONObject("fullView");
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
            LogUtil.printExceptionStackTrace(th);
            this.d = new Rect(i, i2, i3 + i, i4 + i2);
            this.f = z;
        }
        try {
            i3 = optJSONObject.optInt("width", 0);
        } catch (Throwable th3) {
            th = th3;
            i3 = 0;
            i4 = 0;
            LogUtil.printExceptionStackTrace(th);
            this.d = new Rect(i, i2, i3 + i, i4 + i2);
            this.f = z;
        }
        try {
            i4 = optJSONObject.optInt("height", 0);
        } catch (Throwable th4) {
            th = th4;
            i4 = 0;
            LogUtil.printExceptionStackTrace(th);
            this.d = new Rect(i, i2, i3 + i, i4 + i2);
            this.f = z;
        }
        try {
            z = optJSONObject.optBoolean("navConflict", false);
        } catch (Throwable th5) {
            th = th5;
            LogUtil.printExceptionStackTrace(th);
            this.d = new Rect(i, i2, i3 + i, i4 + i2);
            this.f = z;
        }
        this.d = new Rect(i, i2, i3 + i, i4 + i2);
        this.f = z;
    }

    private void a(Activity activity, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f2a4784", new Object[]{this, activity, str, iDialogActionListener});
            return;
        }
        this.c = iDialogActionListener;
        this.f4714a = new Dialog(activity);
        this.f4714a.requestWindowFeature(1);
        if (this.f4714a.getWindow() != null) {
            this.f4714a.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        try {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(activity.getApplicationContext()).inflate(R.layout.flybird_fullview_dialog_layout, (ViewGroup) null);
            linearLayout.requestFocus();
            linearLayout.requestFocusFromTouch();
            this.b = (TextView) linearLayout.findViewById(R.id.fp_fullview_dialog_tips);
            if (TextUtils.isEmpty(str)) {
                this.b.setText(LanguageHelper.localizedStringForKey("flybird_fp_tips", activity.getString(R.string.flybird_fp_tips), new Object[0]));
            } else {
                this.b.setText(str);
            }
            this.i = false;
            ((ImageView) linearLayout.findViewById(R.id.fp_fullview_dialog_cancel)).setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.framework.hardwarepay.base.FpFullViewDialog.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (FpFullViewDialog.b(FpFullViewDialog.this) != null) {
                        FpFullViewDialog.b(FpFullViewDialog.this).onDialogAction(0);
                    }
                    FpFullViewDialog.b(FpFullViewDialog.this, true);
                    FpFullViewDialog.g(FpFullViewDialog.this).dismiss();
                }
            });
            this.h = false;
            this.j = (TextView) linearLayout.findViewById(R.id.fp_fullview_dialog_pwd);
            this.j.setText(LanguageHelper.localizedStringForKey("mini_input_pwd", activity.getString(R.string.mini_input_pwd), new Object[0]));
            this.j.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.framework.hardwarepay.base.FpFullViewDialog.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (FpFullViewDialog.b(FpFullViewDialog.this) != null && !FpFullViewDialog.h(FpFullViewDialog.this)) {
                        FpFullViewDialog.b(FpFullViewDialog.this).onDialogAction(2);
                    }
                    FpFullViewDialog.c(FpFullViewDialog.this, true);
                    FpFullViewDialog.g(FpFullViewDialog.this).dismiss();
                }
            });
            DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
            int i = displayMetrics.widthPixels;
            float f = displayMetrics.density;
            int i2 = (int) (130.0f * f);
            int statusBarHeight = UIUtil.getStatusBarHeight(activity);
            WindowManager.LayoutParams attributes = this.f4714a.getWindow().getAttributes();
            attributes.width = i;
            attributes.height = ((this.d.bottom + i2) - this.d.top) + ((int) (f * 30.0f));
            attributes.x = 0;
            if (a()) {
                attributes.y = (this.d.top - i2) - statusBarHeight > 0 ? (this.d.top - i2) - statusBarHeight : 0;
            } else {
                attributes.y = this.d.top - i2 > 0 ? this.d.top - i2 : 0;
            }
            attributes.gravity = 48;
            this.f4714a.getWindow().setAttributes(attributes);
            if (this.f) {
                a(false);
            }
            this.f4714a.setContentView(linearLayout);
            this.f4714a.setCancelable(false);
        } catch (Throwable th) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, th.getClass().getName(), th);
        }
    }

    private void a(boolean z) {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        Dialog dialog = this.f4714a;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        View decorView = window.getDecorView();
        if (!z) {
            if (Build.VERSION.SDK_INT >= 19) {
                decorView.setSystemUiVisibility(4098);
                return;
            } else {
                decorView.setSystemUiVisibility(2);
                return;
            }
        }
        decorView.setSystemUiVisibility(0);
    }

    private static boolean a() {
        String lowerCase;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            lowerCase = Build.MANUFACTURER.toLowerCase();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        if (TextUtils.equals(lowerCase, "oppo")) {
            return true;
        }
        return TextUtils.equals(lowerCase, DeviceProperty.ALIAS_ONEPLUS);
    }
}
