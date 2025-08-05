package kotlin.sequences;

import android.support.media.ExifInterface;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.t;
import tb.ruw;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u0002H\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.LATITUDE_SOUTH, "T", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1}, l = {2368, 2371}, m = "invokeSuspend", n = {"$this$sequence", com.taobao.android.weex_framework.util.a.ATOM_EXT_iterator, "accumulator", "$this$sequence", com.taobao.android.weex_framework.util.a.ATOM_EXT_iterator, "accumulator"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes9.dex */
final class SequencesKt___SequencesKt$runningReduce$1 extends RestrictedSuspendLambda implements ruw<f<? super S>, kotlin.coroutines.a<? super t>, Object> {
    final /* synthetic */ ruw<S, T, S> $operation;
    final /* synthetic */ e<T> $this_runningReduce;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$runningReduce$1(e<? extends T> eVar, ruw<? super S, ? super T, ? extends S> ruwVar, kotlin.coroutines.a<? super SequencesKt___SequencesKt$runningReduce$1> aVar) {
        super(2, aVar);
        this.$this_runningReduce = eVar;
        this.$operation = ruwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.a<t> create(Object obj, kotlin.coroutines.a<?> aVar) {
        SequencesKt___SequencesKt$runningReduce$1 sequencesKt___SequencesKt$runningReduce$1 = new SequencesKt___SequencesKt$runningReduce$1(this.$this_runningReduce, this.$operation, aVar);
        sequencesKt___SequencesKt$runningReduce$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningReduce$1;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public final Object mo2423invoke(f<? super S> fVar, kotlin.coroutines.a<? super t> aVar) {
        return ((SequencesKt___SequencesKt$runningReduce$1) create(fVar, aVar)).invokeSuspend(t.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Object obj2;
        f fVar;
        Object a2 = kotlin.coroutines.intrinsics.a.a();
        int i = this.label;
        if (i == 0) {
            kotlin.i.a(obj);
            f fVar2 = (f) this.L$0;
            Iterator a3 = this.$this_runningReduce.a();
            if (a3.hasNext()) {
                Object next = a3.next();
                this.L$0 = fVar2;
                this.L$1 = a3;
                this.L$2 = next;
                this.label = 1;
                if (fVar2.a((f) next, (kotlin.coroutines.a<? super t>) this) == a2) {
                    return a2;
                }
                it = a3;
                obj2 = next;
                fVar = fVar2;
            }
            return t.INSTANCE;
        } else if (i != 1 && i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            obj2 = this.L$2;
            it = (Iterator) this.L$1;
            fVar = (f) this.L$0;
            kotlin.i.a(obj);
        }
        while (it.hasNext()) {
            obj2 = this.$operation.mo2423invoke(obj2, it.next());
            this.L$0 = fVar;
            this.L$1 = it;
            this.L$2 = obj2;
            this.label = 2;
            if (fVar.a((f) obj2, (kotlin.coroutines.a<? super t>) this) == a2) {
                return a2;
            }
        }
        return t.INSTANCE;
    }
}
