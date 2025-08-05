package com.taobao.android.lightvane.jsbridge;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tb.gwn;
import tb.kge;

/* loaded from: classes5.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f13292a;
    private com.taobao.android.lightvane.webview.a b;
    private Map<String, Object> c = new HashMap();
    private ReentrantReadWriteLock d = new ReentrantReadWriteLock(true);

    static {
        kge.a(27575915);
    }

    public g(Context context, com.taobao.android.lightvane.webview.a aVar) {
        this.f13292a = context;
        this.b = aVar;
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        this.d.writeLock().lock();
        try {
            this.c.put(str, obj);
        } finally {
            this.d.writeLock().unlock();
        }
    }

    public Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17307540", new Object[]{this, str});
        }
        Context a2 = gwn.a(this.f13292a);
        if (a2 == null) {
            return "null";
        }
        this.d.readLock().lock();
        try {
            Object obj = this.c.get(str);
            if (obj == null) {
                this.d.writeLock().lock();
                try {
                    if (this.c.get(str) == null) {
                        Object a3 = h.a(str, a2, this.b);
                        if (a3 != null) {
                            this.c.put(str, a3);
                        } else {
                            a3 = obj;
                        }
                        obj = a3;
                    } else {
                        obj = this.c.get(str);
                    }
                } finally {
                    this.d.writeLock().unlock();
                }
            }
            return obj;
        } finally {
            this.d.readLock().unlock();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.d.readLock().lock();
        try {
            for (Object obj : this.c.values()) {
                if (obj instanceof c) {
                    ((c) obj).onDestroy();
                }
            }
            this.d.readLock().unlock();
            this.d.writeLock().lock();
            try {
                this.c.clear();
            } finally {
                this.d.writeLock().unlock();
            }
        } catch (Throwable th) {
            this.d.readLock().unlock();
            throw th;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.d.readLock().lock();
        try {
            for (Object obj : this.c.values()) {
                if (obj instanceof c) {
                    ((c) obj).onPause();
                }
            }
        } finally {
            this.d.readLock().unlock();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.d.readLock().lock();
        try {
            for (Object obj : this.c.values()) {
                if (obj instanceof c) {
                    ((c) obj).onResume();
                }
            }
        } finally {
            this.d.readLock().unlock();
        }
    }

    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        this.d.readLock().lock();
        try {
            for (Object obj : this.c.values()) {
                if (obj instanceof c) {
                    ((c) obj).onActivityResult(i, i2, intent);
                }
            }
        } finally {
            this.d.readLock().unlock();
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.d.readLock().lock();
        try {
            for (Object obj : this.c.values()) {
                if (obj instanceof c) {
                    ((c) obj).onScrollChanged(i, i2, i3, i4);
                }
            }
        } finally {
            this.d.readLock().unlock();
        }
    }
}
