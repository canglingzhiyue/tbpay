package com.taobao.android.sku.bizevent;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.j;
import java.util.ArrayList;
import java.util.List;
import tb.fgl;
import tb.iyb;
import tb.iyd;
import tb.iye;
import tb.kge;
import tb.mrm;

/* loaded from: classes6.dex */
public class g implements iyd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "sku_update_item";

    static {
        kge.a(-924429708);
        kge.a(-1413102650);
    }

    @Override // tb.iyd
    public void a(iye iyeVar, iyb iybVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0c8681", new Object[]{this, iyeVar, iybVar});
            return;
        }
        ArrayList arrayList = new ArrayList();
        List c = iyeVar.c();
        if (c != null && c.size() > 0) {
            for (int i = 0; i < c.size(); i++) {
                Object obj = c.get(i);
                if (obj instanceof JSONObject) {
                    arrayList.add((JSONObject) obj);
                }
            }
        }
        JSONObject b = iyeVar.b();
        if (b == null || b.isEmpty() || (jSONObject = b.getJSONObject("fields")) == null || jSONObject.isEmpty()) {
            return;
        }
        String e = iybVar.e();
        j.a(new JSONObject(), arrayList, jSONObject);
        String string = jSONObject.getString(fgl.ORIGINALITEMID);
        String string2 = jSONObject.getString(fgl.TARGETITEMID);
        String string3 = jSONObject.getString(mrm.KEY_AREA_ID);
        String string4 = jSONObject.getString("addressId");
        Object obj2 = jSONObject.get("params");
        Object obj3 = jSONObject.get("relatedAuctionParams");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return;
        }
        iybVar.d();
        Intent intent = new Intent();
        intent.setAction(com.taobao.android.detail.ttdetail.constant.a.SKU_ACTION_UPDATE_DATA);
        intent.putExtra("skuToken", e);
        intent.putExtra(fgl.ORIGINALITEMID, string);
        intent.putExtra(fgl.TARGETITEMID, string2);
        intent.putExtra(mrm.KEY_AREA_ID, string3);
        intent.putExtra("addressId", string4);
        String str = "";
        intent.putExtra("params", obj2 != null ? obj2.toString() : str);
        if (obj3 != null) {
            str = obj3.toString();
        }
        intent.putExtra("relatedAuctionParams", str);
        intent.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(iyeVar.a()).sendBroadcast(intent);
    }
}
