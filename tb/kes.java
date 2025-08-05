package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.InteractLocationData;
import com.taobao.bootimage.data.SplashInteractData;
import com.taobao.bootimage.g;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class kes {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static kes c;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, g> f30018a = new HashMap();
    private Map<String, SplashInteractData> b = new HashMap();

    static {
        kge.a(-1436576749);
        c = new kes();
    }

    private kes() {
    }

    public static kes a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kes) ipChange.ipc$dispatch("f06d1e5", new Object[0]) : c;
    }

    public SplashInteractData a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SplashInteractData) ipChange.ipc$dispatch("f565f800", new Object[]{this, str}) : this.b.get(str);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        g gVar = this.f30018a.get(str);
        if (gVar == null) {
            return;
        }
        kej.a(kem.TAG, "SplashDataMgr listener splashShow");
        gVar.b();
    }

    public void a(String str, SplashInteractData splashInteractData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("867e8ace", new Object[]{this, str, splashInteractData});
            return;
        }
        g gVar = this.f30018a.get(str);
        if (gVar == null) {
            return;
        }
        kej.a(kem.TAG, "SplashDataMgr listener splashAnimationBegin");
        gVar.a(splashInteractData);
    }

    public void b(String str, SplashInteractData splashInteractData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77d01a4f", new Object[]{this, str, splashInteractData});
            return;
        }
        g gVar = this.f30018a.get(str);
        if (gVar == null) {
            return;
        }
        kej.a(kem.TAG, "SplashDataMgr listener splashAnimationEnd");
        gVar.b(splashInteractData);
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        g gVar = this.f30018a.get(str);
        if (gVar == null) {
            return false;
        }
        kej.a(kem.TAG, "SplashDataMgr isShowInteractSplash" + str);
        return gVar.a();
    }

    public float d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d23b17e5", new Object[]{this, str})).floatValue();
        }
        g gVar = this.f30018a.get(str);
        if (gVar == null) {
            return 0.0f;
        }
        kej.a(kem.TAG, "SplashDataMgr getCornerRadius" + str);
        return gVar.d();
    }

    public InteractLocationData e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractLocationData) ipChange.ipc$dispatch("8bf77619", new Object[]{this, str});
        }
        g gVar = this.f30018a.get(str);
        if (gVar == null) {
            return null;
        }
        kej.a(kem.TAG, "SplashDataMgr getPosition" + str);
        return gVar.c();
    }
}
