package anet.channel.session.dns;

import android.content.Intent;
import android.net.Uri;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.entity.SessionType;
import anet.channel.strategy.StrategyTemplate;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class DnsNavProcessorHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "NWNavigation";

    static {
        kge.a(-1290127672);
    }

    public static boolean process(final Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24883c41", new Object[]{intent, str})).booleanValue();
        }
        if (intent == null) {
            return true;
        }
        ThreadPoolExecutorFactory.submitBackupTask(new Runnable() { // from class: anet.channel.session.dns.DnsNavProcessorHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    DynamicComponentHandler.onNavigation(intent);
                    Uri data = intent.getData();
                    if (data == null || !AwcnConfig.isDnsOptWhiteList(data)) {
                        return;
                    }
                    String uri = data.toString();
                    ALog.e(DnsNavProcessorHelper.TAG, "process dns pre request= " + uri, null, new Object[0]);
                    GlobalAppRuntimeInfo.getSessionCenter().getThrowsException(data, SessionType.LONG_LINK, 0L, DnsNavConfigTask.PreCONN);
                    StrategyTemplate.getInstance().registerLocalDnsLookup(data, DnsNavConfigTask.PreDNS);
                } catch (Throwable th) {
                    ALog.e(DnsNavProcessorHelper.TAG, "process session error." + th.toString(), null, new Object[0]);
                }
            }
        });
        return true;
    }
}
