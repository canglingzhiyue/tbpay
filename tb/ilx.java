package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.core.f;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.tao.log.TLog;
import java.util.Map;

/* loaded from: classes.dex */
public class ilx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_GROUP_NAME = "tb_revision_homepage_switch";
    public static final String ORANGE_KEY_LAUNCHER_SWITCH = "launcherSwitch";
    public static final String ORANGE_NEW_DISCOVERY_GROUP_NAME = "tb_revision_new_discovery_switch";
    public static final String ORANGE_SIMPLE_GROUP_NAME = "tb_revision_simple_switch";

    /* renamed from: a  reason: collision with root package name */
    private a f29142a;
    private final ilz b;

    /* loaded from: classes.dex */
    public interface a {
        void a(String str, String str2);
    }

    public static /* synthetic */ ilz a(ilx ilxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ilz) ipChange.ipc$dispatch("d8ed1d4c", new Object[]{ilxVar}) : ilxVar.b;
    }

    public static /* synthetic */ a b(ilx ilxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("d89f81d0", new Object[]{ilxVar}) : ilxVar.f29142a;
    }

    public ilx(ilz ilzVar) {
        this.b = ilzVar;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eec8266", new Object[]{this, aVar});
        } else {
            this.f29142a = aVar;
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{ORANGE_GROUP_NAME, ORANGE_SIMPLE_GROUP_NAME, ORANGE_NEW_DISCOVERY_GROUP_NAME}, new d() { // from class: tb.ilx.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                        return;
                    }
                    try {
                        if (ilx.ORANGE_GROUP_NAME.equals(str)) {
                            TLog.loge("OrangeSwitchManager", "into update orange tb_revision_homepage_switch config");
                            String customConfig = OrangeConfig.getInstance().getCustomConfig(str, null);
                            if (StringUtils.equals(customConfig, ilx.a(ilx.this).b("orange"))) {
                                return;
                            }
                            ilx.a(ilx.this).a("orange", customConfig);
                            ilx.b(ilx.this).a("orange", customConfig);
                        } else if (ilx.ORANGE_SIMPLE_GROUP_NAME.equals(str)) {
                            TLog.loge("OrangeSwitchManager", "into update orange tb_revision_simple_switch config");
                            String customConfig2 = OrangeConfig.getInstance().getCustomConfig(str, null);
                            if (StringUtils.equals(customConfig2, ilx.a(ilx.this).b(ily.KEY_SIMPLE_SWITCH_ORANGE))) {
                                return;
                            }
                            ilx.a(ilx.this).a(ily.KEY_SIMPLE_SWITCH_ORANGE, customConfig2);
                        } else if (!ilx.ORANGE_NEW_DISCOVERY_GROUP_NAME.equals(str)) {
                        } else {
                            TLog.loge("OrangeSwitchManager", "into update orange tb_revision_new_discovery_switch config");
                            String config = OrangeConfig.getInstance().getConfig(str, "open", null);
                            if (StringUtils.equals(config, ilx.a(ilx.this).b(ily.KEY_NEW_DISCOVERY_ORANGE))) {
                                return;
                            }
                            ilx.a(ilx.this).a(ily.KEY_NEW_DISCOVERY_ORANGE, config);
                        }
                    } catch (Throwable th) {
                        TLog.loge("OrangeSwitchManager", "init Exception " + th.getMessage());
                    }
                }
            }, true);
        }
    }

    public f a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("a294a930", new Object[]{this, str}) : this.b.a(str);
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : this.b.b(str);
    }
}
