package com.alibaba.ariver.app.api.ui.darkmode;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class ColorSchemeModelTemplate<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private T f2893a;
    private T b;
    private T c;
    private ColorSchemeDecider d;

    /* renamed from: com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeModelTemplate$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$alibaba$ariver$app$api$ui$darkmode$ColorSchemeType = new int[ColorSchemeType.values().length];

        static {
            try {
                $SwitchMap$com$alibaba$ariver$app$api$ui$darkmode$ColorSchemeType[ColorSchemeType.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alibaba$ariver$app$api$ui$darkmode$ColorSchemeType[ColorSchemeType.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        kge.a(1512470748);
    }

    public T getTarget() {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("737ca764", new Object[]{this});
        }
        ColorSchemeDecider colorSchemeDecider = this.d;
        if (colorSchemeDecider != null) {
            int i = AnonymousClass1.$SwitchMap$com$alibaba$ariver$app$api$ui$darkmode$ColorSchemeType[colorSchemeDecider.getCurrentColorScheme().ordinal()];
            if (i == 1) {
                T t2 = this.b;
                if (t2 != null) {
                    return t2;
                }
            } else if (i == 2 && (t = this.c) != null) {
                return t;
            }
        }
        return this.f2893a;
    }

    public void setColorSchemeDecider(ColorSchemeDecider colorSchemeDecider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18146153", new Object[]{this, colorSchemeDecider});
        } else {
            this.d = colorSchemeDecider;
        }
    }

    public void setDefault(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23a626e2", new Object[]{this, t});
        } else {
            this.f2893a = t;
        }
    }

    public void setLight(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e61f77", new Object[]{this, t});
        } else {
            this.b = t;
        }
    }

    public void setDark(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2e5159b", new Object[]{this, t});
        } else {
            this.c = t;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ColorSchemeModelTemplate{def=" + this.f2893a + ", light=" + this.b + ", dark=" + this.c + '}';
    }
}
