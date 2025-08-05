package com.alipay.mobile.common.netsdkextdependapi.lbs;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class LbsInfoManagerFactory extends AbstraceExtBeanFactory<LbsInfoManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static LbsInfoManagerFactory f5485a;

    public static final LbsInfoManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LbsInfoManagerFactory) ipChange.ipc$dispatch("5e1b0aa4", new Object[0]);
        }
        LbsInfoManagerFactory lbsInfoManagerFactory = f5485a;
        if (lbsInfoManagerFactory != null) {
            return lbsInfoManagerFactory;
        }
        synchronized (LbsInfoManagerFactory.class) {
            if (f5485a != null) {
                return f5485a;
            }
            f5485a = new LbsInfoManagerFactory();
            return f5485a;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newDefaultBean */
    public LbsInfoManager mo594newDefaultBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LbsInfoManager) ipChange.ipc$dispatch("56f17e02", new Object[]{this}) : (LbsInfoManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.lbsInfoManagerServiceName, LbsInfoManager.class);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newBackupBean */
    public LbsInfoManager mo593newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LbsInfoManager) ipChange.ipc$dispatch("19442fe1", new Object[]{this}) : new LbsInfoManagerAdapter();
    }
}
