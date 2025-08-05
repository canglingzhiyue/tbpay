package com.taobao.search.sf.widgets.list.floatbar;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.ium;
import tb.iur;
import tb.kge;

/* loaded from: classes8.dex */
public final class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final j INSTANCE;

    static {
        kge.a(-551198097);
        INSTANCE = new j();
    }

    private j() {
    }

    @JvmStatic
    public static final k a(com.taobao.search.mmd.datasource.bean.a aVar, Activity activity, ium parent, com.taobao.search.sf.a model, ViewGroup container, iur iurVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("3b0d391d", new Object[]{aVar, activity, parent, model, container, iurVar});
        }
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(model, "model");
        q.c(container, "container");
        String str = aVar != null ? aVar.q : null;
        if (str != null && str.hashCode() == 650716781 && str.equals("feedbackAI")) {
            return new a(activity, parent, model, container, iurVar);
        }
        return new k(activity, parent, model, container, iurVar);
    }
}
