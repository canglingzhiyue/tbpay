package com.alipay.mobile.common.transport.http;

import com.alibaba.ability.impl.file.FileAbility;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes3.dex */
public class AndroidH2CacheConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static AndroidH2CacheConfig f5543a = null;
    private static boolean b = false;

    private AndroidH2CacheConfig() {
    }

    public static AndroidH2CacheConfig getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AndroidH2CacheConfig) ipChange.ipc$dispatch("c26aa55", new Object[0]);
        }
        AndroidH2CacheConfig androidH2CacheConfig = f5543a;
        if (androidH2CacheConfig != null) {
            return androidH2CacheConfig;
        }
        synchronized (AndroidH2CacheConfig.class) {
            if (f5543a == null) {
                f5543a = new AndroidH2CacheConfig();
            }
        }
        return f5543a;
    }

    public void setupCacheDir() {
        if (b) {
            return;
        }
        synchronized (AndroidH2CacheConfig.class) {
            if (b) {
                return;
            }
            Class.forName("android.net.http.HttpResponseCache").getMethod("install", File.class, Long.TYPE).invoke(null, new File(TransportEnvUtil.getContext().getCacheDir(), "http"), Long.valueOf((long) FileAbility.MAX_FILE_SIZE));
            b = true;
            LogCatUtil.info("AndroidH2CacheConfig", "[setupCacheDir] http cache create OK");
        }
    }
}
