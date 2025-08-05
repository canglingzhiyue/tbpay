package tb;

import android.app.Application;
import com.alibaba.motu.tbrest.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.a;
import com.taobao.metrickit.utils.c;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.util.Map;
import org.json.JSONObject;
import tb.mmq;

/* loaded from: classes7.dex */
public class mmr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static final Object f31117a = new Object();
    private static Boolean b = null;

    public static /* synthetic */ void lambda$gnAmzftXDqyHBcSL2qcJeu5fZAs(Application application) {
        b(application);
    }

    public static void a(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
        } else {
            a.a().d().execute(new Runnable() { // from class: tb.-$$Lambda$mmr$gnAmzftXDqyHBcSL2qcJeu5fZAs
                @Override // java.lang.Runnable
                public final void run() {
                    mmr.lambda$gnAmzftXDqyHBcSL2qcJeu5fZAs(application);
                }
            });
        }
    }

    public static /* synthetic */ void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{application});
            return;
        }
        try {
            synchronized (f31117a) {
                File file = new File(application.getCacheDir().getPath() + File.separator + mlw.SLICE_DATA_DIR);
                if (file.exists() && file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null && listFiles.length != 0) {
                        for (File file2 : listFiles) {
                            a(application, file2);
                        }
                    }
                }
            }
        } catch (Exception e) {
            TLog.loge("MetricKit.ReportUploader", "Upload Fail File Error.", e);
        }
    }

    private static void a(Application application, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c14a9cae", new Object[]{application, file});
            return;
        }
        String name = file.getName();
        if (name.startsWith("metrickit_") && name.endsWith(".json") && a(new mmq.a().a(file.getName().replace("metrickit_", "").replace(".json", "")).c(c.a(file)).a())) {
            file.delete();
        } else if (!name.startsWith("metrickit_V1_") || !name.endsWith(".txt")) {
        } else {
            String[] split = name.replace(".txt", "").split("_");
            if (split.length != 4 || Long.toString(mly.LAUNCH_SESSION).equals(split[2]) || !a(new mmq.a().a(split[3]).a(new mlw(application, "", file).b()).b(mly.UNESCAPED_SEPARATOR).a())) {
                return;
            }
            file.delete();
        }
    }

    private static boolean a(mmq mmqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4c98a6b", new Object[]{mmqVar})).booleanValue();
        }
        if (!mmqVar.c()) {
            return false;
        }
        int i = 0;
        boolean z = false;
        while (true) {
            int i2 = i + 1;
            if (i >= 2) {
                break;
            }
            z = d.a().a(null, System.currentTimeMillis(), null, 61003, "AliHAMetrics", mmqVar.b(), null, mmqVar.a()).booleanValue();
            if (z) {
                TLog.loge("MetricKit.ReportUploader", "send success ", a(mmqVar.a()), mmqVar.b());
                break;
            }
            TLog.loge("MetricKit.ReportUploader", "send fail ", String.valueOf(i2), a(mmqVar.a()), mmqVar.b());
            i = i2;
        }
        a(mmqVar.a(), mmqVar.b());
        return z;
    }

    private static void a(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3cea7", new Object[]{map, str});
            return;
        }
        Boolean bool = b;
        if (bool != null && !bool.booleanValue()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Header", new JSONObject(map));
            jSONObject.put("Content", new JSONObject(str));
            mmw mmwVar = new mmw();
            mmwVar.a("ALI_APM/" + mlx.m + "/monitor/metrickit", jSONObject.toString(), false);
        } catch (Throwable unused) {
            b = false;
        }
    }

    private static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map}) : new JSONObject(map).toString();
    }
}
