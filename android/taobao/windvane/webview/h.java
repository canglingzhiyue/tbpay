package android.taobao.windvane.webview;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile h f1723a;
    private JSONObject b = null;
    private String[] c = null;

    static {
        kge.a(-245296977);
        f1723a = null;
    }

    public static h a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("c76d6a4b", new Object[0]);
        }
        if (f1723a == null) {
            synchronized (h.class) {
                if (f1723a == null) {
                    f1723a = new h();
                }
            }
        }
        return f1723a;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.startsWith("\"") && str.endsWith("\"")) {
                str = str.substring(1, str.length() - 1);
            }
            this.b = new JSONObject(str.replace("\\", ""));
        } catch (Exception unused) {
            this.b = null;
        }
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ed42e657", new Object[]{this}) : this.b;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.b = null;
        }
    }

    public String[] d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("a605c1fa", new Object[]{this}) : this.c;
    }

    public void a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
        } else {
            this.c = strArr;
        }
    }
}
