package okio;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes9.dex */
public final class f extends AbstractList<ByteString> implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    final ByteString[] f25055a;
    final int[] b;

    private f(ByteString[] byteStringArr, int[] iArr) {
        this.f25055a = byteStringArr;
        this.b = iArr;
    }

    private static int a(b bVar) {
        return (int) (bVar.a() / 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bb, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static okio.f a(okio.ByteString... r10) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.f.a(okio.ByteString[]):okio.f");
    }

    private static void a(long j, b bVar, int i, List<ByteString> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        int i6;
        b bVar2;
        int i7 = i2;
        if (i7 < i3) {
            for (int i8 = i7; i8 < i3; i8++) {
                if (list.get(i8).size() < i) {
                    throw new AssertionError();
                }
            }
            ByteString byteString = list.get(i2);
            ByteString byteString2 = list.get(i3 - 1);
            int i9 = -1;
            if (i == byteString.size()) {
                i9 = list2.get(i7).intValue();
                i7++;
                byteString = list.get(i7);
            }
            int i10 = i7;
            if (byteString.getByte(i) == byteString2.getByte(i)) {
                int min = Math.min(byteString.size(), byteString2.size());
                int i11 = 0;
                for (int i12 = i; i12 < min && byteString.getByte(i12) == byteString2.getByte(i12); i12++) {
                    i11++;
                }
                long a2 = 1 + j + a(bVar) + 2 + i11;
                bVar.b(-i11);
                bVar.b(i9);
                int i13 = i;
                while (true) {
                    i4 = i + i11;
                    if (i13 >= i4) {
                        break;
                    }
                    bVar.b(byteString.getByte(i13) & 255);
                    i13++;
                }
                if (i10 + 1 == i3) {
                    if (i4 != list.get(i10).size()) {
                        throw new AssertionError();
                    }
                    bVar.b(list2.get(i10).intValue());
                    return;
                }
                b bVar3 = new b();
                bVar.b((int) ((a(bVar3) + a2) * (-1)));
                a(a2, bVar3, i4, list, i10, i3, list2);
                bVar.a(bVar3, bVar3.a());
                return;
            }
            int i14 = 1;
            for (int i15 = i10 + 1; i15 < i3; i15++) {
                if (list.get(i15 - 1).getByte(i) != list.get(i15).getByte(i)) {
                    i14++;
                }
            }
            long a3 = j + a(bVar) + 2 + (i14 << 1);
            bVar.b(i14);
            bVar.b(i9);
            for (int i16 = i10; i16 < i3; i16++) {
                byte b = list.get(i16).getByte(i);
                if (i16 == i10 || b != list.get(i16 - 1).getByte(i)) {
                    bVar.b(b & 255);
                }
            }
            b bVar4 = new b();
            int i17 = i10;
            while (i17 < i3) {
                byte b2 = list.get(i17).getByte(i);
                int i18 = i17 + 1;
                int i19 = i18;
                while (true) {
                    if (i19 >= i3) {
                        i5 = i3;
                        break;
                    } else if (b2 != list.get(i19).getByte(i)) {
                        i5 = i19;
                        break;
                    } else {
                        i19++;
                    }
                }
                if (i18 == i5 && i + 1 == list.get(i17).size()) {
                    bVar.b(list2.get(i17).intValue());
                    i6 = i5;
                    bVar2 = bVar4;
                } else {
                    bVar.b((int) ((a(bVar4) + a3) * (-1)));
                    i6 = i5;
                    bVar2 = bVar4;
                    a(a3, bVar4, i + 1, list, i17, i5, list2);
                }
                bVar4 = bVar2;
                i17 = i6;
            }
            b bVar5 = bVar4;
            bVar.a(bVar5, bVar5.a());
            return;
        }
        throw new AssertionError();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public ByteString get(int i) {
        return this.f25055a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25055a.length;
    }
}
