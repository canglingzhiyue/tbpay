package com.alipay.mobile.common.netsdkextdependapi.storager;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.alipay.mobile.common.netsdkextdependapi.security.SecurityManagerFactory;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class StorageManagerFactory extends AbstraceExtBeanFactory<StorageManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static StorageManagerFactory f5495a;

    public static final StorageManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StorageManagerFactory) ipChange.ipc$dispatch("e675483c", new Object[0]);
        }
        StorageManagerFactory storageManagerFactory = f5495a;
        if (storageManagerFactory != null) {
            return storageManagerFactory;
        }
        synchronized (SecurityManagerFactory.class) {
            if (f5495a != null) {
                return f5495a;
            }
            f5495a = new StorageManagerFactory();
            return f5495a;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newDefaultBean */
    public StorageManager mo594newDefaultBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StorageManager) ipChange.ipc$dispatch("6418eeb6", new Object[]{this}) : (StorageManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.storageManagerServiceName, StorageManager.class);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newBackupBean */
    public StorageManager mo593newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StorageManager) ipChange.ipc$dispatch("cb559037", new Object[]{this}) : new StorageManagerAdapter();
    }
}
