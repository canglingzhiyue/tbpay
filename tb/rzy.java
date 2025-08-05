package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.ssrcore.b;
import tb.mtk;

/* loaded from: classes9.dex */
public class rzy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, List<b>> f33446a = new HashMap();
    private Lock b = new ReentrantLock();

    public rzy() {
        c.a(new rzz());
    }

    public void a(Mtop mtop, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca448159", new Object[]{this, mtop, bVar});
            return;
        }
        this.b.lock();
        try {
            String b = b(mtop);
            List<b> list = this.f33446a.get(b);
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(bVar);
            this.f33446a.put(b, list);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(b);
                sb.append(" [addToRequestPool] add ssrBusiness to RequestPool.");
                TBSdkLog.e("ssr.SsrRequestPool", bVar.a(), sb.toString());
            }
        } finally {
            this.b.unlock();
        }
    }

    public void a(Mtop mtop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec661501", new Object[]{this, mtop});
            return;
        }
        this.b.lock();
        try {
            String b = b(mtop);
            List<b> remove = this.f33446a.remove(b);
            if (remove != null && !remove.isEmpty()) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    StringBuilder sb = new StringBuilder(64);
                    sb.append(b);
                    sb.append(" [retryAllRequest] retry all request,current size=");
                    sb.append(remove.size());
                    TBSdkLog.e("ssr.SsrRequestPool", sb.toString());
                }
                for (b bVar : remove) {
                    if (!bVar.e()) {
                        bVar.f();
                    }
                }
            }
        } finally {
            this.b.unlock();
        }
    }

    public void a(Mtop mtop, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59ca9d95", new Object[]{this, mtop, str, str2});
            return;
        }
        this.b.lock();
        try {
            String b = b(mtop);
            List<b> remove = this.f33446a.remove(b);
            if (remove != null && !remove.isEmpty()) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    StringBuilder sb = new StringBuilder(64);
                    sb.append(b);
                    sb.append(" [failAllRequest]fail all request,current size=");
                    sb.append(remove.size());
                    TBSdkLog.e("ssr.SsrRequestPool", sb.toString());
                }
                for (b bVar : remove) {
                    mtk a2 = new mtk.a().a(200).a(str).b(str2).a();
                    rzo a3 = rzn.a(null, bVar);
                    a3.c = a2;
                    rzn.a().obtainMessage(2, a3).sendToTarget();
                }
            }
        } finally {
            this.b.unlock();
        }
    }

    private String b(Mtop mtop) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b29ef5e", new Object[]{this, mtop}) : StringUtils.concatStr(mtop.getInstanceId(), "DEFAULT");
    }
}
