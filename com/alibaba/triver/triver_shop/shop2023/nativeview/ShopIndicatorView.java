package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopIndicatorView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ruk<t> onLayoutListener;

    static {
        kge.a(1633047229);
    }

    public static /* synthetic */ Object ipc$super(ShopIndicatorView shopIndicatorView, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public final ruk<t> getOnLayoutListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("50eb7b84", new Object[]{this}) : this.onLayoutListener;
    }

    public final void setOnLayoutListener(ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2efe82e", new Object[]{this, rukVar});
        } else {
            this.onLayoutListener = rukVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopIndicatorView(Context context) {
        super(context);
        q.d(context, "context");
    }

    public ShopIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        ruk<t> rukVar = this.onLayoutListener;
        if (rukVar == null) {
            return;
        }
        rukVar.mo2427invoke();
    }
}
