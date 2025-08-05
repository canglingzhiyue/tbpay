package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bsq implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_AUTO_SIZE = "enableAutoSize";
    public static final String KEY_BACKGROUND_COLOR = "backgroundColor";
    public static final String KEY_HEIGHT_RATIO = "heightRatio";
    public static final String KEY_NEED_CLOSE_BUTTON = "showCloseButton";
    public static final String KEY_STYLE = "style";

    /* renamed from: a  reason: collision with root package name */
    private bsr f26110a;
    private String d;
    private Boolean e;
    private Boolean f;
    private String b = "slideDown";
    private Float c = null;
    private float g = 0.5f;
    private float h = 0.8f;
    private boolean i = true;
    private boolean j = true;

    static {
        kge.a(992770026);
        kge.a(-723128125);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : k();
    }

    public float a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : this.g;
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.g = Math.max(0.0f, Math.min(f, 1.0f));
        }
    }

    public float b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue() : this.h;
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else {
            this.h = Math.max(0.0f, Math.min(f, 1.0f));
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.d;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public bsr d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bsr) ipChange.ipc$dispatch("2617df1a", new Object[]{this}) : this.f26110a;
    }

    public void a(bsr bsrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2593cf7", new Object[]{this, bsrVar});
        } else {
            this.f26110a = bsrVar;
        }
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.b;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public Float f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("a1a59c36", new Object[]{this}) : this.c;
    }

    public void c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b3996", new Object[]{this, new Float(f)});
        } else {
            this.c = Float.valueOf(f);
        }
    }

    public Boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("18a3cb6b", new Object[]{this}) : this.e;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.e = Boolean.valueOf(z);
        }
    }

    public Boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("62d564ac", new Object[]{this}) : this.f;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.i;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.j;
    }

    public bsq k() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bsq) ipChange.ipc$dispatch("5bf36494", new Object[]{this});
        }
        bsq bsqVar = new bsq();
        bsqVar.b = this.b;
        bsqVar.d = this.d;
        bsqVar.g = this.g;
        bsqVar.e = this.e;
        bsqVar.f = this.f;
        bsqVar.h = this.h;
        bsqVar.i = this.i;
        bsqVar.c = this.c;
        bsqVar.j = this.j;
        bsqVar.f26110a = this.f26110a.f();
        return bsqVar;
    }
}
