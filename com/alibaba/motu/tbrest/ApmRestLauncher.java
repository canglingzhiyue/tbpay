package com.alibaba.motu.tbrest;

import android.app.Application;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes.dex */
public class ApmRestLauncher implements Serializable {
    private static volatile boolean init;

    static {
        kge.a(1853974032);
        kge.a(1028243835);
        init = false;
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        com.alibaba.motu.tbrest.rest.c.a();
    }
}
