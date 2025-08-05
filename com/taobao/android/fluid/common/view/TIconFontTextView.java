package com.taobao.android.fluid.common.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.feature.view.TTextView;
import java.util.WeakHashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class TIconFontTextView extends TTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1630571280);
    }

    public static /* synthetic */ Object ipc$super(TIconFontTextView tIconFontTextView, String str, Object... objArr) {
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

    public TIconFontTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TIconFontTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TIconFontTextView(Context context) {
        super(context);
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Typeface) ipChange.ipc$dispatch("3161bb0a", new Object[]{this}) : a.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        setTypeface(a.a(this));
        setIncludeFontPadding(false);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        setTypeface(null);
        a.b(this);
        super.onDetachedFromWindow();
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final WeakHashMap<View, Void> f12435a;
        private static Typeface b;

        static {
            kge.a(343729237);
            f12435a = new WeakHashMap<>();
        }

        public static Typeface a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Typeface) ipChange.ipc$dispatch("2a2452e0", new Object[]{view});
            }
            if (b == null) {
                try {
                    b = Typeface.createFromAsset(view.getContext().getApplicationContext().getAssets(), "uik_iconfont.ttf");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            f12435a.put(view, null);
            return b;
        }

        public static void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91037249", new Object[]{view});
                return;
            }
            f12435a.remove(view);
            if (f12435a.size() != 0) {
                return;
            }
            b = null;
        }
    }
}
