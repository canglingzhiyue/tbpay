package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import tb.ruw;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", com.taobao.android.weex_framework.util.a.ATOM_EXT_buffer, "gap", "$this$iterator", com.taobao.android.weex_framework.util.a.ATOM_EXT_buffer, "$this$iterator", com.taobao.android.weex_framework.util.a.ATOM_EXT_buffer}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes9.dex */
final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements ruw<kotlin.sequences.f<? super List<? extends T>>, kotlin.coroutines.a<? super kotlin.t>, Object> {
    final /* synthetic */ Iterator<T> $iterator;
    final /* synthetic */ boolean $partialWindows;
    final /* synthetic */ boolean $reuseBuffer;
    final /* synthetic */ int $size;
    final /* synthetic */ int $step;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SlidingWindowKt$windowedIterator$1(int i, int i2, Iterator<? extends T> it, boolean z, boolean z2, kotlin.coroutines.a<? super SlidingWindowKt$windowedIterator$1> aVar) {
        super(2, aVar);
        this.$size = i;
        this.$step = i2;
        this.$iterator = it;
        this.$reuseBuffer = z;
        this.$partialWindows = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.a<kotlin.t> create(Object obj, kotlin.coroutines.a<?> aVar) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, aVar);
        slidingWindowKt$windowedIterator$1.L$0 = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public final Object mo2423invoke(kotlin.sequences.f<? super List<? extends T>> fVar, kotlin.coroutines.a<? super kotlin.t> aVar) {
        return ((SlidingWindowKt$windowedIterator$1) create(fVar, aVar)).invokeSuspend(kotlin.t.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a7 -> B:28:0x00aa). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x012e -> B:57:0x0131). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0166 -> B:70:0x0169). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.SlidingWindowKt$windowedIterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
