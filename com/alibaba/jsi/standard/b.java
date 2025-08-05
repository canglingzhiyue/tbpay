package com.alibaba.jsi.standard;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int kRaiseFromExecuteJS = 1;
    public static final int kRaiseFromFunctionCall = 2;
    public static final int kRaiseFromJSIInternal = 12;
    public static final int kRaiseFromJSObjectGet = 6;
    public static final int kRaiseFromJSObjectSet = 7;
    public static final int kRaiseFromJSPromise = 5;
    public static final int kRaiseFromJSTimer = 4;
    public static final int kRaiseFromNewInstance = 3;
    public static final int kRaiseFromOtherApiCall = 11;
    public static final int kRaiseFromWasmFunctionCall = 9;
    public static final int kRaiseFromWasmInstanceMake = 10;
    public static final int kRaiseFromWasmModuleMake = 8;

    static {
        kge.a(647814715);
    }

    public String onGetSourceMapFilePath(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb3328f7", new Object[]{this, dVar, str});
        }
        return null;
    }

    public boolean onJSSupportException(d dVar, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa3d9bdd", new Object[]{this, dVar, th})).booleanValue();
        }
        return false;
    }

    public void onReload(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7828712c", new Object[]{this, dVar});
        }
    }

    public boolean onUncaughtJSException(d dVar, com.alibaba.jsi.standard.js.i iVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9b34351", new Object[]{this, dVar, iVar, new Integer(i)})).booleanValue();
        }
        if (iVar != null) {
            iVar.a();
        }
        return false;
    }
}
