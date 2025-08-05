package com.taobao.android.layoutmanager.container.secondpage.biz.ndadapter;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.secondpage.a;
import com.taobao.android.detail2.core.framework.secondpage.b;
import com.taobao.android.detail2.core.framework.secondpage.c;
import com.taobao.android.layoutmanager.container.secondpage.biz.GGSecTNodePage;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class GGSecTNodePageAdapterForND extends com.taobao.android.detail2.core.framework.secondpage.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private GGSecTNodePage h;
    private c i;

    static {
        kge.a(-613524683);
    }

    public static /* synthetic */ Object ipc$super(GGSecTNodePageAdapterForND gGSecTNodePageAdapterForND, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1479148652) {
            super.b((Uri) objArr[0], (View) objArr[1]);
            return null;
        } else if (hashCode == 94685804) {
            super.e();
            return null;
        } else if (hashCode != 96532846) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.g();
            return null;
        }
    }

    public static /* synthetic */ a.InterfaceC0462a a(GGSecTNodePageAdapterForND gGSecTNodePageAdapterForND) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.InterfaceC0462a) ipChange.ipc$dispatch("b95a49d1", new Object[]{gGSecTNodePageAdapterForND}) : gGSecTNodePageAdapterForND.g;
    }

    public static /* synthetic */ String a(GGSecTNodePageAdapterForND gGSecTNodePageAdapterForND, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5590f514", new Object[]{gGSecTNodePageAdapterForND, str});
        }
        gGSecTNodePageAdapterForND.e = str;
        return str;
    }

    public static /* synthetic */ Map a(GGSecTNodePageAdapterForND gGSecTNodePageAdapterForND, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("81509478", new Object[]{gGSecTNodePageAdapterForND, map});
        }
        gGSecTNodePageAdapterForND.f = map;
        return map;
    }

    public static /* synthetic */ a.InterfaceC0462a b(GGSecTNodePageAdapterForND gGSecTNodePageAdapterForND) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.InterfaceC0462a) ipChange.ipc$dispatch("f7ee0570", new Object[]{gGSecTNodePageAdapterForND}) : gGSecTNodePageAdapterForND.g;
    }

    public GGSecTNodePageAdapterForND(Context context) {
        super(context);
        this.h = new GGSecTNodePage(GGSecPageModule.class);
    }

    @Override // com.taobao.android.detail2.core.framework.secondpage.a
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        View b = this.h.b(this.f11564a);
        b.setTag(R.id.gg_sec_page_nd_adapter, this);
        return b;
    }

    @Override // com.taobao.android.detail2.core.framework.secondpage.a
    public void a(Uri uri, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b35d093", new Object[]{this, uri, view});
        } else if (uri == null || TextUtils.isEmpty(uri.toString())) {
        } else {
            this.h.a(uri.toString(), (String) null);
        }
    }

    @Override // com.taobao.android.detail2.core.framework.secondpage.a
    public void b(Uri uri, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d5fb94", new Object[]{this, uri, view});
            return;
        }
        super.b(uri, view);
        this.h.b();
    }

    @Override // com.taobao.android.detail2.core.framework.secondpage.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.h.d();
        }
    }

    @Override // com.taobao.android.detail2.core.framework.secondpage.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        this.h.e();
    }

    @Override // com.taobao.android.detail2.core.framework.secondpage.a
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        super.g();
        this.h.c();
    }

    @Override // com.taobao.android.detail2.core.framework.secondpage.a
    public c a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("94e1caed", new Object[]{this, bVar});
        }
        if (this.i == null) {
            this.i = new c(bVar) { // from class: com.taobao.android.layoutmanager.container.secondpage.biz.ndadapter.GGSecTNodePageAdapterForND.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail2.core.framework.secondpage.c
                public boolean a(MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue() : c(motionEvent);
                }

                @Override // com.taobao.android.detail2.core.framework.secondpage.c
                public boolean a(View view, boolean z, int i, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("436a9bd", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue() : b(view, z, i, i2, i3);
                }
            };
        }
        this.i.a(bVar);
        return this.i;
    }

    /* loaded from: classes5.dex */
    public static final class GGSecPageModule {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1214696605);
            kge.a(-818961104);
        }

        public static void updateSecPageProperty(g.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ba0206c", new Object[]{cVar});
            } else if (!(cVar.b instanceof JSONObject)) {
                a(cVar, "args instanceof JSONObject is false");
            } else {
                JSONObject jSONObject = (JSONObject) cVar.b;
                String str = "";
                JSONObject jSONObject2 = null;
                try {
                    str = jSONObject.getString("pageName");
                    jSONObject2 = jSONObject.getJSONObject("params");
                    JSONArray jSONArray = jSONObject2.getJSONArray("spm-cnt");
                    String string = jSONArray.getString(0);
                    String string2 = jSONArray.getString(1);
                    jSONObject2.put("spm-cnt", (Object) (string + "." + string2 + ".0.0"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (TextUtils.isEmpty(str) || jSONObject2 == null || TextUtils.isEmpty(jSONObject2.getString("spm-cnt"))) {
                    a(cVar, "pageName or pageProperties is wrong");
                    return;
                }
                GGSecTNodePageAdapterForND a2 = a(cVar);
                if (a2 == null) {
                    return;
                }
                GGSecTNodePageAdapterForND.a(a2, str);
                GGSecTNodePageAdapterForND.a(a2, a(jSONObject2));
                a2.h();
            }
        }

        public static void back(g.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("154de551", new Object[]{cVar});
                return;
            }
            GGSecTNodePageAdapterForND a2 = a(cVar);
            if (a2 == null || GGSecTNodePageAdapterForND.a(a2) == null) {
                return;
            }
            GGSecTNodePageAdapterForND.b(a2).a();
        }

        private static void a(g.c cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48972721", new Object[]{cVar, str});
            } else if (cVar.c == null) {
            } else {
                cVar.c.a(cVar, new g.a("AC_ERR_FAILED", str, null));
            }
        }

        private static GGSecTNodePageAdapterForND a(g.c cVar) {
            aa A;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GGSecTNodePageAdapterForND) ipChange.ipc$dispatch("98371cf9", new Object[]{cVar});
            }
            ab abVar = cVar.f19938a;
            if (abVar == null || (A = abVar.A()) == null) {
                return null;
            }
            View x = A.x();
            while (x != null && !(x.getTag(R.id.gg_sec_page_nd_adapter) instanceof GGSecTNodePageAdapterForND)) {
                x = (View) x.getParent();
            }
            if (x != null) {
                return (GGSecTNodePageAdapterForND) x.getTag(R.id.gg_sec_page_nd_adapter);
            }
            return null;
        }

        private static Map<String, String> a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{jSONObject});
            }
            HashMap hashMap = new HashMap();
            if (jSONObject != null) {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    if (entry.getValue() != null) {
                        hashMap.put(entry.getKey(), entry.getValue().toString());
                    }
                }
            }
            return hashMap;
        }
    }
}
