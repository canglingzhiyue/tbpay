package com.taobao.android.litecreator.sdk.framework.container;

import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.af;
import com.taobao.android.litecreator.sdk.editor.data.Resource;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.hew;
import tb.hez;
import tb.hfd;
import tb.hfj;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class h extends hez implements d, e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private PluginInfo f13444a;
    private View b;

    static {
        kge.a(1844702530);
        kge.a(481954784);
        kge.a(398807943);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        if (str.hashCode() == 674501666) {
            return super.C();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public boolean V_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("981102d4", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.hez
    public void W_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99c5db6f", new Object[]{this});
        }
    }

    @Override // tb.hez
    public void X_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7ab40e", new Object[]{this});
        }
    }

    public abstract void a(JSONObject jSONObject);

    public void a(af afVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39ed6da9", new Object[]{this, afVar});
        }
    }

    public abstract void a(g gVar, f fVar);

    public void b(af afVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d788b6a", new Object[]{this, afVar});
        }
    }

    @Override // tb.hez
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public ViewGroup.LayoutParams o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("8e624603", new Object[]{this});
        }
        return null;
    }

    public String B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65c54bf7", new Object[]{this}) : StringUtils.isEmpty(D().name) ? "undefine" : D().name;
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.d
    public View A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d32c928a", new Object[]{this}) : this.b;
    }

    @Override // tb.hez, tb.hew
    public hew C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hew) ipChange.ipc$dispatch("28341422", new Object[]{this}) : super.C();
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.d
    public <T extends d> T d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("75f87684", new Object[]{this, str});
        }
        if (StringUtils.equals(str, "undefine") || !StringUtils.equals(str, B())) {
            return null;
        }
        return this;
    }

    public <T extends d> T e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("53ebdc63", new Object[]{this, str});
        }
        d e = e();
        if (e != null) {
            return (T) e.d(str);
        }
        return null;
    }

    private d e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("7af8c3ed", new Object[]{this});
        }
        if (C() == null) {
            return this;
        }
        if (C().C() == null) {
            return (d) C();
        }
        hew hewVar = this;
        while (hewVar.C().C() != null) {
            hewVar = hewVar.C();
        }
        return (d) hewVar;
    }

    public void a(hew hewVar, PluginInfo pluginInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecbe364a", new Object[]{this, hewVar, pluginInfo});
            return;
        }
        a(hewVar);
        this.f13444a = pluginInfo;
        a(this.f13444a.params);
    }

    public PluginInfo D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PluginInfo) ipChange.ipc$dispatch("4dfa5783", new Object[]{this}) : this.f13444a;
    }

    public void b(g gVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d803e4ca", new Object[]{this, gVar, fVar});
        } else {
            ((j) C()).a(gVar, fVar);
        }
    }

    public View E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("fbf2f78e", new Object[]{this}) : this.b;
    }

    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup}) : LayoutInflater.from(this.r).inflate(p(), viewGroup, false);
    }

    public void b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3684528", new Object[]{this, viewGroup});
            return;
        }
        View a2 = a(viewGroup);
        if (o() == null) {
            viewGroup.addView(a2);
        } else {
            viewGroup.addView(a2, o());
        }
        this.b = a2;
    }

    @Override // tb.hez
    public void c() {
        PluginInfo D;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!g() || (D = D()) == null || D.params == null) {
        } else {
            final JSONObject jSONObject = D.params.getJSONObject("utParams");
            if (jSONObject != null) {
                String string = jSONObject.getString("exposeUTName");
                if (!StringUtils.isEmpty(string)) {
                    K().a(string, c("exposeUTName"));
                }
            }
            if (!k()) {
                return;
            }
            E().setOnClickListener(new hfd(new View.OnClickListener() { // from class: com.taobao.android.litecreator.sdk.framework.container.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    h.this.f();
                    JSONObject jSONObject2 = jSONObject;
                    if (jSONObject2 == null) {
                        return;
                    }
                    String string2 = jSONObject2.getString("clickUTName");
                    if (StringUtils.isEmpty(string2)) {
                        return;
                    }
                    h.this.K().b(string2, h.this.c("clickUTName"));
                }
            }));
        }
    }

    public Map<String, String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e68dc5e9", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("session_id", com.taobao.android.litecreator.base.workflow.e.c(this.r));
        return hashMap;
    }

    public void c(af afVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c103a92b", new Object[]{this, afVar});
        } else {
            ((j) C()).a(afVar);
        }
    }

    public void d(af afVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ec6ec", new Object[]{this, afVar});
        } else {
            ((j) C()).b(afVar);
        }
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue() : StringUtils.equals(Resource.TYPE_TEMPLATE_LITE, com.taobao.android.litecreator.base.workflow.e.e(this.r));
    }

    public boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue();
        }
        if (obj != null) {
            return false;
        }
        hfj.a(this.r, com.alibaba.ability.localization.b.a(R.string.gg_pub_data_exception_retry_soon));
        return true;
    }
}
