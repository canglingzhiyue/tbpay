package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.datastructure.a;
import com.taobao.android.gateway.msgcenter.b;
import com.taobao.android.home.component.utils.h;
import com.taobao.informationflowdataservice.dataservice.core.datasource.protocol.a;

/* loaded from: classes7.dex */
public class lxe implements lxj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f30967a = new a(a());
    public a b = new a(a() + oan.DEFAULT_PLAN_B_PASSWORD_REGEX);
    public a c = new a(a() + ".error");
    public a d = new a(a() + ".loading");
    public a e = new a(a() + ".*.overlay");
    private lwz f;
    private lxf g;

    static {
        kge.a(135067856);
        kge.a(1922460647);
    }

    private String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : h.HOMEPAGE_NEWFACE;
    }

    public lxe(lwz lwzVar, b bVar) {
        this.f = lwzVar;
        this.g = new lxf(lwzVar, bVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ef, code lost:
        if (r8.equals("LoadCache") != false) goto L14;
     */
    @Override // tb.lxj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.String r8, java.lang.String[] r9, com.alibaba.fastjson.JSONObject r10) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lxe.a(java.lang.String, java.lang.String[], com.alibaba.fastjson.JSONObject):boolean");
    }

    private void b(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c68ee71a", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.g(), this.f.h()};
        }
        this.g.a("OnlyUiRefresh", this.f30967a, strArr, a(jSONObject));
    }

    private void c(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec22f01b", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.g(), this.f.h()};
        }
        this.g.a("PullToRefresh", this.f30967a, strArr, a(jSONObject));
    }

    private void d(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11b6f91c", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.g(), this.f.h()};
        }
        this.g.a("LoadCache", this.f30967a, strArr, jSONObject);
    }

    private void e(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("374b021d", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.g(), this.f.h()};
        }
        this.g.a("ColdStart", this.f30967a, strArr, a(jSONObject));
    }

    private void f(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cdf0b1e", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.g(), this.f.h()};
        }
        this.g.a("HotStart", this.f30967a, strArr, a(jSONObject));
    }

    private void g(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8273141f", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.g(), this.f.h()};
        }
        if (h(strArr, jSONObject)) {
            return;
        }
        this.g.a("PageBack", this.f30967a, strArr, jSONObject);
    }

    private boolean h(final String[] strArr, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8071d24", new Object[]{this, strArr, jSONObject})).booleanValue();
        }
        com.taobao.informationflowdataservice.dataservice.core.datasource.protocol.a a2 = this.f.a(strArr);
        if (a2 == null) {
            return false;
        }
        return a2.a("PageBack", strArr, jSONObject, new a.InterfaceC0673a() { // from class: tb.lxe.1
        });
    }

    private void i(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9b2621", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.h()};
        }
        this.g.a("PageBack", this.f30967a, strArr, jSONObject);
    }

    private void j(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f32f2f22", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.g(), this.f.h()};
        }
        this.g.a("PageEnter", this.f30967a, strArr, jSONObject);
    }

    private void k(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18c33823", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.g(), this.f.h()};
        }
        this.g.a("PageSwitch", this.f30967a, strArr, jSONObject);
    }

    private void l(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e574124", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.g(), this.f.h()};
        }
        this.g.a("LocationChanged", this.f30967a, strArr, jSONObject);
    }

    private void m(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63eb4a25", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.g(), this.f.h()};
        }
        this.g.a("ChangeCity", this.f30967a, strArr, jSONObject);
    }

    private void n(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("897f5326", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.g(), this.f.h()};
        }
        this.g.a("Preview", this.f30967a, strArr, jSONObject);
    }

    private void o(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af135c27", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.g(), this.f.h()};
        }
        this.g.a("EditionSwitch", this.f30967a, strArr, a(jSONObject));
    }

    private void p(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a76528", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.g(), this.f.h()};
        }
        this.g.a("UserLogin", this.f30967a, strArr, a(jSONObject));
    }

    private void q(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3b6e29", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.h()};
        }
        this.g.a("ViewAppear", this.b, strArr, jSONObject);
    }

    private void r(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fcf772a", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.h()};
        }
        this.g.a("ViewClick", this.c, strArr, jSONObject);
    }

    private void s(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4563802b", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.h()};
        }
        this.g.a("ViewClick", this.d, strArr, jSONObject);
    }

    private void t(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af7892c", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.h()};
        }
        this.g.a("DeleteOperation", this.e, strArr, jSONObject);
    }

    private void u(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908b922d", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.g(), this.f.h()};
        }
        this.g.a("HomeTabAppear", this.f30967a, strArr, jSONObject);
    }

    private void v(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b61f9b2e", new Object[]{this, strArr, jSONObject});
        } else if (strArr == null || strArr.length != 1) {
        } else {
            this.f.c(strArr[0]);
        }
    }

    public void a(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0fade19", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.h()};
        }
        this.g.a("OnlyRequest", this.f30967a, strArr, a(jSONObject));
    }

    private JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("bizParam");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
            jSONObject.put("bizParam", (Object) jSONObject2);
        }
        jSONObject2.put(lxf.f30969a, (Object) true);
        return jSONObject;
    }
}
