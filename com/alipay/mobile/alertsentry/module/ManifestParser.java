package com.alipay.mobile.alertsentry.module;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.alipay.mobile.alertsentry.SentryBuilder;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class ManifestParser {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f5335a;

    public ManifestParser(Context context) {
        this.f5335a = context;
    }

    public final List<SentryModule> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f5335a.getPackageManager().getApplicationInfo(this.f5335a.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("SentryModule".equals(applicationInfo.metaData.get(str)) && a(str) != null) {
                        arrayList.add(a(str));
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    private static SentryModule a(String str) {
        Class<?> cls;
        Object obj = null;
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException e) {
            e.toString();
            cls = null;
        }
        try {
            obj = cls.newInstance();
        } catch (Exception e2) {
            e2.toString();
        }
        if (!(obj instanceof SentryModule)) {
            new StringBuilder("Expected instanceof SentryModule, but found: ").append(obj);
            obj = new SentryModule() { // from class: com.alipay.mobile.alertsentry.module.ManifestParser.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.alertsentry.module.SentryModule
                public final void applyOptions(Context context, SentryBuilder sentryBuilder) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("d603679e", new Object[]{this, context, sentryBuilder});
                    }
                }
            };
        }
        return (SentryModule) obj;
    }
}
