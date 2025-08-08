package com.meizu.cloud.pushsdk.handler.e.i;

import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.e.j.g;
import com.meizu.cloud.pushsdk.notification.c;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import com.meizu.cloud.pushsdk.util.d;
import java.io.File;

/* loaded from: classes4.dex */
public class a extends com.meizu.cloud.pushsdk.handler.e.a<g> {
    public a(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public int a() {
        return 65536;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.handler.e.a
    /* renamed from: a */
    public void d(g gVar) {
        d.g(c(), c().getPackageName(), gVar.a().b().a(), gVar.a().b().d(), gVar.a().b().c(), gVar.a().b().e());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.handler.e.a
    public void a(g gVar, c cVar) {
        String message;
        File file;
        DebugLogger.flush();
        String d = gVar.a().b().d();
        String a2 = gVar.a().b().a();
        String b = com.meizu.cloud.pushsdk.d.c.b(c());
        String documentsPath = MzSystemUtils.getDocumentsPath(c());
        String str = documentsPath + "/pushSdktmp/" + d + "_" + a2 + ".zip";
        try {
            new b(str).a(documentsPath, gVar.b());
            file = new File(str);
            message = null;
        } catch (Exception e) {
            message = e.getMessage();
            DebugLogger.e("AbstractMessageHandler", "zip error message " + message);
            file = null;
        }
        if (file != null && file.length() / 1024 > gVar.c()) {
            message = "the upload file exceeds the max size";
        } else if (gVar.d() && !com.meizu.cloud.pushsdk.util.a.b(c())) {
            message = "current network not allowed upload log file";
        }
        com.meizu.cloud.pushsdk.e.b.c<String> a3 = com.meizu.cloud.pushsdk.platform.c.b.a(c()).a(gVar.a().b().d(), a2, b, message, file);
        if (a3 != null && a3.c()) {
            if (file != null) {
                file.delete();
            }
            DebugLogger.e("AbstractMessageHandler", "upload success " + a3.b());
        } else if (a3 == null) {
            DebugLogger.i("AbstractMessageHandler", "upload error");
        } else {
            DebugLogger.i("AbstractMessageHandler", "upload error code " + a3.a() + a3.b());
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public boolean a(Intent intent) {
        int i;
        DebugLogger.i("AbstractMessageHandler", "start LogUploadMessageHandler match");
        String stringExtra = intent.getStringExtra(PushConstants.MZ_PUSH_CONTROL_MESSAGE);
        if (!StringUtils.isEmpty(stringExtra)) {
            com.meizu.cloud.pushsdk.handler.e.j.b a2 = com.meizu.cloud.pushsdk.handler.e.j.b.a(stringExtra);
            if (a2.a() != null) {
                i = a2.a().a();
                return !PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && "2".equals(String.valueOf(i));
            }
        }
        i = 0;
        if (!PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction())) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.handler.e.a
    /* renamed from: l */
    public g f(Intent intent) {
        String stringExtra = intent.getStringExtra(PushConstants.MZ_PUSH_CONTROL_MESSAGE);
        String stringExtra2 = intent.getStringExtra(PushConstants.EXTRA_APP_PUSH_SEQ_ID);
        return new g(intent.getStringExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE), stringExtra, intent.getStringExtra(PushConstants.MZ_PUSH_MESSAGE_STATISTICS_IMEI_KEY), stringExtra2);
    }
}
