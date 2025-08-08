package com.meizu.cloud.pushsdk.platform.d;

import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.platform.PlatformMessageSender;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public class g extends c<UnRegisterStatus> {
    public g(Context context, com.meizu.cloud.pushsdk.platform.c.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, aVar, scheduledExecutorService);
    }

    public g(Context context, com.meizu.cloud.pushsdk.platform.c.a aVar, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this(context, aVar, scheduledExecutorService);
        this.h = z;
    }

    public g(Context context, String str, String str2, com.meizu.cloud.pushsdk.platform.c.a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.platform.d.c
    /* renamed from: a */
    public void b(UnRegisterStatus unRegisterStatus) {
        PlatformMessageSender.a(this.b, !StringUtils.isEmpty(this.e) ? this.e : this.b.getPackageName(), unRegisterStatus);
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    protected boolean d() {
        return !StringUtils.isEmpty(this.c) && !StringUtils.isEmpty(this.d);
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    protected Intent h() {
        Intent intent = new Intent();
        intent.putExtra("app_id", this.c);
        intent.putExtra(MspGlobalDefine.APP_KEY, this.d);
        intent.putExtra("strategy_package_name", this.b.getPackageName());
        intent.putExtra("strategy_type", j());
        return intent;
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    protected int j() {
        return 32;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.platform.d.c
    /* renamed from: m */
    public UnRegisterStatus a() {
        String str;
        UnRegisterStatus unRegisterStatus = new UnRegisterStatus();
        unRegisterStatus.setCode("20001");
        if (!StringUtils.isEmpty(this.c)) {
            if (StringUtils.isEmpty(this.d)) {
                str = "appKey not empty";
            }
            return unRegisterStatus;
        }
        str = "appId not empty";
        unRegisterStatus.setMessage(str);
        return unRegisterStatus;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.platform.d.c
    /* renamed from: n */
    public UnRegisterStatus c() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.platform.d.c
    /* renamed from: o */
    public UnRegisterStatus e() {
        UnRegisterStatus unRegisterStatus = new UnRegisterStatus();
        if (StringUtils.isEmpty(com.meizu.cloud.pushsdk.util.b.h(this.b, this.e))) {
            unRegisterStatus.setCode("200");
            unRegisterStatus.setMessage("already unRegister PushId,don't unRegister frequently");
            unRegisterStatus.setIsUnRegisterSuccess(true);
            return unRegisterStatus;
        }
        String b = com.meizu.cloud.pushsdk.d.c.b(this.b);
        String a2 = com.meizu.cloud.pushsdk.d.c.a(this.b);
        if (StringUtils.isEmpty(b) && StringUtils.isEmpty(a2)) {
            unRegisterStatus.setCode("20000");
            unRegisterStatus.setMessage("deviceId is empty");
            return unRegisterStatus;
        }
        com.meizu.cloud.pushsdk.e.b.c d = this.f.d(this.c, this.d, a2, b);
        if (d.c()) {
            UnRegisterStatus unRegisterStatus2 = new UnRegisterStatus((String) d.b());
            DebugLogger.e("Strategy", "network unRegisterStatus " + unRegisterStatus2);
            if ("200".equals(unRegisterStatus2.getCode())) {
                com.meizu.cloud.pushsdk.util.b.g(this.b, "", this.e);
            }
            return unRegisterStatus2;
        }
        com.meizu.cloud.pushsdk.e.c.a a3 = d.a();
        if (a3.c() != null) {
            DebugLogger.e("Strategy", "status code=" + a3.b() + " data=" + a3.c());
        }
        unRegisterStatus.setCode(String.valueOf(a3.b()));
        unRegisterStatus.setMessage(a3.a());
        DebugLogger.e("Strategy", "unRegisterStatus " + unRegisterStatus);
        return unRegisterStatus;
    }
}
