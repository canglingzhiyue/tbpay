package tb;

import android.graphics.Color;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.DecimalFormat;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class beq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PRICE_DECIMAL_DEFAULT_LENGTH = 2;
    public static final int PRICE_DECIMAL_DEFAULT_SIZE = 10;
    public static final int PRICE_INTEGER_DEFAULT_SIZE = 12;
    private static a d;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f25837a;
        public int b;

        static {
            kge.a(-1987013349);
        }

        public b(int i, int i2) {
            this.f25837a = i;
            this.b = i2;
        }
    }

    static {
        kge.a(-1952303326);
        d = null;
    }

    public static void a(TextView textView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("308335f0", new Object[]{textView, str, str2});
        } else if (textView == null || StringUtils.isEmpty(str)) {
        } else {
            if (d == null) {
                d = a("common_price");
                d.a(ber.a(beu.a("cart_groupCharge_price_currency_part", "fontSize"), 12));
                d.b(ber.a(beu.a("cart_groupCharge_price_integer_part", "fontSize"), 12));
                d.d(ber.a(beu.a("cart_groupCharge_price_decimal_part", "fontSize"), 10));
                d.e(1);
            }
            d.a(str);
            d.b(str2);
            SpannableString a2 = a(d);
            if (a2 != null) {
                textView.setText(a2);
            } else {
                textView.setText(str);
            }
        }
    }

    private static a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("16a15f69", new Object[]{str});
        }
        a a2 = a.a();
        HashMap<String, Object> a3 = beu.a(str);
        if (a3 != null) {
            Object obj = a3.get("textColor");
            Object obj2 = a3.get("ems");
            Object obj3 = a3.get("visible");
            Object obj4 = a3.get("fontSize");
            if (obj != null) {
                a2.c(String.valueOf(obj));
            }
            if (obj2 != null) {
                a2.c(ber.a(String.valueOf(obj2), 2));
            }
            if (obj3 != null) {
                if ("1".equals(String.valueOf(obj3))) {
                    a2.a(true);
                } else {
                    a2.a(false);
                }
            }
            if (obj4 != null) {
                a2.b(ber.a(String.valueOf(obj4), 12));
            }
        }
        return a2;
    }

    public static SpannableString a(a aVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("8f63998b", new Object[]{aVar});
        }
        SpannableString spannableString = null;
        if (aVar != null && a.a(aVar)) {
            spannableString = new SpannableString(a.b(aVar));
            b bVar = new b(0, a.b(aVar).length());
            a(spannableString, bVar, a.c(aVar));
            b d2 = a.d(aVar);
            if (d2 != null) {
                a(spannableString, a.e(aVar) == 1, d2, a.f(aVar));
            }
            b g = a.g(aVar);
            if (g != null) {
                a(spannableString, a.e(aVar) == 1, g, a.h(aVar));
            }
            b i = a.i(aVar);
            if (i != null) {
                if (a.e(aVar) == 1) {
                    z = true;
                }
                a(spannableString, z, i, a.j(aVar));
            }
            if (a.k(aVar)) {
                a(spannableString, bVar);
            }
            if (a.l(aVar)) {
                b(spannableString, bVar);
            }
        }
        return spannableString;
    }

    public static SpannableString a(SpannableString spannableString, b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("77b66000", new Object[]{spannableString, bVar, str});
        }
        spannableString.setSpan(new ForegroundColorSpan(ber.b(str, Color.parseColor(str))), bVar.f25837a, bVar.b, 0);
        return spannableString;
    }

    public static SpannableString a(SpannableString spannableString, boolean z, b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("732a7c03", new Object[]{spannableString, new Boolean(z), bVar, new Integer(i)});
        }
        spannableString.setSpan(new AbsoluteSizeSpan(i, z), bVar.f25837a, bVar.b, 0);
        return spannableString;
    }

    public static SpannableString a(SpannableString spannableString, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("9b06760a", new Object[]{spannableString, bVar});
        }
        spannableString.setSpan(new StrikethroughSpan(), bVar.f25837a, bVar.b, 0);
        return spannableString;
    }

    public static SpannableString b(SpannableString spannableString, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("b5776f29", new Object[]{spannableString, bVar});
        }
        spannableString.setSpan(new StyleSpan(1), bVar.f25837a, bVar.b, 0);
        return spannableString;
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f25836a;
        private String c;
        private b j;
        private b k;
        private b l;
        private boolean m;
        private String b = "#FF4400";
        private int d = 12;
        private int e = 12;
        private int f = 2;
        private int g = 10;
        private boolean h = false;
        private boolean i = false;
        private int n = 1;

        static {
            kge.a(-1798367271);
        }

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c986bd31", new Object[]{aVar})).booleanValue() : aVar.b();
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c639d6f2", new Object[]{aVar}) : aVar.f25836a;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4e6a16d1", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ b d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("7645858a", new Object[]{aVar}) : aVar.j;
        }

        public static /* synthetic */ int e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("30f46624", new Object[]{aVar})).intValue() : aVar.n;
        }

        public static /* synthetic */ int f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8acfd065", new Object[]{aVar})).intValue() : aVar.d;
        }

        public static /* synthetic */ b g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("6a4a3227", new Object[]{aVar}) : aVar.k;
        }

        public static /* synthetic */ int h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3e86a4e7", new Object[]{aVar})).intValue() : aVar.e;
        }

        public static /* synthetic */ b i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("624d4fe5", new Object[]{aVar}) : aVar.l;
        }

        public static /* synthetic */ int j(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f23d7969", new Object[]{aVar})).intValue() : aVar.g;
        }

        public static /* synthetic */ boolean k(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c18e3bb", new Object[]{aVar})).booleanValue() : aVar.i;
        }

        public static /* synthetic */ boolean l(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a5f44dfc", new Object[]{aVar})).booleanValue() : aVar.m;
        }

        private a() {
        }

        public static a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("593d1bf3", new Object[0]) : new a();
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("16a15f69", new Object[]{this, str});
            }
            this.f25836a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9ed19f48", new Object[]{this, str});
            }
            if (str != null) {
                this.c = str.trim();
            }
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cd055e20", new Object[]{this, new Integer(i)});
            }
            if (i > 0) {
                this.d = i;
            }
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2701df27", new Object[]{this, str});
            }
            if (!StringUtils.isEmpty(str)) {
                this.b = str;
            }
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("26e0c861", new Object[]{this, new Integer(i)});
            }
            if (i > 0) {
                this.e = i;
            }
            return this;
        }

        public a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("80bc32a2", new Object[]{this, new Integer(i)});
            }
            if (i > 0) {
                this.f = i;
            }
            return this;
        }

        public a d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("da979ce3", new Object[]{this, new Integer(i)});
            }
            if (i > 0) {
                this.g = i;
            }
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4fd1596f", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public a e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("34730724", new Object[]{this, new Integer(i)});
            }
            this.n = i;
            return this;
        }

        public static String d(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str}) : (str == null || str.indexOf(".") <= 0) ? str : str.replaceAll("0+?$", "").replaceAll("[.]$", "");
        }

        private boolean b() {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            try {
                if (StringUtils.isEmpty(this.f25836a)) {
                    return false;
                }
                if (this.d > this.e) {
                    this.d = this.e;
                }
                if (StringUtils.isEmpty(this.c)) {
                    char charAt = this.f25836a.charAt(0);
                    int i2 = 0;
                    while (i2 < this.f25836a.length() && !Character.isDigit(charAt)) {
                        i2++;
                        charAt = this.f25836a.charAt(i2);
                    }
                    if (i2 > 0 && i2 < this.f25836a.length()) {
                        this.c = this.f25836a.substring(0, i2);
                    }
                }
                if (!StringUtils.isEmpty(this.c)) {
                    this.j = new b(0, this.c.length());
                    i = this.c.length();
                    this.f25836a = this.f25836a.substring(i);
                } else {
                    i = 0;
                }
                StringBuilder sb = new StringBuilder("0");
                if (this.f > 0) {
                    sb.append(".");
                    for (int i3 = 0; i3 < this.f; i3++) {
                        sb.append("0");
                    }
                }
                this.f25836a = new DecimalFormat(sb.toString()).format(Double.parseDouble(this.f25836a));
                if (!StringUtils.isEmpty(this.f25836a)) {
                    this.f25836a = this.f25836a.replaceAll(",", ".");
                }
                if (!this.h) {
                    this.f25836a = d(this.f25836a);
                }
                if (!StringUtils.isEmpty(this.c)) {
                    this.f25836a = this.c + this.f25836a;
                }
                int indexOf = this.f25836a.indexOf(".");
                if (indexOf > 0) {
                    this.k = new b(i, indexOf);
                    this.l = new b(indexOf, this.f25836a.length());
                } else {
                    this.k = new b(i, this.f25836a.length());
                    this.l = null;
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }
}
