package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class qgn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f32915a;

    static {
        kge.a(-964954726);
        f32915a = new AtomicBoolean(false);
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44664ae3", new Object[]{aVar});
        } else if (aVar != null) {
            try {
                TLog.loge("WindVane", "Initializer", TBPlayerConst.TBPlayerMethodSetup);
            } catch (Exception unused) {
            }
            if (!f32915a.compareAndSet(false, true)) {
                return;
            }
            for (Pair pair : a.a(aVar)) {
                qgm.a().a((Class) pair.first, pair.second);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final List<Pair<Class<?>, Object>> f32916a = new ArrayList();

        static {
            kge.a(-573123015);
        }

        public static /* synthetic */ List a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("11da0504", new Object[]{aVar}) : aVar.f32916a;
        }
    }

    /* loaded from: classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public a f32917a = new a();

        static {
            kge.a(-754192606);
        }

        public b a(Class<?> cls, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d4e0395f", new Object[]{this, cls, obj});
            }
            if (cls == null || obj == null || !cls.isInstance(obj)) {
                return this;
            }
            a.a(this.f32917a).add(new Pair(cls, obj));
            return this;
        }

        public a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("72f09f29", new Object[]{this}) : this.f32917a;
        }
    }
}
