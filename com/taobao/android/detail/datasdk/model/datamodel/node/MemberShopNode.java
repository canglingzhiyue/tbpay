package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import tb.emu;
import tb.epw;
import tb.kge;

/* loaded from: classes4.dex */
public class MemberShopNode extends DetailNode {
    public boolean loginMember;
    public String memberShopDesc;
    public String memberShopEnterUrl;
    public String memberShopIcon;
    public String memberShopName;
    public String reqMeberRightUrl;

    static {
        kge.a(-713348353);
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
        this.memberShopDesc = epw.a(jSONObject.getString("memberShopDesc"));
        this.memberShopEnterUrl = epw.a(jSONObject.getString("memberShopEnterUrl"));
        this.memberShopIcon = epw.a(jSONObject.getString("memberShopIcon"));
        this.memberShopName = epw.a(jSONObject.getString("memberShopName"));
        this.reqMeberRightUrl = epw.a(jSONObject.getString("memberShopName"));
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.MemberShopNode");
    }
}
