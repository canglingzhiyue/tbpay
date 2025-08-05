package kotlin.coroutines;

import com.alibaba.android.bindingx.core.internal.BindingXConstants;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruw;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", BindingXConstants.KEY_ELEMENT, "Lkotlin/coroutines/CoroutineContext$Element;", "invoke", "(Lkotlin/Unit;Lkotlin/coroutines/CoroutineContext$Element;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class CombinedContext$writeReplace$1 extends Lambda implements ruw<t, c.b, t> {
    final /* synthetic */ c[] $elements;
    final /* synthetic */ Ref.IntRef $index;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedContext$writeReplace$1(c[] cVarArr, Ref.IntRef intRef) {
        super(2);
        this.$elements = cVarArr;
        this.$index = intRef;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2423invoke(t tVar, c.b bVar) {
        invoke2(tVar, bVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(t tVar, c.b element) {
        q.d(tVar, "<anonymous parameter 0>");
        q.d(element, "element");
        c[] cVarArr = this.$elements;
        int i = this.$index.element;
        this.$index.element = i + 1;
        cVarArr[i] = element;
    }
}
