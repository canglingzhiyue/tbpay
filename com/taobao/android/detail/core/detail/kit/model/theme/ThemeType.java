package com.taobao.android.detail.core.detail.kit.model.theme;

import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public enum ThemeType {
    Theme1("theme1", R.array.detail_theme1),
    Theme2("theme2", R.array.detail_theme2),
    Theme3("theme3", R.array.detail_theme3),
    Theme4("theme4", R.array.detail_theme4),
    Theme5("theme5", R.array.detail_theme5),
    Theme6("theme6", R.array.detail_theme6),
    Theme7("theme7", R.array.detail_theme7),
    Theme8("theme8", R.array.detail_theme8),
    Theme9("theme9", R.array.detail_theme9),
    Theme10("theme10", R.array.detail_theme10),
    Theme11("theme11", R.array.detail_theme11),
    Theme12("theme12", R.array.detail_theme12),
    Theme13("theme13", R.array.detail_theme13),
    Theme14("theme14", R.array.detail_theme14);
    
    public String name;
    public int resId;

    ThemeType(String str, int i) {
        this.name = str;
        this.resId = i;
    }
}
