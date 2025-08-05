package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import tb.fqi;
import tb.kge;

/* loaded from: classes.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static bl f11916a;
    public static q b;

    static {
        kge.a(-1311526696);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        bl blVar = f11916a;
        if (blVar != null) {
            return blVar.a();
        }
        return false;
    }

    private static q a(DXEngineConfig dXEngineConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q) ipChange.ipc$dispatch("998100bf", new Object[]{dXEngineConfig});
        }
        if (dXEngineConfig != null) {
            return dXEngineConfig.m();
        }
        return null;
    }

    public static float a(DXRuntimeContext dXRuntimeContext, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c71e4cf7", new Object[]{dXRuntimeContext, new Float(f)})).floatValue() : a() ? b(dXRuntimeContext, f) : f;
    }

    public static float b(DXRuntimeContext dXRuntimeContext, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4f6e756", new Object[]{dXRuntimeContext, new Float(f)})).floatValue();
        }
        q a2 = a(dXRuntimeContext.B());
        return a2 == null ? f : a2.a(dXRuntimeContext, Float.valueOf(f)).floatValue();
    }

    public static float a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8218848", new Object[]{new Float(f)})).floatValue() : a() ? b(f) : f;
    }

    public static float b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d660e7", new Object[]{new Float(f)})).floatValue();
        }
        q qVar = b;
        return qVar == null ? f : qVar.a(Float.valueOf(f)).floatValue();
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : fqi.a(str);
    }
}
