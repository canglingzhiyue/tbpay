package com.taobao.android.detail.wrapper.ext.windvane.wvplugin;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import java.util.Map;
import tb.emu;
import tb.epq;
import tb.kge;

@Deprecated
/* loaded from: classes5.dex */
public class OpenWindowPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_NAME = "DetailBase";

    static {
        kge.a(408473722);
    }

    public static /* synthetic */ Object ipc$super(OpenWindowPlugin openWindowPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public OpenWindowPlugin() {
        emu.a("com.taobao.android.detail.wrapper.ext.windvane.wvplugin.OpenWindowPlugin");
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"openWindow".equals(str)) {
            return false;
        }
        return openWindow(str2);
    }

    private boolean openWindow(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9756c9ef", new Object[]{this, str})).booleanValue();
        }
        try {
            String str2 = (String) ((Map) JSON.parseObject(str, Map.class)).get("url");
            if (TextUtils.isEmpty(str2)) {
                return false;
            }
            i.d("Page_detail", "open window");
            if (this.mContext != null) {
                i.d("Page_detail", "open window onSuccess");
                epq.a(this.mContext, str2);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
