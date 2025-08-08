package com.taobao.android.layoutmanager.container.secondpage.biz;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ask.ASK_CONST;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import com.taobao.tao.flexbox.layoutmanager.container.m;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.module.TrackerModule;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.oec;
import tb.ofz;
import tb.oga;
import tb.ogb;

/* loaded from: classes5.dex */
public class GGSecTNodePage extends ofz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f13216a;
    private TNodeView b;
    private f c;
    private String d;
    private Class<? extends Object> e;
    private Activity f;
    public int g;
    private String h;

    static {
        kge.a(-751903185);
    }

    public static /* synthetic */ Object ipc$super(GGSecTNodePage gGSecTNodePage, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ofz
    public boolean dH_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a1c4f86", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ Activity a(GGSecTNodePage gGSecTNodePage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("eedf43e0", new Object[]{gGSecTNodePage}) : gGSecTNodePage.f;
    }

    public static /* synthetic */ void a(GGSecTNodePage gGSecTNodePage, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe5a5a7f", new Object[]{gGSecTNodePage, uri});
        } else {
            gGSecTNodePage.a(uri);
        }
    }

    public static /* synthetic */ String b(GGSecTNodePage gGSecTNodePage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dd3081b7", new Object[]{gGSecTNodePage}) : gGSecTNodePage.h;
    }

    public static /* synthetic */ Class c(GGSecTNodePage gGSecTNodePage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76bbc4f7", new Object[]{gGSecTNodePage}) : gGSecTNodePage.e;
    }

    public GGSecTNodePage() {
        this(GGSecPageModule.class);
    }

    public GGSecTNodePage(Class<? extends Object> cls) {
        this.g = 0;
        this.e = cls;
    }

    @Override // tb.ofz
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.b;
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d586d88", new Object[]{this, fVar});
        } else {
            this.c = fVar;
        }
    }

    @Override // tb.ofz
    public void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{this, obj, str});
        } else if (!(obj instanceof String)) {
        } else {
            this.h = str;
            Pair<Uri, Boolean> a2 = com.taobao.android.layoutmanager.a.a(this.f13216a, Uri.parse((String) obj), false);
            if (a2 == null || ((Boolean) a2.second).booleanValue()) {
                return;
            }
            Pair<Uri, m.b> b = m.b(((Uri) a2.first).buildUpon().appendQueryParameter("loadmode", "dynamic").build(), false);
            Uri uri = (Uri) b.first;
            m.b bVar = (m.b) b.second;
            if (bVar == null || !bVar.g) {
                return;
            }
            String a3 = bVar.a();
            Uri a4 = com.taobao.android.layoutmanager.a.a(uri, true, false);
            this.f = new Activity();
            f fVar = this.c;
            if (fVar instanceof ogb) {
                ((ogb) fVar).setSecondPageUTObject(this.f);
            } else {
                Context context = this.f13216a;
                if (context instanceof ogb) {
                    ((ogb) context).setSecondPageUTObject(this.f);
                }
            }
            if (StringUtils.equals(a3, this.d)) {
                a(a4);
                return;
            }
            b(a4);
            this.d = a3;
        }
    }

    private void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{this, uri});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : uri.getQueryParameterNames()) {
                jSONObject.put(str, (Object) uri.getQueryParameter(str));
            }
        } catch (Throwable unused) {
        }
        if (jSONObject.isEmpty()) {
            return;
        }
        if (!jSONObject.containsKey(ASK_CONST.KEY_TNODE_TIME)) {
            jSONObject.put(ASK_CONST.KEY_TNODE_TIME, (Object) String.valueOf(System.nanoTime()));
        }
        this.b.getEngine().a(R.id.layout_manager_engine_utobject_tag, this.f);
        this.b.getEngine().a(R.id.layout_manager_engine_utparams_tag, this.h);
        aa rootNode = this.b.getRootNode();
        if (rootNode == null) {
            return;
        }
        rootNode.I().sendMessage(rootNode, "onUserChange", null, jSONObject, null);
        rootNode.I().sendMessage(rootNode, "onDataChange", null, jSONObject, null);
    }

    @Override // tb.ofz
    public void b() {
        aa rootNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TNodeView tNodeView = this.b;
        if (tNodeView == null || (rootNode = tNodeView.getRootNode()) == null) {
            return;
        }
        rootNode.I().sendMessage(rootNode, "onUserReset", null, new JSONObject(), null);
        rootNode.I().sendMessage(rootNode, "onDataReset", null, new JSONObject(), null);
    }

    @Override // tb.ofz
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        this.f13216a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_second_page, (ViewGroup) null);
        inflate.setBackgroundColor(-1);
        return inflate;
    }

    private void b(final Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3828407e", new Object[]{this, uri});
            return;
        }
        if (this.b != null) {
            c();
            ((ViewGroup) b(this.f13216a)).removeView(this.b);
        }
        this.b = TNodeView.create(this.f13216a, this.c, null, uri.toString(), null, null, new TNodeView.b() { // from class: com.taobao.android.layoutmanager.container.secondpage.biz.GGSecTNodePage.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
            public void onLayoutError() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("834776a6", new Object[]{this});
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
            public void onLayoutCompleted(aa aaVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3fb42811", new Object[]{this, aaVar});
                    return;
                }
                ab k = aaVar.k();
                k.a(R.id.layout_manager_engine_utobject_tag, GGSecTNodePage.a(GGSecTNodePage.this));
                k.a(R.id.layout_manager_engine_utparams_tag, GGSecTNodePage.b(GGSecTNodePage.this));
                k.c("$secpage", GGSecTNodePage.c(GGSecTNodePage.this));
                GGSecTNodePage.a(GGSecTNodePage.this, uri);
            }
        });
        ((ViewGroup) b(this.f13216a)).addView(this.b, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // tb.ofz
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        TNodeView tNodeView = this.b;
        if (tNodeView == null || tNodeView.getEngine() == null) {
            return;
        }
        this.b.getEngine().y();
    }

    @Override // tb.ofz
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        TNodeView tNodeView = this.b;
        if (tNodeView == null || tNodeView.getRootNode() == null) {
            return;
        }
        this.b.getEngine().a(this.b.getRootNode());
    }

    @Override // tb.ofz
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        TNodeView tNodeView = this.b;
        if (tNodeView == null || tNodeView.getRootNode() == null) {
            return;
        }
        this.b.getEngine().b(this.b.getRootNode());
    }

    /* loaded from: classes5.dex */
    public static final class GGSecPageModule {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-926540905);
            kge.a(-818961104);
        }

        private static void a(g.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("16567517", new Object[]{cVar});
            } else if (cVar.c == null) {
            } else {
                cVar.c.a(cVar, new g.a("参数错误", "参数错误", null));
            }
        }

        public static void updateSecPageProperty(g.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ba0206c", new Object[]{cVar});
                return;
            }
            JSONObject jSONObject = (JSONObject) cVar.b;
            String string = jSONObject.getString("pageName");
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            if (jSONObject2 == null) {
                a(cVar);
                return;
            }
            ogb a2 = oga.a(cVar);
            try {
                JSONArray jSONArray = jSONObject2.getJSONArray("spm-cnt");
                String string2 = jSONArray.getString(0);
                String string3 = jSONArray.getString(1);
                jSONObject2.put("spm-cnt", (Object) (string2 + "." + string3 + ".0.0"));
            } catch (Exception unused) {
            }
            if (StringUtils.isEmpty(string) || jSONObject2 == null) {
                a(cVar);
                return;
            }
            Object uTObjectWithContext = TrackerModule.getUTObjectWithContext(cVar);
            String str = null;
            if (cVar.f19938a != null) {
                str = oec.a(cVar.f19938a.c(R.id.layout_manager_engine_utparams_tag), (String) null);
            }
            if (!StringUtils.isEmpty(str)) {
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(str);
            }
            UTAnalytics.getInstance().getDefaultTracker().pageAppear(uTObjectWithContext, string);
            com.taobao.android.layoutmanager.module.a.a(uTObjectWithContext, true);
            Map<String, String> a3 = a(jSONObject2);
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(uTObjectWithContext, a3);
            if (a2 == null) {
                return;
            }
            a2.setSecondPageName(string);
            a2.setSecondPageProperty(a3);
        }

        private static Map<String, String> a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{jSONObject});
            }
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
            return hashMap;
        }
    }
}
