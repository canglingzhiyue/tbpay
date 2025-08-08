package com.taobao.android.detail.ttdetail.widget.webview.plugin;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.l;
import java.util.Map;
import tb.kge;

@Deprecated
/* loaded from: classes5.dex */
public class OpenWindowPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_NAME = "DetailBase";

    static {
        kge.a(1238080539);
    }

    public static /* synthetic */ Object ipc$super(OpenWindowPlugin openWindowPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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
            if (StringUtils.isEmpty(str2)) {
                return false;
            }
            i.a("Page_detail", "open window");
            if (this.mContext != null) {
                i.a("Page_detail", "open window onSuccess");
                l.a(this.mContext, str2);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
