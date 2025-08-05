package tb;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.implement.d;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public class rof implements ron {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Handler e;
    private final d g;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<rop> f33259a = new ArrayList<>();
    private ArrayList<b> b = new ArrayList<>();
    private ArrayList<a> c = new ArrayList<>();
    private ArrayList<Pair<a, rop>> d = new ArrayList<>();
    private final int f = hashCode();

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final rox f33260a;
        public final rny b;
        public final roo c;

        public a(rox roxVar, rny rnyVar, roo rooVar) {
            this.f33260a = roxVar;
            this.b = rnyVar;
            this.c = rooVar;
        }
    }

    /* loaded from: classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final rop f33261a;
        public final ArrayList<rop> b;
        public final ArrayList<b> c;

        public b(rop ropVar, ArrayList<rop> arrayList, ArrayList<b> arrayList2) {
            this.f33261a = ropVar;
            this.b = arrayList;
            this.c = arrayList2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.b.remove(this.f33261a);
            this.c.remove(this);
            this.f33261a.d();
        }
    }

    public rof(d dVar, Looper looper) {
        this.g = dVar;
        this.e = new Handler(looper);
    }

    private static int a(rox roxVar, rny rnyVar, ArrayList<Pair<a, rop>> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7650d5ed", new Object[]{roxVar, rnyVar, arrayList})).intValue();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) arrayList.get(i).first;
            if (aVar.b.equals(rnyVar) && aVar.f33260a.equals(roxVar)) {
                return i;
            }
        }
        return -1;
    }

    private static int a(rod rodVar, ArrayList<rop> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad9f768c", new Object[]{rodVar, arrayList})).intValue();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i).a().equals(rodVar)) {
                return i;
            }
        }
        return -1;
    }

    private static int b(rox roxVar, rny rnyVar, ArrayList<a> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7db60b0c", new Object[]{roxVar, rnyVar, arrayList})).intValue();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a aVar = arrayList.get(i);
            if (aVar.b.equals(rnyVar) && aVar.f33260a.equals(roxVar)) {
                return i;
            }
        }
        return -1;
    }

    private static int b(rod rodVar, ArrayList<a> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eabf3aab", new Object[]{rodVar, arrayList})).intValue();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i).b.c().equals(rodVar)) {
                return i;
            }
        }
        return -1;
    }

    private static boolean c(rod rodVar, ArrayList<Pair<a, rop>> arrayList) {
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27defedb", new Object[]{rodVar, arrayList})).booleanValue();
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((a) arrayList.get(i2).first).b.c().equals(rodVar) && i - 1 == 0) {
                return false;
            }
        }
        return true;
    }

    private static int a(rop ropVar, ArrayList<b> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfe31298", new Object[]{ropVar, arrayList})).intValue();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i).f33261a.equals(ropVar)) {
                return i;
            }
        }
        return -1;
    }

    @Override // tb.ron
    public boolean a(rox roxVar, rny rnyVar, rny rnyVar2, roo rooVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64615557", new Object[]{this, roxVar, rnyVar, rnyVar2, rooVar, new Boolean(z)})).booleanValue();
        }
        if (com.uploader.implement.a.a(2)) {
            com.uploader.implement.a.a(2, "ConnectionRecycler", this.f + " replace start, session:" + roxVar.hashCode() + " request:" + rnyVar.hashCode() + " newRequest:" + rnyVar2.hashCode() + " keepAlive:" + z);
        }
        rod c = rnyVar.c();
        if (!c.equals(rnyVar2.c())) {
            if (com.uploader.implement.a.a(2)) {
                com.uploader.implement.a.a(2, "ConnectionRecycler", this.f + " replace:failure, false !=, request:" + rnyVar.hashCode() + " newRequest:" + rnyVar2.hashCode());
            }
            return false;
        } else if (!c.e) {
            if (com.uploader.implement.a.a(2)) {
                com.uploader.implement.a.a(2, "ConnectionRecycler", this.f + " replace:false, !isLongLived");
            }
            return false;
        } else {
            int b2 = b(roxVar, rnyVar, this.c);
            if (b2 != -1) {
                this.c.set(b2, new a(roxVar, rnyVar2, rooVar));
                if (com.uploader.implement.a.a(2)) {
                    com.uploader.implement.a.a(2, "ConnectionRecycler", this.f + " replace, waiting, request:" + rnyVar.hashCode() + " newRequest:" + rnyVar2.hashCode());
                }
                return true;
            }
            int a2 = a(roxVar, rnyVar, this.d);
            if (a2 == -1) {
                if (com.uploader.implement.a.a(2)) {
                    com.uploader.implement.a.a(2, "ConnectionRecycler", this.f + " replace failure, !bounding, request:" + rnyVar.hashCode());
                }
                return false;
            }
            rop a3 = a(c, (rop) this.d.get(a2).second, z);
            this.d.set(a2, new Pair<>(new a(roxVar, rnyVar2, rooVar), a3));
            rooVar.a(roxVar, rnyVar2, a3);
            if (com.uploader.implement.a.a(8)) {
                com.uploader.implement.a.a(8, "ConnectionRecycler", this.f + " replace, bounding, request:" + rnyVar.hashCode() + " newRequest:" + rnyVar2.hashCode() + " available connection:" + a3.hashCode());
            }
            return true;
        }
    }

    @Override // tb.ron
    public boolean a(rox roxVar, rny rnyVar, roo rooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81df8912", new Object[]{this, roxVar, rnyVar, rooVar})).booleanValue();
        }
        if (com.uploader.implement.a.a(2)) {
            com.uploader.implement.a.a(2, "ConnectionRecycler", this.f + " register start, session:" + roxVar.hashCode() + " request:" + rnyVar.hashCode());
        }
        rod c = rnyVar.c();
        if (!c.e) {
            rop a2 = c.a(this.g);
            rooVar.a(roxVar, rnyVar, a2);
            if (com.uploader.implement.a.a(2)) {
                com.uploader.implement.a.a(2, "ConnectionRecycler", this.f + " register, onAvailable short lived connection:" + a2.hashCode() + " request:" + rnyVar.hashCode());
            }
            return true;
        }
        if (a(roxVar, rnyVar, this.d) != -1 && com.uploader.implement.a.a(8)) {
            com.uploader.implement.a.a(8, "ConnectionRecycler", this.f + " register, is bounding, request:" + rnyVar.hashCode());
        }
        if (b(roxVar, rnyVar, this.c) != -1 && com.uploader.implement.a.a(8)) {
            com.uploader.implement.a.a(8, "ConnectionRecycler", this.f + " register, is waiting, request:" + rnyVar.hashCode());
        }
        a aVar = new a(roxVar, rnyVar, rooVar);
        if (3 <= this.d.size() || !c(c, this.d)) {
            this.c.add(aVar);
            if (com.uploader.implement.a.a(2)) {
                com.uploader.implement.a.a(2, "ConnectionRecycler", this.f + " register, waiting request:" + rnyVar.hashCode());
            }
            return true;
        }
        rop a3 = a(c, (rop) null, true);
        this.d.add(new Pair<>(aVar, a3));
        rooVar.a(roxVar, rnyVar, a3);
        if (com.uploader.implement.a.a(2)) {
            com.uploader.implement.a.a(2, "ConnectionRecycler", this.f + " register, onAvailable long lived connection:" + a3.hashCode() + " request:" + rnyVar.hashCode());
        }
        return true;
    }

    @Override // tb.ron
    public boolean a(rox roxVar, rny rnyVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69e23728", new Object[]{this, roxVar, rnyVar, new Boolean(z)})).booleanValue();
        }
        rod c = rnyVar.c();
        if (com.uploader.implement.a.a(2)) {
            com.uploader.implement.a.a(2, "ConnectionRecycler", this.f + " unregister start, session:" + roxVar.hashCode() + " request:" + rnyVar.hashCode());
        }
        if (!c.e) {
            if (com.uploader.implement.a.a(2)) {
                com.uploader.implement.a.a(2, "ConnectionRecycler", this.f + " unregister, !isLongLived, session:" + roxVar.hashCode() + " request:" + rnyVar.hashCode());
            }
            return false;
        }
        int b2 = b(roxVar, rnyVar, this.c);
        if (b2 != -1) {
            this.c.remove(b2);
            if (com.uploader.implement.a.a(2)) {
                com.uploader.implement.a.a(2, "ConnectionRecycler", this.f + " unregister, waiting, session:" + roxVar.hashCode() + " request:" + rnyVar.hashCode());
            }
            return true;
        }
        int a2 = a(roxVar, rnyVar, this.d);
        if (a2 == -1) {
            return false;
        }
        Pair<a, rop> remove = this.d.remove(a2);
        rop a3 = a(((a) remove.first).b.c(), (rop) remove.second, z);
        a(a3);
        if (com.uploader.implement.a.a(2)) {
            com.uploader.implement.a.a(2, "ConnectionRecycler", this.f + " unregister, session:" + roxVar.hashCode() + " request:" + rnyVar.hashCode() + " connection:" + a3.hashCode());
        }
        return true;
    }

    private rop a(rod rodVar, rop ropVar, boolean z) {
        int a2;
        int a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rop) ipChange.ipc$dispatch("3459862d", new Object[]{this, rodVar, ropVar, new Boolean(z)});
        }
        if (ropVar == null && (a2 = a(rodVar, this.f33259a)) != -1 && (a3 = a((ropVar = this.f33259a.remove(a2)), this.b)) != -1) {
            this.e.removeCallbacks(this.b.remove(a3));
        }
        if (ropVar != null) {
            ropVar.a(null);
            if (!z) {
                ropVar.d();
            }
            if (ropVar.e()) {
                ropVar = rodVar.a(this.g);
            }
        } else {
            ropVar = rodVar.a(this.g);
        }
        if (com.uploader.implement.a.a(2)) {
            com.uploader.implement.a.a(2, "ConnectionRecycler", this.f + " retrieve, connection:" + ropVar.hashCode() + " keepAlive:" + z);
        }
        return ropVar;
    }

    private void a(rop ropVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd6d8025", new Object[]{this, ropVar});
            return;
        }
        int b2 = b(ropVar.a(), this.c);
        if (b2 != -1) {
            a remove = this.c.remove(b2);
            this.d.add(new Pair<>(remove, ropVar));
            remove.c.a(remove.f33260a, remove.b, ropVar);
            if (!com.uploader.implement.a.a(2)) {
                return;
            }
            com.uploader.implement.a.a(2, "ConnectionRecycler", this.f + " rebind, onAvailable:" + remove.f33260a.hashCode() + " request:" + remove.b.hashCode());
            return;
        }
        this.f33259a.add(ropVar);
        b bVar = new b(ropVar, this.f33259a, this.b);
        this.e.postDelayed(bVar, 27000L);
        this.b.add(bVar);
        if (!com.uploader.implement.a.a(2)) {
            return;
        }
        com.uploader.implement.a.a(2, "ConnectionRecycler", this.f + " rebind, start timeout connection:" + ropVar.hashCode());
    }

    @Override // tb.ron
    public boolean a(rox roxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd712321", new Object[]{this, roxVar})).booleanValue();
        }
        boolean z = false;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            if (this.c.get(size).f33260a.equals(roxVar)) {
                this.c.remove(size);
                z = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int size2 = this.d.size() - 1; size2 >= 0; size2--) {
            Pair<a, rop> pair = this.d.get(size2);
            if (((a) pair.first).f33260a.equals(roxVar)) {
                this.d.remove(size2);
                arrayList.add(a(((a) pair.first).b.c(), (rop) pair.second, false));
                z = true;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a((rop) it.next());
        }
        if (com.uploader.implement.a.a(2)) {
            com.uploader.implement.a.a(2, "ConnectionRecycler", this.f + " unregister, session:" + roxVar.hashCode() + " removed:" + z);
        }
        return z;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c.clear();
        for (int size = this.b.size() - 1; size >= 0; size--) {
            this.e.removeCallbacks(this.b.get(size));
        }
        this.b.clear();
        for (int size2 = this.d.size() - 1; size2 >= 0; size2--) {
            rop ropVar = (rop) this.d.get(size2).second;
            ropVar.a(null);
            ropVar.d();
        }
        this.d.clear();
        for (int size3 = this.f33259a.size() - 1; size3 >= 0; size3--) {
            rop ropVar2 = this.f33259a.get(size3);
            ropVar2.a(null);
            ropVar2.d();
        }
        this.f33259a.clear();
        if (!com.uploader.implement.a.a(2)) {
            return;
        }
        com.uploader.implement.a.a(2, "ConnectionRecycler", this.f + " reset");
    }
}
