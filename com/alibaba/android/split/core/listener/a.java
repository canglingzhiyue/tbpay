package com.alibaba.android.split.core.listener;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.android.split.core.splitinstall.m;
import com.alibaba.android.split.ui.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.bgp;
import tb.bgu;
import tb.bhc;
import tb.kge;

/* loaded from: classes.dex */
public abstract class a<StateT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public bgu f2434a;
    private IntentFilter b;
    private Context c;
    private List<bhc> e = new ArrayList();
    private Map<String, c> f = new HashMap();
    private Set<b<StateT>> d = Collections.newSetFromMap(new ConcurrentHashMap());
    private StateUpdatedReceiver g = null;
    private volatile boolean h = false;

    static {
        kge.a(1559599920);
    }

    public abstract void a(Context context, Intent intent);

    public a(bgu bguVar, IntentFilter intentFilter, Context context) {
        this.f2434a = bguVar;
        this.b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext == null ? context : applicationContext;
    }

    public final synchronized void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.h = z;
        a();
    }

    public final synchronized void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("875f6f58", new Object[]{this, bVar});
            return;
        }
        this.d.add(bVar);
        a();
    }

    public final synchronized void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12a1137", new Object[]{this, bVar});
            return;
        }
        this.d.remove(bVar);
        a();
    }

    public final synchronized void a(StateT statet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, statet});
            return;
        }
        Iterator it = new HashSet(this.d).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onStateUpdate(statet);
        }
        if (statet instanceof m) {
            if (!Collections.disjoint(((m) statet).g(), this.f.keySet())) {
                if (((m) statet).b() != 5 && ((m) statet).b() != 6 && ((m) statet).b() != 7 && ((m) statet).b() != 0 && ((m) statet).b() != 12) {
                    Iterator<String> it2 = ((m) statet).g().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String next = it2.next();
                        if (this.f.containsKey(next)) {
                            com.alibaba.android.split.ui.a.a(this.f.get(next));
                            break;
                        }
                    }
                } else {
                    com.alibaba.android.split.ui.a.a();
                    for (String str : ((m) statet).g()) {
                        this.f.remove(str);
                    }
                }
            }
            a((m) statet);
        }
    }

    private void a(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398f1780", new Object[]{this, mVar});
            return;
        }
        List<String> g = mVar.g();
        Iterator<bhc> it = this.e.iterator();
        int b = mVar.b();
        if (b == 5) {
            bgu bguVar = this.f2434a;
            bguVar.d("notifyRequest INSTALLED:" + g, new Object[0]);
            while (it.hasNext()) {
                bhc next = it.next();
                if (g.contains(next.d())) {
                    bgp.a(next).b();
                    it.remove();
                }
            }
        } else if (b != 6) {
            if (b != 7) {
                return;
            }
            bhc next2 = it.next();
            if (!g.contains(next2.d())) {
                return;
            }
            if (next2.f() != null) {
                next2.f().a("install canceled", next2.e());
            }
            it.remove();
        } else {
            while (it.hasNext()) {
                bhc next3 = it.next();
                if (g.contains(next3.d())) {
                    bgu bguVar2 = this.f2434a;
                    bguVar2.d("StateUpdate getInstantiationCallBack FAILED:" + next3.d(), new Object[0]);
                    if (next3.f() != null) {
                        next3.f().a("install failed", next3.e());
                    }
                    it.remove();
                }
            }
        }
    }

    public final synchronized void a(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a65fa23", new Object[]{this, str, cVar});
        } else {
            this.f.put(str, cVar);
        }
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if ((this.h || !this.d.isEmpty()) && this.g == null) {
            this.g = new StateUpdatedReceiver(this);
            LocalBroadcastManager.getInstance(this.c).registerReceiver(this.g, this.b);
        }
        if (this.h || !this.d.isEmpty() || this.g == null) {
            return;
        }
        LocalBroadcastManager.getInstance(this.c).unregisterReceiver(this.g);
        this.g = null;
    }

    public synchronized void a(bhc bhcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1b768db", new Object[]{this, bhcVar});
        } else {
            this.e.add(bhcVar);
        }
    }
}
