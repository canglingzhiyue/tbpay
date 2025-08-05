package android.support.v7.widget;

import android.support.v7.widget.c;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    final a f1507a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        c.b a(int i, int i2, int i3, Object obj);

        void a(c.b bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(a aVar) {
        this.f1507a = aVar;
    }

    private void a(List<c.b> list, int i, int i2) {
        c.b bVar = list.get(i);
        c.b bVar2 = list.get(i2);
        int i3 = bVar2.f1479a;
        if (i3 == 1) {
            c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            a(list, i, bVar, i2, bVar2);
        } else if (i3 != 4) {
        } else {
            b(list, i, bVar, i2, bVar2);
        }
    }

    private int b(List<c.b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f1479a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    private void c(List<c.b> list, int i, c.b bVar, int i2, c.b bVar2) {
        int i3 = bVar.d < bVar2.b ? -1 : 0;
        if (bVar.b < bVar2.b) {
            i3++;
        }
        if (bVar2.b <= bVar.b) {
            bVar.b += bVar2.d;
        }
        if (bVar2.b <= bVar.d) {
            bVar.d += bVar2.d;
        }
        bVar2.b += i3;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(List<c.b> list) {
        while (true) {
            int b = b(list);
            if (b != -1) {
                a(list, b, b + 1);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c6, code lost:
        if (r11.d > r13.b) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f6, code lost:
        if (r11.d >= r13.b) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f8, code lost:
        r11.d -= r13.d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void a(java.util.List<android.support.v7.widget.c.b> r9, int r10, android.support.v7.widget.c.b r11, int r12, android.support.v7.widget.c.b r13) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.t.a(java.util.List, int, android.support.v7.widget.c$b, int, android.support.v7.widget.c$b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void b(java.util.List<android.support.v7.widget.c.b> r8, int r9, android.support.v7.widget.c.b r10, int r11, android.support.v7.widget.c.b r12) {
        /*
            r7 = this;
            int r0 = r10.d
            int r1 = r12.b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto Lf
            int r0 = r12.b
            int r0 = r0 - r4
            r12.b = r0
            goto L28
        Lf:
            int r0 = r10.d
            int r1 = r12.b
            int r5 = r12.d
            int r1 = r1 + r5
            if (r0 >= r1) goto L28
            int r0 = r12.d
            int r0 = r0 - r4
            r12.d = r0
            android.support.v7.widget.t$a r0 = r7.f1507a
            int r1 = r10.b
            java.lang.Object r5 = r12.c
            android.support.v7.widget.c$b r0 = r0.a(r2, r1, r4, r5)
            goto L29
        L28:
            r0 = r3
        L29:
            int r1 = r10.b
            int r5 = r12.b
            if (r1 > r5) goto L35
            int r1 = r12.b
            int r1 = r1 + r4
            r12.b = r1
            goto L56
        L35:
            int r1 = r10.b
            int r5 = r12.b
            int r6 = r12.d
            int r5 = r5 + r6
            if (r1 >= r5) goto L56
            int r1 = r12.b
            int r3 = r12.d
            int r1 = r1 + r3
            int r3 = r10.b
            int r1 = r1 - r3
            android.support.v7.widget.t$a r3 = r7.f1507a
            int r5 = r10.b
            int r5 = r5 + r4
            java.lang.Object r4 = r12.c
            android.support.v7.widget.c$b r3 = r3.a(r2, r5, r1, r4)
            int r2 = r12.d
            int r2 = r2 - r1
            r12.d = r2
        L56:
            r8.set(r11, r10)
            int r10 = r12.d
            if (r10 <= 0) goto L61
            r8.set(r9, r12)
            goto L69
        L61:
            r8.remove(r9)
            android.support.v7.widget.t$a r10 = r7.f1507a
            r10.a(r12)
        L69:
            if (r0 == 0) goto L6e
            r8.add(r9, r0)
        L6e:
            if (r3 == 0) goto L73
            r8.add(r9, r3)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.t.b(java.util.List, int, android.support.v7.widget.c$b, int, android.support.v7.widget.c$b):void");
    }
}
