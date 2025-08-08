package com.meizu.cloud.pushsdk.platform.d;

import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public class a extends c {
    private int[] j;
    private int k;
    private String l;

    public a(Context context, String str, String str2, com.meizu.cloud.pushsdk.platform.c.a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
        this.g = MinSdkChecker.isSupportSetDrawableSmallIcon();
    }

    public a(Context context, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this(context, null, null, null, scheduledExecutorService);
        this.h = z;
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    protected BasicPushStatus a() {
        return null;
    }

    public void a(int... iArr) {
        this.j = iArr;
    }

    public void b(int i) {
        this.k = i;
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    protected void b(BasicPushStatus basicPushStatus) {
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    protected BasicPushStatus c() {
        return null;
    }

    public void d(String str) {
        this.l = str;
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    protected boolean d() {
        int[] iArr;
        int i = this.k;
        return i == 0 || ((iArr = this.j) != null && iArr.length > 0 && i == 1) || (i == 2 && !StringUtils.isEmpty(this.l));
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    protected BasicPushStatus e() {
        int i = this.k;
        if (i == 0) {
            if (!MinSdkChecker.isSupportSetDrawableSmallIcon()) {
                DebugLogger.e("Strategy", "android 6.0 blow so cancel all by context");
                com.meizu.cloud.pushsdk.notification.g.b.a(this.b);
            }
            com.meizu.cloud.pushsdk.notification.g.b.a(this.b, this.e);
            return null;
        } else if (i != 1) {
            if (i != 2) {
                return null;
            }
            com.meizu.cloud.pushsdk.notification.g.b.a(this.b, this.e, this.l);
            return null;
        } else {
            int[] iArr = this.j;
            if (iArr == null) {
                return null;
            }
            for (int i2 : iArr) {
                DebugLogger.e("Strategy", "clear notifyId " + i2);
                com.meizu.cloud.pushsdk.notification.g.b.a(this.b, this.e, i2);
            }
            return null;
        }
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    protected Intent h() {
        Intent intent = new Intent();
        intent.putExtra("strategy_package_name", this.b.getPackageName());
        intent.putExtra("strategy_type", j());
        intent.putExtra("strategy_child_type", this.k);
        int i = this.k;
        if (i == 2) {
            intent.putExtra("strategy_params", this.l);
            return intent;
        } else if (i != 1) {
            return intent;
        } else {
            return null;
        }
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    protected Intent[] i() {
        int[] iArr = this.j;
        if (iArr != null) {
            Intent[] intentArr = new Intent[iArr.length];
            for (int i = 0; i < this.j.length; i++) {
                DebugLogger.i("Strategy", "send notifyId " + this.j[i] + " to PushManagerService");
                Intent intent = new Intent();
                intent.putExtra("strategy_package_name", this.b.getPackageName());
                intent.putExtra("strategy_type", j());
                intent.putExtra("strategy_child_type", this.k);
                intent.putExtra("strategy_params", "" + this.j[i]);
                intentArr[i] = intent;
            }
            return intentArr;
        }
        return null;
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    protected int j() {
        return 64;
    }
}
