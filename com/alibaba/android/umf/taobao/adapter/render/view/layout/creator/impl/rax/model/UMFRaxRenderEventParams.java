package com.alibaba.android.umf.taobao.adapter.render.view.layout.creator.impl.rax.model;

import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class UMFRaxRenderEventParams {
    @JSONField(name = "componentKey")
    public String componentKey;
    @JSONField(name = "event")
    public String event;
    @JSONField(name = "eventPayload")
    public List<Event> eventPayload;

    static {
        kge.a(-1525034900);
    }
}
