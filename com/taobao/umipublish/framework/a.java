package com.taobao.umipublish.framework;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<b> f23357a = new CopyOnWriteArrayList();

    /* renamed from: com.taobao.umipublish.framework.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C1003a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f23358a;

        static {
            kge.a(-1038442480);
            f23358a = new a();
        }
    }

    /* loaded from: classes9.dex */
    public interface b {
        void onReceiveEvent(String str, d dVar);
    }

    static {
        kge.a(1072984800);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("4c2c9247", new Object[0]) : C1003a.f23358a;
    }

    public synchronized void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2671889", new Object[]{this, bVar});
            return;
        }
        if (!this.f23357a.contains(bVar)) {
            this.f23357a.add(bVar);
        }
    }

    public synchronized void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9cc4da8", new Object[]{this, bVar});
        } else {
            this.f23357a.remove(bVar);
        }
    }

    public synchronized void a(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5709ada", new Object[]{this, str, dVar});
            return;
        }
        for (b bVar : this.f23357a) {
            bVar.onReceiveEvent(str, dVar);
        }
    }
}
