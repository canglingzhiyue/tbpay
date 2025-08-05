package com.squareup.wire;

import com.squareup.wire.Message;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class a<M extends Message> {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<Field> f8125a = new Comparator<Field>() { // from class: com.squareup.wire.a.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Field field, Field field2) {
            return field.getName().compareTo(field2.getName());
        }
    };
    private final List<Field> b = new ArrayList();
    private final List<Field> c = new ArrayList();

    public a(Class<M> cls) {
        Field[] declaredFields;
        for (Field field : cls.getDeclaredFields()) {
            ProtoField protoField = (ProtoField) field.getAnnotation(ProtoField.class);
            if (protoField != null) {
                if (protoField.label() == Message.Label.REQUIRED) {
                    try {
                        this.b.add(cls.getField(field.getName()));
                    } catch (NoSuchFieldException unused) {
                        throw new AssertionError("No message field found for message field " + field.getName());
                    }
                }
                if (protoField.label() == Message.Label.REPEATED) {
                    try {
                        this.c.add(cls.getField(field.getName()));
                    } catch (NoSuchFieldException unused2) {
                        throw new AssertionError("No message field found for message field " + field.getName());
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(this.b, f8125a);
    }

    public void a(M m) {
        try {
            int size = this.b.size();
            StringBuilder sb = null;
            String str = "";
            for (int i = 0; i < size; i++) {
                Field field = this.b.get(i);
                if (field.get(m) == null) {
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

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(M m) {
        for (Field field : this.c) {
            try {
                List list = (List) field.get(m);
                if (list == null) {
                    field.set(m, Collections.emptyList());
                } else if (!list.isEmpty()) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (list.get(i) == null) {
                            throw new NullPointerException(String.format("Element at index %d of field %s is null", Integer.valueOf(i), field.getName()));
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } catch (IllegalAccessException unused) {
                throw new AssertionError("Unable to access required fields");
            } catch (IllegalArgumentException unused2) {
                throw new AssertionError("Unable to access required fields");
            }
        }
    }
}
