package kotlin.coroutines;

import com.alibaba.android.bindingx.core.internal.BindingXConstants;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.ruw;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "acc", BindingXConstants.KEY_ELEMENT, "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class CoroutineContext$plus$1 extends Lambda implements ruw<c, c.b, c> {
    public static final CoroutineContext$plus$1 INSTANCE = new CoroutineContext$plus$1();

    CoroutineContext$plus$1() {
        super(2);
    }

    @Override // tb.ruw
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final c mo2423invoke(c acc, c.b element) {
        CombinedContext combinedContext;
        q.d(acc, "acc");
        q.d(element, "element");
        c minusKey = acc.minusKey(element.a());
        if (minusKey == EmptyCoroutineContext.INSTANCE) {
            return element;
        }
        b bVar = (b) minusKey.get(b.Key);
        if (bVar == null) {
            combinedContext = new CombinedContext(minusKey, element);
        } else {
            c minusKey2 = minusKey.minusKey(b.Key);
            combinedContext = minusKey2 == EmptyCoroutineContext.INSTANCE ? new CombinedContext(element, bVar) : new CombinedContext(new CombinedContext(minusKey2, element), bVar);
        }
        return combinedContext;
    }
}
