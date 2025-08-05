package com.hihonor.push.sdk;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes4.dex */
public class af implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ah f7264a;

    public af(ah ahVar) {
        this.f7264a = ahVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message == null || message.what != 1001) {
            return false;
        }
        this.f7264a.a(8002003);
        return true;
    }
}
