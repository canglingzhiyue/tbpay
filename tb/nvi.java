package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class nvi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final nvm f31788a;

    static {
        kge.a(-1743982258);
    }

    public nvi(ljs ljsVar) {
        this.f31788a = new nvm(ljsVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ldf.d("BannerFestivalRefresher", "BannerFestivalRefresher.onFestivalRefresh");
        nuw.a("BannerFestivalRefresher", "onFestivalRefresh");
        this.f31788a.c();
        nuw.b("BannerFestivalRefresher", "onFestivalRefresh");
    }
}
