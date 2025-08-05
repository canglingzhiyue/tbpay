package com.alibaba.wireless.aliprivacyext.http.model.request;

import com.alibaba.wireless.aliprivacyext.f;
import java.io.Serializable;

/* loaded from: classes.dex */
public class a implements Serializable {
    public String clientInfo;

    public a() {
        if (com.alibaba.wireless.aliprivacyext.recommendation.c.b() != null) {
            this.clientInfo = f.a(new com.alibaba.wireless.aliprivacyext.track.model.a(com.alibaba.wireless.aliprivacyext.recommendation.c.b()));
        }
    }
}
