package com.vivo.push.restructure.a.a;

import mtopsdk.common.util.StringUtils;
import com.vivo.push.util.u;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, m> f24226a = new ConcurrentHashMap();

    @Override // com.vivo.push.restructure.a.a.n
    public final void a(com.vivo.push.restructure.a.a aVar, a aVar2) {
        String str;
        if (aVar == null) {
            str = "addToCache error. msg is null";
        } else if (StringUtils.isEmpty(aVar.a())) {
            str = "addToCache error. messageID is null";
        } else if (aVar2 != null) {
            return;
        } else {
            str = "addToCache error. firstNode is null";
        }
        u.a(str);
    }
}
