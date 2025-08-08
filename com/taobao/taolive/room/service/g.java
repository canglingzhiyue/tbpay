package com.taobao.taolive.room.service;

import android.content.Context;
import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.l;
import com.taobao.taolive.room.utils.q;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static g f21684a;
    private Context b;
    private HashMap<String, List<String>> c = new HashMap<>();
    private boolean d;
    private boolean e;

    static {
        kge.a(434453490);
    }

    public static g a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("3b9d2ac4", new Object[]{context});
        }
        if (f21684a == null) {
            f21684a = new g();
        }
        g gVar = f21684a;
        gVar.b = context;
        return gVar;
    }

    private g() {
    }

    public boolean a(String str, String str2) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        HashMap<String, List<String>> hashMap = this.c;
        return hashMap != null && hashMap.containsKey(str) && (list = this.c.get(str)) != null && list.contains(str2);
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        HashMap<String, List<String>> hashMap = this.c;
        if (hashMap == null) {
            return;
        }
        if (hashMap.containsKey(str)) {
            List<String> list = this.c.get(str);
            if (list == null || list.contains(str2)) {
                return;
            }
            list.add(str2);
            this.d = true;
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        this.c.put(str, arrayList);
        this.d = true;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.e) {
        } else {
            this.e = true;
            new a(this.b, this.c).execute(new Void[0]);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.d) {
        } else {
            this.d = false;
            new b(this.b, this.c).execute(new Void[0]);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.b = null;
        }
    }

    /* loaded from: classes8.dex */
    public static class b extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<Context> f21686a;
        private HashMap<String, List<String>> b;

        static {
            kge.a(1366071285);
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Void doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        public b(Context context, HashMap<String, List<String>> hashMap) {
            this.f21686a = new WeakReference<>(context);
            this.b = hashMap;
        }

        public Void a(Void... voidArr) {
            Context context;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
            }
            if (this.f21686a.get() == null) {
                return null;
            }
            String b = l.b(l.a(context) + File.separator + "LiveUA");
            File file = new File(b);
            if (!file.exists()) {
                file.mkdirs();
            }
            String format = SimpleDateFormat.getDateInstance().format(Calendar.getInstance().getTime());
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    file2.delete();
                }
            }
            File file3 = new File(b + File.separator + format);
            try {
                file3.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                fileOutputStream.write(JSON.toJSONString(this.b).getBytes());
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Exception unused) {
            }
            return null;
        }
    }

    /* loaded from: classes8.dex */
    public static class a extends AsyncTask<Void, Void, HashMap<String, List<String>>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<Context> f21685a;
        private HashMap<String, List<String>> b;

        static {
            kge.a(2145841054);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.util.HashMap<java.lang.String, java.util.List<java.lang.String>>, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ HashMap<String, List<String>> doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(HashMap<String, List<String>> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, hashMap});
            } else {
                a(hashMap);
            }
        }

        public a(Context context, HashMap<String, List<String>> hashMap) {
            this.f21685a = new WeakReference<>(context);
            this.b = hashMap;
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
            if (r6 != null) goto L25;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> a(java.lang.Void... r6) {
            /*
                r5 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.taolive.room.service.g.a.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r1 == 0) goto L18
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r5
                r2 = 1
                r1[r2] = r6
                java.lang.String r6 = "e30b1bb7"
                java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
                java.util.HashMap r6 = (java.util.HashMap) r6
                return r6
            L18:
                java.lang.ref.WeakReference<android.content.Context> r6 = r5.f21685a
                java.lang.Object r6 = r6.get()
                android.content.Context r6 = (android.content.Context) r6
                r0 = 0
                if (r6 != 0) goto L24
                return r0
            L24:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r6 = com.taobao.taolive.room.utils.l.a(r6)
                r1.append(r6)
                java.lang.String r6 = java.io.File.separator
                r1.append(r6)
                java.lang.String r6 = "LiveUA"
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                java.lang.String r6 = com.taobao.taolive.room.utils.l.b(r6)
                java.io.File r1 = new java.io.File
                r1.<init>(r6)
                boolean r2 = r1.exists()
                if (r2 != 0) goto L50
                r1.mkdirs()
            L50:
                java.util.Calendar r1 = java.util.Calendar.getInstance()
                java.util.Date r1 = r1.getTime()
                java.text.DateFormat r2 = java.text.SimpleDateFormat.getDateInstance()
                java.lang.String r1 = r2.format(r1)
                java.io.File r2 = new java.io.File
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r6)
                java.lang.String r6 = java.io.File.separator
                r3.append(r6)
                r3.append(r1)
                java.lang.String r6 = r3.toString()
                r2.<init>(r6)
                boolean r6 = r2.exists()
                if (r6 != 0) goto L80
                return r0
            L80:
                java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lc3
                r6.<init>(r2)     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lc3
                java.nio.channels.FileChannel r1 = r6.getChannel()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb2
                long r2 = r1.size()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lc5
                int r3 = (int) r2     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lc5
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r3)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lc5
                r1.read(r2)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lc5
                byte[] r2 = r2.array()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lc5
                java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lc5
                r3.<init>(r2)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lc5
                java.util.HashMap r0 = r5.a(r3)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lc5
                if (r1 == 0) goto La7
                r1.close()     // Catch: java.lang.Exception -> Lcd
            La7:
                r6.close()     // Catch: java.lang.Exception -> Lcd
                goto Lcd
            Lab:
                r0 = move-exception
                goto Lb8
            Lad:
                r1 = move-exception
                r4 = r1
                r1 = r0
                r0 = r4
                goto Lb8
            Lb2:
                r1 = r0
                goto Lc5
            Lb4:
                r6 = move-exception
                r1 = r0
                r0 = r6
                r6 = r1
            Lb8:
                if (r1 == 0) goto Lbd
                r1.close()     // Catch: java.lang.Exception -> Lc2
            Lbd:
                if (r6 == 0) goto Lc2
                r6.close()     // Catch: java.lang.Exception -> Lc2
            Lc2:
                throw r0
            Lc3:
                r6 = r0
                r1 = r6
            Lc5:
                if (r1 == 0) goto Lca
                r1.close()     // Catch: java.lang.Exception -> Lcd
            Lca:
                if (r6 == 0) goto Lcd
                goto La7
            Lcd:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.service.g.a.a(java.lang.Void[]):java.util.HashMap");
        }

        public void a(HashMap<String, List<String>> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
                return;
            }
            HashMap<String, List<String>> hashMap2 = this.b;
            if (hashMap2 != null) {
                hashMap2.clear();
            } else {
                this.b = new HashMap<>();
            }
            if (hashMap == null) {
                return;
            }
            this.b.putAll(hashMap);
        }

        private HashMap<String, List<String>> a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("a40d9915", new Object[]{this, str});
            }
            HashMap<String, List<String>> hashMap = new HashMap<>();
            if (!StringUtils.isEmpty(str)) {
                try {
                    JSONObject parseObject = JSON.parseObject(str);
                    if (parseObject.keySet().size() > 0) {
                        for (String str2 : parseObject.keySet()) {
                            String valueOf = String.valueOf(str2);
                            hashMap.put(valueOf, q.a(parseObject.getJSONArray(valueOf)));
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return hashMap;
        }
    }
}
