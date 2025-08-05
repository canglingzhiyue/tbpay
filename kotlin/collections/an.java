package kotlin.collections;

import com.alibaba.android.bindingx.core.internal.BindingXConstants;
import com.taobao.search.common.util.k;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import tb.nom;
import tb.rwf;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001d\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\u0013\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00020\u0006J\u0016\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0096\u0002J\u000e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0006J\u0015\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0014¢\u0006\u0002\u0010#J'\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00010\t\"\u0004\b\u0001\u0010\u00012\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00010\tH\u0014¢\u0006\u0002\u0010%J\u0015\u0010&\u001a\u00020\u0006*\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0082\bR\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lkotlin/collections/RingBuffer;", "T", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "capacity", "", "(I)V", com.taobao.android.weex_framework.util.a.ATOM_EXT_buffer, "", "", "filledSize", "([Ljava/lang/Object;I)V", "[Ljava/lang/Object;", "<set-?>", "size", "getSize", "()I", k.a.PARAM_KEY_LIST_START_INDEX, "add", "", BindingXConstants.KEY_ELEMENT, "(Ljava/lang/Object;)V", com.alibaba.triver.triver_shop.newShop.ext.g.KEY_HEADER_EXPANDED, "maxCapacity", "get", "index", "(I)Ljava/lang/Object;", nom.KEY_IS_FULL, "", com.taobao.android.weex_framework.util.a.ATOM_EXT_iterator, "", "removeFirst", "n", "toArray", "()[Ljava/lang/Object;", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "forward", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class an<T> extends d<T> implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    private final int f24905a;
    private int b;
    private int c;
    private final Object[] d;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0005\u001a\u00020\u0006H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"kotlin/collections/RingBuffer$iterator$1", "Lkotlin/collections/AbstractIterator;", "count", "", "index", "computeNext", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class a extends b<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ an<T> f24906a;
        private int b;
        private int c;

        a(an<T> anVar) {
            this.f24906a = anVar;
            this.b = anVar.size();
            this.c = ((an) anVar).b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.collections.b
        protected void a() {
            if (this.b == 0) {
                b();
                return;
            }
            a(((an) this.f24906a).d[this.c]);
            this.c = (this.c + 1) % ((an) this.f24906a).f24905a;
            this.b--;
        }
    }

    public an(int i) {
        this(new Object[i], 0);
    }

    public an(Object[] buffer, int i) {
        kotlin.jvm.internal.q.d(buffer, "buffer");
        this.d = buffer;
        boolean z = true;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i).toString());
        }
        if (i > this.d.length ? false : z) {
            this.f24905a = this.d.length;
            this.c = i;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + this.d.length).toString());
    }

    @Override // kotlin.collections.d, kotlin.collections.a
    public int a() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final an<T> a(int i) {
        Object[] array;
        int i2 = this.f24905a;
        int d = rwf.d(i2 + (i2 >> 1) + 1, i);
        if (this.b == 0) {
            array = Arrays.copyOf(this.d, d);
            kotlin.jvm.internal.q.b(array, "copyOf(...)");
        } else {
            array = toArray(new Object[d]);
        }
        return new an<>(array, size());
    }

    public final void a(T t) {
        if (!b()) {
            this.d[(this.b + size()) % this.f24905a] = t;
            this.c = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    public final void b(int i) {
        boolean z = true;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i).toString());
        }
        if (i > size()) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + size()).toString());
        } else if (i <= 0) {
        } else {
            int i2 = this.b;
            int i3 = (i2 + i) % this.f24905a;
            if (i2 > i3) {
                g.a(this.d, (Object) null, i2, this.f24905a);
                g.a(this.d, (Object) null, 0, i3);
            } else {
                g.a(this.d, (Object) null, i2, i3);
            }
            this.b = i3;
            this.c = size() - i;
        }
    }

    public final boolean b() {
        return size() == this.f24905a;
    }

    @Override // kotlin.collections.d, java.util.List
    /* renamed from: get */
    public T mo2402get(int i) {
        d.Companion.a(i, size());
        return (T) this.d[(this.b + i) % this.f24905a];
    }

    @Override // kotlin.collections.d, kotlin.collections.a, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.a, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // kotlin.collections.a, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.q.d(array, "array");
        int length = array.length;
        T[] tArr = array;
        if (length < size()) {
            T[] tArr2 = (T[]) Arrays.copyOf(array, size());
            kotlin.jvm.internal.q.b(tArr2, "copyOf(...)");
            tArr = tArr2;
        }
        int size = size();
        int i = 0;
        int i2 = 0;
        for (int i3 = this.b; i2 < size && i3 < this.f24905a; i3++) {
            tArr[i2] = this.d[i3];
            i2++;
        }
        while (i2 < size) {
            tArr[i2] = this.d[i];
            i2++;
            i++;
        }
        return (T[]) p.a(size, tArr);
    }
}
