package com.alibaba.android.ultron.event.ext;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class d extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1737813754);
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "2110231699696052179";
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
            return;
        }
        JSONObject e = e(eVar);
        if (e == null || !e.containsKey("value")) {
            return;
        }
        Context a2 = eVar.a();
        ((ClipboardManager) a2.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("OrderId", e.get("value").toString()));
        com.alibaba.android.ultron.vfw.widget.a.a(a2, com.alibaba.ability.localization.b.a(R.string.order_biz_copy_success));
    }
}
