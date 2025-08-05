package com.alibaba.android.ultron.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import tb.kge;

/* loaded from: classes2.dex */
public class g extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IS_CHECKED = "isChecked";
    public static final String TAG = "CommonPopSelectSubscriber";

    static {
        kge.a(1011760283);
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        IDMComponent d = eVar.d();
        if (d == null || (fields = d.getFields()) == null) {
            return;
        }
        if (!Boolean.TRUE.toString().equals(fields.getString("isChecked"))) {
            fields.put("isChecked", (Object) Boolean.TRUE.toString());
            d.writeBackFields(fields, true);
        }
        eVar.h().c();
    }
}
