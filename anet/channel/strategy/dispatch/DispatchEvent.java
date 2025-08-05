package anet.channel.strategy.dispatch;

import com.alipay.android.phone.mobilecommon.verifyidentity.BuildConfig;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class DispatchEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DNSFAIL = 0;
    public static final int DNSSUCCESS = 1;
    public String accessPoint;
    public final int eventType;
    public final Object extraObject;
    public boolean isForceCellular;
    public String rm;
    public String st;

    static {
        kge.a(-1291715352);
    }

    public DispatchEvent(int i, Object obj, boolean z, String str, String str2) {
        this.isForceCellular = false;
        this.accessPoint = BuildConfig.RPC_TYPE_DEF;
        this.eventType = i;
        this.extraObject = obj;
        this.isForceCellular = z;
        this.st = str;
        this.rm = str2;
    }

    public DispatchEvent(int i, Object obj, boolean z) {
        this.isForceCellular = false;
        this.accessPoint = BuildConfig.RPC_TYPE_DEF;
        this.eventType = i;
        this.extraObject = obj;
        this.isForceCellular = z;
    }

    public DispatchEvent(int i, Object obj) {
        this.isForceCellular = false;
        this.accessPoint = BuildConfig.RPC_TYPE_DEF;
        this.eventType = i;
        this.extraObject = obj;
    }

    public synchronized void setAccessPoint(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e00d4fdb", new Object[]{this, str});
            return;
        }
        if (str != null && !"".equalsIgnoreCase(str) && !str.isEmpty()) {
            this.accessPoint = str;
        }
    }
}
