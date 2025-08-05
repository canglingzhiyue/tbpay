package com.alipay.android.msp.pay;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class CashierSceneDictionary {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile CashierSceneDictionary sceneHandler;
    private Map<String, Integer> mCertPaySessionMap = new HashMap();
    private Map<Integer, MspSchemePayContext> mMspSchemePayMap = new ConcurrentHashMap();

    /* loaded from: classes3.dex */
    public static class MspSchemePayContext {
        public int mBizId;
        public long tradeInitTime = -1;
        public boolean isExitByPay = false;
        public int sourcePid = 0;
    }

    private CashierSceneDictionary() {
    }

    public static CashierSceneDictionary getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CashierSceneDictionary) ipChange.ipc$dispatch("7727e881", new Object[0]);
        }
        if (sceneHandler == null) {
            synchronized (CashierSceneDictionary.class) {
                if (sceneHandler == null) {
                    sceneHandler = new CashierSceneDictionary();
                }
            }
        }
        return sceneHandler;
    }

    public void setMspSchemePayContext(String str, MspSchemePayContext mspSchemePayContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("242b9ba8", new Object[]{this, str, mspSchemePayContext});
        } else if (str == null) {
        } else {
            this.mMspSchemePayMap.put(Integer.valueOf(str.hashCode()), mspSchemePayContext);
        }
    }

    public MspSchemePayContext getMspSchemePayContext(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspSchemePayContext) ipChange.ipc$dispatch("deb018e", new Object[]{this, str});
        }
        if (str != null) {
            return this.mMspSchemePayMap.get(Integer.valueOf(str.hashCode()));
        }
        return null;
    }

    public void clearMspSchemePayContext(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419ef95a", new Object[]{this, str});
        } else if (str == null) {
        } else {
            this.mMspSchemePayMap.remove(Integer.valueOf(str.hashCode()));
        }
    }

    public void saveCertPaySession(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf4d8c3", new Object[]{this, str, new Integer(i)});
        } else {
            this.mCertPaySessionMap.put(str, Integer.valueOf(i));
        }
    }

    public int getCertPayBizId(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ad58d04", new Object[]{this, str})).intValue() : this.mCertPaySessionMap.get(str).intValue();
    }
}
