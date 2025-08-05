package com.alibaba.triver.triver_shop.newShop.ext;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopExtKt$parseBarIndexFromWeexTab$foundSubIndexBlock$1 extends Lambda implements ruk<Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int $foundMainIndex;
    public final /* synthetic */ JSONArray $tabBarViewModelArray;
    public final /* synthetic */ String $weexSubShopTab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$parseBarIndexFromWeexTab$foundSubIndexBlock$1(int i, JSONArray jSONArray, String str) {
        super(0);
        this.$foundMainIndex = i;
        this.$tabBarViewModelArray = jSONArray;
        this.$weexSubShopTab = str;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Integer] */
    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public /* synthetic */ Integer mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5a980813", new Object[]{this}) : Integer.valueOf(mo2427invoke());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final Integer mo2427invoke() {
        JSONArray jSONArray;
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7560ccf2", new Object[]{this})).intValue();
        }
        if (this.$foundMainIndex >= this.$tabBarViewModelArray.size()) {
            return null;
        }
        Object obj = this.$tabBarViewModelArray.get(this.$foundMainIndex);
        if ((obj instanceof JSONArray) && (size = (jSONArray = (JSONArray) obj).size()) > 0) {
            ?? r3 = 0;
            while (true) {
                int i = r3 + 1;
                Object obj2 = jSONArray.get(r3);
                if ((obj2 instanceof JSONObject) && q.a((Object) this.$weexSubShopTab, ((JSONObject) obj2).get("name"))) {
                    return r3;
                }
                if (i >= size) {
                    break;
                }
                r3 = i;
            }
        }
        return null;
    }
}
