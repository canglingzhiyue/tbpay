package com.taobao.themis.uniapp.solution.extension.instance;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.uniapp.solution.extension.instance.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.text.j;
import kotlin.text.n;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", com.taobao.android.weex_framework.util.a.ATOM_EXT_match, "Lkotlin/text/MatchResult;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class MTOPPrefetchExtension$translateTemplateParam$1 extends Lambda implements rul<j, CharSequence> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ b.C0981b $dataProvider;
    public final /* synthetic */ String $param;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTOPPrefetchExtension$translateTemplateParam$1(b.C0981b c0981b, String str) {
        super(1);
        this.$dataProvider = c0981b;
        this.$param = str;
    }

    @Override // tb.rul
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final CharSequence mo2421invoke(j match) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("e21721ae", new Object[]{this, match});
        }
        q.d(match, "match");
        if (match.e().size() < 2) {
            return "";
        }
        String str = match.e().get(1);
        if (n.b(str, "queryParams", false, 2, (Object) null) || q.a((Object) str, (Object) "url")) {
            return this.$dataProvider.a(str);
        }
        throw new UnsupportedOperationException("unsupported parameter: " + str + ", originParam: " + this.$param);
    }
}
