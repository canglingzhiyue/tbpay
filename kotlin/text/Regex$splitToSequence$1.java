package kotlin.text;

import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import tb.ruw;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {1, 1, 1}, l = {Result.ALIPAY_RSAKEY_MALLOC_FAILED, 283, 287}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "splitCount"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes9.dex */
public final class Regex$splitToSequence$1 extends RestrictedSuspendLambda implements ruw<kotlin.sequences.f<? super String>, kotlin.coroutines.a<? super kotlin.t>, Object> {
    final /* synthetic */ CharSequence $input;
    final /* synthetic */ int $limit;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Regex this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Regex$splitToSequence$1(Regex regex, CharSequence charSequence, int i, kotlin.coroutines.a<? super Regex$splitToSequence$1> aVar) {
        super(2, aVar);
        this.this$0 = regex;
        this.$input = charSequence;
        this.$limit = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.a<kotlin.t> create(Object obj, kotlin.coroutines.a<?> aVar) {
        Regex$splitToSequence$1 regex$splitToSequence$1 = new Regex$splitToSequence$1(this.this$0, this.$input, this.$limit, aVar);
        regex$splitToSequence$1.L$0 = obj;
        return regex$splitToSequence$1;
    }

    @Override // tb.ruw
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo2423invoke(kotlin.sequences.f<? super String> fVar, kotlin.coroutines.a<? super kotlin.t> aVar) {
        return ((Regex$splitToSequence$1) create(fVar, aVar)).invokeSuspend(kotlin.t.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0075 -> B:21:0x0078). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.a()
            int r1 = r10.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L36
            if (r1 == r5) goto L31
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            kotlin.i.a(r11)
            goto La7
        L17:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1f:
            int r1 = r10.I$0
            java.lang.Object r2 = r10.L$1
            java.util.regex.Matcher r2 = (java.util.regex.Matcher) r2
            java.lang.Object r6 = r10.L$0
            kotlin.sequences.f r6 = (kotlin.sequences.f) r6
            kotlin.i.a(r11)
            r11 = r10
            r7 = r0
            r0 = r1
            r1 = r2
            goto L78
        L31:
            kotlin.i.a(r11)
            goto Lbc
        L36:
            kotlin.i.a(r11)
            java.lang.Object r11 = r10.L$0
            kotlin.sequences.f r11 = (kotlin.sequences.f) r11
            kotlin.text.Regex r1 = r10.this$0
            java.util.regex.Pattern r1 = kotlin.text.Regex.access$getNativePattern$p(r1)
            java.lang.CharSequence r6 = r10.$input
            java.util.regex.Matcher r1 = r1.matcher(r6)
            int r6 = r10.$limit
            if (r6 == r5) goto Laa
            boolean r6 = r1.find()
            if (r6 != 0) goto L54
            goto Laa
        L54:
            r6 = r11
            r7 = r0
            r0 = 0
            r11 = r10
        L58:
            java.lang.CharSequence r8 = r11.$input
            int r9 = r1.start()
            java.lang.CharSequence r2 = r8.subSequence(r2, r9)
            java.lang.String r2 = r2.toString()
            r8 = r11
            kotlin.coroutines.a r8 = (kotlin.coroutines.a) r8
            r11.L$0 = r6
            r11.L$1 = r1
            r11.I$0 = r0
            r11.label = r4
            java.lang.Object r2 = r6.a(r2, r8)
            if (r2 != r7) goto L78
            return r7
        L78:
            int r2 = r1.end()
            int r0 = r0 + r5
            int r8 = r11.$limit
            int r8 = r8 - r5
            if (r0 == r8) goto L88
            boolean r8 = r1.find()
            if (r8 != 0) goto L58
        L88:
            java.lang.CharSequence r0 = r11.$input
            int r1 = r0.length()
            java.lang.CharSequence r0 = r0.subSequence(r2, r1)
            java.lang.String r0 = r0.toString()
            r1 = r11
            kotlin.coroutines.a r1 = (kotlin.coroutines.a) r1
            r2 = 0
            r11.L$0 = r2
            r11.L$1 = r2
            r11.label = r3
            java.lang.Object r11 = r6.a(r0, r1)
            if (r11 != r7) goto La7
            return r7
        La7:
            kotlin.t r11 = kotlin.t.INSTANCE
            return r11
        Laa:
            java.lang.CharSequence r1 = r10.$input
            java.lang.String r1 = r1.toString()
            r2 = r10
            kotlin.coroutines.a r2 = (kotlin.coroutines.a) r2
            r10.label = r5
            java.lang.Object r11 = r11.a(r1, r2)
            if (r11 != r0) goto Lbc
            return r0
        Lbc:
            kotlin.t r11 = kotlin.t.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex$splitToSequence$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
