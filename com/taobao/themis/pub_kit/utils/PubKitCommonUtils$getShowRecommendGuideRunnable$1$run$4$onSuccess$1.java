package com.taobao.themis.pub_kit.utils;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.pub_kit.utils.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PubKitCommonUtils$getShowRecommendGuideRunnable$1$run$4$onSuccess$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ JSONObject $response;
    public final /* synthetic */ b.a.C0973a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubKitCommonUtils$getShowRecommendGuideRunnable$1$run$4$onSuccess$1(b.a.C0973a c0973a, JSONObject jSONObject) {
        super(0);
        this.this$0 = c0973a;
        this.$response = jSONObject;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            new com.taobao.themis.pub_kit.guide.g(b.a.this.d, b.a.this.c, b.a.this.b, this.$response.getJSONObject("delta"), this.this$0.b).a(b.a.this.f, b.a.this.h);
        }
    }
}
