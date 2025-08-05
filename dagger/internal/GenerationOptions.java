package dagger.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
/* loaded from: classes9.dex */
public @interface GenerationOptions {
    boolean fastInit();
}
