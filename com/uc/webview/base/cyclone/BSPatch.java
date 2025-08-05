package com.uc.webview.base.cyclone;

/* loaded from: classes9.dex */
public class BSPatch {
    public static BSPatchResult patch(String str, String str2, String str3, String str4) {
        BSPatchResult bSPatchResult = new BSPatchResult();
        int i = a.f23777a;
        if (i != -1000) {
            bSPatchResult.res = i;
        } else {
            int[] patchImpl = patchImpl(str, str2, str3, str4);
            if (patchImpl == null || patchImpl.length != 5) {
                bSPatchResult.res = -1010;
            } else {
                bSPatchResult.res = patchImpl[0];
                bSPatchResult.ec = patchImpl[1];
                bSPatchResult.oldDecTime = patchImpl[2];
                bSPatchResult.patchDecTime = patchImpl[3];
                bSPatchResult.patchTime = patchImpl[4];
            }
        }
        return bSPatchResult;
    }

    private static native int[] patchImpl(String str, String str2, String str3, String str4);
}
