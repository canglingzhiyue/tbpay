package com.taobao.android.sku.bizevent;

import com.alibaba.android.ultron.event.p;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.j;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes6.dex */
public class d extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "sku_openUrl";

    static {
        kge.a(266936383);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        if (str.hashCode() == -1814481661) {
            super.a((com.alibaba.android.ultron.event.base.e) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.event.p, com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
        } else if (eVar != null) {
            ArrayList arrayList = new ArrayList();
            Object[] objArr = (Object[]) eVar.d("extraParams");
            if (objArr != null && objArr.length > 1) {
                int length = objArr.length;
                for (int i = 1; i < length; i++) {
                    arrayList.add(objArr[i]);
                }
            }
            com.taobao.android.ultron.common.model.b b = b();
            if (b == null || (fields = b.getFields()) == null || fields.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(arrayList.get(i2));
            }
            JSONObject parseObject = JSONObject.parseObject(fields.toJSONString());
            j.a(new JSONObject(), arrayList2, parseObject);
            eVar.a(new DMEvent(b.getType(), parseObject, b.getComponents()));
            super.a(eVar);
        }
    }
}
