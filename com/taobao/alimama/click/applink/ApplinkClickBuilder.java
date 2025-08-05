package com.taobao.alimama.click.applink;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.utils.c;
import com.taobao.munion.taosdk.MunionUrlBuilder;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.kuh;

/* loaded from: classes4.dex */
public class ApplinkClickBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, String> mArgsMap = new HashMap();
    private String mLinkUrl;

    static {
        kge.a(1869823927);
    }

    public ApplinkClickBuilder(String str) {
        this.mLinkUrl = str;
    }

    public ApplinkClickBuilder withArgEadt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApplinkClickBuilder) ipChange.ipc$dispatch("fad0bbc1", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.mArgsMap.put("eadt", str);
        }
        return this;
    }

    public ApplinkClickBuilder withArgIsOpenPage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApplinkClickBuilder) ipChange.ipc$dispatch("3150dd74", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            this.mArgsMap.put("isOpenPage", "true");
        }
        return this;
    }

    public ApplinkClickBuilder withArg(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApplinkClickBuilder) ipChange.ipc$dispatch("15812843", new Object[]{this, str, str2});
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.mArgsMap.put(str, str2);
        }
        return this;
    }

    public ApplinkClickBuilder withArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApplinkClickBuilder) ipChange.ipc$dispatch("1b05db93", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            this.mArgsMap.putAll(map);
        }
        return this;
    }

    private void autoCompleteArg() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11990eb5", new Object[]{this});
        } else if (!c.e() || !TextUtils.isEmpty(this.mArgsMap.get("eadt")) || (str = this.mLinkUrl) == null) {
        } else {
            Uri parse = Uri.parse(str);
            if (!parse.isHierarchical()) {
                return;
            }
            String queryParameter = parse.getQueryParameter(kuh.ALI_TRACK_ID);
            if (queryParameter == null) {
                queryParameter = "";
            }
            if (queryParameter.startsWith("2:mm")) {
                return;
            }
            String[] split = queryParameter.split("_", 2);
            if (split.length < 2) {
                return;
            }
            String str2 = split[0];
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            withArgEadt(str2);
        }
    }

    public String commit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a70abe22", new Object[]{this});
        }
        autoCompleteArg();
        return new a(this.mLinkUrl, this.mArgsMap).a();
    }

    public String commitAndAppendClickid(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57ce3726", new Object[]{this, str}) : MunionUrlBuilder.appendClickidToTargetUrl(str, commit());
    }
}
