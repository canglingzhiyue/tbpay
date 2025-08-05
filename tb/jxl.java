package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weexdownloader.downloader.c;
import com.taobao.android.weexdownloader.downloader.d;
import java.io.File;

/* loaded from: classes6.dex */
public class jxl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f29849a = "WeexDownloader";
    private Context b;
    private c c;
    private d d;
    private String e;
    private String f;
    private String g;
    private String h;

    public static /* synthetic */ void a(jxl jxlVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b0dcc84", new Object[]{jxlVar, str});
        } else {
            jxlVar.a(str);
        }
    }

    public static /* synthetic */ void b(jxl jxlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec6c3bb", new Object[]{jxlVar});
        } else {
            jxlVar.d();
        }
    }

    public jxl(Context context, String str, String str2, String str3, d dVar) {
        this.b = context;
        this.d = dVar;
        if (jxk.d(str3)) {
            this.h = str2;
            this.e = context.getApplicationContext().getFilesDir().getAbsolutePath();
            this.f = jxi.a(str);
            this.g = str3;
            this.c = new c(this.e, this.f, this.g, new d() { // from class: tb.jxl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weexdownloader.downloader.d
                public void a(File file) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8a979fdf", new Object[]{this, file});
                    } else {
                        jxl.b(jxl.this);
                    }
                }

                @Override // com.taobao.android.weexdownloader.downloader.d
                public void a(String str4) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str4});
                    } else {
                        jxl.a(jxl.this, str4);
                    }
                }
            });
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.c == null) {
            a("invalidUrl");
        } else {
            b();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!a(this.e, this.f, this.h)) {
            this.c.a();
        } else {
            d dVar = this.d;
            if (dVar == null) {
                return;
            }
            dVar.a(new File(this.e + File.separator + this.f));
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        File file = new File(this.e + File.separator + this.f);
        if (file.exists()) {
            file.delete();
        }
        d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.a(str);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (jxk.b(this.h) && !a(this.e, this.f, this.h)) {
            a("md5CheckFail");
        } else {
            d dVar = this.d;
            if (dVar == null) {
                return;
            }
            dVar.a(new File(this.e + File.separator + this.f));
        }
    }

    private boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{this, str, str2, str3})).booleanValue();
        }
        if (!jxk.a(str) && !jxk.a(str2) && !jxk.a(str3)) {
            File file = new File(str + File.separator + str2);
            if (file.exists() && file.isFile()) {
                return str3.equals(jxh.a(file));
            }
        }
        return false;
    }
}
