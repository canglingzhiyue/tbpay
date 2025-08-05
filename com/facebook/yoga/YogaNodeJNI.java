package com.facebook.yoga;

import tb.kge;

/* loaded from: classes4.dex */
public class YogaNodeJNI extends YogaNodeJNIBase {
    private float mBorderBottom;
    private float mBorderLeft;
    private float mBorderRight;
    private float mBorderTop;
    private boolean mDoesLegacyStretchFlagAffectsLayout;
    private boolean mHasNewLayout;
    private float mHeight;
    private int mLayoutDirection;
    private float mLeft;
    private float mMarginBottom;
    private float mMarginLeft;
    private float mMarginRight;
    private float mMarginTop;
    private float mPaddingBottom;
    private float mPaddingLeft;
    private float mPaddingRight;
    private float mPaddingTop;
    private float mTop;
    private float mWidth;

    static {
        kge.a(1199911311);
    }

    public YogaNodeJNI() {
        this.mWidth = Float.NaN;
        this.mHeight = Float.NaN;
        this.mTop = Float.NaN;
        this.mLeft = Float.NaN;
        this.mMarginLeft = 0.0f;
        this.mMarginTop = 0.0f;
        this.mMarginRight = 0.0f;
        this.mMarginBottom = 0.0f;
        this.mPaddingLeft = 0.0f;
        this.mPaddingTop = 0.0f;
        this.mPaddingRight = 0.0f;
        this.mPaddingBottom = 0.0f;
        this.mBorderLeft = 0.0f;
        this.mBorderTop = 0.0f;
        this.mBorderRight = 0.0f;
        this.mBorderBottom = 0.0f;
        this.mLayoutDirection = 0;
        this.mHasNewLayout = true;
        this.mDoesLegacyStretchFlagAffectsLayout = false;
    }

    public YogaNodeJNI(YogaConfig yogaConfig) {
        super(yogaConfig);
        this.mWidth = Float.NaN;
        this.mHeight = Float.NaN;
        this.mTop = Float.NaN;
        this.mLeft = Float.NaN;
        this.mMarginLeft = 0.0f;
        this.mMarginTop = 0.0f;
        this.mMarginRight = 0.0f;
        this.mMarginBottom = 0.0f;
        this.mPaddingLeft = 0.0f;
        this.mPaddingTop = 0.0f;
        this.mPaddingRight = 0.0f;
        this.mPaddingBottom = 0.0f;
        this.mBorderLeft = 0.0f;
        this.mBorderTop = 0.0f;
        this.mBorderRight = 0.0f;
        this.mBorderBottom = 0.0f;
        this.mLayoutDirection = 0;
        this.mHasNewLayout = true;
        this.mDoesLegacyStretchFlagAffectsLayout = false;
    }

    @Override // com.facebook.yoga.YogaNode
    public void copyLayout(YogaNode yogaNode) {
        YogaNodeJNI yogaNodeJNI = (YogaNodeJNI) yogaNode;
        this.mLeft = yogaNodeJNI.mLeft;
        this.mTop = yogaNodeJNI.mTop;
        this.mWidth = yogaNodeJNI.mWidth;
        this.mHeight = yogaNodeJNI.mHeight;
    }

    @Override // com.facebook.yoga.YogaNodeJNIBase
    public boolean getDoesLegacyStretchFlagAffectsLayout() {
        return this.mDoesLegacyStretchFlagAffectsLayout;
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutBorder(YogaEdge yogaEdge) {
        switch (yogaEdge) {
            case LEFT:
                return this.mBorderLeft;
            case TOP:
                return this.mBorderTop;
            case RIGHT:
                return this.mBorderRight;
            case BOTTOM:
                return this.mBorderBottom;
            case START:
                return getLayoutDirection() == YogaDirection.RTL ? this.mBorderRight : this.mBorderLeft;
            case END:
                return getLayoutDirection() == YogaDirection.RTL ? this.mBorderLeft : this.mBorderRight;
            default:
                throw new IllegalArgumentException("Cannot get layout border of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaDirection getLayoutDirection() {
        return YogaDirection.fromInt(this.mLayoutDirection);
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutHeight() {
        return this.mHeight;
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutMargin(YogaEdge yogaEdge) {
        switch (yogaEdge) {
            case LEFT:
                return this.mMarginLeft;
            case TOP:
                return this.mMarginTop;
            case RIGHT:
                return this.mMarginRight;
            case BOTTOM:
                return this.mMarginBottom;
            case START:
                return getLayoutDirection() == YogaDirection.RTL ? this.mMarginRight : this.mMarginLeft;
            case END:
                return getLayoutDirection() == YogaDirection.RTL ? this.mMarginLeft : this.mMarginRight;
            default:
                throw new IllegalArgumentException("Cannot get layout margins of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutPadding(YogaEdge yogaEdge) {
        switch (yogaEdge) {
            case LEFT:
                return this.mPaddingLeft;
            case TOP:
                return this.mPaddingTop;
            case RIGHT:
                return this.mPaddingRight;
            case BOTTOM:
                return this.mPaddingBottom;
            case START:
                return getLayoutDirection() == YogaDirection.RTL ? this.mPaddingRight : this.mPaddingLeft;
            case END:
                return getLayoutDirection() == YogaDirection.RTL ? this.mPaddingLeft : this.mPaddingRight;
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutWidth() {
        return this.mWidth;
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutX() {
        return this.mLeft;
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutY() {
        return this.mTop;
    }

    @Override // com.facebook.yoga.YogaNode
    public boolean hasNewLayout() {
        return this.mHasNewLayout;
    }

    @Override // com.facebook.yoga.YogaNode
    public void markLayoutSeen() {
        this.mHasNewLayout = false;
    }

    @Override // com.facebook.yoga.YogaNodeJNIBase, com.facebook.yoga.YogaNode
    public void reset() {
        super.reset();
        this.mHasNewLayout = true;
        this.mWidth = Float.NaN;
        this.mHeight = Float.NaN;
        this.mTop = Float.NaN;
        this.mLeft = Float.NaN;
        this.mMarginLeft = 0.0f;
        this.mMarginTop = 0.0f;
        this.mMarginRight = 0.0f;
        this.mMarginBottom = 0.0f;
        this.mPaddingLeft = 0.0f;
        this.mPaddingTop = 0.0f;
        this.mPaddingRight = 0.0f;
        this.mPaddingBottom = 0.0f;
        this.mBorderLeft = 0.0f;
        this.mBorderTop = 0.0f;
        this.mBorderRight = 0.0f;
        this.mBorderBottom = 0.0f;
        this.mLayoutDirection = 0;
        this.mDoesLegacyStretchFlagAffectsLayout = false;
    }
}
