package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.c;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.aura.taobao.adapter.extension.weex2.model.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.f;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.arc;

/* loaded from: classes2.dex */
public class bag {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private p f25727a;
    private bae b;
    private FrameLayout c;
    private View d;
    private aqs e;
    private AURARenderComponent f;
    private q g;
    private AURAGlobalData h;
    private String i;
    private AtomicInteger j = new AtomicInteger(0);
    private a k;

    static {
        kge.a(-1492167823);
    }

    public static /* synthetic */ AtomicInteger a(bag bagVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("e91654ba", new Object[]{bagVar}) : bagVar.j;
    }

    public bag(FrameLayout frameLayout, bae baeVar, q qVar, AURAGlobalData aURAGlobalData, aqs aqsVar, a aVar) {
        this.b = baeVar;
        this.c = frameLayout;
        this.e = aqsVar;
        this.g = qVar;
        this.h = aURAGlobalData;
        try {
            a(aVar.f());
        } catch (Exception unused) {
        }
        n();
        o();
    }

    public FrameLayout a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("46931b71", new Object[]{this}) : this.c;
    }

    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        p pVar = this.f25727a;
        if (pVar == null) {
            return null;
        }
        return pVar.getRenderRoot();
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.i;
    }

    public void a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
            return;
        }
        this.i = aURARenderComponent.key;
        this.f = aURARenderComponent;
    }

    public AURARenderComponent d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURARenderComponent) ipChange.ipc$dispatch("4aa17516", new Object[]{this}) : this.f;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.j.get();
    }

    public bae f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bae) ipChange.ipc$dispatch("357ae4b3", new Object[]{this}) : this.b;
    }

    public q g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("6d602b51", new Object[]{this}) : this.g;
    }

    public AURAGlobalData h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAGlobalData) ipChange.ipc$dispatch("427d6b05", new Object[]{this}) : this.h;
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        FrameLayout a2 = a();
        if (a2 == null) {
            arc.a().b("Weex2InstanceWrapper|createWeex2Instance|containerLayout is null", arc.a.a().b("Weex2InstanceWrapper").a("AURA/core").b());
            return;
        }
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        mUSInstanceConfig.d(true);
        mUSInstanceConfig.a(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
        mUSInstanceConfig.f(false);
        mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.texture);
        mUSInstanceConfig.a(new f() { // from class: tb.bag.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.f
            public void onCreateView(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1414cfeb", new Object[]{this, view});
                    return;
                }
                bae f = bag.this.f();
                if (f == null) {
                    return;
                }
                f.a(bag.this, view);
            }
        });
        this.f25727a = com.taobao.android.weex_framework.q.a().a(a2.getContext(), mUSInstanceConfig);
        this.f25727a.setGestureConsumptionView(a2);
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        p pVar = this.f25727a;
        if (pVar == null) {
            return;
        }
        pVar.registerRenderListener(new g() { // from class: tb.bag.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.g
            public void onForeground(p pVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6fafc624", new Object[]{this, pVar2});
                }
            }

            @Override // com.taobao.android.weex_framework.g
            public void onPrepareSuccess(p pVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9635d60b", new Object[]{this, pVar2});
                }
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRenderSuccess(p pVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3fdf238", new Object[]{this, pVar2});
                    return;
                }
                bag.a(bag.this).set(2);
                bae f = bag.this.f();
                if (f == null) {
                    return;
                }
                f.a(bag.this);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRenderFailed(p pVar2, int i, String str, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4253181b", new Object[]{this, pVar2, new Integer(i), str, new Boolean(z)});
                    return;
                }
                bag.a(bag.this).set(3);
                bae f = bag.this.f();
                if (f == null) {
                    return;
                }
                f.a(bag.this, i, str, z);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRefreshSuccess(p pVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7cd7e3df", new Object[]{this, pVar2});
                } else {
                    bag.this.f();
                }
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRefreshFailed(p pVar2, int i, String str, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f63c5f14", new Object[]{this, pVar2, new Integer(i), str, new Boolean(z)});
                    return;
                }
                bae f = bag.this.f();
                if (f == null) {
                    return;
                }
                f.b(bag.this, i, str, z);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onJSException(p pVar2, int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("831fc52e", new Object[]{this, pVar2, new Integer(i), str});
                    return;
                }
                bae f = bag.this.f();
                if (f == null) {
                    return;
                }
                f.a(bag.this, i, str);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onFatalException(p pVar2, int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bcd71451", new Object[]{this, pVar2, new Integer(i), str});
                    return;
                }
                bae f = bag.this.f();
                if (f == null) {
                    return;
                }
                f.b(bag.this, i, str);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onDestroyed(MUSDKInstance mUSDKInstance) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
                } else {
                    bag.a(bag.this).set(4);
                }
            }
        });
    }

    public void a(jvr jvrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f02a4872", new Object[]{this, jvrVar});
        } else if (jvrVar == null) {
        } else {
            this.f25727a.registerReportInfoListener(jvrVar);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c33ab62", new Object[]{this, aVar});
            return;
        }
        this.k = aVar;
        if (this.f25727a == null) {
            arc.a().b("renderByModel:mWeexInstance is null", arc.a.a().b("Weex2InstanceWrapper").a("AURA/core").b());
        } else if (aVar == null) {
            arc.a().b("renderByModel:renderModel is null", arc.a.a().b("Weex2InstanceWrapper").a("AURA/core").b());
        } else {
            String a2 = aVar.a();
            if (StringUtils.isEmpty(a2)) {
                arc.a().b("renderByModel:url isEmpty", arc.a.a().b("Weex2InstanceWrapper").a("AURA/core").b());
                return;
            }
            this.j.set(1);
            this.f25727a.initWithURL(Uri.parse(a2));
            this.f25727a.render(aVar.c(), aVar.b());
        }
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        q qVar = this.g;
        if (qVar == null) {
            arc.a().b("sendEvent:auraUserContext null", arc.a.a().b("Weex2InstanceWrapper").a("AURA/core").b());
            return;
        }
        s b = qVar.b();
        if (b == null) {
            arc.a().b("sendEvent:auraInstance null", arc.a.a().b("Weex2InstanceWrapper").a("AURA/core").b());
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put(str2, (Object) str3);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("instanceId", (Object) l());
        jSONObject2.put(bah.KEY_MESSAGE_ACTION, (Object) str);
        jSONObject2.put("message", (Object) jSONObject);
        d dVar = new d();
        dVar.a(d());
        dVar.a(jSONObject2);
        dVar.d(this.i);
        c.a(b, bah.EVENT_TYPE, dVar);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.d = null;
        this.b = null;
        this.c = null;
        this.e = null;
        this.g = null;
        this.h = null;
        this.f = null;
        p pVar = this.f25727a;
        if (pVar == null) {
            return;
        }
        pVar.destroy();
    }

    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        aqs aqsVar = this.e;
        if (aqsVar == null || aqsVar == null) {
            arc.a().c("Weex2InstanceWrapper", "reportError", str);
            return;
        }
        b bVar = new b(1, "Weex2", "weex2#bizError", str);
        if (!StringUtils.isEmpty(this.i)) {
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("AuraComponentKey", this.i);
            bVar.a(map);
        }
        this.e.a(bVar);
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.d = view;
            if (!jqm.a()) {
                return;
            }
            ard a2 = arc.a();
            a2.a("Weex2InstanceWrapper", "setBackgroundView", hashCode() + ": setBackgroundView :" + this.d + ", view:" + view + ":thread:" + Thread.currentThread().hashCode());
        }
    }

    public View j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b51e1df3", new Object[]{this});
        }
        if (jqm.a()) {
            ard a2 = arc.a();
            a2.a("Weex2InstanceWrapper", "getBackgroundView", hashCode() + ": getBackgroundView.get() :" + this.d + ":thread:" + Thread.currentThread().hashCode());
        }
        return this.d;
    }

    public a k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("fa747cec", new Object[]{this}) : this.k;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this});
        }
        p pVar = this.f25727a;
        if (pVar != null) {
            return String.valueOf(pVar.getInstanceId());
        }
        return null;
    }

    public p m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("180ae9f1", new Object[]{this}) : this.f25727a;
    }
}
