package com.facebook.yoga;

import tb.kge;

/* loaded from: classes4.dex */
public class YogaConfig {
    public static int SPACING_TYPE;
    public static boolean useBatchingForLayoutOutputs;
    private YogaLogger mLogger;
    long mNativePointer = YogaNative.jni_YGConfigNew();
    private YogaNodeCloneFunction mYogaNodeCloneFunction;

    static {
        kge.a(-414461322);
        SPACING_TYPE = 1;
        useBatchingForLayoutOutputs = true;
    }

    public YogaConfig() {
        if (this.mNativePointer != 0) {
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    protected void finalize() throws Throwable {
        try {
            YogaNative.jni_YGConfigFree(this.mNativePointer);
        } finally {
            super.finalize();
        }
    }

    public YogaLogger getLogger() {
        return this.mLogger;
    }

    public void setExperimentalFeatureEnabled(YogaExperimentalFeature yogaExperimentalFeature, boolean z) {
        YogaNative.jni_YGConfigSetExperimentalFeatureEnabled(this.mNativePointer, yogaExperimentalFeature.intValue(), z);
    }

    public void setLogger(YogaLogger yogaLogger) {
        this.mLogger = yogaLogger;
        YogaNative.jni_YGConfigSetLogger(this.mNativePointer, yogaLogger);
    }

    public void setPointScaleFactor(float f) {
        YogaNative.jni_YGConfigSetPointScaleFactor(this.mNativePointer, f);
    }

    public void setPrintTreeFlag(boolean z) {
        YogaNative.jni_YGConfigSetPrintTreeFlag(this.mNativePointer, z);
    }

    public void setShouldDiffLayoutWithoutLegacyStretchBehaviour(boolean z) {
        YogaNative.jni_YGConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviour(this.mNativePointer, z);
    }

    public void setUseLegacyStretchBehaviour(boolean z) {
        YogaNative.jni_YGConfigSetUseLegacyStretchBehaviour(this.mNativePointer, z);
    }

    public void setUseWebDefaults(boolean z) {
        YogaNative.jni_YGConfigSetUseWebDefaults(this.mNativePointer, z);
    }
}
