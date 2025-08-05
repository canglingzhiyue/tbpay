package tb;

import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.AppMonitorStatTable;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfsadapter.f;
import com.taobao.alivfsadapter.g;
import com.taobao.android.weex_framework.util.a;

/* loaded from: classes.dex */
public class die implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AppMonitorStatTable f26782a = new AppMonitorStatTable("AliVfsSDK", "Cache");

    public die() {
        MeasureSet create = MeasureSet.create();
        create.addMeasure("DiskCost");
        DimensionSet create2 = DimensionSet.create();
        create2.addDimension("Cache");
        create2.addDimension(a.ATOM_Module);
        create2.addDimension("Operation");
        create2.addDimension("HitMemory");
        create2.addDimension("MemoryCache");
        this.f26782a.registerRowAndColumn(create2, create, false);
    }

    @Override // com.taobao.alivfsadapter.f
    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else if (z) {
            AppMonitor.Alarm.commitSuccess("AliVfsSDK", "MemoryCacheHitRate", str);
        } else {
            AppMonitor.Alarm.commitFail("AliVfsSDK", "MemoryCacheHitRate", str, null, null);
        }
    }

    @Override // com.taobao.alivfsadapter.f
    public void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("944b6ce8", new Object[]{this, gVar});
            return;
        }
        try {
            String a2 = a(gVar.b, gVar.f);
            if (gVar.e == 0) {
                AppMonitor.Alarm.commitSuccess("AliVfsSDK", a2, gVar.f8472a);
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("Cache", gVar.b);
                create.setValue(a.ATOM_Module, gVar.f8472a);
                create.setValue("Operation", gVar.f);
                create.setValue("HitMemory", String.valueOf(gVar.h));
                create.setValue("MemoryCache", String.valueOf(gVar.g));
                MeasureValueSet create2 = MeasureValueSet.create();
                create2.setValue("DiskCost", gVar.i);
                this.f26782a.update(create, create2);
                AppMonitor.Stat.commit("AliVfsSDK", "Cache", create, create2);
                return;
            }
            AppMonitor.Alarm.commitFail("AliVfsSDK", a2, gVar.f8472a, String.valueOf(gVar.e), gVar.d);
        } catch (Exception e) {
            Log.e("AVFSSDKAppMonitorImpl", e.getMessage(), e);
        }
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        return a(str) + b(str2);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 114126) {
            if (hashCode != 3143036) {
                if (hashCode == 3355087 && str.equals(g.CACHE_MMAP)) {
                    c = 2;
                }
            } else if (str.equals("file")) {
                c = 0;
            }
        } else if (str.equals(g.CACHE_SQL)) {
            c = 1;
        }
        if (c == 0) {
            return "FileCache";
        }
        if (c == 1) {
            return "SQLiteCache";
        }
        if (c == 2) {
            return "MmapCache";
        }
        throw new IllegalArgumentException("Unknown URL: " + str);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 3496342) {
            if (hashCode == 113399775 && str.equals("write")) {
                c = 1;
            }
        } else if (str.equals("read")) {
            c = 0;
        }
        if (c == 0) {
            return "Read";
        }
        if (c == 1) {
            return "Write";
        }
        throw new IllegalArgumentException("Unknown URL: " + str);
    }
}
