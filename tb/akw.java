package tb;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import com.ali.alihadeviceevaluator.model.ReportRule;
import com.ali.alihadeviceevaluator.old.HardWareInfo;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.tbdeviceevaluator.c;
import java.io.File;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class akw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_REPORT_LAST_TIMESTAMP = "report_lasttimestamp";
    public static final String K_REPORT_RULE = "report_rule";
    public static final String K_REPORT_VALID_PERIOD = "report_validperiod";

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f25412a = true;
    private static akr b;

    public static void a(HardWareInfo hardWareInfo) {
        StatFs statFs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aea342d", new Object[]{hardWareInfo});
        } else if (alh.a() && c()) {
            b();
            try {
                DimensionValueSet create = DimensionValueSet.create();
                MeasureValueSet create2 = MeasureValueSet.create();
                a(create, ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL);
                a(create, c.KEY_CPU_BRAND, hardWareInfo.f1802a);
                a(create, "cpuName", hardWareInfo.b);
                a(create, c.KEY_CPU_COUNT, hardWareInfo.c);
                a(create, c.KEY_CPU_MAX_FREQ, hardWareInfo.d);
                a(create, c.KEY_CPU_MIN_FREQ, hardWareInfo.e);
                float[] fArr = hardWareInfo.f;
                StringBuilder sb = new StringBuilder();
                if (fArr != null) {
                    sb.append(fArr[0]);
                    for (int i = 1; i < fArr.length; i++) {
                        sb.append(",");
                        sb.append(fArr[i]);
                    }
                }
                a(create, "cpuFreqArray", sb.toString());
                a(create, c.KEY_GPU_NAME, hardWareInfo.g);
                a(create, c.KEY_GPU_BRAND, hardWareInfo.h);
                a(create, c.KEY_GPU_FREQ, (float) hardWareInfo.i);
                a(create, "cpuArch", hardWareInfo.b());
                a(create, c.KEY_DISPLAY_WIDTH, hardWareInfo.k);
                a(create, c.KEY_DISPLAY_HEIGHT, hardWareInfo.l);
                a(create, c.KEY_DISPLAY_DENSITY, hardWareInfo.m);
                a(create, "openGLVersion", aks.a().d().d);
                a(create, "memTotal", (float) aks.a().f().f25406a);
                a(create, "memJava", (float) aks.a().f().c);
                a(create, "memNative", (float) aks.a().f().e);
                int[] a2 = new alb().a(alf.f25418a);
                a(create, c.KEY_MEM_LIMITED_HEAP, a2[0]);
                a(create, c.KEY_MEM_LIMITED_LARGE_HEAP, a2[1]);
                a(create, "osVersion", Build.VERSION.SDK_INT);
                try {
                    long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
                    a(create, "storeTotal", (float) ((((statFs.getBlockCount() * blockSize) / 1024) / 1024) / 1024));
                    a(create, "storeFree", (float) ((((blockSize * statFs.getAvailableBlocks()) / 1024) / 1024) / 1024));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                File file = new File("/sdcard/Android/");
                if (file.exists()) {
                    a(create, "deviceUsedTime", (float) (Math.abs(System.currentTimeMillis() - file.lastModified()) / 86400000));
                }
                a(create, "deviceIsRoot", a() + "");
                a(create, "memTotalUsed", (float) aks.a().f().b);
                a(create, "memJavaUsed", (float) aks.a().f().d);
                a(create, "memNativeUsed", (float) aks.a().f().f);
                a(create, "pssTotal", (float) aks.a().f().i);
                a(create, "pssJava", (float) aks.a().f().g);
                a(create, "pssNative", (float) aks.a().f().h);
                a(create);
                create2.setValue(c.KEY_OLD_SCORE, hardWareInfo.h());
                if (b != null) {
                    create2.setValue("deviceScore", b.b());
                }
                create2.setValue(c.KEY_CPU_SCORE, hardWareInfo.k());
                create2.setValue(c.KEY_GPU_SCORE, hardWareInfo.l());
                create2.setValue(c.KEY_MEM_SCORE, hardWareInfo.i());
                String str = "report info measureValueSet = " + JSONObject.toJSONString(create2);
                String str2 = "report info dimensionValueSet = " + JSONObject.toJSONString(create);
                AppMonitor.Stat.commit(alf.TAG, "DeviceInfo", create, create2);
                alg.a().edit().putLong(K_REPORT_LAST_TIMESTAMP, System.currentTimeMillis());
                alg.a().edit().commit();
            } catch (Throwable th) {
                th.printStackTrace();
                Log.e(alf.TAG, "report info failed!!");
            }
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        for (String str : new String[]{"/system/bin/su", "/system/xbin/su", "/system/sbin/su", "/sbin/su", "/vendor/bin/su"}) {
            try {
                if (new File(str).exists()) {
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    private static void a(DimensionValueSet dimensionValueSet, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3afee25", new Object[]{dimensionValueSet, str, str2});
        } else if (TextUtils.isEmpty(str2) || dimensionValueSet == null) {
        } else {
            dimensionValueSet.setValue(str, str2);
        }
    }

    private static void a(DimensionValueSet dimensionValueSet, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea16148", new Object[]{dimensionValueSet, str, new Integer(i)});
        } else if (i <= 0 || dimensionValueSet == null) {
        } else {
            dimensionValueSet.setValue(str, i + "");
        }
    }

    private static void a(DimensionValueSet dimensionValueSet, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea15605", new Object[]{dimensionValueSet, str, new Float(f)});
        } else if (f <= 0.0f || dimensionValueSet == null) {
        } else {
            dimensionValueSet.setValue(str, f + "");
        }
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (!f25412a) {
        } else {
            f25412a = false;
            AppMonitor.register(alf.TAG, "DeviceInfo", MeasureSet.create().addMeasure(c.KEY_OLD_SCORE).addMeasure("deviceScore").addMeasure(c.KEY_CPU_SCORE).addMeasure(c.KEY_GPU_SCORE).addMeasure(c.KEY_MEM_SCORE), DimensionSet.create().addDimension(ChangeAppIconBridge.KEY_DEVICEMODEL, "ALI_DEFAULT").addDimension(c.KEY_CPU_BRAND, "ALI_DEFAULT").addDimension("cpuName", "ALI_DEFAULT").addDimension(c.KEY_CPU_COUNT, "ALI_DEFAULT").addDimension(c.KEY_CPU_MAX_FREQ, "ALI_DEFAULT").addDimension(c.KEY_CPU_MIN_FREQ, "ALI_DEFAULT").addDimension("cpuFreqArray", "ALI_DEFAULT").addDimension(c.KEY_GPU_NAME, "ALI_DEFAULT").addDimension(c.KEY_GPU_BRAND, "ALI_DEFAULT").addDimension(c.KEY_GPU_FREQ, "ALI_DEFAULT").addDimension("cpuArch", "ALI_DEFAULT").addDimension(c.KEY_DISPLAY_WIDTH, "ALI_DEFAULT").addDimension(c.KEY_DISPLAY_HEIGHT, "ALI_DEFAULT").addDimension(c.KEY_DISPLAY_DENSITY, "ALI_DEFAULT").addDimension("openGLVersion", "ALI_DEFAULT").addDimension("memTotal", "ALI_DEFAULT").addDimension("memJava", "ALI_DEFAULT").addDimension("memNative", "ALI_DEFAULT").addDimension(c.KEY_MEM_LIMITED_HEAP, "ALI_DEFAULT").addDimension(c.KEY_MEM_LIMITED_LARGE_HEAP, "ALI_DEFAULT").addDimension("osVersion", "ALI_DEFAULT").addDimension("storeTotal", "ALI_DEFAULT").addDimension("storeFree", "ALI_DEFAULT").addDimension("deviceUsedTime", "ALI_DEFAULT").addDimension("deviceIsRoot", "ALI_DEFAULT").addDimension("memTotalUsed", "ALI_DEFAULT").addDimension("memJavaUsed", "ALI_DEFAULT").addDimension("memNativeUsed", "ALI_DEFAULT").addDimension("pssTotal", "ALI_DEFAULT").addDimension("pssJava", "ALI_DEFAULT").addDimension("pssNative", "ALI_DEFAULT").addDimension("ext", "{}"));
        }
    }

    private static void a(DimensionValueSet dimensionValueSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14306d91", new Object[]{dimensionValueSet});
            return;
        }
        try {
            String string = alg.a().getString(K_REPORT_RULE, null);
            ReportRule reportRule = string == null ? null : (ReportRule) JSONObject.parseObject(string, ReportRule.class);
            if (reportRule != null && reportRule.propMapping != null) {
                Map<String, List<String>> map = reportRule.propMapping;
                JSONObject jSONObject = new JSONObject(reportRule.propMapping.size());
                fhy fhyVar = new fhy();
                for (String str : map.keySet()) {
                    List<String> list = reportRule.propMapping.get(str);
                    if (list != null) {
                        String str2 = null;
                        for (String str3 : list) {
                            str2 = fhyVar.a(str3);
                            if (!TextUtils.isEmpty(str2)) {
                                break;
                            }
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            if (dimensionValueSet.containValue(str)) {
                                dimensionValueSet.setValue(str, str2);
                            } else {
                                jSONObject.put(str, (Object) str2);
                            }
                        }
                    }
                }
                if (jSONObject.isEmpty()) {
                    return;
                }
                dimensionValueSet.setValue("ext", jSONObject.toJSONString());
            }
        } catch (Throwable th) {
            th.printStackTrace();
            Log.e(alf.TAG, "mappingProps failed!!");
        }
    }

    public static void a(akr akrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e033a850", new Object[]{akrVar});
        } else {
            b = akrVar;
        }
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (!alg.a().contains(K_REPORT_LAST_TIMESTAMP)) {
            return true;
        }
        return System.currentTimeMillis() >= alg.a().getLong(K_REPORT_LAST_TIMESTAMP, 0L) + alf.a(!alg.a().contains(K_REPORT_VALID_PERIOD) ? 24L : alg.a().getLong(K_REPORT_VALID_PERIOD, 0L));
    }
}
