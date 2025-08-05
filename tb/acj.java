package tb;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public class acj {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<e> f25237a = new Comparator<e>() { // from class: tb.acj.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(e eVar, e eVar2) {
            int i = eVar.f25242a - eVar2.f25242a;
            return i == 0 ? eVar.b - eVar2.b : i;
        }
    };

    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<e> f25238a;
        private final int[] b;
        private final int[] c;
        private final a d;
        private final int e;
        private final int f;
        private final boolean g;

        b(a aVar, List<e> list, int[] iArr, int[] iArr2, boolean z) {
            this.f25238a = list;
            this.b = iArr;
            this.c = iArr2;
            Arrays.fill(this.b, 0);
            Arrays.fill(this.c, 0);
            this.d = aVar;
            this.e = aVar.getOldListSize();
            this.f = aVar.getNewListSize();
            this.g = z;
            a();
            b();
        }

        private static c a(List<c> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                c cVar = list.get(size);
                if (cVar.f25240a == i && cVar.c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).b += z ? 1 : -1;
                        size++;
                    }
                    return cVar;
                }
                size--;
            }
            return null;
        }

        private void a() {
            e eVar = this.f25238a.isEmpty() ? null : this.f25238a.get(0);
            if (eVar != null && eVar.f25242a == 0 && eVar.b == 0) {
                return;
            }
            e eVar2 = new e();
            eVar2.f25242a = 0;
            eVar2.b = 0;
            eVar2.d = false;
            eVar2.c = 0;
            eVar2.e = false;
            this.f25238a.add(0, eVar2);
        }

        private void a(int i, int i2, int i3) {
            if (this.b[i - 1] != 0) {
                return;
            }
            a(i, i2, i3, false);
        }

        private void a(List<c> list, ack ackVar, int i, int i2, int i3) {
            if (!this.g) {
                ackVar.onInserted(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.c[i5] & 31;
                if (i6 == 0) {
                    ackVar.onInserted(i, 1);
                    for (c cVar : list) {
                        cVar.b++;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.c[i5] >> 5;
                    ackVar.onMoved(a(list, i7, true).b, i);
                    if (i6 == 4) {
                        ackVar.onChanged(i, 1, this.d.getChangePayload(i7, i5));
                    }
                } else if (i6 != 16) {
                    throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString(i6));
                } else {
                    list.add(new c(i5, i, false));
                }
            }
        }

        private boolean a(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                i2--;
                i4 = i;
                i5 = i2;
            } else {
                i4 = i - 1;
                i5 = i4;
            }
            while (i3 >= 0) {
                e eVar = this.f25238a.get(i3);
                int i6 = eVar.f25242a + eVar.c;
                int i7 = eVar.b + eVar.c;
                int i8 = 8;
                if (z) {
                    for (int i9 = i4 - 1; i9 >= i6; i9--) {
                        if (this.d.areItemsTheSame(i9, i5)) {
                            if (!this.d.areContentsTheSame(i9, i5)) {
                                i8 = 4;
                            }
                            this.c[i5] = (i9 << 5) | 16;
                            this.b[i9] = (i5 << 5) | i8;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i10 = i2 - 1; i10 >= i7; i10--) {
                        if (this.d.areItemsTheSame(i5, i10)) {
                            if (!this.d.areContentsTheSame(i5, i10)) {
                                i8 = 4;
                            }
                            int i11 = i - 1;
                            this.b[i11] = (i10 << 5) | 16;
                            this.c[i10] = (i11 << 5) | i8;
                            return true;
                        }
                    }
                    continue;
                }
                i4 = eVar.f25242a;
                i2 = eVar.b;
                i3--;
            }
            return false;
        }

        private void b() {
            int i = this.e;
            int i2 = this.f;
            for (int size = this.f25238a.size() - 1; size >= 0; size--) {
                e eVar = this.f25238a.get(size);
                int i3 = eVar.f25242a + eVar.c;
                int i4 = eVar.b + eVar.c;
                if (this.g) {
                    while (i > i3) {
                        a(i, i2, size);
                        i--;
                    }
                    while (i2 > i4) {
                        b(i, i2, size);
                        i2--;
                    }
                }
                for (int i5 = 0; i5 < eVar.c; i5++) {
                    int i6 = eVar.f25242a + i5;
                    int i7 = eVar.b + i5;
                    int i8 = this.d.areContentsTheSame(i6, i7) ? 1 : 2;
                    this.b[i6] = (i7 << 5) | i8;
                    this.c[i7] = (i6 << 5) | i8;
                }
                i = eVar.f25242a;
                i2 = eVar.b;
            }
        }

        private void b(int i, int i2, int i3) {
            if (this.c[i2 - 1] != 0) {
                return;
            }
            a(i, i2, i3, true);
        }

        private void b(List<c> list, ack ackVar, int i, int i2, int i3) {
            if (!this.g) {
                ackVar.onRemoved(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.b[i5] & 31;
                if (i6 == 0) {
                    ackVar.onRemoved(i + i4, 1);
                    for (c cVar : list) {
                        cVar.b--;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.b[i5] >> 5;
                    c a2 = a(list, i7, false);
                    ackVar.onMoved(i + i4, a2.b - 1);
                    if (i6 == 4) {
                        ackVar.onChanged(a2.b - 1, 1, this.d.getChangePayload(i5, i7));
                    }
                } else if (i6 != 16) {
                    throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString(i6));
                } else {
                    list.add(new c(i5, i + i4, true));
                }
            }
        }

        public void a(final RecyclerView.Adapter adapter) {
            a(new ack() { // from class: tb.acj.b.1
                @Override // tb.ack
                public void onChanged(int i, int i2, Object obj) {
                    adapter.notifyItemRangeChanged(i, i2, obj);
                }

                @Override // tb.ack
                public void onInserted(int i, int i2) {
                    adapter.notifyItemRangeInserted(i, i2);
                }

                @Override // tb.ack
                public void onMoved(int i, int i2) {
                    adapter.notifyItemMoved(i, i2);
                }

                @Override // tb.ack
                public void onRemoved(int i, int i2) {
                    adapter.notifyItemRangeRemoved(i, i2);
                }
            });
        }

        public void a(ack ackVar) {
            aci aciVar = ackVar instanceof aci ? (aci) ackVar : new aci(ackVar);
            ArrayList arrayList = new ArrayList();
            int i = this.e;
            int i2 = this.f;
            for (int size = this.f25238a.size() - 1; size >= 0; size--) {
                e eVar = this.f25238a.get(size);
                int i3 = eVar.c;
                int i4 = eVar.f25242a + i3;
                int i5 = eVar.b + i3;
                if (i4 < i) {
                    b(arrayList, aciVar, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    a(arrayList, aciVar, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    if ((this.b[eVar.f25242a + i6] & 31) == 2) {
                        aciVar.onChanged(eVar.f25242a + i6, 1, this.d.getChangePayload(eVar.f25242a + i6, eVar.b + i6));
                    }
                }
                i = eVar.f25242a;
                i2 = eVar.b;
            }
            aciVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        int f25240a;
        int b;
        boolean c;

        public c(int i, int i2, boolean z) {
            this.f25240a = i;
            this.b = i2;
            this.c = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        int f25241a;
        int b;
        int c;
        int d;

        public d() {
        }

        public d(int i, int i2, int i3, int i4) {
            this.f25241a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        int f25242a;
        int b;
        int c;
        boolean d;
        boolean e;

        e() {
        }
    }

    public static b a(a aVar) {
        return a(aVar, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.acj.b a(tb.acj.a r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.acj.a(tb.acj$a, boolean):tb.acj$b");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r24[r13 - 1] < r24[r13 + r7]) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ba, code lost:
        if (r25[r13 - 1] < r25[r13 + 1]) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e3 A[LOOP:4: B:52:0x00cf->B:56:0x00e3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ee A[EDGE_INSN: B:88:0x00ee->B:58:0x00ee ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static tb.acj.e a(tb.acj.a r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.acj.a(tb.acj$a, int, int, int, int, int[], int[], int):tb.acj$e");
    }
}
