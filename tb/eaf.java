package tb;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class eaf extends LinearLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f27149a;
    private int[] b;

    static {
        kge.a(-682268577);
    }

    public static /* synthetic */ Object ipc$super(eaf eafVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public eaf(Context context) {
        super(context);
        this.f27149a = 0;
        this.b = new int[2];
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.desc.common.RecyclerLineLayoutManager");
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c7e05da", new Object[]{this, recycler, state, new Integer(i), new Integer(i2)});
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < getItemCount(); i5++) {
            int i6 = i3;
            a(recycler, i5, View.MeasureSpec.makeMeasureSpec(i5, 0), View.MeasureSpec.makeMeasureSpec(i5, 0), this.b);
            if (getOrientation() == 0) {
                int[] iArr = this.b;
                i3 = i6 + iArr[0];
                i4 = iArr[1];
            } else {
                int[] iArr2 = this.b;
                i4 += iArr2[1];
                i3 = iArr2[0];
            }
        }
        int i7 = i3;
        for (int i8 = 0; i8 < getItemCount(); i8++) {
            a(recycler, i8, i7, i4);
        }
        if (mode != 1073741824) {
            size = i7;
        }
        if (mode2 != 1073741824) {
            size2 = i4;
        }
        setMeasuredDimension(size, size2);
    }

    private void a(RecyclerView.Recycler recycler, int i, int i2, int i3, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8725afa", new Object[]{this, recycler, new Integer(i), new Integer(i2), new Integer(i3), iArr});
            return;
        }
        View viewForPosition = recycler.getViewForPosition(i);
        if (viewForPosition == null) {
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewForPosition.getLayoutParams();
        viewForPosition.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), layoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), layoutParams.height));
        iArr[0] = viewForPosition.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        iArr[1] = viewForPosition.getMeasuredHeight() + layoutParams.bottomMargin + layoutParams.topMargin;
        int i4 = iArr[1];
        int i5 = this.f27149a;
        if (i4 < i5) {
            iArr[1] = i5;
        } else {
            this.f27149a = iArr[1];
        }
        recycler.recycleView(viewForPosition);
    }

    private void a(RecyclerView.Recycler recycler, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e75d6ec", new Object[]{this, recycler, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        View viewForPosition = recycler.getViewForPosition(i);
        if (viewForPosition != null) {
            viewForPosition.measure(i2, i3);
        }
        recycler.recycleView(viewForPosition);
    }
}
