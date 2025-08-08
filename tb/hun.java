package tb;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class hun {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final hun f28792a = new hun();
    private final List<a> b = new CopyOnWriteArrayList();
    private final Set<String> c = new CopyOnWriteArraySet();
    private volatile boolean d = false;

    private hun() {
        c("//meta.m.taobao.com/app/mtb/app-success-new/success");
        this.c.add("com.taobao.tao.welcome.Welcome");
        this.c.add(lsk.BIZ_NAME);
        this.c.add("com.alibaba.android.split.core.missingsplits.MissingSplitsActivity");
        this.c.add("com.taobao.keepalive.screenoff.PixelActivity");
        this.c.add("android.taobao.mulitenv.MockConfigActivity");
        this.c.add("com.taobao.taobao.ddshare.DDShareActivity");
        this.c.add("com.taobao.android.purchase.aura.TBBuyActivity");
        this.c.add("com.taobao.ugc.framework.UGCContainerActivity");
        if (new File("/data/local/tmp/.autosize/.add_detail_activity").exists()) {
            this.c.add("com.taobao.android.detail.wrapper.activity.DetailActivity");
        }
    }

    public static hun a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hun) ipChange.ipc$dispatch("f05b03d", new Object[0]) : f28792a;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("LargeScreenDisplayRules", 0);
        c(sharedPreferences.getString("fullScreenUrl", null));
        a(sharedPreferences.getString("addComponentClassName", null));
        b(sharedPreferences.getString("deleteComponentClassName", null));
        Map<String, ?> all = sharedPreferences.getAll();
        if (all != null && !all.isEmpty()) {
            TLog.loge("TBAutoSize.SplitPolicy", "load config: " + new JSONObject(all));
        }
        this.d = true;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.c.addAll(Arrays.asList(str.split(";")));
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!StringUtils.isEmpty(str)) {
            for (String str2 : str.split(";")) {
                this.c.remove(str2);
            }
        }
    }

    public void b(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{this, application});
            return;
        }
        try {
            OrangeConfig.getInstance().registerListener(new String[]{"LargeScreenDisplayRules"}, new d() { // from class: tb.hun.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                        return;
                    }
                    Map<String, String> configs = OrangeConfig.getInstance().getConfigs("LargeScreenDisplayRules");
                    if (configs == null) {
                        return;
                    }
                    TLog.loge("TBAutoSize.SplitPolicy", "orange config: " + new JSONObject(map));
                    application.getSharedPreferences("LargeScreenDisplayRules", 0).edit().putString("fullScreenUrl", configs.get("fullScreenUrl")).putString("addComponentClassName", configs.get("addComponentClassName")).putString("deleteComponentClassName", configs.get("deleteComponentClassName")).commit();
                    hun.this.a(application);
                }
            }, true);
        } catch (Throwable th) {
            TLog.loge("TBAutoSize.SplitPolicy", "registerOrangeListener: occur exception, maybe orange is not initialized!", th);
            th.printStackTrace();
        }
    }

    public boolean a(Context context, ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f46de613", new Object[]{this, context, componentName})).booleanValue();
        }
        if (componentName == null) {
            return false;
        }
        if (!this.d) {
            a(context);
        }
        return this.c.contains(componentName.getClassName());
    }

    public boolean a(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd717ceb", new Object[]{this, context, uri})).booleanValue();
        }
        if (!this.d) {
            a(context);
        }
        for (a aVar : this.b) {
            if (aVar.a(uri)) {
                return true;
            }
        }
        return false;
    }

    private void c(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (!StringUtils.isEmpty(str)) {
            for (String str2 : str.split(";")) {
                if (!StringUtils.isEmpty(str2)) {
                    Uri parse = Uri.parse(str2);
                    String host = parse.getHost();
                    if (!StringUtils.isEmpty(host)) {
                        a a2 = a.a(this.b, 1, null, host);
                        if (a2 == null) {
                            a2 = new a(1, null, host);
                            this.b.add(a2);
                        }
                        String path = parse.getPath();
                        a a3 = a.a(a.b(a2), 2, null, path);
                        if (a3 == null) {
                            a3 = new a(2, null, path);
                            a2.a(a3);
                        }
                        for (String str3 : parse.getQueryParameterNames()) {
                            if (!StringUtils.isEmpty(str3)) {
                                String queryParameter = parse.getQueryParameter(str3);
                                a a4 = a.a(a.b(a3), 3, str3, queryParameter);
                                if (a4 == null) {
                                    a4 = new a(3, str3, queryParameter);
                                    a3.a(a4);
                                }
                                a3 = a4;
                            }
                        }
                        TLog.loge("TBAutoSize.SplitPolicy", "addFullScreenUrlTreeData success: " + str2);
                    }
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final int f28794a;
        private final String b;
        private final String c;
        private final List<a> d;

        public static /* synthetic */ a a(List list, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("1ebe4eea", new Object[]{list, new Integer(i), str, str2}) : b(list, i, str, str2);
        }

        public static /* synthetic */ List b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d218820c", new Object[]{aVar}) : aVar.d;
        }

        private a(int i, String str, String str2) {
            this.d = new CopyOnWriteArrayList();
            this.f28794a = i;
            this.b = str;
            this.c = str2;
        }

        public void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8212f49a", new Object[]{this, aVar});
            } else {
                this.d.add(aVar);
            }
        }

        public boolean a(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{this, uri})).booleanValue();
            }
            if (b(uri)) {
                return c(uri);
            }
            return false;
        }

        private boolean b(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("38284082", new Object[]{this, uri})).booleanValue();
            }
            int i = this.f28794a;
            if (1 == i) {
                if (!"*".equals(this.c)) {
                    return StringUtils.equals(this.c, uri.getHost());
                }
                return true;
            } else if (2 != i) {
                if (3 != i) {
                    return false;
                }
                String queryParameter = uri.getQueryParameter(this.b);
                if (!"*".equals(this.c)) {
                    return StringUtils.equals(queryParameter, this.c);
                }
                return true;
            } else if ("/*".equals(this.c)) {
                return true;
            } else {
                if ((!StringUtils.isEmpty(this.c) && !StringUtils.equals(this.c, "/")) || (!StringUtils.isEmpty(uri.getPath()) && !StringUtils.equals(uri.getPath(), "/"))) {
                    return StringUtils.equals(this.c, uri.getPath());
                }
                return true;
            }
        }

        private boolean c(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("beadfb21", new Object[]{this, uri})).booleanValue();
            }
            if (this.d.size() == 0) {
                return true;
            }
            for (a aVar : this.d) {
                if (aVar.a(uri)) {
                    return true;
                }
            }
            return false;
        }

        private static a b(List<a> list, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fa7fcaab", new Object[]{list, new Integer(i), str, str2});
            }
            if (list == null) {
                return null;
            }
            if (1 == i && StringUtils.isEmpty(str2)) {
                return null;
            }
            if (3 == i && (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2))) {
                return null;
            }
            for (a aVar : list) {
                if (i == aVar.f28794a && StringUtils.equals(str, aVar.b) && StringUtils.equals(str2, aVar.c)) {
                    return aVar;
                }
            }
            return null;
        }
    }
}
