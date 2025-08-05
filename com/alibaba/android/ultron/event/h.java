package com.alibaba.android.ultron.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class h extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MESSAGE = "message";
    public static final String MESSAGE_TYPE = "type";

    static {
        kge.a(-1573655755);
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        JSONObject fields = b().getFields();
        if (fields == null) {
            return;
        }
        eVar.h().h().a(fields.getString("target"), fields);
    }
}
