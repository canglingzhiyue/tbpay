package tb;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.service.event.AURAEventKey;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.monitor.track.spm.merge.MergeUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.kit.utils.b;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.ttdetail.widget.BarrageView;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@AURAExtensionImpl(code = "alidetail.impl.render.component.creator.barrage")
/* loaded from: classes4.dex */
public final class eln extends ekq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a f = null;

    static {
        kge.a(1877237011);
    }

    public static /* synthetic */ Object ipc$super(eln elnVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.atc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : eyb.NAME;
    }

    @Override // tb.ekq
    public String b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9aaefeae", new Object[]{this, aURARenderComponent});
        }
        return null;
    }

    @Override // tb.ekq
    public /* synthetic */ View b(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c25bfc1e", new Object[]{this, viewGroup, aURARenderComponentContainer}) : c(viewGroup, aURARenderComponentContainer);
    }

    public eln() {
        emu.a("com.taobao.android.detail.core.standard.mainscreen.render.component.AliSDetailMainBarrage");
    }

    @Override // tb.atc
    public String a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent});
        }
        String str = aURARenderComponent.key;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return a() + System.currentTimeMillis();
    }

    public FrameLayout c(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("3ea9c85c", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        BarrageView barrageView = new BarrageView(viewGroup.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        frameLayout.addView(barrageView, layoutParams);
        return frameLayout;
    }

    @Override // tb.ekq
    public void a(AURARenderComponent aURARenderComponent, FrameLayout frameLayout, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c2aa47", new Object[]{this, aURARenderComponent, frameLayout, view, new Integer(i)});
            return;
        }
        FrameLayout frameLayout2 = (FrameLayout) view;
        frameLayout2.setPadding(0, 0, 0, a(frameLayout2.getContext(), aURARenderComponent));
        DetailCoreActivity a2 = eje.a(this.c);
        if (a2.m() || a2.aZ()) {
            return;
        }
        RecyclerView c = eje.c(this.c);
        if (c != null) {
            view.getLayoutParams().height = emh.a(c.getContext(), c.getWidth(), aURARenderComponent.parent, emh.sDefaultDimension, true);
            frameLayout.updateViewLayout(view, view.getLayoutParams());
        }
        BarrageView barrageView = (BarrageView) frameLayout2.getChildAt(0);
        DinamicXEngine b = eje.b(this.e);
        ejf.b("AliSDetailMainBarrage", "innerRenderView");
        Object a3 = ejd.a(view, "BarrageManager");
        art artVar = new art(this.c, aURARenderComponent, b());
        if (a3 instanceof a) {
            this.f = (a) a3;
        } else {
            this.f = new a();
            ejd.a(view, "BarrageManager", this.f);
        }
        a.a(this.f, this.c.e(), b, artVar, barrageView, aURARenderComponent.key, new JSONObject(aURARenderComponent.data.fields), aURARenderComponent.data.events);
    }

    private int a(Context context, AURARenderComponent aURARenderComponent) {
        List<AURARenderComponent> a2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4870cce", new Object[]{this, context, aURARenderComponent})).intValue();
        }
        int a3 = b.a(context, 18.0f);
        AURARenderComponent aURARenderComponent2 = null;
        String str = null;
        for (AURARenderComponent aURARenderComponent3 = aURARenderComponent.parent; aURARenderComponent3 != null; aURARenderComponent3 = aURARenderComponent3.parent) {
            str = String.valueOf(aURARenderComponent3.data.fields.get("locatorId"));
            if (!"null".equals(str)) {
                break;
            }
        }
        if (TextUtils.isEmpty(str) || "null".equals(str) || (a2 = eje.a(this.e)) == null || a2.size() == 0) {
            return a3;
        }
        Iterator<AURARenderComponent> it = a2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AURARenderComponent next = it.next();
            if ("progressBar".equals(next.key)) {
                aURARenderComponent2 = next;
                break;
            }
        }
        if (aURARenderComponent2 == null) {
            return a3;
        }
        Object obj = aURARenderComponent2.data.fields.get("frameTag");
        if (obj != null && (obj instanceof Map) && (jSONArray = new JSONObject((Map) obj).getJSONArray(str)) != null && jSONArray.size() > 0) {
            z = true;
        }
        return z ? a3 << 1 : a3;
    }

    @Override // tb.atl, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        a aVar = this.f;
        if (aVar == null) {
            return;
        }
        aVar.c();
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private JSONArray f27402a;
        private int b;
        private BarrageView c;
        private DinamicXEngine d;
        private DXTemplateItem e;
        private double f;
        private boolean g;
        private int h;
        private boolean i;
        private art j;
        private BarrageView.a k;
        public ejg l;
        private String m;
        private List<Runnable> n;

        static {
            kge.a(-941621890);
        }

        private a() {
            this.b = 0;
            this.f = 1.0d;
            this.i = false;
            this.n = new ArrayList();
            this.l = new ejg() { // from class: tb.eln.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ejg
                public void a() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        a.a(a.this, true);
                    }
                }

                @Override // tb.ejg
                public void b() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                        return;
                    }
                    a.a(a.this, false);
                    a.a(a.this);
                }
            };
            this.k = new BarrageView.a() { // from class: tb.eln.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.ttdetail.widget.BarrageView.a
                public View a(Context context, Object obj) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (View) ipChange.ipc$dispatch("83db7d7e", new Object[]{this, context, obj});
                    }
                    DXResult<DXRootView> b = a.d(a.this).b(context, a.c(a.this));
                    if (b.b()) {
                        ejf.b("AliSDetailMainBarrage", "mDinamicXEngine.createView failed:" + b.a().toString());
                        return null;
                    }
                    JSONObject jSONObject = (JSONObject) obj;
                    DXResult<DXRootView> a2 = a.d(a.this).a(context, jSONObject, b.f11780a, gbg.a(), gbg.b(), a.e(a.this));
                    if (a2.b()) {
                        ejf.b("AliSDetailMainBarrage", "mDinamicXEngine.renderTemplate failed:" + a2.a().toString());
                        return null;
                    }
                    a.a(a.this, jSONObject);
                    return a2.f11780a;
                }

                @Override // com.taobao.android.detail.ttdetail.widget.BarrageView.a
                public void a() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        a.f(a.this);
                    }
                }
            };
        }

        public static /* synthetic */ void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e5758b4", new Object[]{aVar});
            } else {
                aVar.a();
            }
        }

        public static /* synthetic */ void a(a aVar, Context context, DinamicXEngine dinamicXEngine, art artVar, BarrageView barrageView, String str, JSONObject jSONObject, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67c67801", new Object[]{aVar, context, dinamicXEngine, artVar, barrageView, str, jSONObject, map});
            } else {
                aVar.a(context, dinamicXEngine, artVar, barrageView, str, jSONObject, map);
            }
        }

        public static /* synthetic */ void a(a aVar, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4cf7c8bc", new Object[]{aVar, jSONObject});
            } else {
                aVar.a(jSONObject);
            }
        }

        public static /* synthetic */ boolean a(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5c9470a4", new Object[]{aVar, new Boolean(z)})).booleanValue();
            }
            aVar.i = z;
            return z;
        }

        public static /* synthetic */ List b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("38d026b2", new Object[]{aVar}) : aVar.n;
        }

        public static /* synthetic */ DXTemplateItem c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXTemplateItem) ipChange.ipc$dispatch("c78ac49", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ DinamicXEngine d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("ac2f8430", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ art e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (art) ipChange.ipc$dispatch("312647cb", new Object[]{aVar}) : aVar.j;
        }

        public static /* synthetic */ void f(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2fa06bf9", new Object[]{aVar});
            } else {
                aVar.b();
            }
        }

        private void a(Context context, DinamicXEngine dinamicXEngine, art artVar, BarrageView barrageView, String str, JSONObject jSONObject, Map<String, List<Event>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4a414b5", new Object[]{this, context, dinamicXEngine, artVar, barrageView, str, jSONObject, map});
                return;
            }
            this.d = dinamicXEngine;
            this.j = artVar;
            this.f = jSONObject.getDouble("scrollTimeInterval").doubleValue();
            JSONArray jSONArray = jSONObject.getJSONArray("barrageData");
            if (jSONArray == null || jSONArray.size() == 0) {
                i.a("AliSDetailMainBarrage", "no barrage data");
                return;
            }
            JSONArray jSONArray2 = this.f27402a;
            boolean z = jSONArray2 == null || jSONArray2.size() != jSONArray.size();
            this.f27402a = jSONArray;
            this.g = jSONObject.getBoolean("isInfinite").booleanValue();
            this.h = jSONObject.getInteger("maxBarrageCount").intValue();
            a(map);
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            JSONObject jSONObject2 = jSONObject.getJSONObject("template");
            if (jSONObject2 != null) {
                dXTemplateItem.b = jSONObject2.getLong("version").longValue();
                dXTemplateItem.f11925a = jSONObject2.getString("name");
                dXTemplateItem.c = jSONObject2.getString("url");
            }
            if (TextUtils.isEmpty(dXTemplateItem.c) || TextUtils.isEmpty(dXTemplateItem.f11925a)) {
                i.a("AliSDetailMainBarrage", "invalid data. no template");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(dXTemplateItem);
            dinamicXEngine.a(arrayList);
            this.e = dXTemplateItem;
            barrageView.setMaxCount(this.h);
            barrageView.setItemSpace(0);
            barrageView.setAnimatorDuration(300L);
            this.c = barrageView;
            this.m = str;
            if (!z) {
                return;
            }
            this.c.initDatas(this.f27402a.subList(0, 1), this.k);
            b();
            a(context, str, this.l);
        }

        private void a(Map<String, List<Event>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            } else if (map != null && map.size() != 0) {
                for (int i = 0; i < this.f27402a.size(); i++) {
                    this.f27402a.getJSONObject(i).put("events", (Object) map);
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
                if (i2 < this.f27402a.size()) {
                    this.b = i2;
                } else if (!this.g) {
                    return;
                } else {
                    this.b = 0;
                }
                if (this.c.addData(this.f27402a.getJSONObject(this.b), true)) {
                    return;
                }
                this.b = i;
            }
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            Runnable runnable = new Runnable() { // from class: tb.eln.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a.a(a.this);
                    a.b(a.this).remove(this);
                }
            };
            this.n.add(runnable);
            this.c.postDelayed(runnable, (long) (this.f * 1000.0d));
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            try {
                if (this.j == null || this.j.f25540a == null || this.j.f25540a.e() == null || TextUtils.isEmpty(this.m)) {
                    return;
                }
                b(this.j.f25540a.e(), this.m, this.l);
                if (this.c == null) {
                    return;
                }
                for (Runnable runnable : this.n) {
                    this.c.removeCallbacks(runnable);
                }
            } catch (Exception e) {
                ejf.c("AliSDetailMainBarrage", "BarrageManager onDestroy failed:" + e.getMessage());
            }
        }

        private void a(JSONObject jSONObject) {
            JSONArray jSONArray;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                return;
            }
            try {
                if (!jSONObject.getBooleanValue(MergeUtil.KEY_EXPOSED) && jSONObject.get("events") != null && (jSONArray = jSONObject.getJSONObject("events").getJSONArray(AURAEventKey.exposureItem)) != null && !jSONArray.isEmpty()) {
                    for (int i = 0; i < jSONArray.size(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        eje.a(this.j.f25540a, jSONObject2.getString("type"), AURAEventKey.exposureItem, null, jSONObject2.getJSONObject("fields"));
                    }
                    jSONObject.put(MergeUtil.KEY_EXPOSED, (Object) true);
                }
            } catch (Exception e) {
                ejf.c("AliSDetailMainBarrage", "exposeItem failed:" + e.getMessage());
            }
        }

        private void a(Context context, String str, ejg ejgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("140daf8", new Object[]{this, context, str, ejgVar});
                return;
            }
            ejh j = ejh.j(context);
            if (j == null) {
                return;
            }
            j.a((Activity) context, ejgVar, str);
        }

        private void b(Context context, String str, ejg ejgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2772dd7", new Object[]{this, context, str, ejgVar});
                return;
            }
            ejh j = ejh.j(context);
            if (j == null) {
                return;
            }
            j.b((Activity) context, ejgVar, str);
        }
    }
}
