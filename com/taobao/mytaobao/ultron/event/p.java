package com.taobao.mytaobao.ultron.event;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class p extends com.alibaba.android.ultron.event.q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "userTapRecorder";

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.mytaobao.ultron.model.c f18514a;

    static {
        kge.a(-1609688176);
    }

    public p(com.taobao.mytaobao.ultron.model.c cVar) {
        this.f18514a = cVar;
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        JSONObject c = c();
        if (c == null) {
            com.alibaba.android.ultron.ext.event.util.c.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "error: eventFields is null");
            return;
        }
        String string = c.getString("identifier");
        if (StringUtils.isEmpty(string)) {
            return;
        }
        this.f18514a.a(string);
    }
}
