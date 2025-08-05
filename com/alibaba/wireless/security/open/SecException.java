package com.alibaba.wireless.security.open;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;
import java.io.PrintWriter;
import tb.kge;

/* loaded from: classes.dex */
public class SecException extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_NULL_CONTEXT = -100;

    /* renamed from: a  reason: collision with root package name */
    private int f4292a;

    static {
        kge.a(-689307132);
    }

    public SecException(int i) {
        this.f4292a = i;
    }

    public SecException(String str, int i) {
        super(str);
        this.f4292a = i;
    }

    public SecException(String str, Throwable th, int i) {
        super(str, th);
        this.f4292a = i;
    }

    public SecException(Throwable th, int i) {
        super(th);
        this.f4292a = i;
    }

    public static /* synthetic */ Object ipc$super(SecException secException, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 485227564) {
            super.printStackTrace((PrintWriter) objArr[0]);
            return null;
        } else if (hashCode != 1575049727) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.printStackTrace((PrintStream) objArr[0]);
            return null;
        }
    }

    public int getErrorCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5461de59", new Object[]{this})).intValue() : this.f4292a;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5de159ff", new Object[]{this, printStream});
            return;
        }
        printStream.println("ErrorCode = " + getErrorCode());
        super.printStackTrace(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cebfc2c", new Object[]{this, printWriter});
            return;
        }
        printWriter.println("ErrorCode = " + getErrorCode());
        super.printStackTrace(printWriter);
    }

    public void setErrorCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd0c969", new Object[]{this, new Integer(i)});
        } else {
            this.f4292a = i;
        }
    }
}
