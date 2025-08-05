package com.ali.user.mobile.base;

import android.content.DialogInterface;
import com.ali.user.mobile.model.RegionInfo;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public interface BaseView {
    void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2);

    void dismissLoading();

    boolean isActive();

    void onGetRegion(List<RegionInfo> list, HashMap<String, Integer> hashMap, List<String> list2);

    void showLoading();

    void toast(String str, int i);
}
