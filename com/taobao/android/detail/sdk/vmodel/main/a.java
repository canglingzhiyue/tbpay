package com.taobao.android.detail.sdk.vmodel.main;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.util.ArrayList;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class a extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10403a;
    public ArrayList<C0400a> b;
    public String c;
    public int d;

    /* renamed from: com.taobao.android.detail.sdk.vmodel.main.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0400a {

        /* renamed from: a  reason: collision with root package name */
        public String f10405a;
        public String b;

        static {
            kge.a(64272608);
        }

        public C0400a(JSONObject jSONObject) {
            this.f10405a = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getString("portrait"));
            this.b = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getString("subIcon"));
        }
    }

    static {
        kge.a(1189642013);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_AVATAR_GROUPS;
    }

    public a(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        JSONObject jSONObject = componentModel.mapping;
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.AvatarGroupsViewModel");
        if (jSONObject == null) {
            return;
        }
        this.f10403a = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getString("title"));
        this.c = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getString("defaultPortrait"));
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("avatars");
            if (jSONArray != null) {
                this.b = com.taobao.android.detail.sdk.utils.c.a(jSONArray, new com.taobao.android.detail.sdk.utils.g<C0400a>() { // from class: com.taobao.android.detail.sdk.vmodel.main.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.vmodel.main.a$a, java.lang.Object] */
                    @Override // com.taobao.android.detail.sdk.utils.g
                    public /* synthetic */ C0400a b(Object obj) {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                    }

                    public C0400a a(Object obj) {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? (C0400a) ipChange.ipc$dispatch("e3615951", new Object[]{this, obj}) : new C0400a((JSONObject) obj);
                    }
                });
            }
        } catch (Throwable unused) {
        }
        this.d = jSONObject.getIntValue("groupSize");
        ArrayList<C0400a> arrayList = this.b;
        if (arrayList == null) {
            return;
        }
        this.d = Math.max(this.d, arrayList.size());
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : this.d > 0 || !StringUtils.isEmpty(this.f10403a);
    }
}
