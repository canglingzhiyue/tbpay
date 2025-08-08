package com.alipay.android.msp.framework.dns.model;

import mtopsdk.common.util.StringUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.dns.DnsValue;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class CashierDns {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mDomain;
    public int mHeadIndex;
    public List<String> mIps;
    public int mTtd;
    public int mTtl;

    public CashierDns(String str) {
        this.mTtd = 0;
        this.mDomain = str;
    }

    public CashierDns(String str, int i) {
        this.mTtd = 0;
        this.mDomain = str;
        this.mTtl = i;
        this.mHeadIndex = 0;
    }

    public boolean isMobilegw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64d49ae7", new Object[]{this})).booleanValue() : StringUtils.equals(this.mDomain, DnsValue.DOMAIN_MOBILE_GW);
    }

    public static boolean isMobilegw(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b77bf1f1", new Object[]{str})).booleanValue() : StringUtils.equals(str, DnsValue.DOMAIN_MOBILE_GW);
    }

    public void addIp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c79ea39", new Object[]{this, str});
            return;
        }
        if (this.mIps == null) {
            this.mIps = new ArrayList();
        }
        this.mIps.add(str);
    }

    public boolean hasIp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de5d496c", new Object[]{this})).booleanValue();
        }
        List<String> list = this.mIps;
        return list != null && list.size() > 0;
    }

    public String getFirstIndexIp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac9d451a", new Object[]{this});
        }
        String str = null;
        if (hasIp()) {
            str = this.mIps.get(0);
        }
        LogUtil.record(2, "", "CashierDns::getFirstIndexIp", "domain:" + this.mDomain + ",first ip:" + str);
        return str;
    }

    public void resetHeadIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9184d4a", new Object[]{this});
        } else {
            this.mHeadIndex = 0;
        }
    }

    public void inscHeadIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5352a24", new Object[]{this});
            return;
        }
        List<String> list = this.mIps;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.mHeadIndex = (this.mHeadIndex + 1) % this.mIps.size();
    }

    public int getTtl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("219ac30", new Object[]{this})).intValue() : this.mTtl;
    }

    public void setTtl(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd4af72", new Object[]{this, new Integer(i)});
        } else {
            this.mTtl = i;
        }
    }

    public void setTtd(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e2dea7a", new Object[]{this, new Integer(i)});
        } else {
            this.mTtd = i;
        }
    }

    public int getTtd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1a8f028", new Object[]{this})).intValue() : this.mTtd;
    }

    public List<String> getIps() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c56a862a", new Object[]{this});
        }
        try {
            if (this.mIps != null && this.mIps.size() > 0) {
                int size = this.mIps.size();
                int i = this.mHeadIndex >= size ? 0 : this.mHeadIndex;
                LogUtil.record(2, "", "CashierDns::getIps", "size=" + size + ", mHeadIndex=" + this.mHeadIndex + ", index=" + i);
                ArrayList arrayList = new ArrayList();
                for (int i2 = i; i2 < this.mIps.size(); i2++) {
                    arrayList.add(this.mIps.get(i2));
                }
                for (int i3 = 0; i3 < i; i3++) {
                    arrayList.add(this.mIps.get(i3));
                }
                return arrayList;
            }
            return null;
        } catch (Throwable th) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.NETWORK, "DnsGetIpsEx", th);
            return null;
        }
    }
}
