package com.taobao.android.address;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.model.RecommendedAddress;
import com.taobao.android.nav.Nav;
import org.json.JSONObject;
import tb.gvl;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REQUEST_GLOBAL_RECOMMEND_ADDRESS = 2001;

    /* renamed from: a  reason: collision with root package name */
    public static String f8967a;
    private static c b;
    private static a c;

    public static RecommendedAddress a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecommendedAddress) ipChange.ipc$dispatch("d9f7e58e", new Object[]{context, str}) : a(context, str, (String) null);
    }

    public static RecommendedAddress a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecommendedAddress) ipChange.ipc$dispatch("b96367d8", new Object[]{context, str, str2});
        }
        b(context);
        return b.a(str);
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1da50fb7", new Object[]{context, str}) : b(context, str, null);
    }

    public static String b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3b17b6d", new Object[]{context, str, str2});
        }
        b(context);
        return b.b(str);
    }

    public static void a(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{context, str, str2, str3});
        } else {
            a(context, str, str2, str3, (String) null);
        }
    }

    public static void a(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fc7488", new Object[]{context, str, str2, str3, str4});
            return;
        }
        b(context);
        b.a(context, str, str2, str3, str4, (a) null);
    }

    public static void a(Context context, String str, String str2, boolean z, String str3, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76458426", new Object[]{context, str, str2, new Boolean(z), str3, aVar});
            return;
        }
        b(context);
        b.a(context, str, str2, "nativeInvoke", z, str3, aVar);
    }

    public static void a(Context context, String str, String str2, String str3, boolean z, String str4, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba4fe49c", new Object[]{context, str, str2, str3, new Boolean(z), str4, aVar});
            return;
        }
        b(context);
        b.a(context, str, str2, str3, z, str4, aVar);
    }

    public static void a(Context context, String str, String str2, String str3, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f2a7dba", new Object[]{context, str, str2, str3, aVar});
        } else {
            a(context, str, str2, str3, (String) null, aVar);
        }
    }

    public static void a(Context context, String str, String str2, String str3, String str4, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb73684", new Object[]{context, str, str2, str3, str4, aVar});
            return;
        }
        c = aVar;
        b(context);
        Nav.from(context).forResult(2001).toUri(gvl.a(context, "http://my.m.taobao.com/deliver/switch_address.htm?bizIdentity=" + str + "&bizScene=" + str3 + "&channel=" + str2));
    }

    public static void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{new Integer(i), new Integer(i2), intent});
        } else if (i2 != -1) {
            if (i2 == 0) {
                a aVar = c;
                if (aVar == null) {
                    return;
                }
                aVar.a(-1, "cancel");
                return;
            }
            a aVar2 = c;
            if (aVar2 == null) {
                return;
            }
            aVar2.a(-2, "");
        } else if (intent != null) {
            c cVar = b;
            if (cVar != null) {
                cVar.a(intent.getStringExtra("bizIdentity"), intent.getStringExtra("type"), intent.getStringExtra("data"));
            }
            a aVar3 = c;
            if (aVar3 == null) {
                return;
            }
            aVar3.a(intent.getStringExtra("data"));
        } else if (TextUtils.isEmpty(f8967a)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(f8967a);
                if (b != null) {
                    b.a(jSONObject.optString("bizIdentity"), jSONObject.optString("type"), jSONObject.optString("data"));
                }
                if (c != null) {
                    c.a(jSONObject.optString("data"));
                }
                f8967a = "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        b(context);
        b.a();
    }

    public static void a(Context context, String str, String str2, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9ae9aa", new Object[]{context, str, str2, new Boolean(z), str3});
            return;
        }
        b(context);
        b.a(str, str2, z, str3);
    }

    public static void c(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5ecf9b2", new Object[]{context, str, str2});
            return;
        }
        b(context);
        b.a(context, str, str2);
    }

    private static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else if (b != null) {
        } else {
            b = new c(context);
        }
    }
}
