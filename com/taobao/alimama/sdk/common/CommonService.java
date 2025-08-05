package com.taobao.alimama.sdk.common;

import android.app.Application;
import com.taobao.alimama.cpm.ifs.IfsBuilder;

/* loaded from: classes4.dex */
public interface CommonService {
    IfsBuilder buildIfsExposure(Application application, String str);

    String handleAdUrl(String str);

    String handleAdUrl(String str, boolean z);

    String handleAdUrl(String str, boolean z, boolean z2);

    String handleAdUrlForClickId(String str, boolean z);
}
