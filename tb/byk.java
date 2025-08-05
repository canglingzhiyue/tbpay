package tb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.net.URLEncoder;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class byk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f26177a = {"securityguard_linkfilter_namespace"};
    private static boolean b = false;

    public static byl a(String str, String str2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byl) ipChange.ipc$dispatch("c0a376e5", new Object[]{str, str2, context});
        }
        byl bylVar = new byl(null, false);
        if (str == null) {
            return bylVar;
        }
        if (context != null) {
            try {
                if (!(context instanceof Application)) {
                    context = context.getApplicationContext();
                }
            } catch (Exception e) {
                e.printStackTrace();
                return bylVar;
            }
        }
        a(context);
        bylVar = b(str, str2, context);
        return a(str, bylVar);
    }

    private static byl b(String str, String str2, Context context) {
        int i;
        String a2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (byl) ipChange.ipc$dispatch("87af5de6", new Object[]{str, str2, context});
        }
        byl bylVar = new byl(null, false);
        if (str2 == null) {
            str2 = "";
        }
        if (c(str, context) && d(str2, context) && (a2 = a(str, context)) != null) {
            String a3 = a("jump_to_url_prefix", context, "https://m.taobao.com/index.htm?");
            bylVar.b = a3 + a2;
            bylVar.f26179a = true;
            return bylVar;
        } else if (b(str, context) && e(str2, context)) {
            String a4 = a(str);
            int indexOf = a4.indexOf("?");
            if (indexOf == -1) {
                i = a4.length();
                z = false;
            } else {
                i = indexOf + 1;
            }
            bylVar.b = a(a4, str2, i, false, z);
            return bylVar;
        } else {
            if (f(str2, context)) {
                String a5 = a(str, str2, "_ariver_appid=", false);
                if (a5 == null && (a5 = a(str, str2, "_ariver_appid%3d", true)) == null) {
                    a5 = a(str, str2, "_ariver_appid%3D", true);
                }
                bylVar.b = a5;
            }
            return bylVar;
        }
    }

    private static String a(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d604f12", new Object[]{str, str2, str3, new Boolean(z)});
        }
        if (str.indexOf(str3) == -1) {
            return null;
        }
        String a2 = a(str);
        return a(a2, str2, a2.indexOf(str3), z, true);
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : str.replaceAll("x_sg_scheme", "x_sg_scheme_ss").replaceAll("x_sg_handled", "x_sg_handled_ss").replaceAll("x_sg_package", "x_sg_package_ss");
    }

    private static String a(String str, String str2, int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("258c11b9", new Object[]{str, str2, new Integer(i), new Boolean(z), new Boolean(z2)});
        }
        if (i == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String b2 = b(str);
        String str3 = z ? "%26" : "&";
        try {
            str2 = URLEncoder.encode(str2, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        sb.append(str.substring(0, i));
        if (!z2) {
            sb.append("?");
        }
        a(sb, "x_sg_scheme", b2, z);
        sb.append(str3);
        a(sb, "x_sg_handled", "true", z);
        sb.append(str3);
        a(sb, "x_sg_package", str2, z);
        if (z2) {
            sb.append(str3);
            sb.append(str.substring(i));
        }
        return sb.toString();
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        int indexOf = str.indexOf(":");
        return indexOf == -1 ? "" : str.substring(0, indexOf);
    }

    private static String a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7da5f8a", new Object[]{str, context});
        }
        String a2 = a("extract_id_regex", context, "(?<=(buyParam|itemId)=)([0-9]+)");
        if (a2 == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(a2, 2).matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(0);
    }

    private static boolean a(String str, String str2, Context context, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f118b09a", new Object[]{str, str2, context, str3})).booleanValue();
        }
        String a2 = a(str, context, str3);
        if (a2 != null) {
            return Pattern.compile(a2, 2).matcher(str2).find();
        }
        return false;
    }

    private static boolean b(String str, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0b29db9", new Object[]{str, context})).booleanValue() : a("short_url_regex", str, context, "taobao://{1,}([a-zA-Z0-9]{1,}.tb.cn)+");
    }

    private static boolean c(String str, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2a7d3f98", new Object[]{str, context})).booleanValue() : a("normal_url_regex", str, context, "taobao://{1,}(m\\.taobao\\.com/[\\./]{0,}cart/[\\./]{0,}order|main\\.m\\.taobao\\.com/[\\./]{0,}order/[\\./]{0,}index|h5\\.m\\.taobao\\.com/[\\./]{0,}cart/[\\./]{0,}order)+");
    }

    private static boolean c(String str, String str2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11c2f20e", new Object[]{str, str2, context})).booleanValue();
        }
        if (str2 != null && str2.length() != 0) {
            return a(str, str2, context, oan.DEFAULT_PLAN_B_PASSWORD_REGEX);
        }
        return true;
    }

    private static boolean d(String str, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6447e177", new Object[]{str, context})).booleanValue() : c("normal_package_regex", str, context);
    }

    private static boolean e(String str, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e128356", new Object[]{str, context})).booleanValue() : c("short_url_package_regex", str, context);
    }

    private static boolean f(String str, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d7dd2535", new Object[]{str, context})).booleanValue() : c("small_prog_package_regex", str, context);
    }

    private static void a(StringBuilder sb, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ed7d5d", new Object[]{sb, str, str2, new Boolean(z)});
            return;
        }
        sb.append(str);
        sb.append(z ? "%3D" : "=");
        sb.append(str2);
    }

    private static void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (b || context == null) {
        } else {
            try {
                OrangeConfig.getInstance().registerListener(f26177a, new d() { // from class: tb.byk.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.orange.d
                    public void onConfigUpdate(String str, Map<String, String> map) {
                        Map<String, String> configs;
                        String[] strArr;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                            return;
                        }
                        try {
                            SharedPreferences sharedPreferences = context.getSharedPreferences("sg_link_filter", 0);
                            String string = sharedPreferences.getString("configVersion", null);
                            String str2 = map.get("configVersion");
                            if (str2 == null || str2.equals(string) || (configs = OrangeConfig.getInstance().getConfigs("securityguard_linkfilter_namespace")) == null) {
                                return;
                            }
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putString("configVersion", str2);
                            for (String str3 : new String[]{"short_url_regex", "extract_id_regex", "normal_url_regex", "normal_package_regex", "short_url_package_regex", "small_prog_package_regex"}) {
                                String string2 = sharedPreferences.getString(str3, null);
                                String str4 = configs.get(str3);
                                if (str4 != null && !str4.equals(string2)) {
                                    edit.putString(str3, str4);
                                }
                            }
                            edit.apply();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }, true);
                b = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static String a(String str, Context context, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("123f9c80", new Object[]{str, context, str2});
        }
        String config = OrangeConfig.getInstance().getConfig("securityguard_linkfilter_namespace", str, null);
        String string = (config != null || context == null) ? config : context.getSharedPreferences("sg_link_filter", 0).getString(str, null);
        return string == null ? str2 : string;
    }

    private static byl a(String str, byl bylVar) {
        try {
            return (byl) Class.forName("com.alibaba.wireless.security.sglinkfilter.SGLinkFilterExt").getDeclaredMethod("checkBlackMarketURL", String.class, byl.class).invoke(null, str, bylVar);
        } catch (Exception unused) {
            return bylVar;
        }
    }
}
