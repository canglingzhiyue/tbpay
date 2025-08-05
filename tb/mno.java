package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* loaded from: classes7.dex */
public class mno {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f31138a = Boolean.TRUE.booleanValue();
    private static final boolean b = Boolean.FALSE.booleanValue();
    private final int c;

    /* loaded from: classes7.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f31140a;
        public int b;
        public int c;
        public int d;
        public c e = null;
        public c f = null;

        public c(int i, int i2, int i3) {
            if (i > 0) {
                this.f31140a = (i3 - i2) + 1;
            }
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }

    public mno(int i) {
        this.c = i;
    }

    public float a(View view, List<mns> list, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91301087", new Object[]{this, view, list, view2})).floatValue();
        }
        float f = 0.0f;
        if (list != null && list.size() != 0) {
            int[] b2 = mnh.b(view, view2);
            int max = Math.max(0, b2[1]);
            int min = Math.min(mnh.screenHeight, b2[1] + view.getHeight());
            int max2 = Math.max(0, b2[0]);
            int min2 = Math.min(mnh.screenWidth, b2[0] + view.getWidth());
            int i = min2 - max2;
            if (i <= 0) {
                i = 0;
            }
            int i2 = min - max;
            if (i2 <= 0) {
                i2 = 0;
            }
            int i3 = i * i2;
            if (i3 == 0) {
                return 0.0f;
            }
            List<a> a2 = a(max, min, max2, min2, list);
            if (a2.size() == 0) {
                return 0.0f;
            }
            Collections.sort(a2, new b());
            f = (a(max, min, a2) * 1.0f) / i3;
            for (a aVar : a2) {
                if (aVar != null) {
                    a.a(aVar);
                }
            }
        }
        return f;
    }

    private int a(int i, int i2, List<a> list) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32d14fac", new Object[]{this, new Integer(i), new Integer(i2), list})).intValue();
        }
        c cVar = new c(0, i, i2);
        int i4 = 0;
        for (a aVar : list) {
            if (aVar.f31139a > i4) {
                if (cVar.f31140a > 1) {
                    i3 += (aVar.f31139a - i4) * (cVar.f31140a - 1);
                }
                i4 = aVar.f31139a;
            }
            a(cVar, aVar, aVar.d == 0 ? f31138a : b);
        }
        return i3;
    }

    private List<a> a(int i, int i2, int i3, int i4, List<mns> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7b6f5f0e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), list});
        }
        ArrayList arrayList = new ArrayList();
        for (mns mnsVar : list) {
            int max = Math.max(i, mnsVar.f31143a - this.c);
            int min = Math.min(i2, mnsVar.b + this.c);
            if (max <= min) {
                a a2 = a.a(mnsVar.c - this.c >= i3 ? mnsVar.c - this.c : i3, max, min);
                a2.d = 0;
                int i5 = mnsVar.d + this.c;
                if (i5 > i4) {
                    i5 = i4;
                }
                a a3 = a.a(i5, max, min);
                a3.d = 1;
                arrayList.add(a2);
                arrayList.add(a3);
            }
        }
        return arrayList;
    }

    private void a(c cVar, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc3eaea4", new Object[]{this, cVar, aVar, new Boolean(z)});
            return;
        }
        int i = cVar.c;
        int i2 = cVar.d;
        if (aVar.b <= i && aVar.c >= i2) {
            if (z) {
                cVar.b++;
            } else {
                cVar.b--;
            }
            if (cVar.e != null) {
                a(cVar.e, aVar, z);
            }
            if (cVar.f != null) {
                a(cVar.f, aVar, z);
            }
            if (cVar.b > 0) {
                cVar.f31140a = (i2 - i) + 1;
                return;
            }
            cVar.f31140a = 0;
            if (cVar.e != null) {
                cVar.f31140a += cVar.e.f31140a;
            }
            if (cVar.f == null) {
                return;
            }
            cVar.f31140a += cVar.f.f31140a;
            return;
        }
        int i3 = (i + i2) / 2;
        if (i3 >= aVar.b) {
            if (cVar.e == null) {
                cVar.e = new c(cVar.b, cVar.c, i3);
            }
            a(cVar.e, aVar, z);
        }
        if (i3 < aVar.c) {
            if (cVar.f == null) {
                cVar.f = new c(cVar.b, i3 + 1, cVar.d);
            }
            a(cVar.f, aVar, z);
        }
        cVar.b = a(cVar);
        if (cVar.b > 0) {
            cVar.f31140a = (i2 - i) + 1;
            return;
        }
        cVar.f31140a = 0;
        if (cVar.e != null) {
            cVar.f31140a += cVar.e.f31140a;
        }
        if (cVar.f == null) {
            return;
        }
        cVar.f31140a += cVar.f.f31140a;
    }

    private int a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18e2f77e", new Object[]{this, cVar})).intValue();
        }
        c cVar2 = cVar.e;
        c cVar3 = cVar.f;
        return Math.min(cVar2 == null ? cVar.b : cVar2.b, cVar3 == null ? cVar.b : cVar3.b);
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static Queue<a> e = new LinkedList();

        /* renamed from: a  reason: collision with root package name */
        public int f31139a;
        public int b;
        public int c;
        public int d;

        public static /* synthetic */ a a(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("88490620", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)}) : b(i, i2, i3);
        }

        public static /* synthetic */ void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18e20ecd", new Object[]{aVar});
            } else {
                aVar.a();
            }
        }

        private a() {
        }

        private static a b(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d8f2e421", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)});
            }
            a poll = e.poll();
            if (poll == null) {
                poll = new a();
            }
            poll.f31139a = i;
            poll.b = i2;
            poll.c = i3;
            return poll;
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (e.size() >= 100) {
            } else {
                e.add(this);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class b implements Comparator<a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private b() {
        }

        @Override // java.util.Comparator
        public /* synthetic */ int compare(a aVar, a aVar2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, aVar, aVar2})).intValue() : a(aVar, aVar2);
        }

        public int a(a aVar, a aVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("956fb6e5", new Object[]{this, aVar, aVar2})).intValue();
            }
            if (aVar.f31139a < aVar2.f31139a) {
                return -1;
            }
            if (aVar.f31139a == aVar2.f31139a) {
                if (aVar.d == aVar2.d) {
                    return 0;
                }
                if (aVar.d == 0) {
                    return -1;
                }
            }
            return 1;
        }
    }
}
