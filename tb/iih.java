package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class iih implements iij {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final long c = iky.a();
    private long d = 0;

    @Override // tb.iij
    public void a(iim iimVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9c387f8", new Object[]{this, iimVar, new Integer(i)});
        }
    }

    public static /* synthetic */ long a(iih iihVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("edb9b284", new Object[]{iihVar})).longValue() : iihVar.c;
    }

    public static /* synthetic */ long b(iih iihVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dc3cb905", new Object[]{iihVar})).longValue() : iihVar.d;
    }

    @Override // tb.iij
    public void a(iim iimVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edbbf86b", new Object[]{this, iimVar});
        } else {
            this.d = iky.a();
        }
    }

    @Override // tb.iij
    public void a(final iim iimVar, final RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbbde84a", new Object[]{this, iimVar, rSoException});
        } else {
            ikq.a("download-tracker", new Runnable() { // from class: tb.iih.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String d = iimVar.d();
                    HashMap hashMap = new HashMap();
                    hashMap.put(ikn.ARGS_LIB_NAME, d);
                    hashMap.put(ikn.ARGS_DOWNLOAD_DURATION, Long.valueOf(iky.a() - iih.a(iih.this)));
                    hashMap.put("args_real_download_duration", Long.valueOf(iky.a() - iih.b(iih.this)));
                    RSoException rSoException2 = rSoException;
                    if (rSoException2 != null) {
                        RSoLog.b("download -> error", rSoException2);
                        ikq.a(ikn.POINT_DOWNLOAD, hashMap, rSoException);
                        return;
                    }
                    RSoLog.c("download -> finished, libName=" + iimVar.a());
                    ikq.b(ikn.POINT_DOWNLOAD, hashMap);
                }
            });
        }
    }
}
