package com.mobile.auth;

import android.content.Context;
import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.net.URLEncoder;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class O000O00o {
    private static final String O000000o = "O000O00o";
    private static final byte[] O00000Oo = {15, 31, 94, 10, 90, 15, 91, 24, 10, 30, 88, 7, 89, 10, 95, 30};

    static /* synthetic */ String O000000o(Context context, Queue queue) {
        try {
            return O00000Oo(context, queue);
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

    static /* synthetic */ Queue O000000o(Context context, List list, int i) {
        try {
            return O00000o0(context, list, i);
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

    static /* synthetic */ void O000000o(Context context) {
        try {
            O00000o0(context);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private static void O000000o(Context context, int i) {
        try {
            try {
                O000O0o.O000000o(context, "key_c_l_l_v", i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void O000000o(android.content.Context r6, java.lang.String r7) {
        /*
            int r0 = r7.hashCode()     // Catch: java.lang.Throwable -> L44
            r1 = 64897(0xfd81, float:9.094E-41)
            r2 = 2
            r3 = 1
            r4 = -1
            r5 = 0
            if (r0 == r1) goto L2c
            r1 = 78159(0x1314f, float:1.09524E-40)
            if (r0 == r1) goto L22
            r1 = 66247144(0x3f2d9e8, float:1.42735105E-36)
            if (r0 == r1) goto L18
            goto L36
        L18:
            java.lang.String r0 = "ERROR"
            boolean r7 = r7.equals(r0)     // Catch: java.lang.Throwable -> L44
            if (r7 == 0) goto L36
            r7 = 1
            goto L37
        L22:
            java.lang.String r0 = "OFF"
            boolean r7 = r7.equals(r0)     // Catch: java.lang.Throwable -> L44
            if (r7 == 0) goto L36
            r7 = 2
            goto L37
        L2c:
            java.lang.String r0 = "ALL"
            boolean r7 = r7.equals(r0)     // Catch: java.lang.Throwable -> L44
            if (r7 == 0) goto L36
            r7 = 0
            goto L37
        L36:
            r7 = -1
        L37:
            if (r7 == 0) goto L3d
            if (r7 == r3) goto L40
            if (r7 == r2) goto L3f
        L3d:
            r4 = 0
            goto L40
        L3f:
            r4 = -2
        L40:
            O000000o(r6, r4)     // Catch: java.lang.Throwable -> L44
            goto L4d
        L44:
            r6 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r6)     // Catch: java.lang.Throwable -> L49
            return
        L49:
            r6 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r6)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.O000O00o.O000000o(android.content.Context, java.lang.String):void");
    }

    public static void O000000o(Context context, List<String> list) {
        try {
            int O00000Oo2 = O00000Oo(context);
            if (O00000Oo2 == -2) {
                return;
            }
            O00000Oo(context, list, O00000Oo2);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ void O000000o(Context context, Queue queue, int i) {
        try {
            O00000Oo(context, queue, i);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private static int O00000Oo(Context context) {
        try {
            return O000O0o.O00000Oo(context, "key_c_l_l_v", 0);
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                return 0;
            } catch (Throwable th2) {
                try {
                    ExceptionProcessor.processException(th2);
                    return -1;
                } catch (Throwable th3) {
                    ExceptionProcessor.processException(th3);
                    return -1;
                }
            }
        }
    }

    private static String O00000Oo(Context context, String str) {
        try {
            return O0000o0.O000000o(context, "https://api-e189.21cn.com/gw/client/accountMsg.do", str);
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

    private static String O00000Oo(Context context, Queue<String> queue) {
        try {
            JSONArray jSONArray = new JSONArray();
            String jSONArray2 = jSONArray.toString();
            if (!queue.isEmpty()) {
                for (String str : queue) {
                    try {
                        jSONArray.put(new JSONObject(str));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            if (jSONArray.length() <= 0) {
                return "";
            }
            String jSONArray3 = jSONArray.toString();
            if (!TextUtils.isEmpty(jSONArray3)) {
                try {
                    jSONArray2 = URLEncoder.encode(O0000O0o.O000000o(O00000o.O00000Oo(jSONArray3, O0000o00.O000000o(O00000Oo))), "UTF-8");
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return O00000Oo(context, jSONArray2);
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

    private static void O00000Oo(final Context context, final List<String> list, final int i) {
        try {
            O000Oo0.O000000o().O000000o(new Runnable() { // from class: com.mobile.auth.O000O00o.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Queue O000000o2 = O000O00o.O000000o(context, list, i);
                        if (O000000o2.isEmpty()) {
                            return;
                        }
                        String O000000o3 = O000O00o.O000000o(context, O000000o2);
                        JSONObject jSONObject = null;
                        int i2 = -1;
                        try {
                            if (!TextUtils.isEmpty(O000000o3)) {
                                JSONObject jSONObject2 = new JSONObject(O000000o3);
                                try {
                                    i2 = jSONObject2.getInt("code");
                                    jSONObject = jSONObject2;
                                } catch (Exception e) {
                                    e = e;
                                    jSONObject = jSONObject2;
                                    e.printStackTrace();
                                    if (jSONObject != null) {
                                    }
                                    O000O00o.O000000o(context, O000000o2, i);
                                    return;
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                        if (jSONObject != null || i2 != 0) {
                            O000O00o.O000000o(context, O000000o2, i);
                            return;
                        }
                        O000O00o.O000000o(context);
                        O000000o2.clear();
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
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private static void O00000Oo(Context context, Queue<String> queue, int i) {
        JSONObject jSONObject;
        try {
            String str = "";
            JSONArray jSONArray = new JSONArray();
            if (queue != null && !queue.isEmpty()) {
                int i2 = 0;
                for (String str2 : queue) {
                    try {
                        jSONObject = new JSONObject(str2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (i != -1 || jSONObject.getInt("rt") != 0) {
                        jSONArray.put(jSONObject);
                        i2++;
                        if (i2 > 10) {
                            break;
                        }
                    }
                }
            }
            if (jSONArray.length() > 0) {
                try {
                    str = O00000o.O000000o(jSONArray.toString(), O0000o00.O000000o(O00000Oo));
                } catch (Exception e2) {
                    str = null;
                    e2.printStackTrace();
                }
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            O00oOooO.O000000o(context, str);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private static synchronized Queue<String> O00000o0(Context context, List<String> list, int i) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        synchronized (O000O00o.class) {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
            String O000000o2 = O00oOooO.O000000o(context);
            if (!TextUtils.isEmpty(O000000o2)) {
                try {
                    JSONArray jSONArray = new JSONArray(O00000o.O00000o0(O000000o2, O0000o00.O000000o(O00000Oo)));
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length && i2 <= 10; i2++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        if (jSONObject != null) {
                            concurrentLinkedQueue.add(jSONObject.toString());
                        }
                    }
                    O00oOooO.O000000o(context, "");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (i == -1) {
                for (String str : list) {
                    try {
                        if (new JSONObject(str).getInt("rt") != 0) {
                            concurrentLinkedQueue.add(str);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            } else if (i == 0) {
                concurrentLinkedQueue.addAll(list);
            }
            while (concurrentLinkedQueue.size() > 10) {
                concurrentLinkedQueue.poll();
            }
        }
        return concurrentLinkedQueue;
    }

    private static void O00000o0(Context context) {
        try {
            O00oOooO.O000000o(context, "");
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
