package com.taobao.android.remoteso.index;

/* loaded from: classes.dex */
public class SoInfo2 {
    public Ext ext = new Ext();
    public String advancedInfo = null;

    /* loaded from: classes.dex */
    public static class Ext {
        public int syncTimeoutSeconds = 5;
        public boolean allowPreFetch = true;
        public boolean allowLastIndex = false;
        public boolean remoteDiffPatch = false;
        public boolean remoteCompressed = true;
        public boolean compressedDiffPatch = false;
        public boolean inApkDiffPatch = false;
        public String diffBaseLibName = "";
    }
}
