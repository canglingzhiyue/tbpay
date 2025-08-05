package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.taobao.windvane.util.m;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.detail.rate.vivid.ability.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0006\u0010\u0011\u001a\u00020\u0006J\b\u0010\u0012\u001a\u0004\u0018\u00010\bJ\u0006\u0010\u0013\u001a\u00020\fJ\u0006\u0010\u0014\u001a\u00020\u000eJ\u0010\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\nJ\b\u0010\u0016\u001a\u00020\u000eH\u0002J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\u0006\u0010\u0018\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/taobao/detail/rate/vivid/utils/PreRenderContext;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "abilityEngine", "Lcom/taobao/android/abilitykit/AKAbilityEngine;", "dxEngine", "Lcom/taobao/android/dinamicx/DinamicXEngine;", "initialized", "", "registerReceiverAbilityBuild", "Lcom/taobao/detail/rate/vivid/ability/RegisterReceiverAbility$Builder;", "doInitialize", "", "paramsInfo", "Lcom/alibaba/fastjson/JSONObject;", "getAbilityEngine", "getDXEngine", "getRegisterReceiverAbilityBuild", "initialize", "sync", "initializeASync", "initializeSync", "release", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class rih {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f33164a;
    private DinamicXEngine b;
    private final dkt c;
    private c.a d;
    private boolean e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "result", "Lcom/taobao/android/dinamicx/notification/DXNotificationResult;", "kotlin.jvm.PlatformType", "onNotificationListener", "com/taobao/detail/rate/vivid/utils/PreRenderContext$doInitialize$1$1"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a implements fve {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f33165a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ DXRenderOptions.a c;
        public final /* synthetic */ rih d;
        public final /* synthetic */ JSONObject e;

        public a(Ref.BooleanRef booleanRef, JSONObject jSONObject, DXRenderOptions.a aVar, rih rihVar, JSONObject jSONObject2) {
            this.f33165a = booleanRef;
            this.b = jSONObject;
            this.c = aVar;
            this.d = rihVar;
            this.e = jSONObject2;
        }

        @Override // tb.fve
        public final void onNotificationListener(fvb fvbVar) {
            DXRenderOptions dXRenderOptions;
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
            } else if (fvbVar.f28139a == null || fvbVar.f28139a.isEmpty()) {
            } else {
                List<DXTemplateItem> list = fvbVar.f28139a;
                q.b(list, "result.finishedTemplateItems");
                Iterator<T> it = list.iterator();
                while (true) {
                    dXRenderOptions = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((DXTemplateItem) obj).f11925a.equals(kio.INSTANCE.n())) {
                        break;
                    }
                }
                DXTemplateItem dXTemplateItem = (DXTemplateItem) obj;
                if (dXTemplateItem != null && !this.f33165a.element) {
                    DinamicXEngine b = rih.b(this.d);
                    DXTemplateItem a2 = b != null ? b.a(dXTemplateItem) : null;
                    this.f33165a.element = true;
                    DinamicXEngine b2 = rih.b(this.d);
                    if (b2 != null) {
                        Context a3 = rih.a(this.d);
                        JSONObject jSONObject = this.b;
                        DXRenderOptions.a aVar = this.c;
                        if (aVar != null) {
                            dXRenderOptions = aVar.a();
                        }
                        b2.a(a3, a2, jSONObject, 0, dXRenderOptions);
                    }
                    m.e(kin.INSTANCE.a(), "结束预渲染：无历史渲染");
                }
                kpz.INSTANCE.a(fvbVar);
            }
        }
    }

    public rih(Context context) {
        q.d(context, "context");
        this.f33164a = context;
        this.c = new dkt(new alr(kin.INSTANCE.b(), "DX"), null);
        this.d = new c.a();
    }

    public static final /* synthetic */ Context a(rih rihVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("698d6a1f", new Object[]{rihVar}) : rihVar.f33164a;
    }

    public static final /* synthetic */ void a(rih rihVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6559cba9", new Object[]{rihVar, jSONObject});
        } else {
            rihVar.a(jSONObject);
        }
    }

    public static final /* synthetic */ DinamicXEngine b(rih rihVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("2d9f905f", new Object[]{rihVar}) : rihVar.b;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.e || !ses.INSTANCE.a()) {
        } else {
            this.e = true;
            m.e(kin.INSTANCE.a(), "开始预渲染.");
            if (z) {
                f();
            } else {
                g();
            }
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            a(false);
        }
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        JSONObject parseObject = JSONObject.parseObject(kil.a(this.f33164a, "rate_list_prerender_data.json"));
        m.e(kin.INSTANCE.a(), "预渲染JSON解析完毕.");
        a(parseObject);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J%\u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0006\"\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0014¨\u0006\u000b"}, d2 = {"com/taobao/detail/rate/vivid/utils/PreRenderContext$initializeASync$initializeTask$1", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "Lcom/alibaba/fastjson/JSONObject;", "doInBackground", "params", "", "([Ljava/lang/Void;)Lcom/alibaba/fastjson/JSONObject;", "onPostExecute", "", "paramsInfo", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class b extends AsyncTask<Void, Void, JSONObject> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.alibaba.fastjson.JSONObject] */
        @Override // android.os.AsyncTask
        public /* synthetic */ JSONObject doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, jSONObject});
            } else {
                a(jSONObject);
            }
        }

        public JSONObject a(Void... params) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("7ce2ee74", new Object[]{this, params});
            }
            q.d(params, "params");
            JSONObject paramsInfo = JSONObject.parseObject(kil.a(rih.a(rih.this), "rate_list_prerender_data.json"));
            m.e(kin.INSTANCE.a(), "预渲染JSON解析完毕.");
            q.b(paramsInfo, "paramsInfo");
            return paramsInfo;
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            } else {
                rih.a(rih.this, jSONObject);
            }
        }
    }

    private final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            new b().execute(new Void[0]);
        }
    }

    private final void a(JSONObject jSONObject) {
        DinamicXEngine dinamicXEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONObject a2 = kio.INSTANCE.a();
        if (a2 == null) {
            return;
        }
        this.b = kpz.INSTANCE.a(this.c, this.d, this.f33164a);
        DXRenderOptions.a aVar = new DXRenderOptions.a();
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        JSONObject jSONObject2 = new JSONObject();
        Long l = a2.getLong("version");
        q.b(l, "it.getLong(\"version\")");
        dXTemplateItem.b = l.longValue();
        dXTemplateItem.f11925a = a2.getString("name");
        dXTemplateItem.c = a2.getString("url");
        jSONObject2.put((JSONObject) "params", (String) jSONObject);
        DinamicXEngine dinamicXEngine2 = this.b;
        DXTemplateItem a3 = dinamicXEngine2 != null ? dinamicXEngine2.a(dXTemplateItem) : null;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        if (a3 == null || a3.b != dXTemplateItem.b) {
            m.e(kin.INSTANCE.a(), "有新版本，下载新版本");
            ArrayList arrayList = new ArrayList();
            arrayList.add(dXTemplateItem);
            DinamicXEngine dinamicXEngine3 = this.b;
            if (dinamicXEngine3 != null) {
                dinamicXEngine3.a(arrayList);
            }
            if (a3 == null && (dinamicXEngine = this.b) != null) {
                dinamicXEngine.a(new a(booleanRef, jSONObject2, aVar, this, jSONObject));
            }
        }
        if (a3 == null) {
            return;
        }
        DinamicXEngine dinamicXEngine4 = this.b;
        if (dinamicXEngine4 != null) {
            dinamicXEngine4.a(this.f33164a, a3, jSONObject2, 0, aVar.a());
        }
        m.e(kin.INSTANCE.a(), "结束预渲染：有历史渲染");
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        m.e(kin.INSTANCE.a(), "预渲染销毁.");
        DinamicXEngine dinamicXEngine = this.b;
        if (dinamicXEngine == null) {
            return;
        }
        dinamicXEngine.h();
    }

    public final DinamicXEngine c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("c0d4a65d", new Object[]{this}) : this.b;
    }

    public final dkt d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dkt) ipChange.ipc$dispatch("2618aa0e", new Object[]{this}) : this.c;
    }

    public final c.a e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c.a) ipChange.ipc$dispatch("19935c33", new Object[]{this}) : this.d;
    }
}
