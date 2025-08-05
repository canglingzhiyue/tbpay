package com.alibaba.android.umbrella.weex;

import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.android.umbrella.link.i;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;
import java.util.Map;
import tb.bpp;

/* loaded from: classes2.dex */
public class UmbrellaWeexModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final UMLinkLogInterface umbrella = bpp.a();

    @JSMethod(uiThread = false)
    public void logInfo(String str, String str2, String str3, i iVar, Map<UMDimKey, Object> map, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f1c1ac", new Object[]{this, str, str2, str3, iVar, map, map2});
        } else {
            this.umbrella.logInfo(str, str2, str3, iVar, map, com.alibaba.android.umbrella.link.export.a.a(map2));
        }
    }

    @JSMethod(uiThread = false)
    public void commitFailure(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68fbbcd", new Object[]{this, str, str2, str3, str4, str5, map, str6, str7});
        } else {
            this.umbrella.commitFailure(str, str2, str3, str4, str5, map, str6, str7);
        }
    }

    @JSMethod(uiThread = false)
    public void commitSuccess(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5cd960", new Object[]{this, str, str2, str3, str4, str5, map});
        } else {
            this.umbrella.commitSuccess(str, str2, str3, str4, str5, map);
        }
    }
}
