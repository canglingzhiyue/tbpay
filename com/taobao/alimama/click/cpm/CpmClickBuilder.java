package com.taobao.alimama.click.cpm;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.munion.taosdk.MunionUrlBuilder;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class CpmClickBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, String> mArgsMap = new HashMap();
    private String mEurl;

    static {
        kge.a(1288722753);
    }

    public CpmClickBuilder(String str) {
        this.mEurl = str;
    }

    public CpmClickBuilder withArgPid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpmClickBuilder) ipChange.ipc$dispatch("b8187658", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.mArgsMap.put("epid", str);
        }
        return this;
    }

    public CpmClickBuilder withArgAUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpmClickBuilder) ipChange.ipc$dispatch("f34e2215", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.mArgsMap.put("aurl", str);
        }
        return this;
    }

    public CpmClickBuilder withArgEadt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpmClickBuilder) ipChange.ipc$dispatch("db7b8077", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.mArgsMap.put("eadt", str);
        }
        return this;
    }

    public CpmClickBuilder withArgIsOpenPage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpmClickBuilder) ipChange.ipc$dispatch("26e6052a", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            this.mArgsMap.put("isOpenPage", "true");
        }
        return this;
    }

    public CpmClickBuilder withArg(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpmClickBuilder) ipChange.ipc$dispatch("ab598ef9", new Object[]{this, str, str2});
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.mArgsMap.put(str, str2);
        }
        return this;
    }

    public CpmClickBuilder withArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpmClickBuilder) ipChange.ipc$dispatch("332e9249", new Object[]{this, map});
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
        if (TextUtils.isEmpty(this.mArgsMap.get("epid"))) {
            String str = this.mArgsMap.get("aurl");
            if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && parse.isHierarchical()) {
                String queryParameter = parse.getQueryParameter("epid");
                if (!TextUtils.isEmpty(queryParameter)) {
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
            if (TextUtils.isEmpty(this.mArgsMap.get("eadt"))) {
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
