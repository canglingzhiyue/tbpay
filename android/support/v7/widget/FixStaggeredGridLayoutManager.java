package android.support.v7.widget;

import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import java.util.Arrays;
import tb.kge;

/* loaded from: classes2.dex */
public class FixStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    private Parcelable state;

    /* loaded from: classes2.dex */
    private class a extends StaggeredGridLayoutManager.LazySpanLookup {
        static {
            kge.a(1544303986);
        }

        private a() {
        }

        private int g(int i) {
            if (this.c == null) {
                return -1;
            }
            StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem f = f(i);
            if (f != null) {
                this.c.remove(f);
            }
            int size = this.c.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.c.get(i2).mPosition >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.c.remove(i2);
            return this.c.get(i2).mPosition;
        }

        @Override // android.support.v7.widget.StaggeredGridLayoutManager.LazySpanLookup
        int a(int i) {
            if (this.b != null && i < this.b.length) {
                int g = g(i);
                e(g);
                if (g == -1) {
                    int[] iArr = this.b;
                    Arrays.fill(iArr, i, iArr.length, -1);
                    return this.b.length;
                }
                int i2 = g + 1;
                Arrays.fill(this.b, i, i2, -1);
                return i2;
            }
            return -1;
        }
    }

    static {
        kge.a(-1366094327);
    }

    public FixStaggeredGridLayoutManager(int i, int i2) {
        super(i, i2);
        this.mLazySpanLookup = new a();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        onRestoreInstanceState(this.state);
        super.onAttachedToWindow(recyclerView);
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        this.state = onSaveInstanceState();
        super.onDetachedFromWindow(recyclerView, recycler);
    }
}
