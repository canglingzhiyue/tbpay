package com.taobao.android.dinamicx.monitor;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class i {

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f11909a;
        public String b;
        public DXTemplateItem c;
        public String d;
        public DXEvent e;

        static {
            kge.a(863739993);
        }

        public a(int i, String str, DXTemplateItem dXTemplateItem, String str2, DXEvent dXEvent) {
            this.f11909a = i;
            this.b = str;
            this.c = dXTemplateItem;
            this.d = str2;
            this.e = dXEvent;
        }
    }

    /* loaded from: classes5.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f11911a;
        public String b;
        public com.taobao.android.dinamicx.eventchain.j c;

        static {
            kge.a(1537136202);
        }

        public c(int i, String str, com.taobao.android.dinamicx.eventchain.j jVar) {
            this.f11911a = i;
            this.b = str;
            this.c = jVar;
        }
    }

    static {
        kge.a(1541975680);
    }

    /* loaded from: classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f11910a;
        public String b;
        public long c;
        public c d;
        public JSONObject e;
        public com.taobao.android.dinamicx.eventchain.j f;
        public String g;
        public Map<String, String> h;
        public JSONObject i;
        public JSONObject j;
        public Object k;
        public Object l;
        public JSONObject m;
        public Object n;

        static {
            kge.a(168436731);
        }

        public b(int i, String str, long j, c cVar) {
            this.f11910a = i;
            this.b = str;
            this.c = j;
            this.d = cVar;
        }

        public void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("233ea059", new Object[]{this, cVar});
            } else {
                this.d = cVar;
            }
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            } else {
                this.e = jSONObject;
            }
        }

        public void a(com.taobao.android.dinamicx.eventchain.j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee043022", new Object[]{this, jVar});
            } else {
                this.f = jVar;
            }
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.g = str;
            }
        }

        public void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            } else {
                this.h = map;
            }
        }

        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            } else {
                this.i = jSONObject;
            }
        }

        public void c(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            } else {
                this.j = jSONObject;
            }
        }

        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            } else {
                this.k = obj;
            }
        }

        public void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
            } else {
                this.l = obj;
            }
        }

        public void d(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
            } else {
                this.m = jSONObject;
            }
        }

        public void c(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a8844c6", new Object[]{this, obj});
            } else {
                this.n = obj;
            }
        }
    }
}
