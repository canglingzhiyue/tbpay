package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public class ofr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FLAG_ITEM_ADD = 1;
    public static final int FLAG_ITEM_CHANGED = 4;
    public static final int FLAG_ITEM_HEADER = 16;
    public static final int FLAG_ITEM_MOVE = 8;
    public static final int FLAG_ITEM_REMOVED = 2;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<d> f32009a = new ArrayList<>();
    private ofp b;

    /* loaded from: classes8.dex */
    public static class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public int f32010a;
        public int b;
        public boolean c;

        static {
            kge.a(-80607726);
        }

        public a(int i, int i2, boolean z) {
            this.f32010a = -1;
            this.b = 0;
            this.c = false;
            this.f32010a = i;
            this.b = i2;
            this.c = z;
        }
    }

    /* loaded from: classes8.dex */
    public static class b extends d {

        /* renamed from: a  reason: collision with root package name */
        public int f32011a;

        static {
            kge.a(-1480217967);
        }

        public b(int i) {
            this.f32011a = i;
        }
    }

    /* loaded from: classes8.dex */
    public static class c extends d {

        /* renamed from: a  reason: collision with root package name */
        public int f32012a;
        public int b;

        static {
            kge.a(-947569290);
        }

        public c(int i, int i2) {
            this.f32012a = -1;
            this.f32012a = i;
            this.b = i2;
        }
    }

    /* loaded from: classes8.dex */
    public static class d {
        public int d;

        static {
            kge.a(450003361);
        }
    }

    /* loaded from: classes8.dex */
    public static class e extends d {

        /* renamed from: a  reason: collision with root package name */
        public int f32013a;
        public int b;

        static {
            kge.a(-1055836976);
        }

        public e(int i, int i2) {
            this.f32013a = i;
            this.b = i2;
        }
    }

    static {
        kge.a(-344081141);
    }

    public ofr(ofp ofpVar) {
        this.b = ofpVar;
    }

    public void a(int i, int i2, int i3, boolean z) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d1660f9", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
            return;
        }
        d dVar2 = null;
        if (this.f32009a.size() > 0) {
            ArrayList<d> arrayList = this.f32009a;
            dVar = arrayList.get(arrayList.size() - 1);
        } else {
            dVar = null;
        }
        if ((i & 1) != 0) {
            if (oeb.ad() && dVar != null && dVar.d == i) {
                a aVar = (a) dVar;
                if (aVar.f32010a + aVar.b == i2) {
                    aVar.b++;
                }
            }
            if (dVar != null && dVar.d == i) {
                a aVar2 = (a) dVar;
                if (aVar2.f32010a == i2) {
                    aVar2.b++;
                }
            }
            dVar2 = new a(i2, 1, z);
        } else if ((i & 2) != 0) {
            if (dVar != null && dVar.d == i) {
                c cVar = (c) dVar;
                if (cVar.f32012a == i2) {
                    cVar.b++;
                }
            }
            dVar2 = new c(i2, 1);
        } else if ((i & 8) != 0) {
            dVar2 = new e(i2, i3);
        } else if ((i & 4) != 0) {
            dVar2 = new b(i2);
        }
        if (dVar2 == null) {
            return;
        }
        dVar2.d = i;
        this.f32009a.add(dVar2);
    }

    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z && this.b != null) {
            Iterator<d> it = this.f32009a.iterator();
            while (it.hasNext()) {
                d next = it.next();
                if (next instanceof a) {
                    ofp ofpVar = this.b;
                    int i = next.d;
                    a aVar = (a) next;
                    ofpVar.a(i, aVar.f32010a, aVar.b, aVar.c);
                } else if (next instanceof c) {
                    ofp ofpVar2 = this.b;
                    int i2 = next.d;
                    c cVar = (c) next;
                    ofpVar2.a(i2, cVar.f32012a, cVar.b);
                } else if (next instanceof e) {
                    ofp ofpVar3 = this.b;
                    int i3 = next.d;
                    e eVar = (e) next;
                    ofpVar3.b(i3, eVar.f32013a, eVar.b);
                } else if (next instanceof b) {
                    this.b.b(next.d, ((b) next).f32011a);
                }
            }
        }
        boolean z2 = !this.f32009a.isEmpty();
        this.f32009a.clear();
        return z2;
    }
}
