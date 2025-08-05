package com.alibaba.wireless.aliprivacyext.recommendation;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.wireless.aliprivacyext.f;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.HashMap;
import tb.cfz;

/* loaded from: classes3.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public class a implements com.alibaba.wireless.aliprivacyext.http.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f4248a;

        public a(Context context) {
            this.f4248a = context;
        }

        @Override // com.alibaba.wireless.aliprivacyext.http.a
        public void a(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd69ac9f", new Object[]{this, aVar});
                return;
            }
            com.alibaba.wireless.aliprivacy.c.a("PrivacyProfileManager", "syncResultToServer on success");
            TLog.loge("AliPrivacy", "PrivacyProfileManager", "syncResultToServer on success");
            b.a(b.this, this.f4248a, "innerAd");
            b.a(b.this, this.f4248a, "outerAd");
        }

        @Override // com.alibaba.wireless.aliprivacyext.http.a
        public void b(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0f930e0", new Object[]{this, aVar});
                return;
            }
            com.alibaba.wireless.aliprivacy.c.b("PrivacyProfileManager", "syncResultToServer on error");
            TLog.loge("AliPrivacy", "PrivacyProfileManager", "syncResultToServer error with errorCode: " + aVar.getClass() + ", " + aVar.getRetMsg());
            b.a(b.this, this.f4248a, "innerAd");
            b.a(b.this, this.f4248a, "outerAd");
        }
    }

    public static /* synthetic */ void a(b bVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa502a4d", new Object[]{bVar, context, str});
        } else {
            bVar.b(context, str);
        }
    }

    private void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{this, context, str});
        } else if (context == null || context.getApplicationContext() == null || TextUtils.isEmpty(str)) {
        } else {
            cfz.p(context, str);
        }
    }

    public static boolean a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18de978", new Object[]{context, str, str2})).booleanValue();
        }
        if (context == null || context.getApplicationContext() == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return cfz.a(context, str, str2);
    }

    private void b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbd7193", new Object[]{this, context, str, str2});
            return;
        }
        a aVar = new a(context);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("tagSource", "internalTag");
            hashMap.put("tagValue", str);
            arrayList.add(hashMap);
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("tagSource", "externalTag");
            hashMap2.put("tagValue", str2);
            arrayList.add(hashMap2);
        }
        com.alibaba.wireless.aliprivacyext.http.model.request.d dVar = new com.alibaba.wireless.aliprivacyext.http.model.request.d();
        dVar.tagValues = f.a(arrayList);
        com.alibaba.wireless.aliprivacy.c.a("PrivacyProfileManager", "syncResultToServer: " + dVar.tagValues);
        com.alibaba.wireless.aliprivacyext.http.b.a(context, dVar, aVar);
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        if (context != null && context.getApplicationContext() != null && !TextUtils.isEmpty(str)) {
            return cfz.o(context, str);
        }
        return null;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        String a2 = a(context, "innerAd");
        String a3 = a(context, "outerAd");
        com.alibaba.wireless.aliprivacy.c.a("PrivacyProfileManager", "privacyProfileConsume innerAdResult: " + a2 + " outerAdResult: " + a3);
        if (!TextUtils.isEmpty(a2) || !TextUtils.isEmpty(a3)) {
            b(context, a2, a3);
        }
        String a4 = a(context, "recommend");
        com.alibaba.wireless.aliprivacy.c.a("PrivacyProfileManager", "privacyProfileConsume recommendResult: " + a4);
        if (a4 == null) {
            return;
        }
        com.alibaba.wireless.aliprivacyext.recommendation.a.a(context, Boolean.parseBoolean(a4));
        b(context, "recommend");
    }
}
