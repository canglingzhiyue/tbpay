package com.taobao.android.megadesign.dx.view;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.aks;
import tb.ksx;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/taobao/android/megadesign/dx/view/SettingUtils;", "", "()V", "isVideoAutoPlay", "", "context", "Landroid/content/Context;", "lowDevice", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final e INSTANCE = new e();

    private e() {
    }

    public final boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        if (!a()) {
            return new ksx(context).a(context);
        }
        return false;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        aks a2 = aks.a();
        q.b(a2, "AliHAHardware.getInstance()");
        aks.d g = a2.g();
        q.b(g, "AliHAHardware.getInstance().outlineInfo");
        return g != null && g.f25407a == 2;
    }
}
