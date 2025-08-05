package com.taobao.android.order.bundle.widget.recycle;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.jpo;
import tb.kge;
import tb.myf;
import tb.ria;

/* loaded from: classes6.dex */
public class e extends myf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f14608a;
    private boolean b;
    private Context c;
    private ria d;
    private boolean e;

    static {
        kge.a(-1635953154);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -574012007) {
            if (hashCode == 514551467) {
                return new Boolean(super.canScrollVertically());
            }
            if (hashCode != 1092366570) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onLayoutCompleted((RecyclerView.State) objArr[0]);
            return null;
        }
        return new Boolean(super.canScrollHorizontally());
    }

    public e(Context context) {
        super(context);
        this.f14608a = false;
        this.b = false;
        this.c = context;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddc94599", new Object[]{this})).booleanValue();
        }
        if (!this.f14608a) {
            return super.canScrollHorizontally();
        }
        return false;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue();
        }
        if (!this.b) {
            return super.canScrollVertically();
        }
        return false;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = !z;
        }
    }

    public void a(ria riaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd12218e", new Object[]{this, riaVar});
        } else {
            this.d = riaVar;
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        ria riaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("411c30ea", new Object[]{this, state});
            return;
        }
        super.onLayoutCompleted(state);
        int itemCount = state.getItemCount();
        if (this.e || this.c == null || (riaVar = this.d) == null || itemCount <= 0 || itemCount != riaVar.b()) {
            return;
        }
        this.e = true;
        jpo.b(this.c).a("apmClientLayoutComplete", false, (Map<String, String>) null);
    }
}
