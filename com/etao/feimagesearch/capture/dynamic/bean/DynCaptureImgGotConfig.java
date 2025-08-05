package com.etao.feimagesearch.capture.dynamic.bean;

import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.pipline.node.b;
import com.etao.feimagesearch.pipline.node.d;
import com.etao.feimagesearch.pipline.node.f;
import com.etao.feimagesearch.pipline.node.g;
import com.etao.feimagesearch.util.m;
import com.taobao.search.mmd.util.c;
import com.taobao.weex.common.Constants;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.URLDecoder;
import java.util.Map;
import tb.cpx;
import tb.crj;
import tb.crq;
import tb.kge;
import tb.riy;

/* loaded from: classes3.dex */
public class DynCaptureImgGotConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String b;

    /* renamed from: a  reason: collision with root package name */
    private com.etao.feimagesearch.pipline.a f6514a = null;
    private cpx c = null;

    @Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface AlbumSupportMediaType {
    }

    static {
        kge.a(-2130915889);
    }

    public static DynCaptureImgGotConfig a(JSONObject jSONObject, cpx cpxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynCaptureImgGotConfig) ipChange.ipc$dispatch("6dd28d09", new Object[]{jSONObject, cpxVar});
        }
        if (jSONObject == null) {
            return null;
        }
        String a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "cropRect", "[0f,1.0f,0f,1.0f]");
        if (!a2.startsWith(riy.ARRAY_START_STR)) {
            a2 = riy.ARRAY_START_STR + a2 + riy.ARRAY_END_STR;
        }
        RectF a3 = m.a(a2);
        if (a3 == null) {
            return null;
        }
        DynCaptureImgGotConfig dynCaptureImgGotConfig = new DynCaptureImgGotConfig();
        dynCaptureImgGotConfig.a(cpxVar);
        com.etao.feimagesearch.pipline.a aVar = new com.etao.feimagesearch.pipline.a(new crq());
        com.etao.feimagesearch.pipline.node.a aVar2 = new com.etao.feimagesearch.pipline.node.a(a3);
        com.etao.feimagesearch.pipline.a.a(com.etao.feimagesearch.pipline.a.a(a(com.etao.feimagesearch.pipline.a.a((crj) null, aVar2), com.taobao.android.searchbaseframe.util.a.a(jSONObject, "checkProcessor", "")), new g(true, true, null, (int) (com.taobao.android.searchbaseframe.util.a.a(jSONObject, "compressionQuality", 0.7f) * 100.0f), com.taobao.android.searchbaseframe.util.a.a(jSONObject, Constants.Name.MAX_LENGTH, 640))), new f("", "", "", false));
        aVar.a((crj) aVar2, false);
        dynCaptureImgGotConfig.a(aVar);
        return dynCaptureImgGotConfig;
    }

    public static DynCaptureImgGotConfig b(JSONObject jSONObject, cpx cpxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynCaptureImgGotConfig) ipChange.ipc$dispatch("214b9f0a", new Object[]{jSONObject, cpxVar});
        }
        if (jSONObject == null) {
            return null;
        }
        DynCaptureImgGotConfig dynCaptureImgGotConfig = new DynCaptureImgGotConfig();
        dynCaptureImgGotConfig.a(cpxVar);
        dynCaptureImgGotConfig.b = a(com.taobao.android.searchbaseframe.util.a.a(jSONObject, "mediaType", "all"));
        com.etao.feimagesearch.pipline.a aVar = new com.etao.feimagesearch.pipline.a(new crq());
        d dVar = new d();
        com.etao.feimagesearch.pipline.a.a(com.etao.feimagesearch.pipline.a.a(a(com.etao.feimagesearch.pipline.a.a((crj) null, dVar), com.taobao.android.searchbaseframe.util.a.a(jSONObject, "checkProcessor", "")), new g(true, true, null, (int) (com.taobao.android.searchbaseframe.util.a.a(jSONObject, "compressionQuality", 0.7f) * 100.0f), com.taobao.android.searchbaseframe.util.a.a(jSONObject, Constants.Name.MAX_LENGTH, 640))), new f("", "", "", false));
        aVar.a((crj) dVar, false);
        dynCaptureImgGotConfig.a(aVar);
        return dynCaptureImgGotConfig;
    }

    public static DynCaptureImgGotConfig c(JSONObject jSONObject, cpx cpxVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynCaptureImgGotConfig) ipChange.ipc$dispatch("d4c4b10b", new Object[]{jSONObject, cpxVar});
        }
        if (jSONObject == null) {
            return null;
        }
        String a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "routerUrl", "");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        DynCaptureImgGotConfig dynCaptureImgGotConfig = new DynCaptureImgGotConfig();
        dynCaptureImgGotConfig.a(cpxVar);
        crq crqVar = new crq();
        Map<String, String> a3 = c.a(Uri.parse(a2));
        crqVar.a(a3);
        com.etao.feimagesearch.pipline.a aVar = new com.etao.feimagesearch.pipline.a(crqVar);
        try {
            str = URLDecoder.decode(a3.get(com.etao.feimagesearch.model.d.KEY_PIC_URL), "UTF-8");
        } catch (Exception unused) {
            str = "";
        }
        crqVar.a(Uri.parse(str));
        d dVar = new d();
        com.etao.feimagesearch.pipline.a.a(com.etao.feimagesearch.pipline.a.a(a(com.etao.feimagesearch.pipline.a.a((crj) null, dVar), com.taobao.android.searchbaseframe.util.a.a(jSONObject, "checkProcessor", "")), new g(true, true, null, (int) (com.taobao.android.searchbaseframe.util.a.a(jSONObject, "compressionQuality", 0.7f) * 100.0f), com.taobao.android.searchbaseframe.util.a.a(jSONObject, Constants.Name.MAX_LENGTH, 640))), new f("", "", "", false));
        aVar.a((crj) dVar, false);
        dynCaptureImgGotConfig.a(aVar);
        return dynCaptureImgGotConfig;
    }

    private static crj a(crj crjVar, String str) {
        boolean z;
        boolean z2;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crj) ipChange.ipc$dispatch("26ad9e84", new Object[]{crjVar, str});
        }
        if (TextUtils.isEmpty(str)) {
            return crjVar;
        }
        if (!TextUtils.isEmpty(str)) {
            boolean z3 = false;
            boolean z4 = false;
            for (String str2 : str.split(",")) {
                if ("face".equals(str2)) {
                    z3 = true;
                } else if ("watermark".equals(str2)) {
                    z4 = true;
                }
            }
            z2 = z3;
            z = z4;
        } else {
            z = false;
            z2 = false;
        }
        return (z2 || z) ? com.etao.feimagesearch.pipline.a.a(crjVar, new b(z, z, z2, null, null)) : crjVar;
    }

    public com.etao.feimagesearch.pipline.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.pipline.a) ipChange.ipc$dispatch("292194cf", new Object[]{this}) : this.f6514a;
    }

    public void a(com.etao.feimagesearch.pipline.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4307809", new Object[]{this, aVar});
        } else {
            this.f6514a = aVar;
        }
    }

    public cpx b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cpx) ipChange.ipc$dispatch("16b4fe32", new Object[]{this}) : this.c;
    }

    public void a(cpx cpxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e6894d", new Object[]{this, cpxVar});
        } else {
            this.c = cpxVar;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : "all".equals(this.b);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : (!TextUtils.isEmpty(str) && "image".equals(str)) ? "image" : "all";
    }
}
