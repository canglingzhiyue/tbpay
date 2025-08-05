package com.alibaba.android.umbrella.performance;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ProcessEntity implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<String> abTest;
    public Map<String, String> args;
    public Map<String, Long> bindData;
    public String bizName;
    public String childBizName;
    public Map<String, Long> createView;
    public Map<String, Long> dataParse;
    public Map<String, Long> init;
    public Map<String, Long> lifeCycle;
    public Map<String, Long> netWork;
    public Map<String, Long> otherProcess;
    public long pageLoad;
    public Map<String, Long> process;
    private long registerTime;

    public ProcessEntity(String str) {
        this(str, System.currentTimeMillis());
    }

    public ProcessEntity(String str, long j) {
        this.bizName = str;
        this.registerTime = j;
        this.process = new HashMap();
        this.init = new HashMap();
        this.lifeCycle = new HashMap();
        this.netWork = new HashMap();
        this.dataParse = new HashMap();
        this.createView = new HashMap();
        this.bindData = new HashMap();
        this.abTest = new ArrayList();
        this.args = new HashMap();
        this.otherProcess = new HashMap();
    }

    public void addProcess(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92ba9805", new Object[]{this, str, new Long(j)});
            return;
        }
        Map<String, Long> map = this.process;
        if (map == null || map.containsKey(str) || TextUtils.isEmpty(str) || j <= 0) {
            return;
        }
        this.process.put(str, Long.valueOf(j));
    }

    public void addInit(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d989e2", new Object[]{this, str, new Long(j)});
            return;
        }
        Map<String, Long> map = this.init;
        if (map == null || map.containsKey(str) || TextUtils.isEmpty(str) || j <= 0) {
            return;
        }
        this.init.put(str, Long.valueOf(j));
    }

    public void addLifeCycle(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e88bc8a", new Object[]{this, str, new Long(j)});
            return;
        }
        Map<String, Long> map = this.lifeCycle;
        if (map == null || map.containsKey(str) || TextUtils.isEmpty(str) || j <= 0) {
            return;
        }
        this.lifeCycle.put(str, Long.valueOf(j));
    }

    public void addNetwork(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54fd9566", new Object[]{this, str, new Long(j)});
            return;
        }
        Map<String, Long> map = this.netWork;
        if (map == null || map.containsKey(str) || TextUtils.isEmpty(str) || j <= 0) {
            return;
        }
        this.netWork.put(str, Long.valueOf(j));
    }

    public void addDataParse(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae0413cb", new Object[]{this, str, new Long(j)});
            return;
        }
        Map<String, Long> map = this.dataParse;
        if (map == null || map.containsKey(str) || TextUtils.isEmpty(str) || j <= 0) {
            return;
        }
        this.dataParse.put(str, Long.valueOf(j));
    }

    public void addCreateView(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d9d12d1", new Object[]{this, str, new Long(j)});
        } else if (this.createView == null || TextUtils.isEmpty(str) || j <= 0) {
        } else {
            if (this.createView.containsKey(str)) {
                this.createView.put(str, Long.valueOf((j + this.createView.get(str).longValue()) / 2));
            } else {
                this.createView.put(str, Long.valueOf(j));
            }
        }
    }

    public void addBindView(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54abdab0", new Object[]{this, str, new Long(j)});
        } else if (this.bindData == null || TextUtils.isEmpty(str) || j <= 0) {
        } else {
            if (this.bindData.containsKey(str)) {
                this.bindData.put(str, Long.valueOf((j + this.bindData.get(str).longValue()) / 2));
            } else {
                this.bindData.put(str, Long.valueOf(j));
            }
        }
    }

    public void addArgs(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a824d139", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            this.args.put(str, str2);
        }
    }

    public void addOtherProcess(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1661f5d3", new Object[]{this, str, new Long(j)});
        } else if (this.otherProcess == null || TextUtils.isEmpty(str) || j < 0) {
        } else {
            this.otherProcess.put(str, Long.valueOf(j));
        }
    }

    public void setChildBizName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28848295", new Object[]{this, str});
        } else {
            this.childBizName = str;
        }
    }

    public void addAbTest(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96dbd26f", new Object[]{this, str, str2});
        } else if (this.abTest == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            List<String> list = this.abTest;
            list.add(str + ":" + str2);
        }
    }

    public void addPageLoad(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("504c9107", new Object[]{this, new Long(j)});
        } else {
            this.pageLoad = j;
        }
    }

    public void addArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a255240", new Object[]{this, map});
        } else if (map == null || map.size() <= 0) {
        } else {
            this.args.putAll(map);
        }
    }

    public String toJsonString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2d4e3785", new Object[]{this}) : JSON.toJSONString(this);
    }

    public long getRegisterTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1e2f5001", new Object[]{this})).longValue() : this.registerTime;
    }
}
