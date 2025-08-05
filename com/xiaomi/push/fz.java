package com.xiaomi.push;

import java.net.UnknownHostException;

/* loaded from: classes9.dex */
final class fz {

    /* loaded from: classes9.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        ft f24487a;

        /* renamed from: a  reason: collision with other field name */
        String f387a;

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(Exception exc) {
        m1943a(exc);
        boolean z = exc instanceof hb;
        Exception exc2 = exc;
        if (z) {
            hb hbVar = (hb) exc;
            exc2 = exc;
            if (hbVar.a() != null) {
                exc2 = hbVar.a();
            }
        }
        a aVar = new a();
        String message = exc2.getMessage();
        if (exc2.getCause() != null) {
            message = exc2.getCause().getMessage();
        }
        String str = exc2.getClass().getSimpleName() + ":" + message;
        int a2 = gs.a(exc2);
        if (a2 != 0) {
            aVar.f24487a = ft.a(ft.GSLB_REQUEST_SUCCESS.a() + a2);
        }
        if (aVar.f24487a == null) {
            aVar.f24487a = ft.GSLB_TCP_ERR_OTHER;
        }
        if (aVar.f24487a == ft.GSLB_TCP_ERR_OTHER) {
            aVar.f387a = str;
        }
        return aVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static void m1943a(Exception exc) {
        if (exc != null) {
            return;
        }
        throw new NullPointerException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a b(Exception exc) {
        ft ftVar;
        Throwable cause;
        m1943a(exc);
        boolean z = exc instanceof hb;
        Exception exc2 = exc;
        if (z) {
            hb hbVar = (hb) exc;
            exc2 = exc;
            if (hbVar.a() != null) {
                exc2 = hbVar.a();
            }
        }
        a aVar = new a();
        String message = exc2.getMessage();
        if (exc2.getCause() != null) {
            message = exc2.getCause().getMessage();
        }
        int a2 = gs.a(exc2);
        String str = exc2.getClass().getSimpleName() + ":" + message;
        if (a2 != 0) {
            aVar.f24487a = ft.a(ft.CONN_SUCCESS.a() + a2);
            if (aVar.f24487a == ft.CONN_BOSH_ERR && (cause = exc2.getCause()) != null && (cause instanceof UnknownHostException)) {
                ftVar = ft.CONN_BOSH_UNKNOWNHOST;
            }
            if (aVar.f24487a != ft.CONN_TCP_ERR_OTHER || aVar.f24487a == ft.CONN_XMPP_ERR || aVar.f24487a == ft.CONN_BOSH_ERR) {
                aVar.f387a = str;
            }
            return aVar;
        }
        ftVar = ft.CONN_XMPP_ERR;
        aVar.f24487a = ftVar;
        if (aVar.f24487a != ft.CONN_TCP_ERR_OTHER) {
        }
        aVar.f387a = str;
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a c(Exception exc) {
        ft ftVar;
        m1943a(exc);
        boolean z = exc instanceof hb;
        Exception exc2 = exc;
        if (z) {
            hb hbVar = (hb) exc;
            exc2 = exc;
            if (hbVar.a() != null) {
                exc2 = hbVar.a();
            }
        }
        a aVar = new a();
        String message = exc2.getMessage();
        if (exc2.getCause() != null) {
            message = exc2.getCause().getMessage();
        }
        int a2 = gs.a(exc2);
        String str = exc2.getClass().getSimpleName() + ":" + message;
        if (a2 == 105) {
            ftVar = ft.BIND_TCP_READ_TIMEOUT;
        } else if (a2 == 199) {
            ftVar = ft.BIND_TCP_ERR;
        } else if (a2 == 499) {
            aVar.f24487a = ft.BIND_BOSH_ERR;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                ftVar = ft.BIND_BOSH_ITEM_NOT_FOUND;
            }
            if (aVar.f24487a != ft.BIND_TCP_ERR || aVar.f24487a == ft.BIND_XMPP_ERR || aVar.f24487a == ft.BIND_BOSH_ERR) {
                aVar.f387a = str;
            }
            return aVar;
        } else {
            ftVar = a2 != 109 ? a2 != 110 ? ft.BIND_XMPP_ERR : ft.BIND_TCP_BROKEN_PIPE : ft.BIND_TCP_CONNRESET;
        }
        aVar.f24487a = ftVar;
        if (aVar.f24487a != ft.BIND_TCP_ERR) {
        }
        aVar.f387a = str;
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a d(Exception exc) {
        ft ftVar;
        m1943a(exc);
        boolean z = exc instanceof hb;
        Exception exc2 = exc;
        if (z) {
            hb hbVar = (hb) exc;
            exc2 = exc;
            if (hbVar.a() != null) {
                exc2 = hbVar.a();
            }
        }
        a aVar = new a();
        String message = exc2.getMessage();
        int a2 = gs.a(exc2);
        String str = exc2.getClass().getSimpleName() + ":" + message;
        if (a2 == 105) {
            ftVar = ft.CHANNEL_TCP_READTIMEOUT;
        } else if (a2 == 199) {
            ftVar = ft.CHANNEL_TCP_ERR;
        } else if (a2 == 499) {
            aVar.f24487a = ft.CHANNEL_BOSH_EXCEPTION;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                ftVar = ft.CHANNEL_BOSH_ITEMNOTFIND;
            }
            if (aVar.f24487a != ft.CHANNEL_TCP_ERR || aVar.f24487a == ft.CHANNEL_XMPPEXCEPTION || aVar.f24487a == ft.CHANNEL_BOSH_EXCEPTION) {
                aVar.f387a = str;
            }
            return aVar;
        } else {
            ftVar = a2 != 109 ? a2 != 110 ? ft.CHANNEL_XMPPEXCEPTION : ft.CHANNEL_TCP_BROKEN_PIPE : ft.CHANNEL_TCP_CONNRESET;
        }
        aVar.f24487a = ftVar;
        if (aVar.f24487a != ft.CHANNEL_TCP_ERR) {
        }
        aVar.f387a = str;
        return aVar;
    }
}
