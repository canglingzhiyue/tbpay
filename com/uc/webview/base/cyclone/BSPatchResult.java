package com.uc.webview.base.cyclone;

/* loaded from: classes9.dex */
public class BSPatchResult {
    public int ec;
    public int oldDecTime;
    public int patchDecTime;
    public int patchTime;
    public int res;

    public boolean success() {
        return this.res == 0;
    }

    public String toString() {
        return "res: " + this.res + ", ec: " + this.ec;
    }
}
