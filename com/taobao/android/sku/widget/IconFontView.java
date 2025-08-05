package com.taobao.android.sku.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class IconFontView extends AppCompatTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile Typeface mTypeface;

    static {
        kge.a(1736044819);
    }

    public static /* synthetic */ Object ipc$super(IconFontView iconFontView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1794512291) {
            super.setTypeface((Typeface) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode != 1050490214) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.setTypeface((Typeface) objArr[0]);
            return null;
        }
    }

    public IconFontView(Context context) {
        super(context);
        initTypeface(this);
    }

    public IconFontView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initTypeface(this);
    }

    public IconFontView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initTypeface(this);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9d3566", new Object[]{this, typeface});
        } else {
            super.setTypeface(mTypeface);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9509ea5d", new Object[]{this, typeface, new Integer(i)});
        } else {
            super.setTypeface(mTypeface, i);
        }
    }

    private static synchronized void initTypeface(TextView textView) {
        synchronized (IconFontView.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8d54f36", new Object[]{textView});
            } else if (mTypeface != null) {
            } else {
                mTypeface = Typeface.createFromAsset(textView.getContext().getAssets(), "fonts/sku_icon_font.ttf");
            }
        }
    }
}
