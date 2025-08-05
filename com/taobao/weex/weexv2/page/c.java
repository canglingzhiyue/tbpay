package com.taobao.weex.weexv2.page;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import io.unicorn.adapter.UnicornAdapterJNI;
import java.util.Set;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WX_V2_CONFIG = "weex_v2_config";

    /* renamed from: a  reason: collision with root package name */
    private static c f23561a = new c();

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("fffed47f", new Object[0]) : f23561a;
    }

    private c() {
    }

    public String a(String str) {
        String replaceFirst;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && UnicornAdapterJNI.instance().libraryLoaded()) {
            String config = OrangeConfig.getInstance().getConfig("weex_v2_config", "url_map", "{\"market.m.taobao.com/app/newdetail/newdetail/pages/Home\":\"meta.m.taobao.com/app/detail-project/newdetail2/home201111\",\"market.m.taobao.com/app/newdetail/newdetail/pages/SuperItem\":\"meta.m.taobao.com/app/newdetail/super/home\"}");
            if (!TextUtils.isEmpty(config)) {
                try {
                    Uri parse = Uri.parse(str);
                    String uri = parse.buildUpon().clearQuery().build().toString();
                    JSONObject parseObject = JSON.parseObject(config);
                    Set<String> keySet = parseObject.keySet();
                    if (keySet != null) {
                        for (String str2 : keySet) {
                            if (uri.contains(str2)) {
                                String string = parseObject.getString(str2);
                                if (string.endsWith(".wlm")) {
                                    replaceFirst = (parse.isHierarchical() && parse.getQueryParameterNames().contains("_mus_tpl")) ? str.replaceFirst("_mus_tpl=" + parse.getQueryParameter("_mus_tpl"), "_mus_tpl=" + string) : str + "&_mus_tpl=" + string;
                                } else {
                                    replaceFirst = str.replaceFirst(str2, parseObject.getString(str2));
                                }
                                String replaceFirst2 = (parse.isHierarchical() && parse.getQueryParameterNames().contains("renderType")) ? replaceFirst.replaceFirst("renderType=" + parse.getQueryParameter("renderType"), "renderType=2") : replaceFirst + "&renderType=2";
                                String[] split2 = OrangeConfig.getInstance().getConfig("weex_v2_config", "dom_white_list", "").split(",");
                                if (split2 != null) {
                                    String str3 = replaceFirst2;
                                    for (String str4 : split2) {
                                        if (uri.contains(str4)) {
                                            str3 = (parse.isHierarchical() && parse.getQueryParameterNames().contains("weex_mode")) ? str3.replaceFirst("weex_mode=" + parse.getQueryParameter("weex_mode"), "weex_mode=dom") : str3 + "&weex_mode=dom";
                                        }
                                    }
                                    replaceFirst2 = str3;
                                }
                                String config2 = OrangeConfig.getInstance().getConfig("weex_v2_config", "transparent_url_list", "");
                                if (!TextUtils.isEmpty(config2) && (split = config2.split(",")) != null) {
                                    for (String str5 : split) {
                                        if (uri.contains(str5)) {
                                            if (parse.isHierarchical() && parse.getQueryParameterNames().contains("wx_opaque")) {
                                                return replaceFirst2.replaceFirst("wx_opaque=" + parse.getQueryParameter("wx_opaque"), "wx_opaque=0");
                                            }
                                            return replaceFirst2 + "&wx_opaque=0";
                                        }
                                    }
                                }
                                return replaceFirst2;
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }
}
