package com.taobao.android.artry.common;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.constants.ResultCode;
import tb.kge;

/* loaded from: classes4.dex */
public class c<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9050a;
    public final ResultCode b;
    public final T c;

    static {
        kge.a(438388169);
    }

    public static <D> void a(boolean z, a<D> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67008f20", new Object[]{new Boolean(z), aVar});
        } else {
            a(z, z ? ResultCode.SUCCESS : null, null, aVar);
        }
    }

    public static <D> void a(ResultCode resultCode, a<D> aVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dd5f5f5", new Object[]{resultCode, aVar});
            return;
        }
        if (resultCode != ResultCode.SUCCESS) {
            z = false;
        }
        a(z, resultCode, null, aVar);
    }

    public static <D> void a(boolean z, ResultCode resultCode, a<D> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d703f9", new Object[]{new Boolean(z), resultCode, aVar});
        } else {
            a(z, resultCode, null, aVar);
        }
    }

    public static <D> void a(boolean z, ResultCode resultCode, D d, a<D> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4f5655d", new Object[]{new Boolean(z), resultCode, d, aVar});
        } else if (aVar == null) {
        } else {
            try {
                aVar.a(new c<>(z, resultCode, d));
            } catch (Throwable th) {
                Log.e("Result", "failed to invoke the Callback..." + th);
            }
        }
    }

    private c(boolean z, ResultCode resultCode, T t) {
        this.f9050a = z;
        this.b = resultCode == null ? ResultCode.FAILURE_NULL_RESULT_CODE : resultCode;
        this.c = t;
    }
}
