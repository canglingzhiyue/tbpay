package tb;

import android.support.v4.util.SparseArrayCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.taobao.android.searchbaseframe.util.ListStyle;

/* loaded from: classes6.dex */
public interface ioa<VIEW, PRESENTER> extends iuj<VIEW, PRESENTER> {
    void a(int i, SparseArrayCompat<Boolean> sparseArrayCompat);

    void a(int i, inv invVar);

    void a(RecyclerView.Adapter adapter);

    void a(ListStyle listStyle);

    void a(iny inyVar);

    void a(iny inyVar, boolean z);

    void b(int i);

    void c(int i, int i2, inv invVar);

    void d(View view);

    ViewGroup e();

    void e(View view);

    boolean h();

    ViewGroup i();

    RecyclerView l();

    int m();

    void n();

    void o();
}
