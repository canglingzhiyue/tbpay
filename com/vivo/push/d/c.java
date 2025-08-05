package com.vivo.push.d;

import com.vivo.push.restructure.request.a.a.c;
import com.vivo.push.util.u;

/* loaded from: classes9.dex */
final class c implements c.a<b> {
    private static b b(String str) {
        try {
            return new b(new com.vivo.push.restructure.request.a.a.a(str));
        } catch (Exception e) {
            u.a(8101, e.getMessage());
            return null;
        }
    }

    @Override // com.vivo.push.restructure.request.a.a.c.a
    public final /* synthetic */ b a(String str) {
        return b(str);
    }
}
