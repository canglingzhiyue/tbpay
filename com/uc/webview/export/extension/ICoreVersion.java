package com.uc.webview.export.extension;

import com.uc.webview.base.IExtender;

/* loaded from: classes9.dex */
public abstract class ICoreVersion implements IExtender {

    /* loaded from: classes9.dex */
    public static final class Instance {
        private static volatile ICoreVersion sInstance;

        public static final ICoreVersion get() {
            return sInstance;
        }

        public static final void set(ICoreVersion iCoreVersion) {
            if (sInstance != null) {
                return;
            }
            sInstance = iCoreVersion;
        }
    }

    public abstract int apiLevel();

    public abstract String buildTimestamp();

    public abstract String cpuArch();

    @Override // com.uc.webview.base.IExtender
    public Object invoke(int i, Object[] objArr) {
        return null;
    }

    public abstract String lastCommitAuthor();

    public abstract String lastCommitRevision();

    public abstract String minSupportVersion();

    public abstract boolean supportInspector();

    public abstract String version();
}
