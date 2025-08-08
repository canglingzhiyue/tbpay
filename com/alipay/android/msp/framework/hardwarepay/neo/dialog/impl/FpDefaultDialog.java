package com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.android.msp.framework.hardwarepay.base.IDialogActionListener;
import com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class FpDefaultDialog implements IHardwarePayDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TextView f4728a;
    private IDialogActionListener b;
    private Dialog c;
    private ImageView d;
    private Button e;
    private Button f;
    private View g;
    private View h;
    private boolean i;
    private VerifyEnum j;

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public boolean isValidateOk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b8f28e7", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void setValidateResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86874278", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public Dialog showDialog(Activity activity, int i, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("f0603f56", new Object[]{this, activity, new Integer(i), str, iDialogActionListener});
        }
        return null;
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void showLoadingSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd03a60b", new Object[]{this});
        }
    }

    public static /* synthetic */ boolean a(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6e96dcb7", new Object[]{fpDefaultDialog})).booleanValue() : fpDefaultDialog.i;
    }

    public static /* synthetic */ IDialogActionListener b(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDialogActionListener) ipChange.ipc$dispatch("713fcfac", new Object[]{fpDefaultDialog}) : fpDefaultDialog.b;
    }

    public static /* synthetic */ TextView c(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("35e729a9", new Object[]{fpDefaultDialog}) : fpDefaultDialog.f4728a;
    }

    public static /* synthetic */ Button d(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("8ef91aea", new Object[]{fpDefaultDialog}) : fpDefaultDialog.f;
    }

    public static /* synthetic */ Button e(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("9280bdeb", new Object[]{fpDefaultDialog}) : fpDefaultDialog.e;
    }

    public static /* synthetic */ View f(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d4f147ba", new Object[]{fpDefaultDialog}) : fpDefaultDialog.h;
    }

    public static /* synthetic */ View g(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("2dfc933b", new Object[]{fpDefaultDialog}) : fpDefaultDialog.g;
    }

    public static /* synthetic */ Dialog h(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("6fb0d755", new Object[]{fpDefaultDialog}) : fpDefaultDialog.c;
    }

    public FpDefaultDialog() {
        this.i = false;
        this.j = VerifyEnum.OPEN;
    }

    public FpDefaultDialog(VerifyEnum verifyEnum) {
        this.i = false;
        this.j = verifyEnum;
        EventLogUtil.logPayEvent("104851", "content_type", "FpDefaultDialog");
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void updateMsg(final String str, int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3228a9", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (this.f4728a == null || StringUtils.isEmpty(str)) {
        } else {
            this.f4728a.postDelayed(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.FpDefaultDialog.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FpDefaultDialog.c(FpDefaultDialog.this).setText(str);
                    FpDefaultDialog.c(FpDefaultDialog.this).setTextColor(i2);
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
        this.d.startAnimation(animationSet);
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void setAllButtonsGone() {
        Button button;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede53c68", new Object[]{this});
        } else if (this.c == null || (button = this.f) == null || this.e == null || this.h == null || this.g == null) {
        } else {
            button.post(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.FpDefaultDialog.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FpDefaultDialog.d(FpDefaultDialog.this).setVisibility(8);
                    FpDefaultDialog.e(FpDefaultDialog.this).setVisibility(8);
                    FpDefaultDialog.f(FpDefaultDialog.this).setVisibility(8);
                    FpDefaultDialog.g(FpDefaultDialog.this).setVisibility(8);
                    FpDefaultDialog.h(FpDefaultDialog.this).setCancelable(false);
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
        this.i = true;
        Dialog dialog = this.c;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        if (i > 0) {
            this.f4728a.postDelayed(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.FpDefaultDialog.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (FpDefaultDialog.h(FpDefaultDialog.this) == null || !FpDefaultDialog.h(FpDefaultDialog.this).isShowing()) {
                            return;
                        }
                        FpDefaultDialog.h(FpDefaultDialog.this).dismiss();
                    } catch (Exception e) {
                        LogUtil.printExceptionStackTrace(e);
                    }
                }
            }, i);
        } else {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.FpDefaultDialog.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (FpDefaultDialog.h(FpDefaultDialog.this) == null || !FpDefaultDialog.h(FpDefaultDialog.this).isShowing()) {
                            return;
                        }
                        FpDefaultDialog.h(FpDefaultDialog.this).dismiss();
                    } catch (Exception e) {
                        LogUtil.printExceptionStackTrace(e);
                    }
                }
            });
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog
    public void showDialog(Activity activity, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e577c0", new Object[]{this, activity, str, iDialogActionListener});
        } else if (activity == null) {
        } else {
            this.b = iDialogActionListener;
            this.i = false;
            this.c = new Dialog(activity);
            try {
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(activity).inflate(R.layout.flybird_hdpay_dialog_layout, (ViewGroup) null);
                linearLayout.requestFocus();
                linearLayout.requestFocusFromTouch();
                this.f4728a = (TextView) linearLayout.findViewById(R.id.alipay_msp_hd_dialog_tips);
                this.d = (ImageView) linearLayout.findViewById(R.id.alipay_msp_hd_dialog_icon);
                this.h = linearLayout.findViewById(R.id.alipay_msp_hd_dialog_spliter);
                this.g = linearLayout.findViewById(R.id.alipay_msp_hd_dialog_divider);
                this.f = (Button) linearLayout.findViewById(R.id.alipay_msp_hd_dialog_cancel);
                this.f.setText(LanguageHelper.localizedStringForKey("mini_cancel", activity.getString(R.string.mini_cancel), new Object[0]));
                this.f.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.FpDefaultDialog.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (FpDefaultDialog.a(FpDefaultDialog.this)) {
                        } else {
                            if (FpDefaultDialog.b(FpDefaultDialog.this) != null) {
                                FpDefaultDialog.b(FpDefaultDialog.this).onDialogAction(0);
                            }
                            FpDefaultDialog.this.dismiss(0);
                        }
                    }
                });
                this.e = (Button) linearLayout.findViewById(R.id.alipay_msp_hd_dialog_pwd);
                this.e.setText(LanguageHelper.localizedStringForKey("mini_input_pwd", activity.getString(R.string.mini_input_pwd), new Object[0]));
                this.e.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.FpDefaultDialog.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (FpDefaultDialog.a(FpDefaultDialog.this)) {
                        } else {
                            if (FpDefaultDialog.b(FpDefaultDialog.this) != null) {
                                FpDefaultDialog.b(FpDefaultDialog.this).onDialogAction(2);
                            }
                            FpDefaultDialog.this.dismiss(0);
                        }
                    }
                });
                this.d.setBackgroundResource(R.drawable.alipay_msp_mini_finger);
                if (this.j == VerifyEnum.OPEN) {
                    this.e.setVisibility(8);
                    this.g.setVisibility(8);
                } else {
                    this.e.setVisibility(0);
                    this.g.setVisibility(0);
                }
                if (StringUtils.isEmpty(str)) {
                    this.f4728a.setText(LanguageHelper.localizedStringForKey("flybird_fp_open", activity.getString(R.string.flybird_fp_open), new Object[0]));
                } else {
                    this.f4728a.setText(str);
                }
                this.c.requestWindowFeature(1);
                this.c.setContentView(linearLayout);
                this.c.setCancelable(false);
                this.c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.FpDefaultDialog.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnDismissListener
                    public void onDismiss(DialogInterface dialogInterface) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                        }
                    }
                });
                this.c.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.FpDefaultDialog.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        }
                    }
                });
                this.c.show();
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
    }
}
