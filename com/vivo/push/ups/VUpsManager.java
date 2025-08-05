package com.vivo.push.ups;

import android.content.Context;
import android.os.Bundle;
import com.vivo.push.PushClient;

/* loaded from: classes9.dex */
public class VUpsManager {

    /* loaded from: classes9.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static VUpsManager f24246a = new VUpsManager();
    }

    public static VUpsManager getInstance() {
        return a.f24246a;
    }

    public void onCommandResult(Context context, Bundle bundle) {
    }

    public void registerToken(Context context, String str, String str2, String str3, UPSRegisterCallback uPSRegisterCallback) {
        PushClient.getInstance(context).turnOnPush(new com.vivo.push.ups.a(this, uPSRegisterCallback));
    }

    public void turnOffPush(Context context, UPSTurnCallback uPSTurnCallback) {
        PushClient.getInstance(context).turnOffPush(new d(this, uPSTurnCallback));
    }

    public void turnOnPush(Context context, UPSTurnCallback uPSTurnCallback) {
        PushClient.getInstance(context).turnOnPush(new c(this, uPSTurnCallback));
    }

    public void unRegisterToken(Context context, UPSRegisterCallback uPSRegisterCallback) {
        PushClient.getInstance(context).turnOffPush(new b(this, uPSRegisterCallback));
    }
}
