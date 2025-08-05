package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/jvm/internal/ArrayCharIterator;", "Lkotlin/collections/CharIterator;", "array", "", "([C)V", "index", "", "hasNext", "", "nextChar", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class c extends kotlin.collections.o {

    /* renamed from: a  reason: collision with root package name */
    private int f24938a;
    private final char[] b;

    public c(char[] array) {
        q.d(array, "array");
        this.b = array;
    }

    @Override // kotlin.collections.o
    public char b() {
        try {
            char[] cArr = this.b;
            int i = this.f24938a;
            this.f24938a = i + 1;
            return cArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f24938a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24938a < this.b.length;
    }
}
