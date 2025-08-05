package com.ta.utdid2.core.persistent;

import android.util.Xml;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.popupcenter.strategy.PopStrategy;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-809088661);
    }

    public static final void a(Map map, OutputStream outputStream) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae1ec4f", new Object[]{map, outputStream});
            return;
        }
        a aVar = new a();
        aVar.setOutput(outputStream, "utf-8");
        aVar.startDocument(null, true);
        aVar.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        a(map, (String) null, (XmlSerializer) aVar);
        aVar.endDocument();
    }

    public static final void a(Map map, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42b86803", new Object[]{map, str, xmlSerializer});
        } else if (map == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
        } else {
            xmlSerializer.startTag(null, "map");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            for (Map.Entry entry : map.entrySet()) {
                a(entry.getValue(), (String) entry.getKey(), xmlSerializer);
            }
            xmlSerializer.endTag(null, "map");
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
            StringBuilder sb = new StringBuilder(bArr.length << 1);
            for (byte b : bArr) {
                int i = b >> 4;
                sb.append(i >= 10 ? (i + 97) - 10 : i + 48);
                int i2 = b & 255;
                sb.append(i2 >= 10 ? (i2 + 97) - 10 : i2 + 48);
            }
            xmlSerializer.text(sb.toString());
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

    public static final void a(Object obj, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a91de2a", new Object[]{obj, str, xmlSerializer});
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
                } else if (obj instanceof Map) {
                    a((Map) obj, str, xmlSerializer);
                    return;
                } else if (obj instanceof List) {
                    a((List) obj, str, xmlSerializer);
                    return;
                } else if (obj instanceof CharSequence) {
                    xmlSerializer.startTag(null, "string");
                    if (str != null) {
                        xmlSerializer.attribute(null, "name", str);
                    }
                    xmlSerializer.text(obj.toString());
                    xmlSerializer.endTag(null, "string");
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

    public static final HashMap a(InputStream inputStream) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3d348fce", new Object[]{inputStream});
        }
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, null);
        return (HashMap) a(newPullParser, new String[1]);
    }

    public static final HashMap a(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("187f0166", new Object[]{xmlPullParser, str, strArr});
        }
        HashMap hashMap = new HashMap();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                Object b = b(xmlPullParser, strArr);
                if (strArr[0] != null) {
                    hashMap.put(strArr[0], b);
                } else {
                    throw new XmlPullParserException("Map value without name attribute: " + xmlPullParser.getName());
                }
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

    public static final ArrayList b(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("8e324a7c", new Object[]{xmlPullParser, str, strArr});
        }
        ArrayList arrayList = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                arrayList.add(b(xmlPullParser, strArr));
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

    public static final int[] c(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("754dd083", new Object[]{xmlPullParser, str, strArr});
        }
        try {
            int[] iArr = new int[Integer.parseInt(xmlPullParser.getAttributeValue(null, UiUtil.INPUT_TYPE_VALUE_NUM))];
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
            throw new XmlPullParserException("Need num attribute in byte-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in byte-array");
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
                try {
                    eventType = xmlPullParser.next();
                    if (eventType == 1) {
                        throw new XmlPullParserException("Unexpected end of document");
                    }
                } catch (Exception unused) {
                    throw new XmlPullParserException("Unexpected call next(): " + xmlPullParser.getName());
                }
            }
        }
        return b(xmlPullParser, strArr);
    }

    private static Object b(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException {
        int next;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("321225c6", new Object[]{xmlPullParser, strArr});
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
            } else if (name.equals("int")) {
                obj = Integer.valueOf(Integer.parseInt(xmlPullParser.getAttributeValue(null, "value")));
            } else if (name.equals("long")) {
                obj = Long.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals(PopStrategy.IDENTIFIER_FLOAT)) {
                obj = Float.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("double")) {
                obj = Double.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals(com.taobao.android.weex_framework.util.a.ATOM_boolean)) {
                obj = Boolean.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("int-array")) {
                xmlPullParser.next();
                int[] c = c(xmlPullParser, "int-array", strArr);
                strArr[0] = attributeValue;
                return c;
            } else if (name.equals("map")) {
                xmlPullParser.next();
                HashMap a2 = a(xmlPullParser, "map", strArr);
                strArr[0] = attributeValue;
                return a2;
            } else if (name.equals("list")) {
                xmlPullParser.next();
                ArrayList b = b(xmlPullParser, "list", strArr);
                strArr[0] = attributeValue;
                return b;
            } else {
                throw new XmlPullParserException("Unknown tag: " + name);
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
}
