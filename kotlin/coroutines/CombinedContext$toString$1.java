package kotlin.coroutines;

import com.alibaba.android.bindingx.core.internal.BindingXConstants;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.ruw;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "acc", BindingXConstants.KEY_ELEMENT, "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class CombinedContext$toString$1 extends Lambda implements ruw<String, c.b, String> {
    public static final CombinedContext$toString$1 INSTANCE = new CombinedContext$toString$1();

    CombinedContext$toString$1() {
        super(2);
    }

    @Override // tb.ruw
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final String mo2423invoke(String acc, c.b element) {
        q.d(acc, "acc");
        q.d(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }
}
