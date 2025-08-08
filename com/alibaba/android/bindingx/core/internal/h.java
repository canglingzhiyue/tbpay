package com.alibaba.android.bindingx.core.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.android.bindingx.core.d;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.kge;
import tb.mto;
import tb.riy;

/* loaded from: classes2.dex */
public class h extends AbstractEventHandler implements GestureDetector.OnGestureListener, View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float n;
    private float o;
    private double p;
    private double q;
    private GestureDetector r;
    private VelocityTracker s;
    private int t;
    private int u;

    static {
        kge.a(-1243847301);
        kge.a(-468432129);
        kge.a(1204268671);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 69046641) {
            super.a((String) objArr[0], (Map) objArr[1], (l) objArr[2], (List) objArr[3], (d.a) objArr[4]);
            return null;
        } else if (hashCode != 90991720) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a();
            return null;
        }
    }

    @Override // com.alibaba.android.bindingx.core.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // com.alibaba.android.bindingx.core.e
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b398c1c3", new Object[]{this, motionEvent});
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    public h(Context context, com.alibaba.android.bindingx.core.i iVar, Object... objArr) {
        super(context, iVar, objArr);
        this.r = new GestureDetector(context, this, new Handler(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper()));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.u = viewConfiguration.getScaledMaximumFlingVelocity();
        this.t = viewConfiguration.getScaledMinimumFlingVelocity();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        try {
            if (this.s == null) {
                this.s = VelocityTracker.obtain();
            }
            this.s.addMovement(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.n = motionEvent.getRawX();
                this.o = motionEvent.getRawY();
                a("start", mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT, 0.0f, 0.0f, new Object[0]);
            } else if (actionMasked == 1) {
                this.n = 0.0f;
                this.o = 0.0f;
                d();
                this.s.computeCurrentVelocity(1000, this.u);
                a("end", this.p, this.q, this.s.getXVelocity(), this.s.getYVelocity(), new Object[0]);
                this.p = mto.a.GEO_NOT_SUPPORT;
                this.q = mto.a.GEO_NOT_SUPPORT;
                if (this.s != null) {
                    this.s.recycle();
                    this.s = null;
                }
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    this.n = 0.0f;
                    this.o = 0.0f;
                    d();
                    a("cancel", this.p, this.q, 0.0f, 0.0f, new Object[0]);
                    if (this.s != null) {
                        this.s.recycle();
                        this.s = null;
                    }
                }
            } else if (this.n == 0.0f && this.o == 0.0f) {
                this.n = motionEvent.getRawX();
                this.o = motionEvent.getRawY();
                a("start", mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT, 0.0f, 0.0f, new Object[0]);
            } else {
                this.p = motionEvent.getRawX() - this.n;
                this.q = motionEvent.getRawY() - this.o;
            }
        } catch (Exception e) {
            com.alibaba.android.bindingx.core.h.a("runtime error ", e);
        }
        return this.r.onTouchEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float rawX;
        float rawY;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        if (motionEvent == null) {
            rawX = this.n;
            rawY = this.o;
        } else {
            rawX = motionEvent.getRawX();
            rawY = motionEvent.getRawY();
        }
        if (motionEvent2 == null) {
            return false;
        }
        float rawX2 = motionEvent2.getRawX() - rawX;
        float rawY2 = motionEvent2.getRawY() - rawY;
        try {
            if (com.alibaba.android.bindingx.core.h.f2229a) {
                com.alibaba.android.bindingx.core.h.b(String.format(Locale.getDefault(), "[TouchHandler] pan moved. (x:%f,y:%f)", Float.valueOf(rawX2), Float.valueOf(rawY2)));
            }
            JSMath.applyXYToScope(this.d, rawX2, rawY2, this.i.a());
            if (!a(this.k, this.d)) {
                a(this.f2232a, this.d, "pan");
            }
        } catch (Exception e) {
            com.alibaba.android.bindingx.core.h.a("runtime error", e);
        }
        return false;
    }

    @Override // com.alibaba.android.bindingx.core.e
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        View a2 = this.i.b().a(str, StringUtils.isEmpty(this.f) ? this.e : this.f);
        if (a2 == null) {
            com.alibaba.android.bindingx.core.h.d("[ExpressionTouchHandler] onCreate failed. sourceView not found:" + str);
            return false;
        }
        a2.setOnTouchListener(this);
        com.alibaba.android.bindingx.core.h.b("[ExpressionTouchHandler] onCreate success. {source:" + str + ",type:" + str2 + riy.BLOCK_END_STR);
        return true;
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler, com.alibaba.android.bindingx.core.e
    public void a(String str, Map<String, Object> map, l lVar, List<Map<String, Object>> list, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41d9171", new Object[]{this, str, map, lVar, list, aVar});
        } else {
            super.a(str, map, lVar, list, aVar);
        }
    }

    @Override // com.alibaba.android.bindingx.core.e
    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        View a2 = this.i.b().a(str, StringUtils.isEmpty(this.f) ? this.e : this.f);
        if (a2 != null) {
            a2.setOnTouchListener(null);
        }
        com.alibaba.android.bindingx.core.h.b("remove touch listener success.[" + str + "," + str2 + riy.ARRAY_END_STR);
        return true;
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler, com.alibaba.android.bindingx.core.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        if (this.f2232a != null) {
            this.f2232a.clear();
            this.f2232a = null;
        }
        this.k = null;
        this.c = null;
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void d(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{this, map});
        } else {
            a("exit", ((Double) map.get("internal_x")).doubleValue(), ((Double) map.get("internal_y")).doubleValue(), 0.0f, 0.0f, new Object[0]);
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            a(BindingXConstants.STATE_INTERCEPTOR, ((Double) map.get("internal_x")).doubleValue(), ((Double) map.get("internal_y")).doubleValue(), 0.0f, 0.0f, Collections.singletonMap(BindingXConstants.STATE_INTERCEPTOR, str));
        }
    }

    private void a(String str, double d, double d2, float f, float f2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b3a7eff", new Object[]{this, str, new Double(d), new Double(d2), new Float(f), new Float(f2), objArr});
        } else if (this.c == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("state", str);
            double b = this.i.a().b(d, new Object[0]);
            double b2 = this.i.a().b(d2, new Object[0]);
            hashMap.put("deltaX", Double.valueOf(b));
            hashMap.put("deltaY", Double.valueOf(b2));
            if ("end".equals(str)) {
                hashMap.put("velocityX", Float.valueOf(f));
                hashMap.put("velocityY", Float.valueOf(f2));
            }
            hashMap.put("token", this.g);
            if (objArr != null && objArr.length > 0 && (objArr[0] instanceof Map)) {
                hashMap.putAll((Map) objArr[0]);
            }
            this.c.a(hashMap);
            com.alibaba.android.bindingx.core.h.b(">>>>>>>>>>>fire event:(" + str + "," + b + "," + b2 + riy.BRACKET_END_STR);
        }
    }
}
