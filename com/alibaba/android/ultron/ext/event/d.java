package com.alibaba.android.ultron.ext.event;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class d extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1132854458);
    }

    @Override // com.alibaba.android.ultron.ext.event.j
    public void a_(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4329866", new Object[]{this, eVar});
            return;
        }
        String str = (String) a(1);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.g.getFields() != null && this.g.getFields().containsKey("selectedId") && str.equals(this.g.getFields().getString("selectedId"))) {
            hashMap.put("selectedId", "-1");
        } else {
            hashMap.put("selectedId", str);
        }
        a(this.g, hashMap);
        if (!(eVar.h() instanceof com.alibaba.android.ultron.vfw.instance.d)) {
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(eVar.d());
        eVar.h().a(arrayList);
    }
}
