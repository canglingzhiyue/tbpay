package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class ia {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ia f24541a;

    /* renamed from: a  reason: collision with other field name */
    private final Context f498a;

    /* renamed from: a  reason: collision with other field name */
    private Map<String, ib> f499a = new HashMap();

    private ia(Context context) {
        this.f498a = context;
    }

    public static ia a(Context context) {
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.b.d("[TinyDataManager]:mContext is null, TinyDataManager.getInstance(Context) failed.");
            return null;
        }
        if (f24541a == null) {
            synchronized (ia.class) {
                if (f24541a == null) {
                    f24541a = new ia(context);
                }
            }
        }
        return f24541a;
    }

    private boolean a(String str, String str2, String str3, String str4, long j, String str5) {
        ig igVar = new ig();
        igVar.d(str3);
        igVar.c(str4);
        igVar.a(j);
        igVar.b(str5);
        igVar.a(true);
        igVar.a("push_sdk_channel");
        igVar.e(str2);
        return a(igVar, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ib a() {
        ib ibVar = this.f499a.get("UPLOADER_PUSH_CHANNEL");
        if (ibVar != null) {
            return ibVar;
        }
        ib ibVar2 = this.f499a.get("UPLOADER_HTTP");
        if (ibVar2 == null) {
            return null;
        }
        return ibVar2;
    }

    /* renamed from: a  reason: collision with other method in class */
    Map<String, ib> m2032a() {
        return this.f499a;
    }

    public void a(ib ibVar, String str) {
        if (ibVar == null) {
            com.xiaomi.channel.commonutils.logger.b.d("[TinyDataManager]: please do not add null mUploader to TinyDataManager.");
        } else if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.d("[TinyDataManager]: can not add a provider from unkown resource.");
        } else {
            m2032a().put(str, ibVar);
        }
    }

    public boolean a(ig igVar, String str) {
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("pkgName is null or empty, upload ClientUploadDataItem failed.");
            return false;
        } else if (com.xiaomi.push.service.ca.a(igVar, false)) {
            return false;
        } else {
            if (TextUtils.isEmpty(igVar.d())) {
                igVar.f(com.xiaomi.push.service.ca.a());
            }
            igVar.g(str);
            com.xiaomi.push.service.cb.a(this.f498a, igVar);
            return true;
        }
    }

    public boolean a(String str, String str2, long j, String str3) {
        return a(this.f498a.getPackageName(), this.f498a.getPackageName(), str, str2, j, str3);
    }
}
