package anet.channel.appmonitor;

import anet.channel.statist.AlarmObject;
import anet.channel.statist.CountObject;
import anet.channel.statist.StatObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class AppMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile IAppMonitor apmMonitor;
    private static volatile IAppMonitor appMonitor;

    public static /* synthetic */ IAppMonitor access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IAppMonitor) ipChange.ipc$dispatch("ce44c0fd", new Object[0]) : apmMonitor;
    }

    static {
        kge.a(803095184);
        appMonitor = new Proxy(null);
        apmMonitor = null;
    }

    public static IAppMonitor getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IAppMonitor) ipChange.ipc$dispatch("25dfa118", new Object[0]) : appMonitor;
    }

    public static void setInstance(IAppMonitor iAppMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3792478", new Object[]{iAppMonitor});
        } else {
            appMonitor = new Proxy(iAppMonitor);
        }
    }

    public static void setApmMonitor(IAppMonitor iAppMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e73011", new Object[]{iAppMonitor});
        } else {
            apmMonitor = iAppMonitor;
        }
    }

    /* loaded from: classes.dex */
    public static class Proxy implements IAppMonitor {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public IAppMonitor appMonitor;

        static {
            kge.a(-1338939590);
            kge.a(-926972533);
        }

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

        public Proxy(IAppMonitor iAppMonitor) {
            this.appMonitor = null;
            this.appMonitor = iAppMonitor;
        }

        @Override // anet.channel.appmonitor.IAppMonitor
        public void commitStat(StatObject statObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbe12d44", new Object[]{this, statObject});
                return;
            }
            if (AppMonitor.access$000() != null) {
                AppMonitor.access$000().commitStat(statObject);
            }
            IAppMonitor iAppMonitor = this.appMonitor;
            if (iAppMonitor == null) {
                return;
            }
            iAppMonitor.commitStat(statObject);
        }

        @Override // anet.channel.appmonitor.IAppMonitor
        public void commitAlarm(AlarmObject alarmObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5af4398", new Object[]{this, alarmObject});
                return;
            }
            IAppMonitor iAppMonitor = this.appMonitor;
            if (iAppMonitor == null) {
                return;
            }
            iAppMonitor.commitAlarm(alarmObject);
        }

        @Override // anet.channel.appmonitor.IAppMonitor
        public void commitCount(CountObject countObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6908fad8", new Object[]{this, countObject});
                return;
            }
            IAppMonitor iAppMonitor = this.appMonitor;
            if (iAppMonitor == null) {
                return;
            }
            iAppMonitor.commitCount(countObject);
        }
    }
}
