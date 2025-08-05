package tao.reactivex.d.a;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import tao.reactivex.d.h.e;
import tb.jdz;
import tb.jeq;
import tb.kge;
import tb.kgk;

/* loaded from: classes9.dex */
public final class c implements jdz, jeq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<jdz> f25094a;
    public volatile boolean b;

    static {
        kge.a(-1471017939);
        kge.a(1964944663);
        kge.a(1964944664);
    }

    public void a(List<jdz> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null) {
            ArrayList arrayList = null;
            for (jdz jdzVar : list) {
                try {
                    jdzVar.b_();
                } catch (Throwable th) {
                    tao.reactivex.b.b.a(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() != 1) {
                throw new tao.reactivex.b.a(arrayList);
            }
            throw e.a((Throwable) arrayList.get(0));
        }
    }

    @Override // tb.jeq
    public boolean a(jdz jdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef30445c", new Object[]{this, jdzVar})).booleanValue();
        }
        kgk.a(jdzVar, "d is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    List list = this.f25094a;
                    if (list == null) {
                        list = new LinkedList();
                        this.f25094a = list;
                    }
                    list.add(jdzVar);
                    return true;
                }
            }
        }
        jdzVar.b_();
        return false;
    }

    @Override // tb.jdz
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    @Override // tb.jeq
    public boolean b(jdz jdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddb34add", new Object[]{this, jdzVar})).booleanValue();
        }
        if (!c(jdzVar)) {
            return false;
        }
        jdzVar.b_();
        return true;
    }

    @Override // tb.jdz
    public void b_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
        } else if (this.b) {
        } else {
            synchronized (this) {
                if (this.b) {
                    return;
                }
                this.b = true;
                List<jdz> list = this.f25094a;
                this.f25094a = null;
                a(list);
            }
        }
    }

    @Override // tb.jeq
    public boolean c(jdz jdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc36515e", new Object[]{this, jdzVar})).booleanValue();
        }
        kgk.a(jdzVar, "Disposable item is null");
        if (this.b) {
            return false;
        }
        synchronized (this) {
            if (this.b) {
                return false;
            }
            List<jdz> list = this.f25094a;
            if (list != null && list.remove(jdzVar)) {
                return true;
            }
            return false;
        }
    }
}
