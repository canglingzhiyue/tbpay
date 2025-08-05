package com.taobao.android.jarviswe.tracker;

import java.util.Map;

/* loaded from: classes5.dex */
public interface JarvisTracker {
    void onAreaAppear(String str, Map<String, String> map);

    void onClick(String str, Map<String, String> map);

    void onItemAppear(String str, String str2, Map<String, String> map);

    void onItemDisappear(String str, String str2);

    void onPageAppear();

    void onPageCreate(String str, Map<String, String> map);

    void onPageDestroy();

    void onPageDisappear();

    void onPopupAppear(String str, Map<String, String> map);

    void onPopupDisappear();

    void updateAreaArgs(Map<String, String> map);

    void updatePageArgs(Map<String, String> map);

    void updatePopupArgs(Map<String, String> map);
}
