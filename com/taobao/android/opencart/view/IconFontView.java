package com.taobao.android.opencart.view;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class IconFontView extends AppCompatTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile Typeface mTypeface;

    public static /* synthetic */ Object ipc$super(IconFontView iconFontView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1794512291:
                super.setTypeface((Typeface) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1050490214:
                super.setTypeface((Typeface) objArr[0]);
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public IconFontView(Context context) {
        super(context);
    }

    public IconFontView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IconFontView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        initTypeface(this);
        setTypeface(mTypeface);
        setIncludeFontPadding(false);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        setTypeface(null);
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
                return;
            }
            if (mTypeface == null) {
                try {
                    mTypeface = Typeface.createFromAsset(textView.getContext().getAssets(), "fonts/sku_icon_font.ttf");
                } catch (Throwable unused) {
                }
            }
        }
    }
}
