package com.meizu.cloud.pushsdk.platform.d;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.PlatformMessageSender;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public class f extends c<PushSwitchStatus> {
    private String j;
    private int k;
    private boolean l;
    private final Map<String, Boolean> m;

    public f(Context context, com.meizu.cloud.pushsdk.platform.c.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, null, aVar, scheduledExecutorService);
    }

    public f(Context context, com.meizu.cloud.pushsdk.platform.c.a aVar, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this(context, aVar, scheduledExecutorService);
        this.h = z;
    }

    public f(Context context, String str, String str2, com.meizu.cloud.pushsdk.platform.c.a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
        this.k = 0;
        this.m = new HashMap();
    }

    public f(Context context, String str, String str2, String str3, com.meizu.cloud.pushsdk.platform.c.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, str, str2, aVar, scheduledExecutorService);
        this.j = str3;
    }

    private com.meizu.cloud.pushsdk.e.b.c<String> a(PushSwitchStatus pushSwitchStatus) {
        boolean z;
        boolean u;
        boolean s;
        int i = this.k;
        if (i != 0) {
            if (i == 1) {
                pushSwitchStatus.setMessage("SWITCH_THROUGH_MESSAGE");
                if (u() != this.l || p()) {
                    b(true);
                    f(this.l);
                    return this.f.a(this.c, this.d, this.j, this.k, this.l);
                }
                s = s();
            } else if (i != 2) {
                if (i == 3) {
                    pushSwitchStatus.setMessage("SWITCH_ALL");
                    if (s() != this.l || u() != this.l || p()) {
                        b(true);
                        d(this.l);
                        return this.f.a(this.c, this.d, this.j, this.l);
                    }
                    s = this.l;
                }
                return null;
            } else {
                pushSwitchStatus.setMessage("CHECK_PUSH");
                if (!n() || !o() || p()) {
                    b(true);
                    return this.f.a(this.c, this.d, this.j);
                }
                z = s();
                pushSwitchStatus.setSwitchNotificationMessage(z);
                u = u();
            }
            pushSwitchStatus.setSwitchNotificationMessage(s);
            u = this.l;
        } else {
            pushSwitchStatus.setMessage("SWITCH_NOTIFICATION");
            if (s() != this.l || p()) {
                b(true);
                e(this.l);
                return this.f.a(this.c, this.d, this.j, this.k, this.l);
            }
            z = this.l;
            pushSwitchStatus.setSwitchNotificationMessage(z);
            u = u();
        }
        pushSwitchStatus.setSwitchThroughMessage(u);
        return null;
    }

    private void b(boolean z) {
        Map<String, Boolean> map = this.m;
        map.put(this.e + "_" + this.k, Boolean.valueOf(z));
    }

    private void d(boolean z) {
        com.meizu.cloud.pushsdk.util.b.b(this.b, !TextUtils.isEmpty(this.e) ? this.e : this.b.getPackageName(), z);
        com.meizu.cloud.pushsdk.util.b.c(this.b, !TextUtils.isEmpty(this.e) ? this.e : this.b.getPackageName(), z);
    }

    private void e(boolean z) {
        com.meizu.cloud.pushsdk.util.b.b(this.b, !TextUtils.isEmpty(this.e) ? this.e : this.b.getPackageName(), z);
    }

    private void f(boolean z) {
        com.meizu.cloud.pushsdk.util.b.c(this.b, !TextUtils.isEmpty(this.e) ? this.e : this.b.getPackageName(), z);
    }

    private boolean n() {
        return com.meizu.cloud.pushsdk.util.b.l(this.b, !TextUtils.isEmpty(this.e) ? this.e : this.b.getPackageName());
    }

    private boolean o() {
        return com.meizu.cloud.pushsdk.util.b.m(this.b, !TextUtils.isEmpty(this.e) ? this.e : this.b.getPackageName());
    }

    private boolean p() {
        Map<String, Boolean> map = this.m;
        Boolean bool = map.get(this.e + "_" + this.k);
        boolean z = bool == null || bool.booleanValue();
        DebugLogger.e("Strategy", "isSyncPushStatus " + this.e + " switch type->" + this.k + " flag->" + z);
        return z;
    }

    private boolean s() {
        return com.meizu.cloud.pushsdk.util.b.f(this.b, !TextUtils.isEmpty(this.e) ? this.e : this.b.getPackageName());
    }

    private void t() {
        int i = this.k;
        if (i == 0 || i == 1) {
            PlatformMessageSender.a(this.b, i, this.l, this.e);
        } else if (i != 3) {
        } else {
            PlatformMessageSender.a(this.b, 0, this.l, this.e);
            PlatformMessageSender.a(this.b, 1, this.l, this.e);
        }
    }

    private boolean u() {
        return com.meizu.cloud.pushsdk.util.b.k(this.b, !TextUtils.isEmpty(this.e) ? this.e : this.b.getPackageName());
    }

    public void b(int i) {
        this.k = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.platform.d.c
    public void b(PushSwitchStatus pushSwitchStatus) {
        PlatformMessageSender.a(this.b, !TextUtils.isEmpty(this.e) ? this.e : this.b.getPackageName(), pushSwitchStatus);
    }

    public void c(boolean z) {
        this.l = z;
    }

    public void d(String str) {
        this.j = str;
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    protected boolean d() {
        return !TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(this.j);
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    protected Intent h() {
        Intent intent = new Intent();
        intent.putExtra("app_id", this.c);
        intent.putExtra(MspGlobalDefine.APP_KEY, this.d);
        intent.putExtra("strategy_package_name", this.b.getPackageName());
        intent.putExtra(PushConstants.REGISTER_STATUS_PUSH_ID, this.j);
        intent.putExtra("strategy_type", j());
        intent.putExtra("strategy_child_type", this.k);
        intent.putExtra("strategy_params", this.l ? "1" : "0");
        return intent;
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    protected int j() {
        return 16;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.platform.d.c
    /* renamed from: m */
    public PushSwitchStatus a() {
        String str;
        PushSwitchStatus pushSwitchStatus = new PushSwitchStatus();
        pushSwitchStatus.setCode("20001");
        if (TextUtils.isEmpty(this.c)) {
            str = "appId not empty";
        } else if (!TextUtils.isEmpty(this.d)) {
            if (TextUtils.isEmpty(this.j)) {
                str = "pushId not empty";
            }
            return pushSwitchStatus;
        } else {
            str = "appKey not empty";
        }
        pushSwitchStatus.setMessage(str);
        return pushSwitchStatus;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.platform.d.c
    /* renamed from: q */
    public PushSwitchStatus c() {
        int i = this.k;
        if (i == 0) {
            e(this.l);
            return null;
        } else if (i == 1) {
            f(this.l);
            return null;
        } else if (i != 2 && i != 3) {
            return null;
        } else {
            d(this.l);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.platform.d.c
    /* renamed from: r */
    public PushSwitchStatus e() {
        PushSwitchStatus pushSwitchStatus = new PushSwitchStatus();
        pushSwitchStatus.setPushId(this.j);
        pushSwitchStatus.setCode("200");
        com.meizu.cloud.pushsdk.e.b.c<String> a2 = a(pushSwitchStatus);
        if (a2 != null) {
            if (a2.c()) {
                PushSwitchStatus pushSwitchStatus2 = new PushSwitchStatus(a2.b());
                DebugLogger.e("Strategy", "network pushSwitchStatus " + pushSwitchStatus2);
                if ("200".equals(pushSwitchStatus.getCode())) {
                    b(false);
                    DebugLogger.e("Strategy", "update local switch preference");
                    pushSwitchStatus.setSwitchNotificationMessage(pushSwitchStatus2.isSwitchNotificationMessage());
                    pushSwitchStatus.setSwitchThroughMessage(pushSwitchStatus2.isSwitchThroughMessage());
                    e(pushSwitchStatus2.isSwitchNotificationMessage());
                    f(pushSwitchStatus2.isSwitchThroughMessage());
                }
            } else {
                com.meizu.cloud.pushsdk.e.c.a a3 = a2.a();
                if (a3.c() != null) {
                    DebugLogger.e("Strategy", "status code=" + a3.b() + " data=" + a3.c());
                }
                pushSwitchStatus.setCode(String.valueOf(a3.b()));
                pushSwitchStatus.setMessage(a3.a());
                DebugLogger.e("Strategy", "pushSwitchStatus " + pushSwitchStatus);
            }
        }
        DebugLogger.e("Strategy", "enableRpc " + this.h + " isSupportRemoteInvoke " + this.g);
        if (this.h && !this.g) {
            t();
        }
        return pushSwitchStatus;
    }
}
