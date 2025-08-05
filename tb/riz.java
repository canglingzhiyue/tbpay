package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.utils.WXLogUtils;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public class riz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f33177a;
    private int b = 0;
    private riv<rjb> c = new riv<>();
    private riv<rja> d = new riv<>();

    static {
        kge.a(-279302104);
    }

    public riz(String str) {
        this.f33177a = str;
    }

    public final rjb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rjb) ipChange.ipc$dispatch("f0a1134", new Object[]{this});
        }
        while (k()) {
            b();
        }
        while (!this.d.d()) {
            a(this.d.b());
        }
        if (this.c.a() == 1) {
            return this.c.b();
        }
        return new riw(this.c.e(), 6);
    }

    public static rjb a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rjb) ipChange.ipc$dispatch("7c74ba2a", new Object[]{str});
        }
        try {
            return new riz(str).a();
        } catch (Exception e) {
            if (WXEnvironment.isApkDebugable()) {
                WXLogUtils.e("code " + str, e);
            }
            return new riw(null, 6);
        }
    }

    public final char b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Character) ipChange.ipc$dispatch("57a83d6", new Object[]{this})).charValue();
        }
        char l = l();
        if (l == '$') {
            this.b++;
            return l;
        }
        if (Character.isJavaIdentifierStart(l)) {
            i();
        } else if (l == '(' || l == '{') {
            d();
        } else if (l == '[') {
            c();
        } else if (l == '\"' || l == '\'') {
            h();
        } else if ((l == '.' && Character.isDigit(this.f33177a.charAt(this.b + 1))) || Character.isDigit(l)) {
            g();
        } else if (l == '?') {
            f();
        } else if (l == ':' || l == ')' || l == '}' || l == ' ' || l == ']') {
            this.b++;
            return l;
        } else {
            e();
        }
        return l;
    }

    public final void c() {
        rjb riwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        int a2 = this.c.a();
        int a3 = this.d.a();
        int i = this.b;
        int i2 = (i + (-1) < 0 || !Character.isJavaIdentifierPart(this.f33177a.charAt(i - 1))) ? 7 : 0;
        this.d.a((riv<rja>) new rja(riy.ARRAY_START_STR, this.c.a()));
        this.b++;
        while (k() && b() != ']') {
        }
        if (this.c.a() <= a2) {
            while (this.d.a() > a3) {
                this.d.b();
            }
            return;
        }
        while (this.d.a() > a3) {
            rja b = this.d.b();
            if (this.c.a() > a2) {
                a(b);
            }
        }
        ArrayList arrayList = new ArrayList(4);
        for (int i3 = a2; i3 < this.c.a(); i3++) {
            arrayList.add(this.c.a(i3));
        }
        while (this.c.a() > a2) {
            this.c.b();
        }
        if (i2 == 7 || this.c.a() == 0) {
            this.c.a((riv<rjb>) new riw(arrayList, 7));
            return;
        }
        rjb b2 = this.c.b();
        if (arrayList.size() == 1) {
            riwVar = (rjb) arrayList.get(0);
        } else {
            riwVar = new riw(arrayList, 6);
        }
        rix rixVar = new rix(".", i2);
        rixVar.b = b2;
        rixVar.c = riwVar;
        this.c.a((riv<rjb>) rixVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        int a2 = this.c.a();
        int a3 = this.d.a();
        if (this.f33177a.charAt(this.b) == '{') {
            this.d.a((riv<rja>) new rja(riy.BLOCK_START_STR, this.c.a()));
            this.b++;
            while (k() && b() != '}') {
            }
        } else {
            this.d.a((riv<rja>) new rja(riy.BRACKET_START_STR, this.c.a()));
            this.b++;
            while (k() && b() != ')') {
            }
        }
        if (this.c.a() <= a2) {
            while (this.d.a() > a3) {
                this.d.b();
            }
            return;
        }
        while (this.d.a() > a3) {
            rja b = this.d.b();
            if (this.c.a() > a2) {
                a(b);
            }
        }
        ArrayList arrayList = new ArrayList(4);
        for (int i = a2; i < this.c.a(); i++) {
            arrayList.add(this.c.a(i));
        }
        while (this.c.a() > a2) {
            this.c.b();
        }
        if (arrayList.size() == 1) {
            this.c.a((riv<rjb>) arrayList.get(0));
        } else {
            this.c.a((riv<rjb>) new riw(arrayList, 6));
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        int i = this.b;
        String substring = this.f33177a.substring(this.b, Math.min(i + 3, this.f33177a.length()));
        if (substring.length() >= 3 && !riy.f33176a.containsKey(substring)) {
            substring = substring.substring(0, 2);
        }
        if (substring.length() >= 2 && !riy.f33176a.containsKey(substring)) {
            substring = substring.substring(0, 1);
        }
        if (!riy.f33176a.containsKey(substring)) {
            int min = Math.min(i + 1, this.f33177a.length());
            WXLogUtils.e("weex", new IllegalArgumentException(this.f33177a.substring(0, min) + " illegal code operator" + substring));
            this.b = this.b + substring.length();
            return;
        }
        if (!this.d.d() && this.d.c() != null && riy.f33176a.get(this.d.c().f33178a).intValue() >= riy.f33176a.get(substring).intValue()) {
            a(this.d.b());
        }
        if (!riy.b(substring)) {
            this.d.a((riv<rja>) new rja(substring, this.c.a()));
        }
        this.b += substring.length();
    }

    public void a(rja rjaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd20390f", new Object[]{this, rjaVar});
            return;
        }
        String str = rjaVar.f33178a;
        if (riy.BRACKET_START_STR.equals(rjaVar.f33178a) || riy.BLOCK_START_STR.equals(rjaVar.f33178a) || riy.ARRAY_START_STR.equals(rjaVar.f33178a) || "$".equals(rjaVar.f33178a) || riy.BLOCK_START_STR.equals(rjaVar.f33178a)) {
            return;
        }
        int i = rjaVar.b;
        int max = Math.max(rjaVar.b - 1, 0);
        if (!this.d.d()) {
            max = Math.max(max, this.d.c().b);
        }
        rix rixVar = new rix(str, 5);
        if (riy.AND_NOT.equals(str)) {
            if (this.c.a() <= i) {
                return;
            }
            rixVar.f33175a = this.c.b(i);
            this.c.a(i, rixVar);
        } else if (this.c.a() <= i) {
        } else {
            rixVar.c = this.c.b(i);
            if (this.c.a() > max) {
                rixVar.b = this.c.b(max);
            } else if (rixVar.c == null) {
                return;
            }
            this.c.a(max, rixVar);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        rix rixVar = new rix("?", 5);
        a(0);
        if (this.d.a() > 0) {
            i = Math.max(this.d.c().b, 0);
        }
        if (this.c.a() > i) {
            rixVar.f33175a = this.c.b();
        }
        int a2 = this.c.a();
        int a3 = this.d.a();
        this.b++;
        while (k() && b() != ':') {
        }
        while (this.d.a() > a3) {
            a(this.d.b());
        }
        while (this.c.a() > a2) {
            rixVar.b = this.c.b();
        }
        int a4 = this.d.a();
        while (k()) {
            b();
            if (k()) {
                b();
            }
            if (this.d.a() <= a4) {
                break;
            }
        }
        a(a4);
        while (this.c.a() > a2) {
            rixVar.c = this.c.b();
        }
        this.c.a((riv<rjb>) rixVar);
    }

    private final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        while (this.d.a() > i) {
            a(this.d.b());
        }
    }

    public final void g() {
        rjb rjbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        int i = this.b;
        boolean z = (this.f33177a.charAt(i) == 'e' || this.f33177a.charAt(this.b) == '.') ? false : true;
        this.b++;
        while (j()) {
            char charAt = this.f33177a.charAt(this.b);
            if (!Character.isDigit(charAt) && charAt != '.' && charAt != 'e') {
                break;
            }
            if (charAt == 'e' || charAt == '.') {
                z = false;
            }
            this.b++;
        }
        String substring = this.f33177a.substring(i, this.b);
        if (".".equals(substring)) {
            return;
        }
        if (z) {
            rjbVar = new rjb(substring, 1);
        } else {
            rjbVar = new rjb(substring, 2);
        }
        this.c.a((riv<rjb>) rjbVar);
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        int i = this.b;
        riv rivVar = new riv();
        char charAt = this.f33177a.charAt(i);
        rivVar.a((riv) Character.valueOf(charAt));
        StringBuilder sb = new StringBuilder();
        while (true) {
            this.b = i + 1;
            if (this.b >= this.f33177a.length()) {
                break;
            }
            char charAt2 = this.f33177a.charAt(this.b);
            if (charAt2 == charAt) {
                if (this.f33177a.charAt(this.b - 1) != '\\') {
                    rivVar.b();
                    if (rivVar.a() == 0) {
                        this.b++;
                        break;
                    }
                } else {
                    sb.deleteCharAt(sb.length() - 1);
                    sb.append(charAt2);
                }
            } else {
                sb.append(charAt2);
            }
            i = this.b;
        }
        this.c.a((riv<rjb>) new rjb(sb.toString(), 3));
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        while (j() && Character.isJavaIdentifierPart(this.f33177a.charAt(this.b))) {
            this.b++;
        }
        String substring = this.f33177a.substring(i2, this.b);
        if (substring.startsWith("$")) {
            if (substring.length() == 1) {
                return;
            }
            substring = substring.substring(1);
        }
        if (riy.KEYWORDS.containsKey(substring) && (this.d.d() || !riy.c(this.d.c().f33178a))) {
            i = 4;
        }
        this.c.a((riv<rjb>) new rjb(substring, i));
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.b < this.f33177a.length();
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        while (j()) {
            if (this.f33177a.charAt(this.b) != ' ') {
                return true;
            }
            this.b++;
        }
        return false;
    }

    public final char l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Character) ipChange.ipc$dispatch("6076ee0", new Object[]{this})).charValue();
        }
        char charAt = this.f33177a.charAt(this.b);
        while (charAt == ' ') {
            this.b++;
            int length = this.f33177a.length();
            int i = this.b;
            if (length <= i) {
                break;
            }
            charAt = this.f33177a.charAt(i);
        }
        return charAt;
    }
}
