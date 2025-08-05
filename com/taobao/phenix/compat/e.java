package com.taobao.phenix.compat;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfigLocal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import tb.niw;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_KEY_ALIVFS_ENABLED = "_alivfs";
    public static final String CLEAR_CACHE_HISTORY = "clear_cache_history";
    public static final String CLOUD_KEY_LIMIT_RECURSIVE_DEPTH_WHITELIST = "_limit_recursive_depth_whitelist";
    public static final String CONFIG_ITEM_SEPARATOR = ",";
    public static final int COVERAGE_RANGE_MAX = 100;
    public static final int COVERAGE_RANGE_MIN = 0;
    public static final int FID_OF_ANDROID_P = 29;
    public static final int FID_OF_ANDROID_S = 46;
    public static final int FID_OF_ANIM_FRAME_COUNT_LIMIT = 49;
    public static final int FID_OF_APG_SUPPORT = 17;
    public static final int FID_OF_APNG_SUPPORT = 20;
    public static final int FID_OF_ASHMEM_SUPPORT = 19;
    public static final int FID_OF_AVIF_SUPPORT = 45;
    public static final int FID_OF_BITMAP_POOL = 18;
    public static final int FID_OF_CLEAR_CACHE = 52;
    public static final int FID_OF_DECODE_CANCELLABLE = 16;
    public static final int FID_OF_DETECT_ALIVFS_NUMS = 44;
    public static final int FID_OF_DOMAIN_MERGE_SPECIAL = 37;
    public static final int FID_OF_EXTERNAL_DECODER_PRIOR = 15;
    public static final int FID_OF_FIX_HEIF_ALPHA_CRASH = 53;
    public static final int FID_OF_FIX_HEIF_MEMORY_CRASH = 54;
    public static final int FID_OF_HEIC_ICC_SUPPORT = 39;
    public static final int FID_OF_HEIF_BUGFIX = 30;
    public static final int FID_OF_HEIF_PNG_SUPPORT = 23;
    public static final int FID_OF_HEIF_SUPPORT = 22;
    public static final int FID_OF_IMAGE_ASYNC = 28;
    public static final int FID_OF_IMAGE_GRAY_TRAFFIC = 55;
    public static final int FID_OF_IMAGE_OPT_CACHE_STRATEGY = 56;
    public static final int FID_OF_LIMIT_RECURSIVE_DEPTH_WHITELIST = 50;
    public static final int FID_OF_LOCAL_AVIF_BY_SYSTEM_SUPPORT = 48;
    public static final int FID_OF_LOCAL_HEIC_BY_SYSTEM_SUPPORT = 41;
    public static final int FID_OF_MONITOR_STAT_SAMPLING = 13;
    public static final int FID_OF_NETWORK_MAX_RUNNING = 14;
    public static final int FID_OF_NEW_CACHE_POOL = 26;
    public static final int FID_OF_NEW_LAUNCH = 27;
    public static final int FID_OF_NEW_THREAD_MODEL = 24;
    public static final int FID_OF_NEW_THREAD_MODEL_V2 = 47;
    public static final int FID_OF_NON_CRITICAL_REPORT_SAMPLING = 21;
    public static final int FID_OF_NO_REUSE_WEBP = 32;
    public static final int FID_OF_RXMODEL_RECYCLE = 25;
    public static final int FID_OF_SKIP_ALIVFS_DURATION = 43;
    public static final int FID_OF_SKIP_ALIVFS_SHRESHOLD = 42;
    public static final int FID_OF_SUPPORT_HEIF_ALPHA = 51;
    public static final int FID_OF_THUMB_NAIL = 36;
    public static final int FID_OF_TTL_CACHE = 38;
    public static final int FID_OF_UNIFY_THREAD_POOL = 12;
    public static final int FID_OF_USER_AGENT_ADD_TRACE_ID = 40;
    public static final int FID_OF_WEBP_BUG_FIX = 35;
    public static final int FID_OF_WEBP_CONVERT = 33;
    public static final int FID_OF_WEBP_DEGRADE = 31;
    public static final String SUPPORT_HEIF_ALPHA = "support_heif_alpha";

    /* renamed from: a  reason: collision with root package name */
    public static String f18893a = "picasso.alicdn.com";
    public static long b = 604800;
    private static e c;
    private static Random f = new Random();
    private final SharedPreferences d;
    private List<a> e;

    /* loaded from: classes.dex */
    public interface a {
        void a(e eVar);
    }

    public static /* synthetic */ SharedPreferences a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("5a93e807", new Object[]{eVar}) : eVar.d;
    }

    public static /* synthetic */ String a(e eVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5ecd0743", new Object[]{eVar, str}) : eVar.c(str);
    }

    public static /* synthetic */ List b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c040bbd3", new Object[]{eVar}) : eVar.e;
    }

    public static synchronized e a(Context context) {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("7cd05a81", new Object[]{context});
            }
            if (c == null) {
                c = new e(context);
            }
            return c;
        }
    }

    public e(Context context) {
        this.d = context.getSharedPreferences("cloud_image_setting", 0);
        OrangeConfigLocal.getInstance().registerListener(new String[]{"android_image_function_control"}, new com.taobao.orange.g() { // from class: com.taobao.phenix.compat.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.g
            public void onConfigUpdate(String str, boolean z) {
                Map<String, String> configs;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                    return;
                }
                niw.d("CloudConfig", "orange configs callback with group=%s, from cache=%b", str, Boolean.valueOf(z));
                if (z || !"android_image_function_control".equals(str) || (configs = OrangeConfigLocal.getInstance().getConfigs("android_image_function_control")) == null) {
                    return;
                }
                Set<String> keySet = configs.keySet();
                SharedPreferences.Editor edit = e.a(e.this).edit();
                for (String str2 : keySet) {
                    String str3 = configs.get(str2);
                    edit.putString(e.a(e.this, str2), str3);
                    niw.a("CloudConfig", "update configs from orange, save result=true, key=%s, value=%s", str2, str3);
                }
                edit.apply();
                synchronized (e.this) {
                    if (e.b(e.this) != null) {
                        for (a aVar : e.b(e.this)) {
                            aVar.a(e.this);
                        }
                    }
                }
            }
        });
        OrangeConfigLocal.getInstance().getConfigs("android_image_function_control");
    }

    public synchronized void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2388bb56", new Object[]{this, aVar});
            return;
        }
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(aVar);
    }

    private String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("cloudimg_");
        sb.append(str);
        return sb.toString();
    }

    private String b(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59ed319c", new Object[]{this, new Integer(i), str});
        }
        StringBuilder sb = new StringBuilder(str.length() + 11);
        sb.append("cloudimg_");
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    private void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23892fb5", new Object[]{this, bVar});
            return;
        }
        try {
            String a2 = a(b(bVar.f18895a, "_coverage"));
            String a3 = a(b(bVar.f18895a, "_permanent"));
            String a4 = a(b(bVar.f18895a, "_model_blacklist"));
            String a5 = a(b(bVar.f18895a, "_vendor_blacklist"));
            String a6 = a(b(bVar.f18895a, "_api_blacklist"));
            String a7 = a(b(bVar.f18895a, "_cpu_blacklist"));
            String a8 = a(b(bVar.f18895a, "_model_whitelist"));
            String a9 = a(b(bVar.f18895a, "_vendor_whitelist"));
            niw.a("CloudConfig", "update configs from local cache, fid=%d, coverage=%s, permanent=%s, modelBlacks=%s, vendorBlacks=%s, apiBlacks=%s, cpuBlacks=%s", Integer.valueOf(bVar.f18895a), a2, a3, a4, a5, a6, a7);
            if (!TextUtils.isEmpty(a2)) {
                bVar.b = Math.min(100, Math.max(0, a(a2, bVar.b)));
            }
            if (!TextUtils.isEmpty(a3)) {
                bVar.c = "1".equals(a3);
            }
            if (!TextUtils.isEmpty(a4)) {
                bVar.f = f(a4);
            }
            if (!TextUtils.isEmpty(a5)) {
                bVar.g = f(a5);
            }
            if (!TextUtils.isEmpty(a6)) {
                bVar.i = b(a6, 0);
            }
            if (!TextUtils.isEmpty(a7)) {
                bVar.h = f(a7);
            }
            if (!TextUtils.isEmpty(a8)) {
                bVar.d = f(a8);
            }
            if (TextUtils.isEmpty(a9)) {
                return;
            }
            bVar.e = f(a9);
        } catch (Exception e) {
            niw.d("CloudConfig", "update configs from local cache error=%s", e);
        }
    }

    private boolean b(b bVar) {
        boolean booleanValue;
        Integer e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a61ef7a", new Object[]{this, bVar})).booleanValue();
        }
        a(bVar);
        int i = bVar.f18895a;
        if (bVar.b <= 0 && bVar.f18895a == 29 && bVar.b()) {
            return true;
        }
        if (bVar.b <= 0 || bVar.a()) {
            niw.b("CloudConfig", "feature[%d] disabled, cause all close or should skip, coverage=%d", Integer.valueOf(i), Integer.valueOf(bVar.b));
            return false;
        } else if (bVar.b >= 100) {
            niw.b("CloudConfig", "feature[%d] enabled, cause all open, coverage=%d", Integer.valueOf(i), Integer.valueOf(bVar.b));
            return true;
        } else {
            String b2 = b(i, "_last_enabled");
            String b3 = b(i, "_last_coverage");
            Boolean b4 = b(b2);
            boolean z = !bVar.c || b4 == null || (e = e(b3)) == null || bVar.b != e.intValue();
            if (z) {
                booleanValue = d(bVar.b);
            } else {
                booleanValue = b4.booleanValue();
            }
            if (!bVar.c && b4 != null) {
                niw.a("CloudConfig", "feature[%d] remove all keys, cause permanent YES to NO, result=%b", Integer.valueOf(i), Boolean.valueOf(d(b3) && d(b2)));
            }
            if (bVar.c && z) {
                niw.a("CloudConfig", "feature[%d] save keys[enabled&coverage] at permanent true, cause coverage changed or not been saved, result=%b", Integer.valueOf(i), Boolean.valueOf(a(b3, Integer.valueOf(bVar.b)) && a(b2, Boolean.valueOf(booleanValue))));
            }
            niw.b("CloudConfig", "feature[%d] open result=%B, has random=%b", Integer.valueOf(i), Boolean.valueOf(booleanValue), Boolean.valueOf(z));
            return booleanValue;
        }
    }

    public int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        b bVar = null;
        if (i == 13) {
            bVar = new b(i, 20, false);
        } else if (i == 21) {
            bVar = new b(i, 40, false);
        }
        if (bVar == null) {
            return 0;
        }
        a(bVar);
        int i2 = bVar.b;
        if (bVar.b <= 0 || bVar.a()) {
            niw.b("CloudConfig", "feature[%d] disabled, cause all close or should skip, coverage=%d", Integer.valueOf(i), Integer.valueOf(bVar.b));
            return 0;
        } else if (bVar.b < 100) {
            return i2;
        } else {
            niw.b("CloudConfig", "feature[%d] enabled, cause all open, coverage=%d", Integer.valueOf(i), Integer.valueOf(bVar.b));
            return 100;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        switch (i) {
            case 12:
                return b(new b(i, 100, false));
            case 13:
            case 21:
            case 34:
            case 42:
            case 43:
            case 44:
            case 50:
            default:
                return false;
            case 14:
                return b(new b(i, 100, false));
            case 15:
                return b(new b(i, 0, false));
            case 16:
                return b(new b(i, 100, false));
            case 17:
                return b(new b(i, 0, true));
            case 18:
                return b(new b(i, 100, false));
            case 19:
                return b(new b(i, 100, false));
            case 20:
                return b(new b(i, 100, true));
            case 22:
                return b(new b(i, 100, true));
            case 23:
                return b(new b(i, 0, false));
            case 24:
                return b(new b(i, 0, false));
            case 25:
                return b(new b(i, 0, false));
            case 26:
                b(new b(i, 100, false));
                break;
            case 27:
                break;
            case 28:
                return b(new b(i, 100, false));
            case 29:
                return b(new b(i, 0, false));
            case 30:
                return b(new b(i, 100, false));
            case 31:
                return b(new b(i, 100, false));
            case 32:
                return b(new b(i, 100, false));
            case 33:
                return b(new b(i, 0, false));
            case 35:
                return b(new b(i, 100, false));
            case 36:
                return b(new b(i, 0, false));
            case 37:
                return b(new b(i, 100, false));
            case 38:
                return b(new b(i, 100, false));
            case 39:
                return b(new b(i, 100, false));
            case 40:
                return b(new b(i, 0, false));
            case 41:
                return b(new b(i, 0, false));
            case 45:
                return b(new b(i, 100, true));
            case 46:
                return b(new b(i, 0, false));
            case 47:
                return b(new b(i, 100, true));
            case 48:
                return b(new b(i, 0, false));
            case 49:
                return b(new b(i, 0, false));
            case 51:
                return b(new b(i, 0, true));
            case 52:
                return b(new b(i, 0, true));
            case 53:
                return b(new b(i, 100, true));
            case 54:
                return b(new b(i, 100, true));
            case 55:
                return b(new b(i, 0, true));
            case 56:
                return b(new b(i, 100, true));
        }
        return b(new b(i, 100, false));
    }

    public int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{this, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(a(b(i, CACHE_KEY_ALIVFS_ENABLED)));
        } catch (Throwable unused) {
            return 0;
        }
    }

    public String a(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cd4d069b", new Object[]{this, new Integer(i), str}) : a(b(i, str));
    }

    private boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        SharedPreferences sharedPreferences = this.d;
        if (sharedPreferences == null) {
            return false;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove(str);
        edit.apply();
        return true;
    }

    public boolean a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bb65392", new Object[]{this, str, obj})).booleanValue();
        }
        SharedPreferences sharedPreferences = this.d;
        if (sharedPreferences == null) {
            return false;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (obj instanceof String) {
            edit.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else {
            z = false;
        }
        edit.apply();
        return z;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        SharedPreferences sharedPreferences = this.d;
        if (sharedPreferences != null) {
            return sharedPreferences.getString(str, null);
        }
        return null;
    }

    private Integer e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("1df4aedd", new Object[]{this, str});
        }
        SharedPreferences sharedPreferences = this.d;
        if (sharedPreferences == null) {
            return 0;
        }
        return Integer.valueOf(sharedPreferences.getInt(str, 0));
    }

    public Boolean b(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("cdaba030", new Object[]{this, str});
        }
        SharedPreferences sharedPreferences = this.d;
        if (sharedPreferences == null || !sharedPreferences.getBoolean(str, false)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static boolean d(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad401d7c", new Object[]{new Integer(i)})).booleanValue() : f.nextInt(100) + 1 <= i;
    }

    private int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    private int[] b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("278242f4", new Object[]{this, str, new Integer(i)});
        }
        String[] split = str.split(",");
        int[] iArr = new int[split.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = a(split[i2], i);
        }
        return iArr;
    }

    private String[] f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("6c230e86", new Object[]{this, str}) : str.split(",");
    }

    /* loaded from: classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f18895a;
        public int b;
        public boolean c;
        public String[] d;
        public String[] e;
        public String[] f;
        public String[] g;
        public String[] h;
        public int[] i;

        public b(int i, int i2, boolean z) {
            this.f18895a = i;
            this.b = i2;
            this.c = z;
        }

        public boolean a(String[] strArr, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a325b9c5", new Object[]{this, strArr, str})).booleanValue();
            }
            if (str != null && strArr != null && (r0 = strArr.length) > 0) {
                for (String str2 : strArr) {
                    if (str.equals(str2)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean a(int[] iArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("27172051", new Object[]{this, iArr, new Integer(i)})).booleanValue();
            }
            if (iArr != null && (r0 = iArr.length) > 0) {
                for (int i2 : iArr) {
                    if (i == i2) {
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : a(this.i, Build.VERSION.SDK_INT) || a(this.f, Build.MODEL) || a(this.g, Build.MANUFACTURER) || a(this.h, Build.CPU_ABI);
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : a(this.d, Build.MODEL) || a(this.e, Build.MANUFACTURER);
        }
    }
}
