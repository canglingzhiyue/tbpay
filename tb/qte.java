package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.split.k;
import com.alibaba.android.split.p;
import com.alibaba.android.split.t;
import com.alibaba.android.split.v;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class qte implements gox {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final qte g;

    /* renamed from: a  reason: collision with root package name */
    private boolean f33056a = false;
    private Map<String, Boolean> b = new ConcurrentHashMap();
    private Map<String, String> c = new ConcurrentHashMap();
    private got d = new got();
    private Map<String, Boolean> e = new ConcurrentHashMap();
    private Context f;

    public static /* synthetic */ Map a(qte qteVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4ca348ab", new Object[]{qteVar}) : qteVar.e;
    }

    public static /* synthetic */ void a(qte qteVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78aa3540", new Object[]{qteVar, str});
        } else {
            qteVar.c(str);
        }
    }

    public static /* synthetic */ Map b(qte qteVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("85f4596c", new Object[]{qteVar}) : qteVar.b;
    }

    public static /* synthetic */ boolean b(qte qteVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8d92fd85", new Object[]{qteVar, str})).booleanValue() : qteVar.b(str);
    }

    static {
        kge.a(189042780);
        kge.a(-89325324);
        g = new qte();
    }

    public static qte a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qte) ipChange.ipc$dispatch("f09c2bc", new Object[0]) : g;
    }

    private qte() {
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.f = context;
        bhm.a().a(new bho() { // from class: tb.qte.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bho
            public void a(String str, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
                } else if (i <= 2) {
                } else {
                    Log.e("SplitCleaner", "installed feature:" + str);
                    qte.a(qte.this).put(str, true);
                }
            }
        }, null);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.d.a(new Runnable() { // from class: tb.qte.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (!v.m(k.a().b().t())) {
                            return;
                        }
                        Log.e("SplitCleaner", "do feature clean work ......");
                        if (qte.b(qte.this).size() > 0) {
                            String[] strArr = (String[]) qte.b(qte.this).keySet().toArray(new String[0]);
                            for (int i = 0; i < strArr.length; i++) {
                                if (qte.a(qte.this).containsKey(strArr[i])) {
                                    qte.a(qte.this, strArr[i]);
                                    qte.b(qte.this).remove(strArr[i]);
                                }
                            }
                        }
                        if (qte.a(qte.this).size() <= 0) {
                            return;
                        }
                        for (String str : qte.a(qte.this).keySet()) {
                            if (qte.b(qte.this, str)) {
                                qte.a(qte.this, str);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, 30L, TimeUnit.SECONDS);
        }
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : p.a().a().contains(str) && t.a() != null && t.a().a(str, "baseline").equals("baseline");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(final java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.qte.c(java.lang.String):void");
    }

    private void a(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fbe2fe9", new Object[]{this, file, str});
            return;
        }
        try {
            if (e(file, str).exists()) {
                Log.e("SplitCleaner", String.format("do clean feature work......:%s", e(file, str).getAbsolutePath()));
                bgy.c(e(file, str));
            }
            if (d(file, str).exists()) {
                Log.e("SplitCleaner", String.format("do clean feature work......:%s", d(file, str).getAbsolutePath()));
                bgy.c(d(file, str));
            }
            if (b(file, str).exists()) {
                Log.e("SplitCleaner", String.format("do clean feature work......:%s", b(file, str).getAbsolutePath()));
                bgy.c(b(file, str));
            }
            if (!c(file, str).exists()) {
                return;
            }
            Log.e("SplitCleaner", String.format("do clean feature work......:%s", c(file, str).getAbsolutePath()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private File a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("4659278e", new Object[]{this, file});
        }
        try {
            String a2 = bhy.a(k.a().b().t());
            if (!TextUtils.isEmpty(a2) && a2.startsWith("arm64")) {
                return new File(file, "oat/arm64");
            }
            return new File(file, "oat/arm");
        } catch (Exception e) {
            e.printStackTrace();
            return new File(file, "oat/arm64");
        }
    }

    private File b(File file, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("34b01de3", new Object[]{this, file, str}) : new File(file, String.format("oat/%s.apk.prof", str));
    }

    private File c(File file, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("2659c402", new Object[]{this, file, str}) : new File(file, String.format("oat/%s.apk.cur.prof", str));
    }

    private File d(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("18036a21", new Object[]{this, file, str});
        }
        File a2 = a(file);
        return new File(a2, str + ".odex");
    }

    private File e(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("9ad1040", new Object[]{this, file, str});
        }
        File a2 = a(file);
        return new File(a2, str + ".vdex");
    }

    @Override // tb.gox
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.c.put(str, str2);
        }
    }

    @Override // tb.gox
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Log.e("SplitCleaner", String.format("onHisFeatureInvalid......:%s", str));
        this.b.put(str, true);
    }
}
