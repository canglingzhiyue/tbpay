package com.taobao.tao.recommend3.newface.gateway.action;

import android.content.Context;
import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import tb.gjv;
import tb.gkc;
import tb.gke;
import tb.kge;

/* loaded from: classes.dex */
public class h implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f20941a;

    static {
        kge.a(1471300686);
        kge.a(1464465151);
    }

    public static /* synthetic */ Context a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("4fbc906b", new Object[]{hVar}) : hVar.f20941a;
    }

    public h(Context context) {
        this.f20941a = null;
        this.f20941a = context.getApplicationContext();
    }

    @Override // tb.gke
    public void a(JSONObject jSONObject, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
            return;
        }
        if (this.f20941a == null && gjv.f28356a != null) {
            this.f20941a = gjv.f28356a.getApplicationContext();
        }
        Context context = this.f20941a;
        if (context == null) {
            return;
        }
        new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.taobao.tao.recommend3.newface.gateway.action.h.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String a2 = com.taobao.android.home.component.utils.j.a("promotionFailedTipContent", h.a(h.this).getResources().getString(R.string.homepage_promote_tab_switch_error_toast));
                if (StringUtils.isEmpty(a2)) {
                    return;
                }
                TBToast.makeText(h.a(h.this), a2, 2000L).show();
            }
        });
    }
}
