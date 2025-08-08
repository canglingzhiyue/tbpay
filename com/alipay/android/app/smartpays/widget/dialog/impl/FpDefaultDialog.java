package com.alipay.android.app.smartpays.widget.dialog.impl;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Handler;
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
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.app.smartpays.res.IResourceLoader;
import com.alipay.android.app.smartpays.widget.dialog.DismissCatchDialog;
import com.alipay.android.app.smartpays.widget.dialog.IDialogActionListener;
import com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog;
import com.alipay.android.app.utils.SpOuterUtil;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.HashMap;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class FpDefaultDialog implements IHardwarePayDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IResourceLoader f4419a;
    private TextView b;
    private IDialogActionListener c;
    private DismissCatchDialog d;
    private ImageView e;
    private Button f;
    private Button g;
    private View h;
    private View i;
    private boolean j;
    private VerifyEnum k;

    public static /* synthetic */ Dialog a(FpDefaultDialog fpDefaultDialog, Activity activity, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("cb0b5b6", new Object[]{fpDefaultDialog, activity, str, iDialogActionListener}) : fpDefaultDialog.a(activity, str, iDialogActionListener);
    }

    public static /* synthetic */ boolean a(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dca8f4d1", new Object[]{fpDefaultDialog})).booleanValue() : fpDefaultDialog.j;
    }

    public static /* synthetic */ IDialogActionListener b(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDialogActionListener) ipChange.ipc$dispatch("cbcda8fa", new Object[]{fpDefaultDialog}) : fpDefaultDialog.c;
    }

    public static /* synthetic */ TextView c(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("1021de7f", new Object[]{fpDefaultDialog}) : fpDefaultDialog.b;
    }

    public static /* synthetic */ DismissCatchDialog d(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DismissCatchDialog) ipChange.ipc$dispatch("b5483186", new Object[]{fpDefaultDialog}) : fpDefaultDialog.d;
    }

    public static /* synthetic */ Button e(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("ea62f9fd", new Object[]{fpDefaultDialog}) : fpDefaultDialog.f;
    }

    public static /* synthetic */ Button f(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("cae4c1dc", new Object[]{fpDefaultDialog}) : fpDefaultDialog.g;
    }

    public static /* synthetic */ View g(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("bcaa3009", new Object[]{fpDefaultDialog}) : fpDefaultDialog.h;
    }

    public static /* synthetic */ View h(FpDefaultDialog fpDefaultDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("bbd0bf68", new Object[]{fpDefaultDialog}) : fpDefaultDialog.i;
    }

    public FpDefaultDialog() {
        this.j = false;
        this.k = VerifyEnum.OPEN;
    }

    public FpDefaultDialog(VerifyEnum verifyEnum) {
        this.j = false;
        this.k = verifyEnum;
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public void setResourceLoader(IResourceLoader iResourceLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a13b031e", new Object[]{this, iResourceLoader});
        } else {
            this.f4419a = iResourceLoader;
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
            activity.runOnUiThread(new Runnable() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpDefaultDialog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        FpDefaultDialog.a(FpDefaultDialog.this, activity, str, iDialogActionListener);
                    }
                }
            });
            HashMap hashMap = new HashMap();
            hashMap.put("action", "FpDefaultDialog");
            SpOuterUtil.walletEventLog("1010897", "pay", hashMap);
        } catch (Exception e) {
            LogUtils.printExceptionStackTrace(e);
        }
    }

    private Dialog a(final Activity activity, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("4b9ae17b", new Object[]{this, activity, str, iDialogActionListener});
        }
        if (activity == null) {
            return null;
        }
        this.c = iDialogActionListener;
        this.j = false;
        this.d = new DismissCatchDialog(activity);
        try {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(activity).inflate(this.f4419a.getLayoutId("safepay_fp_dialog_layout"), (ViewGroup) null);
            linearLayout.requestFocus();
            linearLayout.requestFocusFromTouch();
            this.b = (TextView) linearLayout.findViewById(this.f4419a.getId("safepay_fp_dialog_tips"));
            this.e = (ImageView) linearLayout.findViewById(this.f4419a.getId("safepay_fp_dialog_icon"));
            this.h = linearLayout.findViewById(this.f4419a.getId("safepay_fp_dialog_spliter"));
            this.i = linearLayout.findViewById(this.f4419a.getId("safepay_fp_dialog_divider"));
            this.f = (Button) linearLayout.findViewById(this.f4419a.getId("safepay_fp_dialog_cancel"));
            this.f.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpDefaultDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (FpDefaultDialog.a(FpDefaultDialog.this)) {
                    } else {
                        if (FpDefaultDialog.b(FpDefaultDialog.this) != null) {
                            FpDefaultDialog.b(FpDefaultDialog.this).onAction(0);
                        }
                        FpDefaultDialog.this.dismiss(activity);
                    }
                }
            });
            this.g = (Button) linearLayout.findViewById(this.f4419a.getId("safepay_fp_dialog_pwd"));
            this.g.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpDefaultDialog.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (FpDefaultDialog.a(FpDefaultDialog.this)) {
                    } else {
                        if (FpDefaultDialog.b(FpDefaultDialog.this) != null) {
                            FpDefaultDialog.b(FpDefaultDialog.this).onAction(2);
                        }
                        FpDefaultDialog.this.dismiss(activity);
                    }
                }
            });
            if (this.k == VerifyEnum.OPEN) {
                this.g.setVisibility(8);
                this.i.setVisibility(8);
            } else {
                this.g.setVisibility(0);
                this.i.setVisibility(0);
            }
            if (StringUtils.isEmpty(str)) {
                this.b.setText(this.f4419a.getStringId("safepay_fp_open"));
            } else {
                this.b.setText(str);
            }
            this.d.requestWindowFeature(1);
            this.d.setContentView(linearLayout);
            this.d.setCancelable(false);
            this.d.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpDefaultDialog.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                    }
                }
            });
            this.d.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpDefaultDialog.5
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
                    this.d.getWindow().getDecorView().setForceDarkAllowed(false);
                }
            } catch (Throwable unused) {
            }
            this.d.show();
        } catch (Exception e) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "fpV1", ErrorCode.DEFAULT_SHOW_FP_DIALOG_EX, e);
        }
        LogUtils.record(2, "HardwarePayValidateDialog::showDialog", "HardwarePayValidateDialog msg:" + str);
        return this.d;
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public void updateMsg(final String str, int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3228a9", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (this.b == null || StringUtils.isEmpty(str)) {
        } else {
            this.b.postDelayed(new Runnable() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpDefaultDialog.6
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

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public void dismiss(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c566ed7", new Object[]{this, context});
            return;
        }
        this.j = true;
        if (this.d == null) {
            return;
        }
        try {
            new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpDefaultDialog.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        FpDefaultDialog.d(FpDefaultDialog.this).dismiss();
                    } catch (Throwable th) {
                        LogUtils.printExceptionStackTrace(th);
                    }
                }
            });
        } catch (Exception e) {
            LogUtils.printExceptionStackTrace(e);
        }
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public boolean isShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d57d5b12", new Object[]{this})).booleanValue();
        }
        DismissCatchDialog dismissCatchDialog = this.d;
        if (dismissCatchDialog == null) {
            return false;
        }
        return dismissCatchDialog.isShowing();
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
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
        this.e.startAnimation(animationSet);
    }

    @Override // com.alipay.android.app.smartpays.widget.dialog.IHardwarePayDialog
    public void setAllButtonsGone() {
        Button button;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede53c68", new Object[]{this});
        } else if (this.d == null || (button = this.f) == null || this.g == null || this.h == null || this.i == null) {
        } else {
            button.post(new Runnable() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpDefaultDialog.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FpDefaultDialog.e(FpDefaultDialog.this).setVisibility(8);
                    FpDefaultDialog.f(FpDefaultDialog.this).setVisibility(8);
                    FpDefaultDialog.g(FpDefaultDialog.this).setVisibility(8);
                    FpDefaultDialog.h(FpDefaultDialog.this).setVisibility(8);
                    FpDefaultDialog.d(FpDefaultDialog.this).setCancelable(false);
                }
            });
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
        if (this.d == null) {
            return;
        }
        this.b.postDelayed(new Runnable() { // from class: com.alipay.android.app.smartpays.widget.dialog.impl.FpDefaultDialog.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    FpDefaultDialog.d(FpDefaultDialog.this).dismiss();
                } catch (Exception e) {
                    LogUtils.printExceptionStackTrace(e);
                }
            }
        }, i);
    }
}
