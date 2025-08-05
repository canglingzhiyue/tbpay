package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.h;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.detail.datasdk.model.datamodel.template.LayoutModel;
import com.taobao.android.detail.datasdk.model.datamodel.template.RuleModel;
import com.taobao.tao.navigation.model.NavigationTabConstraints;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class eni implements enf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f27462a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;
    public static String g;
    public static String h;
    private static volatile eni p;
    public HashMap<String, HashMap<String, RuleModel>> i;
    public HashMap<String, ActionModel> j;
    private jko k;
    private volatile String l;
    private volatile String m;
    private volatile String n;
    private volatile String o;
    private Context q;

    @Override // tb.enf
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "ruleId";
    }

    static {
        kge.a(1795932758);
        kge.a(2146655042);
        f27462a = "x_template_layout_default.json";
        b = "x_template_map_rule.json";
        c = "x_template_map_action.json";
        d = "x_template_map_theme.json";
        e = "";
        f = "TB1MvEKJWSWBuNjSsrbhA10mVXa";
        g = "TB14WV.AuGSBuNjSspbhA3iipXa";
        h = "TB1MfiMsQyWBuNjy0FphA1ssXXa";
    }

    private eni(Context context) {
        this.q = context;
        emu.a("com.taobao.android.detail.datasdk.engine.structure.ProtocolManager");
    }

    public static eni a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eni) ipChange.ipc$dispatch("34c2d946", new Object[]{context});
        }
        if (p == null) {
            synchronized (eni.class) {
                if (p == null) {
                    p = new eni(context);
                }
            }
        }
        return p;
    }

    @Override // tb.enf
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : emx.c(this.q);
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : (this.l == null || !this.l.equals(str) || this.k == null) ? false : true;
    }

    public synchronized void a(jko jkoVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a1a3414", new Object[]{this, jkoVar, str});
        } else if (b(str)) {
        } else {
            this.l = str;
            this.k = jkoVar;
        }
    }

    public jko c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jko) ipChange.ipc$dispatch("1e69be4e", new Object[]{this}) : this.k;
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue() : (this.m == null || !this.m.equals(str) || this.i == null) ? false : true;
    }

    public void a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{this, jSONObject, str});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            synchronized (eni.class) {
                if (c(str)) {
                    epp.a("DETAIL_DEBUG", " ruleMapping already exist");
                    return;
                }
                this.m = str;
                final epy<RuleModel> epyVar = new epy<RuleModel>() { // from class: tb.eni.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.template.RuleModel, java.lang.Object] */
                    @Override // tb.epy
                    public /* synthetic */ RuleModel b(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                    }

                    public RuleModel a(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (RuleModel) ipChange2.ipc$dispatch("44684b89", new Object[]{this, obj}) : new RuleModel((JSONObject) obj);
                    }
                };
                this.i = epw.a(jSONObject, new epy<HashMap<String, RuleModel>>() { // from class: tb.eni.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.HashMap<java.lang.String, com.taobao.android.detail.datasdk.model.datamodel.template.RuleModel>, java.lang.Object] */
                    @Override // tb.epy
                    public /* synthetic */ HashMap<String, RuleModel> b(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                    }

                    public HashMap<String, RuleModel> a(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (HashMap) ipChange2.ipc$dispatch("30a1bea7", new Object[]{this, obj}) : epw.a((JSONObject) obj, epyVar);
                    }
                });
            }
        }
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue() : (this.n == null || !this.n.equals(str) || this.j == null) ? false : true;
    }

    public void b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("493da631", new Object[]{this, jSONObject, str});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            synchronized (eni.class) {
                if (d(str)) {
                    epp.a("DETAIL_DEBUG", " actionMapping already exist");
                    return;
                }
                this.n = str;
                this.j = epw.a(jSONObject, new epy<ActionModel>() { // from class: tb.eni.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel, java.lang.Object] */
                    @Override // tb.epy
                    public /* synthetic */ ActionModel b(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                    }

                    public ActionModel a(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (ActionModel) ipChange2.ipc$dispatch("344c7c83", new Object[]{this, obj}) : new ActionModel((JSONObject) obj);
                    }
                });
            }
        }
    }

    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue() : this.o != null && this.o.equals(str);
    }

    public void c(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a73f910", new Object[]{this, jSONObject, str});
        } else if (e(str)) {
            epp.a("DETAIL_DEBUG", " themeMapping already exist");
        } else {
            synchronized (eni.class) {
                rlz.a().a(jSONObject, "cidToSidMap", "styleCollection", str, (rlv) null);
            }
        }
    }

    public LayoutModel a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LayoutModel) ipChange.ipc$dispatch("f5f174b3", new Object[]{this, jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray(NavigationTabConstraints.TAB_BIZ_HOMEPAGE);
        if (jSONArray == null) {
            return null;
        }
        eqc.a(this.q, "mCreateLayoutModel", "创建dinamic模板");
        LayoutModel layoutModel = new LayoutModel();
        layoutModel.components = new ArrayList<>();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            ComponentModel componentModel = new ComponentModel((JSONObject) it.next(), this);
            if ("main_layout".equals(componentModel.ID)) {
                layoutModel.components.addAll(componentModel.children);
            } else if ("navi_bar".equals(componentModel.ID)) {
                layoutModel.actionBar = componentModel;
            } else if (h.bottomBarArea.equals(componentModel.ID)) {
                layoutModel.bottomBar = componentModel;
            } else if ("pic_gallery".equals(componentModel.ID)) {
                layoutModel.components.add(0, componentModel);
            }
        }
        eqc.b(this.q, "mCreateLayoutModel");
        return layoutModel;
    }

    @Override // tb.enf
    public RuleModel a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuleModel) ipChange.ipc$dispatch("fc17d351", new Object[]{this, str, str2});
        }
        if (eqg.a(this.i) || TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap<String, RuleModel> hashMap = this.i.get(str);
        if (eqg.a(hashMap)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "default";
        }
        return hashMap.get(str2);
    }

    @Override // tb.enf
    public ActionModel a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionModel) ipChange.ipc$dispatch("2f654ad5", new Object[]{this, str});
        }
        if (eqg.a(this.j) || TextUtils.isEmpty(str)) {
            return null;
        }
        return new ActionModel(this.j.get(str));
    }

    public static boolean a(Context context, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("840caf8a", new Object[]{context, str, obj})).booleanValue();
        }
        if (biy.a()) {
            return biy.a(str, obj);
        }
        return b(context, str, obj);
    }

    private static boolean b(Context context, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee3c37a9", new Object[]{context, str, obj})).booleanValue();
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

    public HashMap<String, HashMap<String, RuleModel>> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("9d11238e", new Object[]{this}) : this.i;
    }
}
