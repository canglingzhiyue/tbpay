package com.taobao.message.notification.base;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class EnvService implements IEnvProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IEnvProvider sEnvProvider = new DefaultEnvProvider();

    static {
        kge.a(-893389891);
        kge.a(1930881866);
    }

    /* loaded from: classes7.dex */
    public static class SingletonHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static EnvService instance;

        private SingletonHolder() {
        }

        public static /* synthetic */ EnvService access$000() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (EnvService) ipChange.ipc$dispatch("96e11d8b", new Object[0]) : instance;
        }

        static {
            kge.a(-226852208);
            instance = new EnvService();
        }
    }

    public static EnvService instance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EnvService) ipChange.ipc$dispatch("ecca1eb0", new Object[0]) : SingletonHolder.access$000();
    }

    public void setEnvProvider(IEnvProvider iEnvProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85ae8454", new Object[]{this, iEnvProvider});
        } else {
            this.sEnvProvider = iEnvProvider;
        }
    }

    @Override // com.taobao.message.notification.base.IEnvProvider
    public boolean isAppBackGround(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63a3421a", new Object[]{this, str})).booleanValue() : this.sEnvProvider.isAppBackGround(str);
    }

    @Override // com.taobao.message.notification.base.IEnvProvider
    public boolean isProcessRight(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("359ac94e", new Object[]{this, context})).booleanValue() : this.sEnvProvider.isProcessRight(context);
    }

    @Override // com.taobao.message.notification.base.IEnvProvider
    public boolean isWindowManagerAvaliable(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cd1f0055", new Object[]{this, context})).booleanValue() : this.sEnvProvider.isWindowManagerAvaliable(context);
    }

    @Override // com.taobao.message.notification.base.IEnvProvider
    public boolean checkBrand(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d97e34b4", new Object[]{this, str})).booleanValue() : this.sEnvProvider.checkBrand(str);
    }
}
