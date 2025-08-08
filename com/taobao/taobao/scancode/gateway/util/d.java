package com.taobao.taobao.scancode.gateway.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ac;
import com.taobao.android.scancode.common.object.ScancodeResult;
import com.taobao.android.scancode.common.object.ScancodeType;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.constants.LoginUrlConstants;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.util.DensityUtil;
import com.taobao.tao.util.MyUrlEncoder;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.barcode.business.GetMedicineUrlBussiness;
import com.taobao.taobao.scancode.barcode.business.GetQRMedicineUrlBussiness;
import com.taobao.taobao.scancode.barcode.business.a;
import com.taobao.taobao.scancode.barcode.object.recommend.GetQRMedicineUrlRequest;
import com.taobao.taobao.scancode.common.mtop.resp.CainiaoLdDetailH5AuthGetResp;
import com.taobao.taobao.scancode.common.mtop.resp.PailitaoRecommendResp;
import com.taobao.taobao.scancode.gateway.activity.ResultViewController;
import com.taobao.taobao.scancode.gateway.activity.a;
import com.taobao.taobao.scancode.huoyan.object.KakaLibImageWrapper;
import com.taobao.taobao.scancode.v2.result.MaResult;
import com.taobao.taobao.scancode.v2.result.MaTBAntiFakeResult;
import com.taobao.taobao.scancode.v2.result.MaType;
import com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import tb.acg;
import tb.cox;
import tb.coy;
import tb.css;
import tb.kge;
import tb.ovv;
import tb.oxw;
import tb.oxy;
import tb.oyc;
import tb.oye;
import tb.oyg;

