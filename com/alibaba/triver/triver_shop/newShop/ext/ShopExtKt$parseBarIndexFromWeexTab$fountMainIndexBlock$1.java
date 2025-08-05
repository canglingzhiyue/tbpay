package com.alibaba.triver.triver_shop.newShop.ext;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopExtKt$parseBarIndexFromWeexTab$fountMainIndexBlock$1 extends Lambda implements ruk<Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ JSONArray $tabData;
    public final /* synthetic */ String $weexShopTab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$parseBarIndexFromWeexTab$fountMainIndexBlock$1(JSONArray jSONArray, String str) {
        super(0);
        this.$tabData = jSONArray;
        this.$weexShopTab = str;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Integer] */
    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public /* synthetic */ Integer mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5a980813", new Object[]{this}) : Integer.valueOf(mo2427invoke());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v3 */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final Integer mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7560ccf2", new Object[]{this})).intValue();
        }
        int size = this.$tabData.size();
        if (size > 0) {
            ?? r1 = 0;
            while (true) {
                int i = r1 + 1;
                Object obj = this.$tabData.get(r1);
                if ((obj instanceof JSONObject) && q.a((Object) this.$weexShopTab, ((JSONObject) obj).get("name"))) {
                    return r1;
                }
                if (i >= size) {
                    break;
                }
                r1 = i;
            }
        }
        return null;
    }
}
