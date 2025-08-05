package com.taobao.android.festival.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.skin.SkinConfig;
import com.taobao.android.festival.skin.b;
import tb.gje;
import tb.gjh;
import tb.kge;

/* loaded from: classes5.dex */
public class TBSkinThemeWVPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(517648183);
    }

    public boolean getCurrentSkinInfo(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e65c77c0", new Object[]{this, wVCallBackContext, str})).booleanValue();
        }
        SkinConfig d = gje.a().d();
        if (d == null || !d.isValidConfig()) {
            r rVar = new r();
            rVar.a("errorMsg", "no selected skin");
            wVCallBackContext.error(rVar);
            return false;
        }
        r rVar2 = new r();
        rVar2.a("msg", JSON.toJSONString(d));
        wVCallBackContext.success(rVar2);
        return true;
    }

    public boolean setCurrentSkin(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8dc5fae6", new Object[]{this, wVCallBackContext, str})).booleanValue();
        }
        b.a().a(str, new gjh(wVCallBackContext));
        return true;
    }

    public boolean downloadSkin(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecd972f7", new Object[]{this, wVCallBackContext, str})).booleanValue();
        }
        b.a().b(str, new gjh(wVCallBackContext));
        return true;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getCurrentSkinInfo".equals(str)) {
            return getCurrentSkinInfo(wVCallBackContext, str2);
        }
        if ("setCurrentSkin".equals(str)) {
            return setCurrentSkin(wVCallBackContext, str2);
        }
        if ("downloadSkin".equals(str)) {
            return downloadSkin(wVCallBackContext, str2);
        }
        r rVar = new r();
        rVar.a("errorMsg", "no matched method");
        wVCallBackContext.error(rVar);
        return false;
    }
}
