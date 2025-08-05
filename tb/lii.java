package tb;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.lkx;

/* loaded from: classes7.dex */
public class lii extends DefaultItemAnimator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lkx.a f30652a;

    static {
        kge.a(-597146544);
    }

    public lii(lkx.a aVar) {
        this.f30652a = aVar;
    }

    @Override // android.support.v7.widget.SimpleItemAnimator
    public void onRemoveStarting(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d054ca3", new Object[]{this, viewHolder});
        } else {
            this.f30652a.a(viewHolder);
        }
    }

    @Override // android.support.v7.widget.SimpleItemAnimator
    public void onRemoveFinished(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae699c31", new Object[]{this, viewHolder});
        } else {
            this.f30652a.b(viewHolder);
        }
    }

    @Override // android.support.v7.widget.SimpleItemAnimator
    public void onAddStarting(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3485c4", new Object[]{this, viewHolder});
        } else {
            this.f30652a.c(viewHolder);
        }
    }

    @Override // android.support.v7.widget.SimpleItemAnimator
    public void onAddFinished(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f98d552", new Object[]{this, viewHolder});
        } else {
            this.f30652a.d(viewHolder);
        }
    }
}
