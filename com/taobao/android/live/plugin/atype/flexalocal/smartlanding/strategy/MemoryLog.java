package com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.SmartLandingTask;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class MemoryLog implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String b;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, LogItem> f14019a = new HashMap<>();
    private String c;

    /* loaded from: classes6.dex */
    public static class LogItem implements Serializable {
        public int times = 0;
        public long interval = 0;

        static {
            kge.a(-881746993);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(1845051420);
        kge.a(-1183952559);
        b = MemoryLog.class.getSimpleName();
    }

    public MemoryLog(String str) {
        this.c = str;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.c
    public void a(SmartLandingTask smartLandingTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2fe78aa", new Object[]{this, smartLandingTask});
        } else if (smartLandingTask == null) {
        } else {
            String identificationId = smartLandingTask.getIdentificationId(this.c);
            LogItem logItem = this.f14019a.get(identificationId);
            if (logItem == null) {
                logItem = new LogItem();
                this.f14019a.put(identificationId, logItem);
            }
            a(smartLandingTask, logItem);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.c
    public boolean b(SmartLandingTask smartLandingTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8a9d52f", new Object[]{this, smartLandingTask})).booleanValue();
        }
        if (smartLandingTask != null) {
            String identificationId = smartLandingTask.getIdentificationId(this.c);
            LogItem logItem = this.f14019a.get(identificationId);
            long currentTimeMillis = System.currentTimeMillis();
            if (logItem == null) {
                logItem = new LogItem();
                this.f14019a.put(identificationId, logItem);
            }
            if (smartLandingTask.showStrategy != null) {
                return a(smartLandingTask.showStrategy, logItem, currentTimeMillis);
            }
        }
        return false;
    }

    public boolean a(SmartLandingTask.ShowStrategy showStrategy, LogItem logItem, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1bcb37c8", new Object[]{this, showStrategy, logItem, new Long(j)})).booleanValue() : showStrategy.interval * 1000 <= j - logItem.interval;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.c
    public void c(SmartLandingTask smartLandingTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e5531ac", new Object[]{this, smartLandingTask});
        } else if (smartLandingTask == null) {
        } else {
            String identificationId = smartLandingTask.getIdentificationId(this.c);
            LogItem logItem = this.f14019a.get(identificationId);
            if (logItem == null) {
                logItem = new LogItem();
                this.f14019a.put(identificationId, logItem);
            }
            logItem.times++;
            logItem.interval = System.currentTimeMillis();
            a(smartLandingTask, logItem);
        }
    }

    private void a(SmartLandingTask smartLandingTask, LogItem logItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a14a128", new Object[]{this, smartLandingTask, logItem});
        } else if (smartLandingTask == null || smartLandingTask.showStrategy == null || logItem == null) {
        } else {
            String identificationId = smartLandingTask.getIdentificationId(this.c);
            if (-1 == smartLandingTask.showStrategy.times) {
                smartLandingTask.showStrategy.updateShow(identificationId, true);
            } else if (smartLandingTask.showStrategy.times > logItem.times) {
                smartLandingTask.showStrategy.updateShow(identificationId, true);
            } else {
                smartLandingTask.showStrategy.updateShow(identificationId, false);
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f14019a.clear();
        }
    }
}
