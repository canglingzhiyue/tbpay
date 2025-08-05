package com.taobao.android.detail.core.aura.wrapper;

import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.fastjson.JSONObject;

/* loaded from: classes4.dex */
public class AliDetailDataUtil$7 extends JSONObject {
    public final /* synthetic */ Event val$event;

    public AliDetailDataUtil$7(Event event) {
        this.val$event = event;
        put("type", (Object) this.val$event.type);
        put("fields", (Object) this.val$event.fields);
    }
}
