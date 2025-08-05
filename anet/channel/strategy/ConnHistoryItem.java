package anet.channel.strategy;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.cew;
import tb.kge;

/* loaded from: classes.dex */
public class ConnHistoryItem implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int BAN_THRESHOLD = 3;
    private static final int BAN_TIME = 300000;
    private static final long UPDATE_INTERVAL = 10000;
    private static final long VALID_PERIOD = 86400000;
    private static final long serialVersionUID = 5245740801355223771L;
    public Map<Integer, ConnHistoryItem> proxyHistoryItemMap = null;
    public Map<Integer, ConnHistoryItem> forceCellHistoryItemMap = null;
    public byte history = 0;
    public long lastSuccess = 0;
    public long lastFail = 0;

    static {
        kge.a(104064478);
        kge.a(1028243835);
    }

    public void update(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafc9c04", new Object[]{this, new Boolean(z)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - (z ? this.lastSuccess : this.lastFail) <= 10000) {
            return;
        }
        this.history = (byte) ((this.history << 1) | (!z ? 1 : 0));
        if (z) {
            this.lastSuccess = currentTimeMillis;
        } else {
            this.lastFail = currentTimeMillis;
        }
    }

    public int countFail() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1cbd2c7", new Object[]{this})).intValue();
        }
        for (int i2 = this.history & 255; i2 > 0; i2 >>= 1) {
            i += i2 & 1;
        }
        return i;
    }

    public boolean latestFail() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fbf31950", new Object[]{this})).booleanValue() : (this.history & 1) == 1;
    }

    public boolean shouldBan() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e99aa3e7", new Object[]{this})).booleanValue() : countFail() >= 3 && System.currentTimeMillis() - this.lastFail <= 300000;
    }

    public boolean isExpire() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f97d6f4", new Object[]{this})).booleanValue();
        }
        long j = this.lastSuccess;
        long j2 = this.lastFail;
        if (j <= j2) {
            j = j2;
        }
        return j != 0 && System.currentTimeMillis() - j > 86400000;
    }

    public boolean isExpireStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd5d6407", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.lastFail;
        if (j == 0 || j <= this.lastSuccess) {
            return false;
        }
        return currentTimeMillis - j <= cew.a.CONFIG_TRACK_1022_INTERVAL_TIME || shouldBan();
    }

    public boolean isUsed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bffdf112", new Object[]{this})).booleanValue() : (this.lastFail == 0 && this.lastSuccess == 0) ? false : true;
    }
}
