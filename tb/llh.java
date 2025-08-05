package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class llh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TB_HOME_PAGE = "PageTaoHome";
    public String b;

    /* renamed from: a  reason: collision with root package name */
    public String f30693a = "PageTaoHome";
    private JSONObject c = new JSONObject();

    static {
        kge.a(171450946);
    }

    public static llh a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (llh) ipChange.ipc$dispatch("7c72082c", new Object[]{str}) : new llh(str);
    }

    public llh(String str) {
        this.b = str;
    }

    public llh a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (llh) ipChange.ipc$dispatch("953c9fa2", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            return this;
        }
        this.c.put(str, (Object) str2);
        return this;
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.c;
    }
}
