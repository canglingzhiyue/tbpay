package com.meizu.cloud.pushsdk.platform.d;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.PlatformMessageSender;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public class d extends c<SubAliasStatus> {
    private String j;
    private int k;
    private String l;
    private final Map<String, Boolean> m;

    public d(Context context, com.meizu.cloud.pushsdk.platform.c.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, null, aVar, scheduledExecutorService);
    }

    public d(Context context, com.meizu.cloud.pushsdk.platform.c.a aVar, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this(context, aVar, scheduledExecutorService);
        this.h = z;
    }

    public d(Context context, String str, String str2, com.meizu.cloud.pushsdk.platform.c.a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
        this.m = new HashMap();
    }

    public d(Context context, String str, String str2, String str3, com.meizu.cloud.pushsdk.platform.c.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, str, str2, aVar, scheduledExecutorService);
        this.j = str3;
    }

    private void b(boolean z) {
        Map<String, Boolean> map = this.m;
        map.put(this.e + "_" + this.k, Boolean.valueOf(z));
    }

    private void f(String str) {
        com.meizu.cloud.pushsdk.util.b.j(this.b, !TextUtils.isEmpty(this.e) ? this.e : this.b.getPackageName(), str);
    }

    private boolean n() {
        return !this.g && PushConstants.PUSH_PACKAGE_NAME.equals(this.e);
    }

    private boolean o() {
        Map<String, Boolean> map = this.m;
        Boolean bool = map.get(this.e + "_" + this.k);
        return bool == null || bool.booleanValue();
    }

    private String p() {
        return com.meizu.cloud.pushsdk.util.b.a(this.b, !TextUtils.isEmpty(this.e) ? this.e : this.b.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.platform.d.c
    /* renamed from: a */
    public void b(SubAliasStatus subAliasStatus) {
        PlatformMessageSender.a(this.b, !TextUtils.isEmpty(this.e) ? this.e : this.b.getPackageName(), subAliasStatus);
    }

    public void b(int i) {
        this.k = i;
    }

    public void d(String str) {
        this.l = str;
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    protected boolean d() {
        return !TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(this.j);
    }

    public void e(String str) {
        this.j = str;
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    protected Intent h() {
        if (this.k != 2) {
            Intent intent = new Intent();
            intent.putExtra("app_id", this.c);
            intent.putExtra(MspGlobalDefine.APP_KEY, this.d);
            intent.putExtra("strategy_package_name", this.b.getPackageName());
            intent.putExtra(PushConstants.REGISTER_STATUS_PUSH_ID, this.j);
            intent.putExtra("strategy_type", j());
            intent.putExtra("strategy_child_type", this.k);
            intent.putExtra("strategy_params", this.l);
            return intent;
        }
        return null;
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    protected int j() {
        return 8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.platform.d.c
    /* renamed from: m */
    public SubAliasStatus a() {
        String str;
        SubAliasStatus subAliasStatus = new SubAliasStatus();
        subAliasStatus.setCode("20001");
        if (TextUtils.isEmpty(this.c)) {
            str = "appId not empty";
        } else if (!TextUtils.isEmpty(this.d)) {
            if (TextUtils.isEmpty(this.j)) {
                str = "pushId not empty";
            }
            return subAliasStatus;
        } else {
            str = "appKey not empty";
        }
        subAliasStatus.setMessage(str);
        return subAliasStatus;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.platform.d.c
    /* renamed from: q */
    public SubAliasStatus c() {
        if (this.k == 2) {
            SubAliasStatus subAliasStatus = new SubAliasStatus();
            subAliasStatus.setCode("200");
            subAliasStatus.setPushId(this.j);
            subAliasStatus.setAlias(p());
            subAliasStatus.setMessage("check alias success");
            return subAliasStatus;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    @Override // com.meizu.cloud.pushsdk.platform.d.c
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.meizu.cloud.pushsdk.platform.message.SubAliasStatus e() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.platform.d.d.e():com.meizu.cloud.pushsdk.platform.message.SubAliasStatus");
    }
}
