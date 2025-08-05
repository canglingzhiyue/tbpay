package android.support.constraint.motion;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.support.constraint.motion.MotionLayout;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.taobao.taobao.R;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class t {
    private static final float[][] p = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final float[][] q = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    private float m;
    private float n;
    private final MotionLayout o;

    /* renamed from: a  reason: collision with root package name */
    private int f1098a = 0;
    private int b = 0;
    private int c = 0;
    private int d = -1;
    private int e = -1;
    private int f = -1;
    private float g = 0.5f;
    private float h = 0.5f;
    private float i = 0.0f;
    private float j = 1.0f;
    private boolean k = false;
    private float[] l = new float[2];
    private float r = 4.0f;
    private float s = 1.2f;
    private boolean t = true;
    private float u = 1.0f;
    private int v = 0;
    private float w = 10.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.o = motionLayout;
        a(context, Xml.asAttributeSet(xmlPullParser));
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.OnSwipe);
        a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    private void a(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == R.styleable.OnSwipe_touchAnchorId) {
                this.d = typedArray.getResourceId(index, this.d);
            } else if (index == R.styleable.OnSwipe_touchAnchorSide) {
                this.f1098a = typedArray.getInt(index, this.f1098a);
                float[][] fArr = p;
                int i2 = this.f1098a;
                this.h = fArr[i2][0];
                this.g = fArr[i2][1];
            } else if (index == R.styleable.OnSwipe_dragDirection) {
                this.b = typedArray.getInt(index, this.b);
                float[][] fArr2 = q;
                int i3 = this.b;
                this.i = fArr2[i3][0];
                this.j = fArr2[i3][1];
            } else if (index == R.styleable.OnSwipe_maxVelocity) {
                this.r = typedArray.getFloat(index, this.r);
            } else if (index == R.styleable.OnSwipe_maxAcceleration) {
                this.s = typedArray.getFloat(index, this.s);
            } else if (index == R.styleable.OnSwipe_moveWhenScrollAtTop) {
                this.t = typedArray.getBoolean(index, this.t);
            } else if (index == R.styleable.OnSwipe_dragScale) {
                this.u = typedArray.getFloat(index, this.u);
            } else if (index == R.styleable.OnSwipe_dragThreshold) {
                this.w = typedArray.getFloat(index, this.w);
            } else if (index == R.styleable.OnSwipe_touchRegionId) {
                this.e = typedArray.getResourceId(index, this.e);
            } else if (index == R.styleable.OnSwipe_onTouchUp) {
                this.c = typedArray.getInt(index, this.c);
            } else if (index == R.styleable.OnSwipe_nestedScrollFlags) {
                this.v = typedArray.getInteger(index, 0);
            } else if (index == R.styleable.OnSwipe_limitBoundsTo) {
                this.f = typedArray.getResourceId(index, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectF a(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.e;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        View view;
        int i = this.d;
        if (i != -1) {
            view = this.o.findViewById(i);
            if (view == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + a.a(this.o.getContext(), this.d));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new View.OnTouchListener() { // from class: android.support.constraint.motion.t.1
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    return false;
                }
            });
            nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: android.support.constraint.motion.t.2
                @Override // android.support.v4.widget.NestedScrollView.OnScrollChangeListener
                public void onScrollChange(NestedScrollView nestedScrollView2, int i2, int i3, int i4, int i5) {
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f, float f2) {
        this.m = f;
        this.n = f2;
        this.k = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(MotionEvent motionEvent, MotionLayout.d dVar, int i, q qVar) {
        int i2;
        dVar.a(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.m = motionEvent.getRawX();
            this.n = motionEvent.getRawY();
            this.k = false;
        } else if (action == 1) {
            this.k = false;
            dVar.a(1000);
            float b = dVar.b();
            float c = dVar.c();
            float progress = this.o.getProgress();
            int i3 = this.d;
            if (i3 != -1) {
                this.o.getAnchorDpDt(i3, progress, this.h, this.g, this.l);
            } else {
                float min = Math.min(this.o.getWidth(), this.o.getHeight());
                float[] fArr = this.l;
                fArr[1] = this.j * min;
                fArr[0] = min * this.i;
            }
            float f = this.i != 0.0f ? b / this.l[0] : c / this.l[1];
            float f2 = !Float.isNaN(f) ? (f / 3.0f) + progress : progress;
            if (f2 == 0.0f || f2 == 1.0f || (i2 = this.c) == 3) {
                if (0.0f < f2 && 1.0f > f2) {
                    return;
                }
                this.o.setState(MotionLayout.TransitionState.FINISHED);
                return;
            }
            this.o.touchAnimateTo(i2, ((double) f2) < 0.5d ? 0.0f : 1.0f, f);
            if (0.0f < progress && 1.0f > progress) {
                return;
            }
            this.o.setState(MotionLayout.TransitionState.FINISHED);
        } else if (action != 2) {
        } else {
            float rawY = motionEvent.getRawY() - this.n;
            float rawX = motionEvent.getRawX() - this.m;
            if (Math.abs((this.i * rawX) + (this.j * rawY)) <= this.w && !this.k) {
                return;
            }
            float progress2 = this.o.getProgress();
            if (!this.k) {
                this.k = true;
                this.o.setProgress(progress2);
            }
            int i4 = this.d;
            if (i4 != -1) {
                this.o.getAnchorDpDt(i4, progress2, this.h, this.g, this.l);
            } else {
                float min2 = Math.min(this.o.getWidth(), this.o.getHeight());
                float[] fArr2 = this.l;
                fArr2[1] = this.j * min2;
                fArr2[0] = min2 * this.i;
            }
            float f3 = this.i;
            float[] fArr3 = this.l;
            if (Math.abs(((f3 * fArr3[0]) + (this.j * fArr3[1])) * this.u) < 0.01d) {
                float[] fArr4 = this.l;
                fArr4[0] = 0.01f;
                fArr4[1] = 0.01f;
            }
            float max = Math.max(Math.min(progress2 + (this.i != 0.0f ? rawX / this.l[0] : rawY / this.l[1]), 1.0f), 0.0f);
            if (max != this.o.getProgress()) {
                this.o.setProgress(max);
                dVar.a(1000);
                this.o.mLastVelocity = this.i != 0.0f ? dVar.b() / this.l[0] : dVar.c() / this.l[1];
            } else {
                this.o.mLastVelocity = 0.0f;
            }
            this.m = motionEvent.getRawX();
            this.n = motionEvent.getRawY();
        }
    }

    public void a(boolean z) {
        if (z) {
            float[][] fArr = q;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = p;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = q;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = p;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[][] fArr5 = p;
        int i = this.f1098a;
        this.h = fArr5[i][0];
        this.g = fArr5[i][1];
        float[][] fArr6 = q;
        int i2 = this.b;
        this.i = fArr6[i2][0];
        this.j = fArr6[i2][1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float b() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectF b(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(float f, float f2) {
        this.m = f;
        this.n = f2;
    }

    public float c() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c(float f, float f2) {
        this.o.getAnchorDpDt(this.d, this.o.getProgress(), this.h, this.g, this.l);
        if (this.i != 0.0f) {
            float[] fArr = this.l;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f * this.i) / this.l[0];
        }
        float[] fArr2 = this.l;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f2 * this.j) / this.l[1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(float f, float f2) {
        boolean z = false;
        this.k = false;
        float progress = this.o.getProgress();
        this.o.getAnchorDpDt(this.d, progress, this.h, this.g, this.l);
        float f3 = this.i;
        float f4 = f3 != 0.0f ? (f * f3) / this.l[0] : (f2 * this.j) / this.l[1];
        if (!Float.isNaN(f4)) {
            progress += f4 / 3.0f;
        }
        if (progress != 0.0f) {
            float f5 = 1.0f;
            boolean z2 = progress != 1.0f;
            if (this.c != 3) {
                z = true;
            }
            if (!z || !z2) {
                return;
            }
            MotionLayout motionLayout = this.o;
            int i = this.c;
            if (progress < 0.5d) {
                f5 = 0.0f;
            }
            motionLayout.touchAnimateTo(i, f5, f4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(float f, float f2) {
        float progress = this.o.getProgress();
        if (!this.k) {
            this.k = true;
            this.o.setProgress(progress);
        }
        this.o.getAnchorDpDt(this.d, progress, this.h, this.g, this.l);
        float f3 = this.i;
        float[] fArr = this.l;
        if (Math.abs((f3 * fArr[0]) + (this.j * fArr[1])) < 0.01d) {
            float[] fArr2 = this.l;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f4 = this.i;
        float max = Math.max(Math.min(progress + (f4 != 0.0f ? (f * f4) / this.l[0] : (f2 * this.j) / this.l[1]), 1.0f), 0.0f);
        if (max != this.o.getProgress()) {
            this.o.setProgress(max);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float f(float f, float f2) {
        return (f * this.i) + (f2 * this.j);
    }

    public int f() {
        return this.v;
    }

    public String toString() {
        return this.i + " , " + this.j;
    }
}
