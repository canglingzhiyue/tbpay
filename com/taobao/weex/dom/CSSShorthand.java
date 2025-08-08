package com.taobao.weex.dom;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.Enum;
import java.util.Arrays;
import tb.kge;

/* loaded from: classes9.dex */
public class CSSShorthand<T extends Enum<? extends CSSProperty>> implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float[] values;

    /* loaded from: classes9.dex */
    public enum CORNER implements CSSProperty {
        BORDER_TOP_LEFT,
        BORDER_TOP_RIGHT,
        BORDER_BOTTOM_RIGHT,
        BORDER_BOTTOM_LEFT,
        ALL
    }

    /* loaded from: classes9.dex */
    interface CSSProperty {
    }

    /* loaded from: classes9.dex */
    public enum EDGE implements CSSProperty {
        TOP,
        BOTTOM,
        LEFT,
        RIGHT,
        ALL
    }

    /* loaded from: classes9.dex */
    public enum TYPE {
        MARGIN,
        PADDING,
        BORDER
    }

    static {
        kge.a(234559472);
        kge.a(-723128125);
    }

    public CSSShorthand(float[] fArr) {
        replace(fArr);
    }

    public CSSShorthand() {
        this(false);
    }

    public CSSShorthand(boolean z) {
        this.values = new float[Math.max(EDGE.values().length, CORNER.values().length)];
        if (z) {
            Arrays.fill(this.values, Float.NaN);
        }
    }

    public void set(EDGE edge, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b93c339", new Object[]{this, edge, new Float(f)});
        } else {
            setInternal(edge, f);
        }
    }

    public void set(CORNER corner, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09446d1", new Object[]{this, corner, new Float(f)});
        } else {
            setInternal(corner, f);
        }
    }

    public float get(EDGE edge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6bac2de3", new Object[]{this, edge})).floatValue() : getInternal(edge);
    }

    public float get(CORNER corner) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d55be44b", new Object[]{this, corner})).floatValue() : getInternal(corner);
    }

    public final void replace(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc2dde46", new Object[]{this, fArr});
        } else {
            this.values = fArr;
        }
    }

    /* renamed from: clone */
    public CSSShorthand m1582clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CSSShorthand) ipChange.ipc$dispatch("bb48ce31", new Object[]{this}) : (CSSShorthand) super.clone();
    }

    private void setInternal(Enum<? extends CSSProperty> r4, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c81de0", new Object[]{this, r4, new Float(f)});
        } else if (r4 == EDGE.ALL || r4 == CORNER.ALL) {
            Arrays.fill(this.values, f);
        } else {
            this.values[r4.ordinal()] = f;
        }
    }

    private float getInternal(Enum<? extends CSSProperty> r4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("386fa2c4", new Object[]{this, r4})).floatValue();
        }
        if (r4 != EDGE.ALL && r4 != CORNER.ALL) {
            return this.values[r4.ordinal()];
        }
        return 0.0f;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : StringUtils.isEmpty(this.values.toString()) ? "" : Arrays.toString(this.values);
    }
}
