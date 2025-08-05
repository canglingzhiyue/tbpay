package com.alibaba.android.aura.service.cache;

import com.alibaba.android.umf.datamodel.UMFBaseIO;
import tb.kge;

/* loaded from: classes2.dex */
public class AURACacheInput extends UMFBaseIO {
    public String cacheKey;
    public Object cacheObject;
    public int operatorType;

    static {
        kge.a(-1126644227);
    }

    public AURACacheInput(int i, String str) {
        this.operatorType = i;
        this.cacheKey = str;
    }

    public AURACacheInput(int i, String str, Object obj) {
        this.operatorType = i;
        this.cacheKey = str;
        this.cacheObject = obj;
    }
}
