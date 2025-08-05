package com.alipay.mobile.common.netsdkextdependapi.appinfo;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public class AppInfoManagerFactory extends AbstraceExtBeanFactory<AppInfoManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AppInfoManagerFactory f5478a;

    public static final AppInfoManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoManagerFactory) ipChange.ipc$dispatch("62466f6e", new Object[0]);
        }
        AppInfoManagerFactory appInfoManagerFactory = f5478a;
        if (appInfoManagerFactory != null) {
            return appInfoManagerFactory;
        }
        synchronized (AppInfoManagerFactory.class) {
            if (f5478a != null) {
                return f5478a;
            }
            f5478a = new AppInfoManagerFactory();
            return f5478a;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newDefaultBean */
    public AppInfoManager mo594newDefaultBean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoManager) ipChange.ipc$dispatch("987ebb78", new Object[]{this});
        }
        InnerMiscUtil.log(Level.FINEST, "AppInfoManagerFactory newDefaultBean");
        return (AppInfoManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.appInfoManagerServiceName, AppInfoManager.class);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newBackupBean */
    public AppInfoManager mo593newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppInfoManager) ipChange.ipc$dispatch("ac5765d7", new Object[]{this}) : new AppInfoManagerAdapter();
    }
}
