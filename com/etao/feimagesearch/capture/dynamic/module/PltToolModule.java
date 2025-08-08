package com.etao.feimagesearch.capture.dynamic.module;

import android.graphics.Bitmap;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.pipline.c;
import com.etao.feimagesearch.util.d;
import com.etao.feimagesearch.util.o;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class PltToolModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String MODULE_NAME = "TBPltToolModule";

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6565a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ com.taobao.android.weex_framework.bridge.b c;

        public b(String str, JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar) {
            this.f6565a = str;
            this.b = jSONObject;
            this.c = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Bitmap bitmap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Uri parse = Uri.parse(this.f6565a);
            q.a((Object) parse, "Uri.parse(key)");
            String schemeSpecificPart = parse.getSchemeSpecificPart();
            q.a((Object) schemeSpecificPart, "Uri.parse(key).schemeSpecificPart");
            if (schemeSpecificPart == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String substring = schemeSpecificPart.substring(2);
            q.b(substring, "(this as java.lang.String).substring(startIndex)");
            Bitmap a2 = d.a(substring, false);
            if (a2 == null) {
                this.b.put((JSONObject) "isSuccess", (String) false);
                this.b.put((JSONObject) "errMsg", "LoadBitmapFailure");
                this.c.a(this.b);
                return;
            }
            try {
                bitmap = a2.copy(a2.getConfig(), true);
            } catch (OutOfMemoryError unused) {
                bitmap = null;
            }
            if (bitmap == null) {
                this.b.put((JSONObject) "isSuccess", (String) false);
                this.b.put((JSONObject) "errMsg", "CopyBitmapError");
                this.c.a(this.b);
                return;
            }
            String a3 = d.a(bitmap, Bitmap.CompressFormat.JPEG, 75);
            if (a3 == null) {
                a3 = "";
            }
            if (StringUtils.isEmpty(a3)) {
                this.b.put((JSONObject) "isSuccess", (String) false);
                this.b.put((JSONObject) "errMsg", "EncodeBitmapFailure");
                this.c.a(this.b);
                return;
            }
            this.b.put((JSONObject) "isSuccess", (String) true);
            this.b.put((JSONObject) o.KEY_IMG, a3);
            this.b.put((JSONObject) "imgWidth", (String) Integer.valueOf(bitmap.getWidth()));
            this.b.put((JSONObject) "imgHeight", (String) Integer.valueOf(bitmap.getHeight()));
            this.c.a(this.b);
            bitmap.recycle();
        }
    }

    static {
        kge.a(504007649);
        Companion = new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PltToolModule(String moduleName, MUSDKInstance mUSDKInstance) {
        super(moduleName, mUSDKInstance);
        q.c(moduleName, "moduleName");
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(556388841);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    @MUSMethod
    public final void getChituConfigValue(String str, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c4a488", new Object[]{this, str, bVar});
        } else if (bVar == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            if (StringUtils.isEmpty(str)) {
                jSONObject.put((JSONObject) "value", "");
                bVar.a(jSONObject);
                return;
            }
            jSONObject.put((JSONObject) "value", com.etao.feimagesearch.config.b.k(str));
            bVar.a(jSONObject);
        }
    }

    @MUSMethod
    public final void getOrangeConfigValue(String str, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27b72df3", new Object[]{this, str, bVar});
        } else if (bVar == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            if (StringUtils.isEmpty(str)) {
                jSONObject.put((JSONObject) "value", "");
                bVar.a(jSONObject);
                return;
            }
            jSONObject.put((JSONObject) "value", com.etao.feimagesearch.config.b.b(str, ""));
            bVar.a(jSONObject);
        }
    }

    @MUSMethod
    public final void getRainbowConfigValue(String str, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68547717", new Object[]{this, str, bVar});
        } else if (bVar == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            if (StringUtils.isEmpty(str)) {
                jSONObject.put((JSONObject) "value", "");
                bVar.a(jSONObject);
                return;
            }
            jSONObject.put((JSONObject) "value", com.etao.feimagesearch.config.b.a(str));
            bVar.a(jSONObject);
        }
    }

    @MUSMethod
    public final void loadWeexCacheImg(String str, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19074f30", new Object[]{this, str, bVar});
        } else if (bVar == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            if (str == null || StringUtils.isEmpty(str)) {
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((JSONObject) "isSuccess", (String) false);
                jSONObject2.put((JSONObject) "errMsg", "InvalidCacheKey");
                bVar.a(jSONObject);
                return;
            }
            c.a(new b(str, jSONObject, bVar));
        }
    }
}
