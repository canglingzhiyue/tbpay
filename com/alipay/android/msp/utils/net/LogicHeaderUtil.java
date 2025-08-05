package com.alipay.android.msp.utils.net;

import android.os.Build;
import anet.channel.util.HttpConstant;
import com.ali.user.mobile.rpc.safe.AES;
import com.alipay.android.msp.constants.MspNetConstants;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.network.DispatchType;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.Utils;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.upload.domain.UploadConstants;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

/* loaded from: classes3.dex */
public class LogicHeaderUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static List<Header> generateSecurityHeaders(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("59d5eab5", new Object[]{str, new Boolean(z)});
        }
        ArrayList arrayList = new ArrayList(generateDefaultHeaders());
        arrayList.add(new BasicHeader("des-mode", AES.BLOCK_MODE));
        arrayList.add(new BasicHeader(HeaderConstant.HEADER_KEY_OPERATION_TYPE, DispatchType.BYTES_SECURITY));
        arrayList.add(new BasicHeader("content-type", UploadConstants.FILE_CONTENT_TYPE));
        arrayList.add(new BasicHeader(HeaderConstant.HEADER_KEY_VERSION, "2.0"));
        arrayList.add(new BasicHeader(HeaderConstant.HEADER_KEY_APPID, aw.BIZCODE_TAOBAO));
        arrayList.add(new BasicHeader("msp-gzip", String.valueOf(z)));
        arrayList.add(new BasicHeader(MspNetConstants.Request.MSP_PARAM, str));
        return arrayList;
    }

    public static List<Header> generateBytesHeaders(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f824fc34", new Object[]{str, new Boolean(z)});
        }
        ArrayList arrayList = new ArrayList(generateDefaultHeaders());
        arrayList.add(new BasicHeader("des-mode", AES.BLOCK_MODE));
        arrayList.add(new BasicHeader(HeaderConstant.HEADER_KEY_OPERATION_TYPE, DispatchType.BYTES_CASHIER));
        arrayList.add(new BasicHeader("content-type", UploadConstants.FILE_CONTENT_TYPE));
        arrayList.add(new BasicHeader(HeaderConstant.HEADER_KEY_VERSION, "2.0"));
        arrayList.add(new BasicHeader(HeaderConstant.HEADER_KEY_APPID, aw.BIZCODE_TAOBAO));
        arrayList.add(new BasicHeader("msp-gzip", String.valueOf(z)));
        arrayList.add(new BasicHeader(MspNetConstants.Request.MSP_PARAM, str));
        return arrayList;
    }

    public static List<Header> generateRequestHeaders(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2115fc4a", new Object[]{str});
        }
        ArrayList arrayList = new ArrayList(generateDefaultHeaders());
        arrayList.add(new BasicHeader(MspNetConstants.Request.MSP_PARAM, str));
        return arrayList;
    }

    public static List<Header> generatePbv3Headers(Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c5a0b1ef", new Object[]{map, new Boolean(z)});
        }
        ArrayList arrayList = new ArrayList(generateDefaultHeaders());
        arrayList.add(new BasicHeader(MspNetConstants.Request.MSP_PARAM, map.get("mspParam")));
        arrayList.add(new BasicHeader("mqp-apiver", map.get("mqp_apiver")));
        arrayList.add(new BasicHeader("mqp-bp", map.get("mqp_bp")));
        arrayList.add(new BasicHeader("mqp-tid", map.get("mqp_tid")));
        arrayList.add(new BasicHeader("mqp-uac", map.get("mqp_uac")));
        arrayList.add(new BasicHeader("mqp-ua", map.get("mqp_ua")));
        arrayList.add(new BasicHeader("mqp-pa", map.get("mqp_pa")));
        arrayList.add(new BasicHeader(HeaderConstant.HEADER_KEY_OPERATION_TYPE, DispatchType.PB_V3_SDK));
        arrayList.add(new BasicHeader("content-type", HeaderConstant.HEADER_VALUE_PB_TYPE));
        arrayList.add(new BasicHeader(HeaderConstant.HEADER_KEY_APPID, aw.BIZCODE_TAOBAO));
        arrayList.add(new BasicHeader(HeaderConstant.HEADER_KEY_ACCEPT_LANGUAGE, Utils.getLocaleDesByFlag(PhoneCashierMspEngine.getMspBase().getMspLocale(PhoneCashierMspEngine.getMspWallet().getAlipayLocaleDes()))));
        if (z) {
            arrayList.add(new BasicHeader(HttpConstant.CONTENT_ENCODING, "gzip"));
        }
        return arrayList;
    }

    public static List<Header> generateDefaultHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb8115c6", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicHeader("Accept-Charset", "UTF-8"));
        arrayList.add(new BasicHeader("Connection", "Keep-Alive"));
        arrayList.add(new BasicHeader("Keep-Alive", "timeout=180, max=100"));
        if (MspConfig.getInstance().isDebug()) {
            arrayList.add(new BasicHeader("debug-header", (((((Build.MODEL.replace(";", " ") + ";") + Utils.getScreenResolution(GlobalHelper.getInstance().getContext())) + ";") + GlobalSdkConstant.getMspVersion()) + ";") + "6"));
            arrayList.add(new BasicHeader("OS", "Android"));
        }
        return arrayList;
    }
}
