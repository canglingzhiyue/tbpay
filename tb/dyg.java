package tb;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.d;
import com.taobao.android.detail.core.performance.e;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.performance.preload.c;
import com.taobao.android.detail.core.performance.preload.g;
import com.taobao.android.detail.core.performance.preload.h;
import com.taobao.android.detail.core.performance.preload.k;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.DetailClientDataNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.DetailOptNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class dyg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1142231292);
        emu.a("com.taobao.android.detail.core.detail.controller.DetailResponseDataHelper");
    }

    public static void a(DetailCoreActivity detailCoreActivity, JSONObject jSONObject, b bVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f313cb7", new Object[]{detailCoreActivity, jSONObject, bVar});
        } else if (detailCoreActivity == null) {
            i.c(l.a("DetailResponseDataHelper"), "处理主接口返回的数据不成功：activity为空");
        } else if (bVar == null) {
            i.c(l.a("DetailResponseDataHelper"), "处理主接口返回的数据不成功：nodeBundle为空");
        } else if (bVar.n()) {
            i.c(l.a("DetailResponseDataHelper"), "处理主接口返回的数据不成功：该数据为预加载的数据");
        } else {
            String str2 = detailCoreActivity.f9411a.f27180a;
            if (StringUtils.isEmpty(str2)) {
                i.c(l.a("DetailResponseDataHelper"), "处理主接口返回的数据不成功：itemId为空");
                return;
            }
            String str3 = detailCoreActivity.f9411a.q;
            if (StringUtils.isEmpty(str3)) {
                i.c(l.a("DetailResponseDataHelper"), "处理主接口返回的数据不成功：渠道来源为空");
            } else if (jSONObject == null) {
                i.c(l.a("DetailResponseDataHelper"), "处理主接口返回的数据不成功：dataJson 为空");
            } else {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (jSONObject2 == null) {
                    i.c(l.a("DetailResponseDataHelper"), "处理主接口返回的数据不成功：root data 为空");
                    return;
                }
                JSONObject jSONObject3 = jSONObject2.getJSONObject("item");
                String string = (jSONObject3 == null || jSONObject3.getJSONArray("images") == null || jSONObject3.getJSONArray("images").isEmpty()) ? "" : jSONObject3.getJSONArray("images").getString(0);
                DetailOptNode u = eqb.u(bVar);
                if (u == null) {
                    str = bVar.m() ? c.FINAL_ULTRON : "2.0";
                } else {
                    str = u.detailVersion;
                }
                g.a().d(string);
                g.a().a(str);
                if (detailCoreActivity.m()) {
                    a(detailCoreActivity, str2, str3, string, str);
                }
                if (!e.c(str3)) {
                    i.c(l.a("DetailResponseDataHelper"), "处理主接口返回的数据不成功：不能缓存主请求动态缓存数据");
                    return;
                }
                jSONObject2.put("preload", (Object) true);
                if (c.a(str)) {
                    k.a().a(new h.a().a("refresh").b(eih.a(str3)).c(str2).a(jSONObject).e(str).f(string).g(str3).a());
                    return;
                }
                String a2 = l.a("DetailResponseDataHelper");
                i.c(a2, "保存主接口返回的数据不成功：版本协议不在白名单范围内 protocolVersion：" + str);
            }
        }
    }

    private static void a(Activity activity, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96bf6be2", new Object[]{activity, str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("fromSource", str2);
        hashMap.put(fky.SP_KEY_MAIN_PIC_URL, str3);
        hashMap.put("detailVersion", str4);
        ecf.k(activity, hashMap);
    }

    public static void a(DetailCoreActivity detailCoreActivity, enh enhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587eb124", new Object[]{detailCoreActivity, enhVar});
            return;
        }
        i.c(l.a("DetailResponseDataHelper"), "保存主接口返回的配置操作开始");
        if (detailCoreActivity == null) {
            i.c(l.a("DetailResponseDataHelper"), "保存主接口返回的配置不成功：activity为空");
        } else if (detailCoreActivity.f9411a == null) {
            i.c(l.a("DetailResponseDataHelper"), "保存主接口返回的配置不成功：queryParams为空");
        } else if (enhVar == null) {
            i.c(l.a("DetailResponseDataHelper"), "保存主接口返回的配置不成功：structureResponse为空");
        } else if (enhVar.c == null) {
            i.c(l.a("DetailResponseDataHelper"), "保存主接口返回的配置不成功：structureResponse.mContainerStructure为空");
        } else {
            com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = enhVar.c.f27459a;
            if (cVar == null) {
                i.c(l.a("DetailResponseDataHelper"), "保存主接口返回的配置不成功：nodeBundleWrapper为空");
                return;
            }
            a(cVar);
            a(detailCoreActivity, cVar);
            a(detailCoreActivity, enhVar, cVar);
            a(cVar.f10055a, enhVar);
        }
    }

    private static void a(b bVar, enh enhVar) {
        JSONObject a2;
        JSONObject a3;
        JSONObject jSONObject;
        String a4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9da8233", new Object[]{bVar, enhVar});
        } else if (!god.k || bVar == null) {
        } else {
            try {
                if (!bVar.m() || (a2 = bVar.a()) == null || (a3 = a.a(a2)) == null || (jSONObject = a3.getJSONObject("data")) == null) {
                    return;
                }
                if (enhVar.e) {
                    a4 = a(jSONObject, "detail3Atmosphere", "fields", "backgroundImage");
                } else {
                    a4 = a(jSONObject, "detailPromoteBeltNew", "fields", com.taobao.tao.infoflow.multitab.e.KEY_BG_IMG);
                }
                if (StringUtils.isEmpty(a4)) {
                    return;
                }
                com.taobao.phenix.intf.b.h().a(a4).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: tb.dyg.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.phenix.intf.event.a
                    public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                    }

                    public boolean a(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                        }
                        i.a(l.a("DetailResponseDataHelper"), "腰带图片预取完成");
                        return true;
                    }
                }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: tb.dyg.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.phenix.intf.event.a
                    public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                    }

                    public boolean a(FailPhenixEvent failPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                        }
                        i.a(l.a("DetailResponseDataHelper"), "腰带图片预取失败");
                        return true;
                    }
                }).fetch();
            } catch (Exception e) {
                i.a("DetailResponseDataHelper", "腰带图片获取异常", e);
            }
        }
    }

    private static String a(JSONObject jSONObject, String str, String str2, String str3) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6fa225fa", new Object[]{jSONObject, str, str2, str3});
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject(str);
        if (jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject(str2)) != null) {
            return jSONObject2.getString(str3);
        }
        return null;
    }

    private static void a(DetailCoreActivity detailCoreActivity, enh enhVar, com.taobao.android.detail.datasdk.model.datamodel.node.c cVar) {
        a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4bd791d", new Object[]{detailCoreActivity, enhVar, cVar});
            return;
        }
        try {
            if (!"newDetail".equals(detailCoreActivity.f9411a.q)) {
                return;
            }
            if ((StringUtils.isEmpty(detailCoreActivity.f9411a.D) && StringUtils.isEmpty(detailCoreActivity.f9411a.E)) || (a2 = a.a(cVar, enhVar)) == null) {
                return;
            }
            i.c("DetailResponseDataHelper", "mainPicInfo:" + a2.f27103a + "|" + a2.c + "|" + a2.b);
            i.c("DetailResponseDataHelper", "transPicInfo:" + detailCoreActivity.f9411a.D + "|" + detailCoreActivity.f9411a.E + "|" + detailCoreActivity.f9411a.F);
            ecg.a(detailCoreActivity, detailCoreActivity.f9411a.D, detailCoreActivity.f9411a.E, String.valueOf(detailCoreActivity.f9411a.F), a2.f27103a, a2.c, String.valueOf(a2.b), a2.d);
        } catch (Exception e) {
            i.a("DetailResponseDataHelper", "头图埋点信息异常", e);
        }
    }

    private static void a(DetailCoreActivity detailCoreActivity, com.taobao.android.detail.datasdk.model.datamodel.node.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48302a2c", new Object[]{detailCoreActivity, cVar});
            return;
        }
        String a2 = l.a("DetailResponseDataHelper");
        i.c(a2, "nav预加载总开关:" + eiq.b);
        String a3 = l.a("DetailResponseDataHelper");
        i.c(a3, "批量预加载总开关:" + eiq.b);
        DetailOptNode B = cVar.B();
        if (!eiq.b && !eiq.f27331a) {
            i.c(l.a("DetailResponseDataHelper"), "主接口请求处理之后：预加载总开关关闭 ");
        } else if (B == null) {
            i.c(l.a("DetailResponseDataHelper"), "保存主接口返回的配置不成功：nodeBundleWrapper.getDetailOptNode为空");
        } else {
            eik.a(B);
            i.c(l.a("DetailResponseDataHelper"), "保存主接口返回的配置操作完成");
            if (cVar.f10055a == null) {
                i.c(l.a("DetailResponseDataHelper"), "小雨伞埋点上报不成功：nodeBundleWrapper.nodeBundle为空");
                return;
            }
            String valueOf = String.valueOf(eqb.d(cVar.f10055a).shopType);
            g.a().a(detailCoreActivity.f9411a.f27180a, valueOf, detailCoreActivity);
            g.a().b(detailCoreActivity.f9411a.f27180a, valueOf, detailCoreActivity);
        }
    }

    private static void a(com.taobao.android.detail.datasdk.model.datamodel.node.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c45d761", new Object[]{cVar});
            return;
        }
        DetailClientDataNode C = cVar.C();
        if (C == null) {
            i.c(d.a("DetailResponseDataHelper"), "主接口返回的配置detailClientData为null");
            return;
        }
        DetailClientDataNode.DetailClientOpt detailClientOpt = C.detailClientOpt;
        if (detailClientOpt == null) {
            i.c(d.a("DetailResponseDataHelper"), "主接口返回的配置detailClientOpt为null");
        } else {
            eik.a(detailClientOpt);
        }
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int TYPE_IMAGE = 1;
        public static final int TYPE_VIDEO = 2;

        /* renamed from: a  reason: collision with root package name */
        public String f27103a;
        public int b;
        public String c;
        public String d;

        static {
            kge.a(1529448351);
        }

        public static /* synthetic */ a a(com.taobao.android.detail.datasdk.model.datamodel.node.c cVar, enh enhVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7e2b4ba5", new Object[]{cVar, enhVar}) : b(cVar, enhVar);
        }

        private static a b(com.taobao.android.detail.datasdk.model.datamodel.node.c cVar, enh enhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5c1eb184", new Object[]{cVar, enhVar});
            }
            b bVar = cVar.f10055a;
            if (bVar == null || !bVar.m()) {
                return null;
            }
            if (enhVar.e) {
                return a(enhVar);
            }
            return a(cVar);
        }

        private static a a(com.taobao.android.detail.datasdk.model.datamodel.node.c cVar) {
            JSONObject a2;
            JSONObject a3;
            JSONObject jSONObject;
            JSONObject jSONObject2;
            JSONArray jSONArray;
            JSONArray jSONArray2;
            JSONArray jSONArray3;
            JSONArray jSONArray4;
            JSONArray jSONArray5;
            String string;
            JSONArray jSONArray6;
            JSONObject jSONObject3;
            JSONObject jSONObject4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bf48f4b6", new Object[]{cVar});
            }
            b bVar = cVar.f10055a;
            a aVar = null;
            if (bVar == null || (a2 = bVar.a()) == null || (a3 = a(a2)) == null || (jSONObject = a3.getJSONObject("hierarchy")) == null || (jSONObject2 = jSONObject.getJSONObject("structure")) == null) {
                return null;
            }
            JSONArray jSONArray7 = jSONObject2.getJSONArray("detailInfoAura");
            if (jSONArray7 != null && !jSONArray7.isEmpty() && (jSONArray = jSONObject2.getJSONArray(jSONArray7.getString(0))) != null && !jSONArray.isEmpty() && (jSONArray2 = jSONObject2.getJSONArray(jSONArray.getString(0))) != null && !jSONArray2.isEmpty() && (jSONArray3 = jSONObject2.getJSONArray(jSONArray2.getString(0))) != null && !jSONArray3.isEmpty() && (jSONArray4 = jSONObject2.getJSONArray(jSONArray3.getString(0))) != null && !jSONArray4.isEmpty() && (jSONArray5 = jSONObject2.getJSONArray(jSONArray4.getString(0))) != null && !jSONArray5.isEmpty() && (jSONArray6 = jSONObject2.getJSONArray((string = jSONArray5.getString(0)))) != null && !jSONArray6.isEmpty()) {
                String string2 = jSONArray6.getString(0);
                JSONObject jSONObject5 = a3.getJSONObject("data");
                if (jSONObject5 == null || (jSONObject3 = jSONObject5.getJSONObject(string2)) == null || (jSONObject4 = jSONObject3.getJSONObject("fields")) == null) {
                    return null;
                }
                aVar = new a();
                if ("video".equals(jSONObject4.getString("type"))) {
                    aVar.f27103a = jSONObject4.getString("thumbnailUrl");
                    aVar.b = 2;
                } else {
                    aVar.f27103a = jSONObject4.getString("url");
                    aVar.b = 1;
                }
                aVar.c = a(string, jSONObject5);
                aVar.d = "aura";
            }
            return aVar;
        }

        private static String a(String str, JSONObject jSONObject) {
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9e721362", new Object[]{str, jSONObject});
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject(str);
            return (jSONObject3 == null || (jSONObject2 = jSONObject3.getJSONObject("fields")) == null) ? emh.sDefaultDimension : jSONObject2.getString("dimension");
        }

        private static a a(enh enhVar) {
            JSONObject a2;
            JSONObject jSONObject;
            JSONObject jSONObject2;
            JSONArray jSONArray;
            JSONObject jSONObject3;
            JSONObject jSONObject4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("be5e857e", new Object[]{enhVar});
            }
            JSONObject jSONObject5 = enhVar.d;
            a aVar = null;
            if (jSONObject5 == null || (a2 = a(jSONObject5)) == null || (jSONObject = a2.getJSONObject("model")) == null || (jSONObject2 = jSONObject.getJSONObject("headerPic")) == null) {
                return null;
            }
            JSONArray jSONArray2 = jSONObject2.getJSONArray("groups");
            if (jSONArray2 != null && !jSONArray2.isEmpty()) {
                JSONObject jSONObject6 = jSONArray2.getJSONObject(0);
                if (jSONObject6 == null || (jSONArray = jSONObject6.getJSONArray("items")) == null || (jSONObject3 = jSONArray.getJSONObject(0)) == null) {
                    return null;
                }
                String string = jSONObject3.getString("dimension");
                JSONObject jSONObject7 = jSONObject3.getJSONObject("content");
                if (jSONObject7 == null || (jSONObject4 = jSONObject7.getJSONObject("fields")) == null) {
                    return null;
                }
                aVar = new a();
                aVar.c = string;
                String string2 = jSONObject4.getString("type");
                if ("image".equals(string2)) {
                    aVar.f27103a = jSONObject4.getString("url");
                    aVar.b = 1;
                } else if ("video".equals(string2)) {
                    aVar.f27103a = jSONObject4.getString("thumbnailUrl");
                    aVar.b = 2;
                }
                aVar.d = "3.0";
            }
            return aVar;
        }

        public static JSONObject a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject});
            }
            JSONArray jSONArray = jSONObject.getJSONArray("apiStack");
            if (jSONArray != null) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(0).getJSONObject("value");
                    if (jSONObject2 != null) {
                        return jSONObject2;
                    }
                } catch (Throwable th) {
                    i.a("DetailResponseDataHelper", "v7-|v7协议aliGallery解析异常：", th);
                }
            }
            if (jSONArray == null) {
                return null;
            }
            try {
                JSONObject jSONObject3 = jSONArray.getJSONObject(0).getJSONObject("data");
                if (jSONObject3 == null) {
                    return null;
                }
                return jSONObject3;
            } catch (Throwable th2) {
                i.a("DetailResponseDataHelper", "Aura协议aliGallery解析异常：", th2);
                return null;
            }
        }
    }
}
