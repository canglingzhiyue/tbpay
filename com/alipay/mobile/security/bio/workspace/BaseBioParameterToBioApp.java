package com.alipay.mobile.security.bio.workspace;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.api.BioParameter;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.FileUtil;
import com.alipay.mobile.security.bio.utils.SignHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/* loaded from: classes3.dex */
public abstract class BaseBioParameterToBioApp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final BioTransfer f5827a;
    public final Context b;

    public abstract BioAppDescription toBioApp(BioParameter bioParameter);

    public BaseBioParameterToBioApp(Context context, BioTransfer bioTransfer) {
        this.f5827a = bioTransfer;
        this.b = context;
    }

    public InputStream a(int i) throws IOException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("19d3f31e", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            str = Env.ONLINE.publicKeyAssetsName;
        } else if (1 == i) {
            str = Env.TEST.publicKeyAssetsName;
        } else {
            str = BioServiceManager.getEnv().publicKeyAssetsName;
        }
        return this.b.getAssets().open(str);
    }

    public static String loadPublicKey(Context context, int i) {
        byte[] assetsData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7fa13ee", new Object[]{context, new Integer(i)});
        }
        try {
            if (i == 0) {
                assetsData = FileUtil.getAssetsData(context, Env.ONLINE.publicKeyAssetsName);
            } else if (1 == i) {
                assetsData = FileUtil.getAssetsData(context, Env.TEST.publicKeyAssetsName);
            } else {
                assetsData = FileUtil.getAssetsData(context, BioServiceManager.getEnv().publicKeyAssetsName);
            }
            return new String(assetsData);
        } catch (Throwable th) {
            BioLog.e(th);
            return "";
        }
    }

    public static String getUniqueTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8646c186", new Object[0]);
        }
        UUID randomUUID = UUID.randomUUID();
        return SignHelper.MD5(System.currentTimeMillis() + "_" + (Math.random() * 10000.0d) + randomUUID.toString());
    }

    public String a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4684edd4", new Object[]{this, jSONObject, new Boolean(z)});
        }
        String string = jSONObject.getString("paperGuideUrl");
        String string2 = jSONObject.getString("showPaperGuide");
        String string3 = jSONObject.getString("certType");
        int intValue = jSONObject.getIntValue("paperStartPage");
        int intValue2 = jSONObject.getIntValue("paperTotalPage");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("showPaperGuide", (Object) string2);
        jSONObject2.put("paperGuideUrl", (Object) string);
        jSONObject2.put("certType", (Object) string3);
        jSONObject2.put("paperStartPage", (Object) Integer.valueOf(intValue));
        jSONObject2.put("paperTotalPage", (Object) Integer.valueOf(intValue2));
        jSONObject2.put("fcToken", (Object) this.f5827a.fcToken);
        this.f5827a.mFcSpecialData = jSONObject2;
        if (z) {
            return jSONObject.getString("papersCfg");
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("content", (Object) jSONObject.getString("papersCfg"));
        return jSONObject3.toString();
    }

    public String b(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47bb40b3", new Object[]{this, jSONObject, new Boolean(z)});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("f", (Object) "fc");
        jSONObject2.put("fcToken", (Object) this.f5827a.fcToken);
        this.f5827a.mFcSpecialData = jSONObject2;
        if (z) {
            return jSONObject.getString("faceCfg");
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("content", (Object) jSONObject.getString("faceCfg"));
        return jSONObject3.toString();
    }
}
