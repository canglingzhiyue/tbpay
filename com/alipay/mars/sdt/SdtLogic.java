package com.alipay.mars.sdt;

import com.alipay.mars.Mars;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class SdtLogic {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "bifrost.SdtLogic";

    /* renamed from: a  reason: collision with root package name */
    private static ICallBack f5328a;

    /* loaded from: classes3.dex */
    public interface ICallBack {
        void reportSignalDetectResults(String str);
    }

    private static native ArrayList<String> getLoadLibraries();

    public static native void setHttpNetcheckCGI(String str);

    public static void checkLibrary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bf8a19a", new Object[0]);
            return;
        }
        ArrayList<String> arrayList = null;
        try {
            arrayList = getLoadLibraries();
        } catch (Throwable unused) {
            Mars.loadDefaultMarsLibrary();
        }
        Mars.checkLoadedModules(arrayList, TAG);
    }

    public static void setCallBack(ICallBack iCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54007ee9", new Object[]{iCallBack});
        } else {
            f5328a = iCallBack;
        }
    }

    public static void reportSignalDetectResults(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23ef5788", new Object[]{str});
            return;
        }
        ICallBack iCallBack = f5328a;
        if (iCallBack == null) {
            return;
        }
        iCallBack.reportSignalDetectResults(str);
    }
}
