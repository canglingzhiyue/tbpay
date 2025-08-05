package com.taobao.android.editionswitcher;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.util.StringUtil;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final LinkedHashMap<String, PositionInfo> f12291a;

    static {
        kge.a(2142119957);
        LinkedHashMap<String, PositionInfo> linkedHashMap = new LinkedHashMap<>(40);
        f12291a = linkedHashMap;
        linkedHashMap.put("OLD", new PositionInfo("亲情版", "CN", "156", "zh-CN", "zh-CN", "CNY", "CN|zh-CN|CNY|156", "OLD"));
        f12291a.put("CUN", new PositionInfo("乡村地区", "CN", "156", "zh-CN", "zh-CN", "CNY", "CN|zh-CN|CNY|156", "CUN"));
        f12291a.put("CN", new PositionInfo("中国大陆", "CN", "156", "zh-CN", "zh-CN", "CNY", "CN|zh-CN|CNY|156", "CN"));
        f12291a.put("HK", new PositionInfo("中国香港", "HK", "344", "zh-HK", "zh-HK", "HKD", "HK|zh-HK|HKD|344", "HK"));
        f12291a.put("MO", new PositionInfo("中国澳门", "MO", "446", "zh-MO", "zh-MO", "MOP", "MO|zh-HK|MOP|446", "MO"));
        f12291a.put("TW", new PositionInfo("中国台湾", "TW", "158", "zh-TW", "zh-TW", "TWD", "TW|zh-TW|TWD|158", "TW"));
        f12291a.put("SG", new PositionInfo("新加坡", "SG", "702", "en-SG", "zh-CN", "SGD", "SG|zh-CN|SGD|702", "SG"));
        f12291a.put("MY", new PositionInfo("马来西亚", "MY", "458", "ms-MY", "zh-CN", "MYR", "MY|zh-CN|MYR|458", "MY"));
        f12291a.put("CA", new PositionInfo("加拿大", "CA", "124", "en-CA", "zh-CN", "CAD", "CA|zh-CN|CAD|124", "CA"));
        f12291a.put("AU", new PositionInfo("澳大利亚", "AU", "36", "en-AU", "zh-CN", "AUD", "AU|zh-CN|AUD|36", "AU"));
        f12291a.put("NZ", new PositionInfo("新西兰", "NZ", "554", "en-NZ", "zh-CN", "NZD", "NZ|zh-CN|NZD|554", "NZ"));
        f12291a.put("JP", new PositionInfo("日本", "JP", "392", "ja-JP", "zh-CN", "JPY", "JP|zh-CN|JPY|392", "JP"));
        f12291a.put("KR", new PositionInfo("韩国", "KR", "410", "ko-KR", "zh-CN", "KRW", "KR|zh-CN|KRW|410", "KR"));
        f12291a.put("VN", new PositionInfo("越南", "VN", "704", "vi-VN", "zh-CN", "VND", "VN|zh-CN|VND|704", "VN"));
        f12291a.put("TH", new PositionInfo("泰国", "TH", "764", "th-TH", "zh-CN", "THB", "TH|zh-CN|THB|764", "TH"));
        f12291a.put("PH", new PositionInfo("菲律宾", "PH", "608", "en-PH", "zh-CN", "PHP", "PH|zh-CN|PHP|608", "PH"));
        f12291a.put("KH", new PositionInfo("柬埔寨", "KH", "116", "km-KH", "zh-CN", "KHR", "KH|zh-CN|KHR|116", "KH"));
        f12291a.put("GLOBAL", new PositionInfo("全球", "GLOBAL", "999", "zh-CN", "zh-CN", "USD", "GLOBAL|zh-CN|USD|999", "GLOBAL"));
    }

    public static LinkedHashMap<String, PositionInfo> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("c2be5284", new Object[0]);
        }
        try {
            List<PositionInfo> list = (List) JSON.parseObject(OrangeConfig.getInstance().getConfig("edition_switcher", "incrementCountries", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264), new TypeReference<List<PositionInfo>>() { // from class: com.taobao.android.editionswitcher.d.1
            }, new Feature[0]);
            if (list != null && !list.isEmpty()) {
                for (PositionInfo positionInfo : list) {
                    f12291a.put(positionInfo.countryCode, positionInfo);
                }
            }
            String config = OrangeConfig.getInstance().getConfig("edition_switcher", "removeCountries", "");
            if (!StringUtil.isEmpty(config)) {
                for (String str : Arrays.asList(config.split(","))) {
                    f12291a.remove(str);
                }
            }
        } catch (Exception unused) {
        }
        return f12291a;
    }

    public static PositionInfo b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PositionInfo) ipChange.ipc$dispatch("17452200", new Object[0]);
        }
        PositionInfo a2 = a("CN");
        a2.cityName = "HangZhou";
        a2.cityId = "HZ";
        return a2;
    }

    public static PositionInfo a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PositionInfo) ipChange.ipc$dispatch("41fdd449", new Object[]{str});
        }
        if (f12291a.containsKey(str)) {
            return f12291a.get(str).newInstance();
        }
        return f12291a.get("GLOBAL").newInstance();
    }
}
