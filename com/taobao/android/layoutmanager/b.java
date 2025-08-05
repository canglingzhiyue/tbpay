package com.taobao.android.layoutmanager;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/taobao/android/layoutmanager/DxNavProcessor;", "", "()V", "HOST", "", "PATH", "handleGuangGuangNavUrl", "", "context", "Landroid/content/Context;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "layoutmanager-taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes5.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HOST = "h5.m.taobao.com";
    public static final b INSTANCE;
    public static final String PATH = "/guangguang/dx.htm";

    static {
        kge.a(482641954);
        INSTANCE = new b();
    }

    private b() {
    }

    public final boolean a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c9cc21", new Object[]{this, context, intent})).booleanValue();
        }
        q.d(context, "context");
        q.d(intent, "intent");
        Uri data = intent.getData();
        return data != null && q.a((Object) "h5.m.taobao.com", (Object) data.getHost()) && q.a((Object) PATH, (Object) data.getPath());
    }
}
