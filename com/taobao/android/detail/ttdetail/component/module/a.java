package com.taobao.android.detail.ttdetail.component.module;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import com.taobao.android.detail.ttdetail.floatview.lowprice.LowPriceInfoController;
import com.taobao.android.detail.ttdetail.widget.BarrageView;
import com.taobao.android.dinamicx.DXRootView;
import java.util.List;
import java.util.Map;
import tb.eyx;
import tb.eyy;
import tb.ezc;
import tb.ezh;
import tb.ezi;
import tb.kge;
import tb.lpe;
import tb.sjg;

/* loaded from: classes4.dex */
public class a extends k implements com.taobao.android.detail.ttdetail.floatview.lowprice.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private C0406a f10532a;
    private DXRootView b;
    private DXRootView d;
    private JSONObject e;
    private LowPriceInfoController f;
    private JSONObject g;
    private FrameLayout h;

    static {
        kge.a(1490179995);
        kge.a(-770081546);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ DXRootView a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("68f58e01", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ DXRootView a(a aVar, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("c3452760", new Object[]{aVar, dXRootView});
        }
        aVar.b = dXRootView;
        return dXRootView;
    }

    public static /* synthetic */ JSONObject b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("7208d95", new Object[]{aVar}) : aVar.g;
    }

    public static /* synthetic */ DXRootView b(a aVar, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("8dfcca21", new Object[]{aVar, dXRootView});
        }
        aVar.d = dXRootView;
        return dXRootView;
    }

    public static /* synthetic */ FrameLayout c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("5fcc285", new Object[]{aVar}) : aVar.h;
    }

    public static /* synthetic */ DXRootView d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("c5243544", new Object[]{aVar}) : aVar.d;
    }

    public a(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, eyyVar, dataEntryArr);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        FrameLayout frameLayout = new FrameLayout(this.mContext);
        BarrageView barrageView = new BarrageView(this.mContext);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        boolean a2 = com.taobao.android.detail.ttdetail.utils.a.a((ezc) getParentComponent().getComponentData());
        layoutParams.bottomMargin = com.taobao.android.detail.ttdetail.utils.f.a(this.mContext, a2 ? 72.0f : 50.0f);
        frameLayout.addView(barrageView, layoutParams);
        if (this.mDetailContext.a().c()) {
            return frameLayout;
        }
        if (d()) {
            this.f10532a = new C0406a();
            C0406a.a(this.f10532a, this.mContext, this.mDetailContext, barrageView, this.mComponentData.d(), this.mComponentData.f());
        }
        JSONObject jSONObject = new JSONObject(this.mComponentData.d()).getJSONObject("extraFloat");
        if (jSONObject == null || jSONObject.isEmpty()) {
            if (a2) {
                c();
            }
            return frameLayout;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("sameTypeLowPrice");
        if (jSONObject2 != null && this.f == null) {
            a(a2, frameLayout);
            b(jSONObject2);
            return frameLayout;
        } else if (this.d != null) {
            a(a2, frameLayout);
            c((JSONObject) null);
            return frameLayout;
        } else {
            if (a2) {
                FrameLayout c = c();
                if (c != null) {
                    a(jSONObject, c);
                }
            } else {
                a(jSONObject, frameLayout);
            }
            lpe.a().a((Resource) this.mDetailContext.a().a(Resource.class), this.mContext);
            return frameLayout;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public j onGetFrameSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("dd5270c3", new Object[]{this, new Integer(i), new Integer(i2)}) : new j(-1, -1, 17);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
            return;
        }
        C0406a c0406a = this.f10532a;
        if (c0406a != null) {
            c0406a.a(true);
        }
        this.mDetailContext.f().b(this.b);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        C0406a c0406a = this.f10532a;
        if (c0406a != null) {
            c0406a.a(false);
        }
        this.mDetailContext.f().a(this.b);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    private FrameLayout c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("56f39b2f", new Object[]{this});
        }
        FrameLayout o = ((h) getParentComponent()).o();
        if (o != null) {
            o.removeAllViews();
        }
        return o;
    }

    private void a(boolean z, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec85cef", new Object[]{this, new Boolean(z), frameLayout});
            return;
        }
        if (z) {
            c();
        }
        this.h = frameLayout;
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
        if (jSONObject2 == null) {
            return;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("mtopConfig");
        this.e = jSONObject2.getJSONObject("template");
        if (jSONObject3 == null || this.e == null) {
            return;
        }
        String string = jSONObject3.getString("apiMethod");
        String string2 = jSONObject3.getString("apiVersion");
        JSONObject jSONObject4 = jSONObject3.getJSONObject("data");
        if (jSONObject4 == null || string == null || string2 == null) {
            return;
        }
        this.f = new LowPriceInfoController(jSONObject4, string, string2, this);
    }

    private void a(JSONObject jSONObject, FrameLayout frameLayout) {
        JSONObject jSONObject2;
        final JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dffe830b", new Object[]{this, jSONObject, frameLayout});
        } else if (frameLayout == null || (jSONObject2 = jSONObject.getJSONObject("shopTreasure")) == null || jSONObject2.isEmpty() || (jSONObject3 = jSONObject2.getJSONObject("fields")) == null || jSONObject3.isEmpty()) {
        } else {
            final FrameLayout frameLayout2 = new FrameLayout(this.mContext);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-2, -2, 80));
            final ezh f = this.mDetailContext.f();
            com.taobao.android.detail.ttdetail.utils.p.a(f, jSONObject3, new ezh.c() { // from class: com.taobao.android.detail.ttdetail.component.module.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ezh.c
                public void a(ezi eziVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e7d65404", new Object[]{this, eziVar});
                        return;
                    }
                    com.taobao.android.detail.ttdetail.utils.i.a("BarrageComponent", "downLoadTemplates onSuccess:" + eziVar.toString());
                    ViewGroup a2 = com.taobao.android.detail.ttdetail.utils.p.a(f, jSONObject3, eziVar);
                    if (!(a2 instanceof DXRootView)) {
                        return;
                    }
                    a.a(a.this, (DXRootView) a2);
                    frameLayout2.addView(a2);
                    f.a(a.a(a.this));
                }

                @Override // tb.ezh.c
                public void a(ezi eziVar, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7fd804ce", new Object[]{this, eziVar, str});
                        return;
                    }
                    com.taobao.android.detail.ttdetail.utils.i.a("BarrageComponent", "downLoadTemplates onFailure:" + str + " info:" + eziVar.a());
                }
            });
        }
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (!com.taobao.android.detail.ttdetail.utils.j.g()) {
            return true;
        }
        JSONObject a2 = this.mDetailContext.a().a();
        return !(a2 != null && sjg.a(a2));
    }

    @Override // com.taobao.android.detail.ttdetail.floatview.lowprice.b
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            c(jSONObject);
        }
    }

    private void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        if (this.g == null) {
            jSONObject.put("template", (Object) this.e);
            this.g = jSONObject;
        }
        final ezh f = this.mDetailContext.f();
        com.taobao.android.detail.ttdetail.utils.p.a(f, this.g, new ezh.c() { // from class: com.taobao.android.detail.ttdetail.component.module.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ezh.c
            public void a(ezi eziVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e7d65404", new Object[]{this, eziVar});
                    return;
                }
                com.taobao.android.detail.ttdetail.utils.i.a("BarrageComponent", "downLoadTemplates onSuccess: info:" + eziVar.a());
                ViewGroup a2 = com.taobao.android.detail.ttdetail.utils.p.a(f, a.b(a.this), eziVar);
                if (!(a2 instanceof DXRootView)) {
                    return;
                }
                FrameLayout frameLayout = new FrameLayout(a.this.mContext);
                a.c(a.this).addView(frameLayout, new FrameLayout.LayoutParams(-2, -2, 80));
                a.b(a.this, (DXRootView) a2);
                frameLayout.addView(a2);
                f.a(a.d(a.this));
            }

            @Override // tb.ezh.c
            public void a(ezi eziVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fd804ce", new Object[]{this, eziVar, str});
                    return;
                }
                com.taobao.android.detail.ttdetail.utils.i.a("BarrageComponent", "downLoadTemplates onFailure:" + str + " info:" + eziVar.a());
            }
        });
    }

    /* renamed from: com.taobao.android.detail.ttdetail.component.module.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0406a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private JSONArray f10535a;
        private int b;
        private BarrageView c;
        private ezh d;
        private ezi e;
        private double f;
        private boolean g;
        private int h;
        private boolean i;
        private BarrageView.a j;

        static {
            kge.a(-1887657482);
        }

        private C0406a() {
            this.b = 0;
            this.f = 1.0d;
            this.i = false;
            this.j = new BarrageView.a() { // from class: com.taobao.android.detail.ttdetail.component.module.a.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.ttdetail.widget.BarrageView.a
                public View a(Context context, Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("83db7d7e", new Object[]{this, context, obj}) : com.taobao.android.detail.ttdetail.utils.p.a(C0406a.b(C0406a.this), (JSONObject) obj, C0406a.c(C0406a.this));
                }

                @Override // com.taobao.android.detail.ttdetail.widget.BarrageView.a
                public void a() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        C0406a.d(C0406a.this);
                    }
                }
            };
        }

        public static /* synthetic */ void a(C0406a c0406a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82d3b5b9", new Object[]{c0406a});
            } else {
                c0406a.a();
            }
        }

        public static /* synthetic */ void a(C0406a c0406a, Context context, eyx eyxVar, BarrageView barrageView, JSONObject jSONObject, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28b620ae", new Object[]{c0406a, context, eyxVar, barrageView, jSONObject, map});
            } else {
                c0406a.a(context, eyxVar, barrageView, jSONObject, map);
            }
        }

        public static /* synthetic */ ezh b(C0406a c0406a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ezh) ipChange.ipc$dispatch("519be3b", new Object[]{c0406a}) : c0406a.d;
        }

        public static /* synthetic */ ezi c(C0406a c0406a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ezi) ipChange.ipc$dispatch("f66b4ddb", new Object[]{c0406a}) : c0406a.e;
        }

        public static /* synthetic */ void d(C0406a c0406a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f8f0496", new Object[]{c0406a});
            } else {
                c0406a.b();
            }
        }

        private void a(Context context, eyx eyxVar, BarrageView barrageView, JSONObject jSONObject, Map<String, List<com.taobao.android.detail.ttdetail.handler.event.a>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4416c85d", new Object[]{this, context, eyxVar, barrageView, jSONObject, map});
                return;
            }
            this.d = eyxVar.f();
            this.f = jSONObject.getDoubleValue("scrollTimeInterval");
            JSONArray jSONArray = jSONObject.getJSONArray("barrageData");
            if (jSONArray == null || jSONArray.size() == 0) {
                com.taobao.android.detail.ttdetail.utils.i.a("BarrageComponent", "no barrage data");
                return;
            }
            JSONArray jSONArray2 = this.f10535a;
            boolean z = jSONArray2 == null || jSONArray2.size() != jSONArray.size();
            this.f10535a = jSONArray;
            this.g = jSONObject.getBooleanValue("isInfinite");
            this.h = jSONObject.getIntValue("maxBarrageCount");
            a(map);
            ezi a2 = com.taobao.android.detail.ttdetail.utils.p.a(this.d, jSONObject, new b(this));
            if (a2 == null) {
                return;
            }
            this.e = a2;
            barrageView.setMaxCount(this.h);
            barrageView.setItemSpace(0);
            barrageView.setAnimatorDuration(300L);
            this.c = barrageView;
            if (!z) {
                return;
            }
            this.c.initDatas(this.f10535a.subList(0, 1), this.j);
            b();
        }

        private void a(Map<String, List<com.taobao.android.detail.ttdetail.handler.event.a>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            } else if (map != null && map.size() != 0) {
                for (int i = 0; i < this.f10535a.size(); i++) {
                    this.f10535a.getJSONObject(i).put("events", (Object) map);
                }
            }
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (this.i) {
            } else {
                int i = this.b;
                int i2 = i + 1;
                JSONArray jSONArray = this.f10535a;
                if (jSONArray == null) {
                    return;
                }
                if (i2 < jSONArray.size()) {
                    this.b = i2;
                } else if (!this.g) {
                    return;
                } else {
                    this.b = 0;
                }
                if (this.c.addData(this.f10535a.getJSONObject(this.b), true)) {
                    return;
                }
                this.b = i;
            }
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                this.c.postDelayed(new c(this), (long) (this.f * 1000.0d));
            }
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else if (this.i && !z) {
                this.i = z;
                a();
            } else {
                this.i = z;
            }
        }
    }
}
