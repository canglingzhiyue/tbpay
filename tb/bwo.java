package tb;

import com.alibaba.ut.abtest.internal.util.b;
import com.alibaba.ut.abtest.internal.util.h;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.kml;

/* loaded from: classes2.dex */
public abstract class bwo implements kml {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f26144a;

    static {
        kge.a(1809465959);
        kge.a(1882102659);
    }

    public abstract String a();

    public abstract String b();

    @Override // tb.kml
    public void onDownloadProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
            return;
        }
        h.a("BaseDownloadListener", "onDownloadProgress, progress=" + i + ", " + this);
    }

    @Override // tb.kml
    public void onDownloadStateChange(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
            return;
        }
        h.a("BaseDownloadListener", "onDownloadStateChange, url=" + str + ", isDownloading=" + z + ", " + this);
        if (!z || this.f26144a != 0) {
            return;
        }
        this.f26144a = System.currentTimeMillis();
    }

    @Override // tb.kml
    public void onFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
            return;
        }
        h.a("BaseDownloadListener", "onFinish, allSuccess=" + z + ", " + this);
    }

    @Override // tb.kml
    public void onNetworkLimit(int i, kmq kmqVar, kml.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6919023a", new Object[]{this, new Integer(i), kmqVar, aVar});
            return;
        }
        h.a("BaseDownloadListener", "onNetworkLimit, netType=" + i + ", downloadParam=" + kmqVar + ", networkLimitCallback=" + aVar + ", " + this);
    }

    @Override // tb.kml
    public void onDownloadFinish(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
            return;
        }
        if (h.a()) {
            h.b("BaseDownloadListener", "【" + b() + "】数据文件下载成功，文件地址：" + str + "，文件大小：" + new File(str2).length());
        }
        try {
            b.a(a(), str, new File(str2).length(), System.currentTimeMillis() - this.f26144a, true);
        } catch (Throwable th) {
            h.c("BaseDownloadListener", th.getMessage(), th);
        }
        b.a(b.DOWNLOAD_ALARM, a());
    }

    @Override // tb.kml
    public void onDownloadError(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        if (h.a()) {
            h.d("BaseDownloadListener", "【" + b() + "】文件下载失败，文件地址：" + str + "，错误码：" + i + "，错误消息：" + str2);
        }
        try {
            b.a(a(), str, 0L, System.currentTimeMillis() - this.f26144a, false);
        } catch (Throwable th) {
            h.c("BaseDownloadListener", th.getMessage(), th);
        }
        b.a(b.DOWNLOAD_ALARM, a(), String.valueOf(i), str2, true);
    }
}
