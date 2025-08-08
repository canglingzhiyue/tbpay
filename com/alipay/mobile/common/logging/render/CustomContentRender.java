package com.alipay.mobile.common.logging.render;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class CustomContentRender extends BaseRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String c;

    public CustomContentRender(LogContext logContext) {
        super(logContext);
        this.c = "%24%24";
        try {
            this.c = URLEncoder.encode("$$", "UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        return a(str) + "$$";
    }

    @Override // com.alipay.mobile.common.logging.render.BaseRender
    public final String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : StringUtils.isEmpty(str) ? str : str.replaceAll("\\$\\$", this.c);
    }
}
