package com.xiaomi.mipush.sdk;

import android.content.Context;
import mtopsdk.common.util.StringUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f24327a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ e f77a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f78a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(String str, Context context, e eVar) {
        this.f78a = str;
        this.f24327a = context;
        this.f77a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        if (!StringUtils.isEmpty(this.f78a)) {
            String[] split = this.f78a.split(Constants.WAVE_SEPARATOR);
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str = "";
                    break;
                }
                String str2 = split[i];
                if (!StringUtils.isEmpty(str2) && str2.startsWith("token:")) {
                    str = str2.substring(str2.indexOf(":") + 1);
                    break;
                }
                i++;
            }
            if (StringUtils.isEmpty(str)) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("ASSEMBLE_PUSH : receive incorrect token");
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.m1616a("ASSEMBLE_PUSH : receive correct token");
            i.d(this.f24327a, this.f77a, str);
            i.m1685a(this.f24327a);
        }
    }
}
