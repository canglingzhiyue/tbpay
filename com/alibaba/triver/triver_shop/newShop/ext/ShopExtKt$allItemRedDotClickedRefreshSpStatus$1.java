package com.alibaba.triver.triver_shop.newShop.ext;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.common.ShopConstants;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.cen;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopExtKt$allItemRedDotClickedRefreshSpStatus$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Context $currentPageContext;
    public final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d $shopDataParser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$allItemRedDotClickedRefreshSpStatus$1(com.alibaba.triver.triver_shop.newShop.data.d dVar, Context context) {
        super(0);
        this.$shopDataParser = dVar;
        this.$currentPageContext = context;
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
        Long e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        long L = cen.Companion.L() * ((long) ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT) * 1000;
        int M = cen.Companion.M();
        long currentTimeMillis = System.currentTimeMillis();
        String T = this.$shopDataParser.T();
        String a2 = q.a("new_shop_red_dot_list_by_", (Object) l.b(this.$currentPageContext));
        JSONArray b = d.b(b.a(this.$currentPageContext, a2, "shopIdList"));
        if (b == null) {
            b = new JSONArray();
        }
        String a3 = b.a(this.$currentPageContext, a2, "lastTime");
        long j = 0;
        if (a3 != null && (e = kotlin.text.n.e(a3)) != null) {
            j = e.longValue();
        }
        if (currentTimeMillis - j > L) {
            b.clear();
            b.add(T);
            b.a(this.$currentPageContext, a2, "shopIdList", b.toString());
            b.a(this.$currentPageContext, a2, "lastTime", String.valueOf(currentTimeMillis));
            ceg.Companion.b("red dot time not valid , clear all and add new");
        } else if (b.size() > M) {
            ceg.Companion.b("red dot time valid , but max size");
        } else {
            b.add(T);
            b.a(this.$currentPageContext, a2, "shopIdList", b.toString());
            ceg.Companion.b("red dot time valid , update id");
        }
    }
}
