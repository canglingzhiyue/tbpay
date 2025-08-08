package tb;

import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.festival.skin.SkinConfig;
import com.taobao.android.festival.skin.c;
import com.taobao.android.festival.utils.TrackUtils;
import com.taobao.android.festival.utils.d;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.e;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes.dex */
public class gje {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SkinStorage";

    /* renamed from: a  reason: collision with root package name */
    private static volatile gje f28344a;
    private Map<String, Map<String, String>> b;
    private SkinConfig c;
    private final Map<String, SkinConfig> d = new ConcurrentHashMap();

    /* renamed from: tb.gje$6  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass6 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ gje b;
        public final /* synthetic */ SkinConfig c;

        public AnonymousClass6(gje gjeVar, SkinConfig skinConfig) {
            this.b = gjeVar;
            this.c = skinConfig;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                com.taobao.android.festival.skin.b.a().a("{}", new kqz() { // from class: tb.gje.6.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.kqz, tb.gjg
                    public void a(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                            return;
                        }
                        TLog.loge("festival", "", "cleared");
                        Coordinator.execute(new Runnable() { // from class: tb.gje.6.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                AnonymousClass6.this.b.b(AnonymousClass6.this.c);
                                Map<String, Map<String, String>> a2 = AnonymousClass6.this.b.a(AnonymousClass6.this.c);
                                gje.a(gje.this, AnonymousClass6.this.c);
                                List<String> a3 = d.a(a2);
                                if (a3.isEmpty()) {
                                    com.taobao.android.festival.skin.b.a().d();
                                } else {
                                    new gjd().a(a3, new c(AnonymousClass6.this.c, a2));
                                }
                                TLog.loge("festival", "", "endUpdate");
                            }
                        });
                    }
                });
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b();

        void c();
    }

    static {
        kge.a(43032256);
    }

    public static /* synthetic */ SkinConfig a(gje gjeVar, SkinConfig skinConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkinConfig) ipChange.ipc$dispatch("ec069e62", new Object[]{gjeVar, skinConfig});
        }
        gjeVar.c = skinConfig;
        return skinConfig;
    }

    public static /* synthetic */ Map a(gje gjeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("37a9176b", new Object[]{gjeVar}) : gjeVar.d;
    }

    public static /* synthetic */ Map b(gje gjeVar, SkinConfig skinConfig) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a8c11b72", new Object[]{gjeVar, skinConfig}) : gjeVar.e(skinConfig);
    }

    public static /* synthetic */ Map b(gje gjeVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("55cf3e23", new Object[]{gjeVar, map});
        }
        gjeVar.b = map;
        return map;
    }

    public static /* synthetic */ Map c(gje gjeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("aa4b38ed", new Object[]{gjeVar}) : gjeVar.b;
    }

    public static gje a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gje) ipChange.ipc$dispatch("f05117c", new Object[0]);
        }
        if (f28344a == null) {
            synchronized (gje.class) {
                f28344a = new gje();
            }
        }
        return f28344a;
    }

    public void a(b bVar) {
        Map<String, Map<String, String>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f212b8", new Object[]{this, bVar});
            return;
        }
        SkinConfig skinConfig = this.c;
        if (skinConfig == null || !skinConfig.isValidConfig() || (map = this.b) == null || map.isEmpty()) {
            new a(bVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else if (bVar == null) {
        } else {
            bVar.a();
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : !this.d.isEmpty();
    }

    public Map<String, Map<String, String>> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.b;
    }

    public SkinConfig d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SkinConfig) ipChange.ipc$dispatch("107a00ef", new Object[]{this}) : this.c;
    }

    public SkinConfig a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SkinConfig) ipChange.ipc$dispatch("5ade0bb6", new Object[]{this, str}) : this.d.get(str);
    }

    public void a(Map<String, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.b = map;
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        Map<String, Map<String, String>> map = this.b;
        return map != null && map.size() > 0;
    }

    private Map<String, Map<String, String>> e(SkinConfig skinConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("da002e1d", new Object[]{this, skinConfig});
        }
        if (!skinConfig.isValidConfig()) {
            return null;
        }
        try {
            byte[] d = gjb.d(skinConfig.skinCode);
            if (d != null && d.length > 0) {
                return (Map) JSON.parseObject(new String(d), new TypeReference<Map<String, Map<String, String>>>() { // from class: tb.gje.1
                }, new Feature[0]);
            }
            return null;
        } catch (Exception e) {
            TrackUtils.a.a(TrackUtils.ErrorType.READ_CACHE_ERROR, e.getMessage());
            return null;
        }
    }

    public Map<String, Map<String, String>> a(SkinConfig skinConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e07c1ea1", new Object[]{this, skinConfig});
        }
        try {
            byte[] a2 = gjc.a(skinConfig.skinUrl);
            if (a2 == null || a2.length <= 0) {
                return null;
            }
            gjb.f(skinConfig.skinCode);
            gjb.a(skinConfig.skinCode, a2);
            skinConfig.updateTime = System.currentTimeMillis();
            gjb.a(gjb.SP_KEY_CURRENT_SKIN_CODE, skinConfig.skinCode);
            this.d.put(skinConfig.skinCode, skinConfig);
            gjb.a(gjb.SP_KEY_CACHED_SKIN_MAP, JSON.toJSONString(this.d));
            return (Map) JSON.parseObject(new String(a2), new TypeReference<Map<String, Map<String, String>>>() { // from class: tb.gje.2
            }, new Feature[0]);
        } catch (IOException e) {
            Log.e(TAG, "reloadSkinData error", e);
            return null;
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        SkinConfig skinConfig = this.c;
        if (skinConfig == null) {
            return;
        }
        b(skinConfig);
        skinConfig.skinCode = null;
        skinConfig.skinUrl = null;
        gjb.a(gjb.SP_KEY_CURRENT_SKIN_CODE, "");
        gjb.a(gjb.SP_KEY_DEFAULT_CUSTOMER_AREA_SKIN, "false");
    }

    public void b(SkinConfig skinConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518a9f8b", new Object[]{this, skinConfig});
        } else if (skinConfig == null || !skinConfig.isValidConfig()) {
        } else {
            try {
                gjb.f(skinConfig.skinUrl);
                gjb.f(skinConfig.skinCode);
                if (!StringUtils.isEmpty(skinConfig.skinZipUrl)) {
                    gjb.e(skinConfig.skinCode);
                }
            } catch (Throwable th) {
                TrackUtils.a.a(TrackUtils.ErrorType.CLEAR_CACHE_ERROR, th.getMessage());
            }
            Map<String, SkinConfig> map = this.d;
            if (map == null || map.isEmpty()) {
                return;
            }
            this.d.remove(skinConfig.skinCode);
            gjb.a(gjb.SP_KEY_CACHED_SKIN_MAP, JSON.toJSONString(this.d));
        }
    }

    public gja<Void> c(SkinConfig skinConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gja) ipChange.ipc$dispatch("ba74a97e", new Object[]{this, skinConfig});
        }
        gja<Void> gjaVar = new gja<>();
        if (!b()) {
            gjaVar.a(false);
            gjaVar.f28337a = "NoDownloadedSkin";
            return gjaVar;
        }
        this.c = a(skinConfig.skinCode);
        SkinConfig skinConfig2 = this.c;
        if (skinConfig2 != null) {
            gjb.a(gjb.SP_KEY_CURRENT_SKIN_CODE, skinConfig2.skinCode);
            this.c.updateTime = System.currentTimeMillis();
            gjb.a(gjb.SP_KEY_CACHED_SKIN_MAP, JSON.toJSONString(this.d));
            this.b = e(this.c);
            if (this.b != null) {
                gjaVar.a(true);
            } else {
                gjaVar.a(false);
                gjaVar.f28337a = "NoSkinConfigFile";
                b(this.c);
            }
        } else {
            gjaVar.a(false);
            gjaVar.f28337a = "NoDownloadedSkin";
        }
        return gjaVar;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        FestivalMgr.a().a(false);
        e.f();
        this.c = null;
        this.b = null;
        gjb.a(gjb.SP_KEY_CURRENT_SKIN_CODE, "");
        gjb.a(gjb.SP_KEY_DEFAULT_CUSTOMER_AREA_SKIN, "false");
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        int a2 = com.taobao.android.festival.d.a(5);
        if (this.d.size() < a2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.d.values());
        Collections.sort(arrayList, new Comparator<SkinConfig>() { // from class: tb.gje.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(SkinConfig skinConfig, SkinConfig skinConfig2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, skinConfig, skinConfig2})).intValue() : a(skinConfig, skinConfig2);
            }

            public int a(SkinConfig skinConfig, SkinConfig skinConfig2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("30cbc2db", new Object[]{this, skinConfig, skinConfig2})).intValue();
                }
                if (skinConfig == null && skinConfig2 == null) {
                    return 0;
                }
                if (skinConfig == null) {
                    return 1;
                }
                if (skinConfig2 != null) {
                    return Long.compare(skinConfig2.updateTime, skinConfig.updateTime);
                }
                return -1;
            }
        });
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() >= a2; size--) {
            SkinConfig skinConfig = (SkinConfig) arrayList.get(size);
            if (this.c != skinConfig) {
                if (skinConfig != null) {
                    b(skinConfig);
                    this.d.remove(skinConfig.skinCode);
                }
                arrayList.remove(size);
            }
        }
    }

    public gja<Void> a(SkinConfig skinConfig, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gja) ipChange.ipc$dispatch("31348fd5", new Object[]{this, skinConfig, bArr});
        }
        try {
            gjb.a(skinConfig.skinCode, bArr);
            skinConfig.updateTime = System.currentTimeMillis();
            this.d.put(skinConfig.skinCode, skinConfig);
            gjb.a(gjb.SP_KEY_CACHED_SKIN_MAP, JSON.toJSONString(this.d));
            gja<Void> gjaVar = new gja<>();
            gjaVar.a(true);
            return gjaVar;
        } catch (Throwable th) {
            Log.e("", "", th);
            TrackUtils.a.a(TrackUtils.ErrorType.WRITE_CACHE_ERROR, th.getMessage());
            gja<Void> gjaVar2 = new gja<>();
            gjaVar2.a(false);
            gjaVar2.f28337a = "updateFile file error.";
            gjaVar2.b = "IO_ERROR";
            return gjaVar2;
        }
    }

    public boolean d(SkinConfig skinConfig) {
        SkinConfig skinConfig2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34ddebcd", new Object[]{this, skinConfig})).booleanValue();
        }
        if (this.d.isEmpty() || (skinConfig2 = this.d.get(skinConfig.skinCode)) == null) {
            return false;
        }
        if (skinConfig2.equals(skinConfig)) {
            return true;
        }
        b(skinConfig2);
        return false;
    }

    public Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d2e5f268", new Object[]{this, str});
        }
        Map<String, Map<String, String>> map = this.b;
        if (map != null && !map.isEmpty()) {
            return this.b.get(str);
        }
        return null;
    }

    public String a(String str, String str2) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        Map<String, Map<String, String>> map2 = this.b;
        if (map2 == null || map2.isEmpty() || (map = this.b.get(str)) == null || map.isEmpty()) {
            return null;
        }
        String str3 = "module name: " + str + ", key : " + str2 + ", value: " + map.get(str2);
        return map.get(str2);
    }

    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
        }
        SkinConfig skinConfig = this.c;
        if (skinConfig != null && !StringUtils.isEmpty(skinConfig.skinCode) && !StringUtils.isEmpty(this.c.skinZipUrl)) {
            String str3 = gjb.b(this.c.skinCode) + str + File.separator + str2 + ".png";
            if (new File(str3).exists()) {
                return com.taobao.phenix.request.d.a(str3);
            }
        }
        return null;
    }

    @Deprecated
    public String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cef1bce2", new Object[]{this, str, str2});
        }
        SkinConfig skinConfig = this.c;
        if (skinConfig == null) {
            return "";
        }
        String b2 = gjb.b(skinConfig.skinCode);
        return b2 + "anim" + File.separator + str2 + File.separator;
    }

    public String d(String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5bded401", new Object[]{this, str, str2});
        }
        SkinConfig skinConfig = this.c;
        if (skinConfig != null && !StringUtils.isEmpty(skinConfig.skinCode) && !StringUtils.isEmpty(this.c.skinZipUrl)) {
            String b2 = gjb.b(this.c.skinCode);
            File file = new File(b2 + str);
            if (file.exists()) {
                File[] listFiles = file.listFiles(new FileFilter() { // from class: tb.gje.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.io.FileFilter
                    public boolean accept(File file2) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("50e018ca", new Object[]{this, file2})).booleanValue() : file2 != null && file2.getName().startsWith(str2);
                    }
                });
                if (listFiles.length > 0) {
                    return listFiles[0].getAbsolutePath();
                }
            }
        }
        return null;
    }

    /* loaded from: classes.dex */
    public class a extends AsyncTask<Void, Void, Map<String, Map<String, String>>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final b b;

        static {
            kge.a(1473249337);
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Map<String, Map<String, String>> doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(Map<String, Map<String, String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, map});
            } else {
                a(map);
            }
        }

        public a(b bVar) {
            this.b = bVar;
        }

        public Map<String, Map<String, String>> a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("d61a4289", new Object[]{this, voidArr});
            }
            String g = gjb.g(gjb.SP_KEY_CACHED_SKIN_MAP);
            if (StringUtils.isEmpty(g)) {
                return null;
            }
            gje.a(gje.this).putAll((Map) JSON.parseObject(g, new TypeReference<Map<String, SkinConfig>>() { // from class: tb.gje.a.1
            }, new Feature[0]));
            String g2 = gjb.g(gjb.SP_KEY_CURRENT_SKIN_CODE);
            String[] c = com.taobao.android.festival.d.c();
            if (c != null && Arrays.asList(c).contains(g2)) {
                gjb.a(gjb.SP_KEY_CURRENT_SKIN_CODE, "");
                gjb.a(gjb.SP_KEY_DEFAULT_CUSTOMER_AREA_SKIN, "false");
                return null;
            }
            if (!StringUtils.isEmpty(g2) && !gje.a(gje.this).isEmpty()) {
                SkinConfig skinConfig = (SkinConfig) gje.a(gje.this).get(g2);
                gje.a(gje.this, skinConfig);
                if (skinConfig != null && skinConfig.isValidConfig()) {
                    gje gjeVar = gje.this;
                    gje.b(gjeVar, gje.b(gjeVar, skinConfig));
                    if (gje.c(gje.this) == null) {
                        gje gjeVar2 = gje.this;
                        gje.b(gjeVar2, gjeVar2.a(skinConfig));
                    }
                    if (!StringUtils.isEmpty(skinConfig.skinZipUrl)) {
                        new gjd().a(skinConfig.skinCode, skinConfig.skinZipUrl, null);
                    }
                    return gje.c(gje.this);
                }
            }
            return null;
        }

        public void a(Map<String, Map<String, String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                return;
            }
            b bVar = this.b;
            if (bVar == null) {
                return;
            }
            if (map != null) {
                bVar.b();
            } else {
                bVar.c();
            }
        }
    }

    public void i() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        try {
            gje a2 = a();
            SkinConfig d = a2.d();
            if (d == null) {
                return;
            }
            TLog.loge("festival", "", "apiStart");
            MtopResponse a3 = gjc.a(d);
            if (a3.isApiSuccess() && a3.getBytedata() != null) {
                JSONObject parseObject = JSON.parseObject(new String(a3.getBytedata()));
                if (parseObject != null && !parseObject.isEmpty() && (jSONObject = parseObject.getJSONObject("data")) != null && !jSONObject.isEmpty()) {
                    if (!jSONObject.getBoolean("valid").booleanValue()) {
                        d.a(new Runnable() { // from class: tb.gje.5
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    com.taobao.android.festival.skin.b.a().a("{}", new kqz());
                                }
                            }
                        });
                        return;
                    }
                    Integer integer = jSONObject.getInteger("version");
                    if (integer.intValue() <= d.version) {
                        return;
                    }
                    d.version = integer.intValue();
                    d.skinUrl = jSONObject.getString("skinDownloadUrl");
                    d.skinZipUrl = jSONObject.getString("zipDownloadUrl");
                    TLog.loge("festival", "", "startUpdate");
                    d.a(new AnonymousClass6(a2, d));
                    return;
                }
                return;
            }
            TLog.loge("festival", "", "apiFail" + a3.getResponseLog());
        } catch (Throwable unused) {
        }
    }
}
