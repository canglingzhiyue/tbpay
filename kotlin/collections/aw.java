package kotlin.collections;

import com.alibaba.android.bindingx.core.internal.BindingXConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import tb.ivx;
import tb.rwf;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b&\b\u0007\u0018\u0000 [*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001[B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0007\b\u0016¢\u0006\u0002\u0010\u0006B\u0015\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u001d\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0016\u0010\u001a\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0013\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u0016\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0016J\u001e\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004H\u0002J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0004H\u0002J\u001d\u0010'\u001a\u00020\u00142\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140)H\u0082\bJ\u000b\u0010*\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010,\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0016\u0010-\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0015\u00100\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\u0016\u00102\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u0004H\u0083\b¢\u0006\u0002\u0010.J\u0011\u0010!\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0083\bJM\u00103\u001a\u00020\u00172>\u00104\u001a:\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(\u000e\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u001705H\u0000¢\u0006\u0002\b8J\b\u00109\u001a\u00020\u0014H\u0016J\u000b\u0010:\u001a\u00028\u0000¢\u0006\u0002\u0010+J\u0015\u0010;\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\r\u0010<\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0010\u0010=\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0018\u0010>\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u0004H\u0002J\u0010\u0010A\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\b\u0010B\u001a\u00020\u0017H\u0002J\u0015\u0010C\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u0016\u0010D\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0015\u0010E\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010.J\u000b\u0010F\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010G\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u000b\u0010H\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010I\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0018\u0010J\u001a\u00020\u00172\u0006\u0010K\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u0004H\u0014J\u0018\u0010M\u001a\u00020\u00172\u0006\u0010K\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u0004H\u0002J\u0018\u0010N\u001a\u00020\u00172\u0006\u0010K\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u0004H\u0002J\u0016\u0010O\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u001e\u0010P\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010QJ\u001d\u0010R\u001a\u00020\u00172\u0006\u0010K\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u0004H\u0000¢\u0006\u0002\bSJ\u0017\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0000¢\u0006\u0004\bU\u0010VJ)\u0010T\u001a\b\u0012\u0004\u0012\u0002HW0\u000b\"\u0004\b\u0001\u0010W2\f\u0010X\u001a\b\u0012\u0004\u0012\u0002HW0\u000bH\u0000¢\u0006\u0004\bU\u0010YJ\u0015\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0002\u0010VJ'\u0010Z\u001a\b\u0012\u0004\u0012\u0002HW0\u000b\"\u0004\b\u0001\u0010W2\f\u0010X\u001a\b\u0012\u0004\u0012\u0002HW0\u000bH\u0016¢\u0006\u0002\u0010YR\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\\"}, d2 = {"Lkotlin/collections/ArrayDeque;", "E", "Lkotlin/collections/AbstractMutableList;", "initialCapacity", "", "(I)V", "()V", "elements", "", "(Ljava/util/Collection;)V", "elementData", "", "", "[Ljava/lang/Object;", ivx.IMAGE_TYPE_HEAD, "<set-?>", "size", "getSize", "()I", "add", "", BindingXConstants.KEY_ELEMENT, "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "addFirst", "(Ljava/lang/Object;)V", "addLast", com.taobao.android.weex_framework.util.a.ATOM_EXT_clear, "contains", "copyCollectionElements", "internalIndex", "copyElements", "newCapacity", "decremented", "ensureCapacity", "minCapacity", "filterInPlace", "predicate", "Lkotlin/Function1;", "first", "()Ljava/lang/Object;", "firstOrNull", "get", "(I)Ljava/lang/Object;", "incremented", com.taobao.android.weex_framework.util.a.ATOM_EXT_indexOf, "(Ljava/lang/Object;)I", "internalGet", "internalStructure", "structure", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "internalStructure$kotlin_stdlib", "isEmpty", com.taobao.android.weex_framework.util.a.ATOM_EXT_last, com.taobao.android.weex_framework.util.a.ATOM_EXT_lastIndexOf, "lastOrNull", "negativeMod", "nullifyNonEmpty", "internalFromIndex", "internalToIndex", "positiveMod", "registerModification", "remove", "removeAll", "removeAt", "removeFirst", "removeFirstOrNull", "removeLast", "removeLastOrNull", "removeRange", "fromIndex", "toIndex", "removeRangeShiftPreceding", "removeRangeShiftSucceeding", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "testRemoveRange", "testRemoveRange$kotlin_stdlib", "testToArray", "testToArray$kotlin_stdlib", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toArray", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class aw<E> extends au<E> {
    public static final a Companion = new a(null);
    private static final Object[] d = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    private int f24907a;
    private Object[] b = d;
    private int c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/collections/ArrayDeque$Companion;", "", "()V", "defaultMinCapacity", "", "emptyElementData", "", "[Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    private final void a(int i) {
        if (i >= 0) {
            Object[] objArr = this.b;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == d) {
                this.b = new Object[rwf.c(i, 10)];
                return;
            } else {
                b(d.Companion.c(this.b.length, i));
                return;
            }
        }
        throw new IllegalStateException("Deque is too big.");
    }

    private final void a(int i, int i2) {
        int c = c(this.f24907a + (i - 1));
        int c2 = c(this.f24907a + (i2 - 1));
        while (i > 0) {
            int i3 = c + 1;
            int min = Math.min(i, Math.min(i3, c2 + 1));
            Object[] objArr = this.b;
            int i4 = c2 - min;
            int i5 = c - min;
            g.a(objArr, objArr, i4 + 1, i5 + 1, i3);
            c = d(i5);
            c2 = d(i4);
            i -= min;
        }
    }

    private final void a(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.f24907a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c = size() + collection.size();
    }

    private final void b(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.b;
        g.a(objArr2, objArr, 0, this.f24907a, objArr2.length);
        Object[] objArr3 = this.b;
        int length = objArr3.length;
        int i2 = this.f24907a;
        g.a(objArr3, objArr, length - i2, 0, i2);
        this.f24907a = 0;
        this.b = objArr;
    }

    private final void b(int i, int i2) {
        int c = c(this.f24907a + i2);
        int c2 = c(this.f24907a + i);
        int size = size();
        while (true) {
            size -= i2;
            if (size > 0) {
                Object[] objArr = this.b;
                i2 = Math.min(size, Math.min(objArr.length - c, objArr.length - c2));
                Object[] objArr2 = this.b;
                int i3 = c + i2;
                g.a(objArr2, objArr2, c2, c, i3);
                c = c(i3);
                c2 = c(c2 + i2);
            } else {
                return;
            }
        }
    }

    private final int c(int i) {
        Object[] objArr = this.b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    private final void c(int i, int i2) {
        if (i < i2) {
            g.a(this.b, (Object) null, i, i2);
            return;
        }
        Object[] objArr = this.b;
        g.a(objArr, (Object) null, i, objArr.length);
        g.a(this.b, (Object) null, 0, i2);
    }

    private final int d(int i) {
        return i < 0 ? i + this.b.length : i;
    }

    private final int e(int i) {
        if (i == g.g(this.b)) {
            return 0;
        }
        return i + 1;
    }

    private final void e() {
        this.modCount++;
    }

    private final int f(int i) {
        return i == 0 ? g.g(this.b) : i - 1;
    }

    public final E a() {
        if (!isEmpty()) {
            return (E) this.b[c(this.f24907a + p.a((List) this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final void a(E e) {
        e();
        a(size() + 1);
        this.f24907a = f(this.f24907a);
        this.b[this.f24907a] = e;
        this.c = size() + 1;
    }

    @Override // kotlin.collections.au, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        d.Companion.b(i, size());
        if (i == size()) {
            b((aw<E>) e);
        } else if (i == 0) {
            a((aw<E>) e);
        } else {
            e();
            a(size() + 1);
            int c = c(this.f24907a + i);
            if (i < ((size() + 1) >> 1)) {
                int f = f(c);
                int f2 = f(this.f24907a);
                int i2 = this.f24907a;
                if (f >= i2) {
                    Object[] objArr = this.b;
                    objArr[f2] = objArr[i2];
                    g.a(objArr, objArr, i2, i2 + 1, f + 1);
                } else {
                    Object[] objArr2 = this.b;
                    g.a(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                    Object[] objArr3 = this.b;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    g.a(objArr3, objArr3, 0, 1, f + 1);
                }
                this.b[f] = e;
                this.f24907a = f2;
            } else {
                int c2 = c(this.f24907a + size());
                if (c < c2) {
                    Object[] objArr4 = this.b;
                    g.a(objArr4, objArr4, c + 1, c, c2);
                } else {
                    Object[] objArr5 = this.b;
                    g.a(objArr5, objArr5, 1, 0, c2);
                    Object[] objArr6 = this.b;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    g.a(objArr6, objArr6, c + 1, c, objArr6.length - 1);
                }
                this.b[c] = e;
            }
            this.c = size() + 1;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        b((aw<E>) e);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> elements) {
        kotlin.jvm.internal.q.d(elements, "elements");
        d.Companion.b(i, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(elements);
        }
        e();
        a(size() + elements.size());
        int c = c(this.f24907a + size());
        int c2 = c(this.f24907a + i);
        int size = elements.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.f24907a;
            int i3 = i2 - size;
            if (c2 < i2) {
                Object[] objArr = this.b;
                g.a(objArr, objArr, i3, i2, objArr.length);
                if (size >= c2) {
                    Object[] objArr2 = this.b;
                    g.a(objArr2, objArr2, objArr2.length - size, 0, c2);
                } else {
                    Object[] objArr3 = this.b;
                    g.a(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.b;
                    g.a(objArr4, objArr4, 0, size, c2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.b;
                g.a(objArr5, objArr5, i3, i2, c2);
            } else {
                Object[] objArr6 = this.b;
                i3 += objArr6.length;
                int i4 = c2 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    g.a(objArr6, objArr6, i3, i2, c2);
                } else {
                    g.a(objArr6, objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.b;
                    g.a(objArr7, objArr7, 0, this.f24907a + length, c2);
                }
            }
            this.f24907a = i3;
            a(d(c2 - size), elements);
        } else {
            int i5 = c2 + size;
            if (c2 < c) {
                int i6 = size + c;
                Object[] objArr8 = this.b;
                if (i6 > objArr8.length) {
                    if (i5 >= objArr8.length) {
                        i5 -= objArr8.length;
                    } else {
                        int length2 = c - (i6 - objArr8.length);
                        g.a(objArr8, objArr8, 0, length2, c);
                        Object[] objArr9 = this.b;
                        g.a(objArr9, objArr9, i5, c2, length2);
                    }
                }
                g.a(objArr8, objArr8, i5, c2, c);
            } else {
                Object[] objArr10 = this.b;
                g.a(objArr10, objArr10, size, 0, c);
                Object[] objArr11 = this.b;
                if (i5 >= objArr11.length) {
                    g.a(objArr11, objArr11, i5 - objArr11.length, c2, objArr11.length);
                } else {
                    g.a(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.b;
                    g.a(objArr12, objArr12, i5, c2, objArr12.length - size);
                }
            }
            a(c2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        kotlin.jvm.internal.q.d(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        e();
        a(size() + elements.size());
        a(c(this.f24907a + size()), elements);
        return true;
    }

    public final E b() {
        if (!isEmpty()) {
            e();
            Object[] objArr = this.b;
            int i = this.f24907a;
            E e = (E) objArr[i];
            objArr[i] = null;
            this.f24907a = e(i);
            this.c = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final void b(E e) {
        e();
        a(size() + 1);
        this.b[c(this.f24907a + size())] = e;
        this.c = size() + 1;
    }

    public final E c() {
        if (!isEmpty()) {
            e();
            int c = c(this.f24907a + p.a((List) this));
            Object[] objArr = this.b;
            E e = (E) objArr[c];
            objArr[c] = null;
            this.c = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            e();
            c(this.f24907a, c(this.f24907a + size()));
        }
        this.f24907a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        d.Companion.a(i, size());
        return (E) this.b[c(this.f24907a + i)];
    }

    @Override // kotlin.collections.au
    public int getSize() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int c = c(this.f24907a + size());
        int i = this.f24907a;
        if (i < c) {
            while (i < c) {
                if (!kotlin.jvm.internal.q.a(obj, this.b[i])) {
                    i++;
                }
            }
            return -1;
        } else if (i < c) {
            return -1;
        } else {
            int length = this.b.length;
            while (true) {
                if (i >= length) {
                    for (int i2 = 0; i2 < c; i2++) {
                        if (kotlin.jvm.internal.q.a(obj, this.b[i2])) {
                            i = i2 + this.b.length;
                        }
                    }
                    return -1;
                } else if (kotlin.jvm.internal.q.a(obj, this.b[i])) {
                    break;
                } else {
                    i++;
                }
            }
        }
        return i - this.f24907a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int g;
        int c = c(this.f24907a + size());
        int i = this.f24907a;
        if (i < c) {
            g = c - 1;
            if (i > g) {
                return -1;
            }
            while (!kotlin.jvm.internal.q.a(obj, this.b[g])) {
                if (g == i) {
                    return -1;
                }
                g--;
            }
        } else if (i <= c) {
            return -1;
        } else {
            int i2 = c - 1;
            while (true) {
                if (i2 < 0) {
                    g = g.g(this.b);
                    int i3 = this.f24907a;
                    if (i3 > g) {
                        return -1;
                    }
                    while (!kotlin.jvm.internal.q.a(obj, this.b[g])) {
                        if (g == i3) {
                            return -1;
                        }
                        g--;
                    }
                } else if (kotlin.jvm.internal.q.a(obj, this.b[i2])) {
                    g = i2 + this.b.length;
                    break;
                } else {
                    i2--;
                }
            }
        }
        return g - this.f24907a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        int i;
        boolean z;
        kotlin.jvm.internal.q.d(elements, "elements");
        if (!isEmpty()) {
            if (!(this.b.length == 0)) {
                int c = c(this.f24907a + size());
                int i2 = this.f24907a;
                if (i2 < c) {
                    i = i2;
                    z = false;
                    while (i2 < c) {
                        Object obj = this.b[i2];
                        if (!elements.contains(obj)) {
                            this.b[i] = obj;
                            i++;
                        } else {
                            z = true;
                        }
                        i2++;
                    }
                    g.a(this.b, (Object) null, i, c);
                } else {
                    int length = this.b.length;
                    int i3 = i2;
                    boolean z2 = false;
                    while (i2 < length) {
                        Object[] objArr = this.b;
                        Object obj2 = objArr[i2];
                        objArr[i2] = null;
                        if (!elements.contains(obj2)) {
                            this.b[i3] = obj2;
                            i3++;
                        } else {
                            z2 = true;
                        }
                        i2++;
                    }
                    int c2 = c(i3);
                    for (int i4 = 0; i4 < c; i4++) {
                        Object[] objArr2 = this.b;
                        Object obj3 = objArr2[i4];
                        objArr2[i4] = null;
                        if (!elements.contains(obj3)) {
                            this.b[c2] = obj3;
                            c2 = e(c2);
                        } else {
                            z2 = true;
                        }
                    }
                    i = c2;
                    z = z2;
                }
                if (z) {
                    e();
                    this.c = d(i - this.f24907a);
                }
                return z;
            }
        }
        return false;
    }

    @Override // kotlin.collections.au
    public E removeAt(int i) {
        d.Companion.a(i, size());
        aw<E> awVar = this;
        if (i == p.a((List) awVar)) {
            return c();
        }
        if (i == 0) {
            return b();
        }
        e();
        int c = c(this.f24907a + i);
        E e = (E) this.b[c];
        if (i < (size() >> 1)) {
            int i2 = this.f24907a;
            if (c >= i2) {
                Object[] objArr = this.b;
                g.a(objArr, objArr, i2 + 1, i2, c);
            } else {
                Object[] objArr2 = this.b;
                g.a(objArr2, objArr2, 1, 0, c);
                Object[] objArr3 = this.b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.f24907a;
                g.a(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.b;
            int i4 = this.f24907a;
            objArr4[i4] = null;
            this.f24907a = e(i4);
        } else {
            int c2 = c(this.f24907a + p.a((List) awVar));
            if (c <= c2) {
                Object[] objArr5 = this.b;
                g.a(objArr5, objArr5, c, c + 1, c2 + 1);
            } else {
                Object[] objArr6 = this.b;
                g.a(objArr6, objArr6, c, c + 1, objArr6.length);
                Object[] objArr7 = this.b;
                objArr7[objArr7.length - 1] = objArr7[0];
                g.a(objArr7, objArr7, 0, 1, c2 + 1);
            }
            this.b[c2] = null;
        }
        this.c = size() - 1;
        return e;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        d.Companion.a(i, i2, size());
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == size()) {
            clear();
        } else if (i3 == 1) {
            remove(i);
        } else {
            e();
            if (i < size() - i2) {
                a(i, i2);
                int c = c(this.f24907a + i3);
                c(this.f24907a, c);
                this.f24907a = c;
            } else {
                b(i, i2);
                int c2 = c(this.f24907a + size());
                c(d(c2 - i3), c2);
            }
            this.c = size() - i3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        int i;
        boolean z;
        kotlin.jvm.internal.q.d(elements, "elements");
        if (!isEmpty()) {
            if (!(this.b.length == 0)) {
                int c = c(this.f24907a + size());
                int i2 = this.f24907a;
                if (i2 < c) {
                    i = i2;
                    z = false;
                    while (i2 < c) {
                        Object obj = this.b[i2];
                        if (elements.contains(obj)) {
                            this.b[i] = obj;
                            i++;
                        } else {
                            z = true;
                        }
                        i2++;
                    }
                    g.a(this.b, (Object) null, i, c);
                } else {
                    int length = this.b.length;
                    int i3 = i2;
                    boolean z2 = false;
                    while (i2 < length) {
                        Object[] objArr = this.b;
                        Object obj2 = objArr[i2];
                        objArr[i2] = null;
                        if (elements.contains(obj2)) {
                            this.b[i3] = obj2;
                            i3++;
                        } else {
                            z2 = true;
                        }
                        i2++;
                    }
                    int c2 = c(i3);
                    for (int i4 = 0; i4 < c; i4++) {
                        Object[] objArr2 = this.b;
                        Object obj3 = objArr2[i4];
                        objArr2[i4] = null;
                        if (elements.contains(obj3)) {
                            this.b[c2] = obj3;
                            c2 = e(c2);
                        } else {
                            z2 = true;
                        }
                    }
                    i = c2;
                    z = z2;
                }
                if (z) {
                    e();
                    this.c = d(i - this.f24907a);
                }
                return z;
            }
        }
        return false;
    }

    @Override // kotlin.collections.au, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        d.Companion.a(i, size());
        int c = c(this.f24907a + i);
        Object[] objArr = this.b;
        E e2 = (E) objArr[c];
        objArr[c] = e;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.q.d(array, "array");
        if (array.length < size()) {
            array = (T[]) g.d(array, size());
        }
        int c = c(this.f24907a + size());
        int i = this.f24907a;
        if (i < c) {
            g.a(this.b, array, 0, i, c, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.b;
            g.a(objArr, array, 0, this.f24907a, objArr.length);
            Object[] objArr2 = this.b;
            g.a(objArr2, array, objArr2.length - this.f24907a, 0, c);
        }
        return (T[]) p.a(size(), array);
    }
}
