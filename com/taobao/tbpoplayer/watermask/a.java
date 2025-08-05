package com.taobao.tbpoplayer.watermask;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.config.manager.d;
import com.alibaba.poplayer.trigger.g;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tbpoplayer.util.e;
import com.taobao.tbpoplayer.watermask.WaterMaskInfo;
import java.io.File;
import java.util.ArrayList;
import tb.bzo;
import tb.kge;
import tb.khd;
import tb.khf;
import tb.xio;
import tb.xip;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private WaterMaskInfo f22278a;
    private boolean b = false;
    private xio c;

    /* renamed from: com.taobao.tbpoplayer.watermask.a$a */
    /* loaded from: classes9.dex */
    public static class C0923a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static final a f22281a;

        static {
            kge.a(-500626231);
            f22281a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("1b2a64b2", new Object[0]) : f22281a;
        }
    }

    static {
        kge.a(-665579530);
    }

    /* renamed from: lambda$0z_tTKKdlFVv-4bXsHSECFm4Gyw */
    public static /* synthetic */ void m1473lambda$0z_tTKKdlFVv4bXsHSECFm4Gyw(a aVar, String str, String str2) {
        aVar.c(str, str2);
    }

    public static /* synthetic */ WaterMaskInfo a(a aVar, WaterMaskInfo waterMaskInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WaterMaskInfo) ipChange.ipc$dispatch("8aa47012", new Object[]{aVar, waterMaskInfo});
        }
        aVar.f22278a = waterMaskInfo;
        return waterMaskInfo;
    }

    public static /* synthetic */ xio a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xio) ipChange.ipc$dispatch("d73cf0f6", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ void a(a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c64bbe", new Object[]{aVar, jSONObject});
        } else {
            aVar.a(jSONObject);
        }
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c29f7ba6", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.b = z;
        return z;
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("1b2a64b2", new Object[0]) : C0923a.a();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c.a("WaterMaskInfoManager.init", new Object[0]);
        if (!com.taobao.tbpoplayer.info.a.a().s()) {
            c.a("WaterMaskInfoManager.init.isWaterMaskEnable=false.cancel", new Object[0]);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long b = bzo.b("lastRequestWaterMaskTime", 0L);
        if (b > 0) {
            long j = currentTimeMillis - b;
            long V = com.taobao.tbpoplayer.info.a.a().V();
            if (j <= V) {
                z = false;
            }
            c.a("WaterMaskInfoManager.init.curTime=" + currentTimeMillis + ".lastRequestTime=" + b + ".gapMs=" + j + ".orangeGapMs=" + V, new Object[0]);
        }
        c.a("WaterMaskInfoManager.init.needRequest=" + z, new Object[0]);
        if (z) {
            e();
        }
        c();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("screenshotTBAndroid");
        khd.a().a("feedback", arrayList, new JSONObject(), new khf() { // from class: com.taobao.tbpoplayer.watermask.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // tb.khf
            public void a(String str) {
                JSONObject jSONObject;
                JSONArray jSONArray;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else if (TextUtils.isEmpty(str)) {
                } else {
                    try {
                        c.a("WaterMaskInfoManager.fetchInfo.onResponseSuccess=%s", str);
                        JSONObject jSONObject2 = JSONObject.parseObject(str).getJSONObject("contentMap");
                        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("feedback")) != null && jSONObject.getBooleanValue("success") && (jSONArray = jSONObject.getJSONArray("content")) != null && !jSONArray.isEmpty()) {
                            JSONObject jSONObject3 = jSONArray.getJSONObject(0);
                            if (!jSONObject3.getBooleanValue("success")) {
                                return;
                            }
                            a.a(a.this, jSONObject3);
                            String jSONString = jSONObject3.toJSONString();
                            bzo.a("waterMaskInfo", jSONString);
                            a.a(a.this, (WaterMaskInfo) JSON.parseObject(jSONString, WaterMaskInfo.class));
                            c.a("WaterMaskInfoManager.saveData=" + jSONString, new Object[0]);
                        }
                    } catch (Throwable th) {
                        c.a("WaterMaskInfoManager.onResponseSuccess.error", th);
                    }
                }
            }

            @Override // tb.khf
            public void b(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str});
                    return;
                }
                c.a("WaterMaskInfoManager.requestUpdateInfo.onResponseError=" + str, new Object[0]);
            }
        });
        bzo.a("lastRequestWaterMaskTime", System.currentTimeMillis());
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.c == null) {
            this.c = new xio() { // from class: com.taobao.tbpoplayer.watermask.-$$Lambda$a$0z_tTKKdlFVv-4bXsHSECFm4Gyw
                @Override // tb.xio
                public final void onEnterPage(String str, String str2) {
                    a.m1473lambda$0z_tTKKdlFVv4bXsHSECFm4Gyw(a.this, str, str2);
                }
            };
        }
        xip.a().a(this.c);
    }

    public /* synthetic */ void c(String str, String str2) {
        WaterMaskInfo d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
            return;
        }
        try {
            if (!this.b && !TextUtils.isEmpty(str) && (d = d()) != null && d.isValid()) {
                boolean z = a(d, str, str2) != null;
                c.a("WaterMaskInfoManager.hitMatchScene=" + z, new Object[0]);
                if (!z) {
                    return;
                }
                this.b = true;
                g.a("poplayer://waterMask", "").a(new g.a() { // from class: com.taobao.tbpoplayer.watermask.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        a.this = this;
                    }

                    @Override // com.alibaba.poplayer.trigger.g.a
                    public void a(String str3, String str4, String str5) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("929ad046", new Object[]{this, str3, str4, str5});
                            return;
                        }
                        xip.a().b(a.a(a.this));
                        c.a("WaterMaskInfoManager.displayed.stopListenLifecycle", new Object[0]);
                    }

                    @Override // com.alibaba.poplayer.trigger.g.a
                    public void a(String str3, boolean z2, boolean z3, String str4, String str5) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e47be646", new Object[]{this, str3, new Boolean(z2), new Boolean(z3), str4, str5});
                            return;
                        }
                        a.a(a.this, false);
                        xip.a().a(a.a(a.this));
                        c.a("WaterMaskInfoManager.onClosed.registerListener", new Object[0]);
                    }

                    @Override // com.alibaba.poplayer.trigger.g.a
                    public void a(String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str3});
                            return;
                        }
                        a.a(a.this, false);
                        c.a("WaterMaskInfoManager.onTriggerFailed.reason=" + str3, new Object[0]);
                    }
                }).a();
            }
        } catch (Throwable th) {
            c.a("WaterMaskInfoManager.lifecycleListener.error", th);
        }
    }

    public boolean a(String str, String str2) {
        WaterMaskInfo d;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : !TextUtils.isEmpty(str) && (d = d()) != null && d.enable && a(d, str, str2) != null;
    }

    public float b(String str, String str2) {
        WaterMaskInfo.Scene a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65d7b86d", new Object[]{this, str, str2})).floatValue();
        }
        WaterMaskInfo d = d();
        if (d != null && d.enable && (a2 = a(d, str, str2)) != null && !TextUtils.isEmpty(a2.alpha)) {
            return Float.parseFloat(a2.alpha) / 100.0f;
        }
        return 0.04f;
    }

    private WaterMaskInfo.Scene a(WaterMaskInfo waterMaskInfo, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WaterMaskInfo.Scene) ipChange.ipc$dispatch("5f3dbc68", new Object[]{this, waterMaskInfo, str, str2});
        }
        for (WaterMaskInfo.Scene scene : waterMaskInfo.whitePageList) {
            if (scene != null && scene.uris.contains(str) && d.a(str2, scene.filer)) {
                return scene;
            }
        }
        return null;
    }

    public WaterMaskInfo d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WaterMaskInfo) ipChange.ipc$dispatch("87c9fc85", new Object[]{this});
        }
        WaterMaskInfo waterMaskInfo = this.f22278a;
        if (waterMaskInfo != null) {
            return waterMaskInfo;
        }
        String d = bzo.d("waterMaskInfo");
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        try {
            c.a("WaterMaskInfoManager.getCurInfo.waterMaskInfoStr=" + d, new Object[0]);
            this.f22278a = (WaterMaskInfo) JSON.parseObject(d, WaterMaskInfo.class);
            return this.f22278a;
        } catch (Throwable th) {
            c.a("WaterMaskInfoManager.getCurInfo.error", th);
            return null;
        }
    }

    public File a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("90186323", new Object[]{this, context, str});
        }
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            cacheDir = context.getExternalCacheDir();
        }
        return new File(cacheDir.getAbsolutePath() + "/wmp/" + str);
    }

    private void a(JSONObject jSONObject) {
        Response syncSend;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            Boolean bool = jSONObject.getBoolean("enable");
            String string = jSONObject.getString("imgCode");
            String string2 = jSONObject.getString("imgUrl");
            if (bool == null || !bool.booleanValue() || (syncSend = new DegradableNetwork(Globals.getApplication()).syncSend(new RequestImpl(string2), null)) == null) {
                return;
            }
            c.a("DSLFetcher.fetchDSL.%s", syncSend);
            if (syncSend.getStatusCode() < 0) {
                return;
            }
            byte[] bytedata = syncSend.getBytedata();
            Application application = Globals.getApplication();
            e.a(bytedata, a(application, string + ".png"));
        }
    }
}
