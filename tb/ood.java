package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.tinct.ITinctOperater;

/* loaded from: classes.dex */
public class ood {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HOME_BUCKETS = "home_buckets";

    /* renamed from: a  reason: collision with root package name */
    private String f32223a;

    static {
        kge.a(-1044925854);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.f32223a = str;
        g.a().getSharedPreferences("home_buckets_key", 0).edit().putString(HOME_BUCKETS, str).apply();
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (!StringUtils.isEmpty(this.f32223a)) {
            return this.f32223a;
        }
        return g.a().getSharedPreferences("home_buckets_key", 0).getString(HOME_BUCKETS, "");
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.getString(HOME_BUCKETS) == null) {
            ITinctOperater.getInstance().markBatchTouchStoneUsed("Page_Home", a());
        } else {
            a(jSONObject.getString(HOME_BUCKETS));
            ITinctOperater.getInstance().markBatchTouchStoneUsed("Page_Home", jSONObject.getString(HOME_BUCKETS));
        }
    }
}
