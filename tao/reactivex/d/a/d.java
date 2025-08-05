package tao.reactivex.d.a;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.jdz;
import tb.kge;

/* loaded from: classes9.dex */
public final class d extends AtomicReference<jdz> implements jdz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1471017938);
        kge.a(1964944663);
    }

    public d() {
    }

    public d(jdz jdzVar) {
        lazySet(jdzVar);
    }

    public boolean a(jdz jdzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ef30445c", new Object[]{this, jdzVar})).booleanValue() : a.a((AtomicReference<jdz>) this, jdzVar);
    }

    @Override // tb.jdz
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : a.a(get());
    }

    public boolean b(jdz jdzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ddb34add", new Object[]{this, jdzVar})).booleanValue() : a.c(this, jdzVar);
    }

    @Override // tb.jdz
    public void b_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
        } else {
            a.a((AtomicReference<jdz>) this);
        }
    }
}
