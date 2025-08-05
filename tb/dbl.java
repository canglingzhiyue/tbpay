package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.opos.process.bridge.annotation.IBridgeTargetIdentify;
import com.opos.process.bridge.provider.BridgeExecuteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class dbl extends dbj {
    public IBinder h;
    public String[] i = null;
    public AtomicInteger j = new AtomicInteger(-1);
    public String k = null;
    public String l = null;
    public List<String> m = new ArrayList();
    public b n = null;
    public b o = new a();

    /* loaded from: classes4.dex */
    public class a implements b {
        static {
            kge.a(-1504185657);
            kge.a(-1504185656);
        }

        public a() {
        }

        @Override // tb.dbl.b
        public void a(ComponentName componentName) {
            String str = "onServiceConnected:" + componentName;
            b bVar = dbl.this.n;
            if (bVar != null) {
                bVar.a(componentName);
            }
        }

        @Override // tb.dbl.b
        public void b(ComponentName componentName) {
            String str = "onServiceDisconnected:" + componentName;
            String str2 = "mPackage:" + dbl.this.k + ", targetClass:" + dbl.this.a();
            dbl dblVar = dbl.this;
            dblVar.h = null;
            b bVar = dblVar.n;
            if (bVar != null) {
                bVar.b(componentName);
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(ComponentName componentName);

        void b(ComponentName componentName);
    }

    static {
        kge.a(-1833965430);
    }

    public dbl(Context context, IBridgeTargetIdentify iBridgeTargetIdentify, Bundle bundle) {
        this.f26657a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.c = iBridgeTargetIdentify;
        this.b = bundle;
    }

    public Intent a(String str, String str2, String str3, Bundle bundle) {
        String str4 = "getServiceIntent --- packageName:" + str + ", targetClass:" + str2 + ", action" + str3 + ", bundle:" + bundle;
        Intent intent = new Intent();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            intent.setComponent(new ComponentName(str, str2));
        }
        intent.setPackage(str);
        intent.setAction(str3);
        intent.putExtra("callingPackage", this.f26657a.getPackageName());
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        return intent;
    }

    public String a() {
        return null;
    }

    public boolean a(Context context) {
        int i = this.j.get();
        if (i >= 0) {
            return i == 1;
        }
        try {
            String a2 = dbn.a(context.getApplicationContext());
            ResolveInfo resolveService = context.getApplicationContext().getPackageManager().resolveService(a(this.k, a(), this.l, null), 128);
            if (resolveService != null && !TextUtils.isEmpty(resolveService.serviceInfo.processName) && resolveService.serviceInfo.processName.equals(a2)) {
                this.j.compareAndSet(-1, 0);
                return false;
            }
        } catch (Exception unused) {
        }
        this.j.compareAndSet(-1, 1);
        return true;
    }

    public Intent b() {
        if (TextUtils.isEmpty(this.k) || TextUtils.isEmpty(this.l)) {
            b(this.f26657a);
        }
        return a(this.k, a(), this.l, this.b);
    }

    public final void b(Context context) {
        dbo dboVar;
        if (this.l == null || this.k == null) {
            PackageManager packageManager = this.f26657a.getPackageManager();
            this.m.clear();
            this.d.clear();
            String[] strArr = this.i;
            if (strArr != null) {
                this.m.addAll(Arrays.asList(strArr));
            }
            String str = "query actions:" + com.heytap.mspsdk.keychain.impl.b.a(this.m);
            for (String str2 : this.m) {
                if (!TextUtils.isEmpty(str2)) {
                    if (str2.contains("${applicationId}")) {
                        str2 = str2.replace("${applicationId}", context.getPackageName());
                    }
                    for (ResolveInfo resolveInfo : packageManager.queryIntentServices(a(this.k, a(), str2, null), 128)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        if (serviceInfo != null && !TextUtils.isEmpty(serviceInfo.packageName)) {
                            List<dbo> list = this.d;
                            ServiceInfo serviceInfo2 = resolveInfo.serviceInfo;
                            String str3 = serviceInfo2.packageName;
                            String str4 = serviceInfo2.name;
                            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
                                dboVar = null;
                            } else {
                                dboVar = new dbo();
                                dboVar.b = str3;
                                dboVar.d = str2;
                                dboVar.f26664a = str4;
                            }
                            list.add(dboVar);
                        }
                    }
                }
            }
            String str5 = "get targets:" + com.heytap.mspsdk.keychain.impl.b.a(this.d);
            if (this.d.size() <= 0) {
                throw new BridgeExecuteException("No target found for all actions", 101001);
            }
            this.k = this.d.get(0).b;
            this.l = this.d.get(0).d;
            String str6 = "select first package:" + this.k + ", action:" + this.l;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
        if (a(r9) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
        if (a(r9) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
        c(r9);
     */
    @Override // tb.dbj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Bundle c(android.content.Context r9, java.lang.String r10, com.opos.process.bridge.annotation.IBridgeTargetIdentify r11, int r12, java.lang.Object... r13) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dbl.c(android.content.Context, java.lang.String, com.opos.process.bridge.annotation.IBridgeTargetIdentify, int, java.lang.Object[]):android.os.Bundle");
    }

    public void c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        throw new BridgeExecuteException("MainThread call not allowed", 101000);
    }

    public final void c(Context context) {
        if (this.h == null) {
            String str = "use package:" + this.k + ", action:" + this.l;
            this.h = dbm.b.a(context, a(this.k, a(), this.l, this.b), this.g, this.o);
        }
    }
}
