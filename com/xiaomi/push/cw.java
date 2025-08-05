package com.xiaomi.push;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.icf;

/* loaded from: classes9.dex */
public abstract class cw {

    /* loaded from: classes9.dex */
    public static class a extends cv {
        public a() {
            super(1);
        }

        @Override // com.xiaomi.push.cv
        public String a(Context context, String str, List<bf> list) {
            URL url;
            if (list == null) {
                url = new URL(str);
            } else {
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                for (bf bfVar : list) {
                    buildUpon.appendQueryParameter(bfVar.a(), bfVar.b());
                }
                url = new URL(buildUpon.toString());
            }
            return bg.a(context, url);
        }
    }

    static int a(int i, int i2) {
        return (((i2 + icf.DEFAULT_ALPHA) / 1448) * 132) + 1080 + i + i2;
    }

    static int a(int i, int i2, int i3) {
        return (((i2 + 200) / 1448) * 132) + 1011 + i2 + i + i3;
    }

    private static int a(cv cvVar, String str, List<bf> list, String str2) {
        if (cvVar.a() == 1) {
            return a(str.length(), a(str2));
        }
        if (cvVar.a() != 2) {
            return -1;
        }
        return a(str.length(), a(list), a(str2));
    }

    static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    static int a(List<bf> list) {
        int i = 0;
        for (bf bfVar : list) {
            if (!TextUtils.isEmpty(bfVar.a())) {
                i += bfVar.a().length();
            }
            if (!TextUtils.isEmpty(bfVar.b())) {
                i += bfVar.b().length();
            }
        }
        return i << 1;
    }

    public static String a(Context context, String str, List<bf> list) {
        return a(context, str, list, new a(), true);
    }

    public static String a(Context context, String str, List<bf> list, cv cvVar, boolean z) {
        co coVar;
        String str2;
        String str3;
        if (bg.b(context)) {
            try {
                ArrayList<String> arrayList = new ArrayList<>();
                if (z) {
                    co m1791a = cs.a().m1791a(str);
                    if (m1791a != null) {
                        arrayList = m1791a.a(str);
                    }
                    coVar = m1791a;
                } else {
                    coVar = null;
                }
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
                Iterator<String> it = arrayList.iterator();
                String str4 = null;
                while (it.hasNext()) {
                    String next = it.next();
                    ArrayList arrayList2 = list != null ? new ArrayList(list) : null;
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                    } catch (IOException e) {
                        e = e;
                        str2 = str4;
                    }
                    if (!cvVar.m1801a(context, next, (List<bf>) arrayList2)) {
                        break;
                    }
                    str2 = cvVar.a(context, next, (List<bf>) arrayList2);
                    try {
                    } catch (IOException e2) {
                        e = e2;
                    }
                    if (TextUtils.isEmpty(str2)) {
                        if (coVar != null) {
                            str3 = str2;
                            try {
                                coVar.a(next, System.currentTimeMillis() - currentTimeMillis, a(cvVar, next, arrayList2, str2), null);
                            } catch (IOException e3) {
                                e = e3;
                                str2 = str3;
                            }
                        } else {
                            str3 = str2;
                        }
                        str4 = str3;
                    } else if (coVar == null) {
                        return str2;
                    } else {
                        try {
                            coVar.a(next, System.currentTimeMillis() - currentTimeMillis, a(cvVar, next, arrayList2, str2));
                            return str2;
                        } catch (IOException e4) {
                            e = e4;
                        }
                    }
                    if (coVar != null) {
                        str3 = str2;
                        coVar.a(next, System.currentTimeMillis() - currentTimeMillis, a(cvVar, next, arrayList2, str2), e);
                    } else {
                        str3 = str2;
                    }
                    e.printStackTrace();
                    str4 = str3;
                }
                return str4;
            } catch (MalformedURLException e5) {
                e5.printStackTrace();
            }
        }
        return null;
    }
}
