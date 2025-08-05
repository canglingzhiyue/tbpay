package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.TimingLogger;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import tb.jkk;

/* loaded from: classes6.dex */
public class jkl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile jkl f29601a;
    private final Context b;
    private final jkk c;
    private int e = 0;
    private final LruCache<String, JSONObject> d = new LruCache<>(8);

    static {
        kge.a(130621594);
    }

    public static /* synthetic */ LruCache a(jkl jklVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LruCache) ipChange.ipc$dispatch("163dea9e", new Object[]{jklVar}) : jklVar.d;
    }

    public static /* synthetic */ jko a(jkl jklVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jko) ipChange.ipc$dispatch("252f38db", new Object[]{jklVar, str, new Boolean(z)}) : jklVar.a(str, z);
    }

    public static /* synthetic */ jko a(jkl jklVar, jkn jknVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jko) ipChange.ipc$dispatch("69ac01c8", new Object[]{jklVar, jknVar, new Boolean(z), new Boolean(z2)}) : jklVar.a(jknVar, z, z2);
    }

    public static /* synthetic */ void a(jkl jklVar, jkn jknVar, jko jkoVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5527e202", new Object[]{jklVar, jknVar, jkoVar, new Boolean(z)});
        } else {
            jklVar.a(jknVar, jkoVar, z);
        }
    }

    private jkl(Context context) {
        this.b = context.getApplicationContext();
        this.c = new jkk.a().a(context).b("trade_template_db").a("trade_template").a(8).a(4194304L).a(false).a();
    }

    public static jkl a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jkl) ipChange.ipc$dispatch("34c5143b", new Object[]{context});
        }
        if (f29601a == null) {
            synchronized (jkl.class) {
                if (f29601a == null) {
                    f29601a = new jkl(context);
                }
            }
        }
        return f29601a;
    }

    public HashMap<String, jko> a(final ArrayList<jkn> arrayList, final boolean z) {
        jko jkoVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c1d961b5", new Object[]{this, arrayList, new Boolean(z)});
        }
        TimingLogger timingLogger = new TimingLogger("TemplateManager", "[sendMultiTemplateRequests]");
        HashMap<String, jko> hashMap = new HashMap<>(arrayList.size());
        int size = arrayList.size();
        b[] bVarArr = new b[size];
        for (int i = 0; i < size; i++) {
            bVarArr[i] = new b(this);
            b.a(bVarArr[i], arrayList.get(i));
            b.a(bVarArr[i], z);
            bVarArr[i].executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
        for (int i2 = 0; i2 < size; i2++) {
            try {
                if (bVarArr[i2].get() != null) {
                    hashMap.put(arrayList.get(i2).f29607a, bVarArr[i2].get());
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        timingLogger.addSplit("work: fetch multiple templates");
        timingLogger.dumpToLog();
        if (hashMap.size() == size) {
            return hashMap;
        }
        hashMap.clear();
        AsyncTask[] asyncTaskArr = new AsyncTask[size];
        for (final int i3 = 0; i3 < size; i3++) {
            asyncTaskArr[i3] = new AsyncTask<Void, Void, jko>() { // from class: tb.jkl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [tb.jko, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ jko doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                public jko a(Void... voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (jko) ipChange2.ipc$dispatch("d68aeb24", new Object[]{this, voidArr}) : jkl.a(jkl.this, ((jkn) arrayList.get(i3)).c, z);
                }
            };
            asyncTaskArr[i3].executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
        for (int i4 = 0; i4 < size; i4++) {
            try {
                jkoVar = (jko) asyncTaskArr[i4].get();
            } catch (Exception unused2) {
            }
            if (jkoVar == null) {
                return null;
            }
            jkoVar.c = true;
            hashMap.put(arrayList.get(i4).f29607a, jkoVar);
        }
        timingLogger.addSplit("work: degrade to read default templates");
        timingLogger.dumpToLog();
        return hashMap;
    }

    public void a(jkk.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bb8e850", new Object[]{this, bVar});
        } else {
            this.c.j = bVar;
        }
    }

    private jko a(jkn jknVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jko) ipChange.ipc$dispatch("2a184e6d", new Object[]{this, jknVar, new Boolean(z), new Boolean(z2)});
        }
        if (jknVar == null) {
            return null;
        }
        String.format("[sendTemplateRequest] template id: %s, default template Id: %s, toJSONObject: %s", jknVar.f29607a, jknVar.b, Boolean.valueOf(z));
        jko jkoVar = new jko();
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            jkoVar.b = this.d.remove(jknVar.f29607a);
            long currentTimeMillis2 = System.currentTimeMillis();
            jkoVar.d = 5;
            jkoVar.e = currentTimeMillis2 - currentTimeMillis;
            if (jkoVar.b != null) {
                b(jknVar);
                return jkoVar;
            }
        }
        a(jknVar);
        a(jknVar, jkoVar, z);
        if (jkoVar.f29608a != null || jkoVar.b != null) {
            b(jknVar);
            return jkoVar;
        } else if (!z2) {
            return null;
        } else {
            return a(jknVar.c, z);
        }
    }

    private void a(jkn jknVar) {
        jko a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8d746b", new Object[]{this, jknVar});
        } else if (jknVar.f29607a == null || !jknVar.f29607a.equals(jknVar.b) || this.c.i.get(jknVar.f29607a) != null || (a2 = a(jknVar.c, false)) == null || a2.f29608a == null) {
        } else {
            this.c.i.put(jknVar.f29607a, a2.f29608a.getBytes());
        }
    }

    private jko a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jko) ipChange.ipc$dispatch("5f2e55d6", new Object[]{this, str, new Boolean(z)});
        }
        jko jkoVar = new jko();
        jkoVar.d = 4;
        long currentTimeMillis = System.currentTimeMillis();
        String a2 = a(str);
        jkoVar.f = System.currentTimeMillis() - currentTimeMillis;
        if (a2 == null || a2.isEmpty()) {
            return null;
        }
        if (z) {
            try {
                long currentTimeMillis2 = System.currentTimeMillis();
                jkoVar.b = JSON.parseObject(a2);
                jkoVar.h = System.currentTimeMillis() - currentTimeMillis2;
            } catch (Exception unused) {
            }
        }
        jkoVar.f29608a = a2;
        return jkoVar;
    }

    private void a(jkn jknVar, jko jkoVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15942ea7", new Object[]{this, jknVar, jkoVar, new Boolean(z)});
            return;
        }
        jkm jkmVar = new jkm();
        byte[] a2 = this.c.a(jknVar.f29607a, b(jknVar.f29607a), jkmVar);
        jkoVar.a(jkmVar);
        if (a2 == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a3 = a(a2, "UTF-8");
        if (a3 != null) {
            if (z) {
                try {
                    jkoVar.b = JSON.parseObject(a3);
                } catch (Exception unused) {
                }
            } else {
                jkoVar.f29608a = a3;
            }
        }
        jkoVar.h = System.currentTimeMillis() - currentTimeMillis;
    }

    private String a(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edf8ea87", new Object[]{this, bArr, str});
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
        if (r4 == null) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(java.lang.String r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.jkl.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            r2 = 1
            r1[r2] = r7
            java.lang.String r7 = "9f352ae"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L18:
            r0 = 0
            android.content.Context r1 = r6.b     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4e
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4e
            java.io.InputStream r7 = com.taobao.codetrack.sdk.assets.AssetsDelegate.proxy_open(r1, r7)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4e
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r1]     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L46
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L46
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L46
        L2c:
            int r1 = r7.read(r3)     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L74
            r5 = -1
            if (r1 == r5) goto L37
            r4.write(r3, r2, r1)     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L74
            goto L2c
        L37:
            if (r7 == 0) goto L3c
            r7.close()     // Catch: java.lang.Throwable -> L3c
        L3c:
            r4.close()     // Catch: java.lang.Throwable -> L60
            goto L60
        L40:
            r1 = move-exception
            goto L51
        L42:
            r1 = move-exception
            r4 = r0
            r0 = r1
            goto L75
        L46:
            r1 = move-exception
            r4 = r0
            goto L51
        L49:
            r7 = move-exception
            r4 = r0
            r0 = r7
            r7 = r4
            goto L75
        L4e:
            r1 = move-exception
            r7 = r0
            r4 = r7
        L51:
            java.lang.String r2 = "TemplateManager"
            java.lang.String r3 = "read file from assets exception:"
            android.util.Log.e(r2, r3, r1)     // Catch: java.lang.Throwable -> L74
            if (r7 == 0) goto L5d
            r7.close()     // Catch: java.lang.Throwable -> L5d
        L5d:
            if (r4 == 0) goto L60
            goto L3c
        L60:
            if (r4 == 0) goto L73
            int r7 = r4.size()
            if (r7 <= 0) goto L73
            byte[] r7 = r4.toByteArray()
            java.lang.String r0 = "UTF-8"
            java.lang.String r7 = r6.a(r7, r0)
            return r7
        L73:
            return r0
        L74:
            r0 = move-exception
        L75:
            if (r7 == 0) goto L7a
            r7.close()     // Catch: java.lang.Throwable -> L7a
        L7a:
            if (r4 == 0) goto L7f
            r4.close()     // Catch: java.lang.Throwable -> L7f
        L7f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jkl.a(java.lang.String):java.lang.String");
    }

    private void b(final jkn jknVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de107aec", new Object[]{this, jknVar});
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tb.jkl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a aVar = new a(jkl.this);
                    a.a(aVar, jknVar);
                    aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                }
            }, 1000L);
        }
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.e == 2 ? "http://d.daily.taobaocdn.net/L0/avengers/component/" : "https://gw.alicdn.com/tfscom/L0/avengers/component/");
        sb.append(str);
        return sb.toString();
    }

    /* loaded from: classes6.dex */
    public static class b extends AsyncTask<Void, Void, jko> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<jkl> f29605a;
        private jkn b;
        private boolean c = true;

        static {
            kge.a(2133591311);
        }

        public static /* synthetic */ jkn a(b bVar, jkn jknVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jkn) ipChange.ipc$dispatch("65681ea7", new Object[]{bVar, jknVar});
            }
            bVar.b = jknVar;
            return jknVar;
        }

        public static /* synthetic */ boolean a(b bVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("704b0fc9", new Object[]{bVar, new Boolean(z)})).booleanValue();
            }
            bVar.c = z;
            return z;
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [tb.jko, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ jko doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        public b(jkl jklVar) {
            this.f29605a = new WeakReference<>(jklVar);
        }

        public jko a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (jko) ipChange.ipc$dispatch("d68aeb24", new Object[]{this, voidArr}) : jkl.a(this.f29605a.get(), this.b, this.c, false);
        }
    }

    /* loaded from: classes6.dex */
    public static class a extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<jkl> f29604a;
        private jkn b;

        static {
            kge.a(1267078038);
        }

        public static /* synthetic */ jkn a(a aVar, jkn jknVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jkn) ipChange.ipc$dispatch("97bdbce6", new Object[]{aVar, jknVar});
            }
            aVar.b = jknVar;
            return jknVar;
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Void doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        public a(jkl jklVar) {
            this.f29604a = new WeakReference<>(jklVar);
        }

        public Void a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
            }
            jkl jklVar = this.f29604a.get();
            if (jklVar == null) {
                return null;
            }
            jko jkoVar = new jko();
            jkl.a(jklVar, this.b, jkoVar, true);
            String str = this.b.f29607a;
            LruCache a2 = jkl.a(jklVar);
            synchronized (jkl.a(jklVar)) {
                if (jkoVar.b != null && a2.get(str) == null) {
                    a2.put(str, jkoVar.b);
                }
            }
            return null;
        }
    }
}
