package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.navigationextern.e;
import com.taobao.android.navigationextern.f;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.navigation.NavigationTabIconSourceType;
import com.taobao.tao.navigation.g;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class hur {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final huv f28796a;
    private Context b;
    private Map<String, f> d;
    private Map<String, b> e;
    private String f;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final hur f28799a = new hur();

        public static /* synthetic */ hur a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (hur) ipChange.ipc$dispatch("f05b0b9", new Object[0]) : f28799a;
        }
    }

    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f28800a;
        public Drawable b;
    }

    public static /* synthetic */ String a(hur hurVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("eca1e383", new Object[]{hurVar, str}) : hurVar.b(str);
    }

    public static /* synthetic */ Map a(hur hurVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("f1059ca8", new Object[]{hurVar}) : hurVar.d;
    }

    public static /* synthetic */ huv b(hur hurVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (huv) ipChange.ipc$dispatch("99ee39e9", new Object[]{hurVar}) : hurVar.f28796a;
    }

    private hur() {
        this.f28796a = new huv();
        this.d = new ConcurrentHashMap(1);
    }

    public static hur a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hur) ipChange.ipc$dispatch("f05b0b9", new Object[0]) : a.a();
    }

    public f a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("5a002eee", new Object[]{this, new Integer(i)}) : this.d.get(String.valueOf(i));
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.b = context;
        this.d = this.f28796a.a();
        Map<String, f> map = this.d;
        if (map == null) {
            this.d = new ConcurrentHashMap(1);
        } else {
            for (String str : map.keySet()) {
                a(this.d.get(str));
            }
        }
        hut.b("IconCache", "cached tab size:" + this.d.size());
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.hur.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String a2 = hus.a(hur.a(hur.this));
                    boolean a3 = hur.b(hur.this).a(a2);
                    hut.b("IconCache", "cache is successful? " + a3 + "; cached contents: " + a2);
                }
            });
        }
    }

    public void a(int i, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbdbb25a", new Object[]{this, new Integer(i), gVar});
        } else if (gVar == null) {
            hut.b("IconCache", "cache navigation tab failed. tab is null");
        } else {
            f a2 = hus.a(gVar);
            if (hus.a(a2, this.d.get(String.valueOf(i)))) {
                hut.b("IconCache", "cache navigation tab cancel. tab config is the same");
            } else if (a2 == null || a2.e() != NavigationTabIconSourceType.DRAWABLE.ordinal()) {
                hut.b("IconCache", "cache navigation tab failed. newTabConfig is null");
            } else {
                this.d.put(String.valueOf(i), a2);
                b d = d(String.valueOf(i));
                d.f28800a = b(((Integer) a2.d()).intValue());
                d.b = b(((Integer) a2.c()).intValue());
                a(d.f28800a, a2.m());
                a(d.b, a2.n());
                b();
                hut.b("IconCache", "start cache " + this.d.get(String.valueOf(i)));
            }
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        b(this.d.get(str));
        this.d.remove(str);
        b();
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        Context context = this.b;
        if (context == null) {
            return null;
        }
        if (this.f == null) {
            File filesDir = context.getFilesDir();
            File file = new File(filesDir, File.separator + "navigation/icon");
            if (!file.exists()) {
                file.mkdirs();
            }
            this.f = file.getAbsolutePath();
        }
        return this.f + File.separator + str + ".png";
    }

    private String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        String a2 = com.taobao.android.navigationextern.a.a(this.b);
        return a2 + File.separator + str + ".png";
    }

    private Drawable b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("6e730340", new Object[]{this, new Integer(i)});
        }
        Context context = this.b;
        if (context == null) {
            hut.b("IconCache", " saveDrawableFileCache failed. mContext is null");
            return null;
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) ResourcesCompat.getDrawable(context.getResources(), i, null);
        if (bitmapDrawable == null) {
            hut.b("IconCache", " saveDrawableFileCache failed. drawable is null");
        }
        return bitmapDrawable;
    }

    private void a(final Drawable drawable, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b2d5a56", new Object[]{this, drawable, str});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.hur.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Drawable drawable2 = drawable;
                    if (!(drawable2 instanceof BitmapDrawable)) {
                        hut.b("IconCache", " saveDrawableFileCache failed.drawable is not instanceof BitmapDrawable");
                        return;
                    }
                    Bitmap bitmap = ((BitmapDrawable) drawable2).getBitmap();
                    String a2 = hur.a(hur.this, str);
                    if (a2 == null) {
                        hut.b("IconCache", " saveDrawableFileCache failed. path is null");
                        return;
                    }
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(a2);
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                    } catch (Exception e) {
                        hut.b("IconCache", "Error! Img save failed." + e.toString());
                    }
                }
            });
        }
    }

    private void b(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc4905a", new Object[]{this, fVar});
        } else if (fVar == null) {
            hut.b("IconCache", "tab config is null");
        } else {
            String b2 = b(fVar.m());
            String b3 = b(fVar.n());
            if (b2 == null || b3 == null) {
                hut.b("IconCache", "DrawablePath is null");
                return;
            }
            File file = new File(b2);
            File file2 = new File(b3);
            file.deleteOnExit();
            file2.deleteOnExit();
            hut.b("IconCache", "deleteDrawableFileCache; selectedDrawablePath:" + b2);
        }
    }

    public final b a(f fVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("37ad9708", new Object[]{this, fVar});
        }
        if (fVar == null) {
            hut.b("IconCache", "getCachedTabDrawable failed. tab config is null");
            return null;
        }
        String valueOf = String.valueOf(fVar.a());
        b d = d(valueOf);
        if (d.f28800a != null) {
            return d;
        }
        String b2 = b(fVar.m());
        String b3 = b(fVar.n());
        if (b2 == null || b3 == null) {
            hut.b("IconCache", "getCachedTabDrawable failed. DrawablePath is null");
            return null;
        }
        Drawable createFromPath = BitmapDrawable.createFromPath(b2);
        Drawable createFromPath2 = BitmapDrawable.createFromPath(b3);
        if (!e.p() && (createFromPath == null || createFromPath2 == null)) {
            b2 = c(fVar.m());
            String c = c(fVar.n());
            if (b2 == null || c == null) {
                hut.b("IconCache", "getCachedTabDrawable failed. getOldCachePath is null");
                return null;
            }
            createFromPath = BitmapDrawable.createFromPath(b2);
            createFromPath2 = BitmapDrawable.createFromPath(c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(b2);
        sb.append(" get s drawable is null: ");
        if (createFromPath != null) {
            z = false;
        }
        sb.append(z);
        hut.b("IconCache", sb.toString());
        b d2 = d(valueOf);
        d2.b = createFromPath2;
        d2.f28800a = createFromPath;
        return d2;
    }

    private b d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("ba511f4e", new Object[]{this, str});
        }
        if (this.e == null) {
            this.e = new ConcurrentHashMap(1);
        }
        b bVar = this.e.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.e.put(str, bVar2);
        return bVar2;
    }
}
