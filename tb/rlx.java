package tb;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public class rlx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Object f33227a;
    private static rlx b;
    private List<Object> c;
    private Context d;
    private String e;
    private String f;
    private Resources g;
    private Resources h;
    private String i;
    private boolean j = false;
    private LruCache<String, Integer> k = new LruCache<>(1024);

    public static /* synthetic */ Context a(rlx rlxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f28d8d92", new Object[]{rlxVar}) : rlxVar.d;
    }

    public static /* synthetic */ Resources a(rlx rlxVar, Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("406c2858", new Object[]{rlxVar, resources});
        }
        rlxVar.g = resources;
        return resources;
    }

    public static /* synthetic */ String a(rlx rlxVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("10dbe53c", new Object[]{rlxVar, str});
        }
        rlxVar.e = str;
        return str;
    }

    public static /* synthetic */ boolean a(rlx rlxVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab95697e", new Object[]{rlxVar, new Boolean(z)})).booleanValue();
        }
        rlxVar.j = z;
        return z;
    }

    public static /* synthetic */ Resources b(rlx rlxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Resources) ipChange.ipc$dispatch("21e412ec", new Object[]{rlxVar}) : rlxVar.g;
    }

    public static /* synthetic */ String b(rlx rlxVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4aa6871b", new Object[]{rlxVar, str});
        }
        rlxVar.i = str;
        return str;
    }

    public static /* synthetic */ String c(rlx rlxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6021f684", new Object[]{rlxVar}) : rlxVar.i;
    }

    static {
        kge.a(1715713991);
        kge.a(818289668);
        f33227a = new Object();
    }

    public static rlx a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rlx) ipChange.ipc$dispatch("f0a1b60", new Object[0]);
        }
        if (b == null) {
            synchronized (f33227a) {
                if (b == null) {
                    b = new rlx();
                }
            }
        }
        return b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.e;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f;
    }

    public Resources d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Resources) ipChange.ipc$dispatch("45bf56bc", new Object[]{this}) : this.g;
    }

    public Resources e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("ac98167d", new Object[]{this});
        }
        Context context = this.d;
        if (context != null && this.h == null) {
            this.h = context.getResources();
        }
        return this.h;
    }

    private rlx() {
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.d = context.getApplicationContext();
        this.f = context.getPackageName();
        this.h = this.d.getResources();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            a(rlo.a(this.d), (rlt) null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [tb.rlx$1] */
    public void a(String str, final rlt rltVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d2f80e8", new Object[]{this, str, rltVar});
        } else {
            new AsyncTask<String, Void, Resources>() { // from class: tb.rlx.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.AsyncTask
                public void onPreExecute() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("873a6298", new Object[]{this});
                    }
                }

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, android.content.res.Resources] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Resources doInBackground(String[] strArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, strArr}) : a(strArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(Resources resources) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, resources});
                    } else {
                        a(resources);
                    }
                }

                public Resources a(String... strArr) {
                    try {
                        if (strArr.length != 1) {
                            return null;
                        }
                        String str2 = strArr[0];
                        if (!new File(str2).exists()) {
                            return null;
                        }
                        rlx.a(rlx.this, rlx.a(rlx.this).getPackageManager().getPackageArchiveInfo(str2, 1).packageName);
                        AssetManager assetManager = (AssetManager) AssetManager.class.newInstance();
                        assetManager.getClass().getMethod("addAssetPath", String.class).invoke(assetManager, str2);
                        Resources resources = rlx.a(rlx.this).getResources();
                        Resources resources2 = new Resources(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
                        rlx.b(rlx.this, str2);
                        rlx.a(rlx.this, false);
                        return resources2;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                }

                public void a(Resources resources) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7a42f3f9", new Object[]{this, resources});
                        return;
                    }
                    rlx.a(rlx.this, resources);
                    if (rlx.b(rlx.this) != null) {
                        rlo.a(rlx.a(rlx.this), rlx.c(rlx.this));
                        rlx.this.g();
                        return;
                    }
                    rlx.a(rlx.this, true);
                }
            }.execute(str);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        List<Object> list = this.c;
        if (list == null) {
            return;
        }
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void a(String str, int i) {
        LruCache<String, Integer> lruCache;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else if (StringUtils.isEmpty(str) || (lruCache = this.k) == null) {
        } else {
            lruCache.put(str, Integer.valueOf(i));
        }
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        if (this.k != null && !StringUtils.isEmpty(str) && this.k.get(str) != null) {
            return this.k.get(str).intValue();
        }
        return 0;
    }
}
