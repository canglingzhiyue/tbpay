package tb;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.cache.c;
import com.taobao.phenix.cache.memory.b;

/* loaded from: classes.dex */
public class nik implements nid<c<String, b>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f31482a;
    private c<String, b> b;
    private Context c;
    private Integer d;
    private Float e;
    private ComponentCallbacks2 f;

    static {
        kge.a(327555342);
        kge.a(-1709620101);
    }

    public c<String, b> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("f9be37cf", new Object[]{this}) : this.b;
    }

    public synchronized c<String, b> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("ea70010", new Object[]{this});
        } else if (this.f31482a) {
            return this.b;
        } else {
            this.c = com.taobao.phenix.intf.b.h().n();
            com.taobao.tcommon.core.b.a(this.c, "Phenix.with(Context) hasn't been called before MemCacheBuilder building");
            this.f31482a = true;
            if (this.b != null) {
                int c = this.b.c();
                float e = this.b.e();
                int intValue = this.d != null ? this.d.intValue() : c;
                float floatValue = this.e != null ? this.e.floatValue() : e;
                if (c != intValue || Math.abs(e - floatValue) >= 1.0E-4d) {
                    this.b.a(intValue, floatValue);
                }
                return a(this.b);
            }
            if (this.d == null) {
                this.d = Integer.valueOf(nwx.a(this.c));
            }
            if (this.e == null) {
                this.e = Float.valueOf(0.2f);
            }
            this.b = new com.taobao.phenix.cache.memory.c(this.d.intValue(), this.e.floatValue());
            return a(this.b);
        }
    }

    private c<String, b> a(final c<String, b> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("bb1230f6", new Object[]{this, cVar});
        }
        if (Build.VERSION.SDK_INT >= 14) {
            this.f = new ComponentCallbacks2() { // from class: tb.nik.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
                    }
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4bbd23dd", new Object[]{this});
                    }
                }

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
                        return;
                    }
                    niw.a(com.taobao.phenix.cache.memory.c.TAG, "ComponentCallbacks2 onTrimMemory, level=%d", Integer.valueOf(i));
                    if (i >= 60) {
                        cVar.f();
                        niw.c(com.taobao.phenix.cache.memory.c.TAG, "clear all at TRIM_MEMORY_MODERATE", new Object[0]);
                    } else if (i < 40) {
                    } else {
                        int b = cVar.b() / 2;
                        cVar.c(b);
                        niw.c(com.taobao.phenix.cache.memory.c.TAG, "trim to size=%d at TRIM_MEMORY_BACKGROUND", Integer.valueOf(b));
                    }
                }
            };
            this.c.registerComponentCallbacks(this.f);
        }
        return cVar;
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        try {
            super.finalize();
            ComponentCallbacks2 componentCallbacks2 = this.f;
            if (componentCallbacks2 == null) {
                return;
            }
            this.c.unregisterComponentCallbacks(componentCallbacks2);
        } catch (Throwable unused) {
            ComponentCallbacks2 componentCallbacks22 = this.f;
            if (componentCallbacks22 == null) {
                return;
            }
            this.c.unregisterComponentCallbacks(componentCallbacks22);
        }
    }
}
