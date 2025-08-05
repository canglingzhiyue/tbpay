package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.y;
import tb.kge;

/* loaded from: classes5.dex */
public class DetailIconFontTextView extends TTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Typeface sTaoIconfont;
    private static int sTaoReference;
    private static Typeface sTmallIconfont;
    private static int sTmallReference;

    public static /* synthetic */ Object ipc$super(DetailIconFontTextView detailIconFontTextView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 197241946) {
            super.setText((CharSequence) objArr[0]);
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    static {
        kge.a(457697667);
        sTmallReference = 0;
        sTaoReference = 0;
    }

    public DetailIconFontTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DetailIconFontTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DetailIconFontTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (sTaoIconfont == null) {
            try {
                sTaoIconfont = Typeface.createFromAsset(y.a(this).getAssets(), "uik_iconfont.ttf");
            } catch (Exception unused) {
            }
        }
        setTypeface(sTaoIconfont);
        sTaoReference++;
        setIncludeFontPadding(false);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        sTaoReference--;
        if (sTaoReference == 0) {
            sTaoIconfont = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("3161bb0a", new Object[]{this});
        }
        if (sTaoIconfont == null) {
            try {
                sTaoIconfont = Typeface.createFromAsset(y.a(this).getAssets(), "uik_iconfont.ttf");
            } catch (Exception unused) {
            }
        }
        return sTaoIconfont;
    }

    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
        } else {
            super.setText((CharSequence) str);
        }
    }
}
