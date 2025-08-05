package com.etao.feimagesearch.videosearch;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.videosearch.g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import tb.cua;
import tb.cub;
import tb.kge;

/* loaded from: classes4.dex */
public class i implements cua.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f7054a;
    private g.a c;
    private int d;
    private a i;
    private List<h> b = new ArrayList(3);
    private cub e = new cub();
    private Lock f = new ReentrantLock();
    private Condition g = null;
    private int h = 0;
    private boolean j = false;

    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void b();
    }

    static {
        kge.a(-1627265720);
        kge.a(1079378747);
    }

    public static /* synthetic */ Lock a(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Lock) ipChange.ipc$dispatch("4b07d130", new Object[]{iVar}) : iVar.f;
    }

    public static /* synthetic */ void a(i iVar, Bitmap bitmap, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d9103f", new Object[]{iVar, bitmap, new Long(j)});
        } else {
            iVar.b(bitmap, j);
        }
    }

    public static /* synthetic */ boolean a(i iVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ef418cf", new Object[]{iVar, new Boolean(z)})).booleanValue();
        }
        iVar.j = z;
        return z;
    }

    public static /* synthetic */ List b(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8ac5131d", new Object[]{iVar}) : iVar.b;
    }

    public static /* synthetic */ a c(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("51d12af", new Object[]{iVar}) : iVar.i;
    }

    public i(String str, int i, g.a aVar, a aVar2) {
        this.c = aVar;
        this.i = aVar2;
        this.e.a(this);
        this.e.a(str);
        this.d = i / com.etao.feimagesearch.config.b.k();
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.e.a(this.d, 320, 640);
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!this.j || !this.b.isEmpty()) {
        } else {
            this.i.a();
            this.j = false;
        }
    }

    private void b(Bitmap bitmap, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46a4ff", new Object[]{this, bitmap, new Long(j)});
            return;
        }
        this.f.lock();
        if (this.f7054a) {
            this.h--;
            this.f7054a = false;
            this.c.a(bitmap, j);
            g();
        } else {
            this.b.add(new h(bitmap, j));
        }
        this.f.unlock();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f.lock();
        if (this.b.isEmpty()) {
            g();
            this.f7054a = true;
        } else {
            g();
            this.h--;
            h remove = this.b.remove(0);
            this.c.a(remove.f7053a, remove.b);
        }
        Condition condition = this.g;
        if (condition != null) {
            condition.signal();
            this.g = null;
        }
        this.f.unlock();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.e.a();
        this.e.b();
    }

    @Override // tb.cua.a
    public void a(final Bitmap bitmap, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb5ddcbe", new Object[]{this, bitmap, new Long(j)});
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.etao.feimagesearch.videosearch.i.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        i.a(i.this, bitmap, j);
                    }
                }
            });
        }
    }

    @Override // tb.cua.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.i.b();
        }
    }

    @Override // tb.cua.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.f.lock();
        this.h++;
        if (this.h >= 3) {
            this.g = this.f.newCondition();
            try {
                this.g.await();
            } catch (Exception unused) {
            }
        }
        this.f.unlock();
    }

    @Override // tb.cua.a
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.etao.feimagesearch.videosearch.i.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    i.a(i.this).lock();
                    i.a(i.this, true);
                    if (i.b(i.this).isEmpty()) {
                        i.c(i.this).a();
                        i.a(i.this, false);
                    }
                    i.a(i.this).unlock();
                }
            });
        }
    }
}
