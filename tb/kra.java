package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.at;
import com.taobao.android.litecreator.util.u;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/taobao/android/litecreator/sdk/util/LEUtil;", "", "()V", "Companion", "litecreator_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class kra {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static final String f30243a;
    private static int b;

    @JvmStatic
    public static final int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue() : Companion.a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\f\u001a\u00020\u0007H\u0007J\b\u0010\r\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/taobao/android/litecreator/sdk/util/LEUtil$Companion;", "", "()V", "appVersion", "", "kotlin.jvm.PlatformType", "defaultVersion", "", "version", "calByAppVersion", "getRules", "Lcom/alibaba/fastjson/JSONObject;", "getVersion", "hitOrangeVersion", "limitedVersion", "partVersion", "litecreator_sdk_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(579432183);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
            }
            if (kra.a() == -1) {
                try {
                    int b = b();
                    if (b < 0) {
                        b = d();
                    }
                    kra.a(b);
                } catch (Throwable th) {
                    kra.a(100);
                    u.d("LEUtil", "getVersion error:" + Log.getStackTraceString(th));
                }
            }
            return kra.a();
        }

        private final int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
            }
            JSONObject c = c();
            if (c == null) {
                return -1;
            }
            for (Map.Entry<String, Object> entry : c.entrySet()) {
                if (TextUtils.equals(kra.b(), entry.getKey())) {
                    return Integer.parseInt(entry.getValue().toString());
                }
                String key = entry.getKey();
                q.b(key, "rule.key");
                if (n.b((CharSequence) key, (CharSequence) Constants.WAVE_SEPARATOR, false, 2, (Object) null)) {
                    String key2 = entry.getKey();
                    q.b(key2, "rule.key");
                    List b = n.b((CharSequence) key2, new String[]{Constants.WAVE_SEPARATOR}, false, 0, 6, (Object) null);
                    if (b.size() > 1 && kra.b().compareTo((String) b.get(0)) >= 0 && kra.b().compareTo((String) b.get(1)) <= 0) {
                        return Integer.parseInt(entry.getValue().toString());
                    }
                }
            }
            return -1;
        }

        private final JSONObject c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
            }
            try {
                return JSON.parseObject(OrangeConfig.getInstance().getConfig("XGuangCreator", "material_config_version_list", null));
            } catch (Throwable unused) {
                return null;
            }
        }

        private final int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
            }
            String appVersion = kra.b();
            q.b(appVersion, "appVersion");
            List<String> b = n.b((CharSequence) appVersion, new String[]{"."}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(p.a((Iterable) b, 10));
            for (String str : b) {
                arrayList.add(Integer.valueOf(kra.Companion.a(at.a(str, 0))));
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2.size() >= 3) {
                return (((Number) arrayList2.get(0)).intValue() * 1000 * 1000) + (((Number) arrayList2.get(1)).intValue() * 1000) + ((Number) arrayList2.get(2)).intValue();
            }
            return 100;
        }

        private final int a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue() : i % 1000;
        }
    }

    public static final /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : b;
    }

    public static final /* synthetic */ void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
        } else {
            b = i;
        }
    }

    public static final /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : f30243a;
    }

    static {
        kge.a(1468695151);
        Companion = new a(null);
        f30243a = Globals.getVersionName();
        b = -1;
    }
}
