package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mmad.ability.biz.coupon.a;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class tiv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, tit> f34137a = new HashMap<>();
    private tiq b;

    static {
        kge.a(-588590863);
    }

    public tiv(tiq tiqVar) {
        this.b = tiqVar;
        a(new tiy());
        a(new tiz());
        a(new a());
        a(new tix());
    }

    public boolean a(tit titVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8475dd", new Object[]{this, titVar})).booleanValue();
        }
        if (titVar == null) {
            stv.a("EventCenter", "registerEvent: event is null");
            return false;
        } else if (this.f34137a.containsKey(titVar.a())) {
            stv.a("EventCenter", "registerEvent: event already exists");
            return false;
        } else {
            this.f34137a.put(titVar.a(), titVar);
            stv.a("EventCenter", "registerEvent: success name=" + titVar.a());
            return true;
        }
    }

    public void a(String str, tiw tiwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407048c0", new Object[]{this, str, tiwVar});
            return;
        }
        tit titVar = this.f34137a.get(str);
        if (titVar == null) {
            stv.a("EventCenter", "executeEvent: event not found name=" + str);
            return;
        }
        try {
            titVar.a(this.b, tiwVar);
        } catch (Exception e) {
            stv.a("EventCenter", "executeEvent: event=" + titVar.a() + " error", e);
        }
    }

    public static <T> tiw<T> a(T t, tiu tiuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tiw) ipChange.ipc$dispatch("f873b790", new Object[]{t, tiuVar}) : new tiw<>(t, tiuVar);
    }
}
