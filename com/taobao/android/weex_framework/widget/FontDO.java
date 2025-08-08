package com.taobao.android.weex_framework.widget;

import android.graphics.Typeface;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.m;
import com.taobao.android.weex_framework.util.e;
import com.taobao.android.weex_framework.util.g;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes6.dex */
public class FontDO {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATE_FAILED = 3;
    public static final int STATE_INIT = 0;
    public static final int STATE_INVALID = -1;
    public static final int STATE_LOADING = 1;
    public static final int STATE_SUCCESS = 2;
    public static final int TYPE_BASE64 = 5;
    public static final int TYPE_FILE = 2;
    public static final int TYPE_LOCAL = 3;
    public static final int TYPE_NATIVE = 4;
    public static final int TYPE_NETWORK = 1;
    public static final int TYPE_UNKNOWN = 0;

    /* renamed from: a  reason: collision with root package name */
    private final String f16098a;
    private String b;
    private String c;
    private Typeface e;
    private int d = 1;
    private int f = -1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface FontState {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface FontType {
    }

    static {
        kge.a(-352531671);
    }

    public FontDO(String str, String str2, MUSDKInstance mUSDKInstance) {
        this.f16098a = str;
        this.b = str2;
        a(str2, mUSDKInstance);
    }

    private void a(String str, MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9298f404", new Object[]{this, str, mUSDKInstance});
            return;
        }
        String trim = str != null ? str.trim() : "";
        char c = 65535;
        if (trim.isEmpty()) {
            this.f = -1;
            g.b(mUSDKInstance, "font url is empty");
            return;
        }
        if (trim.matches("^url\\((('.*')|(\".*\"))\\)$")) {
            Uri parse = Uri.parse(trim.substring(5, trim.length() - 2));
            if (parse != null) {
                this.b = parse.toString();
                try {
                    String scheme = parse.getScheme();
                    switch (scheme.hashCode()) {
                        case 3076010:
                            if (scheme.equals("data")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 3143036:
                            if (scheme.equals("file")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 3213448:
                            if (scheme.equals("http")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 99617003:
                            if (scheme.equals("https")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 103145323:
                            if (scheme.equals("local")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (c == 0 || c == 1) {
                        this.d = 1;
                    } else if (c == 2) {
                        this.d = 2;
                        this.b = parse.getEncodedSchemeSpecificPart();
                    } else if (c == 3) {
                        this.d = 3;
                    } else if (c == 4) {
                        long currentTimeMillis = System.currentTimeMillis();
                        String[] split = trim.split(",");
                        if (split != null && split.length == 2) {
                            String str2 = split[0];
                            if (!StringUtils.isEmpty(str2) && str2.endsWith("base64")) {
                                String str3 = split[1];
                                if (!StringUtils.isEmpty(str3)) {
                                    String b = e.b(str3);
                                    File file = new File(m.b().getCacheDir(), com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_font_family);
                                    if (!file.exists()) {
                                        file.mkdirs();
                                    }
                                    File file2 = new File(file, b);
                                    if (!file2.exists()) {
                                        file2.createNewFile();
                                        e.a(file2.getPath(), Base64.decode(str3, 0), m.b());
                                    }
                                    this.b = file2.getPath();
                                    this.d = 5;
                                    g.b("Parse base64 font cost " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                                }
                            }
                        }
                    } else {
                        g.c(mUSDKInstance, "unknown scheme for font url " + this.b);
                        this.d = 0;
                    }
                    this.f = 0;
                } catch (Exception e) {
                    g.c("convertUrl failed url is " + this.b, e);
                }
            }
        } else {
            this.b = trim;
            this.f = -1;
        }
        if (!g.a()) {
            return;
        }
        g.a("load font src: " + trim + " parsed url " + this.b + ", type:" + this.d);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.d;
    }

    public Typeface c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Typeface) ipChange.ipc$dispatch("a3350ae0", new Object[]{this}) : this.e;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void a(Typeface typeface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e14e31e", new Object[]{this, typeface});
        } else {
            this.e = typeface;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.f;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.f16098a;
    }
}
