package com.ap.zoloz.hummer.common;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class BaseWebService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(333594240);
    }

    public abstract void exitPage(String str);

    public abstract void exitSession();

    public abstract boolean isPageAlreadyExisted(String str);

    public abstract void openPage(HashMap<String, Object> hashMap);
}
