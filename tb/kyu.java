package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.event.IPopMessageListener;
import com.taobao.homepage.pop.protocol.event.IPopViewEventListener;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.ucp.a;
import com.taobao.homepage.pop.utils.c;
import com.taobao.homepage.pop.view.container.BasePopContainer;
import com.taobao.homepage.pop.view.container.d;
import com.taobao.homepage.pop.viewmodel.PopDataViewModel;

/* loaded from: classes.dex */
public class kyu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static boolean l = false;
    public final lyo b;
    public final lae e;
    public final lac f;
    public final lad g;
    private final PopDataViewModel h = new PopDataViewModel();
    private final lak i = new lak();
    public final kzz d = new kzz();
    private final d j = new d(this, this.i);
    private final kzv k = new kzv(this, this.h, this.d);

    /* renamed from: a  reason: collision with root package name */
    public final kzu f30410a = new kzu(this.k, this.j);
    public final a c = new a(this.f30410a, this.d);

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        l = true;
        c.a("HomePopEngine ", "setFirstRenderFinish=true");
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : l;
    }

    public kyu(lyo lyoVar, lae laeVar, lac lacVar, lad ladVar) {
        this.b = lyoVar;
        this.e = laeVar;
        this.f = lacVar;
        this.g = ladVar;
        a(new kzx(this.g));
        a(new kzy(this.g));
        a(new laa());
    }

    public void a(IPopViewEventListener iPopViewEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31226556", new Object[]{this, iPopViewEventListener});
        } else {
            this.d.a(iPopViewEventListener);
        }
    }

    public void b(IPopViewEventListener iPopViewEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3e117", new Object[]{this, iPopViewEventListener});
        } else {
            this.d.b(iPopViewEventListener);
        }
    }

    public void a(IPopMessageListener iPopMessageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b349ec4", new Object[]{this, iPopMessageListener});
        } else {
            this.d.a(iPopMessageListener);
        }
    }

    public void b(IPopMessageListener iPopMessageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f416c5", new Object[]{this, iPopMessageListener});
        } else {
            this.d.b(iPopMessageListener);
        }
    }

    public void a(com.taobao.homepage.pop.protocol.event.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce75cd6", new Object[]{this, aVar});
        } else {
            this.d.a(aVar);
        }
    }

    public void b(com.taobao.homepage.pop.protocol.event.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2618317", new Object[]{this, aVar});
        } else {
            this.d.b(aVar);
        }
    }

    public void a(int i, Class<? extends laj> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1680d02", new Object[]{this, new Integer(i), cls});
        } else {
            this.i.a(i, cls);
        }
    }

    public BasePopContainer a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BasePopContainer) ipChange.ipc$dispatch("f9db05df", new Object[]{this, new Integer(i)}) : this.j.a(i);
    }

    public IPopData a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPopData) ipChange.ipc$dispatch("f583f522", new Object[]{this, str}) : this.h.getPopDataByBusinessId(str);
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
        } else {
            this.j.b(i, str);
        }
    }

    public void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
        } else {
            this.j.a(str, str2, jSONObject);
        }
    }

    public void b(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf2bb84", new Object[]{this, new Integer(i), str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.j.a(i, str);
        }
    }

    public void c(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18f44a63", new Object[]{this, new Integer(i), str});
            return;
        }
        IPopData a2 = a(str);
        if (a2 == null) {
            return;
        }
        a2.resetShowCount();
        this.j.a(i, str);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.j.a(str);
        }
    }

    public void a(IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ae3ed8", new Object[]{this, iPopData});
        } else if (!this.h.insertCustomPopData(this, iPopData)) {
            c.a("HomePopEngine ", "triggerPopShowByCustomData error, data invalid");
        } else {
            this.j.a(this, this.h);
        }
    }

    public kzu c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kzu) ipChange.ipc$dispatch("1e6a6bb6", new Object[]{this}) : this.f30410a;
    }

    public lad d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lad) ipChange.ipc$dispatch("261c258c", new Object[]{this}) : this.g;
    }

    public lac e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lac) ipChange.ipc$dispatch("2dcdcacc", new Object[]{this}) : this.f;
    }

    public lae f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lae) ipChange.ipc$dispatch("357f7069", new Object[]{this}) : this.e;
    }

    public lyo h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lyo) ipChange.ipc$dispatch("44e31675", new Object[]{this}) : this.b;
    }

    public d g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("f04ece3f", new Object[]{this}) : this.j;
    }

    public a i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("1ca7d499", new Object[]{this}) : this.c;
    }

    public lab b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lab) ipChange.ipc$dispatch("d4e7251f", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return this.e;
        }
        if (i == 1) {
            return this.f;
        }
        if (i == 3) {
            return this.b;
        }
        return this.g;
    }

    public boolean a(int i, IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4eddb189", new Object[]{this, new Integer(i), iPopData})).booleanValue() : this.j.a(i, iPopData);
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            this.j.j();
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            this.j.k();
        }
    }
}
