package com.taobao.themis.kernel.utils;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.fxb;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/taobao/themis/kernel/utils/DiskUtils;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "getAppDir", "context", "Landroid/content/Context;", "getAppSubDir", "subDir", "getThemisDir", "getThemisSubDir", "mediaMounted", "", "themis_kernel_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final e INSTANCE;
    public static final String TAG = "DiskUtil";

    static {
        kge.a(1810666970);
        INSTANCE = new e();
    }

    private e() {
    }

    @JvmStatic
    public static final String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        kotlin.jvm.internal.q.d(context, "context");
        String str = null;
        File filesDir = context.getFilesDir();
        kotlin.jvm.internal.q.b(filesDir, "context.filesDir");
        return filesDir.exists() ? filesDir.getParent() : str;
    }

    public final String a(Context context, String subDir) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{this, context, subDir});
        }
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(subDir, "subDir");
        String a2 = a(context);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return a2 + fxb.DIR + subDir;
    }

    @JvmStatic
    public static final String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        kotlin.jvm.internal.q.d(context, "context");
        return INSTANCE.a(context, TMSCalendarBridge.namespace);
    }

    @JvmStatic
    public static final String b(Context context, String subDir) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1da50fb7", new Object[]{context, subDir});
        }
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(subDir, "subDir");
        String b = b(context);
        if (b == null) {
            return null;
        }
        return b + fxb.DIR + subDir;
    }
}
