package com.taobao.android.sku.pad;

import android.content.Context;
import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.autosize.h;
import com.taobao.android.autosize.l;
import com.taobao.android.e;
import com.taobao.android.sku.utils.n;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.itk;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0016"}, d2 = {"Lcom/taobao/android/sku/pad/PadUtils;", "", "()V", "allowPadMode", "", "Ljava/lang/Boolean;", com.taobao.android.weex_framework.util.a.ATOM_EXT_clear, "", "enableFoldDeviceSingleColumnConfig", "getDeviceType", "", "context", "Landroid/content/Context;", "getPadSkuWindowRect", "Landroid/graphics/Rect;", "getSkuWindowRectRight", "", "instance", "Lcom/taobao/android/autosize/TBAutoSizeConfig;", "isPadOrFold", "isPortraitLayout", "isTablet", "detail-sku_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f15188a;

    static {
        kge.a(-375993729);
        INSTANCE = new b();
    }

    private b() {
    }

    public final boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        q.d(context, "context");
        if (f15188a == null) {
            f15188a = Boolean.valueOf(n.a("allowPadMode"));
        }
        if (!q.a((Object) f15188a, (Object) true)) {
            return false;
        }
        return l.d(context) || l.b(context);
    }

    public final boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{this, context})).booleanValue();
        }
        q.d(context, "context");
        if (f15188a == null) {
            f15188a = Boolean.valueOf(n.a("allowPadMode"));
        }
        if (!(!q.a((Object) f15188a, (Object) true))) {
            return l.b(context);
        }
        return false;
    }

    public final boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        q.d(context, "context");
        return h.a().b(context);
    }

    public final Rect c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("fa83e267", new Object[]{this, context});
        }
        q.d(context, "context");
        if (!a(context)) {
            return null;
        }
        h instance = h.a();
        Rect rect = new Rect();
        rect.left = 0;
        rect.top = 0;
        rect.bottom = instance.e(context);
        q.b(instance, "instance");
        rect.right = a(context, instance);
        return rect;
    }

    public final String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c344f03", new Object[]{this, context});
        }
        q.d(context, "context");
        if (l.b(context)) {
            return "pad";
        }
        if (!l.d(context)) {
            return null;
        }
        return itk.TYPE_FOLD;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            f15188a = null;
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        AliConfigInterface a2 = e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a("android_detail", "enable_fold_device_single_column", "false"));
        }
        return false;
    }

    private final int a(Context context, h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("105940b8", new Object[]{this, context, hVar})).intValue() : b(context) ? hVar.a(context) : (!b() || e(context)) ? hVar.c(context) : hVar.a(context);
    }
}
