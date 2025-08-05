package tb;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.d;
import com.taobao.android.external.e;
import com.taobao.android.home.component.utils.h;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService;
import com.taobao.taolive.room.utils.aw;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class liw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IS_FIRST_APPEAR = "isFirstAppear";
    public static final String UT_LOG_MAP = "utLogMap";

    static {
        kge.a(51984916);
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{jSONObject, jSONObject2});
            return;
        }
        String str3 = null;
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject.getJSONObject("args");
        if (jSONObject4 != null) {
            jSONObject3.put(aw.PARAM_PVID, (Object) jSONObject4.getString(aw.PARAM_PVID));
            jSONObject3.put("spm", (Object) jSONObject4.getString("spm"));
            JSONObject jSONObject5 = jSONObject4.getJSONObject("utLogMapEdge");
            if (jSONObject5 != null) {
                jSONObject3.put(kox.X_OBJECT_ID, (Object) jSONObject5.getString(kox.X_OBJECT_ID));
            } else {
                String string = jSONObject4.getString("utLogMap");
                try {
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject3.put(kox.X_OBJECT_ID, (Object) JSONObject.parseObject(URLDecoder.decode(string, "utf-8")).getString(kox.X_OBJECT_ID));
                    }
                } catch (UnsupportedEncodingException e) {
                    ldf.a("BxUserTrack", "utLogMap catch decode error", e);
                } catch (NullPointerException e2) {
                    ldf.a("BxUserTrack", "utLogMap catch npe error", e2);
                }
            }
        }
        JSONObject jSONObject6 = jSONObject2.getJSONObject("clickParam");
        if (jSONObject6 != null) {
            str3 = jSONObject6.getString("itemId");
            str = jSONObject6.getString("arg1");
            str2 = jSONObject6.getString("page");
        } else {
            str = "click_recommend_item";
            str2 = "Page_Home";
        }
        lda.a(str2, str, str3, jSONObject3);
    }

    public static void a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2eb5403", new Object[]{ljsVar});
        } else {
            lda.a(ljsVar.a().c(), "Button-Top", null, null);
        }
    }

    public static void b(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("525e83a9", new Object[]{jSONObject, jSONObject2});
            return;
        }
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = jSONObject.getJSONObject("args");
        if (jSONObject5 != null) {
            jSONObject4.put(aw.PARAM_PVID, (Object) jSONObject5.getString(aw.PARAM_PVID));
        }
        Object a2 = lja.a("item.0.clickParam.itemId", jSONObject);
        String str2 = "";
        String str3 = a2 instanceof String ? (String) a2 : str2;
        if (jSONObject2 == null || (jSONObject3 = jSONObject2.getJSONObject("clickParam")) == null) {
            str = "click_recommend_item_similar";
        } else {
            str = jSONObject3.getString("arg1");
            str2 = jSONObject3.getString("page");
        }
        lda.a(str2, str, str3, jSONObject4);
    }

    public static void a(JSONObject jSONObject) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
            return;
        }
        String str3 = null;
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject.getJSONObject("args");
        if (jSONObject3 != null) {
            jSONObject2.put(aw.PARAM_PVID, (Object) jSONObject3.getString(aw.PARAM_PVID));
        }
        Object a2 = lja.a("item.0.clickParam.itemId", jSONObject);
        if (a2 instanceof String) {
            str3 = (String) a2;
        }
        Object a3 = lja.a("subSection.overlay.exposureParam", jSONObject);
        if (a3 instanceof JSONObject) {
            JSONObject jSONObject4 = (JSONObject) a3;
            str = jSONObject4.getString("arg1");
            str2 = jSONObject4.getString("page");
        } else {
            str = "click_recommend_item_overlay";
            str2 = "";
        }
        lda.a(str2, str, str3, jSONObject2);
    }

    public static void a(ljs ljsVar, BaseSectionModel<?> baseSectionModel, JSONObject jSONObject) {
        String str;
        String str2;
        JSONObject jSONObject2;
        BaseSectionModel<?> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc3a885", new Object[]{ljsVar, baseSectionModel, jSONObject});
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (baseSectionModel.getJSONObject("args") != null) {
            jSONObject3.put(aw.PARAM_PVID, (Object) baseSectionModel.getJSONObject("args").getString(aw.PARAM_PVID));
        }
        String a3 = a(baseSectionModel);
        if (TextUtils.isEmpty(a3) && (a2 = a(ljsVar, baseSectionModel)) != null) {
            a3 = a(a2);
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("clickParam")) == null) {
            str = "click_recommend_item_delete";
            str2 = "";
        } else {
            str = jSONObject2.getString("arg1");
            str2 = jSONObject2.getString("page");
            JSONObject jSONObject4 = jSONObject2.getJSONObject("args");
            if (jSONObject4 != null) {
                jSONObject3.put("reasonArgs", (Object) jSONObject4.getString("reasonArgs"));
            }
        }
        lda.a(str2, str, a3, jSONObject3);
    }

    public static void a(ljr ljrVar, int i, int i2, List<e> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c20fe6f0", new Object[]{ljrVar, new Integer(i), new Integer(i2), list, map});
        } else {
            lda.a(ljrVar.c(), ljrVar.a(), i, i2, list, map);
        }
    }

    public static void b(ljr ljrVar, int i, int i2, List<e> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b87748f", new Object[]{ljrVar, new Integer(i), new Integer(i2), list, map});
        } else {
            lda.b(ljrVar.c(), ljrVar.a(), i, i2, list, map);
        }
    }

    public static void c(ljr ljrVar, int i, int i2, List<e> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ff022e", new Object[]{ljrVar, new Integer(i), new Integer(i2), list, map});
        } else {
            lda.c(ljrVar.c(), ljrVar.a(), i, i2, list, map);
        }
    }

    public static void a(JSONObject jSONObject, View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a361362a", new Object[]{jSONObject, view, new Integer(i), new Integer(i2)});
        } else if (jSONObject == null) {
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            JSONObject jSONObject3 = new JSONObject(10);
            if (!b(jSONObject)) {
                return;
            }
            if (jSONObject2 != null) {
                jSONObject3.put("spm", (Object) jSONObject2.getString("spm"));
                jSONObject3.put("scm", (Object) jSONObject2.getString("scm"));
                jSONObject3.put("guess_buckets", (Object) jSONObject2.getString("guess_buckets"));
                jSONObject3.put("index", jSONObject2.get("index"));
                jSONObject3.put("realExposeIndex", jSONObject2.get("realExposeIndex"));
                jSONObject3.put("recIndex", jSONObject2.get("recIndex"));
            }
            jSONObject3.put("infoFlowIndex", (Object) Integer.valueOf(i - i2));
            jSONObject3.put("isFirstAppear", (Object) Boolean.valueOf(jSONObject.getBooleanValue("isFirstAppear")));
            JSONObject jSONObject4 = jSONObject.getJSONObject(h.TRACK_EXPOSURE_PARAM);
            if (jSONObject4 == null) {
                return;
            }
            lda.a(jSONObject4.getString("page"), jSONObject4.getString("arg1"), "", view, jSONObject3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(com.alibaba.fastjson.JSONObject r9, android.view.View r10, int r11, int r12) {
        /*
            java.lang.String r0 = "spm"
            java.lang.String r1 = "realExposeIndex"
            java.lang.String r2 = ""
            com.android.alibaba.ip.runtime.IpChange r3 = tb.liw.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L2d
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r9
            r9 = 1
            r0[r9] = r10
            r9 = 2
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r11)
            r0[r9] = r10
            r9 = 3
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r12)
            r0[r9] = r10
            java.lang.String r9 = "b41702eb"
            r3.ipc$dispatch(r9, r0)
            return
        L2d:
            if (r9 != 0) goto L30
            return
        L30:
            java.lang.String r3 = "args"
            com.alibaba.fastjson.JSONObject r3 = r9.getJSONObject(r3)
            if (r3 != 0) goto L39
            return
        L39:
            boolean r4 = b(r9)
            if (r4 != 0) goto L40
            return
        L40:
            java.lang.String r4 = "utLogMapEdge"
            com.alibaba.fastjson.JSONObject r4 = r3.getJSONObject(r4)
            if (r4 != 0) goto L4a
            return
        L4a:
            com.alibaba.fastjson.JSONObject r5 = new com.alibaba.fastjson.JSONObject
            r5.<init>()
            java.lang.String r6 = "x_item_ids"
            java.lang.String r6 = r4.getString(r6)     // Catch: java.lang.Throwable -> L91
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L92
            if (r7 == 0) goto L63
            java.lang.String r7 = "x_object_id"
            java.lang.String r6 = r4.getString(r7)     // Catch: java.lang.Throwable -> L92
        L63:
            tb.liu r7 = new tb.liu     // Catch: java.lang.Throwable -> L92
            r7.<init>(r10, r6)     // Catch: java.lang.Throwable -> L92
            r10.post(r7)     // Catch: java.lang.Throwable -> L92
            java.lang.String r7 = "itemId"
            r5.put(r7, r6)     // Catch: java.lang.Throwable -> L92
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L92
            r5.put(r1, r7)     // Catch: java.lang.Throwable -> L92
            java.lang.String r7 = "itemType"
            java.lang.String r8 = "x_object_type"
            java.lang.String r8 = r4.getString(r8)     // Catch: java.lang.Throwable -> L92
            r5.put(r7, r8)     // Catch: java.lang.Throwable -> L92
            java.lang.String r7 = "utLogMap"
            r5.put(r7, r4)     // Catch: java.lang.Throwable -> L92
            java.lang.String r4 = r3.getString(r0)     // Catch: java.lang.Throwable -> L92
            r5.put(r0, r4)     // Catch: java.lang.Throwable -> L92
            goto L9e
        L91:
            r6 = r2
        L92:
            java.lang.String r0 = "trackRecyclerViewScroll utLogMap"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r4 = "BxUserTrack"
            tb.ldf.d(r4, r0)
        L9e:
            int r11 = r11 - r12
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r12 = "infoFlowIndex"
            r5.put(r12, r11)
            java.lang.String r11 = "isFirstAppear"
            boolean r12 = r9.getBooleanValue(r11)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r5.put(r11, r12)
            java.lang.String r11 = "index"
            java.lang.Object r12 = r3.get(r11)
            r5.put(r11, r12)
            java.lang.Object r11 = r3.get(r1)
            r5.put(r1, r11)
            java.lang.String r11 = "recIndex"
            java.lang.Object r12 = r3.get(r11)
            r5.put(r11, r12)
            java.lang.String r11 = "exposureParam"
            com.alibaba.fastjson.JSONObject r9 = r9.getJSONObject(r11)
            if (r9 == 0) goto Le4
            java.lang.String r11 = "arg1"
            java.lang.String r2 = r9.getString(r11)
            java.lang.String r11 = "page"
            java.lang.String r9 = r9.getString(r11)
            goto Le5
        Le4:
            r9 = r2
        Le5:
            tb.lda.a(r9, r2, r6, r10, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.liw.b(com.alibaba.fastjson.JSONObject, android.view.View, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(com.alibaba.fastjson.JSONObject r19, android.view.View r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.liw.c(com.alibaba.fastjson.JSONObject, android.view.View, int, int):void");
    }

    public static void a(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5d0b6a", new Object[]{str, str2, str3, jSONObject});
        } else {
            lda.a(str, str2, str3, jSONObject);
        }
    }

    public static d a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("eb4883c8", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        d dVar = new d();
        dVar.f12313a = iArr[0];
        dVar.b = iArr[1];
        dVar.c = view.getMeasuredWidth();
        dVar.d = view.getMeasuredHeight();
        return dVar;
    }

    private static BaseSectionModel<?> a(ljs ljsVar, BaseSectionModel<?> baseSectionModel) {
        ICardOverlayService iCardOverlayService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("226db133", new Object[]{ljsVar, baseSectionModel});
        }
        if (ljsVar != null && (iCardOverlayService = (ICardOverlayService) ljsVar.a(ICardOverlayService.class)) != null) {
            return iCardOverlayService.findHostCard(baseSectionModel);
        }
        return null;
    }

    private static String a(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9bc5cf0", new Object[]{baseSectionModel});
        }
        Object a2 = lja.a("item.0.clickParam.itemId", baseSectionModel);
        return a2 instanceof String ? (String) a2 : "";
    }

    private static boolean b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("ext")) != null) {
            if (TextUtils.equals(jSONObject2.getString("kSectionHasBxAppeared"), "1")) {
                return false;
            }
            jSONObject2.put("kSectionHasBxAppeared", "1");
        }
        return true;
    }
}
