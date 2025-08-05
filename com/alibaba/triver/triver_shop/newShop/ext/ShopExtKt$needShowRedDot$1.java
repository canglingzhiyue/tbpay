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
public final class ShopExtKt$needShowRedDot$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Context $currentPageContext;
    public final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d $shopDataParser;
    public final /* synthetic */ ruk<t> $showRedDotCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$needShowRedDot$1(com.alibaba.triver.triver_shop.newShop.data.d dVar, Context context, ruk<t> rukVar) {
        super(0);
        this.$shopDataParser = dVar;
        this.$currentPageContext = context;
        this.$showRedDotCallback = rukVar;
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
        String a3 = b.a(this.$currentPageContext, a2, "shopIdList");
        String a4 = b.a(this.$currentPageContext, a2, "lastTime");
        long j = 0;
        if (a4 != null && (e = kotlin.text.n.e(a4)) != null) {
            j = e.longValue();
        }
        JSONArray b = d.b(a3);
        if (b == null) {
            b = new JSONArray();
        }
        if (currentTimeMillis - j <= L) {
            if (b.size() > M) {
                ceg.Companion.b("red dot time valid , but max size , not show");
                return;
            } else if (b.contains(T)) {
                ceg.Companion.b("red dot time valid , but already show");
                return;
            }
        }
        b.b(new AnonymousClass1(this.$showRedDotCallback));
    }

    /* renamed from: com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$needShowRedDot$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements ruk<t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ruk<t> $showRedDotCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ruk<t> rukVar) {
            super(0);
            this.$showRedDotCallback = rukVar;
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
                this.$showRedDotCallback.mo2427invoke();
            }
        }
    }
}
