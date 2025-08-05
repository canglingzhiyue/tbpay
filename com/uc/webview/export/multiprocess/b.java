package com.uc.webview.export.multiprocess;

/* loaded from: classes9.dex */
public interface b {

    /* loaded from: classes9.dex */
    public static class a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static String a(int i) {
            return i == 0 ? "NormalRenderProc" : i == 1 ? "IsolateRenderProc" : i == 2 ? "GPUProc" : "UnknownProc";
        }
    }
}
