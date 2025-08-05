package tb;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.function.d;
import com.alibaba.fastjson2.time.e;
import com.alibaba.fastjson2.util.DateUtils;
import com.taobao.media.MediaConstant;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class dra implements d {

    /* renamed from: a  reason: collision with root package name */
    final Object f26915a;
    final Class b;

    static {
        kge.a(-2022605434);
        kge.a(895087661);
    }

    public dra(Class cls, Object obj) {
        this.b = cls;
        this.f26915a = obj;
    }

    @Override // com.alibaba.fastjson2.function.d
    public Object apply(Object obj) {
        Class cls;
        Class cls2;
        Class cls3;
        Class cls4;
        Class cls5;
        Class cls6;
        Class cls7;
        Class cls8;
        String str = (String) obj;
        if (str == null || "null".equals(str) || "".equals(str)) {
            return this.f26915a;
        }
        if (this.b == Byte.TYPE || (cls = this.b) == Byte.class) {
            return Byte.valueOf(Byte.parseByte(str));
        }
        if (cls == Short.TYPE || (cls2 = this.b) == Short.class) {
            return Short.valueOf(Short.parseShort(str));
        }
        if (cls2 == Integer.TYPE || (cls3 = this.b) == Integer.class) {
            return Integer.valueOf(Integer.parseInt(str));
        }
        if (cls3 == Long.TYPE || (cls4 = this.b) == Long.class) {
            return (com.alibaba.fastjson2.util.d.a(str) || str.length() != 19) ? Long.valueOf(Long.parseLong(str)) : Long.valueOf(DateUtils.a(str, e.b));
        } else if (cls4 == Float.TYPE || (cls5 = this.b) == Float.class) {
            return Float.valueOf(Float.parseFloat(str));
        } else {
            if (cls5 == Double.TYPE || (cls6 = this.b) == Double.class) {
                return Double.valueOf(Double.parseDouble(str));
            }
            if (cls6 == Character.TYPE || (cls7 = this.b) == Character.class) {
                return Character.valueOf(str.charAt(0));
            }
            if (cls7 == Boolean.TYPE || (cls8 = this.b) == Boolean.class) {
                return Boolean.valueOf("true".equals(str));
            }
            if (cls8 == BigDecimal.class) {
                return new BigDecimal(str);
            }
            if (cls8 == BigInteger.class) {
                return new BigInteger(str);
            }
            if ((cls8 == Collections.class || cls8 == List.class || cls8 == JSONArray.class) && MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264.equals(str)) {
                return new JSONArray();
            }
            throw new JSONException("can not convert to " + this.b + ", value : " + str);
        }
    }
}
