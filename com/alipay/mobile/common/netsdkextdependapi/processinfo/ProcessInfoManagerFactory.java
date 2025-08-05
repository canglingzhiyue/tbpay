package com.alipay.mobile.common.netsdkextdependapi.processinfo;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ProcessInfoManagerFactory extends AbstraceExtBeanFactory<ProcessInfoManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ProcessInfoManagerFactory f5492a;

    public static final ProcessInfoManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProcessInfoManagerFactory) ipChange.ipc$dispatch("d008cf52", new Object[0]);
        }
        ProcessInfoManagerFactory processInfoManagerFactory = f5492a;
        if (processInfoManagerFactory != null) {
            return processInfoManagerFactory;
        }
        synchronized (ProcessInfoManagerFactory.class) {
            if (f5492a != null) {
                return f5492a;
            }
            f5492a = new ProcessInfoManagerFactory();
            return f5492a;
        }
    }

    private ProcessInfoManagerFactory() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newDefaultBean */
    public ProcessInfoManager mo594newDefaultBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProcessInfoManager) ipChange.ipc$dispatch("b8729a14", new Object[]{this}) : (ProcessInfoManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.processInfoManagerServiceName, ProcessInfoManager.class);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newBackupBean */
    public ProcessInfoManager mo593newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProcessInfoManager) ipChange.ipc$dispatch("eb667573", new Object[]{this}) : new ProcessInfoManagerAdapter();
    }
}
