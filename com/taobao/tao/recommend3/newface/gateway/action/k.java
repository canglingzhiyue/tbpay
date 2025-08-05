package com.taobao.tao.recommend3.newface.gateway.action;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import tb.gkc;
import tb.gke;
import tb.kge;
import tb.ope;
import tb.oqc;

/* loaded from: classes8.dex */
public class k implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1139542460);
        kge.a(1464465151);
    }

    @Override // tb.gke
    public void a(JSONObject jSONObject, gkc gkcVar) {
        JSONObject c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
            return;
        }
        ope f = com.taobao.tao.homepage.d.f(oqc.a().l());
        if (f == null || (c = f.c()) == null) {
            return;
        }
        final String a2 = a(c, jSONObject);
        if (TextUtils.isEmpty(a2)) {
            com.taobao.android.home.component.utils.e.e("NewFaceToastAction", "toastText is empty");
        } else {
            com.taobao.gateway.dispatch.a.b().c(new Runnable() { // from class: com.taobao.tao.recommend3.newface.gateway.action.k.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TBToast.makeText(com.taobao.tao.homepage.launcher.g.a(), a2, 2000L).show();
                    }
                }
            });
        }
    }

    private String a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47450138", new Object[]{this, jSONObject, jSONObject2});
        }
        try {
            JSONObject jSONObject4 = jSONObject.getJSONObject("toasts");
            if (jSONObject4 == null) {
                return null;
            }
            String string = jSONObject2.getString(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE);
            if (TextUtils.isEmpty(string) || (jSONObject3 = jSONObject4.getJSONObject(string)) == null) {
                return null;
            }
            String string2 = jSONObject2.getString("toastType");
            if (!TextUtils.isEmpty(string2)) {
                return jSONObject3.getString(string2);
            }
            return null;
        } catch (Exception e) {
            com.taobao.android.home.component.utils.e.b("NewFaceToastAction", e, new String[0]);
            return null;
        }
    }
}
