package com.taobao.tab2interact.core.utils;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.text.n;
import tb.kge;

/* loaded from: classes8.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALI_SANS_TYPEFACE_ASSET_PATH = "iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf";
    public static final e INSTANCE;

    static {
        kge.a(50219751);
        INSTANCE = new e();
    }

    private e() {
    }

    public final int a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        String str2 = str;
        if (str2 != null && !n.a((CharSequence) str2)) {
            z = false;
        }
        if (z) {
            return 16777215;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception e) {
            a.a(this, "ViewUtils", "解析颜色异常", e);
            return 16777215;
        }
    }
}
