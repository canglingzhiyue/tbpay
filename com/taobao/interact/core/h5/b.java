package com.taobao.interact.core.h5;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.ag;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.dvq;
import tb.ios;
import tb.kge;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean A;
    public boolean B;
    public int C;
    public int D;

    /* renamed from: a  reason: collision with root package name */
    public boolean f17595a;
    public String c;
    public String d;
    public String e;
    public String j;
    public String k;
    public boolean l;
    public boolean m;
    public String o;
    public int p;
    public String q;
    public JSONArray r;
    public int s;
    public int t;
    public String u;
    public int v;
    public int w;
    public JSONArray x;
    public JSONArray y;
    public boolean z;
    public boolean b = false;
    public String f = "image";
    public int g = 0;
    public int h = 104857600;
    public int i = -1;
    public boolean n = false;

    static {
        kge.a(756931334);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "JSONParams{hasCrop=" + this.l + ", hasFilter=" + this.m + ", isMultiable=" + this.n + ", isAutoUpload=" + this.f17595a + ", isUseNewUi=" + this.b + ", videoBizCode='" + this.e + "', mode='" + this.o + "', maxSelect=" + this.p + ", bizCode='" + this.q + "', files=" + this.r + ", targetWidth=" + this.s + ", targetHeight=" + this.t + ", enumRatio='" + this.u + "', ratioX=" + this.v + ", ratioY=" + this.w + ", wvFiles=" + this.x + ", stickerIdsArray=" + this.y + ", isUseOriginalSize=" + this.z + ", hasGraffiti=" + this.A + ", hasMosaic=" + this.B + ", orientation=" + this.C + '}';
    }

    public static b a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c1f96bdd", new Object[]{jSONObject});
        }
        b bVar = new b();
        bVar.f17595a = jSONObject.optInt("type", 0) == 1;
        bVar.b = jSONObject.optInt("isUseNewUi", 0) == 1;
        bVar.d = jSONObject.optString(ag.KEY_TAOKE_BIZSCENE);
        bVar.c = jSONObject.optString(ios.URL_KEY_BIZ_LINE);
        bVar.q = jSONObject.optString("bizCode");
        bVar.e = jSONObject.optString("videoBizCode");
        bVar.f = jSONObject.optString("mediaType");
        bVar.h = jSONObject.optInt("videoMaxSize");
        if (jSONObject.optInt("maxPhotoFileSize") > 0) {
            bVar.g = jSONObject.optInt("maxPhotoFileSize");
        } else {
            bVar.g = jSONObject.optInt(com.alibaba.ability.impl.photo.b.IMG_MAX_SIZE) > 0 ? jSONObject.optInt(com.alibaba.ability.impl.photo.b.IMG_MAX_SIZE) : 5000000;
        }
        bVar.i = jSONObject.optInt("videoMaxDuration");
        bVar.j = jSONObject.optString("finishButtonText");
        String optString = jSONObject.optString("crop");
        bVar.l = !"0".equalsIgnoreCase(optString) && !"false".equalsIgnoreCase(optString);
        bVar.u = jSONObject.optString("crop");
        bVar.m = "true".equalsIgnoreCase(jSONObject.optString("filter"));
        bVar.n = "1".equalsIgnoreCase(jSONObject.optString("mutipleSelection"));
        bVar.p = jSONObject.optInt("maxSelect", 6);
        bVar.o = jSONObject.optString("mode", "both");
        bVar.D = jSONObject.optInt("isdkv");
        bVar.k = jSONObject.optString("usernick");
        bVar.r = jSONObject.optJSONArray(dvq.FILES_DIR_NAME);
        JSONObject optJSONObject = jSONObject.optJSONObject("maxsize");
        if (optJSONObject != null) {
            bVar.s = optJSONObject.optInt("width", 0);
            bVar.t = optJSONObject.optInt("height", 0);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("ratio");
        if (optJSONObject2 != null) {
            bVar.v = optJSONObject2.optInt("x", 0);
            bVar.w = optJSONObject2.optInt("y", 0);
        }
        bVar.z = jSONObject.optInt("useOriginalSize", 0) == 1;
        bVar.A = jSONObject.optInt("graffiti", 0) == 1;
        if (jSONObject.optInt("mosaic", 0) != 1) {
            z = false;
        }
        bVar.B = z;
        bVar.C = jSONObject.optInt("orientation");
        return bVar;
    }
}
