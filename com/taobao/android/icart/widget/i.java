package com.taobao.android.icart.widget;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.myf;

/* loaded from: classes5.dex */
public class i extends myf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<Integer, Integer> f12883a;
    private boolean b;
    private a c;

    /* loaded from: classes5.dex */
    public interface a {
        void a(RecyclerView.State state);
    }

    static {
        kge.a(1337052362);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 514551467) {
            if (hashCode != 1092366570) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onLayoutCompleted((RecyclerView.State) objArr[0]);
            return null;
        }
        return new Boolean(super.canScrollVertically());
    }

    public i(Context context) {
        super(context);
        this.f12883a = new HashMap();
        this.b = true;
        this.c = null;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6a84325", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue() : this.b && super.canScrollVertically();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("411c30ea", new Object[]{this, state});
            return;
        }
        super.onLayoutCompleted(state);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.f12883a.put(Integer.valueOf(i), Integer.valueOf(getChildAt(i).getHeight()));
        }
        a aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.a(state);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("beb79e", new Object[]{this, state})).intValue();
        }
        if (getChildCount() == 0) {
            return 0;
        }
        try {
            int findFirstVisibleItemPosition = findFirstVisibleItemPosition();
            int i = -((int) findViewByPosition(findFirstVisibleItemPosition).getY());
            for (int i2 = 0; i2 < findFirstVisibleItemPosition; i2++) {
                i += this.f12883a.get(Integer.valueOf(i2)) == null ? 0 : this.f12883a.get(Integer.valueOf(i2)).intValue();
            }
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }
}
