package anet.channel.encode;

import anet.channel.AwcnConfig;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes2.dex */
public class ZstdAttributes implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String dictKey;
    private boolean isAbandon;
    private boolean isCanUpdate;
    private boolean isExpired;
    private boolean isFileExpired;
    public long lastZstdLinkDictTime;
    public String matchPath;
    private long time;
    private long ttl;
    private long ttlThreshold;
    public long zstdDictFailCount;
    public long zstdDictFailStartTime;

    static {
        kge.a(546701722);
        kge.a(1028243835);
    }

    public ZstdAttributes(String str, String str2, String str3) {
        this.dictKey = null;
        this.time = -1L;
        this.ttl = 31536000L;
        this.ttlThreshold = -1L;
        this.isExpired = false;
        this.isFileExpired = false;
        this.isCanUpdate = true;
        this.isAbandon = false;
        this.lastZstdLinkDictTime = -1L;
        this.zstdDictFailStartTime = -1L;
        this.zstdDictFailCount = 0L;
        this.matchPath = null;
        this.dictKey = str2;
        this.time = System.currentTimeMillis();
        this.ttlThreshold = AwcnConfig.getZstdTtl(str3);
        this.matchPath = str;
    }

    public ZstdAttributes(String str, String str2, long j, String str3, long j2) {
        this.dictKey = null;
        this.time = -1L;
        this.ttl = 31536000L;
        this.ttlThreshold = -1L;
        this.isExpired = false;
        this.isFileExpired = false;
        this.isCanUpdate = true;
        this.isAbandon = false;
        this.lastZstdLinkDictTime = -1L;
        this.zstdDictFailStartTime = -1L;
        this.zstdDictFailCount = 0L;
        this.matchPath = null;
        this.dictKey = str2;
        this.ttl = j;
        this.time = System.currentTimeMillis();
        this.ttlThreshold = AwcnConfig.getZstdTtl(str3);
        this.lastZstdLinkDictTime = j2;
        this.matchPath = str;
    }

    public synchronized boolean isExpired(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79e339ba", new Object[]{this, str, str2})).booleanValue();
        }
        if (this.ttlThreshold <= 0) {
            this.ttlThreshold = AwcnConfig.getZstdTtl(str);
        }
        if (this.ttlThreshold > 0 && this.ttl > this.ttlThreshold) {
            this.ttl = this.ttlThreshold;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.isExpired = ((double) (currentTimeMillis - this.time)) / 1000.0d >= ((double) this.ttl);
        if (this.isExpired) {
            ALog.e("awcn.ZstdAttributes", "[zstd-d] remove, isExpired=true!", str2, RemoteMessageConst.TTL, Long.valueOf(this.ttl), "time", Long.valueOf(this.time), "curTime", Long.valueOf(currentTimeMillis), "isFileExpired", Boolean.valueOf(this.isFileExpired));
        }
        return this.isExpired;
    }

    public boolean isFileExpired() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a65a2f8a", new Object[]{this})).booleanValue() : this.isFileExpired;
    }

    public synchronized void setFileExpired(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d8b346", new Object[]{this, new Boolean(z)});
        } else {
            this.isFileExpired = z;
        }
    }

    public long getTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fff5e63e", new Object[]{this})).longValue() : this.time;
    }

    public synchronized void setCanUpdate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb3f716", new Object[]{this, new Boolean(z)});
        } else {
            this.isCanUpdate = z;
        }
    }

    public boolean isCanUpdate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("79b5fba", new Object[]{this})).booleanValue() : this.isCanUpdate;
    }

    public synchronized void setAbandon(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86d3f5a", new Object[]{this, new Boolean(z)});
        } else {
            this.isAbandon = z;
        }
    }

    public boolean isAbandon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8e5acf6", new Object[]{this})).booleanValue() : this.isAbandon;
    }

    public synchronized void setTtl(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd4b333", new Object[]{this, new Long(j)});
        } else {
            this.ttl = j;
        }
    }

    public String getDictKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e3366646", new Object[]{this}) : this.dictKey;
    }
}
