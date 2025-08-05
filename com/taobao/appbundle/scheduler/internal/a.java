package com.taobao.appbundle.scheduler.internal;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes6.dex */
public final class a implements c, d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HashSet<c> f16303a;
    public volatile boolean b;

    static {
        kge.a(1938667400);
        kge.a(-495609857);
        kge.a(385835842);
    }

    @Override // com.taobao.appbundle.scheduler.internal.c
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else if (this.b) {
        } else {
            synchronized (this) {
                if (this.b) {
                    return;
                }
                this.b = true;
                HashSet<c> hashSet = this.f16303a;
                this.f16303a = null;
                a(hashSet);
            }
        }
    }

    public boolean a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f116199", new Object[]{this, cVar})).booleanValue();
        }
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    HashSet<c> hashSet = this.f16303a;
                    if (hashSet == null) {
                        hashSet = new HashSet<>();
                        this.f16303a = hashSet;
                    }
                    hashSet.add(cVar);
                    return true;
                }
            }
        }
        cVar.dispose();
        return false;
    }

    @Override // com.taobao.appbundle.scheduler.internal.d
    public boolean b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8dc0378", new Object[]{this, cVar})).booleanValue();
        }
        if (this.b) {
            return false;
        }
        synchronized (this) {
            if (this.b) {
                return false;
            }
            HashSet<c> hashSet = this.f16303a;
            if (hashSet != null && hashSet.remove(cVar)) {
                return true;
            }
            return false;
        }
    }

    public void a(HashSet<c> hashSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe2ff85", new Object[]{this, hashSet});
        } else if (hashSet == null) {
        } else {
            Iterator<c> it = hashSet.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next instanceof c) {
                    try {
                        next.dispose();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
    }
}
