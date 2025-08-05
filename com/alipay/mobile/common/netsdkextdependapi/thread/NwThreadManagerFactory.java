package com.alipay.mobile.common.netsdkextdependapi.thread;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.alipay.mobile.common.netsdkextdependapi.security.SecurityManagerFactory;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class NwThreadManagerFactory extends AbstraceExtBeanFactory<NwThreadManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static NwThreadManagerFactory f5497a;

    public static final NwThreadManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NwThreadManagerFactory) ipChange.ipc$dispatch("81287f25", new Object[0]);
        }
        NwThreadManagerFactory nwThreadManagerFactory = f5497a;
        if (nwThreadManagerFactory != null) {
            return nwThreadManagerFactory;
        }
        synchronized (SecurityManagerFactory.class) {
            if (f5497a != null) {
                return f5497a;
            }
            f5497a = new NwThreadManagerFactory();
            return f5497a;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newDefaultBean */
    public NwThreadManager mo594newDefaultBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NwThreadManager) ipChange.ipc$dispatch("3308dba1", new Object[]{this}) : (NwThreadManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.nwThreadManagerServiceName, NwThreadManager.class);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newBackupBean */
    public NwThreadManager mo593newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NwThreadManager) ipChange.ipc$dispatch("46e18600", new Object[]{this}) : new NwThreadManagerAdapter();
    }
}
