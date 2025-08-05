package com.taobao.global.setting.data;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.h;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ExecutorService d;

    /* renamed from: a  reason: collision with root package name */
    public h f17210a;
    private Map<String, Object> c = new ConcurrentHashMap();
    private final boolean b = "true".equals(OrangeConfig.getInstance().getConfig("mytaobao_setting_sdk", "fixSettingsAVFSAnr", "true"));

    public static /* synthetic */ Map a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e11f7858", new Object[]{aVar}) : aVar.c;
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new ThreadFactory() { // from class: com.taobao.global.setting.data.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(com.taobao.global.setting.d.BIZ_NAME);
            }
        });
        d = newScheduledThreadPool;
        ((ThreadPoolExecutor) newScheduledThreadPool).setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
        ((ThreadPoolExecutor) d).allowCoreThreadTimeOut(true);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f17210a.c(str);
        }
    }

    public void c(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        if (!this.b) {
            a(str);
        }
        d.submit(new Runnable() { // from class: com.taobao.global.setting.data.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a.a(a.this).remove(str);
                a.this.f17210a.c(str);
            }
        });
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else {
            this.f17210a.a(str, obj);
        }
    }

    public void b(final String str, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18567e8f", new Object[]{this, str, obj});
        } else if (!this.b) {
            a(str, obj);
        } else {
            d.submit(new Runnable() { // from class: com.taobao.global.setting.data.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a.a(a.this).put(str, obj);
                    a.this.f17210a.a(str, obj);
                }
            });
        }
    }

    public Object d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1c8a47dd", new Object[]{this, str});
        }
        if (!this.b) {
            return b(str);
        }
        Object obj = this.c.get(str);
        return obj != null ? obj : b(str);
    }

    public Object b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6e4e661f", new Object[]{this, str}) : this.f17210a.b(str);
    }
}
