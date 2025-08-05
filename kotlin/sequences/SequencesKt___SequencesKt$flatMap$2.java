package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.q;
import tb.rul;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class SequencesKt___SequencesKt$flatMap$2 extends FunctionReferenceImpl implements rul<e<? extends R>, Iterator<? extends R>> {
    public static final SequencesKt___SequencesKt$flatMap$2 INSTANCE = new SequencesKt___SequencesKt$flatMap$2();

    SequencesKt___SequencesKt$flatMap$2() {
        super(1, e.class, com.taobao.android.weex_framework.util.a.ATOM_EXT_iterator, "iterator()Ljava/util/Iterator;", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.rul
    /* renamed from: invoke */
    public final Iterator<R> mo2421invoke(e<? extends R> p0) {
        q.d(p0, "p0");
        return p0.a();
    }
}
