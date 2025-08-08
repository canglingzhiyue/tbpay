package com.vivo.push.c;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.vivo.push.util.u;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f24175a;
    private HashMap<String, String> b = new HashMap<>();

    public a(Context context) {
        this.f24175a = context;
    }

    private int a(int i) {
        int e = e();
        if (e != 0) {
            return e;
        }
        HashMap<String, String> hashMap = this.b;
        if (hashMap == null || hashMap.size() == 0) {
            return 8006;
        }
        String str = this.b.get("pushSupport");
        if (StringUtils.isEmpty(str)) {
            return 2;
        }
        try {
            return (i & Integer.parseInt(str)) > 0 ? 0 : 1;
        } catch (Exception unused) {
            return 8007;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba A[Catch: Exception -> 0x0094, TRY_ENTER, TryCatch #9 {Exception -> 0x0094, blocks: (B:41:0x0090, B:45:0x0098, B:47:0x009c, B:60:0x00ba, B:62:0x00bf, B:64:0x00c3), top: B:86:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bf A[Catch: Exception -> 0x0094, TryCatch #9 {Exception -> 0x0094, blocks: (B:41:0x0090, B:45:0x0098, B:47:0x009c, B:60:0x00ba, B:62:0x00bf, B:64:0x00c3), top: B:86:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3 A[Catch: Exception -> 0x00cf, TryCatch #0 {Exception -> 0x00cf, blocks: (B:69:0x00cb, B:73:0x00d3, B:75:0x00d7), top: B:79:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.c.a.a(android.content.Context, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.content.ContentProviderClient, android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int e() {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.c.a.e():int");
    }

    public final int a() {
        int a2 = a(1);
        u.d("CoreConfigManager", "isSupportNewControlStrategies : ".concat(String.valueOf(a2)));
        return a2;
    }

    public final int b() {
        int a2 = a(4);
        u.d("CoreConfigManager", "isSupportSyncProfileInfo : ".concat(String.valueOf(a2)));
        return a2;
    }

    public final boolean c() {
        int a2 = a(8);
        u.d("CoreConfigManager", "isSupportdeleteRegid : ".concat(String.valueOf(a2)));
        return a2 == 0;
    }

    public final boolean d() {
        int a2 = a(16);
        u.d("CoreConfigManager", "isSupportQueryCurrentAppState : ".concat(String.valueOf(a2)));
        return a2 == 0;
    }
}
