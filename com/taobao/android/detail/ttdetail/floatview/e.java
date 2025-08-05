package com.taobao.android.detail.ttdetail.floatview;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.android.ultron.trade.event.m;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bridge.TTFloatViewWeexModule;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Params;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.j;
import com.taobao.vessel.weex.VesselWeexView;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import tb.eyx;
import tb.kge;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f10654a;
    private static boolean b;
    private eyx c;
    private Activity d;
    private JSONArray e;
    private List<d> f = new ArrayList();
    private c g;
    private h h;
    private FrameLayout n;

    static {
        kge.a(302373563);
        f10654a = 3;
        try {
            WXSDKEngine.registerModule("alix_message", TTFloatViewWeexModule.class);
            b = true;
        } catch (Throwable th) {
            i.a("TTWeexFloatViewController", "initBridge error", th);
        }
    }

    public e(Context context, eyx eyxVar, FrameLayout frameLayout) {
        this.d = (Activity) context;
        this.c = eyxVar;
        this.n = frameLayout;
    }

    public void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa2d3cd0", new Object[]{this, hVar});
        } else {
            this.h = hVar;
        }
    }

    public void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
            return;
        }
        try {
            if (jSONArray.size() <= 0 || ((JSONObject) jSONArray.get(0)).isEmpty()) {
                return;
            }
            b(jSONArray);
        } catch (Throwable th) {
            i.a("TTWeexFloatViewController", "onRefresh", th);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String shopTypeOriginal = ((Seller) this.c.a().a(Seller.class)).getShopTypeOriginal();
        String itemId = ((Item) this.c.a().a(Item.class)).getItemId();
        JSONObject umbParams = ((Params) this.c.a().a(Params.class)).getUmbParams();
        String string = umbParams != null ? umbParams.getString("aliBizName") : "";
        jSONObject.put("sellerType", (Object) shopTypeOriginal);
        jSONObject.put("itemId", (Object) itemId);
        jSONObject.put("bizName", (Object) string);
        jSONObject.put(m.KEY_COMPONENT_TYPE, (Object) "weexFloat");
        jSONObject.put("floatUrl", (Object) str);
        com.taobao.android.detail.ttdetail.utils.m.b(19999, "exposure_component_event_info", jSONObject);
    }

    private void b(JSONArray jSONArray) {
        JSONArray jSONArray2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1467911", new Object[]{this, jSONArray});
        } else if (jSONArray != null) {
            this.e = jSONArray;
            if (!b || !WXEnvironment.isCPUSupport()) {
                return;
            }
            d();
            b();
            List<d> list = this.f;
            if (list == null || list.size() == 0 || (jSONArray2 = this.e) == null || jSONArray2.size() == 0) {
                return;
            }
            for (int i = 0; i < this.e.size() && this.f.size() > i; i++) {
                d dVar = this.f.get(i);
                if (dVar != null && (jSONObject = this.e.getJSONObject(i)) != null && !a(jSONObject)) {
                    String string = jSONObject.getString("url");
                    jSONObject.getString("type");
                    JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                    try {
                        dVar.a(string, jSONObject2);
                        a(string + "&_weexfloatParams=" + URLEncoder.encode(JSONObject.toJSONString(jSONObject2)));
                    } catch (Throwable th) {
                        i.a("TTWeexFloatViewController", "loadWeexPage", th);
                    }
                }
            }
        }
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        h hVar = this.h;
        if (hVar != null && hVar.a(jSONObject)) {
            a(this.h.b());
            return true;
        }
        if (j.h()) {
            if (this.g == null) {
                this.g = new c(this.d, this.c);
            }
            if (this.g.a(jSONObject)) {
                a(this.g.b());
                return true;
            }
        }
        return false;
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (this.n.indexOfChild(view) >= 0 || view == null) {
        } else {
            this.n.addView(view);
        }
    }

    private void b() {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.e != null && this.f.size() < f10654a) {
            int size = this.e.size() - this.f.size();
            int size2 = f10654a - this.f.size();
            if (size >= size2) {
                size = size2;
            }
            if (size > 0) {
                for (int i = 0; i < size; i++) {
                    d dVar = new d(this.d, this.c);
                    this.f.add(dVar);
                    c();
                    a(dVar);
                }
            } else if (size < 0) {
                for (int i2 = 0; i2 < Math.abs(size); i2++) {
                    if (this.f.size() > 0) {
                        d dVar2 = this.f.get(0);
                        if (dVar2 != null && (frameLayout = this.n) != null) {
                            frameLayout.removeView(dVar2.e());
                        }
                        this.f.remove(0);
                    }
                }
            }
        }
    }

    private void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa2b6b54", new Object[]{this, dVar});
        } else if (dVar == null || dVar.d() == null) {
        } else {
            VesselWeexView d = dVar.d();
            d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            dVar.a(d);
            if (this.n == null) {
                return;
            }
            if (com.taobao.android.detail.ttdetail.utils.e.a(this.c.g())) {
                d.setAutoResize(true);
            }
            this.n.addView(d);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        List<d> list = this.f;
        if (list == null || list.size() == 0) {
            return;
        }
        for (d dVar : this.f) {
            if (dVar != null) {
                dVar.a();
            }
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        List<d> list = this.f;
        if (list == null || list.size() == 0) {
            return;
        }
        for (d dVar : this.f) {
            if (dVar != null) {
                dVar.g();
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        List<d> list = this.f;
        if (list == null) {
            return;
        }
        for (d dVar : list) {
            if (dVar != null) {
                dVar.f();
            }
        }
    }
}
