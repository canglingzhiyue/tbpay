package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.s;
import com.taobao.taobao.R;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;

/* loaded from: classes6.dex */
public final class jnm implements dlt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f29646a = "toast";
    private final String b = "loading";
    private final String c = "megaability";
    private final WeakHashMap<Context, DinamicXEngine> d = new WeakHashMap<>();

    static {
        kge.a(-1941464845);
        kge.a(-1851837032);
    }

    @Override // tb.dlt
    public void a(String type, JSONObject jSONObject, Context ctx, dls callback) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1b3d82f", new Object[]{this, type, jSONObject, ctx, callback});
            return;
        }
        q.d(type, "type");
        q.d(ctx, "ctx");
        q.d(callback, "callback");
        List list = null;
        if (q.a((Object) type, (Object) this.f29646a)) {
            if (!a(dmr.h(), callback)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            String h = dmr.h();
            if (h != null) {
                list = n.b((CharSequence) h, new String[]{","}, false, 0, 6, (Object) null);
            }
            JSONObject jSONObject3 = jSONObject2;
            jSONObject3.put((JSONObject) "name", "toast_ability");
            if (list != null && list.size() >= 2) {
                i = list.get(1);
            }
            jSONObject3.put((JSONObject) "version", (String) i);
            if (list != null && (!list.isEmpty())) {
                h = (String) list.get(0);
            }
            jSONObject3.put((JSONObject) "url", h);
            t tVar = t.INSTANCE;
            a(jSONObject, ctx, callback, jSONObject2);
        } else if (!q.a((Object) type, (Object) this.b) || !a(dmr.i(), callback)) {
        } else {
            JSONObject jSONObject4 = new JSONObject();
            String i2 = dmr.i();
            if (i2 != null) {
                list = n.b((CharSequence) i2, new String[]{","}, false, 0, 6, (Object) null);
            }
            JSONObject jSONObject5 = jSONObject4;
            jSONObject5.put((JSONObject) "name", "loading_ability_ui");
            if (list != null && list.size() >= 2) {
                i = list.get(1);
            }
            jSONObject5.put((JSONObject) "version", (String) i);
            if (list != null && (!list.isEmpty())) {
                i2 = (String) list.get(0);
            }
            jSONObject5.put((JSONObject) "url", i2);
            t tVar2 = t.INSTANCE;
            a(jSONObject, ctx, callback, jSONObject4);
        }
    }

    private final boolean a(String str, dls dlsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("254b33db", new Object[]{this, str, dlsVar})).booleanValue();
        }
        String str2 = str;
        if (!(str2 == null || str2.length() == 0) && n.b((CharSequence) str2, (CharSequence) ",", false, 2, (Object) null)) {
            return true;
        }
        if (dlsVar != null) {
            dlsVar.a("template info empty");
        }
        return false;
    }

    @Override // tb.dlt
    public void a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        WeakHashMap<Context, DinamicXEngine> weakHashMap = this.d;
        if (weakHashMap == null || weakHashMap.isEmpty()) {
            z = true;
        }
        if (z) {
            return;
        }
        for (DinamicXEngine dinamicXEngine : this.d.values()) {
            try {
                dinamicXEngine.o();
            } catch (Throwable unused) {
            }
        }
        this.d.clear();
    }

    @Override // tb.dlt
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        try {
            DinamicXEngine remove = this.d.remove(context);
            if (remove == null) {
                return;
            }
            remove.o();
        } catch (Throwable unused) {
        }
    }

    private final void a(JSONObject jSONObject, Context context, dls dlsVar, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e0d8ab", new Object[]{this, jSONObject, context, dlsVar, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((JSONObject) "refreshType", "renderFirst");
        jSONObject4.put((JSONObject) "downgradeType", MonitorMediaPlayer.ABTEST_USE_CACHE_ENABLE);
        jSONObject4.put((JSONObject) "template", (String) jSONObject2);
        if (this.d.get(context) == null) {
            DinamicXEngine dinamicXEngine = dms.b(context) ? new DinamicXEngine(new DXEngineConfig.a(this.c).a(true, true).a()) : new DinamicXEngine(new DXEngineConfig(this.c));
            dinamicXEngine.a(jnj.DX_EVENT_ABILITYEVENTHANDLER, new jnj());
            this.d.put(context, dinamicXEngine);
        }
        jnk jnkVar = new jnk(jSONObject3);
        String str = this.c;
        DinamicXEngine dinamicXEngine2 = this.d.get(context);
        q.a(dinamicXEngine2);
        jnl jnlVar = new jnl(context, jnkVar, str, izm.NAME_SPACE_MEGA_DESIGN, dinamicXEngine2, null);
        jnlVar.a(new a(jnlVar, context, jSONObject, dlsVar));
    }

    /* loaded from: classes6.dex */
    public static final class a implements jnn {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jnl f29647a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ dls d;

        public a(jnl jnlVar, Context context, JSONObject jSONObject, dls dlsVar) {
            this.f29647a = jnlVar;
            this.b = context;
            this.c = jSONObject;
            this.d = dlsVar;
        }

        @Override // tb.jnn
        public void a(DXRootView dxRootView) {
            s a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acc619e9", new Object[]{this, dxRootView});
                return;
            }
            q.d(dxRootView, "dxRootView");
            DXResult<DXRootView> a3 = this.f29647a.a().a(this.b, dxRootView, dxRootView.getDxTemplateItem(), new JSONObject(this.c), -1, new DXRenderOptions.a().a());
            String str = null;
            if ((a3 != null ? a3.f11780a : null) != null && !a3.b()) {
                DXRootView dXRootView = a3.f11780a;
                q.a(dXRootView);
                dXRootView.setTag(R.id.mega_dx_widget_id, this.d);
                dls dlsVar = this.d;
                DXRootView dXRootView2 = a3.f11780a;
                q.a(dXRootView2);
                dlsVar.a(dXRootView2);
                return;
            }
            this.d.a("render template error");
            StringBuilder sb = new StringBuilder();
            sb.append("renderError-");
            if (a3 != null && (a2 = a3.a()) != null) {
                str = a2.toString();
            }
            sb.append(str);
            AppMonitor.Counter.commit("AbilityKit", "dxCreateViewError", sb.toString(), 1.0d);
        }

        @Override // tb.jnn
        public void a(String msg, s sVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c703f88f", new Object[]{this, msg, sVar});
                return;
            }
            q.d(msg, "msg");
            this.d.a(msg);
            StringBuilder sb = new StringBuilder();
            sb.append("dxError-");
            sb.append(sVar != null ? sVar.toString() : null);
            AppMonitor.Counter.commit("AbilityKit", "dxCreateViewError", sb.toString(), 1.0d);
        }
    }
}
