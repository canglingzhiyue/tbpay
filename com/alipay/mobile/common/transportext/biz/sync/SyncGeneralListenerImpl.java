package com.alipay.mobile.common.transportext.biz.sync;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.amnet.api.AmnetListenerAdpter;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.alipay.mobile.common.transportext.biz.util.LogUtilAmnet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class SyncGeneralListenerImpl extends AmnetListenerAdpter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile SyncGeneralListenerImpl f5702a;

    private SyncGeneralListenerImpl() {
    }

    public static synchronized SyncGeneralListenerImpl getInstance() {
        synchronized (SyncGeneralListenerImpl.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SyncGeneralListenerImpl) ipChange.ipc$dispatch("17f66d21", new Object[0]);
            }
            LogUtilAmnet.d("amnet_SyncGeneralListenerImpl", "SyncGeneralListenerImpl: getInstance ");
            if (f5702a == null) {
                f5702a = new SyncGeneralListenerImpl();
            }
            return f5702a;
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void change(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a8d39ac", new Object[]{this, new Integer(i)});
            return;
        }
        LogUtilAmnet.d("amnet_SyncGeneralListenerImpl", "change: [ state=" + i + " ]");
        SyncManager.change(i);
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void panic(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f5029cf", new Object[]{this, new Integer(i), str});
            return;
        }
        LogUtilAmnet.d("amnet_SyncGeneralListenerImpl", "panic: ");
        SyncManager.panic(i, str);
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public Map<Byte, Map<String, String>> collect(Map<Byte, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ad8d49e9", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        SyncManager.collectSyncChannel(hashMap);
        map.put((byte) 2, hashMap);
        HashMap hashMap2 = new HashMap();
        SyncManager.collectCommonChannel(hashMap2);
        Map<String, String> map2 = map.get((byte) 0);
        if (map2 == null) {
            map.put((byte) 0, hashMap2);
        } else {
            map2.putAll(hashMap2);
        }
        LogUtilAmnet.d("amnet_SyncGeneralListenerImpl", "collect [ " + JSON.toJSONString(map) + " ]");
        return map;
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void report(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b818819", new Object[]{this, str, new Double(d)});
            return;
        }
        LogUtilAmnet.d("amnet_SyncGeneralListenerImpl", "report: ");
        SyncManager.report(str, d);
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void notifyInitOk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("febd35bc", new Object[]{this});
            return;
        }
        LogUtilAmnet.d("amnet_SyncGeneralListenerImpl", "notifyInitOk: ");
        SyncManager.notifyInitOk();
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void notifyGift(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ee1d34", new Object[]{this, str, str2});
            return;
        }
        LogCatUtil.debug("amnet_SyncGeneralListenerImpl", "notifyGift,key:" + str + ",val:" + str2);
        if (!TextUtils.equals(str, Baggage.Linkage.GIFT_SHORTCUT)) {
            return;
        }
        if (TextUtils.equals(str2, "start")) {
            SyncManager.notifyShortLinkStart();
        } else if (!TextUtils.equals(str2, "stop")) {
        } else {
            SyncManager.notifyShortLinkStop();
        }
    }
}
