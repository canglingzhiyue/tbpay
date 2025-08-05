package dagger.internal;

/* loaded from: classes9.dex */
public final class MembersInjectors {

    /* loaded from: classes9.dex */
    private enum NoOpMembersInjector {
        INSTANCE;

        public void injectMembers(Object obj) {
            e.a(obj, "Cannot inject members into a null reference");
        }
    }
}
