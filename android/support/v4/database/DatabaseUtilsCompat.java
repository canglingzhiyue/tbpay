package android.support.v4.database;

import mtopsdk.common.util.StringUtils;
import tb.riy;

@Deprecated
/* loaded from: classes2.dex */
public final class DatabaseUtilsCompat {
    private DatabaseUtilsCompat() {
    }

    @Deprecated
    public static String[] appendSelectionArgs(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        String[] strArr3 = new String[strArr.length + strArr2.length];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    @Deprecated
    public static String concatenateWhere(String str, String str2) {
        if (StringUtils.isEmpty(str)) {
            return str2;
        }
        if (StringUtils.isEmpty(str2)) {
            return str;
        }
        return riy.BRACKET_START_STR + str + ") AND (" + str2 + riy.BRACKET_END_STR;
    }
}
