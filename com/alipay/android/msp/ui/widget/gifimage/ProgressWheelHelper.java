package com.alipay.android.msp.ui.widget.gifimage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ProgressWheelHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Object J = new Object();
    private ProgressCallback G;
    private View H;
    private int b;
    private int c;
    private int m;
    private boolean t;

    /* renamed from: a  reason: collision with root package name */
    private int f5087a = 28;
    private final int d = 16;
    private final int e = 270;
    private boolean f = false;
    private double h = 500.0d;
    private double g = 460.0d;
    private float i = 0.0f;
    private boolean j = true;
    private long l = 210;
    private final long k = 200;
    private int n = 16777215;
    private Paint p = new Paint();
    private Paint o = new Paint();
    private RectF q = new RectF();
    private float r = 230.0f;
    private long s = 0;
    private float u = 0.0f;
    private float v = 0.0f;
    private boolean w = false;
    private int x = 110;
    private float y = 0.0f;
    private Point A = new Point(24, 54);
    private Point B = new Point(49, 76);
    private Point z = new Point(87, 35);
    private float D = 0.0f;
    private float C = 0.1f;
    private boolean F = false;
    private boolean E = false;
    private boolean I = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface ProgressCallback {
        void onProgressUpdate(float f);
    }

    public ProgressWheelHelper(View view, int i, int i2, int i3) {
        this.b = 10;
        this.c = 10;
        this.m = -1426128896;
        this.H = null;
        this.H = view;
        this.m = i3;
        this.b = i;
        this.c = i2;
    }

    public int[] measure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("83d43b7f", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        int paddingLeft = (this.f5087a << 1) + this.H.getPaddingLeft() + this.H.getPaddingRight();
        int paddingTop = (this.f5087a << 1) + this.H.getPaddingTop() + this.H.getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            paddingLeft = size;
        } else if (mode == Integer.MIN_VALUE) {
            paddingLeft = Math.min(paddingLeft, size);
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            paddingTop = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingTop = Math.min(paddingTop, size2);
        }
        return new int[]{paddingLeft, paddingTop};
    }

    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        setCircleRadius(i);
        a(i, i2);
        a();
        this.H.invalidate();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.p.setColor(this.m);
        this.p.setAntiAlias(true);
        this.p.setStyle(Paint.Style.STROKE);
        this.p.setStrokeWidth(this.b);
        this.p.setStrokeCap(Paint.Cap.ROUND);
        this.o.setColor(this.n);
        this.o.setAntiAlias(true);
        this.o.setStyle(Paint.Style.STROKE);
        this.o.setStrokeWidth(this.c);
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int paddingTop = this.H.getPaddingTop();
        int paddingBottom = this.H.getPaddingBottom();
        int paddingLeft = this.H.getPaddingLeft();
        int paddingRight = this.H.getPaddingRight();
        if (!this.f) {
            int i3 = (i - paddingLeft) - paddingRight;
            int min = Math.min(Math.min(i3, (i2 - paddingBottom) - paddingTop), (this.f5087a << 1) - (this.b << 1));
            int i4 = ((i3 - min) / 2) + paddingLeft;
            int i5 = ((((i2 - paddingTop) - paddingBottom) - min) / 2) + paddingTop;
            int i6 = this.b;
            this.q = new RectF(i4 + i6, i5 + i6, (i4 + min) - i6, (i5 + min) - i6);
            return;
        }
        int i7 = this.b;
        this.q = new RectF(paddingLeft + i7, paddingTop + i7, (i - paddingRight) - i7, (i2 - paddingBottom) - i7);
    }

    public void setCallback(ProgressCallback progressCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a507d7", new Object[]{this, progressCallback});
            return;
        }
        this.G = progressCallback;
        if (this.w) {
            return;
        }
        g();
    }

    public void a(Canvas canvas) {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        synchronized (J) {
            if (!this.I) {
                return;
            }
            this.x = (int) this.q.width();
            float f3 = this.x / 110.0f;
            float f4 = 0.0f;
            this.y = f3 * 0.0f;
            this.A.set((int) ((24.0f * f3) + this.q.left), (int) ((54.0f * f3) + this.q.top));
            this.B.set((int) ((49.0f * f3) + this.q.left), (int) ((76.0f * f3) + this.q.top));
            this.z.set((int) ((87.0f * f3) + this.q.left), (int) ((f3 * 35.0f) + this.q.top));
            if (this.F && !this.E) {
                canvas.drawArc(this.q, 360.0f, 360.0f, false, this.p);
                canvas.drawLine(this.A.x, this.A.y, this.A.x + ((this.B.x - this.A.x) * this.D), this.A.y + ((this.B.y - this.A.y) * this.D), this.p);
                this.D += this.C;
                if (this.D >= 1.0f) {
                    this.D = 0.0f;
                    this.E = true;
                }
            } else if (this.F) {
                canvas.drawArc(this.q, 360.0f, 360.0f, false, this.p);
                canvas.drawLine(this.A.x, this.A.y, this.B.x, this.B.y, this.p);
                canvas.drawLine(this.B.x - this.y, this.B.y + this.y, (this.B.x - this.y) + ((this.z.x - (this.B.x - this.y)) * this.D), this.B.y + this.y + ((this.z.y - (this.B.y + this.y)) * this.D), this.p);
                this.D += this.C;
                if (this.D >= 1.0f) {
                    this.D = 1.0f;
                }
            } else {
                canvas.drawArc(this.q, 360.0f, 360.0f, false, this.o);
                if (this.w) {
                    long uptimeMillis = SystemClock.uptimeMillis() - this.s;
                    float f5 = (((float) uptimeMillis) * this.r) / 1000.0f;
                    long j = this.l;
                    if (j >= 200) {
                        this.h += uptimeMillis;
                        double d = this.h;
                        double d2 = this.g;
                        if (d > d2) {
                            this.h = d - d2;
                            this.l = 0L;
                            this.j = !this.j;
                        }
                        float cos = (((float) Math.cos(((this.h / this.g) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
                        if (this.j) {
                            this.i = cos * 254.0f;
                        } else {
                            float f6 = (1.0f - cos) * 254.0f;
                            this.u += this.i - f6;
                            this.i = f6;
                        }
                    } else {
                        this.l = j + uptimeMillis;
                    }
                    this.u += f5;
                    float f7 = this.u;
                    if (f7 > 360.0f) {
                        this.u = f7 - 360.0f;
                        ProgressCallback progressCallback = this.G;
                        if (progressCallback != null) {
                            progressCallback.onProgressUpdate(-1.0f);
                        }
                    }
                    this.s = SystemClock.uptimeMillis();
                    float f8 = this.u - 90.0f;
                    float f9 = this.i + 16.0f;
                    if (this.H.isInEditMode()) {
                        f = 0.0f;
                        f2 = 135.0f;
                    } else {
                        f = f8;
                        f2 = f9;
                    }
                    canvas.drawArc(this.q, f, f2, false, this.p);
                } else {
                    float f10 = this.u;
                    if (f10 != this.v) {
                        this.u = Math.min(this.u + ((((float) (SystemClock.uptimeMillis() - this.s)) / 1000.0f) * this.r), this.v);
                        this.s = SystemClock.uptimeMillis();
                    } else {
                        z = false;
                    }
                    if (f10 != this.u) {
                        g();
                    }
                    float f11 = this.u;
                    if (!this.t) {
                        f4 = ((float) (1.0d - Math.pow(1.0f - (f11 / 360.0f), 4.0d))) * 360.0f;
                        f11 = ((float) (1.0d - Math.pow(1.0f - (this.u / 360.0f), 2.0d))) * 360.0f;
                    }
                    canvas.drawArc(this.q, f4 - 90.0f, this.H.isInEditMode() ? 360.0f : f11, false, this.p);
                }
            }
            if (!z) {
                return;
            }
            this.H.invalidate();
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i != 0) {
        } else {
            this.s = SystemClock.uptimeMillis();
        }
    }

    public boolean isSpinning() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("69a72bcb", new Object[]{this})).booleanValue() : this.w;
    }

    public void resetCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ab64187", new Object[]{this});
            return;
        }
        this.u = 0.0f;
        this.v = 0.0f;
        this.H.invalidate();
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        synchronized (J) {
            this.I = true;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.I;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        synchronized (J) {
            this.I = false;
            this.h = 500.0d;
            this.i = 0.0f;
            this.j = true;
            this.l = 210L;
            this.s = 0L;
            this.u = 0.0f;
            this.v = 0.0f;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.w = false;
        this.u = 0.0f;
        this.v = 0.0f;
        this.H.invalidate();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.s = SystemClock.uptimeMillis();
        this.w = true;
        this.H.invalidate();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.F = true;
        this.E = false;
        this.D = 0.0f;
        this.H.invalidate();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.G == null) {
        } else {
            this.G.onProgressUpdate(Math.round((this.u * 100.0f) / 360.0f) / 100.0f);
        }
    }

    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
            return;
        }
        if (this.w) {
            this.u = 0.0f;
            this.w = false;
            g();
        }
        if (f > 1.0f) {
            f -= 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.v;
        if (f == f2) {
            return;
        }
        if (this.u == f2) {
            this.s = SystemClock.uptimeMillis();
        }
        this.v = Math.min(f * 360.0f, 360.0f);
        this.H.invalidate();
    }

    public void setInstantProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9c512d", new Object[]{this, new Float(f)});
            return;
        }
        if (this.w) {
            this.u = 0.0f;
            this.w = false;
        }
        if (f > 1.0f) {
            f -= 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        if (f == this.v) {
            return;
        }
        this.v = Math.min(f * 360.0f, 360.0f);
        this.u = this.v;
        this.s = SystemClock.uptimeMillis();
        this.H.invalidate();
    }

    public Parcelable onSaveInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("1ef1250f", new Object[]{this, parcelable});
        }
        WheelSavedState wheelSavedState = new WheelSavedState(parcelable);
        wheelSavedState.mProgress = this.u;
        wheelSavedState.mTargetProgress = this.v;
        wheelSavedState.isSpinning = this.w;
        wheelSavedState.spinSpeed = this.r;
        wheelSavedState.barWidth = this.b;
        wheelSavedState.barColor = this.m;
        wheelSavedState.rimWidth = this.c;
        wheelSavedState.rimColor = this.n;
        wheelSavedState.circleRadius = this.f5087a;
        wheelSavedState.linearProgress = this.t;
        wheelSavedState.fillRadius = this.f;
        return wheelSavedState;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
            return;
        }
        WheelSavedState wheelSavedState = (WheelSavedState) parcelable;
        this.u = wheelSavedState.mProgress;
        this.v = wheelSavedState.mTargetProgress;
        this.w = wheelSavedState.isSpinning;
        this.r = wheelSavedState.spinSpeed;
        this.b = wheelSavedState.barWidth;
        this.m = wheelSavedState.barColor;
        this.c = wheelSavedState.rimWidth;
        this.n = wheelSavedState.rimColor;
        this.f5087a = wheelSavedState.circleRadius;
        this.t = wheelSavedState.linearProgress;
        this.f = wheelSavedState.fillRadius;
        this.s = SystemClock.uptimeMillis();
    }

    public float getProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ba5fa9a", new Object[]{this})).floatValue();
        }
        if (!this.w) {
            return this.u / 360.0f;
        }
        return -1.0f;
    }

    public void setLinearProgress(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adf61239", new Object[]{this, new Boolean(z)});
            return;
        }
        this.t = z;
        if (this.w) {
            return;
        }
        this.H.invalidate();
    }

    public int getCircleRadius() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ec49472", new Object[]{this})).intValue() : this.f5087a;
    }

    public void setCircleRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5647ad8", new Object[]{this, new Integer(i)});
            return;
        }
        this.f5087a = i;
        if (this.w) {
            return;
        }
        this.H.invalidate();
    }

    public int getBarWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fa9d7ae3", new Object[]{this})).intValue() : this.b;
    }

    public void setBarWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe8bc87", new Object[]{this, new Integer(i)});
            return;
        }
        this.b = i;
        if (this.w) {
            return;
        }
        this.H.invalidate();
    }

    public int getBarColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("73c26600", new Object[]{this})).intValue() : this.m;
    }

    public void setBarColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9761350a", new Object[]{this, new Integer(i)});
            return;
        }
        this.m = i;
        a();
        if (this.w) {
            return;
        }
        this.H.invalidate();
    }

    public int getRimColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d0931c5d", new Object[]{this})).intValue() : this.n;
    }

    public void setRimColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a74a4d", new Object[]{this, new Integer(i)});
            return;
        }
        this.n = i;
        a();
        if (this.w) {
            return;
        }
        this.H.invalidate();
    }

    public float getSpinSpeed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5ec91766", new Object[]{this})).floatValue() : this.r / 360.0f;
    }

    public void setSpinSpeed(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4250a716", new Object[]{this, new Float(f)});
        } else {
            this.r = f * 360.0f;
        }
    }

    public int getRimWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("576e3140", new Object[]{this})).intValue() : this.c;
    }

    public void setRimWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292ed1ca", new Object[]{this, new Integer(i)});
            return;
        }
        this.c = i;
        if (this.w) {
            return;
        }
        this.H.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class WheelSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<WheelSavedState> CREATOR = new Parcelable.Creator<WheelSavedState>() { // from class: com.alipay.android.msp.ui.widget.gifimage.ProgressWheelHelper.WheelSavedState.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public WheelSavedState mo549createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (WheelSavedState) ipChange.ipc$dispatch("13979c17", new Object[]{this, parcel}) : new WheelSavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public WheelSavedState[] mo550newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (WheelSavedState[]) ipChange.ipc$dispatch("9c282a0e", new Object[]{this, new Integer(i)}) : new WheelSavedState[i];
            }
        };
        int barColor;
        int barWidth;
        int circleRadius;
        boolean fillRadius;
        boolean isSpinning;
        boolean linearProgress;
        float mProgress;
        float mTargetProgress;
        int rimColor;
        int rimWidth;
        float spinSpeed;

        WheelSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private WheelSavedState(Parcel parcel) {
            super(parcel);
            this.mProgress = parcel.readFloat();
            this.mTargetProgress = parcel.readFloat();
            boolean z = true;
            this.isSpinning = parcel.readByte() != 0;
            this.spinSpeed = parcel.readFloat();
            this.barWidth = parcel.readInt();
            this.barColor = parcel.readInt();
            this.rimWidth = parcel.readInt();
            this.rimColor = parcel.readInt();
            this.circleRadius = parcel.readInt();
            this.linearProgress = parcel.readByte() != 0;
            this.fillRadius = parcel.readByte() == 0 ? false : z;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.mProgress);
            parcel.writeFloat(this.mTargetProgress);
            parcel.writeByte(this.isSpinning ? (byte) 1 : (byte) 0);
            parcel.writeFloat(this.spinSpeed);
            parcel.writeInt(this.barWidth);
            parcel.writeInt(this.barColor);
            parcel.writeInt(this.rimWidth);
            parcel.writeInt(this.rimColor);
            parcel.writeInt(this.circleRadius);
            parcel.writeByte(this.linearProgress ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.fillRadius ? (byte) 1 : (byte) 0);
        }
    }
}
