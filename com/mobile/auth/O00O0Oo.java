package com.mobile.auth;

/* loaded from: classes4.dex */
public class O00O0Oo implements Cloneable {
    private String O000000o;
    private String O00000Oo;
    private String O00000o;
    private String O00000o0;
    private boolean O00000oO;
    private boolean O00000oo;
    private boolean O0000O0o;
    private boolean O0000OOo;
    private boolean O0000Oo;
    private boolean O0000Oo0;
    private int O0000OoO;
    private int O0000Ooo;

    /* loaded from: classes4.dex */
    public static class O000000o {
        private final O00O0Oo O000000o = new O00O0Oo();

        /* JADX INFO: Access modifiers changed from: package-private */
        public O000000o O000000o(int i) {
            this.O000000o.O0000OoO = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public O000000o O000000o(String str) {
            this.O000000o.O000000o = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public O000000o O000000o(boolean z) {
            this.O000000o.O00000oO = z;
            return this;
        }

        public O00O0Oo O000000o() {
            return this.O000000o;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public O000000o O00000Oo(int i) {
            this.O000000o.O0000Ooo = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public O000000o O00000Oo(String str) {
            this.O000000o.O00000Oo = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public O000000o O00000Oo(boolean z) {
            this.O000000o.O00000oo = z;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public O000000o O00000o(String str) {
            this.O000000o.O00000o = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public O000000o O00000o(boolean z) {
            this.O000000o.O0000OOo = z;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public O000000o O00000o0(String str) {
            this.O000000o.O00000o0 = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public O000000o O00000o0(boolean z) {
            this.O000000o.O0000O0o = z;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public O000000o O00000oO(boolean z) {
            this.O000000o.O0000Oo0 = z;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public O000000o O00000oo(boolean z) {
            this.O000000o.O0000Oo = z;
            return this;
        }
    }

    private O00O0Oo() {
        this.O000000o = "rcs.cmpassport.com";
        this.O00000Oo = "rcs.cmpassport.com";
        this.O00000o0 = "config2.cmpassport.com";
        this.O00000o = "log2.cmpassport.com:9443";
        this.O00000oO = false;
        this.O00000oo = false;
        this.O0000O0o = false;
        this.O0000OOo = false;
        this.O0000Oo0 = false;
        this.O0000Oo = false;
        this.O0000OoO = 3;
        this.O0000Ooo = 1;
    }

    public String O000000o() {
        return this.O000000o;
    }

    public String O00000Oo() {
        return this.O00000Oo;
    }

    public String O00000o() {
        return this.O00000o;
    }

    public String O00000o0() {
        return this.O00000o0;
    }

    public boolean O00000oO() {
        return this.O00000oO;
    }

    public boolean O00000oo() {
        return this.O00000oo;
    }

    public boolean O0000O0o() {
        return this.O0000O0o;
    }

    public boolean O0000OOo() {
        return this.O0000OOo;
    }

    public boolean O0000Oo() {
        return this.O0000Oo;
    }

    public boolean O0000Oo0() {
        return this.O0000Oo0;
    }

    public int O0000OoO() {
        return this.O0000OoO;
    }

    public int O0000Ooo() {
        return this.O0000Ooo;
    }

    /* renamed from: O0000o00 */
    public O00O0Oo clone() throws CloneNotSupportedException {
        return (O00O0Oo) super.clone();
    }

    public String toString() {
        return "UmcConfigBean{mHttpsGetTokenHost='" + this.O000000o + "', mHttpsGetPhoneScripHost='" + this.O00000Oo + "', mConfigHost='" + this.O00000o0 + "', mLogHost='" + this.O00000o + "', mCloseCtccWork=" + this.O00000oO + ", mCloseCuccWort=" + this.O00000oo + ", mCloseM008Business=" + this.O0000O0o + ", mCloseGetPhoneIpv4=" + this.O0000OOo + ", mCloseGetPhoneIpv6=" + this.O0000Oo0 + ", mCloseLog=" + this.O0000Oo + ", mMaxFailedLogTimes=" + this.O0000OoO + ", mLogSuspendTime=" + this.O0000Ooo + '}';
    }
}
