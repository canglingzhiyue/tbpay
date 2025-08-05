package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.e;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public abstract class auu extends bln {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1592510515);
    }

    public int a(View[] viewArr, RecyclerView.Recycler recycler, VirtualLayoutManager.c cVar, e eVar) {
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0e55f4d", new Object[]{this, viewArr, recycler, cVar, eVar})).intValue();
        }
        if (f() != viewArr.length) {
            arc.a().c("AbsAURAFillFullLayoutHelper", "getAllChildren", "toFill的大小和itemCount不一致");
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < f() && (a2 = cVar.a(recycler)) != null; i2++) {
            if (a2.getLayoutParams() == null) {
                if (b(eVar)) {
                    a2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                } else {
                    a2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                }
            }
            viewArr[i2] = a2;
            i++;
        }
        return i;
    }

    public boolean b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("37f93aae", new Object[]{this, eVar})).booleanValue() : eVar.getOrientation() == 1;
    }

    public void a(View view, bls blsVar, e eVar, int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f5fb6c2", new Object[]{this, view, blsVar, eVar, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
            return;
        }
        if (z) {
            a(view, i2, i, i4, i3, eVar);
        } else {
            b(view, i2, i, i4, i3, eVar);
        }
        a(blsVar, view);
    }
}
