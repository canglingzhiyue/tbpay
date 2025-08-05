package com.taobao.android.trade.ui.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class IconFontView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Typeface iconfont;

    static {
        kge.a(-596827493);
        iconfont = null;
    }

    public IconFontView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public IconFontView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public IconFontView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        try {
            if (iconfont == null) {
                iconfont = Typeface.createFromAsset(context.getAssets(), "fonts/trade_iconfont.ttf");
            }
            setTypeface(iconfont);
        } catch (Exception unused) {
            iconfont = null;
        }
        setIncludeFontPadding(false);
    }
}
