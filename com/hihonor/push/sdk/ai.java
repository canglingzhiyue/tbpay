package com.hihonor.push.sdk;

import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.framework.aidl.entity.RequestHeader;
import com.hihonor.push.sdk.common.data.ApiException;

/* loaded from: classes4.dex */
public abstract class ai<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final String f7266a = getClass().getSimpleName();
    public final String b;
    public final IMessageEntity c;
    public final q d;
    public RequestHeader e;
    public aq<TResult> f;

    public ai(String str, IMessageEntity iMessageEntity) {
        this.b = str;
        this.c = iMessageEntity;
        this.d = q.a(str);
    }

    public abstract void a(ApiException apiException, Object obj);

    public final void b(ApiException apiException, Object obj) {
        if (this.f != null) {
            a(apiException, obj);
            return;
        }
        String str = "This Task has been canceled, uri:" + this.b;
    }
}
