package com.alibaba.android.ultron.vfw.weex2.highPerformance.widget;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.animation.Animation;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridPreRenderRecyclePolicy;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import com.taobao.tao.Globals;
import com.ut.mini.UTAnalytics;
import com.ut.mini.l;
import java.util.Map;
import java.util.Set;
import tb.abm;
import tb.adh;
import tb.dsm;
import tb.fkh;
import tb.iro;
import tb.jqg;
import tb.kge;
import tb.ljl;
import tb.spk;

/* loaded from: classes2.dex */
public class UltronTradeHybridDialogFragment extends UltronWeex2DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String reusedContainerSpmCnt;
    private com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a mManager = com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a();
    private abm mConfig = this.mManager.b();

    static {
        kge.a(128291706);
    }

    public static /* synthetic */ Object ipc$super(UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case 1088398452:
                return super.onCreateAnimation(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue(), ((Number) objArr[2]).intValue());
            case 1554821038:
                super.dismissFragmentContainer();
                return null;
            case 2127624665:
                super.onDetach();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ String access$000(UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3103f430", new Object[]{ultronTradeHybridDialogFragment}) : ultronTradeHybridDialogFragment.mWeex2Url;
    }

    public static /* synthetic */ String access$100(UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7db21db1", new Object[]{ultronTradeHybridDialogFragment}) : ultronTradeHybridDialogFragment.mWeex2Url;
    }

    public static /* synthetic */ String access$200(UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca604732", new Object[]{ultronTradeHybridDialogFragment}) : ultronTradeHybridDialogFragment.mWeex2Url;
    }

    public static /* synthetic */ String access$300(UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("170e70b3", new Object[]{ultronTradeHybridDialogFragment}) : ultronTradeHybridDialogFragment.mWeex2Url;
    }

    public static /* synthetic */ void access$400(UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("352dafec", new Object[]{ultronTradeHybridDialogFragment});
        } else {
            ultronTradeHybridDialogFragment.init();
        }
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Map<String, String> pageAllProperties;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        if (reuseTradeHybridContainer() && (pageAllProperties = UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(getActivity())) != null && !pageAllProperties.isEmpty()) {
            String str = pageAllProperties.get("tradeHybridContainerSpmCnt");
            if (StringUtils.isEmpty(str)) {
                str = "";
            }
            this.reusedContainerSpmCnt = str;
        }
        super.onAttach(context);
        rebindContext(context);
        if (this.mbPreRender) {
            sendPreRenderMessageToWeex2V2();
            return;
        }
        loadImmediateCreatedInstance();
        String str2 = this.mWeex2Url;
        dsm.a(false, str2, "OnError: mbPreRender is false, isFoldDevice: " + this.isFoldDevice);
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment, android.support.v4.app.Fragment
    public void onResume() {
        l.c orNewUTPageStateObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (!reuseTradeHybridContainer() || (orNewUTPageStateObject = l.getInstance().getOrNewUTPageStateObject(getActivity())) == null) {
            return;
        }
        String a2 = adh.a(this.mWeex2Url, "tradeHybridContainerSpmCnt");
        if (StringUtils.isEmpty(a2)) {
            return;
        }
        orNewUTPageStateObject.mSpmCnt = a2;
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        l.c orNewUTPageStateObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        if (reuseTradeHybridContainer() && (orNewUTPageStateObject = l.getInstance().getOrNewUTPageStateObject(getActivity())) != null && !StringUtils.isEmpty(this.reusedContainerSpmCnt)) {
            orNewUTPageStateObject.mSpmCnt = this.reusedContainerSpmCnt;
        }
        super.onDetach();
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment
    public void dismissFragmentContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cacafae", new Object[]{this});
        } else if (StringUtils.equals(adh.a(this.mWeex2Url, "reuseTradeHybridContainer"), "true")) {
        } else {
            super.dismissFragmentContainer();
        }
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment, android.support.v4.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("40dfa474", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        if (StringUtils.isEmpty(this.mWeex2Url)) {
            return super.onCreateAnimation(i, z, i2);
        }
        Uri parse = Uri.parse(this.mWeex2Url);
        if (StringUtils.equals(parse.getQueryParameter("skipEnterAnimation"), "true") || StringUtils.equals(parse.getQueryParameter("animated"), "NO") || reuseTradeHybridContainer()) {
            return null;
        }
        return super.onCreateAnimation(i, z, i2);
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment
    public void doDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a c = this.mConfig.c(this.mWeex2Url);
        if (c == null || StringUtils.isEmpty(c.e)) {
            UnifyLog.d("UltronTradeHybridDialogFragment.doDestroy", "recyclePolicy invalid");
            destroyWeex2Instance();
            return;
        }
        String str = c.e;
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -224113450) {
            if (hashCode != 3387192) {
                if (hashCode == 1082880659 && str.equals("recycle")) {
                    c2 = 1;
                }
            } else if (str.equals("none")) {
                c2 = 0;
            }
        } else if (str.equals(UltronTradeHybridPreRenderRecyclePolicy.DESTROY_REBUILD)) {
            c2 = 2;
        }
        if (c2 == 0) {
            destroyWeex2Instance();
        } else if (c2 == 1) {
        } else {
            if (c2 == 2) {
                if (spk.a(iro.ORANGE_KEY_HYBRID_CONTAINER, "forceDestroyRebuildInstance", false) && !this.mbPreRender) {
                    destroyWeex2Instance();
                    return;
                }
                destroyWeex2Instance();
                if (Globals.getApplication() != null && spk.a(iro.ORANGE_KEY_HYBRID_CONTAINER, "destroyRebuildByApplicationContext", true)) {
                    this.mManager.a(Globals.getApplication(), c.b);
                    return;
                } else {
                    this.mManager.a(getContext(), c.b);
                    return;
                }
            }
            destroyWeex2Instance();
        }
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment
    public void setWeex2Instance(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5416e622", new Object[]{this, pVar});
            return;
        }
        if (this.mWeex2Instance != null) {
            destroyWeex2Instance();
        }
        this.mWeex2Instance = pVar;
    }

    private boolean reuseTradeHybridContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66ebb280", new Object[]{this})).booleanValue();
        }
        if (getActivity() instanceof UltronTradeHybridActivity) {
            return ((UltronTradeHybridActivity) getActivity()).c();
        }
        return false;
    }

    private void rebindContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("912fb6e2", new Object[]{this, context});
        } else if (this.mWeex2Instance == null) {
            UnifyLog.d("UltronWeex2HighPerformanceDialogFragment.rebindContext", "mWeex2Instance is null");
        } else {
            this.mWeex2Instance.resetContext(context);
        }
    }

    private void sendPreRenderMessageToWeex2V2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bba77783", new Object[]{this});
        } else if (StringUtils.isEmpty(this.mWeex2Url)) {
            String str = this.mWeex2Url;
            dsm.a(false, str, "OnError: mWeex2Url is empty, isFoldDevice: " + this.isFoldDevice);
        } else if (this.mWeex2Instance == null) {
            String str2 = this.mWeex2Url;
            dsm.a(false, str2, "OnError: mWeex2Instance is null, isFoldDevice: " + this.isFoldDevice);
        } else {
            Uri parse = Uri.parse(this.mWeex2Url);
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames == null) {
                String str3 = this.mWeex2Url;
                dsm.a(false, str3, "OnError: queryKeys is null, isFoldDevice: " + this.isFoldDevice);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            for (String str4 : queryParameterNames) {
                if (!StringUtils.isEmpty(str4)) {
                    String queryParameter = parse.getQueryParameter(str4);
                    if (!StringUtils.isEmpty(queryParameter)) {
                        if (StringUtils.equals(str4, "preRequestStorageKey")) {
                            JSONObject a2 = this.mManager.c().a(queryParameter);
                            if (a2 == null) {
                                a2 = new JSONObject();
                            }
                            jSONObject.put(ZimMessageChannel.K_RPC_RES, (Object) a2);
                        } else {
                            jSONObject.put(str4, (Object) queryParameter);
                        }
                    }
                }
            }
            String str5 = this.mWeex2Url;
            dsm.a(true, str5, "OnSuccess!, isFoldDevice: " + this.isFoldDevice);
            jSONObject.put("tradeHybridDeviceLevel", (Object) fkh.a());
            this.mWeex2Instance.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "preload.update", jSONObject);
            jqg.b("UltronTradeHybridDialogFragment.sendPreRenderMessageToWeex2V2", "preRender is TRUE");
        }
    }

    private void loadImmediateCreatedInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("621e8a39", new Object[]{this});
        } else if (StringUtils.isEmpty(this.mWeex2Url)) {
            jqg.a("UltronTradeHybridDialogFragment", "loadImmediateCreatedInstance", "mWeex2Url is empty");
        } else if (this.mWeex2Instance == null) {
            jqg.a("UltronTradeHybridDialogFragment", "loadImmediateCreatedInstance", "mWeex2Instance is null");
        } else {
            if (this.mWeex2Instance.isRenderCalled()) {
                this.mWeex2Instance.refresh(null, null);
            } else {
                this.mWeex2Instance.initWithURL(Uri.parse(this.mWeex2Url));
                this.mWeex2Instance.render(null, null);
            }
            this.mWeex2Instance.registerRenderListener(new g() { // from class: com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridDialogFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.g
                public void onForeground(p pVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6fafc624", new Object[]{this, pVar});
                    } else {
                        jqg.a("UltronTradeHybridDialogFragment", "loadImmediateCreatedInstance", "onForeground");
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onPrepareSuccess(p pVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9635d60b", new Object[]{this, pVar});
                    } else {
                        jqg.a("UltronTradeHybridDialogFragment", "loadImmediateCreatedInstance", "onPrepareSuccess");
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRenderSuccess(p pVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3fdf238", new Object[]{this, pVar});
                    } else {
                        jqg.a("UltronTradeHybridDialogFragment", "loadImmediateCreatedInstance", ljl.RENDER_SUCCESS_TIME);
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRenderFailed(p pVar, int i, String str, boolean z) {
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
                        return;
                    }
                    String[] strArr = new String[2];
                    strArr[0] = "loadImmediateCreatedInstance";
                    if (("onRenderFailed,errorType:" + i + " errorMsg:" + str) == null) {
                        str2 = "";
                    } else {
                        str2 = str + " fatal:" + z;
                    }
                    strArr[1] = str2;
                    jqg.a("UltronTradeHybridDialogFragment", strArr);
                    UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment = UltronTradeHybridDialogFragment.this;
                    adh.a(ultronTradeHybridDialogFragment, UltronTradeHybridDialogFragment.access$000(ultronTradeHybridDialogFragment), "onRenderFailed");
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRefreshSuccess(p pVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
                    } else {
                        jqg.a("UltronTradeHybridDialogFragment", "loadImmediateCreatedInstance", "onRefreshSuccess");
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRefreshFailed(p pVar, int i, String str, boolean z) {
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
                        return;
                    }
                    String[] strArr = new String[2];
                    strArr[0] = "loadImmediateCreatedInstance";
                    if (("onRefreshFailed,errorType:" + i + " errorMsg:" + str) == null) {
                        str2 = "";
                    } else {
                        str2 = str + " fatal:" + z;
                    }
                    strArr[1] = str2;
                    jqg.a("UltronTradeHybridDialogFragment", strArr);
                    UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment = UltronTradeHybridDialogFragment.this;
                    adh.a(ultronTradeHybridDialogFragment, UltronTradeHybridDialogFragment.access$100(ultronTradeHybridDialogFragment), "onRefreshFailed");
                }

                @Override // com.taobao.android.weex_framework.g
                public void onJSException(p pVar, int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
                        return;
                    }
                    String[] strArr = new String[2];
                    strArr[0] = "loadImmediateCreatedInstance";
                    if (("onJSException,errorType:" + i + " errorMsg:" + str) == null) {
                        str = "";
                    }
                    strArr[1] = str;
                    jqg.a("UltronTradeHybridDialogFragment", strArr);
                    UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment = UltronTradeHybridDialogFragment.this;
                    adh.a(ultronTradeHybridDialogFragment, UltronTradeHybridDialogFragment.access$200(ultronTradeHybridDialogFragment), "onJSException");
                }

                @Override // com.taobao.android.weex_framework.g
                public void onFatalException(p pVar, int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
                        return;
                    }
                    String[] strArr = new String[2];
                    strArr[0] = "loadImmediateCreatedInstance";
                    if (("onFatalException,errorType:" + i + " errorMsg:" + str) == null) {
                        str = "";
                    }
                    strArr[1] = str;
                    jqg.a("UltronTradeHybridDialogFragment", strArr);
                    UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment = UltronTradeHybridDialogFragment.this;
                    adh.a(ultronTradeHybridDialogFragment, UltronTradeHybridDialogFragment.access$300(ultronTradeHybridDialogFragment), "onFatalException");
                }

                @Override // com.taobao.android.weex_framework.g
                public void onDestroyed(MUSDKInstance mUSDKInstance) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
                    } else {
                        jqg.a("UltronTradeHybridDialogFragment", "loadImmediateCreatedInstance", "onDestroyed");
                    }
                }
            });
            jqg.a("UltronTradeHybridDialogFragment", "loadImmediateCreatedInstance", "preRender is FALSE");
        }
    }

    /* loaded from: classes2.dex */
    public static class a extends UltronWeex2DialogFragment.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1817817007);
        }

        @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment.a
        public /* synthetic */ UltronWeex2DialogFragment.a a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (UltronWeex2DialogFragment.a) ipChange.ipc$dispatch("91aeec78", new Object[]{this, new Integer(i)}) : d(i);
        }

        @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment.a
        public /* synthetic */ UltronWeex2DialogFragment.a a(p pVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (UltronWeex2DialogFragment.a) ipChange.ipc$dispatch("76f34c2e", new Object[]{this, pVar}) : b(pVar);
        }

        @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment.a
        public /* synthetic */ UltronWeex2DialogFragment.a a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (UltronWeex2DialogFragment.a) ipChange.ipc$dispatch("a28a7ec1", new Object[]{this, str}) : d(str);
        }

        @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment.a
        public /* synthetic */ UltronWeex2DialogFragment.a a(boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (UltronWeex2DialogFragment.a) ipChange.ipc$dispatch("f4fcaec7", new Object[]{this, new Boolean(z)}) : c(z);
        }

        @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment.a
        public /* synthetic */ UltronWeex2DialogFragment a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (UltronWeex2DialogFragment) ipChange.ipc$dispatch("b0b329a8", new Object[]{this}) : b();
        }

        @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment.a
        public /* synthetic */ UltronWeex2DialogFragment.a b(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (UltronWeex2DialogFragment.a) ipChange.ipc$dispatch("74da9fb9", new Object[]{this, new Integer(i)}) : e(i);
        }

        @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment.a
        public /* synthetic */ UltronWeex2DialogFragment.a b(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (UltronWeex2DialogFragment.a) ipChange.ipc$dispatch("4e595a0", new Object[]{this, str}) : e(str);
        }

        @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment.a
        public /* synthetic */ UltronWeex2DialogFragment.a b(boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (UltronWeex2DialogFragment.a) ipChange.ipc$dispatch("d8286208", new Object[]{this, new Boolean(z)}) : d(z);
        }

        @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment.a
        public /* synthetic */ UltronWeex2DialogFragment.a c(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (UltronWeex2DialogFragment.a) ipChange.ipc$dispatch("580652fa", new Object[]{this, new Integer(i)}) : f(i);
        }

        @Override // com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment.a
        public /* synthetic */ UltronWeex2DialogFragment.a c(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (UltronWeex2DialogFragment.a) ipChange.ipc$dispatch("6740ac7f", new Object[]{this, str}) : f(str);
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4683680f", new Object[]{this, str});
            }
            this.f2757a = str;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("93319190", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dfdfbb11", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a b(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e0788e1e", new Object[]{this, pVar});
            }
            this.d = pVar;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("909a4204", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("49270263", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public a d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1dfc8e52", new Object[]{this, new Integer(i)});
            }
            this.g = i;
            return this;
        }

        public a e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d6894eb1", new Object[]{this, new Integer(i)});
            }
            this.h = i;
            return this;
        }

        public a f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8f160f10", new Object[]{this, new Integer(i)});
            }
            this.i = i;
            return this;
        }

        public UltronTradeHybridDialogFragment b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UltronTradeHybridDialogFragment) ipChange.ipc$dispatch("48227360", new Object[]{this});
            }
            UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment = new UltronTradeHybridDialogFragment();
            ultronTradeHybridDialogFragment.setWeex2Instance(this.d);
            Bundle bundle = new Bundle();
            bundle.putString("bizName", this.f2757a);
            bundle.putString(UltronWeex2DialogFragment.CONTAINER_BIZ_NAME, this.b);
            bundle.putString(UltronWeex2DialogFragment.WEEX2_URL, this.c);
            bundle.putBoolean("isPreRender", this.e);
            bundle.putBoolean(UltronWeex2DialogFragment.IS_INSTANCE_REUSE, this.f);
            bundle.putInt(UltronWeex2DialogFragment.CONTAINER_RES_ID, this.g);
            bundle.putInt(UltronWeex2DialogFragment.EXPECT_WIDTH, this.h);
            bundle.putInt(UltronWeex2DialogFragment.EXPECT_HEIGHT, this.i);
            ultronTradeHybridDialogFragment.setArguments(bundle);
            UltronTradeHybridDialogFragment.access$400(ultronTradeHybridDialogFragment);
            return ultronTradeHybridDialogFragment;
        }
    }
}
