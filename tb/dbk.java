package tb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.heytap.mspsdk.keychain.impl.b;
import com.opos.process.bridge.annotation.IBridgeTargetIdentify;
import com.opos.process.bridge.provider.BridgeExecuteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class dbk extends dbj {
    public String h = null;
    public String i = null;
    public final List<String> j = new ArrayList();
    public String[] k = null;
    public final AtomicInteger l = new AtomicInteger(-1);

    static {
        kge.a(-1833965431);
    }

    public dbk(Context context, IBridgeTargetIdentify iBridgeTargetIdentify, Bundle bundle) {
        this.f26657a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.c = iBridgeTargetIdentify;
        this.b = bundle;
    }

    public String a() {
        return null;
    }

    public final void a(Context context) {
        dbo dboVar;
        if (this.i == null || this.h == null) {
            PackageManager packageManager = this.f26657a.getPackageManager();
            this.j.clear();
            this.d.clear();
            String[] strArr = this.k;
            if (strArr != null) {
                this.j.addAll(Arrays.asList(strArr));
            }
            String str = "query Authorities:" + b.a(this.j);
            for (String str2 : this.j) {
                if (!StringUtils.isEmpty(str2)) {
                    if (str2.contains("${applicationId}")) {
                        str2 = str2.replace("${applicationId}", context.getPackageName());
                    }
                    ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str2, 128);
                    if (resolveContentProvider != null && !StringUtils.isEmpty(resolveContentProvider.packageName) && (StringUtils.isEmpty(a()) || resolveContentProvider.name.equals(a()))) {
                        List<dbo> list = this.d;
                        String str3 = resolveContentProvider.packageName;
                        String str4 = resolveContentProvider.name;
                        if (StringUtils.isEmpty(str3) || StringUtils.isEmpty(str2)) {
                            dboVar = null;
                        } else {
                            dboVar = new dbo();
                            dboVar.b = str3;
                            dboVar.c = str2;
                            dboVar.f26664a = str4;
                        }
                        list.add(dboVar);
                    }
                }
            }
            r0 = "get targets:" + b.a(this.d);
            if (this.d.size() <= 0) {
                throw new BridgeExecuteException("No target found for all authorities", 101001);
            }
            this.h = this.d.get(0).b;
            this.i = this.d.get(0).c;
            String str5 = "select first package:" + this.h + ", authority:" + this.i;
        }
        String str6 = "use package:" + this.h + ", authority:" + this.i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c6, code lost:
        if (r2 == 1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0158  */
    @Override // tb.dbj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Bundle c(android.content.Context r9, java.lang.String r10, com.opos.process.bridge.annotation.IBridgeTargetIdentify r11, int r12, java.lang.Object... r13) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dbk.c(android.content.Context, java.lang.String, com.opos.process.bridge.annotation.IBridgeTargetIdentify, int, java.lang.Object[]):android.os.Bundle");
    }
}
