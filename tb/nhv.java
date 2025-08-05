package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.api.assets.CheckAssetsResult;
import com.taobao.android.remoteso.api.assets.a;
import com.taobao.android.remoteso.api.assets.b;
import com.taobao.android.remoteso.index.c;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.k;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

/* loaded from: classes6.dex */
public class nhv implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final RSoLog.a f31472a = RSoLog.e("remo-assets");
    private final c b;
    private final ijk c;

    public nhv(c cVar, ijk ijkVar) {
        this.b = cVar;
        this.c = ijkVar;
    }

    @Override // com.taobao.android.remoteso.api.assets.a
    public CheckAssetsResult a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CheckAssetsResult) ipChange.ipc$dispatch("c33ab648", new Object[]{this, str}) : new CheckAssetsResult(str, !this.b.e(str));
    }

    @Override // com.taobao.android.remoteso.api.assets.a
    public b b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("aaa8258d", new Object[]{this, str});
        }
        try {
            k c = this.c.b(str).c();
            if (c.i()) {
                return new b(str, new BufferedInputStream(new FileInputStream(c.h())), null);
            }
            RSoException e = c.e();
            if (e != null) {
                return new b(str, null, e);
            }
            return new b(str, null, RSoException.error(8001));
        } catch (Throwable th) {
            throw new RuntimeException("error in RemoAssetsImpl", th);
        }
    }
}
