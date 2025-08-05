package com.taobao.android.detail.core.detail.kit.view.widget.base;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.c;
import com.taobao.android.detail.core.detail.kit.view.widget.base.uikit.TTextView;
import com.taobao.android.detail.core.utils.i;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class DetailIconFontTextView extends TTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Typeface sTaoIconfont;
    private static int sTaoReference;
    private static Typeface sTmallIconfont;
    private static int sTmallReference;
    private boolean isTaobao;

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
        kge.a(-1681070794);
        sTmallReference = 0;
        sTaoReference = 0;
    }

    public DetailIconFontTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isTaobao = !c.b();
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.base.DetailIconFontTextView");
    }

    public DetailIconFontTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isTaobao = !c.b();
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.base.DetailIconFontTextView");
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
        if (this.isTaobao) {
            if (sTaoIconfont == null) {
                try {
                    sTaoIconfont = Typeface.createFromAsset(getContext().getAssets(), "uik_iconfont.ttf");
                } catch (Exception e) {
                    i.a("DetailIconFontTextView", "onAttachedToWindow", e);
                }
            }
            setTypeface(sTaoIconfont);
            sTaoReference++;
        } else {
            if (sTmallIconfont == null) {
                try {
                    sTmallIconfont = Typeface.createFromAsset(getContext().getAssets(), "fonts/iconfont.ttf");
                } catch (Exception e2) {
                    i.a("DetailIconFontTextView", "onAttachedToWindow", e2);
                }
            }
            setTypeface(sTmallIconfont);
            sTmallReference++;
        }
        setIncludeFontPadding(false);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        if (this.isTaobao) {
            sTaoReference--;
            if (sTaoReference == 0) {
                sTaoIconfont = null;
            }
        } else {
            sTmallReference--;
            if (sTmallReference == 0) {
                sTmallIconfont = null;
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("3161bb0a", new Object[]{this});
        }
        if (this.isTaobao) {
            if (sTaoIconfont == null) {
                try {
                    sTaoIconfont = Typeface.createFromAsset(getContext().getAssets(), "uik_iconfont.ttf");
                } catch (Exception e) {
                    i.a("DetailIconFontTextView", "getTypeface", e);
                }
            }
            return sTaoIconfont;
        }
        if (sTmallIconfont == null) {
            try {
                sTmallIconfont = Typeface.createFromAsset(getContext().getAssets(), "fonts/iconfont.ttf");
            } catch (Exception e2) {
                i.a("DetailIconFontTextView", "getTypeface", e2);
            }
        }
        return sTmallIconfont;
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
