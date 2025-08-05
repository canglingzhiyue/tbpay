package tb;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class kou extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f30202a;
    private int b;
    private boolean c;

    static {
        kge.a(-1935596160);
    }

    public kou(int i, int i2, boolean z) {
        this.f30202a = i;
        this.b = i2;
        this.c = z;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.f30202a;
        int i2 = childAdapterPosition % i;
        if (this.c) {
            int i3 = this.b;
            rect.left = i3 - ((i2 * i3) / i);
            rect.right = ((i2 + 1) * i3) / i;
            return;
        }
        int i4 = this.b;
        rect.left = (i2 * i4) / i;
        rect.right = i4 - (((i2 + 1) * i4) / i);
    }
}
