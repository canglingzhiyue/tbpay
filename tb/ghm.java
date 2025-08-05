package tb;

/* loaded from: classes.dex */
public interface ghm extends ghn {
    void addChangeVersionListener(ghl ghlVar);

    void doChangeVersion(ghj ghjVar, gho ghoVar);

    boolean isSpecifyVersionCode(String str);

    void onVersionResponse(ghk ghkVar);

    ghp queryCurrentVersionInfo();

    void removeChangeVersionListener(ghl ghlVar);
}
