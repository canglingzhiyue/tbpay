package com.alibaba.android.icart.core.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bca;
import tb.bei;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class b extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String c;
    private static final String k;

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-275239103);
        c = String.valueOf(true);
        k = String.valueOf(false);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        IDMComponent c2 = bmzVar.c();
        if (c2 == null || this.f25791a == null || (fields = c2.getFields()) == null) {
            return;
        }
        String str = k;
        if (!fields.getBooleanValue("isChecked")) {
            str = c;
        }
        a(c.equals(str));
        fields.put("isChecked", (Object) str);
        c2.writeBackFields(fields, false);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isChecked", String.valueOf(z));
        hashMap.put(bei.KEY_IS_CHECKED_ALL_FROM_NAVIVE, String.valueOf(true));
        b(this.b.e("submit"), hashMap);
    }

    private void b(IDMComponent iDMComponent, Map<String, String> map) {
        List<com.taobao.android.ultron.common.model.b> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8516051a", new Object[]{this, iDMComponent, map});
        } else if (iDMComponent != null && iDMComponent.getEventMap() != null && (list = iDMComponent.getEventMap().get("checkClick")) != null && !list.isEmpty()) {
            for (com.taobao.android.ultron.common.model.b bVar : list) {
                bmz a2 = this.f25791a.F().a();
                a2.a(bVar.getType());
                a2.a(iDMComponent);
                a2.c("checkClick");
                a2.a(bVar);
                a2.a((Map<? extends String, ? extends Object>) map);
                this.f25791a.F().a(a2);
            }
        }
    }
}
