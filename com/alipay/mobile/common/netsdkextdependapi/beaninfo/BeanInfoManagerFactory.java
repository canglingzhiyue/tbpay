package com.alipay.mobile.common.netsdkextdependapi.beaninfo;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BeanInfoManagerFactory extends AbstraceExtBeanFactory<BeanInfoManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static BeanInfoManagerFactory f5479a;

    public static final BeanInfoManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BeanInfoManagerFactory) ipChange.ipc$dispatch("f5587b0e", new Object[0]);
        }
        BeanInfoManagerFactory beanInfoManagerFactory = f5479a;
        if (beanInfoManagerFactory != null) {
            return beanInfoManagerFactory;
        }
        synchronized (BeanInfoManagerFactory.class) {
            if (f5479a != null) {
                return f5479a;
            }
            f5479a = new BeanInfoManagerFactory();
            return f5479a;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newDefaultBean */
    public BeanInfoManager mo594newDefaultBean() {
        return (BeanInfoManager) Class.forName("com.alipay.mobile.common.netsdkextdepend.beaninfo.DefaultBeanInfoManager").newInstance();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newBackupBean */
    public BeanInfoManager mo593newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BeanInfoManager) ipChange.ipc$dispatch("1a401bf7", new Object[]{this}) : new BeanInfoManagerAdapter();
    }
}
