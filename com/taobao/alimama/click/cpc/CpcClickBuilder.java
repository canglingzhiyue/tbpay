package com.taobao.alimama.click.cpc;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.munion.taosdk.MunionUrlBuilder;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class CpcClickBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, String> mArgsMap = new HashMap();
    private String mEurl;

    static {
        kge.a(-720409555);
    }

    public CpcClickBuilder(String str) {
        this.mEurl = str;
    }

    public CpcClickBuilder withArgPid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpcClickBuilder) ipChange.ipc$dispatch("37bbc0ec", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            this.mArgsMap.put("epid", str);
        }
        return this;
    }

    public CpcClickBuilder withArgAUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpcClickBuilder) ipChange.ipc$dispatch("72f16ca9", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            this.mArgsMap.put("aurl", str);
        }
        return this;
    }

    public CpcClickBuilder withArgEadt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpcClickBuilder) ipChange.ipc$dispatch("5b1ecb0b", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            this.mArgsMap.put("eadt", str);
        }
        return this;
    }

    public CpcClickBuilder withArgIsOpenPage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpcClickBuilder) ipChange.ipc$dispatch("a6894fbe", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            this.mArgsMap.put("isOpenPage", "true");
        }
        return this;
    }

    public CpcClickBuilder withArg(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpcClickBuilder) ipChange.ipc$dispatch("2afcd98d", new Object[]{this, str, str2});
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            this.mArgsMap.put(str, str2);
        }
        return this;
    }

    public CpcClickBuilder withArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpcClickBuilder) ipChange.ipc$dispatch("b2d1dcdd", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            this.mArgsMap.putAll(map);
        }
        return this;
    }

    private void autoCompleteArg() {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11990eb5", new Object[]{this});
            return;
        }
        if (StringUtils.isEmpty(this.mArgsMap.get("epid"))) {
            String str = this.mArgsMap.get("aurl");
            if (!StringUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && parse.isHierarchical()) {
                String queryParameter = parse.getQueryParameter("epid");
                if (!StringUtils.isEmpty(queryParameter)) {
                    withArgPid(queryParameter);
                }
            }
        }
        try {
            if (this.mEurl == null) {
                return;
            }
            Uri parse2 = Uri.parse(this.mEurl);
            if (!parse2.isHierarchical()) {
                return;
            }
            if (StringUtils.isEmpty(this.mArgsMap.get("eadt"))) {
                withArgEadt(parse2.getQueryParameter("eadt"));
            }
            String queryParameter2 = parse2.getQueryParameter("mmAdArgs");
            String host = parse2.getHost();
            String path = parse2.getPath();
            withArg("mmAdArgs", queryParameter2);
            withArg("host", host);
            withArg("path", path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String commit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a70abe22", new Object[]{this});
        }
        autoCompleteArg();
        return new a(this.mEurl, this.mArgsMap).a();
    }

    public String commitAndAppendClickid(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57ce3726", new Object[]{this, str}) : MunionUrlBuilder.appendClickidToTargetUrl(str, commit());
    }
}
