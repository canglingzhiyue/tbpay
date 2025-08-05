package com.alipay.mobile.security.bio.common.record;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class MetaRecord {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_TYPE = "Biometrics";
    public static final String DEFAULT_LOG_CLASSIFIERS = "1#2";
    public static final String LOG_SEPARATOR = "#";
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = 3;
    public static final int PRIORITY_MIDDLE = 2;

    /* renamed from: a  reason: collision with root package name */
    private String f5772a;
    private String b;
    private String c;
    private String d;
    private String e;
    private int f;
    private boolean g;
    private String h;
    private String i;
    private String j;
    private Map<String, String> k;
    private int l;
    private String m;

    public MetaRecord() {
        this.f5772a = BIZ_TYPE;
        this.g = true;
        this.h = "";
        this.i = "";
        this.j = "";
        this.l = 2;
        this.m = "1";
    }

    public MetaRecord(String str, String str2, String str3, String str4) {
        this.f5772a = BIZ_TYPE;
        this.g = true;
        this.h = "";
        this.i = "";
        this.j = "";
        this.l = 2;
        this.m = "1";
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public MetaRecord(String str, String str2, String str3, String str4, String str5) {
        this.f5772a = BIZ_TYPE;
        this.g = true;
        this.h = "";
        this.i = "";
        this.j = "";
        this.l = 2;
        this.m = "1";
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.m = str5;
    }

    public MetaRecord(String str, String str2, String str3, String str4, int i) {
        this.f5772a = BIZ_TYPE;
        this.g = true;
        this.h = "";
        this.i = "";
        this.j = "";
        this.l = 2;
        this.m = "1";
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.l = i;
    }

    public MetaRecord(String str, String str2, String str3, String str4, int i, String str5) {
        this.f5772a = BIZ_TYPE;
        this.g = true;
        this.h = "";
        this.i = "";
        this.j = "";
        this.l = 2;
        this.m = "1";
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.l = i;
        this.m = str5;
    }

    public MetaRecord(String str, String str2, String str3, String str4, boolean z) {
        this.f5772a = BIZ_TYPE;
        this.g = true;
        this.h = "";
        this.i = "";
        this.j = "";
        this.l = 2;
        this.m = "1";
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.g = z;
    }

    public MetaRecord(String str, String str2, String str3, String str4, boolean z, int i) {
        this.f5772a = BIZ_TYPE;
        this.g = true;
        this.h = "";
        this.i = "";
        this.j = "";
        this.l = 2;
        this.m = "1";
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.g = z;
        this.l = i;
    }

    public String getCaseID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cd8ad658", new Object[]{this}) : this.b;
    }

    public void setCaseID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8379e21e", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public String getActionID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e70e4212", new Object[]{this}) : this.c;
    }

    public void setActionID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85975aa4", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public String getAppID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c34c3173", new Object[]{this}) : this.d;
    }

    public void setAppID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("531292cb", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public String getSeedID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("335b69f7", new Object[]{this}) : this.e;
    }

    public void setSeedID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7bbc25f", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public int getSequenceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("944e282c", new Object[]{this})).intValue() : this.f;
    }

    public void setSequenceId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c4deb5e", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public String getParam1() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b57edaff", new Object[]{this}) : this.h;
    }

    public void setParam1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a067257", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public String getParam2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3c04959e", new Object[]{this}) : this.i;
    }

    public void setParam2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4380b98", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public String getParam3() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c28a503d", new Object[]{this}) : this.j;
    }

    public void setParam3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e69a4d9", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public Map<String, String> getParam4() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("54120579", new Object[]{this}) : this.k;
    }

    public void setParam4(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fbca935", new Object[]{this, map});
        } else {
            this.k = map;
        }
    }

    public boolean isEnableSequence() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("849e13b9", new Object[]{this})).booleanValue() : this.g;
    }

    public void setEnableSequence(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3275eb87", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("caseID:" + this.b + "#");
        sb.append("actionID:" + this.c + "#");
        sb.append("appID:" + this.d + "#");
        sb.append("seedID:" + this.e + "#");
        sb.append("bizType:" + this.f5772a + "#");
        sb.append("priority:" + this.l + "#");
        sb.append("classifier:" + this.m + "#");
        sb.append("param1:" + this.h + "#");
        sb.append("param2:" + this.i + "#");
        sb.append("param3:" + this.j + "#");
        sb.append("param4:");
        Map<String, String> map = this.k;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                sb.append("@" + ((Object) key) + "=" + ((Object) value));
            }
        }
        return sb.toString();
    }

    public String getBizType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this}) : this.f5772a;
    }

    public void setBizType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf7407c", new Object[]{this, str});
        } else {
            this.f5772a = str;
        }
    }

    public int getPriority() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue() : this.l;
    }

    public void setPriority(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f878ef6", new Object[]{this, new Integer(i)});
        } else {
            this.l = i;
        }
    }

    public String getClassifier() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f88c6142", new Object[]{this}) : this.m;
    }

    public void setClassifier(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe94e74", new Object[]{this, str});
        } else {
            this.m = str;
        }
    }
}
