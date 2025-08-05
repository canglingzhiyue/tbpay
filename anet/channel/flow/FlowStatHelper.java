package anet.channel.flow;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.encode.FileHelper;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.AppTimer;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public class FlowStatHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static long DELAY_TIME;
    private static String TAG;
    public static AppTimer bgAppTimer;
    public static AppTimer cellAppTimer;
    public static String curDate;
    public static AppTimer fgAppTimer;
    public static HashMap<String, FlowAttribute> flowAttributesHashMap;
    private static AtomicBoolean isInit;
    public static AppTimer wifiAppTimer;

    public static /* synthetic */ AtomicBoolean access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("baff37f7", new Object[0]) : isInit;
    }

    public static /* synthetic */ void access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bc42b8", new Object[0]);
        } else {
            loadCurDateFlow();
        }
    }

    public static /* synthetic */ String access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("682607c7", new Object[0]) : TAG;
    }

    static {
        kge.a(930204946);
        TAG = "awcn.FlowStatHelper";
        DELAY_TIME = 30L;
        isInit = new AtomicBoolean(false);
        flowAttributesHashMap = null;
        fgAppTimer = new AppTimer("fg");
        bgAppTimer = new AppTimer("bg");
        cellAppTimer = new AppTimer("cell");
        wifiAppTimer = new AppTimer("wifi");
        curDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    public static synchronized void initFlow() {
        synchronized (FlowStatHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f7e5", new Object[0]);
                return;
            }
            if (isInit.compareAndSet(false, true)) {
                long currentTimeMillis = System.currentTimeMillis();
                if (NetworkStatusHelper.getStatus().isWifi()) {
                    cellAppTimer.stop(currentTimeMillis);
                    wifiAppTimer.start(currentTimeMillis);
                } else if (NetworkStatusHelper.getStatus().isMobile()) {
                    wifiAppTimer.stop(currentTimeMillis);
                    cellAppTimer.start(currentTimeMillis);
                }
                if (!GlobalAppRuntimeInfo.isAppBackground()) {
                    bgAppTimer.stop(currentTimeMillis);
                    fgAppTimer.start(currentTimeMillis);
                    return;
                }
                fgAppTimer.stop(currentTimeMillis);
                bgAppTimer.start(currentTimeMillis);
            }
        }
    }

    public static synchronized void dueToTrafficData(final RequestStatistic requestStatistic) {
        synchronized (FlowStatHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7060c049", new Object[]{requestStatistic});
            } else {
                ThreadPoolExecutorFactory.submitDetectTask(new Runnable() { // from class: anet.channel.flow.FlowStatHelper.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        DayFlowStat dayFlowStat;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            if (FlowStatHelper.access$000().compareAndSet(false, true)) {
                                FlowStatHelper.initFlow();
                            }
                            if (FlowStatHelper.flowAttributesHashMap == null) {
                                FlowStatHelper.access$100();
                                if (FlowStatHelper.flowAttributesHashMap == null) {
                                    FlowStatHelper.flowAttributesHashMap = new HashMap<>();
                                }
                            }
                            FlowAttribute flowAttribute = FlowStatHelper.flowAttributesHashMap.get(FlowStatHelper.curDate);
                            if (FlowManager.curTopTrafficUrl == null && flowAttribute != null && flowAttribute.topTrafficUrl != null) {
                                for (Map.Entry<String, SingleFlowStat> entry : flowAttribute.topTrafficUrl.entrySet()) {
                                    FlowManager.dueToCurTrafficUrlData(entry.getValue());
                                }
                            }
                            if (FlowManager.curTopTraffic == null && flowAttribute != null && flowAttribute.topTraffic != null && (dayFlowStat = flowAttribute.topTraffic.get(FlowStatHelper.curDate)) != null) {
                                FlowManager.dueToCurTrafficData(dayFlowStat);
                            }
                            if (FlowManager.useCellFlow == null && flowAttribute != null && flowAttribute.useCellFlow != null) {
                                double doubleValue = flowAttribute.useCellFlow.get(FlowStatHelper.curDate).doubleValue();
                                if (doubleValue != mto.a.GEO_NOT_SUPPORT) {
                                    FlowManager.dueToCurCellData(doubleValue);
                                }
                            }
                            if (FlowManager.reportUseCellFlow == null && flowAttribute != null && flowAttribute.reportUseCellFlow != null) {
                                long longValue = flowAttribute.reportUseCellFlow.get(FlowStatHelper.curDate).longValue();
                                if (longValue != -1) {
                                    FlowManager.dueToReportData(longValue);
                                }
                            }
                            FlowManager.dueToCurTrafficData(RequestStatistic.this);
                            FlowManager.commitWifiFgUseCellReqStatic(RequestStatistic.this);
                        } catch (Exception e) {
                            String access$200 = FlowStatHelper.access$200();
                            ALog.e(access$200, "[flow] dueToTrafficData fail, e=" + e.toString(), null, new Object[0]);
                        }
                    }
                });
            }
        }
    }

    public static void commitFlowStat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17f8fb00", new Object[0]);
        } else {
            ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.flow.FlowStatHelper.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        FlowStatHelper.initFlow();
                        if (FlowStatHelper.flowAttributesHashMap == null) {
                            FlowStatHelper.access$100();
                        }
                        boolean z = false;
                        boolean z2 = false;
                        for (Map.Entry<String, FlowAttribute> entry : FlowStatHelper.flowAttributesHashMap.entrySet()) {
                            String key = entry.getKey();
                            FlowAttribute value = entry.getValue();
                            boolean z3 = (FlowStatHelper.curDate.equalsIgnoreCase(key) || value.topTraffic == null || value.topTraffic.get(key) == null) ? false : true;
                            boolean z4 = value.topTrafficUrl != null;
                            if (z3) {
                                FlowManager.commitDayFlowStat(value.topTraffic);
                            } else if (z4) {
                                FlowManager.commitSingleFlowStat(value.topTrafficUrl);
                            }
                            z = z3;
                            z2 = z4;
                        }
                        if (!z && !z2) {
                            return;
                        }
                        FlowFileHelper.updateData(null);
                    } catch (Exception e) {
                        String access$200 = FlowStatHelper.access$200();
                        ALog.e(access$200, "[flow] commitFlowStat fail, e=" + e.toString(), null, new Object[0]);
                    }
                }
            }, DELAY_TIME, TimeUnit.SECONDS);
        }
    }

    private static void loadCurDateFlow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47b451d", new Object[0]);
        } else if (flowAttributesHashMap != null) {
        } else {
            flowAttributesHashMap = (HashMap) FileHelper.loadFile(null, FileHelper.getFile(null, FlowFileHelper.DEFAULT_PATH, FlowFileHelper.DEFAULT_FILE_NAME, FlowFileHelper.FLOW_TAG), FlowFileHelper.FLOW_TAG);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized void updateFlow(long j) {
        synchronized (FlowStatHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb9dc7e6", new Object[]{new Long(j)});
            } else if (flowAttributesHashMap != null) {
                try {
                    timerStop(j);
                    FlowAttribute flowAttribute = new FlowAttribute();
                    if (FlowManager.curTopTraffic != null) {
                        ArrayList arrayList = new ArrayList(FlowManager.curTopTraffic.entrySet());
                        Collections.sort(arrayList, new Comparator<Map.Entry<String, DayFlowStat>>() { // from class: anet.channel.flow.FlowStatHelper.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.util.Comparator
                            public int compare(Map.Entry<String, DayFlowStat> entry, Map.Entry<String, DayFlowStat> entry2) {
                                IpChange ipChange2 = $ipChange;
                                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("51cd4c3f", new Object[]{this, entry, entry2})).intValue() : Double.compare(entry.getValue().oneFlowStat.sumFlowSize, entry2.getValue().oneFlowStat.sumFlowSize);
                            }
                        });
                        for (int i = 0; i < Math.min(arrayList.size(), 10); i++) {
                            Map.Entry entry = (Map.Entry) arrayList.get(i);
                            DayFlowStat dayFlowStat = (DayFlowStat) entry.getValue();
                            if (dayFlowStat.oneFlowStat != null) {
                                dayFlowStat.oneFlowStat.updateTime(fgAppTimer.getTimes(), bgAppTimer.getTimes(), cellAppTimer.getTimes(), wifiAppTimer.getTimes());
                                flowAttribute.topTraffic.put(entry.getKey(), dayFlowStat);
                            }
                        }
                    }
                    if (FlowManager.curTopTrafficUrl != null) {
                        ArrayList arrayList2 = new ArrayList(FlowManager.curTopTrafficUrl.entrySet());
                        Collections.sort(arrayList2, new Comparator<Map.Entry<String, SingleFlowStat>>() { // from class: anet.channel.flow.FlowStatHelper.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.util.Comparator
                            public int compare(Map.Entry<String, SingleFlowStat> entry2, Map.Entry<String, SingleFlowStat> entry3) {
                                IpChange ipChange2 = $ipChange;
                                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("51cd4c3f", new Object[]{this, entry2, entry3})).intValue() : Double.compare(entry2.getValue().oneFlowStat.sumFlowSize, entry3.getValue().oneFlowStat.sumFlowSize);
                            }
                        });
                        for (int i2 = 0; i2 < Math.min(arrayList2.size(), 10); i2++) {
                            Map.Entry entry2 = (Map.Entry) arrayList2.get(i2);
                            SingleFlowStat singleFlowStat = (SingleFlowStat) entry2.getValue();
                            if (singleFlowStat.oneFlowStat != null) {
                                singleFlowStat.oneFlowStat.updateTime(fgAppTimer.getTimes(), bgAppTimer.getTimes(), cellAppTimer.getTimes(), wifiAppTimer.getTimes());
                                flowAttribute.topTrafficUrl.put(entry2.getKey(), singleFlowStat);
                            }
                        }
                    }
                    if (FlowManager.useCellFlow != null) {
                        Double d = FlowManager.useCellFlow.get(curDate);
                        double doubleValue = d == null ? mto.a.GEO_NOT_SUPPORT : d.doubleValue();
                        HashMap<String, Double> hashMap = new HashMap<>();
                        hashMap.put(curDate, Double.valueOf(doubleValue));
                        flowAttribute.useCellFlow = hashMap;
                    }
                    if (FlowManager.reportUseCellFlow != null) {
                        Long l = FlowManager.reportUseCellFlow.get(curDate);
                        long longValue = l == null ? 0L : l.longValue();
                        HashMap<String, Long> hashMap2 = new HashMap<>();
                        hashMap2.put(curDate, Long.valueOf(longValue));
                        flowAttribute.reportUseCellFlow = hashMap2;
                    }
                    if (flowAttributesHashMap != null) {
                        flowAttributesHashMap.remove(curDate);
                    } else {
                        flowAttributesHashMap = new HashMap<>();
                    }
                    flowAttributesHashMap.put(curDate, flowAttribute);
                    FlowFileHelper.updateData(null);
                    clear();
                } catch (Exception e) {
                    String str = TAG;
                    ALog.e(str, "[flow] updateFlow fail, e=" + e.toString(), null, new Object[0]);
                }
            }
        }
    }

    private static synchronized void clear() {
        synchronized (FlowStatHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[0]);
                return;
            }
            flowAttributesHashMap = null;
            FlowManager.clear();
            fgAppTimer.clear();
            bgAppTimer.clear();
            cellAppTimer.clear();
            wifiAppTimer.clear();
        }
    }

    private static synchronized void timerStop(long j) {
        synchronized (FlowStatHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf95a296", new Object[]{new Long(j)});
                return;
            }
            fgAppTimer.stop(j);
            bgAppTimer.stop(j);
            cellAppTimer.stop(j);
            wifiAppTimer.stop(j);
        }
    }

    public static void dueToNetworkChangedFlowStat(NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8b0d37", new Object[]{networkStatus});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        updateFlow(currentTimeMillis);
        setNetworkStatusTimer(networkStatus, currentTimeMillis);
    }

    public static void dueToForgroundFlowStat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2178b8a", new Object[0]);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        fgAppTimer.start(currentTimeMillis);
        bgAppTimer.stop(currentTimeMillis);
        setNetworkStatusTimer(NetworkStatusHelper.getStatus(), currentTimeMillis);
    }

    public static void dueToBackgroundFlowStat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cadd6e6", new Object[0]);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        updateFlow(currentTimeMillis);
        bgAppTimer.start(currentTimeMillis);
        setNetworkStatusTimer(NetworkStatusHelper.getStatus(), currentTimeMillis);
    }

    private static void setNetworkStatusTimer(NetworkStatusHelper.NetworkStatus networkStatus, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("525d01fd", new Object[]{networkStatus, new Long(j)});
        } else if (networkStatus.isWifi()) {
            cellAppTimer.stop(j);
            wifiAppTimer.start(j);
        } else if (!networkStatus.isMobile()) {
        } else {
            wifiAppTimer.stop(j);
            cellAppTimer.start(j);
        }
    }
}
