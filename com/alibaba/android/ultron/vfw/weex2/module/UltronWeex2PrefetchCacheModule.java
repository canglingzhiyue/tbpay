package com.alibaba.android.ultron.vfw.weex2.module;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DataPrefetchCache;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.cts;
import tb.kge;
import tb.spk;

/* loaded from: classes2.dex */
public class UltronWeex2PrefetchCacheModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "requestCache";

    static {
        kge.a(-2011392611);
    }

    @MUSMethod(uiThread = true)
    public void setCacheData(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccdbf589", new Object[]{this, jSONObject, str});
        }
    }

    public UltronWeex2PrefetchCacheModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = true)
    public void removeCacheData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83beaab9", new Object[]{this, str});
            return;
        }
        if (!spk.a("babelorder", "enableOrderWeex2Prefetch", false)) {
            UnifyLog.d("UltronWeex2PrefetchCacheModule.removeCacheData", "orange is disable");
        }
        if (TextUtils.isEmpty(str)) {
            UnifyLog.d("UltronWeex2PrefetchCacheModule.removeCacheData", "key is empty");
            return;
        }
        p ultronWeex2PrefetchCacheModule = getInstance();
        if (ultronWeex2PrefetchCacheModule == null) {
            UnifyLog.d("UltronWeex2PrefetchCacheModule.removeCacheData", "instance is null");
            return;
        }
        Object tag = ultronWeex2PrefetchCacheModule.getTag("tradePrefetchCache");
        if (!(tag instanceof UltronWeex2DataPrefetchCache)) {
            UnifyLog.d("UltronWeex2PrefetchCacheModule.removeCacheData", "invalid prefetchCache");
            return;
        }
        String[] split = str.split("_");
        if (split.length <= 0 || TextUtils.isEmpty(split[0])) {
            UnifyLog.d("UltronWeex2PrefetchCacheModule.removeCacheData", "PrimaryKey is null");
        } else {
            ((UltronWeex2DataPrefetchCache) tag).b(cts.a.BIZ_ORDER_DETAIL, split[0]);
        }
    }
}
