package com.ut.share.executor;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.SharePlatform;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class ExecutorFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, IShareExecutor> executorMap;

    static {
        kge.a(1267848173);
    }

    /* loaded from: classes9.dex */
    public static class Singleton {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static ExecutorFactory instance;

        private Singleton() {
        }

        public static /* synthetic */ ExecutorFactory access$100() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ExecutorFactory) ipChange.ipc$dispatch("c9cb7a1c", new Object[0]) : instance;
        }

        static {
            kge.a(-1710157836);
            instance = new ExecutorFactory();
        }
    }

    public static ExecutorFactory getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorFactory) ipChange.ipc$dispatch("b8dfcf6", new Object[0]) : Singleton.access$100();
    }

    private ExecutorFactory() {
        this.executorMap = new HashMap();
    }

    public IShareExecutor findExecutor(SharePlatform sharePlatform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IShareExecutor) ipChange.ipc$dispatch("5b385bd0", new Object[]{this, sharePlatform});
        }
        IShareExecutor iShareExecutor = this.executorMap.get(sharePlatform.getValue());
        if (iShareExecutor == null) {
            switch (sharePlatform) {
                case SinaWeibo:
                    iShareExecutor = new WeiboExecutor();
                    break;
                case Copy:
                    iShareExecutor = new CopyExecutor();
                    break;
                case SMS:
                    iShareExecutor = new MessageExecutor();
                    break;
                case Alipay:
                    iShareExecutor = new AlipayExecutor();
                    break;
                case DingTalk:
                    iShareExecutor = new DingTalkExecutor();
                    break;
                case Messenger:
                case Line:
                case Telegram:
                case WeChat:
                case WhatsApp:
                case Instagram:
                case Facebook:
                    iShareExecutor = new I18nAppExecutor();
                    break;
            }
            if (iShareExecutor != null) {
                this.executorMap.put(sharePlatform.getValue(), iShareExecutor);
            }
        }
        return iShareExecutor;
    }
}
