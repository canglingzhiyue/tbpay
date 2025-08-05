package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.detail.sdk.utils.c;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class MemberShopNode extends DetailNode {
    public boolean loginMember;
    public String memberShopDesc;
    public String memberShopEnterUrl;
    public String memberShopIcon;
    public String memberShopName;
    public String reqMeberRightUrl;

    static {
        kge.a(-949115591);
    }

    public MemberShopNode(JSONObject jSONObject) {
        super(jSONObject);
        this.loginMember = false;
        this.memberShopDesc = "";
        this.memberShopEnterUrl = "";
        this.memberShopIcon = "";
        this.memberShopName = "";
        this.reqMeberRightUrl = "";
        this.loginMember = jSONObject.getBoolean("loginMember").booleanValue();
        this.memberShopDesc = c.a(jSONObject.getString("memberShopDesc"));
        this.memberShopEnterUrl = c.a(jSONObject.getString("memberShopEnterUrl"));
        this.memberShopIcon = c.a(jSONObject.getString("memberShopIcon"));
        this.memberShopName = c.a(jSONObject.getString("memberShopName"));
        this.reqMeberRightUrl = c.a(jSONObject.getString("memberShopName"));
        tpc.a("com.taobao.android.detail.sdk.model.node.MemberShopNode");
    }
}
