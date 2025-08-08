package com.meizu.cloud.pushsdk.handler.e;

import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.util.b;

/* loaded from: classes4.dex */
public class e extends a<String> {
    public e(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public int a() {
        return 16;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.handler.e.a
    public void a(String str, com.meizu.cloud.pushsdk.notification.c cVar) {
        if (b() != null) {
            b().b(c(), str);
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start RegisterMessageHandler match");
        if (!PushConstants.MZ_PUSH_ON_REGISTER_ACTION.equals(intent.getAction())) {
            return PushConstants.REGISTRATION_CALLBACK_INTENT.equals(intent.getAction()) && !StringUtils.isEmpty(intent.getStringExtra("registration_id"));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.handler.e.a
    /* renamed from: l */
    public String f(Intent intent) {
        String stringExtra = intent.getStringExtra("registration_id");
        b.g(c(), stringExtra, c().getPackageName());
        b.a(c(), 0, c().getPackageName());
        return stringExtra;
    }
}
