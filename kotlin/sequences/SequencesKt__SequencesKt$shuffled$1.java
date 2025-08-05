package kotlin.sequences;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.random.Random;
import kotlin.t;
import tb.jzk;
import tb.ruw;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", i = {0, 0}, l = {jzk.INSTALL_PROVIDER}, m = "invokeSuspend", n = {"$this$sequence", com.taobao.android.weex_framework.util.a.ATOM_EXT_buffer}, s = {"L$0", "L$1"})
/* loaded from: classes9.dex */
final class SequencesKt__SequencesKt$shuffled$1 extends RestrictedSuspendLambda implements ruw<f<? super T>, kotlin.coroutines.a<? super t>, Object> {
    final /* synthetic */ Random $random;
    final /* synthetic */ e<T> $this_shuffled;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt__SequencesKt$shuffled$1(e<? extends T> eVar, Random random, kotlin.coroutines.a<? super SequencesKt__SequencesKt$shuffled$1> aVar) {
        super(2, aVar);
        this.$this_shuffled = eVar;
        this.$random = random;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.a<t> create(Object obj, kotlin.coroutines.a<?> aVar) {
        SequencesKt__SequencesKt$shuffled$1 sequencesKt__SequencesKt$shuffled$1 = new SequencesKt__SequencesKt$shuffled$1(this.$this_shuffled, this.$random, aVar);
        sequencesKt__SequencesKt$shuffled$1.L$0 = obj;
        return sequencesKt__SequencesKt$shuffled$1;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public final Object mo2423invoke(f<? super T> fVar, kotlin.coroutines.a<? super t> aVar) {
        return ((SequencesKt__SequencesKt$shuffled$1) create(fVar, aVar)).invokeSuspend(t.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List d;
        f fVar;
        Object a2 = kotlin.coroutines.intrinsics.a.a();
        int i = this.label;
        if (i == 0) {
            kotlin.i.a(obj);
            d = g.d(this.$this_shuffled);
            fVar = (f) this.L$0;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            d = (List) this.L$1;
            fVar = (f) this.L$0;
            kotlin.i.a(obj);
        }
        while (!d.isEmpty()) {
            int b = this.$random.b(d.size());
            Object e = p.e((List<Object>) d);
            if (b < d.size()) {
                e = d.set(b, e);
            }
            this.L$0 = fVar;
            this.L$1 = d;
            this.label = 1;
            if (fVar.a((f) e, (kotlin.coroutines.a<? super t>) this) == a2) {
                return a2;
            }
        }
        return t.INSTANCE;
    }
}
