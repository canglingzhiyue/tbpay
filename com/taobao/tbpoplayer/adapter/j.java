package com.taobao.tbpoplayer.adapter;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.norm.IPopLayerViewAdapter;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class j implements IPopLayerViewAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final j f22208a;

        static {
            kge.a(1195771649);
            f22208a = new j();
        }

        public static /* synthetic */ j a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("3e84a27d", new Object[0]) : f22208a;
        }
    }

    static {
        kge.a(1381792302);
        kge.a(1337585126);
    }

    public static j a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("3e84a27d", new Object[0]) : a.a();
    }

    @Override // com.alibaba.poplayer.norm.IPopLayerViewAdapter
    public boolean isHitBlackList(Uri uri, BaseConfigItem baseConfigItem, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8504e75f", new Object[]{this, uri, baseConfigItem, list})).booleanValue();
        }
        if (baseConfigItem != null && list != null && uri != null) {
            try {
                for (String str : list) {
                    if (!StringUtils.isEmpty(str)) {
                        Uri parse = Uri.parse(str);
                        if (StringUtils.isEmpty(uri.getHost()) || StringUtils.isEmpty(parse.getHost()) || uri.getHost().equals(parse.getHost())) {
                            String queryParameter = parse.getQueryParameter("uuid");
                            if (StringUtils.isEmpty(queryParameter) || queryParameter.equals(baseConfigItem.uuid)) {
                                String queryParameter2 = parse.getQueryParameter("params");
                                if (StringUtils.isEmpty(queryParameter2)) {
                                    return true;
                                }
                                JSONObject parseObject = JSON.parseObject(queryParameter2);
                                String str2 = baseConfigItem.type;
                                char c = 65535;
                                int hashCode = str2.hashCode();
                                String str3 = "webview";
                                if (hashCode != 3645441) {
                                    if (hashCode == 1224424441 && str2.equals(str3)) {
                                        c = 0;
                                    }
                                } else if (str2.equals("weex")) {
                                    c = 1;
                                }
                                if (c == 0) {
                                    str3 = "url";
                                } else if (c == 1) {
                                    str3 = "weexUrl";
                                }
                                if (parseObject.containsKey(str3) && !StringUtils.isEmpty(parseObject.getString(str3))) {
                                    JSONObject parseObject2 = JSON.parseObject(baseConfigItem.params);
                                    if (parseObject2 != null) {
                                        String string = parseObject.getString(str3);
                                        String string2 = parseObject2.getString(str3);
                                        if (!StringUtils.isEmpty(string2) && string2.contains(string)) {
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("IPopLayerViewAdapter.isHitBlackList.error.", th);
            }
        }
        return false;
    }
}
