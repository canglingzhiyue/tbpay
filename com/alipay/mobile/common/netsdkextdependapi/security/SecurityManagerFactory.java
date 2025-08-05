package com.alipay.mobile.common.netsdkextdependapi.security;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public class SecurityManagerFactory extends AbstraceExtBeanFactory<SecurityManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static SecurityManagerFactory f5493a;

    public static final SecurityManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SecurityManagerFactory) ipChange.ipc$dispatch("6df5ccee", new Object[0]);
        }
        SecurityManagerFactory securityManagerFactory = f5493a;
        if (securityManagerFactory != null) {
            return securityManagerFactory;
        }
        synchronized (SecurityManagerFactory.class) {
            if (f5493a != null) {
                return f5493a;
            }
            f5493a = new SecurityManagerFactory();
            return f5493a;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newDefaultBean */
    public SecurityManager mo594newDefaultBean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SecurityManager) ipChange.ipc$dispatch("39119778", new Object[]{this});
        }
        InnerMiscUtil.log(Level.FINEST, "SecurityManagerFactory newDefaultBean");
        return (SecurityManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.securityManagerServiceName, SecurityManager.class);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newBackupBean */
    public SecurityManager mo593newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SecurityManager) ipChange.ipc$dispatch("b9692617", new Object[]{this}) : new SecurityManagerAdapter();
    }
}
