package com.taobao.android.weex_ability.modules;

import android.net.Uri;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.i;
import com.taobao.android.weex.mega.MegaModule;
import com.taobao.android.weex.module.WeexInnerModule;
import com.taobao.android.weex.util.b;
import com.taobao.android.weex_framework.util.f;
import com.taobao.android.weex_framework.util.s;
import java.util.HashMap;
import java.util.Map;
import tb.alo;
import tb.alq;
import tb.alr;
import tb.alu;
import tb.kge;

/* loaded from: classes6.dex */
public class WeexMegaBridgeModule extends WeexInnerModule implements MegaModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String[] METHODS;
    public static final String NAME = "megabilityBridge";
    private static final alo sEmtpyCallback;
    private alr mAbilityEnv;
    private alu mAbilityHubAdapter;
    private boolean mFixThreadBlock = true;
    public alq mInvokeContext;

    public static /* synthetic */ Object ipc$super(WeexMegaBridgeModule weexMegaBridgeModule, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -498459201) {
            super.onMainThreadDestroy();
            return null;
        } else if (hashCode != 1738137715) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onInit((String) objArr[0], (i) objArr[1]);
            return null;
        }
    }

    static {
        kge.a(585541504);
        kge.a(1946149024);
        METHODS = new String[]{"asyncCall", "syncCall"};
        sEmtpyCallback = new alo() { // from class: com.taobao.android.weex_ability.modules.WeexMegaBridgeModule.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.alo
            public void onCallback(ExecuteResult executeResult) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                }
            }
        };
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule, com.taobao.android.weex.WeexModule
    public void onInit(String str, i iVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6799e073", new Object[]{this, str, iVar});
            return;
        }
        super.onInit(str, iVar);
        if ("false".equals(f.b("fix_mega_thread_block"))) {
            this.mFixThreadBlock = false;
        }
        WeexInstanceImpl weexInstanceImpl = (WeexInstanceImpl) getWeexInstance();
        String b = f.b("mega_biz_enable");
        if (b != null && !"true".equals(b)) {
            z = false;
        }
        String str2 = "default";
        if (z) {
            String f = weexInstanceImpl.getInstanceConfig().f();
            if (TextUtils.isEmpty(f)) {
                String bundleUrl = weexInstanceImpl.getBundleUrl();
                if (!TextUtils.isEmpty(b.d(bundleUrl))) {
                    str2 = b.d(bundleUrl);
                }
                f = str2;
            }
            this.mAbilityEnv = new alr(f, "Weex");
        } else {
            String bundleUrl2 = weexInstanceImpl.getBundleUrl();
            if (!TextUtils.isEmpty(getOriginURLString(bundleUrl2))) {
                str2 = getOriginURLString(bundleUrl2);
            }
            this.mAbilityEnv = new alr(str2, "Weex");
        }
        this.mAbilityHubAdapter = new alu(this.mAbilityEnv);
        this.mAbilityEnv.a(getWeexInstance().getContext());
        this.mInvokeContext = new alq(this.mAbilityEnv);
        this.mInvokeContext.a((Object) buildCommonUserContext());
        this.mInvokeContext.a(buildCommonUserData());
        this.mInvokeContext.a(weexInstanceImpl.getRootView());
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule
    public WeexValue callModuleMethod(WeexInstanceImpl weexInstanceImpl, String str, String str2, WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("ffafd8f7", new Object[]{this, weexInstanceImpl, str, str2, weexValueArr});
        }
        if ("asyncCall".equals(str2)) {
            argCount(weexValueArr, 4);
            asyncCall(getArg(weexValueArr, 0).toStringValueOrNull(), getArg(weexValueArr, 1).toStringValueOrNull(), getArg(weexValueArr, 2).toJSONObjectOrNull(), getCallback(weexValueArr, 3));
            return null;
        } else if (!"syncCall".equals(str2)) {
            return null;
        } else {
            argCount(weexValueArr, 3);
            return syncCall(getArg(weexValueArr, 0).toStringValueOrNull(), getArg(weexValueArr, 1).toStringValueOrNull(), getArg(weexValueArr, 2).toJSONObjectOrNull());
        }
    }

    @Override // com.taobao.android.weex.mega.MegaModule
    public void asyncCall(String str, String str2, JSONObject jSONObject, final com.taobao.android.weex.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0cdf5f", new Object[]{this, str, str2, jSONObject, bVar});
            return;
        }
        s.a("MegaAdapterAsyncCall");
        this.mAbilityEnv.a(getWeexInstance().getContext());
        this.mAbilityHubAdapter.a(str, str2, this.mInvokeContext, jSONObject, new alo() { // from class: com.taobao.android.weex_ability.modules.WeexMegaBridgeModule.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.alo
            public void onCallback(ExecuteResult executeResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                    return;
                }
                com.taobao.android.weex.b bVar2 = bVar;
                if (bVar2 == null) {
                    return;
                }
                bVar2.b(executeResult.c());
            }
        }, !this.mFixThreadBlock);
        s.b("MegaAdapterAsyncCall");
    }

    @Override // com.taobao.android.weex.mega.MegaModule
    public WeexValue syncCall(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("967fec38", new Object[]{this, str, str2, jSONObject});
        }
        s.a("MegaAdapterSyncCall");
        this.mAbilityEnv.a(getWeexInstance().getContext());
        ExecuteResult a2 = this.mAbilityHubAdapter.a(str, str2, this.mInvokeContext, jSONObject, sEmtpyCallback);
        s.b("MegaAdapterSyncCall");
        s.a("MegaToFormattedData");
        JSONObject jSONObject2 = new JSONObject(a2.c());
        s.b("MegaToFormattedData");
        return WeexValueImpl.ofJSONObject(jSONObject2);
    }

    private String getOriginURLString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("239e120b", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parse = Uri.parse(str);
        StringBuilder sb = new StringBuilder();
        if (parse.isHierarchical()) {
            sb.append(parse.getScheme());
            sb.append(HttpConstant.SCHEME_SPLIT);
            sb.append(parse.getAuthority());
        }
        return sb.toString();
    }

    private Map<String, Object> buildCommonUserContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a5a85167", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("instance", getWeexInstance());
        return hashMap;
    }

    private Map<String, Object> buildCommonUserData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f5ba0e2a", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (getWeexInstance() instanceof WeexInstance) {
            WeexInstanceImpl weexInstanceImpl = (WeexInstanceImpl) getWeexInstance();
            hashMap.put("url", weexInstanceImpl.getBundleUrl());
            hashMap.put("pageId", String.valueOf(weexInstanceImpl.getInstanceId()));
            hashMap.put("ut_page_object", weexInstanceImpl.getTag("ut_page_object"));
        }
        return hashMap;
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule, com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
            return;
        }
        super.onMainThreadDestroy();
        this.mAbilityHubAdapter.a();
    }
}
