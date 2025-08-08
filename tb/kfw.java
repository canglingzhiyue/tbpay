package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.e;
import com.uploader.export.i;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes7.dex */
public class kfw implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f30044a;
    private final kfv b;

    public kfw(Context context, kfv kfvVar) {
        this.f30044a = new WeakReference<>(context);
        this.b = kfvVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            a();
        } catch (Throwable th) {
            Log.e("CodeTrack-DumpTask", "DumpCoverageFileTask error", th);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Log.e("CodeTrack-DumpTask", "DumpCoverageFileTask enter");
        final Context context = this.f30044a.get();
        if (context == null) {
            kft.a("CodeTrack-DumpTask", "context released ,  wtf  it is application context !!!");
            return;
        }
        String a2 = this.b.a();
        if (StringUtils.isEmpty(a2)) {
            kft.a("CodeTrack-DumpTask", "build UploadInfo failed, buildTaskId is empty");
        } else if (!kgb.b()) {
            kft.a("CodeTrack-DumpTask", "!isCoverageEnabled");
        } else if (kgb.a(context)) {
            kft.a("CodeTrack-DumpTask", "isTired");
        } else {
            String str = kgd.a(context) + File.separator + "coverage.cx";
            if (!a(str)) {
                kft.a("CodeTrack-DumpTask", "dumpSuccess == false, dump coverage data failed");
            } else if (!new File(str).exists()) {
                kft.a("CodeTrack-DumpTask", "!file.exists, dump coverage data failed");
            } else {
                kge.c();
                kfy b = b(a2);
                b.b(str);
                kfz.a(b, new kfx() { // from class: tb.kfw.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str2, Object... objArr) {
                        if (str2.hashCode() == -521516305) {
                            super.onSuccess((i) objArr[0], (e) objArr[1]);
                            return null;
                        }
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
                    }

                    @Override // tb.kfx, com.uploader.export.d
                    public void onSuccess(i iVar, e eVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e0ea4aef", new Object[]{this, iVar, eVar});
                            return;
                        }
                        super.onSuccess(iVar, eVar);
                        kgb.b(context);
                        AppMonitor.Counter.commit(kga.MODULE_NAME, kga.MODULE_POINT_DEXCOCO, kga.DUMP_SUCCESS, 1.0d);
                    }
                });
            }
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : kgd.a(kge.a(), str);
    }

    private static kfy b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kfy) ipChange.ipc$dispatch("7d1e2af5", new Object[]{str});
        }
        kfy kfyVar = new kfy();
        kfyVar.a("codetrack-ios-new");
        kfyVar.c("android_class_unzip");
        long currentTimeMillis = System.currentTimeMillis();
        String format = new SimpleDateFormat("yyyyMMddHHmmss", Locale.ENGLISH).format(new Date(currentTimeMillis));
        int nextInt = new Random().nextInt(100000);
        kfyVar.d(str + "_" + format + "_" + currentTimeMillis + "_" + nextInt + ".cx");
        return kfyVar;
    }
}
