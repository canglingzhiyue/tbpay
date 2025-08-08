package com.taobao.android.tbsku.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.widget.lightoff.model.LightOffFloatModel;
import com.taobao.android.detail.core.standard.widget.lightoff.model.LightOffItemModel;
import com.taobao.android.detail.core.standard.widget.lightoff.vm.PictureViewModel;
import com.taobao.android.detail.sdk.utils.f;
import com.taobao.android.sku.c;
import com.taobao.android.sku.utils.n;
import com.taobao.popupcenter.strategy.PopStrategy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.gbg;
import tb.iyb;
import tb.kge;
import tb.qra;
import tb.qrg;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FROM_SKU_HEAD = "skuHead";
    public static final String FROM_SKU_PROP = "skuProp";

    /* renamed from: a */
    private Context f15415a;
    private c b;
    private iyb c;
    private com.taobao.android.detail.core.standard.widget.lightoff.model.a e;
    private boolean f;
    private String g;
    private String h;
    private int i;
    private JSONObject j;
    private LightOffFloatModel l;
    private long m;
    private boolean n;
    private int o;
    private boolean r;
    private JSONObject s;
    private JSONObject t;
    private Map<String, JSONObject> k = new HashMap();
    private Handler p = new Handler() { // from class: com.taobao.android.tbsku.dialog.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            a.this = this;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what != 4097 || !(message.obj instanceof Integer) || ((Integer) message.obj).intValue() != a.a(a.this) || a.b(a.this).i == null || a.c(a.this) == null) {
            } else {
                JSONObject jSONObject = a.c(a.this).data;
                if (jSONObject.getJSONObject("fields") == null || !"true".equals(jSONObject.getJSONObject("fields").getString("loading")) || a.d(a.this) == null) {
                    return;
                }
                jSONObject.getJSONObject("fields").put("visible", (Object) "false");
                a.d(a.this).a(a.c(a.this));
                f.a("[XLightOff]", "loading timeout:" + a.c(a.this).data.toJSONString());
                HashMap hashMap = new HashMap();
                hashMap.put("skuId", a.e(a.this));
                a.a(a.this, 2101, "skuBottomTimeout", null, null, hashMap);
            }
        }
    };
    private com.taobao.android.detail.core.standard.widget.lightoff.a q = new com.taobao.android.detail.core.standard.widget.lightoff.a() { // from class: com.taobao.android.tbsku.dialog.SkuLightoffProxy$3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            }
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.a
        public void a(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0d596fe", new Object[]{this, dialogInterface});
                return;
            }
            a.f(a.this);
            HashMap hashMap = new HashMap();
            hashMap.put("stayTime", String.valueOf(System.currentTimeMillis() - a.g(a.this)));
            hashMap.put("closeByBottomBar", String.valueOf(a.h(a.this)));
            hashMap.put("scanPicCount", String.valueOf(a.i(a.this)));
            a.a(a.this, 2101, "leaveSkuLightOff", null, null, hashMap);
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.a
        public void b(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2228339d", new Object[]{this, dialogInterface});
                return;
            }
            a.a(a.this, System.currentTimeMillis());
            a.a(a.this, false);
            a.a(a.this, 1);
            HashMap hashMap = new HashMap();
            hashMap.put("bottomMode", a.j(a.this));
            hashMap.put("from", a.b(a.this).b);
            hashMap.put("hasSkuId", StringUtils.isEmpty(a.e(a.this)) ? "false" : "true");
            a.a(a.this, 2101, "enterSkuLightOff", null, null, hashMap);
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.a
        public void a(JSONObject jSONObject, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ccc1c04a", new Object[]{this, jSONObject, view});
            } else {
                a.d(a.this).a(false);
            }
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.a
        public void b(JSONObject jSONObject, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f255c94b", new Object[]{this, jSONObject, view});
            } else if (a.k(a.this) == null) {
                f.a("[share]SKULightOff", "onLongClick:feedback null");
            } else {
                f.a("[share]SKULightOff", "onLongClick:" + jSONObject.toString());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("actionFrom", (Object) "IMG_PREVIEW_LONG_CLK");
                jSONObject2.put("image", (Object) jSONObject);
                jSONObject2.put("dialog", (Object) a.d(a.this).a());
                a.k(a.this).a(jSONObject2);
            }
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.a
        public void a(JSONObject jSONObject, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a78e87b", new Object[]{this, jSONObject, new Integer(i)});
                return;
            }
            f.a("[XLightOff]", "onPageSelected:" + i);
            if (jSONObject == null) {
                return;
            }
            a.l(a.this);
            a.a(a.this, jSONObject.getString("skuId"));
            a.b(a.this, i);
            a.a(a.this, jSONObject);
            a aVar = a.this;
            a.b(aVar, a.m(aVar));
            if (a.m(a.this) == null || !a.n(a.this)) {
                return;
            }
            a.b(a.this, a.m(a.this).getString(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH));
            a.d(a.this).a(a.c(a.this));
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.a
        public void a(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26181c1e", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            } else if (f != 0.0f || i != a.a(a.this)) {
            } else {
                a aVar = a.this;
                a.a(aVar, a.m(aVar), a.a(a.this), a.k(a.this));
            }
        }

        @Override // com.taobao.android.detail.core.standard.widget.lightoff.a
        public void a(Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b63135c9", new Object[]{this, objArr});
            } else if (objArr.length <= 0 || objArr[0] == null || "noAction".equals(objArr[0])) {
                if (!com.taobao.android.detail.core.debug.a.a(a.b(a.this).f9909a)) {
                    return;
                }
                Toast.makeText(a.b(a.this).f9909a, "onFloatClickEvent action null", 0).show();
            } else if (objArr.length == 1) {
                a.a(a.this, true);
                a.d(a.this).a(true);
                a.c(a.this, String.valueOf(objArr[0]));
            } else {
                JSONArray jSONArray = null;
                try {
                    jSONArray = JSON.parseArray(String.valueOf(objArr[0]));
                } catch (Exception e) {
                    f.a("[XLightOff]", "actionJSONArray parse exception: ", e);
                }
                if (jSONArray == null) {
                    return;
                }
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    a.a(a.this, jSONArray.getJSONObject(i), objArr);
                }
                if (!"true".equals(String.valueOf(objArr[1]))) {
                    return;
                }
                a.a(a.this, true);
                a.d(a.this).a(true);
            }
        }
    };
    private com.taobao.android.detail.core.standard.widget.lightoff.c d = new com.taobao.android.detail.core.standard.widget.lightoff.c();

    static {
        kge.a(1180918060);
    }

    public static /* synthetic */ int a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("43d3c7df", new Object[]{aVar})).intValue() : aVar.i;
    }

    public static /* synthetic */ int a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("36a5a88a", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.o = i;
        return i;
    }

    public static /* synthetic */ long a(a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("36a5ac4c", new Object[]{aVar, new Long(j)})).longValue();
        }
        aVar.m = j;
        return j;
    }

    public static /* synthetic */ JSONObject a(a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2ef3bba4", new Object[]{aVar, jSONObject});
        }
        aVar.j = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ String a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("23cf28aa", new Object[]{aVar, str});
        }
        aVar.h = str;
        return str;
    }

    public static /* synthetic */ void a(a aVar, int i, String str, Object obj, Object obj2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda98f8c", new Object[]{aVar, new Integer(i), str, obj, obj2, map});
        } else {
            aVar.a(i, str, obj, obj2, map);
        }
    }

    public static /* synthetic */ void a(a aVar, JSONObject jSONObject, int i, iyb iybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("543fdffd", new Object[]{aVar, jSONObject, new Integer(i), iybVar});
        } else {
            aVar.a(jSONObject, i, iybVar);
        }
    }

    public static /* synthetic */ void a(a aVar, JSONObject jSONObject, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4634742d", new Object[]{aVar, jSONObject, objArr});
        } else {
            aVar.a(jSONObject, objArr);
        }
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36a5e86c", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.n = z;
        return z;
    }

    public static /* synthetic */ int b(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c345d38b", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.i = i;
        return i;
    }

    public static /* synthetic */ int b(a aVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2fd465c8", new Object[]{aVar, str})).intValue() : aVar.b(str);
    }

    public static /* synthetic */ com.taobao.android.detail.core.standard.widget.lightoff.model.a b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.core.standard.widget.lightoff.model.a) ipChange.ipc$dispatch("e09b5339", new Object[]{aVar}) : aVar.e;
    }

    public static /* synthetic */ void b(a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3040785", new Object[]{aVar, jSONObject});
        } else {
            aVar.d(jSONObject);
        }
    }

    public static /* synthetic */ LightOffFloatModel c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LightOffFloatModel) ipChange.ipc$dispatch("a452bcf7", new Object[]{aVar}) : aVar.l;
    }

    public static /* synthetic */ void c(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcc17cf4", new Object[]{aVar, str});
        } else {
            aVar.a(str);
        }
    }

    public static /* synthetic */ com.taobao.android.detail.core.standard.widget.lightoff.c d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.core.standard.widget.lightoff.c) ipChange.ipc$dispatch("92a199cf", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ String e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f959a638", new Object[]{aVar}) : aVar.h;
    }

    public static /* synthetic */ void f(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7697c47", new Object[]{aVar});
        } else {
            aVar.b();
        }
    }

    public static /* synthetic */ long g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4e876d1a", new Object[]{aVar})).longValue() : aVar.m;
    }

    public static /* synthetic */ boolean h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a5a55e09", new Object[]{aVar})).booleanValue() : aVar.n;
    }

    public static /* synthetic */ int i(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fcc34ed7", new Object[]{aVar})).intValue() : aVar.o;
    }

    public static /* synthetic */ String j(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b53dd33d", new Object[]{aVar}) : aVar.g;
    }

    public static /* synthetic */ iyb k(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iyb) ipChange.ipc$dispatch("509318b2", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ int l(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21d2174", new Object[]{aVar})).intValue();
        }
        int i = aVar.o;
        aVar.o = i + 1;
        return i;
    }

    public static /* synthetic */ JSONObject m(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("1983d80", new Object[]{aVar}) : aVar.j;
    }

    public static /* synthetic */ boolean n(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b0590343", new Object[]{aVar})).booleanValue() : aVar.r;
    }

    public a(Context context, String str, JSONObject jSONObject, JSONArray jSONArray, JSONArray jSONArray2, String str2, String str3, iyb iybVar) {
        this.f = false;
        this.f15415a = context;
        this.b = iybVar.b();
        this.c = iybVar;
        this.d.a(this.q);
        this.f = "true".equalsIgnoreCase(str2);
        this.g = str3;
        a(str, jSONObject, jSONArray, jSONArray2);
        this.b.a(new c.f() { // from class: com.taobao.android.tbsku.dialog.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // com.taobao.android.sku.c.f
            public void a(int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                } else if (a.d(a.this).a() == null || !a.d(a.this).a().isShowing() || !qra.b()) {
                } else {
                    a.d(a.this).a(true);
                }
            }
        });
    }

    private void a(JSONObject jSONObject, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf112a9", new Object[]{this, jSONObject, objArr});
        } else if (jSONObject == null) {
        } else {
            String string = jSONObject.getString("type");
            char c = 65535;
            int hashCode = string.hashCode();
            if (hashCode != -2095663441) {
                if (hashCode != 329301056) {
                    if (hashCode == 651883004 && string.equals("change_sku_frame")) {
                        c = 1;
                    }
                } else if (string.equals("userTrack")) {
                    c = 2;
                }
            } else if (string.equals("switch_main_pic")) {
                c = 0;
            }
            if (c == 0) {
                this.d.b(c("0"));
            } else if (c == 1) {
                if (objArr.length <= 2) {
                    f.a("[XLightOff]", "onFloatClickEvent change_sku_frame args.length <= 2");
                    return;
                }
                String valueOf = String.valueOf(objArr[2]);
                if (StringUtils.isEmpty(valueOf)) {
                    f.a("[XLightOff]", "onFloatClickEvent change_sku_frame targetPropPath empty");
                } else {
                    this.d.b(c(valueOf));
                }
            } else if (c == 2) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
                if (jSONObject2 == null) {
                    f.a("[XLightOff]", "onFloatClickEvent fields empty");
                    return;
                }
                try {
                    a(jSONObject2.getInteger("eventId").intValue(), jSONObject2.getString("arg1"), jSONObject2.getString("arg2"), jSONObject2.getString("arg3"), jSONObject2.getJSONObject("args"));
                } catch (Exception e) {
                    f.a("[XLightOff]", "onFloatClickEvent user track parse exception", e);
                }
            } else {
                f.a("[XLightOff]", "onFloatClickEvent no handle action:" + objArr[0]);
            }
        }
    }

    private void a(String str, JSONObject jSONObject, JSONArray jSONArray, JSONArray jSONArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcdbdf4e", new Object[]{this, str, jSONObject, jSONArray, jSONArray2});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("LightOffPresenter show entryModel:");
        sb.append(str);
        sb.append(", clickImgRect:");
        sb.append(jSONArray2 != null ? jSONArray2.toJSONString() : "null");
        sb.append(", mSkuForceDisplayProp:");
        sb.append(this.f);
        f.c("[XLightOff]", sb.toString());
        if (jSONArray == null || jSONArray.size() == 0) {
            return;
        }
        this.e = new com.taobao.android.detail.core.standard.widget.lightoff.model.a();
        com.taobao.android.detail.core.standard.widget.lightoff.model.a aVar = this.e;
        aVar.f9909a = this.f15415a;
        aVar.b = str;
        aVar.e = new ArrayList();
        String str2 = null;
        if (jSONObject != null) {
            str2 = jSONObject.getString("path");
            this.h = jSONObject.getString("skuId");
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("url");
            String string2 = jSONObject2.getString("path");
            if (!StringUtils.isEmpty(string)) {
                if (string2.equals(str2)) {
                    com.taobao.android.detail.core.standard.widget.lightoff.model.a aVar2 = this.e;
                    aVar2.h = i;
                    aVar2.d = string;
                }
                LightOffItemModel lightOffItemModel = new LightOffItemModel();
                lightOffItemModel.type = PictureViewModel.TYPE;
                lightOffItemModel.url = string;
                lightOffItemModel.originData = jSONObject2;
                this.e.e.add(lightOffItemModel);
            }
        }
        if (jSONArray2 != null && jSONArray2.size() == 4) {
            this.e.c = new Rect(gbg.a(this.f15415a, jSONArray2.getInteger(0).intValue()), gbg.a(this.f15415a, jSONArray2.getInteger(1).intValue()), gbg.a(this.f15415a, jSONArray2.getInteger(2).intValue()), gbg.a(this.f15415a, jSONArray2.getInteger(3).intValue()));
        }
        b(jSONObject);
    }

    private void a(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5bb8b5a", new Object[]{this, jSONArray, str});
        } else if (jSONArray != null && !jSONArray.isEmpty()) {
            this.s = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            int i = -1;
            for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                if (jSONObject != null) {
                    String string = jSONObject.getString(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH);
                    String string2 = jSONObject.getString("url");
                    boolean a2 = a(string, str);
                    if ("0".equals(string)) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("isSelected", (Object) String.valueOf(a2));
                        jSONObject2.put("url", (Object) string2);
                        this.s.put("mainImage", (Object) jSONObject2);
                    } else {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("img", (Object) string2);
                        jSONObject3.put("isSelected", (Object) String.valueOf(a2));
                        jSONObject3.put(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH, (Object) string);
                        jSONArray2.add(jSONObject3);
                    }
                    if (a2) {
                        i = i2;
                    }
                }
            }
            this.s.put("skuContents", (Object) jSONArray2);
            this.s.put(g.KEY_SELECTED_INDEX, (Object) String.valueOf(Math.max(i - 1, 0)));
        }
    }

    private void b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        this.e.i = new ArrayList();
        JSONObject h = this.b.g().h();
        if (h == null || (jSONObject2 = h.getJSONObject("skuLightOff")) == null || (jSONArray = jSONObject2.getJSONArray(PopStrategy.IDENTIFIER_FLOAT)) == null || jSONArray.size() == 0) {
            return;
        }
        JSONObject jSONObject3 = h.getJSONObject("feature");
        boolean z2 = jSONObject3 != null && "true".equals(jSONObject3.getString("skuLightoffSkuBar"));
        boolean equals = "true".equals(n.a("enableLightOffSkuBar", "true"));
        if (!z2 || !equals || !FROM_SKU_HEAD.equals(this.e.b)) {
            z = false;
        }
        this.r = z;
        this.e.j = this.r;
        this.t = jSONObject2.getJSONObject("events");
        if (this.r && jSONObject != null) {
            a(jSONObject2.getJSONArray("skuBarContents"), jSONObject.getString(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH));
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i);
            if (jSONObject4 != null && "skuBottom".equals(jSONObject4.getString("name"))) {
                LightOffFloatModel lightOffFloatModel = new LightOffFloatModel();
                lightOffFloatModel.containerType = jSONObject4.getString("containerType");
                lightOffFloatModel.name = jSONObject4.getString("name");
                lightOffFloatModel.version = jSONObject4.getString("version");
                lightOffFloatModel.url = jSONObject4.getString("url");
                lightOffFloatModel.loadTimeOut = 5000;
                if (!StringUtils.isEmpty(jSONObject4.getString("loadTimeOut"))) {
                    try {
                        lightOffFloatModel.loadTimeOut = Integer.parseInt(jSONObject4.getString("loadTimeOut"));
                    } catch (Exception e) {
                        f.a("[XLightOff]", "loadTimeOut parse:" + e.toString());
                    }
                }
                if (jSONObject != null) {
                    lightOffFloatModel.data = f(jSONObject);
                }
                this.l = lightOffFloatModel;
                this.e.i.add(lightOffFloatModel);
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.d.a(this.e);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        f.c("[XLightOff]", "postLightOffCloseMessage");
        this.b.b(new JSONObject() { // from class: com.taobao.android.tbsku.dialog.SkuLightoffProxy$4
            {
                put("action", "dart_curtain_close");
            }
        });
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        f.c("[XLightOff]", "postLightOffActionMessage:" + str);
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("from", (Object) "lightOff");
        jSONObject.put("actionName", (Object) str);
        this.b.b(new JSONObject() { // from class: com.taobao.android.tbsku.dialog.SkuLightoffProxy$5
            {
                put("action", "dark_curtain_sku_action");
                put("params", (Object) jSONObject);
            }
        });
        if (!com.taobao.android.detail.core.debug.a.a(this.f15415a)) {
            return;
        }
        Context context = this.f15415a;
        Toast.makeText(context, "onSKUAction:" + jSONObject.toString(), 0).show();
    }

    private void a(final JSONObject jSONObject, int i, iyb iybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e7d2979", new Object[]{this, jSONObject, new Integer(i), iybVar});
        } else if (jSONObject == null || jSONObject.isEmpty() || iybVar == null) {
        } else {
            f.a("[XLightOff]", "sendChangePropEvent:" + jSONObject.toString());
            String string = jSONObject.getString("viewId");
            if (!StringUtils.isEmpty(string)) {
                iybVar.h().put(string, Integer.valueOf((int) (((i / 6) * 348.5f) - 1.0f)));
            }
            this.b.b(new JSONObject() { // from class: com.taobao.android.tbsku.dialog.SkuLightoffProxy$6
                {
                    put("action", "pv_sku_update");
                    put("params", (Object) jSONObject);
                }
            });
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onSKUActionCallback:");
        sb.append(jSONObject == null ? "null" : jSONObject.toString());
        f.a("[XLightOff]", sb.toString());
        if (jSONObject == null || !FROM_SKU_HEAD.equals(jSONObject.getString("from"))) {
            f.a("[XLightOff]", "onSKUActionCallback params not from lightOff:" + jSONObject.getString("from"));
        } else if (StringUtils.isEmpty(jSONObject.getString("skuId"))) {
            f.a("[XLightOff]", "onSKUActionCallback params no skuId");
        } else if (!"bottomInfo".equals(jSONObject.getString("type"))) {
            f.a("[XLightOff]", "onSKUActionCallback type not bottomInfo");
        } else {
            c(jSONObject);
        }
    }

    private void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else if (this.e.i.size() == 0 || jSONObject == null) {
            f.a("[XLightOff]", "updateSkuDataChange no data");
        } else if (!FROM_SKU_HEAD.equals(this.e.b) || !FROM_SKU_HEAD.equals(jSONObject.getString("from"))) {
        } else {
            JSONObject a2 = a(e(jSONObject), this.k.get(this.h));
            this.k.put(this.h, (JSONObject) a2.clone());
            if (StringUtils.isEmpty(this.h) || !this.h.equals(jSONObject.getString("skuId")) || "0".equals(this.h)) {
                return;
            }
            JSONObject jSONObject2 = a2.getJSONObject("fields");
            if (jSONObject2 != null && jSONObject2.get("buttons") != null && jSONObject2.get("price") != null) {
                this.p.removeMessages(4097);
                this.l.data = a2;
                f.a("[XLightOff]", "updateSkuDataChange show sku:" + this.l.data.toJSONString());
                this.d.a(this.l);
                return;
            }
            f.a("[XLightOff]", "updateSkuDataChange not show sku, data not impletement:" + this.l.data.toJSONString());
        }
    }

    private void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
            return;
        }
        this.p.removeMessages(4097);
        if (this.e.i.size() == 0) {
            f.a("[XLightOff]", "updateSelectedFloatData no float template");
            return;
        }
        if (!this.f && FROM_SKU_HEAD.equals(this.e.b) && !StringUtils.isEmpty(this.h) && !"0".equals(this.h)) {
            this.l.data = g(jSONObject);
            if (this.p.hasMessages(4097)) {
                f.a("[XLightOff]", "updateSelectedFloatData has loading msg");
            }
            Handler handler = this.p;
            handler.sendMessageDelayed(Message.obtain(handler, 4097, Integer.valueOf(this.i)), this.l.loadTimeOut);
            f.a("[XLightOff]", "updateSelectedFloatData show loading:" + this.l.data.toJSONString());
        } else {
            this.l.data = f(jSONObject);
            f.a("[XLightOff]", "updateSelectedFloatData show prop" + this.l.data.toJSONString());
        }
        this.d.a(this.l);
    }

    private JSONObject e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("26170924", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject(jSONObject);
        jSONObject3.put(g.KEY_HEADER_EXPANDED, (Object) "false");
        jSONObject3.put("visible", (Object) "true");
        jSONObject3.put("loading", (Object) "false");
        if (this.r) {
            jSONObject3.put("skuBar", (Object) this.s);
        }
        jSONObject2.put("fields", (Object) jSONObject3);
        jSONObject2.put("events", (Object) this.t);
        return jSONObject2;
    }

    private JSONObject f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5ef769c3", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(g.KEY_HEADER_EXPANDED, (Object) "false");
        jSONObject3.put("visible", (Object) "true");
        jSONObject3.put("loading", (Object) "false");
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("title", (Object) jSONObject.getString("desc"));
        jSONObject3.put("skuText", (Object) jSONObject4);
        if (this.r) {
            jSONObject3.put("skuBar", (Object) this.s);
        }
        jSONObject2.put("fields", (Object) jSONObject3);
        jSONObject2.put("events", this.t);
        return jSONObject2;
    }

    private int b(String str) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue();
        }
        JSONObject jSONObject = this.s;
        if (jSONObject == null || jSONObject.isEmpty() || (jSONArray = this.s.getJSONArray("skuContents")) == null || jSONArray.isEmpty()) {
            return -1;
        }
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < jSONArray.size(); i3++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
            if (jSONObject2 != null) {
                if (i2 == -1 && Boolean.parseBoolean(jSONObject2.getString("isSelected"))) {
                    i2 = i3;
                }
                if (a(jSONObject2.getString(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH), str)) {
                    jSONObject2.put("isSelected", (Object) Boolean.TRUE.toString());
                    i = i3;
                } else {
                    jSONObject2.put("isSelected", (Object) Boolean.FALSE.toString());
                }
            }
        }
        this.s.put(g.KEY_SELECTED_INDEX, (Object) String.valueOf(Math.max(i, 0)));
        JSONObject jSONObject3 = this.s.getJSONObject("mainImage");
        if (jSONObject3 != null) {
            jSONObject3.put("isSelected", (Object) (i != -1 ? Boolean.FALSE : Boolean.TRUE).toString());
        }
        return i;
    }

    private JSONObject g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97d7ca62", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = this.k.get(this.h);
        if (jSONObject3 != null && jSONObject3.get("fields") != null) {
            JSONObject jSONObject4 = jSONObject3.getJSONObject("fields");
            jSONObject4.put("price", (Object) null);
            jSONObject4.put("subPrice", (Object) null);
            JSONArray jSONArray = jSONObject4.getJSONArray("buttons");
            if (jSONArray != null && jSONArray.size() > 0) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject5 = jSONArray.getJSONObject(i);
                    if (jSONObject5 != null) {
                        jSONObject5.put("enableClick", (Object) "false");
                    }
                }
            }
            return jSONObject3;
        }
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put(g.KEY_HEADER_EXPANDED, (Object) "false");
        jSONObject6.put("visible", (Object) "true");
        jSONObject6.put("loading", (Object) "true");
        if (this.r) {
            jSONObject6.put("skuBar", (Object) this.s);
        }
        jSONObject2.put("fields", (Object) jSONObject6);
        jSONObject2.put("events", (Object) this.t);
        return jSONObject2;
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("87d5db88", new Object[]{this, jSONObject, jSONObject2});
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            if (!jSONObject2.containsKey(str)) {
                jSONObject2.put(str, obj);
            } else if (obj instanceof JSONObject) {
                jSONObject2.put(str, (Object) a((JSONObject) obj, jSONObject2.getJSONObject(str)));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i = 0; i < jSONArray.size(); i++) {
                    jSONObject2.getJSONArray(str).set(i, a((JSONObject) jSONArray.get(i), (JSONObject) jSONObject2.getJSONArray(str).get(i)));
                }
            } else {
                jSONObject2.put(str, obj);
            }
        }
        return jSONObject2;
    }

    private void a(int i, String str, Object obj, Object obj2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65420708", new Object[]{this, new Integer(i), str, obj, obj2, map});
        } else if (StringUtils.isEmpty(this.g)) {
        } else {
            qrg.a(i, str, obj, obj2, map);
        }
    }

    private static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        boolean z = StringUtils.isEmpty(str2) || "0".equals(str2);
        boolean z2 = StringUtils.isEmpty(str) || "0".equals(str);
        if (z && z2) {
            return true;
        }
        if (!z && !z2) {
            return str2.contains(str);
        }
        return false;
    }

    private int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea7", new Object[]{this, str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return 0;
        }
        List<LightOffItemModel> list = this.e.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = list.get(i).originData;
            if (jSONObject != null && a(str, jSONObject.getString(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH))) {
                return i;
            }
        }
        return 0;
    }
}
