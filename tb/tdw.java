package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public class tdw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f34049a;
    private Map<String, Pattern> b;
    private Map<String, Pattern> c;
    private Map<String, Pattern> d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static tdw f34050a;

        static {
            kge.a(-1044794038);
            f34050a = new tdw();
        }

        public static /* synthetic */ tdw a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (tdw) ipChange.ipc$dispatch("f0ae5f7", new Object[0]) : f34050a;
        }
    }

    static {
        kge.a(-14689673);
    }

    public static tdw a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tdw) ipChange.ipc$dispatch("f0ae5f7", new Object[0]) : a.a();
    }

    private tdw() {
        this.f34049a = "ParserMatchManager";
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = "[🔑🗝😺😸🎁📲💰💲✔🎵🔐/]";
        this.f = "[aZ0bY1cX2dW3eV4fU5gT6hS7iR8jQ9kPlOmNnMoLpKqJrIsHtGuFvEwDxCyBzA]{7,15}|[的一是了我不人在他有这个上们来到时大地为子中你说生国年着就那和要她出也得里后自以会家可下而过天去能对小多然于心学么之都好看起]{7,15}|[㊊㊋㊌㊍㊎㊏㊐㊑㊒㊓㊔㊕㊖㊗㊘㊜㊝㊞㊟㊠㊡㊢㊣㊤㊥㊦㊧㊨㊩㊪㊫㊬㊭㊮㊯㊰]{7,15}";
        this.g = "[()/￥€£₴$₰¢₤¥₳₲₪₵《🔑🗝😺😸🎁📲💰💲✔🎵🔐]([aZ0bY1cX2dW3eV4fU5gT6hS7iR8jQ9kPlOmNnMoLpKqJrIsHtGuFvEwDxCyBzA]{7,15})[()/￥€£₴$₰¢₤¥₳₲₪₵《🔑🗝😺😸🎁📲💰💲✔🎵🔐]";
        this.h = "(1[3-9]\\d{9})|(\\d{3,4}-\\d{7,8})|(\\d{17}[\\dX]|\\d{15})";
        this.i = this.h;
        this.j = "android_share";
        this.k = "replaceRegex";
        this.l = "findARegex";
        this.m = "findRegex";
        this.n = "phoneRegex";
        this.o = "isUseExtractFeature";
        this.p = "isUsePhoneRegex";
        this.q = "isUseExtractHash";
        this.r = "isUseSha256Hash";
        f();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        String config = OrangeConfig.getInstance().getConfig(this.j, this.k, this.e);
        String config2 = OrangeConfig.getInstance().getConfig(this.j, this.m, this.f);
        String config3 = OrangeConfig.getInstance().getConfig(this.j, this.l, this.g);
        this.i = OrangeConfig.getInstance().getConfig(this.j, this.n, this.h);
        this.b.put("A", Pattern.compile(config3));
        this.c.put("B", Pattern.compile(config));
        this.d.put("B", Pattern.compile(config2));
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig(this.j, this.o, "true"));
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig(this.j, this.p, "true"));
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig(this.j, this.q, "false"));
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig(this.j, this.r, "false"));
    }

    public List<tdv<String, String>> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        String str2 = "";
        nyy.b(this.f34049a + ":parserStrategyATaoPasswordKey:", str != null ? str : str2);
        String str3 = this.f34049a + ":parserStrategyATaoPasswordKey regxPatternPlanAMap:";
        Map<String, Pattern> map = this.b;
        if (map != null) {
            str2 = map.toString();
        }
        nyy.b(str3, str2);
        if (c()) {
            str = str.replaceAll(this.i, " ");
            nyy.b(this.f34049a + ":parserStrategyATaoPasswordKey phoneRegex replace:", str);
        }
        ArrayList arrayList = new ArrayList();
        if (this.b.size() > 0) {
            for (Map.Entry<String, Pattern> entry : this.b.entrySet()) {
                if (entry.getValue() != null) {
                    Matcher matcher = entry.getValue().matcher(str);
                    while (matcher.find()) {
                        arrayList.add(new tdv(entry.getKey(), matcher.group(1)));
                    }
                }
            }
        }
        return arrayList;
    }

    public List<tdv<String, String>> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89cdf874", new Object[]{this, str});
        }
        String str2 = "";
        nyy.b(this.f34049a + ":parserStrategyBTaoPasswordKey:", str != null ? str : str2);
        String str3 = this.f34049a + ":parserStrategyBTaoPasswordKey regxPatternPlanBReplaceMap:";
        Map<String, Pattern> map = this.c;
        nyy.b(str3, map != null ? map.toString() : str2);
        String str4 = this.f34049a + ":parserStrategyBTaoPasswordKey regxPatternPlanBFindMap:";
        Map<String, Pattern> map2 = this.d;
        if (map2 != null) {
            str2 = map2.toString();
        }
        nyy.b(str4, str2);
        if (c()) {
            str = str.replaceAll(this.i, " ");
            nyy.b(this.f34049a + ":parserStrategyBTaoPasswordKey phoneRegex replace:", str);
        }
        ArrayList arrayList = new ArrayList();
        if (this.c.size() > 0 && this.d.size() > 0) {
            for (Map.Entry<String, Pattern> entry : this.c.entrySet()) {
                if (entry.getValue() != null) {
                    String replaceAll = entry.getValue().matcher(str).replaceAll(" ");
                    nyy.b(this.f34049a + ":parserStrategyBTaoPasswordKey BReplaceRegex replace:", replaceAll);
                    if (this.d.get(entry.getKey()) != null) {
                        Matcher matcher = this.d.get(entry.getKey()).matcher(replaceAll);
                        while (matcher.find()) {
                            arrayList.add(new tdv(entry.getKey(), matcher.group()));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public List<String> c(String str) {
        ArrayList<String> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb209513", new Object[]{this, str});
        }
        try {
            arrayList = new ArrayList();
        } catch (Throwable unused) {
        }
        if (!b()) {
            arrayList.add(str);
            return arrayList;
        }
        List<tdv<String, String>> a2 = a(str);
        if (a2 == null || a2.size() == 0) {
            a2 = b(str);
        }
        if (a2 != null && a2.size() != 0) {
            for (tdv<String, String> tdvVar : a2) {
                arrayList.add(tdvVar.a());
            }
            nyy.b(this.f34049a + ":listStr append:", arrayList.toString());
            if (!d()) {
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : arrayList) {
                arrayList2.add(d(str2));
            }
            return arrayList2;
        }
        return null;
    }

    private String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str});
        }
        if (e()) {
            return f(str);
        }
        return e(str);
    }

    private String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{this, str});
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                sb.append(String.format("%02x", Byte.valueOf(digest[i])));
            }
            return sb.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    private String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd890709", new Object[]{this, str});
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Throwable unused) {
            return str;
        }
    }
}
