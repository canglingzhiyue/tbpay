package dagger.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
/* loaded from: classes9.dex */
public @interface ConfigureInitializationParameters {
    String[] value() default {};
}
