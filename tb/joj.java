package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.joi;

/* loaded from: classes6.dex */
public class joj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, joj> f;

    /* renamed from: a  reason: collision with root package name */
    private final joi f29659a;
    private volatile List<String> b;
    private final LruCache<String, String> c = new LruCache<>(16);
    private final LruCache<String, joh> d = new LruCache<>(4);
    private final Object e = new Object();
    private final String g;

    static {
        kge.a(-1078755206);
        f = new HashMap();
    }

    private joj(Context context, String str) {
        String str2 = str + "_ultron_template_cache";
        this.f29659a = new joi.a().a(context.getApplicationContext()).b(str2 + ".db").a(str2).a(1).a(16777216L).a();
        this.g = str;
    }

    public static joj a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (joj) ipChange.ipc$dispatch("837c99f7", new Object[]{context, str});
        }
        joj jojVar = f.get(str);
        if (jojVar == null) {
            synchronized (joj.class) {
                jojVar = f.get(str);
                if (jojVar == null) {
                    Map<String, joj> map = f;
                    joj jojVar2 = new joj(context, str);
                    map.put(str, jojVar2);
                    jojVar = jojVar2;
                }
            }
        }
        return jojVar;
    }

    public static joj a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (joj) ipChange.ipc$dispatch("7c712aef", new Object[]{str}) : f.get(str);
    }

    public JSONObject b(String str) {
        String str2;
        byte[] b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d2c0493", new Object[]{this, str});
        }
        try {
            synchronized (this.e) {
                str2 = this.c.get(str);
            }
            if (str2 == null && (b = this.f29659a.b(str)) != null && b.length > 0) {
                str2 = new String(b, Charset.forName("UTF-8"));
                synchronized (this.e) {
                    this.c.put(str, str2);
                }
            }
            return JSON.parseObject(str2);
        } catch (Throwable th) {
            UnifyLog.a(this.g, "UltronTemplateManager", "getTemplateById exception", Log.getStackTraceString(th));
            return null;
        }
    }

    public List<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        if (this.b == null) {
            List<String> a2 = this.f29659a.a();
            synchronized (this.e) {
                if (this.b == null) {
                    this.b = a2;
                }
            }
        }
        return this.b == null ? Collections.emptyList() : this.b;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            try {
                synchronized (this.e) {
                    if (this.b != null && !this.b.contains(str)) {
                        this.b.add(str);
                    }
                    if (this.c.get(str) == null) {
                        this.c.put(str, str2);
                    }
                }
                this.f29659a.a(str, str2.getBytes(Charset.forName("UTF-8")));
            } catch (Throwable th) {
                UnifyLog.a(this.g, "UltronTemplateManager", "saveTemplate", Log.getStackTraceString(th));
            }
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            synchronized (this.e) {
                if (this.b != null) {
                    this.b.remove(str);
                }
                this.c.remove(str);
            }
            this.f29659a.a(str);
        } catch (Throwable th) {
            UnifyLog.a(this.g, "UltronTemplateManager", "deleteTemplateById", Log.getStackTraceString(th));
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            List<String> a2 = a();
            if (a2 == null) {
                return;
            }
            for (int i = 0; i < a2.size(); i++) {
                if (i < 16) {
                    b(a2.get(i));
                }
            }
        } catch (Throwable th) {
            UnifyLog.a(this.g, "UltronTemplateManager", "preloadTemplates", Log.getStackTraceString(th));
        }
    }

    public void a(String str, joh johVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fad8dff", new Object[]{this, str, johVar});
        } else if (TextUtils.isEmpty(str) || johVar == null) {
        } else {
            synchronized (this.e) {
                this.d.put(str, johVar);
            }
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        synchronized (this.e) {
            this.d.remove(str);
        }
    }

    public joh e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (joh) ipChange.ipc$dispatch("7f23d92d", new Object[]{this, str}) : this.d.get(str);
    }
}
