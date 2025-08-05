package com.alipay.bifrost;

import com.alipay.mars.stn.StnLogic;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;

/* loaded from: classes3.dex */
public class StnLogicICallBackImpl implements StnLogic.ICallBack {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static StnLogicICallBackImpl f5244a;
    private static HttpDnsCallback b;

    /* loaded from: classes3.dex */
    public interface HttpDnsCallback {
        String httpDns(String str);
    }

    @Override // com.alipay.mars.stn.StnLogic.ICallBack
    public int buf2Resp(int i, Object obj, byte[] bArr, byte[] bArr2, int[] iArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1e88c31", new Object[]{this, new Integer(i), obj, bArr, bArr2, iArr, new Integer(i2)})).intValue();
        }
        return 0;
    }

    @Override // com.alipay.mars.stn.StnLogic.ICallBack
    public int getLongLinkIdentifyCheckBuffer(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37df3d38", new Object[]{this, byteArrayOutputStream, byteArrayOutputStream2, iArr})).intValue();
        }
        return 0;
    }

    @Override // com.alipay.mars.stn.StnLogic.ICallBack
    public boolean isLogoned() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8750d003", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.mars.stn.StnLogic.ICallBack
    public boolean makesureAuthed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad49c8b5", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.mars.stn.StnLogic.ICallBack
    public boolean onLongLinkIdentifyResp(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71a2e10a", new Object[]{this, bArr, bArr2})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.mars.stn.StnLogic.ICallBack
    public void onPush(long j, int i, int i2, byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96960a52", new Object[]{this, new Long(j), new Integer(i), new Integer(i2), bArr, bArr2});
        }
    }

    @Override // com.alipay.mars.stn.StnLogic.ICallBack
    public int onTaskEnd(int i, Object obj, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77bec34", new Object[]{this, new Integer(i), obj, new Integer(i2), new Integer(i3)})).intValue();
        }
        return 0;
    }

    @Override // com.alipay.mars.stn.StnLogic.ICallBack
    public void reportConnectInfo(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8f1bb0b", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.alipay.mars.stn.StnLogic.ICallBack
    public void reportTaskProfile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b445521", new Object[]{this, str});
        }
    }

    @Override // com.alipay.mars.stn.StnLogic.ICallBack
    public boolean req2Buf(int i, Object obj, ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2, int[] iArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0fcff60", new Object[]{this, new Integer(i), obj, byteArrayOutputStream, byteArrayOutputStream2, iArr, new Integer(i2)})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.mars.stn.StnLogic.ICallBack
    public void requestDoSync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c7b73c", new Object[]{this});
        }
    }

    @Override // com.alipay.mars.stn.StnLogic.ICallBack
    public void trafficData(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7b4d2e", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    public static StnLogicICallBackImpl getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StnLogicICallBackImpl) ipChange.ipc$dispatch("b1bfc83f", new Object[0]);
        }
        StnLogicICallBackImpl stnLogicICallBackImpl = f5244a;
        if (stnLogicICallBackImpl != null) {
            return stnLogicICallBackImpl;
        }
        synchronized (StnLogicICallBackImpl.class) {
            if (f5244a != null) {
                return f5244a;
            }
            f5244a = new StnLogicICallBackImpl();
            return f5244a;
        }
    }

    public static void setHttpDnsCallback(HttpDnsCallback httpDnsCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec89a084", new Object[]{httpDnsCallback});
        } else {
            b = httpDnsCallback;
        }
    }

    @Override // com.alipay.mars.stn.StnLogic.ICallBack
    public String[] onNewDns(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("4c3afa48", new Object[]{this, str});
        }
        HttpDnsCallback httpDnsCallback = b;
        if (httpDnsCallback == null) {
            return null;
        }
        try {
            String httpDns = httpDnsCallback.httpDns(str);
            if (httpDns != null && !httpDns.isEmpty() && (split = httpDns.split(",")) != null && split.length != 0) {
                for (int i = 0; i < split.length; i++) {
                    if (split[i] != null) {
                        split[i] = split[i].trim();
                        if (split[i].isEmpty()) {
                            split[i] = null;
                        }
                    }
                }
                return split;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // com.alipay.mars.stn.StnLogic.ICallBack
    public String[] requestNetCheckShortLinkHosts() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("7ae5e5", new Object[]{this}) : new String[0];
    }
}
