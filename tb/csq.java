package tb;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class csq extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static final int f26496a;
    private static final int b;

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(-2101108580);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(-914190764);
        Companion = new a(null);
        f26496a = l.a(9.0f);
        b = l.a(44.0f);
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        RecyclerView.Adapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
            return;
        }
        Integer valueOf = (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) ? null : Integer.valueOf(adapter.getItemCount());
        if (recyclerView == null) {
            q.a();
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (valueOf == null) {
            return;
        }
        valueOf.intValue();
        int intValue = valueOf.intValue() * b;
        int i = f26496a;
        int intValue2 = intValue + ((valueOf.intValue() - 1) * i);
        if (childAdapterPosition > 0) {
            if (rect == null) {
                return;
            }
            rect.left = i;
        } else if (intValue2 > recyclerView.getWidth()) {
            if (rect == null) {
                return;
            }
            rect.left = 0;
        } else if (rect == null) {
        } else {
            rect.left = (recyclerView.getWidth() - intValue2) / 2;
        }
    }
}
