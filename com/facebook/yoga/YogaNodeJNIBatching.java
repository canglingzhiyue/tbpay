package com.facebook.yoga;

import tb.kge;

/* loaded from: classes4.dex */
public class YogaNodeJNIBatching extends YogaNodeJNIBase {
    private static final byte BORDER = 4;
    private static final byte DOES_LEGACY_STRETCH_BEHAVIOUR = 8;
    private static final byte HAS_NEW_LAYOUT = 16;
    private static final byte LAYOUT_BORDER_START_INDEX = 14;
    private static final byte LAYOUT_DIRECTION_INDEX = 5;
    private static final byte LAYOUT_EDGE_SET_FLAG_INDEX = 0;
    private static final byte LAYOUT_HEIGHT_INDEX = 2;
    private static final byte LAYOUT_LEFT_INDEX = 3;
    private static final byte LAYOUT_MARGIN_START_INDEX = 6;
    private static final byte LAYOUT_PADDING_START_INDEX = 10;
    private static final byte LAYOUT_TOP_INDEX = 4;
    private static final byte LAYOUT_WIDTH_INDEX = 1;
    private static final byte MARGIN = 1;
    private static final byte PADDING = 2;
    private float[] arr;
    float[] copyArr;
    private boolean mHasNewLayout;
    private int mLayoutDirection;

    static {
        kge.a(2094945559);
    }

    public YogaNodeJNIBatching() {
        this.arr = null;
        this.copyArr = null;
        this.mLayoutDirection = 0;
        this.mHasNewLayout = true;
    }

    public YogaNodeJNIBatching(YogaConfig yogaConfig) {
        super(yogaConfig);
        this.arr = null;
        this.copyArr = null;
        this.mLayoutDirection = 0;
        this.mHasNewLayout = true;
    }

    @Override // com.facebook.yoga.YogaNode
    public void copyLayout(YogaNode yogaNode) {
        if (this.copyArr == null) {
            this.copyArr = new float[4];
        }
        YogaNodeJNIBatching yogaNodeJNIBatching = (YogaNodeJNIBatching) yogaNode;
        this.copyArr[0] = yogaNodeJNIBatching.getLayoutX();
        this.copyArr[1] = yogaNodeJNIBatching.getLayoutY();
        this.copyArr[2] = yogaNodeJNIBatching.getLayoutWidth();
        this.copyArr[3] = yogaNodeJNIBatching.getLayoutHeight();
    }

    @Override // com.facebook.yoga.YogaNodeJNIBase
    public boolean getDoesLegacyStretchFlagAffectsLayout() {
        float[] fArr = this.arr;
        return fArr != null && (((int) fArr[0]) & 8) == 8;
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutBorder(YogaEdge yogaEdge) {
        float[] fArr = this.arr;
        if (fArr != null) {
            int i = 0;
            if ((((int) fArr[0]) & 4) != 4) {
                return 0.0f;
            }
            int i2 = 14 - ((((int) fArr[0]) & 1) == 1 ? 0 : 4);
            if ((((int) this.arr[0]) & 2) != 2) {
                i = 4;
            }
            int i3 = i2 - i;
            switch (yogaEdge) {
                case LEFT:
                    return this.arr[i3];
                case TOP:
                    return this.arr[i3 + 1];
                case RIGHT:
                    return this.arr[i3 + 2];
                case BOTTOM:
                    return this.arr[i3 + 3];
                case START:
                    return getLayoutDirection() == YogaDirection.RTL ? this.arr[i3 + 2] : this.arr[i3];
                case END:
                    return getLayoutDirection() == YogaDirection.RTL ? this.arr[i3] : this.arr[i3 + 2];
                default:
                    throw new IllegalArgumentException("Cannot get layout border of multi-edge shorthands");
            }
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaDirection getLayoutDirection() {
        float[] fArr = this.arr;
        return YogaDirection.fromInt(fArr != null ? (int) fArr[5] : this.mLayoutDirection);
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutHeight() {
        float[] fArr = this.copyArr;
        if (fArr != null) {
            return fArr[3];
        }
        float[] fArr2 = this.arr;
        if (fArr2 == null) {
            return 0.0f;
        }
        return fArr2[2];
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutMargin(YogaEdge yogaEdge) {
        float[] fArr = this.arr;
        if (fArr == null || (((int) fArr[0]) & 1) != 1) {
            return 0.0f;
        }
        switch (yogaEdge) {
            case LEFT:
                return this.arr[6];
            case TOP:
                return this.arr[7];
            case RIGHT:
                return this.arr[8];
            case BOTTOM:
                return this.arr[9];
            case START:
                return getLayoutDirection() == YogaDirection.RTL ? this.arr[8] : this.arr[6];
            case END:
                return getLayoutDirection() == YogaDirection.RTL ? this.arr[6] : this.arr[8];
            default:
                throw new IllegalArgumentException("Cannot get layout margins of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutPadding(YogaEdge yogaEdge) {
        float[] fArr = this.arr;
        if (fArr != null) {
            int i = 0;
            if ((((int) fArr[0]) & 2) != 2) {
                return 0.0f;
            }
            if ((((int) fArr[0]) & 1) != 1) {
                i = 4;
            }
            int i2 = 10 - i;
            switch (yogaEdge) {
                case LEFT:
                    return this.arr[i2];
                case TOP:
                    return this.arr[i2 + 1];
                case RIGHT:
                    return this.arr[i2 + 2];
                case BOTTOM:
                    return this.arr[i2 + 3];
                case START:
                    return getLayoutDirection() == YogaDirection.RTL ? this.arr[i2 + 2] : this.arr[i2];
                case END:
                    return getLayoutDirection() == YogaDirection.RTL ? this.arr[i2] : this.arr[i2 + 2];
                default:
                    throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
            }
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutWidth() {
        float[] fArr = this.copyArr;
        if (fArr != null) {
            return fArr[2];
        }
        float[] fArr2 = this.arr;
        if (fArr2 == null) {
            return 0.0f;
        }
        return fArr2[1];
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutX() {
        float[] fArr = this.copyArr;
        if (fArr != null) {
            return fArr[0];
        }
        float[] fArr2 = this.arr;
        if (fArr2 == null) {
            return 0.0f;
        }
        return fArr2[3];
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutY() {
        float[] fArr = this.copyArr;
        if (fArr != null) {
            return fArr[1];
        }
        float[] fArr2 = this.arr;
        if (fArr2 == null) {
            return 0.0f;
        }
        return fArr2[4];
    }

    @Override // com.facebook.yoga.YogaNode
    public boolean hasNewLayout() {
        float[] fArr = this.arr;
        return fArr != null ? (((int) fArr[0]) & 16) == 16 : this.mHasNewLayout;
    }

    @Override // com.facebook.yoga.YogaNode
    public void markLayoutSeen() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.mHasNewLayout = false;
    }

    @Override // com.facebook.yoga.YogaNodeJNIBase, com.facebook.yoga.YogaNode
    public void reset() {
        super.reset();
        this.arr = null;
        this.copyArr = null;
        this.mHasNewLayout = true;
        this.mLayoutDirection = 0;
    }
}
