package com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.common.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import mtopsdk.common.util.StringUtils;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dlh;
import tb.kge;
import tb.ldf;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f17479a;
    private dlh b;

    static {
        kge.a(-354511004);
    }

    public a(Context context, dlh dlhVar) {
        this.f17479a = context;
        this.b = dlhVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Toast toast = new Toast(this.f17479a);
        toast.setView(a(this.b));
        a(this.b, toast);
        toast.setDuration(a(this.b.c("duration"), 1));
        toast.show();
    }

    private RadiusFrameLayout a(dlh dlhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RadiusFrameLayout) ipChange.ipc$dispatch("ff5d3044", new Object[]{this, dlhVar});
        }
        RadiusFrameLayout radiusFrameLayout = new RadiusFrameLayout(this.f17479a);
        b(radiusFrameLayout, dlhVar);
        c(radiusFrameLayout, dlhVar);
        a(radiusFrameLayout, dlhVar);
        radiusFrameLayout.addView(b(this.b));
        return radiusFrameLayout;
    }

    private TextView b(dlh dlhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("48afd1ed", new Object[]{this, dlhVar});
        }
        TextView textView = new TextView(this.f17479a);
        textView.setGravity(17);
        textView.setText(dlhVar.c("content"));
        textView.setTextSize(a(dlhVar.c("textSize"), 14));
        a(textView, dlhVar);
        b(textView, dlhVar);
        return textView;
    }

    private void a(dlh dlhVar, Toast toast) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("603bb3cb", new Object[]{this, dlhVar, toast});
            return;
        }
        String c = dlhVar.c("gravity");
        if (StringUtils.isEmpty(c)) {
            return;
        }
        toast.setGravity(a(c), a(dlhVar.c("xOffset"), 0), a(dlhVar.c("yOffset"), 0));
    }

    private int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1383228885) {
            if (hashCode != -1364013995) {
                if (hashCode == 115029 && str.equals("top")) {
                    c = 2;
                }
            } else if (str.equals("center")) {
                c = 0;
            }
        } else if (str.equals("bottom")) {
            c = 1;
        }
        if (c == 0) {
            return 17;
        }
        if (c == 1) {
            return 80;
        }
        return c != 2 ? 17 : 48;
    }

    private void a(RadiusFrameLayout radiusFrameLayout, dlh dlhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161cbec4", new Object[]{this, radiusFrameLayout, dlhVar});
            return;
        }
        String c = dlhVar.c("paddingLeft");
        String c2 = dlhVar.c("paddingRight");
        String c3 = dlhVar.c("paddingBottom");
        String c4 = dlhVar.c("paddingTop");
        if (StringUtils.isEmpty(c3) || StringUtils.isEmpty(c) || StringUtils.isEmpty(c2) || StringUtils.isEmpty(c4)) {
            return;
        }
        radiusFrameLayout.setPadding(b(c) << 1, b(c4) << 1, b(c2) << 1, b(c3) << 1);
    }

    private void b(RadiusFrameLayout radiusFrameLayout, dlh dlhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83897be3", new Object[]{this, radiusFrameLayout, dlhVar});
            return;
        }
        String c = dlhVar.c("cornerRadius");
        if (StringUtils.isEmpty(c)) {
            return;
        }
        radiusFrameLayout.setRadius(a(c, 12) << 1);
    }

    private void c(RadiusFrameLayout radiusFrameLayout, dlh dlhVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f63902", new Object[]{this, radiusFrameLayout, dlhVar});
            return;
        }
        try {
            i = Color.parseColor(dlhVar.c("backgroundColor"));
        } catch (Exception e) {
            int parseColor = Color.parseColor("#CC000000");
            ldf.a("HomepageToast", e, "backgroundColor parse error");
            i = parseColor;
        }
        radiusFrameLayout.setBackgroundColor(i);
    }

    private void a(TextView textView, dlh dlhVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b2cdc6c", new Object[]{this, textView, dlhVar});
            return;
        }
        try {
            i = Color.parseColor(dlhVar.c("textColor"));
        } catch (Exception e) {
            int parseColor = Color.parseColor("#FFFFFF");
            ldf.a("HomepageToast", e, "textColor parse error");
            i = parseColor;
        }
        textView.setTextColor(i);
    }

    private void b(TextView textView, dlh dlhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7f790b", new Object[]{this, textView, dlhVar});
            return;
        }
        String c = dlhVar.c("isBold");
        if (StringUtils.isEmpty(c) || !"true".equals(c)) {
            return;
        }
        textView.setTypeface(Typeface.DEFAULT_BOLD);
    }

    private int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue();
        }
        try {
            return (int) Float.parseFloat(str);
        } catch (Exception e) {
            ldf.a("HomepageToastAbility :", "HomepageToast padding Parameter analysis error", e);
            return 10;
        }
    }

    private int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            ldf.a("HomepageToast offset Parameter analysis error", e, new String[0]);
            return i;
        }
    }
}
