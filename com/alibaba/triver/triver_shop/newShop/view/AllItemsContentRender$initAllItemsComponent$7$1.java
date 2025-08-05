package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.nwr;
import tb.rva;

/* loaded from: classes3.dex */
public final class AllItemsContentRender$initAllItemsComponent$7$1 extends Lambda implements rva<JSONObject, String, JSONObject, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ nwr $allItemsModule;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllItemsContentRender$initAllItemsComponent$7$1(a aVar, nwr nwrVar) {
        super(3);
        this.this$0 = aVar;
        this.$allItemsModule = nwrVar;
    }

    @Override // tb.rva
    public /* bridge */ /* synthetic */ t invoke(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        invoke2(jSONObject, str, jSONObject2);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JSONObject queryStringMap, String str, JSONObject jSONObject) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7c310f5", new Object[]{this, queryStringMap, str, jSONObject});
            return;
        }
        kotlin.jvm.internal.q.d(queryStringMap, "queryStringMap");
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<String, Object>> it = queryStringMap.entrySet().iterator();
        while (true) {
            str2 = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, Object> next = it.next();
            HashMap hashMap2 = hashMap;
            String key = next.getKey();
            kotlin.jvm.internal.q.b(key, "entry.key");
            Object value = next.getValue();
            if (value != null) {
                str2 = value.toString();
            }
            hashMap2.put(key, str2);
        }
        HashMap hashMap3 = hashMap;
        hashMap3.put("nextCategoryGuidText", str);
        Context a2 = this.this$0.a();
        if (jSONObject != null) {
            str2 = jSONObject.toString();
        }
        com.alibaba.triver.triver_shop.newShop.ext.m.b(a2, aw.PARAM_UT_PARAMS, str2);
        this.$allItemsModule.m();
        this.$allItemsModule.b(hashMap3);
        this.$allItemsModule.b();
    }
}
