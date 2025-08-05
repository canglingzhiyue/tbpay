package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.a;
import com.taobao.android.buy.internal.status.f;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class tcy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f34036a;
    private String b;
    private UMFLinkageTrigger c;
    private jcp d;
    private final AURAGlobalData e;
    private final q f;
    private final f g;
    private Runnable i;
    private volatile boolean j;
    private final List<AURAEventIO> k = new ArrayList();
    private final Handler h = new Handler(Looper.getMainLooper());

    static {
        kge.a(89519270);
    }

    public static /* synthetic */ List a(tcy tcyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("1d16b1d9", new Object[]{tcyVar}) : tcyVar.k;
    }

    public static /* synthetic */ void a(tcy tcyVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61459e6", new Object[]{tcyVar, new Boolean(z)});
        } else {
            tcyVar.b(z);
        }
    }

    public static /* synthetic */ boolean a(tcy tcyVar, AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9da9761e", new Object[]{tcyVar, aURAEventIO})).booleanValue() : tcyVar.c(aURAEventIO);
    }

    public static /* synthetic */ void b(tcy tcyVar, AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb68ee1b", new Object[]{tcyVar, aURAEventIO});
        } else {
            tcyVar.d(aURAEventIO);
        }
    }

    public static /* synthetic */ boolean b(tcy tcyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eeb53533", new Object[]{tcyVar})).booleanValue() : tcyVar.j;
    }

    public static /* synthetic */ void c(tcy tcyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd383bb0", new Object[]{tcyVar});
        } else {
            tcyVar.g();
        }
    }

    public tcy(q qVar, AURAGlobalData aURAGlobalData) {
        this.f = qVar;
        this.e = aURAGlobalData;
        this.g = (f) qVar.a(dtl.USERDATA_KEY_STATUS_MANAGER, f.class);
    }

    public boolean a(s sVar, AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a85757b", new Object[]{this, sVar, aURAGlobalData})).booleanValue();
        }
        if (this.c == null) {
            arc.a().a("stream", "UMFLinkageTrigger is null.");
            return false;
        } else if (TextUtils.isEmpty(this.b)) {
            arc.a().a("stream", "queryParams is null.");
            return false;
        } else {
            jcp jcpVar = this.d;
            if (jcpVar != null) {
                jcpVar.c();
            }
            arc.a().a("stream", "STREAM_QP_EXCEPTION");
            tcz.a("STREAM_QP_TAIR_EXCEPTION");
            sVar.a("aura.workflow.adjust", this.c, null);
            return true;
        }
    }

    public void a(final s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c6ecbcf", new Object[]{this, sVar});
        } else if (this.k.isEmpty()) {
            arc.a().a("stream", "AppendingEvents is null.");
        } else {
            b(false);
            arc.a().a("stream", "dispatchPendingEvent.");
            bbh.b(new Runnable() { // from class: tb.tcy.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!tcy.a(tcy.this).isEmpty() && !tcy.b(tcy.this)) {
                        for (AURAEventIO aURAEventIO : tcy.a(tcy.this)) {
                            if (tcy.a(tcy.this, aURAEventIO)) {
                                tcy.b(tcy.this, aURAEventIO);
                            }
                            sVar.a("aura.workflow.event", aURAEventIO, new aqq() { // from class: tb.tcy.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // tb.aqq, tb.aqs
                                public void a(b bVar) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("2c671180", new Object[]{this, bVar});
                                    } else {
                                        tcz.a(bVar.b());
                                    }
                                }
                            });
                        }
                        tcy.a(tcy.this).clear();
                    }
                }
            });
        }
    }

    public void a(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d42ad4", new Object[]{this, aURAEventIO});
            return;
        }
        b(true);
        b(aURAEventIO);
        a(sad.DEFAULT_TCP_CONNECT_TIMEOUT_MS);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            h();
        }
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        this.i = new Runnable() { // from class: tb.tcy.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                tcy.a(tcy.this, false);
                tcy.c(tcy.this);
                tcy.this.c();
            }
        };
        this.h.postDelayed(this.i, j);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        a aVar = (a) this.f.a(a.class.getSimpleName(), a.class);
        if (aVar == null) {
            return;
        }
        arc.a().a("stream", "show error popup.");
        tcz.a("STREAM_DATA_TIME_OUT_ERROR");
        this.j = true;
        aVar.a(new kqu().b(com.alibaba.ability.localization.b.a(R.string.app_wait_a_minute)).d("STREAM_DATA_TIMEOUT").e(com.alibaba.ability.localization.b.a(R.string.taobao_app_3180_1_29366)).a(com.alibaba.ability.localization.b.a(R.string.app_back), a("pop")).b(com.alibaba.ability.localization.b.a(R.string.taobao_app_3180_1_29368), a("refresh")).a());
    }

    private JSONArray a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("2cbc73a7", new Object[]{this, strArr});
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", (Object) str);
            jSONArray.add(jSONObject);
        }
        return jSONArray;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        Runnable runnable = this.i;
        if (runnable == null) {
            return;
        }
        this.h.removeCallbacks(runnable);
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (this.g == null) {
        } else {
            ard a2 = arc.a();
            a2.a("stream", "showLoading :" + z);
            if (z) {
                this.g.a(2);
            } else {
                this.g.a();
            }
        }
    }

    private boolean c(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dfc3cda", new Object[]{this, aURAEventIO})).booleanValue() : azp.EVENT_TYPE.equals(aURAEventIO.getEventType());
    }

    private void d(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("639045d7", new Object[]{this, aURAEventIO});
            return;
        }
        d eventModel = aURAEventIO.getEventModel();
        AURARenderComponent d = eventModel.d();
        if (d == null) {
            return;
        }
        eventModel.a(a((List) this.e.get("render_view_item_models", List.class), d.key));
    }

    private AURARenderComponent a(List<AURARenderComponent> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("a43af0e", new Object[]{this, list, str});
        }
        if (list != null && !TextUtils.isEmpty(str)) {
            for (AURARenderComponent aURARenderComponent : list) {
                if (str.equals(aURARenderComponent.key)) {
                    return aURARenderComponent;
                }
            }
        }
        return null;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    public void a(UMFLinkageTrigger uMFLinkageTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("115c7adb", new Object[]{this, uMFLinkageTrigger});
        } else {
            this.c = uMFLinkageTrigger;
        }
    }

    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
        } else {
            this.k.add(aURAEventIO);
        }
    }

    public void a(jcp jcpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1da121", new Object[]{this, jcpVar});
        } else {
            this.d = jcpVar;
        }
    }

    public jcp d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jcp) ipChange.ipc$dispatch("261b45c4", new Object[]{this}) : this.d;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : f() && this.f34036a;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        jcp jcpVar = this.d;
        return jcpVar != null && jcpVar.a() && this.d.b();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f34036a = z;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.b = null;
        this.c = null;
        this.k.clear();
        this.j = false;
        this.f34036a = false;
        Runnable runnable = this.i;
        if (runnable == null) {
            return;
        }
        this.h.removeCallbacks(runnable);
    }
}
