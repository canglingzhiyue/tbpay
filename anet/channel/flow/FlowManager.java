package anet.channel.flow;

import anet.channel.AwcnConfig;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.DayFlowStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.statist.SingleFlowStatistic;
import anet.channel.statist.WifiFgUseCellReqStatic;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public class FlowManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.FlowAttributes";
    public static String curDate = null;
    public static Map<String, DayFlowStat> curTopTraffic = null;
    public static Map<String, SingleFlowStat> curTopTrafficUrl = null;
    public static double curUseCellFlow = 0.0d;
    private static AtomicBoolean flag = null;
    private static final int maxSize = 128;
    public static HashMap<String, Long> reportUseCellFlow;
    public static HashMap<String, Double> useCellFlow;

    static {
        kge.a(726334397);
        flag = new AtomicBoolean(false);
        curTopTraffic = null;
        curTopTrafficUrl = null;
        useCellFlow = null;
        reportUseCellFlow = null;
        curUseCellFlow = mto.a.GEO_NOT_SUPPORT;
        curDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    public static synchronized void dueToCurTrafficData(RequestStatistic requestStatistic) {
        synchronized (FlowManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d6f176b", new Object[]{requestStatistic});
                return;
            }
            OneFlowStat oneFlowStat = new OneFlowStat(requestStatistic);
            dueToCurTrafficUrlData(new SingleFlowStat(requestStatistic, oneFlowStat));
            dueToCurTrafficData(new DayFlowStat(requestStatistic, oneFlowStat));
            if (requestStatistic.isWifi && requestStatistic.forceCellular > 0) {
                double d = oneFlowStat.bg_cell_down_flowSize + oneFlowStat.bg_cell_up_flowSize + oneFlowStat.fg_cell_down_flowSize + oneFlowStat.fg_cell_up_flowSize;
                dueToCurCellData(d);
                curUseCellFlow += d;
            }
        }
    }

    public static synchronized void dueToCurTrafficUrlData(SingleFlowStat singleFlowStat) {
        synchronized (FlowManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7855ed7", new Object[]{singleFlowStat});
                return;
            }
            if (curTopTrafficUrl == null) {
                curTopTrafficUrl = new HashMap();
            }
            if (curTopTrafficUrl.size() >= 128) {
                String str = singleFlowStat.url;
                if (curTopTrafficUrl.containsKey(str)) {
                    SingleFlowStat singleFlowStat2 = curTopTrafficUrl.get(str);
                    if (singleFlowStat2 != null) {
                        singleFlowStat.oneFlowStat = singleFlowStat.oneFlowStat.updateOneStat(singleFlowStat2.oneFlowStat, singleFlowStat.oneFlowStat);
                    }
                    curTopTrafficUrl.remove(str);
                } else {
                    double d = Double.MAX_VALUE;
                    for (SingleFlowStat singleFlowStat3 : curTopTrafficUrl.values()) {
                        d = Math.min(d, singleFlowStat3.oneFlowStat.sumFlowSize);
                    }
                    if (singleFlowStat.oneFlowStat.sumFlowSize < d) {
                        return;
                    }
                    String str2 = null;
                    Iterator<Map.Entry<String, SingleFlowStat>> it = curTopTrafficUrl.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry<String, SingleFlowStat> next = it.next();
                        if (next.getValue().oneFlowStat.sumFlowSize == d) {
                            str2 = next.getKey();
                            break;
                        }
                    }
                    curTopTrafficUrl.remove(str2);
                }
            }
            curTopTrafficUrl.put(singleFlowStat.url, singleFlowStat);
        }
    }

    public static synchronized void dueToCurTrafficData(DayFlowStat dayFlowStat) {
        DayFlowStat dayFlowStat2;
        synchronized (FlowManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9773cf88", new Object[]{dayFlowStat});
                return;
            }
            if (curTopTraffic == null) {
                curTopTraffic = new HashMap();
            }
            if (curTopTraffic.containsKey(curDate) && (dayFlowStat2 = curTopTraffic.get(curDate)) != null) {
                dayFlowStat.oneFlowStat = dayFlowStat.oneFlowStat.updateOneStat(dayFlowStat2.oneFlowStat, dayFlowStat.oneFlowStat);
                dayFlowStat.startUpCount = dayFlowStat2.startUpCount;
                if (flag.compareAndSet(false, true)) {
                    dayFlowStat.startUpCount++;
                }
            }
            curTopTraffic.put(curDate, dayFlowStat);
        }
    }

    public static synchronized void dueToCurCellData(double d) {
        synchronized (FlowManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9793b3a", new Object[]{new Double(d)});
                return;
            }
            if (useCellFlow == null) {
                useCellFlow = new HashMap<>();
            }
            if (useCellFlow.containsKey(curDate)) {
                Double d2 = useCellFlow.get(curDate);
                d += d2 == null ? mto.a.GEO_NOT_SUPPORT : d2.doubleValue();
            }
            useCellFlow.put(curDate, Double.valueOf(d));
            if (isOverCellFlow(d)) {
                AwcnConfig.setWifiUnavailableUseCellOptOpened(false);
                ALog.e(TAG, "[wifi fg detect opt] [flow] not allow use cell! cell=" + d + " > " + AwcnConfig.getAllowUseCellFlowSize(), null, new Object[0]);
            }
        }
    }

    public static synchronized void dueToReportData(long j) {
        synchronized (FlowManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fd59750", new Object[]{new Long(j)});
                return;
            }
            if (reportUseCellFlow == null) {
                reportUseCellFlow = new HashMap<>();
            }
            if (reportUseCellFlow.containsKey(curDate)) {
                Long l = reportUseCellFlow.get(curDate);
                long longValue = l == null ? 0L : l.longValue();
                if (longValue != -1) {
                    j = longValue;
                }
            }
            reportUseCellFlow.put(curDate, Long.valueOf(j));
        }
    }

    public static synchronized boolean isOverCellFlow(double d) {
        synchronized (FlowManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fe74546d", new Object[]{new Double(d)})).booleanValue();
            }
            return d > ((double) AwcnConfig.getAllowUseCellFlowSize());
        }
    }

    public static void commitWifiFgUseCellReqStatic(RequestStatistic requestStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b07e0571", new Object[]{requestStatistic});
            return;
        }
        if (reportUseCellFlow == null) {
            reportUseCellFlow = new HashMap<>();
        }
        Long l = reportUseCellFlow.get(curDate);
        if ((l == null ? 0L : l.longValue()) == 1) {
            return;
        }
        if (useCellFlow == null) {
            useCellFlow = new HashMap<>();
        }
        Double d = useCellFlow.get(curDate);
        double doubleValue = d == null ? mto.a.GEO_NOT_SUPPORT : d.doubleValue();
        if (!isOverCellFlow(doubleValue)) {
            return;
        }
        commitWifiFgUseCellReqStatic(requestStatistic, doubleValue, 1);
    }

    public static void commitWifiFgUseCellReqStatic(RequestStatistic requestStatistic, double d, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891e87b6", new Object[]{requestStatistic, new Double(d), new Integer(i)});
            return;
        }
        if (i == 1) {
            reportUseCellFlow.put(curDate, 1L);
            str = "over_cell_flow";
        } else {
            str = "bg_report";
        }
        WifiFgUseCellReqStatic wifiFgUseCellReqStatic = new WifiFgUseCellReqStatic(requestStatistic, str);
        wifiFgUseCellReqStatic.useForceCellFlowByDay = d;
        ALog.e(TAG, "[wifi fg detect opt] [flow] " + str + ", commitWifiFgUseCellReqStatic", null, "useForceCellFlowByDay", Double.valueOf(wifiFgUseCellReqStatic.useForceCellFlowByDay));
        AppMonitor.getInstance().commitStat(wifiFgUseCellReqStatic);
    }

    public static void commitSingleFlowStat(HashMap<String, SingleFlowStat> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2ae68b", new Object[]{hashMap});
        } else if (hashMap != null) {
            ArrayList<String> arrayList = new ArrayList();
            for (Map.Entry<String, SingleFlowStat> entry : hashMap.entrySet()) {
                SingleFlowStat value = entry.getValue();
                OneFlowStat oneFlowStat = value.oneFlowStat;
                if (oneFlowStat != null) {
                    SingleFlowStatistic singleFlowStatistic = new SingleFlowStatistic(value.oneFlowStat.date, value.launchTime, value.host, value.url);
                    singleFlowStatistic.setFlowSize(oneFlowStat.fg_wifi_up_flowSize, oneFlowStat.bg_wifi_up_flowSize, oneFlowStat.fg_wifi_down_flowSize, oneFlowStat.bg_wifi_down_flowSize, oneFlowStat.fg_cell_up_flowSize, oneFlowStat.bg_cell_up_flowSize, oneFlowStat.fg_cell_down_flowSize, oneFlowStat.bg_cell_down_flowSize);
                    singleFlowStatistic.setFlowTime(oneFlowStat.fg_time, oneFlowStat.bg_time, oneFlowStat.cell_time, oneFlowStat.wifi_time);
                    ALog.e(TAG, "[flow] commitSingleFlowStat", null, "fg_wifi", Double.valueOf(singleFlowStatistic.fg_wifi_up_flowSize + singleFlowStatistic.fg_wifi_down_flowSize), "bg_wifi", Double.valueOf(singleFlowStatistic.bg_wifi_up_flowSize + singleFlowStatistic.bg_wifi_down_flowSize), "fg_cell", Double.valueOf(singleFlowStatistic.fg_cell_up_flowSize + singleFlowStatistic.fg_cell_down_flowSize), "bg_cell", Double.valueOf(singleFlowStatistic.bg_cell_up_flowSize + singleFlowStatistic.bg_cell_down_flowSize));
                    AppMonitor.getInstance().commitStat(singleFlowStatistic);
                    arrayList.add(entry.getKey());
                }
            }
            for (String str : arrayList) {
                hashMap.remove(str);
            }
        }
    }

    public static void commitDayFlowStat(HashMap<String, DayFlowStat> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa8e745", new Object[]{hashMap});
        } else if (hashMap != null) {
            ArrayList<String> arrayList = new ArrayList();
            for (Map.Entry<String, DayFlowStat> entry : hashMap.entrySet()) {
                DayFlowStat value = entry.getValue();
                OneFlowStat oneFlowStat = value.oneFlowStat;
                if (oneFlowStat != null) {
                    DayFlowStatistic dayFlowStatistic = new DayFlowStatistic(value.oneFlowStat.date, value.startUpCount);
                    dayFlowStatistic.setFlowSize(oneFlowStat.fg_wifi_up_flowSize, oneFlowStat.bg_wifi_up_flowSize, oneFlowStat.fg_wifi_down_flowSize, oneFlowStat.bg_wifi_down_flowSize, oneFlowStat.fg_cell_up_flowSize, oneFlowStat.bg_cell_up_flowSize, oneFlowStat.fg_cell_down_flowSize, oneFlowStat.bg_cell_down_flowSize);
                    dayFlowStatistic.setFlowTime(oneFlowStat.fg_time, oneFlowStat.bg_time, oneFlowStat.cell_time, oneFlowStat.wifi_time);
                    ALog.e(TAG, "[flow] commitDayFlowStat", null, "fg_wifi", Double.valueOf(dayFlowStatistic.fg_wifi_up_flowSize + dayFlowStatistic.fg_wifi_down_flowSize), "bg_wifi", Double.valueOf(dayFlowStatistic.bg_wifi_up_flowSize + dayFlowStatistic.bg_wifi_down_flowSize), "fg_cell", Double.valueOf(dayFlowStatistic.fg_cell_up_flowSize + dayFlowStatistic.fg_cell_down_flowSize), "bg_cell", Double.valueOf(dayFlowStatistic.bg_cell_up_flowSize + dayFlowStatistic.bg_cell_down_flowSize));
                    AppMonitor.getInstance().commitStat(dayFlowStatistic);
                    arrayList.add(entry.getKey());
                }
            }
            for (String str : arrayList) {
                hashMap.remove(str);
            }
        }
    }

    public static void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[0]);
            return;
        }
        curTopTraffic = null;
        curTopTrafficUrl = null;
    }
}
