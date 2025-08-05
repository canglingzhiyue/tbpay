package com.facebook.yoga;

import tb.kge;

/* loaded from: classes4.dex */
public abstract class YogaNode {
    static {
        kge.a(-1649264074);
    }

    public static YogaNode create() {
        return YogaConfig.useBatchingForLayoutOutputs ? new YogaNodeJNIBatching() : new YogaNodeJNI();
    }

    public static YogaNode create(YogaConfig yogaConfig) {
        return YogaConfig.useBatchingForLayoutOutputs ? new YogaNodeJNIBatching(yogaConfig) : new YogaNodeJNI(yogaConfig);
    }

    public abstract void addChildAt(YogaNode yogaNode, int i);

    public abstract void calculateLayout(float f, float f2);

    /* renamed from: cloneWithoutChildren */
    public abstract YogaNode mo641cloneWithoutChildren();

    public void copyLayout(YogaNode yogaNode) {
    }

    public abstract void copyStyle(YogaNode yogaNode);

    public abstract void dirty();

    public abstract YogaAlign getAlignContent();

    public abstract YogaAlign getAlignItems();

    public abstract YogaAlign getAlignSelf();

    public abstract float getAspectRatio();

    public abstract float getBorder(YogaEdge yogaEdge);

    /* renamed from: getChildAt */
    public abstract YogaNode mo642getChildAt(int i);

    public abstract int getChildCount();

    public abstract Object getData();

    public abstract YogaDisplay getDisplay();

    public abstract float getFlex();

    public abstract YogaValue getFlexBasis();

    public abstract YogaFlexDirection getFlexDirection();

    public abstract float getFlexGrow();

    public abstract float getFlexShrink();

    public abstract YogaValue getHeight();

    public abstract YogaJustify getJustifyContent();

    public abstract float getLayoutBorder(YogaEdge yogaEdge);

    public abstract YogaDirection getLayoutDirection();

    public abstract float getLayoutHeight();

    public abstract float getLayoutMargin(YogaEdge yogaEdge);

    public abstract float getLayoutPadding(YogaEdge yogaEdge);

    public abstract float getLayoutWidth();

    public abstract float getLayoutX();

    public abstract float getLayoutY();

    public abstract YogaValue getMargin(YogaEdge yogaEdge);

    public abstract YogaValue getMaxHeight();

    public abstract YogaValue getMaxWidth();

    public abstract YogaValue getMinHeight();

    public abstract YogaValue getMinWidth();

    public abstract YogaOverflow getOverflow();

    /* renamed from: getOwner */
    public abstract YogaNode mo643getOwner();

    public abstract YogaValue getPadding(YogaEdge yogaEdge);

    @Deprecated
    /* renamed from: getParent */
    public abstract YogaNode mo644getParent();

    public abstract YogaValue getPosition(YogaEdge yogaEdge);

    public abstract YogaPositionType getPositionType();

    public abstract YogaDirection getStyleDirection();

    public abstract YogaValue getWidth();

    public abstract YogaWrap getWrap();

    public abstract boolean hasNewLayout();

    public abstract int indexOf(YogaNode yogaNode);

    public abstract boolean isBaselineDefined();

    public abstract boolean isDirty();

    public abstract boolean isMeasureDefined();

    public abstract boolean isReferenceBaseline();

    public abstract void markLayoutSeen();

    public abstract void print();

    /* renamed from: removeChildAt */
    public abstract YogaNode mo645removeChildAt(int i);

    public abstract void reset();

    public abstract void setAlignContent(YogaAlign yogaAlign);

    public abstract void setAlignItems(YogaAlign yogaAlign);

    public abstract void setAlignSelf(YogaAlign yogaAlign);

    public abstract void setAspectRatio(float f);

    public abstract void setBaselineFunction(YogaBaselineFunction yogaBaselineFunction);

    public abstract void setBorder(YogaEdge yogaEdge, float f);

    public abstract void setData(Object obj);

    public abstract void setDirection(YogaDirection yogaDirection);

    public abstract void setDisplay(YogaDisplay yogaDisplay);

    public abstract void setFlex(float f);

    public abstract void setFlexBasis(float f);

    public abstract void setFlexBasisAuto();

    public abstract void setFlexBasisPercent(float f);

    public abstract void setFlexDirection(YogaFlexDirection yogaFlexDirection);

    public abstract void setFlexGrow(float f);

    public abstract void setFlexShrink(float f);

    public abstract void setHeight(float f);

    public abstract void setHeightAuto();

    public abstract void setHeightPercent(float f);

    public abstract void setIsReferenceBaseline(boolean z);

    public abstract void setJustifyContent(YogaJustify yogaJustify);

    public abstract void setMargin(YogaEdge yogaEdge, float f);

    public abstract void setMarginAuto(YogaEdge yogaEdge);

    public abstract void setMarginPercent(YogaEdge yogaEdge, float f);

    public abstract void setMaxHeight(float f);

    public abstract void setMaxHeightPercent(float f);

    public abstract void setMaxWidth(float f);

    public abstract void setMaxWidthPercent(float f);

    public abstract void setMeasureFunction(YogaMeasureFunction yogaMeasureFunction);

    public abstract void setMinHeight(float f);

    public abstract void setMinHeightPercent(float f);

    public abstract void setMinWidth(float f);

    public abstract void setMinWidthPercent(float f);

    public abstract void setOverflow(YogaOverflow yogaOverflow);

    public abstract void setPadding(YogaEdge yogaEdge, float f);

    public abstract void setPaddingPercent(YogaEdge yogaEdge, float f);

    public abstract void setPosition(YogaEdge yogaEdge, float f);

    public abstract void setPositionPercent(YogaEdge yogaEdge, float f);

    public abstract void setPositionType(YogaPositionType yogaPositionType);

    public abstract void setStyleInputs(float[] fArr, int i);

    public abstract void setWidth(float f);

    public abstract void setWidthAuto();

    public abstract void setWidthPercent(float f);

    public abstract void setWrap(YogaWrap yogaWrap);
}
