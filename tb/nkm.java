package tb;

import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public abstract class nkm extends GestureDetector.SimpleOnGestureListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private RecyclerView f31535a;
    private View b;

    static {
        kge.a(-442734078);
    }

    public abstract boolean a(RecyclerView recyclerView, View view, int i, long j);

    public abstract boolean b(RecyclerView recyclerView, View view, int i, long j);

    public nkm(RecyclerView recyclerView) {
        this.f31535a = recyclerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        RecyclerView recyclerView = this.f31535a;
        if (recyclerView != null) {
            this.b = recyclerView.findChildViewUnder(x, y);
        }
        return this.b != null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b398c1c3", new Object[]{this, motionEvent});
            return;
        }
        View view = this.b;
        if (view == null) {
            return;
        }
        view.setPressed(true);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
        }
        View view = this.b;
        if (view == null || this.f31535a == null) {
            return false;
        }
        view.setPressed(false);
        int childLayoutPosition = this.f31535a.getChildLayoutPosition(this.b);
        boolean a2 = a(this.f31535a, this.b, childLayoutPosition, this.f31535a.getAdapter().getItemId(childLayoutPosition));
        this.b = null;
        return a2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        View view = this.b;
        if (view == null) {
            return false;
        }
        view.setPressed(false);
        this.b = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
            return;
        }
        View view = this.b;
        if (view == null || (recyclerView = this.f31535a) == null) {
            return;
        }
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        if (!b(this.f31535a, this.b, childLayoutPosition, this.f31535a.getAdapter().getItemId(childLayoutPosition))) {
            return;
        }
        this.b.setPressed(false);
        this.b = null;
    }
}
