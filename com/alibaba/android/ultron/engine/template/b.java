package com.alibaba.android.ultron.engine.template;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintWriter;
import java.io.StringWriter;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_NO_TEMPLATE_MATCH = 100004;
    public static final int ERROR_PRE_REDNER_FAILED = 100001;
    public static final int ERROR_PROTOCOL_REDNER_FAILED = 100003;
    public static final int ERROR_REDNER_USER_DATA_FAILED = 100002;
    public static final int ERROR_TEMPLATE_INIT_FAILED = 100005;
    public static final int ERROR_TEMPLATE_VALID = 100000;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2568a;
    public a b;
    public JSONObject c;

    static {
        kge.a(-1002464710);
    }

    public static b a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("17123a20", new Object[]{new Integer(i), str});
        }
        b bVar = new b();
        bVar.f2568a = true;
        bVar.b = new a(i, str);
        return bVar;
    }

    public static b a(int i, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("70a452ba", new Object[]{new Integer(i), exc});
        }
        b bVar = new b();
        bVar.f2568a = true;
        bVar.b = new a(i, "exception: " + exc.getMessage());
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        bVar.b.c = stringWriter.toString();
        return bVar;
    }

    public static b a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("38b5c01d", new Object[]{jSONObject});
        }
        b bVar = new b();
        bVar.c = jSONObject;
        return bVar;
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("70623b3d", new Object[0]);
        }
        b bVar = new b();
        bVar.c = new JSONObject();
        bVar.c.put("noNeedRefresh", (Object) "true");
        return bVar;
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f2569a;
        public String b;
        public String c;

        static {
            kge.a(1283096494);
        }

        public a(int i, String str) {
            this.f2569a = i;
            this.b = str;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "TemplateRenderError{errorCode=" + this.f2569a + ", errorMsg='" + this.b + "'}";
        }
    }
}
