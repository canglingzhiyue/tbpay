package android.taobao.windvane.extra.config;

import android.content.Context;
import android.taobao.windvane.c;
import android.taobao.windvane.config.WVConfigManager;
import android.taobao.windvane.file.NotEnoughSpace;
import android.taobao.windvane.file.a;
import android.taobao.windvane.file.b;
import android.taobao.windvane.jsbridge.l;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.g;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.riy;
import tb.sjn;

/* loaded from: classes2.dex */
public class TBConfigManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ANDROID_WINDVANE_CONFIG = "android_windvane_config";
    public static final String WINDVANE_COMMMON_CONFIG = "WindVane_common_config";
    public static final String WINDVANE_COMMON_CONFIG = "WindVane";
    public static final String WINDVANE_CONFIG = "WindVane";
    public static final String WINDVANE_URL_CONFIG = "WindVane_URL_config";
    private static TBConfigManager instance;
    private String useOrange = "true";
    private g mConfigListenerV1 = null;
    private String configPath = null;

    public static /* synthetic */ void access$000(TBConfigManager tBConfigManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dd2aeb3", new Object[]{tBConfigManager});
        } else {
            tBConfigManager.setWVConfig();
        }
    }

    public static /* synthetic */ String access$100(TBConfigManager tBConfigManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fc5b73ec", new Object[]{tBConfigManager}) : tBConfigManager.configPath;
    }

    static {
        kge.a(1592258579);
        instance = null;
    }

    public static TBConfigManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBConfigManager) ipChange.ipc$dispatch("ea0f4e80", new Object[0]);
        }
        if (instance == null) {
            synchronized (TBConfigManager.class) {
                if (instance == null) {
                    instance = new TBConfigManager();
                }
            }
        }
        return instance;
    }

    public void initAfterAWP(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa03ef33", new Object[]{this, context});
        } else if (this.mConfigListenerV1 != null) {
        } else {
            try {
                String[] strArr = {"android_windvane_config", WINDVANE_COMMMON_CONFIG, "WindVane", "WindVane_URL_config"};
                this.mConfigListenerV1 = new TBConfigListenerV1();
                OrangeConfig.getInstance().registerListener(strArr, this.mConfigListenerV1);
            } catch (Throwable unused) {
                this.mConfigListenerV1 = null;
            }
        }
    }

    public void initEarly(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f370a1ce", new Object[]{this, context});
            return;
        }
        File a2 = b.a(context, "windvane");
        this.configPath = a2.getPath() + File.separator + "orange";
        File file = new File(this.configPath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        getLocalConfig();
        OrangeConfig.getInstance().registerListener(new String[]{"WindVane"}, new g() { // from class: android.taobao.windvane.extra.config.TBConfigManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.g
            public void onConfigUpdate(String str, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                } else if (!str.equalsIgnoreCase("WindVane")) {
                } else {
                    l.b = OrangeConfig.getInstance().getConfig("WindVane", "enableGetParamByJs", "0").equals("1");
                    String config = OrangeConfig.getInstance().getConfig("WindVane", "useOrange", "true");
                    String config2 = OrangeConfig.getInstance().getConfig("WindVane", "closeUCByRom", "0");
                    TBConfigManager.access$000(TBConfigManager.this);
                    try {
                        String access$100 = TBConfigManager.access$100(TBConfigManager.this);
                        a.a(access$100, ByteBuffer.wrap((android.taobao.windvane.config.a.a().i() + "," + config + "," + config2).getBytes("utf-8")));
                    } catch (NotEnoughSpace e2) {
                        e2.printStackTrace();
                    } catch (UnsupportedEncodingException e3) {
                        e3.printStackTrace();
                    }
                }
            }
        });
    }

    private void setWVConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f2ec6a", new Object[]{this});
            return;
        }
        c.a().b().e(TextUtils.equals("true", OrangeConfig.getInstance().getConfig("WindVane", "onlyBkpg", "true")));
        c.a().b().f(TextUtils.equals("true", OrangeConfig.getInstance().getConfig("WindVane", "closeUCHA", "false")));
        c.a().b().b(OrangeConfig.getInstance().getConfig("WindVane", "JSErrorRatio", sjn.DEFAULT_PLAY_RATE));
        c.a().b().a(TextUtils.equals(OrangeConfig.getInstance().getConfig("WindVane", "isOpenAIT", "true"), "true"));
        c.a().b().c(TextUtils.equals(OrangeConfig.getInstance().getConfig("WindVane", "isOpenH5PP", "true"), "true"));
        c.a().b().d(TextUtils.equals(OrangeConfig.getInstance().getConfig("WindVane", "isOpenUserPP", "true"), "true"));
        c.a().b().a(OrangeConfig.getInstance().getConfig("WindVane", "fSPFilterAnimation", "true"));
        c.a().b().b(TextUtils.equals(OrangeConfig.getInstance().getConfig("WindVane", "isOpenH5_2", "true"), "true"));
        android.taobao.windvane.config.a.e = TextUtils.equals(OrangeConfig.getInstance().getConfig("WindVane", "newFireEvent", "true"), "true");
        c.a().b().g(TextUtils.equals(OrangeConfig.getInstance().getConfig("WindVane", "filterIllegalUrl", "true"), "true"));
        m.c("WVConfig", "Performance.Config = [" + c.a().b().toString() + riy.ARRAY_END_STR);
    }

    private void getLocalConfig() {
        byte[] b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be31a5e", new Object[]{this});
            return;
        }
        String str = null;
        try {
            b = a.b(this.configPath);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        if (b == null) {
            return;
        }
        str = new String(b, "utf-8");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m.c("WVConfig", "get windvane local config=[" + str + riy.ARRAY_END_STR);
        String[] split = str.split(",");
        if (split.length != 3) {
            return;
        }
        if (TextUtils.isEmpty(split[0]) || !TextUtils.equals(android.taobao.windvane.config.a.a().i(), split[0])) {
            m.c("WVConfig", "skip local config for dispatching appVersion. require=[" + android.taobao.windvane.config.a.a().i() + "], real=[" + split[0] + riy.ARRAY_END_STR);
            return;
        }
        if (!TextUtils.isEmpty(split[1])) {
            this.useOrange = split[1];
        }
        if (TextUtils.isEmpty(split[2])) {
            return;
        }
        try {
            android.taobao.windvane.config.a.d = Integer.valueOf(split[2]).intValue();
        } catch (Throwable unused) {
        }
    }

    public void initConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6811c3f9", new Object[]{this});
            return;
        }
        m.c("WVConfig", "use orange config");
        OrangeConfig.getInstance().registerListener(new String[]{"windvane_common", "windvane_domain", "WindVane_URL_config", WVConfigManager.CONFIGNAME_COOKIE, "windvane_uc_core"}, new g() { // from class: android.taobao.windvane.extra.config.TBConfigManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.g
            public void onConfigUpdate(String str, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                    return;
                }
                Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
                if (configs == null || configs.size() == 0) {
                    WVConfigManager.a().a(str, "");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    for (Map.Entry<String, String> entry : configs.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                    jSONObject.put("appVersion", android.taobao.windvane.config.a.a().i());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                WVConfigManager.a().a(str, jSONObject.toString());
                m.c("WVConfig", "receive name=[" + str + "]; config=[" + jSONObject.toString() + riy.ARRAY_END_STR);
            }
        });
    }
}
