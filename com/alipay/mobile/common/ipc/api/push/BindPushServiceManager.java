package com.alipay.mobile.common.ipc.api.push;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public interface BindPushServiceManager {

    /* loaded from: classes3.dex */
    public static final class BindPushServiceFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static BindPushServiceManager f5390a;

        public static final BindPushServiceManager getInstance() {
            BindPushServiceManager bindPushServiceManager = f5390a;
            if (bindPushServiceManager != null) {
                return bindPushServiceManager;
            }
            synchronized (BindPushServiceFactory.class) {
                if (f5390a != null) {
                    return f5390a;
                }
                try {
                    f5390a = (BindPushServiceManager) Class.forName("com.alipay.mobile.common.ipc.push.BindPushServiceManagerImpl").newInstance();
                    return f5390a;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    void addBindEventListener(BindEventListener bindEventListener);

    void bindService();

    boolean isBindedService();

    void removeBindEventListener(BindEventListener bindEventListener);

    void unbindService();
}
