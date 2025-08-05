package com.ap.zlz.toyger.zdoc;

import com.alibaba.fastjson.JSON;
import com.alipay.zoloz.toyger.algorithm.ToygerBlobConfig;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class ToygerDocBlobConfig extends ToygerBlobConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String docType;
    public int pageNo;
    public float ratio;
    public d ss;
    public String subType;

    static {
        kge.a(1341719664);
    }

    public ToygerDocBlobConfig() {
    }

    @Override // com.alipay.zoloz.toyger.algorithm.ToygerBlobConfig
    public float getCompressRate(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c747a874", new Object[]{this, new Integer(i)})).floatValue() : this.ratio;
    }

    public ToygerDocBlobConfig(float f, String str) {
        this.ratio = f;
        this.pubkey = str;
    }

    @Override // com.alipay.zoloz.toyger.algorithm.ToygerBlobConfig
    public Integer getDesiredWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("cbf35430", new Object[]{this});
        }
        return 1080;
    }

    public static ToygerDocBlobConfig from(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ToygerDocBlobConfig) ipChange.ipc$dispatch("7fd3b30", new Object[]{str, str2});
        }
        ToygerDocBlobConfig toygerDocBlobConfig = (ToygerDocBlobConfig) JSON.parseObject(str, ToygerDocBlobConfig.class);
        toygerDocBlobConfig.pubkey = str2;
        return toygerDocBlobConfig;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ToygerDocBlobConfig{ratio=" + this.ratio + '}';
    }
}
