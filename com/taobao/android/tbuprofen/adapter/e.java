package com.taobao.android.tbuprofen.adapter;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.model.PageInfo;
import com.taobao.android.launcher.bootstrap.tao.ability.dispatch.Dispatchers;
import com.taobao.android.tbuprofen.common.BigMemoryAllocException;
import com.taobao.android.tbuprofen.common.MainThreadWaitTimeoutException;
import com.taobao.android.x;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import tb.kge;

/* loaded from: classes.dex */
public class e extends com.taobao.android.tbuprofen.log.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_LOAD = "LOAD";
    public static final String EVENT_LOAD_ERROR = "LOAD_ERROR";
    public static final String EVENT_LOAD_PLUGIN = "LOAD_PLUGIN";
    public static final String EVENT_LOAD_PLUGIN_ERROR = "LOAD_PLUGIN_ERROR";
    public static final String EVENT_LOAD_PLUGIN_SUCCESS = "LOAD_PLUGIN_SUCCESS";
    public static final String EVENT_LOAD_SUCCESS = "LOAD_SUCCESS";
    public static final String MONITOR_MODULE = "TBProf";

    /* renamed from: a  reason: collision with root package name */
    public Context f15481a;
    public final int b;
    public final String c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    static {
        kge.a(-923111632);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public e(Context context, a aVar) {
        this.f15481a = context;
        this.c = String.format("abi:%s;isDebug:%b;osVer:%s;isVirtual:%s", Build.CPU_ABI, Boolean.valueOf(com.taobao.android.tbuprofen.common.d.a(context)), Build.DISPLAY, Boolean.valueOf(com.taobao.android.tbuprofen.common.d.b(context)));
        boolean e = e(aVar.f15455a);
        this.b = new Random().nextInt(10000);
        this.d = e && TBProfConfig.b() >= this.b;
        this.e = e && TBProfConfig.f() >= this.b;
        this.f = e && TBProfConfig.g() >= this.b;
        com.taobao.android.tbuprofen.log.c.d("TBProfStatistic", String.format("verEnable=%b, isEnable=%b,isBigMemEnable=%b,isMainWaitEnable=%b", Boolean.valueOf(e), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f)), new Object[0]);
    }

    @Override // com.taobao.android.tbuprofen.log.a, com.taobao.android.tbuprofen.f
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.d) {
        } else {
            String format = String.format("event:%s;%s", "LOAD", this.c);
            AppMonitor.Alarm.commitSuccess(MONITOR_MODULE, "load", format);
            TLog.logd("TBProfStatistic", format);
        }
    }

    @Override // com.taobao.android.tbuprofen.log.a, com.taobao.android.tbuprofen.f
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.d) {
        } else {
            String format = String.format("event:%s;%s", EVENT_LOAD_SUCCESS, this.c);
            AppMonitor.Alarm.commitSuccess(MONITOR_MODULE, "load", format);
            TLog.logd("TBProfStatistic", format);
        }
    }

    @Override // com.taobao.android.tbuprofen.log.a, com.taobao.android.tbuprofen.f
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (!this.d) {
        } else {
            String format = String.format("event:%s;%s", EVENT_LOAD_ERROR, this.c);
            AppMonitor.Alarm.commitFail(MONITOR_MODULE, "load", format, str, str2);
            TLog.loge("TBProfStatistic", String.format("%s, err=%s(%s)", format, str, str2));
        }
    }

    @Override // com.taobao.android.tbuprofen.log.a, com.taobao.android.tbuprofen.f
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!this.d) {
        } else {
            String format = String.format("event:%s;pluginName:%s;%s", EVENT_LOAD_PLUGIN, str, this.c);
            AppMonitor.Alarm.commitSuccess(MONITOR_MODULE, "load", format);
            TLog.logd("TBProfStatistic", format);
        }
    }

    @Override // com.taobao.android.tbuprofen.log.a, com.taobao.android.tbuprofen.f
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!this.d) {
        } else {
            String format = String.format("event:%s;pluginName:%s;%s", EVENT_LOAD_PLUGIN_SUCCESS, str, this.c);
            AppMonitor.Alarm.commitSuccess(MONITOR_MODULE, "load", format);
            TLog.logd("TBProfStatistic", format);
        }
    }

    @Override // com.taobao.android.tbuprofen.log.a, com.taobao.android.tbuprofen.f
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (!this.d) {
        } else {
            String format = String.format("event:%s;pluginName:%s;%s", EVENT_LOAD_PLUGIN_ERROR, str, this.c);
            AppMonitor.Alarm.commitFail(MONITOR_MODULE, "load", format, str2, str3);
            TLog.loge("TBProfStatistic", String.format("%s, err=%s(%s)", format, str2, str3));
        }
    }

    public void a(String str, String str2, String str3, long j, StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b315f37f", new Object[]{this, str, str2, str3, new Long(j), stackTraceElementArr});
        } else if (!this.e) {
        } else {
            BigMemoryAllocException bigMemoryAllocException = new BigMemoryAllocException(stackTraceElementArr, str3, j);
            String stackTraceString = Log.getStackTraceString(bigMemoryAllocException);
            AppMonitor.Alarm.commitSuccess(MONITOR_MODULE, "runtime_info", String.format("type=BIG_MEM;str1=%s;str2=%s;str3=%s;l1=%d", str3, str, stackTraceString, Long.valueOf(j)));
            com.taobao.android.tbuprofen.log.c.d("TBProfStatistic", String.format("onBigMemAlloc: AllocType=%s,AllocSize=%d byte,Thread=%s(%s),StackInfo:\r\n%s ", str3, Long.valueOf(j), str, str2, stackTraceString), new Object[0]);
            HashMap hashMap = new HashMap();
            hashMap.put("AllocType", str3);
            hashMap.put("AllocSize", Long.valueOf(j));
            hashMap.put("ThreadID", str2);
            a("HA_BIG_MALLOC", hashMap, bigMemoryAllocException, new Thread(str));
        }
    }

    public void a(String str, int i, StackTraceElement[] stackTraceElementArr, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26eac75c", new Object[]{this, str, new Integer(i), stackTraceElementArr, str2});
        } else if (!this.f) {
        } else {
            MainThreadWaitTimeoutException mainThreadWaitTimeoutException = new MainThreadWaitTimeoutException(stackTraceElementArr, str, i);
            String stackTraceString = Log.getStackTraceString(mainThreadWaitTimeoutException);
            AppMonitor.Alarm.commitSuccess(MONITOR_MODULE, "runtime_info", String.format("type=MAIN_WAIT;str1=%s;l1=%d", str, Integer.valueOf(i)));
            com.taobao.android.tbuprofen.log.c.d("TBProfStatistic", String.format("onMainThreadBlock: BlockType=%s,BlockTime=%d,StackInfo:\r\n%s ", str, Integer.valueOf(i), stackTraceString), new Object[0]);
            HashMap hashMap = new HashMap();
            hashMap.put("BlockType", str);
            hashMap.put("BlockTime", Integer.valueOf(i));
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("HeldThread", str2);
            }
            a("HA_MAIN_LONG_WAIT", hashMap, mainThreadWaitTimeoutException, Looper.getMainLooper().getThread());
        }
    }

    private void a(String str, Map<String, Object> map, Throwable th, Thread thread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("399a2973", new Object[]{this, str, map, th, thread});
            return;
        }
        com.alibaba.ha.bizerrorreporter.module.a aVar = new com.alibaba.ha.bizerrorreporter.module.a();
        aVar.b = AggregationType.STACK;
        aVar.f3119a = str;
        aVar.k = th;
        aVar.l = thread;
        if (map == null) {
            map = new HashMap<>();
        }
        PageInfo b = x.a().b();
        if (b != null) {
            map.put(Dispatchers.TYPE_ACTIVITY, b.getPageName());
            map.put("Fragment", b.getPageFragment());
            map.put("Url", b.getPageUrl());
        }
        aVar.i = map;
        com.alibaba.ha.bizerrorreporter.e.a().a(this.f15481a, aVar);
    }

    private static boolean e(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            split = str.split("\\.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (split.length == 3) {
            return true;
        }
        if (split.length == 4) {
            return split[3].length() <= 2;
        }
        return false;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.android.tbuprofen.log.c.e("TBProfStatistic", "Dump type %d request.", Integer.valueOf(i));
        AppMonitor.Alarm.commitSuccess(MONITOR_MODULE, "dump_info", String.format("event:HEAP_DUMP;type:%d", Integer.valueOf(i)));
    }

    public void a(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d025a92", new Object[]{this, new Integer(i), new Integer(i2), str});
            return;
        }
        com.taobao.android.tbuprofen.log.c.e("TBProfStatistic", "Dump type %d failed. code:%d, subcode:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        AppMonitor.Alarm.commitSuccess(MONITOR_MODULE, "dump_info", String.format("event:HEAP_DUMP_ERR;type:%d;l1:%d;s1:%s", Integer.valueOf(i), Integer.valueOf(i2), str));
    }

    public void a(int i, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619f15b", new Object[]{this, new Integer(i), new Long(j), new Long(j2)});
            return;
        }
        com.taobao.android.tbuprofen.log.c.e("TBProfStatistic", "Dump type %d successfully. FileSize: %dKB, Cost:%dms", Integer.valueOf(i), Long.valueOf(j2 >> 10), Long.valueOf(j));
        AppMonitor.Alarm.commitSuccess(MONITOR_MODULE, "dump_info", String.format("event:HEAP_DUMP_SUCC;type:%d;l1:%d;l2:%d", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2)));
    }

    public void a(int i, long j, long j2, long j3, long j4, long j5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ca7b09", new Object[]{this, new Integer(i), new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5)});
            return;
        }
        AppMonitor.Alarm.commitSuccess(MONITOR_MODULE, "dump_info", String.format("event:HEAP_HPROF_INFO;type:%d;l1:%d;l2:%d;l3:%d", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)));
        com.taobao.android.tbuprofen.log.c.e("TBProfStatistic", String.format("Dump heap info. Type: %d, dump: %dM, strip: %dM, zip:%dM", Integer.valueOf(i), Long.valueOf(j >> 20), Long.valueOf(j2 >> 20), Long.valueOf(j3 >> 20)), new Object[0]);
    }
}
