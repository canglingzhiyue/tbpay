package kotlin.text;

import com.taobao.search.common.util.k;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import tb.ruw;
import tb.rvh;
import tb.rwb;
import tb.rwf;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012:\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0096\u0002RB\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "input", "", k.a.PARAM_KEY_LIST_START_INDEX, "", "limit", "getNextMatch", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentIndex", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", com.taobao.android.weex_framework.util.a.ATOM_EXT_iterator, "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class e implements kotlin.sequences.e<rwb> {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f24981a;
    private final int b;
    private final int c;
    private final ruw<CharSequence, Integer, Pair<Integer, Integer>> d;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\t\u0010\u0019\u001a\u00020\u001aH\u0096\u0002J\t\u0010\u001b\u001a\u00020\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\b¨\u0006\u001c"}, d2 = {"kotlin/text/DelimitedRangesSequence$iterator$1", "", "Lkotlin/ranges/IntRange;", IWXUserTrackAdapter.COUNTER, "", "getCounter", "()I", "setCounter", "(I)V", "currentStartIndex", "getCurrentStartIndex", "setCurrentStartIndex", "nextItem", "getNextItem", "()Lkotlin/ranges/IntRange;", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextSearchIndex", "getNextSearchIndex", "setNextSearchIndex", "nextState", "getNextState", "setNextState", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class a implements Iterator<rwb>, rvh {
        private int b = -1;
        private int c;
        private int d;
        private rwb e;
        private int f;

        a() {
            this.c = rwf.a(e.this.b, 0, e.this.f24981a.length());
            this.d = this.c;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
            if (r6.f < r6.f24982a.c) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void b() {
            /*
                r6 = this;
                int r0 = r6.d
                r1 = 0
                if (r0 >= 0) goto Lb
                r6.b = r1
                r0 = 0
                r6.e = r0
                return
            Lb:
                kotlin.text.e r0 = kotlin.text.e.this
                int r0 = kotlin.text.e.a(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L24
                int r0 = r6.f
                int r0 = r0 + r3
                r6.f = r0
                int r0 = r6.f
                kotlin.text.e r4 = kotlin.text.e.this
                int r4 = kotlin.text.e.a(r4)
                if (r0 >= r4) goto L32
            L24:
                int r0 = r6.d
                kotlin.text.e r4 = kotlin.text.e.this
                java.lang.CharSequence r4 = kotlin.text.e.b(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L48
            L32:
                tb.rwb r0 = new tb.rwb
                int r1 = r6.c
                kotlin.text.e r4 = kotlin.text.e.this
                java.lang.CharSequence r4 = kotlin.text.e.b(r4)
                int r4 = kotlin.text.n.e(r4)
                r0.<init>(r1, r4)
            L43:
                r6.e = r0
            L45:
                r6.d = r2
                goto L9a
            L48:
                kotlin.text.e r0 = kotlin.text.e.this
                tb.ruw r0 = kotlin.text.e.c(r0)
                kotlin.text.e r4 = kotlin.text.e.this
                java.lang.CharSequence r4 = kotlin.text.e.b(r4)
                int r5 = r6.d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.mo2423invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L74
                tb.rwb r0 = new tb.rwb
                int r1 = r6.c
                kotlin.text.e r4 = kotlin.text.e.this
                java.lang.CharSequence r4 = kotlin.text.e.b(r4)
                int r4 = kotlin.text.n.e(r4)
                r0.<init>(r1, r4)
                goto L43
            L74:
                java.lang.Object r2 = r0.component1()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.component2()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.c
                tb.rwb r4 = tb.rwf.b(r4, r2)
                r6.e = r4
                int r2 = r2 + r0
                r6.c = r2
                int r2 = r6.c
                if (r0 != 0) goto L98
                r1 = 1
            L98:
                int r2 = r2 + r1
                goto L45
            L9a:
                r6.b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.e.a.b():void");
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public rwb next() {
            if (this.b == -1) {
                b();
            }
            if (this.b != 0) {
                rwb rwbVar = this.e;
                kotlin.jvm.internal.q.e(rwbVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.e = null;
                this.b = -1;
                return rwbVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b == -1) {
                b();
            }
            return this.b == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(CharSequence input, int i, int i2, ruw<? super CharSequence, ? super Integer, Pair<Integer, Integer>> getNextMatch) {
        kotlin.jvm.internal.q.d(input, "input");
        kotlin.jvm.internal.q.d(getNextMatch, "getNextMatch");
        this.f24981a = input;
        this.b = i;
        this.c = i2;
        this.d = getNextMatch;
    }

    @Override // kotlin.sequences.e
    public Iterator<rwb> a() {
        return new a();
    }
}
