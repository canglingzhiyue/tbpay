package tb;

import com.alibaba.evo.internal.bucketing.model.a;
import com.alibaba.ut.abtest.internal.util.b;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.p;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bwr extends bwo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RELEASE_FILE = "release";

    /* renamed from: a  reason: collision with root package name */
    private long f26148a;

    static {
        kge.a(60972558);
    }

    public static /* synthetic */ Object ipc$super(bwr bwrVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -864932293) {
            super.onDownloadError((String) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2]);
            return null;
        } else if (hashCode != 1138205461) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDownloadFinish((String) objArr[0], (String) objArr[1]);
            return null;
        }
    }

    @Override // tb.bwo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "ExperimentV5";
    }

    @Override // tb.bwo
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "实验数据";
    }

    public static /* synthetic */ long a(bwr bwrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e2919aef", new Object[]{bwrVar})).longValue() : bwrVar.f26148a;
    }

    public bwr(long j) {
        this.f26148a = j;
    }

    @Override // tb.bwo, tb.kml
    public void onDownloadFinish(String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
            return;
        }
        super.onDownloadFinish(str, str2);
        p.a(new Runnable() { // from class: tb.bwr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    a a2 = com.alibaba.ut.abtest.internal.bucketing.a.a(str2, "release");
                    if (a2 == null) {
                        h.f("ExperimentFileV5DownloadListener", "【实验数据V5】数据解析错误，文件地址：" + str2);
                    } else if (bwr.a(bwr.this) != cex.a().i().c()) {
                        cex.a().i().a(a2.c, a2.d, a2.b, a2.f2926a);
                    } else {
                        h.f("ExperimentFileV5DownloadListener", "【实验数据V5】数据未发现变化，本地版本：" + a2.b);
                    }
                } catch (Throwable th) {
                    b.a("ExperimentFileV5DownloadListener.onDownloadFinish", th);
                    h.d("ExperimentFileV5DownloadListener", "解析实验文件过程中出现错误，" + th.getMessage(), th);
                    cex.a().i().d(null);
                }
            }
        });
    }

    @Override // tb.bwo, tb.kml
    public void onDownloadError(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        super.onDownloadError(str, i, str2);
        cex.a().i().d(null);
    }
}
