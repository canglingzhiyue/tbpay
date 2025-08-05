package com.taobao.android.fluid.framework.container.render.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.SeekBar;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.view.b;
import tb.kge;
import tb.obu;
import tb.obx;
import tb.spz;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private float f12528a;
    private float b;
    private float c;
    private float d;
    private float e;
    private boolean f;
    private boolean g;
    private int h = -1;
    private final int i = ViewConfiguration.get(obu.e()).getScaledTouchSlop();
    private final float j = obx.a(obu.e(), 40.0f);
    private final View k;

    static {
        kge.a(-1218289790);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    public a(View view) {
        this.k = view;
    }

    public boolean a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (a(this.k)) {
                return false;
            }
            View view = this.k;
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).requestDisallowInterceptTouchEvent(false);
            }
            this.h = motionEvent.getPointerId(0);
            this.f = false;
            this.g = false;
            if (motionEvent.findPointerIndex(this.h) < 0) {
                return false;
            }
            this.d = motionEvent.getRawX();
            this.e = motionEvent.getRawY();
            this.f12528a = motionEvent.getX();
            this.b = motionEvent.getY();
        } else {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            c(motionEvent);
                        }
                    }
                } else if (a(this.k) || this.g) {
                    return false;
                } else {
                    if (this.f) {
                        return true;
                    }
                    int i = this.h;
                    if (i == -1) {
                        spz.c("PullLeftHelper", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    float rawX = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    float f = x - this.f12528a;
                    if (f != 0.0f && a(this.k, false, (int) f, (int) x, (int) y)) {
                        this.f12528a = x;
                        this.g = true;
                        return false;
                    }
                    a(rawX, rawY);
                }
            }
            this.f = false;
            this.g = false;
            this.h = -1;
        }
        return this.f;
    }

    private boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        if ((view instanceof b) && ((b) view).canPullIntercept(b.PULL_HORIZONTAL_DRAG)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    if (a(childAt)) {
                        return true;
                    }
                    if (childAt instanceof b) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    public boolean b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74207cc2", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.h = motionEvent.getPointerId(0);
            this.f = false;
        } else if (actionMasked == 1) {
            if (motionEvent.findPointerIndex(this.h) < 0) {
                spz.c("PullLeftHelper", "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f) {
                this.f = false;
                a(motionEvent.getRawX() - this.c);
            }
            this.h = -1;
            return false;
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                return false;
            }
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    spz.c("PullLeftHelper", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.h = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                c(motionEvent);
            }
        } else if (motionEvent.findPointerIndex(this.h) < 0) {
            spz.c("PullLeftHelper", "Got ACTION_MOVE event but have an invalid active pointer id.");
            return false;
        } else {
            a(motionEvent.getRawX(), motionEvent.getRawY());
        }
        return true;
    }

    private void a(float f, float f2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
        } else if (this.f) {
        } else {
            float f3 = f - this.d;
            if (Math.abs(f3) * 0.5f > Math.abs(f2 - this.e)) {
                z = true;
            }
            int i = this.i;
            if ((-f3) <= i || !z) {
                return;
            }
            this.c = this.d + i;
            this.f = true;
        }
    }

    private void c(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("890944ff", new Object[]{this, motionEvent});
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) != this.h) {
            return;
        }
        if (actionIndex != 0) {
            i = 0;
        }
        this.h = motionEvent.getPointerId(i);
    }

    private boolean a(View view, boolean z, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("436a9bd", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount() - 1;
            while (childCount >= 0) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt == null || (i5 = i2 + scrollX) < childAt.getLeft() || i5 >= childAt.getRight() * childAt.getScaleX() || (i6 = i3 + scrollY) < childAt.getTop() || i6 >= childAt.getBottom()) {
                    i4 = childCount;
                } else {
                    i4 = childCount;
                    if (a(childAt, true, i, (int) ((i5 - childAt.getLeft()) / childAt.getScaleX()), i6 - childAt.getTop())) {
                        return true;
                    }
                }
                childCount = i4 - 1;
            }
        } else if (view instanceof SeekBar) {
            return true;
        }
        return z && view.canScrollHorizontally(-i);
    }

    private void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else if ((-f) <= this.j) {
        } else {
            a();
        }
    }
}
