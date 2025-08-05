package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.collections.aa;
import kotlin.collections.ac;
import kotlin.collections.ae;
import kotlin.collections.af;
import kotlin.collections.as;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007\u001a\u000e\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\t\u001a\u000e\u0010\u0000\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000b\u001a\u000e\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\r\u001a\u000e\u0010\u0000\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000f\u001a\u000e\u0010\u0000\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0011¨\u0006\u0012"}, d2 = {com.taobao.android.weex_framework.util.a.ATOM_EXT_iterator, "Lkotlin/collections/BooleanIterator;", "array", "", "Lkotlin/collections/ByteIterator;", "", "Lkotlin/collections/CharIterator;", "", "Lkotlin/collections/DoubleIterator;", "", "Lkotlin/collections/FloatIterator;", "", "Lkotlin/collections/IntIterator;", "", "Lkotlin/collections/LongIterator;", "", "Lkotlin/collections/ShortIterator;", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class i {
    public static final aa a(double[] array) {
        q.d(array, "array");
        return new d(array);
    }

    public static final ac a(float[] array) {
        q.d(array, "array");
        return new e(array);
    }

    public static final ae a(int[] array) {
        q.d(array, "array");
        return new f(array);
    }

    public static final af a(long[] array) {
        q.d(array, "array");
        return new j(array);
    }

    public static final as a(short[] array) {
        q.d(array, "array");
        return new k(array);
    }

    public static final kotlin.collections.m a(boolean[] array) {
        q.d(array, "array");
        return new a(array);
    }

    public static final kotlin.collections.n a(byte[] array) {
        q.d(array, "array");
        return new b(array);
    }

    public static final kotlin.collections.o a(char[] array) {
        q.d(array, "array");
        return new c(array);
    }
}
