package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.aa;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/jvm/internal/ArrayDoubleIterator;", "Lkotlin/collections/DoubleIterator;", "array", "", "([D)V", "index", "", "hasNext", "", "nextDouble", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class d extends aa {

    /* renamed from: a  reason: collision with root package name */
    private int f24939a;
    private final double[] b;

    public d(double[] array) {
        q.d(array, "array");
        this.b = array;
    }

    @Override // kotlin.collections.aa
    public double b() {
        try {
            double[] dArr = this.b;
            int i = this.f24939a;
            this.f24939a = i + 1;
            return dArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f24939a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24939a < this.b.length;
    }
}
