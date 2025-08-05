package com.etao.feimagesearch.capture.scan.irp;

import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.cot;
import tb.kge;

/* loaded from: classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f6596a;
    private final HashMap<Integer, IrpCodeProcessor> b = new HashMap<>(5);

    static {
        kge.a(-1420690331);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a109d9fa", new Object[0]);
        }
        if (f6596a == null) {
            synchronized (a.class) {
                if (f6596a == null) {
                    f6596a = new a();
                }
            }
        }
        return f6596a;
    }

    private a() {
    }

    public IrpCodeProcessor a(FragmentActivity fragmentActivity, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IrpCodeProcessor) ipChange.ipc$dispatch("58c1602d", new Object[]{this, fragmentActivity, hashMap});
        }
        int hashCode = fragmentActivity.hashCode();
        IrpCodeProcessor irpCodeProcessor = this.b.get(Integer.valueOf(hashCode));
        if (irpCodeProcessor != null) {
            return irpCodeProcessor;
        }
        cot.c("_scancode_IrpCodeProcessCache", "create processor");
        IrpCodeProcessor irpCodeProcessor2 = new IrpCodeProcessor(fragmentActivity, hashMap);
        this.b.put(Integer.valueOf(hashCode), irpCodeProcessor2);
        return irpCodeProcessor2;
    }

    public void a(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831e55bb", new Object[]{this, fragmentActivity});
            return;
        }
        cot.c("_scancode_IrpCodeProcessCache", "removeProcessor");
        this.b.remove(Integer.valueOf(fragmentActivity.hashCode()));
    }
}
