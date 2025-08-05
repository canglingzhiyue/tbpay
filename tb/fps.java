package tb;

import android.content.Context;
import android.util.Log;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.e;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.desktop.ditto.anim.AnimConstance;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import tb.fpt;

/* loaded from: classes.dex */
public class fps {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public LruCache<String, DinamicTemplate> f28100a;
    private String b;
    private String c;
    private fpt d;
    private Context e;

    static {
        kge.a(-615322303);
    }

    public fps(Context context, String str) {
        this.b = "default_layout";
        this.c = "default_layout.db";
        if (context != null) {
            this.e = context.getApplicationContext();
        }
        this.b = str + AnimConstance.ANIM_LAYOUT_TAG;
        this.c = str + "_layout.db";
        this.f28100a = new LruCache<>(16);
        this.d = new fpt.a().a(context).c(this.c).a(this.b).a(16).a(2097152L).b(str).a();
    }

    public void a(fpt.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40efab0", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            this.d.j = bVar;
        }
    }

    private fpt a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fpt) ipChange.ipc$dispatch("f04b574", new Object[]{this}) : this.d;
    }

    public byte[] a(DinamicTemplate dinamicTemplate, String str, String str2, fpu fpuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("7b43c012", new Object[]{this, dinamicTemplate, str, str2, fpuVar}) : a().a(dinamicTemplate, str, str2, fpuVar);
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : a().i.get(str) != null || new File(this.d.a(), str).exists();
    }

    public DinamicTemplate a(DinamicTemplate dinamicTemplate) {
        final int intValue;
        DinamicTemplate dinamicTemplate2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicTemplate) ipChange.ipc$dispatch("ff78586e", new Object[]{this, dinamicTemplate});
        }
        final String str = dinamicTemplate.name;
        try {
            intValue = Integer.valueOf(dinamicTemplate.version).intValue();
            dinamicTemplate2 = this.f28100a.get(str);
        } catch (NumberFormatException unused) {
        }
        if (dinamicTemplate2 != null) {
            return dinamicTemplate2;
        }
        final DinamicTemplate dinamicTemplate3 = new DinamicTemplate();
        String[] list = this.d.a().list(new FilenameFilter() { // from class: tb.fps.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public int f28101a = -1;

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str2) {
                int lastIndexOf;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("6696dd14", new Object[]{this, file, str2})).booleanValue();
                }
                if (!str2.startsWith(str) || (lastIndexOf = str2.lastIndexOf("_")) == -1) {
                    return false;
                }
                try {
                    int intValue2 = Integer.valueOf(str2.substring(lastIndexOf + 1)).intValue();
                    if (intValue2 > this.f28101a && intValue2 < intValue) {
                        this.f28101a = intValue2;
                        dinamicTemplate3.version = String.valueOf(this.f28101a);
                    }
                    return true;
                } catch (NumberFormatException unused2) {
                    return false;
                }
            }
        });
        if (list != null && list.length != 0) {
            dinamicTemplate3.name = str;
            return dinamicTemplate3;
        }
        return null;
    }

    public byte[] b(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("7d24c9ca", new Object[]{this, str});
        }
        fpt a2 = a();
        byte[] bArr = a2.i.get(str);
        if (bArr != null) {
            return bArr;
        }
        File file = new File(a2.a(), str);
        if (!file.exists()) {
            return null;
        }
        byte[] a3 = a2.a(file);
        a2.i.put(str, a3);
        return a3;
    }

    public byte[] c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("792658a9", new Object[]{this, str});
        }
        fpt a2 = a();
        byte[] bArr = null;
        try {
            byte[] bArr2 = a2.i.get(str);
            if (bArr2 != null) {
                return bArr2;
            }
            try {
                return a2.b(str, new fpu());
            } catch (Throwable th) {
                th = th;
                bArr = bArr2;
                Log.e("LayoutFileManager", "read local layout file exception", th);
                return bArr;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public byte[] a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("4dba22e1", new Object[]{this, str, str2});
        }
        byte[] bArr = null;
        try {
            byte[] bArr2 = a().i.get(str2);
            if (bArr2 != null) {
                return bArr2;
            }
            try {
                return b(str, str2);
            } catch (Throwable th) {
                th = th;
                bArr = bArr2;
                Log.e("LayoutFileManager", "read local layout file from asset exception", th);
                return bArr;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public byte[] b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("551f5800", new Object[]{this, str, str2});
        }
        String str3 = str + "/" + str2 + ".xml";
        try {
            return fpj.a(AssetsDelegate.proxy_open(e.b().getAssets(), str3));
        } catch (IOException e) {
            Log.e("LayoutFileManager", "readAssert exception: " + str3, e);
            return null;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d.a(i);
        }
    }
}
