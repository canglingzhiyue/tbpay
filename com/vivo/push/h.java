package com.vivo.push;

import com.vivo.push.restructure.request.a.a.c;

/* loaded from: classes9.dex */
final class h implements c.a<g> {
    private static g b(String str) {
        try {
            return new g(new com.vivo.push.restructure.request.a.a.a(str));
        } catch (Exception e) {
            com.vivo.push.util.u.a(8101, e.getMessage());
            return null;
        }
    }

    @Override // com.vivo.push.restructure.request.a.a.c.a
    public final /* synthetic */ g a(String str) {
        return b(str);
    }
}
