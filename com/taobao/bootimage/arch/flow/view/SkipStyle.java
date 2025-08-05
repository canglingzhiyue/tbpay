package com.taobao.bootimage.arch.flow.view;

import android.graphics.Color;
import com.taobao.taobao.R;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class SkipStyle implements Serializable {
    public boolean isHide = false;
    public int background = -1;
    public String skipText = com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_17005);
    public int skipTextSize = 15;
    public int skipTextColor = Color.parseColor("#ffffff");
    public int countTimeTextSize = 15;
    public int countTimeTextColor = Color.parseColor("#ffffff");
    public boolean skipTextIsBold = false;
    public boolean countTimeTextIsBold = false;

    static {
        kge.a(858147657);
        kge.a(1028243835);
    }
}
