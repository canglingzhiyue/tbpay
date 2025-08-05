package tb;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.android.aura.service.render.widget.roundcornerlayout.UMFRoundCornerLayout;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class dkq implements UMFRoundCornerLayout.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float d;
    private float e;
    private int g;
    private VelocityTracker i;
    private a j;
    private final float b = 900.0f;
    private final float c = 0.1f;
    private float f = 0.0f;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26817a = false;
    private int h = 100;

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(float f);
    }

    static {
        kge.a(-1936505969);
        kge.a(-99216930);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ae7a71", new Object[]{this, aVar});
        } else {
            this.j = aVar;
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.g = i;
        this.h = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r0 != 3) goto L13;
     */
    @Override // com.alibaba.android.aura.service.render.widget.roundcornerlayout.UMFRoundCornerLayout.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(android.view.MotionEvent r8, android.view.View r9) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.dkq.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 3
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L1f
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r5] = r7
            r1[r4] = r8
            r1[r2] = r9
            java.lang.String r8 = "f91d758"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L1f:
            boolean r0 = r7.f26817a
            if (r0 != 0) goto L24
            return r5
        L24:
            int r0 = r8.getActionMasked()
            float r1 = r8.getRawX()
            float r6 = r7.e
            float r1 = r1 - r6
            if (r0 == r4) goto L53
            if (r0 == r2) goto L36
            if (r0 == r3) goto L53
            goto L62
        L36:
            r7.a(r8)
            int r8 = r7.h
            float r8 = (float) r8
            r0 = 0
            float r2 = r7.f
            float r2 = r2 + r1
            float r0 = java.lang.Math.max(r0, r2)
            float r8 = java.lang.Math.min(r8, r0)
            r9.setTranslationX(r8)
            tb.dkq$a r8 = r7.j
            if (r8 == 0) goto L62
            r8.a(r1)
            goto L62
        L53:
            r7.f26817a = r5
            r7.a(r9, r1)
            android.view.VelocityTracker r8 = r7.i
            if (r8 == 0) goto L62
            r8.recycle()
            r8 = 0
            r7.i = r8
        L62:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dkq.b(android.view.MotionEvent, android.view.View):boolean");
    }

    @Override // com.alibaba.android.aura.service.render.widget.roundcornerlayout.UMFRoundCornerLayout.a
    public boolean a(MotionEvent motionEvent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1de83139", new Object[]{this, motionEvent, view})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (actionMasked == 0) {
            this.e = rawX;
            this.d = rawY;
            this.f = view.getTranslationX();
            this.f26817a = false;
            return false;
        } else if (Math.abs(rawX - this.e) < ViewConfiguration.get(view.getContext().getApplicationContext()).getScaledTouchSlop() * 5.0f) {
            return false;
        } else {
            this.e = rawX;
            this.d = rawY;
            this.f26817a = true;
            return true;
        }
    }

    private void a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
            return;
        }
        if (this.i == null) {
            this.i = VelocityTracker.obtain();
        }
        this.i.addMovement(motionEvent);
    }

    private float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue();
        }
        VelocityTracker velocityTracker = this.i;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000);
        return this.i.getXVelocity();
    }

    private final void a(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3af196", new Object[]{this, view, new Float(f)});
            return;
        }
        float a2 = a();
        if (f <= 0.0f) {
            return;
        }
        if (a2 < 900.0f && Math.abs(f) < this.h * 0.1f) {
            return;
        }
        this.j.a();
    }
}
