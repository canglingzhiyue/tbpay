package tb;

import android.content.Context;
import android.support.v4.util.LruCache;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.uikit.media.expression.Expression;
import com.taobao.message.uikit.media.expression.ExpressionTable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class ogf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREFIX = "/:";
    public static final String SINGLE_EMOTICON_PATTERN = "^\\[[a-zA-Z0-9\\u4e00-\\u9fa5]+\\-[a-zA-Z0-9\\u4e00-\\u9fa5]+\\]$";

    /* renamed from: a  reason: collision with root package name */
    public static Pattern f32025a;
    private static Context b;
    private static LruCache<String, Integer> c;
    private static SparseArray<Expression> d;

    static {
        kge.a(1905492454);
        f32025a = Pattern.compile("\\[[a-zA-Z0-9\\u4e00-\\u9fa5]+\\-[a-zA-Z0-9\\u4e00-\\u9fa5]+\\]");
        c = new LruCache<>(100);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            b = context.getApplicationContext();
        }
    }

    private static SparseArray<Expression> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("69917611", new Object[0]);
        }
        if (d == null) {
            d = ExpressionTable.getExpressionMap(new String[]{"im", "guang"});
        }
        return d;
    }

    public static CharSequence a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("d3ccd981", new Object[]{context, str, new Integer(i)}) : a(context, str, i, false);
    }

    private static String a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bdaf8ad8", new Object[]{new Integer(i), new Integer(i2)});
        }
        int i3 = a().get(i).localResInt;
        return "<img src=\"./res_id_" + i3 + ".png\" style=\"width:" + i2 + ";height:" + i2 + "\"/>";
    }

    public static String a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75f5ebaf", new Object[]{str, new Integer(i)});
        }
        String[] split = str.split(PREFIX);
        if (split == null || split.length <= 1) {
            return str;
        }
        if (i == 0) {
            i = 18;
        }
        int a2 = ohd.a(b, i);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < split.length; i2++) {
            if (!StringUtils.isEmpty(split[i2])) {
                int e = e(split[i2]);
                String str2 = null;
                if (e != -1) {
                    str2 = a(e, a2);
                }
                if (i2 == 0 && !str.startsWith(PREFIX)) {
                    sb.append(split[i2]);
                } else if (str2 == null) {
                    sb.append(PREFIX + split[i2]);
                } else {
                    String k = oec.k(a().get(e).value);
                    sb.append(str2);
                    sb.append(split[i2].substring(k.length() - 2));
                }
            }
        }
        return sb.toString();
    }

    private static int e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c6cb129", new Object[]{str})).intValue();
        }
        if (str == null) {
            return -1;
        }
        Integer num = c.get(str);
        if (num != null) {
            return num.intValue();
        }
        if (str.contains("O=O")) {
            c.put(str, 72);
            return 72;
        }
        String j = oec.j(str);
        for (int i = 0; i < a().size(); i++) {
            if ((PREFIX + j).contains(a().get(i).value)) {
                c.put(j, Integer.valueOf(i));
                return i;
            }
        }
        return -1;
    }

    private static CharSequence a(Context context, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("2ebd0d7f", new Object[]{context, str, new Integer(i), new Boolean(z)});
        }
        String[] split = str.split(PREFIX);
        if (split == null || split.length <= 1) {
            return z ? new SpannableString(str) : str;
        }
        if (i == 0) {
            i = 18;
        }
        return ExpressionTable.getExpressionString(context, str, true, ohd.e(context, ohd.a(context, i)));
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return 0;
        }
        a c2 = c(str);
        a d2 = d(c2.f32026a);
        return c2.b + d2.b + d2.f32026a.length();
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        for (int i = 0; i < a().size(); i++) {
            if (a().get(i).value.contains(str)) {
                return true;
            }
        }
        return str.matches(SINGLE_EMOTICON_PATTERN);
    }

    public static a c(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3d480e27", new Object[]{str});
        }
        a aVar = new a();
        if (StringUtils.isEmpty(str)) {
            return aVar;
        }
        String[] split = str.split(PREFIX);
        StringBuilder sb = new StringBuilder();
        if (split != null && split.length != 0) {
            int i2 = 0;
            while (i < split.length) {
                String str2 = split[i];
                int e = e(str2);
                if (e != -1) {
                    i2++;
                    sb.append(str2.substring(a().get(e).value.length() - 2));
                } else {
                    sb.append(i == 0 ? "" : PREFIX);
                    sb.append(str2);
                }
                i++;
            }
            i = i2;
        }
        aVar.b = i;
        aVar.f32026a = sb.toString();
        return aVar;
    }

    public static a d(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c5784e06", new Object[]{str});
        }
        a aVar = new a();
        Matcher matcher = f32025a.matcher(str);
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (matcher.find()) {
            i2++;
            sb.append(str.substring(i, matcher.start()));
            i = matcher.end();
        }
        sb.append(str.substring(i, str.length()));
        aVar.f32026a = sb.toString();
        aVar.b = i2;
        return aVar;
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f32026a;
        public int b;

        static {
            kge.a(17479867);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Result{emoticonCount=" + this.b + ", fragmentary='" + this.f32026a + "'}";
        }
    }
}
