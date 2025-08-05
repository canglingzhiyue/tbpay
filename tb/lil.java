package tb;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lil extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(329850330);
    }

    public static /* synthetic */ Object ipc$super(lil lilVar, String str, Object... objArr) {
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
        try {
            recyclerView.invalidateItemDecorations();
        } catch (Throwable unused) {
            ldf.d("LayoutCorrectListener", "invalidateItemDecorations error newState : " + i);
        }
    }
}
