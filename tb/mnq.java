package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* loaded from: classes7.dex */
public class mnq implements mnm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final View f31141a;
    private final View b;
    private final boolean c;
    private final List<a> d = new ArrayList();
    private final List<a> e = new ArrayList();
    private final List<a> f = new ArrayList();
    private final List<a> g = new ArrayList();

    public mnq(View view, View view2, boolean z) {
        this.f31141a = view;
        this.b = view2;
        this.c = z;
    }

    @Override // tb.mnm
    public mnj a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mnj) ipChange.ipc$dispatch("f07db55", new Object[]{this});
        }
        mnt mntVar = new mnt(this.f31141a, this.b);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        mntVar.a(arrayList, arrayList2);
        View c = mntVar.c();
        a(arrayList, this.d, this.e);
        a(arrayList2, this.f, this.g);
        List<a> a2 = a(this.f);
        List<a> a3 = a(this.g);
        float a4 = a(this.d, a2, this.c) / mnh.screenWidth;
        float a5 = a(this.e, a3, this.c) / mnh.screenHeight;
        b(arrayList, this.d, this.e);
        b(arrayList2, this.f, this.g);
        b(a2);
        b(a3);
        mntVar.e();
        float f = 0.4f;
        float f2 = a4 > 0.6f ? 0.4f : a4 * 0.5f;
        if (a5 <= 0.8f) {
            f = a5 * 0.5f;
        }
        float f3 = f2 + f;
        boolean a6 = mntVar.a();
        View b = mntVar.b();
        if (c == this.b) {
            c = null;
        }
        return new mnj(mnq.class, f3, a6, b, c);
    }

    private void a(List<mns> list, List<a> list2, List<a> list3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f509d3b", new Object[]{this, list, list2, list3});
        } else if (list != null) {
            for (mns mnsVar : list) {
                a a2 = a.a(mnsVar.c, mnsVar.d);
                a a3 = a.a(mnsVar.f31143a, mnsVar.b);
                list2.add(a2);
                list3.add(a3);
            }
            Collections.sort(list2);
            Collections.sort(list3);
        }
    }

    private List<a> a(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            a aVar = list.get(i3);
            if (i2 <= aVar.f31142a) {
                arrayList.add(a.a(i, i2));
                i = aVar.f31142a;
                i2 = aVar.b;
            } else if (i2 < aVar.b) {
                i2 = aVar.b;
            }
        }
        if (i != i2) {
            arrayList.add(a.a(i, i2));
        }
        return arrayList;
    }

    private int a(List<a> list, List<a> list2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea6d57bd", new Object[]{this, list, list2, new Boolean(z)})).intValue();
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            a aVar = list.get(i5);
            if (i4 <= aVar.f31142a) {
                i = (i + i2) - a(i3, i4, list2, z);
                int i6 = aVar.f31142a;
                int i7 = aVar.b;
                int i8 = i7 - i6;
                i3 = i6;
                i2 = i8;
                i4 = i7;
            } else if (i4 < aVar.b) {
                int i9 = aVar.b;
                i4 = i9;
                i2 = i9 - i3;
            }
        }
        return (i + i2) - a(i3, i4, list2, z);
    }

    private int a(int i, int i2, List<a> list, boolean z) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27595a2e", new Object[]{this, new Integer(i), new Integer(i2), list, new Boolean(z)})).intValue();
        }
        if (z && list != null) {
            for (a aVar : list) {
                if (aVar.b >= i) {
                    if (i2 < aVar.f31142a) {
                        break;
                    }
                    i3 += Math.min(aVar.b, i2) - Math.max(aVar.f31142a, i);
                }
            }
        }
        return i3;
    }

    private void b(List<mns> list, List<a> list2, List<a> list3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc8b4ebc", new Object[]{this, list, list2, list3});
            return;
        }
        if (list != null) {
            for (mns mnsVar : list) {
                mnsVar.a();
            }
            list.clear();
        }
        b(list2);
        b(list3);
    }

    private void b(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else if (list != null) {
            for (a aVar : list) {
                aVar.a();
            }
            list.clear();
        }
    }

    /* loaded from: classes7.dex */
    public static class a implements Comparable<a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static Queue<a> c = new LinkedList();

        /* renamed from: a  reason: collision with root package name */
        public int f31142a;
        public int b;

        @Override // java.lang.Comparable
        public /* synthetic */ int compareTo(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, aVar})).intValue() : a(aVar);
        }

        public static a a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e58983f1", new Object[]{new Integer(i), new Integer(i2)});
            }
            a poll = c.poll();
            if (poll == null) {
                poll = new a();
            }
            poll.f31142a = i;
            poll.b = i2;
            return poll;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            if (c.size() < 100) {
                c.add(this);
            }
            this.f31142a = 0;
            this.b = 0;
        }

        public int a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1c4bbffe", new Object[]{this, aVar})).intValue();
            }
            int i = this.f31142a;
            int i2 = aVar.f31142a;
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 0 : -1;
        }
    }
}
