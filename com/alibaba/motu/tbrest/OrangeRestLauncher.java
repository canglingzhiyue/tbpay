package com.alibaba.motu.tbrest;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.taobao.orange.OrangeConfig;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.byn;
import tb.byr;
import tb.kge;

/* loaded from: classes.dex */
public class OrangeRestLauncher implements Serializable {
    private static final String ALL_SAMPLE = "all";
    private static final String CLEAR_PRIVACY_DATA = "clearPrivacyData";
    private static final String DATA_SIZE = "dataSize";
    private static final int DEFAULT_DATA_SIZE = 40960;
    private static final int DEFAULT_MESSAGE_COUNT = 50;
    private static final float DEFAULT_SAMPLE = 1.0f;
    private static final String MESSAGE_COUNT = "messageCount";
    private static final String TB_BIZ_REST_ORANGE = "TBBizRestOrange";
    private static final String TB_REST_ORANGE = "TBRestOrange";
    private static final String USE_OLD_LOGIC = "useOldLogic";
    private static volatile boolean initOrange;

    /* loaded from: classes.dex */
    private static class a implements com.taobao.orange.d {

        /* renamed from: a  reason: collision with root package name */
        private final byn f3147a;

        static {
            kge.a(154332208);
            kge.a(-1209827241);
        }

        private a() {
            this.f3147a = byn.a();
        }

        private void a(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    this.f3147a.a(key, OrangeRestLauncher.getSafeFloat(entry.getValue(), 1.0f));
                }
            }
        }

        @Override // com.taobao.orange.d
        public void onConfigUpdate(String str, Map<String, String> map) {
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(OrangeRestLauncher.TB_BIZ_REST_ORANGE);
            if (configs == null || configs.size() <= 0) {
                return;
            }
            a(configs);
        }
    }

    /* loaded from: classes.dex */
    private static class b implements com.taobao.orange.d {

        /* renamed from: a  reason: collision with root package name */
        private final byr f3148a;

        static {
            kge.a(72346551);
            kge.a(-1209827241);
        }

        private b() {
            this.f3148a = byr.a();
        }

        private int a(String str, int i) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return Integer.valueOf(str).intValue();
                }
            } catch (Exception unused) {
            }
            return i;
        }

        private void a(Map<String, String> map) {
            this.f3148a.a(OrangeRestLauncher.getSafeFloat(map.get("all"), 1.0f));
            this.f3148a.a(a(map.get(OrangeRestLauncher.DATA_SIZE), OrangeRestLauncher.DEFAULT_DATA_SIZE));
            this.f3148a.b(a(map.get(OrangeRestLauncher.MESSAGE_COUNT), 50));
            this.f3148a.a(a(map.get(OrangeRestLauncher.USE_OLD_LOGIC), false));
            this.f3148a.b(a(map.get(OrangeRestLauncher.CLEAR_PRIVACY_DATA), true));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key) && a(key)) {
                    this.f3148a.a(key, OrangeRestLauncher.getSafeFloat(entry.getValue(), 1.0f));
                }
            }
        }

        private boolean a(String str) {
            char charAt;
            return str.length() > 0 && (charAt = str.charAt(0)) >= '0' && charAt <= '9';
        }

        private boolean a(String str, boolean z) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return Boolean.valueOf(str).booleanValue();
                }
            } catch (Exception unused) {
            }
            return z;
        }

        @Override // com.taobao.orange.d
        public void onConfigUpdate(String str, Map<String, String> map) {
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(OrangeRestLauncher.TB_REST_ORANGE);
            if (configs == null || configs.size() <= 0) {
                return;
            }
            a(configs);
        }
    }

    static {
        kge.a(-35399964);
        kge.a(1028243835);
        initOrange = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float getSafeFloat(String str, float f) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return Float.valueOf(str).floatValue();
            }
        } catch (Exception unused) {
        }
        return f;
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        if (!initOrange) {
            initOrange = true;
            d.a().l = UTABTest.getAppActivateTrackId();
            OrangeConfig.getInstance().getConfigs(TB_REST_ORANGE);
            OrangeConfig.getInstance().registerListener(new String[]{TB_REST_ORANGE}, new b(), true);
            OrangeConfig.getInstance().getConfigs(TB_BIZ_REST_ORANGE);
            OrangeConfig.getInstance().registerListener(new String[]{TB_BIZ_REST_ORANGE}, new a(), true);
        }
    }
}
