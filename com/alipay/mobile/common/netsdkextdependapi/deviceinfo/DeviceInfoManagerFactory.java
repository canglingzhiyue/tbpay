package com.alipay.mobile.common.netsdkextdependapi.deviceinfo;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public class DeviceInfoManagerFactory extends AbstraceExtBeanFactory<DeviceInfoManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static DeviceInfoManagerFactory f5481a;

    public static final DeviceInfoManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceInfoManagerFactory) ipChange.ipc$dispatch("78ac6f8e", new Object[0]);
        }
        DeviceInfoManagerFactory deviceInfoManagerFactory = f5481a;
        if (deviceInfoManagerFactory != null) {
            return deviceInfoManagerFactory;
        }
        synchronized (DeviceInfoManagerFactory.class) {
            if (f5481a != null) {
                return f5481a;
            }
            f5481a = new DeviceInfoManagerFactory();
            return f5481a;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newDefaultBean */
    public DeviceInfoManager mo594newDefaultBean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceInfoManager) ipChange.ipc$dispatch("f1619bd8", new Object[]{this});
        }
        InnerMiscUtil.log(Level.FINEST, "DeviceInfoManagerFactory newDefaultBean");
        return (DeviceInfoManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.deviceInfoManagerServiceName, DeviceInfoManager.class);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newBackupBean */
    public DeviceInfoManager mo593newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DeviceInfoManager) ipChange.ipc$dispatch("4802c2f7", new Object[]{this}) : new DeviceInfoManagerAdapter();
    }
}
