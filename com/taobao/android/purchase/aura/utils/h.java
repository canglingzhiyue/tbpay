package com.taobao.android.purchase.aura.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.dui;
import tb.fke;
import tb.jzk;
import tb.kge;

/* loaded from: classes6.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static float f14755a;

    public static boolean a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{activity})).booleanValue();
        }
        return "true".equals(e.a("enableNewSkeletonStyle", "false")) || ("carts".equals(dui.c(fke.b(activity))) && "styleV2".equals(com.taobao.android.buy.toggle.b.a("style")));
    }

    public static View a(Context context, View.OnClickListener onClickListener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ae44159d", new Object[]{context, onClickListener, new Boolean(z)});
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        relativeLayout.setBackgroundResource(R.color.white);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        relativeLayout.addView(linearLayout);
        if (onClickListener != null) {
            linearLayout.addView(b(context, onClickListener, z));
        }
        linearLayout.addView(a(context));
        linearLayout.addView(a(context, 16, -526345));
        linearLayout.addView(b(context));
        linearLayout.addView(c(context));
        linearLayout.addView(c(context));
        linearLayout.addView(a(context, 12, -1));
        linearLayout.addView(a(context, 16, -526345));
        linearLayout.addView(a(context, 12, -1));
        linearLayout.addView(c(context));
        linearLayout.addView(d(context));
        linearLayout.addView(a(context, 12, -1));
        linearLayout.addView(a(context, 16, -526345));
        linearLayout.addView(a(context, 12, -1));
        linearLayout.addView(e(context));
        linearLayout.addView(b(context, 16, -1));
        linearLayout.addView(e(context));
        linearLayout.addView(b(context, 16, -1));
        linearLayout.addView(e(context));
        linearLayout.addView(f(context));
        relativeLayout.addView(g(context));
        return relativeLayout;
    }

    static {
        kge.a(-1360822248);
        f14755a = -1.0f;
    }

    private static int a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f9a96", new Object[]{context, new Integer(i)})).intValue();
        }
        if (f14755a < 0.0f) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f14755a = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) / 750.0f;
        }
        return (int) (i * f14755a);
    }

    private static Drawable a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("89afa1f2", new Object[]{new Integer(i), new Integer(i2)});
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(i2);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    private static View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, a(context, 116)));
        View a2 = a(context, 480, 30, 74, 16);
        a2.setBackground(a(-526345, a(context, 8)));
        View a3 = a(context, 260, 26, 74, 62);
        a3.setBackground(a(-526345, a(context, 8)));
        frameLayout.addView(a2);
        frameLayout.addView(a3);
        return frameLayout;
    }

    private static View b(Context context, View.OnClickListener onClickListener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f64373fc", new Object[]{context, onClickListener, new Boolean(z)});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, a(context, 90)));
        View a2 = a(context, 50, 50, 680, 18);
        frameLayout.addView(a2);
        a2.setOnClickListener(onClickListener);
        if (z) {
            View a3 = a(context, 25, 25, 693, 30);
            a3.setBackgroundResource(R.drawable.icon_purchase_close);
            frameLayout.addView(a3);
        }
        return frameLayout;
    }

    private static View b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c13a4681", new Object[]{context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, a(context, 204)));
        View a2 = a(context, 156, 156, 32, 24);
        a2.setBackground(a(-526345, a(context, 12)));
        frameLayout.addView(a2);
        View a3 = a(context, 360, 30, 212, 24);
        a3.setBackground(a(-526345, a(context, 8)));
        frameLayout.addView(a3);
        View a4 = a(context, 210, 26, 212, 72);
        a4.setBackground(a(-526345, a(context, 8)));
        frameLayout.addView(a4);
        View a5 = a(context, 210, 26, 212, 116);
        a5.setBackground(a(-526345, a(context, 8)));
        frameLayout.addView(a5);
        View a6 = a(context, 96, 30, 622, 24);
        a6.setBackground(a(-526345, a(context, 8)));
        frameLayout.addView(a6);
        View a7 = a(context, 175, 52, 543, 128);
        a7.setBackground(a(-526345, a(context, 8)));
        frameLayout.addView(a7);
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a(context, 18), a(context, 18));
        layoutParams.setMargins(a(context, 561), a(context, (int) jzk.INSTALL_PROVIDER), 0, 0);
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(R.drawable.quantity_minus);
        frameLayout.addView(imageView);
        ImageView imageView2 = new ImageView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(a(context, 18), a(context, 18));
        layoutParams2.setMargins(a(context, 685), a(context, (int) jzk.INSTALL_PROVIDER), 0, 0);
        imageView2.setLayoutParams(layoutParams2);
        imageView2.setImageResource(R.drawable.quantity_add);
        frameLayout.addView(imageView2);
        View view = new View(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(a(context, 2), a(context, 26));
        layoutParams3.setMargins(a(context, 594), a(context, 142), 0, 0);
        view.setLayoutParams(layoutParams3);
        view.setBackgroundColor(-2697514);
        frameLayout.addView(view);
        View view2 = new View(context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(a(context, 2), a(context, 26));
        layoutParams4.setMargins(a(context, 668), a(context, 142), 0, 0);
        view2.setLayoutParams(layoutParams4);
        view2.setBackgroundColor(-2697514);
        frameLayout.addView(view2);
        return frameLayout;
    }

    private static View c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb04e860", new Object[]{context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, a(context, 80)));
        View a2 = a(context, 156, 26, 32, 27);
        a2.setBackground(a(-526345, a(context, 8)));
        frameLayout.addView(a2);
        View a3 = a(context, 175, 26, 543, 27);
        a3.setBackground(a(-526345, a(context, 8)));
        frameLayout.addView(a3);
        return frameLayout;
    }

    private static View d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("34cf8a3f", new Object[]{context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, a(context, 180)));
        View a2 = a(context, 156, 156, 32, 12);
        a2.setBackground(a(-526345, a(context, 12)));
        frameLayout.addView(a2);
        View a3 = a(context, 417, 30, 212, 12);
        a3.setBackground(a(-526345, a(context, 8)));
        frameLayout.addView(a3);
        View a4 = a(context, 210, 26, 212, 60);
        a4.setBackground(a(-526345, a(context, 8)));
        frameLayout.addView(a4);
        View a5 = a(context, 210, 26, 212, 142);
        a5.setBackground(a(-526345, a(context, 8)));
        frameLayout.addView(a5);
        View a6 = a(context, 36, 36, 682, 72);
        a6.setBackground(a(-526345, a(context, 18)));
        frameLayout.addView(a6);
        return frameLayout;
    }

    private static View e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6e9a2c1e", new Object[]{context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, a(context, 80)));
        View a2 = a(context, 36, 36, 32, 22);
        a2.setBackground(a(-526345, a(context, 18)));
        frameLayout.addView(a2);
        View a3 = a(context, 36, 36, 682, 22);
        a3.setBackground(a(-526345, a(context, 18)));
        frameLayout.addView(a3);
        View a4 = a(context, 128, 30, 84, 25);
        a4.setBackground(a(-526345, a(context, 8)));
        frameLayout.addView(a4);
        return frameLayout;
    }

    private static View f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a864cdfd", new Object[]{context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, a(context, 80)));
        View a2 = a(context, 36, 36, 32, 22);
        a2.setBackground(a(-526345, a(context, 18)));
        frameLayout.addView(a2);
        View a3 = a(context, 128, 30, 590, 25);
        a3.setBackground(a(-526345, a(context, 8)));
        frameLayout.addView(a3);
        View a4 = a(context, 128, 30, 84, 25);
        a4.setBackground(a(-526345, a(context, 8)));
        frameLayout.addView(a4);
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, a(context, 1)));
        view.setBackgroundColor(-1644826);
        frameLayout.addView(view);
        return frameLayout;
    }

    private static View g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e22f6fdc", new Object[]{context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, a(context, 90));
        layoutParams.addRule(12);
        layoutParams.setMargins(0, 0, 0, a(context, 15));
        frameLayout.setLayoutParams(layoutParams);
        View a2 = a(context, 686, 80, 32, 5);
        a2.setBackground(a(16736768, a(context, 12)));
        frameLayout.addView(a2);
        return frameLayout;
    }

    private static View a(Context context, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("34e7ed62", new Object[]{context, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        View view = new View(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a(context, i), a(context, i2));
        layoutParams.setMargins(a(context, i3), a(context, i4), 0, 0);
        view.setLayoutParams(layoutParams);
        return view;
    }

    private static View a(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ec791502", new Object[]{context, new Integer(i), new Integer(i2)});
        }
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, a(context, i)));
        view.setBackground(a(i2, 0));
        return view;
    }

    private static View b(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("de22bb21", new Object[]{context, new Integer(i), new Integer(i2)});
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, a(context, i)));
        relativeLayout.setBackground(a(i2, 0));
        relativeLayout.setGravity(17);
        View view = new View(context);
        view.setLayoutParams(new RelativeLayout.LayoutParams(a(context, 634), a(context, 1)));
        view.setBackgroundColor(-1644826);
        relativeLayout.addView(view);
        return relativeLayout;
    }
}
