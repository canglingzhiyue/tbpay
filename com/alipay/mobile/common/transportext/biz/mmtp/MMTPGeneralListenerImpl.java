package com.alipay.mobile.common.transportext.biz.mmtp;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.amnet.api.AmnetListenerAdpter;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.lbs.LbsInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.security.SecurityUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transportext.biz.appevent.AmnetUserInfo;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportEnv;
import com.alipay.mobile.common.transportext.biz.util.LogUtilAmnet;
import com.alipay.mobile.common.transportext.biz.util.LoginHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class MMTPGeneralListenerImpl extends AmnetListenerAdpter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile MMTPGeneralListenerImpl f5674a;

    public static /* synthetic */ Object ipc$super(MMTPGeneralListenerImpl mMTPGeneralListenerImpl, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private MMTPGeneralListenerImpl() {
    }

    public static synchronized MMTPGeneralListenerImpl getInstance() {
        synchronized (MMTPGeneralListenerImpl.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MMTPGeneralListenerImpl) ipChange.ipc$dispatch("4bb79a1", new Object[0]);
            }
            if (f5674a == null) {
                f5674a = new MMTPGeneralListenerImpl();
            }
            return f5674a;
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public Map<Byte, Map<String, String>> collect(Map<Byte, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ad8d49e9", new Object[]{this, map});
        }
        LogUtilAmnet.d("amnet_MmtpGeneralListenerImpl", "collect MmtpGeneralListenerImpl ");
        HashMap hashMap = new HashMap();
        hashMap.put(LoggingSPCache.STORAGE_LANGUAGE, DeviceInfoUtil.getAlipayLocaleDes());
        hashMap.put("awid", AppInfoUtil.getAwid());
        hashMap.put("latitude", String.valueOf(LbsInfoUtil.getLatitude()));
        hashMap.put("longitude", String.valueOf(LbsInfoUtil.getLongitude()));
        hashMap.put("locTime", String.valueOf(LbsInfoUtil.getLocationtime()));
        String apDid = SecurityUtil.getApDid();
        if (!TextUtils.isEmpty(apDid)) {
            hashMap.put("apdid", apDid);
        }
        String a2 = a();
        if (!TextUtils.isEmpty(a2)) {
            hashMap.put("sourceId", a2);
        }
        Map<String, String> map2 = map.get((byte) 0);
        if (map2 == null) {
            map.put((byte) 0, hashMap);
        } else {
            map2.putAll(hashMap);
        }
        if (MiscUtils.isDebugger(ExtTransportEnv.getAppContext())) {
            try {
                LogUtilAmnet.d("amnet_MmtpGeneralListenerImpl", "collect [ MmtpGeneralListenerImpl ] " + JSON.toJSONString(map));
            } catch (Throwable th) {
                LogCatUtil.warn("amnet_MmtpGeneralListenerImpl", "collect print exception. " + th.toString());
            }
        }
        return map;
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void notifyInitOk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("febd35bc", new Object[]{this});
        } else {
            LinkStateListener.getInstance().notifyInitOk();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void change(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a8d39ac", new Object[]{this, new Integer(i)});
        } else {
            LinkStateListener.getInstance().change(i);
        }
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        try {
            return AppInfoUtil.getLastTagId();
        } catch (Throwable th) {
            LogCatUtil.warn("amnet_MmtpGeneralListenerImpl", "getSourceId has occurr " + th.toString());
            return "";
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void listenSessionInvalid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c7df4af", new Object[]{this});
        } else {
            LoginHelper.tryLogin();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void notifyResendSessionid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c8d3b4", new Object[]{this});
        } else {
            AmnetUserInfo.resendSessionid();
        }
    }
}
