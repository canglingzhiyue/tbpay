package com.taobao.flowcustoms.afc.xbs;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.model.AfcXbsData;
import com.taobao.flowcustoms.afc.model.SmallHandleData;
import java.util.Map;
import tb.kge;
import tb.kog;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(340300509);
    }

    public static synchronized void a(com.taobao.flowcustoms.afc.a aVar, Map<String, Object> map) {
        int parseInt;
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97b4f150", new Object[]{aVar, map});
                return;
            }
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "AfcXbsManager === showXbsWithContext === 开始绘制小把手");
            AfcXbsData afcXbsData = new AfcXbsData();
            try {
                afcXbsData.appKey = aVar.f17179a;
                afcXbsData.backUrl = aVar.h;
                afcXbsData.type = map.get("tipsType") == null ? "" : (String) map.get("tipsType");
                afcXbsData.appName = map.get("appName") == null ? "" : (String) map.get("appName");
                afcXbsData.tipsIcon = map.get("tipsIcon") == null ? "" : (String) map.get("tipsIcon");
                afcXbsData.expireTime = Long.parseLong(map.get("time") == null ? "86400" : (String) map.get("time"));
                Object obj = map.get("tipsStrategy");
                if (obj instanceof Integer) {
                    int intValue = ((Integer) obj).intValue();
                    if (intValue >= AfcXbsData.STRATEGY_0 && intValue <= AfcXbsData.STRATEGY_4) {
                        afcXbsData.tipsStrategy = intValue;
                    }
                } else if ((obj instanceof String) && (parseInt = Integer.parseInt((String) obj)) >= AfcXbsData.STRATEGY_0 && parseInt <= AfcXbsData.STRATEGY_4) {
                    afcXbsData.tipsStrategy = parseInt;
                }
            } catch (Exception unused) {
                com.taobao.flowcustoms.afc.utils.c.a("linkx", "AFCXbsRouter  === execute ==  afcXbsData" + afcXbsData);
            }
            aVar.G = afcXbsData;
            if (aVar.H) {
                kog.a().a(aVar, afcXbsData);
            }
        }
    }

    public static synchronized void a(com.taobao.flowcustoms.afc.a aVar, SmallHandleData.BackAppInfos backAppInfos) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1bfb1b1", new Object[]{aVar, backAppInfos});
            } else if (backAppInfos == null) {
            } else {
                com.taobao.flowcustoms.afc.utils.c.a("linkx", "AfcXbsManager === showXbsWithContext === 开始绘制小把手");
                AfcXbsData afcXbsData = new AfcXbsData();
                try {
                    afcXbsData.appKey = aVar.f17179a;
                    afcXbsData.backUrl = aVar.h;
                    afcXbsData.type = backAppInfos.getShowMode() == null ? "" : backAppInfos.getShowMode();
                    afcXbsData.appName = backAppInfos.getAppName() == null ? "" : backAppInfos.getAppName();
                    afcXbsData.tipsIcon = backAppInfos.getAppIcon() == null ? "" : backAppInfos.getAppIcon();
                    afcXbsData.expireTime = Long.parseLong(backAppInfos.getTime() == null ? "86400" : backAppInfos.getTime());
                    if (backAppInfos.getShowStrategy() != null) {
                        i = Integer.parseInt(backAppInfos.getShowStrategy());
                    }
                    if (i >= AfcXbsData.STRATEGY_0 && i <= AfcXbsData.STRATEGY_4) {
                        afcXbsData.tipsStrategy = i;
                    }
                } catch (Exception unused) {
                    com.taobao.flowcustoms.afc.utils.c.a("linkx", "AFCXbsRouter  === execute ==  afcXbsData" + afcXbsData);
                }
                aVar.G = afcXbsData;
                if (aVar.H) {
                    kog.a().a(aVar, afcXbsData);
                }
            }
        }
    }

    public static synchronized void a(com.taobao.flowcustoms.afc.a aVar) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc9b6d95", new Object[]{aVar});
                return;
            }
            aVar.H = true;
            if (aVar != null && aVar.G != null) {
                kog.a().a(aVar, aVar.G);
            }
        }
    }

    public static boolean a(AfcXbsData afcXbsData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("73504243", new Object[]{afcXbsData})).booleanValue() : afcXbsData != null && (afcXbsData.tipsStrategy == AfcXbsData.STRATEGY_0 || afcXbsData.tipsStrategy == AfcXbsData.STRATEGY_1);
    }

    public static boolean b(AfcXbsData afcXbsData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64f9e862", new Object[]{afcXbsData})).booleanValue() : afcXbsData != null && (afcXbsData.tipsStrategy == AfcXbsData.STRATEGY_0 || afcXbsData.tipsStrategy == AfcXbsData.STRATEGY_2);
    }

    public static boolean c(AfcXbsData afcXbsData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56a38e81", new Object[]{afcXbsData})).booleanValue() : afcXbsData != null && (afcXbsData.tipsStrategy == AfcXbsData.STRATEGY_0 || afcXbsData.tipsStrategy == AfcXbsData.STRATEGY_1 || afcXbsData.tipsStrategy == AfcXbsData.STRATEGY_2 || afcXbsData.tipsStrategy == AfcXbsData.STRATEGY_3);
    }
}
