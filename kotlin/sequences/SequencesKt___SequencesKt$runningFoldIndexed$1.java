package kotlin.sequences;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.t;
import tb.ruw;
import tb.rva;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", f = "_Sequences.kt", i = {0, 1, 1, 1}, l = {2339, 2344}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator", "index"}, s = {"L$0", "L$0", "L$1", "I$0"})
/* loaded from: classes9.dex */
final class SequencesKt___SequencesKt$runningFoldIndexed$1 extends RestrictedSuspendLambda implements ruw<f<? super R>, kotlin.coroutines.a<? super t>, Object> {
    final /* synthetic */ R $initial;
    final /* synthetic */ rva<Integer, R, T, R> $operation;
    final /* synthetic */ e<T> $this_runningFoldIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$runningFoldIndexed$1(R r, e<? extends T> eVar, rva<? super Integer, ? super R, ? super T, ? extends R> rvaVar, kotlin.coroutines.a<? super SequencesKt___SequencesKt$runningFoldIndexed$1> aVar) {
        super(2, aVar);
        this.$initial = r;
        this.$this_runningFoldIndexed = eVar;
        this.$operation = rvaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.a<t> create(Object obj, kotlin.coroutines.a<?> aVar) {
        SequencesKt___SequencesKt$runningFoldIndexed$1 sequencesKt___SequencesKt$runningFoldIndexed$1 = new SequencesKt___SequencesKt$runningFoldIndexed$1(this.$initial, this.$this_runningFoldIndexed, this.$operation, aVar);
        sequencesKt___SequencesKt$runningFoldIndexed$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFoldIndexed$1;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public final Object mo2423invoke(f<? super R> fVar, kotlin.coroutines.a<? super t> aVar) {
        return ((SequencesKt___SequencesKt$runningFoldIndexed$1) create(fVar, aVar)).invokeSuspend(t.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.a()
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 == r3) goto L2b
            if (r1 != r2) goto L23
            int r1 = r10.I$0
            java.lang.Object r3 = r10.L$2
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r10.L$1
            java.lang.Object r5 = r10.L$0
            kotlin.sequences.f r5 = (kotlin.sequences.f) r5
            kotlin.i.a(r11)
            r11 = r10
            r9 = r4
            r4 = r0
            r0 = r1
            r1 = r9
            goto L5a
        L23:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L2b:
            java.lang.Object r1 = r10.L$0
            kotlin.sequences.f r1 = (kotlin.sequences.f) r1
            kotlin.i.a(r11)
            goto L4b
        L33:
            kotlin.i.a(r11)
            java.lang.Object r11 = r10.L$0
            r1 = r11
            kotlin.sequences.f r1 = (kotlin.sequences.f) r1
            R r11 = r10.$initial
            r4 = r10
            kotlin.coroutines.a r4 = (kotlin.coroutines.a) r4
            r10.L$0 = r1
            r10.label = r3
            java.lang.Object r11 = r1.a(r11, r4)
            if (r11 != r0) goto L4b
            return r0
        L4b:
            r11 = 0
            R r3 = r10.$initial
            kotlin.sequences.e<T> r4 = r10.$this_runningFoldIndexed
            java.util.Iterator r4 = r4.a()
            r11 = r10
            r5 = r1
            r1 = r3
            r3 = r4
            r4 = r0
            r0 = 0
        L5a:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L8c
            java.lang.Object r6 = r3.next()
            tb.rva<java.lang.Integer, R, T, R> r7 = r11.$operation
            int r8 = r0 + 1
            if (r0 >= 0) goto L6d
            kotlin.collections.p.b()
        L6d:
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.a.a(r0)
            java.lang.Object r0 = r7.invoke(r0, r1, r6)
            r1 = r11
            kotlin.coroutines.a r1 = (kotlin.coroutines.a) r1
            r11.L$0 = r5
            r11.L$1 = r0
            r11.L$2 = r3
            r11.I$0 = r8
            r11.label = r2
            java.lang.Object r1 = r5.a(r0, r1)
            if (r1 != r4) goto L89
            return r4
        L89:
            r1 = r0
            r0 = r8
            goto L5a
        L8c:
            kotlin.t r11 = kotlin.t.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
