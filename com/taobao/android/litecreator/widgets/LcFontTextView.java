package com.taobao.android.litecreator.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.u;
import tb.kge;

/* loaded from: classes5.dex */
public class LcFontTextView extends AppCompatTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Typeface mIconFont;

    static {
        kge.a(1072531708);
    }

    public static /* synthetic */ Object ipc$super(LcFontTextView lcFontTextView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    public String fontPath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1f8dbe65", new Object[]{this}) : "font/lc_iconfont.ttf";
    }

    public LcFontTextView(Context context) {
        super(context);
        installFont(context);
    }

    public LcFontTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        installFont(context);
    }

    public LcFontTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        installFont(context);
    }

    private void installFont(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8380d7", new Object[]{this, context});
            return;
        }
        try {
            this.mIconFont = Typeface.createFromAsset(context.getAssets(), fontPath());
            setTypeface(this.mIconFont);
        } catch (Exception e) {
            u.d("LcFontTextView", e.toString());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        Typeface typeface = this.mIconFont;
        if (typeface == null) {
            return;
        }
        setTypeface(typeface);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        setTypeface(null);
        super.onDetachedFromWindow();
    }
}
