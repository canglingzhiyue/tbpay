package com.alipay.bis.common.service.facade.gw.model.common.BisJson;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BisClientConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String content;
    private String sign = "";

    public String getContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this}) : this.content;
    }

    public void setContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a9c508", new Object[]{this, str});
        } else {
            this.content = str;
        }
    }

    public String getSign() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ee91d6a6", new Object[]{this}) : this.sign;
    }

    public void setSign(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78283e90", new Object[]{this, str});
        } else {
            this.sign = str;
        }
    }
}
