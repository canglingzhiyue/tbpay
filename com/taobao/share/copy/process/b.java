package com.taobao.share.copy.process;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.copy.process.StorebackFlowData;
import com.taobao.share.globalmodel.e;
import com.taobao.statistic.TBS;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.shop.common.ShopConstants;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mtopsdk.mtop.domain.MethodEnum;
import tb.kge;
import tb.nyy;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ShareUrlProcess";

    /* renamed from: a  reason: collision with root package name */
    public static int f19609a;
    private Uri b;
    private String c;
    private String d;
    private String e;
    private List<String> f;
    private Handler g;
    private Handler h;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static b f19612a;

        static {
            kge.a(-1130137253);
            f19612a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("51c4286e", new Object[0]) : f19612a;
        }
    }

    public static /* synthetic */ boolean a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2d230af2", new Object[]{bVar})).booleanValue() : bVar.b();
    }

    public static /* synthetic */ void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e75a78d", new Object[]{bVar});
        } else {
            bVar.c();
        }
    }

    private b() {
        this.b = null;
        this.c = null;
        this.d = "";
        this.e = "";
        this.f = new ArrayList();
        this.h = new Handler(Looper.getMainLooper());
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("51c4286e", new Object[0]) : a.a();
    }

    static {
        kge.a(1066262664);
        f19609a = 1;
    }

    public boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
        }
        if (intent != null && intent.getData() != null) {
            this.b = intent.getData();
            Uri uri = this.b;
            if (uri != null && uri.isHierarchical()) {
                if (this.g != null) {
                    a(this.b);
                }
                this.h.removeCallbacksAndMessages(null);
                nyy.b(TAG, "startRedirect onActivityCreated: " + this.b.toString());
                return b();
            }
        }
        return false;
    }

    public boolean b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15320aa", new Object[]{this, intent})).booleanValue();
        }
        if (intent != null && intent.getData() != null) {
            this.b = intent.getData();
            Uri uri = this.b;
            if (uri != null && uri.isHierarchical()) {
                boolean z = !this.b.toString().startsWith(ShopConstants.SHOP_URI);
                if (TextUtils.isEmpty(this.b.getQueryParameter("ut_sk"))) {
                    z = false;
                }
                boolean equals = "true".equals(OrangeConfig.getInstance().getConfig("android_share", "fixUtTrack", "true"));
                if (!z) {
                    return false;
                }
                if (equals) {
                    this.h.postDelayed(new Runnable() { // from class: com.taobao.share.copy.process.b.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                b.a(b.this);
                            }
                        }
                    }, Integer.parseInt(OrangeConfig.getInstance().getConfig("android_share", "fixUtTrackDelayed", "3000")));
                }
                this.g = new Handler(Looper.getMainLooper());
                return true;
            }
        }
        return false;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!this.b.isHierarchical() || this.b.toString().startsWith(ShopConstants.SHOP_URI)) {
            return false;
        }
        String queryParameter = this.b.getQueryParameter("ut_sk");
        if (TextUtils.isEmpty(queryParameter)) {
            return false;
        }
        String uri = this.b.toString();
        if (uri.contains("h5.waptest.taobao.com/scan/transit-sms.html") || uri.contains("h5.wapa.taobao.com/scan/transit-sms.html") || uri.contains("h5.m.taobao.com/scan/transit-sms.html")) {
            uri = this.b.getQueryParameter("url");
        }
        if (TextUtils.isEmpty(uri)) {
            uri = this.b.toString();
        }
        String[] split = queryParameter.split("\\.");
        if (split.length > 2) {
            String str = null;
            if (split.length > 3) {
                str = split[3];
            }
            String queryParameter2 = this.b.getQueryParameter("app");
            HashMap hashMap = new HashMap();
            hashMap.put("passwordKey", com.taobao.share.copy.a.a().c);
            if (TextUtils.isEmpty(queryParameter2)) {
                String str2 = split[2];
                TBS.Ext.commitEvent(5004, str, str2, uri, hashMap.toString() + "," + e.b().m());
                a(uri);
            } else {
                hashMap.put("app", queryParameter2);
                String str3 = split[2];
                TBS.Ext.commitEvent(5004, str, str3, uri, hashMap.toString() + "," + e.b().m());
                a(uri);
            }
        }
        return true;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        StorebackFlowData.StorebackflowdataRequest storebackflowdataRequest = new StorebackFlowData.StorebackflowdataRequest();
        storebackflowdataRequest.shareUrl = str;
        RemoteBusiness.build(com.taobao.share.copy.a.a().f19604a, storebackflowdataRequest, com.taobao.share.copy.a.a().b).asyncRequest();
    }

    private void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{this, uri});
        } else if (this.g == null || "true".equals(OrangeConfig.getInstance().getConfig("android_share", "storeRedirectUrlOff", "false"))) {
        } else {
            String uri2 = uri.toString();
            if (TextUtils.isEmpty(this.d)) {
                nyy.b(TAG, "startRedirect init: " + uri2);
                this.d = uri2;
            }
            if (TextUtils.equals(uri2, this.e)) {
                return;
            }
            this.e = uri2;
            this.f.add(uri2);
            nyy.b(TAG, "startRedirect add: " + uri2.length() + " = " + uri2);
            try {
                if (this.b.isHierarchical() && !TextUtils.isEmpty(this.b.getQueryParameter("targetUrl"))) {
                    String decode = URLDecoder.decode(this.b.getQueryParameter("targetUrl"), "utf-8");
                    this.f.add(decode);
                    nyy.b(TAG, "startRedirect targetUrl add: = " + decode);
                } else if (uri2.contains("weex_original_url=")) {
                    String decode2 = URLDecoder.decode(uri2.split("weex_original_url=")[1], "utf-8");
                    this.f.add(decode2);
                    nyy.b(TAG, "startRedirect weex_original_url add:  = " + decode2);
                }
            } catch (Throwable unused) {
            }
            this.g.removeCallbacksAndMessages(null);
            this.g.postDelayed(new Runnable() { // from class: com.taobao.share.copy.process.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.b(b.this);
                    }
                }
            }, Integer.parseInt(OrangeConfig.getInstance().getConfig("android_share", "redirectTrackDelayed", "3000")));
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.f.size() > 1) {
            StorebackFlowData.StoreRedirectUrlRequest storeRedirectUrlRequest = new StorebackFlowData.StoreRedirectUrlRequest();
            storeRedirectUrlRequest.targetUrl = this.d;
            storeRedirectUrlRequest.redirectUrlList = this.f;
            nyy.b(TAG, "notifyRedirect: " + this.d + " -> " + JSON.toJSONString(this.f));
            ((RemoteBusiness) RemoteBusiness.build(com.taobao.share.copy.a.a().f19604a, storeRedirectUrlRequest, com.taobao.share.copy.a.a().b).mo1305reqMethod(MethodEnum.POST)).asyncRequest();
        }
        this.d = null;
        this.e = null;
        this.f.clear();
        this.g = null;
    }
}
