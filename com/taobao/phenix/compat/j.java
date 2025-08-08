package com.taobao.phenix.compat;

import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.qom;

/* loaded from: classes.dex */
public class j extends qom {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Integer b;
    private int c;

    /* renamed from: a  reason: collision with root package name */
    private boolean f18904a = AdapterForTLog.isValid();
    private int d = -1;

    private int a(char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8217d08", new Object[]{this, new Character(c)})).intValue();
        }
        if (c == 'D') {
            return 3;
        }
        if (c == 'E') {
            return 6;
        }
        if (c == 'I') {
            return 4;
        }
        if (c == 'L') {
            return Integer.MAX_VALUE;
        }
        if (c == 'V') {
            return 2;
        }
        return c != 'W' ? 6 : 5;
    }

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.qon
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.b = Integer.valueOf(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r0 > 200) goto L22;
     */
    @Override // tb.qon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(int r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.phenix.compat.j.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L21
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r5)
            r1[r2] = r3
            java.lang.String r5 = "a821939f"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L21:
            java.lang.Integer r0 = r4.b
            if (r0 == 0) goto L2d
            int r0 = r0.intValue()
            if (r5 < r0) goto L2c
            return r2
        L2c:
            return r3
        L2d:
            boolean r0 = r4.f18904a
            if (r0 == 0) goto L5a
            int r0 = r4.d
            if (r0 < 0) goto L3c
            int r0 = r0 + r2
            r4.d = r0
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 <= r1) goto L54
        L3c:
            java.lang.String r0 = com.taobao.tlog.adapter.AdapterForTLog.getLogLevel()
            boolean r1 = android.text.StringUtils.isEmpty(r0)
            if (r1 == 0) goto L48
            r0 = 6
            goto L50
        L48:
            char r0 = r0.charAt(r3)
            int r0 = r4.a(r0)
        L50:
            r4.c = r0
            r4.d = r3
        L54:
            int r0 = r4.c
            if (r5 < r0) goto L59
            return r2
        L59:
            return r3
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.phenix.compat.j.a(int):boolean");
    }

    @Override // tb.qon
    public void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cd3435", new Object[]{this, str, str2, objArr});
        } else if (this.f18904a) {
            AdapterForTLog.logd(str, a(str2, objArr));
        } else {
            a(str2, objArr);
        }
    }

    @Override // tb.qon
    public void b(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd0ff94", new Object[]{this, str, str2, objArr});
        } else if (this.f18904a) {
            AdapterForTLog.logi(str, a(str2, objArr));
        } else {
            a(str2, objArr);
        }
    }

    @Override // tb.qon
    public void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4caf3", new Object[]{this, str, str2, objArr});
        } else if (this.f18904a) {
            AdapterForTLog.logw(str, a(str2, objArr));
        } else {
            a(str2, objArr);
        }
    }

    @Override // tb.qon
    public void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{this, str, str2, objArr});
        } else if (this.f18904a) {
            AdapterForTLog.loge(str, a(str2, objArr));
        } else {
            Log.e(str, a(str2, objArr));
        }
    }

    @Override // tb.qon
    public void a(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8114572f", new Object[]{this, new Integer(i), str, str2});
        } else if (this.f18904a) {
            AdapterForTLog.loge(str, str2);
        } else {
            Log.e(str, str2);
        }
    }
}
