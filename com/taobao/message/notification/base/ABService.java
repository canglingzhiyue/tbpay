package com.taobao.message.notification.base;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class ABService implements IABProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IABProvider sABProvider = new DefaultABProvider();

    static {
        kge.a(-1233599969);
        kge.a(1156634182);
    }

    /* loaded from: classes7.dex */
    public static class SingletonHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static ABService instance;

        private SingletonHolder() {
        }

        public static /* synthetic */ ABService access$000() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ABService) ipChange.ipc$dispatch("52bd86ef", new Object[0]) : instance;
        }

        static {
            kge.a(-2208526);
            instance = new ABService();
        }
    }

    public static ABService instance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ABService) ipChange.ipc$dispatch("7ecd4d2a", new Object[0]) : SingletonHolder.access$000();
    }

    public void setABProvider(IABProvider iABProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d656c3c4", new Object[]{this, iABProvider});
        } else {
            this.sABProvider = iABProvider;
        }
    }

    @Override // com.taobao.message.notification.base.IABProvider
    public String getABResult(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("653ecea7", new Object[]{this, str, str2, str3}) : this.sABProvider.getABResult(str, str2, str3);
    }
}
