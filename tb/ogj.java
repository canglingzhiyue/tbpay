package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ogj extends ogl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOAD_MODE_ASYNC = "async";
    public static final String MODE_CONTAIN = "contain";
    public static final String MODE_COVER = "cover";
    public static final int MODE_DISABLE_LEVEL_MODEL = 256;
    public static final int MODE_DISABLE_QUALITY = 16;
    public static final int MODE_DISABLE_SHARPEN = 64;
    public static final int MODE_ENABLE_LEVEL_MODEL = 128;
    public static final int MODE_ENABLE_QUALITY = 8;
    public static final int MODE_ENABLE_SHARPEN = 32;
    public static final int MODE_ORIGINAL = 1;
    public static final int MODE_RESOLUTION = 512;
    public static final int MODE_SHORTSIDE = 2;
    public static final String MODE_STRETCH = "stretch";
    public static final int MODE_WEBP = 4;
    public int d;
    public Object e;
    public String f;
    public String g;
    public int h;
    public int i;
    public int j;
    public Object k;
    public String l;
    public String m;
    public String n;
    public String p;
    public String q;
    public int o = 0;

    /* renamed from: a  reason: collision with root package name */
    private int f32033a = 1;
    private int b = 1;
    public boolean r = true;
    public boolean s = false;
    public int t = 2;

    static {
        kge.a(-546576545);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012b, code lost:
        if (r12.equals("process-rotate") != false) goto L11;
     */
    @Override // tb.ogl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.content.Context r11, java.lang.String r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ogj.a(android.content.Context, java.lang.String, java.lang.Object):void");
    }

    public void b(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dff9e1b", new Object[]{this, context, obj});
        } else {
            this.d = odx.a(context, 1, a("tint-color", obj), c(), d(), oeb.cy());
        }
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (!TextUtils.isEmpty(str)) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1078030475) {
                if (hashCode != 107348) {
                    if (hashCode == 3202466 && str.equals("high")) {
                        c = 2;
                    }
                } else if (str.equals("low")) {
                    c = 0;
                }
            } else if (str.equals("medium")) {
                c = 1;
            }
            if (c == 0) {
                return 1;
            }
            if (c != 1 && c == 2) {
                return 3;
            }
        }
        return 2;
    }

    @Override // tb.ogl
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        Object obj = this.e;
        if (obj instanceof byte[]) {
            return 6;
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        if (!((String) obj).startsWith(ogw.BASE64_TAG)) {
            return ((String) this.e).length();
        }
        return 10;
    }

    @Override // tb.ogl
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        Object obj = this.e;
        if (obj instanceof byte[]) {
            return ogw.BIN_TAG;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        return ((String) obj).startsWith(ogw.BASE64_TAG) ? ogw.BASE64_TAG : (String) this.e;
    }
}
