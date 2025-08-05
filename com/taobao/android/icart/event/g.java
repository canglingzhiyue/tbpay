package com.taobao.android.icart.event;

import android.content.Intent;
import android.os.Bundle;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayList;
import tb.bca;
import tb.bmz;
import tb.kge;

/* loaded from: classes5.dex */
public class g extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Integer c;

    public static /* synthetic */ Integer f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("78dabfd4", new Object[0]) : c;
    }

    static {
        kge.a(1803509660);
        c = 4097;
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(final bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
        } else if (this.h == null) {
            UnifyLog.d("CartShowIndustrySkuSubscriber;", "onHandleEvent mComponent=null");
        } else {
            JSONObject c2 = c();
            if (c2 == null) {
                return;
            }
            String string = c2.getString("url");
            String string2 = c2.getString("params");
            final IDMComponent iDMComponent = this.h;
            this.f25791a.F().b("cart_activity_result", new bca() { // from class: com.taobao.android.icart.event.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.ultron.trade.event.d
                public void b(bmz bmzVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d08b596a", new Object[]{this, bmzVar2});
                        return;
                    }
                    Object b = bmzVar2.b("requestCode");
                    Object b2 = bmzVar2.b("resultCode");
                    Object b3 = bmzVar2.b("data");
                    if (!(b instanceof Integer) || !(b2 instanceof Integer) || !(b3 instanceof Intent)) {
                        return;
                    }
                    int intValue = ((Integer) b).intValue();
                    int intValue2 = ((Integer) b2).intValue();
                    Intent intent = (Intent) b3;
                    if (intValue != g.f().intValue() || intValue2 != -1) {
                        return;
                    }
                    JSONObject parseObject = JSON.parseObject(intent.getStringExtra("params"));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("skuExtParams", (Object) parseObject);
                    bmzVar.a("skuExtParams", jSONObject);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(iDMComponent.getKey());
                    bmzVar.a("operateItems", arrayList);
                    bmzVar.a("_isSupportChangeIDMEvent", true);
                    this.f25791a.a(iDMComponent, bmzVar, true, null, null);
                }
            });
            Bundle bundle = new Bundle();
            bundle.putString("contentData", string2);
            Nav.from(this.e).withFragment(this.f25791a.u()).withExtras(bundle).forResult(c.intValue()).toUri(string);
        }
    }
}
