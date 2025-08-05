package com.taobao.themis.pub_kit.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/themis/pub_kit/utils/PubPHAInjectJS;", "", "()V", "getPHAInjectJS", "", "context", "Landroid/content/Context;", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PubPHAInjectJS {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final PubPHAInjectJS INSTANCE;

    static {
        kge.a(-588859435);
        INSTANCE = new PubPHAInjectJS();
    }

    private PubPHAInjectJS() {
    }

    public final String getPHAInjectJS(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77e478cc", new Object[]{this, context});
        }
        q.d(context, "context");
        return "\n           " + a.b(context) + "\n           \n           " + a.a(context) + "\n        ";
    }
}
