package anet.channel.appmonitor;

import mtopsdk.common.util.StringUtils;
import anet.channel.statist.AlarmObject;
import anet.channel.statist.CountObject;
import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import anetwork.channel.config.NetworkConfigCenter;
import com.alibaba.analytics.AnalyticsMgr;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

/* loaded from: classes.dex */
public class DefaultAppMonitor implements IAppMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.DefaultAppMonitor";
    private static List<AlarmObject> alarmWaitinglist;
    private static List<CountObject> countWaitingList;
    private static Map<Class<?>, List<Field>> dimensionFieldsCache;
    private static Map<Field, String> field2Name;
    private static volatile boolean isAppMonitorInit;
    private static volatile boolean isFlush;
    private static boolean mAppMonitorValid;
    private static Map<Class<?>, List<Field>> measureFieldsCache;
    private static Random random;
    private static Set<Class<?>> registeredStatClassSet;
    private static List<StatObject> statWaitingList;

    @Override // anet.channel.appmonitor.IAppMonitor
    @Deprecated
    public void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
        }
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    @Deprecated
    public void register(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21a0f6d3", new Object[]{this, cls});
        }
    }

    public static /* synthetic */ boolean access$002(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        isFlush = z;
        return z;
    }

    public static /* synthetic */ List access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("db54c88f", new Object[0]) : statWaitingList;
    }

    public static /* synthetic */ List access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("61da832e", new Object[0]) : alarmWaitinglist;
    }

    public static /* synthetic */ List access$300() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e8603dcd", new Object[0]) : countWaitingList;
    }

    static {
        kge.a(1852035747);
        kge.a(-926972533);
        mAppMonitorValid = false;
        dimensionFieldsCache = new ConcurrentHashMap();
        measureFieldsCache = new ConcurrentHashMap();
        field2Name = new ConcurrentHashMap();
        random = new Random();
        isAppMonitorInit = false;
        isFlush = false;
        statWaitingList = new CopyOnWriteArrayList();
        alarmWaitinglist = new CopyOnWriteArrayList();
        countWaitingList = new CopyOnWriteArrayList();
        registeredStatClassSet = Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public DefaultAppMonitor() {
        try {
            Class.forName(OConstant.REFLECT_APPMONITOR);
            mAppMonitorValid = true;
        } catch (Exception unused) {
            mAppMonitorValid = false;
        }
    }

    private boolean checkAppMonitorInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4e20fdc", new Object[]{this})).booleanValue();
        }
        if (isAppMonitorInit) {
            return true;
        }
        try {
            isAppMonitorInit = AnalyticsMgr.i();
            ALog.e(TAG, "[checkAppMonitorInit]", null, "status", Boolean.valueOf(isAppMonitorInit));
        } catch (Throwable unused) {
            isAppMonitorInit = true;
        }
        return isAppMonitorInit;
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    public void commitStat(StatObject statObject) {
        if (!mAppMonitorValid || statObject == null) {
            return;
        }
        if (!checkAppMonitorInit()) {
            statWaitingList.add(statObject);
            return;
        }
        flushWaitingMonitor();
        Class<?> cls = statObject.getClass();
        Monitor monitor = (Monitor) cls.getAnnotation(Monitor.class);
        if (monitor == null) {
            return;
        }
        if (!registeredStatClassSet.contains(cls)) {
            registerStatClass(cls);
        }
        if (!statObject.beforeCommit()) {
            return;
        }
        if (monitor.monitorPoint().equals("network")) {
            int requestStatisticSampleRate = NetworkConfigCenter.getRequestStatisticSampleRate();
            if (requestStatisticSampleRate > 10000 || requestStatisticSampleRate < 0) {
                requestStatisticSampleRate = 10000;
            }
            if (requestStatisticSampleRate != 10000 && random.nextInt(10000) >= requestStatisticSampleRate) {
                return;
            }
        }
        try {
            DimensionValueSet create = DimensionValueSet.create();
            MeasureValueSet create2 = MeasureValueSet.create();
            List<Field> list = dimensionFieldsCache.get(cls);
            HashMap hashMap = ALog.isPrintLog(1) ? new HashMap() : null;
            if (list != null) {
                for (Field field : list) {
                    Object obj = field.get(statObject);
                    create.setValue(field2Name.get(field), obj == null ? "" : obj.toString());
                }
                for (Field field2 : measureFieldsCache.get(cls)) {
                    Double valueOf = Double.valueOf(field2.getDouble(statObject));
                    create2.setValue(field2Name.get(field2), valueOf.doubleValue());
                    if (hashMap != null) {
                        hashMap.put(field2Name.get(field2), valueOf);
                    }
                }
            }
            AppMonitor.Stat.commit(monitor.module(), monitor.monitorPoint(), create, create2);
            if (!ALog.isPrintLog(1)) {
                return;
            }
            ALog.d(TAG, "commit stat: " + monitor.monitorPoint(), null, "\nDimensions", create.getMap().toString(), "\nMeasures", hashMap.toString());
        } catch (Throwable th) {
            ALog.e(TAG, "commit monitor point failed", null, th, new Object[0]);
        }
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    public void commitAlarm(AlarmObject alarmObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5af4398", new Object[]{this, alarmObject});
        } else if (!mAppMonitorValid || alarmObject == null || StringUtils.isEmpty(alarmObject.module) || StringUtils.isEmpty(alarmObject.modulePoint)) {
        } else {
            if (!checkAppMonitorInit()) {
                alarmWaitinglist.add(alarmObject);
                return;
            }
            flushWaitingMonitor();
            if (ALog.isPrintLog(1)) {
                ALog.d(TAG, "commit alarm: " + alarmObject, null, new Object[0]);
            }
            if (!alarmObject.isSuccess) {
                AppMonitor.Alarm.commitFail(alarmObject.module, alarmObject.modulePoint, StringUtils.stringNull2Empty(alarmObject.arg), StringUtils.stringNull2Empty(alarmObject.errorCode), StringUtils.stringNull2Empty(alarmObject.errorMsg));
            } else {
                AppMonitor.Alarm.commitSuccess(alarmObject.module, alarmObject.modulePoint, StringUtils.stringNull2Empty(alarmObject.arg));
            }
        }
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    public void commitCount(CountObject countObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6908fad8", new Object[]{this, countObject});
        } else if (!mAppMonitorValid || countObject == null || StringUtils.isEmpty(countObject.module) || StringUtils.isEmpty(countObject.modulePoint)) {
        } else {
            if (!checkAppMonitorInit()) {
                countWaitingList.add(countObject);
                return;
            }
            flushWaitingMonitor();
            if (ALog.isPrintLog(2)) {
                ALog.i(TAG, "commit count: " + countObject, null, new Object[0]);
            }
            AppMonitor.Counter.commit(countObject.module, countObject.modulePoint, StringUtils.stringNull2Empty(countObject.arg), countObject.value);
        }
    }

    public synchronized void registerStatClass(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61af6015", new Object[]{this, cls});
        } else if (cls != null && mAppMonitorValid) {
            try {
                if (registeredStatClassSet.contains(cls)) {
                    return;
                }
                Monitor monitor = (Monitor) cls.getAnnotation(Monitor.class);
                if (monitor == null) {
                    return;
                }
                Field[] fields = cls.getFields();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                DimensionSet create = DimensionSet.create();
                MeasureSet create2 = MeasureSet.create();
                for (Field field : fields) {
                    Dimension dimension = (Dimension) field.getAnnotation(Dimension.class);
                    if (dimension != null) {
                        field.setAccessible(true);
                        arrayList.add(field);
                        String name = dimension.name().equals("") ? field.getName() : dimension.name();
                        field2Name.put(field, name);
                        create.addDimension(name);
                    } else {
                        Measure measure = (Measure) field.getAnnotation(Measure.class);
                        if (measure != null) {
                            field.setAccessible(true);
                            arrayList2.add(field);
                            String name2 = measure.name().equals("") ? field.getName() : measure.name();
                            field2Name.put(field, name2);
                            if (measure.max() != Double.MAX_VALUE) {
                                create2.addMeasure(new com.alibaba.mtl.appmonitor.model.Measure(name2, Double.valueOf(measure.constantValue()), Double.valueOf(measure.min()), Double.valueOf(measure.max())));
                            } else {
                                create2.addMeasure(name2);
                            }
                        }
                    }
                }
                dimensionFieldsCache.put(cls, arrayList);
                measureFieldsCache.put(cls, arrayList2);
                com.alibaba.mtl.appmonitor.AppMonitor.register(monitor.module(), monitor.monitorPoint(), create2, create);
                registeredStatClassSet.add(cls);
            } catch (Exception e) {
                ALog.e(TAG, "register fail", null, e, new Object[0]);
            }
        }
    }

    private void flushWaitingMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("416dd278", new Object[]{this});
        } else if (isFlush) {
        } else {
            ThreadPoolExecutorFactory.submitRequestMonitorTask(new Runnable() { // from class: anet.channel.appmonitor.DefaultAppMonitor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    DefaultAppMonitor.access$002(true);
                    ALog.e(DefaultAppMonitor.TAG, "[flushWaitingMonitor]", null, new Object[0]);
                    for (StatObject statObject : DefaultAppMonitor.access$100()) {
                        DefaultAppMonitor.this.commitStat(statObject);
                    }
                    for (AlarmObject alarmObject : DefaultAppMonitor.access$200()) {
                        DefaultAppMonitor.this.commitAlarm(alarmObject);
                    }
                    for (CountObject countObject : DefaultAppMonitor.access$300()) {
                        DefaultAppMonitor.this.commitCount(countObject);
                    }
                }
            });
        }
    }
}
