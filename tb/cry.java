package tb;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class cry {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private float f26484a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;

    static {
        kge.a(1029115673);
    }

    public cry(MotionEvent event, int i) {
        q.c(event, "event");
        a(event, i);
        this.g = 0.0f;
        this.j = 0.0f;
        float f = this.f26484a;
        this.e = f;
        float f2 = this.b;
        this.f = f2;
        this.h = 0.0f;
        this.i = 0.0f;
        this.c = f;
        this.d = f2;
    }

    public final float a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : this.f26484a;
    }

    public final float b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue() : this.b;
    }

    public final float c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue() : this.c;
    }

    public final float d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue() : this.d;
    }

    public final float e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue() : this.e;
    }

    public final float f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1dd", new Object[]{this})).floatValue() : this.f;
    }

    public final float g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f95e", new Object[]{this})).floatValue() : this.h;
    }

    public final float h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10df", new Object[]{this})).floatValue() : this.i;
    }

    public final float i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2860", new Object[]{this})).floatValue() : this.j;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.e = this.f26484a;
        this.f = this.b;
    }

    public final void a(MotionEvent event, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87bf4e26", new Object[]{this, event, new Integer(i)});
            return;
        }
        q.c(event, "event");
        float x = event.getX(i) - this.f26484a;
        float y = event.getY(i) - this.b;
        this.h = x;
        this.i = y;
        this.g = (float) Math.sqrt(crx.a(x) + crx.a(y));
        this.c = this.f26484a;
        this.d = this.b;
        this.f26484a = event.getX(i);
        this.b = event.getY(i);
        this.j = (float) Math.sqrt(crx.a(this.e - this.f26484a) + crx.a(this.f - this.b));
    }
}
