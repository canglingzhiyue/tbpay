package com.alipay.mobile.common.netsdkextdependapi.fltracer;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class FltracerManagerFactory extends AbstraceExtBeanFactory<FltracerManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static FltracerManagerFactory f5484a;

    private FltracerManagerFactory() {
    }

    public static final FltracerManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FltracerManagerFactory) ipChange.ipc$dispatch("764b238e", new Object[0]);
        }
        FltracerManagerFactory fltracerManagerFactory = f5484a;
        if (fltracerManagerFactory != null) {
            return fltracerManagerFactory;
        }
        synchronized (FltracerManagerFactory.class) {
            if (f5484a != null) {
                return f5484a;
            }
            f5484a = new FltracerManagerFactory();
            return f5484a;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newDefaultBean */
    public FltracerManager mo594newDefaultBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FltracerManager) ipChange.ipc$dispatch("e5ea74d8", new Object[]{this}) : (FltracerManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.fltracerManagerServiceName, FltracerManager.class);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newBackupBean */
    public FltracerManager mo593newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FltracerManager) ipChange.ipc$dispatch("66420377", new Object[]{this}) : new FltracerManagerAdapter();
    }
}
