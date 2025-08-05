package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.HomePageUtility;
import java.util.Map;

/* loaded from: classes8.dex */
public class otn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ksk f32408a;
    private String b;
    private String c;
    private Map<?, ?> d;
    private boolean e;

    static {
        kge.a(782489393);
    }

    public otn(String str) {
        a(str);
    }

    public ksk a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ksk) ipChange.ipc$dispatch("f07057b", new Object[]{this}) : this.f32408a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public Map<?, ?> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : this.d;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.e;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            JSONObject parseObject = JSON.parseObject(str);
            this.f32408a = ksk.b(parseObject.getString("channel"));
            this.b = parseObject.getString("api");
            this.c = parseObject.getString("version");
            this.e = HomePageUtility.a(parseObject.getString("showLoading"));
            String string = parseObject.getString("queryParams");
            try {
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                this.d = (Map) JSON.parseObject(string, Map.class);
            } catch (Throwable unused) {
                ldf.d("WeexRecommendBizParams", "queryParamsStr parse error , queryParamsStr :" + string);
            }
        }
    }
}
