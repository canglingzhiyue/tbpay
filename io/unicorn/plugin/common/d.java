package io.unicorn.plugin.common;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes9.dex */
public final class d implements i {
    public static final d INSTANCE;

    static {
        kge.a(-605653371);
        kge.a(1776560237);
        INSTANCE = new d();
    }

    private d() {
    }

    public static void a() {
    }

    @Override // io.unicorn.plugin.common.i
    public g a(ByteBuffer byteBuffer) {
        try {
            Object a2 = c.INSTANCE.a(byteBuffer);
            if (a2 instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) a2;
                Object obj = jSONObject.get("method");
                Object b = b(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new g((String) obj, b);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + a2);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    @Override // io.unicorn.plugin.common.i
    public ByteBuffer a(g gVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", gVar.f24846a);
            jSONObject.put("args", e.b(gVar.b));
            return c.INSTANCE.a(jSONObject);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    @Override // io.unicorn.plugin.common.i
    public ByteBuffer a(Object obj) {
        return c.INSTANCE.a(new JSONArray().put(e.b(obj)));
    }

    @Override // io.unicorn.plugin.common.i
    public ByteBuffer a(String str, String str2, Object obj) {
        return c.INSTANCE.a(new JSONArray().put(str).put(e.b(str2)).put(e.b(obj)));
    }

    @Override // io.unicorn.plugin.common.i
    public ByteBuffer a(String str, String str2, Object obj, String str3) {
        return c.INSTANCE.a(new JSONArray().put(str).put(e.b(str2)).put(e.b(obj)).put(e.b(str3)));
    }

    Object b(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }

    @Override // io.unicorn.plugin.common.i
    public Object b(ByteBuffer byteBuffer) {
        try {
            Object a2 = c.INSTANCE.a(byteBuffer);
            if (a2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) a2;
                if (jSONArray.length() == 1) {
                    return b(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object b = b(jSONArray.opt(1));
                    Object b2 = b(jSONArray.opt(2));
                    if ((obj instanceof String) && (b == null || (b instanceof String))) {
                        throw new FlutterException((String) obj, (String) b, b2);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + a2);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }
}
