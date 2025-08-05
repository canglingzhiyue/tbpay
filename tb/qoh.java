package tb;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.intf.event.a;
import com.taobao.phenix.intf.event.d;
import com.taobao.taolive.room.utils.ag;
import com.taobao.tbhudong.TBHuDongServiceImp;
import com.taobao.tbreachflow.shortcuts.bean.ContentVO;
import com.taobao.tbreachflow.shortcuts.bean.ItemVO;
import com.taobao.tbreachflow.shortcuts.config.ShortcutConfig;
import com.taobao.tbreachflow.shortcuts.config.ShortcutControlConfig;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.qoh;

/* loaded from: classes9.dex */
public class qoh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static volatile qoh f32979a;
    private static final AtomicBoolean e = new AtomicBoolean(false);
    private final Context b;
    private final Set<String> c = new HashSet();
    private final Map<String, ShortcutInfo> d = new ConcurrentHashMap();
    private boolean f = false;

    /* renamed from: lambda$-Qw8sHTWzw0wX3reII5clnDq4BE */
    public static /* synthetic */ void m2491lambda$Qw8sHTWzw0wX3reII5clnDq4BE(qoh qohVar) {
        qohVar.d();
    }

    /* renamed from: lambda$C2nTbVhLF0-D5MLC1x1KW6LGxRw */
    public static /* synthetic */ boolean m2492lambda$C2nTbVhLF0D5MLC1x1KW6LGxRw(qoh qohVar, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, ShortcutControlConfig shortcutControlConfig, ShortcutManager shortcutManager, Map map, SuccPhenixEvent succPhenixEvent) {
        return qohVar.a(str, str2, jSONObject, jSONObject2, shortcutControlConfig, shortcutManager, map, succPhenixEvent);
    }

    public static /* synthetic */ boolean lambda$NqjCmQOsv1MBrW3K_9f_YGFHFrE(qoh qohVar, String str, Map map, String str2, FailPhenixEvent failPhenixEvent) {
        return qohVar.b(str, map, str2, failPhenixEvent);
    }

    /* renamed from: lambda$QHHMDo-E3GD7VGXKUCOIvM_aAak */
    public static /* synthetic */ boolean m2493lambda$QHHMDoE3GD7VGXKUCOIvM_aAak(qoh qohVar, String str, Map map, String str2, FailPhenixEvent failPhenixEvent) {
        return qohVar.a(str, map, str2, failPhenixEvent);
    }

    public static /* synthetic */ boolean lambda$VM5TquDXHhTX7nwDvj2bcEV2TvI(qoh qohVar, String str, String str2, ItemVO itemVO, ShortcutManager shortcutManager, Map map, SuccPhenixEvent succPhenixEvent) {
        return qohVar.a(str, str2, itemVO, shortcutManager, map, succPhenixEvent);
    }

    public static /* synthetic */ Context a(qoh qohVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("60c01986", new Object[]{qohVar}) : qohVar.b;
    }

    public static /* synthetic */ void a(qoh qohVar, ShortcutManager shortcutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3188b392", new Object[]{qohVar, shortcutManager});
        } else {
            qohVar.b(shortcutManager);
        }
    }

    public static /* synthetic */ void a(qoh qohVar, String str, JSONObject jSONObject, JSONObject jSONObject2, ShortcutControlConfig shortcutControlConfig, Bitmap bitmap, ShortcutManager shortcutManager, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bcf537f", new Object[]{qohVar, str, jSONObject, jSONObject2, shortcutControlConfig, bitmap, shortcutManager, map});
        } else {
            qohVar.a(str, jSONObject, jSONObject2, shortcutControlConfig, bitmap, shortcutManager, map);
        }
    }

    public static /* synthetic */ void a(qoh qohVar, String str, ItemVO itemVO, Bitmap bitmap, ShortcutManager shortcutManager, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eccc5c0", new Object[]{qohVar, str, itemVO, bitmap, shortcutManager, map});
        } else {
            qohVar.a(str, itemVO, bitmap, shortcutManager, map);
        }
    }

    public static /* synthetic */ void a(qoh qohVar, String str, ItemVO itemVO, ShortcutControlConfig shortcutControlConfig, ShortcutManager shortcutManager, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d75932a", new Object[]{qohVar, str, itemVO, shortcutControlConfig, shortcutManager, map});
        } else {
            qohVar.a(str, itemVO, shortcutControlConfig, shortcutManager, map);
        }
    }

    public static /* synthetic */ Map b(qoh qohVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("cf561704", new Object[]{qohVar}) : qohVar.d;
    }

    public static /* synthetic */ AtomicBoolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("bf6c05e9", new Object[0]) : e;
    }

    public static /* synthetic */ Set c(qoh qohVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("8a9f17f", new Object[]{qohVar}) : qohVar.c;
    }

    public static /* synthetic */ void d(qoh qohVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c73e1811", new Object[]{qohVar});
        } else {
            qohVar.c();
        }
    }

    public static qoh a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qoh) ipChange.ipc$dispatch("34c8515c", new Object[]{context});
        }
        if (f32979a == null) {
            synchronized (qoh.class) {
                if (f32979a == null) {
                    f32979a = new qoh(context);
                }
            }
        }
        return f32979a;
    }

    private qoh(Context context) {
        if (context.getApplicationContext() != null) {
            this.b = context.getApplicationContext();
        } else {
            this.b = context;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.f = true;
        c();
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            b.a(new b.a() { // from class: tb.qoh.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    qoh.this = this;
                }

                @Override // com.alibaba.ability.localization.b.a
                public void a(Language language, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("246661b", new Object[]{this, language, str});
                        return;
                    }
                    qif.a("Localization.onChange language: " + language, new Object[0]);
                    khw.a(qoh.a(qoh.this)).a("shortcut_update_time", (Object) 0);
                }
            });
            if (e.get()) {
                qif.a("updatesShortcuts.mIsUpdating=true.return.", new Object[0]);
                return;
            }
            e.set(true);
            ShortcutManager shortcutManager = null;
            if (Build.VERSION.SDK_INT >= 25 && this.b != null) {
                shortcutManager = (ShortcutManager) this.b.getSystemService(ShortcutManager.class);
            }
            qif.a("updatesShortcuts.shortcutManager=" + shortcutManager, new Object[0]);
            if (shortcutManager == null) {
                c();
                return;
            }
            HashMap hashMap = new HashMap(4);
            hashMap.put("maxCount", String.valueOf(shortcutManager.getMaxShortcutCountPerActivity()));
            List<ShortcutInfo> pinnedShortcuts = shortcutManager.getPinnedShortcuts();
            hashMap.put("pinnedCount", String.valueOf(pinnedShortcuts.size()));
            ArrayList arrayList = new ArrayList();
            for (ShortcutInfo shortcutInfo : pinnedShortcuts) {
                if (shortcutInfo != null) {
                    arrayList.add(shortcutInfo.getId());
                }
            }
            hashMap.put("pinnedIdList", arrayList.toString());
            if (!qod.a().d()) {
                a(shortcutManager);
                hashMap.put("orangeEnable", "false");
                this.c.clear();
                a(hashMap);
                return;
            }
            hashMap.put("orangeEnable", "true");
            boolean f = qod.a().f();
            qif.a("updatesShortcuts.shortcutsNetEnable=" + f, new Object[0]);
            qij.a("ShortcutsManager", "updatesShortcuts", "shortcutsNetEnable=" + f);
            if (f) {
                long longValue = ((Long) khw.a(this.b).b("shortcut_update_time", 0L)).longValue();
                if (!this.f && longValue >= System.currentTimeMillis() / 1000) {
                    return;
                }
                qif.a("shortcuts update: updateTime =", Long.valueOf(longValue));
                b(shortcutManager, hashMap);
                qij.a("ShortcutsManager", "networkShortcut", "");
                return;
            }
            a(shortcutManager, hashMap);
            qij.a("ShortcutsManager", "orangeShortcut", "");
        } catch (Throwable th) {
            c();
            qif.a("ShortcutsManager.updatesShortcuts.error.", th);
        }
    }

    private void a(ShortcutManager shortcutManager, Map<String, String> map) {
        Variation variation;
        Variation variation2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a95ff99", new Object[]{this, shortcutManager, map});
            return;
        }
        String e2 = qod.a().e();
        Map<String, ShortcutControlConfig> c = qod.a().c();
        Map<String, ShortcutConfig> b = qod.a().b();
        qif.a("updatesShortcuts.shortcutControlConfigMap=" + JSON.toJSONString(c), new Object[0]);
        qif.a("updatesShortcuts.shortcuts=" + JSON.toJSONString(b), new Object[0]);
        boolean isEmpty = TextUtils.isEmpty(e2) ^ true;
        Map map2 = null;
        if (isEmpty) {
            VariationSet activate = UTABTest.activate("ReachFlow", e2);
            if (activate != null) {
                variation = activate.getVariation("enable");
                variation2 = activate.getVariation("configControlLists");
            } else {
                variation = null;
                variation2 = null;
            }
            map.put("abControlBucketId", String.valueOf(activate.getExperimentBucketId()));
            if (variation != null && !variation.getValueAsBoolean(true)) {
                qif.a("clearShortcuts.abControlConfigMap.enableVar=false", new Object[0]);
                a(shortcutManager);
                map.put("abEnable", "false");
                this.c.clear();
                a(map);
                return;
            }
            map.put("abControlEnable", "true");
            if (variation2 != null) {
                String valueAsString = variation2.getValueAsString("");
                if (!TextUtils.isEmpty(valueAsString)) {
                    map2 = (Map) JSON.parseObject(valueAsString, new TypeReference<Map<String, ShortcutControlConfig>>() { // from class: tb.qoh.2
                        {
                            qoh.this = this;
                        }
                    }, new Feature[0]);
                }
            }
        }
        Map map3 = map2;
        Set<String> keySet = c.keySet();
        boolean containsAll = (!isEmpty || map3 == null || map3.isEmpty()) ? false : map3.keySet().containsAll(keySet);
        map.put("useABControl", String.valueOf(containsAll));
        qif.a("updatesShortcuts.useShortcutABEnable=%s.useABControlConfig=%s.", Boolean.valueOf(isEmpty), Boolean.valueOf(containsAll));
        this.d.clear();
        this.c.clear();
        this.c.addAll(keySet);
        b(shortcutManager);
        for (String str : keySet) {
            qif.a("updatesShortcuts.shortcutId=" + str, new Object[0]);
            ShortcutConfig shortcutConfig = b.get(str);
            qif.a("updatesShortcuts.shortcutConfig=" + JSON.toJSONString(shortcutConfig), new Object[0]);
            a(str, shortcutConfig, (ShortcutControlConfig) (containsAll ? map3.get(str) : c.get(str)), shortcutManager, map);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tb.-$$Lambda$qoh$-Qw8sHTWzw0wX3reII5clnDq4BE
            @Override // java.lang.Runnable
            public final void run() {
                qoh.m2491lambda$Qw8sHTWzw0wX3reII5clnDq4BE(qoh.this);
            }
        }, 60000L);
    }

    public /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!e.get()) {
        } else {
            this.c.clear();
            c();
        }
    }

    private void a(final String str, ShortcutConfig shortcutConfig, final ShortcutControlConfig shortcutControlConfig, final ShortcutManager shortcutManager, final Map<String, String> map) {
        VariationSet activate;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c118fa", new Object[]{this, str, shortcutConfig, shortcutControlConfig, shortcutManager, map});
            return;
        }
        try {
            if (shortcutConfig == null) {
                qif.a("startAddShortcut.shortcutId=%s.shortcutConfig=null.return.", str);
            } else if (shortcutControlConfig != null && !shortcutControlConfig.isValid()) {
                qif.a("startAddShortcut.shortcutId=%s.controlConfig.isInValid.disableShortcut.", str);
                a(shortcutManager, str);
                map.put(str, shortcutControlConfig.isEnable() ? "disable.abConfig.inValid." : "disable.abConfig.notEnable.");
                this.c.remove(str);
                a(map);
            } else if (!shortcutConfig.isValid()) {
                qif.a("startAddShortcut.shortcutId=%s.shortcutConfig.isInValid.disableShortcut.", str);
                a(shortcutManager, str);
                map.put(str, "disable.inValid.");
                this.c.remove(str);
                a(map);
            } else {
                JSONObject jSONObject = null;
                long j = 0;
                if (!TextUtils.isEmpty(shortcutConfig.getAbTestModule()) && (activate = UTABTest.activate("ReachFlow", shortcutConfig.getAbTestModule())) != null) {
                    Variation variation = activate.getVariation("config");
                    if (variation != null) {
                        String valueAsString = variation.getValueAsString("");
                        if (!TextUtils.isEmpty(valueAsString)) {
                            jSONObject = JSON.parseObject(valueAsString);
                        }
                    }
                    j = activate.getExperimentBucketId();
                }
                final JSONObject jSONObject2 = jSONObject;
                map.put(String.format("%s-ABBucketId", str), String.valueOf(j));
                String format = String.format("%s-useABConfig", str);
                if (jSONObject2 == null) {
                    z = false;
                }
                map.put(format, String.valueOf(z));
                final JSONObject parseObject = JSON.parseObject(JSON.toJSONString(shortcutConfig));
                final String str2 = (String) a(parseObject, jSONObject2, "iconUrl", String.class);
                qif.a("getIconFromConfig.url=" + str2, new Object[0]);
                com.taobao.phenix.intf.b.h().a(str2).succListener(new a() { // from class: tb.-$$Lambda$qoh$C2nTbVhLF0-D5MLC1x1KW6LGxRw
                    @Override // com.taobao.phenix.intf.event.a
                    public final boolean onHappen(d dVar) {
                        return qoh.m2492lambda$C2nTbVhLF0D5MLC1x1KW6LGxRw(qoh.this, str2, str, parseObject, jSONObject2, shortcutControlConfig, shortcutManager, map, (SuccPhenixEvent) dVar);
                    }
                }).failListener(new a() { // from class: tb.-$$Lambda$qoh$NqjCmQOsv1MBrW3K_9f_YGFHFrE
                    @Override // com.taobao.phenix.intf.event.a
                    public final boolean onHappen(d dVar) {
                        return qoh.lambda$NqjCmQOsv1MBrW3K_9f_YGFHFrE(qoh.this, str, map, str2, (FailPhenixEvent) dVar);
                    }
                }).fetch();
            }
        } catch (Throwable th) {
            this.c.remove(str);
            map.put(str, "catchError.fail.");
            a(map);
            qif.a("startAddShortcut.error.", th);
        }
    }

    public /* synthetic */ boolean a(String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2, final ShortcutControlConfig shortcutControlConfig, final ShortcutManager shortcutManager, final Map map, final SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea887605", new Object[]{this, str, str2, jSONObject, jSONObject2, shortcutControlConfig, shortcutManager, map, succPhenixEvent})).booleanValue();
        }
        if (succPhenixEvent != null && succPhenixEvent.getDrawable() != null) {
            qif.a("getIconFromConfig.succListener.url=" + str, new Object[0]);
            qig.b().execute(new Runnable() { // from class: tb.qoh.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    qoh.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        qoh.a(qoh.this, str2, jSONObject, jSONObject2, shortcutControlConfig, succPhenixEvent.getDrawable().getBitmap(), shortcutManager, map);
                    }
                }
            });
        } else {
            this.c.remove(str2);
            map.put(str2, "imageLoadError.drawableIsNull.");
            a(map);
            qif.a("Phenix.getIconFromConfig.succListener.getDrawable=null.imageUrl=" + str);
        }
        return false;
    }

    public /* synthetic */ boolean b(String str, Map map, String str2, FailPhenixEvent failPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef4e02e4", new Object[]{this, str, map, str2, failPhenixEvent})).booleanValue();
        }
        this.c.remove(str);
        Object[] objArr = new Object[1];
        objArr[0] = failPhenixEvent != null ? Integer.valueOf(failPhenixEvent.getResultCode()) : "";
        map.put(str, String.format("imageLoadError.fail.resultCode=%s", objArr));
        a(map);
        qif.a("Phenix.getIconFromConfig.failListener.imageUrl=" + str2);
        return false;
    }

    private void a(String str, JSONObject jSONObject, JSONObject jSONObject2, ShortcutControlConfig shortcutControlConfig, Bitmap bitmap, ShortcutManager shortcutManager, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abf2e065", new Object[]{this, str, jSONObject, jSONObject2, shortcutControlConfig, bitmap, shortcutManager, map});
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setFlags(268468224);
            intent.setData(Uri.parse((String) a(jSONObject, jSONObject2, "targetUrl", String.class)));
            int index = shortcutControlConfig.getIndex();
            String str2 = (String) a(jSONObject, jSONObject2, "shortTitle", String.class);
            String str3 = (String) a(jSONObject, jSONObject2, "longTitle", String.class);
            qif.a("addShortcut.shortcutId=%s.index=%s.longTitle=%s.shortTitle=%s.", str, Integer.valueOf(index), str3, str2);
            a(shortcutManager, str, new ShortcutInfo.Builder(TBHuDongServiceImp.getApplication(), str).setRank(index).setShortLabel(str2).setLongLabel(str3).setIcon(Icon.createWithBitmap(bitmap)).setIntent(intent).setDisabledMessage((String) a(jSONObject, jSONObject2, "disableToast", String.class)).build(), map);
        } catch (Throwable th) {
            qif.a("addShortcut.error.", th);
        }
    }

    private synchronized void a(ShortcutManager shortcutManager, String str, ShortcutInfo shortcutInfo, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d78d7eaa", new Object[]{this, shortcutManager, str, shortcutInfo, map});
        } else if (!e.get()) {
            qif.a("tryAddShortcut.mIsUpdating=false.return.", new Object[0]);
        } else {
            this.c.remove(str);
            this.d.put(str, shortcutInfo);
            qif.a("tryAddShortcut.add.id=%s.", str);
            if (!this.c.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (String str2 : this.d.keySet()) {
                arrayList.add(this.d.get(str2));
            }
            boolean dynamicShortcuts = shortcutManager.setDynamicShortcuts(arrayList);
            for (String str3 : this.d.keySet()) {
                map.put(str3, dynamicShortcuts ? "updatedSuccess" : "isRateLimited");
            }
            this.c.clear();
            c();
            a(map);
        }
    }

    private void a(ShortcutManager shortcutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ec2b66c", new Object[]{this, shortcutManager});
            return;
        }
        try {
            shortcutManager.removeAllDynamicShortcuts();
            List<ShortcutInfo> pinnedShortcuts = shortcutManager.getPinnedShortcuts();
            ArrayList arrayList = new ArrayList();
            if (pinnedShortcuts.isEmpty()) {
                return;
            }
            for (ShortcutInfo shortcutInfo : pinnedShortcuts) {
                if (shortcutInfo != null) {
                    arrayList.add(shortcutInfo.getId());
                }
            }
            shortcutManager.disableShortcuts(arrayList);
        } catch (Throwable th) {
            qif.a("clearShortcuts.error.", th);
        }
    }

    private void a(ShortcutManager shortcutManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a679d36", new Object[]{this, shortcutManager, str});
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            shortcutManager.disableShortcuts(arrayList);
            shortcutManager.removeDynamicShortcuts(arrayList);
        } catch (Throwable th) {
            qif.a("disableShortcut.error.", th);
        }
    }

    private void b(ShortcutManager shortcutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb62e16d", new Object[]{this, shortcutManager});
            return;
        }
        try {
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            ArrayList arrayList = new ArrayList();
            for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                if (shortcutInfo != null && !this.c.contains(shortcutInfo.getId())) {
                    arrayList.add(shortcutInfo.getId());
                }
            }
            shortcutManager.disableShortcuts(arrayList);
            shortcutManager.removeDynamicShortcuts(arrayList);
        } catch (Throwable th) {
            qif.a("disableOtherDynamicShortcuts.error.", th);
        }
    }

    private <T> T a(JSONObject jSONObject, JSONObject jSONObject2, String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("41faa547", new Object[]{this, jSONObject, jSONObject2, str, cls});
        }
        if (jSONObject2 != null) {
            try {
                if (jSONObject2.containsKey(str)) {
                    return (T) jSONObject2.getObject(str, cls);
                }
            } catch (Throwable th) {
                qif.a("getConfigValue.error.key=" + str, th);
                return null;
            }
        }
        if (jSONObject != null && jSONObject.containsKey(str)) {
            return (T) jSONObject.getObject(str, cls);
        }
        return null;
    }

    private void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        try {
            if (this.c.isEmpty() && !e.get()) {
                c();
                String userId = Login.getUserId();
                if (TextUtils.isEmpty(userId)) {
                    userId = "";
                }
                map.put("userId", userId);
                UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("shortcuts_update");
                uTCustomHitBuilder.setEventPage("TBShortcutsManager");
                uTCustomHitBuilder.setProperties(map);
                UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
                qif.a("trackUpdateShortcuts.trackMap=%s", map.toString());
            }
        } catch (Throwable th) {
            qif.a("trackUpdateShortcuts.error.", th);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            e.set(false);
            this.c.clear();
            this.d.clear();
        } catch (Throwable unused) {
        }
    }

    private void b(final ShortcutManager shortcutManager, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bcc5278", new Object[]{this, shortcutManager, map});
            return;
        }
        final qoi qoiVar = new qoi();
        qoiVar.a(new khf() { // from class: tb.qoh.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                qoh.this = this;
            }

            /* renamed from: tb.qoh$4$1 */
            /* loaded from: classes9.dex */
            public class AnonymousClass1 implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a */
                public final /* synthetic */ String f32983a;

                public static /* synthetic */ void lambda$3E7eBk7gw32MjhsEGzfDF76ck1E(AnonymousClass1 anonymousClass1) {
                    anonymousClass1.a();
                }

                public AnonymousClass1(String str) {
                    AnonymousClass4.this = r1;
                    this.f32983a = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Map<String, ShortcutControlConfig> c = qod.a().c();
                    ContentVO a2 = qoiVar.a(this.f32983a);
                    if (a2 == null) {
                        return;
                    }
                    List<ItemVO> itemList = a2.getItemList();
                    qoh.b(qoh.this).clear();
                    qoh.c(qoh.this).clear();
                    qoh.a(qoh.this, shortcutManager);
                    int i = 0;
                    while (i < itemList.size()) {
                        ItemVO itemVO = itemList.get(i);
                        i++;
                        String id = itemVO.getId();
                        qoh.c(qoh.this).add(id);
                        qif.a("networkShortcut.shortcutId=" + id, new Object[0]);
                        itemVO.setRank(i);
                        qif.a("networkShortcut.shortcut=" + itemVO.toString(), new Object[0]);
                        qoh.a(qoh.this, id, itemVO, c.get(id), shortcutManager, map);
                    }
                    khw.a(qoh.a(qoh.this)).a("shortcut_update_time", Long.valueOf(a2.getNextRefreshTime()));
                    qij.a("ShortcutsManager", "updatesShortcuts.onResponseSuccess", "");
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tb.-$$Lambda$qoh$4$1$3E7eBk7gw32MjhsEGzfDF76ck1E
                        @Override // java.lang.Runnable
                        public final void run() {
                            qoh.AnonymousClass4.AnonymousClass1.lambda$3E7eBk7gw32MjhsEGzfDF76ck1E(qoh.AnonymousClass4.AnonymousClass1.this);
                        }
                    }, 60000L);
                }

                public /* synthetic */ void a() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (!qoh.b().get()) {
                    } else {
                        qoh.c(qoh.this).clear();
                        qoh.d(qoh.this);
                    }
                }
            }

            @Override // tb.khf
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else {
                    qig.b().execute(new AnonymousClass1(str));
                }
            }

            @Override // tb.khf
            public void b(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str});
                    return;
                }
                map.put("error", str);
                qoh.c(qoh.this).clear();
                qoh.d(qoh.this);
                qij.a("ShortcutsManager", "networkShortcut.onResponseError", ag.ARG_TAOKE_ERROR + str);
            }
        });
    }

    private void a(final String str, final ItemVO itemVO, ShortcutControlConfig shortcutControlConfig, final ShortcutManager shortcutManager, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2cf084", new Object[]{this, str, itemVO, shortcutControlConfig, shortcutManager, map});
            return;
        }
        try {
            if (itemVO == null) {
                qif.a("startAddNetworkShortcut.shortcutItem=null.return.", new Object[0]);
            } else if (shortcutControlConfig != null && !shortcutControlConfig.isEnable()) {
                qif.a("startAddNetworkShortcut.shortcutId=%s.controlConfig.isInValid.disableShortcut.", str);
                a(shortcutManager, str);
                map.put(str, shortcutControlConfig.isEnable() ? "disable.abConfig.inValid." : "disable.abConfig.notEnable.");
                this.c.remove(str);
                a(map);
            } else if (!itemVO.isValid()) {
                qif.a("startAddNetworkShortcut.shortcutItem=", itemVO.toString());
                map.put(str, "disable.inValid.");
                this.c.remove(str);
                a(map);
            } else {
                final String iconUrl = itemVO.getIconUrl();
                qif.a("getIconFromConfig.url=" + iconUrl, new Object[0]);
                com.taobao.phenix.intf.b.h().a(iconUrl).succListener(new a() { // from class: tb.-$$Lambda$qoh$VM5TquDXHhTX7nwDvj2bcEV2TvI
                    @Override // com.taobao.phenix.intf.event.a
                    public final boolean onHappen(d dVar) {
                        return qoh.lambda$VM5TquDXHhTX7nwDvj2bcEV2TvI(qoh.this, iconUrl, str, itemVO, shortcutManager, map, (SuccPhenixEvent) dVar);
                    }
                }).failListener(new a() { // from class: tb.-$$Lambda$qoh$QHHMDo-E3GD7VGXKUCOIvM_aAak
                    @Override // com.taobao.phenix.intf.event.a
                    public final boolean onHappen(d dVar) {
                        return qoh.m2493lambda$QHHMDoE3GD7VGXKUCOIvM_aAak(qoh.this, str, map, iconUrl, (FailPhenixEvent) dVar);
                    }
                }).fetch();
            }
        } catch (Throwable th) {
            this.c.remove(str);
            map.put(str, "catchError.fail.");
            a(map);
            qif.a("startAddNetworkShortcut.error.", th);
        }
    }

    public /* synthetic */ boolean a(String str, final String str2, final ItemVO itemVO, final ShortcutManager shortcutManager, final Map map, final SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccf6059c", new Object[]{this, str, str2, itemVO, shortcutManager, map, succPhenixEvent})).booleanValue();
        }
        if (succPhenixEvent != null && succPhenixEvent.getDrawable() != null) {
            qif.a("getIconFromConfig.succListener.url=" + str, new Object[0]);
            qig.b().execute(new Runnable() { // from class: tb.qoh.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    qoh.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        qoh.a(qoh.this, str2, itemVO, succPhenixEvent.getDrawable().getBitmap(), shortcutManager, map);
                    }
                }
            });
        } else {
            this.c.remove(str2);
            map.put(str2, "imageLoadError.drawableIsNull.");
            a(map);
            qif.a("Phenix.getIconFromConfig.succListener.getDrawable=null.imageUrl=" + str);
        }
        return false;
    }

    public /* synthetic */ boolean a(String str, Map map, String str2, FailPhenixEvent failPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26efde45", new Object[]{this, str, map, str2, failPhenixEvent})).booleanValue();
        }
        this.c.remove(str);
        Object[] objArr = new Object[1];
        objArr[0] = failPhenixEvent != null ? Integer.valueOf(failPhenixEvent.getResultCode()) : "";
        map.put(str, String.format("imageLoadError.fail.resultCode=%s", objArr));
        a(map);
        qif.a("Phenix.getIconFromConfig.failListener.imageUrl=" + str2);
        return false;
    }

    private void a(String str, ItemVO itemVO, Bitmap bitmap, ShortcutManager shortcutManager, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2acd969a", new Object[]{this, str, itemVO, bitmap, shortcutManager, map});
            return;
        }
        try {
            String linkUrl = itemVO.getLinkUrl();
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setFlags(268468224);
            intent.setData(Uri.parse(linkUrl));
            String title = itemVO.getTitle();
            String title2 = itemVO.getTitle();
            String disableToast = itemVO.getDisableToast();
            qif.a("addNetworkShortcut.shortcut=" + itemVO.toString(), new Object[0]);
            a(shortcutManager, str, new ShortcutInfo.Builder(TBHuDongServiceImp.getApplication(), str).setRank(itemVO.getRank()).setShortLabel(title).setLongLabel(title2).setIcon(Icon.createWithBitmap(bitmap)).setIntent(intent).setDisabledMessage(disableToast).build(), map);
        } catch (Throwable th) {
            qif.a("addNetworkShortcut.error.", th);
        }
    }
}
