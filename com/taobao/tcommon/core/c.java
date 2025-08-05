package com.taobao.tcommon.core;

import android.content.Context;
import android.os.Looper;
import android.util.TypedValue;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileFilter;
import tb.eoe;
import tb.qol;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final FileFilter f22285a = new FileFilter() { // from class: com.taobao.tcommon.core.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
            }
            String name = file.getName();
            if (!name.startsWith(eoe.TYPE_CPU)) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (name.charAt(i) < '0' || name.charAt(i) > '9') {
                    return false;
                }
            }
            return true;
        }
    };

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Looper.getMainLooper().getThread().equals(Thread.currentThread());
    }

    public static String a(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe97b16b", new Object[]{cls});
        }
        String name = cls.getName();
        return name != null ? name.substring(name.lastIndexOf(46) + 1) : "";
    }

    public static boolean a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("258f9aa7", new Object[]{context, new Integer(i)})).booleanValue();
        }
        TypedValue typedValue = new TypedValue();
        try {
            context.getResources().getValue(i, typedValue, true);
        } catch (Exception e) {
            qol.h("TCommon", "get resources type value error=%s", e);
        }
        if ((typedValue.type != 1 && typedValue.type != 3) || typedValue.string == null) {
            return false;
        }
        String charSequence = typedValue.string.toString();
        return charSequence.endsWith(".png") || charSequence.endsWith(".jpg") || charSequence.endsWith(".webp");
    }
}
