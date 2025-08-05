package com.taobao.weex.performance;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.common.WXJSExceptionInfo;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.utils.WXUtils;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes9.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INTERACTION_TAG = "wxInteractionAnalyzer";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f23516a;
    private static boolean b;

    static {
        kge.a(2108174838);
        f23516a = false;
    }

    public static void a(String str, String str2, String str3, Object obj) {
        WXSDKInstance wXSDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1617aa2", new Object[]{str, str2, str3, obj});
        } else if (!f23516a) {
        } else {
            if (b && "stage".equals(str2)) {
                String str4 = "[client][stage]" + str + "," + str3 + "," + obj;
            }
            List<b> wXAnalyzerList = WXSDKManager.getInstance().getWXAnalyzerList();
            if (wXAnalyzerList == null || wXAnalyzerList.size() == 0 || (wXSDKInstance = WXSDKManager.getInstance().getAllInstanceMap().get(str)) == null) {
                return;
            }
            try {
                new JSONObject().put(str3, obj).toString();
                Iterator<b> it = wXAnalyzerList.iterator();
                while (it.hasNext()) {
                    it.next();
                    wXSDKInstance.N();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void a(WXComponent wXComponent) {
        List<b> wXAnalyzerList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("972b2f4d", new Object[]{wXComponent});
        } else if (!f23516a || (wXAnalyzerList = WXSDKManager.getInstance().getWXAnalyzerList()) == null || wXAnalyzerList.size() == 0) {
        } else {
            try {
                new JSONObject().put("renderOriginDiffTime", WXUtils.getFixUnixTime() - wXComponent.getInstance().aq().renderUnixTimeOrigin).put("type", wXComponent.getComponentType()).put("ref", wXComponent.getRef()).put("style", wXComponent.getStyles()).put("attrs", wXComponent.getAttrs()).toString();
                Iterator<b> it = wXAnalyzerList.iterator();
                while (it.hasNext()) {
                    it.next();
                    wXComponent.getInstanceId();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void a(WXJSExceptionInfo wXJSExceptionInfo, String str) {
        List<b> wXAnalyzerList;
        WXSDKInstance sDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6c22cf7", new Object[]{wXJSExceptionInfo, str});
        } else if (!WXEnvironment.isApkDebugable() || (wXAnalyzerList = WXSDKManager.getInstance().getWXAnalyzerList()) == null || wXAnalyzerList.size() == 0 || (sDKInstance = WXSDKManager.getInstance().getSDKInstance(str)) == null) {
        } else {
            WXErrorCode errCode = wXJSExceptionInfo.getErrCode();
            try {
                new JSONObject().put("instanceId", str).put("url", sDKInstance.ak()).put("errorCode", errCode.getErrorCode()).put("errorMsg", errCode.getErrorMsg()).put("errorGroup", errCode.getErrorGroup()).toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
            Iterator<b> it = wXAnalyzerList.iterator();
            while (it.hasNext()) {
                it.next();
                errCode.getErrorType().toString();
            }
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b;
    }
}
