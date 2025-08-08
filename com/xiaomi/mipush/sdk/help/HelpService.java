package com.xiaomi.mipush.sdk.help;

import android.app.IntentService;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.xiaomi.mipush.sdk.o;

/* loaded from: classes9.dex */
public class HelpService extends IntentService {
    public HelpService() {
        super("intentService");
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        if (!StringUtils.isEmpty(intent.getStringExtra("awake_info"))) {
            o.a(this, intent, null);
        }
    }
}
