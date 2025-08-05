package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mmad.ability.biz.coupon.b;

/* loaded from: classes7.dex */
public class tix extends tit<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String c = "1";
    private final String d = "101";
    private final String e = "2";
    private final String f = "102";

    static {
        kge.a(-1226259457);
    }

    public static /* synthetic */ Object ipc$super(tix tixVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.tit
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "commonActionEvent";
    }

    @Override // tb.tit
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if ("1".equals(str)) {
            b();
        } else if ("101".equals(str)) {
            b();
            c();
        } else if ("2".equals(str)) {
            d();
        } else if ("102".equals(str)) {
            d();
            c();
        } else {
            stv.a("CommonActionEvent", "can't handle, default jumpNextPage, actionResponse=" + str);
            c();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.e().a("addToCart", tiv.a(new tja(this.b.d().b()), this.f34136a));
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.b.e().a("jumpNextPage", tiv.a(this.b.d().b().getTargetUrl(), this.f34136a));
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.b.e().a("claimedCoupon", tiv.a(new b(this.b.d().b()), this.f34136a));
        }
    }
}
