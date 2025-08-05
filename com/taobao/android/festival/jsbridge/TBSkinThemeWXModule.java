package com.taobao.android.festival.jsbridge;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.skin.SkinConfig;
import com.taobao.android.festival.skin.b;
import com.taobao.android.festival.utils.a;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;
import java.io.Serializable;
import tb.gje;
import tb.gji;
import tb.kge;

/* loaded from: classes5.dex */
public class TBSkinThemeWXModule extends WXModule implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBSkinThemeWXModule";

    static {
        kge.a(-2085921550);
        kge.a(1028243835);
    }

    @WXModuleAnno
    public void setCurrentSkin(String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52c15e03", new Object[]{this, str, jSCallback});
            return;
        }
        String str2 = "setCurrentSkin: " + str;
        b.a().a(str, new gji(jSCallback, this.mWXSDKInstance.O()));
    }

    @WXModuleAnno
    public void downloadSkin(String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d499dd2", new Object[]{this, str, jSCallback});
        } else {
            b.a().b(str, new gji(jSCallback, this.mWXSDKInstance.O()));
        }
    }

    @WXModuleAnno
    public void getCurrentSkin(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6ba141", new Object[]{this, jSCallback});
            return;
        }
        gji gjiVar = new gji(jSCallback, this.mWXSDKInstance.O());
        SkinConfig d = gje.a().d();
        if (d == null || !d.isValidConfig() || a.a()) {
            gjiVar.a("", "NO_SKIN", "no selected skin");
            return;
        }
        gjiVar.a(JSON.toJSONString(d));
        String str = "getCurrentSkin: " + d.skinCode;
    }
}
