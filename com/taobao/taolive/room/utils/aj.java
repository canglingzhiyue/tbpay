package com.taobao.taolive.room.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;

/* loaded from: classes8.dex */
public class aj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAB2_TOAST_IMG_URL = "https://img.alicdn.com/imgextra/i3/O1CN01390Bje2AIxAk3X9f5_!!6000000008181-2-tps-60-60.png";

    static {
        kge.a(1698552186);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else {
            a(context, str, 0);
        }
    }

    public static void a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5110219", new Object[]{context, str, new Integer(i)});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            View inflate = LayoutInflater.from(context).inflate(R.layout.taolive_favor_toast_view, (ViewGroup) null);
            ((TextView) inflate.findViewById(R.id.fellow_favor_tv)).setText(str);
            a(context, inflate, i, 17, 0, 0);
        }
    }

    public static void a(Context context, String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{context, str, new Boolean(z)});
        } else if (StringUtils.isEmpty(str) || !(context instanceof Activity)) {
        } else {
            Activity activity = (Activity) context;
            if (activity.isFinishing()) {
                return;
            }
            View inflate = LayoutInflater.from(context).inflate(R.layout.taolive_tab2_favor_toast_view, (ViewGroup) null);
            final TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.tab2_toast_image);
            final TextView textView = (TextView) inflate.findViewById(R.id.tab2_toast_text);
            textView.setText(str);
            final float f = context.getResources().getDisplayMetrics().density;
            inflate.post(new Runnable() { // from class: com.taobao.taolive.room.utils.aj.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (z) {
                        tUrlImageView.setImageUrl(aj.TAB2_TOAST_IMG_URL);
                    } else {
                        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.leftMargin += (int) ((f * 10.0f) + 0.5f);
                            textView.setLayoutParams(marginLayoutParams);
                        }
                        tUrlImageView.setVisibility(8);
                    }
                }
            });
            final PopupWindow popupWindow = new PopupWindow(inflate, -2, -2);
            popupWindow.setAnimationStyle(R.style.ToastAnimation);
            popupWindow.showAtLocation(activity.getWindow().getDecorView(), 80, 0, (int) ((f * 75.0f) + 0.5f));
            new Handler().postDelayed(new Runnable() { // from class: com.taobao.taolive.room.utils.aj.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        popupWindow.dismiss();
                    }
                }
            }, 2600L);
        }
    }

    private static void a(Context context, View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2adfd832", new Object[]{context, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (view == null || context == null) {
        } else {
            Toast toast = new Toast(context.getApplicationContext());
            toast.setDuration(i);
            toast.setView(view);
            toast.setGravity(i2, i3, i4);
            try {
                toast.show();
            } catch (Exception unused) {
            }
        }
    }
}
