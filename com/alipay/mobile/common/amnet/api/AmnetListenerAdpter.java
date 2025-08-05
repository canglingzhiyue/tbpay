package com.alipay.mobile.common.amnet.api;

import com.alipay.mobile.common.amnet.api.model.AcceptedData;
import com.alipay.mobile.common.amnet.api.model.DnsInfo;
import com.alipay.mobile.common.transportext.amnet.Initialization;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class AmnetListenerAdpter implements AcceptDataListener, AmnetGeneralListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void change(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a8d39ac", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public Map<Byte, Map<String, String>> collect(Map<Byte, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ad8d49e9", new Object[]{this, map}) : map;
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public Map<Byte, byte[]> collectV2(Map<Byte, byte[]> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b287554d", new Object[]{this, map});
        }
        return null;
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void listenSessionInvalid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c7df4af", new Object[]{this});
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void notifyGift(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ee1d34", new Object[]{this, str, str2});
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void notifyInitOk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("febd35bc", new Object[]{this});
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void notifyInitResponse(Initialization.RspInit rspInit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b845a7ee", new Object[]{this, rspInit});
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void notifyReconnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11421395", new Object[]{this});
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void notifyResendSessionid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c8d3b4", new Object[]{this});
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void notifyUpdateConfigInfo(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f58ebc", new Object[]{this, map});
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void notifyUpdateDnsInfo(List<DnsInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf63929d", new Object[]{this, list});
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AcceptDataListener
    public void onAcceptedDataEvent(AcceptedData acceptedData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e4098", new Object[]{this, acceptedData});
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void onFinalErrorEvent(long j, int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a4b5ec", new Object[]{this, new Long(j), new Integer(i), str, map});
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void panic(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f5029cf", new Object[]{this, new Integer(i), str});
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AcceptDataListener
    public void recycle(byte b, Map<String, String> map, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67573cea", new Object[]{this, new Byte(b), map, bArr});
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void report(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b818819", new Object[]{this, str, new Double(d)});
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void restrict(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d5cfbea", new Object[]{this, new Integer(i), str});
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AcceptDataListener
    public void tell(byte b, long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d83fa0", new Object[]{this, new Byte(b), new Long(j), new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void touch(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f93e466e", new Object[]{this, str, str2, str3, str4});
        }
    }
}
