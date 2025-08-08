package com.taobao.mytaobao.newsetting;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static d f18426a;

    static {
        kge.a(-1170843902);
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("4b783bf6", new Object[0]);
        }
        if (f18426a == null) {
            synchronized (d.class) {
                if (f18426a == null) {
                    f18426a = new d();
                }
            }
        }
        return f18426a;
    }

    private d() {
    }

    public void a(e eVar, Context context) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30f9fcd9", new Object[]{this, eVar, context});
            return;
        }
        String config = OrangeConfig.getInstance().getConfig("fontSizeSetting", "open", "true");
        if (!b.a() && !StringUtils.equals(config, "true")) {
            return;
        }
        if (eVar == null || context == null) {
            Log.e("FontSizeAdapter", "updateFontSize: params is null!");
            return;
        }
        List<TextView> b = eVar.b();
        if (b == null) {
            Log.e("FontSizeAdapter", "updateFontSize: There is no TextView that needs to change font size!");
            return;
        }
        int c = FontSetting.c(context);
        int a2 = eVar.a();
        if (c == a2) {
            return;
        }
        float f = FontSetting.fontSizeFactors[c] / FontSetting.fontSizeFactors[a2];
        for (TextView textView : b) {
            if (textView != null) {
                textView.setTextSize(2, (textView.getTextSize() / context.getResources().getDisplayMetrics().scaledDensity) * f);
            }
        }
        eVar.a(c);
        List<ViewGroup> c2 = eVar.c();
        if (c2 == null) {
            return;
        }
        for (ViewGroup viewGroup : c2) {
            if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
                layoutParams.height = (int) (layoutParams.height * f);
                viewGroup.setLayoutParams(layoutParams);
            }
        }
    }
}
