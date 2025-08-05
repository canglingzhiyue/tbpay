package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.status.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class iio {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final iik f29053a;
    private final a b;
    private final Map<String, iin> d = new ConcurrentHashMap();

    public static /* synthetic */ a a(iio iioVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("14332cde", new Object[]{iioVar}) : iioVar.b;
    }

    public static /* synthetic */ Map b(iio iioVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2046485f", new Object[]{iioVar}) : iioVar.d;
    }

    public iio(iik iikVar, a aVar) {
        this.f29053a = iikVar;
        this.b = aVar;
    }

    public void a(iim iimVar, iij iijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("408b7451", new Object[]{this, iimVar, iijVar});
            return;
        }
        iin iinVar = this.d.get(iimVar.j());
        if (iinVar != null) {
            iinVar.a().a(iijVar);
            this.f29053a.a(iinVar);
            RSoLog.c("downloader -> task resumed : " + iimVar.a());
            ikq.a("downloader,taskResumed", "resume lib " + iimVar);
            return;
        }
        iimVar.a(new iih());
        iimVar.a(new iii() { // from class: tb.iio.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1145182134) {
                    super.a((iim) objArr[0], (RSoException) objArr[1]);
                    return null;
                } else if (hashCode != -909932552) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.a((iim) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
            }

            @Override // tb.iii, tb.iij
            public void a(iim iimVar2, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c9c387f8", new Object[]{this, iimVar2, new Integer(i)});
                    return;
                }
                super.a(iimVar2, i);
                iio.a(iio.this).a(iimVar2.a(), i);
            }

            @Override // tb.iii, tb.iij
            public void a(iim iimVar2, RSoException rSoException) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bbbde84a", new Object[]{this, iimVar2, rSoException});
                    return;
                }
                super.a(iimVar2, rSoException);
                iio.b(iio.this).remove(iimVar2.j());
                RSoLog.c("downloader -> task finish, removed : " + iimVar2);
            }
        });
        iimVar.a(iijVar);
        this.d.put(iimVar.j(), this.f29053a.a(iimVar));
        RSoLog.c("downloader ->  task    started:  " + iimVar.a());
    }
}
