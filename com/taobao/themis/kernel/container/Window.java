package com.taobao.themis.kernel.container;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.utils.f;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public final class Window {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion;

    /* renamed from: a  reason: collision with root package name */
    private String f22504a;
    private String b;
    private Integer c;
    private final Boolean d;
    private Integer e;
    private Boolean f;
    private Theme g;
    private Boolean h;
    private Boolean i;
    private final Integer j;
    private Orientation k;
    private final Boolean l;
    private final Boolean m;
    private final WindowRatioConfig n;
    private Boolean o;
    private Boolean p;

    /* loaded from: classes9.dex */
    public enum Orientation {
        PORTRAIT("portrait"),
        LANDSCAPE("landscape"),
        UNSPECIFIED("unspecified");
        
        private final String orientation;

        Orientation(String str) {
            this.orientation = str;
        }

        public final String getOrientation() {
            return this.orientation;
        }
    }

    /* loaded from: classes9.dex */
    public enum Theme {
        AUTO("auto"),
        LIGHT("light"),
        DARK("dark");
        
        private final String theme;

        Theme(String str) {
            this.theme = str;
        }

        public final String getTheme() {
            return this.theme;
        }
    }

    /* loaded from: classes9.dex */
    public enum WindowRatioConfig {
        ALL("all"),
        PORTRAIT("portrait"),
        LANDSCAPE("landscape"),
        NONE("none");
        
        private final String config;

        WindowRatioConfig(String str) {
            this.config = str;
        }

        public final String getConfig() {
            return this.config;
        }
    }

    static {
        kge.a(2060457242);
        Companion = new b(null);
    }

    public Window() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public static /* synthetic */ Window a(Window window, String str, String str2, Integer num, Boolean bool, Integer num2, Boolean bool2, Theme theme, Boolean bool3, Boolean bool4, Integer num3, Orientation orientation, Boolean bool5, Boolean bool6, WindowRatioConfig windowRatioConfig, Boolean bool7, Boolean bool8, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Window) ipChange.ipc$dispatch("7957ffcf", new Object[]{window, str, str2, num, bool, num2, bool2, theme, bool3, bool4, num3, orientation, bool5, bool6, windowRatioConfig, bool7, bool8, new Integer(i), obj});
        }
        return window.a((i & 1) != 0 ? window.f22504a : str, (i & 2) != 0 ? window.b : str2, (i & 4) != 0 ? window.c : num, (i & 8) != 0 ? window.d : bool, (i & 16) != 0 ? window.e : num2, (i & 32) != 0 ? window.f : bool2, (i & 64) != 0 ? window.g : theme, (i & 128) != 0 ? window.h : bool3, (i & 256) != 0 ? window.i : bool4, (i & 512) != 0 ? window.j : num3, (i & 1024) != 0 ? window.k : orientation, (i & 2048) != 0 ? window.l : bool5, (i & 4096) != 0 ? window.m : bool6, (i & 8192) != 0 ? window.n : windowRatioConfig, (i & 16384) != 0 ? window.o : bool7, (i & 32768) != 0 ? window.p : bool8);
    }

    public final Window a(String str, String str2, Integer num, Boolean bool, Integer num2, Boolean bool2, Theme theme, Boolean bool3, Boolean bool4, Integer num3, Orientation orientation, Boolean bool5, Boolean bool6, WindowRatioConfig windowRatioConfig, Boolean bool7, Boolean bool8) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Window) ipChange.ipc$dispatch("134cc807", new Object[]{this, str, str2, num, bool, num2, bool2, theme, bool3, bool4, num3, orientation, bool5, bool6, windowRatioConfig, bool7, bool8}) : new Window(str, str2, num, bool, num2, bool2, theme, bool3, bool4, num3, orientation, bool5, bool6, windowRatioConfig, bool7, bool8);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof Window) {
                Window window = (Window) obj;
                if (!q.a((Object) this.f22504a, (Object) window.f22504a) || !q.a((Object) this.b, (Object) window.b) || !q.a(this.c, window.c) || !q.a(this.d, window.d) || !q.a(this.e, window.e) || !q.a(this.f, window.f) || !q.a(this.g, window.g) || !q.a(this.h, window.h) || !q.a(this.i, window.i) || !q.a(this.j, window.j) || !q.a(this.k, window.k) || !q.a(this.l, window.l) || !q.a(this.m, window.m) || !q.a(this.n, window.n) || !q.a(this.o, window.o) || !q.a(this.p, window.p)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f22504a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num2 = this.e;
        int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Boolean bool2 = this.f;
        int hashCode6 = (hashCode5 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Theme theme = this.g;
        int hashCode7 = (hashCode6 + (theme != null ? theme.hashCode() : 0)) * 31;
        Boolean bool3 = this.h;
        int hashCode8 = (hashCode7 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.i;
        int hashCode9 = (hashCode8 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Integer num3 = this.j;
        int hashCode10 = (hashCode9 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Orientation orientation = this.k;
        int hashCode11 = (hashCode10 + (orientation != null ? orientation.hashCode() : 0)) * 31;
        Boolean bool5 = this.l;
        int hashCode12 = (hashCode11 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        Boolean bool6 = this.m;
        int hashCode13 = (hashCode12 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
        WindowRatioConfig windowRatioConfig = this.n;
        int hashCode14 = (hashCode13 + (windowRatioConfig != null ? windowRatioConfig.hashCode() : 0)) * 31;
        Boolean bool7 = this.o;
        int hashCode15 = (hashCode14 + (bool7 != null ? bool7.hashCode() : 0)) * 31;
        Boolean bool8 = this.p;
        if (bool8 != null) {
            i = bool8.hashCode();
        }
        return hashCode15 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Window(title=" + this.f22504a + ", titleImage=" + this.b + ", titleColor=" + this.c + ", inheritDocumentTitle=" + this.d + ", navBarBgColor=" + this.e + ", navBarImmersive=" + this.f + ", navBarTheme=" + this.g + ", navBarHide=" + this.h + ", statusBarHide=" + this.i + ", pageBgColor=" + this.j + ", orientation=" + this.k + ", hideHomeIndicator=" + this.l + ", hideHomeTitleArea=" + this.m + ", windowRatioConfig=" + this.n + ", showBackButton=" + this.o + ", tabBarSafeArea=" + this.p + riy.BRACKET_END_STR;
    }

    public Window(String str, String str2, Integer num, Boolean bool, Integer num2, Boolean bool2, Theme theme, Boolean bool3, Boolean bool4, Integer num3, Orientation orientation, Boolean bool5, Boolean bool6, WindowRatioConfig windowRatioConfig, Boolean bool7, Boolean bool8) {
        this.f22504a = str;
        this.b = str2;
        this.c = num;
        this.d = bool;
        this.e = num2;
        this.f = bool2;
        this.g = theme;
        this.h = bool3;
        this.i = bool4;
        this.j = num3;
        this.k = orientation;
        this.l = bool5;
        this.m = bool6;
        this.n = windowRatioConfig;
        this.o = bool7;
        this.p = bool8;
    }

    public /* synthetic */ Window(String str, String str2, Integer num, Boolean bool, Integer num2, Boolean bool2, Theme theme, Boolean bool3, Boolean bool4, Integer num3, Orientation orientation, Boolean bool5, Boolean bool6, WindowRatioConfig windowRatioConfig, Boolean bool7, Boolean bool8, int i, o oVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : theme, (i & 128) != 0 ? null : bool3, (i & 256) != 0 ? null : bool4, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? null : orientation, (i & 2048) != 0 ? null : bool5, (i & 4096) != 0 ? null : bool6, (i & 8192) != 0 ? null : windowRatioConfig, (i & 16384) != 0 ? null : bool7, (i & 32768) != 0 ? null : bool8);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f22504a;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f22504a = str;
        }
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
        } else {
            this.c = num;
        }
    }

    public final Integer c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("9a45f411", new Object[]{this}) : this.c;
    }

    public final Boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("3a0effa8", new Object[]{this}) : this.d;
    }

    public final void b(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68e053ee", new Object[]{this, num});
        } else {
            this.e = num;
        }
    }

    public final Integer e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("2ea92693", new Object[]{this}) : this.e;
    }

    public final void a(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
        } else {
            this.f = bool;
        }
    }

    public final Boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("ce72322a", new Object[]{this}) : this.f;
    }

    public final void a(Theme theme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209b885a", new Object[]{this, theme});
        } else {
            this.g = theme;
        }
    }

    public final Theme g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Theme) ipChange.ipc$dispatch("f4a87fe0", new Object[]{this}) : this.g;
    }

    public final void b(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b66488c4", new Object[]{this, bool});
        } else {
            this.h = bool;
        }
    }

    public final Boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("62d564ac", new Object[]{this}) : this.h;
    }

    public final void c(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b26617a3", new Object[]{this, bool});
        } else {
            this.i = bool;
        }
    }

    public final Boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("ad06fded", new Object[]{this}) : this.i;
    }

    public final Integer j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("a1a124d8", new Object[]{this}) : this.j;
    }

    public final void a(Orientation orientation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87bb0eb3", new Object[]{this, orientation});
        } else {
            this.k = orientation;
        }
    }

    public final Orientation k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Orientation) ipChange.ipc$dispatch("8e19413d", new Object[]{this}) : this.k;
    }

    public final Boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("8b9bc9b0", new Object[]{this}) : this.l;
    }

    public final Boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("d5cd62f1", new Object[]{this}) : this.m;
    }

    public final WindowRatioConfig n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WindowRatioConfig) ipChange.ipc$dispatch("32606213", new Object[]{this}) : this.n;
    }

    public final void d(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae67a682", new Object[]{this, bool});
        } else {
            this.o = bool;
        }
    }

    public final Boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("6a309573", new Object[]{this}) : this.o;
    }

    public final Boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("b4622eb4", new Object[]{this}) : this.p;
    }

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f22505a;
        private String b;
        private String c;
        private Boolean d;
        private String e;
        private Boolean f;
        private Theme g;
        private Boolean h;
        private Boolean i;
        private String j;
        private Orientation k;
        private Boolean l;
        private Boolean m;
        private WindowRatioConfig n;

        static {
            kge.a(1669673457);
        }

        public final void b(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b66488c4", new Object[]{this, bool});
            } else {
                this.d = bool;
            }
        }

        public final void a(Theme theme) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("209b885a", new Object[]{this, theme});
            } else {
                this.g = theme;
            }
        }

        public final void a(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
            } else {
                this.h = bool;
            }
        }

        public final void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.j = str;
            }
        }

        public final Window a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Window) ipChange.ipc$dispatch("265ea53f", new Object[]{this}) : new Window(this.f22505a, this.b, f.a(this.c), this.d, f.a(this.e), this.f, this.g, this.h, this.i, f.a(this.j), this.k, this.l, this.m, this.n, null, null, 49152, null);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x021b, code lost:
            if (r1.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_white) != false) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x0225, code lost:
            if (r1.equals("light") != false) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x0227, code lost:
            r1 = com.taobao.themis.kernel.container.Window.Theme.LIGHT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x0230, code lost:
            if (r1.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_black) != false) goto L152;
         */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x0239, code lost:
            if (r1.equals("dark") != false) goto L152;
         */
        /* JADX WARN: Code restructure failed: missing block: B:117:0x023b, code lost:
            r1 = com.taobao.themis.kernel.container.Window.Theme.DARK;
         */
        /* JADX WARN: Removed duplicated region for block: B:125:0x0254  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x0260  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x027c  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x0291  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x0296  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x02bd  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x02d2  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x02d7  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0153  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0158  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.taobao.themis.kernel.container.Window a(com.alibaba.fastjson.JSONObject r37, com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper.Type r38) {
            /*
                Method dump skipped, instructions count: 826
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.kernel.container.Window.a.a(com.alibaba.fastjson.JSONObject, com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper$Type):com.taobao.themis.kernel.container.Window");
        }
    }

    /* loaded from: classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1773934622);
        }

        private b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }

        public final Window a(Window original, Window updates) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Window) ipChange.ipc$dispatch("afae8cdf", new Object[]{this, original, updates});
            }
            q.d(original, "original");
            q.d(updates, "updates");
            String a2 = updates.a();
            if (a2 == null) {
                a2 = original.a();
            }
            String b = updates.b();
            if (b == null) {
                b = original.b();
            }
            Integer c = updates.c();
            if (c == null) {
                c = original.c();
            }
            Boolean d = updates.d();
            if (d == null) {
                d = original.d();
            }
            Integer e = updates.e();
            if (e == null) {
                e = original.e();
            }
            Boolean f = updates.f();
            if (f == null) {
                f = original.f();
            }
            Theme g = updates.g();
            if (g == null) {
                g = original.g();
            }
            Boolean h = updates.h();
            if (h == null) {
                h = original.h();
            }
            Boolean i = updates.i();
            if (i == null) {
                i = original.i();
            }
            Integer j = updates.j();
            if (j == null) {
                j = original.j();
            }
            Orientation k = updates.k();
            if (k == null) {
                k = original.k();
            }
            Boolean l = updates.l();
            if (l == null) {
                l = original.l();
            }
            Boolean p = updates.p();
            if (p == null) {
                p = original.p();
            }
            return Window.a(original, a2, b, c, d, e, f, g, h, i, j, k, l, null, null, null, p, 28672, null);
        }
    }
}
