package com.ali.user.mobile.utils;

import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.model.CountryCode;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.rpc.login.model.GroupedCountryCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class CountryCodeUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.CountryCodeUtil";

    static {
        kge.a(2071304095);
    }

    public static ArrayList<RegionInfo> fillData(String str, List<GroupedCountryCode> list, HashMap<String, Integer> hashMap, List<String> list2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("a47d4a0f", new Object[]{str, list, hashMap, list2});
        }
        ArrayList<RegionInfo> arrayList = new ArrayList<>();
        boolean isForigenLocation = DataProviderFactory.getDataProvider().isForigenLocation();
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            GroupedCountryCode groupedCountryCode = list.get(i);
            if (!isForigenLocation || !"#".equals(groupedCountryCode.index)) {
                List<CountryCode> list3 = groupedCountryCode.countryCodeList;
                int i3 = i2;
                int i4 = 0;
                while (i4 < list3.size()) {
                    CountryCode countryCode = list3.get(i4);
                    RegionInfo regionInfo = new RegionInfo();
                    if ("#".equals(groupedCountryCode.index)) {
                        regionInfo.character = str;
                        groupedCountryCode.index = "★";
                    } else {
                        regionInfo.character = groupedCountryCode.index;
                    }
                    if (i4 == 0) {
                        regionInfo.isDisplayLetter = z;
                        if (groupedCountryCode.index != null) {
                            hashMap.put(groupedCountryCode.index, Integer.valueOf(i3));
                            list2.add(groupedCountryCode.index);
                        } else {
                            LoginTLogAdapter.e(TAG, "error!! index can not be null!");
                        }
                    } else {
                        regionInfo.isDisplayLetter = false;
                    }
                    regionInfo.name = countryCode.name;
                    regionInfo.code = "" + countryCode.code;
                    regionInfo.domain = countryCode.domain;
                    regionInfo.checkPattern = countryCode.checkPattern;
                    regionInfo.pinyin = countryCode.pinyin;
                    i3++;
                    arrayList.add(regionInfo);
                    i4++;
                    z = true;
                }
                i2 = i3;
            }
            i++;
            z = true;
        }
        return arrayList;
    }
}
