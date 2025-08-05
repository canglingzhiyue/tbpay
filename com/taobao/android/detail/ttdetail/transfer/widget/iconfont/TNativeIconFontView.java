package com.taobao.android.detail.ttdetail.transfer.widget.iconfont;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.android.dinamicx.view.DXNativeTextView;
import java.util.concurrent.atomic.AtomicLong;
import tb.kge;

/* loaded from: classes5.dex */
public class TNativeIconFontView extends DXNativeTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile Typeface sTaoIconfont;
    private static volatile AtomicLong sTaoReference;

    public static /* synthetic */ Object ipc$super(TNativeIconFontView tNativeIconFontView, String str, Object... objArr) {
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

    static {
        kge.a(1511391083);
        sTaoReference = new AtomicLong(0L);
    }

    public TNativeIconFontView(Context context) {
        super(context);
    }

    public TNativeIconFontView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TNativeIconFontView(Context context, AttributeSet attributeSet, int i) {
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
        setTypeface(sTaoIconfont);
        sTaoReference.incrementAndGet();
        setIncludeFontPadding(false);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        if (sTaoReference.decrementAndGet() == 0) {
            destroyTypeface();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9d3566", new Object[]{this, typeface});
            return;
        }
        initTypeface(this);
        super.setTypeface(sTaoIconfont);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9509ea5d", new Object[]{this, typeface, new Integer(i)});
            return;
        }
        initTypeface(this);
        super.setTypeface(sTaoIconfont, i);
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("3161bb0a", new Object[]{this});
        }
        initTypeface(this);
        return sTaoIconfont;
    }

    private static synchronized void destroyTypeface() {
        synchronized (TNativeIconFontView.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("685e66b8", new Object[0]);
                return;
            }
            if (sTaoIconfont != null) {
                sTaoIconfont = null;
            }
        }
    }

    private static synchronized void initTypeface(View view) {
        synchronized (TNativeIconFontView.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36abbf44", new Object[]{view});
                return;
            }
            if (sTaoIconfont == null) {
                try {
                    sTaoIconfont = Typeface.createFromAsset(y.a(view).getAssets(), "uik_iconfont.ttf");
                } catch (Throwable unused) {
                }
            }
        }
    }
}
