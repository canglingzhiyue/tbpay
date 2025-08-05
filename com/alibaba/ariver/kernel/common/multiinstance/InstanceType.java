package com.alibaba.ariver.kernel.common.multiinstance;

/* loaded from: classes2.dex */
public enum InstanceType {
    ALIPAY("ap"),
    TAOBAO("tb");
    
    private String value;

    InstanceType(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
