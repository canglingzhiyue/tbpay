package com.alibaba.security.realidentity;

import android.content.Context;
import com.alibaba.security.common.http.model.HttpRequest;
import com.alibaba.security.common.http.model.HttpResponse;
import com.alibaba.security.realidentity.biz.bucket.BucketParams;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class o1 extends BucketParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public HttpResponse e;
    public HttpRequest f;

    public o1(Context context, RPBizConfig rPBizConfig) {
        super(context, rPBizConfig);
    }

    public abstract o1 a(HttpResponse httpResponse);

    public void a(HttpRequest httpRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54aefc07", new Object[]{this, httpRequest});
        } else {
            this.f = httpRequest;
        }
    }

    public final o1 b(HttpResponse httpResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o1) ipChange.ipc$dispatch("c00072c6", new Object[]{this, httpResponse});
        }
        this.e = httpResponse;
        a(httpResponse);
        return this;
    }

    public HttpRequest d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpRequest) ipChange.ipc$dispatch("21927a2a", new Object[]{this}) : this.f;
    }

    public HttpResponse e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpResponse) ipChange.ipc$dispatch("981fb63d", new Object[]{this}) : this.e;
    }
}
