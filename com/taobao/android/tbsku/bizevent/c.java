package com.taobao.android.tbsku.bizevent;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbsku.image.l;
import java.util.List;
import tb.iyb;
import tb.iyd;
import tb.iye;
import tb.kge;

/* loaded from: classes6.dex */
public class c implements iyd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "click_main_pic_event";

    static {
        kge.a(1259080158);
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
        JSONObject b = iyeVar.b();
        if (b == null || b.isEmpty() || (jSONObject = b.getJSONObject("fields")) == null || jSONObject.isEmpty()) {
            return;
        }
        List c = iyeVar.c();
        if (c != null && c.size() > 0 && (c.get(0) instanceof JSONObject)) {
            new com.taobao.android.tbsku.dialog.b(iyeVar.a(), (JSONObject) c.get(0), jSONObject.getJSONArray("imageInfoList"), iybVar).a();
            return;
        }
        String string = jSONObject.getString("mainPic");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        String string2 = jSONObject.getString("mainDesc");
        if (TextUtils.isEmpty(string2)) {
            string2 = "";
        }
        String string3 = jSONObject.getString("mainPVId");
        if (TextUtils.isEmpty(string3)) {
            string3 = "";
        }
        l lVar = new l();
        lVar.f15430a = string;
        lVar.b = string2;
        lVar.c = string3;
        new com.taobao.android.tbsku.dialog.b(iyeVar.a(), lVar, jSONObject.getJSONArray("imageInfoList"), iybVar).a();
    }
}
