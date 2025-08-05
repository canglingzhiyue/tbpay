package com.alibaba.triver.triver_shop.shop2023.nativeview;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.shop2023.nativeview.e;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes3.dex */
public final class Shop2023CategoryNativeComponent$list$2 extends Lambda implements ruk<List<e.a>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2023CategoryNativeComponent$list$2(e eVar) {
        super(0);
        this.this$0 = eVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final List<e.a> mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4c3f8768", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        e eVar = this.this$0;
        JSONArray jSONArray = e.$ipChange;
        if (jSONArray != null) {
            for (Object obj : jSONArray) {
                if (obj != null) {
                    JSONObject jSONObject = (JSONObject) obj;
                    String string = jSONObject.getString("title");
                    String string2 = jSONObject.getString("categoryId");
                    JSONObject jSONObject2 = jSONObject.getJSONObject("image");
                    String string3 = jSONObject2 == null ? null : jSONObject2.getString("url");
                    JSONObject jSONObject3 = jSONObject.getJSONObject("queryStringMap");
                    if (jSONObject3 == null) {
                        jSONObject3 = new JSONObject();
                    }
                    arrayList.add(new e.a(string, string2, jSONObject3, string3, 0, jSONObject.getJSONObject(aw.PARAM_UT_PARAMS), jSONObject.getJSONObject("utLogMap"), 16, null));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
            }
        }
        return arrayList;
    }
}
