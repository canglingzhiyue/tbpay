package com.mobile.auth;

import android.content.Context;
import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class O000O0OO {
    private static final String O000000o = "O000O0OO";
    private static int O00000Oo;
    private static Map<String, O0000o> O00000o0 = new HashMap();
    private static List<String> O00000o = new ArrayList();

    public static synchronized O0000o O000000o(String str) {
        O0000o o0000o;
        synchronized (O000O0OO.class) {
            try {
                o0000o = O00000o0.containsKey(str) ? O00000o0.get(str) : null;
                if (o0000o == null) {
                    o0000o = new O0000o(str);
                    O00000o0.put(str, o0000o);
                }
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    return new O0000o(str);
                } catch (Throwable th2) {
                    try {
                        ExceptionProcessor.processException(th2);
                        return null;
                    } catch (Throwable th3) {
                        ExceptionProcessor.processException(th3);
                        return null;
                    }
                }
            }
        }
        return o0000o;
    }

    static /* synthetic */ void O000000o(Context context) {
        try {
            O00000Oo(context);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static void O000000o(final Context context, String str) {
        try {
            synchronized (O000O0OO.class) {
                if (O00000o0.containsKey(str)) {
                    O00000o.add(O00000o0.get(str).toString());
                    O00000o0.remove(str);
                }
                if (O00000Oo != 1 && !O00000o.isEmpty()) {
                    O00000Oo = 1;
                    new Timer().schedule(new TimerTask() { // from class: com.mobile.auth.O000O0OO.1
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            try {
                                O000O0OO.O000000o(context);
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                }
                            }
                        }
                    }, 8000L);
                }
            }
        } catch (Throwable th) {
            try {
                th.printStackTrace();
            } catch (Throwable th2) {
                try {
                    ExceptionProcessor.processException(th2);
                } catch (Throwable th3) {
                    ExceptionProcessor.processException(th3);
                }
            }
        }
    }

    public static void O000000o(String str, String str2, String str3) {
        int i = -1;
        String str4 = "";
        try {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    JSONObject jSONObject = new JSONObject(str2);
                    i = jSONObject.getInt("result");
                    str4 = jSONObject.optString("msg");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (i == 0) {
                O000000o(str).O000000o(i).O00000oo(str4);
            } else {
                O000000o(str).O000000o(i).O00000oo(str4).O00000oO(str3);
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private static void O00000Oo(Context context) {
        if (context == null) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            synchronized (O000O0OO.class) {
                arrayList.addAll(O00000o);
                O00000Oo = 0;
                O00000o.clear();
            }
            if (arrayList.isEmpty()) {
                return;
            }
            O000O00o.O000000o(context, arrayList);
        } catch (Throwable th) {
            try {
                th.printStackTrace();
            } catch (Throwable th2) {
                try {
                    ExceptionProcessor.processException(th2);
                } catch (Throwable th3) {
                    ExceptionProcessor.processException(th3);
                }
            }
        }
    }

    public static void O00000Oo(Context context, String str) {
        try {
            O000O00o.O000000o(context, str);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
