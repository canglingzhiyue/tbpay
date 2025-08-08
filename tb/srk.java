package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.bindingx.core.internal.BindingXConstants;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.linked.h;
import com.taobao.mmad.data.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class srk implements srl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<JSONObject> f33861a = new ArrayList();
    private final List<JSONObject> b = new ArrayList();
    private final List<JSONObject> c = new ArrayList();
    private BootImageInfo d;

    static {
        kge.a(-865575464);
        kge.a(-720414177);
    }

    @Override // tb.srl
    public void bN_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca8cecba", new Object[]{this});
            return;
        }
        b(tiq.BIZ_CODE, this.f33861a);
        b("TopView", this.b);
        b("Market", this.c);
        srn.d();
    }

    @Override // tb.srl
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        d();
        if (jSONObject == null) {
            kej.a("2ARCH_BizDataFlow", "updateAwesomeData data null clear data");
            srn.c(tiq.BIZ_CODE);
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("sections");
        if (jSONArray == null || jSONArray.isEmpty()) {
            srn.c(tiq.BIZ_CODE);
            kej.a("2ARCH_BizDataFlow", "updateAwesomeData sections null");
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String c = c(jSONObject2);
            if (StringUtils.equals(c, tiq.BIZ_CODE) && jSONObject2 != null) {
                a(jSONObject, jSONObject2);
                jSONObject2.put(BindingXConstants.KEY_SCENE_TYPE, tiq.BIZ_CODE);
                this.f33861a.add(jSONObject2);
                ssh.a(true);
            }
            if (StringUtils.equals(c, "TopView") && jSONObject2 != null) {
                jSONObject2.put(BindingXConstants.KEY_SCENE_TYPE, "TopView");
                this.b.add(jSONObject2);
                ssh.a(ssh.TOP_VIEW_CACHE, true);
            }
        }
        a(tiq.BIZ_CODE, this.f33861a);
        a("TopView", this.b);
    }

    @Override // tb.srl
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        JSONObject e = e(jSONObject);
        if (e == null) {
            kej.a("2ARCH_BizDataFlow", "updateSplashData base null");
            return;
        }
        JSONObject jSONObject2 = e.getJSONObject("ext");
        if (jSONObject2 == null) {
            return;
        }
        boolean booleanValue = jSONObject2.getBooleanValue("updateTopshowSplash");
        boolean booleanValue2 = jSONObject2.getBooleanValue("updateMarketingSplash");
        JSONObject jSONObject3 = e.getJSONObject("topViewSplashSection");
        if (jSONObject3 == null) {
            if (booleanValue) {
                srn.c(tiq.BIZ_CODE);
            }
            if (booleanValue2) {
                srn.c("Market");
            }
            kej.a("2ARCH_BizDataFlow", "updateSplashData topViewSplash null");
            return;
        }
        h.a("").h().a("Market", "HotStart", keq.SPLASH_REQUEST_SUCCESS, null, null, "");
        if (booleanValue) {
            d();
        }
        if (booleanValue2) {
            e();
        }
        JSONArray jSONArray = jSONObject3.getJSONArray("sections");
        if (jSONArray == null || jSONArray.isEmpty()) {
            kej.a("2ARCH_BizDataFlow", "updateSplashData sections null");
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i);
            String c = c(jSONObject4);
            if (jSONObject4 != null) {
                jSONObject4.put(BindingXConstants.KEY_SCENE_TYPE, (Object) c);
            }
            if (StringUtils.equals(c, tiq.BIZ_CODE) && booleanValue) {
                this.f33861a.add(jSONObject4);
                ssh.a(true);
            }
            if (StringUtils.equals(c, "Market") && booleanValue2) {
                this.c.add(jSONObject4);
                ssh.a(ssh.MARKET_CACHE, true);
            }
        }
        if (booleanValue) {
            a(tiq.BIZ_CODE, this.f33861a);
        }
        if (!booleanValue2) {
            return;
        }
        a("Market", this.c);
    }

    private JSONObject e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("26170924", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            kej.a("2ARCH_BizDataFlow", "updateSplashData data null clear data");
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("containers");
        if (jSONObject2 == null) {
            kej.a("2ARCH_BizDataFlow", "updateSplashData container null");
            return null;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("splash_home_base");
        if (jSONObject3 == null) {
            kej.a("2ARCH_BizDataFlow", "updateSplashData splashHomeBase null");
            return null;
        }
        return jSONObject3.getJSONObject("base");
    }

    public List<JSONObject> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1997438884) {
            if (hashCode != 524744146) {
                if (hashCode == 524834170 && str.equals("TopView")) {
                    c = 1;
                }
            } else if (str.equals(tiq.BIZ_CODE)) {
                c = 0;
            }
        } else if (str.equals("Market")) {
            c = 2;
        }
        if (c == 0) {
            return this.f33861a;
        }
        if (c == 1) {
            return this.b;
        }
        if (c == 2) {
            return this.c;
        }
        return new ArrayList();
    }

    public List<JSONObject> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f33861a);
        arrayList.addAll(this.b);
        arrayList.addAll(this.c);
        return arrayList;
    }

    public void a(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75806d8e", new Object[]{this, bootImageInfo});
        } else {
            this.d = bootImageInfo;
        }
    }

    public BootImageInfo c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BootImageInfo) ipChange.ipc$dispatch("aa3e5b10", new Object[]{this}) : this.d;
    }

    private void a(String str, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, str, list});
        } else if (list == null || list.isEmpty()) {
        } else {
            kej.a("2ARCH_BizDataFlow", "saveData key " + str);
            ssg.a().a(str, list);
            srn.c(str, list);
        }
    }

    private void b(final String str, final List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aab2c64", new Object[]{this, str, list});
        } else {
            ssg.a().a(str, new srm() { // from class: tb.srk.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.srm
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    } else if (StringUtils.isEmpty(str2)) {
                    } else {
                        kej.a("2ARCH_BizDataFlow", "loadFromCache key " + str);
                        try {
                            ArrayList arrayList = (ArrayList) JSON.parseObject(str2, new TypeReference<ArrayList<JSONObject>>() { // from class: tb.srk.1.1
                            }, new Feature[0]);
                            if (arrayList != null && !arrayList.isEmpty()) {
                                list.addAll(arrayList);
                            }
                        } catch (Exception e) {
                            kej.a("2ARCH_BizDataFlow", "loadFromCache error " + str, e);
                        }
                    }
                }
            });
        }
    }

    private String c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6871249a", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            kej.a("2ARCH_BizDataFlow", "getBizType section null");
            return "";
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        if (jSONObject2 == null) {
            kej.a("2ARCH_BizDataFlow", "getBizType ext null");
            return d(jSONObject);
        }
        String string = jSONObject2.getString("businessCode");
        if (StringUtils.isEmpty(string)) {
            return d(jSONObject);
        }
        kej.a("2ARCH_BizDataFlow", "getBizType businessCode " + string);
        char c = 65535;
        int hashCode = string.hashCode();
        if (hashCode != -2119828674) {
            if (hashCode != 571799665) {
                if (hashCode == 1759301740 && string.equals("taobaoTopview")) {
                    c = 1;
                }
            } else if (string.equals("taobaoSplashMarketing")) {
                c = 2;
            }
        } else if (string.equals("taobaoSplashAdv")) {
            c = 0;
        }
        return c != 0 ? c != 1 ? c != 2 ? "" : "Market" : "TopView" : tiq.BIZ_CODE;
    }

    private String d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91c579db", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("subSection");
        if (jSONObject2 == null) {
            kej.a("2ARCH_BizDataFlow", "updateAwesomeData sections null");
            return "";
        } else if (jSONObject2.containsKey("searchText") || jSONObject2.containsKey("popView")) {
            return tiq.BIZ_CODE;
        } else {
            if (jSONObject2.containsKey(b.TYPE_BANNER)) {
                return "TopView";
            }
            kej.a("2ARCH_BizDataFlow", "getBizType ext 为空，且section 不包含 banner/searchText/popView 无法兜底");
            return "";
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.f33861a.clear();
        this.b.clear();
        ssg.a().a(tiq.BIZ_CODE);
        ssg.a().a("TopView");
        srn.c();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.c.clear();
        ssg.a().a("Market");
        srn.b();
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("ext");
        if (jSONObject3 == null) {
            return;
        }
        String string = jSONObject3.getString("advLimitSeconds");
        String string2 = jSONObject3.getString("advLimitInSingleDay");
        JSONObject jSONObject4 = jSONObject2.getJSONObject("ext");
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
        }
        if (!StringUtils.isEmpty(string)) {
            jSONObject4.put("advLimitSeconds", (Object) string);
        }
        if (StringUtils.isEmpty(string2)) {
            return;
        }
        jSONObject4.put("advLimitInSingleDay", (Object) string2);
    }
}
