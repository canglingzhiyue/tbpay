package com.alibaba.android.icart.core.event;

import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.alipay.export.CashdeskConstants;
import tb.abj;
import tb.bbx;
import tb.bca;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class c extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-529704907);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        JSONObject c = c();
        String string = c.getString("api");
        String string2 = c.getString("params");
        JSONObject jSONObject = c.getJSONObject("success");
        JSONObject jSONObject2 = c.getJSONObject("fail");
        final String str = "";
        final String string3 = jSONObject != null ? jSONObject.getString("toast") : str;
        if (jSONObject2 != null) {
            str = jSONObject2.getString("toast");
        }
        Intent intent = new Intent();
        intent.setAction(CashdeskConstants.ALIPAY_ACTION);
        intent.setPackage(this.e.getPackageName());
        intent.putExtra("bizType", string);
        intent.putExtra("data", string2);
        this.f25791a.u().startActivityForResult(intent, bbx.REQUEST_ALI_PAY_SERVICE);
        this.f25791a.F().a("cart_activity_result", new com.alibaba.android.ultron.trade.event.d() { // from class: com.alibaba.android.icart.core.event.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.trade.event.d
            public void b(bmz bmzVar2) {
                Context context;
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d08b596a", new Object[]{this, bmzVar2});
                    return;
                }
                this.f.F().c("cart_activity_result", this);
                Integer num = (Integer) bmzVar2.b("requestCode");
                Integer num2 = (Integer) bmzVar2.b("resultCode");
                Intent intent2 = (Intent) bmzVar2.b("data");
                if (intent2 == null || intent2.getExtras() == null || num == null || num2 == null || 50103 != num.intValue() || num2.intValue() != -1) {
                    return;
                }
                if ("0".equals(intent2.getStringExtra("errorCode"))) {
                    JSONObject jSONObject3 = null;
                    try {
                        jSONObject3 = JSONObject.parseObject(intent2.getExtras().getString("result"));
                    } catch (Exception e) {
                        abj.a("AliPayServiceParseJsonError", e);
                    }
                    if (jSONObject3 == null) {
                        return;
                    }
                    if (!"true".equals(jSONObject3.getString("success"))) {
                        if (!"false".equals(jSONObject3.getString("success"))) {
                            return;
                        }
                        com.alibaba.android.icart.core.widget.d.a(this.e, str);
                        return;
                    }
                    context = this.e;
                    str2 = string3;
                } else {
                    context = this.e;
                    str2 = str;
                }
                com.alibaba.android.icart.core.widget.d.a(context, str2);
            }
        });
    }
}
