package tb;

import android.taobao.windvane.connect.e;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class gbx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte INVALID = 0;
    public static final byte MAX_COUNT = 48;
    public static final byte OP_AS = 41;
    public static final byte OP_ASSIGN = 46;
    public static final byte OP_AS_OR_NULL = 42;
    public static final byte OP_BIN_ADD = 7;
    public static final byte OP_BIN_DIV = 10;
    public static final byte OP_BIN_MOD = 11;
    public static final byte OP_BIN_MUL = 9;
    public static final byte OP_BIN_SUB = 8;
    public static final byte OP_BOOL_AND = 21;
    public static final byte OP_BOOL_EQUAL = 19;
    public static final byte OP_BOOL_LARGER = 15;
    public static final byte OP_BOOL_LARGER_OR_EQUAL = 16;
    public static final byte OP_BOOL_LESS = 17;
    public static final byte OP_BOOL_LESS_OR_EQUAL = 18;
    public static final byte OP_BOOL_NOT = 23;
    public static final byte OP_BOOL_NOT_EQUAL = 20;
    public static final byte OP_BOOL_OR = 22;
    public static final byte OP_CALL_FUNC = 45;
    public static final byte OP_COPY_VAR = 4;
    public static final byte OP_CREATE_ARRAY = 34;
    public static final byte OP_CREATE_MAP = 33;
    public static final byte OP_GET_BY_DOT = 6;
    public static final byte OP_GET_BY_INDEX = 5;
    public static final byte OP_GET_CONST = 2;
    public static final byte OP_GET_OPT_JUMP = 40;
    public static final byte OP_GET_VAR = 1;
    public static final byte OP_GOTO = 38;
    public static final byte OP_GOTO_IF_FALSE = 12;
    public static final byte OP_GOTO_IF_TRUE = 13;
    public static final byte OP_IN = 14;
    public static final byte OP_INSERT_KVPAIR = 36;
    public static final byte OP_INSERT_VALUE = 35;
    public static final byte OP_IS = 43;
    public static final byte OP_IS_NOT = 44;
    public static final byte OP_MINIFY_CALL_FUNC = 47;
    public static final byte OP_POP_VAR = 3;
    public static final byte OP_PUSH_DOUBLE_64 = 30;
    public static final byte OP_PUSH_FALSE = 25;
    public static final byte OP_PUSH_INT_16 = 27;
    public static final byte OP_PUSH_INT_32 = 28;
    public static final byte OP_PUSH_INT_64 = 29;
    public static final byte OP_PUSH_INT_8 = 26;
    public static final byte OP_PUSH_NULL = 31;
    public static final byte OP_PUSH_TRUE = 24;
    public static final byte OP_PUSH_UNDEFINED = 32;
    public static final byte OP_TYPEOF = 39;
    public static final byte OP_UNARY_MIN = 37;
    public static final int PROP_INDEX_OP_ARGC = 2;
    public static final int PROP_INDEX_OP_ARG_SIZE = 3;
    public static final int PROP_INDEX_OP_NAME = 0;
    public static final int PROP_INDEX_OP_SIZE = 1;
    public static final int PROP_INDEX_OP_STACK_DELTA = 4;

    /* renamed from: a  reason: collision with root package name */
    private static final Object[][] f28301a;

    static {
        kge.a(878600390);
        f28301a = new Object[][]{new Object[]{e.DEFAULT_HTTPS_ERROR_INVALID, 0, 0, new int[0], 0}, new Object[]{"OP_GET_VAR", 2, 1, new int[]{2}, 1}, new Object[]{"OP_GET_CONST", 2, 1, new int[]{2}, 1}, new Object[]{"OP_POP_VAR", 0, 0, new int[0], -1}, new Object[]{"OP_COPY_VAR", 0, 0, new int[0], 1}, new Object[]{"OP_GET_BY_INDEX", 0, 0, new int[0], -1}, new Object[]{"OP_GET_BY_DOT", 2, 1, new int[]{2}, 0}, new Object[]{"OP_BIN_ADD", 0, 0, new int[0], -1}, new Object[]{"OP_BIN_SUB", 0, 0, new int[0], -1}, new Object[]{"OP_BIN_MUL", 0, 0, new int[0], -1}, new Object[]{"OP_BIN_DIV", 0, 0, new int[0], -1}, new Object[]{"OP_BIN_MOD", 0, 0, new int[0], -1}, new Object[]{"OP_GOTO_IF_FALSE", 3, 1, new int[]{3}, -1}, new Object[]{"OP_GOTO_IF_TRUE", 3, 1, new int[]{3}, -1}, new Object[]{"OP_IN", 0, 0, new int[0], -1}, new Object[]{"OP_BOOL_LARGER", 0, 0, new int[0], -1}, new Object[]{"OP_BOOL_LARGER_OR_EQUAL", 0, 0, new int[0], -1}, new Object[]{"OP_BOOL_LESS", 0, 0, new int[0], -1}, new Object[]{"OP_BOOL_LESS_OR_EQUAL", 0, 0, new int[0], -1}, new Object[]{"OP_BOOL_EQUAL", 0, 0, new int[0], -1}, new Object[]{"OP_BOOL_NOT_EQUAL", 0, 0, new int[0], -1}, new Object[]{"OP_BOOL_AND", 0, 0, new int[0], -1}, new Object[]{"OP_BOOL_OR", 0, 0, new int[0], -1}, new Object[]{"OP_BOOL_NOT", 0, 0, new int[0], 0}, new Object[]{"OP_PUSH_TRUE", 0, 0, new int[0], 1}, new Object[]{"OP_PUSH_FALSE", 0, 0, new int[0], 1}, new Object[]{"OP_PUSH_INT_8", 1, 1, new int[]{1}, 1}, new Object[]{"OP_PUSH_INT_16", 2, 1, new int[]{2}, 1}, new Object[]{"OP_PUSH_INT_32", 4, 1, new int[]{4}, 1}, new Object[]{"OP_PUSH_INT_64", 8, 1, new int[]{8}, 1}, new Object[]{"OP_PUSH_DOUBLE_64", 8, 1, new int[]{8}, 1}, new Object[]{"OP_PUSH_NULL", 0, 0, new int[0], 1}, new Object[]{"OP_PUSH_UNDEFINED", 0, 0, new int[0], 1}, new Object[]{"OP_CREATE_MAP", 0, 0, new int[0], 1}, new Object[]{"OP_CREATE_ARRAY", 0, 0, new int[0], 1}, new Object[]{"OP_INSERT_VALUE", 0, 0, new int[0], -2}, new Object[]{"OP_INSERT_KVPAIR", 0, 0, new int[0], -2}, new Object[]{"OP_UNARY_MIN", 0, 0, new int[0], 0}, new Object[]{"OP_GOTO", 3, 1, new int[]{3}, 0}, new Object[]{"OP_TYPEOF", 0, 0, new int[0], 0}, new Object[]{"OP_GET_OPT_JUMP", 3, 1, new int[]{3}, 0}, new Object[]{"OP_AS", 0, 0, new int[0], 0}, new Object[]{"OP_AS_OR_NULL", 0, 0, new int[0], 0}, new Object[]{"OP_IS", 0, 0, new int[0], 0}, new Object[]{"OP_IS_NOT", 0, 0, new int[0], 0}, new Object[]{"OP_CALL_FUNC", 1, 1, new int[]{1}, 0}, new Object[]{"OP_ASSIGN", 0, 0, new int[0], -1}, new Object[]{"OP_MINIFY_CALL_FUNC", -1, 4, new int[]{2, 1, 2, -1}, 0}};
        if (f28301a.length == 48) {
            for (int i = 0; i < 48; i++) {
                try {
                    int intValue = ((Integer) f28301a[i][1]).intValue();
                    int intValue2 = ((Integer) f28301a[i][2]).intValue();
                    int[] iArr = (int[]) f28301a[i][3];
                    if (iArr.length != intValue2) {
                        throw new IllegalStateException();
                    }
                    if (intValue != -1) {
                        int i2 = 0;
                        for (int i3 = 0; i3 < intValue2; i3++) {
                            i2 += iArr[i3];
                        }
                        if (i2 != intValue) {
                            throw new IllegalStateException("size error" + i);
                        }
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("OP Init error:" + e);
                }
            }
            return;
        }
        throw new IllegalStateException("OP_PROP cnt error");
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)}) : (String) f28301a[i][0];
    }

    public static int a(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2713f1a7", new Object[]{bArr, new Integer(i)})).intValue();
        }
        if (i >= bArr.length) {
            throw new IllegalArgumentException("getOpSize pos Overflow");
        }
        int i2 = bArr[i] & 255;
        if (i2 >= 48) {
            throw new IllegalArgumentException(String.format("Code %02x not a op", Byte.valueOf(bArr[i])));
        }
        return i2;
    }

    public static int b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{new Integer(i)})).intValue() : ((Integer) f28301a[i][1]).intValue();
    }
}
