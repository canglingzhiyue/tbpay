package com.taobao.android.detail.sdk.structure;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.template.ActionModel;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.model.template.LayoutModel;
import com.taobao.android.detail.sdk.model.template.RuleModel;
import com.taobao.android.detail.sdk.utils.j;
import com.taobao.tao.navigation.model.NavigationTabConstraints;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import tb.ewu;
import tb.jjt;
import tb.jjv;
import tb.jko;
import tb.kge;
import tb.rlv;
import tb.rlz;
import tb.tpc;

/* loaded from: classes4.dex */
public class h implements IProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f10336a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;
    public static String g;
    public static String h;
    private static volatile h o;
    public HashMap<String, HashMap<String, RuleModel>> i;
    public HashMap<String, ActionModel> j;
    private jko k;
    private String l;
    private String m;
    private String n;

    @Override // com.taobao.android.detail.sdk.structure.IProtocol
    public String getRuleIdKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4ab3347", new Object[]{this}) : "ruleId";
    }

    static {
        kge.a(242611129);
        kge.a(1168839397);
        f10336a = "template_layout_default.json";
        b = "template_map_rule.json";
        c = "template_map_action.json";
        d = "template_map_theme.json";
        e = "TB1823tQFXXXXXJXpXXhA1h2FXX";
        f = "TB1Qsd8RpXXXXc5aXXXhA1h2FXX";
        g = "TB1BdqbRpXXXXcWaXXXhA1h2FXX";
        h = "TB1XhKSRpXXXXczXXXXhA1h2FXX";
        tpc.a("com.taobao.android.detail.sdk.structure.ProtocolManager");
    }

    private h() {
        tpc.a("com.taobao.android.detail.sdk.structure.ProtocolManager");
    }

    public static h a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("ecf4234d", new Object[0]);
        }
        if (o == null) {
            synchronized (h.class) {
                if (o == null) {
                    o = new h();
                }
            }
        }
        return o;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        String str2 = this.l;
        return (str2 == null || !str2.equals(str) || this.k == null) ? false : true;
    }

    public jko b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jko) ipChange.ipc$dispatch("16b818ef", new Object[]{this}) : this.k;
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        String str2 = this.m;
        return (str2 == null || !str2.equals(str) || this.i == null) ? false : true;
    }

    public synchronized void a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{this, jSONObject, str});
            return;
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            if (b(str)) {
                Log.e("DETAIL_DEBUG", " ruleMapping already exist");
                return;
            }
            this.m = str;
            final com.taobao.android.detail.sdk.utils.g<RuleModel> gVar = new com.taobao.android.detail.sdk.utils.g<RuleModel>() { // from class: com.taobao.android.detail.sdk.structure.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.sdk.model.template.RuleModel] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ RuleModel b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public RuleModel a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (RuleModel) ipChange2.ipc$dispatch("281c2843", new Object[]{this, obj}) : new RuleModel((JSONObject) obj);
                }
            };
            this.i = com.taobao.android.detail.sdk.utils.c.a(jSONObject, new com.taobao.android.detail.sdk.utils.g<HashMap<String, RuleModel>>() { // from class: com.taobao.android.detail.sdk.structure.h.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.HashMap<java.lang.String, com.taobao.android.detail.sdk.model.template.RuleModel>] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ HashMap<String, RuleModel> b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public HashMap<String, RuleModel> a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (HashMap) ipChange2.ipc$dispatch("30a1bea7", new Object[]{this, obj}) : com.taobao.android.detail.sdk.utils.c.a((JSONObject) obj, gVar);
                }
            });
        }
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        String str2 = this.n;
        return (str2 == null || !str2.equals(str) || this.j == null) ? false : true;
    }

    public synchronized void b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("493da631", new Object[]{this, jSONObject, str});
            return;
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            if (c(str)) {
                Log.e("DETAIL_DEBUG", " actionMapping already exist");
                return;
            }
            this.n = str;
            this.j = com.taobao.android.detail.sdk.utils.c.a(jSONObject, new com.taobao.android.detail.sdk.utils.g<ActionModel>() { // from class: com.taobao.android.detail.sdk.structure.h.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.sdk.model.template.ActionModel] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ ActionModel b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public ActionModel a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (ActionModel) ipChange2.ipc$dispatch("fa7c12bd", new Object[]{this, obj}) : new ActionModel((JSONObject) obj);
                }
            });
        }
    }

    public synchronized void c(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a73f910", new Object[]{this, jSONObject, str});
        } else {
            rlz.a().a(jSONObject, "cidToSidMap", "styleCollection", str, (rlv) null);
        }
    }

    public LayoutModel a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LayoutModel) ipChange.ipc$dispatch("4cef63ed", new Object[]{this, jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray(NavigationTabConstraints.TAB_BIZ_HOMEPAGE);
        if (jSONArray == null) {
            return null;
        }
        j.a("mCreateLayoutModel");
        LayoutModel layoutModel = new LayoutModel();
        layoutModel.components = new ArrayList<>();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            ComponentModel componentModel = new ComponentModel((JSONObject) it.next(), this);
            if ("main_layout".equals(componentModel.ID)) {
                layoutModel.components.addAll(componentModel.children);
            } else if ("navi_bar".equals(componentModel.ID)) {
                layoutModel.actionBar = componentModel;
            } else if (com.alibaba.triver.triver_shop.newShop.data.h.bottomBarArea.equals(componentModel.ID)) {
                layoutModel.bottomBar = componentModel;
            } else if ("pic_gallery".equals(componentModel.ID)) {
                layoutModel.components.add(0, componentModel);
            }
        }
        j.b("mCreateLayoutModel");
        return layoutModel;
    }

    @Override // com.taobao.android.detail.sdk.structure.IProtocol
    public RuleModel findRuleById(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuleModel) ipChange.ipc$dispatch("c224d7e5", new Object[]{this, str, str2});
        }
        if (ewu.a(this.i) || TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap<String, RuleModel> hashMap = this.i.get(str);
        if (ewu.a(hashMap)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "default";
        }
        return hashMap.get(str2);
    }

    @Override // com.taobao.android.detail.sdk.structure.IProtocol
    public ActionModel findActionByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionModel) ipChange.ipc$dispatch("ff1c0777", new Object[]{this, str});
        }
        if (ewu.a(this.j) || TextUtils.isEmpty(str)) {
            return null;
        }
        return new ActionModel(this.j.get(str));
    }

    public static boolean a(Context context, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("840caf8a", new Object[]{context, str, obj})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        Object a2 = jjv.a(obj, str);
        if (a2 != null) {
            return jjt.a(context).a(a2.toString());
        }
        return false;
    }
}
