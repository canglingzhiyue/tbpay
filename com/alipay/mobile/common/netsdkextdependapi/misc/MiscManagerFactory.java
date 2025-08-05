package com.alipay.mobile.common.netsdkextdependapi.misc;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MiscManagerFactory extends AbstraceExtBeanFactory<MiscManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static MiscManagerFactory f5487a;

    private MiscManagerFactory() {
    }

    public static final MiscManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MiscManagerFactory) ipChange.ipc$dispatch("8efbd0ee", new Object[0]);
        }
        MiscManagerFactory miscManagerFactory = f5487a;
        if (miscManagerFactory != null) {
            return miscManagerFactory;
        }
        synchronized (MiscManagerFactory.class) {
            if (f5487a != null) {
                return f5487a;
            }
            f5487a = new MiscManagerFactory();
            return f5487a;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newDefaultBean */
    public MiscManager mo594newDefaultBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MiscManager) ipChange.ipc$dispatch("777dad78", new Object[]{this}) : (MiscManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.miscManagerServiceName, MiscManager.class);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newBackupBean */
    public MiscManager mo593newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MiscManager) ipChange.ipc$dispatch("5c414b17", new Object[]{this}) : new MiscManagerAdapter();
    }
}
