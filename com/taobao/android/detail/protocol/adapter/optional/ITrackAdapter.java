package com.taobao.android.detail.protocol.adapter.optional;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.taobao.android.detail.protocol.model.constant.TrackType;
import java.io.Serializable;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes4.dex */
public interface ITrackAdapter extends Serializable {
    void commitEvent(String str, int i, Object obj, Object obj2, Object obj3, String... strArr);

    void commitEvent(String str, String str2, Properties properties);

    void ctrlClickedOnPage(Context context, String str, String str2, Pair<String, String>... pairArr);

    void ctrlClickedOnPage(String str, TrackType trackType, String str2, String... strArr);

    void newPageUpdate(Activity activity, String str, Map<String, String> map);

    void pageDestroy(String str);

    void pageEnter(Activity activity, String str, String str2, String str3);

    void pageLeave(Activity activity, String str, String str2);

    void pageUpdate(Activity activity, String str, Map<String, String> map);

    void pageUpdate(Activity activity, String str, Properties properties);
}
