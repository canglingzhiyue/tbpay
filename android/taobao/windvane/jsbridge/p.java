package android.taobao.windvane.jsbridge;

import android.content.Context;
import android.content.Intent;
import android.taobao.windvane.extra.performance2.IPerformance;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tb.kge;

/* loaded from: classes2.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f1671a;
    private IWVWebView b;
    private IPerformance c;
    private Map<String, Object> d;
    private ReentrantReadWriteLock e;

    static {
        kge.a(-70463098);
    }

    public p(Context context, IWVWebView iWVWebView) {
        this.f1671a = null;
        this.b = null;
        this.c = null;
        this.d = new HashMap();
        this.e = new ReentrantReadWriteLock(true);
        this.f1671a = context;
        this.b = iWVWebView;
    }

    public p(Context context, IWVWebView iWVWebView, IPerformance iPerformance) {
        this(context, iWVWebView);
        this.c = iPerformance;
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        this.e.writeLock().lock();
        try {
            this.d.put(str, obj);
        } finally {
            this.e.writeLock().unlock();
        }
    }

    public Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17307540", new Object[]{this, str});
        }
        Context a2 = android.taobao.windvane.util.n.a(this.f1671a);
        if (a2 == null) {
            return "null";
        }
        this.e.readLock().lock();
        try {
            Object obj = this.d.get(str);
            if (obj == null) {
                this.e.writeLock().lock();
                try {
                    if (this.d.get(str) == null) {
                        Object a3 = q.a(str, a2, this.b, this.c);
                        if (a3 != null) {
                            this.d.put(str, a3);
                        } else {
                            a3 = obj;
                        }
                        obj = a3;
                    } else {
                        obj = this.d.get(str);
                    }
                } finally {
                    this.e.writeLock().unlock();
                }
            }
            return obj;
        } finally {
            this.e.readLock().unlock();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e.readLock().lock();
        try {
            for (Object obj : this.d.values()) {
                if (obj instanceof e) {
                    ((e) obj).onDestroy();
                }
            }
            this.e.readLock().unlock();
            this.e.writeLock().lock();
            try {
                this.d.clear();
            } finally {
                this.e.writeLock().unlock();
            }
        } catch (Throwable th) {
            this.e.readLock().unlock();
            throw th;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.e.readLock().lock();
        try {
            for (Object obj : this.d.values()) {
                if (obj instanceof e) {
                    ((e) obj).onPause();
                }
            }
        } finally {
            this.e.readLock().unlock();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.e.readLock().lock();
        try {
            for (Object obj : this.d.values()) {
                if (obj instanceof e) {
                    ((e) obj).onResume();
                }
            }
        } finally {
            this.e.readLock().unlock();
        }
    }

    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        this.e.readLock().lock();
        try {
            for (Object obj : this.d.values()) {
                if (obj instanceof e) {
                    ((e) obj).onActivityResult(i, i2, intent);
                }
            }
        } finally {
            this.e.readLock().unlock();
        }
    }

    public void a(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6953b2", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        this.e.readLock().lock();
        try {
            for (Object obj : this.d.values()) {
                if (obj instanceof e) {
                    ((e) obj).onRequestPermissionsResult(i, strArr, iArr);
                }
            }
        } finally {
            this.e.readLock().unlock();
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.e.readLock().lock();
        try {
            for (Object obj : this.d.values()) {
                if (obj instanceof e) {
                    ((e) obj).onScrollChanged(i, i2, i3, i4);
                }
            }
        } finally {
            this.e.readLock().unlock();
        }
    }
}
