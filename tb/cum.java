package tb;

/* loaded from: classes4.dex */
public interface cum<Arg, Ret, Err> {
    Ret apply(Arg arg);

    void error(Err err);
}
