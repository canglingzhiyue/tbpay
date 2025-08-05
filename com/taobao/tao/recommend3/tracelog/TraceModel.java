package com.taobao.tao.recommend3.tracelog;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class TraceModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_LEN = 64;
    private long endThreadId;
    private String endThreadName;
    private int endThreadPriority;
    private long endThreadTime;
    private long endTime;
    private boolean isLaunchStage;
    private String name;
    private int priority;
    private long startThreadId;
    private String startThreadName;
    private int startThreadPriority;
    private long startThreadTime;
    private long startTime;
    private Map<String, Object> subProperties;

    static {
        kge.a(-996843620);
        kge.a(1028243835);
    }

    public TraceModel(String str, int i) {
        this.isLaunchStage = false;
        new TraceModel(str, i, null);
    }

    public TraceModel(String str, int i, Map<String, Object> map) {
        this.isLaunchStage = false;
        this.name = str;
        this.priority = i;
        this.startTime = SystemClock.uptimeMillis();
        this.startThreadTime = SystemClock.currentThreadTimeMillis();
        Thread currentThread = Thread.currentThread();
        this.startThreadId = currentThread.getId();
        this.startThreadPriority = currentThread.getPriority();
        this.startThreadName = currentThread.getName();
        addSubProperties(map);
    }

    public TraceModel(String str, int i, long j, long j2, boolean z) {
        this.isLaunchStage = false;
        this.isLaunchStage = z;
        this.name = str;
        this.priority = i;
        this.startThreadTime = j;
        this.startTime = j;
        this.endThreadTime = j2;
        this.endTime = j2;
        Thread currentThread = Thread.currentThread();
        long id = currentThread.getId();
        this.endThreadId = id;
        this.startThreadId = id;
        int priority = currentThread.getPriority();
        this.endThreadPriority = priority;
        this.startThreadPriority = priority;
        String name = currentThread.getName();
        this.endThreadName = name;
        this.startThreadName = name;
    }

    public void endModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f932095", new Object[]{this});
        } else {
            endModel(null, SystemClock.uptimeMillis());
        }
    }

    public void endModel(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d600de50", new Object[]{this, map});
        } else {
            endModel(map, SystemClock.uptimeMillis());
        }
    }

    public void endModel(Map<String, Object> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea1b6274", new Object[]{this, map, new Long(j)});
            return;
        }
        this.endTime = j;
        this.endThreadTime = SystemClock.currentThreadTimeMillis() - (SystemClock.uptimeMillis() - j);
        Thread currentThread = Thread.currentThread();
        this.endThreadId = currentThread.getId();
        this.endThreadPriority = currentThread.getPriority();
        this.endThreadName = currentThread.getName();
        addSubProperties(map);
    }

    public boolean isLaunchStage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3ba7f8c", new Object[]{this})).booleanValue() : this.isLaunchStage;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.name;
    }

    public int getPriority() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue() : this.priority;
    }

    public long getStartThreadId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4d32738c", new Object[]{this})).longValue() : this.startThreadId;
    }

    public long getStartTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue() : this.startTime;
    }

    public long getEndTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("250d18d", new Object[]{this})).longValue() : this.endTime;
    }

    public long getCostTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dc5322b", new Object[]{this})).longValue();
        }
        long j = this.endTime;
        if (j != 0) {
            return j - this.startTime;
        }
        return 0L;
    }

    public long getThreadCostTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97d4a4d5", new Object[]{this})).longValue();
        }
        long j = this.endThreadTime;
        if (j != 0) {
            return j - this.startThreadTime;
        }
        return 0L;
    }

    public Map<String, Object> getSubProperties() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("53755519", new Object[]{this}) : this.subProperties;
    }

    private void addSubProperties(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f46f26c", new Object[]{this, map});
            return;
        }
        Map<String, Object> map2 = this.subProperties;
        if (map2 == null) {
            this.subProperties = map;
        } else if (map == null) {
        } else {
            map2.putAll(map);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "name=" + getNameString(this.name) + ", cost=" + getCostTime() + ", threadCost=" + getThreadCostTime() + ", startTime=" + this.startTime + ", startThreadId=" + this.startThreadId + ", startThreadPriority=" + this.startThreadPriority + ", startThreadName=" + this.startThreadName + ", endTime=" + this.endTime + ", endThreadId=" + this.endThreadId + ", endThreadPriority=" + this.endThreadPriority + ", endThreadName=" + this.endThreadName;
    }

    private String getNameString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a227e77d", new Object[]{this, str});
        }
        int length = str.length();
        if (length > 64) {
            return str.substring(0, 63);
        }
        if (length == 64) {
            return str;
        }
        int i = 64 - length;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                sb.append(" ");
                i = i2;
            } else {
                return sb.toString();
            }
        }
    }
}
