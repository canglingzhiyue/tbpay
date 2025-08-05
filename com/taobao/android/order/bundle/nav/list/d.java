package com.taobao.android.order.bundle.nav.list;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import tb.hxd;
import tb.hyk;
import tb.hyn;
import tb.hyq;
import tb.ibm;
import tb.kge;

/* loaded from: classes.dex */
public class d extends com.taobao.android.order.bundle.nav.a<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f14564a = "ListV2ToV1ToH5Task";

    static {
        kge.a(-466229751);
    }

    @Override // com.taobao.android.order.bundle.nav.b
    public /* synthetic */ boolean c(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a8844ca", new Object[]{this, obj})).booleanValue() : b((Intent) obj);
    }

    @Override // com.taobao.android.order.bundle.nav.a
    public boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue() : "TBOrderListActivity".equals(hxd.c(intent));
    }

    public boolean b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15320aa", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null) {
            return false;
        }
        String g = hyk.g();
        if (TextUtils.isEmpty(g)) {
            c.a(10, intent, "degradeUrl is empty");
            return false;
        }
        String g2 = com.taobao.android.order.bundle.helper.g.g(intent);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tabCode", (Object) g2);
        Uri parse = Uri.parse(ibm.a(g, jSONObject));
        intent.setData(parse);
        c.a(10, intent);
        String[] strArr = new String[1];
        strArr[0] = parse != null ? parse.toString() : "";
        hyn.a(CoreConstants.NAV_TAG, "ListV2ToV1ToH5Task", strArr);
        hyq.a("ListV2ToV1ToH5Task", "V2-downGrade-OLH5", "V2-downGrade-OLH5");
        return true;
    }
}
