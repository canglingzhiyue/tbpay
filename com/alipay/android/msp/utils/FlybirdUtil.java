package com.alipay.android.msp.utils;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.drivers.stores.store.events.AlipayStore;
import com.alipay.android.msp.drivers.stores.store.events.SharePayProxyStore;
import com.alipay.android.msp.drivers.stores.store.events.StandardPayStore;
import com.alipay.android.msp.framework.dns.storage.DnsCache;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.encrypt.EncryptUtil;
import com.alipay.android.msp.framework.encrypt.TriDesCBC;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.network.APNetSwitchUtil;
import com.alipay.mobile.common.logging.LoggerFactoryBinder;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.encrypt.LogEncryptClient;
import com.alipay.mobile.common.transport.AlipayNetStarter;
import com.alipay.mobile.common.transport.httpdns.DnsEnv;
import com.alipay.mobile.monitor.track.spm.SpmMonitorBinder;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class FlybirdUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final LogEncryptClient mLogEncryptClient;
    public static HashMap<String, Class<? extends LocalEventStore>> mapJsPlugin;

    public static void dumpSpiderwebSpiderForCashier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4a926e1", new Object[0]);
        }
    }

    public static void endSpider(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("870abe31", new Object[]{str});
        }
    }

    public static int getSizeGear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2bb7c420", new Object[0])).intValue();
        }
        return 1;
    }

    public static void justEndSpider(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acfc23a5", new Object[]{str});
        }
    }

    public static void logStubFullLinkId(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b4c83", new Object[]{activity, str, str2});
        }
    }

    public static void preloadH5OffScreen(Activity activity, ViewGroup viewGroup, JSONArray jSONArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba07b13e", new Object[]{activity, viewGroup, jSONArray, new Integer(i)});
        }
    }

    public static void showWebView(JSONObject jSONObject, ViewGroup viewGroup, boolean z, Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5189c49", new Object[]{jSONObject, viewGroup, new Boolean(z), activity, new Integer(i)});
        }
    }

    static {
        HashMap<String, Class<? extends LocalEventStore>> hashMap = new HashMap<>();
        mapJsPlugin = hashMap;
        hashMap.put("alipay", AlipayStore.class);
        mapJsPlugin.put(MspEventTypes.ACTION_STRING_SHAREPAYPROXY, SharePayProxyStore.class);
        mapJsPlugin.put(MspEventTypes.ACTION_STRING_STANDARDPAY, StandardPayStore.class);
        mLogEncryptClient = new LogEncryptClient() { // from class: com.alipay.android.msp.utils.FlybirdUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.common.logging.api.encrypt.LogEncryptClient
            public String encrypt(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("9be3a42a", new Object[]{this, str});
                }
                try {
                    return TriDesCBC.encrypt(EncryptUtil.generateLocalStorageDesKey(GlobalHelper.getInstance().getContext()), str);
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                    return "";
                }
            }

            @Override // com.alipay.mobile.common.logging.api.encrypt.LogEncryptClient
            public String decrypt(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("72c54002", new Object[]{this, str});
                }
                try {
                    return TriDesCBC.decrypt(EncryptUtil.generateLocalStorageDesKey(GlobalHelper.getInstance().getContext()), str);
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                    return "";
                }
            }

            @Override // com.alipay.mobile.common.logging.api.encrypt.LogEncryptClient
            public byte[] encrypt(byte[] bArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (byte[]) ipChange.ipc$dispatch("11c8c10a", new Object[]{this, bArr});
                }
                byte[] bArr2 = new byte[0];
                try {
                    return TriDesCBC.encrypt(EncryptUtil.generateLocalStorageDesKey(GlobalHelper.getInstance().getContext()), bArr);
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                    return bArr2;
                }
            }

            @Override // com.alipay.mobile.common.logging.api.encrypt.LogEncryptClient
            public byte[] decrypt(byte[] bArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (byte[]) ipChange.ipc$dispatch("cd4fbce2", new Object[]{this, bArr});
                }
                byte[] bArr2 = new byte[0];
                try {
                    return TriDesCBC.decrypt(EncryptUtil.generateLocalStorageDesKey(GlobalHelper.getInstance().getContext()), bArr);
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                    return bArr2;
                }
            }
        };
    }

    public static boolean isShowResultPage(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("270e148", new Object[]{str})).booleanValue() : StringUtils.equals(str, MspFlybirdDefine.FLYBIRD_PAYEND_TPL) || StringUtils.equals(str, MspFlybirdDefine.FLYBIRD_RESULT_TPL) || StringUtils.equals(str, MspFlybirdDefine.DEFAULT_RESULT_TPL_ID) || StringUtils.equals(str, MspFlybirdDefine.FLYBIRD_UNIFY_RESULT_TPL);
    }

    public static boolean isShowNavBar(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("22b8f56c", new Object[]{str})).booleanValue() : StringUtils.equals(str, MspFlybirdDefine.FLYBIRD_PAYEND_TPL) || StringUtils.equals(str, MspFlybirdDefine.FLYBIRD_RESULT_TPL) || StringUtils.equals(str, MspFlybirdDefine.DEFAULT_RESULT_TPL_ID) || StringUtils.equals(str, "QUICKPAY@cashier-activity-default-flex") || StringUtils.equals(str, MspFlybirdDefine.FLYBIRD_UNIFY_RESULT_TPL) || StringUtils.equals(str, MspFlybirdDefine.FLYBIRD_SETTING_LABORATORY);
    }

    public static boolean isFullScreen(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4fbf2aa", new Object[]{view})).booleanValue();
        }
        Object tag = view.getTag(R.id.tag_view_fullscreen);
        if (!(tag instanceof FBContext)) {
            return false;
        }
        return ((FBContext) tag).isFullscreen();
    }

    public static void registerPublicMspInvokeFamily(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d060f582", new Object[]{new Integer(i)});
            return;
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
        if (mspContextByBizId == null || mspContextByBizId.getStoreCenter() == null) {
            return;
        }
        for (String str : mapJsPlugin.keySet()) {
            InvokeActionPlugin.registerMspLocalJsPlugin(i, str, mapJsPlugin.get(str));
        }
    }

    public static void registerPublicBnInvokeFamily(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("976f8168", new Object[]{new Integer(i)});
            return;
        }
        for (String str : mapJsPlugin.keySet()) {
            InvokeActionPlugin.registerBnJsPlugin(i, str);
        }
    }

    public static void saveTradeNoForDNS(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f4f2859", new Object[]{str});
            return;
        }
        String str2 = null;
        try {
            String[] split = str.split("&");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String[] split2 = split[i].split("=");
                if (split2.length == 2 && split2[0].equalsIgnoreCase("trade_no")) {
                    str2 = split2[1].replace("\"", "");
                    break;
                }
                i++;
            }
            if (StringUtils.isEmpty(str2)) {
                return;
            }
            DnsCache.saveTradeNo(str2);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static boolean isErrorTpl2Native(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("654d236e", new Object[]{context})).booleanValue();
        }
        boolean isGray = context != null ? DrmManager.getInstance(context).isGray(DrmKey.GRAY_ERROR_TPL__NO_INTERCEPT, false, context) : false;
        LogUtil.record(4, "", "MspSwitchUtil::isErrorTplNoIntercept", "isNoIntercept:".concat(String.valueOf(isGray)));
        return !isGray;
    }

    public static boolean handleTBWeb(JSONObject jSONObject, String str, MspContext mspContext, int i, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("97cd5286", new Object[]{jSONObject, str, mspContext, new Integer(i), str2})).booleanValue() : SdkFlavor.handleTaobaoWeb(jSONObject, str, mspContext, i, str2);
    }

    public static void initLoggingSdk(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f56fb776", new Object[]{context});
        } else if (context == null) {
        } else {
            try {
                if (APNetSwitchUtil.shouldIUseAPNetwork(context)) {
                    AlipayNetStarter.getInstance().initNetwork(context);
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            LoggerFactoryBinder.bind(context);
            SpmMonitorBinder.bind(context);
            LoggerFactory.getLogContext().setLogEncryptClient(mLogEncryptClient);
        }
    }

    public static void initHTTPDNS(MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("195f01ee", new Object[]{mspContext});
            return;
        }
        try {
            Context context = mspContext.getContext();
            if (context != null && APNetSwitchUtil.shouldIUseAPNetwork(context) && APNetSwitchUtil.shouldIUseAPHttpDns(context)) {
                DnsEnv.getInstance().setDisableHttpDNS(false);
            } else {
                DnsEnv.getInstance().setDisableHttpDNS(true);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static void notifyClientEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a6f9496", new Object[]{new Integer(i)});
        } else if (i == 1) {
            LoggerFactory.getLogContext().notifyClientEvent(LogContext.CLIENT_ENVENT_GOTOFOREGROUND, null);
        } else if (i != 2) {
        } else {
            LoggerFactory.getLogContext().notifyClientEvent(LogContext.ENVENT_GOTOBACKGROUND, null);
        }
    }
}
