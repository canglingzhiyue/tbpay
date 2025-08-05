package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicLong;
import tb.knb;

/* loaded from: classes7.dex */
public class klw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public klo b;

    /* renamed from: a  reason: collision with root package name */
    public int f30152a = 10;
    public AtomicLong c = new AtomicLong(0);
    public boolean d = false;
    public a e = new a();
    public knb.a f = new knb.a();

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f30153a = true;
        public boolean b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int f;
        public int g;
        public String h;

        public a a(int i, int i2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e4407961", new Object[]{this, new Integer(i), new Integer(i2), str});
            }
            this.f30153a = false;
            this.f = i;
            this.g = i2;
            this.h = str;
            return this;
        }
    }

    public klw(klo kloVar) {
        this.b = kloVar;
    }

    public void a(klv klvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1540783", new Object[]{this, klvVar});
        } else if (this.b == null) {
        } else {
            kmr kmrVar = klvVar.b;
            if (this.e.f30153a) {
                kmrVar.f30170a = true;
                kmrVar.d = klvVar.e.getAbsolutePath();
                kmrVar.b = this.f30152a;
                kmrVar.c = "下载成功";
            } else {
                kmrVar.f30170a = false;
                kmrVar.b = this.e.f;
                kmrVar.j.a(this.e.c);
                int i = kmrVar.b;
                if (i == -21) {
                    kmrVar.c = "手机剩余空间不足";
                } else if (i != -18 && i != -15) {
                    switch (i) {
                        case -12:
                            kmrVar.c = "网络错误";
                            break;
                        case -11:
                            kmrVar.c = "文件读写错误";
                            break;
                        case -10:
                            kmrVar.c = "url错误";
                            break;
                        default:
                            kmrVar.c = "下载失败";
                            break;
                    }
                } else {
                    kmrVar.c = "文件校验失败";
                }
            }
            this.f.f30178a = klvVar.c;
            this.f.b = kmrVar.e.b;
            if (0 != this.f.g) {
                knb.a aVar = this.f;
                aVar.i = (aVar.r / 1024.0d) / (this.f.g / 1000.0d);
            }
            this.f.c = kmrVar.f30170a;
            if (this.f.c) {
                this.f.s = String.valueOf(this.f30152a);
            } else {
                this.f.s = String.valueOf((this.e.f * 1000) - this.e.g);
            }
            this.f.t = this.e.h;
            this.f.j = kmrVar.f.f30169a;
            knb.a aVar2 = this.f;
            kmrVar.k = aVar2;
            aVar2.m = kmrVar.f.b;
            this.b.a(kmrVar);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        klo kloVar = this.b;
        if (kloVar == null) {
            return;
        }
        kloVar.a(this.c.get(), str);
    }
}
