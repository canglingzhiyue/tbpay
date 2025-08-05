package kotlin.text;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import tb.rwb;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "matcher", "Ljava/util/regex/Matcher;", "input", "", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "groupValues", "", "", "getGroupValues", "()Ljava/util/List;", "groupValues_", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "matchResult", "Ljava/util/regex/MatchResult;", "getMatchResult", "()Ljava/util/regex/MatchResult;", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "getValue", "()Ljava/lang/String;", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    private final h f24984a;
    private final Matcher b;
    private final CharSequence c;
    private List<String> d;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0096\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fH\u0096\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "size", "", "getSize", "()I", "get", "index", "name", "", "isEmpty", "", com.taobao.android.weex_framework.util.a.ATOM_EXT_iterator, "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class a extends kotlin.collections.a<g> implements i {
        a() {
        }

        @Override // kotlin.collections.a
        public int a() {
            return k.this.c().groupCount() + 1;
        }

        @Override // kotlin.text.h
        public g a(int i) {
            rwb b;
            b = l.b(k.this.c(), i);
            if (b.f().intValue() >= 0) {
                String group = k.this.c().group(i);
                kotlin.jvm.internal.q.b(group, "group(...)");
                return new g(group, b);
            }
            return null;
        }

        public boolean a(g gVar) {
            return super.contains(gVar);
        }

        @Override // kotlin.collections.a, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj == null ? true : obj instanceof g)) {
                return false;
            }
            return a((g) obj);
        }

        @Override // kotlin.collections.a, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // kotlin.collections.a, java.util.Collection, java.lang.Iterable
        public Iterator<g> iterator() {
            return kotlin.sequences.g.c(kotlin.collections.p.l(kotlin.collections.p.a((Collection<?>) this)), new MatcherMatchResult$groups$1$iterator$1(this)).a();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0096\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"kotlin/text/MatcherMatchResult$groupValues$1", "Lkotlin/collections/AbstractList;", "", "size", "", "getSize", "()I", "get", "index", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class b extends kotlin.collections.d<String> {
        b() {
        }

        @Override // kotlin.collections.d, kotlin.collections.a
        public int a() {
            return k.this.c().groupCount() + 1;
        }

        public int a(String str) {
            return super.indexOf(str);
        }

        @Override // kotlin.collections.d, java.util.List
        /* renamed from: a */
        public String mo2402get(int i) {
            String group = k.this.c().group(i);
            return group == null ? "" : group;
        }

        public int b(String str) {
            return super.lastIndexOf(str);
        }

        public boolean c(String str) {
            return super.contains(str);
        }

        @Override // kotlin.collections.a, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return c((String) obj);
        }

        @Override // kotlin.collections.d, java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return a((String) obj);
        }

        @Override // kotlin.collections.d, java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return b((String) obj);
        }
    }

    public k(Matcher matcher, CharSequence input) {
        kotlin.jvm.internal.q.d(matcher, "matcher");
        kotlin.jvm.internal.q.d(input, "input");
        this.b = matcher;
        this.c = input;
        this.f24984a = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult c() {
        return this.b;
    }

    @Override // kotlin.text.j
    public rwb a() {
        rwb b2;
        b2 = l.b(c());
        return b2;
    }

    @Override // kotlin.text.j
    public j b() {
        j b2;
        int end = c().end() + (c().end() == c().start() ? 1 : 0);
        if (end <= this.c.length()) {
            Matcher matcher = this.b.pattern().matcher(this.c);
            kotlin.jvm.internal.q.b(matcher, "matcher(...)");
            b2 = l.b(matcher, end, this.c);
            return b2;
        }
        return null;
    }

    @Override // kotlin.text.j
    public h d() {
        return this.f24984a;
    }

    @Override // kotlin.text.j
    public List<String> e() {
        if (this.d == null) {
            this.d = new b();
        }
        List<String> list = this.d;
        kotlin.jvm.internal.q.a(list);
        return list;
    }
}
