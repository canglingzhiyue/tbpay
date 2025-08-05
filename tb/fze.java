package tb;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fyo;
import tb.fzd;

/* loaded from: classes5.dex */
public class fze<ExposeKey, ExposeData> implements fys<ExposeKey, ExposeData, fyo.a<ExposeData>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f28226a;
    private final LruCache<ExposeKey, fyo.a<ExposeData>> b;

    static {
        kge.a(-491015419);
        kge.a(1457398956);
    }

    public fze() {
        this(new Handler(Looper.getMainLooper()), new LruCache(8));
    }

    public fze(Handler handler, LruCache<ExposeKey, fyo.a<ExposeData>> lruCache) {
        this.f28226a = handler;
        this.b = lruCache;
    }

    @Override // tb.fys
    public fyr<ExposeKey, ExposeData> a(fyy<ExposeKey, ExposeData> fyyVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fyr) ipChange.ipc$dispatch("cc66d635", new Object[]{this, fyyVar, new Long(j)});
        }
        fzd.a aVar = new fzd.a();
        if (j > 0) {
            aVar.a(j);
        }
        aVar.a((fza) fyyVar).a((fzc) fyyVar).a(this.f28226a).a(this.b).a((fzb) fyyVar).a((fyz) fyyVar);
        return aVar.a();
    }
}
