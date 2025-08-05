package com.alipay.android.msp.framework.wire;

import com.alipay.android.msp.framework.wire.Message;
import com.alipay.android.msp.framework.wire.Message.Builder;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
public final class BuilderAdapter<B extends Message.Builder> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final int f4886a = 8;
    private static final Comparator<Field> b = new Comparator<Field>() { // from class: com.alipay.android.msp.framework.wire.BuilderAdapter.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public int compare(Field field, Field field2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ee5bc7f", new Object[]{this, field, field2})).intValue() : field.getName().compareTo(field2.getName());
        }
    };
    private final List<Field> c = new ArrayList();

    public BuilderAdapter(Class<B> cls) {
        Field[] declaredFields;
        String name = cls.getName();
        try {
            for (Field field : Class.forName(name.substring(0, name.length() - f4886a), true, cls.getClassLoader()).getDeclaredFields()) {
                ProtoField protoField = (ProtoField) field.getAnnotation(ProtoField.class);
                if (protoField != null && protoField.label() == Message.Label.REQUIRED) {
                    try {
                        this.c.add(cls.getField(field.getName()));
                    } catch (NoSuchFieldException unused) {
                        throw new AssertionError("No builder field found for message field " + field.getName());
                    }
                }
            }
            Collections.sort(this.c, b);
        } catch (ClassNotFoundException unused2) {
            throw new AssertionError("No message class found for builder type ".concat(String.valueOf(name)));
        }
    }

    public final <B extends Message.Builder> void checkRequiredFields(B b2) {
        try {
            int size = this.c.size();
            StringBuilder sb = null;
            String str = "";
            for (int i = 0; i < size; i++) {
                Field field = this.c.get(i);
                if (field.get(b2) == null) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    } else {
                        str = "s";
                    }
                    sb.append("\n  ");
                    sb.append(field.getName());
                }
            }
            if (sb == null) {
                return;
            }
            throw new IllegalStateException("Required field" + str + " not set:" + ((Object) sb));
        } catch (IllegalAccessException unused) {
            throw new AssertionError("Unable to access required fields");
        }
    }
}
