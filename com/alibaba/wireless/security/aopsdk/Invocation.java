package com.alibaba.wireless.security.aopsdk;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class Invocation {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean e = true;
    public long aopStartTime;
    public Object[] args;
    public long basicIncTimeCost;
    private Object c;
    private Throwable d;
    public InvocationConfig invocationConfig;
    public long invokeTimeCost;
    public boolean shouldReport;
    public long stackTimeCost;
    public Object thiz;
    public final String methodInfo = null;

    /* renamed from: a  reason: collision with root package name */
    private String f4262a = null;
    private boolean b = false;
    public Object extraInfo = null;

    public Invocation(String str, Object obj, Object... objArr) {
    }

    public String getAnnotationInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a414366", new Object[]{this}) : this.f4262a;
    }

    public byte getArgB(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2b7eab66", new Object[]{this, new Integer(i)})).byteValue() : ((Byte) this.args[i]).byteValue();
    }

    public char getArgC(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Character) ipChange.ipc$dispatch("2d338406", new Object[]{this, new Integer(i)})).charValue() : ((Character) this.args[i]).charValue();
    }

    public double getArgD(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2ee85ca6", new Object[]{this, new Integer(i)})).doubleValue() : ((Double) this.args[i]).doubleValue();
    }

    public float getArgF(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("32520de6", new Object[]{this, new Integer(i)})).floatValue() : ((Float) this.args[i]).floatValue();
    }

    public int getArgI(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("377097c6", new Object[]{this, new Integer(i)})).intValue() : ((Integer) this.args[i]).intValue();
    }

    public long getArgJ(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("39257066", new Object[]{this, new Integer(i)})).longValue() : ((Long) this.args[i]).longValue();
    }

    public Object getArgL(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("dc398b82", new Object[]{this, new Integer(i)}) : this.args[i];
    }

    public short getArgS(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("48810e06", new Object[]{this, new Integer(i)})).shortValue() : ((Short) this.args[i]).shortValue();
    }

    public boolean getArgZ(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5472fa66", new Object[]{this, new Integer(i)})).booleanValue() : ((Boolean) this.args[i]).booleanValue();
    }

    public Object[] getArgs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("60d4303b", new Object[]{this}) : this.args;
    }

    public String getProxyName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("beaef776", new Object[]{this}) : this.methodInfo;
    }

    public Object getResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5be12058", new Object[]{this}) : this.c;
    }

    public Throwable getThrowable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Throwable) ipChange.ipc$dispatch("fb239c76", new Object[]{this}) : this.d;
    }

    public boolean hasThrowable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9146551", new Object[]{this})).booleanValue() : this.d != null;
    }

    public void setArgs(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e6180b", new Object[]{this, objArr});
        } else {
            this.args = objArr;
        }
    }

    public void setResult(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8046e82", new Object[]{this, obj});
        } else {
            this.c = obj;
        }
    }

    public void setShouldBlock(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b7e7555", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void setThrowable(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c98890", new Object[]{this, th});
        } else {
            this.d = th;
        }
    }

    public boolean shouldBlock() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f736fe25", new Object[]{this})).booleanValue() : this.b;
    }
}
