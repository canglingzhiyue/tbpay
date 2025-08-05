package anet.channel;

/* loaded from: classes.dex */
public interface IAuth {

    /* loaded from: classes.dex */
    public interface AuthCallback {
        void onAuthFail(int i, String str);

        void onAuthSuccess();
    }

    void auth(Session session, AuthCallback authCallback);
}
