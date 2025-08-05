package com.alibaba.android.patronus.simplecookie;

import android.content.Context;
import com.alibaba.android.patronus.simplecookie.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class b extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static b c;
    private long d;

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 95609325) {
            super.f();
            return null;
        } else if (hashCode != 1548812690) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.run();
            return null;
        }
    }

    @Override // com.alibaba.android.patronus.simplecookie.e
    public /* bridge */ /* synthetic */ void f() {
        super.f();
    }

    @Override // com.alibaba.android.patronus.simplecookie.e, java.lang.Runnable
    public /* bridge */ /* synthetic */ void run() {
        super.run();
    }

    private b(Context context) {
        super(context, "CookieSyncManager");
    }

    public static synchronized b a() {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6a88efae", new Object[0]);
            } else if (c == null) {
                throw new IllegalStateException("CookieSyncManager::createInstance() needs to be called before CookieSyncManager::getInstance()");
            } else {
                return c;
            }
        }
    }

    public static synchronized b a(Context context) {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a29fd3a6", new Object[]{context});
            }
            if (c == null) {
                c = new b(context);
            }
            return c;
        }
    }

    public ArrayList<c.a> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("7153230c", new Object[]{this, str});
        }
        if (this.b == null) {
            return new ArrayList<>();
        }
        return this.b.a(str);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.b == null) {
        } else {
            this.b.b();
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (this.b != null) {
            return this.b.a();
        }
        return false;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.b == null) {
        } else {
            this.b.c();
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (this.b == null) {
        } else {
            this.b.a(j);
        }
    }

    @Override // com.alibaba.android.patronus.simplecookie.e
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!c.a().b()) {
        } else {
            ArrayList<c.a> a2 = c.a().a(this.d);
            this.d = System.currentTimeMillis();
            a(a2);
            a(c.a().g());
        }
    }

    private void a(ArrayList<c.a> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            return;
        }
        Iterator<c.a> it = arrayList.iterator();
        while (it.hasNext()) {
            c.a next = it.next();
            if (next.i != 1) {
                if (next.i != 0) {
                    this.b.a(next.f2417a, next.b, next.c);
                }
                if (next.i != 2) {
                    this.b.a(next);
                    c.a().b(next);
                } else {
                    c.a().a(next);
                }
            }
        }
    }
}
