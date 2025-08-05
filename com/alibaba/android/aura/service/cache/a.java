package com.alibaba.android.aura.service.cache;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.h;
import com.taobao.alivfssdk.cache.l;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import com.uc.webview.export.media.MessageID;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.arc;
import tb.ard;
import tb.bbh;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.alivfssdk.cache.b f2166a;
    private ThreadPoolExecutor b;

    static {
        kge.a(-1492927200);
    }

    public static /* synthetic */ h a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("5f70c52f", new Object[]{aVar}) : aVar.b();
    }

    public a(String str) {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        this.b = bbh.a(Math.max(1, availableProcessors / 2), availableProcessors, 1L, TimeUnit.MINUTES, "AURATaobaoCache#saveCache");
        this.f2166a = AVFSCacheManager.getInstance().cacheForModule(str);
    }

    public void a(final String str, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else {
            this.b.execute(new Runnable() { // from class: com.alibaba.android.aura.service.cache.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        a.a(a.this).a(str, obj);
                    } catch (Exception e) {
                        arc.a().c("AURATaobaoCache", WindvanePluginRegister.WVTNodeCachePlugin.ACTION_SAVE_CACHE, e.getMessage());
                    }
                }
            });
        }
    }

    public <T> T a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("17307540", new Object[]{this, str});
        }
        try {
            return (T) b().b(str);
        } catch (Exception e) {
            ard a2 = arc.a();
            a2.c("AURATaobaoCache", WindvanePluginRegister.WVTNodeCachePlugin.ACTION_GET_CACHE, "key=" + str + "," + e.getMessage());
            return null;
        }
    }

    private h b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("6c39c68e", new Object[]{this});
        }
        com.taobao.alivfssdk.cache.b bVar = this.f2166a;
        if (bVar == null) {
            arc.a().c("AURATaobaoCache", WindvanePluginRegister.WVTNodeCachePlugin.ACTION_GET_CACHE, "mAVFSCache创建失败");
            return l.d();
        }
        return bVar.a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = this.b;
        if (threadPoolExecutor == null || threadPoolExecutor.isShutdown()) {
            return;
        }
        try {
            this.b.shutdownNow();
        } catch (Exception e) {
            ard a2 = arc.a();
            a2.c("AURATaobaoCache", MessageID.onDestroy, "停止线程池报错：" + e.getMessage());
        }
    }
}
