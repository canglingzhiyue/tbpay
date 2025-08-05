package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import java.util.List;
import kotlin.Result;
import kotlin.collections.p;
import kotlin.i;
import kotlin.jvm.internal.q;

/* loaded from: classes9.dex */
public final class tnh implements tng {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final tnh INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final List<tng> f34228a;

    static {
        kge.a(1870436463);
        kge.a(149340489);
        INSTANCE = new tnh();
        f34228a = p.a(tnf.INSTANCE);
    }

    private tnh() {
    }

    @Override // tb.tng
    public AppManifest a(tni baseInfo) {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppManifest) ipChange.ipc$dispatch("9a8602ac", new Object[]{this, baseInfo});
        }
        q.d(baseInfo, "baseInfo");
        for (tng tngVar : f34228a) {
            try {
                Result.a aVar = Result.Companion;
                m2371constructorimpl = Result.m2371constructorimpl(tngVar.a(baseInfo));
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
            }
            if (Result.m2377isFailureimpl(m2371constructorimpl)) {
                m2371constructorimpl = null;
            }
            AppManifest appManifest = (AppManifest) m2371constructorimpl;
            if (appManifest != null) {
                appManifest.setPreset(true);
                return appManifest;
            }
        }
        return null;
    }
}
