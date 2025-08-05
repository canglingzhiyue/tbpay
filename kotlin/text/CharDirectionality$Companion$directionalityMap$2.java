package kotlin.text;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.jvm.internal.Lambda;
import tb.ruk;
import tb.rwf;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lkotlin/text/CharDirectionality;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class CharDirectionality$Companion$directionalityMap$2 extends Lambda implements ruk<Map<Integer, ? extends CharDirectionality>> {
    public static final CharDirectionality$Companion$directionalityMap$2 INSTANCE = new CharDirectionality$Companion$directionalityMap$2();

    CharDirectionality$Companion$directionalityMap$2() {
        super(0);
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final Map<Integer, ? extends CharDirectionality> mo2427invoke() {
        kotlin.enums.a<CharDirectionality> entries = CharDirectionality.getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(rwf.c(ai.a(kotlin.collections.p.a((Iterable) entries, 10)), 16));
        for (Object obj : entries) {
            linkedHashMap.put(Integer.valueOf(((CharDirectionality) obj).getValue()), obj);
        }
        return linkedHashMap;
    }
}
