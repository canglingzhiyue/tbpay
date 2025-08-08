package com.taobao.android.stdpop.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.FragmentContainer;
import com.taobao.android.nav.Nav;
import com.taobao.android.tbabilitykit.m;
import com.taobao.android.weex.e;
import com.taobao.android.weex_ability.page.WeexFragment;
import kotlin.Pair;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.dkv;
import tb.dkw;
import tb.dkx;
import tb.dlh;
import tb.dll;
import tb.dlr;
import tb.dmr;
import tb.dms;
import tb.ffz;
import tb.jal;
import tb.kge;
import tb.scr;
import tb.scs;
import tb.xmn;
import tb.xmo;

/* loaded from: classes6.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f15272a;
    private float b;
    private boolean c;
    private com.taobao.android.stdpop.api.b d;
    private String e;
    private String f;
    private PopGravity g;
    private String h;
    private int i;
    private Integer j;
    private String k;
    private Integer l;

    /* loaded from: classes6.dex */
    public static final class a implements dll {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.stdpop.api.a f15273a;

        public a(com.taobao.android.stdpop.api.a aVar) {
            this.f15273a = aVar;
        }

        @Override // tb.dll
        public final void callback(String str, dkx<Object> dkxVar) {
            com.taobao.android.stdpop.api.a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("398d9b15", new Object[]{this, str, dkxVar});
            } else if (q.a((Object) str, (Object) "onClose")) {
                com.taobao.android.stdpop.api.a aVar2 = this.f15273a;
                if (aVar2 == null) {
                    return;
                }
                Object c = dkxVar != null ? dkxVar.c() : null;
                if (!(c instanceof JSONObject)) {
                    c = null;
                }
                aVar2.b((JSONObject) c);
            } else if (q.a((Object) str, (Object) "onBlockBackDismissed")) {
                com.taobao.android.stdpop.api.a aVar3 = this.f15273a;
                if (aVar3 == null) {
                    return;
                }
                Object c2 = dkxVar != null ? dkxVar.c() : null;
                if (!(c2 instanceof JSONObject)) {
                    c2 = null;
                }
                aVar3.a((JSONObject) c2);
            } else if (!q.a((Object) str, (Object) "onPopAppear") || (aVar = this.f15273a) == null) {
            } else {
                Object c3 = dkxVar != null ? dkxVar.c() : null;
                if (!(c3 instanceof JSONObject)) {
                    c3 = null;
                }
                aVar.c((JSONObject) c3);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Activity b;

        public b(Activity activity) {
            this.b = activity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                scs.a(this.b, c.a(c.this));
            }
        }
    }

    static {
        kge.a(2103540915);
    }

    public c() {
        this(null, 1, null);
    }

    public final void a(Context context, String str, com.taobao.android.stdpop.api.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e22b1219", new Object[]{this, context, str, aVar});
        } else {
            a(this, context, str, aVar, null, 8, null);
        }
    }

    public c(JSONObject jSONObject) {
        PopGravity popGravity;
        float f = 0.75f;
        this.b = 0.75f;
        this.h = String.valueOf(System.currentTimeMillis());
        this.i = ffz.b();
        if (jSONObject != null) {
            String string = jSONObject.getString("title");
            this.f15272a = string == null ? "" : string;
            Float f2 = jSONObject.getFloat("height");
            this.b = f2 != null ? f2.floatValue() : f;
            JSONObject jSONObject2 = jSONObject.getJSONObject("margins");
            q.b(jSONObject2, "it.getJSONObject(\"margins\")");
            Float f3 = jSONObject2.getFloat("left");
            float f4 = 0.0f;
            float floatValue = f3 != null ? f3.floatValue() : 0.0f;
            Float f5 = jSONObject2.getFloat("top");
            float floatValue2 = f5 != null ? f5.floatValue() : 0.0f;
            Float f6 = jSONObject2.getFloat("right");
            float floatValue3 = f6 != null ? f6.floatValue() : 0.0f;
            Float f7 = jSONObject2.getFloat("bottom");
            this.d = new com.taobao.android.stdpop.api.b(floatValue, floatValue2, floatValue3, f7 != null ? f7.floatValue() : f4);
            this.f = jSONObject.getString("contentColor");
            String string2 = jSONObject.getString("gravity");
            this.g = (string2 == null || (popGravity = PopGravity.valueOf(string2)) == null) ? PopGravity.BOTTOM : popGravity;
        }
    }

    public /* synthetic */ c(JSONObject jSONObject, int i, o oVar) {
        this((i & 1) != 0 ? null : jSONObject);
    }

    public static final /* synthetic */ String a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("edf40d67", new Object[]{cVar}) : cVar.h;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f15272a = str;
        }
    }

    public final void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.b = f;
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public final void a(com.taobao.android.stdpop.api.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e458ffa", new Object[]{this, bVar});
        } else {
            this.d = bVar;
        }
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public final void a(PopGravity popGravity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89f50077", new Object[]{this, popGravity});
        } else {
            this.g = popGravity;
        }
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public final void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
        } else {
            this.j = num;
        }
    }

    public final Integer b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("50145ad0", new Object[]{this}) : this.j;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.l = Integer.valueOf(i);
        }
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.h;
    }

    public final scr a(Context context, View contentView, com.taobao.android.stdpop.api.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (scr) ipChange.ipc$dispatch("dcc348b3", new Object[]{this, context, contentView, aVar});
        }
        q.d(context, "context");
        q.d(contentView, "contentView");
        JSONObject a2 = a(context);
        a2.put((JSONObject) "title", this.f15272a);
        JSONObject jSONObject = new JSONObject(2);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG, (String) a2);
        jSONObject3.put((JSONObject) "popId", this.h);
        t tVar = t.INSTANCE;
        jSONObject.put("params", (Object) jSONObject2);
        t tVar2 = t.INSTANCE;
        dlh dlhVar = new dlh(jSONObject);
        dlr dlrVar = new dlr();
        dlrVar.a(context);
        com.taobao.android.abilitykit.ability.pop.presenter.b bVar = new com.taobao.android.abilitykit.ability.pop.presenter.b();
        bVar.a(new xmn(contentView));
        dkx a3 = jal.a(bVar, new com.taobao.android.abilitykit.ability.pop.model.a(dlhVar.c()), dlhVar, dlrVar, a(aVar));
        scr scrVar = new scr();
        if (a3 instanceof dkw) {
            dkw dkwVar = (dkw) a3;
            dkv c = dkwVar.c();
            String str = null;
            scrVar.b = c != null ? String.valueOf(c.a()) : null;
            dkv c2 = dkwVar.c();
            if (c2 != null) {
                str = c2.b();
            }
            scrVar.c = str;
            scrVar.f33478a = false;
        } else {
            scrVar.f33478a = true;
        }
        return scrVar;
    }

    private final dll a(com.taobao.android.stdpop.api.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dll) ipChange.ipc$dispatch("2b41e27", new Object[]{this, aVar}) : new a(aVar);
    }

    public static /* synthetic */ void a(c cVar, Context context, String str, com.taobao.android.stdpop.api.a aVar, JSONObject jSONObject, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e1436b9", new Object[]{cVar, context, str, aVar, jSONObject, new Integer(i), obj});
            return;
        }
        if ((i & 8) != 0) {
            jSONObject = null;
        }
        cVar.a(context, str, aVar, jSONObject);
    }

    public final void a(Context context, String url, com.taobao.android.stdpop.api.a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1c78ff7", new Object[]{this, context, url, aVar, jSONObject});
            return;
        }
        q.d(context, "context");
        q.d(url, "url");
        boolean b2 = e.a().b(url);
        if (!b2) {
            Intent intentForUri = Nav.from(context).intentForUri(url);
            q.b(intentForUri, "Nav.from(context).intentForUri(url)");
            ComponentName component = intentForUri.getComponent();
            if (!q.a((Object) (component != null ? component.getClassName() : null), (Object) "com.taobao.browser.BrowserActivity")) {
                com.alibaba.ability.utils.c cVar = com.alibaba.ability.utils.c.INSTANCE;
                cVar.a("stdPopTag", "showSinglePanel url error: " + url);
                return;
            }
        }
        JSONObject a2 = a(context);
        a2.put((JSONObject) "title", this.f15272a);
        JSONObject jSONObject2 = new JSONObject(2);
        jSONObject2.put("type", (Object) (b2 ? "showWeex2Pop" : m.API_H5));
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((JSONObject) com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG, (String) a2);
        jSONObject4.put((JSONObject) "popId", this.h);
        jSONObject4.put((JSONObject) "url", url);
        jSONObject4.put((JSONObject) "content", (String) jSONObject);
        t tVar = t.INSTANCE;
        jSONObject2.put("params", (Object) jSONObject3);
        t tVar2 = t.INSTANCE;
        dlh dlhVar = new dlh(jSONObject2);
        dlr dlrVar = new dlr();
        dlrVar.a(context);
        if (b2) {
            String L = dmr.L();
            String str = url;
            if (!StringUtils.isEmpty(str) && n.b((CharSequence) L, (CharSequence) n.b((CharSequence) str, new String[]{"?"}, false, 0, 6, (Object) null).get(0), false, 2, (Object) null)) {
                Pair[] pairArr = new Pair[1];
                String str2 = this.k;
                String str3 = UltronTradeHybridInstanceRenderMode.SURFACE;
                if (!q.a((Object) str3, (Object) str2)) {
                    str3 = UltronTradeHybridInstanceRenderMode.TEXTURE;
                }
                pairArr[0] = j.a("renderMode", str3);
                WeexFragment fragment = WeexFragment.newInstance(url, url, ai.b(pairArr), jSONObject, null);
                com.taobao.android.abilitykit.ability.pop.presenter.b bVar = new com.taobao.android.abilitykit.ability.pop.presenter.b();
                q.b(fragment, "fragment");
                bVar.a(new com.taobao.android.tbabilitykit.weex.pop.render.a(new com.taobao.android.tbabilitykit.weex.pop.render.e(fragment)));
                jal.a(bVar, new com.taobao.android.abilitykit.ability.pop.model.a(dlhVar.c()), dlhVar, dlrVar, a(aVar));
                return;
            }
        }
        com.taobao.android.abilitykit.ability.pop.presenter.b bVar2 = new com.taobao.android.abilitykit.ability.pop.presenter.b();
        bVar2.a(new xmo());
        jal.a(bVar2, new com.taobao.android.abilitykit.ability.pop.model.c(dlhVar.c()), dlhVar, dlrVar, a(aVar));
    }

    public final scr a(Activity act, Fragment fragment, com.taobao.android.stdpop.api.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (scr) ipChange.ipc$dispatch("40aadc79", new Object[]{this, act, fragment, aVar});
        }
        q.d(act, "act");
        q.d(fragment, "fragment");
        FragmentContainer fragmentContainer = new FragmentContainer();
        fragmentContainer.setChildFragment(fragment);
        if (!StringUtils.isEmpty(this.f15272a)) {
            fragmentContainer.setTitle(this.f15272a);
        }
        Activity activity = act;
        JSONObject a2 = a(activity);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "droidFragmentTag", this.e);
        fragmentContainer.setDismissClickListener(new b(act));
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG, (String) a2);
        jSONObject3.put((JSONObject) com.taobao.android.abilitykit.ability.pop.model.c.KEY_EXT_CONFIG, (String) jSONObject);
        jSONObject3.put((JSONObject) "popId", this.h);
        t tVar = t.INSTANCE;
        return scs.a(activity, fragmentContainer, jSONObject2, aVar);
    }

    private final JSONObject a(Context context) {
        String value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("58b28f80", new Object[]{this, context});
        }
        if (this.b == 1.0f) {
            this.i = 0;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "maxHeight", (String) Float.valueOf(this.b));
        jSONObject2.put((JSONObject) "maxWidth", (String) 1);
        jSONObject2.put((JSONObject) "panEnable", (String) Boolean.valueOf(this.c));
        jSONObject2.put((JSONObject) "autoRotate", (String) Boolean.valueOf(dms.b(context)));
        jSONObject2.put((JSONObject) "cornerRadius", (String) Integer.valueOf(this.i));
        jSONObject2.put((JSONObject) "enterAnimDuration", (String) this.l);
        com.taobao.android.stdpop.api.b bVar = this.d;
        if (bVar != null) {
            jSONObject2.put((JSONObject) "leftMargin", (String) Float.valueOf(bVar.a()));
            jSONObject2.put((JSONObject) "rightMargin", (String) Float.valueOf(bVar.c()));
            jSONObject2.put((JSONObject) "topMargin", (String) Float.valueOf(bVar.b()));
            jSONObject2.put((JSONObject) "bottomMargin", (String) Float.valueOf(bVar.d()));
        }
        PopGravity popGravity = this.g;
        if (popGravity != null && (value = popGravity.getValue()) != null) {
            jSONObject2.put((JSONObject) "gravity", value);
        }
        String str = this.f;
        if (str != null) {
            jSONObject2.put((JSONObject) "backgroundMode", "color");
            jSONObject2.put((JSONObject) "backgroundStyle", str);
        }
        Integer num = this.j;
        if (num != null) {
            jSONObject2.put((JSONObject) "popContainerId", (String) Integer.valueOf(num.intValue()));
        }
        if (!(context instanceof Activity)) {
            jSONObject2.put((JSONObject) "attachMode", "activity");
        }
        return jSONObject;
    }

    public final void a(Context ctx, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{this, ctx, new Boolean(z)});
            return;
        }
        q.d(ctx, "ctx");
        scs.a(ctx, this.h, z);
    }
}
