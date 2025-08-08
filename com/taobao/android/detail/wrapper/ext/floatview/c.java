package com.taobao.android.detail.wrapper.ext.floatview;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentManager;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.alibaba.android.ultron.trade.event.m;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.widget.container.d;
import com.taobao.android.detail.core.open.g;
import com.taobao.android.detail.core.open.l;
import com.taobao.android.detail.core.open.n;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.s;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.detail.ttdetail.utils.ae;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.f;
import com.taobao.android.upp.UppProtocolImpl;
import com.taobao.android.upp.e;
import com.taobao.taobao.R;
import com.taobao.vessel.weex.VesselWeexView;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import com.uc.webview.export.media.MessageID;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bay;
import tb.dxz;
import tb.dya;
import tb.ecg;
import tb.ecu;
import tb.ehs;
import tb.eis;
import tb.emu;
import tb.end;
import tb.eoz;
import tb.eps;
import tb.eqb;
import tb.feu;
import tb.fin;
import tb.gbg;
import tb.iuy;
import tb.kge;
import tb.rgu;
import tb.rgy;

/* loaded from: classes5.dex */
public class c extends eoz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL_ID_PREFIX = "detail_container_floatweex_container";
    public static final String CHANNEL_NAME = "channelName";
    public static final String Channel_ID = "detail_container_floatweex_container";

    /* renamed from: a  reason: collision with root package name */
    public static int f11317a;
    private static boolean c;
    private static final List<String> f;
    private static final JSONObject g;
    private static final JSONObject h;
    private FragmentManager d;
    private final DetailActivity i;
    private final g j;
    private com.taobao.android.detail.core.detail.activity.b k;
    private VesselWeexView l;
    private String m;
    private JSONArray n;
    private int q;
    private e r;
    private boolean t;
    private e.a x;
    private e.a y;
    private boolean e = false;
    private List<b> o = new ArrayList();
    private boolean p = false;
    private List<String> s = null;
    private boolean u = false;
    private final d v = new d() { // from class: com.taobao.android.detail.wrapper.ext.floatview.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.core.detail.widget.container.d
        public void a(int i, String str, int i2) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd34dafe", new Object[]{this, new Integer(i), str, new Integer(i2)});
            } else if (c.a(c.this) == i) {
            } else {
                c.a(c.this, i);
                c cVar = c.this;
                if (i > 0) {
                    z = false;
                }
                c.a(cVar, z);
            }
        }
    };
    private final dxz.a w = new dxz.a() { // from class: com.taobao.android.detail.wrapper.ext.floatview.c.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dxz.a
        public void a(int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8114572f", new Object[]{this, new Integer(i), str, str2});
            } else {
                c.a(c.this, true, str, str2);
            }
        }

        @Override // tb.dxz.a
        public void a(int i, boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2de12f2d", new Object[]{this, new Integer(i), new Boolean(z), str, str2});
            } else {
                c.a(c.this, false, str, str2);
            }
        }
    };
    public FragmentManager.OnBackStackChangedListener b = new FragmentManager.OnBackStackChangedListener() { // from class: com.taobao.android.detail.wrapper.ext.floatview.c.8
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.support.v4.app.FragmentManager.OnBackStackChangedListener
        public void onBackStackChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2062519", new Object[]{this});
            } else if (c.g(c.this).getBackStackEntryCount() == 0) {
                c.this.b();
            } else {
                c.this.a();
            }
        }
    };

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == -1467730997) {
            super.onMessage(objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.eoz
    public String getkey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("96f6ff50", new Object[]{this}) : "detail_container_floatweex_container";
    }

    public static /* synthetic */ int a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8c459cc", new Object[]{cVar})).intValue() : cVar.q;
    }

    public static /* synthetic */ int a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6fc7543d", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.q = i;
        return i;
    }

    public static /* synthetic */ void a(c cVar, int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b5017e6", new Object[]{cVar, new Integer(i), jSONObject});
        } else {
            cVar.a(i, jSONObject);
        }
    }

    public static /* synthetic */ void a(c cVar, Context context, String str, String str2, String str3, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861c4338", new Object[]{cVar, context, str, str2, str3, map});
        } else {
            cVar.a(context, str, str2, str3, map);
        }
    }

    public static /* synthetic */ void a(c cVar, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a3c8f01", new Object[]{cVar, jSONArray});
        } else {
            cVar.a(jSONArray);
        }
    }

    public static /* synthetic */ void a(c cVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9864037", new Object[]{cVar, jSONObject});
        } else {
            cVar.a(jSONObject);
        }
    }

    public static /* synthetic */ void a(c cVar, com.taobao.android.detail.datasdk.model.datamodel.node.c cVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73aae592", new Object[]{cVar, cVar2});
        } else {
            cVar.a(cVar2);
        }
    }

    public static /* synthetic */ void a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93f21f63", new Object[]{cVar, str});
        } else {
            cVar.b(str);
        }
    }

    public static /* synthetic */ void a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc7941b", new Object[]{cVar, new Boolean(z)});
        } else {
            cVar.a(z);
        }
    }

    public static /* synthetic */ void a(c cVar, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a417af", new Object[]{cVar, new Boolean(z), str, str2});
        } else {
            cVar.a(z, str, str2);
        }
    }

    public static /* synthetic */ void b(c cVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b28e0538", new Object[]{cVar, jSONObject});
        } else {
            cVar.b(jSONObject);
        }
    }

    public static /* synthetic */ boolean b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9faacbc", new Object[]{cVar})).booleanValue() : cVar.t;
    }

    public static /* synthetic */ boolean b(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("955b9d20", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.p = z;
        return z;
    }

    public static /* synthetic */ DetailActivity c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailActivity) ipChange.ipc$dispatch("ec8745af", new Object[]{cVar}) : cVar.i;
    }

    public static /* synthetic */ String d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6d5f1cea", new Object[]{cVar}) : cVar.m;
    }

    public static /* synthetic */ JSONArray e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("10720a49", new Object[]{cVar}) : cVar.n;
    }

    public static /* synthetic */ boolean f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aed3f838", new Object[]{cVar})).booleanValue() : cVar.u;
    }

    public static /* synthetic */ FragmentManager g(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentManager) ipChange.ipc$dispatch("9efeacd4", new Object[]{cVar}) : cVar.d;
    }

    static {
        kge.a(704775129);
        try {
            WXSDKEngine.registerModule("alix_message", FloatViewWeexModule.class);
            c = true;
        } catch (WXException e) {
            e.printStackTrace();
        }
        f11317a = ecu.S;
        f = new ArrayList();
        g = new JSONObject(1);
        h = new JSONObject(1);
        g.put("infoviewappear", (Object) String.valueOf(true));
        h.put("infoviewappear", (Object) String.valueOf(false));
    }

    public c(DetailActivity detailActivity) {
        this.r = null;
        this.t = false;
        emu.a("com.taobao.android.detail.wrapper.ext.floatview.WeexFloatViewController");
        f11317a = ecu.S;
        this.i = detailActivity;
        this.j = n.a(detailActivity);
        try {
            this.r = UppProtocolImpl.getInstance();
            this.t = this.r.isUppEnabled();
        } catch (Throwable th) {
            i.a("floatView.WeexFloatViewController", "UppProtocolImpl init exception.", th);
        }
        dya dyaVar = detailActivity.b;
        if (dyaVar != null) {
            dyaVar.a(new dya.b() { // from class: com.taobao.android.detail.wrapper.ext.floatview.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.dya.b
                public void a(end endVar, boolean z) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("fe344257", new Object[]{this, endVar, new Boolean(z)});
                        return;
                    }
                    try {
                        com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = endVar.f27459a;
                        JSONObject jSONObject = eqb.l(cVar.f10055a).getData().getJSONObject("floatView");
                        JSONArray jSONArray = null;
                        if (jSONObject != null) {
                            jSONArray = jSONObject.getJSONArray("list");
                        }
                        if (jSONArray == null) {
                            jSONArray = new JSONArray();
                        }
                        feu.a(cVar, jSONArray);
                        if (jSONArray.size() > 0) {
                            if (!((JSONObject) jSONArray.get(0)).isEmpty()) {
                                c.b(c.this, true);
                                c.a(c.this, jSONArray);
                            }
                        } else if (jSONObject != null) {
                            if (c.b(c.this)) {
                                c.a(c.this, jSONObject);
                            } else {
                                c.a(c.this, jSONObject.getString("url"));
                            }
                        }
                        c.a(c.this, cVar);
                    } catch (Throwable th2) {
                        i.a("floatView.WeexFloatViewController", "onRefresh", th2);
                    }
                }
            });
        }
        n.a(detailActivity).a(new l() { // from class: com.taobao.android.detail.wrapper.ext.floatview.c.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.open.l
            public void notifyDataSetChanged() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
                }
            }

            @Override // com.taobao.android.detail.core.open.l
            public eoz getMessageChannel(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (eoz) ipChange.ipc$dispatch("ed3ce113", new Object[]{this, str});
                }
                if (!StringUtils.equals(str, "detail_container_floatweex_container")) {
                    return null;
                }
                return c.this;
            }
        });
    }

    private void a(String str) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        DetailActivity detailActivity = this.i;
        String str4 = "";
        if (detailActivity == null || detailActivity.C() == null) {
            str2 = str4;
            str3 = str2;
        } else {
            str2 = this.i.C().q();
            str3 = this.i.C().i();
            Map<String, String> f2 = this.i.C().f();
            if (f2 != null) {
                str4 = f2.get("aliBizName");
            }
        }
        hashMap.put("sellerType", str2);
        hashMap.put("itemId", str3);
        hashMap.put("bizName", str4);
        hashMap.put(m.KEY_COMPONENT_TYPE, "weexFloat");
        hashMap.put("floatUrl", str);
        eps.a("Page_Detail", "exposure_component_event_info", hashMap);
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        i.c("floatView.WeexFloatViewController", "start:" + str);
        if (!c || StringUtils.equals(this.m, str) || !WXEnvironment.isCPUSupport()) {
            return;
        }
        this.m = str;
        k();
        if (!StringUtils.isEmpty(str)) {
            g();
            try {
                this.l.loadUrl(str, null);
                a(str);
                return;
            } catch (Throwable th) {
                i.a("floatView.WeexFloatViewController", "loadWeexPage", th);
                return;
            }
        }
        o();
    }

    private void a(JSONArray jSONArray) {
        JSONArray jSONArray2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else if (jSONArray != null) {
            this.n = jSONArray;
            if (!c || !WXEnvironment.isCPUSupport()) {
                return;
            }
            l();
            h();
            List<b> list = this.o;
            if (list == null || list.size() == 0 || (jSONArray2 = this.n) == null || jSONArray2.size() == 0) {
                return;
            }
            for (int i = 0; i < this.n.size() && this.o.size() > i; i++) {
                b bVar = this.o.get(i);
                if (bVar != null && (jSONObject = this.n.getJSONObject(i)) != null && bVar != null) {
                    if (!StringUtils.equals("FLOAT_BOTTOM", jSONObject.getString("type")) && jSONObject.getJSONObject("params") != null && jSONObject.getJSONObject("params").getJSONArray("infos") != null) {
                        b(bVar.g());
                    }
                    if (!a(jSONObject, i)) {
                        String string = jSONObject.getString("url");
                        String string2 = jSONObject.getString("type");
                        HashMap hashMap = new HashMap();
                        hashMap.put("type", string2);
                        hashMap.put("url", string);
                        ae.a("floatWeexUrl", hashMap);
                        JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                        try {
                            a(bVar, string, string2);
                            bVar.a(string, jSONObject2);
                            a(string + "&_weexfloatParams=" + URLEncoder.encode(JSONObject.toJSONString(jSONObject2)));
                        } catch (Throwable th) {
                            i.a("floatView.WeexFloatViewController", "loadWeexPage", th);
                        }
                    }
                }
            }
        }
    }

    private void a(b bVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d3658e", new Object[]{this, bVar, str, str2});
        } else if (str == null || bVar == null || bVar.g() == null || !this.i.N() || !eis.b) {
        } else {
            boolean equals = "FLOAT_BOTTOM".equals(str2);
            VesselWeexView g2 = bVar.g();
            ViewGroup.LayoutParams layoutParams = g2.getLayoutParams();
            if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                return;
            }
            layoutParams.height = equals ? bay.c() : -1;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (equals) {
                i = 80;
            }
            layoutParams2.gravity = i;
            g2.setLayoutParams(layoutParams);
        }
    }

    private void a(VesselWeexView vesselWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde2e375", new Object[]{this, vesselWeexView});
        } else if (!s.a()) {
        } else {
            ViewGroup.LayoutParams layoutParams = vesselWeexView.getLayoutParams();
            int i = iuy.f29328a - iuy.d;
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).leftMargin = i;
            } else if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.leftMargin = i;
                if (s.b() && this.i.findViewById(R.id.bottombar_layout) != null) {
                    int measuredHeight = this.i.findViewById(R.id.bottombar_layout).getMeasuredHeight();
                    if (measuredHeight <= 10) {
                        measuredHeight = gbg.a((Context) this.i, 54.0f);
                    }
                    layoutParams2.bottomMargin = measuredHeight;
                }
            }
            vesselWeexView.setAutoResize(true);
        }
    }

    private void b(VesselWeexView vesselWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0cf4cd4", new Object[]{this, vesselWeexView});
        } else if (!s.h()) {
        } else {
            ViewGroup.LayoutParams layoutParams = vesselWeexView.getLayoutParams();
            int i = iuy.f29328a - (iuy.d / 2);
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams).leftMargin = i;
            }
            vesselWeexView.setAutoResize(true);
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.l == null) {
            this.l = new VesselWeexView(this.i);
            i();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            this.l.setLayoutParams(layoutParams);
            RelativeLayout relativeLayout = (RelativeLayout) this.i.findViewById(R.id.pagegroup);
            if (relativeLayout == null) {
                return;
            }
            layoutParams.addRule(2, R.id.bottombar_layout);
            if (s.a()) {
                layoutParams.leftMargin = iuy.f29328a - iuy.d;
                this.l.setAutoResize(true);
            }
            a(this.l);
            relativeLayout.addView(this.l);
        } else {
            n();
            i();
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.n != null && this.o.size() < f11317a) {
            int size = this.n.size() - this.o.size();
            int size2 = f11317a - this.o.size();
            if (size >= size2) {
                size = size2;
            }
            if (size > 0) {
                for (int i = 0; i < size; i++) {
                    b bVar = new b(this.i);
                    this.o.add(bVar);
                    j();
                    a(bVar);
                }
            } else if (size < 0) {
                RelativeLayout relativeLayout = (RelativeLayout) this.i.findViewById(R.id.pagegroup);
                for (int i2 = 0; i2 < Math.abs(size); i2++) {
                    if (this.o.size() > 0) {
                        b bVar2 = this.o.get(0);
                        if (bVar2 != null && relativeLayout != null) {
                            relativeLayout.removeView(bVar2.h());
                        }
                        this.o.remove(0);
                    }
                }
            }
        }
    }

    private void a(b bVar) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c3e57a", new Object[]{this, bVar});
        } else if (bVar == null || bVar.g() == null) {
        } else {
            VesselWeexView g2 = bVar.g();
            if (!eis.b || !this.i.N()) {
                frameLayout = g2;
            } else {
                frameLayout = new FrameLayout(this.i);
                g2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                a(g2);
                frameLayout.addView(g2);
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            frameLayout.setLayoutParams(layoutParams);
            bVar.a(frameLayout);
            RelativeLayout relativeLayout = (RelativeLayout) this.i.findViewById(R.id.pagegroup);
            if (relativeLayout == null) {
                return;
            }
            layoutParams.addRule(2, R.id.bottombar_layout);
            a(g2);
            relativeLayout.addView(frameLayout);
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        if (this.d == null) {
            this.d = this.i.getSupportFragmentManager();
        }
        FragmentManager fragmentManager = this.d;
        if (fragmentManager != null) {
            fragmentManager.addOnBackStackChangedListener(this.b);
        }
        if (this.k == null) {
            try {
                this.k = this.i.b.k;
            } catch (Throwable unused) {
                i.a("floatView.WeexFloatViewController", "addListener");
            }
        }
        com.taobao.android.detail.core.detail.activity.b bVar = this.k;
        if (bVar != null) {
            bVar.a(this.v);
            this.k.a(this.w);
        }
        VesselWeexView vesselWeexView = this.l;
        if (vesselWeexView == null) {
            return;
        }
        vesselWeexView.setOnLoadListener(new rgu() { // from class: com.taobao.android.detail.wrapper.ext.floatview.c.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rgu
            public void onLoadFinish(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c38c0593", new Object[]{this, view});
                }
            }

            @Override // tb.rgu
            public void onLoadStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f829aa04", new Object[]{this});
                }
            }

            @Override // tb.rgu
            public void onLoadError(rgy rgyVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d36981b6", new Object[]{this, rgyVar});
                    return;
                }
                c cVar = c.this;
                c.a(cVar, c.c(cVar), c.d(c.this), rgyVar.f33150a, rgyVar.b, null);
            }

            @Override // tb.rgu
            public void onDowngrade(rgy rgyVar, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("775d4b7c", new Object[]{this, rgyVar, map});
                    return;
                }
                c cVar = c.this;
                c.a(cVar, c.c(cVar), c.d(c.this), rgyVar.f33150a, rgyVar.b, map);
            }
        });
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        List<b> list = this.o;
        if (list == null || list.size() == 0) {
            return;
        }
        for (b bVar : this.o) {
            if (bVar != null) {
                bVar.d();
            }
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.detail.activity.b bVar = this.k;
        if (bVar != null) {
            bVar.b(this.v);
            this.k.b(this.w);
        }
        VesselWeexView vesselWeexView = this.l;
        if (vesselWeexView != null) {
            vesselWeexView.setOnLoadListener(null);
        }
        FragmentManager fragmentManager = this.d;
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.removeOnBackStackChangedListener(this.b);
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        List<b> list = this.o;
        if (list == null || list.size() == 0) {
            return;
        }
        for (b bVar : this.o) {
            if (bVar != null) {
                bVar.j();
            }
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            try {
                String string = jSONObject.getString("url");
                i.c("floatView.WeexFloatViewController", "start:" + string);
                if (c && !StringUtils.equals(this.m, string) && WXEnvironment.isCPUSupport()) {
                    this.m = string;
                    k();
                    if (!StringUtils.isEmpty(string)) {
                        g();
                        if (a(jSONObject, -1)) {
                            return;
                        }
                        this.l.loadUrl(string, null);
                        a(string);
                        return;
                    }
                    o();
                }
            } catch (Throwable th) {
                i.a("floatView.WeexFloatViewController", "loadWeexPage", th);
            }
        }
    }

    private boolean a(JSONObject jSONObject, final int i) {
        JSONObject parseObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a78e87f", new Object[]{this, jSONObject, new Integer(i)})).booleanValue();
        }
        if (jSONObject != null) {
            try {
                if (this.r == null || !this.t) {
                    return false;
                }
                String string = jSONObject.getString("uppConf");
                if (StringUtils.isEmpty(string) && (jSONObject2 = jSONObject.getJSONObject("params")) != null) {
                    string = jSONObject2.getString("uppConf");
                }
                if (StringUtils.isEmpty(string) || (parseObject = JSON.parseObject(string)) == null || !parseObject.getBooleanValue("isUseUpp")) {
                    return false;
                }
                String string2 = parseObject.getString("schemeId");
                JSONObject jSONObject3 = parseObject.getJSONObject("bizParams");
                this.x = new e.a() { // from class: com.taobao.android.detail.wrapper.ext.floatview.c.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.upp.e.a
                    public void a(final JSONObject jSONObject4) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject4});
                        } else {
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.detail.wrapper.ext.floatview.c.6.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    try {
                                        if (jSONObject4 == null) {
                                            return;
                                        }
                                        JSONObject jSONObject5 = jSONObject4.getJSONObject("actualResult");
                                        if (jSONObject5 == null) {
                                            if (!StringUtils.equals(e.UPP_DOWNGRADE, jSONObject4.getString("code"))) {
                                                return;
                                            }
                                            if (-1 != i) {
                                                c.a(c.this, i, c.e(c.this).getJSONObject(i));
                                                return;
                                            }
                                            JSONObject jSONObject6 = new JSONObject();
                                            jSONObject6.put("url", (Object) c.d(c.this));
                                            c.b(c.this, jSONObject6);
                                            return;
                                        }
                                        String string3 = jSONObject5.getString("url");
                                        if (!StringUtils.isEmpty(string3)) {
                                            Uri parse = Uri.parse(string3);
                                            if (StringUtils.isEmpty(parse.getQueryParameter("algParams"))) {
                                                Uri.Builder buildUpon = parse.buildUpon();
                                                buildUpon.appendQueryParameter("algParams", jSONObject4.getString("algParams"));
                                                jSONObject5.put("url", (Object) buildUpon.build().toString());
                                            }
                                        }
                                        if (-1 == i) {
                                            c.b(c.this, jSONObject5);
                                        } else {
                                            c.a(c.this, i, jSONObject5);
                                        }
                                    } catch (Throwable th) {
                                        i.a("floatView.WeexFloatViewController", "deal upp call back error.", th);
                                    }
                                }
                            });
                        }
                    }
                };
                String registerResourceSpace = this.r.registerResourceSpace("Page_Detail", (Activity) this.i, string2, jSONObject3, this.x);
                if (this.s == null) {
                    this.s = new ArrayList(5);
                }
                this.s.add(registerResourceSpace);
                return true;
            } catch (Throwable th) {
                i.a("floatView.WeexFloatViewController", "dealUppLogic exception.", th);
            }
        }
        return false;
    }

    private void a(int i, JSONObject jSONObject) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e86c6b5", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        try {
            if (this.o.size() > i && (bVar = this.o.get(i)) != null && jSONObject != null) {
                String string = jSONObject.getString("url");
                String string2 = jSONObject.getString("type");
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                a(bVar, string, string2);
                bVar.a(string, jSONObject2);
                a(string + "&_weexfloatParams=" + URLEncoder.encode(JSONObject.toJSONString(jSONObject2)));
            }
        } catch (Throwable th) {
            i.a("floatView.WeexFloatViewController", "openWeexPage", th);
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            try {
                String string = jSONObject.getString("url");
                i.c("floatView.WeexFloatViewController", "start:" + string);
                if (c && WXEnvironment.isCPUSupport()) {
                    this.m = string;
                    k();
                    if (!StringUtils.isEmpty(string)) {
                        g();
                        this.l.loadUrl(string, null);
                        a(string);
                        return;
                    }
                    o();
                }
            } catch (Throwable th) {
                i.a("floatView.WeexFloatViewController", "openWeexPage", th);
            }
        }
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        try {
            if (this.s != null && !this.s.isEmpty()) {
                for (String str : this.s) {
                    c(str);
                }
            }
        } catch (Throwable th) {
            i.a("floatView.WeexFloatViewController", "unregisterSchemes exception.", th);
        }
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        try {
            if (this.r == null) {
                return;
            }
            this.r.unregisterResourceSpace(str);
        } catch (Throwable th) {
            i.a("floatView.WeexFloatViewController", "unregisterScheme exception.", th);
        }
    }

    private void a(com.taobao.android.detail.datasdk.model.datamodel.node.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c45d761", new Object[]{this, cVar});
            return;
        }
        try {
            JSONObject jSONObject = cVar.f10055a.a().getJSONObject("uppData");
            if (jSONObject == null) {
                return;
            }
            for (String str : jSONObject.keySet()) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str).getJSONObject("bizParams");
                this.y = new e.a() { // from class: com.taobao.android.detail.wrapper.ext.floatview.c.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.upp.e.a
                    public void a(JSONObject jSONObject3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject3});
                        } else if (!c.f(c.this)) {
                        } else {
                            com.taobao.android.detail.core.utils.b.a(c.c(c.this), jSONObject3);
                        }
                    }
                };
                String registerResourceSpace = this.r.registerResourceSpace(str, jSONObject2, this.y);
                if (this.s == null) {
                    this.s = new ArrayList(5);
                }
                this.s.add(registerResourceSpace);
            }
        } catch (Throwable th) {
            i.a("floatView.WeexFloatViewController", "unregisterScheme exception.", th);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e = true;
        o();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.e) {
        } else {
            n();
            this.e = false;
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        i.c("floatView.WeexFloatViewController", "show");
        VesselWeexView vesselWeexView = this.l;
        if (vesselWeexView == null) {
            return;
        }
        vesselWeexView.setVisibility(0);
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        i.c("floatView.WeexFloatViewController", "dismiss");
        VesselWeexView vesselWeexView = this.l;
        if (vesselWeexView == null) {
            return;
        }
        vesselWeexView.setVisibility(8);
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        i.c("floatView.WeexFloatViewController", "onGetItemId");
        String str = null;
        try {
            str = this.i.y().t.i();
        } catch (Throwable unused) {
        }
        if (str == null) {
            str = "";
        }
        JSONObject jSONObject = new JSONObject(1);
        jSONObject.put("itemId", (Object) str);
        g gVar = this.j;
        if (gVar == null) {
            return;
        }
        gVar.a("detail_floatweex_instance", jSONObject);
    }

    private void a(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da24c280", new Object[]{this, new Boolean(z), str, str2});
        } else if (this.j == null) {
        } else {
            StringBuilder sb = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append("#");
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            String sb2 = sb.toString();
            if (!f.contains(sb2)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(z ? "ComponentDidAppear" : "ComponentDisAppear", (Object) sb2);
            this.j.a("detail_floatweex_instance", jSONObject);
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        g gVar = this.j;
        if (gVar == null) {
            return;
        }
        gVar.a("detail_floatweex_instance", z ? g : h);
    }

    public void a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca495b2", new Object[]{this, str, jSONObject, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("type", (Object) "exposure");
        jSONObject3.put("triggerArea", (Object) str);
        jSONObject3.put("triggerPosition", (Object) jSONObject);
        jSONObject3.put("payload", (Object) jSONObject2);
        g gVar = this.j;
        if (gVar != null) {
            gVar.a("detail_floatweex_instance", jSONObject3);
        }
        List<b> list = this.o;
        if (list == null) {
            return;
        }
        for (b bVar : list) {
            if (bVar != null) {
                bVar.a(jSONObject3);
            }
        }
    }

    public void b(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ac5ab3", new Object[]{this, str, jSONObject, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("type", (Object) "click");
        jSONObject3.put("triggerArea", (Object) str);
        jSONObject3.put("triggerPosition", (Object) jSONObject);
        jSONObject3.put("payload", (Object) jSONObject2);
        g gVar = this.j;
        if (gVar != null) {
            gVar.a("detail_floatweex_instance", jSONObject3);
        }
        List<b> list = this.o;
        if (list == null) {
            return;
        }
        for (b bVar : list) {
            if (bVar != null) {
                bVar.a(jSONObject3);
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.p) {
            List<b> list = this.o;
            if (list == null) {
                return;
            }
            for (b bVar : list) {
                if (bVar != null) {
                    bVar.a();
                }
            }
        } else {
            VesselWeexView vesselWeexView = this.l;
            if (vesselWeexView == null) {
                return;
            }
            vesselWeexView.onStart();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.p) {
            List<b> list = this.o;
            if (list != null) {
                for (b bVar : list) {
                    if (bVar != null) {
                        bVar.b();
                    }
                }
            }
        } else {
            VesselWeexView vesselWeexView = this.l;
            if (vesselWeexView != null) {
                vesselWeexView.onResume();
            }
        }
        this.u = true;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.p) {
            List<b> list = this.o;
            if (list == null) {
                return;
            }
            for (b bVar : list) {
                if (bVar != null) {
                    bVar.c();
                }
            }
        } else {
            VesselWeexView vesselWeexView = this.l;
            if (vesselWeexView == null) {
                return;
            }
            vesselWeexView.onPause();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        i.c("floatView.WeexFloatViewController", MessageID.onDestroy);
        if (this.p) {
            List<b> list = this.o;
            if (list != null) {
                for (b bVar : list) {
                    if (bVar != null) {
                        bVar.i();
                    }
                }
            }
        } else {
            k();
            f.clear();
            VesselWeexView vesselWeexView = this.l;
            if (vesselWeexView != null) {
                vesselWeexView.onDestroy();
            }
        }
        if (!this.t) {
            return;
        }
        m();
    }

    @Override // tb.eoz
    public void onMessage(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
            return;
        }
        super.onMessage(obj);
        if (!(obj instanceof Map)) {
            return;
        }
        a((Map) obj);
    }

    private void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            b(map);
            c(map);
            d(map);
        }
    }

    private void b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        try {
            Object obj = map.get("operate");
            if (obj == null || !(obj instanceof String)) {
                return;
            }
            String str = (String) obj;
            if (StringUtils.equals(str, "show")) {
                n();
            } else if (StringUtils.equals(str, "dismiss")) {
                o();
            } else if (StringUtils.equals(str, "destroy")) {
                f();
            } else if (StringUtils.equals(str, "getItemId")) {
                p();
            } else {
                i.a("floatView.WeexFloatViewController", "无法处理operate_detail_weex_float operate:" + str);
            }
        } catch (Throwable th) {
            i.a("floatView.WeexFloatViewController", "postOperate", th);
        }
    }

    private void c(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
            return;
        }
        try {
            Object obj = map.get("monitor");
            if (obj == null || !(obj instanceof String)) {
                return;
            }
            String str = (String) obj;
            if (StringUtils.equals(str, "componentLifeCycle")) {
                Object obj2 = map.get("componentKey");
                if (obj2 == null || !(obj2 instanceof String)) {
                    return;
                }
                f.add((String) obj2);
                return;
            }
            i.a("floatView.WeexFloatViewController", "无法处理operate_detail_weex_float monitor:" + str);
        } catch (Throwable th) {
            i.a("floatView.WeexFloatViewController", "postMonitor", th);
        }
    }

    private void d(Map map) {
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{this, map});
            return;
        }
        try {
            Object obj = map.get(fin.EVENT_KEY);
            if (obj == null || !(obj instanceof String)) {
                return;
            }
            ActionModel actionModel = new ActionModel(new JSONObject());
            actionModel.type = (String) obj;
            if (map.get("params") != null) {
                actionModel.params = new JSONObject((Map) map.get("params"));
            }
            try {
                bVar = this.i.y().t.f10055a;
            } catch (Throwable unused) {
                bVar = null;
            }
            Event a2 = ehs.a(this.i, actionModel, bVar, null, null);
            if (a2 == null) {
                return;
            }
            f.a(this.i).a(a2);
        } catch (Throwable th) {
            i.a("floatView.WeexFloatViewController", "postEvent", th);
        }
    }

    private void a(Context context, String str, String str2, String str3, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c86b987", new Object[]{this, context, str, str2, str3, map});
        } else {
            ecg.a(context, str, str2, str3, map);
        }
    }
}
