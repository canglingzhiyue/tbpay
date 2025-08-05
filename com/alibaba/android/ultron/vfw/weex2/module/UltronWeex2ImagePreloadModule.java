package com.alibaba.android.ultron.vfw.weex2.module;

import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.phenix.intf.b;
import java.util.ArrayList;
import java.util.List;
import tb.iro;
import tb.jqg;
import tb.kge;
import tb.spk;

/* loaded from: classes2.dex */
public class UltronWeex2ImagePreloadModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "tradeImgListDownLoad";

    static {
        kge.a(1870591988);
    }

    public UltronWeex2ImagePreloadModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = false)
    public void downloadImageList(final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4a5ed4", new Object[]{this, obj});
        } else if (!(obj instanceof List)) {
            jqg.b("UltronWeex2ImagePreloadModule.downloadImageList", "invalid input");
        } else if (!spk.a(iro.ORANGE_KEY_HYBRID_CONTAINER, "enableImgPreloadByWeex", true)) {
            jqg.b("UltronWeex2ImagePreloadModule.downloadImageList", "switcher is off");
        } else {
            a.a().e().a(new Runnable() { // from class: com.alibaba.android.ultron.vfw.weex2.module.UltronWeex2ImagePreloadModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : (List) obj) {
                            if (obj2 instanceof String) {
                                arrayList.add((String) obj2);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            jqg.b("UltronWeex2ImagePreloadModule.downloadImageList", "preloadList is empty");
                            return;
                        }
                        b h = b.h();
                        if (h == null) {
                            jqg.b("UltronWeex2ImagePreloadModule.downloadImageList", "phenixInstance is null");
                            return;
                        }
                        jqg.b("UltronWeex2ImagePreloadModule.downloadImageList", "fetch");
                        h.a("common", arrayList).a();
                    } catch (Exception e) {
                        jqg.b("UltronWeex2ImagePreloadModule.downloadImageList", e.toString());
                    }
                }
            });
        }
    }
}
