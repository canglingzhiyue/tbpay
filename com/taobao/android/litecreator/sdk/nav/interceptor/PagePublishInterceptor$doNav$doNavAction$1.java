package com.taobao.android.litecreator.sdk.nav.interceptor;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.ax;
import com.taobao.android.nav.Nav;
import com.taobao.umipublish.extension.windvane.UmiWvPlugin;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import org.json.JSONObject;
import tb.hnl;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Lkotlin/Unit;"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class PagePublishInterceptor$doNav$doNavAction$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ JSONObject $publishConfig;
    public final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagePublishInterceptor$doNav$doNavAction$1(c cVar, Context context, JSONObject jSONObject) {
        super(0);
        this.this$0 = cVar;
        this.$context = context;
        this.$publishConfig = jSONObject;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final t mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("a0e370c0", new Object[]{this});
        }
        Nav.from(this.$context).toUri(ax.a(UmiWvPlugin.NEW_PUBLISH_PATH, this.$publishConfig));
        hnl b = this.this$0.b();
        if (b == null) {
            return null;
        }
        hnl.a.a(b, "short_chain_success", this.this$0.c(), null, 4, null);
        return t.INSTANCE;
    }
}
