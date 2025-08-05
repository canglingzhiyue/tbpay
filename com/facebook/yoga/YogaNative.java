package com.facebook.yoga;

import com.alipay.android.app.template.JSPluginManager;
import tb.kge;
import tb.ogh;

/* loaded from: classes4.dex */
public class YogaNative {
    static {
        kge.a(-112287925);
        try {
            ogh.a("load Yoga Library");
            System.loadLibrary("c++_shared");
            System.loadLibrary(JSPluginManager.INVOKE_NS_FB);
            System.loadLibrary("yoga");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        } finally {
            ogh.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGConfigFree(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGConfigNew();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGConfigSetExperimentalFeatureEnabled(long j, int i, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGConfigSetLogger(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGConfigSetPointScaleFactor(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGConfigSetPrintTreeFlag(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviour(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGConfigSetUseLegacyStretchBehaviour(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGConfigSetUseWebDefaults(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeCalculateLayout(long j, float f, float f2, long[] jArr, YogaNodeJNIBase[] yogaNodeJNIBaseArr);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeClearChildren(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeClone(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeCopyStyle(long j, long j2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeFree(long j);

    static native int jni_YGNodeGetInstanceCount();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeInsertChild(long j, long j2, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native boolean jni_YGNodeIsDirty(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native boolean jni_YGNodeIsReferenceBaseline(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeMarkDirty(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeMarkDirtyAndPropogateToDescendants(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeNew(boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeNewWithConfig(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodePrint(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeRemoveChild(long j, long j2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeReset(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeSetHasBaselineFunc(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeSetHasMeasureFunc(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeSetIsReferenceBaseline(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeSetStyleInputs(long j, float[] fArr, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int jni_YGNodeStyleGetAlignContent(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int jni_YGNodeStyleGetAlignItems(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int jni_YGNodeStyleGetAlignSelf(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native float jni_YGNodeStyleGetAspectRatio(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native float jni_YGNodeStyleGetBorder(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int jni_YGNodeStyleGetDirection(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int jni_YGNodeStyleGetDisplay(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native float jni_YGNodeStyleGetFlex(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeStyleGetFlexBasis(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int jni_YGNodeStyleGetFlexDirection(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native float jni_YGNodeStyleGetFlexGrow(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native float jni_YGNodeStyleGetFlexShrink(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int jni_YGNodeStyleGetFlexWrap(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeStyleGetHeight(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int jni_YGNodeStyleGetJustifyContent(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeStyleGetMargin(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeStyleGetMaxHeight(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeStyleGetMaxWidth(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeStyleGetMinHeight(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeStyleGetMinWidth(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int jni_YGNodeStyleGetOverflow(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeStyleGetPadding(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeStyleGetPosition(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int jni_YGNodeStyleGetPositionType(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeStyleGetWidth(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetAlignContent(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetAlignItems(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetAlignSelf(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetAspectRatio(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetBorder(long j, int i, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetDirection(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetDisplay(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetFlex(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetFlexBasis(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetFlexBasisAuto(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetFlexBasisPercent(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetFlexDirection(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetFlexGrow(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetFlexShrink(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetFlexWrap(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetHeight(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetHeightAuto(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetHeightPercent(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetJustifyContent(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetMargin(long j, int i, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetMarginAuto(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetMarginPercent(long j, int i, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetMaxHeight(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetMaxHeightPercent(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetMaxWidth(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetMaxWidthPercent(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetMinHeight(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetMinHeightPercent(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetMinWidth(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetMinWidthPercent(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetOverflow(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetPadding(long j, int i, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetPaddingPercent(long j, int i, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetPosition(long j, int i, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetPositionPercent(long j, int i, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetPositionType(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetWidth(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetWidthAuto(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetWidthPercent(long j, float f);
}
