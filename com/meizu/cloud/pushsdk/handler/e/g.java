package com.meizu.cloud.pushsdk.handler.e;

import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.util.b;

/* loaded from: classes4.dex */
public class g extends a<Boolean> {
    public g(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public int a() {
        return 32;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.handler.e.a
    public void a(Boolean bool, com.meizu.cloud.pushsdk.notification.c cVar) {
        if (b() != null) {
            b().a(c(), bool.booleanValue());
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start UnRegisterMessageHandler match");
        if (!PushConstants.MZ_PUSH_ON_UNREGISTER_ACTION.equals(intent.getAction())) {
            return PushConstants.REQUEST_UNREGISTER_INTENT.equals(intent.getAction()) && StringUtils.isEmpty(intent.getStringExtra(PushConstants.EXTRA_UNREGISTERED));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.handler.e.a
    /* renamed from: l */
    public Boolean f(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra(PushConstants.EXTRA_APP_IS_UNREGISTER_SUCCESS, false);
        String stringExtra = intent.getStringExtra(PushConstants.EXTRA_REGISTRATION_ERROR);
        String stringExtra2 = intent.getStringExtra(PushConstants.EXTRA_UNREGISTERED);
        DebugLogger.i("AbstractMessageHandler", "processUnRegisterCallback 5.0:" + booleanExtra + " 4.0:" + stringExtra + " 3.0:" + stringExtra2);
        if (StringUtils.isEmpty(stringExtra) || booleanExtra || !StringUtils.isEmpty(stringExtra2)) {
            b.g(c(), "", c().getPackageName());
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
