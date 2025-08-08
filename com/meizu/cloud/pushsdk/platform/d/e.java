package com.meizu.cloud.pushsdk.platform.d;

import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.PlatformMessageSender;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public class e extends c<SubTagsStatus> {
    private String j;
    private int k;
    private String l;

    public e(Context context, com.meizu.cloud.pushsdk.platform.c.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, null, aVar, scheduledExecutorService);
    }

    public e(Context context, com.meizu.cloud.pushsdk.platform.c.a aVar, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this(context, aVar, scheduledExecutorService);
        this.h = z;
    }

    public e(Context context, String str, String str2, com.meizu.cloud.pushsdk.platform.c.a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
        this.k = 3;
    }

    public e(Context context, String str, String str2, String str3, com.meizu.cloud.pushsdk.platform.c.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, str, str2, aVar, scheduledExecutorService);
        this.j = str3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.platform.d.c
    /* renamed from: a */
    public void b(SubTagsStatus subTagsStatus) {
        PlatformMessageSender.a(this.b, !StringUtils.isEmpty(this.e) ? this.e : this.b.getPackageName(), subTagsStatus);
    }

    public void b(int i) {
        this.k = i;
    }

    public void d(String str) {
        this.j = str;
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    protected boolean d() {
        return !StringUtils.isEmpty(this.c) && !StringUtils.isEmpty(this.d) && !StringUtils.isEmpty(this.j);
    }

    public void e(String str) {
        this.l = str;
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
        intent.putExtra("strategy_params", this.l);
        return intent;
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    protected int j() {
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.platform.d.c
    /* renamed from: m */
    public SubTagsStatus a() {
        String str;
        SubTagsStatus subTagsStatus = new SubTagsStatus();
        subTagsStatus.setCode("20001");
        if (StringUtils.isEmpty(this.c)) {
            str = "appId not empty";
        } else if (!StringUtils.isEmpty(this.d)) {
            if (StringUtils.isEmpty(this.j)) {
                str = "pushId not empty";
            }
            return subTagsStatus;
        } else {
            str = "appKey not empty";
        }
        subTagsStatus.setMessage(str);
        return subTagsStatus;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.platform.d.c
    /* renamed from: n */
    public SubTagsStatus c() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.platform.d.c
    /* renamed from: o */
    public SubTagsStatus e() {
        StringBuilder sb;
        String str;
        SubTagsStatus subTagsStatus = new SubTagsStatus();
        int i = this.k;
        com.meizu.cloud.pushsdk.e.b.c b = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : this.f.b(this.c, this.d, this.j) : this.f.c(this.c, this.d, this.j) : this.f.f(this.c, this.d, this.j, this.l) : this.f.c(this.c, this.d, this.j, this.l);
        if (b == null) {
            DebugLogger.e("Strategy", "network anResponse is null");
            return null;
        }
        if (b.c()) {
            subTagsStatus = new SubTagsStatus((String) b.b());
            sb = new StringBuilder();
            str = "network subTagsStatus ";
        } else {
            com.meizu.cloud.pushsdk.e.c.a a2 = b.a();
            if (a2.c() != null) {
                DebugLogger.e("Strategy", "status code=" + a2.b() + " data=" + a2.c());
            }
            subTagsStatus.setCode(String.valueOf(a2.b()));
            subTagsStatus.setMessage(a2.a());
            sb = new StringBuilder();
            str = "subTagsStatus ";
        }
        sb.append(str);
        sb.append(subTagsStatus);
        DebugLogger.e("Strategy", sb.toString());
        return subTagsStatus;
    }
}
