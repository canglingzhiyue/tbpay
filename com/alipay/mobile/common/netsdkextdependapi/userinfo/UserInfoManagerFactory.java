package com.alipay.mobile.common.netsdkextdependapi.userinfo;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class UserInfoManagerFactory extends AbstraceExtBeanFactory<UserInfoManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static UserInfoManagerFactory f5498a;

    public static final UserInfoManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UserInfoManagerFactory) ipChange.ipc$dispatch("8b8430ae", new Object[0]);
        }
        UserInfoManagerFactory userInfoManagerFactory = f5498a;
        if (userInfoManagerFactory != null) {
            return userInfoManagerFactory;
        }
        synchronized (UserInfoManagerFactory.class) {
            if (f5498a != null) {
                return f5498a;
            }
            f5498a = new UserInfoManagerFactory();
            return f5498a;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newDefaultBean */
    public UserInfoManager mo594newDefaultBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UserInfoManager) ipChange.ipc$dispatch("5dc7ebb8", new Object[]{this}) : (UserInfoManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.userInfoManagerServiceName, UserInfoManager.class);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    /* renamed from: newBackupBean */
    public UserInfoManager mo593newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UserInfoManager) ipChange.ipc$dispatch("de1f7a57", new Object[]{this}) : new UserInfoManagerAdapter();
    }
}
