package com.alibaba.android.umbrella.performance;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INIT_SIZE = 5;
    private static c b;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, ProcessEntity> f2833a;

    public static c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("286d6aa3", new Object[0]);
        }
        if (b == null) {
            b = new c(5);
        }
        return b;
    }

    private c(int i) {
        this.f2833a = new HashMap<>(i);
    }

    public void a(ProcessEntity processEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33cc4f8e", new Object[]{this, processEntity});
        } else if (processEntity == null || StringUtils.isEmpty(processEntity.bizName)) {
        } else {
            if (this.f2833a.containsKey(processEntity.bizName)) {
                this.f2833a.remove(processEntity);
            }
            this.f2833a.put(processEntity.bizName, processEntity);
        }
    }

    public void b(ProcessEntity processEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee41f00f", new Object[]{this, processEntity});
        } else if (processEntity == null || StringUtils.isEmpty(processEntity.bizName) || !this.f2833a.containsKey(processEntity.bizName)) {
        } else {
            this.f2833a.remove(processEntity.bizName);
        }
    }

    public ProcessEntity a(String str) {
        HashMap<String, ProcessEntity> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProcessEntity) ipChange.ipc$dispatch("271e4e4a", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str) && (hashMap = this.f2833a) != null && hashMap.containsKey(str)) {
            return this.f2833a.get(str);
        }
        return null;
    }

    public Map<String, ProcessEntity> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.f2833a;
    }

    public boolean b(String str) {
        HashMap<String, ProcessEntity> hashMap;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : !StringUtils.isEmpty(str) && (hashMap = this.f2833a) != null && hashMap.containsKey(str);
    }
}
