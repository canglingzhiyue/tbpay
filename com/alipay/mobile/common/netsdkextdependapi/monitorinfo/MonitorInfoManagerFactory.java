package com.alipay.mobile.common.netsdkextdependapi.monitorinfo;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public class MonitorInfoManagerFactory extends AbstraceExtBeanFactory<MonitorInfoManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static MonitorInfoManagerFactory f5488a;

    public static final MonitorInfoManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorInfoManagerFactory) ipChange.ipc$dispatch("72177e3c", new Object[0]);
        }
        MonitorInfoManagerFactory monitorInfoManagerFactory = f5488a;
        if (monitorInfoManagerFactory != null) {
            return monitorInfoManagerFactory;
        }
        synchronized (MonitorInfoManagerFactory.class) {
            if (f5488a != null) {
                return f5488a;
            }
            f5488a = new MonitorInfoManagerFactory();
            return f5488a;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newDefaultBean */
    public MonitorInfoManager mo594newDefaultBean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorInfoManager) ipChange.ipc$dispatch("d3607e6a", new Object[]{this});
        }
        InnerMiscUtil.log(Level.FINEST, "MonitorInfoManagerFactory newDefaultBean");
        return (MonitorInfoManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.monitorInfoManagerServiceName, MonitorInfoManager.class);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newBackupBean */
    public MonitorInfoManager mo593newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MonitorInfoManager) ipChange.ipc$dispatch("65459c9", new Object[]{this}) : new MonitorInfoManagerAdapter();
    }
}
