package com.vivo.push.restructure.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import mtopsdk.common.util.StringUtils;
import com.vivo.push.util.k;
import com.vivo.push.util.u;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class f implements b {
    @Override // com.vivo.push.util.o
    public final List<String> a(Context context) {
        k.a("findAllCoreClientPush");
        List<ResolveInfo> list = null;
        if (!com.vivo.push.restructure.a.a().e().l().isAgreePrivacyStatement()) {
            u.d("PushSystemRelyImpl", " findAllCorePush  isAgreePrivacyStatement() is false ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            list = context.getPackageManager().queryIntentServices(new Intent("com.vivo.pushservice.action.PUSH_SERVICE"), 576);
        } catch (Exception unused) {
        }
        if (list != null && list.size() > 0) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ResolveInfo resolveInfo = list.get(i);
                if (resolveInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    if (!StringUtils.isEmpty(str)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        if (arrayList.size() <= 0) {
            u.d("PushSystemRelyImpl", "get all push packages is null");
        }
        return arrayList;
    }
}
