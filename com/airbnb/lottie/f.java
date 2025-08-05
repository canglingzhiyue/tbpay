package com.airbnb.lottie;

import android.content.Context;
import android.support.v4.os.TraceCompat;
import com.airbnb.lottie.network.b;
import java.io.File;
import tb.aip;
import tb.akh;

/* loaded from: classes2.dex */
public class f {
    public static final String TAG = "LOTTIE";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f1742a = false;
    private static boolean b = false;
    private static String[] c;
    private static long[] d;
    private static int e;
    private static int f;
    private static com.airbnb.lottie.network.c g;
    private static b h;
    private static volatile com.airbnb.lottie.network.e i;
    private static volatile com.airbnb.lottie.network.d j;

    public static com.airbnb.lottie.network.e a(Context context) {
        com.airbnb.lottie.network.e eVar = i;
        if (eVar == null) {
            synchronized (com.airbnb.lottie.network.e.class) {
                eVar = i;
                if (eVar == null) {
                    eVar = new com.airbnb.lottie.network.e(b(context), g != null ? g : new aip());
                    i = eVar;
                }
            }
        }
        return eVar;
    }

    public static void a(String str) {
        if (!b) {
            return;
        }
        int i2 = e;
        if (i2 == 20) {
            f++;
            return;
        }
        c[i2] = str;
        d[i2] = System.nanoTime();
        TraceCompat.beginSection(str);
        e++;
    }

    public static float b(String str) {
        int i2 = f;
        if (i2 > 0) {
            f = i2 - 1;
            return 0.0f;
        } else if (!b) {
            return 0.0f;
        } else {
            int i3 = e - 1;
            e = i3;
            if (i3 == -1) {
                akh.c("Can't end trace section. There are none.");
                return 0.0f;
            } else if (str.equals(c[e])) {
                TraceCompat.endSection();
                return ((float) (System.nanoTime() - d[e])) / 1000000.0f;
            } else {
                akh.c("Unbalanced trace call " + str + ". Expected " + c[e] + ".");
                return 0.0f;
            }
        }
    }

    public static com.airbnb.lottie.network.d b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        com.airbnb.lottie.network.d dVar = j;
        if (dVar == null) {
            synchronized (com.airbnb.lottie.network.d.class) {
                dVar = j;
                if (dVar == null) {
                    dVar = new com.airbnb.lottie.network.d(h != null ? h : new b() { // from class: com.airbnb.lottie.f.1
                        @Override // com.airbnb.lottie.network.b
                        public File a() {
                            return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                        }
                    });
                    j = dVar;
                }
            }
        }
        return dVar;
    }
}
