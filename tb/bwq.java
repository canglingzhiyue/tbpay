package tb;

import android.text.TextUtils;
import com.alibaba.ut.abtest.internal.util.h;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.a;
import com.taobao.downloader.b;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class bwq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static bwq f26147a;
    private String b = File.separator + "UTABTest" + File.separator + "Experiment";

    static {
        kge.a(46513579);
    }

    private bwq() {
    }

    public static synchronized bwq a() {
        synchronized (bwq.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bwq) ipChange.ipc$dispatch("f02fde2", new Object[0]);
            }
            if (f26147a == null) {
                f26147a = new bwq();
                if (a.c == null) {
                    b.a(cex.a().c());
                }
                a.m = cex.a().d();
            }
            return f26147a;
        }
    }

    public int a(String str, String str2, String str3, String str4, kml kmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ebd3369", new Object[]{this, str, str2, str3, str4, kmlVar})).intValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            return b.a().a(a(str, str2, str3, str4), kmlVar);
        }
        return -1;
    }

    private kmm a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmm) ipChange.ipc$dispatch("249eaa0b", new Object[]{this, str, str2, str3, str4});
        }
        kmm kmmVar = new kmm();
        kmmVar.f30166a = new ArrayList();
        kmo kmoVar = new kmo();
        kmoVar.f30167a = str;
        kmoVar.c = str2;
        kmoVar.d = str4;
        kmmVar.f30166a.add(kmoVar);
        kmq kmqVar = new kmq();
        kmqVar.h = str3;
        kmqVar.i = 0;
        kmqVar.d = 7;
        kmqVar.f30169a = "UTABTest";
        kmmVar.b = kmqVar;
        kmmVar.b.m = false;
        return kmmVar;
    }

    public int a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4dba98bb", new Object[]{this, str, str2, new Long(j)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        h.f("DownloadManager", "【实验数据】数据文件开始下载，文件地址：" + str + "，文件MD5：" + str2);
        return a(str, str2, b().getAbsolutePath(), null, new bwr(j));
    }

    public int b(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("551fcdda", new Object[]{this, str, str2, new Long(j)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        h.f("DownloadManager", "【Beta实验数据】数据文件开始下载，文件地址：" + str + "，文件MD5：" + str2);
        return a(str, str2, b().getAbsolutePath(), null, new bwp(j, str2));
    }

    public File b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("64f2a3c4", new Object[]{this});
        }
        return new File(cex.a().c().getFilesDir() + this.b);
    }
}
