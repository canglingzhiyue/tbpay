package com.taobao.themis.mix.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/mix/utils/MixPageInfo;", "Ljava/io/Serializable;", "()V", "pagePath", "", "getPagePath", "()Ljava/lang/String;", "setPagePath", "(Ljava/lang/String;)V", "pageType", "getPageType", "setPageType", "pageUrl", "getPageUrl", "setPageUrl", "themis_mix_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class MixPageInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String pagePath;
    private String pageType;
    private String pageUrl;

    static {
        kge.a(195587986);
        kge.a(1028243835);
    }

    public final String getPageType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("85bdc7a", new Object[]{this}) : this.pageType;
    }

    public final void setPageType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfd0d3c", new Object[]{this, str});
        } else {
            this.pageType = str;
        }
    }

    public final String getPageUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("72d4e50f", new Object[]{this}) : this.pageUrl;
    }

    public final void setPageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eecb45af", new Object[]{this, str});
        } else {
            this.pageUrl = str;
        }
    }

    public final String getPagePath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13ccd86f", new Object[]{this}) : this.pagePath;
    }

    public final void setPagePath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0ab8fe7", new Object[]{this, str});
        } else {
            this.pagePath = str;
        }
    }
}
