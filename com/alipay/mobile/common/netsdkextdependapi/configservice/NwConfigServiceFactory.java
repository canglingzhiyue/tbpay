package com.alipay.mobile.common.netsdkextdependapi.configservice;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.alipay.mobile.common.netsdkextdependapi.beaninfo.BeanInfoManagerFactory;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class NwConfigServiceFactory extends AbstraceExtBeanFactory<NwConfigService> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static NwConfigServiceFactory f5480a;

    public static final NwConfigServiceFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NwConfigServiceFactory) ipChange.ipc$dispatch("200eabc0", new Object[0]);
        }
        NwConfigServiceFactory nwConfigServiceFactory = f5480a;
        if (nwConfigServiceFactory != null) {
            return nwConfigServiceFactory;
        }
        synchronized (BeanInfoManagerFactory.class) {
            if (f5480a != null) {
                return f5480a;
            }
            f5480a = new NwConfigServiceFactory();
            return f5480a;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newDefaultBean */
    public NwConfigService mo594newDefaultBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NwConfigService) ipChange.ipc$dispatch("299f4b32", new Object[]{this}) : (NwConfigService) InnerMiscUtil.newDefaultBean(BeanServiceConstants.nwConfigServiceName, NwConfigService.class);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newBackupBean */
    public NwConfigService mo593newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NwConfigService) ipChange.ipc$dispatch("a72307f3", new Object[]{this}) : new NwConfigServiceAdapter();
    }
}
