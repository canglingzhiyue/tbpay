package kotlin.sequences;

import com.alibaba.android.bindingx.core.internal.BindingXConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruw;

@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "T", "index", "", BindingXConstants.KEY_ELEMENT, "invoke", "(ILjava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class SequencesKt___SequencesKt$onEachIndexed$1 extends Lambda implements ruw<Integer, T, T> {
    final /* synthetic */ ruw<Integer, T, t> $action;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$onEachIndexed$1(ruw<? super Integer, ? super T, t> ruwVar) {
        super(2);
        this.$action = ruwVar;
    }

    public final T invoke(int i, T t) {
        this.$action.mo2423invoke(Integer.valueOf(i), t);
        return t;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public /* synthetic */ Object mo2423invoke(Integer num, Object obj) {
        return invoke(num.intValue(), (int) obj);
    }
}
