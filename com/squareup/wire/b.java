package com.squareup.wire;

import com.squareup.wire.g;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes4.dex */
final class b<E extends g> {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<g> f8126a = new Comparator<g>() { // from class: com.squareup.wire.b.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(g gVar, g gVar2) {
            return gVar.getValue() - gVar2.getValue();
        }
    };
    private final Class<E> b;
    private final int[] c;
    private final E[] d;
    private final boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Class<E> cls) {
        this.b = cls;
        this.d = cls.getEnumConstants();
        Arrays.sort(this.d, f8126a);
        E[] eArr = this.d;
        int length = eArr.length;
        if (eArr[0].getValue() == 1 && this.d[length - 1].getValue() == length) {
            this.e = true;
            this.c = null;
            return;
        }
        this.e = false;
        this.c = new int[length];
        for (int i = 0; i < length; i++) {
            this.c[i] = this.d[i].getValue();
        }
    }

    public int a(E e) {
        return e.getValue();
    }

    public E a(int i) {
        try {
            return this.d[this.e ? i - 1 : Arrays.binarySearch(this.c, i)];
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("Unknown enum tag " + i + " for " + this.b.getCanonicalName());
        }
    }
}
