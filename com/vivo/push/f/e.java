package com.vivo.push.f;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.util.NotifyAdapterUtil;
import java.util.HashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes9.dex */
public final class e extends aa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public e(com.vivo.push.v vVar) {
        super(vVar);
    }

    private void a(UPSNotificationMessage uPSNotificationMessage) {
        com.vivo.push.t.c(new g(this, uPSNotificationMessage));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Intent b(Intent intent, Map<String, String> map) {
        if (map != null && map.entrySet() != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null && entry.getKey() != null) {
                    intent.putExtra(entry.getKey(), entry.getValue());
                }
            }
        }
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.s
    public final void a(com.vivo.push.v vVar) {
        String str;
        Intent parseUri;
        String str2;
        com.vivo.push.b.p pVar = (com.vivo.push.b.p) vVar;
        InsideNotificationItem f = pVar.f();
        if (f == null) {
            com.vivo.push.util.u.d("NotifyOpenClientTask", "current notification item is null");
            return;
        }
        UPSNotificationMessage a2 = com.vivo.push.util.v.a(f);
        boolean equals = this.f24241a.getPackageName().equals(pVar.d());
        if (equals) {
            NotifyAdapterUtil.cancelNotify(this.f24241a);
        }
        if (!equals) {
            com.vivo.push.util.u.a("NotifyOpenClientTask", "notify is " + a2 + " ; isMatch is " + equals);
            return;
        }
        com.vivo.push.b.x xVar = new com.vivo.push.b.x(1030L);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("type", "2");
        hashMap.put("messageID", String.valueOf(pVar.e()));
        hashMap.put("platform", this.f24241a.getPackageName());
        String a3 = com.vivo.push.restructure.a.a().e().a();
        if (!StringUtils.isEmpty(a3)) {
            hashMap.put("remoteAppId", a3);
        }
        xVar.a(hashMap);
        com.vivo.push.m.a().a(xVar);
        com.vivo.push.util.u.d("NotifyOpenClientTask", "notification is clicked by skip type[" + a2.getSkipType() + riy.ARRAY_END_STR);
        int skipType = a2.getSkipType();
        boolean z = true;
        if (skipType == 1) {
            new Thread(new f(this, this.f24241a, a2.getParams())).start();
            a(a2);
        } else if (skipType == 2) {
            String skipContent = a2.getSkipContent();
            if (!skipContent.startsWith(com.taobao.search.common.util.k.HTTP_PREFIX) && !skipContent.startsWith(com.taobao.search.common.util.k.HTTPS_PREFIX)) {
                z = false;
            }
            if (z) {
                Uri parse = Uri.parse(skipContent);
                Intent intent = new Intent("android.intent.action.VIEW", parse);
                intent.setFlags(268435456);
                b(intent, a2.getParams());
                try {
                    this.f24241a.startActivity(intent);
                } catch (Exception unused) {
                    str = "startActivity error : ".concat(String.valueOf(parse));
                }
                a(a2);
            }
            str = "url not legal";
            com.vivo.push.util.u.a("NotifyOpenClientTask", str);
            a(a2);
        } else if (skipType == 3) {
            a(a2);
        } else if (skipType != 4) {
            com.vivo.push.util.u.a("NotifyOpenClientTask", "illegitmacy skip type error : " + a2.getSkipType());
        } else {
            String skipContent2 = a2.getSkipContent();
            try {
                parseUri = Intent.parseUri(skipContent2, 1);
                str2 = parseUri.getPackage();
            } catch (Exception e) {
                com.vivo.push.util.u.a("NotifyOpenClientTask", "open activity error : ".concat(String.valueOf(skipContent2)), e);
            }
            if (!StringUtils.isEmpty(str2) && !this.f24241a.getPackageName().equals(str2)) {
                com.vivo.push.util.u.a("NotifyOpenClientTask", "open activity error : local pkgName is " + this.f24241a.getPackageName() + "; but remote pkgName is " + parseUri.getPackage());
                return;
            }
            String packageName = parseUri.getComponent() == null ? null : parseUri.getComponent().getPackageName();
            if (!StringUtils.isEmpty(packageName) && !this.f24241a.getPackageName().equals(packageName)) {
                com.vivo.push.util.u.a("NotifyOpenClientTask", "open activity component error : local pkgName is " + this.f24241a.getPackageName() + "; but remote pkgName is " + parseUri.getPackage());
                return;
            }
            parseUri.setSelector(null);
            parseUri.setPackage(this.f24241a.getPackageName());
            parseUri.addFlags(335544320);
            b(parseUri, a2.getParams());
            ActivityInfo resolveActivityInfo = parseUri.resolveActivityInfo(this.f24241a.getPackageManager(), 65536);
            if (resolveActivityInfo == null || resolveActivityInfo.exported) {
                this.f24241a.startActivity(parseUri);
                a(a2);
                return;
            }
            com.vivo.push.util.u.a("NotifyOpenClientTask", "activity is not exported : " + resolveActivityInfo.toString());
        }
    }
}
