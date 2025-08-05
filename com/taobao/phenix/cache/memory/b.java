package com.taobao.phenix.cache.memory;

import android.content.res.Resources;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Set;
import tb.kge;
import tb.niw;
import tb.riy;

/* loaded from: classes7.dex */
public abstract class b implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f18878a;
    private final String b;
    private final int c;
    private final int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private final Set<Integer> h = new HashSet(2);

    static {
        kge.a(-1113093214);
        kge.a(-1691971054);
    }

    public abstract int a();

    public abstract e a(String str, String str2, int i, int i2, boolean z, Resources resources);

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    public b(String str, String str2, int i, int i2) {
        this.f18878a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    private synchronized void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185a1c87", new Object[]{this, eVar});
        } else if (eVar == null) {
        } else {
            if (this.f) {
                this.f = false;
                e();
            }
            if (this.g) {
                return;
            }
            if (eVar instanceof f) {
                Set<Integer> set = this.h;
                Integer valueOf = Integer.valueOf(eVar.hashCode());
                if (set.contains(valueOf)) {
                    this.g = true;
                    niw.c(c.TAG_RECYCLE, "references dirty now(last releasable drawable same with the hash is lost), refer=%d, image=%s, drawable=%s", Integer.valueOf(this.h.size()), this, eVar);
                } else {
                    this.h.add(valueOf);
                    ((f) eVar).a(this);
                }
            } else {
                this.g = true;
            }
        }
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.g = true;
        }
    }

    public synchronized void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.f && !z) {
            this.f = false;
            e();
        }
        this.e = z;
        niw.a(c.TAG_RECYCLE, "release from cache, result=%b, isDirty=%b, refer=%d, image=%s", Boolean.valueOf(z), Boolean.valueOf(this.g), Integer.valueOf(this.h.size()), this);
        f();
    }

    @Override // com.taobao.phenix.cache.memory.g
    public synchronized void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185a90e6", new Object[]{this, fVar});
        } else if (fVar == null) {
        } else {
            this.h.remove(Integer.valueOf(fVar.hashCode()));
            niw.a(c.TAG_RECYCLE, "image reference released, isDirty=%b, refer=%d, image=%s, drawable=%s", Boolean.valueOf(this.g), Integer.valueOf(this.h.size()), this, fVar);
            f();
        }
    }

    @Override // com.taobao.phenix.cache.memory.g
    public synchronized void b(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15b8827", new Object[]{this, fVar});
        } else if (fVar == null) {
        } else {
            this.g = true;
            fVar.a(null);
            this.h.remove(Integer.valueOf(fVar.hashCode()));
            niw.a(c.TAG_RECYCLE, "image reference downgraded to passable, isDirty=%b, refer=%d, image=%s, drawable=%s", Boolean.valueOf(this.g), Integer.valueOf(this.h.size()), this, fVar);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.f || this.g || !this.e || this.h.size() != 0) {
        } else {
            d();
            this.f = true;
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f18878a;
    }

    public e a(boolean z, Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("cc15f660", new Object[]{this, new Boolean(z), resources});
        }
        e a2 = a(this.f18878a, this.b, this.c, this.d, z, resources);
        a(a2);
        return a2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return getClass().getSimpleName() + riy.BRACKET_START_STR + Integer.toHexString(hashCode()) + ", key@" + this.f18878a + riy.BRACKET_END_STR;
    }
}
