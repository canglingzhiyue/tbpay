package tb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public class eae extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f27148a;

    static {
        kge.a(-989931878);
    }

    public static /* synthetic */ Object ipc$super(eae eaeVar, String str, Object... objArr) {
        if (str.hashCode() == -1861229814) {
            super.onDraw((Canvas) objArr[0], (RecyclerView) objArr[1], (RecyclerView.State) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public eae(Context context) {
        this.f27148a = context;
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.desc.common.GridItemDecoration");
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a037ff16", new Object[]{this, canvas, recyclerView, state});
            return;
        }
        Paint paint = new Paint();
        paint.setColor(this.f27148a.getResources().getColor(R.color.detail_d));
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            float x = childAt.getX();
            float y = childAt.getY();
            childAt.getWidth();
            canvas.drawLine(x, y, x, y + childAt.getHeight(), paint);
        }
        super.onDraw(canvas, recyclerView, state);
    }
}
