package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfigLocal;
import com.taobao.orange.g;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.popupcenter.strategy.PopStrategyGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class nju implements njt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_PAGE = "default";
    public static final String HOME_PAGE = "com.taobao.tao.homepage.HomePageFragment";
    public static final String TAG = "popcenter.Orange";
    private static PopStrategyGroup b;
    private static a d;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, PopStrategyGroup> f31507a = new ConcurrentHashMap();
    private static List<String> c = new ArrayList(Arrays.asList("com.taobao.tao.homepage.overlay.OverlayActivity"));

    /* loaded from: classes7.dex */
    public static class a implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.orange.g
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            } else if (!TextUtils.equals("android_pop_center", str) || z) {
            } else {
                nju.a();
            }
        }
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            b();
        }
    }

    static {
        PopStrategyGroup popStrategyGroup = new PopStrategyGroup();
        b = popStrategyGroup;
        popStrategyGroup.page = "default";
        b.setStrategies(new PopStrategy[]{new PopStrategy("high", 0, false, false, 0L, false), new PopStrategy(PopStrategy.IDENTIFIER_SPLASH, 0, false, false, 0L, true), new PopStrategy("update", 20, false, false, 0L, false), new PopStrategy(PopStrategy.IDENTIFIER_TAO_PASSWORD, 40, false, false, 0L, false), new PopStrategy(PopStrategy.IDENTIFIER_FLOAT, 60, false, false, 0L, false), new PopStrategy(PopStrategy.IDENTIFIER_POPLAYER, 80, false, false, 0L, false), new PopStrategy("guessYouLike", 100, false, false, 0L, false), new PopStrategy("normal", 9999, false, false, 0L, false), new PopStrategy("low", Integer.MAX_VALUE, false, false, 0L, false)});
        b();
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : c.contains(str);
    }

    @Override // tb.njt
    public PopStrategyGroup a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopStrategyGroup) ipChange.ipc$dispatch("3b283f7d", new Object[]{this, str});
        }
        if (b(str) || TextUtils.equals(OrangeConfigLocal.getInstance().getConfig("android_pop_center", "popOperationDegradeSwitch", "false"), "true")) {
            return null;
        }
        PopStrategyGroup popStrategyGroup = f31507a.get(str);
        if (popStrategyGroup != null) {
            if (popStrategyGroup != PopStrategyGroup.EMPTY_GROUP) {
                return popStrategyGroup;
            }
            PopStrategyGroup c2 = c("popOperationOtherKey_" + str);
            if (c2 == null) {
                return f31507a.get("default");
            }
            f31507a.put(str, c2);
            return c2;
        }
        return f31507a.get("default");
    }

    public static void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{str, new Boolean(z)});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            b.getStrategyByIdentifier(str).showDirect = z;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static synchronized void b() {
        synchronized (nju.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[0]);
                return;
            }
            f31507a.clear();
            f31507a.put("default", b);
            f31507a.put(HOME_PAGE, b);
            String config = OrangeConfigLocal.getInstance().getConfig("android_pop_center", "popOperationMainKey", "");
            String str = "load main config=" + config;
            if (!TextUtils.isEmpty(config)) {
                String str2 = "get configData=" + config;
                JSONObject parseObject = JSON.parseObject(config);
                List<PopStrategyGroup> parseArray = JSONArray.parseArray(parseObject.getString("mainPagesStrategy"), PopStrategyGroup.class);
                if (parseArray != null && !parseArray.isEmpty()) {
                    for (PopStrategyGroup popStrategyGroup : parseArray) {
                        f31507a.put(popStrategyGroup.page, popStrategyGroup);
                    }
                }
                List<String> parseArray2 = JSONArray.parseArray(parseObject.getString("otherPagesStrategy"), String.class);
                if (parseArray2 != null && !parseArray2.isEmpty()) {
                    for (String str3 : parseArray2) {
                        f31507a.put(str3, PopStrategyGroup.EMPTY_GROUP);
                    }
                }
            }
            if (d == null) {
                d = new a();
                OrangeConfigLocal.getInstance().registerListener(new String[]{"android_pop_center"}, d);
            }
        }
    }

    private static PopStrategyGroup c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopStrategyGroup) ipChange.ipc$dispatch("3fbda93b", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String config = OrangeConfigLocal.getInstance().getConfig("android_pop_center", str + "popOperationOtherKey_", "");
        String str2 = "load other config=" + config;
        if (TextUtils.isEmpty(config)) {
            return null;
        }
        try {
            return (PopStrategyGroup) JSONObject.parseObject(config, PopStrategyGroup.class);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
