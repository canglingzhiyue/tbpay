package tb;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.b;
import com.taobao.tcommon.core.a;

/* loaded from: classes.dex */
public class nie implements nid<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f31476a;
    private Integer b;
    private boolean c;
    private ComponentCallbacks2 d;

    static {
        kge.a(388892052);
        kge.a(-1709620101);
    }

    public synchronized a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e02f1a05", new Object[]{this});
        } else if (this.c) {
            return this.f31476a;
        } else {
            this.c = true;
            if (this.f31476a == null) {
                this.f31476a = new nim(this.b != null ? this.b.intValue() : 1048576);
            } else if (this.b != null) {
                this.f31476a.b(this.b.intValue());
            }
            return a(this.f31476a);
        }
    }

    private a a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("be872862", new Object[]{this, aVar});
        }
        Context n = b.h().n();
        if (n != null && Build.VERSION.SDK_INT >= 14) {
            this.d = new ComponentCallbacks2() { // from class: tb.nie.1
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
                    niw.a("BytesPool", "ComponentCallbacks2 onTrimMemory, level=%d", Integer.valueOf(i));
                    if (i < 60) {
                        return;
                    }
                    aVar.a();
                    niw.c("BytesPool", "clear all at TRIM_MEMORY_MODERATE", new Object[0]);
                }
            };
            n.registerComponentCallbacks(this.d);
        }
        return aVar;
    }

    public void finalize() {
        ComponentCallbacks2 componentCallbacks2;
        ComponentCallbacks2 componentCallbacks22;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        try {
            super.finalize();
            Context n = b.h().n();
            if (n == null || (componentCallbacks22 = this.d) == null) {
                return;
            }
            n.unregisterComponentCallbacks(componentCallbacks22);
        } catch (Throwable unused) {
            Context n2 = b.h().n();
            if (n2 == null || (componentCallbacks2 = this.d) == null) {
                return;
            }
            n2.unregisterComponentCallbacks(componentCallbacks2);
        }
    }
}
