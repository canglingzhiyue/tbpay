package com.taobao.android.detail.mainpic;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.android.aura.service.event.AURAEventKey;
import com.alibaba.android.ultron.engine.utils.a;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.annotation.AliSDetailScaleType;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.GalleryNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.SellerNode;
import com.taobao.android.detail.mainpic.model.b;
import com.taobao.android.detail.wrapper.industry.maingallery.render.component.vessel.bridge.TBDetailPicGalleryBridge;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.epo;
import tb.eqb;
import tb.euq;
import tb.eut;
import tb.euw;
import tb.fho;
import tb.jpe;
import tb.jpy;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject A;
    public JSONObject B;
    public JSONArray C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public Map<Integer, List<b>> T;

    /* renamed from: a  reason: collision with root package name */
    public g f10145a;
    public JSONObject b;
    public com.taobao.android.detail.datasdk.model.datamodel.node.b c;
    public com.taobao.android.detail.mainpic.model.d d;
    public JSONObject n;
    public JSONObject r;
    public JSONObject s;
    public JSONObject t;
    public JSONArray u;
    public JSONObject v;
    public JSONObject w;
    public long x;
    public JSONObject y;
    public JSONObject z;
    public int e = 1;
    public int f = 0;
    public int g = 1;
    public int h = 1;
    public int i = 1;
    public int j = 1;
    public int k = 1;
    public boolean l = false;
    public HashMap<String, String> m = new HashMap<>();
    public List<com.taobao.android.detail.mainpic.model.c> o = new ArrayList();
    public HashMap<String, List<com.taobao.android.detail.mainpic.model.c>> p = new HashMap<>();
    public List<MtopBusiness> q = new ArrayList();

    public static /* synthetic */ void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("200d42bd", new Object[]{eVar});
        } else {
            eVar.r();
        }
    }

    public e(g gVar) {
        this.f10145a = gVar;
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        this.y = euq.a(this.f10145a.e(), "mainPicShellProtocol.json");
        JSONObject jSONObject = this.y;
        if (jSONObject == null) {
            euw.a(euw.ERROR_CODE_LOCAL_TEMPLATE_ERROR, (g) null);
            return;
        }
        this.z = jSONObject.getJSONObject("protocol");
        this.A = this.z.getJSONObject("data").getJSONObject("hierarchy").getJSONObject("structure");
        this.B = this.z.getJSONObject("data").getJSONObject("data");
        this.C = this.z.getJSONObject("data").getJSONObject("container").getJSONArray("data");
        this.D = this.B.getJSONObject("mainpicRoot_1").toJSONString();
        this.E = this.y.getJSONObject("frame_shell").toJSONString();
        this.F = this.y.getJSONObject("mainpicImg_shell").toJSONString();
        this.G = this.y.getJSONObject("mainpicVideo_shell").toJSONString();
        this.H = this.y.getJSONObject("mainpicDinamicX_shell").toJSONString();
        this.I = this.y.getJSONObject("mainpicBottomBar_shell").toJSONString();
        this.J = this.y.getJSONObject("mainpicLocators_shell").toJSONString();
        this.K = this.y.getJSONObject("mainpicVideoNoLightoff_shell").toJSONString();
        this.L = this.y.getJSONObject("lightoff_root_shell").toJSONString();
        this.M = this.y.getJSONObject("lightoff_frame_shell").toJSONString();
        this.N = this.y.getJSONObject("lightoff_mainpicImg_shell").toJSONString();
        this.O = this.y.getJSONObject("lightoff_mainpicVideo_shell").toJSONString();
        this.P = this.y.getJSONObject("frameFloatData_shell").toJSONString();
        this.Q = this.y.getJSONObject("weexContainer_data").toJSONString();
        this.R = this.y.getJSONObject("dxContainer_data").toJSONString();
        this.S = this.y.getJSONObject("openRateEvent").toJSONString();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e = 1;
        this.f = 0;
        this.g = 1;
        this.h = 1;
        this.i = 1;
        this.j = 1;
        this.k = 1;
        this.l = false;
        this.o.clear();
        this.p.clear();
        for (MtopBusiness mtopBusiness : this.q) {
            if (mtopBusiness != null) {
                mtopBusiness.cancelRequest();
            }
        }
        this.q.clear();
        this.x = System.currentTimeMillis();
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.x;
    }

    private String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            return jSONObject.getString(fho.KEY_CONTAINER_DIMENSION);
        }
        return null;
    }

    public JSONObject a(com.taobao.android.detail.mainpic.model.d dVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        e eVar = this;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("822f148c", new Object[]{eVar, dVar, jSONObject});
        }
        p();
        String str = null;
        if (dVar == null || eVar.y == null) {
            return null;
        }
        com.taobao.android.detail.mainpic.model.d dVar2 = eVar.d;
        if (dVar2 != null && StringUtils.equals(eVar.a(dVar2), a(dVar)) && eVar.w == jSONObject) {
            return null;
        }
        eVar.d = dVar;
        eVar.w = jSONObject;
        a();
        JSONObject d = eVar.d.d();
        JSONObject e = eVar.d.e();
        String b = eVar.d.b();
        String c = eVar.d.c();
        String a2 = eVar.d.a();
        if (d == null || b == null || a2 == null) {
            UnifyLog.d("MainPicDataManager", "PicGalleryModel has null node");
        }
        JSONObject jSONObject3 = d.getJSONObject("picGallery");
        if (jSONObject3 != null) {
            jpy.a(jSONObject, jSONObject3);
        }
        if (jSONObject3 != null && jSONObject3.containsKey("extraData")) {
            eVar.T = eVar.a(jSONObject3.getJSONArray("extraData"));
            eVar.b(eVar.T);
        }
        if (jSONObject3 != null && jSONObject3.containsKey("delta")) {
            eVar.a(jSONObject3.getJSONArray("delta"), jSONObject3.getJSONObject("template"));
        }
        eVar.b(jSONObject3);
        if (c() && jSONObject3 != null && jSONObject3.containsKey(WXBasicComponentType.INDICATOR)) {
            eVar.v = jSONObject3.getJSONObject(WXBasicComponentType.INDICATOR);
            eVar.a(eVar.v, dVar.h());
        }
        String str2 = "video";
        if (d != null && !a.a(d.getJSONArray("videos"))) {
            Iterator<Object> it = d.getJSONArray("videos").iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject4 = (JSONObject) next;
                    String string = jSONObject4.getString("url");
                    String string2 = jSONObject4.getString("videoThumbnailURL");
                    String string3 = jSONObject4.getString("videoId");
                    String string4 = jSONObject4.getString("videoModel");
                    String string5 = jSONObject4.getString("spatialVideoDimension");
                    a(eVar.E, eVar.e, eVar.a(str2), eVar.B, eVar.A);
                    a(eVar.G, eVar.h, string, string2, string5, string3, b, c, a2, eVar.e, eVar.B, eVar.A, "normal", null, string4);
                    eVar = this;
                    eVar.a(eVar.M, eVar.e, eVar.B, eVar.A);
                    a(eVar.O, eVar.h, string, string2, string5, string3, b, c, a2, eVar.e, eVar.B, eVar.A, "normal", string4);
                    eVar.a(eVar.e);
                    eVar.e++;
                    eVar.h++;
                    eVar.i++;
                    eVar.b(eVar.T);
                    str = string5;
                    str2 = str2;
                    e = e;
                    d = d;
                }
            }
        }
        String str3 = str2;
        JSONObject jSONObject5 = e;
        JSONObject jSONObject6 = d;
        float f = 1.0f;
        String a3 = eVar.a(jSONObject6);
        if (!StringUtils.isEmpty(a3)) {
            str = a3;
        }
        if (!StringUtils.isEmpty(str)) {
            if (com.taobao.android.detail2.core.framework.base.media.frame.b.VALUE_THREE_FOUR_RATIO.equals(str)) {
                f = 0.75f;
            } else {
                float a4 = euq.a(str);
                if (a4 != -1.0f) {
                    f = a4;
                }
            }
        }
        String string6 = jSONObject6.getString("imageModel");
        if (AliSDetailScaleType.centerCrop.equals(string6)) {
            string6 = "auto_crop";
        }
        String str4 = string6;
        String str5 = "mainpicRoot_1";
        eVar.B.put(str5, JSONObject.parse(String.format(eVar.D, Float.valueOf(f))));
        if (jSONObject6 != null && !a.a(jSONObject6.getJSONArray("images"))) {
            Iterator<Object> it2 = jSONObject6.getJSONArray("images").iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (next2 instanceof String) {
                    String str6 = (String) next2;
                    if (!StringUtils.isEmpty(str6)) {
                        a(eVar.E, eVar.e, eVar.a("image"), eVar.B, eVar.A);
                        a(eVar.F, eVar.g, str4, str6, "", b, c, a2, eVar.e, eVar.B, eVar.A, "normal", null);
                        eVar.a(eVar.M, eVar.e, eVar.B, eVar.A);
                        a(eVar.N, eVar.g, str6, "", b, c, a2, eVar.e, eVar.B, eVar.A, "normal");
                        eVar.a(eVar.e);
                        eVar.e++;
                        eVar.g++;
                        eVar.j++;
                        eVar.b(eVar.T);
                        str5 = str5;
                    }
                }
            }
        }
        eVar.B.putAll((Map) JSONObject.parse(eVar.L));
        ((JSONArray) eVar.A.get(str5)).add("lightoffRoot_1");
        if (jSONObject5 != null && jSONObject5.getJSONArray("right") != null) {
            JSONArray jSONArray = jSONObject5.getJSONArray("right");
            if (!jSONArray.isEmpty()) {
                Object obj = jSONArray.get(0);
                if ((obj instanceof JSONObject) && (jSONObject2 = ((JSONObject) obj).getJSONObject("content")) != null && str3.equals(jSONObject2.getString("type"))) {
                    a(jSONObject2.getJSONObject("data"), eVar.E, eVar.K, b, c, a2);
                }
            }
        }
        eVar.a(eVar.T);
        eVar.b = eVar.z;
        return eVar.b;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 100313435) {
            if (hashCode == 112202875 && str.equals("video")) {
                c = 0;
            }
        } else if (str.equals("image")) {
            c = 1;
        }
        if (c != 0) {
            if (c != 1) {
                return "";
            }
        } else if (this.i == 1) {
            return "item";
        }
        return (this.j == 1 && this.i == 1) ? "item" : "";
    }

    public JSONObject a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2eacd761", new Object[]{this, bVar, new Integer(i)});
        }
        p();
        if (this.y == null || bVar == null) {
            return null;
        }
        this.c = bVar;
        ItemNode c = eqb.c(bVar);
        SellerNode d = eqb.d(bVar);
        GalleryNode b = eqb.b(bVar);
        RateNode k = eqb.k(bVar);
        FeatureNode f = eqb.f(bVar);
        com.taobao.android.detail.mainpic.model.d dVar = new com.taobao.android.detail.mainpic.model.d();
        dVar.a(c.itemId);
        dVar.e(d.shopId);
        dVar.b(d.userId);
        dVar.d(d.shopTypeOriginal);
        dVar.c(epo.g().e());
        dVar.a(c.getData());
        dVar.b(b.getData());
        dVar.c(k.getData());
        dVar.a(i);
        this.m.put("item_id", dVar.a());
        this.m.put("user_id", dVar.c());
        this.m.put("shop_id", dVar.g());
        this.m.put("seller_id", dVar.b());
        h k2 = this.f10145a.k();
        if (k2 != null) {
            k2.c = f.abNewMainPicVideoMemPlay;
        }
        return a(dVar, bVar.a());
    }

    private Map<Integer, List<b>> a(JSONArray jSONArray) {
        b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("edb7bbc5", new Object[]{this, jSONArray});
        }
        HashMap hashMap = new HashMap();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof JSONObject) && (a2 = b.a((JSONObject) next)) != null) {
                List list = (List) hashMap.get(Integer.valueOf(a2.e()));
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(Integer.valueOf(a2.e()), list);
                }
                list.add(a2);
                euw.a(this.f10145a, a2.f(), a2.a(), a2.c(), a2.e());
            }
        }
        return hashMap;
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject != null && jSONObject.containsKey(WXBasicComponentType.INDICATOR)) {
            this.l = true;
        } else {
            this.l = false;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.l;
    }

    private void a(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a78e87b", new Object[]{this, jSONObject, new Integer(i)});
        } else if (jSONObject == null) {
            UnifyLog.d("MainPicDataManager", "锚点节点为空");
        } else {
            this.u = jSONObject.getJSONArray("locators");
            JSONArray jSONArray = this.u;
            if (jSONArray == null || jSONArray.size() == 0) {
                UnifyLog.d("MainPicDataManager", "锚点数组为空");
                return;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.u.size(); i3++) {
                if (eut.a(this.u.getJSONObject(i3))) {
                    i2++;
                }
            }
            euw.a(this.f10145a, this.u, i2);
            if (i2 < 2) {
                return;
            }
            JSONObject parseObject = JSON.parseObject(this.J);
            if (parseObject != null) {
                parseObject.getJSONObject("mainpicLocators").getJSONObject("fields").put("locators", (Object) this.u);
                parseObject.getJSONObject("mainpicLocators").getJSONObject("events").put(AURAEventKey.exposureItem, (Object) jSONObject.getJSONArray(AURAEventKey.exposureItem));
                this.B.putAll(parseObject);
            }
            JSONObject jSONObject2 = (JSONObject) JSONObject.parse(this.I);
            jSONObject2.getJSONObject("mainpicBottomBar").getJSONObject("fields").put(com.taobao.tao.infoflow.multitab.e.KEY_BG_COLOR, (Object) jSONObject.getString(com.taobao.tao.infoflow.multitab.e.KEY_BG_COLOR));
            if (i >= 0) {
                jSONObject2.getJSONObject("mainpicBottomBar").getJSONObject("fields").put(com.taobao.android.detail.mainpic.holder.g.f, (Object) Integer.valueOf(i));
            }
            this.B.putAll(jSONObject2);
            ((JSONArray) this.A.get("mainpicRoot_1")).add("mainpicBottomBar");
            ((JSONArray) this.A.get("mainpicBottomBar")).add("mainpicLocators");
        }
    }

    private void a(Map<Integer, List<b>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            a(map.get(-1));
        }
    }

    private void b(Map<Integer, List<b>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (map == null) {
        } else {
            a(map.get(Integer.valueOf((this.e - 1) - this.f)));
        }
    }

    private void a(List<b> list) {
        e eVar = this;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{eVar, list});
        } else if (list != null && !list.isEmpty()) {
            for (b bVar : list) {
                String a2 = bVar.a();
                JSONObject b = bVar.b();
                if ("video".equals(a2)) {
                    String string = b.getString("url");
                    String string2 = b.getString("videoThumbnailURL");
                    String string3 = b.getString("spatialVideoDimension");
                    String string4 = b.getString("videoModel");
                    String string5 = b.getString("videoId");
                    String c = bVar.c();
                    JSONObject d = bVar.d();
                    String f = bVar.f();
                    JSONObject g = bVar.g();
                    a(eVar.E, eVar.e, f, eVar.B, eVar.A);
                    a(eVar.G, eVar.h, string, string2, string3, string5, h(), k(), d(), eVar.e, eVar.B, eVar.A, "detailInsert", g, string4);
                    eVar = this;
                    eVar.a(c, d, eVar.e);
                    if (bVar.h()) {
                        eVar.a(eVar.M, eVar.e, eVar.B, eVar.A);
                        a(eVar.O, eVar.h, string, string2, string3, string5, h(), k(), d(), eVar.e, eVar.B, eVar.A, "detailInsert", string4);
                    }
                    eVar.e++;
                    eVar.h++;
                    eVar.f++;
                } else if ("image".equals(a2)) {
                    String string6 = b.getString("url");
                    String string7 = b.getString("type");
                    String c2 = bVar.c();
                    String string8 = b.getString("contentMode");
                    JSONObject d2 = bVar.d();
                    String f2 = bVar.f();
                    JSONObject g2 = bVar.g();
                    a(eVar.E, eVar.e, f2, eVar.B, eVar.A);
                    a(eVar.F, eVar.g, string8, string6, string7, h(), k(), d(), eVar.e, eVar.B, eVar.A, "detailInsert", g2);
                    eVar.a(c2, d2, eVar.e);
                    if (bVar.h() && !StringUtils.equals(string7, "apng")) {
                        eVar.a(eVar.M, eVar.e, eVar.B, eVar.A);
                        a(eVar.N, eVar.g, string6, string7, h(), k(), d(), eVar.e, eVar.B, eVar.A, "detailInsert");
                    }
                    eVar.e++;
                    eVar.g++;
                    eVar.f++;
                } else if ("dinamicx".equals(a2)) {
                    String string9 = b.getString("url");
                    String string10 = b.getString("name");
                    String string11 = b.getString("version");
                    JSONObject jSONObject = b.getJSONObject("fields");
                    JSONObject g3 = bVar.g();
                    String c3 = bVar.c();
                    JSONObject d3 = bVar.d();
                    a(eVar.E, eVar.e, bVar.f(), eVar.B, eVar.A);
                    com.taobao.android.detail.mainpic.model.a aVar = new com.taobao.android.detail.mainpic.model.a();
                    aVar.a(string10);
                    aVar.c(string9);
                    aVar.b(string11);
                    a(eVar.H, eVar.k, jSONObject, g3, aVar, eVar.e, eVar.B, eVar.A);
                    eVar.a(c3, d3, eVar.e);
                    eVar.e++;
                    eVar.k++;
                    eVar.f++;
                } else {
                    PopStrategy.IDENTIFIER_FLOAT.equals(a2);
                }
            }
        }
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48168760", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                com.taobao.android.detail.mainpic.model.c a2 = com.taobao.android.detail.mainpic.model.c.a((JSONObject) next);
                String g = a2.g();
                if (g != null) {
                    List<com.taobao.android.detail.mainpic.model.c> list = this.p.get(g);
                    if (list == null) {
                        list = new ArrayList<>();
                        this.p.put(g, list);
                    }
                    list.add(a2);
                }
                this.o.add(a2);
            }
        }
        this.r = jSONObject;
        if (!this.p.isEmpty()) {
            q();
        } else {
            r();
        }
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (!this.p.isEmpty()) {
            for (Map.Entry<String, List<com.taobao.android.detail.mainpic.model.c>> entry : this.p.entrySet()) {
                final String key = entry.getKey();
                final List<com.taobao.android.detail.mainpic.model.c> value = entry.getValue();
                JSONObject jSONObject = (JSONObject) JSONObject.parse(key);
                String string = jSONObject.getString("apiMethod");
                String string2 = jSONObject.getString("apiVersion");
                boolean equals = "true".equals(jSONObject.getString("usePost"));
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (StringUtils.isEmpty(string) || StringUtils.isEmpty(string2)) {
                    UnifyLog.d("MainPicDataManager", "error: apiMethod or apiVersion is null");
                } else {
                    MtopRequest mtopRequest = new MtopRequest();
                    JSONObject jSONObject3 = new JSONObject();
                    if (jSONObject2 != null) {
                        jSONObject3.putAll(jSONObject2);
                    }
                    mtopRequest.setApiName(string);
                    mtopRequest.setVersion(string2);
                    mtopRequest.setData(jSONObject3.toJSONString());
                    MtopBusiness build = MtopBusiness.build(mtopRequest);
                    build.mo1305reqMethod(equals ? MethodEnum.POST : MethodEnum.GET);
                    build.mo1337addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.android.detail.mainpic.MainPicDataManager$1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                                return;
                            }
                            UnifyLog.d("MainPicDataManager", mtopResponse.getApi() + " onSystemError: " + mtopResponse.getRetMsg());
                            e.this.p.remove(key);
                            e.a(e.this);
                            euw.a(e.this.f10145a, mtopResponse.getApi(), mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                                return;
                            }
                            JSONObject a2 = euq.a(mtopResponse);
                            if (a2 != null) {
                                UnifyLog.d("MainPicDataManager", mtopResponse.getApi() + " onSuccess: " + a2.toJSONString());
                            }
                            e.this.p.remove(key);
                            for (com.taobao.android.detail.mainpic.model.c cVar : value) {
                                Object a3 = jpe.a((Object) a2, String.format("${%s}", cVar.d()), false);
                                if (a3 instanceof JSONObject) {
                                    try {
                                        cVar.b((JSONObject) a3);
                                    } catch (Exception e) {
                                        UnifyLog.d("MainPicDataManager", "sendDeltaRequest exception:" + Log.getStackTraceString(e));
                                    }
                                }
                            }
                            e.a(e.this);
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onError(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                                return;
                            }
                            UnifyLog.d("MainPicDataManager", mtopResponse.getApi() + " onError: " + mtopResponse.getRetMsg());
                            e.this.p.remove(key);
                            e.a(e.this);
                            euw.a(e.this.f10145a, mtopResponse.getApi(), mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                        }
                    });
                    UnifyLog.d("MainPicDataManager", "sendDeltaRequest execute: " + mtopRequest.toString());
                    this.q.add(build);
                    build.startRequest();
                }
            }
        }
    }

    private void r() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        UnifyLog.d("MainPicDataManager", "processIntactDeltaProtocol");
        if (!this.p.isEmpty()) {
            UnifyLog.d("MainPicDataManager", "needRequestDeltaMap is not empty");
            return;
        }
        this.s = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (com.taobao.android.detail.mainpic.model.c cVar : this.o) {
            if (cVar.h() != null) {
                this.s.putAll(cVar.h());
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("target", (Object) cVar.b());
            jSONObject2.put("opType", (Object) cVar.c());
            jSONObject2.put("position", (Object) cVar.e());
            jSONObject2.put(com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SOURCE_PARENT, (Object) cVar.f());
            jSONArray.add(jSONObject2);
        }
        JSONObject jSONObject3 = this.r.getJSONObject("hierarchy");
        if (jSONObject3 == null) {
            UnifyLog.d("MainPicDataManager", "template hierarchy is null!");
            return;
        }
        if (c()) {
            b(jSONArray);
        }
        jSONObject3.put("delta", (Object) jSONArray);
        Object a2 = jpe.a((Object) this.s, this.r.toJSONString().replace("$picGallery{", "${"), false);
        if (!(a2 instanceof String)) {
            return;
        }
        UnifyLog.d("MainPicDataManager", "异步协议生成结果：" + a2);
        try {
            jSONObject = (JSONObject) JSONObject.parse((String) a2);
        } catch (Exception e) {
            UnifyLog.d("MainPicDataManager", "voData替换表达式转json出错: " + Log.getStackTraceString(e));
            jSONObject = null;
        }
        try {
            d(jSONObject);
        } catch (Exception e2) {
            UnifyLog.d("MainPicDataManager", "协议渲染失败: " + Log.getStackTraceString(e2));
        }
        c(jSONObject);
    }

    private void c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("hierarchy")) != null && (jSONArray = jSONObject2.getJSONArray("delta")) != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                euw.a(this.f10145a, jSONArray.getJSONObject(i));
            }
        }
    }

    private void b(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1467911", new Object[]{this, jSONArray});
            return;
        }
        JSONObject jSONObject = this.r.getJSONObject("data");
        if (jSONObject == null) {
            UnifyLog.d("MainPicDataManager", "template data is null!");
            return;
        }
        JSONArray jSONArray2 = this.u;
        if (jSONArray2 == null) {
            UnifyLog.d("MainPicDataManager", "mLocators is null!");
            return;
        }
        try {
            this.u = JSONArray.parseArray(jSONArray2.toJSONString().replace("$picGallery{", "${"));
            this.u = (JSONArray) jpy.a(this.s, this.u);
        } catch (Exception e) {
            UnifyLog.d("MainPicDataManager", "generateBottomDelta json parse error: " + Log.getStackTraceString(e));
        }
        if (this.u == null) {
            UnifyLog.d("MainPicDataManager", "mLocators is null!");
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.u.size(); i2++) {
            if (eut.a(this.u.getJSONObject(i2))) {
                i++;
            }
        }
        if (i < 2) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("target", (Object) "mainpicBottomBar");
            jSONObject2.put("opType", (Object) "delete");
            jSONObject2.put(com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SOURCE_PARENT, (Object) "mainpicRoot_1");
            jSONArray.add(jSONObject2);
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("target", (Object) "mainpicLocators");
        jSONObject3.put("opType", (Object) "replace");
        jSONObject3.put(com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SOURCE_PARENT, (Object) "mainpicBottomBar");
        jSONArray.add(jSONObject3);
        JSONObject jSONObject4 = this.B.getJSONObject("mainpicLocators");
        jSONObject4.getJSONObject("fields").put("locators", (Object) this.u);
        jSONObject.put("mainpicLocators", (Object) jSONObject4);
    }

    private void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
        } else {
            this.f10145a.a(jSONObject);
        }
    }

    private void a(String str, int i, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25501fdb", new Object[]{this, str, new Integer(i), str2, jSONObject, jSONObject2});
            return;
        }
        String format = String.format(str, Integer.valueOf(i), Integer.valueOf(i));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("locator", (Object) str2);
        Object a2 = jpe.a((Object) jSONObject3, format, false);
        try {
            if (a2 instanceof String) {
                jSONObject.putAll((JSONObject) JSONObject.parse((String) a2));
            }
        } catch (Exception e) {
            UnifyLog.d("MainPicDataManager", "createFrameData json parse error: " + Log.getStackTraceString(e));
            euw.b(this.f10145a, "createFrameData", Log.getStackTraceString(e));
        }
        ((JSONArray) jSONObject2.get("mainpicRoot_1")).add("mainpicFrame_" + i);
    }

    private void a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12d4c2d1", new Object[]{this, str, new Integer(i), jSONObject, jSONObject2});
            return;
        }
        try {
            jSONObject.putAll((JSONObject) JSONObject.parse(String.format(str, Integer.valueOf(i), Integer.valueOf(i))));
        } catch (Exception e) {
            UnifyLog.d("MainPicDataManager", "createLightoffFrameData json parse error: " + Log.getStackTraceString(e));
            euw.b(this.f10145a, "createLightoffFrameData", Log.getStackTraceString(e));
        }
        ((JSONArray) jSONObject2.get("lightoffRoot_1")).add("lightoffMainpicFrame_" + i);
    }

    private void a(String str, int i, JSONObject jSONObject, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae265127", new Object[]{this, str, new Integer(i), jSONObject, jSONArray});
            return;
        }
        try {
            jSONObject.putAll((JSONObject) JSONObject.parse(String.format(str, Integer.valueOf(i), Integer.valueOf(i))));
        } catch (Exception e) {
            UnifyLog.d("MainPicDataManager", "createDeltaFrameData json parse error: " + Log.getStackTraceString(e));
            euw.b(this.f10145a, "createDeltaFrameData", Log.getStackTraceString(e));
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("opType", (Object) "insert");
        jSONObject2.put(com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SOURCE_PARENT, (Object) "mainpicRoot_1");
        jSONObject2.put("target", (Object) ("mainpicFrame_" + i));
        if (i > 0) {
            jSONObject2.put("position", (Object) ("mainpicFrame_" + (i - 1)));
        }
        jSONArray.add(jSONObject2);
    }

    private void a(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, JSONObject jSONObject, JSONObject jSONObject2, String str9, JSONObject jSONObject3, String str10) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93998ea4", new Object[]{this, str, new Integer(i), str2, str3, str4, str5, str6, str7, str8, new Integer(i2), jSONObject, jSONObject2, str9, jSONObject3, str10});
            return;
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("id", (Object) String.valueOf(i));
        jSONObject4.put("url", (Object) str2);
        jSONObject4.put("videoThumbnailURL", (Object) str3);
        jSONObject4.put("spatialVideoDimension", (Object) str4);
        jSONObject4.put("videoId", (Object) str5);
        jSONObject4.put("sellerId", (Object) str6);
        jSONObject4.put("userId", (Object) str7);
        jSONObject4.put("exposureArg1", (Object) "Show_DetailVideo");
        jSONObject4.put("clickArg1", (Object) "Button_DetailVideo");
        jSONObject4.put("spm", (Object) "a2141.7631564.detailvideo");
        jSONObject4.put("itemId", (Object) str8);
        jSONObject4.put("index", (Object) Integer.valueOf(i2 - 1));
        jSONObject4.put("contentType", (Object) str9);
        jSONObject4.put("videoModel", (Object) str10);
        Object a2 = jpe.a((Object) jSONObject4, str, false);
        try {
            if (a2 instanceof String) {
                JSONObject jSONObject5 = (JSONObject) JSONObject.parse((String) a2);
                if (jSONObject5 == null || jSONObject3 == null) {
                    i3 = i;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("mainpicVideo_");
                    i3 = i;
                    try {
                        sb.append(i3);
                        jSONObject5.getJSONObject(sb.toString()).put("events", (Object) jSONObject3);
                    } catch (Exception e) {
                        e = e;
                        UnifyLog.d("MainPicDataManager", "createVideoData json parse error: " + Log.getStackTraceString(e));
                        euw.b(this.f10145a, "createVideoData", Log.getStackTraceString(e));
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.add("mainpicVideo_" + i3);
                        jSONObject2.put("mainpicFrame_" + i2, (Object) jSONArray);
                    }
                }
                jSONObject.putAll(jSONObject5);
            } else {
                i3 = i;
            }
        } catch (Exception e2) {
            e = e2;
            i3 = i;
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.add("mainpicVideo_" + i3);
        jSONObject2.put("mainpicFrame_" + i2, (Object) jSONArray2);
    }

    private void a(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, JSONObject jSONObject, JSONObject jSONObject2, String str9, String str10) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b0b96a0", new Object[]{this, str, new Integer(i), str2, str3, str4, str5, str6, str7, str8, new Integer(i2), jSONObject, jSONObject2, str9, str10});
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("id", (Object) String.valueOf(i));
        jSONObject3.put("url", (Object) str2);
        jSONObject3.put("videoThumbnailURL", (Object) str3);
        jSONObject3.put("spatialVideoDimension", (Object) str4);
        jSONObject3.put("videoModel", (Object) str10);
        jSONObject3.put("videoId", (Object) str5);
        jSONObject3.put("sellerId", (Object) str6);
        jSONObject3.put("userId", (Object) str7);
        jSONObject3.put("exposureArg1", (Object) "Show_PlayPage");
        jSONObject3.put("clickArg1", (Object) "Button_PlayPagePlay");
        jSONObject3.put("spm", (Object) "a2141.7631564.playpage");
        jSONObject3.put("itemId", (Object) str8);
        jSONObject3.put("index", (Object) Integer.valueOf(i2 - 1));
        jSONObject3.put("contentType", (Object) str9);
        Object a2 = jpe.a((Object) jSONObject3, str, false);
        try {
            if (a2 instanceof String) {
                jSONObject.putAll((JSONObject) JSONObject.parse((String) a2));
            }
        } catch (Exception e) {
            UnifyLog.d("MainPicDataManager", "createLightoffVideoData json parse error: " + Log.getStackTraceString(e));
            euw.b(this.f10145a, "createLightoffVideoData", Log.getStackTraceString(e));
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.add("lightoffMainpicVideo_" + i);
        jSONObject2.put("lightoffMainpicFrame_" + i2, (Object) jSONArray);
    }

    private JSONObject a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, com.taobao.android.detail.mainpic.model.a aVar, int i2, JSONObject jSONObject3, JSONObject jSONObject4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cd34ffc5", new Object[]{this, str, new Integer(i), jSONObject, jSONObject2, aVar, new Integer(i2), jSONObject3, jSONObject4});
        }
        String str2 = "dinamicx" + i2;
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("id", (Object) String.valueOf(i));
        jSONObject5.put("type", (Object) str2);
        Object a2 = jpe.a((Object) jSONObject5, str, false);
        try {
            if (a2 instanceof String) {
                JSONObject jSONObject6 = (JSONObject) JSONObject.parse((String) a2);
                if (jSONObject != null) {
                    jSONObject6.getJSONObject("mainpicDinamicX_" + i).getJSONObject("fields").putAll(jSONObject);
                }
                if (jSONObject2 != null) {
                    jSONObject6.getJSONObject("mainpicDinamicX_" + i).getJSONObject("events").putAll(jSONObject2);
                }
                jSONObject3.putAll(jSONObject6);
            }
        } catch (Exception e) {
            UnifyLog.d("MainPicDataManager", "createDinamicXData json parse error: " + Log.getStackTraceString(e));
            euw.b(this.f10145a, "createDinamicXData", Log.getStackTraceString(e));
        }
        JSONObject jSONObject7 = new JSONObject();
        jSONObject7.put("frameFloatType", (Object) str2);
        jSONObject7.put("dxUrl", (Object) aVar.c());
        jSONObject7.put("dxName", (Object) aVar.a());
        jSONObject7.put("dxVersion", (Object) aVar.b());
        Object a3 = jpe.a((Object) jSONObject7, this.R, false);
        try {
            if (a3 instanceof String) {
                this.C.add((JSONObject) JSONObject.parse((String) a3));
            }
        } catch (Exception e2) {
            UnifyLog.d("MainPicDataManager", "createDinamicXData json parse error: " + Log.getStackTraceString(e2));
            euw.b(this.f10145a, "createDinamicXData", Log.getStackTraceString(e2));
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.add("mainpicDinamicX_" + i);
        jSONObject4.put("mainpicFrame_" + i2, (Object) jSONArray);
        return jSONObject3.getJSONObject("mainpicDinamicX_" + i);
    }

    private JSONObject a(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, int i2, JSONObject jSONObject, JSONObject jSONObject2, String str8, JSONObject jSONObject3) {
        String str9;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("36391d70", new Object[]{this, str, new Integer(i), str2, str3, str4, str5, str6, str7, new Integer(i2), jSONObject, jSONObject2, str8, jSONObject3});
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("id", (Object) String.valueOf(i));
        jSONObject4.put("url", (Object) str3);
        jSONObject4.put("imageType", (Object) str4);
        jSONObject4.put("sellerId", (Object) str5);
        jSONObject4.put("userId", (Object) str6);
        jSONObject4.put("contentMode", (Object) str2);
        jSONObject4.put("exposureArg1", (Object) "Show_DetailPic");
        jSONObject4.put("clickArg1", (Object) "Button_BigPic");
        jSONObject4.put("spm", (Object) "a2141.7631564.detailpic");
        jSONObject4.put("itemId", (Object) str7);
        jSONObject4.put("index", (Object) Integer.valueOf(i2 - 1));
        jSONObject4.put("contentType", (Object) str8);
        Object a2 = jpe.a((Object) jSONObject4, str, false);
        try {
            if (a2 instanceof String) {
                JSONObject jSONObject5 = (JSONObject) JSONObject.parse((String) a2);
                if (jSONObject5 == null || jSONObject3 == null) {
                    str9 = "mainpicImg_";
                } else {
                    StringBuilder sb = new StringBuilder();
                    str9 = "mainpicImg_";
                    try {
                        sb.append(str9);
                        sb.append(i);
                        jSONObject5.getJSONObject(sb.toString()).put("events", (Object) jSONObject3);
                    } catch (Exception e) {
                        e = e;
                        UnifyLog.d("MainPicDataManager", "createImageData json parse error: " + Log.getStackTraceString(e));
                        euw.b(this.f10145a, "createImageData", Log.getStackTraceString(e));
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.add(str9 + i);
                        jSONObject2.put("mainpicFrame_" + i2, (Object) jSONArray);
                        return jSONObject.getJSONObject(str9 + i);
                    }
                }
                jSONObject.putAll(jSONObject5);
            } else {
                str9 = "mainpicImg_";
            }
        } catch (Exception e2) {
            e = e2;
            str9 = "mainpicImg_";
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.add(str9 + i);
        jSONObject2.put("mainpicFrame_" + i2, (Object) jSONArray2);
        return jSONObject.getJSONObject(str9 + i);
    }

    private void a(String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, JSONObject jSONObject, JSONObject jSONObject2, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a6016a", new Object[]{this, str, new Integer(i), str2, str3, str4, str5, str6, new Integer(i2), jSONObject, jSONObject2, str7});
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("id", (Object) String.valueOf(i));
        jSONObject3.put("url", (Object) str2);
        jSONObject3.put("imageType", (Object) str3);
        jSONObject3.put("sellerId", (Object) str4);
        jSONObject3.put("userId", (Object) str5);
        jSONObject3.put("exposureArg1", (Object) "Show_PicPage");
        jSONObject3.put("clickArg1", (Object) "Button_PicPage");
        jSONObject3.put("spm", (Object) "a2141.7631564.picpage");
        jSONObject3.put("itemId", (Object) str6);
        jSONObject3.put("index", (Object) Integer.valueOf(i2 - 1));
        jSONObject3.put("contentType", (Object) str7);
        jSONObject3.put("category", (Object) f());
        jSONObject3.put("price", (Object) g());
        jSONObject3.put("itemTitle", (Object) e());
        jSONObject3.put("itemUrl", (Object) (com.taobao.share.globalmodel.e.NAV_URL_DETAIL_BASE + str6 + ".htm"));
        Object a2 = jpe.a((Object) jSONObject3, str, false);
        try {
            if (a2 instanceof String) {
                jSONObject.putAll((JSONObject) JSONObject.parse((String) a2));
            }
        } catch (Exception e) {
            UnifyLog.d("MainPicDataManager", "createLightoffImageData json parse error: " + Log.getStackTraceString(e));
            euw.b(this.f10145a, "createLightoffImageData", Log.getStackTraceString(e));
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.add("lightoffMainpicImg_" + i);
        jSONObject2.put("lightoffMainpicFrame_" + i2, (Object) jSONArray);
    }

    private void a(String str, JSONObject jSONObject, int i) {
        JSONObject jSONObject2;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("608255c5", new Object[]{this, str, jSONObject, new Integer(i)});
        } else if (jSONObject == null) {
        } else {
            String str3 = str + "_" + jSONObject.hashCode() + "_" + i;
            String str4 = "frameFloat_" + str3;
            String str5 = str + i;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("id", (Object) str3);
            jSONObject3.put("frameFloatType", (Object) str5);
            Object a2 = jpe.a((Object) jSONObject3, this.P);
            if (!(a2 instanceof String)) {
                return;
            }
            try {
                jSONObject2 = (JSONObject) JSONObject.parse((String) a2);
            } catch (Exception e) {
                UnifyLog.d("MainPicDataManager", "createFloatData json parse error: " + Log.getStackTraceString(e));
                jSONObject2 = null;
            }
            if ("dinamicx".equals(str)) {
                try {
                    JSONObject jSONObject4 = jSONObject.getJSONObject("fields");
                    if (jSONObject2 != null && jSONObject4 != null) {
                        jSONObject2.getJSONObject(str4).getJSONObject("fields").putAll(jSONObject4);
                    }
                    str2 = str5;
                } catch (Exception e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("createFloatData json error: ");
                    str2 = str5;
                    sb.append(Log.getStackTraceString(e2));
                    UnifyLog.d("MainPicDataManager", sb.toString());
                    euw.b(this.f10145a, "createFloatData", Log.getStackTraceString(e2));
                }
                try {
                    JSONObject jSONObject5 = jSONObject.getJSONObject("events");
                    if (jSONObject2 != null && jSONObject5 != null) {
                        jSONObject2.getJSONObject(str4).getJSONObject("events").putAll(jSONObject5);
                    }
                } catch (Exception e3) {
                    UnifyLog.d("MainPicDataManager", "createFloatData json error: " + Log.getStackTraceString(e3));
                    euw.b(this.f10145a, "createFloatData", Log.getStackTraceString(e3));
                }
            } else {
                str2 = str5;
            }
            this.B.putAll(jSONObject2);
            JSONArray jSONArray = this.A.getJSONArray("mainpicFrame_" + i);
            if (jSONArray == null) {
                return;
            }
            if (this.t == null) {
                this.t = new JSONObject();
            }
            JSONObject jSONObject6 = jSONObject.getJSONObject("data");
            String string = jSONObject.getString(TBDetailPicGalleryBridge.TOKEN_KEY_VO_NAME);
            if (StringUtils.isEmpty(string)) {
                string = s();
                jSONObject.put(TBDetailPicGalleryBridge.TOKEN_KEY_VO_NAME, (Object) string);
            }
            if (jSONObject6 != null) {
                this.t.put(string, (Object) jSONObject6);
            }
            jSONArray.add(str4);
            if ("weex".equals(str) || "h5".equals(str)) {
                String e4 = e(jSONObject);
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("frameFloatType", (Object) str2);
                jSONObject7.put("frameFloatWeexUrl", (Object) e4);
                jSONObject7.put("frameFloatContainerType", (Object) str);
                Object a3 = jpe.a((Object) jSONObject7, this.Q, false);
                try {
                    if (!(a3 instanceof String)) {
                        return;
                    }
                    this.C.add((JSONObject) JSONObject.parse((String) a3));
                } catch (Exception e5) {
                    UnifyLog.d("MainPicDataManager", "createFloatData json error: " + Log.getStackTraceString(e5));
                    euw.b(this.f10145a, "createFloatData", Log.getStackTraceString(e5));
                }
            } else if (!"dinamicx".equals(str)) {
            } else {
                JSONObject jSONObject8 = new JSONObject();
                jSONObject8.put("frameFloatType", (Object) str2);
                jSONObject8.put("dxUrl", (Object) jSONObject.getString("url"));
                jSONObject8.put("dxName", (Object) jSONObject.getString("name"));
                jSONObject8.put("dxVersion", (Object) jSONObject.getString("version"));
                Object a4 = jpe.a((Object) jSONObject8, this.R, false);
                try {
                    if (!(a4 instanceof String)) {
                        return;
                    }
                    this.C.add((JSONObject) JSONObject.parse((String) a4));
                } catch (Exception e6) {
                    UnifyLog.d("MainPicDataManager", "createFloatData json error: " + Log.getStackTraceString(e6));
                    euw.b(this.f10145a, "createFloatData", Log.getStackTraceString(e6));
                }
            }
        }
    }

    private void a(int i) {
        List<b> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        Map<Integer, List<b>> map = this.T;
        if (map == null || (list = map.get(Integer.valueOf((i - 1) - this.f))) == null || list.size() == 0) {
            return;
        }
        for (b bVar : list) {
            if (PopStrategy.IDENTIFIER_FLOAT.equals(bVar.a())) {
                a(bVar.c(), bVar.d(), i);
            }
        }
    }

    private String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("255e0466", new Object[]{this});
        }
        long currentTimeMillis = System.currentTimeMillis();
        return currentTimeMillis + "_" + ((int) (Math.random() * 10000.0d));
    }

    private String e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb19cf1c", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("url");
        String string2 = jSONObject.getString(TBDetailPicGalleryBridge.TOKEN_KEY_VO_NAME);
        String a2 = euq.a(this.w, "forceNaviAlpha");
        HashMap hashMap = new HashMap();
        hashMap.put(TBDetailPicGalleryBridge.TOKEN_KEY_VO_NAME, string2);
        hashMap.put("forceNaviAlpha", a2);
        String a3 = euq.a(string, hashMap);
        return StringUtils.isEmpty(a3) ? string : a3;
    }

    private void a(JSONObject jSONObject, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e8c17a", new Object[]{this, jSONObject, str, str2, str3, str4, str5});
            return;
        }
        this.n = euq.a(this.f10145a.e(), "mainPicDeltaProtocol.json");
        JSONObject jSONObject2 = this.n.getJSONObject("data").getJSONObject("hierarchy").getJSONObject("structure");
        JSONArray jSONArray = this.n.getJSONObject("data").getJSONObject("hierarchy").getJSONArray("delta");
        JSONObject jSONObject3 = this.n.getJSONObject("data").getJSONObject("data");
        String string = jSONObject.getString("url");
        String string2 = jSONObject.getString("coverUrl");
        String string3 = jSONObject.getString("videoId");
        String string4 = jSONObject.getString("videoRatio");
        String string5 = jSONObject.getString("videoModel");
        a(str, this.e, jSONObject3, jSONArray);
        a(str2, this.h, string, string2, string4, string3, str3, str4, str5, this.e, jSONObject3, jSONObject2, "detailMJX", null, string5);
        this.e++;
        this.h++;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        com.taobao.android.detail.mainpic.model.d dVar = this.d;
        if (dVar != null) {
            return a(dVar);
        }
        return a(this.c);
    }

    public String e() {
        ItemNode c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = this.c;
        if (bVar != null && (c = eqb.c(bVar)) != null) {
            return c.title;
        }
        return null;
    }

    public String f() {
        ItemNode c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = this.c;
        if (bVar != null && (c = eqb.c(bVar)) != null) {
            return c.categoryId;
        }
        return null;
    }

    public String g() {
        PriceNode m;
        PriceNode.PriceData priceData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = this.c;
        if (bVar != null && (m = eqb.m(bVar)) != null && (priceData = m.price) != null) {
            return priceData.priceText;
        }
        return null;
    }

    private String a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("632ab5de", new Object[]{this, bVar});
        }
        ItemNode c = eqb.c(bVar);
        if (c == null) {
            return null;
        }
        return c.itemId;
    }

    private String a(com.taobao.android.detail.mainpic.model.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8b414b1c", new Object[]{this, dVar}) : dVar.a();
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        com.taobao.android.detail.mainpic.model.d dVar = this.d;
        if (dVar != null) {
            return dVar.b();
        }
        SellerNode d = eqb.d(this.c);
        if (d == null) {
            return null;
        }
        return d.userId;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        com.taobao.android.detail.mainpic.model.d dVar = this.d;
        if (dVar != null) {
            return dVar.f();
        }
        SellerNode d = eqb.d(this.c);
        if (d == null) {
            return null;
        }
        return d.shopTypeOriginal;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this});
        }
        com.taobao.android.detail.mainpic.model.d dVar = this.d;
        if (dVar != null) {
            return dVar.g();
        }
        SellerNode d = eqb.d(this.c);
        if (d == null) {
            return null;
        }
        return d.shopId;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this});
        }
        com.taobao.android.detail.mainpic.model.d dVar = this.d;
        if (dVar != null) {
            return dVar.c();
        }
        return epo.g().e();
    }

    public JSONObject l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("48d58e13", new Object[]{this}) : this.s;
    }

    public JSONObject m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("5c7d6194", new Object[]{this}) : this.t;
    }

    public HashMap<String, String> n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("83012018", new Object[]{this}) : this.m;
    }

    public JSONObject o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("83cd0896", new Object[]{this});
        }
        com.taobao.android.detail.mainpic.model.d dVar = this.d;
        if (dVar != null && dVar.d() != null) {
            return this.d.d().getJSONObject("picGallaryOverScroll");
        }
        return null;
    }
}
