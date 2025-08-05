package anet.channel.strategy.dispatch;

import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes2.dex */
public class AmdcPriorityInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.AmdcPriorityInfo";
    public AtomicBoolean isExpired = new AtomicBoolean(false);
    public String priority;
    public List<String> priorityHostList;
    public long time;
    public long ttl;
    public String uid;

    static {
        kge.a(-2039486955);
        kge.a(1028243835);
    }

    public AmdcPriorityInfo(String str, String str2, long j, List<String> list) {
        this.uid = null;
        this.priority = null;
        this.ttl = -1L;
        this.time = -1L;
        this.priorityHostList = null;
        this.uid = str;
        this.priority = str2;
        this.ttl = j;
        this.time = System.currentTimeMillis();
        this.priorityHostList = list;
    }

    public synchronized boolean isExpired(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d78472f0", new Object[]{this, str})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.time < this.ttl * 1000) {
            return false;
        }
        ALog.e(TAG, "[amdc priority] isExpired, curTime - time=" + (currentTimeMillis - this.time), str, RemoteMessageConst.TTL, Long.valueOf(this.ttl));
        return true;
    }
}
