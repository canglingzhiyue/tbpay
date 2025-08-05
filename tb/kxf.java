package tb;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.d;
import com.taobao.android.trade.event.e;
import com.taobao.android.trade.event.f;
import java.util.concurrent.ExecutorService;

/* loaded from: classes7.dex */
public class kxf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final e f30373a;

    static {
        kge.a(-1787564514);
        f30373a = d.b().a((ExecutorService) AsyncTask.THREAD_POOL_EXECUTOR);
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("1cc17d2c", new Object[0]) : f.a("HomePageEventCenter", f30373a);
    }
}
