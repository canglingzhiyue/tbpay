package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.manager.NetworkManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes7.dex */
public class kmh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private kmg g;

    /* renamed from: a  reason: collision with root package name */
    public List<kmr> f30160a = new ArrayList();
    public List<kmr> b = new ArrayList();
    public List<kmr> c = new ArrayList();
    public List<kmf> d = new ArrayList();
    public List<kmf> e = new ArrayList();
    public Set<kmr> f = new HashSet();
    private a h = new a();

    /* loaded from: classes7.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public kmr f30162a;
        public int b = -99;
        public int c;
        public int d;
        public int e;
    }

    public kmh(kmg kmgVar) {
        this.g = kmgVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b.clear();
        this.c.clear();
        this.f30160a.clear();
        this.d.clear();
        this.e.clear();
    }

    public void a(NetworkManager.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fd3f792", new Object[]{this, aVar});
            return;
        }
        kmv.a("TaskRanker", "start rank", new Object[0]);
        a();
        ArrayList<b> arrayList = new ArrayList();
        for (kmr kmrVar : this.g.a()) {
            if (this.f.contains(kmrVar)) {
                kmv.a("TaskRanker", "rank", "task is hold , not need to run", kmrVar.e);
            } else if (kmrVar.f30170a && !TextUtils.isEmpty(kmrVar.d)) {
                this.b.add(kmrVar);
            } else if (!kmrVar.f30170a && kmrVar.b < 0) {
                this.c.add(kmrVar);
            } else {
                List<kmt> list = this.g.f30159a.get(kmrVar);
                if (list == null) {
                    kmv.c("TaskRanker", "rank", "task map value is null");
                } else {
                    b bVar = null;
                    for (kmt kmtVar : list) {
                        if (a(kmtVar)) {
                            kmv.b("TaskRanker", "rank", "user cancle so remove task", kmtVar);
                            this.d.add(new kmf(kmrVar, kmtVar));
                        } else if (1 != kmtVar.f30172a) {
                            if (bVar == null) {
                                bVar = new b();
                                bVar.f30162a = kmrVar;
                            }
                            if (bVar.b < kmtVar.c.c) {
                                bVar.b = kmtVar.c.c;
                                bVar.d = kmtVar.e.indexOf(kmrVar.e);
                                kmrVar.f = kmtVar.c;
                            }
                            if (bVar.e == 0 || bVar.e > kmtVar.b) {
                                bVar.e = kmtVar.b;
                            }
                            bVar.c |= kmtVar.c.d;
                            kmrVar.h = kmtVar.c.q | kmrVar.h;
                        }
                    }
                    if (bVar != null) {
                        if (a(bVar, aVar)) {
                            arrayList.add(bVar);
                        } else {
                            for (kmt kmtVar2 : list) {
                                this.e.add(new kmf(kmrVar, kmtVar2));
                            }
                        }
                    }
                }
            }
        }
        this.h.a(arrayList);
        for (b bVar2 : arrayList) {
            this.f30160a.add(bVar2.f30162a);
        }
    }

    private boolean a(b bVar, NetworkManager.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("255e8502", new Object[]{this, bVar, aVar})).booleanValue() : aVar.f17081a != 0 && (bVar.c & aVar.f17081a) == aVar.f17081a;
    }

    private boolean a(kmt kmtVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f161364a", new Object[]{this, kmtVar})).booleanValue() : kmtVar != null && 2 == kmtVar.f30172a;
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private C1145a f30161a = new C1145a();

        public void a(List<b> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            } else {
                Collections.sort(list, this.f30161a);
            }
        }

        /* renamed from: tb.kmh$a$a  reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static class C1145a implements Comparator<b> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private C1145a() {
            }

            @Override // java.util.Comparator
            public /* synthetic */ int compare(b bVar, b bVar2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, bVar, bVar2})).intValue() : a(bVar, bVar2);
            }

            public int a(b bVar, b bVar2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("61e8c033", new Object[]{this, bVar, bVar2})).intValue();
                }
                int i = bVar2.b - bVar.b;
                if (i != 0) {
                    return i;
                }
                int i2 = bVar.d - bVar2.d;
                return i2 != 0 ? i2 : bVar.e - bVar2.e;
            }
        }
    }
}
