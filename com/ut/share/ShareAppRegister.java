package com.ut.share;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.executor.ExecutorFactory;
import com.ut.share.executor.IShareExecutor;
import com.ut.share.utils.Constants;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class ShareAppRegister {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2126248247);
    }

    public static void registerApp(SharePlatform sharePlatform, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2a5d251", new Object[]{sharePlatform, map});
            return;
        }
        IShareExecutor findExecutor = ExecutorFactory.getInstance().findExecutor(sharePlatform);
        if (findExecutor == null) {
            return;
        }
        findExecutor.register(map);
    }

    public static void registerApps(Map<SharePlatform, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5f62649", new Object[]{map});
            return;
        }
        for (Map.Entry<SharePlatform, Map<String, String>> entry : map.entrySet()) {
            registerApp(entry.getKey(), entry.getValue());
        }
    }

    public static void registerWeibo(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bac1520", new Object[]{str, str2});
        } else {
            registerApp(SharePlatform.SinaWeibo, new HashMap<String, String>() { // from class: com.ut.share.ShareAppRegister.1
                private static final long serialVersionUID = 100001;

                {
                    put("appKey", str);
                    put(Constants.WEIBO_REDIRECTURL_KEY, str2);
                }
            });
        }
    }

    public static void registerWeixin(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f64a7b6", new Object[]{str});
        } else {
            registerApp(SharePlatform.Weixin, new HashMap<String, String>() { // from class: com.ut.share.ShareAppRegister.2
                private static final long serialVersionUID = 100002;

                {
                    put("appId", str);
                }
            });
        }
    }

    public static void registerQQ(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e87e2254", new Object[]{str});
        } else {
            registerApp(SharePlatform.QQ, new HashMap<String, String>() { // from class: com.ut.share.ShareAppRegister.3
                private static final long serialVersionUID = 100002;

                {
                    put("appId", str);
                }
            });
        }
    }

    public static void registerLaiwang(final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee11d23", new Object[]{str, str2, str3, str4});
        } else {
            registerApp(SharePlatform.LaiwangChat, new HashMap<String, String>() { // from class: com.ut.share.ShareAppRegister.4
                private static final long serialVersionUID = 100004;

                {
                    put("appId", str);
                    put(Constants.LAIWANG_SECRETID_KEY, str2);
                    put("packageName", str3);
                    put("appName", str4);
                }
            });
        }
    }

    public static void registerWangxin(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f7eb5e8", new Object[]{str});
        } else {
            registerApp(SharePlatform.Wangxin, new HashMap<String, String>() { // from class: com.ut.share.ShareAppRegister.5
                private static final long serialVersionUID = 100004;

                {
                    put("appId", str);
                }
            });
        }
    }

    public static void registerAlipay(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d38319e", new Object[]{str});
        } else {
            registerApp(SharePlatform.Alipay, new HashMap<String, String>() { // from class: com.ut.share.ShareAppRegister.6
                private static final long serialVersionUID = 100004;

                {
                    put("appId", str);
                }
            });
        }
    }

    public static void registerDingTalk(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16fb695e", new Object[]{str});
        } else {
            registerApp(SharePlatform.DingTalk, new HashMap<String, String>() { // from class: com.ut.share.ShareAppRegister.7
                private static final long serialVersionUID = 100006;

                {
                    put("appId", str);
                }
            });
        }
    }
}
