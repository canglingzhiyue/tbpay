package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeTextView;

/* loaded from: classes5.dex */
public class TNativeIconFontView extends DXNativeTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Typeface sTaoIconfont;
    private int sTaoReference;

    public static /* synthetic */ Object ipc$super(TNativeIconFontView tNativeIconFontView, String str, Object... objArr) {
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

    public TNativeIconFontView(Context context) {
        super(context);
        this.sTaoReference = 0;
    }

    public TNativeIconFontView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.sTaoReference = 0;
    }

    public TNativeIconFontView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.sTaoReference = 0;
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
                sTaoIconfont = Typeface.createFromAsset(getContext().getAssets(), "uik_iconfont.ttf");
            } catch (Exception unused) {
            }
        }
        setTypeface(sTaoIconfont);
        this.sTaoReference++;
        setIncludeFontPadding(false);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        this.sTaoReference--;
        if (this.sTaoReference == 0) {
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
                sTaoIconfont = Typeface.createFromAsset(getContext().getAssets(), "uik_iconfont.ttf");
            } catch (Exception unused) {
            }
        }
        return sTaoIconfont;
    }
}
