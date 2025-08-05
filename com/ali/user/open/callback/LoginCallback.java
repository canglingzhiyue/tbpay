package com.ali.user.open.callback;

import com.ali.user.open.core.callback.FailureCallback;
import com.ali.user.open.session.Session;

/* loaded from: classes2.dex */
public interface LoginCallback extends FailureCallback {
    void onSuccess(Session session);
}
