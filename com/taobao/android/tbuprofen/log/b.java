package com.taobao.android.tbuprofen.log;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.d;
import tb.kge;

/* loaded from: classes6.dex */
public class b implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TBPLogLevel f15491a;

    static {
        kge.a(1177162991);
        kge.a(1899958528);
    }

    public b(TBPLogLevel tBPLogLevel) {
        this.f15491a = tBPLogLevel;
    }

    public b() {
        this(TBPLogLevel.INFO);
    }

    @Override // com.taobao.android.tbuprofen.d
    public void a(String str, Throwable th, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee268404", new Object[]{this, str, th, str2, objArr});
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        Log.e(a(str), a(a(str2, objArr), th));
    }

    @Override // com.taobao.android.tbuprofen.d
    public void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cd3435", new Object[]{this, str, str2, objArr});
        } else {
            Log.e(a(str), a(str2, objArr));
        }
    }

    @Override // com.taobao.android.tbuprofen.d
    public void b(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd0ff94", new Object[]{this, str, str2, objArr});
            return;
        }
        a(str2, objArr);
        a(str);
    }

    @Override // com.taobao.android.tbuprofen.d
    public void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4caf3", new Object[]{this, str, str2, objArr});
            return;
        }
        a(str2, objArr);
        a(str);
    }

    @Override // com.taobao.android.tbuprofen.d
    public void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{this, str, str2, objArr});
            return;
        }
        a(str2, objArr);
        a(str);
    }

    @Override // com.taobao.android.tbuprofen.d
    public void e(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc61b1", new Object[]{this, str, str2, objArr});
            return;
        }
        a(str2, objArr);
        a(str);
    }

    @Override // com.taobao.android.tbuprofen.d
    public TBPLogLevel a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBPLogLevel) ipChange.ipc$dispatch("2e0d8b7f", new Object[]{this}) : this.f15491a;
    }

    private static String a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dee72cc1", new Object[]{str, objArr}) : String.format(str, objArr);
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : StringUtils.isEmpty(str) ? "TBUPROF" : String.format("%s_%s", "TBUPROF", str);
    }

    private static String a(String str, Throwable th) {
        StackTraceElement[] stackTrace;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fda15ffd", new Object[]{str, th});
        }
        if (th == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(th.getClass().getName());
        sb.append("  ");
        sb.append(th.getMessage());
        sb.append("\r\n");
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\tat  ");
            sb.append(stackTraceElement);
            sb.append("\r\n");
        }
        return sb.toString();
    }
}
