package com.taobao.mytaobao.newSettingV2.data;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.global.setting.c;
import com.taobao.tao.Globals;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.mxr;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f18391a;
    private final c b = c.a(Globals.getApplication(), "mytaobao");

    static {
        kge.a(605971820);
    }

    public a() {
        HashMap hashMap = new HashMap();
        f18391a = hashMap;
        hashMap.put("fontSize", mxr.KEY_FONT_SIZE);
        f18391a.put("countryArea", "region");
        f18391a.put("networkDiagnosis", mxr.KEY_NETWORK_DIAGNOSE);
        f18391a.put("networkAccelerate", mxr.KEY_NETWORK_SPEEDUP);
        f18391a.put(Constants.Name.AUTO_PLAY, "video");
        f18391a.put("backendPlay", mxr.KEY_LIVE_BACKGROUND_PLAY);
        f18391a.put("builtInVoice", mxr.KEY_INLINE_VOLUME);
        f18391a.put("frequentShop", mxr.KEY_VISIT_OFTEN_SHOP);
        f18391a.put("frequentLive", mxr.KEY_VISIT_OFTEN_LIVE);
        f18391a.put("homepageShake", mxr.KEY_HOMEPAGE_SHAKE);
        f18391a.put(mxr.KEY_CART_SHAKE, mxr.KEY_CART_SHAKE);
        f18391a.put("screenShotShare", "share");
        f18391a.put("localtionService", mxr.KEY_LOCATION_SERVICE);
        f18391a.put("ocr", "ocr");
        f18391a.put("accessibility", mxr.KEY_ASSISTANT);
        f18391a.put("tbAssistant", mxr.KEY_TAOBAO_HELPER);
        f18391a.put("notifiationBar", mxr.KEY_TMALL_NOTIFY);
        f18391a.put("voiceAssistant", mxr.KEY_VOICE_ASSISTANT);
        f18391a.put("wifiPreDownload", mxr.KEY_WIFI_AUTO_DOWNLOAD);
        f18391a.put("cleanCache", mxr.KEY_CLEAN_CACHE);
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String str2 = f18391a.get(str);
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r6.equals(tb.mxr.KEY_NETWORK_DIAGNOSE) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Boolean b(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mytaobao.newSettingV2.data.a.b(java.lang.String):java.lang.Boolean");
    }

    public String a(String str, NewGeneralSettingDataModel newGeneralSettingDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a786479a", new Object[]{this, str, newGeneralSettingDataModel});
        }
        if ("video".equals(str)) {
            return mxr.C();
        }
        if (mxr.KEY_CLEAN_CACHE.equals(str)) {
            return " ";
        }
        if (!"region".equals(str)) {
            return null;
        }
        return mxr.D();
    }

    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else {
            a(str, z, false);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r8.equals(tb.mxr.KEY_CART_SHAKE) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mytaobao.newSettingV2.data.a.a(java.lang.String, boolean, boolean):void");
    }
}
