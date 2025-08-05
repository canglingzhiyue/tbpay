package com.vivo.push.f;

import android.text.TextUtils;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.vivo.push.f.u;
import java.util.HashMap;

/* loaded from: classes9.dex */
final class w implements u.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ v f24201a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(v vVar) {
        this.f24201a = vVar;
    }

    @Override // com.vivo.push.f.u.a
    public final void a() {
        long k = com.vivo.push.m.a().k();
        if (k < 1400 && k != 1340) {
            com.vivo.push.util.u.b("OnNotificationArrivedTask", "引擎版本太低，不支持正向展示功能，pushEngineSDKVersion：".concat(String.valueOf(k)));
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("srt", "1");
        hashMap.put(Constant.PROP_MESSAGE_ID, String.valueOf(this.f24201a.b.f()));
        String a2 = com.vivo.push.restructure.a.a().e().a();
        if (!TextUtils.isEmpty(a2)) {
            hashMap.put("app_id", a2);
        }
        hashMap.put("type", "1");
        hashMap.put("dtp", "1");
        com.vivo.push.util.f.a(6L, hashMap);
    }

    @Override // com.vivo.push.f.u.a
    public final void b() {
        HashMap hashMap = new HashMap();
        hashMap.put("messageID", String.valueOf(this.f24201a.b.f()));
        String a2 = com.vivo.push.restructure.a.a().e().a();
        if (!TextUtils.isEmpty(a2)) {
            hashMap.put("remoteAppId", a2);
        }
        com.vivo.push.util.f.a(2122L, hashMap);
    }
}
