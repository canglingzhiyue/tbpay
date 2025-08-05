package com.taobao.weex.utils;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.support.v4.view.InputDeviceCompat;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.weex.utils.SingleFunctionParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public class WXResourceUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Integer> f23538a;
    private static final SingleFunctionParser.FlatMapper<Integer> b;
    private static final SingleFunctionParser.NonUniformMapper<Number> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public enum ColorConvertHandler {
        NAMED_COLOR_HANDLER { // from class: com.taobao.weex.utils.WXResourceUtils.ColorConvertHandler.1
            @Override // com.taobao.weex.utils.WXResourceUtils.ColorConvertHandler
            Pair<Boolean, Integer> handle(String str) {
                return WXResourceUtils.a().containsKey(str) ? new Pair<>(Boolean.TRUE, WXResourceUtils.a().get(str)) : new Pair<>(Boolean.FALSE, 0);
            }
        },
        RGB_HANDLER { // from class: com.taobao.weex.utils.WXResourceUtils.ColorConvertHandler.2
            @Override // com.taobao.weex.utils.WXResourceUtils.ColorConvertHandler
            Pair<Boolean, Integer> handle(String str) {
                if (str.length() != 4) {
                    return (str.length() == 7 || str.length() == 9) ? new Pair<>(Boolean.TRUE, Integer.valueOf(Color.parseColor(str))) : new Pair<>(Boolean.FALSE, 0);
                }
                int parseInt = Integer.parseInt(str.substring(1, 2), 16);
                int parseInt2 = Integer.parseInt(str.substring(2, 3), 16);
                int parseInt3 = Integer.parseInt(str.substring(3, 4), 16);
                return new Pair<>(Boolean.TRUE, Integer.valueOf(Color.rgb(parseInt + (parseInt << 4), parseInt2 + (parseInt2 << 4), parseInt3 + (parseInt3 << 4))));
            }
        },
        FUNCTIONAL_RGB_HANDLER { // from class: com.taobao.weex.utils.WXResourceUtils.ColorConvertHandler.3
            @Override // com.taobao.weex.utils.WXResourceUtils.ColorConvertHandler
            Pair<Boolean, Integer> handle(String str) {
                List parse = new SingleFunctionParser(str, WXResourceUtils.b()).parse("rgb");
                return (parse == null || parse.size() != 3) ? new Pair<>(Boolean.FALSE, 0) : new Pair<>(Boolean.TRUE, Integer.valueOf(Color.rgb(((Integer) parse.get(0)).intValue(), ((Integer) parse.get(1)).intValue(), ((Integer) parse.get(2)).intValue())));
            }
        },
        FUNCTIONAL_RGBA_HANDLER { // from class: com.taobao.weex.utils.WXResourceUtils.ColorConvertHandler.4
            @Override // com.taobao.weex.utils.WXResourceUtils.ColorConvertHandler
            Pair<Boolean, Integer> handle(String str) {
                List parse = new SingleFunctionParser(str, WXResourceUtils.c()).parse("rgba");
                return parse.size() == 4 ? new Pair<>(Boolean.TRUE, Integer.valueOf(Color.argb(ColorConvertHandler.parseAlpha(((Number) parse.get(3)).floatValue()), ((Number) parse.get(0)).intValue(), ((Number) parse.get(1)).intValue(), ((Number) parse.get(2)).intValue()))) : new Pair<>(Boolean.FALSE, 0);
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        public static int parseAlpha(float f) {
            return (int) (f * 255.0f);
        }

        abstract Pair<Boolean, Integer> handle(String str);
    }

    public static /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]) : f23538a;
    }

    public static /* synthetic */ SingleFunctionParser.FlatMapper b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SingleFunctionParser.FlatMapper) ipChange.ipc$dispatch("fc5ee1b4", new Object[0]) : b;
    }

    public static /* synthetic */ SingleFunctionParser.NonUniformMapper c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SingleFunctionParser.NonUniformMapper) ipChange.ipc$dispatch("13421907", new Object[0]) : c;
    }

    static {
        kge.a(-1244741783);
        f23538a = new HashMap();
        b = new SingleFunctionParser.FlatMapper<Integer>() { // from class: com.taobao.weex.utils.WXResourceUtils.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.taobao.weex.utils.SingleFunctionParser.FlatMapper
            /* renamed from: map */
            public Integer mo1597map(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Integer) ipChange.ipc$dispatch("930bd0d4", new Object[]{this, str});
                }
                int parseUnitOrPercent = WXUtils.parseUnitOrPercent(str, 255);
                if (parseUnitOrPercent < 0) {
                    parseUnitOrPercent = 0;
                } else if (parseUnitOrPercent > 255) {
                    parseUnitOrPercent = 255;
                }
                return Integer.valueOf(parseUnitOrPercent);
            }
        };
        c = new SingleFunctionParser.NonUniformMapper<Number>() { // from class: com.taobao.weex.utils.WXResourceUtils.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.weex.utils.SingleFunctionParser.NonUniformMapper
            public List<Number> map(List<String> list) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (List) ipChange.ipc$dispatch("6997ccf3", new Object[]{this, list});
                }
                ArrayList arrayList = new ArrayList(4);
                int i = 0;
                while (i < 3) {
                    int parseUnitOrPercent = WXUtils.parseUnitOrPercent(list.get(i), 255);
                    if (parseUnitOrPercent < 0) {
                        parseUnitOrPercent = 0;
                    } else if (parseUnitOrPercent > 255) {
                        parseUnitOrPercent = 255;
                    }
                    arrayList.add(Integer.valueOf(parseUnitOrPercent));
                    i++;
                }
                arrayList.add(Float.valueOf(list.get(i)));
                return arrayList;
            }
        };
        f23538a.put("aliceblue", -984833);
        f23538a.put("antiquewhite", -332841);
        f23538a.put(a.ATOM_EXT_aqua, -16711681);
        f23538a.put("aquamarine", -8388652);
        f23538a.put("azure", -983041);
        f23538a.put("beige", -657956);
        f23538a.put("bisque", -6972);
        f23538a.put(a.ATOM_EXT_black, -16777216);
        f23538a.put("blanchedalmond", -5171);
        f23538a.put(a.ATOM_EXT_blue, -16776961);
        f23538a.put("blueviolet", -7722014);
        f23538a.put("brown", -5952982);
        f23538a.put("burlywood", -2180985);
        f23538a.put("cadetblue", -10510688);
        f23538a.put("chartreuse", -8388864);
        f23538a.put("chocolate", -2987746);
        f23538a.put("coral", -32944);
        f23538a.put("cornflowerblue", -10185235);
        f23538a.put("cornsilk", -1828);
        f23538a.put("crimson", -2354116);
        f23538a.put("cyan", -16711681);
        f23538a.put("darkblue", -16777077);
        f23538a.put("darkcyan", -16741493);
        f23538a.put("darkgoldenrod", -4684277);
        f23538a.put("darkgray", -5658199);
        f23538a.put("darkgreen", -16751616);
        f23538a.put("darkkhaki", -4343957);
        f23538a.put("darkmagenta", -7667573);
        f23538a.put("darkolivegreen", -11179217);
        f23538a.put("darkorange", -29696);
        f23538a.put("darkorchid", -6737204);
        f23538a.put("darkred", -7667712);
        f23538a.put("darksalmon", -1468806);
        f23538a.put("darkseagreen", -7357297);
        f23538a.put("darkslateblue", -12042869);
        f23538a.put("darkslategray", -13676721);
        f23538a.put("darkslategrey", -13676721);
        f23538a.put("darkturquoise", -16724271);
        f23538a.put("darkviolet", -7077677);
        f23538a.put("deeppink", -60269);
        f23538a.put("deepskyblue", -16728065);
        f23538a.put("dimgray", -9868951);
        f23538a.put("dimgrey", -9868951);
        f23538a.put("dodgerblue", -14774017);
        f23538a.put("firebrick", -5103070);
        f23538a.put("floralwhite", -1296);
        f23538a.put("forestgreen", -14513374);
        f23538a.put(a.ATOM_EXT_fuchsia, -65281);
        f23538a.put("gainsboro", -2302756);
        f23538a.put("ghostwhite", -460545);
        f23538a.put("gold", -10496);
        f23538a.put("goldenrod", -2448096);
        f23538a.put(a.ATOM_EXT_gray, -8355712);
        f23538a.put("grey", -8355712);
        f23538a.put(a.ATOM_EXT_green, -16744448);
        f23538a.put("greenyellow", -5374161);
        f23538a.put("honeydew", -983056);
        f23538a.put("hotpink", -38476);
        f23538a.put("indianred", -3318692);
        f23538a.put("indigo", -11861886);
        f23538a.put("ivory", -16);
        f23538a.put("khaki", -989556);
        f23538a.put("lavender", -1644806);
        f23538a.put("lavenderblush", -3851);
        f23538a.put("lawngreen", -8586240);
        f23538a.put("lemonchiffon", -1331);
        f23538a.put("lightblue", -5383962);
        f23538a.put("lightcoral", -1015680);
        f23538a.put("lightcyan", -2031617);
        f23538a.put("lightgoldenrodyellow", -329006);
        f23538a.put("lightgray", -2894893);
        f23538a.put("lightgrey", -2894893);
        f23538a.put("lightgreen", -7278960);
        f23538a.put("lightpink", -18751);
        f23538a.put("lightsalmon", -24454);
        f23538a.put("lightseagreen", -14634326);
        f23538a.put("lightskyblue", -7876870);
        f23538a.put("lightslategray", -8943463);
        f23538a.put("lightslategrey", -8943463);
        f23538a.put("lightsteelblue", -5192482);
        f23538a.put("lightyellow", -32);
        f23538a.put(a.ATOM_EXT_lime, -16711936);
        f23538a.put("limegreen", -13447886);
        f23538a.put("linen", -331546);
        f23538a.put("magenta", -65281);
        f23538a.put(a.ATOM_EXT_maroon, -8388608);
        f23538a.put("mediumaquamarine", -10039894);
        f23538a.put("mediumblue", -16777011);
        f23538a.put("mediumorchid", -4565549);
        f23538a.put("mediumpurple", -7114533);
        f23538a.put("mediumseagreen", -12799119);
        f23538a.put("mediumslateblue", -8689426);
        f23538a.put("mediumspringgreen", -16713062);
        f23538a.put("mediumturquoise", -12004916);
        f23538a.put("mediumvioletred", -3730043);
        f23538a.put("midnightblue", -15132304);
        f23538a.put("mintcream", -655366);
        f23538a.put("mistyrose", -6943);
        f23538a.put("moccasin", -6987);
        f23538a.put("navajowhite", -8531);
        f23538a.put(a.ATOM_EXT_navy, -16777088);
        f23538a.put("oldlace", -133658);
        f23538a.put(a.ATOM_EXT_olive, -8355840);
        f23538a.put("olivedrab", -9728477);
        f23538a.put("orange", -23296);
        f23538a.put("orangered", -47872);
        f23538a.put("orchid", -2461482);
        f23538a.put("palegoldenrod", -1120086);
        f23538a.put("palegreen", -6751336);
        f23538a.put("paleturquoise", -5247250);
        f23538a.put("palevioletred", -2396013);
        f23538a.put("papayawhip", -4139);
        f23538a.put("peachpuff", -9543);
        f23538a.put("peru", -3308225);
        f23538a.put("pink", -16181);
        f23538a.put("plum", -2252579);
        f23538a.put("powderblue", -5185306);
        f23538a.put(a.ATOM_EXT_purple, -8388480);
        f23538a.put("rebeccapurple", -10079335);
        f23538a.put(a.ATOM_EXT_red, -65536);
        f23538a.put("rosybrown", -4419697);
        f23538a.put("royalblue", -12490271);
        f23538a.put("saddlebrown", -7650029);
        f23538a.put("salmon", -360334);
        f23538a.put("sandybrown", -744352);
        f23538a.put("seagreen", -13726889);
        f23538a.put("seashell", -2578);
        f23538a.put("sienna", -6270419);
        f23538a.put(a.ATOM_EXT_silver, -4144960);
        f23538a.put("skyblue", -7876885);
        f23538a.put("slateblue", -9807155);
        f23538a.put("slategray", -9404272);
        f23538a.put("slategrey", -9404272);
        f23538a.put("snow", -1286);
        f23538a.put("springgreen", -16711809);
        f23538a.put("steelblue", -12156236);
        f23538a.put(a.ATOM_EXT_tan, -2968436);
        f23538a.put(a.ATOM_EXT_teal, -16744320);
        f23538a.put("thistle", -2572328);
        f23538a.put("tomato", -40121);
        f23538a.put("turquoise", -12525360);
        f23538a.put("violet", -1146130);
        f23538a.put("wheat", -663885);
        f23538a.put(a.ATOM_EXT_white, -1);
        f23538a.put("whitesmoke", -657931);
        f23538a.put(a.ATOM_EXT_yellow, Integer.valueOf((int) InputDeviceCompat.SOURCE_ANY));
        f23538a.put("yellowgreen", -6632142);
        f23538a.put("transparent", 0);
    }

    public static int getColor(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6826e071", new Object[]{str})).intValue() : getColor(str, Integer.MIN_VALUE);
    }

    public static int getColor(String str, int i) {
        Pair<Boolean, Integer> handle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cb5a238", new Object[]{str, new Integer(i)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        String trim = str.trim();
        Integer num = WXUtils.f23540a.get(trim);
        if (num != null) {
            return num.intValue();
        }
        for (ColorConvertHandler colorConvertHandler : ColorConvertHandler.values()) {
            try {
                handle = colorConvertHandler.handle(trim);
            } catch (RuntimeException e) {
                WXLogUtils.v("Color_Parser", WXLogUtils.getStackTrace(e));
            }
            if (((Boolean) handle.first).booleanValue()) {
                i = ((Integer) handle.second).intValue();
                WXUtils.f23540a.put(trim, Integer.valueOf(i));
                break;
            }
            continue;
        }
        return i;
    }

    public static Shader getShader(String str, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Shader) ipChange.ipc$dispatch("9c7e2714", new Object[]{str, new Float(f), new Float(f2)});
        }
        List<String> a2 = a(str);
        if (a2 == null || a2.size() != 3) {
            return null;
        }
        float[] a3 = a(a2.get(0), f, f2);
        return new LinearGradient(a3[0], a3[1], a3[2], a3[3], getColor(a2.get(1), -1), getColor(a2.get(2), -1), Shader.TileMode.CLAMP);
    }

    private static List<String> a(String str) {
        String nextToken;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.trim();
        if (!str.startsWith("linear-gradient")) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str.substring(str.indexOf(riy.BRACKET_START_STR) + 1, str.lastIndexOf(riy.BRACKET_END_STR)), ",");
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str2 = null;
            while (stringTokenizer.hasMoreTokens()) {
                nextToken = stringTokenizer.nextToken();
                if (nextToken.contains(riy.BRACKET_START_STR)) {
                    str2 = nextToken + ",";
                } else if (nextToken.contains(riy.BRACKET_END_STR)) {
                    break;
                } else if (str2 != null) {
                    str2 = str2 + nextToken + ",";
                } else {
                    arrayList.add(nextToken);
                }
            }
            return arrayList;
            arrayList.add(str2 + nextToken);
        }
    }

    private static float[] a(String str, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("c6cef76f", new Object[]{str, new Float(f), new Float(f2)});
        }
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        if (!TextUtils.isEmpty(str)) {
            str = str.replaceAll("\\s*", "").toLowerCase(Locale.ROOT);
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1352032154:
                if (str.equals("tobottom")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1137407871:
                if (str.equals("toright")) {
                    c2 = 0;
                    break;
                }
                break;
            case -868157182:
                if (str.equals("toleft")) {
                    c2 = 1;
                    break;
                }
                break;
            case -172068863:
                if (str.equals("totopleft")) {
                    c2 = 5;
                    break;
                }
                break;
            case 110550266:
                if (str.equals("totop")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1176531318:
                if (str.equals("tobottomright")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            fArr[2] = f;
        } else if (c2 == 1) {
            fArr[0] = f;
        } else if (c2 == 2) {
            fArr[3] = f2;
        } else if (c2 == 3) {
            fArr[1] = f2;
        } else if (c2 == 4) {
            fArr[2] = f;
            fArr[3] = f2;
        } else if (c2 == 5) {
            fArr[0] = f;
            fArr[1] = f2;
        }
        return fArr;
    }

    public static boolean isNamedColor(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63faac09", new Object[]{str})).booleanValue() : f23538a.containsKey(str);
    }
}
