package com.taobao.android.dinamicx.widget.recycler;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import tb.kge;

/* loaded from: classes5.dex */
public class b implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public GestureDetector f12126a = new GestureDetector(DinamicXEngine.i(), new GestureDetector.SimpleOnGestureListener() { // from class: com.taobao.android.dinamicx.widget.recycler.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
            if (str.hashCode() == 1575121015) {
                return new Boolean(super.onSingleTapUp((MotionEvent) objArr[0]));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
            }
            if (b.a(b.this) != null) {
                b.a(b.this).postEvent(new DXEvent(18903999933159L));
            }
            return super.onSingleTapUp(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
            } else if (b.a(b.this) == null) {
            } else {
                b.a(b.this).postEvent(new DXEvent(-6544685697300501093L));
            }
        }
    });
    private DXRecyclerLayout b;

    static {
        kge.a(-1540961505);
        kge.a(-468432129);
    }

    public static /* synthetic */ DXRecyclerLayout a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRecyclerLayout) ipChange.ipc$dispatch("1b15cfab", new Object[]{bVar}) : bVar.b;
    }

    public b(DXRecyclerLayout dXRecyclerLayout) {
        this.b = dXRecyclerLayout;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        this.f12126a.onTouchEvent(motionEvent);
        return false;
    }

    public void a(DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b28c884", new Object[]{this, dXRecyclerLayout});
        } else {
            this.b = dXRecyclerLayout;
        }
    }
}
