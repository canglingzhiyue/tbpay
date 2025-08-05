package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.e;
import com.taobao.bootimage.f;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.bootimage.linked.ext.BootImageWVBridge;
import com.taobao.bootimage.linked.h;
import java.util.List;

/* loaded from: classes.dex */
public class kec extends keb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private e f30003a;
    private final kdo b;
    private final kdx c;

    static {
        kge.a(1615470903);
    }

    public static /* synthetic */ Object ipc$super(kec kecVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public kec() {
        h a2 = h.a("");
        this.b = a2.f();
        this.c = a2.e();
    }

    @Override // tb.keb
    public void a(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb445a", new Object[]{this, activity, new Boolean(z)});
            return;
        }
        keo.e("ColdStart");
        if (!kel.c) {
            return;
        }
        if (kel.c() && (!keo.a(this.b.e()) || kel.j())) {
            kej.a("BootImagePageState", "coldStart: 新架构");
            h.a("").j().a(1000, activity);
            return;
        }
        kej.a("BootImagePageState", "coldStart: run isInFatigue");
        if (this.c.a()) {
            kej.a("BootImagePageState", "coldStart: in fatigue limit");
            return;
        }
        kej.a("BootImagePageState", "coldStart: pass fatigue");
        if (this.b.a() && !z) {
            kej.a("BootImagePageState", "coldStart: BootImageWVBridge register");
            BootImageWVBridge.register();
            this.b.a(activity);
            return;
        }
        kej.a("BootImagePageState", "coldStart: showSplashAD");
        new f(activity).a();
    }

    @Override // tb.keb
    public void b(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb8c4bb9", new Object[]{this, activity, new Boolean(z)});
            return;
        }
        keo.e("HotStart");
        List<LinkedSplashData> c = h.a("").c();
        if (kel.c() && (!keo.a(c) || kel.j())) {
            kej.a("BootImagePageState", "hotStart: 新架构");
            h.a("").j().a(1001, activity);
            return;
        }
        kej.a("BootImagePageState", "hotStart: 开始执行isInFatigue");
        if (this.c.a()) {
            return;
        }
        BootImageWVBridge.register();
        this.f30003a = new e(activity);
        this.f30003a.a(false, z);
    }

    @Override // tb.keb
    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        kem.a().k();
        this.b.d();
        if (kel.c()) {
            kej.a("BootImagePageState", "pageInBackground: 新架构");
            h.a("").j().b(205);
            return;
        }
        a();
    }

    @Override // tb.keb
    public void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{this, str, th});
            return;
        }
        try {
            kej.a("BootImagePageState", "pageInErrorState lifeState:" + str + " , msg:" + th.getMessage());
            a();
            if (!kel.c()) {
                return;
            }
            kej.a("BootImagePageState", "pageInErrorState: 新架构");
            h.a("").j().b(205);
        } catch (Throwable th2) {
            kej.a("BootImagePageState", "pageInErrorState error again!\n" + th2.getMessage());
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        e eVar = this.f30003a;
        if (eVar == null || eVar.f()) {
            return;
        }
        this.f30003a.e();
    }
}
