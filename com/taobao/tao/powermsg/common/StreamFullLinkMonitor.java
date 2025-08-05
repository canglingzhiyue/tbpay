package com.taobao.tao.powermsg.common;

import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.BaseMonitor;
import tb.kge;

@Monitor(module = "pm", monitorPoint = "stream")
/* loaded from: classes8.dex */
public class StreamFullLinkMonitor extends BaseMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "StreamMonitorConfig";
    @Dimension
    public String accsDataId;
    private long accsDownSpent;
    @Measure
    public long accsDownTime;
    private long accsRcvSpent;
    @Measure
    public long accsReceivedTime;
    private long accsUpSpent;
    @Measure
    public long accsUpTime;
    private long downRcvSpent;
    @Dimension
    public String msgId;
    @Dimension
    public String namespace;
    @Measure
    public long netSDKReceivedTime;
    private long netSdkRcvSpent;
    private long netSdkUpSpent;
    @Measure
    public long pmCallbackTime;
    @Measure
    public long pmDownTime;
    private long pmRcvSpent;
    @Measure
    public long pmReceivedTime;
    private long pmUpSpent;
    @Measure
    public long pmUpTime;
    @Measure
    public long send2NetworkEndTime;
    @Measure
    public long send2NetworkStartTime;
    @Dimension
    public String topic;
    private long up2PMDownSpent;

    static {
        kge.a(1124431968);
    }

    public static /* synthetic */ Object ipc$super(StreamFullLinkMonitor streamFullLinkMonitor, String str, Object... objArr) {
        if (str.hashCode() == 358433569) {
            return new Boolean(super.beforeCommit());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.accs.utl.BaseMonitor, anet.channel.statist.StatObject
    public boolean beforeCommit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("155d4321", new Object[]{this})).booleanValue();
        }
        long j = this.accsUpTime;
        this.pmUpSpent = j - this.pmUpTime;
        long j2 = this.send2NetworkStartTime;
        this.accsUpSpent = j2 - j;
        long j3 = this.send2NetworkEndTime;
        this.netSdkUpSpent = j3 - j2;
        long j4 = this.pmDownTime;
        this.up2PMDownSpent = j4 - j3;
        long j5 = this.accsDownTime;
        this.accsDownSpent = j5 - j4;
        long j6 = this.netSDKReceivedTime;
        this.downRcvSpent = j6 - j5;
        long j7 = this.accsReceivedTime;
        this.netSdkRcvSpent = j7 - j6;
        long j8 = this.pmReceivedTime;
        this.accsRcvSpent = j8 - j7;
        this.pmRcvSpent = this.pmCallbackTime - j8;
        return super.beforeCommit();
    }

    public long getAccsDownTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c3733832", new Object[]{this})).longValue() : this.accsDownTime;
    }

    public long getAccsReceivedTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ff6dba71", new Object[]{this})).longValue() : this.accsReceivedTime;
    }

    public long getAccsUpTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1f05232b", new Object[]{this})).longValue() : this.accsUpTime;
    }

    public long getNetSDKReceivedTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6f673c3c", new Object[]{this})).longValue() : this.netSDKReceivedTime;
    }

    public long getPmCallbackTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bf4b3240", new Object[]{this})).longValue() : this.pmCallbackTime;
    }

    public long getPmDownTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b3448b1d", new Object[]{this})).longValue() : this.pmDownTime;
    }

    public long getPmReceivedTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2f359fdc", new Object[]{this})).longValue() : this.pmReceivedTime;
    }

    public long getPmUpTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a65434d6", new Object[]{this})).longValue() : this.pmUpTime;
    }

    public long getSend2NetworkEndTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e2793ec9", new Object[]{this})).longValue() : this.send2NetworkEndTime;
    }

    public long getSend2NetworkStartTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c0d119d0", new Object[]{this})).longValue() : this.send2NetworkStartTime;
    }

    public void setAccsDownTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("868a52ba", new Object[]{this, new Long(j)});
        } else {
            this.accsDownTime = j;
        }
    }

    public void setAccsReceivedTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5cbe5b", new Object[]{this, new Long(j)});
        } else {
            this.accsReceivedTime = j;
        }
    }

    public void setAccsUpTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f87653e1", new Object[]{this, new Long(j)});
        } else {
            this.accsUpTime = j;
        }
    }

    public void setNetSDKReceivedTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b0a8f0", new Object[]{this, new Long(j)});
        } else {
            this.netSDKReceivedTime = j;
        }
    }

    public void setPmCallbackTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78604d6c", new Object[]{this, new Long(j)});
        } else {
            this.pmCallbackTime = j;
        }
    }

    public void setPmDownTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec23ea2f", new Object[]{this, new Long(j)});
        } else {
            this.pmDownTime = j;
        }
    }

    public void setPmReceivedTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c39350", new Object[]{this, new Long(j)});
        } else {
            this.pmReceivedTime = j;
        }
    }

    public void setPmUpTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7094496", new Object[]{this, new Long(j)});
        } else {
            this.pmUpTime = j;
        }
    }

    public void setSend2NetworkEndTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7bdb9b", new Object[]{this, new Long(j)});
        } else {
            this.send2NetworkEndTime = j;
        }
    }

    public void setSend2NetworkStartTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49114e74", new Object[]{this, new Long(j)});
        } else {
            this.send2NetworkStartTime = j;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "StreamFullLinkMonitor{pmUpSpent=" + this.pmUpSpent + ", accsUpSpent=" + this.accsUpSpent + ", netSdkUpSpent=" + this.netSdkUpSpent + ", up2PMDownSpent=" + this.up2PMDownSpent + ", accsDownSpent=" + this.accsDownSpent + ", downRcvSpent=" + this.downRcvSpent + ", netSdkRcvSpent=" + this.netSdkRcvSpent + ", accsRcvSpent=" + this.accsRcvSpent + ", pmRcvSpent=" + this.pmRcvSpent + '}';
    }
}
