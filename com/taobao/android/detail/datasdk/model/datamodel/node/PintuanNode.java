package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoliveSearchHotWords;
import tb.emu;
import tb.epw;
import tb.kge;

/* loaded from: classes4.dex */
public class PintuanNode extends DetailNode {
    public static final String GROUP_STATUS_WAITING = "GROUP_WAITING";
    public long endTimeMillis;
    public String groupId;
    public String groupSize;
    public String groupStatus;
    public String hint;
    public String joinedCount;
    public boolean order;

    static {
        kge.a(13654296);
    }

    public PintuanNode(JSONObject jSONObject) {
        super(jSONObject);
        this.groupId = epw.a(jSONObject.getString("groupId"));
        this.groupSize = epw.a(jSONObject.getString("groupSize"));
        this.joinedCount = epw.a(jSONObject.getString("joinedCount"));
        this.endTimeMillis = jSONObject.getLongValue("endTimeMillis");
        this.groupStatus = epw.a(jSONObject.getString("groupStatus"));
        this.hint = epw.a(jSONObject.getString(TaoliveSearchHotWords.TYPE_HINT));
        this.order = jSONObject.getBooleanValue("order");
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.PintuanNode");
    }
}
