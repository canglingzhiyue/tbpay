package com.mobile.auth;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.PnsLoggerHandler;
import com.mobile.auth.gatewayauth.model.ConfigRule;
import com.mobile.auth.gatewayauth.model.pns_vendor_query.LimitedInfo;
import com.mobile.auth.gatewayauth.model.pns_vendor_query.UploadRB;
import com.nirvana.tools.logger.model.ACMLimitConfig;
import com.nirvana.tools.logger.model.b;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import tb.cef;
import tb.czt;

/* loaded from: classes4.dex */
public class OO0oO {
    private static volatile OO0oO O000000o;
    private czt O00000Oo;
    private boolean O00000o;
    private boolean O00000o0;
    private OO0O00o O00000oO;
    private HandlerThread O00000oo;
    private Handler O0000O0o;
    private volatile PnsLoggerHandler O0000OOo;
    private List<b> O0000Oo0;

    private OO0oO() {
        this.O00000o0 = false;
        this.O00000o = false;
        this.O00000oo = null;
        this.O0000O0o = null;
        this.O0000Oo0 = new ArrayList();
        this.O00000oo = new HandlerThread("PnsLoggerThread");
        this.O00000oo.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.mobile.auth.OO0oO.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
            }
        });
        this.O00000oo.start();
        this.O0000O0o = new Handler(this.O00000oo.getLooper());
    }

    public OO0oO(final Context context) {
        this();
        this.O0000O0o.post(new Runnable() { // from class: com.mobile.auth.OO0oO.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    OO0O0O oo0o0o = new OO0O0O();
                    OO0oO.O000000o(OO0oO.this, new OO0O0OO());
                    OO0oO.O000000o(OO0oO.this).O000000o(oo0o0o);
                    OO0oO.O000000o(OO0oO.this, new czt(context, OO0oO.O000000o(OO0oO.this)));
                    OO0oO.O00000Oo(OO0oO.this).a(1);
                    OO0oO.O00000Oo(OO0oO.this).a(1L);
                    OO0oO.O00000Oo(OO0oO.this).b(100);
                    OO0oO.O00000Oo(OO0oO.this).c(0);
                    cef.a(true);
                } catch (Throwable th) {
                    try {
                        ExceptionProcessor.processException(th);
                    } catch (Throwable th2) {
                        ExceptionProcessor.processException(th2);
                    }
                }
            }
        });
    }

    static /* synthetic */ OO0O00o O000000o(OO0oO oO0oO) {
        try {
            return oO0oO.O00000oO;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    static /* synthetic */ OO0O00o O000000o(OO0oO oO0oO, OO0O00o oO0O00o) {
        try {
            oO0oO.O00000oO = oO0O00o;
            return oO0O00o;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static OO0oO O000000o(Context context) {
        try {
            if (O000000o == null) {
                synchronized (OO0oO.class) {
                    if (O000000o == null && context != null) {
                        O000000o = new OO0oO(context);
                    }
                }
            }
            return O000000o;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    static /* synthetic */ String O000000o(OO0oO oO0oO, String[] strArr) {
        try {
            return oO0oO.O00000oO(strArr);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    static /* synthetic */ List O000000o(OO0oO oO0oO, List list) {
        try {
            oO0oO.O0000Oo0 = list;
            return list;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    static /* synthetic */ czt O000000o(OO0oO oO0oO, czt cztVar) {
        try {
            oO0oO.O00000Oo = cztVar;
            return cztVar;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    static /* synthetic */ boolean O000000o(OO0oO oO0oO, boolean z) {
        try {
            oO0oO.O00000o = z;
            return z;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    static /* synthetic */ czt O00000Oo(OO0oO oO0oO) {
        try {
            return oO0oO.O00000Oo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    static /* synthetic */ boolean O00000Oo(OO0oO oO0oO, boolean z) {
        try {
            oO0oO.O00000o0 = z;
            return z;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    static /* synthetic */ boolean O00000o(OO0oO oO0oO) {
        try {
            return oO0oO.O00000o0;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    static /* synthetic */ PnsLoggerHandler O00000o0(OO0oO oO0oO) {
        try {
            return oO0oO.O0000OOo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private String O00000oO(String... strArr) {
        if (strArr != null) {
            try {
                if (strArr.length != 0) {
                    if (strArr.length == 1) {
                        return strArr[0];
                    }
                    StringBuilder sb = new StringBuilder();
                    for (String str : strArr) {
                        sb.append(str);
                    }
                    return sb.toString();
                }
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
        return null;
    }

    static /* synthetic */ List O00000oO(OO0oO oO0oO) {
        try {
            return oO0oO.O0000Oo0;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public void O000000o() {
        try {
            this.O0000O0o.post(new Runnable() { // from class: com.mobile.auth.OO0oO.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (OO0oO.O00000o(OO0oO.this)) {
                            return;
                        }
                        if (OO0oO.O00000oO(OO0oO.this) != null && OO0oO.O00000oO(OO0oO.this).size() > 0) {
                            OO0oO.O00000Oo(OO0oO.this).a(OO0oO.O00000oO(OO0oO.this));
                            OO0oO.O00000oO(OO0oO.this).clear();
                            OO0oO.this.O00000Oo("CacheMonitor:", "uploadMonitor and clear");
                        }
                        OO0oO.O00000Oo(OO0oO.this).b();
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O000000o(PnsLoggerHandler pnsLoggerHandler) {
        try {
            this.O0000OOo = pnsLoggerHandler;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O000000o(final ConfigRule configRule) {
        try {
            this.O0000O0o.post(new Runnable() { // from class: com.mobile.auth.OO0oO.3
                /* JADX WARN: Removed duplicated region for block: B:40:0x00ee A[Catch: Throwable -> 0x010c, TryCatch #0 {Throwable -> 0x010c, blocks: (B:3:0x0003, B:5:0x0007, B:8:0x0011, B:10:0x0051, B:11:0x005a, B:31:0x00c2, B:33:0x00ce, B:36:0x00db, B:38:0x00e6, B:40:0x00ee, B:42:0x0101, B:41:0x00f8, B:37:0x00e1, B:12:0x005e, B:14:0x0064, B:17:0x006b, B:18:0x007b, B:20:0x0081, B:22:0x0093, B:24:0x0099, B:25:0x009e, B:27:0x00aa, B:29:0x00b0, B:30:0x00b8), top: B:51:0x0003 }] */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00f8 A[Catch: Throwable -> 0x010c, TryCatch #0 {Throwable -> 0x010c, blocks: (B:3:0x0003, B:5:0x0007, B:8:0x0011, B:10:0x0051, B:11:0x005a, B:31:0x00c2, B:33:0x00ce, B:36:0x00db, B:38:0x00e6, B:40:0x00ee, B:42:0x0101, B:41:0x00f8, B:37:0x00e1, B:12:0x005e, B:14:0x0064, B:17:0x006b, B:18:0x007b, B:20:0x0081, B:22:0x0093, B:24:0x0099, B:25:0x009e, B:27:0x00aa, B:29:0x00b0, B:30:0x00b8), top: B:51:0x0003 }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 278
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.OO0oO.AnonymousClass3.run():void");
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O000000o(final UploadRB uploadRB) {
        try {
            this.O0000O0o.post(new Runnable() { // from class: com.mobile.auth.OO0oO.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (uploadRB != null && uploadRB.getAlibaba_aliqin_psc_info_upload_response() != null && uploadRB.getAlibaba_aliqin_psc_info_upload_response().getResult() != null && uploadRB.getAlibaba_aliqin_psc_info_upload_response().getResult().getModule() != null && uploadRB.getAlibaba_aliqin_psc_info_upload_response().getResult().getModule().getLimited_info() != null) {
                            LimitedInfo limited_info = uploadRB.getAlibaba_aliqin_psc_info_upload_response().getResult().getModule().getLimited_info();
                            OO0oO.O00000Oo(OO0oO.this).a(ACMLimitConfig.newACMLimitConfig().a("true".equals(limited_info.getIs_limited())).a(limited_info.getLimit_count()).b(limited_info.getLimit_time_hour()).a());
                        }
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O000000o(final String str, final int i) {
        try {
            this.O0000O0o.post(new Runnable() { // from class: com.mobile.auth.OO0oO.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        PnsLoggerHandler O00000o0 = OO0oO.O00000o0(OO0oO.this);
                        if (O00000o0 != null) {
                            O00000o0.monitor(str);
                        }
                        OO0oO.this.O00000Oo("CacheMonitor:", str, "\n Urgency ", String.valueOf(i));
                        if (OO0oO.O00000o(OO0oO.this)) {
                            return;
                        }
                        if (OO0oO.O00000oO(OO0oO.this) == null) {
                            OO0oO.O000000o(OO0oO.this, new ArrayList());
                        }
                        b bVar = new b(i);
                        bVar.a(str);
                        OO0oO.O00000oO(OO0oO.this).add(bVar);
                        if (OO0oO.O00000oO(OO0oO.this).size() < 5) {
                            return;
                        }
                        OO0oO.O00000Oo(OO0oO.this).a(OO0oO.O00000oO(OO0oO.this));
                        OO0oO.O00000oO(OO0oO.this).clear();
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O000000o(final String... strArr) {
        try {
            this.O0000O0o.post(new Runnable() { // from class: com.mobile.auth.OO0oO.9
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String O000000o2 = OO0oO.O000000o(OO0oO.this, strArr);
                        PnsLoggerHandler O00000o0 = OO0oO.O00000o0(OO0oO.this);
                        if (O00000o0 != null) {
                            O00000o0.info(O000000o2);
                        }
                        com.mobile.auth.gatewayauth.utils.O0000Oo0.O00000o(O000000o2);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O00000Oo() {
        try {
            this.O0000O0o.post(new Runnable() { // from class: com.mobile.auth.OO0oO.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (OO0oO.O00000o(OO0oO.this)) {
                            return;
                        }
                        if (OO0oO.O00000oO(OO0oO.this) != null && OO0oO.O00000oO(OO0oO.this).size() > 0) {
                            OO0oO.O00000Oo(OO0oO.this).a(OO0oO.O00000oO(OO0oO.this));
                            OO0oO.O00000oO(OO0oO.this).clear();
                            OO0oO.this.O00000Oo("CacheMonitor:", "uploadFailedMonitor and clear");
                        }
                        OO0oO.O00000Oo(OO0oO.this).a();
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O00000Oo(final String... strArr) {
        try {
            this.O0000O0o.post(new Runnable() { // from class: com.mobile.auth.OO0oO.10
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String O000000o2 = OO0oO.O000000o(OO0oO.this, strArr);
                        PnsLoggerHandler O00000o0 = OO0oO.O00000o0(OO0oO.this);
                        if (O00000o0 != null) {
                            O00000o0.debug(O000000o2);
                        }
                        com.mobile.auth.gatewayauth.utils.O0000Oo0.O000000o(O000000o2);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O00000o(final String... strArr) {
        try {
            this.O0000O0o.post(new Runnable() { // from class: com.mobile.auth.OO0oO.12
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String O000000o2 = OO0oO.O000000o(OO0oO.this, strArr);
                        PnsLoggerHandler O00000o0 = OO0oO.O00000o0(OO0oO.this);
                        if (O00000o0 != null) {
                            O00000o0.error(O000000o2);
                        }
                        com.mobile.auth.gatewayauth.utils.O0000Oo0.O00000o0(O000000o2);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O00000o0() {
        try {
            this.O0000O0o.post(new Runnable() { // from class: com.mobile.auth.OO0oO.6
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        OO0oO.this.O00000Oo("deleteMonitor:", "delete unupload Monitor");
                        OO0oO.O00000Oo(OO0oO.this).d(2);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O00000o0(final String... strArr) {
        try {
            this.O0000O0o.post(new Runnable() { // from class: com.mobile.auth.OO0oO.11
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String O000000o2 = OO0oO.O000000o(OO0oO.this, strArr);
                        PnsLoggerHandler O00000o0 = OO0oO.O00000o0(OO0oO.this);
                        if (O00000o0 != null) {
                            O00000o0.warning(O000000o2);
                        }
                        com.mobile.auth.gatewayauth.utils.O0000Oo0.O00000Oo(O000000o2);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
