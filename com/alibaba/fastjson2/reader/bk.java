package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
class bk<T> extends bj<T> {
    static {
        kge.a(1462353960);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bk(String str, Type type, Class cls, int i, long j, String str2, Object obj, Field field) {
        super(str, type == null ? field.getType() : type, cls, i, j, str2, null, obj, null, field, null);
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(T t, byte b) {
        if (this.i != -1 && this.c == Byte.TYPE) {
            com.alibaba.fastjson2.util.e.UNSAFE.putByte(t, this.i, b);
            return;
        }
        try {
            this.h.setByte(t, b);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(T t, char c) {
        if (this.i != -1 && this.c == Character.TYPE) {
            com.alibaba.fastjson2.util.e.UNSAFE.putChar(t, this.i, c);
            return;
        }
        try {
            this.h.setChar(t, c);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(T t, double d) {
        if (this.i != -1 && this.c == Double.TYPE) {
            com.alibaba.fastjson2.util.e.UNSAFE.putDouble(t, this.i, d);
            return;
        }
        try {
            this.h.setDouble(t, d);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(T t, float f) {
        if (this.i != -1 && this.c == Float.TYPE) {
            com.alibaba.fastjson2.util.e.UNSAFE.putFloat(t, this.i, f);
            return;
        }
        try {
            this.h.setFloat(t, f);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(T t, int i) {
        if (this.i != -1 && this.c == Integer.TYPE) {
            com.alibaba.fastjson2.util.e.UNSAFE.putInt(t, this.i, i);
            return;
        }
        try {
            this.h.setInt(t, i);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(T t, long j) {
        if (this.i != -1 && this.c == Long.TYPE) {
            com.alibaba.fastjson2.util.e.UNSAFE.putLong(t, this.i, j);
            return;
        }
        try {
            this.h.setLong(t, j);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        if (obj != null) {
            Class<?> cls = this.c;
            if (cls.isPrimitive()) {
                b((bk<T>) t, obj);
                return;
            } else if (this.d != cls && Map.class.isAssignableFrom(cls) && (obj instanceof Map) && cls != Map.class) {
                obj = a(JSONFactory.b()).a((Map) obj, new JSONReader.Feature[0]);
            } else if (cls != obj.getClass() && !cls.isInstance(obj)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (cls == Date.class) {
                        if (this.f != null) {
                            obj = DateUtils.a(str, this.f, com.alibaba.fastjson2.time.e.b);
                        } else {
                            long a2 = DateUtils.a(str, com.alibaba.fastjson2.time.e.b);
                            obj = a2 == 0 ? null : new Date(a2);
                        }
                    }
                }
                if (!cls.isInstance(obj)) {
                    obj = TypeUtils.a(obj, this.d);
                }
            }
        } else if ((this.e & JSONReader.Feature.IgnoreSetNullValue.mask) != 0) {
            return;
        }
        if (this.i != -1) {
            com.alibaba.fastjson2.util.e.UNSAFE.putObject(t, this.i, obj);
            return;
        }
        try {
            this.h.set(t, obj);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(T t, short s) {
        if (this.i != -1 && this.c == Short.TYPE) {
            com.alibaba.fastjson2.util.e.UNSAFE.putShort(t, this.i, s);
            return;
        }
        try {
            this.h.setShort(t, s);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(T t, boolean z) {
        if (this.i != -1 && this.c == Boolean.TYPE) {
            com.alibaba.fastjson2.util.e.UNSAFE.putBoolean(t, this.i, z);
            return;
        }
        try {
            this.h.setBoolean(t, z);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    final void b(T t, Object obj) {
        if (this.c == Integer.TYPE) {
            if (obj instanceof Number) {
                a((bk<T>) t, ((Number) obj).intValue());
                return;
            }
        } else if (this.c == Long.TYPE) {
            if (obj instanceof Number) {
                a((bk<T>) t, ((Number) obj).longValue());
                return;
            }
        } else if (this.c == Float.TYPE) {
            if (obj instanceof Number) {
                a((bk<T>) t, ((Number) obj).floatValue());
                return;
            }
        } else if (this.c == Double.TYPE) {
            if (obj instanceof Number) {
                a((bk<T>) t, ((Number) obj).doubleValue());
                return;
            }
        } else if (this.c == Short.TYPE) {
            if (obj instanceof Number) {
                a((bk<T>) t, ((Number) obj).shortValue());
                return;
            }
        } else if (this.c == Byte.TYPE) {
            if (obj instanceof Number) {
                a((bk<T>) t, ((Number) obj).byteValue());
                return;
            }
        } else if (this.c == Character.TYPE) {
            if (obj instanceof Character) {
                a((bk<T>) t, ((Character) obj).charValue());
                return;
            }
        } else if (this.c == Boolean.TYPE && (obj instanceof Boolean)) {
            a((bk<T>) t, ((Boolean) obj).booleanValue());
            return;
        }
        throw new JSONException("set " + this.b + " error, type not support " + obj.getClass());
    }
}
