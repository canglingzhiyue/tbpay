package com.taobao.android.detail.ttdetail.component.module;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.weex.AliDetailGalleryWVPlugin;
import com.taobao.android.detail.wrapper.industry.maingallery.render.component.vessel.bridge.TBDetailPicGalleryBridge;
import com.taobao.taobao.R;
import com.taobao.vessel.VesselView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.emh;
import tb.eyx;
import tb.eyy;
import tb.ezg;
import tb.kge;
import tb.rgu;
import tb.rgy;

/* loaded from: classes4.dex */
public class r extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f10559a;
    private volatile boolean b;
    private VesselView c;
    private rgu d;
    private final j e;

    static {
        kge.a(1867416261);
    }

    public static /* synthetic */ Object ipc$super(r rVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1857981988) {
            super.onDidAppear();
            return null;
        } else if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 413640386) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate();
            return null;
        }
    }

    public static /* synthetic */ VesselView a(r rVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VesselView) ipChange.ipc$dispatch("62c9871f", new Object[]{rVar}) : rVar.c;
    }

    public static /* synthetic */ void a(r rVar, eyy eyyVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61501a80", new Object[]{rVar, eyyVar, jSONObject});
        } else {
            rVar.a(eyyVar, jSONObject);
        }
    }

    public static /* synthetic */ boolean a(r rVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1df87a13", new Object[]{rVar, new Boolean(z)})).booleanValue();
        }
        rVar.b = z;
        return z;
    }

    public static /* synthetic */ void b(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca8b0c4", new Object[]{rVar});
        } else {
            rVar.b();
        }
    }

    public r(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, eyyVar, dataEntryArr);
        this.f10559a = new HashMap();
        this.d = new rgu() { // from class: com.taobao.android.detail.ttdetail.component.module.r.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rgu
            public void onLoadStart() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f829aa04", new Object[]{this});
                }
            }

            @Override // tb.rgu
            public void onLoadFinish(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c38c0593", new Object[]{this, view});
                } else {
                    r.a(r.this).setVisibility(0);
                }
            }

            @Override // tb.rgu
            public void onLoadError(rgy rgyVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d36981b6", new Object[]{this, rgyVar});
                    return;
                }
                com.taobao.android.detail.ttdetail.utils.i.a("WeexVersion1Component", "onLoadError code: " + rgyVar.f33150a + " msg: " + rgyVar.b);
            }

            @Override // tb.rgu
            public void onDowngrade(rgy rgyVar, Map<String, Object> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("775d4b7c", new Object[]{this, rgyVar, map});
                    return;
                }
                com.taobao.android.detail.ttdetail.utils.i.a("WeexVersion1Component", "onDowngrade code: " + rgyVar.f33150a + " msg: " + rgyVar.b);
            }
        };
        this.e = new j(-1, -1, 17);
        this.c = new VesselView(context);
        this.c.setOnLoadListener(this.d);
        this.c.setVisibility(4);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view}) : a(view);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public j onGetFrameSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("dd5270c3", new Object[]{this, new Integer(i), new Integer(i2)}) : this.e;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        AliDetailGalleryWVPlugin.registerCurrentModule();
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        if (!com.taobao.android.detail.ttdetail.utils.a.b(this.mComponentData)) {
            super.onDidAppear();
        }
        a();
    }

    public View a(View view) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9c7a352c", new Object[]{this, view});
        }
        if (view == null || view.getId() != R.id.ll_weex1_container) {
            com.taobao.android.detail.ttdetail.performance.d a2 = com.taobao.android.detail.ttdetail.performance.d.a(this.mContext);
            if (a2 != null) {
                view = a2.a(this.mContext, R.layout.tt_detail_weex1_component, null, true);
            } else {
                view = LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_weex1_component, (ViewGroup) null);
            }
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.ll_weex1_container);
        if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != this.c) {
            z = true;
        }
        if (z) {
            frameLayout.removeAllViews();
            ViewParent parent = this.c.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.c);
            }
            frameLayout.addView(this.c, new FrameLayout.LayoutParams(-1, -1, 17));
        }
        return view;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.b) {
        } else {
            if (com.taobao.android.detail.ttdetail.utils.a.a(this.mComponentData)) {
                new com.taobao.android.detail.ttdetail.async.b(this.mDetailContext).a(this.mComponentData, new s(this), appendTriggerComponent(true, new RuntimeAbilityParam[0]));
            } else {
                b();
            }
            this.b = true;
        }
    }

    private eyy a(eyy eyyVar) {
        ezg a2;
        List m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eyy) ipChange.ipc$dispatch("17c97b0e", new Object[]{this, eyyVar});
        }
        if (eyyVar != null && (a2 = eyyVar.a()) != null && (m = a2.m()) != null && m.size() > 0) {
            return (eyy) m.get(0);
        }
        return null;
    }

    private Object a(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3d130e39", new Object[]{this, strArr, jSONObject});
        }
        int length = strArr.length;
        Object obj = jSONObject;
        while (i < length) {
            String str = strArr[i];
            if (obj instanceof Map) {
                obj = ((Map) obj).get(str);
            }
            i++;
            obj = obj;
        }
        return obj;
    }

    private void a(eyy eyyVar, JSONObject jSONObject) {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("939c12dd", new Object[]{this, eyyVar, jSONObject});
            return;
        }
        eyy a2 = a(eyyVar);
        if (a2 == null || (d = a2.d()) == null) {
            return;
        }
        String[] strArr = {"fields", "aysncValue", "videoAction", "videoThumbnailURL"};
        Object a3 = a(new String[]{"fields", "aysncValue", "imageAction", "url"}, jSONObject);
        if (!(a3 instanceof String)) {
            a3 = a(strArr, jSONObject);
        }
        if (!(a3 instanceof String)) {
            return;
        }
        d.put("url", a3);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        AliDetailGalleryWVPlugin.registerComponentParams(this.mComponentData.b(), e());
        String c = c();
        if (!d()) {
            c = com.taobao.android.detail.ttdetail.utils.l.a(c, g());
        }
        this.c.loadUrl(c);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.c.onDestroy();
        this.c.setOnLoadListener(null);
        AliDetailGalleryWVPlugin.removeComponentParams(this.mComponentData.b());
    }

    private String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        JSONObject d = this.mComponentData.d();
        if (d == null) {
            return null;
        }
        return d.getString("url");
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        JSONObject e = e();
        if (e == null) {
            return false;
        }
        return Boolean.parseBoolean(e.getString(com.alibaba.android.ultron.vfw.web.d.KEY_USE_BRIDGE));
    }

    private JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this});
        }
        JSONObject d = this.mComponentData.d();
        if (d == null) {
            return null;
        }
        return d.getJSONObject("params");
    }

    private String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        o parentComponent = getParentComponent();
        return parentComponent instanceof h ? ((h) parentComponent).c() : emh.sDefaultDimension;
    }

    private Map<String, String> g() {
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 1;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this});
        }
        this.f10559a.clear();
        String f = f();
        if (!StringUtils.isEmpty(f)) {
            String[] split = f.split(":");
            try {
                i = Integer.parseInt(split[0]);
                i2 = Integer.parseInt(split[1]);
            } catch (Throwable th) {
                com.taobao.android.detail.ttdetail.utils.i.a("WeexVersion1Component", "getUrlParams() parse dimension: ", th);
            }
            this.f10559a.put("MAINPIC_WIDTH", String.valueOf(i));
            this.f10559a.put("MAINPIC_HEIGHT", String.valueOf(i2));
            this.f10559a.put("mh_token", this.mDetailContext.e().a());
            this.f10559a.put("mh_itemId", com.taobao.android.detail.ttdetail.utils.d.a((Item) this.mDetailContext.a().a(Item.class)));
            this.f10559a.put(TBDetailPicGalleryBridge.TOKEN_KEY_VO_NAME, this.mComponentData.b());
            return this.f10559a;
        }
        i = 1;
        this.f10559a.put("MAINPIC_WIDTH", String.valueOf(i));
        this.f10559a.put("MAINPIC_HEIGHT", String.valueOf(i2));
        this.f10559a.put("mh_token", this.mDetailContext.e().a());
        this.f10559a.put("mh_itemId", com.taobao.android.detail.ttdetail.utils.d.a((Item) this.mDetailContext.a().a(Item.class)));
        this.f10559a.put(TBDetailPicGalleryBridge.TOKEN_KEY_VO_NAME, this.mComponentData.b());
        return this.f10559a;
    }
}
