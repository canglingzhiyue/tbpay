package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.relationship.application.RelationshipApplication;
import com.taobao.relationship.mtop.b;
import com.taobao.relationship.mtop.isfollow.a;

/* loaded from: classes7.dex */
public class nlx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-641224252);
        RelationshipApplication.init();
    }

    public static void a(String str, String str2, String str3, String str4, nlv nlvVar) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d23188", new Object[]{str, str2, str3, str4, nlvVar});
            return;
        }
        long j = 0;
        if (!TextUtils.isEmpty(str)) {
            j = Long.parseLong(str);
        } else if (!TextUtils.isEmpty(str2)) {
            j = Long.parseLong(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            i = Integer.parseInt(str3);
        }
        b bVar = new b();
        bVar.b = j;
        bVar.d = i;
        bVar.i = str4;
        new a(nlvVar).a(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, tb.nlv r29, android.app.Activity r30) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.nlx.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, tb.nlv, android.app.Activity):void");
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, nlv nlvVar, Activity activity) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b122b4c", new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9, nlvVar, activity});
            return;
        }
        long j = 0;
        if (!TextUtils.isEmpty(str)) {
            j = Long.parseLong(str);
        } else if (!TextUtils.isEmpty(str2)) {
            j = Long.parseLong(str2);
        }
        int parseInt = TextUtils.isEmpty(str3) ? 1 : Integer.parseInt(str3);
        if (!TextUtils.isEmpty(str8)) {
            String lowerCase = str8.toLowerCase();
            if (TextUtils.equals(lowerCase, "true") || TextUtils.equals(lowerCase, "1")) {
                z = true;
            }
        }
        b bVar = new b();
        bVar.b = j;
        bVar.d = parseInt;
        bVar.i = str9;
        bVar.f = str4;
        bVar.g = str5;
        bVar.h = str6;
        bVar.d = parseInt;
        bVar.i = str9;
        bVar.m = z;
        bVar.f18974a = activity;
        new com.taobao.relationship.mtop.removefollow.a(nlvVar).a(bVar);
    }

    public static void a(String str, String str2, nlv nlvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e55e74", new Object[]{str, str2, nlvVar});
            return;
        }
        if (nmg.a()) {
            if (!TextUtils.isEmpty(str)) {
                com.taobao.phenix.intf.b.h().a(str);
            }
            if (!TextUtils.isEmpty(str2)) {
                com.taobao.phenix.intf.b.h().a(str2);
            }
        }
        nlvVar.onResult(new JSONObject());
    }
}
