package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes8.dex */
public class pqj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1152091505);
    }

    public static final Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17307540", new Object[]{str});
        }
        try {
            Object parse = JSON.parse(str, JSON.DEFAULT_PARSER_FEATURE);
            pqi.a().b("XJSON");
            return parse;
        } catch (Throwable th) {
            pqi.a().a("XJSON", pqi.a().a(th), th.toString());
            return null;
        }
    }

    public static final JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d2c0493", new Object[]{str});
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            pqi.a().b("XJSON");
            return parseObject;
        } catch (Throwable th) {
            pqi.a().a("XJSON", pqi.a().a(th), th.toString());
            return null;
        }
    }

    public static final <T> T a(String str, TypeReference<T> typeReference, Feature... featureArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("8a78415c", new Object[]{str, typeReference, featureArr});
        }
        try {
            T t = (T) JSON.parseObject(str, typeReference, featureArr);
            pqi.a().b("XJSON");
            return t;
        } catch (Throwable th) {
            pqi.a().a("XJSON", pqi.a().a(th), th.toString());
            return null;
        }
    }

    public static final <T> T a(byte[] bArr, Type type, Feature... featureArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("79145958", new Object[]{bArr, type, featureArr});
        }
        try {
            T t = (T) JSON.parseObject(bArr, type, featureArr);
            pqi.a().b("XJSON");
            return t;
        } catch (Throwable th) {
            pqi.a().a("XJSON", pqi.a().a(th), th.toString());
            return null;
        }
    }

    public static final <T> T a(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("21de4147", new Object[]{str, cls});
        }
        try {
            T t = (T) JSON.parseObject(str, cls);
            pqi.a().b("XJSON");
            return t;
        } catch (Throwable th) {
            pqi.a().a("XJSON", pqi.a().a(th), th.toString());
            return null;
        }
    }

    public static final JSONArray c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("18b2c50a", new Object[]{str});
        }
        try {
            JSONArray parseArray = JSON.parseArray(str);
            pqi.a().b("XJSON");
            return parseArray;
        } catch (Throwable th) {
            pqi.a().a("XJSON", pqi.a().a(th), th.toString());
            return null;
        }
    }

    public static final <T> List<T> b(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1bbed2dd", new Object[]{str, cls});
        }
        try {
            List<T> parseArray = JSON.parseArray(str, cls);
            pqi.a().b("XJSON");
            return parseArray;
        } catch (Throwable th) {
            pqi.a().a("XJSON", pqi.a().a(th), th.toString());
            return null;
        }
    }

    public static final String a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj});
        }
        try {
            String jSONString = JSON.toJSONString(obj);
            pqi.a().b("XJSON");
            return jSONString;
        } catch (Throwable th) {
            pqi.a().a("XJSON", pqi.a().a(th), th.toString());
            return null;
        }
    }

    public static final Object b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("eeb6464d", new Object[]{obj});
        }
        try {
            Object json = JSON.toJSON(obj);
            pqi.a().b("XJSON");
            return json;
        } catch (Throwable th) {
            pqi.a().a("XJSON", pqi.a().a(th), th.toString());
            return null;
        }
    }

    public static final <T> T a(JSON json, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bd40e65c", new Object[]{json, cls});
        }
        try {
            T t = (T) JSON.toJavaObject(json, cls);
            pqi.a().b("XJSON");
            return t;
        } catch (Throwable th) {
            pqi.a().a("XJSON", pqi.a().a(th), th.toString());
            return null;
        }
    }
}
