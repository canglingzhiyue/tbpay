package tb;

import android.taobao.windvane.config.j;
import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class aem {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f25291a;
    public static int b;
    public static int c;
    private static volatile aem d;
    private List<aek> e;
    private List<aek> f;
    private List<aek> g;
    private final boolean h = j.commonConfig.bZ;

    static {
        kge.a(-632141160);
        f25291a = 1;
        b = 0;
        c = -1;
    }

    public aem() {
        RVLLevel rVLLevel = RVLLevel.Error;
        e.a(rVLLevel, "WVEventService", "WVEventService useNewOnEvent=" + this.h);
        if (this.h) {
            this.e = new CopyOnWriteArrayList();
            this.f = new CopyOnWriteArrayList();
            this.g = new CopyOnWriteArrayList();
            return;
        }
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    public static aem a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aem) ipChange.ipc$dispatch("f024575", new Object[0]);
        }
        if (d == null) {
            synchronized (aem.class) {
                if (d == null) {
                    d = new aem();
                }
            }
        }
        return d;
    }

    public synchronized void a(aek aekVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba21c72", new Object[]{this, aekVar, new Integer(i)});
            return;
        }
        m.a("WVEventService", "addEventListener " + aekVar);
        if (aekVar != null) {
            if (i == f25291a) {
                if (!this.e.contains(aekVar)) {
                    this.e.add(aekVar);
                }
            } else if (i == b) {
                this.f.add(aekVar);
            } else if (i == c) {
                this.g.add(aekVar);
            }
        }
    }

    public synchronized void a(aek aekVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfdbecb1", new Object[]{this, aekVar});
        } else {
            a(aekVar, b);
        }
    }

    public synchronized void b(aek aekVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce5ef332", new Object[]{this, aekVar});
            return;
        }
        m.a("WVEventService", "removeEventListener " + aekVar);
        if (aekVar != null) {
            int indexOf = this.f.indexOf(aekVar);
            if (-1 != indexOf) {
                this.f.remove(indexOf);
            }
            int indexOf2 = this.e.indexOf(aekVar);
            if (-1 != indexOf2) {
                this.e.remove(indexOf2);
            }
            int indexOf3 = this.g.indexOf(aekVar);
            if (-1 != this.g.indexOf(aekVar)) {
                this.g.remove(indexOf3);
            }
        }
    }

    public ael a(int i, IWVWebView iWVWebView, String str, Object... objArr) {
        ael b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ael) ipChange.ipc$dispatch("bf66b7f6", new Object[]{this, new Integer(i), iWVWebView, str, objArr});
        }
        if (this.h) {
            return b(i, iWVWebView, str, objArr);
        }
        synchronized (this) {
            b2 = b(i, iWVWebView, str, objArr);
        }
        return b2;
    }

    public ael b(int i, IWVWebView iWVWebView, String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ael) ipChange.ipc$dispatch("8f26eb95", new Object[]{this, new Integer(i), iWVWebView, str, objArr});
        }
        aej aejVar = new aej(iWVWebView, str);
        ael a2 = a(this.e, i, aejVar, objArr);
        if (a2 != null) {
            return a2;
        }
        ael a3 = a(this.f, i, aejVar, objArr);
        if (a3 != null) {
            return a3;
        }
        ael a4 = a(this.g, i, aejVar, objArr);
        return a4 != null ? a4 : new ael(false);
    }

    private static ael a(List<aek> list, int i, aej aejVar, Object... objArr) {
        ael onEvent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ael) ipChange.ipc$dispatch("8bf76821", new Object[]{list, new Integer(i), aejVar, objArr});
        }
        if (list == null) {
            return null;
        }
        for (aek aekVar : list) {
            if (aekVar != null && (onEvent = aekVar.onEvent(i, aejVar, objArr)) != null && onEvent.f25290a) {
                return onEvent;
            }
        }
        return null;
    }

    public ael a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ael) ipChange.ipc$dispatch("e65f2ec3", new Object[]{this, new Integer(i)}) : a(i, (IWVWebView) null, (String) null, new Object[0]);
    }

    public ael a(int i, Object... objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ael) ipChange.ipc$dispatch("a1741a48", new Object[]{this, new Integer(i), objArr}) : a(i, (IWVWebView) null, (String) null, objArr);
    }
}
