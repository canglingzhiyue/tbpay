package com.taobao.message.kit.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.remote.a;
import com.taobao.message.kit.threadpool.BaseRunnable;
import com.taobao.message.kit.threadpool.Coordinator;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0002J \u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0016J\u0016\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0004J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J\u000e\u0010\"\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 J.\u0010#\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004J\u0016\u0010$\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010%\u001a\u00020\u0004J.\u0010&\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004J\u0016\u0010'\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010(\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010)\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0004J\u0018\u0010*\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u000e\u0010+\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/taobao/message/kit/util/RemoteMonitorUtil;", "", "()V", "FEATURE_NAME", "", "MAX_DURATION", "", "MODULE", "POINT_ASSEMBLE_STAT", "POINT_CLASS_ALARM", "POINT_CLASS_STAT", "POINT_INSTALL_ALARM", "POINT_INSTALL_STAT", "POINT_LOAD_ALARM", "POINT_LOAD_BACK_COUNT", "POINT_LOAD_COUNT", "POINT_LOAD_FAIL_COUNT", "POINT_LOAD_STAT", "POINT_LOAD_TIMEOUT_COUNT", "directLoadAlarm", "", "isSuccess", "", "source", "errorMsg", "errorCode", "directLoadAlarm4Source", "context", "Landroid/content/Context;", "result", "loadingDurationStat", "time", "", "mappingUri", "remoteAssembleStat", "remoteClazzAlarm", "remoteClazzStat", "name", "remoteInstallAlarm", "remoteInstallStat", "remoteLoadBackCount", "remoteLoadCount", "remoteLoadFailCount", "remoteLoadTimeoutCount", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class RemoteMonitorUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEATURE_NAME = "taobao_wangxin";
    public static final RemoteMonitorUtil INSTANCE;
    public static final int MAX_DURATION = 100000;
    public static final String MODULE = "msgRemote";
    public static final String POINT_ASSEMBLE_STAT = "assembleStat";
    public static final String POINT_CLASS_ALARM = "classAlarm";
    public static final String POINT_CLASS_STAT = "classStat";
    public static final String POINT_INSTALL_ALARM = "installAlarm";
    public static final String POINT_INSTALL_STAT = "installStat";
    public static final String POINT_LOAD_ALARM = "loadAlarm";
    public static final String POINT_LOAD_BACK_COUNT = "loadBackCount";
    public static final String POINT_LOAD_COUNT = "loadCount";
    public static final String POINT_LOAD_FAIL_COUNT = "loadFailCount";
    public static final String POINT_LOAD_STAT = "loadStat";
    public static final String POINT_LOAD_TIMEOUT_COUNT = "loadTimeCount";

    static {
        kge.a(-1892793539);
        INSTANCE = new RemoteMonitorUtil();
        MeasureSet create = MeasureSet.create(p.a("time"));
        DimensionSet create2 = DimensionSet.create(p.a("source"));
        AppMonitor.register(MODULE, POINT_INSTALL_STAT, create, create2);
        AppMonitor.register(MODULE, POINT_LOAD_STAT, create, create2);
        AppMonitor.register(MODULE, POINT_CLASS_STAT, create, DimensionSet.create(p.a("name")));
        AppMonitor.register(MODULE, POINT_ASSEMBLE_STAT, create, (DimensionSet) null);
    }

    private RemoteMonitorUtil() {
    }

    public static /* synthetic */ void remoteInstallAlarm$default(RemoteMonitorUtil remoteMonitorUtil, boolean z, String str, String str2, String str3, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c9ad951", new Object[]{remoteMonitorUtil, new Boolean(z), str, str2, str3, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        remoteMonitorUtil.remoteInstallAlarm(z, str, str2, str3);
    }

    public final void remoteInstallAlarm(boolean z, String source, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12c42ef", new Object[]{this, new Boolean(z), source, str, str2});
            return;
        }
        q.c(source, "source");
        if (z) {
            AppMonitor.Alarm.commitSuccess(MODULE, POINT_INSTALL_ALARM, source);
        } else {
            AppMonitor.Alarm.commitFail(MODULE, POINT_INSTALL_ALARM, source, str, str2);
        }
    }

    public final void loadingDurationStat(long j, String source) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e3795c3", new Object[]{this, new Long(j), source});
            return;
        }
        q.c(source, "source");
        if (j > 100000) {
            return;
        }
        a.a("taobao_wangxin", mappingUri(source), j);
        DimensionValueSet dimensionValueSet = new DimensionValueSet();
        dimensionValueSet.setValue("source", source);
        MeasureValueSet measureValueSet = new MeasureValueSet();
        measureValueSet.setValue("time", j);
        AppMonitor.Stat.commit(MODULE, POINT_LOAD_STAT, dimensionValueSet, measureValueSet);
    }

    public final void remoteAssembleStat(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ae3bbf1", new Object[]{this, new Long(j)});
        } else if (j > 100000) {
        } else {
            MeasureValueSet measureValueSet = new MeasureValueSet();
            measureValueSet.setValue("time", j);
            AppMonitor.Stat.commit(MODULE, POINT_ASSEMBLE_STAT, (DimensionValueSet) null, measureValueSet);
        }
    }

    public final void remoteInstallStat(long j, String source) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c2171e", new Object[]{this, new Long(j), source});
            return;
        }
        q.c(source, "source");
        if (j > 100000) {
            return;
        }
        DimensionValueSet dimensionValueSet = new DimensionValueSet();
        dimensionValueSet.setValue("source", source);
        MeasureValueSet measureValueSet = new MeasureValueSet();
        measureValueSet.setValue("time", j);
        AppMonitor.Stat.commit(MODULE, POINT_INSTALL_STAT, dimensionValueSet, measureValueSet);
    }

    public static /* synthetic */ void remoteClazzAlarm$default(RemoteMonitorUtil remoteMonitorUtil, boolean z, String str, String str2, String str3, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e417d44e", new Object[]{remoteMonitorUtil, new Boolean(z), str, str2, str3, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        remoteMonitorUtil.remoteClazzAlarm(z, str, str2, str3);
    }

    public final void remoteClazzAlarm(boolean z, String source, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("672ce2c", new Object[]{this, new Boolean(z), source, str, str2});
            return;
        }
        q.c(source, "source");
        if (z) {
            AppMonitor.Alarm.commitSuccess(MODULE, POINT_CLASS_ALARM, source);
        } else {
            AppMonitor.Alarm.commitFail(MODULE, POINT_CLASS_ALARM, source, str, str2);
        }
    }

    public final void remoteClazzStat(long j, String name) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("171205c1", new Object[]{this, new Long(j), name});
            return;
        }
        q.c(name, "name");
        if (j > 100000) {
            return;
        }
        DimensionValueSet dimensionValueSet = new DimensionValueSet();
        dimensionValueSet.setValue("name", name);
        MeasureValueSet measureValueSet = new MeasureValueSet();
        measureValueSet.setValue("time", j);
        AppMonitor.Stat.commit(MODULE, POINT_CLASS_STAT, dimensionValueSet, measureValueSet);
    }

    public final void remoteLoadCount(String source) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f38074", new Object[]{this, source});
            return;
        }
        q.c(source, "source");
        a.a("taobao_wangxin", mappingUri(source));
        AppMonitor.Counter.commit(MODULE, POINT_LOAD_COUNT, source, 1.0d);
    }

    public final void remoteLoadBackCount(String source) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b24b610d", new Object[]{this, source});
            return;
        }
        q.c(source, "source");
        a.c("taobao_wangxin", mappingUri(source));
        AppMonitor.Counter.commit(MODULE, POINT_LOAD_BACK_COUNT, source, 1.0d);
    }

    public final void remoteLoadFailCount(String source, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17c1cc0", new Object[]{this, source, str});
            return;
        }
        q.c(source, "source");
        a.a("taobao_wangxin", mappingUri(source), str);
        AppMonitor.Counter.commit(MODULE, POINT_LOAD_FAIL_COUNT, source, 1.0d);
    }

    public final void remoteLoadTimeoutCount(String source) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f26893ab", new Object[]{this, source});
            return;
        }
        q.c(source, "source");
        AppMonitor.Counter.commit(MODULE, POINT_LOAD_TIMEOUT_COUNT, source, 1.0d);
    }

    public final void directLoadAlarm4Source(final Context context, final String source, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cff6d96", new Object[]{this, context, source, new Boolean(z)});
            return;
        }
        q.c(source, "source");
        Coordinator.doBackGroundTask(new BaseRunnable() { // from class: com.taobao.message.kit.util.RemoteMonitorUtil$directLoadAlarm4Source$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.kit.threadpool.BaseRunnable
            public void execute() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e48bb97c", new Object[]{this});
                    return;
                }
                Context context2 = context;
                if (context2 == null) {
                    return;
                }
                SharedPreferences sharedPreferences = context2.getApplicationContext().getSharedPreferences(RemoteMonitorUtil.MODULE, 0);
                if (sharedPreferences.getBoolean(source + "Flag", false)) {
                    return;
                }
                SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(RemoteMonitorUtil.MODULE, 0).edit();
                edit.putBoolean(source + "Flag", true).apply();
                if (z) {
                    RemoteMonitorUtil.directLoadAlarm$default(RemoteMonitorUtil.INSTANCE, true, source, null, null, 12, null);
                } else {
                    RemoteMonitorUtil.directLoadAlarm$default(RemoteMonitorUtil.INSTANCE, false, source, null, null, 12, null);
                }
            }
        });
    }

    public static /* synthetic */ void directLoadAlarm$default(RemoteMonitorUtil remoteMonitorUtil, boolean z, String str, String str2, String str3, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fd836cb", new Object[]{remoteMonitorUtil, new Boolean(z), str, str2, str3, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        remoteMonitorUtil.directLoadAlarm(z, str, str2, str3);
    }

    private final void directLoadAlarm(boolean z, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c2c20e9", new Object[]{this, new Boolean(z), str, str2, str3});
        } else if (z) {
            AppMonitor.Alarm.commitSuccess(MODULE, POINT_LOAD_ALARM, str);
        } else {
            AppMonitor.Alarm.commitFail(MODULE, POINT_LOAD_ALARM, str, str2, str3);
        }
    }

    private final String mappingUri(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7ec5dab1", new Object[]{this, str}) : q.a((Object) str, (Object) "chat") ? "https://tb.cn/n/im/dynamic/chat.html" : "http://message/root";
    }
}
