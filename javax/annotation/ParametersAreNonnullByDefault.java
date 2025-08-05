package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@TypeQualifierDefault({ElementType.PARAMETER})
/* loaded from: classes9.dex */
public @interface ParametersAreNonnullByDefault {
}
