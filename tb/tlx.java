package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.p;
import kotlin.i;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/taobao/themis/taobao/domain/TMSSwitchChecker;", "", "()V", "checkerList", "Ljava/util/ArrayList;", "Lcom/taobao/themis/taobao/domain/ITMSSwitchChecker;", "Lkotlin/collections/ArrayList;", "shouldSwitchToTMS", "", "navigationInfo", "Lcom/taobao/themis/taobao/domain/NavigationInfo;", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class tlx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final tlx INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayList<tlu> f34203a;

    static {
        kge.a(-82511961);
        INSTANCE = new tlx();
        f34203a = p.d(new tlt(), new tly(), new tlw());
    }

    private tlx() {
    }

    public final boolean a(tlv navigationInfo) {
        boolean m2371constructorimpl;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afa51e", new Object[]{this, navigationInfo})).booleanValue();
        }
        q.d(navigationInfo, "navigationInfo");
        long uptimeMillis = SystemClock.uptimeMillis();
        ArrayList<tlu> arrayList = f34203a;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                tlu tluVar = (tlu) it.next();
                try {
                    Result.a aVar = Result.Companion;
                    m2371constructorimpl = Result.m2371constructorimpl(Boolean.valueOf(tluVar.a(navigationInfo)));
                } catch (Throwable th) {
                    Result.a aVar2 = Result.Companion;
                    m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
                }
                if (Result.m2374exceptionOrNullimpl(m2371constructorimpl) != null) {
                    m2371constructorimpl = false;
                }
                if (((Boolean) m2371constructorimpl).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        TMSLogger.a("TMSSwitchChecker", "shouldSwitchToTMS cost " + (SystemClock.uptimeMillis() - uptimeMillis) + "ms");
        return z;
    }
}
