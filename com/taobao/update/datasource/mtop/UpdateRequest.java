package com.taobao.update.datasource.mtop;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.kge;

/* loaded from: classes9.dex */
public class UpdateRequest implements Serializable {
    public String API_NAME;
    public String betaSource;
    public String dexcode;
    public int innerUser;
    public boolean isYunos;
    public long lastPopTime;
    public String protocolVersion;
    public boolean requireContent;
    public List<String> updateTypes;
    public boolean userUpdate;
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = true;
    public int cpuArch = -1;
    public int apkArch = -1;
    public String model = null;
    public String locale = null;
    public String md5Sum = null;
    public String city = null;
    public int patchVersion = 0;
    public Set<String> deployVersions = new HashSet();
    public long apiLevel = 0;
    public String appVersion = null;
    public String brand = null;
    public String identifier = null;

    static {
        kge.a(-1387756202);
        kge.a(1028243835);
    }

    public UpdateRequest(boolean z) {
        this.API_NAME = "mtop.client.mudp.update";
        if (z) {
            this.API_NAME = "mtop.client.mudp.update.outer";
        }
    }
}