/* loaded from: classes8.dex */
public class d extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a j;
    private boolean l;
    private long m;
    private boolean n;
    private boolean q;
    private String s;

    /* renamed from: com.taobao.taobao.scancode.gateway.util.d$4  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21272a = new int[ScancodeType.values().length];

        static {
            try {
                f21272a[ScancodeType.PRODUCT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21272a[ScancodeType.MEDICINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21272a[ScancodeType.GEN3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        kge.a(-1023331371);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        if (str.hashCode() == 237520945) {
            super.b((MaResult) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(d dVar, Activity activity, MaResult maResult, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a0b7b3b", new Object[]{dVar, activity, maResult, new Integer(i)});
        } else {
            dVar.a(activity, maResult, i);
        }
    }

    public static /* synthetic */ void a(d dVar, MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c62a65a", new Object[]{dVar, maResult});
        } else {
            super.b(maResult);
        }
    }

    public static /* synthetic */ void a(d dVar, String str, Bundle bundle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e833f62a", new Object[]{dVar, str, bundle, new Boolean(z)});
        } else {
            dVar.a(str, bundle, z);
        }
    }

    public static /* synthetic */ boolean a(d dVar, MaResult maResult, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff2d7be", new Object[]{dVar, maResult, new Boolean(z)})).booleanValue() : dVar.a(maResult, z);
    }

    public static /* synthetic */ void b(d dVar, MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4a8e69b", new Object[]{dVar, maResult});
        } else {
            super.b(maResult);
        }
    }

    public static /* synthetic */ void c(d dVar, MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccef26dc", new Object[]{dVar, maResult});
        } else {
            super.b(maResult);
        }
    }

    public static /* synthetic */ void d(d dVar, MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f535671d", new Object[]{dVar, maResult});
        } else {
            super.b(maResult);
        }
    }

    public d(a aVar, ScancodeController scancodeController, FragmentActivity fragmentActivity, css cssVar) {
        super(scancodeController, fragmentActivity, aVar.b(), aVar.c(), cssVar);
        this.l = false;
        this.n = false;
        this.q = true;
        this.j = aVar;
        this.g = new ResultViewController(fragmentActivity);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.s = str;
        }
    }

    private ScancodeResult e(MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScancodeResult) ipChange.ipc$dispatch("73f77c92", new Object[]{this, maResult});
        }
        if (maResult == null) {
            return null;
        }
        ScancodeResult scancodeResult = new ScancodeResult();
        scancodeResult.code = maResult.getText();
        scancodeResult.type = oxy.a(maResult);
        if (this.j.a().a(scancodeResult.type)) {
            return scancodeResult;
        }
        return null;
    }

    private void a(MaResult maResult, String str) {
        String hiddenData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6727c71c", new Object[]{this, maResult, str});
            return;
        }
        ScancodeType a2 = oxy.a(maResult);
        if (a2 == null) {
            return;
        }
        try {
            String text = maResult.getText();
            if (MaType.TB_ANTI_FAKE == maResult.getType() && (maResult instanceof MaTBAntiFakeResult)) {
                MaTBAntiFakeResult maTBAntiFakeResult = (MaTBAntiFakeResult) maResult;
                if (maTBAntiFakeResult.exist() && (hiddenData = maTBAntiFakeResult.getHiddenData()) != null) {
                    text = text + hiddenData;
                }
            }
            String lowerCase = a2.name().toLowerCase(Locale.getDefault());
            if (maResult.getType() == MaType.GEN3) {
                if (!StringUtils.isEmpty(text) && text.length() >= 3) {
                    lowerCase = StringUtils.equals(text.substring(0, 2), "0_") ? "anti_fake" : "qr";
                }
                return;
            }
            if (StringUtils.isEmpty(str)) {
                str = "unknown";
            }
            HashMap<String, String> hashMap = this.i == null ? new HashMap<>(2) : this.i.a();
            String str2 = hashMap.get("spm");
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            if (oxy.h()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putAll(hashMap);
                try {
                    str3 = URLEncoder.encode(jSONObject.toJSONString(), "utf-8");
                } catch (Exception unused) {
                }
            }
            HashMap hashMap2 = new HashMap(16);
            hashMap2.put("content", text);
            hashMap2.put("type", lowerCase);
            hashMap2.put("scanFrom", str);
            hashMap2.putAll(hashMap);
            hashMap2.put("spm-cnt", str2);
            hashMap2.put("utLogMap", str3);
            a(a2, hashMap2);
        } catch (Throwable unused2) {
        }
    }

    private void a(ScancodeType scancodeType, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aef6eb0", new Object[]{this, scancodeType, map});
            return;
        }
        String[] strArr = new String[map.size()];
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            strArr[i] = entry.getKey() + "=" + entry.getValue();
            i++;
        }
        String str = this.s;
        CT ct = CT.Button;
        TBS.Adv.ctrlClickedOnPage(str, ct, "Button-CodeRecognize-" + scancodeType.name(), strArr);
        HashMap hashMap = new HashMap(map);
        Object obj = map.get("spm-cnt");
        if (obj != null) {
            hashMap.put("spm", obj);
        }
        coy.b(this.s, "Button-GotCode", hashMap);
        HashMap hashMap2 = new HashMap(hashMap.size());
        for (Map.Entry entry2 : hashMap.entrySet()) {
            hashMap2.put(entry2.getKey(), entry2.getValue().toString());
        }
        coy.a(this.s, "Button-GotCode", hashMap2);
    }

    private boolean a(ScancodeResult scancodeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cacfb6b6", new Object[]{this, scancodeResult})).booleanValue();
        }
        if (scancodeResult != null && scancodeResult.code != null && scancodeResult.code.startsWith("{\"dynamicdeploy\":")) {
            JSONObject jSONObject = JSON.parseObject(scancodeResult.code).getJSONObject("dynamicdeploy");
            ovv.getInstance(acg.a()).triggerDynamicDeployment(jSONObject.getString("targetversion"), jSONObject.getString("url"));
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.taobao.scancode.gateway.util.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (d.this.b == null) {
                    } else {
                        d.this.b.finish();
                    }
                }
            });
            return true;
        } else if (scancodeResult == null || scancodeResult.code == null || !scancodeResult.code.startsWith("{\"dynamicInstall\":")) {
            return false;
        } else {
            ovv.getInstance(acg.a()).triggerBundleDownload(JSON.parseObject(scancodeResult.code).getJSONObject("dynamicInstall").getString("url"));
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.taobao.scancode.gateway.util.d.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (d.this.b == null) {
                    } else {
                        d.this.b.finish();
                    }
                }
            });
            return true;
        }
    }

    private boolean a(MaResult maResult, KakaLibImageWrapper kakaLibImageWrapper, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fca73ba", new Object[]{this, maResult, kakaLibImageWrapper, str})).booleanValue();
        }
        ScancodeResult e = e(maResult);
        if (e == null) {
            if (this.f21262a != null) {
                this.f21262a.startPreview();
            }
            return true;
        }
        if (this.f21262a != null) {
            this.f21262a.stopPreview();
        }
        if (a(e)) {
            return true;
        }
        if (e.type != ScancodeType.TB_4G && this.g != null) {
            this.g.a();
        }
        this.l = true;
        oye.a(e.type.toString(), System.currentTimeMillis() - this.m);
        a();
        a(maResult, str);
        if (!StringUtils.isEmpty(this.j.d())) {
            oxw.a(this.b, this.j.d(), e);
            if (this.b != null) {
                this.b.finish();
            }
            return false;
        } else if (this.c != null && d(maResult)) {
            if (this.d && this.b != null) {
                this.b.finish();
            }
            return false;
        } else if (a(e, maResult)) {
            return true;
        } else {
            if (this.j.e() && b(e)) {
                return true;
            }
            oxw.a(this.b, maResult.getText(), maResult.getType());
            return a(this.b, e.type, maResult);
        }
    }

    public boolean a(Activity activity, MaResult maResult, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e42c80e", new Object[]{this, activity, maResult, str})).booleanValue();
        }
        ScancodeType a2 = oxy.a(maResult);
        if (a2 == null) {
            return false;
        }
        a(maResult, str);
        return a(activity, a2, maResult);
    }

    private boolean a(Activity activity, ScancodeType scancodeType, MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("212edcd7", new Object[]{this, activity, scancodeType, maResult})).booleanValue();
        }
        int i = AnonymousClass4.f21272a[scancodeType.ordinal()];
        if (i == 1) {
            a(activity, maResult, 1);
        } else if (i == 2) {
            a(activity, maResult, 2);
        } else if (i == 3) {
            a(activity.getApplicationContext(), maResult);
        } else {
            this.n = true;
            return f(maResult);
        }
        return true;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.m;
        CT ct = CT.Button;
        TBS.Adv.ctrlClicked(ct, "HuoyanCatch", "costTime=" + currentTimeMillis);
    }

    private boolean f(final MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c58ab1b1", new Object[]{this, maResult})).booleanValue();
        }
        if (MaType.QR == maResult.getType() || MaType.TB_ANTI_FAKE == maResult.getType() || MaType.TB_4G == maResult.getType()) {
            return a(maResult, true);
        }
        if (MaType.EXPRESS == maResult.getType()) {
            final View inflate = this.b.getLayoutInflater().inflate(R.layout.plt_scan_dialog_express_choose, (ViewGroup) null);
            inflate.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.taobao.scancode.gateway.util.d.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                    }
                    return true;
                }
            });
            View findViewById = inflate.findViewById(R.id.fl_hint_container);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(Color.parseColor("#FFFFFF"));
            gradientDrawable.setCornerRadius(com.taobao.android.searchbaseframe.util.j.a(6.5f));
            findViewById.setBackground(gradientDrawable);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadius(com.taobao.android.searchbaseframe.util.j.a(6.5f));
            gradientDrawable2.setColor(Color.parseColor("#F3F6F8"));
            View findViewById2 = inflate.findViewById(R.id.btn_scan_product);
            findViewById2.setBackground(gradientDrawable2);
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taobao.scancode.gateway.util.d.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (d.this.g != null) {
                        d.this.g.a(d.this.b, inflate, 2);
                    }
                    d dVar = d.this;
                    d.a(dVar, dVar.b, maResult, 1);
                    cox.b("Page_PhotoSearchTake", "GoProduct", "barcode", maResult.getText(), "barcode_type", MaType.EXPRESS.name());
                    if (d.this.f21262a == null) {
                        return;
                    }
                    d.this.f21262a.startPreview();
                }
            });
            View findViewById3 = inflate.findViewById(R.id.btn_scan_express);
            findViewById3.setBackground(gradientDrawable2);
            findViewById3.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taobao.scancode.gateway.util.d.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (d.this.g != null) {
                        d.this.g.a(d.this.b, inflate, 2);
                    }
                    cox.b("Page_PhotoSearchTake", "GoExpress", "barcode", maResult.getText(), "barcode_type", MaType.EXPRESS.name());
                    d.this.b(maResult);
                    if (d.this.f21262a == null) {
                        return;
                    }
                    d.this.f21262a.startPreview();
                }
            });
            TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.btn_close);
            tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN019iypvt1bsfVo4ORaC_!!6000000003521-49-tps-144-144.webp");
            tUrlImageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taobao.scancode.gateway.util.d.17
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (d.this.g != null) {
                        d.this.g.a(d.this.b, inflate, 2);
                    }
                    cox.b("Page_PhotoSearchTake", "Close", "barcode", maResult.getText(), "barcode_type", MaType.EXPRESS.name());
                    if (d.this.f21262a == null) {
                        return;
                    }
                    d.this.f21262a.startPreview();
                }
            });
            if (this.g != null) {
                this.g.a(this.b, inflate, 1);
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_PhotoSearchTake", 2201, "Page_PhotoSearchTake_Express-ChooseView", "", "", new HashMap(1)).build());
            }
            return false;
        }
        if (this.f21262a != null) {
            this.f21262a.startPreview();
        }
        return true;
    }

    private boolean a(final MaResult maResult, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29a6bf46", new Object[]{this, maResult, new Boolean(z)})).booleanValue();
        }
        final String text = maResult.getText();
        final Context applicationContext = this.b.getApplicationContext();
        com.taobao.taobao.scancode.barcode.business.a aVar = new com.taobao.taobao.scancode.barcode.business.a(applicationContext);
        if (z && aVar.a(text, new a.InterfaceC0882a() { // from class: com.taobao.taobao.scancode.gateway.util.d.18
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobao.scancode.barcode.business.a.InterfaceC0882a
            public void a(final String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.taobao.scancode.gateway.util.d.18.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (text == null || text.equals(str2) || StringUtils.isEmpty(str2) || str2.startsWith("alipays://")) {
                                d.a(d.this, new MaResult(maResult.getType(), text), false);
                            } else {
                                try {
                                    j.a(applicationContext, d.this.i).a(str2);
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                        }
                    });
                }
            }
        })) {
            return false;
        }
        if (com.taobao.taobao.scancode.huoyan.util.f.a(text)) {
            if (StringUtils.equals(OrangeConfig.getInstance().getConfig("android_scancode_client", "enable_white_list_for_important_activity", ""), "true") && !android.taobao.windvane.config.p.c(text) && !android.taobao.windvane.config.p.a(text)) {
                TBMaterialDialog build = new TBMaterialDialog.Builder(this.b).build();
                build.setCancelable(true);
                build.setTitle(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18640));
                if (oxy.e()) {
                    str = com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18642);
                } else {
                    str = com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18637) + text + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18638);
                }
                build.setContent(str);
                build.setCanceledOnTouchOutside(true);
                build.show();
                return true;
            }
            a(text, maResult instanceof AlbumMaResult);
            this.f21262a.stopPreview();
            return false;
        } else if (GetQRMedicineUrlRequest.isQRMedicneCode(text)) {
            new GetQRMedicineUrlBussiness(new GetQRMedicineUrlBussiness.b() { // from class: com.taobao.taobao.scancode.gateway.util.CustomDecodeResultProcesser$8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taobao.scancode.barcode.business.GetQRMedicineUrlBussiness.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    LayoutInflater layoutInflater = d.this.b.getLayoutInflater();
                    Context context = applicationContext;
                    p.a(layoutInflater, context, context.getResources().getString(R.string.scancode_server_error));
                    new Handler().postDelayed(new Runnable() { // from class: com.taobao.taobao.scancode.gateway.util.CustomDecodeResultProcesser$8.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (d.this.f21262a == null) {
                            } else {
                                d.this.f21262a.startPreview();
                            }
                        }
                    }, 2500L);
                }

                @Override // com.taobao.taobao.scancode.barcode.business.GetQRMedicineUrlBussiness.b
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    } else {
                        j.a(applicationContext, d.this.i).a(str2);
                    }
                }
            }, text).handleMedicine();
            return true;
        } else {
            this.f.a(this.b, maResult);
            return false;
        }
    }

    private void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else if (!oxy.b()) {
        } else {
            com.taobao.taobao.scancode.huoyan.util.e.a(context, 31821L, str, new com.taobao.taobao.scancode.huoyan.util.d<PailitaoRecommendResp>() { // from class: com.taobao.taobao.scancode.gateway.util.d.19
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taobao.scancode.huoyan.util.d
                public void a(PailitaoRecommendResp pailitaoRecommendResp, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("36a2b769", new Object[]{this, pailitaoRecommendResp, str2});
                    } else {
                        android.taobao.util.k.a("DecodeProcessor", "antiFraudRequest: onHttpLoadingEnded");
                    }
                }

                @Override // com.taobao.taobao.scancode.huoyan.util.d
                public void a(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                    } else {
                        android.taobao.util.k.a("DecodeProcessor", "antiFraudRequest: onHttpLoadingFailed");
                    }
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        r6 = com.taobao.taobao.scancode.huoyan.util.f.a(r6, r1, "b.tb.cn");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r6, final boolean r7) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.taobao.scancode.gateway.util.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L1d
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r5
            r2 = 1
            r1[r2] = r6
            r6 = 2
            java.lang.Boolean r2 = new java.lang.Boolean
            r2.<init>(r7)
            r1[r6] = r2
            java.lang.String r6 = "8123ece2"
            r0.ipc$dispatch(r6, r1)
            return
        L1d:
            if (r6 == 0) goto L2e
            java.lang.String r0 = "HTTPS"
            boolean r1 = r6.startsWith(r0)
            if (r1 == 0) goto L2e
            java.lang.String r1 = "https"
            java.lang.String r6 = r6.replaceFirst(r0, r1)
            goto L3e
        L2e:
            if (r6 == 0) goto L3e
            java.lang.String r0 = "HTTP"
            boolean r1 = r6.startsWith(r0)
            if (r1 == 0) goto L3e
            java.lang.String r1 = "http"
            java.lang.String r6 = r6.replaceFirst(r0, r1)
        L3e:
            com.taobao.orange.OrangeConfig r0 = com.taobao.orange.OrangeConfig.getInstance()
            java.lang.String r1 = "android_scancode_client"
            java.lang.String r3 = "host_switch_list"
            java.lang.String r4 = ""
            java.lang.String r0 = r0.getConfig(r1, r3, r4)
            boolean r1 = android.text.StringUtils.isEmpty(r0)
            if (r1 != 0) goto L8c
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Exception -> L76
            r1.<init>(r6)     // Catch: java.lang.Exception -> L76
            java.lang.String r1 = r1.getHost()     // Catch: java.lang.Exception -> L76
            java.lang.String r3 = "\\|"
            java.lang.String[] r0 = r0.split(r3)     // Catch: java.lang.Exception -> L76
            int r3 = r0.length     // Catch: java.lang.Exception -> L76
        L62:
            if (r2 >= r3) goto L8c
            r4 = r0[r2]     // Catch: java.lang.Exception -> L76
            boolean r4 = r4.equalsIgnoreCase(r1)     // Catch: java.lang.Exception -> L76
            if (r4 == 0) goto L73
            java.lang.String r0 = "b.tb.cn"
            java.lang.String r6 = com.taobao.taobao.scancode.huoyan.util.f.a(r6, r1, r0)     // Catch: java.lang.Exception -> L76
            goto L8c
        L73:
            int r2 = r2 + 1
            goto L62
        L76:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " unsafe strCode :"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DecodeProcessor"
            android.taobao.util.k.a(r1, r0)
        L8c:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "comeFromType"
            java.lang.String r2 = "scan"
            r0.putString(r1, r2)
            boolean r1 = tb.oxy.a()
            if (r1 == 0) goto Lb6
            java.lang.String r7 = "code"
            r0.putString(r7, r6)
            android.support.v4.app.FragmentActivity r6 = r5.b
            tb.css r7 = r5.i
            com.taobao.taobao.scancode.gateway.util.j r6 = com.taobao.taobao.scancode.gateway.util.j.a(r6, r7)
            com.taobao.taobao.scancode.gateway.util.j r6 = r6.a(r0)
            java.lang.String r7 = "http://tb.cn/n/scancode/qr_result"
            r6.a(r7)
            return
        Lb6:
            boolean r1 = com.taobao.taobao.scancode.gateway.OpenlinkBizQrCodeMapping.a.a(r6)
            if (r1 == 0) goto Lc5
            com.taobao.taobao.scancode.gateway.util.d$2 r1 = new com.taobao.taobao.scancode.gateway.util.d$2
            r1.<init>()
            com.taobao.taobao.scancode.gateway.OpenlinkBizQrCodeMapping.a.a(r6, r1)
            return
        Lc5:
            com.taobao.taobao.scancode.gateway.util.UrlModifyAdapter r1 = new com.taobao.taobao.scancode.gateway.util.UrlModifyAdapter
            r1.<init>()
            com.taobao.taobao.scancode.gateway.util.d$3 r2 = new com.taobao.taobao.scancode.gateway.util.d$3
            r2.<init>()
            r1.a(r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taobao.scancode.gateway.util.d.a(java.lang.String, boolean):void");
    }

    private void a(String str, Bundle bundle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7b227b2", new Object[]{this, str, bundle, new Boolean(z)});
            return;
        }
        a(this.b.getApplicationContext(), str);
        if (StringUtils.indexOf(str, "http://ma.taobao.com/rl") == 0 || StringUtils.indexOf(str, "ma.taobao.com/rl") == 0) {
            str = LoginUrlConstants.getScanLoginUrl() + MyUrlEncoder.encod(str, "UTF-8");
        }
        if (!StringUtils.isEmpty(str)) {
            str = str.trim();
        }
        String a2 = r.a(str, z ? "_tbScancodeApproach_=photo" : "_tbScancodeApproach_=scan");
        if (i.a(this.b.getApplicationContext(), a2)) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.taobao.scancode.gateway.util.CustomDecodeResultProcesser$12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (d.this.f21262a == null) {
                            return;
                        }
                        d.this.f21262a.startPreview();
                    } catch (Throwable th) {
                        Log.e("DecodeProcessor", "some exceptions happened after invoking login url check.", th);
                    }
                }
            }, 10000L);
            return;
        }
        android.taobao.util.k.a("DecodeProcessor", "nav:" + a2);
        j.a(this.b, this.i).a(bundle).a(a2);
    }

    private void a(Context context, MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("101aa6da", new Object[]{this, context, maResult});
        } else if (maResult == null || StringUtils.isEmpty(maResult.getText())) {
        } else {
            String text = maResult.getText();
            if (StringUtils.equals(text.substring(0, 2), "2_") || StringUtils.equals(text.substring(0, 1), "=")) {
                Bundle bundle = new Bundle();
                bundle.putString("comeFromType", "scan");
                j a2 = j.a(context, this.i).a(bundle);
                a2.a("//s.tb.cn/o/0/" + text);
                return;
            }
            String config = OrangeConfig.getInstance().getConfig("android_scancode_client", "gen3_domain", "");
            if (StringUtils.isEmpty(config)) {
                config = "//m.tb.cn/";
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("comeFromType", "scan");
            j a3 = j.a(context, this.i).a(bundle2);
            a3.a(config + text);
        }
    }

    private boolean b(ScancodeResult scancodeResult) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be5f3af7", new Object[]{this, scancodeResult})).booleanValue();
        }
        if (StringUtils.isEmpty(this.j.g())) {
            return false;
        }
        String g = this.j.g();
        if (!this.j.g().contains("?")) {
            str = g + "?";
        } else {
            str = g + "&";
        }
        oxy.a(this.b.getApplicationContext(), str + "mActivityId=" + this.j.h() + "&type=" + this.j.i() + "&content=" + scancodeResult.code, this.i);
        return true;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.b.isFinishing()) {
        } else {
            TBS.Adv.ctrlClickedOnPage("ScanHome", CT.Button, "neterror");
            View inflate = this.b.getLayoutInflater().inflate(R.layout.scancode_gateway_no_network_history_alert, (ViewGroup) null);
            View findViewById = inflate.findViewById(R.id.btn_confirm);
            final TBMaterialDialog build = new TBMaterialDialog.Builder(this.b.getApplicationContext()).customView(inflate, false).build();
            build.setCancelable(false);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taobao.scancode.gateway.util.d.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    build.dismiss();
                    d.this.f21262a.startPreview();
                }
            });
            Context applicationContext = this.b.getApplicationContext();
            ((TextView) inflate.findViewById(R.id.tips)).setText(applicationContext.getResources().getString(R.string.scancode_gateway_no_network_history_tips, applicationContext.getResources().getString(R.string.uik_icon_time)));
            build.getWindow().setLayout(DensityUtil.dip2px(applicationContext, 298.0f), DensityUtil.dip2px(applicationContext, 210.0f));
            build.show();
        }
    }

    private boolean a(ScancodeResult scancodeResult, MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5be9ee4c", new Object[]{this, scancodeResult, maResult})).booleanValue();
        }
        if (scancodeResult.type != ScancodeType.QR && scancodeResult.type != ScancodeType.PRODUCT && scancodeResult.type != ScancodeType.MEDICINE && oxy.j() && scancodeResult.type != ScancodeType.EXPRESS && scancodeResult.type != ScancodeType.GEN3) {
            return false;
        }
        if (!android.taobao.util.g.a(this.b.getApplicationContext())) {
            b();
            a(scancodeResult, maResult, false);
            return true;
        }
        a(scancodeResult, maResult, true);
        return false;
    }

    public boolean b(MaResult maResult, KakaLibImageWrapper kakaLibImageWrapper, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3865f819", new Object[]{this, maResult, kakaLibImageWrapper, str})).booleanValue();
        }
        try {
            return a(maResult, kakaLibImageWrapper, str);
        } catch (Throwable unused) {
            return true;
        }
    }

    private void a(ScancodeResult scancodeResult, MaResult maResult, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21548d8c", new Object[]{this, scancodeResult, maResult, new Boolean(z)});
        } else {
            oyg.a(this.b.getApplication(), scancodeResult, maResult, z);
        }
    }

    private void a(final Activity activity, final MaResult maResult, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7218cc3", new Object[]{this, activity, maResult, new Integer(i)});
            return;
        }
        final Context applicationContext = activity.getApplicationContext();
        final oyc oycVar = new oyc(activity, this.j.j(), this.i);
        if (i == 1) {
            oycVar.a(maResult.getText(), 1, null);
        } else {
            new GetMedicineUrlBussiness(new GetMedicineUrlBussiness.b() { // from class: com.taobao.taobao.scancode.gateway.util.CustomDecodeResultProcesser$14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taobao.scancode.barcode.business.GetMedicineUrlBussiness.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    LayoutInflater layoutInflater = activity.getLayoutInflater();
                    Context context = applicationContext;
                    p.a(layoutInflater, context, context.getResources().getString(R.string.scancode_server_error));
                    new Handler().postDelayed(new Runnable() { // from class: com.taobao.taobao.scancode.gateway.util.CustomDecodeResultProcesser$14.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (d.this.f21262a == null) {
                            } else {
                                d.this.f21262a.startPreview();
                            }
                        }
                    }, 2500L);
                }

                @Override // com.taobao.taobao.scancode.barcode.business.GetMedicineUrlBussiness.b
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else {
                        oycVar.a(maResult.getText(), 3, str);
                    }
                }
            }, maResult.getText()).handleMedicine();
        }
    }

    @Override // com.taobao.taobao.scancode.gateway.util.e
    public void b(MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e284831", new Object[]{this, maResult});
        } else if (!android.taobao.util.g.a(this.b)) {
            this.f.a(this.b);
        } else if (Login.checkSessionValid()) {
            j(maResult);
        } else {
            k(maResult);
        }
    }

    private void j(MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ced1b29", new Object[]{this, maResult});
            return;
        }
        String text = maResult.getText();
        Uri.Builder buildUpon = Uri.parse("pages/logistic/logistic").buildUpon();
        buildUpon.appendQueryParameter("appName", "TAOBAOMINIAPP").appendQueryParameter("mailNo", text).appendQueryParameter("from", "shoutaosaoyisao").appendQueryParameter("querySourceId", "68719484962");
        String builder = buildUpon.toString();
        Uri.Builder buildUpon2 = Uri.parse("https://m.duanqu.com/").buildUpon();
        buildUpon2.appendQueryParameter(com.taobao.themis.kernel.i.APP_ID, "11509317").appendQueryParameter("query", "from=shoutaosaoyisao").appendQueryParameter("page", builder);
        String builder2 = buildUpon2.toString();
        String str = "url = " + builder2;
        if (j.a(this.b, this.i).a(builder2)) {
            return;
        }
        a(this, maResult);
    }

    private void k(final MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac5b588", new Object[]{this, maResult});
            return;
        }
        String text = maResult.getText();
        HashMap hashMap = new HashMap(2);
        hashMap.put("querySourceId", "68719484962");
        com.taobao.taobao.scancode.huoyan.util.e.a(this.b, text, "", "0", "0", "", "", "TAOSAOYISAO", "", JSON.toJSONString(hashMap), new com.taobao.taobao.scancode.huoyan.util.d<CainiaoLdDetailH5AuthGetResp>() { // from class: com.taobao.taobao.scancode.gateway.util.d.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobao.scancode.huoyan.util.d
            public void a(final CainiaoLdDetailH5AuthGetResp cainiaoLdDetailH5AuthGetResp, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("39d5fea8", new Object[]{this, cainiaoLdDetailH5AuthGetResp, str});
                } else {
                    d.this.b.runOnUiThread(new ac() { // from class: com.taobao.taobao.scancode.gateway.util.d.6.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.etao.feimagesearch.util.ac
                        public void a() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            CainiaoLdDetailH5AuthGetResp cainiaoLdDetailH5AuthGetResp2 = cainiaoLdDetailH5AuthGetResp;
                            if (cainiaoLdDetailH5AuthGetResp2 == null || cainiaoLdDetailH5AuthGetResp2.mo2429getData() == null || StringUtils.isEmpty(cainiaoLdDetailH5AuthGetResp.mo2429getData().getResult())) {
                                d.c(d.this, maResult);
                            } else if (j.a(d.this.b, d.this.i).a(cainiaoLdDetailH5AuthGetResp.mo2429getData().getResult())) {
                            } else {
                                d.b(d.this, maResult);
                            }
                        }
                    });
                }
            }

            @Override // com.taobao.taobao.scancode.huoyan.util.d
            public void a(Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                } else {
                    d.d(d.this, maResult);
                }
            }
        });
    }
}
