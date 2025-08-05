package com.alipay.mobile.verifyidentity.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.mobile.verifyidentity.ui.utils.DensityUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class VIPayProgressDialog extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f6085a;
    private TextView b;
    private CharSequence c;
    private Context d;

    public static /* synthetic */ Object ipc$super(VIPayProgressDialog vIPayProgressDialog, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1373052399:
                super.dismiss();
                return null;
            case -742181306:
                return new Boolean(super.isShowing());
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -340027132:
                super.show();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public VIPayProgressDialog(Context context) {
        super(context, R.style.ViProgressDialog);
        this.d = context;
    }

    public VIPayProgressDialog(Context context, int i) {
        super(context, i);
    }

    public VIPayProgressDialog(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
    }

    public VIPayProgressDialog(Context context, String str) {
        this(context);
        this.f6085a = str;
    }

    public String getProgressMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94705a95", new Object[]{this});
        }
        CharSequence charSequence = this.c;
        return charSequence == null ? "" : charSequence.toString();
    }

    public VIPayProgressDialog setMessage(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VIPayProgressDialog) ipChange.ipc$dispatch("81fcbed0", new Object[]{this, charSequence});
        }
        if (!TextUtils.isEmpty(charSequence) && !TextUtils.equals(charSequence, this.c)) {
            this.c = charSequence;
            TextView textView = this.b;
            if (textView != null) {
                textView.setText(this.c);
            }
        }
        return this;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.vipay_dialog);
        Context context = this.d;
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, 0, 0, a(context, 8.0f));
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageResource(R.drawable.vi_alipay_logo);
        TextView textView2 = new TextView(context);
        textView2.setText(R.string.vi_alipay_title);
        textView2.setTextSize(18.0f);
        textView2.setTextColor(-1);
        textView2.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        textView2.setLayoutParams(layoutParams2);
        this.b = textView2;
        VILoopView vILoopView = new VILoopView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(a(context, 40.0f), a(context, 8.0f));
        layoutParams3.gravity = 1;
        layoutParams3.setMargins(0, a(context, 10.0f), 0, 0);
        vILoopView.setLayoutParams(layoutParams3);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.vi_pay_progress_layout);
        linearLayout.setMinimumHeight(a(context, 125.0f));
        linearLayout.setMinimumWidth(a(context, 125.0f));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 17;
        linearLayout.setLayoutParams(layoutParams4);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1493172224);
        gradientDrawable.setCornerRadius(a(context, 5.0f));
        linearLayout.setBackgroundDrawable(gradientDrawable);
        linearLayout.addView(imageView);
        linearLayout.addView(textView2);
        linearLayout.addView(vILoopView);
        if (!TextUtils.isEmpty(this.c) && (textView = this.b) != null) {
            textView.setText(this.c);
        }
        if (getWindow() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(67108864);
        }
        getWindow().setLayout(-1, DensityUtil.getScreenHeight(this.d));
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }

    private static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) (f * (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics().density);
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            super.show();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        try {
            if (super.isShowing()) {
                super.dismiss();
            }
        } catch (Throwable unused) {
        }
        this.b = null;
    }

    public static boolean isSpecialDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f7cbd70", new Object[0])).booleanValue();
        }
        if (Build.MANUFACTURER != null && Build.MODEL != null) {
            String lowerCase = Build.MANUFACTURER.toLowerCase();
            String lowerCase2 = Build.MODEL.toLowerCase();
            if (lowerCase.contains("lenovo") && lowerCase2.contains("a820t")) {
                return true;
            }
            if (lowerCase.contains("meizu") && lowerCase2.contains("m040")) {
                return true;
            }
            if (lowerCase.contains("vivo") && lowerCase2.contains("y11")) {
                return true;
            }
        }
        return false;
    }
}
