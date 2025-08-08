package com.taobao.android.festival.skin;

import android.graphics.Color;
import android.os.AsyncTask;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.festival.d;
import com.taobao.android.festival.jsbridge.TBSkinThemeWVPlugin;
import com.taobao.android.festival.utils.TrackUtils;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.Globals;
import com.taobao.tao.util.ImageStrategyDecider;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import tb.giy;
import tb.gja;
import tb.gjb;
import tb.gje;
import tb.gjf;
import tb.gjg;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SKIN_IMAGE_MODULE = "common";

    /* renamed from: a  reason: collision with root package name */
    private static final b f12362a;
    private boolean b = true;

    static {
        kge.a(-562854398);
        f12362a = new b();
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("b73cd009", new Object[0]) : f12362a;
    }

    private b() {
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : gje.a().e();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        gje.a().a(new gje.b() { // from class: com.taobao.android.festival.skin.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gje.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                TrackUtils.b.b();
                b.this.d();
            }

            @Override // tb.gje.b
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                b.this.d();
                TrackUtils.b.b();
                Coordinator.postTask(new Coordinator.TaggedRunnable("updateSkin") { // from class: com.taobao.android.festival.skin.b.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            gje.a().i();
                        }
                    }
                }, 10000);
            }

            @Override // tb.gje.b
            public void c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                    return;
                }
                gje.a().f();
                Coordinator.execute(new Runnable() { // from class: com.taobao.android.festival.skin.b.1.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            gjf.a();
                        }
                    }
                });
            }
        });
        q.a("TBSkinThemeWVPlugin", (Class<? extends e>) TBSkinThemeWVPlugin.class, true);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.taobao.android.festival.skin.b$2] */
    public void a(final String str, final gjg gjgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a481a3e", new Object[]{this, str, gjgVar});
        } else if (StringUtils.isEmpty(str)) {
            TrackUtils.a.a(TrackUtils.ErrorType.SET_SKIN_PARAMS_ERROR, "no params");
            gjgVar.a(str, "NO_PARAMS", "no params");
        } else {
            try {
                SkinConfig skinConfig = (SkinConfig) JSON.parseObject(str, SkinConfig.class);
                if (!skinConfig.isValidConfig()) {
                    if (StringUtils.isEmpty(skinConfig.skinCode) && StringUtils.isEmpty(skinConfig.skinUrl)) {
                        gje.a().g();
                        gjgVar.a(str);
                        d();
                        return;
                    }
                    TrackUtils.a.a(TrackUtils.ErrorType.SET_SKIN_PARAMS_ERROR, "skinCode or skinUrl should not be null");
                    gjgVar.a(str, "PARAMS_ERROR", "skinCode or skinUrl should not be null");
                    return;
                }
                final String str2 = skinConfig.skinCode;
                new AsyncTask<SkinConfig, Void, gja>() { // from class: com.taobao.android.festival.skin.b.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str3, Object... objArr) {
                        if (str3.hashCode() == -2026216808) {
                            super.onPreExecute();
                            return null;
                        }
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str3));
                    }

                    /* JADX WARN: Type inference failed for: r4v4, types: [tb.gja, java.lang.Object] */
                    @Override // android.os.AsyncTask
                    public /* synthetic */ gja doInBackground(SkinConfig[] skinConfigArr) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, skinConfigArr}) : a(skinConfigArr);
                    }

                    @Override // android.os.AsyncTask
                    public /* synthetic */ void onPostExecute(gja gjaVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b105c779", new Object[]{this, gjaVar});
                        } else {
                            a(gjaVar);
                        }
                    }

                    @Override // android.os.AsyncTask
                    public void onPreExecute() {
                        boolean z;
                        IpChange ipChange2 = $ipChange;
                        boolean z2 = true;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("873a6298", new Object[]{this});
                            return;
                        }
                        super.onPreExecute();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(com.taobao.android.festival.utils.a.DEFAULT_FOREIGN_SKIN_CODE);
                        arrayList.add(d.b(d.KEY_FOREIGN_SKIN_CODE, ""));
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                            String str3 = (String) it.next();
                            String str4 = str2;
                            if (str4 != null && str4.equals(str3)) {
                                z = true;
                                break;
                            }
                        }
                        if (new Date().getTime() <= com.taobao.android.festival.festival.a.a().b) {
                            z2 = false;
                        }
                        if (!d.d() || z || !z2) {
                            return;
                        }
                        gjb.a(gjb.SP_KEY_IGNORE_FESTIVAL_VESION, com.taobao.android.festival.festival.a.a().f12349a);
                        gjb.a(gjb.SP_KEY_IGNORE_FESTIVAL_END_TIME, (com.taobao.android.festival.festival.a.a().c / 1000) + "");
                    }

                    public gja a(SkinConfig... skinConfigArr) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (gja) ipChange2.ipc$dispatch("8d2b99c1", new Object[]{this, skinConfigArr}) : gje.a().c(skinConfigArr[0]);
                    }

                    public void a(gja gjaVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ea5aea3a", new Object[]{this, gjaVar});
                        } else if (gjaVar.a()) {
                            b.this.d();
                            gjb.a(gjb.SP_KEY_DEFAULT_CUSTOMER_AREA_SKIN, "false");
                            gjgVar.a(str);
                            TrackUtils.a.a("SetCurrentSkin");
                        } else {
                            TrackUtils.ErrorType errorType = TrackUtils.ErrorType.SET_SKIN_ERROR;
                            TrackUtils.a.a(errorType, gjaVar.b + ":" + gjaVar.f28337a);
                            gjgVar.a(str, "NO_DATA", "no downloadSync data");
                        }
                    }
                }.execute(skinConfig);
            } catch (Throwable unused) {
                TrackUtils.a.a(TrackUtils.ErrorType.SET_SKIN_PARAMS_ERROR, "error params format");
                gjgVar.a(str, "PARAMS_ERROR", "error params format");
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            giy.a(Globals.getApplication(), FestivalMgr.SKIN_CHANGE_REASON_CONFIG_CHANGE);
        }
    }

    public void b(String str, gjg gjgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f30e27f", new Object[]{this, str, gjgVar});
        } else if (StringUtils.isEmpty(str)) {
            gjgVar.a(str, "NO_PARAMS", "no params");
            TrackUtils.a.a(TrackUtils.ErrorType.DOWNLOAD_SKIN_PARAMS_ERROR, "no params");
        } else {
            try {
                SkinConfig skinConfig = (SkinConfig) JSON.parseObject(str, SkinConfig.class);
                if (skinConfig == null || !skinConfig.isValidConfig()) {
                    return;
                }
                if (gje.a().d(skinConfig)) {
                    gjgVar.a(str);
                } else {
                    new a(str, skinConfig, gjgVar).execute(new Void[0]);
                }
            } catch (Throwable unused) {
                TrackUtils.a.a(TrackUtils.ErrorType.DOWNLOAD_SKIN_PARAMS_ERROR, "error params format");
                gjgVar.a(str, "PARAMS_ERROR", "error params format");
            }
        }
    }

    public int a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4dba94fa", new Object[]{this, str, str2, new Integer(i)})).intValue() : b(c(str, str2), i);
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : a(str, str2, true);
    }

    public String a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91186ac8", new Object[]{this, str, str2, new Boolean(z)});
        }
        String b = gje.a().b(str, str2);
        if (!StringUtils.isEmpty(b)) {
            Log.e("SkinManager", "getText:" + b);
            return b;
        }
        String c = c(str, str2);
        if (z && com.taobao.android.festival.utils.d.b(c)) {
            c = ImageStrategyDecider.decideUrl(c, 960, 960, null);
        }
        if (StringUtils.isEmpty(c)) {
            return "";
        }
        if (this.b) {
            TrackUtils.b.a();
            this.b = false;
        }
        return c;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String d = gje.a().d(RemoteMessageConst.Notification.SOUND, str);
        return !StringUtils.isEmpty(d) ? d : "";
    }

    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue() : !StringUtils.isEmpty(c(str, str2));
    }

    public boolean b(String str) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : (gje.a().c() == null || (map = gje.a().c().get(str)) == null || map.isEmpty()) ? false : true;
    }

    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue() : b(c("global", str), i);
    }

    private int b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d253be3", new Object[]{this, str, new Integer(i)})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cef1bce2", new Object[]{this, str, str2}) : gje.a().a(str, str2);
    }

    public Map<String, String> c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e68dc5e9", new Object[]{this, str}) : gje.a().b(str);
    }

    public String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5bded401", new Object[]{this, str, str2}) : gje.a().c(str, str2);
    }
}
