package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.b;
import com.etao.feimagesearch.nn.NetConfig;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cqx extends NetConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f26459a = 0.85f;
    public float b = 0.36f;
    public float c = 0.1f;

    static {
        kge.a(-1582834160);
    }

    public static /* synthetic */ Object ipc$super(cqx cqxVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(cqx cqxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f4a0ce", new Object[]{cqxVar});
        } else {
            cqxVar.a();
        }
    }

    public cqx() {
        d dVar = new d() { // from class: tb.cqx.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str, Map<String, String> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    return;
                }
                OrangeConfig.getInstance().getConfigs("image_search");
                cot.d("FestivalNetConfig", "on update");
                cqx.a(cqx.this);
            }
        };
        OrangeConfig.getInstance().getConfigs("image_search");
        OrangeConfig.getInstance().registerListener(new String[]{"image_search"}, dVar, true);
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        String b = b.b("opt_detect_error_hint", "");
        try {
            if (TextUtils.isEmpty(b)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(b);
            String string = jSONObject.getString("blur_ratio");
            if (!TextUtils.isEmpty(string)) {
                this.f26459a = Float.parseFloat(string);
            }
            String string2 = jSONObject.getString("blur_conf");
            if (!TextUtils.isEmpty(string2)) {
                this.b = Float.parseFloat(string2);
            }
            String string3 = jSONObject.getString("undersize_ratio");
            if (TextUtils.isEmpty(string3)) {
                return;
            }
            this.c = Float.parseFloat(string3);
        } catch (Exception e) {
            cot.b("FestivalNetConfig", "error: " + e.toString());
        }
    }
}
