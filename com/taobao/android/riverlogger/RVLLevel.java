package com.taobao.android.riverlogger;

/* loaded from: classes6.dex */
public enum RVLLevel {
    Off(0, "Off"),
    Error(1, "Error"),
    Warn(2, "Warn"),
    Info(3, "Info"),
    Debug(4, "Debug"),
    Verbose(5, "Verbose");
    
    private final String name;
    public final int value;
    private static final RVLLevel[] levelValues = {Off, Error, Warn, Info, Debug, Verbose};

    RVLLevel(int i, String str) {
        this.value = i;
        this.name = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RVLLevel parse(Object obj) {
        if (obj == null) {
            return Info;
        }
        if (obj instanceof String) {
            try {
                return valueOf((String) obj);
            } catch (Exception unused) {
            }
        } else if (obj instanceof Number) {
            return valueOf(((Number) obj).intValue(), Info);
        }
        return Info;
    }

    public static RVLLevel valueOf(int i, RVLLevel rVLLevel) {
        if (i >= 0) {
            RVLLevel[] rVLLevelArr = levelValues;
            if (i < rVLLevelArr.length) {
                return rVLLevelArr[i];
            }
        }
        return rVLLevel;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
