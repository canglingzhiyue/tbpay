package tb;

import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.alibaba.android.split.k;
import com.alibaba.android.split.manager.a;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bhc;

/* loaded from: classes2.dex */
public class bgm implements bgo<Fragment> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final bhd f25875a;

    static {
        kge.a(-1380268058);
        kge.a(503218550);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.support.v4.app.Fragment, java.lang.Object] */
    @Override // tb.bgo
    public /* synthetic */ Fragment b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : a();
    }

    public bgm(bhd bhdVar) {
        this.f25875a = bhdVar;
    }

    public Fragment a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("13a755ca", new Object[]{this});
        }
        try {
            if (this.f25875a.b() != null && this.f25875a.b().get() != null && !TextUtils.isEmpty(this.f25875a.d())) {
                ((a) k.a()).c().a(this.f25875a.b().get(), this.f25875a.d());
            }
            if (this.f25875a.b() != null && this.f25875a.b().get() != null) {
                Fragment instantiate = Fragment.instantiate(this.f25875a.b().get(), this.f25875a.a(), this.f25875a.e());
                if (this.f25875a.f() != null) {
                    this.f25875a.f().a((bhc.b<Fragment>) instantiate, this.f25875a.e());
                }
                return instantiate;
            } else if (this.f25875a.f() == null) {
                return null;
            } else {
                this.f25875a.f().a("context has detroy", this.f25875a.e());
                return null;
            }
        } catch (Exception e) {
            if (this.f25875a.f() == null) {
                return null;
            }
            this.f25875a.f().a(e.getMessage(), this.f25875a.e());
            return null;
        }
    }
}
