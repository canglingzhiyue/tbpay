package tb;

import android.content.Context;
import android.os.Build;
import anet.channel.request.ByteArrayEntry;
import anetwork.channel.Request;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.launcher.common.h;
import com.taobao.android.statistics.model.FileInfoRecord;
import com.taobao.android.statistics.model.SoLibInfo;
import com.taobao.application.common.c;
import com.taobao.application.common.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.mto;

/* loaded from: classes5.dex */
public class gvg extends gvf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Object> f28509a = new HashMap(16);
    private static final List<Map<String, Object>> b = new ArrayList(16);
    private static final List<Map<String, Object>> c = new ArrayList(16);

    public static /* synthetic */ Object ipc$super(gvg gvgVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        HashMap hashMap = new HashMap(20);
        hashMap.put("device_brand", Build.BRAND);
        hashMap.put("device_core_size", Integer.valueOf(gsm.a(mto.a.GEO_NOT_SUPPORT)));
        hashMap.put("device_manufacturer", Build.MANUFACTURER);
        hashMap.put("device_model", Build.MODEL);
        hashMap.put("os", "android");
        hashMap.put("os_version", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("package_debug", Boolean.valueOf(LauncherRuntime.l));
        hashMap.put("package_tag", LauncherRuntime.f);
        hashMap.put("packageName", LauncherRuntime.b);
        hashMap.put("app_version", LauncherRuntime.e);
        d a2 = c.a();
        hashMap.put(ios.K_DEVICE_SCORE, Integer.valueOf(a2.a(com.taobao.tbdeviceevaluator.c.KEY_OLD_SCORE, 60)));
        hashMap.put("app_status_is_full_new_install", Boolean.valueOf(a2.a("isFullNewInstall", false)));
        hashMap.put("app_status_is_first_launch", Boolean.valueOf(a2.a("isFirstLaunch", false)));
        hashMap.put("start_time", Long.valueOf(LauncherRuntime.f13108a));
        f28509a.putAll(hashMap);
    }

    @Override // tb.gvf
    public void a(String str, com.taobao.android.job.core.task.d dVar, Map<String, com.taobao.android.job.core.task.d> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6b92809", new Object[]{this, str, dVar, map});
            return;
        }
        HashMap hashMap = new HashMap(8);
        if ("m-b-f".equals(str)) {
            f28509a.put("startup_duration", Long.valueOf(dVar.f13005a - LauncherRuntime.f13108a));
        }
        hashMap.put("stage_name", str);
        hashMap.put("stage_execution_start", Long.valueOf(dVar.f13005a));
        hashMap.put("stage_execution_end", Long.valueOf(dVar.b));
        hashMap.put("stage_execution_duration", Long.valueOf(dVar.b - dVar.f13005a));
        hashMap.put("stage_execution_node_count_total", Integer.valueOf(dVar.c));
        hashMap.put("stage_execution_node_count_executed", Integer.valueOf(dVar.d));
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, com.taobao.android.job.core.task.d> entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap(5);
            hashMap2.put("name", entry.getKey());
            com.taobao.android.job.core.task.d value = entry.getValue();
            hashMap2.put("start_time", Long.valueOf(value.f13005a));
            hashMap2.put(ExperimentDO.COLUMN_END_TIME, Long.valueOf(value.b));
            hashMap2.put("duration", Long.valueOf(value.b - value.f13005a));
            hashMap2.put("is_main_thread", Boolean.valueOf(value.e));
            arrayList.add(hashMap2);
        }
        hashMap.put("launchers", arrayList);
        b.add(hashMap);
    }

    @Override // tb.gvf
    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        gsl.b(gvh.TAG, "[Startup][commit] start", new Object[0]);
        c();
        j();
        d(context);
    }

    @Override // tb.gvf
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        f28509a.clear();
        b.clear();
        c.clear();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        Set<String> solibs = SoLibInfo.getSolibs();
        ArrayList arrayList = new ArrayList(solibs.size());
        for (String str : solibs) {
            HashMap hashMap = new HashMap(4);
            hashMap.put("name", str);
            arrayList.add(hashMap);
        }
        f28509a.put("solib", arrayList);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        List<FileInfoRecord> openedFilesFromUIThread = FileInfoRecord.getOpenedFilesFromUIThread();
        ArrayList arrayList = new ArrayList(openedFilesFromUIThread.size());
        for (FileInfoRecord fileInfoRecord : openedFilesFromUIThread) {
            HashMap hashMap = new HashMap(3);
            hashMap.put("biz", fileInfoRecord.fileInfo.path);
            hashMap.put("time", Long.valueOf(fileInfoRecord.timestamp));
            hashMap.put("method_trace", fileInfoRecord.fileInfo.threadInfo.getStackTraces());
            arrayList.add(hashMap);
        }
        f28509a.put(ErrorType.IO, arrayList);
    }

    @Override // tb.gvf
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        try {
            e();
            f();
        } catch (Throwable th) {
            gsl.b(gvh.TAG, "dump error:", th);
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        f28509a.put("jank", c);
        f28509a.put("stage", b);
        f28509a.put("traceId", h.a(".apm/.traceId", "UNKNOWN"));
    }

    private void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{this, context});
            return;
        }
        DegradableNetwork degradableNetwork = new DegradableNetwork(context);
        Request requestImpl = new RequestImpl("http://tmq-service.taobao.org/api/whiteboxlaunchdata/uploadStartupInfo");
        requestImpl.setMethod("POST");
        requestImpl.setCharset("UTF-8");
        requestImpl.setFollowRedirects(true);
        requestImpl.setRetryTime(3);
        requestImpl.addHeader("Content-Type", "application/json");
        ByteArrayEntry byteArrayEntry = new ByteArrayEntry(JSON.toJSONBytes(f28509a, new SerializerFeature[0]));
        byteArrayEntry.setContentType("application/json");
        requestImpl.setBodyEntry(byteArrayEntry);
        try {
            if (degradableNetwork.syncSend(requestImpl, null).getStatusCode() != 200) {
                return;
            }
            gsl.b(gvh.TAG, "[Startup][commit] success", new Object[0]);
        } catch (Throwable th) {
            gsl.b(gvh.TAG, "[Startup][commit] failed:", th);
        }
    }
}
