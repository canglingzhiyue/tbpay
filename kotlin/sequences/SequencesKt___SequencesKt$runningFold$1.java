package kotlin.sequences;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.t;
import tb.ruw;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", i = {0, 1, 1}, l = {2311, 2315}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes9.dex */
final class SequencesKt___SequencesKt$runningFold$1 extends RestrictedSuspendLambda implements ruw<f<? super R>, kotlin.coroutines.a<? super t>, Object> {
    final /* synthetic */ R $initial;
    final /* synthetic */ ruw<R, T, R> $operation;
    final /* synthetic */ e<T> $this_runningFold;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$runningFold$1(R r, e<? extends T> eVar, ruw<? super R, ? super T, ? extends R> ruwVar, kotlin.coroutines.a<? super SequencesKt___SequencesKt$runningFold$1> aVar) {
        super(2, aVar);
        this.$initial = r;
        this.$this_runningFold = eVar;
        this.$operation = ruwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.a<t> create(Object obj, kotlin.coroutines.a<?> aVar) {
        SequencesKt___SequencesKt$runningFold$1 sequencesKt___SequencesKt$runningFold$1 = new SequencesKt___SequencesKt$runningFold$1(this.$initial, this.$this_runningFold, this.$operation, aVar);
        sequencesKt___SequencesKt$runningFold$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFold$1;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public final Object mo2423invoke(f<? super R> fVar, kotlin.coroutines.a<? super t> aVar) {
        return ((SequencesKt___SequencesKt$runningFold$1) create(fVar, aVar)).invokeSuspend(t.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.a()
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 == r3) goto L28
            if (r1 != r2) goto L20
            java.lang.Object r1 = r8.L$2
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r8.L$1
            java.lang.Object r4 = r8.L$0
            kotlin.sequences.f r4 = (kotlin.sequences.f) r4
            kotlin.i.a(r9)
            r9 = r8
            r7 = r3
            r3 = r0
            r0 = r7
            goto L55
        L20:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L28:
            java.lang.Object r1 = r8.L$0
            kotlin.sequences.f r1 = (kotlin.sequences.f) r1
            kotlin.i.a(r9)
            goto L48
        L30:
            kotlin.i.a(r9)
            java.lang.Object r9 = r8.L$0
            r1 = r9
            kotlin.sequences.f r1 = (kotlin.sequences.f) r1
            R r9 = r8.$initial
            r4 = r8
            kotlin.coroutines.a r4 = (kotlin.coroutines.a) r4
            r8.L$0 = r1
            r8.label = r3
            java.lang.Object r9 = r1.a(r9, r4)
            if (r9 != r0) goto L48
            return r0
        L48:
            R r9 = r8.$initial
            kotlin.sequences.e<T> r3 = r8.$this_runningFold
            java.util.Iterator r3 = r3.a()
            r4 = r1
            r1 = r3
            r3 = r0
            r0 = r9
            r9 = r8
        L55:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L77
            java.lang.Object r5 = r1.next()
            tb.ruw<R, T, R> r6 = r9.$operation
            java.lang.Object r0 = r6.mo2423invoke(r0, r5)
            r5 = r9
            kotlin.coroutines.a r5 = (kotlin.coroutines.a) r5
            r9.L$0 = r4
            r9.L$1 = r0
            r9.L$2 = r1
            r9.label = r2
            java.lang.Object r5 = r4.a(r0, r5)
            if (r5 != r3) goto L55
            return r3
        L77:
            kotlin.t r9 = kotlin.t.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFold$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
