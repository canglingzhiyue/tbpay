package tb;

import android.content.Context;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.ab;
import com.taobao.android.dinamicx.am;
import com.taobao.android.dinamicx.aw;
import com.taobao.android.dinamicx.exception.a;
import com.taobao.android.dinamicx.r;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import tb.fxe;

/* loaded from: classes.dex */
public abstract class fpx implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ThreadLocal<am> c;

    /* renamed from: a  reason: collision with root package name */
    public long f28109a;
    public WeakReference<DXRuntimeContext> b;
    public ab d;
    public WeakReference<fzm> e;
    public WeakReference<aw> f;
    public DXRenderOptions g;
    public volatile boolean h;
    public boolean i;

    public abstract am a(r rVar, aw awVar);

    public abstract aw a(r rVar, Context context);

    static {
        kge.a(1671011201);
        kge.a(-1390502639);
        c = new ThreadLocal<>();
    }

    public fpx(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions, aw awVar, ab abVar, r rVar, fzm fzmVar) {
        this.b = new WeakReference<>(dXRuntimeContext);
        this.d = abVar;
        this.g = dXRenderOptions;
        if (fzmVar != null) {
            this.e = new WeakReference<>(fzmVar);
        }
        if (awVar != null) {
            this.f = new WeakReference<>(awVar);
        }
        this.f28109a = System.nanoTime();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(Looper.getMainLooper());
            if (!(obj instanceof ThreadLocal)) {
                return;
            }
            ((ThreadLocal) obj).set(Looper.getMainLooper());
        } catch (Throwable th) {
            a.b(th);
        }
    }

    public r a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("a0545cfa", new Object[]{this});
        }
        DXRuntimeContext c2 = c();
        if (c2 != null) {
            return c2.C();
        }
        return null;
    }

    public DXRuntimeContext c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("453b6e5d", new Object[]{this});
        }
        WeakReference<DXRuntimeContext> weakReference = this.b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public DXEngineConfig b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEngineConfig) ipChange.ipc$dispatch("78a66ef1", new Object[]{this});
        }
        r a2 = a();
        if (a2 != null) {
            return a2.a();
        }
        return null;
    }

    public am a(DXEngineConfig dXEngineConfig, r rVar) {
        am amVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (am) ipChange.ipc$dispatch("97471190", new Object[]{this, dXEngineConfig, rVar});
        }
        if (d() && (Thread.currentThread() instanceof fxe.b)) {
            amVar = ((fxe.b) Thread.currentThread()).a();
        } else {
            amVar = c.get();
        }
        if (amVar == null || dXEngineConfig.b() != amVar.b().b()) {
            amVar = a(rVar, a(rVar, DinamicXEngine.i()));
            if (d() && (Thread.currentThread() instanceof fxe.b)) {
                ((fxe.b) Thread.currentThread()).a(amVar);
            } else {
                c.set(amVar);
            }
        }
        return amVar;
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : fqi.aV() && (Thread.currentThread() instanceof fxe.b);
    }
}
