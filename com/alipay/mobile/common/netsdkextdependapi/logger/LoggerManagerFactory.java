package com.alipay.mobile.common.netsdkextdependapi.logger;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class LoggerManagerFactory extends AbstraceExtBeanFactory<LoggerManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static LoggerManagerFactory f5486a;

    public static final LoggerManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoggerManagerFactory) ipChange.ipc$dispatch("d9096eae", new Object[0]);
        }
        LoggerManagerFactory loggerManagerFactory = f5486a;
        if (loggerManagerFactory != null) {
            return loggerManagerFactory;
        }
        synchronized (LoggerManagerFactory.class) {
            if (f5486a != null) {
                return f5486a;
            }
            f5486a = new LoggerManagerFactory();
            return f5486a;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newDefaultBean */
    public LoggerManager mo594newDefaultBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LoggerManager) ipChange.ipc$dispatch("f6dffab8", new Object[]{this}) : (LoggerManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.loggerInfoManagerServiceName, LoggerManager.class);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newBackupBean */
    public LoggerManager mo593newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LoggerManager) ipChange.ipc$dispatch("6f4db0d7", new Object[]{this}) : new LoggerManagerAdapter();
    }
}
