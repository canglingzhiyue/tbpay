package com.taobao.android.detail.core.detail.kit.view.widget.base.photo;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public InterfaceC0378d f9615a;

    /* renamed from: com.taobao.android.detail.core.detail.kit.view.widget.base.photo.d$d  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0378d {
        void a(float f, float f2);

        void a(float f, float f2, float f3);

        void a(float f, float f2, float f3, float f4);
    }

    static {
        kge.a(1645446848);
    }

    public abstract boolean a();

    public abstract boolean a(MotionEvent motionEvent);

    public static d a(Context context, InterfaceC0378d interfaceC0378d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("203b3c96", new Object[]{context, interfaceC0378d});
        }
        int i = Build.VERSION.SDK_INT;
        c cVar = new c(context);
        cVar.f9615a = interfaceC0378d;
        return cVar;
    }

    /* loaded from: classes4.dex */
    public static class a extends d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public float b;
        public float c;
        public final float d;
        public final float e;
        private VelocityTracker f;
        private boolean g;

        static {
            kge.a(1454392664);
        }

        @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.photo.d
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public a(Context context) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.e = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledTouchSlop();
        }

        public float b(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("74207cae", new Object[]{this, motionEvent})).floatValue() : motionEvent.getX();
        }

        public float c(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("890944ef", new Object[]{this, motionEvent})).floatValue() : motionEvent.getY();
        }

        @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.photo.d
        public boolean a(MotionEvent motionEvent) {
            VelocityTracker velocityTracker;
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f = VelocityTracker.obtain();
                this.f.addMovement(motionEvent);
                this.b = b(motionEvent);
                this.c = c(motionEvent);
                this.g = false;
            } else if (action == 1) {
                if (this.g && this.f != null) {
                    this.b = b(motionEvent);
                    this.c = c(motionEvent);
                    this.f.addMovement(motionEvent);
                    this.f.computeCurrentVelocity(1000);
                    float xVelocity = this.f.getXVelocity();
                    float yVelocity = this.f.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.e) {
                        this.f9615a.a(this.b, this.c, -xVelocity, -yVelocity);
                    }
                }
                VelocityTracker velocityTracker2 = this.f;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f = null;
                }
            } else if (action == 2) {
                float b = b(motionEvent);
                float c = c(motionEvent);
                float f = b - this.b;
                float f2 = c - this.c;
                if (!this.g) {
                    if (Math.sqrt((f * f) + (f2 * f2)) >= this.d) {
                        z = true;
                    }
                    this.g = z;
                }
                if (this.g) {
                    this.f9615a.a(f, f2);
                    this.b = b;
                    this.c = c;
                    VelocityTracker velocityTracker3 = this.f;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                }
            } else if (action == 3 && (velocityTracker = this.f) != null) {
                velocityTracker.recycle();
                this.f = null;
            }
            return true;
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int f;
        private int g;

        static {
            kge.a(1105968486);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 1597486209) {
                return new Boolean(super.a((MotionEvent) objArr[0]));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public b(Context context) {
            super(context);
            this.f = -1;
            this.g = 0;
        }

        @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.photo.d.a
        public float b(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("74207cae", new Object[]{this, motionEvent})).floatValue();
            }
            try {
                return motionEvent.getX(this.g);
            } catch (Exception unused) {
                return motionEvent.getX();
            }
        }

        @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.photo.d.a
        public float c(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("890944ef", new Object[]{this, motionEvent})).floatValue();
            }
            try {
                return motionEvent.getY(this.g);
            } catch (Exception unused) {
                return motionEvent.getY();
            }
        }

        @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.photo.d.a, com.taobao.android.detail.core.detail.kit.view.widget.base.photo.d
        public boolean a(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            int i = 1;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
            }
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.f = motionEvent.getPointerId(0);
            } else if (action == 1 || action == 3) {
                this.f = -1;
            } else if (action == 6) {
                int action2 = (motionEvent.getAction() >> 8) & 255;
                if (motionEvent.getPointerId(action2) == this.f) {
                    if (action2 != 0) {
                        i = 0;
                    }
                    this.f = motionEvent.getPointerId(i);
                    this.b = motionEvent.getX(i);
                    this.c = motionEvent.getY(i);
                }
            }
            int i2 = this.f;
            if (i2 == -1) {
                i2 = 0;
            }
            this.g = motionEvent.findPointerIndex(i2);
            return super.a(motionEvent);
        }
    }

    /* loaded from: classes4.dex */
    public static class c extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final ScaleGestureDetector f;
        private final ScaleGestureDetector.OnScaleGestureListener g;

        static {
            kge.a(-50195621);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == 1597486209) {
                return new Boolean(super.a((MotionEvent) objArr[0]));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public c(Context context) {
            super(context);
            this.g = new ScaleGestureDetector.OnScaleGestureListener() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.base.photo.d.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
                public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return ((Boolean) ipChange.ipc$dispatch("8bc93791", new Object[]{this, scaleGestureDetector})).booleanValue();
                    }
                    return true;
                }

                @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
                public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("d53c49db", new Object[]{this, scaleGestureDetector});
                    }
                }

                @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
                public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return ((Boolean) ipChange.ipc$dispatch("e2015504", new Object[]{this, scaleGestureDetector})).booleanValue();
                    }
                    c.this.f9615a.a(scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                    return true;
                }
            };
            this.f = new ScaleGestureDetector(context, this.g);
        }

        @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.photo.d.a, com.taobao.android.detail.core.detail.kit.view.widget.base.photo.d
        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f.isInProgress();
        }

        @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.photo.d.b, com.taobao.android.detail.core.detail.kit.view.widget.base.photo.d.a, com.taobao.android.detail.core.detail.kit.view.widget.base.photo.d
        public boolean a(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
            }
            this.f.onTouchEvent(motionEvent);
            return super.a(motionEvent);
        }
    }
}
