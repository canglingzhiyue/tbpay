package tb;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* loaded from: classes8.dex */
public class oof extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Intent f32225a = new Intent("recyclerViewState");
    private int b = -1;

    static {
        kge.a(-304408541);
    }

    public static /* synthetic */ Object ipc$super(oof oofVar, String str, Object... objArr) {
        if (str.hashCode() == 2142696127) {
            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        if (this.b == i) {
            return;
        }
        this.b = i;
        this.f32225a.putExtra("recyclerViewState", i);
        LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(this.f32225a);
    }
}
