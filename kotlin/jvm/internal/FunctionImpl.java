package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import tb.ruk;
import tb.rul;
import tb.rum;
import tb.run;
import tb.ruo;
import tb.rup;
import tb.ruq;
import tb.rur;
import tb.rus;
import tb.rut;
import tb.ruu;
import tb.ruv;
import tb.ruw;
import tb.rux;
import tb.ruy;
import tb.ruz;
import tb.rva;
import tb.rvb;
import tb.rvc;
import tb.rvd;
import tb.rve;
import tb.rvf;
import tb.rvg;

@Deprecated(level = DeprecationLevel.ERROR, message = "This class is no longer supported, do not use it.")
@Deprecated
/* loaded from: classes9.dex */
public abstract class FunctionImpl implements Serializable, kotlin.c, ruk, rul, rum, run, ruo, rup, ruq, rur, rus, rut, ruu, ruv, ruw, rux, ruy, ruz, rva, rvb, rvc, rvd, rve, rvf, rvg {
    private void checkArity(int i) {
        if (getArity() != i) {
            throwWrongArity(i);
        }
    }

    private void throwWrongArity(int i) {
        throw new IllegalStateException("Wrong function arity, expected: " + i + ", actual: " + getArity());
    }

    public abstract int getArity();

    @Override // tb.ruk
    /* renamed from: invoke */
    public Object mo2427invoke() {
        checkArity(0);
        return invokeVararg(new Object[0]);
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public Object mo2421invoke(Object obj) {
        checkArity(1);
        return invokeVararg(obj);
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public Object mo2423invoke(Object obj, Object obj2) {
        checkArity(2);
        return invokeVararg(obj, obj2);
    }

    @Override // tb.rva
    public Object invoke(Object obj, Object obj2, Object obj3) {
        checkArity(3);
        return invokeVararg(obj, obj2, obj3);
    }

    @Override // tb.rvb
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        checkArity(4);
        return invokeVararg(obj, obj2, obj3, obj4);
    }

    @Override // tb.rvc
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        checkArity(5);
        return invokeVararg(obj, obj2, obj3, obj4, obj5);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        checkArity(6);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        checkArity(7);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        checkArity(8);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        checkArity(9);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        checkArity(10);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        checkArity(11);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        checkArity(12);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        checkArity(13);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        checkArity(14);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15) {
        checkArity(15);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        checkArity(16);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17) {
        checkArity(17);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
        checkArity(18);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19) {
        checkArity(19);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20) {
        checkArity(20);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        checkArity(21);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22) {
        checkArity(22);
        return invokeVararg(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }

    public Object invokeVararg(Object... objArr) {
        throw new UnsupportedOperationException();
    }
}
