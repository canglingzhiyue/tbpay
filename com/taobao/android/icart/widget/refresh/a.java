package com.taobao.android.icart.widget.refresh;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.widget.CartRecyclerView;
import java.lang.ref.WeakReference;
import tb.kge;
import tb.nkj;

/* loaded from: classes5.dex */
public class a extends GridLayoutManager.SpanSizeLookup {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<CartRecyclerView> f12886a;
    private WeakReference<GridLayoutManager> b;
    private GridLayoutManager.SpanSizeLookup c;

    static {
        kge.a(-1588494415);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1691818968) {
            if (hashCode == 743752269) {
                return new Integer(super.getSpanGroupIndex(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
            }
            if (hashCode != 822973068) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Integer(super.getSpanIndex(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
        }
        return new Boolean(super.isSpanIndexCacheEnabled());
    }

    public a(CartRecyclerView cartRecyclerView, GridLayoutManager gridLayoutManager, GridLayoutManager.SpanSizeLookup spanSizeLookup) {
        this.f12886a = new WeakReference<>(cartRecyclerView);
        this.b = new WeakReference<>(gridLayoutManager);
        this.c = spanSizeLookup;
    }

    @Override // android.support.v7.widget.GridLayoutManager.SpanSizeLookup
    public boolean isSpanIndexCacheEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b28e428", new Object[]{this})).booleanValue();
        }
        GridLayoutManager.SpanSizeLookup spanSizeLookup = this.c;
        if (spanSizeLookup != null) {
            return spanSizeLookup.isSpanIndexCacheEnabled();
        }
        return super.isSpanIndexCacheEnabled();
    }

    @Override // android.support.v7.widget.GridLayoutManager.SpanSizeLookup
    public int getSpanIndex(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("310d928c", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        GridLayoutManager.SpanSizeLookup spanSizeLookup = this.c;
        if (spanSizeLookup != null) {
            return spanSizeLookup.getSpanIndex(i, i2);
        }
        return super.getSpanIndex(i, i2);
    }

    @Override // android.support.v7.widget.GridLayoutManager.SpanSizeLookup
    public int getSpanGroupIndex(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c54c24d", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        GridLayoutManager.SpanSizeLookup spanSizeLookup = this.c;
        if (spanSizeLookup != null) {
            return spanSizeLookup.getSpanGroupIndex(i, i2);
        }
        return super.getSpanGroupIndex(i, i2);
    }

    @Override // android.support.v7.widget.GridLayoutManager.SpanSizeLookup
    public int getSpanSize(int i) {
        WeakReference<GridLayoutManager> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3462f00e", new Object[]{this, new Integer(i)})).intValue();
        }
        WeakReference<CartRecyclerView> weakReference2 = this.f12886a;
        if (weakReference2 != null && weakReference2.get() != null && (weakReference = this.b) != null && weakReference.get() != null) {
            CartRecyclerView cartRecyclerView = this.f12886a.get();
            RecyclerView.Adapter adapter = this.f12886a.get().getAdapter();
            if (adapter != null && (adapter instanceof nkj)) {
                int startViewsCount = cartRecyclerView.getStartViewsCount() - 1;
                int itemCount = adapter.getItemCount() - cartRecyclerView.getEndViewsCount();
                if (i >= 0 && (i <= startViewsCount || i >= itemCount)) {
                    return this.b.get().getSpanCount();
                }
            }
        }
        GridLayoutManager.SpanSizeLookup spanSizeLookup = this.c;
        if (spanSizeLookup == null) {
            return 1;
        }
        return spanSizeLookup.getSpanSize(i);
    }
}
