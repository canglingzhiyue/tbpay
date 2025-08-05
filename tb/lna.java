package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class lna {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f30732a;
    private Map<String, String> b = null;

    static {
        kge.a(931542248);
    }

    public abstract String a();

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    public static /* synthetic */ Map a(lna lnaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e23445ce", new Object[]{lnaVar}) : lnaVar.b;
    }

    public lna(String str) {
        this.f30732a = str;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(this.f30732a) || TextUtils.isEmpty(str)) {
            ldf.d("AbsReqParamSaveModeHandler", "save error");
        } else {
            if (this.b == null) {
                this.b = new HashMap();
            }
            if (str2 == null) {
                this.b.remove(str);
            } else {
                this.b.put(str, str2);
            }
            final String f = f();
            ljd.a().a(new Runnable() { // from class: tb.lna.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        liz.b(f, JSON.toJSONString(lna.a(lna.this)));
                    }
                }
            });
        }
    }

    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
        }
        Map<String, String> b = b();
        return (b != null && b.containsKey(str)) ? b.get(str) : str2;
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        if (this.b == null) {
            String f = f();
            String a2 = liz.a(f, null);
            if (a2 == null) {
                ldf.d("AbsReqParamSaveModeHandler", "getBizParams 未读到 saveKey ：" + f);
                return null;
            }
            try {
                this.b = (Map) JSON.parseObject(a2, Map.class);
            } catch (Throwable th) {
                ldf.d("AbsReqParamSaveModeHandler", "getBizParams error : " + th.getMessage());
            }
        }
        return this.b;
    }

    private String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        return a() + this.f30732a;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        Map<String, String> map = this.b;
        if (map == null) {
            return;
        }
        map.clear();
        liz.b(f(), null);
    }
}
