package com.taobao.android.tbabilitykit.pop;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes6.dex */
public final class f extends ContextWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f15353a;

    static {
        kge.a(962029758);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        if (str.hashCode() == -280716353) {
            return new Boolean(super.bindService((Intent) objArr[0], (ServiceConnection) objArr[1], ((Number) objArr[2]).intValue()));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public f(Context context) {
        super(context);
    }

    public final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.f15353a = context;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public boolean bindService(Intent intent, ServiceConnection conn, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef449bbf", new Object[]{this, intent, conn, new Integer(i)})).booleanValue();
        }
        q.d(conn, "conn");
        Context context = this.f15353a;
        return context != null ? context.bindService(intent, conn, i) : super.bindService(intent, conn, i);
    }
}
