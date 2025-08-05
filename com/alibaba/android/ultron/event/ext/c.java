package com.alibaba.android.ultron.event.ext;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import com.taobao.tao.tbmainfragment.TBMainBaseFragment;
import tb.kge;
import tb.ris;

/* loaded from: classes2.dex */
public class c extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1717158510);
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "-5403145042909812304";
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
        } else if (!(eVar.a() instanceof Activity)) {
        } else {
            Activity activity = (Activity) eVar.a();
            if ((activity instanceof FragmentActivity) && (activity instanceof com.taobao.tao.tbmainfragment.e)) {
                ISupportFragment a2 = com.taobao.tao.tbmainfragment.i.a(((FragmentActivity) activity).getSupportFragmentManager());
                if (a2 instanceof TBMainBaseFragment) {
                    ((TBMainBaseFragment) a2).finish();
                    return;
                }
            }
            Boolean bool = e(eVar).getBoolean("animated");
            ((Activity) eVar.a()).finish();
            if (bool != null && !bool.booleanValue()) {
                ((Activity) eVar.a()).overridePendingTransition(0, 0);
            }
            ris risVar = new ris(eVar.a(), "closePage", null);
            JSONObject e = e(eVar);
            if (e == null || !e.containsKey("message")) {
                return;
            }
            risVar.a(e.get("message"));
        }
    }
}
