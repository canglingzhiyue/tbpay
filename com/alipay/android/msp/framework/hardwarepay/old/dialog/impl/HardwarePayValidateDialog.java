package com.alipay.android.msp.framework.hardwarepay.old.dialog.impl;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.hardwarepay.base.IDialogActionListener;
import com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.ui.widget.CustomProgressWheel;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class HardwarePayValidateDialog implements IHardwarePayDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TextView f4757a;
    private IDialogActionListener b;
    private Dialog c;
    private boolean d;
    private boolean e;
    private ImageView f;
    private CustomProgressWheel g;
    private Button h;
    private Button i;
    private View j;
    private View k;
    private boolean l = false;
    private boolean m = false;

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void showDialog(Activity activity, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e577c0", new Object[]{this, activity, str, iDialogActionListener});
        }
    }

    public static /* synthetic */ IDialogActionListener a(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDialogActionListener) ipChange.ipc$dispatch("a2905add", new Object[]{hardwarePayValidateDialog}) : hardwarePayValidateDialog.b;
    }

    public static /* synthetic */ boolean a(HardwarePayValidateDialog hardwarePayValidateDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2eb1fcd3", new Object[]{hardwarePayValidateDialog, new Boolean(z)})).booleanValue();
        }
        hardwarePayValidateDialog.l = z;
        return z;
    }

    public static /* synthetic */ Dialog b(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("b7c59a9", new Object[]{hardwarePayValidateDialog}) : hardwarePayValidateDialog.c;
    }

    public static /* synthetic */ boolean b(HardwarePayValidateDialog hardwarePayValidateDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe723072", new Object[]{hardwarePayValidateDialog, new Boolean(z)})).booleanValue();
        }
        hardwarePayValidateDialog.d = z;
        return z;
    }

    public static /* synthetic */ boolean c(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a6c3ab", new Object[]{hardwarePayValidateDialog})).booleanValue() : hardwarePayValidateDialog.m;
    }

    public static /* synthetic */ boolean d(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ec52202c", new Object[]{hardwarePayValidateDialog})).booleanValue() : hardwarePayValidateDialog.l;
    }

    public static /* synthetic */ boolean e(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1fd7cad", new Object[]{hardwarePayValidateDialog})).booleanValue() : hardwarePayValidateDialog.e;
    }

    public static /* synthetic */ boolean f(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b7a8d92e", new Object[]{hardwarePayValidateDialog})).booleanValue() : hardwarePayValidateDialog.d;
    }

    public static /* synthetic */ TextView g(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("66914d1f", new Object[]{hardwarePayValidateDialog}) : hardwarePayValidateDialog.f4757a;
    }

    public static /* synthetic */ CustomProgressWheel h(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CustomProgressWheel) ipChange.ipc$dispatch("99074268", new Object[]{hardwarePayValidateDialog}) : hardwarePayValidateDialog.g;
    }

    public static /* synthetic */ Button i(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("b7132c61", new Object[]{hardwarePayValidateDialog}) : hardwarePayValidateDialog.i;
    }

    public static /* synthetic */ Button j(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("708fc222", new Object[]{hardwarePayValidateDialog}) : hardwarePayValidateDialog.h;
    }

    public static /* synthetic */ View k(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("fb7d5231", new Object[]{hardwarePayValidateDialog}) : hardwarePayValidateDialog.j;
    }

    public static /* synthetic */ View l(HardwarePayValidateDialog hardwarePayValidateDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ca64f072", new Object[]{hardwarePayValidateDialog}) : hardwarePayValidateDialog.k;
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public Dialog showDialog(Activity activity, int i, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("f0603f56", new Object[]{this, activity, new Integer(i), str, iDialogActionListener});
        }
        if (activity == null) {
            return null;
        }
        this.b = iDialogActionListener;
        this.l = false;
        this.c = new Dialog(activity);
        try {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(activity).inflate(R.layout.flybird_hdpay_dialog_layout, (ViewGroup) null);
            linearLayout.requestFocus();
            linearLayout.requestFocusFromTouch();
            this.f4757a = (TextView) linearLayout.findViewById(R.id.alipay_msp_hd_dialog_tips);
            this.f = (ImageView) linearLayout.findViewById(R.id.alipay_msp_hd_dialog_icon);
            this.j = linearLayout.findViewById(R.id.alipay_msp_hd_dialog_spliter);
            this.k = linearLayout.findViewById(R.id.alipay_msp_hd_dialog_divider);
            this.g = (CustomProgressWheel) linearLayout.findViewById(R.id.alipay_msp_hd_dialog_loading);
            this.i = (Button) linearLayout.findViewById(R.id.alipay_msp_hd_dialog_cancel);
            this.i.setText(LanguageHelper.localizedStringForKey("mini_cancel", activity.getString(R.string.mini_cancel), new Object[0]));
            this.i.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.framework.hardwarepay.old.dialog.impl.HardwarePayValidateDialog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (HardwarePayValidateDialog.a(HardwarePayValidateDialog.this) != null) {
                        HardwarePayValidateDialog.a(HardwarePayValidateDialog.this).onDialogAction(0);
                    }
                    HardwarePayValidateDialog.a(HardwarePayValidateDialog.this, true);
                    HardwarePayValidateDialog.b(HardwarePayValidateDialog.this).dismiss();
                }
            });
            this.d = false;
            this.h = (Button) linearLayout.findViewById(R.id.alipay_msp_hd_dialog_pwd);
            this.h.setText(LanguageHelper.localizedStringForKey("mini_input_pwd", activity.getString(R.string.mini_input_pwd), new Object[0]));
            this.h.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.framework.hardwarepay.old.dialog.impl.HardwarePayValidateDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (HardwarePayValidateDialog.a(HardwarePayValidateDialog.this) != null && !HardwarePayValidateDialog.c(HardwarePayValidateDialog.this)) {
                        HardwarePayValidateDialog.a(HardwarePayValidateDialog.this).onDialogAction(2);
                    }
                    HardwarePayValidateDialog.b(HardwarePayValidateDialog.this, true);
                    HardwarePayValidateDialog.b(HardwarePayValidateDialog.this).dismiss();
                }
            });
            if (i == 1) {
                this.f.setBackgroundResource(R.drawable.alipay_msp_mini_finger);
                if (TextUtils.isEmpty(str)) {
                    this.f4757a.setText(LanguageHelper.localizedStringForKey("flybird_fp_tips", activity.getString(R.string.flybird_fp_tips), new Object[0]));
                } else {
                    this.f4757a.setText(str);
                }
            } else if (i == 2) {
                EventLogUtil.SpecificEvent.wearableUsage("vaDialogCase");
                this.f.setBackgroundResource(R.drawable.mini_bracelet);
                this.f.setVisibility(8);
                this.g.setVisibility(0);
                this.g.spin();
                this.g.start();
                if (TextUtils.isEmpty(str)) {
                    this.f4757a.setText(LanguageHelper.localizedStringForKey("flybird_bl_tips", activity.getString(R.string.flybird_bl_tips), new Object[0]));
                } else {
                    this.f4757a.setText(str);
                }
            } else if (i == 100) {
                this.f.setBackgroundResource(R.drawable.alipay_msp_mini_finger);
                this.h.setVisibility(8);
                this.k.setVisibility(8);
                if (TextUtils.isEmpty(str)) {
                    this.f4757a.setText(LanguageHelper.localizedStringForKey("flybird_fp_open", activity.getString(R.string.flybird_fp_open), new Object[0]));
                } else {
                    this.f4757a.setText(str);
                }
            }
            this.c.requestWindowFeature(1);
            this.c.setContentView(linearLayout);
            this.c.setCancelable(false);
            this.c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.alipay.android.msp.framework.hardwarepay.old.dialog.impl.HardwarePayValidateDialog.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                    } else if (HardwarePayValidateDialog.d(HardwarePayValidateDialog.this)) {
                    } else {
                        if (HardwarePayValidateDialog.a(HardwarePayValidateDialog.this) != null && HardwarePayValidateDialog.e(HardwarePayValidateDialog.this)) {
                            HardwarePayValidateDialog.a(HardwarePayValidateDialog.this).onDialogAction(100);
                        } else if (HardwarePayValidateDialog.a(HardwarePayValidateDialog.this) == null || HardwarePayValidateDialog.f(HardwarePayValidateDialog.this)) {
                        } else {
                            HardwarePayValidateDialog.a(HardwarePayValidateDialog.this).onDialogAction(1);
                        }
                    }
                }
            });
            this.c.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.alipay.android.msp.framework.hardwarepay.old.dialog.impl.HardwarePayValidateDialog.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                    } else if (HardwarePayValidateDialog.d(HardwarePayValidateDialog.this)) {
                    } else {
                        if (HardwarePayValidateDialog.a(HardwarePayValidateDialog.this) != null && HardwarePayValidateDialog.e(HardwarePayValidateDialog.this)) {
                            HardwarePayValidateDialog.a(HardwarePayValidateDialog.this).onDialogAction(100);
                        } else if (HardwarePayValidateDialog.a(HardwarePayValidateDialog.this) == null || HardwarePayValidateDialog.f(HardwarePayValidateDialog.this)) {
                        } else {
                            HardwarePayValidateDialog.a(HardwarePayValidateDialog.this).onDialogAction(1);
                        }
                    }
                }
            });
            this.c.show();
        } catch (Exception e) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, e.getClass().getName(), e);
        }
        LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "HardwarePayValidateDialog.showDialog", "HardwarePayValidateDialog hardwarePayType:" + i + " msg:" + str);
        return this.c;
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void updateMsg(final String str, int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3228a9", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (this.f4757a == null || TextUtils.isEmpty(str)) {
        } else {
            this.f4757a.postDelayed(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.old.dialog.impl.HardwarePayValidateDialog.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    HardwarePayValidateDialog.g(HardwarePayValidateDialog.this).setText(str);
                    HardwarePayValidateDialog.g(HardwarePayValidateDialog.this).setTextColor(i2);
                }
            }, i);
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public boolean isShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d57d5b12", new Object[]{this})).booleanValue();
        }
        Dialog dialog = this.c;
        return dialog != null && dialog.isShowing();
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void setValidateResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86874278", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public boolean isValidateOk() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8b8f28e7", new Object[]{this})).booleanValue() : this.e;
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void showAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6b160e", new Object[]{this});
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, -0.5f, 1, 0.5f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(60L);
        translateAnimation.setRepeatCount(2);
        translateAnimation.setRepeatMode(2);
        animationSet.addAnimation(translateAnimation);
        this.f.startAnimation(animationSet);
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void showLoadingSuccess() {
        CustomProgressWheel customProgressWheel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd03a60b", new Object[]{this});
        } else if (this.c == null || (customProgressWheel = this.g) == null) {
        } else {
            customProgressWheel.post(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.old.dialog.impl.HardwarePayValidateDialog.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!HardwarePayValidateDialog.h(HardwarePayValidateDialog.this).isSpinning()) {
                    } else {
                        HardwarePayValidateDialog.h(HardwarePayValidateDialog.this).stopSpinning();
                        HardwarePayValidateDialog.h(HardwarePayValidateDialog.this).beginDrawTick();
                        HardwarePayValidateDialog.h(HardwarePayValidateDialog.this).start();
                    }
                }
            });
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void setAllButtonsGone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede53c68", new Object[]{this});
        } else if (this.c == null || this.i == null || this.h == null || this.j == null || this.k == null) {
        } else {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.old.dialog.impl.HardwarePayValidateDialog.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    HardwarePayValidateDialog.i(HardwarePayValidateDialog.this).setVisibility(8);
                    HardwarePayValidateDialog.j(HardwarePayValidateDialog.this).setVisibility(8);
                    HardwarePayValidateDialog.k(HardwarePayValidateDialog.this).setVisibility(8);
                    HardwarePayValidateDialog.l(HardwarePayValidateDialog.this).setVisibility(8);
                    HardwarePayValidateDialog.b(HardwarePayValidateDialog.this).setCancelable(false);
                }
            });
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void dismiss(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f3d312", new Object[]{this, new Integer(i)});
            return;
        }
        Dialog dialog = this.c;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.m = true;
        if (i > 0) {
            this.f4757a.postDelayed(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.old.dialog.impl.HardwarePayValidateDialog.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (HardwarePayValidateDialog.b(HardwarePayValidateDialog.this) == null || !HardwarePayValidateDialog.b(HardwarePayValidateDialog.this).isShowing()) {
                            return;
                        }
                        HardwarePayValidateDialog.b(HardwarePayValidateDialog.this).dismiss();
                    } catch (Exception e) {
                        LogUtil.printExceptionStackTrace(e);
                    }
                }
            }, i);
            return;
        }
        try {
            this.c.dismiss();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }
}
