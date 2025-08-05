package com.taobao.tao.log.interceptor;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogLevel;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class RealTimeLogConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String token = String.valueOf(System.currentTimeMillis());
    public boolean enable = true;
    public long expireTime = System.currentTimeMillis() + 7200000;
    public long version = 0;
    public int level = LogLevel.E.ordinal();
    public List<String> moduleList = null;
    public List<String> tagList = null;
    public boolean needWifi = false;
    public int updateInterval = 10;
    public int bufferSize = 2097152;
    public int compressSize = 409600;
    public int sendBufferSize = 204800;

    static {
        kge.a(-396388922);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RealTimeLogConfig{token='" + this.token + "', enable=" + this.enable + ", expireTime=" + this.expireTime + ", version=" + this.version + ", level=" + this.level + ", moduleList=" + this.moduleList + ", tagList=" + this.tagList + ", needWifi=" + this.needWifi + ", updateInterval=" + this.updateInterval + ", bufferSize=" + this.bufferSize + ", compressSize=" + this.compressSize + ", sendBufferSize=" + this.sendBufferSize + '}';
    }
}
