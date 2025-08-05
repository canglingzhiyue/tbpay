package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public class af {

    /* renamed from: a  reason: collision with root package name */
    private static volatile af f24306a;

    /* renamed from: a  reason: collision with other field name */
    private Context f41a;

    /* renamed from: a  reason: collision with other field name */
    private List<x> f42a = new ArrayList();

    private af(Context context) {
        this.f41a = context.getApplicationContext();
        if (this.f41a == null) {
            this.f41a = context;
        }
    }

    public static af a(Context context) {
        if (f24306a == null) {
            synchronized (af.class) {
                if (f24306a == null) {
                    f24306a = new af(context);
                }
            }
        }
        return f24306a;
    }

    public int a(String str) {
        synchronized (this.f42a) {
            x xVar = new x();
            xVar.f83a = str;
            if (this.f42a.contains(xVar)) {
                for (x xVar2 : this.f42a) {
                    if (xVar2.equals(xVar)) {
                        return xVar2.f24339a;
                    }
                }
            }
            return 0;
        }
    }

    public synchronized String a(au auVar) {
        return this.f41a.getSharedPreferences("mipush_extra", 0).getString(auVar.name(), "");
    }

    public synchronized void a(au auVar, String str) {
        SharedPreferences sharedPreferences = this.f41a.getSharedPreferences("mipush_extra", 0);
        sharedPreferences.edit().putString(auVar.name(), str).apply();
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1642a(String str) {
        synchronized (this.f42a) {
            x xVar = new x();
            xVar.f24339a = 0;
            xVar.f83a = str;
            if (this.f42a.contains(xVar)) {
                this.f42a.remove(xVar);
            }
            this.f42a.add(xVar);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1643a(String str) {
        synchronized (this.f42a) {
            x xVar = new x();
            xVar.f83a = str;
            return this.f42a.contains(xVar);
        }
    }

    public void b(String str) {
        synchronized (this.f42a) {
            x xVar = new x();
            xVar.f83a = str;
            if (this.f42a.contains(xVar)) {
                Iterator<x> it = this.f42a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    x next = it.next();
                    if (xVar.equals(next)) {
                        xVar = next;
                        break;
                    }
                }
            }
            xVar.f24339a++;
            this.f42a.remove(xVar);
            this.f42a.add(xVar);
        }
    }

    public void c(String str) {
        synchronized (this.f42a) {
            x xVar = new x();
            xVar.f83a = str;
            if (this.f42a.contains(xVar)) {
                this.f42a.remove(xVar);
            }
        }
    }
}
