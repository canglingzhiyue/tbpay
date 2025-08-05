package com.taobao.android.cachecleaner.monitor.config;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.tao.messagekit.base.network.AccsConnection;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class ManualConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean enable = false;
    private long silenceTime = 3600;
    private List<String> exceptSuffixes = new ArrayList();
    private List<BizTaskData> cacheListV2 = new ArrayList();
    private List<BizTaskData> dataListV2 = new ArrayList();
    private boolean isLowStorageEnable = false;
    private int lowStoragePopSys = 1024;
    private int lowStorageTao = 1024;
    private int lowStorageWeakSys = AccsConnection.DATA_PACKAGE_MAX;

    static {
        kge.a(1345346424);
    }

    public boolean isEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue() : this.enable;
    }

    public void setEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183c4dc8", new Object[]{this, new Boolean(z)});
        } else {
            this.enable = z;
        }
    }

    public long getSilenceTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e8a253", new Object[]{this})).longValue() : this.silenceTime;
    }

    public void setSilenceTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9928b551", new Object[]{this, new Long(j)});
        } else {
            this.silenceTime = j;
        }
    }

    public List<String> getExceptSuffixes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fb9c9b32", new Object[]{this}) : this.exceptSuffixes;
    }

    public void setExceptSuffixes(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8ecb72", new Object[]{this, list});
        } else {
            this.exceptSuffixes = list;
        }
    }

    public List<BizTaskData> getCacheListV2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("ca468c7a", new Object[]{this}) : this.cacheListV2;
    }

    public void setCacheListV2(List<BizTaskData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36c24a92", new Object[]{this, list});
        } else {
            this.cacheListV2 = list;
        }
    }

    public List<BizTaskData> getDataListV2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("38fc10a6", new Object[]{this}) : this.dataListV2;
    }

    public void setDataListV2(List<BizTaskData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a75cea7e", new Object[]{this, list});
        } else {
            this.dataListV2 = list;
        }
    }

    public boolean isLowStorageEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2c4fe8bf", new Object[]{this})).booleanValue() : this.isLowStorageEnable;
    }

    public void setLowStorageEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0206541", new Object[]{this, new Boolean(z)});
        } else {
            this.isLowStorageEnable = z;
        }
    }

    public int getLowStoragePopSys() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1fdb5993", new Object[]{this})).intValue() : this.lowStoragePopSys;
    }

    public void setLowStoragePopSys(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba2ffd7", new Object[]{this, new Integer(i)});
        } else {
            this.lowStoragePopSys = i;
        }
    }

    public int getLowStorageTao() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1ab7dbdf", new Object[]{this})).intValue() : this.lowStorageTao;
    }

    public void setLowStorageTao(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36f96a3", new Object[]{this, new Integer(i)});
        } else {
            this.lowStorageTao = i;
        }
    }

    public int getLowStorageWeakSys() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a3eb5572", new Object[]{this})).intValue() : this.lowStorageWeakSys;
    }

    public void setLowStorageWeakSys(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc36970", new Object[]{this, new Integer(i)});
        } else {
            this.lowStorageWeakSys = i;
        }
    }
}
