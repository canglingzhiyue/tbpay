package anet.channel.strategy.dispatch;

/* loaded from: classes.dex */
public interface IAmdcSign {
    String aesDecryptStr(String str);

    String aesEncryptStr(String str);

    String getAppkey();

    String sign(String str);

    boolean useSecurityGuard();
}
