package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.j;
import com.taobao.android.upp.UppProtocolImpl;
import com.taobao.gateway.dispatch.a;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import tb.osz;

/* loaded from: classes8.dex */
public class otg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ksk f32386a;
    private final boolean b = j.a("afterBuyPopShowEnable", true);
    private boolean c;
    private boolean d;
    private boolean e;
    private final osy f;
    private osz.a g;

    static {
        kge.a(424325475);
    }

    public static /* synthetic */ void a(otg otgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8915476", new Object[]{otgVar});
        } else {
            otgVar.f();
        }
    }

    public static /* synthetic */ boolean a(otg otgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1999ed22", new Object[]{otgVar, new Boolean(z)})).booleanValue();
        }
        otgVar.e = z;
        return z;
    }

    public otg(osy osyVar) {
        this.f = osyVar;
        e.e("PopNotify", "当前的orange开关是：" + this.c);
        h();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        e.e("PopNotify", "信息流完全可见了，需要触发pop展示");
        f();
        this.d = true;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        e.e("PopNotify", "信息流不完全可见了，需要触发pop隐藏");
        g();
        this.d = false;
    }

    public void a(ksk kskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b1abf5", new Object[]{this, kskVar});
        } else if (this.f32386a != null) {
        } else {
            this.f32386a = kskVar;
            b(kskVar);
            e.e("PopNotify", "信息流上屏了，初始化pop监听");
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        e.e("PopNotify", "不在屏幕上了");
        g();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.d) {
        } else {
            a.b().a(new Runnable() { // from class: tb.otg.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    e.e("PopNotify", "pageBack还在置顶态，触发下pop展示");
                    otg.a(otg.this);
                }
            }, 0L);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        e.e("PopNotify", "destroy");
        g();
        c(this.f32386a);
        i();
    }

    private void f() {
        ksk kskVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!this.b || !this.e || (kskVar = this.f32386a) == null) {
            e.e("PopNotify", "当前是否允许触发pop展示：" + this.b + "当前请求是否成功：" + this.e);
        } else {
            String b = kskVar.b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("containerId", (Object) this.f32386a.a());
            UppProtocolImpl.getInstance().sendUCPEventWithScene(b, "afterBuyRecmdSticky", jSONObject);
            this.c = true;
            oth.a(this.f32386a.a(), oth.REACH_TOP);
            e.e("PopNotify", "通知ucp置顶了,当前的页面名称是：" + b);
        }
    }

    private void g() {
        ksk kskVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!this.b || !this.c || (kskVar = this.f32386a) == null) {
            e.e("PopNotify", "当前是否允许触发pop隐藏：" + this.c + "当前是否展示过pop: " + this.c);
        } else {
            String b = kskVar.b();
            kuk.a("afterBuyFeedsStickEnd").b(b).b();
            this.c = false;
            oth.a(this.f32386a.a(), oth.NOT_REACH_TOP);
            e.e("PopNotify", "通知pop该隐藏了,当前的页面名称是：" + b);
        }
    }

    private void b(ksk kskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e034b276", new Object[]{this, kskVar});
        } else if (kskVar == null) {
        } else {
            kum.a(kskVar.b(), null);
        }
    }

    private void c(ksk kskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb7b8f7", new Object[]{this, kskVar});
        } else if (kskVar == null) {
        } else {
            kum.a(kskVar.b());
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.f == null) {
        } else {
            this.g = j();
            this.f.a(this.g);
        }
    }

    private void i() {
        osz.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        osy osyVar = this.f;
        if (osyVar == null || (aVar = this.g) == null) {
            return;
        }
        osyVar.b(aVar);
    }

    private osz.a j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (osz.a) ipChange.ipc$dispatch("61019302", new Object[]{this}) : new osz.a() { // from class: tb.otg.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.osz.a
            public void a(String str, AwesomeGetRequestParams awesomeGetRequestParams, String str2, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d40c4874", new Object[]{this, str, awesomeGetRequestParams, str2, new Boolean(z)});
                }
            }

            @Override // tb.osz.a
            public void a(String str, String str2, AwesomeGetData awesomeGetData, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("548d9f91", new Object[]{this, str, str2, awesomeGetData, new Boolean(z)});
                } else if (!"pageEnter".equals(str2)) {
                } else {
                    otg.a(otg.this, true);
                }
            }

            @Override // tb.osz.a
            public void a(String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                } else if (!"pageEnter".equals(str)) {
                } else {
                    otg.a(otg.this, false);
                }
            }
        };
    }
}
