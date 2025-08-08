package com.taobao.tao.adapter.biz.plugins;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import anetwork.channel.download.DownloadManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.phenix.compat.effects.c;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.runtimepermission.f;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.adapter.biz.plugins.watermask.DownloadDialogFragment;
import com.taobao.tao.adapter.biz.plugins.watermask.b;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import tb.keq;
import tb.kge;
import tb.nyu;
import tb.nyy;
import tb.obk;
import tb.obl;
import tb.ocx;
import tb.ocz;
import tb.oda;

/* loaded from: classes8.dex */
public class a implements com.taobao.tao.adapter.biz.plugins.watermask.a, obk.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RATIO_ANCHOR_MAP_KEY = "ratioAnchorMap";
    public static final String RATIO_POSITION_MAP_KEY = "ratioPositionMap";
    public static final String RATIO_SCALE_MAP_KEY = "ratioScaleMap";

    /* renamed from: a  reason: collision with root package name */
    private String f19808a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private boolean g;
    private Map<String, String> h;
    private int i;
    private int j;
    private int k;
    private int l;
    private DownloadManager m = DownloadManager.getInstance();
    private b n;
    private WeakReference<DownloadDialogFragment> o;
    private Handler p;
    private String q;
    private String r;
    private Bitmap s;
    private long t;
    private boolean u;
    private boolean v;
    private String w;
    private String x;
    private long y;

    static {
        kge.a(471229962);
        kge.a(1377891874);
        kge.a(-605705439);
    }

    @Override // tb.obk.a
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "videodownload";
    }

    public static /* synthetic */ int a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b966a75", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.i = i;
        return i;
    }

    public static /* synthetic */ Bitmap a(a aVar, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c12d9c8b", new Object[]{aVar, bitmap});
        }
        aVar.s = bitmap;
        return bitmap;
    }

    public static /* synthetic */ String a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4470e1f", new Object[]{aVar}) : aVar.f19808a;
    }

    public static /* synthetic */ String a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e47afd5", new Object[]{aVar, str});
        }
        aVar.q = str;
        return str;
    }

    public static /* synthetic */ int b(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e82d3d4", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.k = i;
        return i;
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d5f0b62", new Object[]{aVar});
        } else {
            aVar.g();
        }
    }

    public static /* synthetic */ void b(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d0e0ac", new Object[]{aVar, str});
        } else {
            aVar.c(str);
        }
    }

    public static /* synthetic */ int c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("42a07a16", new Object[]{aVar})).intValue() : aVar.k;
    }

    public static /* synthetic */ String c(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("404a5313", new Object[]{aVar, str});
        }
        aVar.r = str;
        return str;
    }

    public static /* synthetic */ void c(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("116f3d40", new Object[]{aVar, new Integer(i)});
        } else {
            aVar.b(i);
        }
    }

    public static /* synthetic */ int d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("27e1e8d7", new Object[]{aVar})).intValue() : aVar.l;
    }

    public static /* synthetic */ int d(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d45ba692", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.l = i;
        return i;
    }

    public static /* synthetic */ boolean e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2357a9", new Object[]{aVar})).booleanValue() : aVar.u;
    }

    public static /* synthetic */ DownloadManager f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DownloadManager) ipChange.ipc$dispatch("c1b2a00b", new Object[]{aVar}) : aVar.m;
    }

    public static /* synthetic */ String g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("185dd259", new Object[]{aVar}) : aVar.w;
    }

    public static /* synthetic */ String h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e619db8", new Object[]{aVar}) : aVar.x;
    }

    public static /* synthetic */ void i(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a22912a9", new Object[]{aVar});
        } else {
            aVar.f();
        }
    }

    public static /* synthetic */ WeakReference j(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("31fb0b38", new Object[]{aVar}) : aVar.o;
    }

    public static /* synthetic */ long k(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6cabf01f", new Object[]{aVar})).longValue() : aVar.t;
    }

    public static /* synthetic */ boolean l(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("51ed5ef0", new Object[]{aVar})).booleanValue() : aVar.v;
    }

    public static /* synthetic */ Handler m(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("13ed9ff9", new Object[]{aVar}) : aVar.p;
    }

    @Override // tb.obk.a
    public void onEvent(com.taobao.share.globalmodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b9073b", new Object[]{this, bVar});
        } else if (!a(bVar)) {
        } else {
            TBShareContent a2 = bVar.a().a();
            if (a2 != null && a2.extraParams != null) {
                this.v = StringUtils.equals("true", a2.extraParams.remove("isWeexDownload"));
            }
            this.t = SystemClock.elapsedRealtime();
            e();
            if (!this.g) {
                b();
            }
            d();
            if (obl.b()) {
                h();
            } else {
                c();
            }
            if (a2 != null) {
                this.x = a2.businessId;
            }
            String str = this.w;
            TBS.Ext.commitEvent("Page_Share", 19999, "videodownload", "downloadStart", str, "bizId=" + this.x);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            com.taobao.phenix.intf.b.h().a(this.e).bitmapProcessors(new c()).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.tao.adapter.biz.plugins.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    if (succPhenixEvent.getDrawable() != null) {
                        a.a(a.this, succPhenixEvent.getDrawable().getBitmap());
                    }
                    return false;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.tao.adapter.biz.plugins.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    return false;
                }

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }
            }).fetch();
        }
    }

    @Override // tb.obk.a
    public boolean a(com.taobao.share.globalmodel.b bVar) {
        TBShareContent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c8f04a5", new Object[]{this, bVar})).booleanValue();
        }
        if (oda.b() && bVar != null && bVar.a() != null && (a2 = bVar.a().a()) != null && a2.extraParams != null) {
            if (!StringUtils.isEmpty(a2.extraParams.get("waterMaskVideoPath"))) {
                this.f19808a = a2.extraParams.get("waterMaskVideoPath");
                this.u = true;
                this.w = "downloadVideoUrl";
            } else {
                this.f19808a = a2.extraParams.get("videoPath");
                this.u = false;
                this.w = "marvelExportVideo";
            }
            this.b = a2.extraParams.get("videoSize");
            this.h = new HashMap();
            this.h.put(RATIO_SCALE_MAP_KEY, a2.extraParams.get("waterMarkRatioScaleMap"));
            this.h.put(RATIO_POSITION_MAP_KEY, a2.extraParams.get("waterMarkRatioPositionMap"));
            this.h.put(RATIO_ANCHOR_MAP_KEY, a2.extraParams.get("waterMarkRatioAnchorMap"));
            this.g = StringUtils.equals("isAddWaterMaskOnly", a2.extraParams.get("videoTemplateScheme"));
            if (this.g) {
                this.c = a2.extraParams.get("videoResZipUrl");
                return !StringUtils.isEmpty(this.f19808a) && !StringUtils.isEmpty(this.b) && !StringUtils.isEmpty(this.c);
            }
            OrangeConfig orangeConfig = OrangeConfig.getInstance();
            this.c = orangeConfig.getConfig("android_share_bizconfig", a2.businessId + "_videoResZipUrl", "https://wantu-1lh1-videotool-hz.oss-cn-hangzhou.aliyuncs.com/material/onion/watermark_gg.zip");
            this.d = a2.extraParams.get("userId");
            this.f = a2.extraParams.get("userNick");
            if (StringUtils.isEmpty(this.f) && a2.templateParams != null && a2.templateParams.containsKey("userNick")) {
                this.f = (String) a2.templateParams.get("userNick");
            }
            this.e = a2.extraParams.get("avatarPath");
            if (!StringUtils.isEmpty(this.f19808a) && !StringUtils.isEmpty(this.c) && !StringUtils.isEmpty(this.b) && !StringUtils.isEmpty(this.d) && !StringUtils.isEmpty(this.f) && !StringUtils.isEmpty(this.e)) {
                return true;
            }
        }
        return false;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            f.a(Globals.getApplication(), obl.a()).b("tb_share").a(true).a(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18155)).b(new Runnable() { // from class: com.taobao.tao.adapter.biz.plugins.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.b(a.this, "PermissionDenied");
                    }
                }
            }).a(new Runnable() { // from class: com.taobao.tao.adapter.biz.plugins.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a aVar = a.this;
                    a.a(aVar, a.f(aVar).enqueue(a.a(a.this), SystemClock.elapsedRealtime() + "_share_video_temp.mp4", new DownloadManager.DownloadListener() { // from class: com.taobao.tao.adapter.biz.plugins.a.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // anetwork.channel.download.DownloadManager.DownloadListener
                        public void onSuccess(int i, String str) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
                                return;
                            }
                            a.a(a.this, str);
                            a.b(a.this);
                        }

                        @Override // anetwork.channel.download.DownloadManager.DownloadListener
                        public void onFail(int i, int i2, String str) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("a94ab7ce", new Object[]{this, new Integer(i), new Integer(i2), str});
                                return;
                            }
                            a aVar2 = a.this;
                            a.b(aVar2, i2 + "|" + str);
                        }

                        @Override // anetwork.channel.download.DownloadManager.DownloadListener
                        public void onProgress(int i, long j, long j2) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d0712230", new Object[]{this, new Integer(i), new Long(j), new Long(j2)});
                                return;
                            }
                            int i2 = (int) ((((float) j) * 100.0f) / ((float) j2));
                            a.b(a.this, i2 / 2);
                            int c = (int) ((a.c(a.this) + a.d(a.this)) * 0.1f);
                            a aVar2 = a.this;
                            if (!a.e(a.this)) {
                                i2 = c;
                            }
                            a.c(aVar2, i2);
                        }
                    }));
                }
            }).a();
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.taobao.tao.adapter.biz.plugins.a.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        a.a(a.this, a.f(a.this).enqueue(a.a(a.this), SystemClock.elapsedRealtime() + "_share_video_temp.mp4", new DownloadManager.DownloadListener() { // from class: com.taobao.tao.adapter.biz.plugins.a.5.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // anetwork.channel.download.DownloadManager.DownloadListener
                            public void onSuccess(int i, String str) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
                                    return;
                                }
                                a.a(a.this, str);
                                a.b(a.this);
                            }

                            @Override // anetwork.channel.download.DownloadManager.DownloadListener
                            public void onFail(int i, int i2, String str) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("a94ab7ce", new Object[]{this, new Integer(i), new Integer(i2), str});
                                    return;
                                }
                                a aVar = a.this;
                                a.b(aVar, i2 + "|" + str);
                            }

                            @Override // anetwork.channel.download.DownloadManager.DownloadListener
                            public void onProgress(int i, long j, long j2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("d0712230", new Object[]{this, new Integer(i), new Long(j), new Long(j2)});
                                    return;
                                }
                                int i2 = (int) ((((float) j) * 100.0f) / ((float) j2));
                                a.b(a.this, i2 / 2);
                                int c = (int) ((a.c(a.this) + a.d(a.this)) * 0.1f);
                                a aVar = a.this;
                                if (!a.e(a.this)) {
                                    i2 = c;
                                }
                                a.c(aVar, i2);
                            }
                        }));
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.u) {
        } else {
            this.j = this.m.enqueue(this.c, SystemClock.elapsedRealtime() + "_share_video_res.zip", new DownloadManager.DownloadListener() { // from class: com.taobao.tao.adapter.biz.plugins.a.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anetwork.channel.download.DownloadManager.DownloadListener
                public void onSuccess(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
                        return;
                    }
                    String str2 = Globals.getApplication().getCacheDir().getAbsolutePath() + "/share_video_res";
                    if (ocz.a(str, str2)) {
                        a.c(a.this, str2);
                        a.b(a.this);
                        ocz.a(str);
                        return;
                    }
                    a.b(a.this, "unzipFile err");
                }

                @Override // anetwork.channel.download.DownloadManager.DownloadListener
                public void onFail(int i, int i2, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a94ab7ce", new Object[]{this, new Integer(i), new Integer(i2), str});
                        return;
                    }
                    a aVar = a.this;
                    a.b(aVar, i2 + "|" + str);
                }

                @Override // anetwork.channel.download.DownloadManager.DownloadListener
                public void onProgress(int i, long j, long j2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0712230", new Object[]{this, new Integer(i), new Long(j), new Long(j2)});
                        return;
                    }
                    a.d(a.this, (int) (((((float) j) / ((float) j2)) * 100.0f) / 2.0f));
                    a.c(a.this, (int) ((a.c(a.this) + a.d(a.this)) * 0.1f));
                }
            });
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.p = new Handler(Looper.getMainLooper());
        if (this.v) {
            return;
        }
        String format = String.format(Locale.CHINA, "%.2f", Double.valueOf((Long.parseLong(this.b) / 1024.0d) / 1024.0d));
        Activity c = ShareBizAdapter.getInstance().getAppEnv().c();
        if (c instanceof FragmentActivity) {
            DownloadDialogFragment downloadDialogFragment = new DownloadDialogFragment();
            downloadDialogFragment.setOnCancelListener(new View.OnClickListener() { // from class: com.taobao.tao.adapter.biz.plugins.a.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    String g = a.g(a.this);
                    TBS.Ext.commitEvent("Page_Share", 19999, "videodownload", "downloadCancel", g, "bizId=" + a.h(a.this));
                    String g2 = a.g(a.this);
                    TBS.Ext.commitEvent("Page_Share", 19999, "videodownload", "downloadFail", g2, "bizId=" + a.h(a.this) + ",errorMsg=cancelByUser");
                    a.i(a.this);
                    a.this.a(true);
                }
            });
            downloadDialogFragment.show(((FragmentActivity) c).getSupportFragmentManager(), "share_video_download_loading");
            downloadDialogFragment.updateProgressText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18160) + format + com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18158));
            this.o = new WeakReference<>(downloadDialogFragment);
        }
        com.taobao.tao.sharepanel.weex.a aVar = (com.taobao.tao.sharepanel.weex.a) ShareBizAdapter.getInstance().getShareEngine().mo1241getCurSharePanel();
        if (aVar == null || aVar.getPanel() == null) {
            return;
        }
        aVar.getPanel().c();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        WeakReference<DownloadDialogFragment> weakReference = this.o;
        DownloadDialogFragment downloadDialogFragment = weakReference == null ? null : weakReference.get();
        if (downloadDialogFragment == null) {
            return;
        }
        downloadDialogFragment.dismissAllowingStateLoss();
    }

    @Override // tb.obk.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.p = null;
        ocz.a(this.q, this.r);
        int i = this.i;
        if (i > 0) {
            this.m.cancel(i);
            this.i = 0;
        }
        int i2 = this.j;
        if (i2 > 0) {
            this.m.cancel(i2);
            this.j = 0;
        }
        b bVar = this.n;
        if (bVar != null) {
            bVar.a();
            this.n.b();
            this.n = null;
        }
        if (!this.v || !z) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMsg", (Object) "cancel");
        jSONObject.put("errorCode", (Object) 100);
        com.taobao.share.ui.engine.jsbridge.a.a().a("TBWeexShare.guangVideoDownloadComplete", jSONObject);
    }

    private void c(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (this.v) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMsg", (Object) str);
            jSONObject.put("errorCode", (Object) 0);
            com.taobao.share.ui.engine.jsbridge.a.a().a("TBWeexShare.guangVideoDownloadComplete", jSONObject);
            a(false);
        } else {
            Handler handler = this.p;
            if (handler == null) {
                return;
            }
            handler.post(new Runnable() { // from class: com.taobao.tao.adapter.biz.plugins.a.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a.i(a.this);
                    a.this.a(false);
                    nyy.c("WaterVideoDownloadPlugin", com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18152) + str);
                    String g = a.g(a.this);
                    TBS.Ext.commitEvent("Page_Share", 19999, "videodownload", "downloadFail", g, "bizId=" + a.h(a.this) + ",errorMsg=" + str);
                    nyu.a(Globals.getApplication(), com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18150));
                }
            });
        }
    }

    private void b(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (this.p == null) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.v && currentTimeMillis - this.y > 300) {
                this.y = currentTimeMillis;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("percentage", (Object) Float.valueOf(i / 100.0f));
                jSONObject.put("videoFileSize", (Object) this.b);
                com.taobao.share.ui.engine.jsbridge.a.a().a("TBWeexShare.guangVideoDownloadPercentage", jSONObject);
                return;
            }
            this.p.post(new Runnable() { // from class: com.taobao.tao.adapter.biz.plugins.a.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    DownloadDialogFragment downloadDialogFragment = a.j(a.this) == null ? null : (DownloadDialogFragment) a.j(a.this).get();
                    if (downloadDialogFragment == null) {
                        return;
                    }
                    downloadDialogFragment.updateProgress(i);
                }
            });
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.u && ocx.a(this.q)) {
            a(this.q);
        } else if (this.u || !ocx.a(this.q) || !ocx.a(this.r)) {
        } else {
            try {
                Activity c = ShareBizAdapter.getInstance().getAppEnv().c();
                this.n = new b();
                this.n.a(c, this.q, this.d, this.s, this.f, this.r, this.h, this.g, this);
            } catch (Throwable th) {
                c("exportVideo err " + th.getMessage());
            }
        }
    }

    @Override // com.taobao.tao.adapter.biz.plugins.watermask.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        b(100);
        ocz.a(Globals.getApplication(), str, new ocz.b() { // from class: com.taobao.tao.adapter.biz.plugins.a.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ocz.b
            public void a(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    return;
                }
                String g = a.g(a.this);
                TBS.Ext.commitEvent("Page_Share", 19999, "videodownload", keq.DOWNLOAD_SUCCESS, g, "bizId=" + a.h(a.this) + ",duration=" + (SystemClock.elapsedRealtime() - a.k(a.this)));
                Application application = Globals.getApplication();
                StringBuilder sb = new StringBuilder();
                sb.append("file://");
                sb.append(str2);
                application.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse(sb.toString())));
                if (a.l(a.this)) {
                    com.taobao.share.ui.engine.jsbridge.a.a().a("TBWeexShare.guangVideoDownloadComplete", new JSONObject());
                } else if (a.m(a.this) != null) {
                    a.m(a.this).post(new Runnable() { // from class: com.taobao.tao.adapter.biz.plugins.a.10.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            a.i(a.this);
                            nyu.a(Globals.getApplication(), com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18154));
                        }
                    });
                }
                a.this.a(false);
            }
        });
    }

    @Override // com.taobao.tao.adapter.biz.plugins.watermask.a
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            c(str);
        }
    }

    @Override // com.taobao.tao.adapter.biz.plugins.watermask.a
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            b(Math.min(((int) (i * 0.9f)) + 10, 99));
        }
    }
}
