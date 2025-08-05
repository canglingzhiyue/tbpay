package com.mobile.auth;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import com.mobile.auth.O000OO;
import com.mobile.auth.O000Oo0;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.taobao.desktop.ditto.anim.AnimConstance;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class O000O0o0 {
    private static final String O000000o = "O000O0o0";

    static /* synthetic */ String O000000o() {
        try {
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

    public static String O000000o(Context context, String str, String str2, Network network) {
        try {
            return O00000o0(context, O000OO0o.O000000o(context, str, network), str2, network);
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

    private String O000000o(Context context, String str, String str2, String str3, Network network, String str4, String str5) {
        try {
            String O00000Oo = O00000Oo();
            String O000000o2 = O000OOo0.O000000o(context, str, str2, str3, O00000Oo);
            String str6 = O000000o;
            O000000o.O000000o(str6, "request params : " + O000000o2);
            String O000000o3 = O000OO0o.O000000o(context, "https://id6.me/auth/preauth.do", O000000o2, network, str4, str5);
            String str7 = O000000o;
            O000000o.O000000o(str7, "request result : " + O000000o3);
            String O00000Oo2 = O00000Oo(context, O000000o3, O00000Oo, network);
            if (TextUtils.isEmpty(O00000Oo2)) {
                return "{\"result\":80001,\"msg\":\"请求异常\"}";
            }
            O000O0OO.O000000o(str5, O00000Oo2, O000000o2);
            return O00000Oo2;
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

    private static String O000000o(Context context, List<String> list, String str, Network network) {
        for (int i = 0; i < list.size(); i++) {
            try {
                try {
                    String str2 = list.get(i);
                    if (!TextUtils.isEmpty(list.get(i)) && context != null && Build.VERSION.SDK_INT < 21) {
                        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                        if (connectivityManager.getNetworkInfo(5).getState().compareTo(NetworkInfo.State.CONNECTED) == 0) {
                            ((Boolean) Class.forName("android.net.ConnectivityManager").getMethod("requestRouteToHost", Integer.TYPE, Integer.TYPE).invoke(connectivityManager, 5, Integer.valueOf(O000OO.O000000o(O000OO.O00000Oo(str2))))).booleanValue();
                        }
                    }
                    String O000000o2 = O000000o(context, list.get(i), str, network);
                    try {
                        JSONObject jSONObject = !TextUtils.isEmpty(O000000o2) ? new JSONObject(O000000o2) : null;
                        if (jSONObject != null && jSONObject.getInt("result") == 0) {
                            return O000000o2;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
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
        return null;
    }

    static /* synthetic */ String O000000o(O000O0o0 o000O0o0, Context context, String str, String str2, String str3, Network network, String str4, String str5) {
        try {
            return o000O0o0.O000000o(context, str, str2, str3, network, str4, str5);
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

    public static String O000000o(String str, String str2) {
        try {
            return O00000o.O00000o0(str, str2);
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

    private void O000000o(final Context context, final String str, final O000Oo0.O000000o o000000o, final int i, final O00000Oo o00000Oo) {
        try {
            final Future O00000Oo = O000Oo0.O000000o().O00000Oo(o000000o);
            O000Oo0.O000000o().O000000o(new Runnable() { // from class: com.mobile.auth.O000O0o0.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        O00000Oo.get(i, TimeUnit.MILLISECONDS);
                        if (O00000Oo == null || O00000Oo.isDone()) {
                            return;
                        }
                        O00000Oo.cancel(true);
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

    private String O00000Oo() {
        try {
            String uuid = UUID.randomUUID().toString();
            if (TextUtils.isEmpty(uuid)) {
                return "";
            }
            String replace = uuid.replace("-", "");
            return replace.length() >= 16 ? replace.substring(0, 16) : replace;
        } catch (Throwable th) {
            try {
                O000000o.O000000o(O000000o, "generateAesKey error", th);
                return "";
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

    private String O00000Oo(Context context, String str, String str2, Network network) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("result");
            String optString = jSONObject.optString("data");
            if ((optInt == 0 || optInt == 30002) && !TextUtils.isEmpty(optString)) {
                String O000000o2 = O000000o(optString, str2);
                if (!TextUtils.isEmpty(O000000o2)) {
                    try {
                        jSONObject.put("data", new JSONObject(O000000o2));
                    } catch (JSONException e) {
                        e.printStackTrace();
                        jSONObject.put("data", O000000o2);
                    }
                    if (optInt != 30002) {
                        return jSONObject.toString();
                    }
                    ArrayList arrayList = new ArrayList();
                    JSONArray optJSONArray = ((JSONObject) jSONObject.opt("data")).optJSONArray(AnimConstance.VIEW_ANIM_KEY_URLS);
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            arrayList.add(optJSONArray.getString(i));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return O000000o(context, arrayList, str2, network);
                    }
                    return null;
                }
            }
            return jSONObject.toString();
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

    private static String O00000o0(Context context, String str, String str2, Network network) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("result");
            String optString = jSONObject.optString("data");
            if (optInt == 0 && !TextUtils.isEmpty(optString)) {
                String O000000o2 = O000000o(optString, str2);
                if (!TextUtils.isEmpty(O000000o2)) {
                    try {
                        jSONObject.put("data", new JSONObject(O000000o2));
                    } catch (JSONException e) {
                        e.printStackTrace();
                        jSONObject.put("data", O000000o2);
                    }
                }
            }
            return jSONObject.toString();
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

    public void O000000o(final Context context, final String str, final String str2, final String str3, final O00000Oo o00000Oo) {
        try {
            int i = O000000o.O00000Oo <= 0 ? 10000 : O000000o.O00000Oo;
            final String O000000o2 = O000OO00.O000000o();
            final String O000000o3 = O000OO00.O000000o(context);
            O000O0OO.O000000o(O000000o2).O000000o(str).O00000Oo(O000000o3).O00000o("preauth").O00000o0(O000OOOo.O00000oo(context)).O0000Oo0(context.getPackageName());
            O000000o(context, O000000o2, new O000Oo0.O000000o() { // from class: com.mobile.auth.O000O0o0.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String O000000o4 = O000O0o0.O000000o(O000O0o0.this, context, str, str2, str3, null, O000000o3, O000000o2);
                        if (O000000o()) {
                            return;
                        }
                        O000000o.O00000Oo(context, O000000o4, O000000o2, o00000Oo);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            }, i, o00000Oo);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O00000Oo(final Context context, final String str, final String str2, final String str3, final O00000Oo o00000Oo) {
        try {
            int i = O000000o.O00000Oo <= 0 ? 10000 : O000000o.O00000Oo;
            final String O000000o2 = O000OO00.O000000o();
            final String O000000o3 = O000OO00.O000000o(context);
            O000O0OO.O000000o(O000000o2).O000000o(str).O00000Oo(O000000o3).O00000o("preauth").O00000o0(O000OOOo.O00000oo(context)).O0000Oo0(context.getPackageName());
            if (Build.VERSION.SDK_INT < 21) {
                O000000o(context, O000000o2, new O000Oo0.O000000o() { // from class: com.mobile.auth.O000O0o0.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (!new O000OO().O000000o(context, "https://id6.me/auth/preauth.do")) {
                                if (O000000o()) {
                                    return;
                                }
                                O000000o.O00000Oo(context, O000OOo.O000000o(80800, "WIFI切换超时"), O000000o2, o00000Oo);
                            } else if (O000000o()) {
                            } else {
                                String O000000o4 = O000O0o0.O000000o(O000O0o0.this, context, str, str2, str3, null, O000000o3, O000000o2);
                                if (O000000o()) {
                                    return;
                                }
                                O000000o.O00000Oo(context, O000000o4, O000000o2, o00000Oo);
                            }
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }
                }, i, o00000Oo);
                return;
            }
            O000OO o000oo = new O000OO();
            o000oo.O000000o(context, new O000OO.O000000o() { // from class: com.mobile.auth.O000O0o0.2
                private boolean O0000Oo0 = false;
                private boolean O0000Oo = false;

                @Override // com.mobile.auth.O000OO.O000000o
                public synchronized void O000000o() {
                    try {
                        this.O0000Oo0 = true;
                        if (!this.O0000Oo) {
                            O000O0OO.O000000o(O000000o2, "{\"result\":80000,\"msg\":\"请求超时\"}", "");
                            O000000o.O00000Oo(context, "{\"result\":80000,\"msg\":\"请求超时\"}", O000000o2, o00000Oo);
                        }
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } finally {
                        }
                    }
                }

                @Override // com.mobile.auth.O000OO.O000000o
                public synchronized void O000000o(int i2, String str4, long j) {
                    try {
                        if (!this.O0000Oo0 && !this.O0000Oo) {
                            this.O0000Oo = true;
                            O0000o O000000o4 = O000O0OO.O000000o(O000000o2);
                            O000000o4.O0000OOo("switchToMobile_L  onFail()  expendTime : " + j).O000000o(i2).O00000oo(str4).O00000Oo(j);
                            O000000o.O00000Oo(context, O000OOo.O000000o(i2, str4), O000000o2, o00000Oo);
                            String O000000o5 = O000O0o0.O000000o();
                            O000000o.O000000o(O000000o5, "Switching network failed (L), errorMsg :" + str4 + " , expendTime ：" + j);
                        }
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } finally {
                        }
                    }
                }

                @Override // com.mobile.auth.O000OO.O000000o
                public void O000000o(Network network, long j) {
                    try {
                        String O000000o4 = O000O0o0.O000000o();
                        O000000o.O000000o(O000000o4, "Switching network successfully (L) , expendTime ：" + j);
                        if (!this.O0000Oo0 && !this.O0000Oo) {
                            O000O0OO.O000000o(O000000o2).O00000Oo(j);
                            String O000000o5 = O000O0o0.O000000o(O000O0o0.this, context, str, str2, str3, network, O000000o3, O000000o2);
                            synchronized (this) {
                                if (!this.O0000Oo0 && !this.O0000Oo) {
                                    this.O0000Oo = true;
                                    O000000o.O00000Oo(context, O000000o5, O000000o2, o00000Oo);
                                }
                            }
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
            o000oo.O000000o(i);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
