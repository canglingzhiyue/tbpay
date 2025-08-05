package com.alipay.mobile.common.ipc.biz;

import com.alipay.mobile.common.ipc.api.ServiceBeanManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class ServiceBeanManagerImpl implements ServiceBeanManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f5397a = new ConcurrentHashMap();

    @Override // com.alipay.mobile.common.ipc.api.ServiceBeanManager
    public void register(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9797d0", new Object[]{this, str, obj});
        } else if (this.f5397a.get(str) != null) {
        } else {
            this.f5397a.put(str, obj);
            LogCatUtil.debugOrLose("IPC_ServiceBeanManager", "ihashcode=[" + hashCode() + "]   register className=" + str);
        }
    }

    @Override // com.alipay.mobile.common.ipc.api.ServiceBeanManager
    public void registerAndOverride(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79b7a04d", new Object[]{this, str, obj});
            return;
        }
        this.f5397a.put(str, obj);
        LogCatUtil.debugOrLose("IPC_ServiceBeanManager", "ihashcode=[" + hashCode() + "]  registerAndOverride className=" + str);
    }

    @Override // com.alipay.mobile.common.ipc.api.ServiceBeanManager
    public void unregister(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e8b9cd", new Object[]{this, str});
            return;
        }
        this.f5397a.remove(str);
        LogCatUtil.debugOrLose("IPC_ServiceBeanManager", "unregister className=" + str);
    }

    @Override // com.alipay.mobile.common.ipc.api.ServiceBeanManager
    public void unregisterAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b2b4dcc", new Object[]{this});
            return;
        }
        this.f5397a.clear();
        LogCatUtil.debugOrLose("IPC_ServiceBeanManager", "unregisterAll");
    }

    @Override // com.alipay.mobile.common.ipc.api.ServiceBeanManager
    public Object getServiceBean(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("299c8312", new Object[]{this, str});
        }
        Object obj = this.f5397a.get(str);
        StringBuilder sb = new StringBuilder();
        sb.append("getServiceBean className=");
        sb.append(str);
        sb.append(",obj is ");
        sb.append(obj == null ? "null" : "not null");
        LogCatUtil.info("IPC_ServiceBeanManager", sb.toString());
        return obj;
    }

    @Override // com.alipay.mobile.common.ipc.api.ServiceBeanManager
    public int getServiceBeanCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a92f5bfa", new Object[]{this})).intValue() : this.f5397a.size();
    }
}
