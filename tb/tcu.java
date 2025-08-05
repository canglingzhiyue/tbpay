package tb;

import android.util.ArrayMap;
import android.util.Xml;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.popupcenter.strategy.PopStrategy;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes4.dex */
public class tcu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes4.dex */
    public interface a {
        Object a(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException;
    }

    /* loaded from: classes4.dex */
    public interface b {
    }

    static {
        kge.a(-644723986);
    }

    public static final void a(Map map, OutputStream outputStream) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae1ec4f", new Object[]{map, outputStream});
            return;
        }
        tcv tcvVar = new tcv();
        tcvVar.setOutput(outputStream, StandardCharsets.UTF_8.name());
        tcvVar.startDocument(null, true);
        tcvVar.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        a(map, (String) null, (XmlSerializer) tcvVar);
        tcvVar.endDocument();
    }

    public static final void a(Map map, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42b86803", new Object[]{map, str, xmlSerializer});
        } else {
            a(map, str, xmlSerializer, (b) null);
        }
    }

    public static final void a(Map map, String str, XmlSerializer xmlSerializer, b bVar) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a9bb0f", new Object[]{map, str, xmlSerializer, bVar});
        } else if (map == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
        } else {
            xmlSerializer.startTag(null, "map");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            a(map, xmlSerializer, bVar);
            xmlSerializer.endTag(null, "map");
        }
    }

    public static final void a(Map map, XmlSerializer xmlSerializer, b bVar) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b4cd085", new Object[]{map, xmlSerializer, bVar});
        } else if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                a(entry.getValue(), (String) entry.getKey(), xmlSerializer, bVar);
            }
        }
    }

    public static final void a(List list, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e91973f", new Object[]{list, str, xmlSerializer});
        } else if (list == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
        } else {
            xmlSerializer.startTag(null, "list");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a(list.get(i), (String) null, xmlSerializer);
            }
            xmlSerializer.endTag(null, "list");
        }
    }

    public static final void a(Set set, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbaa8f3d", new Object[]{set, str, xmlSerializer});
        } else if (set == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
        } else {
            xmlSerializer.startTag(null, "set");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            for (Object obj : set) {
                a(obj, (String) null, xmlSerializer);
            }
            xmlSerializer.endTag(null, "set");
        }
    }

    public static final void a(byte[] bArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425e9115", new Object[]{bArr, str, xmlSerializer});
        } else if (bArr == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
        } else {
            xmlSerializer.startTag(null, "byte-array");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.attribute(null, UiUtil.INPUT_TYPE_VALUE_NUM, Integer.toString(bArr.length));
            xmlSerializer.text(tcw.a(bArr).toLowerCase());
            xmlSerializer.endTag(null, "byte-array");
        }
    }

    public static final void a(int[] iArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b2c615c", new Object[]{iArr, str, xmlSerializer});
        } else if (iArr == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
        } else {
            xmlSerializer.startTag(null, "int-array");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.attribute(null, UiUtil.INPUT_TYPE_VALUE_NUM, Integer.toString(iArr.length));
            for (int i : iArr) {
                xmlSerializer.startTag(null, "item");
                xmlSerializer.attribute(null, "value", Integer.toString(i));
                xmlSerializer.endTag(null, "item");
            }
            xmlSerializer.endTag(null, "int-array");
        }
    }

    public static final void a(long[] jArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb77f1d", new Object[]{jArr, str, xmlSerializer});
        } else if (jArr == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
        } else {
            xmlSerializer.startTag(null, "long-array");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.attribute(null, UiUtil.INPUT_TYPE_VALUE_NUM, Integer.toString(jArr.length));
            for (long j : jArr) {
                xmlSerializer.startTag(null, "item");
                xmlSerializer.attribute(null, "value", Long.toString(j));
                xmlSerializer.endTag(null, "item");
            }
            xmlSerializer.endTag(null, "long-array");
        }
    }

    public static final void a(double[] dArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c974cc97", new Object[]{dArr, str, xmlSerializer});
        } else if (dArr == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
        } else {
            xmlSerializer.startTag(null, "double-array");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.attribute(null, UiUtil.INPUT_TYPE_VALUE_NUM, Integer.toString(dArr.length));
            for (double d : dArr) {
                xmlSerializer.startTag(null, "item");
                xmlSerializer.attribute(null, "value", Double.toString(d));
                xmlSerializer.endTag(null, "item");
            }
            xmlSerializer.endTag(null, "double-array");
        }
    }

    public static final void a(String[] strArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e1699d", new Object[]{strArr, str, xmlSerializer});
        } else if (strArr == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
        } else {
            xmlSerializer.startTag(null, "string-array");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.attribute(null, UiUtil.INPUT_TYPE_VALUE_NUM, Integer.toString(strArr.length));
            for (String str2 : strArr) {
                xmlSerializer.startTag(null, "item");
                xmlSerializer.attribute(null, "value", str2);
                xmlSerializer.endTag(null, "item");
            }
            xmlSerializer.endTag(null, "string-array");
        }
    }

    public static final void a(boolean[] zArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97695b2d", new Object[]{zArr, str, xmlSerializer});
        } else if (zArr == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
        } else {
            xmlSerializer.startTag(null, "boolean-array");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.attribute(null, UiUtil.INPUT_TYPE_VALUE_NUM, Integer.toString(zArr.length));
            for (boolean z : zArr) {
                xmlSerializer.startTag(null, "item");
                xmlSerializer.attribute(null, "value", Boolean.toString(z));
                xmlSerializer.endTag(null, "item");
            }
            xmlSerializer.endTag(null, "boolean-array");
        }
    }

    public static final void a(Object obj, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a91de2a", new Object[]{obj, str, xmlSerializer});
        } else {
            a(obj, str, xmlSerializer, (b) null);
        }
    }

    private static void a(Object obj, String str, XmlSerializer xmlSerializer, b bVar) throws XmlPullParserException, IOException {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("177eec76", new Object[]{obj, str, xmlSerializer, bVar});
        } else if (obj == null) {
            xmlSerializer.startTag(null, "null");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.endTag(null, "null");
        } else if (obj instanceof String) {
            xmlSerializer.startTag(null, "string");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.text(obj.toString());
            xmlSerializer.endTag(null, "string");
        } else {
            if (obj instanceof Integer) {
                str2 = "int";
            } else if (obj instanceof Long) {
                str2 = "long";
            } else if (obj instanceof Float) {
                str2 = PopStrategy.IDENTIFIER_FLOAT;
            } else if (obj instanceof Double) {
                str2 = "double";
            } else if (!(obj instanceof Boolean)) {
                if (obj instanceof byte[]) {
                    a((byte[]) obj, str, xmlSerializer);
                    return;
                } else if (obj instanceof int[]) {
                    a((int[]) obj, str, xmlSerializer);
                    return;
                } else if (obj instanceof long[]) {
                    a((long[]) obj, str, xmlSerializer);
                    return;
                } else if (obj instanceof double[]) {
                    a((double[]) obj, str, xmlSerializer);
                    return;
                } else if (obj instanceof String[]) {
                    a((String[]) obj, str, xmlSerializer);
                    return;
                } else if (obj instanceof boolean[]) {
                    a((boolean[]) obj, str, xmlSerializer);
                    return;
                } else if (obj instanceof Map) {
                    a((Map) obj, str, xmlSerializer);
                    return;
                } else if (obj instanceof List) {
                    a((List) obj, str, xmlSerializer);
                    return;
                } else if (obj instanceof Set) {
                    a((Set) obj, str, xmlSerializer);
                    return;
                } else if (obj instanceof CharSequence) {
                    xmlSerializer.startTag(null, "string");
                    if (str != null) {
                        xmlSerializer.attribute(null, "name", str);
                    }
                    xmlSerializer.text(obj.toString());
                    xmlSerializer.endTag(null, "string");
                    return;
                } else if (bVar != null) {
                    return;
                } else {
                    throw new RuntimeException("writeValueXml: unable to write value " + obj);
                }
            } else {
                str2 = com.taobao.android.weex_framework.util.a.ATOM_boolean;
            }
            xmlSerializer.startTag(null, str2);
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.attribute(null, "value", obj.toString());
            xmlSerializer.endTag(null, str2);
        }
    }

    public static final HashMap<String, ?> a(InputStream inputStream) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3d348fce", new Object[]{inputStream});
        }
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, StandardCharsets.UTF_8.name());
        return (HashMap) a(newPullParser, new String[1]);
    }

    public static final HashMap<String, ?> a(XmlPullParser xmlPullParser, String str, String[] strArr, a aVar) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("5ba8fed3", new Object[]{xmlPullParser, str, strArr, aVar});
        }
        HashMap<String, ?> hashMap = new HashMap<>();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                hashMap.put(strArr[0], a(xmlPullParser, strArr, aVar, false));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashMap;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    public static final ArrayMap<String, ?> b(XmlPullParser xmlPullParser, String str, String[] strArr, a aVar) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayMap) ipChange.ipc$dispatch("3c601fd0", new Object[]{xmlPullParser, str, strArr, aVar});
        }
        ArrayMap<String, ?> arrayMap = new ArrayMap<>();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                arrayMap.put(strArr[0], a(xmlPullParser, strArr, aVar, true));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return arrayMap;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    private static ArrayList a(XmlPullParser xmlPullParser, String str, String[] strArr, a aVar, boolean z) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("2dae653e", new Object[]{xmlPullParser, str, strArr, aVar, new Boolean(z)});
        }
        ArrayList arrayList = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                arrayList.add(a(xmlPullParser, strArr, aVar, z));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return arrayList;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    private static HashSet b(XmlPullParser xmlPullParser, String str, String[] strArr, a aVar, boolean z) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("2365d502", new Object[]{xmlPullParser, str, strArr, aVar, new Boolean(z)});
        }
        HashSet hashSet = new HashSet();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                hashSet.add(a(xmlPullParser, strArr, aVar, z));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashSet;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    public static final byte[] a(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e736027a", new Object[]{xmlPullParser, str, strArr});
        }
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(null, UiUtil.INPUT_TYPE_VALUE_NUM));
            byte[] bArr = new byte[0];
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 4) {
                    if (parseInt > 0) {
                        String text = xmlPullParser.getText();
                        if (text == null || text.length() != (parseInt << 1)) {
                            throw new XmlPullParserException("Invalid value found in byte-array: " + text);
                        }
                        bArr = tcw.a(text);
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return bArr;
                    }
                    throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused) {
            throw new XmlPullParserException("Need num attribute in byte-array");
        } catch (NumberFormatException unused2) {
            throw new XmlPullParserException("Not a number in num attribute in byte-array");
        }
    }

    public static final int[] b(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("ae41e982", new Object[]{xmlPullParser, str, strArr});
        }
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(null, UiUtil.INPUT_TYPE_VALUE_NUM));
            xmlPullParser.next();
            int[] iArr = new int[parseInt];
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            iArr[i] = Integer.parseInt(xmlPullParser.getAttributeValue(null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return iArr;
                    }
                    if (!xmlPullParser.getName().equals("item")) {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                    i++;
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in int-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in int-array");
        }
    }

    public static final long[] c(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("754dd084", new Object[]{xmlPullParser, str, strArr});
        }
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(null, UiUtil.INPUT_TYPE_VALUE_NUM));
            xmlPullParser.next();
            long[] jArr = new long[parseInt];
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            jArr[i] = Long.parseLong(xmlPullParser.getAttributeValue(null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return jArr;
                    }
                    if (!xmlPullParser.getName().equals("item")) {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                    i++;
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in long-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in long-array");
        }
    }

    public static final double[] d(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (double[]) ipChange.ipc$dispatch("3c59b77f", new Object[]{xmlPullParser, str, strArr});
        }
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(null, UiUtil.INPUT_TYPE_VALUE_NUM));
            xmlPullParser.next();
            double[] dArr = new double[parseInt];
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            dArr[i] = Double.parseDouble(xmlPullParser.getAttributeValue(null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return dArr;
                    }
                    if (!xmlPullParser.getName().equals("item")) {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                    i++;
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in double-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in double-array");
        }
    }

    public static final String[] e(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("1370c4e", new Object[]{xmlPullParser, str, strArr});
        }
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(null, UiUtil.INPUT_TYPE_VALUE_NUM));
            xmlPullParser.next();
            String[] strArr2 = new String[parseInt];
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            strArr2[i] = xmlPullParser.getAttributeValue(null, "value");
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return strArr2;
                    }
                    if (!xmlPullParser.getName().equals("item")) {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                    i++;
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in string-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in string-array");
        }
    }

    public static final boolean[] f(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (boolean[]) ipChange.ipc$dispatch("ca718597", new Object[]{xmlPullParser, str, strArr});
        }
        try {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(null, UiUtil.INPUT_TYPE_VALUE_NUM));
            xmlPullParser.next();
            boolean[] zArr = new boolean[parseInt];
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            zArr[i] = Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return zArr;
                    }
                    if (!xmlPullParser.getName().equals("item")) {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                    i++;
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in string-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in string-array");
        }
    }

    public static final Object a(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4ee67285", new Object[]{xmlPullParser, strArr});
        }
        int eventType = xmlPullParser.getEventType();
        while (eventType != 2) {
            if (eventType == 3) {
                throw new XmlPullParserException("Unexpected end tag at: " + xmlPullParser.getName());
            } else if (eventType == 4) {
                throw new XmlPullParserException("Unexpected text: " + xmlPullParser.getText());
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    throw new XmlPullParserException("Unexpected end of document");
                }
            }
        }
        return a(xmlPullParser, strArr, (a) null, false);
    }

    private static Object a(XmlPullParser xmlPullParser, String[] strArr, a aVar, boolean z) throws XmlPullParserException, IOException {
        int next;
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("34dd2ed8", new Object[]{xmlPullParser, strArr, aVar, new Boolean(z)});
        }
        Object obj = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "name");
        String name = xmlPullParser.getName();
        if (!name.equals("null")) {
            if (name.equals("string")) {
                String str = "";
                while (true) {
                    int next2 = xmlPullParser.next();
                    if (next2 == 1) {
                        throw new XmlPullParserException("Unexpected end of document in <string>");
                    }
                    if (next2 == 3) {
                        if (xmlPullParser.getName().equals("string")) {
                            strArr[0] = attributeValue;
                            return str;
                        }
                        throw new XmlPullParserException("Unexpected end tag in <string>: " + xmlPullParser.getName());
                    } else if (next2 == 4) {
                        str = str + xmlPullParser.getText();
                    } else if (next2 == 2) {
                        throw new XmlPullParserException("Unexpected start tag in <string>: " + xmlPullParser.getName());
                    }
                }
            } else {
                obj = a(xmlPullParser, name);
                if (obj == null) {
                    if (name.equals("byte-array")) {
                        byte[] a3 = a(xmlPullParser, "byte-array", strArr);
                        strArr[0] = attributeValue;
                        return a3;
                    } else if (name.equals("int-array")) {
                        int[] b2 = b(xmlPullParser, "int-array", strArr);
                        strArr[0] = attributeValue;
                        return b2;
                    } else if (name.equals("long-array")) {
                        long[] c = c(xmlPullParser, "long-array", strArr);
                        strArr[0] = attributeValue;
                        return c;
                    } else if (name.equals("double-array")) {
                        double[] d = d(xmlPullParser, "double-array", strArr);
                        strArr[0] = attributeValue;
                        return d;
                    } else if (name.equals("string-array")) {
                        String[] e = e(xmlPullParser, "string-array", strArr);
                        strArr[0] = attributeValue;
                        return e;
                    } else if (name.equals("boolean-array")) {
                        boolean[] f = f(xmlPullParser, "boolean-array", strArr);
                        strArr[0] = attributeValue;
                        return f;
                    } else if (name.equals("map")) {
                        xmlPullParser.next();
                        if (z) {
                            a2 = b(xmlPullParser, "map", strArr, aVar);
                        } else {
                            a2 = a(xmlPullParser, "map", strArr, aVar);
                        }
                        strArr[0] = attributeValue;
                        return a2;
                    } else if (name.equals("list")) {
                        xmlPullParser.next();
                        ArrayList a4 = a(xmlPullParser, "list", strArr, aVar, z);
                        strArr[0] = attributeValue;
                        return a4;
                    } else if (name.equals("set")) {
                        xmlPullParser.next();
                        HashSet b3 = b(xmlPullParser, "set", strArr, aVar, z);
                        strArr[0] = attributeValue;
                        return b3;
                    } else if (aVar != null) {
                        Object a5 = aVar.a(xmlPullParser, name);
                        strArr[0] = attributeValue;
                        return a5;
                    } else {
                        throw new XmlPullParserException("Unknown tag: " + name);
                    }
                }
            }
        }
        do {
            next = xmlPullParser.next();
            if (next == 1) {
                throw new XmlPullParserException("Unexpected end of document in <" + name + ">");
            } else if (next == 3) {
                if (xmlPullParser.getName().equals(name)) {
                    strArr[0] = attributeValue;
                    return obj;
                }
                throw new XmlPullParserException("Unexpected end tag in <" + name + ">: " + xmlPullParser.getName());
            } else if (next == 4) {
                throw new XmlPullParserException("Unexpected text in <" + name + ">: " + xmlPullParser.getName());
            }
        } while (next != 2);
        throw new XmlPullParserException("Unexpected start tag in <" + name + ">: " + xmlPullParser.getName());
    }

    private static final Object a(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("da2cc1d6", new Object[]{xmlPullParser, str});
        }
        try {
            if (str.equals("int")) {
                return Integer.valueOf(Integer.parseInt(xmlPullParser.getAttributeValue(null, "value")));
            }
            if (str.equals("long")) {
                return Long.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            }
            if (str.equals(PopStrategy.IDENTIFIER_FLOAT)) {
                return new Float(xmlPullParser.getAttributeValue(null, "value"));
            }
            if (str.equals("double")) {
                return new Double(xmlPullParser.getAttributeValue(null, "value"));
            }
            if (!str.equals(com.taobao.android.weex_framework.util.a.ATOM_boolean)) {
                return null;
            }
            return Boolean.valueOf(xmlPullParser.getAttributeValue(null, "value"));
        } catch (NullPointerException unused) {
            throw new XmlPullParserException("Need value attribute in <" + str + ">");
        } catch (NumberFormatException unused2) {
            throw new XmlPullParserException("Not a number in value attribute in <" + str + ">");
        }
    }
}
