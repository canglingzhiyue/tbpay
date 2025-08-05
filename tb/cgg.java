package tb;

import com.alibaba.wireless.aliprivacy.b;
import com.alibaba.wireless.aliprivacy.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.f;
import java.util.Map;

/* loaded from: classes.dex */
public class cgg implements cfn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f26282a = "aliprivacy_config";

    /* loaded from: classes3.dex */
    public class a implements f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.orange.f
        public void onConfigUpdate(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
                return;
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
            b.a(configs);
            c.a("OrangeConfigAdapter", configs != null ? configs.toString() : "empty");
        }
    }

    @Override // tb.cfn
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        OrangeConfig.getInstance().registerListener(new String[]{f26282a}, new a());
        OrangeConfig.getInstance().getConfigs(f26282a);
    }
}
