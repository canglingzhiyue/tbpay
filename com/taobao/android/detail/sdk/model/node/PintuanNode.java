package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoliveSearchHotWords;
import tb.kge;
import tb.tpc;

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
        kge.a(452499742);
    }

    public PintuanNode(JSONObject jSONObject) {
        super(jSONObject);
        this.groupId = c.a(jSONObject.getString("groupId"));
        this.groupSize = c.a(jSONObject.getString("groupSize"));
        this.joinedCount = c.a(jSONObject.getString("joinedCount"));
        this.endTimeMillis = jSONObject.getLongValue("endTimeMillis");
        this.groupStatus = c.a(jSONObject.getString("groupStatus"));
        this.hint = c.a(jSONObject.getString(TaoliveSearchHotWords.TYPE_HINT));
        this.order = jSONObject.getBooleanValue("order");
        tpc.a("com.taobao.android.detail.sdk.model.node.PintuanNode");
    }
}
