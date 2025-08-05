package com.taobao.android.shop.application;

import android.app.Application;
import android.taobao.windvane.packageapp.zipapp.utils.c;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.aliweex.utils.MemoryMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.utils.a;
import com.taobao.android.shop.utils.i;
import com.taobao.android.task.Coordinator;
import com.taobao.orange.OrangeConfig;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.utils.WXFileUtils;
import com.taobao.weex.utils.WXLogUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.common.util.SymbolExpUtil;
import tb.kge;

/* loaded from: classes6.dex */
public class ShopLauncher implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static volatile AtomicBoolean prepared = null;
    private static final long serialVersionUID = -8810965795436012371L;
    private Runnable mRunnable = new Runnable() { // from class: com.taobao.android.shop.application.ShopLauncher.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String config = OrangeConfig.getInstance().getConfig("shop_render", "launcher_shop_init_inner_js", "//market.m.taobao.com/app/tb-source-app/shopindex/pages/index");
                if (!TextUtils.isEmpty(config)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int b = i.a().b(config);
                    if (a.a().booleanValue() && -1 != b) {
                        a.a("main-cost", "ShopApplication prepare homepage js-bundle done. cost ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), " ms. ", Integer.valueOf(b), Thread.currentThread().getName());
                    }
                }
                String config2 = OrangeConfig.getInstance().getConfig("shop_render", "launcher_shop_init_other_js", "");
                if (!TextUtils.isEmpty(config2)) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    String[] split = config2.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
                    if (split != null && split.length > 0) {
                        for (int i = 0; i < split.length; i++) {
                            if (!TextUtils.isEmpty(split[i])) {
                                int b2 = i.a().b(split[i]);
                                if (a.a().booleanValue() && -1 != b2) {
                                    a.a("main-cost", "ShopApplication prepare other js-bundle done. cost ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2), " ms. ", Integer.valueOf(b2), Thread.currentThread().getName());
                                }
                            }
                        }
                    }
                }
                if (!"true".equals(OrangeConfig.getInstance().getConfig("shop_render", "launcher_shop_init_rax_js", "false"))) {
                    return;
                }
                long currentTimeMillis3 = System.currentTimeMillis();
                ShopLauncher.access$000("rax14", "rax14.js", "http://h5.m.taobao.com/app/rax/rax14.js");
                if (!a.a().booleanValue()) {
                    return;
                }
                a.a("main-cost", "loadRaxFramework done. cost " + (System.currentTimeMillis() - currentTimeMillis3) + " ms. " + Thread.currentThread().getName());
            } catch (Throwable th) {
                Log.e("shop", "error in init ShopLauncher.prepareJS runnable", th);
            }
        }
    };

    public static /* synthetic */ void access$000(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd32a15", new Object[]{str, str2, str3});
        } else {
            loadRaxFramework(str, str2, str3);
        }
    }

    static {
        kge.a(849719867);
        kge.a(1028243835);
        prepared = new AtomicBoolean(false);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        if (a.a().booleanValue()) {
            a.a("main-cost", "ShopLauncher init.  deviceLevel is " + MemoryMonitor.c() + " launcher_shop_init is " + OrangeConfig.getInstance().getConfig("shop_render", "launcher_shop_init", "true") + " launcher_shop_init_on_low_device is " + OrangeConfig.getInstance().getConfig("shop_render", "launcher_shop_init_on_low_device", "true"));
        }
        if ("false".equals(OrangeConfig.getInstance().getConfig("shop_render", "launcher_shop_init_by_launcher", "true"))) {
            return;
        }
        if ("low_end".equals(MemoryMonitor.c()) && "false".equals(OrangeConfig.getInstance().getConfig("shop_render", "launcher_shop_init_on_low_device", "true"))) {
            return;
        }
        prepareJS(true);
    }

    public void prepareJS(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a174a89d", new Object[]{this, new Boolean(z)});
        } else if (prepared.compareAndSet(true, true)) {
        } else {
            a.b("main-cost", "ShopLauncher prepareJS ", Boolean.valueOf(z));
            try {
                String config = OrangeConfig.getInstance().getConfig("shop_render", "launcher_shop_init_frame_js", "https://market.m.taobao.com/apps/market/shop/weex_v2.html");
                if (!TextUtils.isEmpty(config)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int b = i.a().b(config);
                    if (a.a().booleanValue() && -1 != b) {
                        a.a("main-cost", "ShopApplication prepare first js-bundle done. cost ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), " ms. ", Integer.valueOf(b), Thread.currentThread().getName());
                    }
                }
                if (z) {
                    this.mRunnable.run();
                } else {
                    Coordinator.execute(this.mRunnable, 20);
                }
            } catch (Exception e) {
                Log.e("shop", "error in init ShopLauncher.prepareJS", e);
            }
        }
    }

    private static void loadRaxFramework(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2800b40", new Object[]{str, str2, str3});
            return;
        }
        String streamByUrl = c.getStreamByUrl("rax", str3);
        if (TextUtils.isEmpty(streamByUrl)) {
            streamByUrl = WXFileUtils.loadAsset(str2, WXEnvironment.getApplication());
        }
        boolean registerService = WXSDKEngine.registerService(str, streamByUrl, new HashMap());
        WXLogUtils.d("rax framework init " + str2 + " result: " + registerService);
    }
}
