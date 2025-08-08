package com.alibaba.android.bindingx.core.internal;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class d extends AbstractEventHandler implements ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ScaleGestureDetector n;
    private boolean o;
    private int[] p;
    private double q;

    static {
        kge.a(1807189920);
        kge.a(-468432129);
        kge.a(-1822782425);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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

    public d(Context context, com.alibaba.android.bindingx.core.i iVar, Object... objArr) {
        super(context, iVar, objArr);
        this.p = new int[2];
        this.q = 1.0d;
        Handler handler = new Handler(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        if (Build.VERSION.SDK_INT >= 19) {
            this.n = new ScaleGestureDetector(context, this, handler);
        } else {
            this.n = new ScaleGestureDetector(context, this);
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void d(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{this, map});
        } else {
            a("exit", ((Double) map.get("s")).doubleValue(), new Object[0]);
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            a(BindingXConstants.STATE_INTERCEPTOR, ((Double) map.get("s")).doubleValue(), Collections.singletonMap(BindingXConstants.STATE_INTERCEPTOR, str));
        }
    }

    @Override // com.alibaba.android.bindingx.core.e
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        View a2 = this.i.b().a(str, StringUtils.isEmpty(this.f) ? this.e : this.f);
        if (a2 == null) {
            com.alibaba.android.bindingx.core.h.d("[BindingXPinchHandler] onCreate failed. sourceView not found:" + str);
            return false;
        }
        a2.setOnTouchListener(this);
        com.alibaba.android.bindingx.core.h.b("[BindingXPinchHandler] onCreate success. {source:" + str + ",type:" + str2 + riy.BLOCK_END_STR);
        return true;
    }

    @Override // com.alibaba.android.bindingx.core.e
    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        View a2 = this.i.b().a(str, StringUtils.isEmpty(this.f) ? this.e : this.f);
        com.alibaba.android.bindingx.core.h.b("remove touch listener success.[" + str + "," + str2 + riy.ARRAY_END_STR);
        if (a2 == null) {
            return false;
        }
        a2.setOnTouchListener(null);
        return true;
    }

    private void a(String str, double d, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57ebd565", new Object[]{this, str, new Double(d), objArr});
        } else if (this.c == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("state", str);
            hashMap.put("scale", Double.valueOf(d));
            hashMap.put("token", this.g);
            if (objArr != null && objArr.length > 0 && (objArr[0] instanceof Map)) {
                hashMap.putAll((Map) objArr[0]);
            }
            this.c.a(hashMap);
            com.alibaba.android.bindingx.core.h.b(">>>>>>>>>>>fire event:(" + str + "," + d + riy.BRACKET_END_STR);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.o = false;
            this.p[0] = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.p[1] = -1;
        } else if (actionMasked == 1) {
            f();
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                if (!this.o) {
                    this.p[1] = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.o = true;
                    e();
                }
            } else if (actionMasked == 6 && this.o) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                int[] iArr = this.p;
                if (pointerId == iArr[0] || pointerId == iArr[1]) {
                    f();
                }
            }
        }
        return this.n.onTouchEvent(motionEvent);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.alibaba.android.bindingx.core.h.b("[PinchHandler] pinch gesture begin");
        a("start", 1.0d, new Object[0]);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!this.o) {
        } else {
            com.alibaba.android.bindingx.core.h.b("[PinchHandler] pinch gesture end");
            a("end", this.q, new Object[0]);
            this.o = false;
            int[] iArr = this.p;
            iArr[0] = -1;
            iArr[1] = -1;
            this.q = 1.0d;
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2015504", new Object[]{this, scaleGestureDetector})).booleanValue();
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (!Float.isNaN(scaleFactor) && !Float.isInfinite(scaleFactor)) {
            this.q *= scaleFactor;
            try {
                if (com.alibaba.android.bindingx.core.h.f2229a) {
                    com.alibaba.android.bindingx.core.h.b(String.format(Locale.getDefault(), "[PinchHandler] current scale factor: %f", Double.valueOf(this.q)));
                }
                JSMath.applyScaleFactorToScope(this.d, this.q);
                if (!a(this.k, this.d)) {
                    a(this.f2232a, this.d, "pinch");
                }
            } catch (Exception e) {
                com.alibaba.android.bindingx.core.h.a("runtime error", e);
            }
        }
        return true;
    }
}
