package com.tmall.wireless.membershop.core;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.poplayer.config.model.keep.KeepModel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.util.Map;
import java.util.regex.Pattern;
import tb.tho;

/* loaded from: classes9.dex */
public class e implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "PerfectDeliveryNavProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        Uri data = intent.getData();
        if (data != null) {
            String string = Globals.getApplication().getSharedPreferences("tcg_urlNMiddleware_orange_preference", 0).getString("configList", "[{\"biz\":\"detail\",\"offSwitcher\":\"true\",\"type\":\"dinamic\",\"blackList\":\"a.m.taobao.com/sku\",\"dinamic\":\"https://m.duanqu.com?_ariver_appid=3000000028284614&query=routePage%3ddetail%26\",\"host\":\"a.m.taobao.com,detail.tmall.com,item.taobao.com,item.tmall.com,a.m.tmall.com,detail.m.tmall.com,chaoshi.detail.tmall.com,h5.m.taobao.com,h5.m.tmall.com,miao.item.tmall.com,miao.item.taobao.com,detail.tmall.hk,detail.m.tmall.hk,detail.wapa.tmall.com,auction1.wap.taobao.com,h5.m.wapa.taobao.com,a.wapa.tmall.com,a.wapa.taotao.com,a.waptest.tmall.com,a.waptest.taobao.com\",\"matchRegStr\":\"locType=(O2OOneHour|O2OPF)\"},{\"biz\":\"search\",\"offSwitcher\":\"true\",\"type\":\"min\",\"dinamic\":\"https://m.duanqu.com?_ariver_appid=3000000028284614&query=routePage%3dsearch%26\",\"private\":\"https://m.duanqu.com?_ariver_appid=3000000028284614&page=plugin-private%3A%2F%2F3000000026754413%2Fpages%2Findex%2Findex%3F\",\"min\":\"https://m.duanqu.com?_ariver_appid=3000000039406433&query=\",\"host\":\"s.m.tmall.com/m/searchbar.htm\",\"matchRegStr\":\"\"},{\"biz\":\"search\",\"offSwitcher\":\"true\",\"type\":\"min\",\"dinamic\":\"https://m.duanqu.com?_ariver_appid=3000000028284614&query=routePage%3dsearch%26\",\"private\":\"https://m.duanqu.com?_ariver_appid=3000000028284614&page=plugin-private%3A%2F%2F3000000026754413%2Fpages%2Findex%2Findex%3F\",\"min\":\"https://m.duanqu.com?_ariver_appid=3000000039406433&query=pageFrom%3DresultList\",\"host\":\"s.m.tmall.com/m/search.htm,list.tmall.com/search_product.htm,s.m.tmall.com/search.htm,s.m.tmall.com/m/supermarket.htm,s.m.tmall.com/m/chaoshi.htm,s.m.tmall.com/chaoshi.htm\",\"matchRegStr\":\"\"}]");
            if (!TextUtils.isEmpty(string)) {
                try {
                    JSONArray parseArray = JSONArray.parseArray(string);
                    for (int i = 0; i < parseArray.size(); i++) {
                        if (parseArray.getJSONObject(i).getBoolean("offSwitcher").booleanValue()) {
                            String string2 = parseArray.getJSONObject(i).getString("type");
                            String string3 = parseArray.getJSONObject(i).getString("host");
                            String string4 = parseArray.getJSONObject(i).getString(KeepModel.STRATEGY_BLACK_LIST);
                            String string5 = parseArray.getJSONObject(i).getString("matchRegStr");
                            if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3) && (TextUtils.isEmpty(string4) || !a(string4, data.toString()))) {
                                String string6 = parseArray.getJSONObject(i).getString(string2);
                                if (TextUtils.isEmpty(string6)) {
                                    continue;
                                } else if ((!TextUtils.isEmpty(string5) ? Pattern.compile(string5).matcher(intent.getDataString()).find() : true) && a(string3, data.getHost(), data.getPath())) {
                                    StringBuffer stringBuffer = new StringBuffer();
                                    stringBuffer.append(string6);
                                    if (!TextUtils.isEmpty(data.getEncodedQuery())) {
                                        stringBuffer.append(Uri.encode(data.getEncodedQuery()));
                                    }
                                    Nav.from(Globals.getApplication()).toUri(stringBuffer.toString());
                                    return false;
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return true;
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue() : a();
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b();
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        OrangeConfig.getInstance().getConfig(tho.TMCS_ORANGE_GROUP_NAME, "offMinNSwitcher", "false");
        OrangeConfig.getInstance().registerListener(new String[]{tho.TMCS_ORANGE_GROUP_NAME}, new com.taobao.orange.d() { // from class: com.tmall.wireless.membershop.core.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    return;
                }
                Globals.getApplication().getSharedPreferences("tcg_urlNMiddleware_orange_preference", 0).edit().putBoolean("offMinNSwitcher", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(tho.TMCS_ORANGE_GROUP_NAME, "offMinNSwitcher", "false"))).putString("configList", OrangeConfig.getInstance().getConfig(tho.TMCS_ORANGE_GROUP_NAME, "configList", "[{\"biz\":\"detail\",\"offSwitcher\":\"true\",\"type\":\"dinamic\",\"blackList\":\"a.m.taobao.com/sku\",\"dinamic\":\"https://m.duanqu.com?_ariver_appid=3000000028284614&query=routePage%3ddetail%26\",\"host\":\"a.m.taobao.com,detail.tmall.com,item.taobao.com,item.tmall.com,a.m.tmall.com,detail.m.tmall.com,chaoshi.detail.tmall.com,h5.m.taobao.com,h5.m.tmall.com,miao.item.tmall.com,miao.item.taobao.com,detail.tmall.hk,detail.m.tmall.hk,detail.wapa.tmall.com,auction1.wap.taobao.com,h5.m.wapa.taobao.com,a.wapa.tmall.com,a.wapa.taotao.com,a.waptest.tmall.com,a.waptest.taobao.com\",\"matchRegStr\":\"locType=(O2OOneHour|O2OPF)\"},{\"biz\":\"search\",\"offSwitcher\":\"true\",\"type\":\"min\",\"dinamic\":\"https://m.duanqu.com?_ariver_appid=3000000028284614&query=routePage%3dsearch%26\",\"private\":\"https://m.duanqu.com?_ariver_appid=3000000028284614&page=plugin-private%3A%2F%2F3000000026754413%2Fpages%2Findex%2Findex%3F\",\"min\":\"https://m.duanqu.com?_ariver_appid=3000000039406433&query=\",\"host\":\"s.m.tmall.com/m/searchbar.htm\",\"matchRegStr\":\"\"},{\"biz\":\"search\",\"offSwitcher\":\"true\",\"type\":\"min\",\"dinamic\":\"https://m.duanqu.com?_ariver_appid=3000000028284614&query=routePage%3dsearch%26\",\"private\":\"https://m.duanqu.com?_ariver_appid=3000000028284614&page=plugin-private%3A%2F%2F3000000026754413%2Fpages%2Findex%2Findex%3F\",\"min\":\"https://m.duanqu.com?_ariver_appid=3000000039406433&query=pageFrom%3DresultList\",\"host\":\"s.m.tmall.com/m/search.htm,list.tmall.com/search_product.htm,s.m.tmall.com/search.htm,s.m.tmall.com/m/supermarket.htm,s.m.tmall.com/m/chaoshi.htm,s.m.tmall.com/chaoshi.htm\",\"matchRegStr\":\"\"}]")).apply();
                OrangeConfig.getInstance().unregisterListener(new String[]{tho.TMCS_ORANGE_GROUP_NAME});
            }
        }, false);
        return Globals.getApplication().getSharedPreferences("tcg_urlNMiddleware_orange_preference", 0).getBoolean("offMinNSwitcher", false);
    }

    private static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        for (String str3 : str.split("\\,")) {
            if (str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{str, str2, str3})).booleanValue();
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            String[] split = str.split("\\,");
            String str4 = !TextUtils.isEmpty(str3) ? str2 + str3 : str2;
            for (int i = 0; i < split.length; i++) {
                if (str2.equals(split[i]) || str4.equals(split[i])) {
                    return true;
                }
            }
        }
        return false;
    }
}
