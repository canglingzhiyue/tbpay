package com.meizu.cloud.pushsdk.platform.d;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public abstract class c<T extends BasicPushStatus> {

    /* renamed from: a  reason: collision with root package name */
    private ScheduledExecutorService f8015a;
    protected final Context b;
    protected String c;
    protected String d;
    protected String e;
    protected final com.meizu.cloud.pushsdk.platform.c.a f;
    protected boolean g = true;
    protected boolean h = true;
    private String i = null;

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.g();
        }
    }

    public c(Context context, String str, String str2, com.meizu.cloud.pushsdk.platform.c.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this.f8015a = scheduledExecutorService;
        this.b = context;
        this.c = str;
        this.d = str2;
        this.f = aVar;
    }

    private boolean a(int i) {
        return i >= 110000 && i <= 200000;
    }

    private boolean a(T t) {
        int intValue = Integer.valueOf(t.getCode()).intValue();
        if (intValue <= 200 || intValue >= 600) {
            return (intValue > 1000 && intValue < 2000) || intValue == 0;
        }
        return true;
    }

    private boolean k() {
        return this.h && !this.b.getPackageName().equals(this.i);
    }

    protected abstract T a();

    protected String a(Context context, String str) {
        String str2 = null;
        if (!TextUtils.isEmpty(str)) {
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent(str), 0);
            if (queryIntentServices != null) {
                Iterator<ResolveInfo> it = queryIntentServices.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ResolveInfo next = it.next();
                    if (PushConstants.PUSH_PACKAGE_NAME.equals(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        this.i = serviceInfo.packageName;
                        str2 = serviceInfo.name;
                        break;
                    }
                }
                if (TextUtils.isEmpty(str2) && queryIntentServices.size() > 0) {
                    this.i = queryIntentServices.get(0).serviceInfo.packageName;
                    str2 = queryIntentServices.get(0).serviceInfo.name;
                }
            }
        }
        DebugLogger.i("Strategy", "current process packageName " + this.i);
        return str2;
    }

    protected void a(Intent intent) {
        try {
            intent.setPackage(this.i);
            intent.setAction(PushConstants.MZ_PUSH_MANAGER_SERVICE_ACTION);
            this.b.startService(intent);
        } catch (Exception e) {
            DebugLogger.e("Strategy", "start RemoteService error " + e.getMessage());
        }
    }

    public void a(String str) {
        this.c = str;
    }

    public void a(boolean z) {
        this.g = z;
    }

    protected abstract void b(T t);

    public void b(String str) {
        this.d = str;
    }

    protected boolean b() {
        return 2 == j() || 32 == j();
    }

    protected abstract T c();

    public void c(String str) {
        this.e = str;
    }

    protected abstract boolean d();

    protected abstract T e();

    public boolean f() {
        ScheduledExecutorService scheduledExecutorService = this.f8015a;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(new a());
            return true;
        }
        return g();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.platform.d.c.g():boolean");
    }

    protected abstract Intent h();

    protected Intent[] i() {
        return null;
    }

    protected abstract int j();

    protected boolean l() {
        return this.h && this.g && !TextUtils.isEmpty(a(this.b, PushConstants.MZ_PUSH_MANAGER_SERVICE_ACTION));
    }
}
