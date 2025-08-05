package com.taobao.android;

import android.app.Activity;
import java.util.Map;

/* loaded from: classes4.dex */
public interface AliUserTrackerInterface {
    Map<String, String> a(Activity activity);

    void a(int i, Object obj, Object obj2, Object obj3, String... strArr);

    void a(Object obj);

    void a(Object obj, String str);

    void a(Object obj, Map<String, String> map);

    void a(String str, int i, Object obj, Object obj2, Object obj3, String... strArr);

    void a(String str, AliUserTrackerCT aliUserTrackerCT, String str2, String... strArr);

    void b(Object obj, String str);

    void b(String str, AliUserTrackerCT aliUserTrackerCT, String str2, String... strArr);
}
