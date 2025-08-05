package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes2.dex */
final class aj<T> extends ah<T> {
    static {
        kge.a(-197652997);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public aj(String str, int i, long j, String str2, String str3, Method method, Class cls) {
        super(str, i, j, str2, str3, cls, null, method);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        try {
            return this.j.invoke(t, new Object[0]);
        } catch (IllegalAccessException e) {
            e = e;
            throw new JSONException("invoke getter method error, " + this.f3039a, e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new JSONException("invoke getter method error, " + this.f3039a, e);
        } catch (InvocationTargetException e3) {
            e = e3;
            Throwable cause = e.getCause();
            String str = "invoke getter method error, " + this.f3039a;
            if (cause != null) {
                e = cause;
            }
            throw new JSONException(str, e);
        }
    }
}
