package tb;

import android.text.TextUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.evo.internal.bucketing.model.a;
import com.alibaba.ut.abtest.internal.bucketing.c;
import com.alibaba.ut.abtest.internal.util.b;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.n;
import com.alibaba.ut.abtest.internal.util.p;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class bwp extends bwo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BETA_FILE = "beta";

    /* renamed from: a  reason: collision with root package name */
    private long f26145a;
    private String b;

    static {
        kge.a(427727646);
    }

    public static /* synthetic */ Object ipc$super(bwp bwpVar, String str, Object... objArr) {
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "BetaExperimentV5";
    }

    @Override // tb.bwo
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "Beta实验数据";
    }

    public bwp(long j, String str) {
        this.f26145a = j;
        this.b = str;
    }

    @Override // tb.bwo, tb.kml
    public void onDownloadFinish(String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
            return;
        }
        super.onDownloadFinish(str, str2);
        p.a(new Runnable() { // from class: tb.bwp.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    a a2 = com.alibaba.ut.abtest.internal.bucketing.a.a(str2, "beta");
                    if (a2 == null) {
                        h.f("BetaExperimentFileV5DownloadListener", "【Beta实验数据V5】数据解析错误，文件地址：" + str2);
                        return;
                    }
                    String str3 = n.a(cex.a().r()) + a2.f2926a;
                    if (TextUtils.equals(str3, cex.a().i().f())) {
                        h.f("BetaExperimentFileV5DownloadListener", "【Beta实验数据V5】数据未发现变化，本地版本：" + a2.b + "，本地签名：" + str3);
                        return;
                    }
                    if (a2.c == null) {
                        a2.c = new ArrayList();
                    }
                    ArrayList arrayList = new ArrayList();
                    for (ExperimentV5 experimentV5 : a2.c) {
                        if (experimentV5.getExpPublishType() == 6) {
                            arrayList.add(experimentV5);
                        }
                    }
                    if (c.a().a(arrayList, 6)) {
                        return;
                    }
                    cex.a().i().b(null);
                    cex.a().i().d(null);
                } catch (Throwable th) {
                    b.a("BetaExperimentFileV5DownloadListener.onDownloadFinish", th);
                    cex.a().i().b(null);
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
        cex.a().i().b(null);
        cex.a().i().d(null);
    }
}
