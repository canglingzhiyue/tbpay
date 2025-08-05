package com.taobao.android.fluid.framework.adapter;

import android.app.Activity;
import android.net.Uri;
import com.taobao.android.fluid.core.FluidContext;
import java.util.Map;

/* loaded from: classes5.dex */
public interface IUTAdapter extends IAdapter {
    public static final String ADAPTER_NAME = "IUTAdapter";

    Map<String, String> getPageAllProperties(Activity activity);

    void pageAppear(Object obj);

    void pageAppearDoNotSkip(Object obj);

    void pageDisAppear(Object obj);

    void skipPage(Object obj);

    void track4Click(String str, String str2, Map<String, String> map);

    void track4Show(String str, String str2, Map<String, String> map);

    void track4Show2202(String str, String str2, Map<String, String> map);

    void trackCustom(String str, int i, String str2, String str3, String str4, Map<String, String> map);

    void trackCustom(String str, String str2, Map<String, String> map);

    void updateNextPageUtParam(String str);

    void updateNextPageUtParam(Map<String, String> map);

    void updatePageName(Object obj, String str);

    void updatePageProperties(Object obj, Map<String, String> map);

    void updatePageUrl(Object obj, Uri uri);

    IUTAdapter withFluidContext(FluidContext fluidContext);
}
